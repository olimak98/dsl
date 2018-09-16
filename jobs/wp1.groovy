project_name = "wp1"
repo = "olimak98/wp1"
repo_name = "wp1"
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
