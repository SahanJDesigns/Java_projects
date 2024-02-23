# Program Design

The test was conducted using Java. The program consists of ten different files:

- `HashSetUtil`
- `TreeSetUtil`
- `LinkedHashSetUtil`
- `ArrayListUtil`
- `LinkedListUtil`
- `ArrayDequeUtil`
- `PriorityQueueUtil`
- `HashMapUtil`
- `TreeMapUtil`
- `LinkedHashMapUtil`

Each sub-program is designed to evaluate the runtime performance of various methods (`add`, `contain`, `remove`, and `clear`) on the selected collections (`HashSet`, `TreeSet`, `LinkedHashSet`, `ArrayList`, `LinkedList`, `ArrayDeque`, `PriorityQueue`, `HashMap`, `TreeMap`, `LinkedHashMap`) in Java. The primary objective is to measure and compare the time taken for these operations to execute on these collections across multiple iterations. A mean run time was calculated to compare the collections with each other.

## Key Aspects

1. **Creation of Collection Object:**
   - A method to create an object of the relevant collection containing random integers ranging up to 100,000.

2. **Evolution Methods:**
   - Specific operations (`add`, `contain`, `remove`, and `clear`) executed on the collection for 100 iterations.
   - The runtime for each iteration is recorded in an array.
   - Average runtime for each operation is calculated.

3. **Main Method:**
   - The above methods are called inside the `main` method.
   - The results are displayed in a formatted way.

4. **Test Conditions:**
   - Each collection was loaded with 100,000 items in the test.
   - Time measurements were obtained at nanoseconds.
   - The tests were performed using default initial capacity and load factor values.

5. **Class Structure:**
   - Classes were created for each collection to obtain the runtime for operations.
   - A test class was created to implement the specified methods for each collection to compare the runtimes.

## File Structure

- `HashSetUtil.java`
- `TreeSetUtil.java`
- `LinkedHashSetUtil.java`
- `ArrayListUtil.java`
- `LinkedListUtil.java`
- `ArrayDequeUtil.java`
- `PriorityQueueUtil.java`
- `HashMapUtil.java`
- `TreeMapUtil.java`
- `LinkedHashMapUtil.java`

## Execution

To run the program, execute the `main` method in the test class.

# Behaviour of Operations in Different Collections

## Addition

1. **HashSet:**
   - A hash function is used internally by the `HashSet add()` method to identify which bucket the element should be placed in. It verifies unique elements and looks for duplication.

2. **TreeSet:**
   - An internal Red-Black Tree is used by the `TreeSet add()` method. A custom comparator or the elements' natural order is used to determine the sorting order of the elements.

3. **LinkedHashSet:**
   - The `LinkedHashSet add()` method relies on a hash function, just like the `HashSet add()` method, but it additionally keeps a doubly-linked list to maintain the insertion order.

4. **ArrayList:**
   - `add()` method in `ArrayList` appends the element to the dynamic array. If the array is full, it should be resized. Then a new array is created, and the elements are copied to the new array.

5. **LinkedList:**
   - `add()` method in `LinkedList` adds a new node to the end of the linked list. It will update the references to maintain the structure of the linked list.

6. **ArrayDeque:**
   - `add()` method in `ArrayDeque` adds the element to the end of the deque. If required, the internal array is resized.

7. **PriorityQueue:**
   - `add()` method in `PriorityQueue` inserts the element based on its priority. After each insertion, heap property is maintained.

8. **HashMap:**
   - `put()` method in `HashMap` insert data after calculating the hash of the key to determine the bucket. If there's a hash collision, it resolves it using different techniques (separate chaining or open addressing). If necessary, it may need to resize the internal array.

9. **TreeMap:**
   - `put()` method in `TreeMap` adds the key-value pair to the Red-Black Tree. A sorted order is maintained based on the keys.

10. **LinkedHashMap:**
   - `put()` method in `LinkedHashMap` is similar to that of `HashMap`. In addition to calculating the hash of the key, it also maintains a doubly linked list to preserve the order of insertion.

## Contain

1. **HashSet:**
   - `contains()` method in `HashSet` uses the hash code of the element to check the corresponding bucket. Then equality checks are performed to see if the element is present.

2. **TreeSet:**
   - `contains()` method in `TreeSet` uses a self-balancing binary search, typically a Red-Black Tree to find the element based on its natural order or a custom comparator.

3. **LinkedHashSet:**
   - Similar to the `contains()` method in `HashSet`, `LinkedHashSet` also uses the hash code to locate the specific bucket. Then it iterates through the linked list while checking for equality.

4. **ArrayList:**
   - `contains()` method in `ArrayList` iterates through the elements linearly. It performs equality checks until the element is found or the end of the list is reached.

5. **LinkedList:**
   - `contains()` method in `LinkedList` traverses through the linked list starting from the head until the element is found or the end of the list is reached.

6. **ArrayDeque:**
   - `contains()` method in `ArrayDeque` iterates over the internal array while performing equality checks until the element is found or the end of the deque is reached.

