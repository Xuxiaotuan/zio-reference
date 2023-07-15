enablePlugins(ZioSbtEcosystemPlugin)

inThisBuild(
  List(
    name                       := "ZIO Quickstarts",
    organization               := "dev.zio",
    ciUpdateReadmeJobs         := Seq.empty,
    ciReleaseJobs              := Seq.empty,
    ciPostReleaseJobs          := Seq.empty,
    ciCheckWebsiteBuildProcess := Seq.empty,
    scalaVersion               := "2.13.8",
    ciDefaultTargetJavaVersions := Seq("8"),
    semanticdbEnabled           := true,
    semanticdbVersion           := scalafixSemanticdb.revision
  )
)

lazy val root =
  project
    .in(file("."))
    .aggregate(
      `zio-quickstart-hello-world`
    )

lazy val `zio-quickstart-hello-world`                         = project
