import java.net._
import java.io._
import scala.io._

object Client{
    def main(args:Array[String]){
        var client = new Socket(InetAddress.getByName("localhost"),5000)
        var in = new BufferedSource(client.getInputStream()).getLines()
        var out = new PrintStream(client.getOutputStream())

        out.println("Hola mundo")
        out.flush()

        println("Recivio :"+in.next())
        client.close()
    }
}