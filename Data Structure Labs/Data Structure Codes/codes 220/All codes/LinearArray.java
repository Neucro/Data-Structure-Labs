public class LinearArray{ 
  public static void main(String [] args){ 
    int [] a = {10, 20, 30, 40, 50, 60}; 
    
    System.out.println("\n///// TEST 01: Copy Array example /////"); 
    int [] b = copyArray(a, a.length); 
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 }  
    
    System.out.println("\n///// TEST 02: Print Reverse example /////"); 
    printArray(a); // This Should Print: { 10, 20, 30, 40, 50, 60 }  
    printReverse(a); // This Should Print: { 60, 50, 40, 30, 20, 10 }  
    
    
    System.out.println("\n///// TEST 03: Reverse Array example /////"); 
    reverseArray(b); //check
    printArray(b); // This Should Print: { 60, 50, 40, 30, 20, 10 }  
    
    
    System.out.println("\n///// TEST 04: Shift Left k cell example /////"); 
    b = copyArray(a, a.length); 
    b=shiftLeft(b,3); 
    printArray(b); // This Should Print: { 40, 50, 60, 0, 0, 0 }  
    
    System.out.println("\n///// TEST 05: Rotate Left k cell example /////"); 
    b = copyArray(a, a.length);  
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 }  
    b=rotateLeft(b,3); 
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 }  
    
    System.out.println("\n///// TEST 06: Shift Right k cell example /////"); 
    b = copyArray(a, a.length); 
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 }  
    b=shiftRight(b,3); 
    printArray(b);  // This Should Print: { 0, 0, 0, 10, 20, 30 }  
    
    System.out.println("\n///// TEST 07: Rotate Right k cell example /////"); 
    b = copyArray(a, a.length); 
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 }  
    b=rotateRight(b,3); 
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 }  
    
    
    System.out.println("\n///// TEST 08: Insert example 1 /////"); 
    
    b = copyArray(a, a.length); 
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 }  
    boolean bol=insert(b,6, 70, 2); // This Should Print: No space Left  
    System.out.println(bol); // This Should Print: false 
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 }  
    
    System.out.println("\n///// TEST 09: Insert example 2 /////"); 
    int [] c = {10, 20, 30, 40, 50, 0, 0};  
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 } 
    bol=insert(c,5, 70, 2);  // This Should Print: Number of elements after insertion: 6 
    System.out.println(bol); // This Should Print: true 
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 }  
    
    System.out.println("\n///// TEST 10: Insert example 3 /////"); 
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 }  
    bol=insert(c,6, 70, 6); // This Should Print: Number of elements after insertion: 7  
    System.out.println(bol); // This Should Print: true 
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 }  
    
    System.out.println("\n///// TEST 11: Remove example 1 /////"); 
    
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 }  
    bol=removeAll(c,7,90); 
    System.out.println(bol); // This Should Print: false 
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 }  
    
    System.out.println("\n///// TEST 12: Remove example 2 /////"); 
    printArray(c);  // This Should Print: { 10, 20, 70, 30, 40, 50, 70 }  
    bol=removeAll(c,7,70); 
    System.out.println(bol); // This Should Print: true 
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }  
    
    
    
  } 
  
  // Prints the contents of the source array 
  public static void printArray(int [] source){ 
    // TO DO 
    for(int c=0;c<source.length;c++)
    {
      if(c>0&&c!=source.length-1&&c<source.length)
      {
        System.out.print(source[c]+", ");
      }
      else if(c==0)
      {
        System.out.print("{ "+source[c]+", ");
      }
      else if(c==source.length-1)
      {
        System.out.print(source[c]+" }");
      }
    }
    System.out.println();
  } 
  
  // Prints the contents of the source array in reverse order 
  public static void printReverse(int [] source){ 
    // TO DO 
    for(int c=source.length-1;c>=0;c--)
    {
      if(c==source.length-1)
      {
        System.out.print("{ "+source[c]+", ");
      }
      else if(c==0)
      {
        System.out.print(source[c]+" }");
      }
      else if(c!=source.length-1&&c!=0&&c<source.length)
      {
        System.out.print(source[c]+" ,");
      }
    }
    System.out.println();
  } 
  
  // creates a copy of the source array and returns the reference of the newly created copy array 
  public static int [] copyArray(int [] source, int len){ 
    // TO DO
    int copy[]=new int[len];
    for(int c=0;c<len;c++)//len=a.length
    {
      copy[c]=source[c]; // remove this line     
    }
    return copy;
  }
  // creates a reversed copy of the source array and returns the reference of the newly created reversed array 
  public static void reverseArray(int [] source){ 
    // TO DO
    for(int i=source.length-1,j=0;i>j;i--,j++)
    {
      int temp=source[i];
      source[i]=source[j];
      source[j]=temp;
    }
  } 
  
  // Shifts all the elements of the source array to the left by 'k' positions 
  // Returns the updated array 
  public static int [] shiftLeft(int [] source, int k){ 
    // TO DO 
    for(int i=k;i<=source.length-1;i++)
    {
      source[i-k]=source[i];
    }
    int i=source.length-1;
    for(int c=0;c<k;c++)
    {
      source[i]=0;
      i--;
    }
    int size=source.length;
    size=size-k;
    return source; // remove this line     
  } 
  
  // Rotates all the elements of the source array to the left by 'k' positions 
  // Returns the updated array 
  public static int [] rotateLeft(int [] source, int k){ 
    // TO DO
    int size=source.length;
    int temp[]=new int[k];
    for(int c=0;c<k;c++)
    {
      temp[c]=source[c];
    }
    for(int i=k;i<=size-1;i++)//shifting left
    {
      source[i-k]=source[i];
    }
    int i=size-1;
    for(int c=0;c<k;c++)//nullifying
    {
      source[i]=0;
      i--;
    }
    //most important part starts from here, the two counters, first one start from old array's last
    //and second one temporary array's last and both decreases on the loop
    int o=size-1;//first counter
    int j=k-1;//second counter
    for(int c=0;c<k;c++)
    {
      source[o]=temp[j];
      o--;
      j--;
    }
    return source;    
  } 
  
  public static int [] shiftRight(int [] source, int k){ 
    // TO DO 
    int size=source.length;
    int lost=k;
    if(size==source.length)//compact
    {
      for(int i=size-1-k;i>=0;i--)
      {
        source[i+k]=source[i];
      }
    }
    else if(size+k<=source.length)//null cells
    {
      for(int i=size-1;i>=0;i--)
      {
        source[i+k]=source[i];
      }
    }
    else
    {//if(size+k>source.length)//null filled up //similar with compact
      for(int i=source.length-1-k;i>=0;i--)
      {
        source[i+k]=source[i];
      }
    }
    size=size-lost;
    int i=0;
    for(int c=0;c<k;c++)
    {
      source[i]=0;
      i++;
    }
    return source; // remove this line     
  } 
  
  // Rotates all the elements of the source array to the right by 'k' positions 
  // Returns the updated array 
  public static int [] rotateRight(int [] source, int k){ 
    // TO DO 
    int[] b=new int[k];
    for(int i=0;i<k;i++)//saving
    {
      b[i]=source[i];
    }
    int count=0;
    for(int i=k;i<source.length;i++)//shifting left
    {
      source[count]=source[i];
      count++;
    }
    count=source.length-k;
    for(int i=0;i<k;i++)//filled up by saved values
    {
      source[count]=b[i];
      count++;
    }
    return source;
/*
public static void rotateRight(Object array[]) {
Object lastElement = array[array.length - 1];
for (int i = array.length - k; i > 0; i--)
{
array[i] = array[i – k];
}
array[0] = lastElement;
*/
  } 
  
  /** @return true if insertion is successful; @return false otherwise 
    * @param arr the reference to the linear array 
    * @param size the number of elements that exists in the array. size<=arr.length 
    * @param elem the element that is to be inserted 
    * @param index the index in which the element is required to be inserted 
    * if insertion is not successful due to lack space, print "No space Left" 
    * if given index is invalid, print "Invalid Index" 
    * if insertion is successful, print the 'Number of elements after insertion' is completed 
    */ 
  public static boolean insert(int [] arr, int size, int elem, int index){ 
    // TO DO 
    if (size == arr.length)
    {
      System.out.println("No space left");
    }
    else if(index<0||index>arr.length-1)
    {
      System.out.println("Invalid index");
      return false;
    }
    else {
      for (int i = size-1; i >= index; i--)
      {
        arr[i + 1] = arr[i];
      }
      arr[index] = elem;
      size++;
      System.out.println("Number of elements after insertion:"+ size); 
      return true;
    } 
    return false;
  } 
  
  /**  
   * removes all the occurences of the given element 
   * @param arr the reference to the linear array 
   * @param size the number of elements that exists in the array. size<=arr.length 
   * @param elem the element to be removed 
   * @return true if removal is successful; return false otherwise 
   * if removal is successful, print the 'Number of elements after removal' is completed 
   */   
  public static boolean removeAll(int [] arr, int size, int elem)
  { 
    boolean removalSuccess=false;
    int countRemoved=0;
    for(int i=0;i<size;i++)
    {
      if(arr[i]==elem)
      {
        arr[i]=0;
        countRemoved++;
        removalSuccess=true;
      }
    }
    for(int i=0;i<size;i++)
    {
      if(arr[i]==0)
      {
        arr[i]=arr[i+1];
      }
    }
    return removalSuccess;
  }
}
//    boolean b=false;
//    for(int i=0;i<arr.length;i++)
//    {
//      if(arr[arr.length-1]==elem)
//      {
//        arr[arr.length-1]=0;
//        b=true;        
//      }
//      else if(arr[i]==elem)
//      {
//        
//      }
//    }
//    return b;// remove this line    

//    for(int i=0;i<size;i++)
//    {
//      if(arr[i]==elem)
//      {
//        arr[i]=0;
//      }
//    }
//   return true;
// TO DO 
// Removes the element at the given index from the array with size elements.

// Shift all elements [index+1 ... size-1] one position to the
// left.
////     int index=-1;
//index finding loop from specific element
//     System.out.println("Elem: "+elem);
////    for(int i=0;i<size;i++)
////    {
////      if(arr[i]==elem)
////      {
////        index=i;
////      }
////    }
//    System.out.println("Index: "+index);

//    if(index>=0||index<=size-1)
////    if(index>0)
////    {
////    for (int i = index + 1; i < size; i++)
////    {
////      arr[i - 1] = arr[i];
////    }

// Now nullify the unused slot at the end.
//    arr[size - 1] = 0;
////    size--;
//    return true;
//    }
//    else
//    {
//      return false;
//    }
