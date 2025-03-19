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

        private Builder() {
        } 

        private Builder(GetPolicyAttachmentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>ID of the request</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.attachResourceId = model.attachResourceId;
                this.attachResourceType = model.attachResourceType;
                this.config = model.config;
                this.environmentId = model.environmentId;
                this.gatewayId = model.gatewayId;
                this.policyAttachmentId = model.policyAttachmentId;
                this.policyId = model.policyId;
            } 

            /**
             * <p>Attached Resource ID</p>
             * 
             * <strong>example:</strong>
             * <p>op-csbkd9llhtgqhqua***</p>
             */
            public Builder attachResourceId(String attachResourceId) {
                this.attachResourceId = attachResourceId;
                return this;
            }

            /**
             * <p>Attached resource type, HttpApi, GatewayRoute, Operation, GatewayService, GatewayServicePort, Gateway, Domain</p>
             * 
             * <strong>example:</strong>
             * <p>Operation</p>
             */
            public Builder attachResourceType(String attachResourceType) {
                this.attachResourceType = attachResourceType;
                return this;
            }

            /**
             * <p>Policy attachment configuration</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;unitNum&quot;:1,&quot;timeUnit&quot;:&quot;s&quot;,&quot;enable&quot;:true}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>Environment ID</p>
             * 
             * <strong>example:</strong>
             * <p>env-cq7l5s5lhtgi6qa***</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>Gateway Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>gw-cq2vundlhtg***</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>Policy Attachment ID</p>
             * 
             * <strong>example:</strong>
             * <p>pr-cqoojualhtgquuj***</p>
             */
            public Builder policyAttachmentId(String policyAttachmentId) {
                this.policyAttachmentId = policyAttachmentId;
                return this;
            }

            /**
             * <p>Policy ID</p>
             * 
             * <strong>example:</strong>
             * <p>p-cq7l5s5bblhtgi6qas***</p>
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
