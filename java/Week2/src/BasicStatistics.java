import org.junit.platform.console.shadow.picocli.CommandLine.MaxValuesExceededException;

public class BasicStatistics
{
    public static int GetSum(int[] n)
    {
        // todo: do your magic here! :)
    	
    	for (int i=0;i<n.length;i++) {
    		
    	System.out.println(n[i]);

       
         }
         return 0;
    }

    public static double GetMean(int[] n)
    {
        // todo: do your magic here! :)
        double sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }

        return sum / n.length;
    }

    public static double GetMedian(int[] n)
    {
        // todo: do your magic here! :)
        int middle = n.length/2;
        if (n.length % 2 == 1) {
            return n[middle];
        
        } else {

            return (n[middle-1] + n [middle])/2.0;
        
        }
    }

    public static int GetMode(int[] n)
    {
        // todo: do your magic here! :)
        

        return 0;
    }
    
    public static int GetMaxValue(int[] n)
    {
        // todo: do your magic here! :)
        int MaxValue= n [0];
        for(int i=1; i< n.length; i++){
            if(n[i] > MaxValue){
                MaxValue = n[i];
            }

            }
        return MaxValue;
        }
    }

