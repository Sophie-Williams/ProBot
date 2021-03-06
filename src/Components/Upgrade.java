package Components;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Upgrade{
	
	private UpgradeType type;
	private String name;
	private Ability additionalAbility;
	private Boolean used = false;
	
	public Upgrade(UpgradeType type, String name, Ability additionalAbility) {
		this.type = type;
		this.name = name;
		this.additionalAbility = additionalAbility;
	}

	public Boolean isUsed() {
		return used;
	}


	public void setUsed(Boolean used) {
		this.used = used;
	}


	public UpgradeType getType() {
		return type;
	}

	public void setType(UpgradeType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Ability getAdditionalAbility() {
		return additionalAbility;
	}

	public void setAdditionalAbility(Ability additionalAbility) {
		this.additionalAbility = additionalAbility;
	}
	
	public BufferedImage getIcon(){
		BufferedImage icon = null;
		try {
			//URL url = getClass().getResource("/Icons/"+this.name.replaceAll("\\s","").toLowerCase()+".png");
			URL url = getClass().getResource("/Icons/empty.png");
			icon = ImageIO.read(new File(url.getPath()));
		} catch (IOException e) {}
		return icon;
	}

}
