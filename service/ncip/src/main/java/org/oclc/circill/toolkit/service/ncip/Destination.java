/*
 * Copyright (c) 2010 eXtensible Catalog Organization.
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the MIT/X11 license. The text of the license can be
 * found at http://www.opensource.org/licenses/mit-license.php. 
 */

package org.oclc.circill.toolkit.service.ncip;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Destination {
    public Location getLocation() {
        return location;
    }

    public void setLocation(final Location location) {
        this.location = location;
    }

    public String getBinNumber() {
        return binNumber;
    }

    public void setBinNumber(final String binNumber) {
        this.binNumber = binNumber;
    }

    /**
     * Location
     */
    protected Location location;
    /**
     * Bin Number
     */
    protected String binNumber;

    /**
     * Generic toString() implementation.
     *
     * @return String
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        final Destination rhs = (Destination) obj;
        return new EqualsBuilder().append(location, rhs.location).append(binNumber, rhs.binNumber).isEquals();
    }

    @Override
    public int hashCode() {
        final int result = new HashCodeBuilder(633981495, 1556591937).append(location).append(binNumber).toHashCode();
        return result;
    }

}
