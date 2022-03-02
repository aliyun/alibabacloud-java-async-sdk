// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

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
    private String eTag;

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
        this.eTag = builder.eTag;
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
     * @return eTag
     */
    public String getETag() {
        return this.eTag;
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
        private String eTag; 
        private String encodingType; 
        private String key; 
        private String location; 

        /**
         * Bucket.
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * ETag.
         */
        public Builder eTag(String eTag) {
            this.eTag = eTag;
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
         * Location.
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
