// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link UploadPartRequest} extends {@link RequestModel}
 *
 * <p>UploadPartRequest</p>
 */
public class UploadPartRequest extends Request {
    @Path
    @NameInMap("key")
    @Validation(required = true)
    private String key;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("partNumber")
    @Validation(required = true)
    private Long partNumber;

    @Query
    @NameInMap("uploadId")
    @Validation(required = true)
    private String uploadId;

    private UploadPartRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.body = builder.body;
        this.bucket = builder.bucket;
        this.partNumber = builder.partNumber;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadPartRequest create() {
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
     * @return body
     */
    public java.io.InputStream getBody() {
        return this.body;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return partNumber
     */
    public Long getPartNumber() {
        return this.partNumber;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    public static final class Builder extends Request.Builder<UploadPartRequest, Builder> {
        private String key; 
        private java.io.InputStream body; 
        private String bucket; 
        private Long partNumber; 
        private String uploadId; 

        private Builder() {
            super();
        } 

        private Builder(UploadPartRequest request) {
            super(request);
            this.key = request.key;
            this.body = request.body;
            this.bucket = request.bucket;
            this.partNumber = request.partNumber;
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
         * body.
         */
        public Builder body(java.io.InputStream body) {
            this.putBodyParameter("body", body);
            this.body = body;
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
         * partNumber.
         */
        public Builder partNumber(Long partNumber) {
            this.putQueryParameter("partNumber", partNumber);
            this.partNumber = partNumber;
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
        public UploadPartRequest build() {
            return new UploadPartRequest(this);
        } 

    } 

}
