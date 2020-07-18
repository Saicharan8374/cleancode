package com.epam.cost;

	

	public class TestConstructionCost {

		
		public void testCost() {
			CalculateCost cc = new CalculateCost();
			cc.getCost("standard",6,false);
			cc.getCost("highStandard",3,true);
			cc.getCost("aboveStandard",2,true);
			cc.getCost("highStandard",5,false);
		}

	}

