FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI_append_class-target = " file://0001-setup.cfg-drop-all-extras.patch"

inherit pypi setuptools3
require python-urllib3.inc

RDEPENDS_${PN}_remove_class-target = "${PYTHON_PN}-certifi ${PYTHON_PN}-cryptography ${PYTHON_PN}-idna ${PYTHON_PN}-pyopenssl"
