#!/bin/sh
ls -lrt
./gradlew --build-file source-code/build.gradle build
cp build/libs/*.jar build-output/