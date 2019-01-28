public class SecurityAgent {
	private Combination secret;
	private DoorLock mydoor;

	public SecurityAgent() {
		java.util.Random generator;
		generator = new  java.util.Random();

		int first, second, third;

		first = generator.nextInt(5) + 1;
		second = generator.nextInt(5) + 1;
		third = generator.nextInt(5) + 1;

		secret = new Combination(first, second, third);
		mydoor = new DoorLock (secret);
	}

	public DoorLock getDoorLock() {
		return mydoor;
	}

	public void activateDoorLock() {
		mydoor.activate(secret);
	}
}