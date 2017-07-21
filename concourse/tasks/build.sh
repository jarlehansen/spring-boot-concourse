pushd source-code
    ./gradlew --build-file source-code/build.gradle build
popd

cp build/libs/*.jar build-output/