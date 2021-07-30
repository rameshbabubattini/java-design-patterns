package com.java.designpatterns;

import com.java.designpatterns.LunchOrder.LunchOrderBuilder;

public class BuilderPattern {

	public static void main(String[] args) {
		LunchOrderBuilder builder = new LunchOrder.LunchOrderBuilder();
		LunchOrder lunchOrder = builder
			.bread("added bread")
			.condiments("added condiments")
			.dressing("dressing done")
			.meat("added meat")
			.build();
		
		System.out.println(lunchOrder);
	}

}

class LunchOrder {
	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	public static class LunchOrderBuilder {
		private String bread;
		private String condiments;
		private String dressing;
		private String meat;
		
		public LunchOrderBuilder() {
			
		}
		
		public LunchOrderBuilder bread(String bread) {
			this.bread = bread;
			return this;
		}
		
		public LunchOrderBuilder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}
		
		public LunchOrderBuilder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}
		
		public LunchOrderBuilder meat(String meat) {
			this.meat = meat;
			return this;
		}
		
		public LunchOrder build() {
			return new LunchOrder(this);
		}
	}
	
	private LunchOrder(LunchOrderBuilder lunchOrderBuilder) {
		this.bread = lunchOrderBuilder.bread;
		this.condiments = lunchOrderBuilder.condiments;
		this.dressing = lunchOrderBuilder.dressing;
		this.meat = lunchOrderBuilder.meat;
	}

	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}
	
	public String toString() {
		StringBuilder lunchOrder = new StringBuilder();
		lunchOrder.append("LunchOrder[");
		lunchOrder.append("bread: " + bread);
		lunchOrder.append(", condiments: " + condiments);
		lunchOrder.append(", dressing: " + dressing);
		lunchOrder.append(", meat: " + meat);
		lunchOrder.append("]");
		
		return lunchOrder.toString();
	}

}