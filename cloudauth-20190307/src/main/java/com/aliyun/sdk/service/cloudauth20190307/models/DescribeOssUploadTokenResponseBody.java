// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeOssUploadTokenResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssUploadTokenResponseBody</p>
 */
public class DescribeOssUploadTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OssUploadToken")
    private OssUploadToken ossUploadToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOssUploadTokenResponseBody(Builder builder) {
        this.ossUploadToken = builder.ossUploadToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssUploadTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ossUploadToken
     */
    public OssUploadToken getOssUploadToken() {
        return this.ossUploadToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OssUploadToken ossUploadToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeOssUploadTokenResponseBody model) {
            this.ossUploadToken = model.ossUploadToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Information about the OSS upload Token.</p>
         */
        public Builder ossUploadToken(OssUploadToken ossUploadToken) {
            this.ossUploadToken = ossUploadToken;
            return this;
        }

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>2FA2C773-47DB-4156-B1EE-5B047321A939</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOssUploadTokenResponseBody build() {
            return new DescribeOssUploadTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOssUploadTokenResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOssUploadTokenResponseBody</p>
     */
    public static class OssUploadToken extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("EndPoint")
        private String endPoint;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private Long expired;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Secret")
        private String secret;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        private OssUploadToken(Builder builder) {
            this.bucket = builder.bucket;
            this.endPoint = builder.endPoint;
            this.expired = builder.expired;
            this.key = builder.key;
            this.path = builder.path;
            this.secret = builder.secret;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssUploadToken create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return endPoint
         */
        public String getEndPoint() {
            return this.endPoint;
        }

        /**
         * @return expired
         */
        public Long getExpired() {
            return this.expired;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return secret
         */
        public String getSecret() {
            return this.secret;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private String bucket; 
            private String endPoint; 
            private Long expired; 
            private String key; 
            private String path; 
            private String secret; 
            private String token; 

            private Builder() {
            } 

            private Builder(OssUploadToken model) {
                this.bucket = model.bucket;
                this.endPoint = model.endPoint;
                this.expired = model.expired;
                this.key = model.key;
                this.path = model.path;
                this.secret = model.secret;
                this.token = model.token;
            } 

            /**
             * <p>OSS bucket for file storage.</p>
             * 
             * <strong>example:</strong>
             * <p>cloudauth-zhangjiakou-external</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>Access endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oss-cn-zhangjiakou.aliyuncs.com">https://oss-cn-zhangjiakou.aliyuncs.com</a></p>
             */
            public Builder endPoint(String endPoint) {
                this.endPoint = endPoint;
                return this;
            }

            /**
             * <p>Expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>1582636610000</p>
             */
            public Builder expired(Long expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The Key required for file upload.</p>
             * 
             * <strong>example:</strong>
             * <p>STS.NU8rUBj****</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>File storage path.</p>
             * 
             * <strong>example:</strong>
             * <p>prod/RdNLC@Ox2n-1s7NMt</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The Secret required for file upload.</p>
             * 
             * <strong>example:</strong>
             * <p>FwmnyoqT8dHj7nJLuM67T****</p>
             */
            public Builder secret(String secret) {
                this.secret = secret;
                return this;
            }

            /**
             * <p>The Token required for file upload.</p>
             * 
             * <strong>example:</strong>
             * <p>uWia500nTS5knZaDzq4/KqpvhcLnO****</p>
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public OssUploadToken build() {
                return new OssUploadToken(this);
            } 

        } 

    }
}
