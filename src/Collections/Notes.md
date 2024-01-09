# Collections Framework
<ul>
    <li>Iterable</li>
   <ul>
        <li>Collection</li>
        <ul>
            <li>List</li>
            <ul>
                <li>ArrayList</li>
                <li>LinkedList</li>
            </ul>
            <li>Queue</li>
            <ul>
                <li>PriorityQueue</li>
                <li>Deque</li>
            </ul>
            <li>Set</li>
            <ul>
                <li>HashSet</li>
            </ul>
        </ul>
   </ul>
</ul>

## The Iterable interface
The iterable interface provides the functionality to iterate over
a list of items without knowing the internal implementation details.

It comes with <i>three</i> methods that help to iterate over the set of items
held by the object.
    
    iterator() -> iterator<T>

The iterator item returned by iterator function results in a way to iterate over 
the object using the functions like 
    
    iterator.hasNext() -> bool
    iterator.next() -> T 
    (returns the current object and moves the pointer to the next)

## The collection Interface
### Collection\<E>

Main operations that the implementer should offer are
#### <li>  add()
#### <li>  remove()
#### <li>  contains()
#### <li>  size()

## The list interface
When there's need that the position of the item in the data structure matters
then using List is necessary.
    
    .get(int index) -> get the item at a particular index
    .remove(int index)
    .indexOf(Object object) 
    .lastIndexOf(Object object)

## The comparable interface
Comparable\<E> defines the comparison operation between two same type of entities
in the form of a compareTo method which takes the \<E> argument and defines the comparison between the
current object and the one to be compared.

returns -1 if the current object is smaller in logical sense.

returns 0 if the current object is exactly same (content) in logical sense.

returns 1 if the current object is greater than the one it is being compared with.

In this context we can achieve any positive or negative value to achieve the same results

example :
    
    class Demo implements Comparable<Demo>{
        int value;

        public Demo(int value){
            this.value = value;
        }
        
        public int compareTo(Demo object){
            return this.value - object.value;
        }
        
    }

## The Comparator interface
This is a interface used to create utility comparator classes which
compare the instances of an class using some logic similar to Comparable interfacre.

    class Example implements Comparator<Demo>{
        public int compare(Demo o1, Demo o2){
            return o1.value - o2.value;
        }
    }

Use case :
    
    Collections.sort(list, new Example());

## Set Interface
Stores unique data. HashSet is an implementation which does not guarantee the
order of the items.

Main Operations

Union : set1.addAll(set2)

Intersect : set1.retainAll(set2)

Difference : set1.removeAll(set2)