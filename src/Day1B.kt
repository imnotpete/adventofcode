import java.io.File
import java.util.*

// https://adventofcode.com/2021/day/1

fun main() {
    val window = LinkedList<Int>();
    var lastSum = 0;
    var increased = 0;
    val file = File("C:\\Users\\Sam Jones\\git\\adventofcode2021\\src\\day1.dat");

    file.forEachLine { it ->
        val depth = it.toInt();
        window.add(depth);

        val windowSize = window.size;
        if (windowSize < 3) {
            // building first window, get next value
            return@forEachLine;
        } else if (windowSize > 3) {
            window.remove();
        }

        val sum = window.sum();

        if (sum > lastSum && lastSum != 0) {
           increased++;
        }

        lastSum = sum;
    }

    println(increased);
}

