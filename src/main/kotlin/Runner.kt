import kotlin.random.Random

fun main(){
    val incorrectGuessList = mutableListOf<Number>()
    val randomNum = Random.nextInt(1,101)
    var incorrectGuesses = 0
    var guess = 0;
    while(guess != randomNum){
        print("Enter a guess number between 1 and 100: ")
        guess = readln().toInt()
        if(!incorrectGuessList.contains(guess) && guess != randomNum){
            incorrectGuesses++
            incorrectGuessList.add(guess)
        }
        when{
            guess > randomNum && guess -5 <= randomNum-> println("close, but too big")
            guess > randomNum -> println("too big")
            guess < randomNum && guess +5 >= randomNum-> println("close, but too small")
            guess < randomNum -> println("too small")
        }
    }
    println("yay you won! The number was $randomNum")
    println("Number of incorrect guesses $incorrectGuesses")
    print(incorrectGuessList)
}