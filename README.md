# Spring Boot Concourse example

Example setup using gradle, spring boot and [concourse](https://concourse.ci).

1. **Login**: `fly -t tutorial login`
2. **Set pipeline**: `fly -t lite set-pipeline -p concourse-gradle-spring-boot -c concourse/pipeline.yml`
2. **Unpause pipeline**: ``fly -t lite unpause-pipeline -p concourse-gradle-spring-boot