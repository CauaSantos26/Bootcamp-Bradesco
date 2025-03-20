package org.example;

public class comentarios {

    // ola sou um comentario em uma linha

    /* Olá,
     * Eu sou um comentario
     * que posso ser mais detalhadod
     * quando necessário
     */

    /**
     * Estas duas estrelinhas acima
     * é para identificar que você
     * pretende elaborar um comentário
     * a nível de documentação.
     * Que incrível !!!
     */


    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M= multiplicação
            r= n * x;
        }else{
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }


}
