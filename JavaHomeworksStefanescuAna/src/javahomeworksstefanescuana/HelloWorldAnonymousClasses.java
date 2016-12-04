/*
 * Anonymous class to become a normal class
 */
package javahomeworksstefanescuana;

/**
 *
 * @author Ana-Eliza
 */
public class HelloWorldAnonymousClasses{
    public static void main(String[] args) {
         HelloWorldAnonymousClasses myApp =
    new HelloWorldAnonymousClasses();

        myApp.sayHello();

    }


        // Interface HelloWorld
        interface HelloWorld{
            public void greet();
            public void greetSomeone(String someone);
        }

        //Method sayHello prints
public void sayHello(){
        // Local class EnglishGreetings implemented in the method sayHello()
        class EnglishGreetings implements HelloWorld {
            String name = "world";
            
            @Override
            public void greet(){
                    greetSomeone("world");
            }
            @Override
            public void greetSomeone(String someone){
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        // Local class FrenchGreeting implements HelloWorld
           abstract class FrenchGreeting implements HelloWorld {
             String name = "tout le monde";
             
                          

             // create an anonimous class for Spanish language
           class SpanishGreeting implements HelloWorld {
             
             String name = "mundo";
             @Override
              public void greet(){

                greetSomeone("mundo");

            }
            @Override

            public void greetSomeone(String someone){

                name = someone;

                System.out.println("Hola, " + name);
            }
           }
           }
}
}

           




        
        
    
       
        
     
           






    

