package main.DemoClass

class Person(val banner:String) {
  System.err.println(banner)
  private var privateAge=0;

  def this(age:Int){
    this("age start")
    Person.staticMove()
    privateAge = age;
  }
  def age = privateAge;
  def age_= (Input: Int){privateAge = Input}

  override def toString: String = getClass.getName + " age:" + privateAge;
}

object Person{
  var staticId = 0;

  def staticMove(){
    staticId+=1
    System.err.println(staticId)
  }
}