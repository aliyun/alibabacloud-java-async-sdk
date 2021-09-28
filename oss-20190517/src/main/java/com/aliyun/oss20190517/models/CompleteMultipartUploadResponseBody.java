// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CompleteMultipartUploadResponseBody} extends {@link TeaModel}
 *
 * <p>CompleteMultipartUploadResponseBody</p>
 */
public class CompleteMultipartUploadResponseBody extends TeaModel {
    @ParentIgnore("CompleteMultipartUploadResult")
    @NameInMap("EncodingType")
    private String encodingType;

    @ParentIgnore("CompleteMultipartUploadResult")
    @NameInMap("Location")
    private String location;

    @ParentIgnore("CompleteMultipartUploadResult")
    @NameInMap("Bucket")
    private String bucket;

    @ParentIgnore("CompleteMultipartUploadResult")
    @NameInMap("Key")
    private String key;

    @ParentIgnore("CompleteMultipartUploadResult")
    @NameInMap("ETag")
    private String ETag;


    private CompleteMultipartUploadResponseBody(Builder builder) {
        this.encodingType = builder.encodingType;
        this.location = builder.location;
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.ETag = builder.ETag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteMultipartUploadResponseBody create() {
        return builder().build();
    }

    /**
     * @return encodingType
     */
    public String encodingType() {
        return this.encodingType;
    }

    /**
     * @return location
     */
    public String location() {
        return this.location;
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
     * @return ETag
     */
    public String ETag() {
        return this.ETag;
    }

    public static final class Builder {
        private String encodingType; 
        private String location; 
        private String bucket; 
        private String key; 
        private String ETag; 

        /**
         * <p>EncodingType.</p>
         */
        public Builder encodingType(String encodingType) {
            this.encodingType = encodingType;
            return this;
        }

        /**
         * <p>Location.</p>
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

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
         * <p>ETag.</p>
         */
        public Builder ETag(String ETag) {
            this.ETag = ETag;
            return this;
        }

        public CompleteMultipartUploadResponseBody build() {
            return new CompleteMultipartUploadResponseBody(this);
        } 

    } 

}
