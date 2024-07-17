def call() {
    def dockerTool = tool name: 'docker'
    env.PATH = "${dockerTool}/bin:${env.PATH}"
    sh 'docker -v' // Verify Docker version
}
