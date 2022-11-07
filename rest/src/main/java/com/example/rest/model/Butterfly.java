package com.example.rest.model;

public class Butterfly implements Insect{

	private Insect state = new CaterpillarState();

    void transform() { 
    	state = new ButterflyState(); 
    }

    private class ButterflyState implements Insect {
    	
        public boolean fly() { 
        	return true; 
        }
        
        public boolean walk() { 
        	return true; 
        }
        
        public boolean sound() { 
        	return false;
        } 
        
    }

    private class CaterpillarState implements Insect {
    	
        public boolean fly() { 
        	return false; 
        }
        
        public boolean walk() { 
        	return true; 
        }
        
        public boolean sound() { 
        	return true; 
        }             
    }

    public boolean fly() { 
    	return state.fly(); 
    }
    
    public boolean walk() { 
    	return state.walk(); 
    }
    
    public boolean sound() { 
    	return state.sound(); 
    }
    
}

