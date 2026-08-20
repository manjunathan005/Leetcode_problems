class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int count=0;
        int can = capacity;
        for(int j=0;j<plants.length;j++){
        if(plants[j]>can){
            count += (j*2);
            can = capacity;
        }
        can -=plants[j];
        count++;
        }
        return count;
    }

}