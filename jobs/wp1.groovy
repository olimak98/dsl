project_name = "6tgjsdjfjdhgf"
repo = "olimak98/wp1"
branch = "master"

freeStyleJob(project_name) {
    scm {
        github(repo, branch)
    }
    triggers {
        githubPush()
    }
    steps {
        batchFile('XCopy C:\\Users\\kamil\\.jenkins\\workspace C:\\nginx-1.14.0\\html /s /y /exclude:C:\\Users\\kamil\\.jenkins\\workspace\\exclude.txt')
    }
}
