SUMMARY = "Multi-container orchestration for Docker"
HOMEPAGE = "https://www.docker.com/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435b266b3899aa8a959f17d41c56def8"

inherit pypi setuptools3

SRC_URI[md5sum] = "f7d54de5db1f17322c09db8157bd160f"
SRC_URI[sha256sum] = "7e836102d139aca667d6af53f0f4d942c9459ec24d6dd4f0203d74359b0fd311"

SRC_URI += "file://0001-setup.py-remove-maximum-version-requirements.patch \
           "

RDEPENDS_${PN} = "\
    ${PYTHON_PN}-cached-property \
    ${PYTHON_PN}-certifi \
    ${PYTHON_PN}-chardet \
    ${PYTHON_PN}-colorama \
    ${PYTHON_PN}-distro \
    ${PYTHON_PN}-docker \
    ${PYTHON_PN}-docker-pycreds \
    ${PYTHON_PN}-dockerpty \
    ${PYTHON_PN}-docopt \
    ${PYTHON_PN}-dotenv \
    ${PYTHON_PN}-fcntl \
    ${PYTHON_PN}-idna \
    ${PYTHON_PN}-jsonschema \
    ${PYTHON_PN}-misc \
    ${PYTHON_PN}-pyyaml \
    ${PYTHON_PN}-requests \
    ${PYTHON_PN}-six \
    ${PYTHON_PN}-terminal \
    ${PYTHON_PN}-texttable \
    ${PYTHON_PN}-urllib3 \
    ${PYTHON_PN}-wcwidth \
    ${PYTHON_PN}-websocket-client \
"
