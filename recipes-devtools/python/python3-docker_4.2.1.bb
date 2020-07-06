SUMMARY = "A Python library for the Docker Engine API."
HOMEPAGE = "https://github.com/docker/docker-py"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34f3846f940453127309b920eeb89660"

SRC_URI[md5sum] = "65111a1e4a2ab83d2ba104cdb17f1326"
SRC_URI[sha256sum] = "380a20d38fbfaa872e96ee4d0d23ad9beb0f9ed57ff1c30653cbeb0c9c0964f2"

SRC_URI += "file://0001-requirements.txt-setup.py-drop-tls-and-ssh-dependenc.patch"

DEPENDS += "${PYTHON_PN}-pip-native"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-misc \
        ${PYTHON_PN}-six \
        ${PYTHON_PN}-docker-pycreds \
        ${PYTHON_PN}-requests \
        ${PYTHON_PN}-websocket-client \
"

inherit pypi setuptools3
