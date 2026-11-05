// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dtsai20260401.models;

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
 * {@link AuthorizeFileUploadResponseBody} extends {@link TeaModel}
 *
 * <p>AuthorizeFileUploadResponseBody</p>
 */
public class AuthorizeFileUploadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessKeyId")
    private String accessKeyId;

    @com.aliyun.core.annotation.NameInMap("Authorizations")
    private java.util.List<Authorizations> authorizations;

    @com.aliyun.core.annotation.NameInMap("Bucket")
    private String bucket;

    @com.aliyun.core.annotation.NameInMap("EncodedPolicy")
    private String encodedPolicy;

    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Long expireTime;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("ObjectKey")
    private String objectKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AuthorizeFileUploadResponseBody(Builder builder) {
        this.accessKeyId = builder.accessKeyId;
        this.authorizations = builder.authorizations;
        this.bucket = builder.bucket;
        this.encodedPolicy = builder.encodedPolicy;
        this.endpoint = builder.endpoint;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.expireTime = builder.expireTime;
        this.httpStatusCode = builder.httpStatusCode;
        this.objectKey = builder.objectKey;
        this.requestId = builder.requestId;
        this.securityToken = builder.securityToken;
        this.signature = builder.signature;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeFileUploadResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * @return authorizations
     */
    public java.util.List<Authorizations> getAuthorizations() {
        return this.authorizations;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return encodedPolicy
     */
    public String getEncodedPolicy() {
        return this.encodedPolicy;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return objectKey
     */
    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessKeyId; 
        private java.util.List<Authorizations> authorizations; 
        private String bucket; 
        private String encodedPolicy; 
        private String endpoint; 
        private String errorCode; 
        private String errorMessage; 
        private Long expireTime; 
        private Integer httpStatusCode; 
        private String objectKey; 
        private String requestId; 
        private String securityToken; 
        private String signature; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AuthorizeFileUploadResponseBody model) {
            this.accessKeyId = model.accessKeyId;
            this.authorizations = model.authorizations;
            this.bucket = model.bucket;
            this.encodedPolicy = model.encodedPolicy;
            this.endpoint = model.endpoint;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.expireTime = model.expireTime;
            this.httpStatusCode = model.httpStatusCode;
            this.objectKey = model.objectKey;
            this.requestId = model.requestId;
            this.securityToken = model.securityToken;
            this.signature = model.signature;
            this.success = model.success;
        } 

        /**
         * <p>The temporary AccessKey ID used for OSS PostObject.</p>
         * 
         * <strong>example:</strong>
         * <p>STS.NV5xxx</p>
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * <p>The list of OSS PostObject direct upload authorizations returned in batch.</p>
         */
        public Builder authorizations(java.util.List<Authorizations> authorizations) {
            this.authorizations = authorizations;
            return this;
        }

        /**
         * <p>The destination OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>dts-ai-upload-cn-beijing7500163e0eae09</p>
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>The Base64-encoded PostObject policy, which includes the object key and file size limits.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjo...</p>
         */
        public Builder encodedPolicy(String encodedPolicy) {
            this.encodedPolicy = encodedPolicy;
            return this;
        }

        /**
         * <p>OSS Endpoint</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-beijing.aliyuncs.com</p>
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The parameter [Query] is not valid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The expiration time of the OSS PostObject direct upload authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The business semantic status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The object key that must be used exactly as provided for the upload.</p>
         * 
         * <strong>example:</strong>
         * <p>0a1b_123456_0123456789abcdef0123456789abcdef</p>
         */
        public Builder objectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A30D0930-xxxx-xxxx-xxxx-C2C661CC8B58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The temporary Security Token Service (STS) token.</p>
         * 
         * <strong>example:</strong>
         * <p>CAISxxx</p>
         */
        public Builder securityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The policy signature.</p>
         * 
         * <strong>example:</strong>
         * <p>masked-signature</p>
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AuthorizeFileUploadResponseBody build() {
            return new AuthorizeFileUploadResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AuthorizeFileUploadResponseBody} extends {@link TeaModel}
     *
     * <p>AuthorizeFileUploadResponseBody</p>
     */
    public static class Authorizations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodedPolicy")
        private String encodedPolicy;

        @com.aliyun.core.annotation.NameInMap("ObjectKey")
        private String objectKey;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        private Authorizations(Builder builder) {
            this.encodedPolicy = builder.encodedPolicy;
            this.objectKey = builder.objectKey;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Authorizations create() {
            return builder().build();
        }

        /**
         * @return encodedPolicy
         */
        public String getEncodedPolicy() {
            return this.encodedPolicy;
        }

        /**
         * @return objectKey
         */
        public String getObjectKey() {
            return this.objectKey;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        public static final class Builder {
            private String encodedPolicy; 
            private String objectKey; 
            private String signature; 

            private Builder() {
            } 

            private Builder(Authorizations model) {
                this.encodedPolicy = model.encodedPolicy;
                this.objectKey = model.objectKey;
                this.signature = model.signature;
            } 

            /**
             * <p>The Base64-encoded PostObject policy, which includes the object key and file size limits.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJleHBpcmF0aW9uIjo...</p>
             */
            public Builder encodedPolicy(String encodedPolicy) {
                this.encodedPolicy = encodedPolicy;
                return this;
            }

            /**
             * <p>The object key that must be used exactly as provided for the upload.</p>
             * 
             * <strong>example:</strong>
             * <p>0a1b_123456_0123456789abcdef0123456789abcdef</p>
             */
            public Builder objectKey(String objectKey) {
                this.objectKey = objectKey;
                return this;
            }

            /**
             * <p>The policy signature.</p>
             * 
             * <strong>example:</strong>
             * <p>masked-signature</p>
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public Authorizations build() {
                return new Authorizations(this);
            } 

        } 

    }
}
