import java.awt.Color;

import org.teachingextensions.logo.Tortoise;



public class houses {
public static void main(String[] args) {
	Tortoise.show();
	Tortoise.setSpeed(10);
 Tortoise.penUp();
	Tortoise.setAngle(240);
	Tortoise.move(350);

	drawhouse("small");
	drawhouse("large");
drawhouse("medium");
drawhouse("large");
	drawhouse("small");
}

private static void drawhouse(String height) {
	int heightfurreals= 100;
	if (height.equals("small")) {
		heightfurreals=80;
	}
	if (height.equals("medium")) {
		heightfurreals=120;
	}
	if (height.equals("large")) {
		heightfurreals=250;
	}
	Tortoise.setAngle(0);
	Tortoise.penDown();
	Tortoise.setPenColor(Color.black);
	Tortoise.move(heightfurreals);
	Tortoise.setAngle(90);
	Tortoise.move(30);
	Tortoise.setAngle(180);
	Tortoise.move(heightfurreals);
	Tortoise.setAngle(90);
	Tortoise.setPenColor(Color.GREEN);
	Tortoise.move(30);
}
}
