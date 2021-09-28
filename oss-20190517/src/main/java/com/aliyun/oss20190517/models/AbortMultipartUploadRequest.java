// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link AbortMultipartUploadRequest} extends {@link RequestModel}
 *
 * <p>AbortMultipartUploadRequest</p>
 */
public class AbortMultipartUploadRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("key")
    private String key;

    @Query
    @NameInMap("uploadId")
    private String uploadId;


    private AbortMultipartUploadRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AbortMultipartUploadRequest create() {
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

    public static final class Builder extends Request.Builder<AbortMultipartUploadRequest.Builder> {
        private String bucket; 
        private String key; 
        private String uploadId; 

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
         * <p>uploadId.</p>
         */
        public Builder uploadId(String uploadId) {
            this.putQueryParameter("uploadId", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        public AbortMultipartUploadRequest build() {
            return new AbortMultipartUploadRequest(this);
        } 

    } 

}
