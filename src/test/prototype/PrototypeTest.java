package test.prototype;

import com.company.prototype.Coordinate;
import com.company.prototype.MaterialTree;
import com.company.prototype.RoboticTree;
import com.company.prototype.Tree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrototypeTest {

    @Test
    public void givenMaterialTreePrototypeThenCreateClone(){
        //initialize
        double height = 15;
        double weight = 2.0;
        Coordinate coordinate = new Coordinate(10,20);
        Coordinate otherCoordinate = new Coordinate( 20, 30);

        MaterialTree materialTree = new MaterialTree(height, weight);
        materialTree.setCoordinate(coordinate);
        MaterialTree otherMaterialTree = (MaterialTree) materialTree.copy();
        otherMaterialTree.setCoordinate(otherCoordinate);

        assertEquals(coordinate, materialTree.getCoordinate());
        assertEquals(otherCoordinate, otherMaterialTree.getCoordinate());
    }


    @Test
    public void givenRoboticTreePrototypeThenCreateClone(){
        //initialize
        double height = 15;
        double weight = 2.0;
        Coordinate coordinate = new Coordinate(10,20);
        Coordinate otherCoordinate = new Coordinate( 20, 30);

        RoboticTree roboticTree = new RoboticTree(height, weight);
        roboticTree.setCoordinate(coordinate);
        RoboticTree otherRoboticTree = (RoboticTree) roboticTree.copy();
        otherRoboticTree.setCoordinate(otherCoordinate);

        assertEquals(coordinate, roboticTree.getCoordinate());
        assertEquals(otherCoordinate, otherRoboticTree.getCoordinate());


    }



}