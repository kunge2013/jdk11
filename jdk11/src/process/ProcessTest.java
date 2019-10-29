package process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.ZoneId;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessTest {
	public static void main(String[] args) throws IOException {
		 ProcessBuilder pb = new ProcessBuilder("echo", "Hello World!");
		    String na = "<not available>";
		    Process p = pb.start();
		    ProcessHandle.Info info = p.info();
		    System.out.printf("Process ID: %s%n", p.pid());
		    System.out.printf("Command name: %s%n", info.command().orElse(na));
		    System.out.printf("Command line: %s%n", info.commandLine().orElse(na));
		    
		    System.out.printf("Start time: %s%n",
		      info.startInstant().map(i -> i.atZone(ZoneId.systemDefault())
		                                    .toLocalDateTime().toString())
		                         .orElse(na));
		    
		    System.out.printf("Arguments: %s%n",
		      info.arguments().map(a -> Stream.of(a)
		                                      .collect(Collectors.joining(" ")))
		                      .orElse(na));
		  
		    System.out.printf("User: %s%n", info.user().orElse(na));
	}
	}
