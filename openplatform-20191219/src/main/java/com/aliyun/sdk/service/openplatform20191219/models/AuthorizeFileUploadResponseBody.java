// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openplatform20191219.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeFileUploadResponseBody} extends {@link TeaModel}
 *
 * <p>AuthorizeFileUploadResponseBody</p>
 */
public class AuthorizeFileUploadResponseBody extends TeaModel {
    @NameInMap("AccessKeyId")
    private String accessKeyId;

    @NameInMap("Bucket")
    private String bucket;

    @NameInMap("EncodedPolicy")
    private String encodedPolicy;

    @NameInMap("Endpoint")
    private String endpoint;

    @NameInMap("ObjectKey")
    private String objectKey;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Signature")
    private String signature;

    @NameInMap("UseAccelerate")
    private Boolean useAccelerate;

    private AuthorizeFileUploadResponseBody(Builder builder) {
        this.accessKeyId = builder.accessKeyId;
        this.bucket = builder.bucket;
        this.encodedPolicy = builder.encodedPolicy;
        this.endpoint = builder.endpoint;
        this.objectKey = builder.objectKey;
        this.requestId = builder.requestId;
        this.signature = builder.signature;
        this.useAccelerate = builder.useAccelerate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeFileUploadResponseBody create() {
        return builder().build();
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
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return useAccelerate
     */
    public Boolean getUseAccelerate() {
        return this.useAccelerate;
    }

    public static final class Builder {
        private String accessKeyId; 
        private String bucket; 
        private String encodedPolicy; 
        private String endpoint; 
        private String objectKey; 
        private String requestId; 
        private String signature; 
        private Boolean useAccelerate; 

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
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
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
         * Signature.
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * UseAccelerate.
         */
        public Builder useAccelerate(Boolean useAccelerate) {
            this.useAccelerate = useAccelerate;
            return this;
        }

        public AuthorizeFileUploadResponseBody build() {
            return new AuthorizeFileUploadResponseBody(this);
        } 

    } 

}
