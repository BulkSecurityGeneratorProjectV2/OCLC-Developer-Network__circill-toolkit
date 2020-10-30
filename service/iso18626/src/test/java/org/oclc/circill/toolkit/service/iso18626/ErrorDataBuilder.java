/*
 * Copyright (c) 2019 OCLC, Inc.
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the MIT/X11 license. The text of the license can be
 * found at http://www.opensource.org/licenses/mit-license.php.
 */

package org.oclc.circill.toolkit.service.iso18626;

@SuppressWarnings("ReturnOfThis")
public final class ErrorDataBuilder {

    private ErrorType errorType;
    private String errorValue;

    /**
     * This utility class does not allow instances.
     */
    private ErrorDataBuilder() {
    }

    /**
     * -
     * @return a builder for {@link ErrorData}
     */
    public static ErrorDataBuilder aErrorData() {
        final ErrorDataBuilder builder = new ErrorDataBuilder();
        return builder;
    }

    public ErrorDataBuilder withErrorType(final ErrorType errorType) {
        this.errorType = errorType;
        return this;
    }

    public ErrorDataBuilder withErrorValue(final String errorValue) {
        this.errorValue = errorValue;
        return this;
    }

    public ErrorData build() {
        final ErrorData errorData = new ErrorData();
        errorData.setErrorType(errorType);
        errorData.setErrorValue(errorValue);
        return errorData;
    }

}

