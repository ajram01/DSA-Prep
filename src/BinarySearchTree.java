public class BinarySearchTree {

    Node root;

    public BinarySearchTree(){
        root = null;
    }

    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value){

            this.value = value;

        }
    }


    public boolean insert(int value){

        Node newNode = new Node(value);

        if (root == null){
            root = newNode;
            return true;
        }

        Node temp = root;

        while (true){

            if (newNode.value == temp.value) return false;

            if (newNode.value > temp.value){
                if (temp.right == null){
                    temp.right = newNode;
                    return true;
                } else {
                    temp = temp.right;
                }
            } else {
                if (temp.left == null){
                    temp.left = newNode;
                    return true;
                } else {
                    temp = temp.left;
                }
            }
        }

    }

    public boolean contains(int value){
        Node temp = root;

        while (temp != null){

            if (temp.value == value) return true;

            if (value > temp.value){
                temp = temp.right;
            } else {
                temp = temp.left;
            }

        }
        return false;

    }

}
