package com.pwootage.pokemath;

/**
 * Interface defining methods to calculate statistics
 * 
 * @author pwootage
 *
 */
public interface IStatCalculator {
	/**
	 * Calculate Hit Point statistic
	 * @param level Level of the pokemon
	 * @param info Information required for calculating this statistic
	 * @return Hit Points based on input
	 */
	int getHP(int level, IStatInfo info);
	
	/**
	 * Calculate Attack statistic
	 * @param level Level of the pokemon
	 * @param info Information required for calculating this statistic
	 * @return Attack based on input
	 */
	int getAttack(int level, IStatInfo info);
	
	/**
	 * Calculate Special Attack statistic
	 * @param level Level of the pokemon
	 * @param info Information required for calculating this statistic
	 * @return Special Attack based on input
	 */
	int getSpecialAttack(int level, IStatInfo info);
	
	/**
	 * Calculate Defense statistic
	 * @param level Level of the pokemon
	 * @param info Information required for calculating this statistic
	 * @return Defense based on input
	 */
	int getDefense(int level, IStatInfo info);
	
	/**
	 * Calculate Special Defense statistic
	 * @param level Level of the pokemon
	 * @param info Information required for calculating this statistic
	 * @return Special Defense based on input
	 */
	int getSpecialDefense(int level, IStatInfo info);
	
	/**
	 * Calculate Speed statistic
	 * @param level Level of the pokemon
	 * @param info Information required for calculating this statistic
	 * @return Speed based on input
	 */
	int getSpeed(int level, IStatInfo info);
}
