enum class CourseStatus { 
    ACTIVE, COMPLETED 
}

data class Course(
    val code: String, 
    val name: String, 
    val status: CourseStatus)

//Masukkan minimal tiga mata kuliah ke dalam MutableList<Course>

//MutableList<Course>
/*1. Buat enum class CourseStatus { ACTIVE, COMPLETED }.
2. Buat data class Course(val code: String, val name: String, val
status: CourseStatus).
3. Masukkan minimal tiga mata kuliah ke dalam MutableList<Course>.
4. Tambahkan satu mata kuliah, hapus satu mata kuliah, lalu cetak semua mata kuliah
yang tersisa.
5. Tulis fun Course.displayInfo(): String yang menghasilkan teks seperti PAB101
- Mobile App Development - ACTIVE.
6. Lakukan destructuring pada satu mata kuliah: val (code, name, status) =
course. */
    
fun Course.displayInfo(): String {
    return "$code - $name - $status"
}


fun main() {
    val courses: MutableList<Course> = mutableListOf(
        Course("PAB101", "Mobile App Development", CourseStatus.ACTIVE),
        Course("BIK102", "Bahasa indonesia", CourseStatus.COMPLETED),
        Course("PGI103", "Pengembangan Game", CourseStatus.ACTIVE)
    )
    val newCourse = Course("FSD104", "sains data", CourseStatus.ACTIVE)
    courses.add(newCourse)
    
    courses.removeAt(1)
    
    for (course in courses) {
        println(course.displayInfo())
    }
    
    val sampleCourse = courses[0]
    val (code, name, status) = sampleCourse

    println("--- Hasil Destructuring ---")
    println("Code   : $code")
    println("Name   : $name")
    println("Status : $status")
    
}
