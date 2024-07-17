def call() {
    def nodeTool = tool name: env.NODE_VERSION
    env.PATH = "${nodeTool}/bin:${env.PATH}"
    sh 'node -v' // Verify NodeJS version
    sh 'npm -v' // Verify NPM version
}
