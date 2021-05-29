package subtask2

class BillCounter {


    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val billList = bill.toCollection(ArrayList())
        var sumB = 0
        var sumN = 0
        var sb = 0
        var sn = 0

        billList.forEachIndexed { index, e ->
            sumN = sumN.plus(e)
            if (index == k){
                sumB = sumB.plus(e)
            }
        }

        sn = (sumN - sumB)/2
        sb = b - sn
        return if (sn == b){
            "Bon Appetit"
        } else sb.toString()
    }
}


