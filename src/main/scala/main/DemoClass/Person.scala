package main.DemoClass

class Person(val banner:String) {
  System.err.println(banner)
  private var privateAge=0;

  def this(age:Int){
    this("age start")
    privateAge = age;
  }
  def age = privateAge;
  def age_= (Input: Int){privateAge = Input}


}