7. **PriorityQueue:**
   - `contains()` method in `PriorityQueue` iterates through the heap structure to find the element based on the priority.

8. **HashMap:**
   - `containsKey()` method in `HashMap` calculates the hash of the key, determines the bucket, and then checks for equality within the entries of that bucket.

9. **TreeMap:**
   - `containsKey()` method in `TreeMap` checks whether a key is present using a binary search algorithm based on the natural order or a custom comparator.

10. **LinkedHashMap:**
    - `containsKey()` method in `LinkedHashMap` uses the hash code to locate the bucket and then iterates through the linked list in that bucket.

## Remove

1. **HashSet:**
   - `remove()` method in `HashSet` uses the hash code of the element to locate the corresponding bucket. It then iterates through the elements in that bucket and removes the relevant element.

2. **TreeSet:**
   - `remove()` method in `TreeSet` uses a binary search algorithm to find and remove the element based on its natural order or a custom comparator.

3. **LinkedHashSet:**
   - Similar to `HashSet`, `remove()` in `LinkedHashSet` calculates the hash key and locates the relevant bucket. Then it iterates through the linked list in the bucket and removes the element based on equality.

4. **ArrayList:**
   - `remove()` method in `ArrayList` uses linear search to find the index of the element and then removes it. After removing, the subsequent elements are shifted to fill the gap.

5. **LinkedList:**
   - `LinkedList's` `remove()` method traverses through the linked list to find the node that contains the element. Then it adjusts the references to remove the node.

6. **ArrayDeque:**
   - `remove()` method in `ArrayDeque` removes the element from the internal array and shifts the elements to fill the gap if necessary.

7. **PriorityQueue:**
   - `remove()` method in `PriorityQueue` removes and returns the element with the highest priority. The priority within the queue is then maintained by reorganizing the heap.

8. **HashMap:**
   - `remove()` method in `HashMap` uses the hash code of the key to locate the bucket. It then iterates through the elements in the bucket and removes the relevant element.

9. **TreeMap:**
   - `remove()` method in `TreeMap` uses a binary search algorithm to find and remove the element based on the natural order or a custom comparator.

10. **LinkedHashMap:**
    - `remove()` method in `LinkedHashMap` uses the hash code to locate the bucket and then iterates through the linked list in the bucket to remove the relevant element.

## Clear

1. **HashSet:**
   - `clear()` method in `HashSet` involves resetting the internal array of buckets to an initial state. Each bucket is set to null.

2. **TreeSet:**
   - `clear()` method in `TreeSet` resets the root of the tree to null, effectively removing all elements.

3. **LinkedHashSet:**
   - `clear()` method in `LinkedHashSet` resets the head and tail of the linked list to null, while maintaining the linked structure for preserving insertion order.

4. **ArrayList:**
   - `clear()` method in `ArrayList` sets the size of the dynamic array to zero, effectively removing all elements. Any references to objects might still exist in memory, but the list itself becomes empty.

5. **LinkedList:**
   - `clear()` method in `LinkedList` removes all elements individually and updates the linked structure while iterating through the list.

6. **ArrayDeque:**
   - `clear()` method in `ArrayDeque` sets the size of
#Time complexity of operations

| Collection      | Method         | Add (Avg case) | Add (Worst case) | Contain (Avg case) | Contain (Worst case) | Remove (Avg case) | Remove (Worst case) | Clear (Avg case and Worst case) |
|-----------------|----------------|----------------|------------------|--------------------|----------------------|-------------------|---------------------|----------------------------------|
| HashSet         | O(1)           | O(n)           | O(1)             | O(n)               | O(1)                 | O(n)              | O(n)                | O(n)                             |
| TreeSet         | O(log n)       | O(log n)       | O(log n)         | O(log n)           | O(log n)             | O(log n)          | O(log n)            | O(log n)                         |
| LinkedHashSet   | O(1)           | O(n)           | O(1)             | O(n)               | O(1)                 | O(n)              | O(n)                | O(n)                             |
| ArrayList       | O(1)           | O(n)           | O(n)             | O(n)               | O(n)                 | O(n)              | O(1)                | O(1)                             |
| LinkedList      | O(1)           | O(1)           | O(n)             | O(n)               | O(n)                 | O(n)              | O(1)                | O(1)                             |
| ArrayDeque      | O(1)           | O(1)           | O(n)             | O(n)               | O(n)                 | O(n)              | O(1)                | O(1)                             |
| PriorityQueue   | O(log n)       | O(log n)       | O(n)             | O(n)               | O(n)                 | O(n)              | O(n)                | O(n)                             |
| HashMap         | O(1)           | O(n)           | O(1)             | O(n)               | O(1)                 | O(n)              | O(n)                | O(n)                             |
| TreeMap         | O(log n)       | O(log n)       | O(log n)         | O(log n)           | O(log n)             | O(log n)          | O(log n)            | O(log n)                         |
| LinkedHashMap   | O(1)           | O(n)           | O(1)             | O(n)               | O(1)                 | O(n)              | O(log n)            | O(n)                             |


