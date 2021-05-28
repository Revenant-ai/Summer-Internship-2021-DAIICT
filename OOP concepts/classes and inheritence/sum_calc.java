public class sum_calc{
    public static void main()
    {
        sum_calc calculator = new sum_calc();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double num)
    {
        firstNumber=num;
    }

    public void setSecondNumber(double num)
    {
        secondNumber=num;
    }
    public double getAdditionResult()
    {
        return getFirstNumber() + getSecondNumber();
    }
    public double getSubtractionResult()
    {
        return getFirstNumber() - getSecondNumber();
    }
    public double getMultiplicationResult()
    {
        return getFirstNumber() * getSecondNumber();
    }
    public double getDivisionResult ()
    {
        if(secondNumber == 0){
            return 0;
        }
        else{
            return getFirstNumber() / getSecondNumber();
        }
    }
}

/*
    getAdditionResult
    getSubtractionResult
    getMultiplicationResult
    getDivisionResult 
*/