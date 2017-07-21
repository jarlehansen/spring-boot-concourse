#!/bin/sh
pwd
./gradlew --build-file source-code/build.gradle build
cp build/libs/*.jar build-output/