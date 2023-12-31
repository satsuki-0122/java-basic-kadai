package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		boolean[] primeJudge = new boolean[101];
		for( int i = 1; i < primeJudge.length; i++) {
			primeJudge[i] = true;
		}
		
		int numberDivided = 2;
		while (numberDivided < primeJudge.length) {
			// その数でしか割り切れないか判定し、素数を求める
			for (int i = numberDivided + 1; i < primeJudge.length; i++) {
				// その数以外で割り切れる場合、素数ではない
				if (i % numberDivided == 0) {
					primeJudge[i] = false;
	                          continue;
				}
			}

			numberDivided += 1;
		}
		for (int i = 2; i < primeJudge.length; i++) {
			if (primeJudge[i]) {
				System.out.println(i);
		     }
	     }
     }
}



