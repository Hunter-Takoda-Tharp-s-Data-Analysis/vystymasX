// vystymasx

fun main() {
    println("vystymasx - development meets data")
    println("----------------------------------")

    val data = listOf( // mock data for demonstration
        "patterns", "models", "insights", "predictions"
    )

    println("exploring:")
    data.forEachIndexed { index, item ->
        println(" ${index + 1}. $item")
    }

    println("\nstarting analysis...")
    val result = analyze(data)
    println("result: $result")

    println("\nend of vystymasx")
}

fun analyze(data: List<String>): String {
    val output = data.joinToString(separator = " | ") { it.reversed() }
    return "analysis complete -> $output"
}
