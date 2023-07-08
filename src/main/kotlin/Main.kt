import kotlin.math.min

fun main(args: Array<String>) {

}


//fun twoOldestAges(ages: List<Int>): List<Int> {
//    var max =  ages.map { it }.max()
//    var min = ages.map { it }.min()
//
//}

//fun nbYear(pp0:Int, percent:Double, aug:Int, p:Int):Int {
   // var numYears = 0
   // percent/100
  //  while(pp0<p)
  //  {
 //        pp0 = ((pp0 * (1 + percent)) + aug).toInt()
//         numYears += 1
 //   }
 //   return numYears
//}


fun getAge(yearsOld: String): Int {

    // your code here
    var number = yearsOld.replace("[^0-9]".toRegex(),"")
    return number.toInt()
}



object GrassHopper {
    fun summation(n: Int): Int {
        var num = 0
        for (i in 0..n) {
            num += i
        }
        return num
    }
}

fun abbrevName(name:String):String {
    return name.split(' ').toString()
}
fun reverse(str:String):String{
    return str.replace(Regex("[^A-Z,a-z]"), "").reversed()
}

fun reverseLetter(str: String): String {
    val regex =  Regex("[^A-z]")
    val strReplace = regex.replace(str, "")
   return strReplace.reversed()

}


fun include(arr: IntArray, item : Int): Boolean {
    return arr.filter { it == item }.any()
}


fun j(i: Int):Int{
    if (i > 0){
    }
    return i*2
}
fun findSmallestInt(nums: List<Int>): Int? {
// Implement me!return
    return nums.minOrNull()
}

fun move(pos: Int, roll: Int): Int {
    // your code here
    return pos + roll *2
}