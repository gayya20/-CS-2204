var k=2
var i=2
var j=2
var m=5                   //(01,02)
var n=5
var f=12.0f
var g=4.0f
var c='x'

println(k+12*m) //62
println(m/j)    //2
println(n%j)    //1                   //(03)
println(m/j*j)  //4
println(f+10*5+g) //66.0


var a=2
var b=3
var c=4
var d=5
var g=4
var k=4.3

b=b+1
d=d-1                   //(a)
println(b*a+c*d);//24

a=a+1
println(a)  //3          //(b)
println (-2 * {g- k } +c) //4.6     //c
c=c+1
println(c)  //5                  //d
println("c=",c*a) //e


//04)a

def wage(hours:Int):Int =hours*150

def ot(hours:Int):Int=hours*85

def income(h1:Int,h2:Int):Int=wage(h1)+ot(h2)

def tax(income:Int):Int=income*.12

def takeHome(h1:Int,h2:Int):Double=income(h1,h2)-tax(income(h1,h2))




def attendees(price:Int):Int=120+(15-price)/5*20
def revenue(price:Int):Int = attendees(price)* price        //04)b
def cost(price:Int):Int=500+attendees(price)

