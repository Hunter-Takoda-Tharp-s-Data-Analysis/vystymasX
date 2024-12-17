import java.io.File

fun main() {
    val htmlContent = """
        <!DOCTYPE html>
        <html lang=\"en\">
        <head>
            <meta charset=\"UTF-8\">
            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">
            <title>vystymasx</title>
            <style>
                body {
                    font-family: Arial, sans-serif;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    height: 100vh;
                    margin: 0;
                    background-color: #f4f4f9;
                }
                h1 {
                    color: #333;
                }
            </style>
        </head>
        <body>
            <h1>vystymasx</h1>
        </body>
        </html>
    """

    val file = File("vystymasx.html")
    file.writeText(htmlContent)
    println("html file 'vystymasx.html' created successfully")
}
