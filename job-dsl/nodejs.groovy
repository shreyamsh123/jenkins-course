job('NodeJS example') {
  scm {
    git('https://github.com/shreyamsh123/docker-demo.git') { node ->
      node / gitConfigName('DSL User')
      node / gitConfigName('jenkins-dsl@newtech.academy')
    }
  }
  
  triggers {
    scm('H/5 * * * *')
  }
  
  wrappers {
    nodejs('nodejs')
  }
  
  steps {
    shell('npm install')
  }
}
