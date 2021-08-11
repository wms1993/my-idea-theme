package com.github.wms1993.myideatheme.services

import com.github.wms1993.myideatheme.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
