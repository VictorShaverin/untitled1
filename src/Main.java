public class Main {
    public static void main(String[] args) {
    double U=bodyenergy(6,8.31);
        System.out.println(U);
    double I=power(65,8.31);
        System.out.println(I);
    double R=resist(65,6);
        System.out.println(R);
    }

    /**
     * Вычисление внутренней энергии тела
     * @param I сила тока ,А
     * @param R сопротивление тока ,ОМ
     * @return Возращает значение внутренней энергии тела
     */
    public static double bodyenergy (double I,double R){return I*R;}

    /**
     * Вычисление силы тока
     * @param U Внутреняя энергия тока ,А
     * @param R сопротивление тока ,ОМ
     * @return Возращает значение силы тока
     */
    public static double power (double U,double R){return U/R;}

    /**
     * Вычисление сопротивления
     * @param U Внутреняя энергия тока ,А
     * @param I сила тока ,А
     * @return Возращает значение сопротивления
     */
    public static double resist (double U,double I){return U/I;}
}