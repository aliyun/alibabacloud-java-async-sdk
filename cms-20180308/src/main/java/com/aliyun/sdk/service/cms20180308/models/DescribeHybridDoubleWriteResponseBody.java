// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link DescribeHybridDoubleWriteResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridDoubleWriteResponseBody</p>
 */
public class DescribeHybridDoubleWriteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeHybridDoubleWriteResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridDoubleWriteResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List<Result> result; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeHybridDoubleWriteResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeHybridDoubleWriteResponseBody build() {
            return new DescribeHybridDoubleWriteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridDoubleWriteResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridDoubleWriteResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("SourceNamespace")
        private String sourceNamespace;

        @com.aliyun.core.annotation.NameInMap("SourceUserId")
        private Long sourceUserId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private Result(Builder builder) {
            this.namespace = builder.namespace;
            this.sourceNamespace = builder.sourceNamespace;
            this.sourceUserId = builder.sourceUserId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return sourceNamespace
         */
        public String getSourceNamespace() {
            return this.sourceNamespace;
        }

        /**
         * @return sourceUserId
         */
        public Long getSourceUserId() {
            return this.sourceUserId;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String namespace; 
            private String sourceNamespace; 
            private Long sourceUserId; 
            private Long userId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.namespace = model.namespace;
                this.sourceNamespace = model.sourceNamespace;
                this.sourceUserId = model.sourceUserId;
                this.userId = model.userId;
            } 

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * SourceNamespace.
             */
            public Builder sourceNamespace(String sourceNamespace) {
                this.sourceNamespace = sourceNamespace;
                return this;
            }

            /**
             * SourceUserId.
             */
            public Builder sourceUserId(Long sourceUserId) {
                this.sourceUserId = sourceUserId;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
