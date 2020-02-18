public class Client{
    public static void main(String[] args){
        int[] arr= {10,20,30,40,50,60,70,80,90,100,110,120};
        BinarySearchTrees bst=new BinarySearchTrees(arr);
        bst.display();
        // System.out.println(bst.size());
        // System.out.println(bst.max());
        // System.out.println(bst.find(77));

        bst.postOrder();        
    }
}