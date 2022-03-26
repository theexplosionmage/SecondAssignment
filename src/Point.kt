import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    val point = Point(1, 2);
    val point1 = Point(1, 5);
    println(point)
    println(point.equals(point1))
    println(point)
    println(point.dist(point1))
    point.switcheroo();
    println(point.dist(point1))
}

class Point(private var x: Int, private var y: Int) {
    override fun toString(): String {
        return "$x, $y"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Point
        if (x != other.x) return false
        if (y != other.y) return false
        return true
    }

    fun switcheroo(): Unit {
        x *= -1
        y *= -1
    }

    fun dist(other: Point): Double {
        return sqrt((other.x.toDouble() - x.toDouble()).pow(2) + (other.y.toDouble() - y.toDouble()).pow(2))
    }
}