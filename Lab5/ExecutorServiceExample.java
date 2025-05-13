import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample 
{
    private static final Random PRNG = new Random();

    private static class Result 
    {
       private final int wait;
       public Result (int code)
       {
        this.wait = code;
       }
    }

    public static Result compute(Object obj) throws InterruptedException {
        int wait = PRNG.nextInt(3000);
        Thread.sleep(wait);
        return new Result(wait);
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException 
    {
        List<Object> objects = new ArrayList<Object>();
        for (int i = 0; i < 25; i++) 
        {
            objects.add(new Object());
        }
        List<Callable<Result>> tasks = new ArrayList<Callable<Result>>();
        for (final Object object : objects) 
        {
            <Callable<Result>
        }
    }
}