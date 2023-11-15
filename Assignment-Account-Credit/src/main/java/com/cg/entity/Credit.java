package com.cg.entity;

public class Credit extends Account{
	private double overDeposit;

	public double getOverDeposit() {
		return overDeposit;
	}

	public void setOverDeposit(double overDeposit) {
		this.overDeposit = overDeposit;
	}

	@Override
	public String toString() {
		return "Credit [overDeposit=" + overDeposit + "]";
	}
}
