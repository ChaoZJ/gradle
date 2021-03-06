// This is an example of a lifecycle task that crosses build boundaries defined in the umbrella build.
tasks.register("checkFeatures") {
    group = "verification"
    description = "Run all feature tests"
    dependsOn(gradle.includedBuild("admin-feature").task(":config:check"))
    dependsOn(gradle.includedBuild("user-feature").task(":data:check"))
    dependsOn(gradle.includedBuild("user-feature").task(":table:check"))
}
