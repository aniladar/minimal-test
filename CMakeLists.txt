cmake_minimum_required(VERSION 3.6)

project(patch)

add_executable(minimal minimal.cc)

target_include_directories(minimal PUBLIC /home/student/fsl-release-bsp/build-analytics-tflite/tmp/sysroots/analytics/usr/include/tensorflow/contrib/lite/tools/make/downloads/flatbuffers/include)

target_link_libraries(minimal tensorflow-lite pthread ${CMAKE_DL_LIBS})

install(TARGETS minimal DESTINATION bin)