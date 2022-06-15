object HelloWorld {
    def main(args: Array[String]) {
        println ("insertar un numero")
        val a= scala.io.StdIn.readInt()
        var b=""
        for ( i <- 0 to a){
            if (i==(a-1)){
                b=b+fibonacci(i)
            }
            else{
                b=b+fibonacci(i)+", "
            }
        }
        print(b)
   }
   def fibonacci(b: BigInt): BigInt = {
        if (b<2){
            return b
        }
        else{
            return (fibonacci(b-1)+fibonacci(b-2))
        }
    }
}
