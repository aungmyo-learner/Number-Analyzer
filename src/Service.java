public class Service {
	private final int min = -1_000_000;
	private final int max = 1_000_000;
	public Result analyzeNumber(int number) {
		if(!haveRange(number)) {
			return Result.invalid("Out Of Range..");
		}
		NumberAnalyze analyzer = new NumberAnalyze(number);
		Result result = analyzer.analyze();
		return result;
	}
	private boolean haveRange(int number) {
		return min <= number && max >= number;
	}
}
