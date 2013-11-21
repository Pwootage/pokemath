package com.pwootage.pokemath;


/**
 * Provides information required to calculate a statistic
 * 
 * @author pwootage
 *
 */
public interface IStatInfo {
	
	/**
	 * Return the Effort Values (or Stat Experience) of this statistic
	 * @return Effort Value or Stat Experience of this statistic
	 */
	public int getEV();
	
	/**
	 * Return the Individual Value (or Determinant Value) for this statistic
	 * @return Indifidual Value of this statistic
	 */
	public int getIV();
	
	/**
	 * Base value of this statistic
	 * @return Base value of this statistic
	 */
	public int getBase();
}
