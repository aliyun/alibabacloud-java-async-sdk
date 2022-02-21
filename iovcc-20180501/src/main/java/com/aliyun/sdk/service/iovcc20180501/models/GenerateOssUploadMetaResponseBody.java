// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateOssUploadMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateOssUploadMetaResponseBody</p>
 */
public class GenerateOssUploadMetaResponseBody extends TeaModel {
    @NameInMap("OssUploadMeta")
    private OssUploadMeta ossUploadMeta;

    @NameInMap("RequestId")
    private String requestId;

    private GenerateOssUploadMetaResponseBody(Builder builder) {
        this.ossUploadMeta = builder.ossUploadMeta;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateOssUploadMetaResponseBody create() {
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

        public GenerateOssUploadMetaResponseBody build() {
            return new GenerateOssUploadMetaResponseBody(this);
        } 

    } 

    public static class OssUploadMeta extends TeaModel {
        @NameInMap("AccessKeyId")
        private String accessKeyId;

        @NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("ObjectKey")
        private String objectKey;

        @NameInMap("SecurityToken")
        private String securityToken;

        private OssUploadMeta(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.bucket = builder.bucket;
            this.objectKey = builder.objectKey;
            this.securityToken = builder.securityToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssUploadMeta create() {
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
         * @return objectKey
         */
        public String getObjectKey() {
            return this.objectKey;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String bucket; 
            private String objectKey; 
            private String securityToken; 

            /**
             * AccessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * AccessKeySecret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
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
             * SecurityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            public OssUploadMeta build() {
                return new OssUploadMeta(this);
            } 

        } 

    }
}
