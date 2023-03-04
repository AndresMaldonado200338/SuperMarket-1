package model;


public enum Categories {

    FRUITS(1, "Frutas", "Categoria donde se almacenan las frutas"),
    VEGETABLES(2, "Vegetales", "Categoria donde se almacenan las verduras"),
    MEAT(3, "Carnes", "Categoria donde se almacenan las carnes"),
    DAIRY(4, "Lacteos", "Categoria donde se almacenan los lacteos"),
    DRINKS(5, "Bebidas", "Categoria donde se almacenan las bebidas"),
    CLEANING(6, "Limpieza", "Categoria donde se almacenan los productos de limpieza"),
    PERSONAL_CARE(7, "Cuidado Personal", "Categoria donde se almacenan los productos de cuidado personal"),
    CANNED(8, "Enlatados", "Categoria donde se almacenan los productos enlatados"),
    PACKAGED(9, "Empaquetados", "Categoria donde se almacenan los productos empaquetados");

    private int id;
    private String name;
    private String description;


    Categories(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Categoria #" + id + ": " + name + " - " + description + ".";
    }
}
