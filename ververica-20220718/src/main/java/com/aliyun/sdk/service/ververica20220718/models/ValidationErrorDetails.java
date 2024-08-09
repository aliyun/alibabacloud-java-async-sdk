// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidationErrorDetails} extends {@link TeaModel}
 *
 * <p>ValidationErrorDetails</p>
 */
public class ValidationErrorDetails extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("columnNumber")
    private String columnNumber;

    @com.aliyun.core.annotation.NameInMap("endColumnNumber")
    private String endColumnNumber;

    @com.aliyun.core.annotation.NameInMap("endLineNumber")
    private String endLineNumber;

    @com.aliyun.core.annotation.NameInMap("lineNumber")
    private String lineNumber;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    private ValidationErrorDetails(Builder builder) {
        this.columnNumber = builder.columnNumber;
        this.endColumnNumber = builder.endColumnNumber;
        this.endLineNumber = builder.endLineNumber;
        this.lineNumber = builder.lineNumber;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidationErrorDetails create() {
        return builder().build();
    }

    /**
     * @return columnNumber
     */
    public String getColumnNumber() {
        return this.columnNumber;
    }

    /**
     * @return endColumnNumber
     */
    public String getEndColumnNumber() {
        return this.endColumnNumber;
    }

    /**
     * @return endLineNumber
     */
    public String getEndLineNumber() {
        return this.endLineNumber;
    }

    /**
     * @return lineNumber
     */
    public String getLineNumber() {
        return this.lineNumber;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private String columnNumber; 
        private String endColumnNumber; 
        private String endLineNumber; 
        private String lineNumber; 
        private String message; 

        /**
         * columnNumber.
         */
        public Builder columnNumber(String columnNumber) {
            this.columnNumber = columnNumber;
            return this;
        }

        /**
         * endColumnNumber.
         */
        public Builder endColumnNumber(String endColumnNumber) {
            this.endColumnNumber = endColumnNumber;
            return this;
        }

        /**
         * endLineNumber.
         */
        public Builder endLineNumber(String endLineNumber) {
            this.endLineNumber = endLineNumber;
            return this;
        }

        /**
         * lineNumber.
         */
        public Builder lineNumber(String lineNumber) {
            this.lineNumber = lineNumber;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public ValidationErrorDetails build() {
            return new ValidationErrorDetails(this);
        } 

    } 

}
