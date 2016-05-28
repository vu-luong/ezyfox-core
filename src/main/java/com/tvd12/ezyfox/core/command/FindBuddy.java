/**
 * 
 */
package com.tvd12.ezyfox.core.command;

import com.tvd12.ezyfox.core.model.ApiBaseUser;

/**
 * Execute this command to find a buddy
 * 
 * @author tavandung12
 *
 */
public interface FindBuddy extends BaseCommand {

    /**
     * Buddy's owner
     * 
     * @param owner buddy's owner
     * @return this pointer
     */
    <T extends FindBuddy> T owner(ApiBaseUser owner);
    
    /**
     * Name of buddy's owner
     * 
     * @param ownerName name of buddy's owner
     * @return
     */
    <T extends FindBuddy> T owner(String ownerName);
    
    /**
     * Buddy name to find
     * 
     * @param buddyName buddy name to find
     * @return this pointer
     */
    <T extends FindBuddy> T buddy(String buddyName);
    
}
