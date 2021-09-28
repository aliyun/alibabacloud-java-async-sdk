// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UploadPartRequest} extends {@link RequestModel}
 *
 * <p>UploadPartRequest</p>
 */
public class UploadPartRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("key")
    private String key;

    @Query
    @NameInMap("partNumber")
    private String partNumber;

    @Query
    @NameInMap("uploadId")
    private String uploadId;


    private UploadPartRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.partNumber = builder.partNumber;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadPartRequest create() {
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
     * @return partNumber
     */
    public String partNumber() {
        return this.partNumber;
    }

    /**
     * @return uploadId
     */
    public String uploadId() {
        return this.uploadId;
    }

    public static final class Builder extends Request.Builder<UploadPartRequest.Builder> {
        private String bucket; 
        private String key; 
        private String partNumber; 
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
         * <p>partNumber.</p>
         */
        public Builder partNumber(String partNumber) {
            this.putQueryParameter("partNumber", partNumber);
            this.partNumber = partNumber;
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

        public UploadPartRequest build() {
            return new UploadPartRequest(this);
        } 

    } 

}
