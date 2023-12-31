/*You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane. */

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

        int x0 = coordinates[0][0], y0 = coordinates[0][1];
        int x1 = coordinates[1][0], y1 = coordinates[1][1];
        int dx = x1 - x0;
        int dy = y1 - y0;
        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0], y = coordinates[i][1];
            if (dy * (x - x0) != dx * (y - y0))
                return false;
        }
        return true;

    }
}