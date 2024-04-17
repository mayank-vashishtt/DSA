import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class TrieNode{
    HashMap<Character,TrieNode> map;
    boolean isEnd;
    int frequency;

    public TrieNode(){
        map = new HashMap<Character,TrieNode>();
        isEnd = false;
    }

}



class tries{


    // crawler -- scrapping data of a website 
    // check wht is hash score in java
    // why we are studying tries 
    // TrieNode --  use via hashmap  tc -- O(N)


    /*StringBuilder sb = new StringBuilder();

sb.append("Hello"); // Append a string
sb.append(" ");
sb.append("World");

sb.insert(5, ", "); // Inserting at specific index

sb.replace(6, 11, "Java"); // Replacing substring

sb.delete(11, 13); // Deleting characters

String result = sb.toString(); // Convert StringBuilder to String

System.out.println(result); // Output: Hello, Java
 */


      


    public static TrieNode insert(String word, TrieNode root) {
        // algo to insert in tries 
        TrieNode curr = root;
        // for (char ch : word.toCharArray()) 
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            // current.map.putIfAbsent(ch, new TrieNode());
            if (!curr.map.containsKey(ch)) {
                curr.map.put(ch, new TrieNode());
            }
            curr = curr.map.get(ch);
            curr.frequency++;
        }
        curr.isEnd = true;
        return root; // Return the updated root after insertion
    }

    public static boolean search(TrieNode root, String word){
        // algo to search in a tries
        TrieNode curr = root;
        for(int i = 0 ; i<word.length() ; i++){
            char ch = word.charAt(i);
            if( ! curr.map.containsKey(ch)){
                return false;
            }
            curr = curr.map.get(ch);
        }

        return curr.isEnd;
    }
    

    // give the shortest unique perfix 
    public static String[] prefix(String[] A){
        TrieNode root = new TrieNode();
        ArrayList<String> result = new ArrayList<>();

        // insert each word intro a trie
        for(String word : A){
            insert(word, root);
        }

        // for the shortest unique prefix of each word
        for(String word : A){
            result.add(findshortUniquePrefix(root, word));
        }

        return result.toArray(new String[0]);
        

    }

    public static String findshortUniquePrefix(TrieNode root , String word){
        TrieNode curr = root;
        StringBuilder prefix = new StringBuilder();

        

        for(char ch : word.toCharArray()){
            
            prefix.append(ch);
            curr = curr.map.get(ch);

            if(curr.frequency == 1){
                break;
            } 
        }

        return prefix.toString();

    }


    


    public static void main(String[] args) {
        
    }
     
}


