public enum Name {
    John, Emma, Oliv, Avai, Isabe, Sophi, Robin, Doee, Smith, Johnso;

    static public Name getName(int value){
        if(value==1){
            return Name.John;
        }
        else if(value==2){
            return Name.Emma;
        }
        else if(value==3){
            return Name.Oliv;
        }
        else if(value==4){
            return Name.Avai;
        }
        else if(value==5){
            return Name.Isabe;
        }
        else if(value==6){
            return Name.Sophi;
        }
        else if(value==7){
            return Name.Robin;
        }
        else if(value==8){
            return Name.Doee;
        }
        else if(value==9){
            return Name.Smith;
        }
        else{
            return Name.Johnso;
        }

    }
}
