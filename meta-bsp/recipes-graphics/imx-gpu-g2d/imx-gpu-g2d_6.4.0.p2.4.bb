require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "9d618f5cc69e25479e574a41b7649fc7"
SRC_URI[aarch64.sha256sum] = "0f18b3bd9c5a13c243c03770983e10051ac5a95586e7c6944d355de50346813c"
SRC_URI[arm.md5sum] = "3068c5bb64a18eab940e1d764b4def6f"
SRC_URI[arm.sha256sum] = "5a289dba64bfbd4252229571374ad8e1056871f864257a329ad26fdff7959822"
