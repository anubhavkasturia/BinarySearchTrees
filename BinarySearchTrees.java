public class BinarySearchTrees{
    private class Node{
        int data;
        Node left;
        Node right;

     Node(int data,Node left,Node right){ 
        this.data=data;
        this.left=left;
        this.right=right;
    }
}
    private Node root;
    private int size;


public BinarySearchTrees(int[] arr){
    this.root=construct(arr,0,arr.length-1);
    this.size=size(this.root);
}
private Node construct(int[]arr,int start,int end){
    if(start>end){
        return null;
    }
    int mid=(start+end)/2;
    Node node=new Node(arr[mid], null, null);
    
    node.left=construct(arr, start, mid-1);
    node.right=construct(arr, mid+1, end);
    
    return node;
}
public void display() {
    display(this.root);
}

private void display(Node node) {
   if (node == null) {
       return;
   }
   String str = " ";
   str += node.left != null ? node.left.data : ".";
   str += "->" + node.data + "<-";
   str += node.right != null ? node.right.data : ".";
   System.out.println(str);

   display(node.left);
   display(node.right);
}
  public int size(){
      return size(this.root);
  }
  public int size(Node node){
    if(node==null){
        return 0;
    }
    int lsize=size(node.left);
    int rsize=size(node.right);
    return lsize+rsize+1;

}
public int height() {
    return this.height(this.root);
 }

  public int height(Node node){
    if(node==null){
        return 0;
    }
  int lheight=height(node.left);
  int rheight=height(node.right);
  return (Math.max(lheight, rheight)+1);
}
public int max() {
    return max(this.root);
}

  private int max(Node node){
   
    while(node.right!=null){
        
        node=node.right;
   
    }
    return node.data;
}
    public boolean find(int findelem){
        return find(this.root, findelem);
    }
    public boolean find(Node node,int finde){
        if(node==null){
            return false;
        }
        if(node.data==finde){
            return true;

        }else if(finde>node.data){
            boolean rightfind=find(node.right, finde);
            return rightfind;
        }else if (finde<node.data){
            boolean leftfind=find(node.left, finde);
            return leftfind;
        }else{
        
        return false;
        }
  }
  public int min() {
    return min(this.root);
}

  private int min(Node node){
   
    while(node.left!=null){
        
        node=node.left;
   
    }
    return node.data;
}
public void preOrder(){
    preOrder(this.root);
}
private static void preOrder(Node node){
    if(node==null){
        return;
    }
    System.out.println(node.data);
    preOrder(node.left);
    preOrder(node.right);
    
}
public void inOrder(){
    inOrder(this.root);
}
private static void inOrder(Node node){
    if(node==null){
        return;
    }
    
    inOrder(node.left);
    System.out.println(node.data);
    inOrder(node.right);
    
}
public void postOrder(){
    postOrder(this.root);
}
private static void postOrder(Node node){
    if(node==null){
        return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.println(node.data);

}

}