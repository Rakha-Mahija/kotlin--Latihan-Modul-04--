enum class CourseStatus { 
    ACTIVE, COMPLETED , DROPPED
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

fun describe(status: CourseStatus): String {
    return when (status) {
        CourseStatus.ACTIVE -> "Mata kuliah sedang aktif berjalan"
        CourseStatus.COMPLETED -> "Mata kuliah telah selesai diambil"
        
        CourseStatus.DROPPED -> "Mata kuliah telah dibatalkan"
    }
}

fun main() {
    val courses: MutableList<Course> = mutableListOf(
        Course("PAB101", "Mobile App Development", CourseStatus.ACTIVE),
        Course("BIK102", "Bahasa indonesia", CourseStatus.COMPLETED),
        Course("PGI103", "Pengembangan Game", CourseStatus.ACTIVE)
    )
    val newCourse = Course("FSD104", "sains data", CourseStatus.DROPPED)
    courses.add(newCourse)
    
    courses.removeAt(1)
    
    for (course in courses) {
        println("${course.displayInfo()} -> ${describe(course.status)}")
    }
    
    val sampleCourse = courses[0]
    val (code, name, status) = sampleCourse

    println("--- Hasil Destructuring ---")
    println("Code   : $code")
    println("Name   : $name")
    println("Status : $status")
    
}

/*Lanjutkan Latihan 1. Tulis fungsi describe(status: CourseStatus): String
menggunakan when tanpa cabang else, lalu cetak deskripsi status untuk setiap mata kuliah
di dalam list. Tambahkan konstanta DROPPED ke CourseStatus dan amati pesan yang
diberikan compiler. */
