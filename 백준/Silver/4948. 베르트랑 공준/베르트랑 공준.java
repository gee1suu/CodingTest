import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// StringTokenizer st = new StringTokenizer(br.readLine());

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;

			boolean[] prime = new boolean[2 * n + 1];
			prime[0] = prime[1] = true;

			for (int i = 2; i <= Math.sqrt(prime.length); i++) {
				if (prime[i])
					continue;
				for (int j = i * i; j < prime.length; j += i) {
					prime[j] = true;
				}
			}

			int cnt = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				if (!prime[i])
					cnt++;
			}

			bw.write(cnt + "\n");
		}

		bw.flush();

	}
}