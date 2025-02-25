// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link DetachKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>DetachKeyPairResponseBody</p>
 */
public class DetachKeyPairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailCount")
    private Integer failCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DetachKeyPairResponseBody(Builder builder) {
        this.failCount = builder.failCount;
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
    public java.util.List<Results> getResults() {
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
        private java.util.List<Results> results; 
        private Integer totalCount; 

        /**
         * <p>The total number of simple application servers from which you fail to unbind key pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder failCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The request results.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        /**
         * <p>The total number of simple application servers from which the SSH key pair is unbound.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DetachKeyPairResponseBody build() {
            return new DetachKeyPairResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DetachKeyPairResponseBody} extends {@link TeaModel}
     *
     * <p>DetachKeyPairResponseBody</p>
     */
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
             * <p>The HTTP status code.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The ID of the simple application server.</p>
             * 
             * <strong>example:</strong>
             * <p>aa6e71ddb35c46679bc4753d6219d604</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The response message.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Indicates whether the key pair is unbound from the simple application server successfully. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
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
