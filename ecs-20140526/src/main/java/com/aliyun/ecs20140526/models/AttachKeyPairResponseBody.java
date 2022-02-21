// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>AttachKeyPairResponseBody</p>
 */
public class AttachKeyPairResponseBody extends TeaModel {
    @NameInMap("KeyPairName")
    private String keyPairName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    @NameInMap("FailCount")
    private String failCount;

    @NameInMap("Results")
    private Results results;

    private AttachKeyPairResponseBody(Builder builder) {
        this.keyPairName = builder.keyPairName;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.failCount = builder.failCount;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachKeyPairResponseBody create() {
        return builder().build();
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return failCount
     */
    public String getFailCount() {
        return this.failCount;
    }

    /**
     * @return results
     */
    public Results getResults() {
        return this.results;
    }

    public static final class Builder {
        private String keyPairName; 
        private String requestId; 
        private String totalCount; 
        private String failCount; 
        private Results results; 

        /**
         * The name of the key pair.
         */
        public Builder keyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of instances associated with key pairs.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The number of instances that failed to bind the key pair.
         */
        public Builder failCount(String failCount) {
            this.failCount = failCount;
            return this;
        }

        /**
         * The result set of successful or failed key pair binding.
         */
        public Builder results(Results results) {
            this.results = results;
            return this;
        }

        public AttachKeyPairResponseBody build() {
            return new AttachKeyPairResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
        private String message;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Success")
        private String success;

        private Result(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.instanceId = builder.instanceId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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
            private String instanceId; 
            private String success; 

            /**
             * The operation status code. A value of 200 indicates that the operation is successful.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The operation information passed. When code = 200, the message is successful.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether the operation is successful.
             */
            public Builder success(String success) {
                this.success = success;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Results extends TeaModel {
        @NameInMap("Result")
        private java.util.List < Result> result;

        private Results(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List < Result> result; 

            /**
             * Result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
