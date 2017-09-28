## Introduction of Sort4J
This project provide the basic sorting algorithms implemented in Java. More specific, we have the following algorithms at the present,

1. <code><b>Bubble Sorting</b></code>
2. <code><b>Selection Sorting</b></code>
3. <code><b>Insertion Sorting</b></code>

## Usage of Sort4J
Since each algorithms is implemented as the form of the class, so it's quite easy to use the algorithms only by calling the cooresponding class, here is the example of usage of <code>Bubble Sorting</code> agorithm,
```java
public static void usingBubble(int[] nums){
  double st = System.nanoTime();
  Bubble bubble = new Bubble(nums);  // create the object bubble
  bubble.Sorting();  // sorting the array
  for(int num: bubble.getNums()){  // get sorted array
    System.out.print(num + " "); 
  }
  System.out.println("");
  double ed = System.nanoTime();
  System.out.println("Time consuming: " + (ed-st));  // print the running time
}
```
