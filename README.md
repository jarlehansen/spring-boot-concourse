# Spring Boot Concourse example

1. Login: `fly -t tutorial login`
2. Set pipeline: `fly -t lite set-pipeline -p concourse-gradle-spring-boot -c concourse/pipeline.yml`
2. Unpause pipeline: `fly -t lite unpause-pipeline -p concourse-gradle-spring-boot`