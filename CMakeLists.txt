cmake_minimum_required(VERSION 3.6)
project(patch)
set(TENSORFLOW_SOURCE_DIR "" CACHE PATH 
"Directory that contains the TensorFlow project")
if(NOT TENSORFLOW_SOURCE_DIR)
  get_filename_component(TENSORFLOW_SOURCE_DIR
    "${CMAKE_CURRENT_LIST_DIR}/../../../../" ABSOLUTE)
endif()

add_subdirectory(
  "home/studentfsl-release-bsp/sources/meta-analytics-tflite/recipes-hello/patch"
  "${CMAKE_CURRENT_BINARY_DIR}/tensorflow-lite" EXCLUDE_FROM_ALL)

add_executable(minimal minimal.cc)
target_link_libraries(minimal tensorflow-lite ${CMAKE_DL_LIBS})

