fun main() {
    val meloman = true
    val purchaseAmount: Double = 15000.0
    val discount : Double = if (purchaseAmount <= 1_000) 0.0
    else if (purchaseAmount > 1_000 && purchaseAmount <= 10_000) 100.0
    else purchaseAmount*0.05
    val totalDiscount: Double= if (meloman) discount * 0.99 else discount
    val totalAmount = purchaseAmount - discount

    println(totalAmount)
}