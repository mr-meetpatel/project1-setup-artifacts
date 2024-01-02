package org.example

class Project1{
    private var name = "Project 1"
    fun getProjectName():String = name

    fun setProjectName(name:String):Project1{
        this.name=name
        return this
    }
}