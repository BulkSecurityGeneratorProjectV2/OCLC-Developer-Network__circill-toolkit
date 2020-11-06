/*
 * Copyright (c) 2017 OCLC, Inc.
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the MIT/X11 license. The text of the license can be
 * found at http://www.opensource.org/licenses/mit-license.php.
 */

package org.oclc.circill.toolkit.service.ncip.common;

import org.oclc.circill.toolkit.service.base.BaseTestSVPBeans;
import org.oclc.circill.toolkit.service.base.SchemeValuePair;

import java.util.Arrays;

import org.junit.Test;

/**
 * Unit tests to verify the package's {@link SchemeValuePair} subclasses.
 */
public class TestSVPBeans extends BaseTestSVPBeans {
    @Test
    public void testClasses() throws Exception {
        final String packageName = this.getClass().getPackage().getName();
        verifyLoadAllMethods(packageName);
        verifySVPSubclassesRequireSchemes(packageName, Arrays.asList("AgencyId", "FromSystemId", "ToSystemId"));
        verifySVPSubclassFindMethods(packageName);
    }
}
