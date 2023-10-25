package com.aurionpro.model;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private FestivalType festival;

	public FixedDeposit(int accountNumber, String name, double principal, int duration, FestivalType festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public FestivalType getFestival() {
		return festival;
	}

	public void setFestival(FestivalType festival) {
		this.festival = festival;
	}

	@Override
	public String toString() {
		return "FixedDeposit [accountNumber=" + accountNumber + ", name=" + name + ", principal=" + principal
				+ ", duration=" + duration + ", festival=" + festival + "]";
	}

	private double getInterestRate() {
		double interestRate;

		if (festival == FestivalType.NEWYEAR) {
			interestRate = 8.0;
		} else if (festival == FestivalType.DIWALI) {
			interestRate = 8.5;
		} else if (festival == FestivalType.HOLI) {
			interestRate = 7.5;
		} else {
			interestRate = 6.5;
		}

		return interestRate;
	}

	public double calculateSimpleInterest() {
		double rate = getInterestRate(); 
		return (principal * duration * rate) / 100;
	}
}
