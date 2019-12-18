/* 16 bit binary to decimal number converter.
   This script takes in up to a 16 digit "binary" string of bits that are all 0's and 1's.
*  It will interpret this binary number and return the decimal equivalent. */


// : Int on the next line means the return type for this function is Int
fun binaryToInt(binaryDigits: String): Int {
    val binaryValues = arrayListOf(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768)
    val reversedDigits = binaryDigits.reversed()

    var returnedInt = 0
    var x = 0
    for (i in reversedDigits){
        if (i == '1' && x < 16) {
            returnedInt += binaryValues[x]
        }
        x++
    }
    return returnedInt
}

fun main() {
    println("Welcome to the Kotlin binary to int converter")
    val binaryStringValue = binaryToInt("10011011")
    println("The value of the binary string is: $binaryStringValue")

}