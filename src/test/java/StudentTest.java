import static java.util.Arrays.asList;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

        Student student = new Student(12341, "Pops");

    @Test
    public void testName( ){
        assertEquals("Pops", this.student.getName());
    }

    @Test
    public void testGrades( ){
        this.student.addGrade(80);
        this.student.addGrade(90);
        this.student.addGrade(100);
        List<Integer> categories = asList(80, 90, 100);
        assertEquals(this.student.getGrades(), categories);
    }
    @Test
    public void testGettingStudentID( ){
        assertEquals(12341, this.student.getId());
    }
    @Test
    public void testAverage( ){
        this.student.addGrade(80);
        this.student.addGrade(90);
        this.student.addGrade(100);
        assertEquals(90, this.student.getGradeAverage(),0.1);
    }

}
