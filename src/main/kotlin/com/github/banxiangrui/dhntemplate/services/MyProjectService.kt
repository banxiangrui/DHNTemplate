package com.github.banxiangrui.dhntemplate.services

import com.github.banxiangrui.dhntemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
