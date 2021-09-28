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
    @NameInMap("Key")
    private String key;

    @ParentIgnore("InitiateMultipartUploadResult")
    @NameInMap("UploadId")
    private String uploadId;

    @ParentIgnore("InitiateMultipartUploadResult")
    @NameInMap("EncodingType")
    private String encodingType;


    private InitiateMultipartUploadResponseBody(Builder builder) {
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.uploadId = builder.uploadId;
        this.encodingType = builder.encodingType;
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
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return key
     */
    public String key() {
        return this.key;
    }

    /**
     * @return uploadId
     */
    public String uploadId() {
        return this.uploadId;
    }

    /**
     * @return encodingType
     */
    public String encodingType() {
        return this.encodingType;
    }

    public static final class Builder {
        private String bucket; 
        private String key; 
        private String uploadId; 
        private String encodingType; 

        /**
         * <p>Bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
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

        /**
         * <p>EncodingType.</p>
         */
        public Builder encodingType(String encodingType) {
            this.encodingType = encodingType;
            return this;
        }

        public InitiateMultipartUploadResponseBody build() {
            return new InitiateMultipartUploadResponseBody(this);
        } 

    } 

}
