package edu.handong.csee.java.inheritance;

public class Cat extends Animal {

	public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
	
	@Override
    public void testInstanceMethod() {
    	//super class의 override된 method
    	super.testInstanceMethod();
    	
    	System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal dog = new Dog();
        Animal monkey = new Monkey();
        
        //override
        //결과: The instance method in Animal
        //	   The instance method in Cat
        myCat.testInstanceMethod();
        System.out.println("-------------");
        
        //hiding = static method의 override
        //결과: The static method in Animal
        //	   The static method in Cat
        // 	   The static method in Animal
        Animal.testClassMethod();
        myCat.testClassMethod();
        myAnimal.testClassMethod();
        System.out.println("-------------");
        
        //polymorphism = type이 동일하게 animal로 인스턴스되었만, 실행 결과는 서로 다르다.
        //				 Dog와 Monkey, 각각의 .testInstanceMethod()가 실행된다.
        //결과: The instance method in Dog
        //	   The instance method in Monkey
        dog.testInstanceMethod();
        monkey.testInstanceMethod();
    }

}
