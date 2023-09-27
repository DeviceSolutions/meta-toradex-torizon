SUMMARY = "TorizonCore"
DESCRIPTION = "TorizonCore Linux with no containers pre-provisioned."

require torizon-core-container.inc

CORE_IMAGE_BASE_INSTALL:append = " \
    docker \
    docker-compose \
    docker-compose-up \
    docker-integrity-checker \
    docker-watchdog \
    docker-auto-prune \
"

IMAGE_VARIANT = "Docker"

inherit extrausers

EXTRA_USERS_PARAMS += "\
usermod -a -G docker torizon; \
"
