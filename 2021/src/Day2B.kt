import java.io.File

fun main() {

    var horizontal = 0;
    var depth = 0;
    var aim = 0;
    val file = File("C:\\Users\\Sam Jones\\git\\adventofcode2021\\src\\day2.dat");

    file.forEachLine {
        val (action, value) = it.split(" ");
        val int = value.toInt();

        when (action) {
            "forward" -> {
                horizontal += int;
                depth += (aim * int);
            }
            "up" -> aim -= int
            "down" -> aim += int
        }
    }

    val product = horizontal * depth;

    println(product);
}

