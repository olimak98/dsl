project_name = "jenkins-pipeline-wordpress"
repo = "https://github.com/johnpbloch/wordpress-project"
repo_name = "app1"

pipelineJob(project_name) {
	definition {
		triggers{
			scm('H/1 * * * *')
		}

		cpsScm{
			scm {
				git {
					remote {
					name(repo_name)
					url(repo)
					}
				}
				scriptPath("Jenkinsfile")
			}
		}
	}
}