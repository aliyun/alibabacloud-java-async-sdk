// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link UploadFormInfo} extends {@link TeaModel}
 *
 * <p>UploadFormInfo</p>
 */
public class UploadFormInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bucket_name")
    private String bucketName;

    @com.aliyun.core.annotation.NameInMap("endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("form_data")
    private java.util.Map<String, String> formData;

    @com.aliyun.core.annotation.NameInMap("object_key")
    private String objectKey;

    @com.aliyun.core.annotation.NameInMap("oss_access_key_id")
    private String ossAccessKeyId;

    @com.aliyun.core.annotation.NameInMap("oss_end_point")
    private String ossEndPoint;

    @com.aliyun.core.annotation.NameInMap("oss_security_token")
    private String ossSecurityToken;

    @com.aliyun.core.annotation.NameInMap("policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("signature")
    private String signature;

    private UploadFormInfo(Builder builder) {
        this.bucketName = builder.bucketName;
        this.endpoint = builder.endpoint;
        this.formData = builder.formData;
        this.objectKey = builder.objectKey;
        this.ossAccessKeyId = builder.ossAccessKeyId;
        this.ossEndPoint = builder.ossEndPoint;
        this.ossSecurityToken = builder.ossSecurityToken;
        this.policy = builder.policy;
        this.signature = builder.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadFormInfo create() {
        return builder().build();
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return formData
     */
    public java.util.Map<String, String> getFormData() {
        return this.formData;
    }

    /**
     * @return objectKey
     */
    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * @return ossAccessKeyId
     */
    public String getOssAccessKeyId() {
        return this.ossAccessKeyId;
    }

    /**
     * @return ossEndPoint
     */
    public String getOssEndPoint() {
        return this.ossEndPoint;
    }

    /**
     * @return ossSecurityToken
     */
    public String getOssSecurityToken() {
        return this.ossSecurityToken;
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

    public static final class Builder {
        private String bucketName; 
        private String endpoint; 
        private java.util.Map<String, String> formData; 
        private String objectKey; 
        private String ossAccessKeyId; 
        private String ossEndPoint; 
        private String ossSecurityToken; 
        private String policy; 
        private String signature; 

        /**
         * bucket_name.
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * form_data.
         */
        public Builder formData(java.util.Map<String, String> formData) {
            this.formData = formData;
            return this;
        }

        /**
         * object_key.
         */
        public Builder objectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }

        /**
         * oss_access_key_id.
         */
        public Builder ossAccessKeyId(String ossAccessKeyId) {
            this.ossAccessKeyId = ossAccessKeyId;
            return this;
        }

        /**
         * oss_end_point.
         */
        public Builder ossEndPoint(String ossEndPoint) {
            this.ossEndPoint = ossEndPoint;
            return this;
        }

        /**
         * oss_security_token.
         */
        public Builder ossSecurityToken(String ossSecurityToken) {
            this.ossSecurityToken = ossSecurityToken;
            return this;
        }

        /**
         * policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * signature.
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        public UploadFormInfo build() {
            return new UploadFormInfo(this);
        } 

    } 

}
