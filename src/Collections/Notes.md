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


