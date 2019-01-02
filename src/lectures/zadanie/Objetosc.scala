package lectures.zadanie

object Objetosc extends App{

  /**
    *
    * @param width double in cm
    * @param height double in cm
    * @param length double in cm
    * @return cubic String in m3
    */
  def cubicMeter(width: Double, height: Double, length: Double): String = {
    val cubic = (width * height * length) / 10000

    if (cubic < 10000)
      f"$cubic%04.0f"

    else
      "9999"


  }

  var x = scala.io.StdIn.readLine().toDouble
  var y = scala.io.StdIn.readLine().toDouble
  var z = scala.io.StdIn.readLine().toDouble

  println(cubicMeter(x,y,z))

}
