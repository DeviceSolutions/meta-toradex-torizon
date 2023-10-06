FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += "\
    file://system.conf-torizon \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"

do_install:append() {
	# Do not install default config file for wired networks, we use NetworkManager
	# by default
	rm -rf ${D}${systemd_unitdir}/network

        # Install systemd configuration snippet for TorizonCore
	install -D -m0644 ${WORKDIR}/system.conf-torizon ${D}${systemd_unitdir}/system.conf.d/10-${BPN}.conf

        sed -i "s/@@MACHINE@@/${MACHINE}/g" ${D}${systemd_unitdir}/system.conf.d/10-${BPN}.conf 
}

do_install:append:ti-soc() {
	sed -i '$ d' ${D}${systemd_unitdir}/system.conf.d/10-${BPN}.conf
}
