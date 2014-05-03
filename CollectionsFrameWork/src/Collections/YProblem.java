package Collections;


import java.util.Hashtable;



public class YProblem {
public static class ListElement 
{
ListElement next;
Object data;
public ListElement(Object data)
{
this.data=data;
}
}
public static void main(String args[])
{
new YProblem().run();
}
ListElement head=null;
ListElement tail =null;
public void run()
{
//head = new ListElement(10);
insert(head,10);
insert(head,11);
insert(head,12);
insert(head,13);
display(head);
delete(head,13);
insert(head,14);
insert(head,15);
display(head);
ListElement nthlast = NthToLast(head, 4);
if(nthlast!=null)
{
System.out.println(" Data corresponding to nth - to - last = " +nthlast.data);
}
else
{
System.out.println(" data is null");
}
deleteNode(12);
display(head);
insert(head,17);
insert(head,14);
insert(head,17);
insert(head,17);
display(head);
deleteDups1(head);
System.out.println(" After deleting duplicate elements.. cool.. ");
display(head);
//for adding two linked list
ListElement head1= new ListElement(3);
ListElement head2= new ListElement(5);
//insert(head1,3);
insert(head1,1);
insert(head1,5);
//insert(head2,5);
insert(head2,9);
insert(head2,2);
insert(head2,4);
System.out.println(" The first list elements are as follows...");
display(head1);
System.out.println(" The second list elements are as follows...");
display(head2);
ListElement sumlist =addlist(head1,head2,0);
System.out.println(" The sum of two lists is as follows .. ");
display(sumlist);
ListElement loop =null;
System.out.println(" Checking the beginning of loop in linked list");
loop = FindBeginning(head);
if(loop==null)
{
System.out.println(" There is no loops in the linked list..");
}
else
{
int loopdata= (Integer) loop.data;
System.out.println(" Beginning of loop = "+loopdata);
}
}
//code for inserting data
public void insert(ListElement node, Object data)
{
if(node==null)
{
head =new ListElement(data);
}
else
{
while(node.next!= null)
{
node=node.next;
}
ListElement node1 = new ListElement(data);
node.next=node1;
}
System.out.println(" Inserted " +data);
}
//end of code for inserting data
//code for displaying data
public void display(ListElement node)
{  
System.out.println();
System.out.println(" Displaying data...");
while(node.next!=null)
{
System.out.println (" Data - "+node.data);
node=node.next;
}
System.out.println (" Data - "+node.data);
}
//end of code for display
//code for deleting data
public void delete(ListElement node, Object data)
{
if(node.data == data)
{
head=head.next;
return;
}
else
{
while(node.next!=null)
{
if(node.next.data==data)
{
node.next=node.next.next;
}
else
{
node=node.next;
}
}
return;
}
}

//end of code for deleting
//code for nth to last

public ListElement NthToLast(ListElement node, int n)
{
if(head==null|| n<1)
{
return null;
}
ListElement p1 =head;
ListElement p2=head;
for(int j=0;j<n-1;j++)
{
if(p2==null)
{
return null;
}
p2=p2.next;
}
if(p2==null)
{
return null;
}
while(p2.next!= null)
{
p2=p2.next;
p1=p1.next;
}
return p1;
}

//end of code for nth to last
//code for deletenode

public void deleteNode(Object data)
{ 
ListElement node=head;
if(node.data==data)
{
head=node.next;
}
else
{
while(node.next!=null)
{
if(node.next.data==data)
{
node.next=node.next.next;
}
else
{
node=node.next;
}
}
return;
}
}

//end of code for deletenode

//for deleting duplicate elements

public static void deleteDups(ListElement node)
{
Hashtable<Object, Boolean> table =new Hashtable<Object, Boolean>();
ListElement previous =null;
while(node!=null)
{
if(table.containsKey(node.data))
{
previous.next=node.next;
}
else
{
table.put(node.data, true);
previous=node;
}
node=node.next;
}
}

//end of code for deleting dups..

//start of code for deleting dups without additional space 

public static void deleteDups1(ListElement node)
{
if(node == null)
{
return;
}
ListElement previous = node;
ListElement current = node.next;
while(current != null)
{
ListElement runner= node;
while(runner!= current)
{
if(runner.data==current.data)
{
  ListElement cool = current.next;
  previous.next=cool;
  current=cool;
  break;
}
runner=runner.next;
}
if(runner==current)
{
previous=current;
current =current.next;
}
}
}
//end of deleteDups1

//code for adding two linked lists

public ListElement addlist(ListElement node1, ListElement node2, int carry)
{
ListElement result = null;
int bal =0;
while((node1 != null) || (node2 != null))
{
int value = 0;
value = value+bal;
if(node1!=null)
{
value= value+ (Integer) (node1.data);
node1=node1.next;
}
if(node2!=null)
{
value= value+ (Integer) (node2.data);
node2 =node2.next;
}
if(value >= 10)
{
value =value%10;
bal=1;
}
else
{
bal=0;
}
if(result==null)
{
result=new ListElement(value);
}
else
{
insert(result,value);
}
}
return result;
}

//end of code for addlists

//function for finding the beginning of a loop

public ListElement FindBeginning(ListElement node)
{
ListElement node1=node;
ListElement node2 = node;
while(node2.next!=null)
{
node1=node1.next;
node2 =node2.next.next;
if(node1==node2)
{
break;
}
}//while
if(node2.next==null)
{
return null;
}
node1=head;
while(node1!=node2)
{
node1=node1.next;
node2=node2.next;
}
return node2;
}

}
