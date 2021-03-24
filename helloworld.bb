# Recipe for the Hello World program


SUMMARY = "Recipe for the Hello World program"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

DEPENDS += "opencv"
DEPENDS += "libconfig"
DEPENDS += "tensorflow-lite"

SRC_URI = "git://github.com/aniladar/patch.git;protocol=https;branch=master"

SRCREV = "${AUTOREV}"

# Here we specify the source directory, where we do all the building and expect sources to be placed
S = "${WORKDIR}/git"
B = "${S}"

inherit cmake

