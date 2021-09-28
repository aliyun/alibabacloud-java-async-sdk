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
    @Query
    @NameInMap("delimiter")
    private String delimiter;

    @Query
    @NameInMap("max-uploads")
    private String maxUploads;

    @Query
    @NameInMap("key-marker")
    private String keyMarker;

    @Query
    @NameInMap("prefix")
    private String prefix;

    @Query
    @NameInMap("upload-id-marker")
    private String uploadIdMarker;

    @Query
    @NameInMap("encoding-type")
    private String encodingType;


    private ListMultipartUploadsRequest(Builder builder) {
        super(builder);
        this.delimiter = builder.delimiter;
        this.maxUploads = builder.maxUploads;
        this.keyMarker = builder.keyMarker;
        this.prefix = builder.prefix;
        this.uploadIdMarker = builder.uploadIdMarker;
        this.encodingType = builder.encodingType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMultipartUploadsRequest create() {
        return builder().build();
    }

    /**
     * @return delimiter
     */
    public String delimiter() {
        return this.delimiter;
    }

    /**
     * @return maxUploads
     */
    public String maxUploads() {
        return this.maxUploads;
    }

    /**
     * @return keyMarker
     */
    public String keyMarker() {
        return this.keyMarker;
    }

    /**
     * @return prefix
     */
    public String prefix() {
        return this.prefix;
    }

    /**
     * @return uploadIdMarker
     */
    public String uploadIdMarker() {
        return this.uploadIdMarker;
    }

    /**
     * @return encodingType
     */
    public String encodingType() {
        return this.encodingType;
    }

    public static final class Builder extends Request.Builder<ListMultipartUploadsRequest.Builder> {
        private String delimiter; 
        private String maxUploads; 
        private String keyMarker; 
        private String prefix; 
        private String uploadIdMarker; 
        private String encodingType; 

        /**
         * <p>delimiter.</p>
         */
        public Builder delimiter(String delimiter) {
            this.putQueryParameter("delimiter", delimiter);
            this.delimiter = delimiter;
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
         * <p>key-marker.</p>
         */
        public Builder keyMarker(String keyMarker) {
            this.putQueryParameter("key-marker", keyMarker);
            this.keyMarker = keyMarker;
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

        /**
         * <p>encoding-type.</p>
         */
        public Builder encodingType(String encodingType) {
            this.putQueryParameter("encoding-type", encodingType);
            this.encodingType = encodingType;
            return this;
        }

        public ListMultipartUploadsRequest build() {
            return new ListMultipartUploadsRequest(this);
        } 

    } 

}
