def newgit(repo)
{
  git "${repo}"
}
def maven()
{
  sh 'mvn package'
}
def deploy(ip,appname)
{
deploy adapters: [tomcat9(credentialsId: 'a47b8015-4687-4fe5-804f-015fa2f0bd0c', path: '', url: "${ip}")], contextPath: "${appname}", war: '**/*.war'
}
