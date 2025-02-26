require recipes-st/images/st-image-weston.bb

SUMMARY = "OpenSTLinux Artificial Inteligence for Computer Vision image based on weston image"

# Define a proper userfs for st-image-ai
STM32MP_USERFS_IMAGE = "st-image-ai-userfs"

# Define ROOTFS_MAXSIZE to 1.5GB
IMAGE_ROOTFS_MAXSIZE = "1572864"

IMAGE_AI_PART = "   \
    packagegroup-x-linux-ai \
"

#
# INSTALL addons
#
CORE_IMAGE_EXTRA_INSTALL += " \
    ${IMAGE_AI_PART}          \
"
