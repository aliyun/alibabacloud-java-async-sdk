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
    @Path
    @NameInMap("key")
    private String key;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;

    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("partNumber")
    private Long partNumber;

    @Query
    @NameInMap("uploadId")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String key; 
        private java.io.InputStream body; 
        private String bucket; 
        private Long partNumber; 
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
         * <p>body.</p>
         */
        public Builder body(java.io.InputStream body) {
            this.putBodyParameter("body", body);
            this.body = body;
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
         * <p>partNumber.</p>
         */
        public Builder partNumber(Long partNumber) {
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
