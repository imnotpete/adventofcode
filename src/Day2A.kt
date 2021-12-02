import java.io.File

// https://adventofcode.com/2021/day/1

fun main() {

    var horizontal = 0;
    var depth = 0;
    val file = File("C:\\Users\\Sam Jones\\git\\adventofcode2021\\src\\day2.dat");

    file.forEachLine {
        val (action, value) = it.split(" ");
        val int = value.toInt();

        when (action) {
            "forward" -> horizontal += int
            "up" -> depth -= int
            "down" -> depth += int
        }
    }

    val product = horizontal * depth;

    println(product);
}

