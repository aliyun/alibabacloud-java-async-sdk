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
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("key")
    private String key;

    @Query
    @NameInMap("UploadId")
    private String uploadId;

    @Query
    @NameInMap("max-parts")
    private Long maxParts;

    @Query
    @NameInMap("part-number-marker")
    private Long partNumberMarker;

    @Query
    @NameInMap("encoding-type")
    private String encodingType;


    private ListPartsRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.uploadId = builder.uploadId;
        this.maxParts = builder.maxParts;
        this.partNumberMarker = builder.partNumberMarker;
        this.encodingType = builder.encodingType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPartsRequest create() {
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
     * @return maxParts
     */
    public Long maxParts() {
        return this.maxParts;
    }

    /**
     * @return partNumberMarker
     */
    public Long partNumberMarker() {
        return this.partNumberMarker;
    }

    /**
     * @return encodingType
     */
    public String encodingType() {
        return this.encodingType;
    }

    public static final class Builder extends Request.Builder<ListPartsRequest.Builder> {
        private String bucket; 
        private String key; 
        private String uploadId; 
        private Long maxParts; 
        private Long partNumberMarker; 
        private String encodingType; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>UploadId.</p>
         */
        public Builder uploadId(String uploadId) {
            this.putQueryParameter("UploadId", uploadId);
            this.uploadId = uploadId;
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
         * <p>encoding-type.</p>
         */
        public Builder encodingType(String encodingType) {
            this.putQueryParameter("encoding-type", encodingType);
            this.encodingType = encodingType;
            return this;
        }

        public ListPartsRequest build() {
            return new ListPartsRequest(this);
        } 

    } 

}
