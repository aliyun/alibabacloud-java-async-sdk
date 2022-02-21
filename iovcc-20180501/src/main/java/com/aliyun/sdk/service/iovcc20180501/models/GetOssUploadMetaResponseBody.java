// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssUploadMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetOssUploadMetaResponseBody</p>
 */
public class GetOssUploadMetaResponseBody extends TeaModel {
    @NameInMap("OssUploadMeta")
    private OssUploadMeta ossUploadMeta;

    @NameInMap("RequestId")
    private String requestId;

    private GetOssUploadMetaResponseBody(Builder builder) {
        this.ossUploadMeta = builder.ossUploadMeta;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssUploadMetaResponseBody create() {
        return builder().build();
    }

    /**
     * @return ossUploadMeta
     */
    public OssUploadMeta getOssUploadMeta() {
        return this.ossUploadMeta;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OssUploadMeta ossUploadMeta; 
        private String requestId; 

        /**
         * OssUploadMeta.
         */
        public Builder ossUploadMeta(OssUploadMeta ossUploadMeta) {
            this.ossUploadMeta = ossUploadMeta;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOssUploadMetaResponseBody build() {
            return new GetOssUploadMetaResponseBody(this);
        } 

    } 

    public static class OssUploadMeta extends TeaModel {
        @NameInMap("AccessKey")
        private String accessKey;

        @NameInMap("Host")
        private String host;

        @NameInMap("ObjectKey")
        private String objectKey;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("SecurityToken")
        private String securityToken;

        @NameInMap("Signature")
        private String signature;

        private OssUploadMeta(Builder builder) {
            this.accessKey = builder.accessKey;
            this.host = builder.host;
            this.objectKey = builder.objectKey;
            this.policy = builder.policy;
            this.securityToken = builder.securityToken;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssUploadMeta create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return objectKey
         */
        public String getObjectKey() {
            return this.objectKey;
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
            private String accessKey; 
            private String host; 
            private String objectKey; 
            private String policy; 
            private String securityToken; 
            private String signature; 

            /**
             * AccessKey.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * ObjectKey.
             */
            public Builder objectKey(String objectKey) {
                this.objectKey = objectKey;
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
             * SecurityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public OssUploadMeta build() {
                return new OssUploadMeta(this);
            } 

        } 

    }
}
