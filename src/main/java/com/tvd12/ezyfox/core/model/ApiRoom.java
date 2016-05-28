package com.tvd12.ezyfox.core.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Base class of room agent's class
 * 
 * @author tavandung12
 *
 */

public abstract class ApiRoom extends ApiModel {

    // room's capacity
    @Setter @Getter
	protected int capacity = 1000;
	
    // room's id
    @Setter @Getter
	protected int id;
	
    // room's max room variables allowed
    @Setter @Getter
	protected int maxRoomVariablesAllowed = 30;
	
    // room's max spectators
    @Setter @Getter
	protected int maxSpectators = 50;
	
    // room's max users
    @Setter @Getter
	protected int maxUsers = 100;
	
    // room's variables count
    @Setter @Getter
	protected int variablesCount = 0;
	
    // room's state
    @Setter @Getter
	protected boolean active = true; 
	
    // room's type
    @Setter @Getter
	protected boolean dynamic = true;
	
    // room's state
    @Setter @Getter
	protected boolean empty = true;
	
    // room's state
    @Setter @Getter
	protected boolean full = false;
	
    // room's type
    @Setter @Getter
	protected boolean game = false;
	
    // room's type
    @Setter @Getter
	protected boolean hidden = false;
	
    // room's protected with password?
    @Setter @Getter
	protected boolean passwordProtected = false;
	
    // room's type
    @Setter @Getter
	protected boolean isPublic = true;
	
    // filter bad words?
    @Setter @Getter
	protected boolean useWordsFilter = false;
	
    // room's name
    @Setter @Getter
	protected String name;
	
    // room's password
    @Setter @Getter
	protected String password;
	
    // room's groupId
    @Setter @Getter
	protected String groupdId;
    
    @Setter @Getter
    protected RoomRemoveMode removeMode = RoomRemoveMode.NEVER_REMOVE;
	
    /**
     * set room's owner
     * 
     * @param owner room's owner
     */
	public void setOwner(Object owner) {};
	
	/**
	 * get room's owner
	 * 
	 * @return room's owner
	 */
	public <T> T getOwner() {return null;}
	
}
