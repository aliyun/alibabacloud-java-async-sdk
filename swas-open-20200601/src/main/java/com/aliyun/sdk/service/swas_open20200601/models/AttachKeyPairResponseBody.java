// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>AttachKeyPairResponseBody</p>
 */
public class AttachKeyPairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailCount")
    private Integer failCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List < Results> results;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private AttachKeyPairResponseBody(Builder builder) {
        this.failCount = builder.failCount;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachKeyPairResponseBody create() {
        return builder().build();
    }

    /**
     * @return failCount
     */
    public Integer getFailCount() {
        return this.failCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List < Results> getResults() {
        return this.results;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer failCount; 
        private String requestId; 
        private java.util.List < Results> results; 
        private Integer totalCount; 

        /**
         * The total number of simple application servers to which the key pair failed to be bound.
         */
        public Builder failCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The results.
         */
        public Builder results(java.util.List < Results> results) {
            this.results = results;
            return this;
        }

        /**
         * The total number of simple application servers to which the key pair is bound.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public AttachKeyPairResponseBody build() {
            return new AttachKeyPairResponseBody(this);
        } 

    } 

    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Success")
        private String success;

        private Results(Builder builder) {
            this.code = builder.code;
            this.instanceId = builder.instanceId;
            this.message = builder.message;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return success
         */
        public String getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String code; 
            private String instanceId; 
            private String message; 
            private String success; 

            /**
             * The HTTP status code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The simple application server ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The response message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Indicates whether the key pair is bound to the simple application server successfully. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder success(String success) {
                this.success = success;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
