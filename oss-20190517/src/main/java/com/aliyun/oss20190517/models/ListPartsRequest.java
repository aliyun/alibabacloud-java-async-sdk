// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListPartsRequest} extends {@link RequestModel}
 *
 * <p>ListPartsRequest</p>
 */
public class ListPartsRequest extends Request {
    @Path
    @NameInMap("key")
    private String key;

    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("encoding-type")
    private EncodeType encodingType;

    @Query
    @NameInMap("max-parts")
    private Long maxParts;

    @Query
    @NameInMap("part-number-marker")
    private Long partNumberMarker;

    @Query
    @NameInMap("uploadId")
    private String uploadId;


    private ListPartsRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.bucket = builder.bucket;
        this.encodingType = builder.encodingType;
        this.maxParts = builder.maxParts;
        this.partNumberMarker = builder.partNumberMarker;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPartsRequest create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
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
    public EncodeType getEncodingType() {
        return this.encodingType;
    }

    /**
     * @return maxParts
     */
    public Long getMaxParts() {
        return this.maxParts;
    }

    /**
     * @return partNumberMarker
     */
    public Long getPartNumberMarker() {
        return this.partNumberMarker;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String key; 
        private String bucket; 
        private EncodeType encodingType; 
        private Long maxParts; 
        private Long partNumberMarker; 
        private String uploadId; 

        /**
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>encoding-type.</p>
         */
        public Builder encodingType(EncodeType encodingType) {
            this.putQueryParameter("encoding-type", encodingType);
            this.encodingType = encodingType;
            return this;
        }

        /**
         * <p>max-parts.</p>
         */
        public Builder maxParts(Long maxParts) {
            this.putQueryParameter("max-parts", maxParts);
            this.maxParts = maxParts;
            return this;
        }

        /**
         * <p>part-number-marker.</p>
         */
        public Builder partNumberMarker(Long partNumberMarker) {
            this.putQueryParameter("part-number-marker", partNumberMarker);
            this.partNumberMarker = partNumberMarker;
            return this;
        }

        /**
         * <p>uploadId.</p>
         */
        public Builder uploadId(String uploadId) {
            this.putQueryParameter("uploadId", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        public ListPartsRequest build() {
            return new ListPartsRequest(this);
        } 

    } 

}
