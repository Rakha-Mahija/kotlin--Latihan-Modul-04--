fun main() {

    val scores = mutableMapOf(
        24523001 to 85,
        24523002 to 90,
        24523003 to 78
    )

    scores[24523001] = 95

    scores.remove(24523003)

    println("--- Daftar Nilai Mahasiswa ---")
    for ((nim, score) in scores) {
        println("NIM: $nim, Nilai: $score")
    }

    val Nimkosong = 24669999
    val result = scores[Nimkosong]
    println("\nNilai untuk NIM $Nimkosong: $result")
}
