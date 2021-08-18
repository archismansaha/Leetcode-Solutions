class Solution {
    public boolean checkIfPangram(String sentence) {
          Boolean[] b = new Boolean[26];
        Arrays.fill(b,false);

        for(int i=0; i<sentence.length(); i++){
            b[sentence.charAt(i)-97]=true;
        }

        for(int j=0; j<b.length; j++){
            if (b[j]==false){
                return false;
            }
        }
        return true;
    }
}
