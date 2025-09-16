// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateRoutineWithAssetsCodeVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRoutineWithAssetsCodeVersionResponseBody</p>
 */
public class CreateRoutineWithAssetsCodeVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CodeVersion")
    private String codeVersion;

    @com.aliyun.core.annotation.NameInMap("OssPostConfig")
    private OssPostConfig ossPostConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateRoutineWithAssetsCodeVersionResponseBody(Builder builder) {
        this.codeVersion = builder.codeVersion;
        this.ossPostConfig = builder.ossPostConfig;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoutineWithAssetsCodeVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeVersion
     */
    public String getCodeVersion() {
        return this.codeVersion;
    }

    /**
     * @return ossPostConfig
     */
    public OssPostConfig getOssPostConfig() {
        return this.ossPostConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String codeVersion; 
        private OssPostConfig ossPostConfig; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateRoutineWithAssetsCodeVersionResponseBody model) {
            this.codeVersion = model.codeVersion;
            this.ossPostConfig = model.ossPostConfig;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * CodeVersion.
         */
        public Builder codeVersion(String codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }

        /**
         * OssPostConfig.
         */
        public Builder ossPostConfig(OssPostConfig ossPostConfig) {
            this.ossPostConfig = ossPostConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateRoutineWithAssetsCodeVersionResponseBody build() {
            return new CreateRoutineWithAssetsCodeVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateRoutineWithAssetsCodeVersionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRoutineWithAssetsCodeVersionResponseBody</p>
     */
    public static class OssPostConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("OSSAccessKeyId")
        private String OSSAccessKeyId;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("XOssSecurityToken")
        private String xOssSecurityToken;

        private OssPostConfig(Builder builder) {
            this.key = builder.key;
            this.OSSAccessKeyId = builder.OSSAccessKeyId;
            this.policy = builder.policy;
            this.signature = builder.signature;
            this.url = builder.url;
            this.xOssSecurityToken = builder.xOssSecurityToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssPostConfig create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return OSSAccessKeyId
         */
        public String getOSSAccessKeyId() {
            return this.OSSAccessKeyId;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return xOssSecurityToken
         */
        public String getXOssSecurityToken() {
            return this.xOssSecurityToken;
        }

        public static final class Builder {
            private String key; 
            private String OSSAccessKeyId; 
            private String policy; 
            private String signature; 
            private String url; 
            private String xOssSecurityToken; 

            private Builder() {
            } 

            private Builder(OssPostConfig model) {
                this.key = model.key;
                this.OSSAccessKeyId = model.OSSAccessKeyId;
                this.policy = model.policy;
                this.signature = model.signature;
                this.url = model.url;
                this.xOssSecurityToken = model.xOssSecurityToken;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * OSSAccessKeyId.
             */
            public Builder OSSAccessKeyId(String OSSAccessKeyId) {
                this.OSSAccessKeyId = OSSAccessKeyId;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * XOssSecurityToken.
             */
            public Builder xOssSecurityToken(String xOssSecurityToken) {
                this.xOssSecurityToken = xOssSecurityToken;
                return this;
            }

            public OssPostConfig build() {
                return new OssPostConfig(this);
            } 

        } 

    }
}
