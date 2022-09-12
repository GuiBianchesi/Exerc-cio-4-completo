class Triangulo {
    float base;
    float altura;

    Triangulo(){

    }

    Triangulo(float b, float a){
        base = b;
        altura = a;
    }
    
    float calculaArea(){
        System.out.println((base*altura)/2);
        return base;
    }

    String imprimeDados(){
        return "Base: " + base + " Altura: " + altura;
    }
}