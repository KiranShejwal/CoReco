public class TeamworkTileTactics {
    public static void main(String[] args) {

        possibleBonus(3,7);
        possibleBonus(1,9);
        possibleBonus(5,3);
    }
    public static void possibleBonus(int myTile,int friendTile)
    {
        int myTileMin = myTile+1;
        int myTileMax = myTile+6;

        int friendTileMin = friendTile+1;
        int friendTileMax = friendTile+6;

        if(myTileMin <= friendTileMax && friendTileMin <= myTileMax && myTile != friendTile)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
