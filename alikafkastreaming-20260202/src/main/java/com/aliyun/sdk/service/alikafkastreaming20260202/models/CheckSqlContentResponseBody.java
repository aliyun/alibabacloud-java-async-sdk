// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkastreaming20260202.models;

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
 * {@link CheckSqlContentResponseBody} extends {@link TeaModel}
 *
 * <p>CheckSqlContentResponseBody</p>
 */
public class CheckSqlContentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CheckSqlContentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSqlContentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CheckSqlContentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CheckSqlContentResponseBody build() {
            return new CheckSqlContentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckSqlContentResponseBody} extends {@link TeaModel}
     *
     * <p>CheckSqlContentResponseBody</p>
     */
    public static class ErrorList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeSnippet")
        private String codeSnippet;

        @com.aliyun.core.annotation.NameInMap("ColumnNumber")
        private Integer columnNumber;

        @com.aliyun.core.annotation.NameInMap("EndColumnNumber")
        private Integer endColumnNumber;

        @com.aliyun.core.annotation.NameInMap("EndLineNumber")
        private Integer endLineNumber;

        @com.aliyun.core.annotation.NameInMap("ErrorType")
        private String errorType;

        @com.aliyun.core.annotation.NameInMap("LineNumber")
        private Integer lineNumber;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private ErrorList(Builder builder) {
            this.codeSnippet = builder.codeSnippet;
            this.columnNumber = builder.columnNumber;
            this.endColumnNumber = builder.endColumnNumber;
            this.endLineNumber = builder.endLineNumber;
            this.errorType = builder.errorType;
            this.lineNumber = builder.lineNumber;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorList create() {
            return builder().build();
        }

        /**
         * @return codeSnippet
         */
        public String getCodeSnippet() {
            return this.codeSnippet;
        }

        /**
         * @return columnNumber
         */
        public Integer getColumnNumber() {
            return this.columnNumber;
        }

        /**
         * @return endColumnNumber
         */
        public Integer getEndColumnNumber() {
            return this.endColumnNumber;
        }

        /**
         * @return endLineNumber
         */
        public Integer getEndLineNumber() {
            return this.endLineNumber;
        }

        /**
         * @return errorType
         */
        public String getErrorType() {
            return this.errorType;
        }

        /**
         * @return lineNumber
         */
        public Integer getLineNumber() {
            return this.lineNumber;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String codeSnippet; 
            private Integer columnNumber; 
            private Integer endColumnNumber; 
            private Integer endLineNumber; 
            private String errorType; 
            private Integer lineNumber; 
            private String message; 

            private Builder() {
            } 

            private Builder(ErrorList model) {
                this.codeSnippet = model.codeSnippet;
                this.columnNumber = model.columnNumber;
                this.endColumnNumber = model.endColumnNumber;
                this.endLineNumber = model.endLineNumber;
                this.errorType = model.errorType;
                this.lineNumber = model.lineNumber;
                this.message = model.message;
            } 

            /**
             * CodeSnippet.
             */
            public Builder codeSnippet(String codeSnippet) {
                this.codeSnippet = codeSnippet;
                return this;
            }

            /**
             * ColumnNumber.
             */
            public Builder columnNumber(Integer columnNumber) {
                this.columnNumber = columnNumber;
                return this;
            }

            /**
             * EndColumnNumber.
             */
            public Builder endColumnNumber(Integer endColumnNumber) {
                this.endColumnNumber = endColumnNumber;
                return this;
            }

            /**
             * EndLineNumber.
             */
            public Builder endLineNumber(Integer endLineNumber) {
                this.endLineNumber = endLineNumber;
                return this;
            }

            /**
             * ErrorType.
             */
            public Builder errorType(String errorType) {
                this.errorType = errorType;
                return this;
            }

            /**
             * LineNumber.
             */
            public Builder lineNumber(Integer lineNumber) {
                this.lineNumber = lineNumber;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public ErrorList build() {
                return new ErrorList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CheckSqlContentResponseBody} extends {@link TeaModel}
     *
     * <p>CheckSqlContentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorList")
        private java.util.List<ErrorList> errorList;

        @com.aliyun.core.annotation.NameInMap("Valid")
        private Boolean valid;

        private Data(Builder builder) {
            this.errorList = builder.errorList;
            this.valid = builder.valid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorList
         */
        public java.util.List<ErrorList> getErrorList() {
            return this.errorList;
        }

        /**
         * @return valid
         */
        public Boolean getValid() {
            return this.valid;
        }

        public static final class Builder {
            private java.util.List<ErrorList> errorList; 
            private Boolean valid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorList = model.errorList;
                this.valid = model.valid;
            } 

            /**
             * ErrorList.
             */
            public Builder errorList(java.util.List<ErrorList> errorList) {
                this.errorList = errorList;
                return this;
            }

            /**
             * Valid.
             */
            public Builder valid(Boolean valid) {
                this.valid = valid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
