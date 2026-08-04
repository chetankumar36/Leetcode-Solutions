class Solution {
    public boolean isIsomorphic(String s, String t) {
        
           // Arrays to store the last seen position of each character
        int[] m1 = new int[256];
        int[] m2 = new int[256];

        // Traverse both strings
        for (int i = 0; i < s.length(); i++) {

            // If previous occurrences are different,
            // strings are not isomorphic
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) {
                return false;
            }

            // Store current position (+1 because default value is 0)
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }

        return true;
    }
    }
