package subtask1

class HappyArray {

    /* fun convertToHappy(sadArray: IntArray): IntArray {
         var y = 0
         var x = 0
         val out = IntArray(sadArray.size)
         val happyArray: IntArray

         while (x < sadArray.size) {

             if (x == 0 || x == sadArray.size - 1) {
                 out[y] = sadArray[x]
                 y++
             } else if (sadArray[x - 1] + sadArray[x + 1] > sadArray[x]) {
                 out[y] = sadArray[x]
                 y++
             }
             x++
         }

         happyArray = IntArray(y)
         System.arraycopy(out, 0, happyArray, 0, y)


 return happyArray
     }*/
    fun convertToHappy(sadArray: IntArray): IntArray {

        val happyArray = mutableListOf<Int>()

        sadArray.forEach { item ->
            happyArray.add(item)
            while (isPreviousSad(happyArray)) {
                removePrevious(happyArray)
            }
        }
        return happyArray.toIntArray()
    }


    private fun isPreviousSad(happyArray: MutableList<Int>): Boolean {

        val previousIndex = happyArray.lastIndex - 1
        if (previousIndex <= 0) {
            return false
        }
        return happyArray[previousIndex] > happyArray[previousIndex - 1] + happyArray[previousIndex + 1]
    }

    private fun removePrevious(happyArray: MutableList<Int>) {
        happyArray.removeAt(happyArray.lastIndex - 1)
    }

}