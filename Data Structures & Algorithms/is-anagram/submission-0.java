class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap();
        HashMap<Character, Integer> tmap = new HashMap();

        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();
        if( sArray.length != tArray.length ){
            return false;
        }

        for( int i=0; i < tArray.length; i++ ){
            if(smap.containsKey(sArray[i])){
                smap.put(sArray[i], smap.get(sArray[i])+1);
            }
            else if(!smap.containsKey(sArray[i])){
                smap.put(sArray[i], 0);
            }
            if(tmap.containsKey(tArray[i])){
                tmap.put(tArray[i], tmap.get(tArray[i])+1);
            }
            else if(!tmap.containsKey(tArray[i])){
                tmap.put(tArray[i], 0);
            }

        }
        if( smap.equals(tmap)){
            return true;
        }
       return false;

    }
}

