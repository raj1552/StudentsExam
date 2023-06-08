public enum Name {
    John, Emma, Olivia, Ava, Isabella, Sophia, Robin, Doe, Smith, Johnson;

    static public Name getName(int value){
        if(value==1){
            return Name.John;
        }
        else if(value==2){
            return Name.Emma;
        }
        else if(value==3){
            return Name.Olivia;
        }
        else if(value==4){
            return Name.Ava;
        }
        else if(value==5){
            return Name.Isabella;
        }
        else if(value==6){
            return Name.Sophia;
        }
        else if(value==7){
            return Name.Robin;
        }
        else if(value==8){
            return Name.Doe;
        }
        else if(value==9){
            return Name.Smith;
        }
        else{
            return Name.Johnson;
        }

    }
}
