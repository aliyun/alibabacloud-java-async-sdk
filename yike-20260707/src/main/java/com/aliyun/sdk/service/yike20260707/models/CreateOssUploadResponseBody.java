// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link CreateOssUploadResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOssUploadResponseBody</p>
 */
public class CreateOssUploadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ObjectKey")
    private String objectKey;

    @com.aliyun.core.annotation.NameInMap("OssUrl")
    private String ossUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadCredentials")
    private UploadCredentials uploadCredentials;

    private CreateOssUploadResponseBody(Builder builder) {
        this.objectKey = builder.objectKey;
        this.ossUrl = builder.ossUrl;
        this.requestId = builder.requestId;
        this.uploadCredentials = builder.uploadCredentials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOssUploadResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return objectKey
     */
    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * @return ossUrl
     */
    public String getOssUrl() {
        return this.ossUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploadCredentials
     */
    public UploadCredentials getUploadCredentials() {
        return this.uploadCredentials;
    }

    public static final class Builder {
        private String objectKey; 
        private String ossUrl; 
        private String requestId; 
        private UploadCredentials uploadCredentials; 

        private Builder() {
        } 

        private Builder(CreateOssUploadResponseBody model) {
            this.objectKey = model.objectKey;
            this.ossUrl = model.ossUrl;
            this.requestId = model.requestId;
            this.uploadCredentials = model.uploadCredentials;
        } 

        /**
         * <p>OSS ObjectKey</p>
         */
        public Builder objectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }

        /**
         * <p>The <strong>OSS pre-signed GET URL</strong>, which is valid for 24 hours and uses the public endpoint. If the signature generation fails, null is returned, which does not affect direct upload using the credentials.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://yike-shared-pre-2.oss-cn-shanghai.aliyuncs.com/yike-v1/ge2tqn-o5zv6m/2026/11/18/13/upload/media/hkyo9v003.mp4?Expires=1795095160&OSSAccessKeyId=STS.Nxxxxxxxxxxxxxxxxxxxxxxxx&Signature=xxxxxxxxxxx%3D">https://yike-shared-pre-2.oss-cn-shanghai.aliyuncs.com/yike-v1/ge2tqn-o5zv6m/2026/11/18/13/upload/media/hkyo9v003.mp4?Expires=1795095160&amp;OSSAccessKeyId=STS.Nxxxxxxxxxxxxxxxxxxxxxxxx&amp;Signature=xxxxxxxxxxx%3D</a></p>
         */
        public Builder ossUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }

        /**
         * <p>The <strong>request ID</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>F99F2AE5-***-BBD18F101455</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The upload credentials. Some fields may be empty depending on the CredentialType.</p>
         */
        public Builder uploadCredentials(UploadCredentials uploadCredentials) {
            this.uploadCredentials = uploadCredentials;
            return this;
        }

        public CreateOssUploadResponseBody build() {
            return new CreateOssUploadResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateOssUploadResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOssUploadResponseBody</p>
     */
    public static class UploadCredentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Expiration")
        private String expiration;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("PostAccessKeyId")
        private String postAccessKeyId;

        @com.aliyun.core.annotation.NameInMap("PostEndpoint")
        private String postEndpoint;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("SignedUrl")
        private String signedUrl;

        private UploadCredentials(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.bucket = builder.bucket;
            this.expiration = builder.expiration;
            this.policy = builder.policy;
            this.postAccessKeyId = builder.postAccessKeyId;
            this.postEndpoint = builder.postEndpoint;
            this.region = builder.region;
            this.securityToken = builder.securityToken;
            this.signature = builder.signature;
            this.signedUrl = builder.signedUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadCredentials create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return expiration
         */
        public String getExpiration() {
            return this.expiration;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return postAccessKeyId
         */
        public String getPostAccessKeyId() {
            return this.postAccessKeyId;
        }

        /**
         * @return postEndpoint
         */
        public String getPostEndpoint() {
            return this.postEndpoint;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
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

        /**
         * @return signedUrl
         */
        public String getSignedUrl() {
            return this.signedUrl;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String bucket; 
            private String expiration; 
            private String policy; 
            private String postAccessKeyId; 
            private String postEndpoint; 
            private String region; 
            private String securityToken; 
            private String signature; 
            private String signedUrl; 

            private Builder() {
            } 

            private Builder(UploadCredentials model) {
                this.accessKeyId = model.accessKeyId;
                this.accessKeySecret = model.accessKeySecret;
                this.bucket = model.bucket;
                this.expiration = model.expiration;
                this.policy = model.policy;
                this.postAccessKeyId = model.postAccessKeyId;
                this.postEndpoint = model.postEndpoint;
                this.region = model.region;
                this.securityToken = model.securityToken;
                this.signature = model.signature;
                this.signedUrl = model.signedUrl;
            } 

            /**
             * <p>The STS temporary AccessKey ID.</p>
             * 
             * <strong>example:</strong>
             * <p>STS.Nxxxxxxxxxxxxxxxxxxxxxxxx</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>The STS temporary AccessKey secret.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * <p>OSS Bucket</p>
             * 
             * <strong>example:</strong>
             * <p>yike-shared-cn-shanghai-1</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The expiration time of the credential in UTC and ISO 8601 format. The actual return value prevails.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-20T01:32:40Z</p>
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * <p>The PostObject policy, which is Base64-encoded. This is returned when POST_POLICY is used.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The AccessKey ID used for the signature. This is returned when POST_POLICY is used.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder postAccessKeyId(String postAccessKeyId) {
                this.postAccessKeyId = postAccessKeyId;
                return this;
            }

            /**
             * <p>The target endpoint for the POST request. This is returned when POST_POLICY is used.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder postEndpoint(String postEndpoint) {
                this.postEndpoint = postEndpoint;
                return this;
            }

            /**
             * <p>The OSS region, such as cn-shanghai.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The STS security token.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * <p>The PostObject signature. This is returned when POST_POLICY is used.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * <p>The pre-signed PUT URL. This is returned when PRESIGNED_URL is used.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder signedUrl(String signedUrl) {
                this.signedUrl = signedUrl;
                return this;
            }

            public UploadCredentials build() {
                return new UploadCredentials(this);
            } 

        } 

    }
}
