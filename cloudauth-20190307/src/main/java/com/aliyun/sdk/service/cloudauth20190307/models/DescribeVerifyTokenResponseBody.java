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
 * {@link DescribeVerifyTokenResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVerifyTokenResponseBody</p>
 */
public class DescribeVerifyTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OssUploadToken")
    private OssUploadToken ossUploadToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VerifyPageUrl")
    private String verifyPageUrl;

    @com.aliyun.core.annotation.NameInMap("VerifyToken")
    private String verifyToken;

    private DescribeVerifyTokenResponseBody(Builder builder) {
        this.ossUploadToken = builder.ossUploadToken;
        this.requestId = builder.requestId;
        this.verifyPageUrl = builder.verifyPageUrl;
        this.verifyToken = builder.verifyToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifyTokenResponseBody create() {
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

    /**
     * @return verifyPageUrl
     */
    public String getVerifyPageUrl() {
        return this.verifyPageUrl;
    }

    /**
     * @return verifyToken
     */
    public String getVerifyToken() {
        return this.verifyToken;
    }

    public static final class Builder {
        private OssUploadToken ossUploadToken; 
        private String requestId; 
        private String verifyPageUrl; 
        private String verifyToken; 

        private Builder() {
        } 

        private Builder(DescribeVerifyTokenResponseBody model) {
            this.ossUploadToken = model.ossUploadToken;
            this.requestId = model.requestId;
            this.verifyPageUrl = model.verifyPageUrl;
            this.verifyToken = model.verifyToken;
        } 

        /**
         * <p>OSS upload token information.</p>
         */
        public Builder ossUploadToken(OssUploadToken ossUploadToken) {
            this.ossUploadToken = ossUploadToken;
            return this;
        }

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The entry link for the original H5 verification scheme, which has been discontinued and no longer supports new integrations. If you need to integrate an H5 verification scheme, it is recommended to use the <a href="https://help.aliyun.com/document_detail/173779.html">PC or mobile H5 web integration solution</a> of financial-grade real-person authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
         */
        public Builder verifyPageUrl(String verifyPageUrl) {
            this.verifyPageUrl = verifyPageUrl;
            return this;
        }

        /**
         * <p>The token for this verification, used to link various interfaces in the verification request, valid for 30 minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>c302c0797679457685410ee51a5ba375</p>
         */
        public Builder verifyToken(String verifyToken) {
            this.verifyToken = verifyToken;
            return this;
        }

        public DescribeVerifyTokenResponseBody build() {
            return new DescribeVerifyTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVerifyTokenResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyTokenResponseBody</p>
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
             * <p>OSS file storage bucket.</p>
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
             * <p>Expiration time. Expressed in timestamp format, unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1582636610000</p>
             */
            public Builder expired(Long expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The key required for file upload.</p>
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
             * <p>The secret required for file upload.</p>
             * 
             * <strong>example:</strong>
             * <p>FwmnyoqT8dHj7nJLuM67T****</p>
             */
            public Builder secret(String secret) {
                this.secret = secret;
                return this;
            }

            /**
             * <p>The token required for file upload.</p>
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
