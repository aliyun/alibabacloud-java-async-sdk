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
    @NameInMap("Bucket")
    private String bucket;

    @ParentIgnore("CompleteMultipartUploadResult")
    @NameInMap("ETag")
    private String ETag;

    @ParentIgnore("CompleteMultipartUploadResult")
    @NameInMap("EncodingType")
    private String encodingType;

    @ParentIgnore("CompleteMultipartUploadResult")
    @NameInMap("Key")
    private String key;

    @ParentIgnore("CompleteMultipartUploadResult")
    @NameInMap("Location")
    private String location;


    private CompleteMultipartUploadResponseBody(Builder builder) {
        this.bucket = builder.bucket;
        this.ETag = builder.ETag;
        this.encodingType = builder.encodingType;
        this.key = builder.key;
        this.location = builder.location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteMultipartUploadResponseBody create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return ETag
     */
    public String getETag() {
        return this.ETag;
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
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    public static final class Builder {
        private String bucket; 
        private String ETag; 
        private String encodingType; 
        private String key; 
        private String location; 

        /**
         * <p>Bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>ETag.</p>
         */
        public Builder ETag(String ETag) {
            this.ETag = ETag;
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
         * <p>Location.</p>
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public CompleteMultipartUploadResponseBody build() {
            return new CompleteMultipartUploadResponseBody(this);
        } 

    } 

}
