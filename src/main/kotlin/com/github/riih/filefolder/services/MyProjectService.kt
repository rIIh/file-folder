package com.github.riih.filefolder.services

import com.intellij.openapi.project.Project
import com.github.riih.filefolder.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
