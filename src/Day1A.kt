import java.io.File

// https://adventofcode.com/2021/day/1

fun main() {

    var lastDepth = 0;
    var increased = 0;
    val file = File("C:\\Users\\Sam Jones\\git\\adventofcode2021\\src\\day1.dat");

    file.forEachLine {
        val depth = it.toInt();
        if (depth > lastDepth && lastDepth != 0) {
           increased++;
        }

        lastDepth = depth;
    }

    println(increased);
}

