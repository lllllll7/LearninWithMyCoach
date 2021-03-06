package chapter.five.exercises;

import access.Widget;
import aclass.in.apackage.PackagedClass;
//import static debug.*;
import debug.Twin;
import outside.apackage.AccessOutside;
import protecteddata.ManipulateData;
import protecteddata.ProtectedData;

public class ExercisesFive {
    /**
     * <html>
     *     <head>
     *         <style TYPE="text/css">
     *              li { margin-bottom: 2em;}
     *         </style>
     *     </head>
     *     <body>
     *         <ol>
     *              <li>Exercise 1:  (1) Create a class in a package. Create an instance of your class outside of that
     *                      package.</li>
     *
     *
     *              <li>Exercise 2:  (1) Take the code fragments in this section and turn them into a program, and
     *                      verify that collisions do in fact occur.</li>
     *
     *              <li>Exercise 3:  (2) Create two packages: debug and debugoff, containing an identical class with a
     *                      debug( ) method. The first version displays its String argument to the console, the second
     *                      does nothing. Use a static import line to import the class into a test program, and
     *                      demonstrate the conditional compilation effect.</li>
     *
     *              <li>Exercise 4:  (2) Show that protected methods have package access but are not public.</li>
     *
     *              <li>Exercise 5:  (2) Create a class with public, private, protected, and package-access fields and
     *                      method members. Create an object of this class and see what kind of compiler messages you
     *                      get when you try to access all the class members. Be aware that classes in the same
     *                      directory are part of the default package.</li>
     *
     *              <li>Exercise 6:  (1) Create a class with protected data. Create a second class in the same file
     *                      with a method that manipulates the protected data in the first class.</li>
     *
     *              <li>Exercise 7:  (1) Create the library according to the code fragments describing access and
     *                      Widget. Create a Widget in a class that is not part of the access package.</li>
     *
     *              <li>Exercise 8:  (4) Following the form of the example Lunch.java, create a class called
     *                      ConnectionManager that manages a fixed array of Connection objects. The client programmer
     *                      must not be able to explicitlycreate Connection objects, but can only get them via a static
     *                      method in ConnectionManager. When the ConnectionManager runs out of objects, it returns a
     *                      null reference. Test the classes in main( ).</li>
     *
     *              <li>Exercise 9:  (2) Create the following file in the access/local directory
     *                      (presumably in your CLASSPATH):
     *                      access/local/PackagedClass.java</br>
     *                      </br>
     *                      <code>package access.local;</br>
     *
     *                      class PackagedClass { </br>
     *                          public PackagedClass() {</br>
     *                              System.out.println("Creating a packaged class");</br>
     *                          }</br>
     *                      }</code></br>
     *                      </br>
     *                      Then create the following file in a directory other than access/local:
     *                      access/foreign/Foreign.java</br>
     *                      </br>
     *                      <code>package access.foreign;</br>
     *                      import access.local.*;</br>
     *
     *                      public class Foreign {</br>
     *                          public static void main(String[] args) {</br>
     *                              PackagedClass pc = new PackagedClass();</br>
     *                          }</br>
     *                      }</code></br>
     *                      </br>
     *                      Explain why the compiler generates an error. Would making the Foreign class part of the
     *                      access.local package change anything?</li>
     *          </ol>
     *     </body>
     * </html>
     */
    public static void main(String[] args) {
        ProtectedData protectedData = new ProtectedData();
        ManipulateData manipulateData = new ManipulateData();
        /**
         * Exercise 1:  (1) Create a class in a package. Create an instance of your class outside of that package.
         *
         *      @see PackagedClass
         */
        PackagedClass packagedClass = new PackagedClass();

        /**
         * Exercise 2:  (1) Take the code fragments in this section and turn them into a program, and verify that
         *      collisions do in fact occur.
         *
         *      @see debug.Twin
         *      @see debugoff.Twin
         */

        /**
         * Exercise 3:  (2) Create two packages: debug and debugoff, containing an identical class with a debug( )
         *      method. The first version displays its String argument to the console, the second does nothing. Use a
         *      static import line to import the class into a test program, and demonstrate the conditional compilation
         *      effect.
         *
         *      @see debug.Twin
         *      @see debugoff.Twin
         */
        Twin twin = new Twin();
        twin.debug("string");

        /**
         * Exercise 4:  (2) Show that protected methods have package access but are not public.
         *
         *      @see protecteddata.ProtectedData
         *      @see ManipulateData
         */
        System.out.println(manipulateData.getK());

        /**
         * Exercise 5:  (2) Create a class with public, private, protected, and package-access fields and method
         *      members. Create an object of this class and see what kind of compiler messages you get when you try to
         *      access all the class members. Be aware that classes in the same directory are part of the default
         *      package.
         *
         *      @see Access
         *      @see AccessOutside
         */

        Access access = new Access();
        System.out.println(access.a);
        System.out.println(access.b);
        System.out.println(access.c);
//        System.out.println(access.d);

        AccessOutside accessOutside = new AccessOutside();
        System.out.println(accessOutside.a);
//        System.out.println(accessOutside.b);
//        System.out.println(accessOutside.c);
//        System.out.println(access.d);


        /**
         * Exercise 6:  (1) Create a class with protected data. Create a second class in the same file with a method that
         *      manipulates the protected data in the first class.
         *
         *      @see ManipulateData
         *      @see protecteddata.ProtectedData
         */
        System.out.println(manipulateData.getSring());
        System.out.println(manipulateData.getInt());
        manipulateData.setString("New String");
        manipulateData.setInt(2);
        System.out.println(manipulateData.getSring());
        System.out.println(manipulateData.getInt());

        /**
         * Exercise 7:  (1) Create the library according to the code fragments describing access and Widget. Create
         *      a Widget in a class that is not part of the access package.
         *
         *      @see Widget
         */
        Widget widget = new Widget();

        /**
         * Exercise 8:  (4) Following the form of the example Lunch.java, create a class called ConnectionManager that
         *      manages a fixed array of Connection objects. The client programmer must not be able to explicitly
         *      create Connection objects, but can only get them via a static method in ConnectionManager. When the
         *      ConnectionManager runs out of objects, it returns a null reference. Test the classes in main( ).
         *
         *      @see ConnectionManager
         *      @see Connection
         */
        System.out.println(ConnectionManager.getConnection());
        System.out.println(ConnectionManager.getConnection());
        System.out.println(ConnectionManager.getConnection());
        System.out.println(ConnectionManager.getConnection());

        /**
         *Exercise 9:  (2) Create the following file in the access/local directory (presumably in your CLASSPATH):
         *      access/local/PackagedClass.java
         *      package access.local;
         *
         *      class PackagedClass {
         *          public PackagedClass() {
         *              System.out.println("Creating a packaged class");
         *          }
         *      }
         *
         *      Then create the following file in a directory other than access/local:
         *
         *      access/foreign/Foreign.java
         *      package access.foreign;
         *      import access.local.*;
         *
         *      public class Foreign {
         *          public static void main(String[] args) {
         *              PackagedClass pc = new PackagedClass();
         *          }
         *      }
         *
         *      Explain why the compiler generates an error. Would making the Foreign class part of the access.local
         *      package change anything?
         *
         *      @see access.local.PackagedClass
         *      @see access.foreign.Foreign
         */


    }
}

