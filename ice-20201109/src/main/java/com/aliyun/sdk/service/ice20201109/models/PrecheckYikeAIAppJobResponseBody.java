// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link PrecheckYikeAIAppJobResponseBody} extends {@link TeaModel}
 *
 * <p>PrecheckYikeAIAppJobResponseBody</p>
 */
public class PrecheckYikeAIAppJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private PrecheckYikeAIAppJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrecheckYikeAIAppJobResponseBody create() {
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
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private String status; 

        private Builder() {
        } 

        private Builder(PrecheckYikeAIAppJobResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.status = model.status;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public PrecheckYikeAIAppJobResponseBody build() {
            return new PrecheckYikeAIAppJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PrecheckYikeAIAppJobResponseBody} extends {@link TeaModel}
     *
     * <p>PrecheckYikeAIAppJobResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private Result(Builder builder) {
            this.errorCode = builder.errorCode;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String errorCode; 
            private String key; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.errorCode = model.errorCode;
                this.key = model.key;
            } 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
