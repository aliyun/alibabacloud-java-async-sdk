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
        this.bucket = builder.bucket;
        this.encodedPolicy = builder.encodedPolicy;
        this.endpoint = builder.endpoint;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
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
        private String bucket; 
        private String encodedPolicy; 
        private String endpoint; 
        private String errorCode; 
        private String errorMessage; 
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
            this.bucket = model.bucket;
            this.encodedPolicy = model.encodedPolicy;
            this.endpoint = model.endpoint;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.objectKey = model.objectKey;
            this.requestId = model.requestId;
            this.securityToken = model.securityToken;
            this.signature = model.signature;
            this.success = model.success;
        } 

        /**
         * AccessKeyId.
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
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
         * EncodedPolicy.
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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AuthorizeFileUploadResponseBody build() {
            return new AuthorizeFileUploadResponseBody(this);
        } 

    } 

}
