Array
'''
Array Type: 
Static Array:
    -An original type of array.
    -It is a continue range of memory spaces.
    -It is accessed by index.
    
    Static Array Definition:
        /*
         * define an array of size 10.
         *    -Assign an index called "arr" pointing to arr[0]

        int[] arr = new int [10];

        //assign value based on index
        arr[0] = 1;
        arr[1] = 2

        //Fetch value based on index
        int a = arr[0];

    Insert in middle:
        //Given An Array [0, 1, 2, 3]
        int[] arr = new int[10];
        for (int i = 0; i < 4; i++) {
            arr[i] = i;
        }

        // add 666 at index 2
        // needs to move all elements one index to the right
        for(int i = 4; i > 2; i--){
            //curr = pre current index assigned previous value.
            arr[i] = arr[i - 1];  
        }

        arr[2] = 666
        //[1, 2, 666, 3,]

    Insert in full:
        //Given a full array
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }

        //Create a double size array
        int[] newArr = new int[20]

        //Copy and paste from old array
        for (int i = 0; i < 10; i++) {
            newArr[i] = arr[i];
        }

        //gabage collector reuse the old arr memory.

        newArr[10] = 666;
        //[...9, 666, ..., 0]

Dynamic Array:
    -Advanced static array, provided API such as push, insert, remove.
    -Queue, stack, hashsets are all based on dynamic array.

    // Create Dynamic Array:
    // Automatically change size based on elements.
    ArrayList<Integer> arr = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
        // add element at the end Time Complexity O(1)
        arr.add(i);
    }

    // insert element in the middle Time Complexity O(N)
    // add 666 at index 2
    arr.add(2, 666);

    // insert element at head Time Complexity O(N)
    arr.add(0, -1);

    // delete end Time Complexity O(1)
    arr.remove(arr.size() - 1);

    // delete middle element Time Complexity O(N)
    // delete element at index 2
    arr.remove(2);

    // get element with index Time Complexity O(1)
    int a = arr.get(0);

    // set element with index Time Complexity  O(1)
    arr.set(0, 100);

    // find index with value Time Complexity  O(N)
    int index = arr.indexOf(666);