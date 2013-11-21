package com.pwootage.pokemath;

/**
 * Interface defining methods for calculating experience and levels
 * @author pwootage
 *
 */
public interface IExperienceCalculator {
	/**
	 * Calculate the level attained based on the amount of experience
	 * @param xp Amount of experience
	 * @return Level that experience attains
	 */
	public int getLevelFromXP(int xp);
	
	/**
	 * Calculate the experience required to level to the next level at the level specified
	 * @param level Level
	 * @return Amount of experience to level up to {@code (level + 1)}
	 */
	public int getXPRequiredForNextLevel(int level);
	
	/**
	 * Get the total amount of experience required for this level
	 * @param level Level
	 * @return Total experience required at level
	 */
	public int getXPRequiredForLevel(int level);
}
