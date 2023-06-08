public enum Gender {
    MALE,
    FEMALE;

    static public Gender fromValue(int value) {
        if (value == 0) {
            return Gender.MALE;
        } else {
            return Gender.FEMALE;
        }
    }
}
