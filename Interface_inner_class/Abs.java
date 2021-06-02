// For this challenge, create an abstract class to define items that can be stored in a tree.
// The class should contain 2 references to items which will represent the next and previous
// items (in the case of a linked tree).
// I.e., if you call your abstract class ListItem, then it would have 2 member variables of
// type ListItem that will hold references to the next/right and previous/left ListItems.
//
// The abstract class will also need to hold a value - try to be as flexible as possible
// when defining the type of this value.
//
// The class will also need methods to move to the next item and back to the previous item,
// and methods to set the next and previous items.
//
// You should also specify a compareTo() method that takes a parameter of the same type as the
// class and returns 0 if the values are equal, greater than zero if the value sorts greater than
// the parameter and less than zero if it sorts less than the parameter.
//
// Create a concrete class from your abstract tree item class and use this in a LinkedList
// class to implement a linked tree that will add items in order (so that they are sorted
// alphabetically). Duplicate values are not added.
//
// Note that you are creating your own LinkedList class here, not using the built-in Java one..
//
// The rules for adding an item to the linked tree are:
//  If the head of the tree is null, make the head refer to the item to be added.
//  If the item to be added is less than the current item in the tree, add the item before the
//      current item (i.e., make the previous item's "next" refer to the new item, and the new item's
//      "next" refer to the current item).
//  If the item to be added is greater than the current item, move onto the next item and compare
//      again (if there is no next item then that is where the new item belongs).
//
// Care will be needed when inserting before the first item in the tree (as it will not have a previous
// item).
//



public class Abs {

    public static void main(String[] args) {


        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());
        // Create a string data array to avoid typing loads of addItem instructions:
        String stringData = "5 7 3 9 8 2 1 0 4 6";
//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";


        String[] data = stringData.split(" ");
        for (String s : data) {
            tree.addItem(new Node(s));
        }


        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("8"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
    }
}
