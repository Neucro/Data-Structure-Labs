public class recursion{
  public int factorial(int x)
  {
    if(x==0||x==1)
    {
      return 1;
    }
    else
    {
      int fact=x*factorial(x-1);
      return fact;
    }
  }
  public int fibonacci(int x)
  {
    if(x==1)
    {
      return 0;
    }
    else if(x==2)
    {
      return 1;
    }
    else
    {
      int fib=fibonacci(x-1)+fibonacci(x-2);
      return fib;
    }
  }
  public int binarySearch(int []array,int left,int right, int key)
  {
//    boolean contains=false;
    int mid=(left+right)/2;
    if(key==array[mid])
    {
      return mid;
    }
    else
    {
      if(key>array[mid])
      {
        left=mid+1;
        return binarySearch(array,left,right,key);
//        for(int i=left;i<=right;i++)
//        {
//          if(key==array[i])
//          {
//            contains=true;
//          }
//        }
      }
      else
      {
        right=mid-1;
        return binarySearch(array,left,right,key);
//        for(int i=left;i<=right;i++)
//        {
//          if(key==array[i])
//          {
//            contains=true;
//          }
//        }
      }
    }
//    return -1;
  }
  
  
  
  
  
  
  
  
  
  
  
  /*
   public String binaryConvert(int x)
   {
   if(x==0)
   {
   String ab="0";
   return ab;
   }
   else if(x==1)
   {
   String ab="1";
   return ab;
   }
   else
   {
   String bin="";
   bin=bin+(String)binaryConvert(x%2);
   return bin;
   }
   }*/
  public void binarynumber(int x){
    int remainder = x%2;
//        if(x==0)
//        {
//          System.out.print("0");
//        }
    if(x!=0){
      binarynumber(x/2);
      System.out.print(remainder + " ");
    }
//      else
//      {
//        System.out.print("0");
//      }
  }
  public int toThePower(int base, int power)
  {
    int result=1;
    if(power==0)
    {
      return 1;
    }
    else if(base==0)
    {
      return 0;
    }
    else
    {
      while(power>0)
      {
        result=result*base;
        power--;
        toThePower(base, power);
      }
    }
    return result;
  }
  public int greatestCommonDivisor(int greater, int lower)
  {
    int remainder=1;
      if(lower==0)
      {
        return greater;
      }
      while(lower!=0)
      {
       remainder=greater%lower;
       greatestCommonDivisor(lower,remainder);
      }
   
      return lower;
  }
  
}  


















/*
 public static int binarysearch(int x, int leftend, int rightend ){
 if(leftend>rightend){
 return -1;
 }
 
 int mid = (leftend + rightend)/2;
 if(x== a[mid]){
 return mid;
 }else if( x>a[mid]){
 return binarysearch(x, mid+1,rightend);
 }else if(x<a[mid]){
 return binarysearch(x, leftend, mid-1);
 }
 return -1;
 
 
 }
 public static void binarynumber(int x){
 int remainder = x%2;
 if(x!=0){
 binarynumber(x/2);
 System.out.print(remainder + " ");
 }
 }
 }
 class Node{
 public Object element;
 public Node next;
 
 public Node(Object e, Node n){
 element =e ;
 next = n;
 
 }
 public void insert (Object val, head){
 Node mn = new Node (val, null);
 if(head ==null){
 
 }
 }
 
 }*/




