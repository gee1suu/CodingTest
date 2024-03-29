import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[26];
		Arrays.fill(arr, -1);

		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			int num = str.charAt(i) - 97;
			if (arr[num] == -1)
				arr[num] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			bw.write(arr[i] + " ");
		}

		bw.flush();

	}

}
