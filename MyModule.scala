object MyModule {
    def abs(n: Int): Int =
        if (n<0) -n
        else n

    def factorial(x: Int): Int = {        
        @annotation.tailrec
        def go (n: Int, acc: Int): Int =
            if (n<=0) acc
            else go(n-1, acc*n)
        
        go(x,1)
    }

    private def formatAbs(x: Int) = {
        val msg = "Absolute value of %d is %d"
        msg.format(x, abs(x))
    }

    private def formatFactorial(x: Int) = {
        val msg = "Factorial value of %d is %d"
        msg.format(x, factorial(x))
    }

    // private def myformat(x:Int, f: Unit)
    //     val msg = "Function value of %d is %d"
    //     msg.format(x,f(x))

    def main(args: Array[String]) : Unit = 
        println(formatAbs(-48))
        println(formatFactorial(7))
        //println(myformat(-2,abs))
}