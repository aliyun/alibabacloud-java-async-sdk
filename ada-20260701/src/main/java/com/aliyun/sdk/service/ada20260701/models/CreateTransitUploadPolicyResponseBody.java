// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ada20260701.models;

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
 * {@link CreateTransitUploadPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitUploadPolicyResponseBody</p>
 */
public class CreateTransitUploadPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FilePath")
    private String filePath;

    @com.aliyun.core.annotation.NameInMap("PolicyInfo")
    private PolicyInfo policyInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TransitId")
    private String transitId;

    private CreateTransitUploadPolicyResponseBody(Builder builder) {
        this.filePath = builder.filePath;
        this.policyInfo = builder.policyInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.transitId = builder.transitId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitUploadPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return policyInfo
     */
    public PolicyInfo getPolicyInfo() {
        return this.policyInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return transitId
     */
    public String getTransitId() {
        return this.transitId;
    }

    public static final class Builder {
        private String filePath; 
        private PolicyInfo policyInfo; 
        private String requestId; 
        private Boolean success; 
        private String transitId; 

        private Builder() {
        } 

        private Builder(CreateTransitUploadPolicyResponseBody model) {
            this.filePath = model.filePath;
            this.policyInfo = model.policyInfo;
            this.requestId = model.requestId;
            this.success = model.success;
            this.transitId = model.transitId;
        } 

        /**
         * <p>The object storage key, which is also the <code>key</code> field in the PostObject form.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-bundle/tenant-demo/user-demo/20260904120000_0123456789abcdef0123456789abcdef.zip</p>
         */
        public Builder filePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>The upload policy object. For the complete list of subfields, see the following table.</p>
         */
        public Builder policyInfo(PolicyInfo policyInfo) {
            this.policyInfo = policyInfo;
            return this;
        }

        /**
         * <p>The request ID, used for Tracing Analysis and troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the upload policy is generated. A successful response always returns <code>true</code>. An error response is returned upon failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The ID of the newly created Transit record, used for subsequent queries and storage operations.</p>
         * 
         * <strong>example:</strong>
         * <p>transit_0123456789abcdef0123456789abcdef</p>
         */
        public Builder transitId(String transitId) {
            this.transitId = transitId;
            return this;
        }

        public CreateTransitUploadPolicyResponseBody build() {
            return new CreateTransitUploadPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateTransitUploadPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTransitUploadPolicyResponseBody</p>
     */
    public static class PolicyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessId")
        private String accessId;

        @com.aliyun.core.annotation.NameInMap("Dir")
        private String dir;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        private PolicyInfo(Builder builder) {
            this.accessId = builder.accessId;
            this.dir = builder.dir;
            this.host = builder.host;
            this.policy = builder.policy;
            this.securityToken = builder.securityToken;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyInfo create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
        }

        /**
         * @return dir
         */
        public String getDir() {
            return this.dir;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        public static final class Builder {
            private String accessId; 
            private String dir; 
            private String host; 
            private String policy; 
            private String securityToken; 
            private String signature; 

            private Builder() {
            } 

            private Builder(PolicyInfo model) {
                this.accessId = model.accessId;
                this.dir = model.dir;
                this.host = model.host;
                this.policy = model.policy;
                this.securityToken = model.securityToken;
                this.signature = model.signature;
            } 

            /**
             * <p>The <code>OSSAccessKeyId</code> field in the PostObject form. Protect this value together with the entire <code>PolicyInfo</code>.</p>
             * 
             * <strong>example:</strong>
             * <REDACTED>
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * <p>The object storage key. The value is the same as the top-level <code>FilePath</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>skill-bundle/tenant-demo/user-demo/20260904120000_0123456789abcdef0123456789abcdef.zip</p>
             */
            public Builder dir(String dir) {
                this.dir = dir;
                return this;
            }

            /**
             * <p>The target URL to which the client sends the PostObject request.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://upload.example.invalid">https://upload.example.invalid</a></p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The Base64-encoded PostObject upload policy. Protect this value together with the entire <code>PolicyInfo</code>.</p>
             * 
             * <strong>example:</strong>
             * <REDACTED>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The <code>x-oss-security-token</code> field in the PostObject form when STS credentials are used. This field may be empty when STS is not used. This field contains sensitive authorization information.</p>
             * 
             * <strong>example:</strong>
             * <REDACTED>
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * <p>The signature field in the PostObject form. This field contains sensitive authorization information.</p>
             * 
             * <strong>example:</strong>
             * <REDACTED>
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public PolicyInfo build() {
                return new PolicyInfo(this);
            } 

        } 

    }
}
