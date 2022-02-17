package autoIndustryTkachova;

public enum ModelList {
    X1 ("X1"),
    X2 ("X2"),
    X3 ("X3"),
    X4 ("X4"),
    X5 ("X5"),
    X6 ("X6"),
    X7 ("X7"),
    GRANCOPE ("Gran Coupe"),
    ;
    private final String model;

    ModelList(String model) {
        this.model = model;

    }

    public String getModel() {
        return model;
    }
}
