package edu.sidnei;

public class ExcessoesCustomizadas {


    public static void main(String[] args) {

        try{String cepFormatado = formatarCep("23765064");
        }catch (CepInvalido e){
           System.out.println("O cep não corresponde a regra de negócio");
        }
    }
    static String formatarCep(String cep) throws CepInvalido{
        if(cep.length() != 8)
            throw new CepInvalido();

        //simulando cep formatado
        return "23.765-064";
    }
}
