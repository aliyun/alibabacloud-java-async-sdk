// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>DetachKeyPairResponseBody</p>
 */
public class DetachKeyPairResponseBody extends TeaModel {
    @NameInMap("FailCount")
    private String failCount;

    @NameInMap("KeyPairName")
    private String keyPairName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Results")
    private Results results;

    @NameInMap("TotalCount")
    private String totalCount;

    private DetachKeyPairResponseBody(Builder builder) {
        this.failCount = builder.failCount;
        this.keyPairName = builder.keyPairName;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachKeyPairResponseBody create() {
        return builder().build();
    }

    /**
     * @return failCount
     */
    public String getFailCount() {
        return this.failCount;
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
     * @return results
     */
    public Results getResults() {
        return this.results;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String failCount; 
        private String keyPairName; 
        private String requestId; 
        private Results results; 
        private String totalCount; 

        /**
         * The number of instances from which the SSH key pair failed to be unbound.
         */
        public Builder failCount(String failCount) {
            this.failCount = failCount;
            return this;
        }

        /**
         * The names of the key pairs.
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
         * The result set of the unbind operation.
         */
        public Builder results(Results results) {
            this.results = results;
            return this;
        }

        /**
         * The total number of instances from which you attempted to unbind the SSH key pair.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DetachKeyPairResponseBody build() {
            return new DetachKeyPairResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Message")
        private String message;

        @NameInMap("Success")
        private String success;

        private Result(Builder builder) {
            this.code = builder.code;
            this.instanceId = builder.instanceId;
            this.message = builder.message;
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
             * The operation status code returned. 200 indicates that the operation was successful.
             */
            public Builder code(String code) {
                this.code = code;
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
             * The result of the operation. For example, when the value of `Code` is 200, the value of `Message` is `successful`.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Indicates whether the operation was successful.
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
