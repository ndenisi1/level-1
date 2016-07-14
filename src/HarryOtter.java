

	public class HarryOtter {

		private boolean cloakOn;
		
		HarryOtter() {
			System.out.println("making Harry Potter...");
		}

		void castSpell(String spell){
	System.out.println("casting spell: " + spell);
		}

		void makeInvisible(boolean invisible) {
			this.cloakOn = invisible;
			
			if (cloakOn)
				System.out.println("Harry is invisible");
			else
				System.out.println("Harry is visible");
		}

		void spyOnSnape() {
			System.out.println("Harry sees Professor Snape doing nefarious things.");
		}

		public static void main(String[] args) {
			// 1. make harry potter
			HarryOtter harryotter= new HarryOtter();
			// 2. become invisible
			harryotter.makeInvisible(true);
			// 3. spy on professor snape
			harryotter.spyOnSnape();
			// 4. become visible again
			harryotter.makeInvisible(false);
			// 5. cast a “stupefy” spell
			harryotter.castSpell("spell");
		}

	}







