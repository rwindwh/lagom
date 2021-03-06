lazy val sslProj = (project in file(""))
  .enablePlugins(LagomScala)
  .settings(
//#service-https-port
    lagomServiceHttpsPort := 20443
//#service-https-port
    ,
//#service-enable-ssl
    lagomServiceEnableSsl in ThisBuild := true
//#service-enable-ssl
  )
