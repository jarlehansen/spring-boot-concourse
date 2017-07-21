# Spring Boot Concourse example

Example setup using gradle, spring boot and [concourse](https://concourse.ci).

1. **Login**: `fly -t tutorial login`
2. **Set pipeline**: `fly -t lite set-pipeline -p concourse-gradle-spring-boot -c concourse/pipeline.yml`
3. **Unpause pipeline**: `fly -t lite unpause-pipeline -p concourse-gradle-spring-boot`

----

## Vagrant setup

1. **Setup concourse in vagrant and install pipeline**: `./up.sh`
2. **Remove concourse vm**: `./destroy.sh`

## References

* [Tutorial](https://github.com/starkandwayne/concourse-tutorial)
* [Pipeline patterns](https://github.com/pivotalservices/concourse-pipeline-samples/tree/master/concourse-pipeline-patterns)