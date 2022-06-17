#!/usr/bin/env groovy
def call() {
    echo "building the Jar File for ${env.BRANCH_NAME}"
    sh "mvn package"
}
