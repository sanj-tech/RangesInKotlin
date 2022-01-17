package RangeExample

fun main() {
  //Range Example using in and until

  var a=4
  val res=a in 1..5 //1,2,3,4,5 print No upper bound
  println(res)

  val res1=a in 1 until 5
  println(res1)
// nested if & else Example
  var anu ="Happy"
  val result=if (anu=="sad"){
    println("anu is sad")
  }else
    if (anu=="feel Normal"){
      println("Anu is feeling normal")
    }
  else if (anu=="Happy"){
    println("Anu is Happy")
    }else{
      println("No data found")
    }
  println(result)
var mood="Happy"
  when(mood){

    "sad"-> print("sad")
    "enjoy"-> println("enjoy")
    "Happy"-> println("Happy")
    else-> println("not found")

  }

  //when is use as an expression
  var toy="remotecar"
  var reslt= when(toy){
    "Gudiya"-> "Gudiya"
    "train"-> "train"
    "remotecar"-> "remotecar"
    else-> "not found"
  }
println(reslt)

  var numbers=14
  var results=when(numbers){
    8->"eight"
    9->"seven"
   in 10..15->"teen"
    else->" not in range"
  }
  println(results)

var count=5
  while (count>=1){
    println("count")
    count--
  }
  //Example of while loop
var number=1
  while (number<=10){
    println(number*2)
    number++
  }
  //example of while loop

var num=3
  var index=1
  while (index<=10){
    println(num*index)
    index++
  }
//do while loop
  var index1=6
  do {
      println("Hi")
  }while (index1>5)



}