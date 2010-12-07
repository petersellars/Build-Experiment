/**
 * Copyright (C) 2010 Peter Sellars
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.catosplace.pojo;

import com.openpojo.business.BusinessIdentity;
import com.openpojo.business.annotation.BusinessKey;

public class Customer {
	
	@BusinessKey(composite=true,caseSensitive=true)
	private String firstName;
	@BusinessKey(composite=true,caseSensitive=true)
	private String lastName;

	@BusinessKey(composite=true,required=true)
	private String email;
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getEmail() {
		return this.email;
	}
	
    @Override
    public boolean equals(Object obj) {
        return BusinessIdentity.areEqual(this, obj);
    }

    @Override
    public int hashCode() {
        return BusinessIdentity.getHashCode(this);
    }
    
    @Override
    public String toString() {
    	return BusinessIdentity.toString(this);
    }
}
