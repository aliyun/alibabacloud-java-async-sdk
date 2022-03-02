// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ListPartsRequest} extends {@link RequestModel}
 *
 * <p>ListPartsRequest</p>
 */
public class ListPartsRequest extends Request {
    @Path
    @NameInMap("key")
    @Validation(required = true)
    private String key;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("encoding-type")
    private String encodingType;

    @Query
    @NameInMap("max-parts")
    private Long maxParts;

    @Query
    @NameInMap("part-number-marker")
    private Long partNumberMarker;

    @Query
    @NameInMap("uploadId")
    @Validation(required = true)
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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getEncodingType() {
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

    public static final class Builder extends Request.Builder<ListPartsRequest, Builder> {
        private String key; 
        private String bucket; 
        private String encodingType; 
        private Long maxParts; 
        private Long partNumberMarker; 
        private String uploadId; 

        private Builder() {
            super();
        } 

        private Builder(ListPartsRequest request) {
            super(request);
            this.key = request.key;
            this.bucket = request.bucket;
            this.encodingType = request.encodingType;
            this.maxParts = request.maxParts;
            this.partNumberMarker = request.partNumberMarker;
            this.uploadId = request.uploadId;
        } 

        /**
         * key.
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * encoding-type.
         */
        public Builder encodingType(String encodingType) {
            this.putQueryParameter("encoding-type", encodingType);
            this.encodingType = encodingType;
            return this;
        }

        /**
         * encoding-type.
         */
        public Builder encodingType(EncodeType encodingType) {
            this.putQueryParameter("encoding-type", encodingType.getValue());
            this.encodingType = encodingType.getValue();
            return this;
        }

        /**
         * max-parts.
         */
        public Builder maxParts(Long maxParts) {
            this.putQueryParameter("max-parts", maxParts);
            this.maxParts = maxParts;
            return this;
        }

        /**
         * part-number-marker.
         */
        public Builder partNumberMarker(Long partNumberMarker) {
            this.putQueryParameter("part-number-marker", partNumberMarker);
            this.partNumberMarker = partNumberMarker;
            return this;
        }

        /**
         * uploadId.
         */
        public Builder uploadId(String uploadId) {
            this.putQueryParameter("uploadId", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        @Override
        public ListPartsRequest build() {
            return new ListPartsRequest(this);
        } 

    } 

}
