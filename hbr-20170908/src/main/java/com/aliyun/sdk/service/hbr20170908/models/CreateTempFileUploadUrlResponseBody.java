// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link CreateTempFileUploadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTempFileUploadUrlResponseBody</p>
 */
public class CreateTempFileUploadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BucketName")
    private String bucketName;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Long expireTime;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OssAccessKeyId")
    private String ossAccessKeyId;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TempFileKey")
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
         * <p>The name of the OSS bucket to which the file is uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>hbr-temp-bucket</p>
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The endpoint that is used to upload the file to OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shenzhen.aliyuncs.com</p>
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>The expiration time of the signature that is used to upload the file to OSS. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1654326678</p>
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The message that is returned. If the call is successful, &quot;successful&quot; is returned. If the call fails, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The AccessKey ID that is used to upload the file to OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI****Up</p>
         */
        public Builder ossAccessKeyId(String ossAccessKeyId) {
            this.ossAccessKeyId = ossAccessKeyId;
            return this;
        }

        /**
         * <p>The policy that is used to upload the file to OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleH****V19</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F4EEB401-DD21-588D-AE3B-1E835C7655E1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The signature that is used to upload the file to OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>RmhI****0A=</p>
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The key that is used to upload the file to OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>temp/1440155109798732/upload/2022-07-29/49bed34c-b430-4e7e-89b1-4be2b734f95c/iaclone.diff</p>
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
