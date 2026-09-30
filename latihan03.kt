fun main() {
    val keahlian = mutableSetOf("Kotlin", "Java")
  
    keahlian.add("Python")
    keahlian.add("Kotlin")
    
    println("Ukuran Set: ${keahlian.size}")
  
    println("Apakah Swift ada di dalam Set? ${"Swift" in keahlian}")
    println("Apakah Python ada di dalam Set? ${"Python" in keahlian}")
    
    /* PENJELASAN
     * Ukuran Set tidak bertambah saat "Kotlin" ditambahkan karena 
     * struktur data Set secara otomatis mengabaikan elemen duplikat 
     * untuk memastikan seluruh nilainya unik. Karena "Kotlin" sudah 
     * ada di dalam Set sejak awal, penambahan kedua kalinya akan 
     * diabaikan.*/
}
