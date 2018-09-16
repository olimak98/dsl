folder = "projects/"
project_name = "project_wp1"
repo = "https://github.com/olimak98/wp1.git"
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
        batchFile('XCopy C:\\Users\\kamil\\.jenkins\\workspace C:\\nginx-1.14.0\\html /s /y')
    }
}
