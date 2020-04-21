package com.joyousjake.gradebook.base

class Gradebook (val school: String, val year: Int, val semester: Semester) {
    private val courses: MutableList<Course> = mutableListOf()

    fun addCourse(course: Course) {
        courses += course
    }
}

enum class Semester {
    FALL, SPRING, WINTER, SUMMER
}