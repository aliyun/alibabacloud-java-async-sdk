// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AttachKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>AttachKeyPairResponseBody</p>
 */
public class AttachKeyPairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailCount")
    private String failCount;

    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private Results results;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private AttachKeyPairResponseBody(Builder builder) {
        this.failCount = builder.failCount;
        this.keyPairName = builder.keyPairName;
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
         * <p>The number of instances to which the SSH key pair fails to be bound.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder failCount(String failCount) {
            this.failCount = failCount;
            return this;
        }

        /**
         * <p>The name of the SSH key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>testKeyPairName</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that contains the results of the operation.</p>
         */
        public Builder results(Results results) {
            this.results = results;
            return this;
        }

        /**
         * <p>The total number of instances to which the SSH key pair is bound.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public AttachKeyPairResponseBody build() {
            return new AttachKeyPairResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AttachKeyPairResponseBody} extends {@link TeaModel}
     *
     * <p>AttachKeyPairResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Success")
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
             * <p>The operation status code returned. 200 indicates that the operation was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-m5eg7be9ndloji64****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The operation information returned. When the value of Code is 200, the value of Message is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>successful</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Indicates whether the request was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link AttachKeyPairResponseBody} extends {@link TeaModel}
     *
     * <p>AttachKeyPairResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
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
