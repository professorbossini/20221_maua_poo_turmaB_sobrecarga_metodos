public class Calculadora{
    //tipo de retorno
    //nome
    //lista de parâmetros
    //corpo
    //isso é a definição de um método
    

    public float somar(float a, float b){
        return a + b;
    }

    

    public int somar (String a, int b){
        return Integer.parseInt(a) + b;
    }

    public int somar (int a, String b){
        return a + Integer.parseInt(b);
    }

    //varargs (existe a partir da versão 5 do Java)
    //syntax sugar
    public int somar (int a, int b, int... valores){
        //valores = 2, 5, 4
        //for each (enhanced for)
        int soma = a + b;
        for (int v : valores){
            soma += v;
        }
        return soma;
    }

    public int somar(int a, int b){
        int res = a + b;
        return res;
    }

    public double somar (int x, int y){
        return x + y;
    }

    // public int somar (int x, int y){
    //     return x + y;
    // }

    public int somar (int a, int b, int c){
        return a + b + c;
    }




    // public void somar (int a, int b){
    //     int res = a + b;
    //     System.out.println(res);
    // }
}