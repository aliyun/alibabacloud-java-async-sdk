// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyPythonFileResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyPythonFileResponseBody</p>
 */
public class VerifyPythonFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Syntax")
    private java.util.List < Syntax> syntax;

    private VerifyPythonFileResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.syntax = builder.syntax;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyPythonFileResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return syntax
     */
    public java.util.List < Syntax> getSyntax() {
        return this.syntax;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Syntax> syntax; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The verification result. If the parameter is left empty, the syntax of the code snippet is correct.
         */
        public Builder syntax(java.util.List < Syntax> syntax) {
            this.syntax = syntax;
            return this;
        }

        public VerifyPythonFileResponseBody build() {
            return new VerifyPythonFileResponseBody(this);
        } 

    } 

    public static class Syntax extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndColumn")
        private Integer endColumn;

        @com.aliyun.core.annotation.NameInMap("EndLineNumber")
        private Integer endLineNumber;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private Integer severity;

        @com.aliyun.core.annotation.NameInMap("StartColumn")
        private Integer startColumn;

        @com.aliyun.core.annotation.NameInMap("StartLineNumber")
        private Integer startLineNumber;

        private Syntax(Builder builder) {
            this.endColumn = builder.endColumn;
            this.endLineNumber = builder.endLineNumber;
            this.message = builder.message;
            this.severity = builder.severity;
            this.startColumn = builder.startColumn;
            this.startLineNumber = builder.startLineNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Syntax create() {
            return builder().build();
        }

        /**
         * @return endColumn
         */
        public Integer getEndColumn() {
            return this.endColumn;
        }

        /**
         * @return endLineNumber
         */
        public Integer getEndLineNumber() {
            return this.endLineNumber;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return severity
         */
        public Integer getSeverity() {
            return this.severity;
        }

        /**
         * @return startColumn
         */
        public Integer getStartColumn() {
            return this.startColumn;
        }

        /**
         * @return startLineNumber
         */
        public Integer getStartLineNumber() {
            return this.startLineNumber;
        }

        public static final class Builder {
            private Integer endColumn; 
            private Integer endLineNumber; 
            private String message; 
            private Integer severity; 
            private Integer startColumn; 
            private Integer startLineNumber; 

            /**
             * The number that indicates the end column of the error code.
             */
            public Builder endColumn(Integer endColumn) {
                this.endColumn = endColumn;
                return this;
            }

            /**
             * The number that indicates the end line of the error code.
             */
            public Builder endLineNumber(Integer endLineNumber) {
                this.endLineNumber = endLineNumber;
                return this;
            }

            /**
             * The error message for the error code.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The severity level of the error code. Valid values:
             * <p>
             * 
             * *   4: moderate
             * *   8: serious
             */
            public Builder severity(Integer severity) {
                this.severity = severity;
                return this;
            }

            /**
             * The number that indicates the start column of the error code.
             */
            public Builder startColumn(Integer startColumn) {
                this.startColumn = startColumn;
                return this;
            }

            /**
             * The number that indicates the start line of the error code.
             */
            public Builder startLineNumber(Integer startLineNumber) {
                this.startLineNumber = startLineNumber;
                return this;
            }

            public Syntax build() {
                return new Syntax(this);
            } 

        } 

    }
}
