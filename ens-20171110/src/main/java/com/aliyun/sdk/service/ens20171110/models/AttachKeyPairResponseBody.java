// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link AttachKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>AttachKeyPairResponseBody</p>
 */
public class AttachKeyPairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailCount")
    private Integer failCount;

    @com.aliyun.core.annotation.NameInMap("KeyPairId")
    private String keyPairId;

    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private AttachKeyPairResponseBody(Builder builder) {
        this.failCount = builder.failCount;
        this.keyPairId = builder.keyPairId;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failCount
     */
    public Integer getFailCount() {
        return this.failCount;
    }

    /**
     * @return keyPairId
     */
    public String getKeyPairId() {
        return this.keyPairId;
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
        private String keyPairId; 
        private String keyPairName; 
        private String requestId; 
        private java.util.List<Results> results; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(AttachKeyPairResponseBody model) {
            this.failCount = model.failCount;
            this.keyPairId = model.keyPairId;
            this.keyPairName = model.keyPairName;
            this.requestId = model.requestId;
            this.results = model.results;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of instances where the attachment failed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder failCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }

        /**
         * <p>The key pair ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ssh-xxx</p>
         */
        public Builder keyPairId(String keyPairId) {
            this.keyPairId = keyPairId;
            return this;
        }

        /**
         * <p>The key pair name.</p>
         * 
         * <strong>example:</strong>
         * <p>ssh-xxx</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xx-xx-xx-xx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The attachment results for each instance.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        /**
         * <p>The total number of instances in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
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
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

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
        public Integer getCode() {
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
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private Integer code; 
            private String instanceId; 
            private String message; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.code = model.code;
                this.instanceId = model.instanceId;
                this.message = model.message;
                this.success = model.success;
            } 

            /**
             * <p>The status code for the operation. A value of <code>200</code> indicates success.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-xxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The response message. If the <code>Code</code> is <code>200</code>, this message is <code>successful</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>successful</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Indicates if the operation succeeded for the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
