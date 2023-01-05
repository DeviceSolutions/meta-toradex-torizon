FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI:append = " \
    file://0001-udisksdaemon-do-not-wait-for-polkit-authority.patch \
"

EXTRA_OECONF:append = " --enable-fhs-media"

# We only need the polkit library which this recipe depends on anyways
REQUIRED_DISTRO_FEATURES:remove = " polkit"

do_install:append() {
    # udisks2 service by default is wanted by graphical.target, change it to multi-user.target.
    sed -i -e 's/WantedBy=.*/WantedBy=multi-user.target/' ${D}${systemd_system_unitdir}/${BPN}.service

    # Enable UDISKS_FILESYSTEM_SHARED, so the mount base directory would be /media instead of /media/$USER.
    printf "\n# Enable UDISKS_FILESYSTEM_SHARED\nENV{UDISKS_FILESYSTEM_SHARED}=\"1\"\n" >> ${D}${nonarch_base_libdir}/udev/rules.d/80-udisks2.rules
}
