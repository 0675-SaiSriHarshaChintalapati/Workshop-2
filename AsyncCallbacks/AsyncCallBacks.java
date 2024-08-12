package AsyncCallbacks;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
public class AsyncCallBacks {
    public static void main(String[] args) {
        CompletableFuture<String> future = new CompletableFuture<>();
        CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(1000);
                throw new RuntimeException("Something went wrong!");
               //future.complete("Task completed successfully!");
            } catch (InterruptedException | RuntimeException e) {
                future.completeExceptionally(e);
            }
        });
        future.exceptionally(ex -> {
            System.out.println("Caught exception: " + ex.getMessage());
            return null;
        });
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.getStackTrace();
        }
    }
}



