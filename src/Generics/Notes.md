# Generics
## Need :
Java is strongly typed language hence the methods or the classes
used for implementing the logic is valid for that particular datatype only.
This is where the generics help us in making Classes or methods to be generic
so that the logic is not limited by the datatype it is intended for.

## Declaration :
### Generic Class
For a generic class we can describe the datatype which is intended to be used,
as a type argument at the time of instantiation.

    class GenericList<T> {
        private T data;
        private type2 data2;

        public returnType1 method1(T t){
            // use this generic arguement as you like.
        }
    }


### Generic method :
    class Util {
        public static <T extends Comparable<T>> T max(T first, T Second){
            return (first.compareTo(second) < 0)? second : first;
        }
    }


## Instantiation :

For using the generic classes we need to provide the Type of the object
that we want the class to work for, as a type argument.

    class someClass {
        GenericList<String> list = new GenericList<>();
    }

For the instantiation to work we should only provide Data classes used in
java or sometimes referred to as Wrapper classes for all the primitive data types.

<ul>
    <li>Integer : int</li>
    <li>Double : double</li>
    <li>Boolean : boolean</li>
    and so on...
</ul>

## Constraints :
For a generic type we can apply constraints such that the types that can work with
this class belong to a specific group or a hierarchy of java classes.

    class GenericList<T extends Number>

In this case we cannot Instantiate a GenericList object of type
String as it does not belong to the hierarchy of the number class.

A specific constraint that can help many a times is "Comparable". It is an
interface defined in Java and describes if the objects of the class are comparable or not.
All the primitive datatypes implement this class.
<br>important mention : Cloneable

    class GenericList<T extends Comparable>

we if require more constraints, then syntax would be :

    class GenericList<T extends Comparable & Cloneable>
With this the type parameter is said to be bounded type parameter.

## Type erasure
#### (Generics under the hood)

When we don't add any constraints on the type parameter the java bytecode obtained
after the compilation shows that the Type parameter is referred to as Object type.
Meaning at runtime the type parameter \<T>\ is considered to be an instance of Object class.

If we add some constraints then the hierarchy basically starts from that class and goes on downward.
hence all the objects of the \<T>\ are referred to as the Constraint class itself.

## Comparable Interface
Provides a way of comparing instances of the same class and it also helps to naturally compare
the objects with compareTo method.

    class User implements Comparable<User>{
        private int points;
        
        public int compareTo(User user){
            if(this.points < user.points){
                return -1;
            }
            else if(this.points == user.points){
                return 0;
            }
            else
                return 1;
        }
        
        // Alternative implementation
        public int compareTo(User user){
            return(this.points - user.points);
        }
    }

## Multiple type parameters
When there is a requirement of having more than one type parameter we can use it
as : 

    class MapItem<K, V> {
        private K key;
        private V value;
    }

## Wildcards
When we have User class which is inherited by let's say Instructor class then GenericList\<Instructor>
does not extend the GenericList\<User> because the Implementation of GenericList doesn't depend on the user class.

Now to use this GenericList class as we do with regular objects following the hierarchy we need something called wildcards.
    
    public void printUsers(GenericList<? extends User>){
        //logic
    }
    

    Usage :
    // here Instructor extends to the User class
    printUsers(new GenericList<Instructor>());

Important point to note is that if we have such a configuration to begin with
then we can either read or write the object to the list.
    
    // for reading 
    public void peekUser(GenericList<? extends User> list){}
    
    // for writing or adding objects to the list
    public void addUser(GenericList<? super User>){}

    //meaning that this wildcard class becomes a Parent of User class
