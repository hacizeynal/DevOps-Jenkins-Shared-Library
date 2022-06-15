def call(String name,String dayOfWeek) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}
