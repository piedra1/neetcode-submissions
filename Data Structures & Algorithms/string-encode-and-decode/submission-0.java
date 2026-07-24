class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        strs.forEach(s -> str.append(s.length()).append("#").append(s));
        return str.toString();
    }

    public List<String> decode(String s) {
    List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            // Find the delimiter '#'
            int delimiterIndex = s.indexOf('#', i);
            
            // Read length prefix
            int length = Integer.parseInt(s.substring(i, delimiterIndex));
            
            // Start of the actual string
            i = delimiterIndex + 1;
            
            // Read exact 'length' characters
            String str = s.substring(i, i + length);
            result.add(str);
            
            // Move pointer past the extracted string
            i += length;
        }

        return result;

    }
}
