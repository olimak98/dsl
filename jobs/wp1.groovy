folder = "projects/"
project_name = "project_wp1"
repo = "olimak98/wp1"
repo_name = "wp1"
branch = "master"

freeStyleJob(folder + project_name) {
    scm {
        github(repo, branch)
    }
    triggers {
        githubPush()
    }
    steps {
        batchFile('XCopy C:\\Users\\kamil\\.jenkins\\workspace\\'+project_name+' C:\\nginx-1.14.0\\html\\'+project_name+' /s /y')
    }
}
