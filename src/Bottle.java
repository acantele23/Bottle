public class Bottle {

    private float CurrentFill = 0;
    private float out;
    private float size;

    public Bottle(float Size)
    {
        size=Size;
    }
    public void getCurrentFillAmount()
    {
        System.out.println(CurrentFill);
    }
    public void fill(float atmpt)
    {

            CurrentFill = CurrentFill + atmpt;
            for(float i = CurrentFill; i>size;i--)

            {
                CurrentFill = CurrentFill - 1;
            }





    }
    public void pour(float out)
    {
        if(CurrentFill>0)
        {
            CurrentFill = CurrentFill - out/2;
        }
    }


}



