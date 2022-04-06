package peaksoft;

public class Computer implements Sides {

    @Override
    public int randomCube() {
        int cube1 = Sides.super.randomCube();
        int cube2 = Sides.super.randomCube();
        return cube1 + cube2;
    }

}
