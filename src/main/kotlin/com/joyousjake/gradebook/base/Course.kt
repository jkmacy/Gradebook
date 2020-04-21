package com.joyousjake.gradebook.base

data class Course (val name: String, val teacher: String, val number: Int, val section: Int) {
    private val gradingCategories: MutableList<GradingCategory> = mutableListOf()

    fun average() = gradingCategories.fold(initial = 0.0) {
            accessor: Double, category: GradingCategory ->
        accessor + category.average()
    }

    fun addGradingCategory(gradingCategory: GradingCategory) {
        gradingCategories += gradingCategory
    }
}
