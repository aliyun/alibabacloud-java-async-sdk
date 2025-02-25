// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDataSetMessageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataSetMessageResponseBody</p>
 */
public class DescribeDataSetMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private DescribeDataSetMessageResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataSetMessageResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public DescribeDataSetMessageResponseBody build() {
            return new DescribeDataSetMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataSetMessageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataSetMessageResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorLevel")
        private String errorLevel;

        @com.aliyun.core.annotation.NameInMap("errorType")
        private String errorType;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private String timestamp;

        private Result(Builder builder) {
            this.errorLevel = builder.errorLevel;
            this.errorType = builder.errorType;
            this.message = builder.message;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return errorLevel
         */
        public String getErrorLevel() {
            return this.errorLevel;
        }

        /**
         * @return errorType
         */
        public String getErrorType() {
            return this.errorType;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String errorLevel; 
            private String errorType; 
            private String message; 
            private String timestamp; 

            /**
             * errorLevel.
             */
            public Builder errorLevel(String errorLevel) {
                this.errorLevel = errorLevel;
                return this;
            }

            /**
             * errorType.
             */
            public Builder errorType(String errorType) {
                this.errorType = errorType;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
