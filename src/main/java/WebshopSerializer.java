import java.io.*;
import java.util.List;

public class WebshopSerializer {
    public void SerializeAnimals(List<Animal> animals) {
        try (FileOutputStream fileOut = new FileOutputStream( "C:/Users/Remco Scheffer/IdeaProjects/animal shelter FX/src/main/java/serialized/animals.ser")) {
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(animals);
            out.close();
        } catch (IOException i) {
            System.console().printf(i.getMessage());
        }
    }
    public List<Animal> ReadAnimals() {
        List<Animal> animals = null;
        File testFile = new File("C:/Users/Remco Scheffer/IdeaProjects/animal shelter FX/src/main/java/serialized/animals.ser");
        if(testFile.exists()) {
            try(FileInputStream fileIn = new FileInputStream("C:/Users/Remco Scheffer/IdeaProjects/animal shelter FX/src/main/java/serialized/animals.ser")) {
                ObjectInputStream in = new ObjectInputStream(fileIn);
                animals = (List<Animal>) in.readObject();
                in.close();

            } catch(Exception e) {
                System.console().printf(e.getMessage());
            }
        }

        return animals;
    }
}
