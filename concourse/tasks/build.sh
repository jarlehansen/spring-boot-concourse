#!/bin/sh
source-code/gradlew --build-file source-code/build.gradle build
cp source-code/build/libs/*.jar build-output/