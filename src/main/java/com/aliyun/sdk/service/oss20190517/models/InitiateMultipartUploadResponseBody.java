// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link InitiateMultipartUploadResponseBody} extends {@link TeaModel}
 *
 * <p>InitiateMultipartUploadResponseBody</p>
 */
public class InitiateMultipartUploadResponseBody extends TeaModel {
    @ParentIgnore("InitiateMultipartUploadResult")
    @NameInMap("Bucket")
    private String bucket;

    @ParentIgnore("InitiateMultipartUploadResult")
    @NameInMap("EncodingType")
    private String encodingType;

    @ParentIgnore("InitiateMultipartUploadResult")
    @NameInMap("Key")
    private String key;

    @ParentIgnore("InitiateMultipartUploadResult")
    @NameInMap("UploadId")
    private String uploadId;

    private InitiateMultipartUploadResponseBody(Builder builder) {
        this.bucket = builder.bucket;
        this.encodingType = builder.encodingType;
        this.key = builder.key;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitiateMultipartUploadResponseBody create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return encodingType
     */
    public String getEncodingType() {
        return this.encodingType;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    public static final class Builder {
        private String bucket; 
        private String encodingType; 
        private String key; 
        private String uploadId; 

        /**
         * Bucket.
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * EncodingType.
         */
        public Builder encodingType(String encodingType) {
            this.encodingType = encodingType;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * UploadId.
         */
        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        public InitiateMultipartUploadResponseBody build() {
            return new InitiateMultipartUploadResponseBody(this);
        } 

    } 

}
