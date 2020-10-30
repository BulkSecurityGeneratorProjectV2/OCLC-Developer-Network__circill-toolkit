/*
 * Copyright (c) 2010 eXtensible Catalog Organization.
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the MIT/X11 license. The text of the license can be
 * found at http://www.opensource.org/licenses/mit-license.php. 
 */

package org.oclc.circill.toolkit.service.ncip;

import java.util.GregorianCalendar;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Carries data elements describing the ItemReportedReturned.
 */
public class ItemReportedReturned {

    /**
     * DateReportedReturned
     */
    protected GregorianCalendar dateReportedReturned;

    /**
     * Set DateReportedReturned.
     *
     * @param dateReportedReturned the date the user purports the item was returned
     */
    public void setDateReportedReturned(final GregorianCalendar dateReportedReturned) {

        this.dateReportedReturned = dateReportedReturned;

    }

    /**
     * Get DateReportedReturned.
     *
     * @return the date reported returned
     */
    public GregorianCalendar getDateReportedReturned() {

        return dateReportedReturned;

    }

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
        final ItemReportedReturned rhs = (ItemReportedReturned) obj;
        return new EqualsBuilder().append(dateReportedReturned, rhs.dateReportedReturned).isEquals();
    }

    @Override
    public int hashCode() {
        final int result = new HashCodeBuilder(433760967, 415055839).append(dateReportedReturned).toHashCode();
        return result;
    }
}
