// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link AbortMultipartUploadRequest} extends {@link RequestModel}
 *
 * <p>AbortMultipartUploadRequest</p>
 */
public class AbortMultipartUploadRequest extends Request {
    @Path
    @NameInMap("key")
    @Validation(required = true)
    private String key;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("uploadId")
    @Validation(required = true)
    private String uploadId;

    private AbortMultipartUploadRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.bucket = builder.bucket;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AbortMultipartUploadRequest create() {
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
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    public static final class Builder extends Request.Builder<AbortMultipartUploadRequest, Builder> {
        private String key; 
        private String bucket; 
        private String uploadId; 

        private Builder() {
            super();
        } 

        private Builder(AbortMultipartUploadRequest request) {
            super(request);
            this.key = request.key;
            this.bucket = request.bucket;
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
         * uploadId.
         */
        public Builder uploadId(String uploadId) {
            this.putQueryParameter("uploadId", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        @Override
        public AbortMultipartUploadRequest build() {
            return new AbortMultipartUploadRequest(this);
        } 

    } 

}
