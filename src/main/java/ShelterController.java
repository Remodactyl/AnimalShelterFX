import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;


public class ShelterController implements Observer {
    @FXML public Button AddAnimalButton;
    @FXML public Button ReserveButton;
    @FXML public RadioButton MaleButton;
    @FXML public RadioButton FemaleButton;
    @FXML private ListView<Animal> AnimalsListView;
    @FXML public TextField NameField;
    @FXML public TextField BadHabitsField;
    @FXML public TextField ReserveNameField;
    @FXML public ChoiceBox<String> SpeciesBox;
    @FXML public ToggleGroup gender;
    private WebShop webShop;
    private WebshopSerializer serializer = new WebshopSerializer();

    @FXML public void initialize() {
        webShop = new WebShop();
        webShop.Attach(this);
        SpeciesBox.getItems().add("Cat");
        SpeciesBox.getItems().add("Dog");
        List<Animal> storedAnimals = serializer.ReadAnimals();
        if(storedAnimals != null) {
            webShop.animals = storedAnimals;
        }
        Update();
    }
    public void Update() {

        AnimalsListView.getItems().clear();
        for (Animal animal : webShop.animals) {
            AnimalsListView.getItems().add(animal);
        }
    }
    public void AddAnimalButtonClick(ActionEvent actionEvent) {
        String species = (String) SpeciesBox.getValue();
        String name = NameField.getText();
        Gender selectedGender;
        if(gender.getSelectedToggle() == MaleButton) {
            selectedGender = Gender.Male;
        } else {
            selectedGender = Gender.Female;
        }

        if(species.equals("Cat")) {
            String badHabits = BadHabitsField.getText();
            Cat cat = new Cat(name, selectedGender, badHabits);
            webShop.AddAnimal(cat);
        } else if(species.equals("Dog")) {
            Dog dog = new Dog(name, selectedGender);
            webShop.AddAnimal(dog);
        }
        serializer.SerializeAnimals(webShop.animals);
    }

    public void ReserveButtonClick(ActionEvent actionEvent) {
        Animal animal = AnimalsListView.getSelectionModel().getSelectedItem();
        String reservator = ReserveNameField.getText();
        if(reservator != null && !reservator.isBlank()) {

            webShop.ReserveAnimal(animal, reservator);
        }
        serializer.SerializeAnimals(webShop.animals);
    }
}
