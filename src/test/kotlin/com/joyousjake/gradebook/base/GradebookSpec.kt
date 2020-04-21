package com.joyousjake.gradebook.base

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object GradebookSpec : Spek({
    describe("a gradebook") {
        val gradebook by memoized {
            Gradebook(
                school = "Texas State University",
                year = 2020,
                semester = Semester.SPRING
            )
        }

        it("has a school name, year, and semester") {
            assertEquals(gradebook.school, "Texas State University")

            assertEquals(gradebook.year, 2020)

            assertEquals(gradebook.semester, Semester.SPRING)
        }

    }

    describe("a course") {
        val course by memoized {
            Course(
                name = "Data Structures and Algorithms",
                teacher = "Lee Koh",
                number = 3358,
                section = 255
            )
        }

        it("has a course name, teacher, course number, and class section") {
            assertEquals(course.name, "Data Structures and Algorithms")

            assertEquals(course.teacher, "Lee Koh")

            assertEquals(course.number, 3358)

            assertEquals(course.section, 255)
        }

        it("has an average") {
            assertTrue(course.average() in 0.toDouble()..100.toDouble())
        }
    }
})
