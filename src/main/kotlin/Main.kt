class Main {
    fun main () {

        val costOfGas = 2.28
        val mileage = 25

        println("What's your name?")
        var name = readLine()

        println("What is your friends name?")
        var friendName = readLine()
        println("What is this trip about?")

        var adjective = readLine()
        println("Which city you are visiting?")

        var city = readLine()
        println("What is the band you are going to see?")

        var bandName = readLine()
        println("What is your profession? ")

        var work = readLine()
        println("Enter number between 400 - 600")
        val distance : Int = Integer.valueOf(readLine())

        var totalForGas = (costOfGas / mileage) * distance
        totalForGas = Math.round(totalForGas * 100) / 100.00

        var totalMoneySaved = totalForGas + 200


        print("""
    A long time ago, $name and their friend $friendName planned a(n) $adjective road trip to see their favorite band: $bandName.
    The venue was $distance miles away which meant they needed to save $$totalForGas dollars to get there.\n
    Both of them worked as $work for the whole summer and managed to save up a total of $totalMoneySaved dollars!
    To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $bandName t-shirts to remember their trip.
    """.trimIndent())
    }
}