LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

LINUX_VERSION = "6.6.23"

KERNEL_BRANCH ?= "lf-6.6.y"
KERNEL_SRC ?= "git@github.com:HovsepShahoyan/kernel-customboard.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${KERNEL_BRANCH}"
SRCREV = "661cb5f4b94110b4b1b9b12e7d43b8d84e514b61"

require linux-qoriq.inc
