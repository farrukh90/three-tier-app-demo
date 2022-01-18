node {
	stage("Pull Repo"){
		checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/farrukh90/three-tier-app-demo.git']]])
}
	stage("Init"){
        workspace("VPC/}") {
		    sh "terraform init"
    }
}
	stage("Apply"){
		workspace("VPC/}") {
		    sh "terraform apply -auto-approve"
    }
}
	stage("Send Message"){
		echo "hello"
}
	stage("Send Email"){
		echo "hello"
	}
}