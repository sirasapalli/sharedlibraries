def newgit(rep0)
{
  git "${repo}"
}
def maven()
{
  sh 'mvn package'
}
