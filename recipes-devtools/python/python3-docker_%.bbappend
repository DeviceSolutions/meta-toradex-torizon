FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI_append = " file://0001-requirements.txt-setup.py-drop-tls-and-ssh-dependenc.patch"
