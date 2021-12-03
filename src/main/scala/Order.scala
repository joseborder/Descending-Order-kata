object Order {
  def descendingOrder(num: Int): Int = {
    val numStr = num.toString
    val aList : List[Any] = numStr.toList
    val intList : List[Int] = aList.map(_.toString().toInt)
    val orderedList : List[Int] = intList.sorted.reverse

    val str = orderedList.mkString("")
    str.toInt
  }

  def main(args: Array[String]): Unit = {

    val randomInt = 338692233
    print(descendingOrder(randomInt))

  }

}
