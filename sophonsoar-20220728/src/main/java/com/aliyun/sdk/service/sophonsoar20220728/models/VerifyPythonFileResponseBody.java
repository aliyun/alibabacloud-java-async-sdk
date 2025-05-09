// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VerifyPythonFileResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyPythonFileResponseBody</p>
 */
public class VerifyPythonFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Syntax")
    private java.util.List<Syntax> syntax;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Syntax> getSyntax() {
        return this.syntax;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Syntax> syntax; 

        private Builder() {
        } 

        private Builder(VerifyPythonFileResponseBody model) {
            this.requestId = model.requestId;
            this.syntax = model.syntax;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F72685FB-A6E6-5A9A-97F7-6DC1056E63CE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The verification result. If the parameter is left empty, the syntax of the code snippet is correct.</p>
         */
        public Builder syntax(java.util.List<Syntax> syntax) {
            this.syntax = syntax;
            return this;
        }

        public VerifyPythonFileResponseBody build() {
            return new VerifyPythonFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyPythonFileResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyPythonFileResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Syntax model) {
                this.endColumn = model.endColumn;
                this.endLineNumber = model.endLineNumber;
                this.message = model.message;
                this.severity = model.severity;
                this.startColumn = model.startColumn;
                this.startLineNumber = model.startLineNumber;
            } 

            /**
             * <p>The number that indicates the end column of the error code.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder endColumn(Integer endColumn) {
                this.endColumn = endColumn;
                return this;
            }

            /**
             * <p>The number that indicates the end line of the error code.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder endLineNumber(Integer endLineNumber) {
                this.endLineNumber = endLineNumber;
                return this;
            }

            /**
             * <p>The error message for the error code.</p>
             * 
             * <strong>example:</strong>
             * <p>undefined name &quot;ab&quot;</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The severity level of the error code. Valid values:</p>
             * <ul>
             * <li>4: moderate</li>
             * <li>8: serious</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder severity(Integer severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The number that indicates the start column of the error code.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder startColumn(Integer startColumn) {
                this.startColumn = startColumn;
                return this;
            }

            /**
             * <p>The number that indicates the start line of the error code.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
