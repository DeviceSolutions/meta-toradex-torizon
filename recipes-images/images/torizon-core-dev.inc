CORE_IMAGE_BASE_INSTALL:append = "\
    strace \
    ltrace \
    tcpdump \
    gdbserver \
    valgrind \
    perf \
    trace-cmd \
    alsa-utils \
"

IMAGE_FEATURES:append = "\
    tools-debug \
    debug-tweaks \
    tools-testapps \
"
