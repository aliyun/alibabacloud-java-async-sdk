// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetPolicyAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolicyAttachmentResponseBody</p>
 */
public class GetPolicyAttachmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetPolicyAttachmentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolicyAttachmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2C3B9A12-3868-5EB9-fBEA-F99E03DD1***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPolicyAttachmentResponseBody build() {
            return new GetPolicyAttachmentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPolicyAttachmentResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyAttachmentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attachResourceId")
        private String attachResourceId;

        @com.aliyun.core.annotation.NameInMap("attachResourceType")
        private String attachResourceType;

        @com.aliyun.core.annotation.NameInMap("config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("policyAttachmentId")
        private String policyAttachmentId;

        @com.aliyun.core.annotation.NameInMap("policyId")
        private String policyId;

        private Data(Builder builder) {
            this.attachResourceId = builder.attachResourceId;
            this.attachResourceType = builder.attachResourceType;
            this.config = builder.config;
            this.environmentId = builder.environmentId;
            this.gatewayId = builder.gatewayId;
            this.policyAttachmentId = builder.policyAttachmentId;
            this.policyId = builder.policyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return attachResourceId
         */
        public String getAttachResourceId() {
            return this.attachResourceId;
        }

        /**
         * @return attachResourceType
         */
        public String getAttachResourceType() {
            return this.attachResourceType;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return policyAttachmentId
         */
        public String getPolicyAttachmentId() {
            return this.policyAttachmentId;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        public static final class Builder {
            private String attachResourceId; 
            private String attachResourceType; 
            private String config; 
            private String environmentId; 
            private String gatewayId; 
            private String policyAttachmentId; 
            private String policyId; 

            /**
             * attachResourceId.
             */
            public Builder attachResourceId(String attachResourceId) {
                this.attachResourceId = attachResourceId;
                return this;
            }

            /**
             * attachResourceType.
             */
            public Builder attachResourceType(String attachResourceType) {
                this.attachResourceType = attachResourceType;
                return this;
            }

            /**
             * config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * environmentId.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * gatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * policyAttachmentId.
             */
            public Builder policyAttachmentId(String policyAttachmentId) {
                this.policyAttachmentId = policyAttachmentId;
                return this;
            }

            /**
             * policyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
