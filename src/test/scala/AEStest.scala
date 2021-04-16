
// AEStest.scala
package AES
 
import chisel3._
 
object testMain extends App {
  Driver.execute(args, () =>  new Inv_AES128())
}
