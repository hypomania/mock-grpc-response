package com.github.hypomania.mockgrpcresponse.services

import com.intellij.openapi.project.Project
import com.github.hypomania.mockgrpcresponse.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
