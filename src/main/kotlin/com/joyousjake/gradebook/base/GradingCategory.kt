package com.joyousjake.gradebook.base

class GradingCategory (val name: String, val weight: Int) {
    private val assignments: MutableList<Assignment> = mutableListOf()

    fun average() = assignments.fold(initial = 0.0) {
            accessor: Double, assignment: Assignment ->
        accessor + assignment.grade
    }

    fun addAssignment(assignment: Assignment) {
        assignments += assignment
    }
}
