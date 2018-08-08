package aula3;

/**
 *
 * @author gustavo.miorando
 */
public class JsonTree {

    public static void preorder(Node n) {
        // 1 - visita o Node
        System.out.println(n.element);
        // 2 - Visitar o Node a esquerda com recursao
        if (n.left != null) {
            preorder(n.left);
        }
        // Visitar o Node a direita
        if (n.right != null) {
            preorder(n.right);
        }
    }

    public static String serialize(Node n) {
        if (n == null) {
            return "null";
        }
        StringBuilder ser = new StringBuilder();
        ser.append("[");
        ser.append("\"" + n.element + "\"");
        ser.append(",");
        ser.append(serialize(n.left) + ",");
        ser.append(serialize(n.right));
        ser.append("]");
        return ser.toString();
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree("+");
        Node a = tree.getRoot();

        Node b = tree.addLeftChild(a, "*");
        Node c = tree.addrightChild(a, "-");
        Node d = tree.addLeftChild(b, "+");
        Node e = tree.addrightChild(b, "5");
        Node f = tree.addLeftChild(c, "8");
        Node g = tree.addrightChild(c, "*");
        tree.addLeftChild(d, "1");
        tree.addrightChild(d, "4");
        tree.addLeftChild(g, "3");
        tree.addrightChild(g, "7");

        System.out.println(serialize(a));
    }
}
