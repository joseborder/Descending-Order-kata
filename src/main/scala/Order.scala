object Order {
  def descendingOrder(num: Int): Int = {
    val numStr = num.toString
    val aList : List[Any] = numStr.toList
    val intList : List[Int] = aList.map(_.toString().toInt)
    val orderedList : List[Int] = intList.sorted

    val str = orderedList.mkString("")
    str.toInt
  }

  def main(args: Array[String]): Unit = {

    val randomInt = 132134556
    print(descendingOrder(randomInt))

  }

}
