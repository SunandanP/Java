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