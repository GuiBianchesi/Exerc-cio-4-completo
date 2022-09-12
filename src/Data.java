class Data {
    int dia;
    int mes;
    int ano;

    Data(){

    }

    Data(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }
    
    void cadastraDados(){
        System.out.println("Data cadastrada:");
    }

    void imprimeData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}