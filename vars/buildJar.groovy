#!/usr/bin/env groovy
def call() {
    echo "building the Jar File for .."
    sh "mvn package"
}
