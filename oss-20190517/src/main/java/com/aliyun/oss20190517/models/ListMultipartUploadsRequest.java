// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListMultipartUploadsRequest} extends {@link RequestModel}
 *
 * <p>ListMultipartUploadsRequest</p>
 */
public class ListMultipartUploadsRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("delimiter")
    private String delimiter;

    @Query
    @NameInMap("encoding-type")
    private String encodingType;

    @Query
    @NameInMap("key-marker")
    private String keyMarker;

    @Query
    @NameInMap("max-uploads")
    private String maxUploads;

    @Query
    @NameInMap("prefix")
    private String prefix;

    @Query
    @NameInMap("upload-id-marker")
    private String uploadIdMarker;


    private ListMultipartUploadsRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.delimiter = builder.delimiter;
        this.encodingType = builder.encodingType;
        this.keyMarker = builder.keyMarker;
        this.maxUploads = builder.maxUploads;
        this.prefix = builder.prefix;
        this.uploadIdMarker = builder.uploadIdMarker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMultipartUploadsRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return delimiter
     */
    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * @return encodingType
     */
    public String getEncodingType() {
        return this.encodingType;
    }

    /**
     * @return keyMarker
     */
    public String getKeyMarker() {
        return this.keyMarker;
    }

    /**
     * @return maxUploads
     */
    public String getMaxUploads() {
        return this.maxUploads;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return uploadIdMarker
     */
    public String getUploadIdMarker() {
        return this.uploadIdMarker;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String bucket; 
        private String delimiter; 
        private String encodingType; 
        private String keyMarker; 
        private String maxUploads; 
        private String prefix; 
        private String uploadIdMarker; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>delimiter.</p>
         */
        public Builder delimiter(String delimiter) {
            this.putQueryParameter("delimiter", delimiter);
            this.delimiter = delimiter;
            return this;
        }

        /**
         * <p>encoding-type.</p>
         */
        public Builder encodingType(String encodingType) {
            this.putQueryParameter("encoding-type", encodingType);
            this.encodingType = encodingType;
            return this;
        }

        /**
         * <p>key-marker.</p>
         */
        public Builder keyMarker(String keyMarker) {
            this.putQueryParameter("key-marker", keyMarker);
            this.keyMarker = keyMarker;
            return this;
        }

        /**
         * <p>max-uploads.</p>
         */
        public Builder maxUploads(String maxUploads) {
            this.putQueryParameter("max-uploads", maxUploads);
            this.maxUploads = maxUploads;
            return this;
        }

        /**
         * <p>prefix.</p>
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * <p>upload-id-marker.</p>
         */
        public Builder uploadIdMarker(String uploadIdMarker) {
            this.putQueryParameter("upload-id-marker", uploadIdMarker);
            this.uploadIdMarker = uploadIdMarker;
            return this;
        }

        public ListMultipartUploadsRequest build() {
            return new ListMultipartUploadsRequest(this);
        } 

    } 

}
