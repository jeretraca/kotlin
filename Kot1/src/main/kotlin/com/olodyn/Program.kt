package com.olodyn


/*
class Program {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            var kevin = Student("Kevin", "Njoroge", 1, "Linet Awuor")
            println(kevin.id)
            Student.createPostgrad("Simon")
            Student.createUndergrad("Kamoni")

        }
    }
}

n  Undergraduate(name)
        }
        fun creaopen class Student(firstName:String, lastName: String, _id: Int , var tutor: String=""):Person(firstName, lastName){
            val id : Int
            init {
                id = _id
            }
            fun enrole(courseName: String){
                val course = Courses.allCourses
                    .filter { it.Title == courseName }
                    .firstOrNull()
            }

            override fun getAddress(): String { return "" }

            override fun getName(): String { return "$firstName $lastName" }
            companion object: XmlSerializer<Student>{
                override fun toXml(item: Student) {

                }

                fun createUndergrad(name: String): Undergraduate{
                    returtePostgrad(name: String): Postgraduate{
            return  Postgraduate(name)
        }
    }

}

class Undergraduate(firstName: String): Student(firstName, "",1){}
class Postgraduate(firstName: String): Student(firstName, "",1){}
*/

interface XmlSerializer<T> { fun toXml(item:T)}