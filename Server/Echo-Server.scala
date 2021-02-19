import java.net._
import java.io._
import scala.io._

object Server{
    def main(args: Array[String]){
        var server = new ServerSocket(5000)
        while (true){
            var socket = server.accept()
            var in = new BufferedSource(socket.getInputStream()).getLines()
            var out = new PrintStream(socket.getOutputStream())

            println("Realizo una conexion exitosa!")
            //println("Mensaje: "+in.next())

            out.println(in.next())
            out.flush()

            socket.close()
        }
    }
}