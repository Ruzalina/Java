public class backAround {
    public static void main(String[] args) {
        String str = "assasin";
            // Get the last char
            String last = str.substring(str.length() - 1);
        System.out.println( last + str + last);
        }
    }

//Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

