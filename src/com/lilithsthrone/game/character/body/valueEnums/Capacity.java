package com.lilithsthrone.game.character.body.valueEnums;

import com.lilithsthrone.main.Main;
import com.lilithsthrone.utils.Colour;

/**
 * Measured in cm of <b>diameter</b> of a penetrative object which could fit comfortably within an orifice.
 * 
 * @since 0.1.0
 * @version 0.3.6.6
 * @author Innoxia
 */
public enum Capacity {
	
	ZERO_IMPENETRABLE("extremely tight", 0f, 1f, Colour.GENERIC_SIZE_ONE),
	
	ONE_EXTREMELY_TIGHT("tight", 1f, 2.5f, Colour.GENERIC_SIZE_TWO),
	
	TWO_TIGHT("somewhat tight", 2.5f, 5f, Colour.GENERIC_SIZE_THREE),
	
	THREE_SLIGHTLY_LOOSE("slightly loose", 5f, 7.5f, Colour.GENERIC_SIZE_FOUR),
	
	FOUR_LOOSE("loose", 7.5f, 10f, Colour.GENERIC_SIZE_FIVE),
	
	FIVE_ROOMY("very loose", 10f, 12.5f, Colour.GENERIC_SIZE_SIX) {
		@Override
		public String getDescriptor() {
			if(!Main.game.isGapeContentEnabled()) {
				return FOUR_LOOSE.getDescriptor();
			}
			return super.getDescriptor();
		}
		@Override
		public Colour getColour() {
			if(!Main.game.isGapeContentEnabled()) {
				return FOUR_LOOSE.getColour();
			}
			return super.getColour();
		}
	},
	
	SIX_STRETCHED_OPEN("stretched open", 12.5f, 20f, Colour.GENERIC_SIZE_SEVEN) {
		@Override
		public String getDescriptor() {
			if(!Main.game.isGapeContentEnabled()) {
				return FOUR_LOOSE.getDescriptor();
			}
			return super.getDescriptor();
		}
		@Override
		public Colour getColour() {
			if(!Main.game.isGapeContentEnabled()) {
				return FOUR_LOOSE.getColour();
			}
			return super.getColour();
		}
	},
	
	SEVEN_GAPING("gaping wide", 20f, 25f, Colour.GENERIC_SIZE_EIGHT) {
		@Override
		public String getDescriptor() {
			if(!Main.game.isGapeContentEnabled()) {
				return FOUR_LOOSE.getDescriptor();
			}
			return super.getDescriptor();
		}
		@Override
		public Colour getColour() {
			if(!Main.game.isGapeContentEnabled()) {
				return FOUR_LOOSE.getColour();
			}
			return super.getColour();
		}
	};

	
	private String descriptor;
	private float minimumSizeComfortable;
	private float maximumSizeComfortable;
	private Colour colour;

	private Capacity(String descriptor, float minimumSizeComfortable, float maximumSizeComfortable, Colour colour) {
		this.descriptor = descriptor;

		this.minimumSizeComfortable = minimumSizeComfortable;
		this.maximumSizeComfortable = maximumSizeComfortable;
		
		this.colour=colour;
	}

	/** @return The minimum diameter that this Capacity can handle without it feeling too small. */
	public float getMinimumValue() {
		return minimumSizeComfortable;
	}

	/** @return The maximum diameter that this Capacity can handle without it feeling too big. */
	public float getMaximumValue(boolean withLube) {
		return maximumSizeComfortable * (withLube?1.05f:1);
	}

	/** @return The median diameter that this Capacity can handle without it feeling too big or small. */
	public float getMedianValue() {
		return (minimumSizeComfortable + maximumSizeComfortable)/2f;
	}

	public static Capacity getCapacityFromValue(float capacity) {
		for(Capacity c : Capacity.values()) {
			if(capacity>=c.getMinimumValue() && capacity<c.getMaximumValue(false)) {
				return c;
			}
		}
		return SEVEN_GAPING;
	}

	/**
	 * @param capacity The capacity of the orifice being penetrated.
	 * @param diameter The total diameter of the penis(es) (or other penetrative object(s)) being inserted.
	 * @return true if the diameter is <=60% of the orifice capacity.
	 */
	public static boolean isPenetrationDiameterTooSmall(float capacity, float diameter) {
		return diameter <= capacity*0.6f;
	}

	/**
	 * @param elasticity The elasticity of the orifice being penetrated. A higher elasticity is more tolerable of bigger penetrations.
	 * @param capacity The capacity of the orifice being penetrated.
	 * @param diameter The total diameter of the penis(es) (or other penetrative object(s)) being inserted.
	 * @param lubed Whether the orifice is lubricated or not. If lubricated, the orifice is able to take bigger penetrations.
	 * @return true if the penis size (factoring in girth) is larger than the capacity can handle.
	 */
	public static boolean isPenetrationDiameterTooBig(OrificeElasticity elasticity, float capacity, float diameter, boolean lubed) {
		float tolerance = 1.01f + elasticity.getSizeTolerancePercentage(); // Base of 1%
		
		if(tolerance>0 && lubed) {
			tolerance+=0.1f; // Add 10% tolerance if lubed
		}
		
		return diameter > capacity*tolerance;
	}

	/**
	 * To fit into a sentence:
	 * <br/>"Your vagina is "+getDescriptor()+"."
	 * <br/>"Your "+getDescriptor()+" asshole is stretched wide open."
	 */
	public String getDescriptor() {
		return descriptor;
	}
	
	/**
	 * A coloured version of getDescriptor().
	 */
	public String getDescriptor(boolean coloured) {
		if(coloured) {
			return "<span style='color:"+this.getColour().toWebHexString()+";'>"+getDescriptor()+"</span>";
		}
		return getDescriptor();
	}

	//TODO change:
	
//	/** @return The maximum PenisLength, assuming a default diameter, that this Capacity can handle without it feeling too big. */
//	public PenisLength getMaximumSizeComfortable() {
//		return maximumSizeComfortable;
//	}
//
//	/** @return The maximum PenisLength, assuming a default diameter, that this Capacity can handle without it feeling too big. */
//	public PenisLength getMaximumSizeComfortableWithLube() {
//		return maximumSizeComfortableWithLube;
//	}

	public Colour getColour() {
		return colour;
	}

}
