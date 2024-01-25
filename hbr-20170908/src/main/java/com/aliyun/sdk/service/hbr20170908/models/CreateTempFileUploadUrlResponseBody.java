// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTempFileUploadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTempFileUploadUrlResponseBody</p>
 */
public class CreateTempFileUploadUrlResponseBody extends TeaModel {
    @NameInMap("BucketName")
    private String bucketName;

    @NameInMap("Code")
    private String code;

    @NameInMap("Endpoint")
    private String endpoint;

    @NameInMap("ExpireTime")
    private Long expireTime;

    @NameInMap("Message")
    private String message;

    @NameInMap("OssAccessKeyId")
    private String ossAccessKeyId;

    @NameInMap("Policy")
    private String policy;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Signature")
    private String signature;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TempFileKey")
    private String tempFileKey;

    private CreateTempFileUploadUrlResponseBody(Builder builder) {
        this.bucketName = builder.bucketName;
        this.code = builder.code;
        this.endpoint = builder.endpoint;
        this.expireTime = builder.expireTime;
        this.message = builder.message;
        this.ossAccessKeyId = builder.ossAccessKeyId;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.signature = builder.signature;
        this.success = builder.success;
        this.tempFileKey = builder.tempFileKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTempFileUploadUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return ossAccessKeyId
     */
    public String getOssAccessKeyId() {
        return this.ossAccessKeyId;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    /**
     * @return tempFileKey
     */
    public String getTempFileKey() {
        return this.tempFileKey;
    }

    public static final class Builder {
        private String bucketName; 
        private String code; 
        private String endpoint; 
        private Long expireTime; 
        private String message; 
        private String ossAccessKeyId; 
        private String policy; 
        private String requestId; 
        private String signature; 
        private Boolean success; 
        private String tempFileKey; 

        /**
         * The name of the OSS bucket to which the file is uploaded.
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * The HTTP status code. The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The endpoint that is used to upload the file to OSS.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * The expiration time of the signature that is used to upload the file to OSS. This value is a UNIX timestamp. Unit: seconds.
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The AccessKey ID that is used to upload the file to OSS.
         */
        public Builder ossAccessKeyId(String ossAccessKeyId) {
            this.ossAccessKeyId = ossAccessKeyId;
            return this;
        }

        /**
         * The policy that is used to upload the file to OSS.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The signature that is used to upload the file to OSS.
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The key that is used to upload the file to OSS.
         */
        public Builder tempFileKey(String tempFileKey) {
            this.tempFileKey = tempFileKey;
            return this;
        }

        public CreateTempFileUploadUrlResponseBody build() {
            return new CreateTempFileUploadUrlResponseBody(this);
        } 

    } 

}
