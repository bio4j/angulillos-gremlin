Nice.javaProject

name          := "angulillos-gremlin"
description   := "a Tinkerpop 3 Gremlin implementation with a lot of angulillos"
organization  := "bio4j"
bucketSuffix  := "era7.com"

javaVersion   := "1.8" 

libraryDependencies := Seq(
                            "bio4j"                       % "angulillos"            % "0.4.1",
                            "com.tinkerpop"               % "gremlin-core"          % "3.0.0.M6"
                          )
// won't be needed at some point
dependencyOverrides := Set(
                            "commons-configuration"       % "commons-configuration" % "1.10",
                            "com.fasterxml.jackson.core"  % "jackson-databind"      % "2.3.0"
                          )
