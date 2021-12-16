// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
         * <p>Bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>EncodingType.</p>
         */
        public Builder encodingType(String encodingType) {
            this.encodingType = encodingType;
            return this;
        }

        /**
         * <p>Key.</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>UploadId.</p>
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
