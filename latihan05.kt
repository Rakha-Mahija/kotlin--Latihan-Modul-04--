enum class CourseStatus { 
    ACTIVE, COMPLETED 
}

data class Course(
    val code: String, 
    val name: String, 
    val status: CourseStatus
) {
    // 2. Companion object berisi PREFIX = "PAB"
    companion object {
        const val PREFIX = "PAB"
    }
}

// 1. Object AppConfig berisi MAX_COURSES = 5
object AppConfig {
    const val MAX_COURSES = 5
}

// 3. Extension function untuk MutableList<Course>
fun MutableList<Course>.addCourse(course: Course): Boolean {
    // 4. Validasi jumlah elemen dan prefiks kode
    if (this.size < AppConfig.MAX_COURSES && course.code.startsWith(Course.PREFIX)) {
        this.add(course)
        return true // 5. Kembalikan true jika berhasil
    }
    return false // 5. Kembalikan false jika tidak memenuhi syarat
}

fun Course.displayInfo(): String {
    return "$code - $name - $status"
}

fun main() {
    val courses: MutableList<Course> = mutableListOf(
        Course("PAB101", "Mobile App Development", CourseStatus.ACTIVE),
        Course("PAB102", "Advanced Android", CourseStatus.ACTIVE),
        Course("PAB103", "Flutter Basics", CourseStatus.COMPLETED)
    )

    // Uji Coba Penambahan:
    
    // 1. Berhasil ditambahkan (kode diawali "PAB" dan total masih < 5)
    val validCourse = Course("PAB104", "Kotlin Multiplatform", CourseStatus.ACTIVE)
    println("Tambah PAB104: ${courses.addCourse(validCourse)}") // Output: true

    // 2. Gagal (kode tidak diawali "PAB")
    val invalidPrefixCourse = Course("FSD105", "Sains Data", CourseStatus.ACTIVE)
    println("Tambah FSD105: ${courses.addCourse(invalidPrefixCourse)}") // Output: false

    // Cetak daftar course yang berhasil masuk
    println("\n--- Daftar Mata Kuliah Saat Ini (${courses.size}/${AppConfig.MAX_COURSES}) ---")
    for (course in courses) {
        println(course.displayInfo())
    }
}
