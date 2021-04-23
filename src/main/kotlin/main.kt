fun main(args: Array<String>) {
    val input = intArrayOf(13, 2, 36, 48, 59, 0, 120)
    val result = intArrayOf(158, 278)
    val res = intArrayOf(0, 0)
    var max=0
    var min=0

    input.sort()

    for(i in 0..5)
    {
        res[0]+=input[i];
        res[1]+=input[input.size-1-i]
    }
    println(res[0])
    println(res[1])
}