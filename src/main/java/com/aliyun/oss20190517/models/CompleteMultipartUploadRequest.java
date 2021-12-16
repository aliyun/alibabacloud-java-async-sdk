// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CompleteMultipartUploadRequest} extends {@link RequestModel}
 *
 * <p>CompleteMultipartUploadRequest</p>
 */
public class CompleteMultipartUploadRequest extends Request {
    @Path
    @NameInMap("key")
    private String key;

    @Host
    @NameInMap("bucket")
    private String bucket;

    @Body
    @NameInMap("completeMultipartUpload")
    private CompleteMultipartUpload completeMultipartUpload;

    @Query
    @NameInMap("encoding-type")
    private EncodeType encodingType;

    @Query
    @NameInMap("uploadId")
    private String uploadId;

    @Header
    @NameInMap("x-oss-complete-all")
    private String completeAll;

    @Header
    @NameInMap("x-oss-forbid-overwrite")
    private String forbidOverwrite;


    private CompleteMultipartUploadRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.bucket = builder.bucket;
        this.completeMultipartUpload = builder.completeMultipartUpload;
        this.encodingType = builder.encodingType;
        this.uploadId = builder.uploadId;
        this.completeAll = builder.completeAll;
        this.forbidOverwrite = builder.forbidOverwrite;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteMultipartUploadRequest create() {
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
     * @return completeMultipartUpload
     */
    public CompleteMultipartUpload getCompleteMultipartUpload() {
        return this.completeMultipartUpload;
    }

    /**
     * @return encodingType
     */
    public EncodeType getEncodingType() {
        return this.encodingType;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * @return completeAll
     */
    public String getCompleteAll() {
        return this.completeAll;
    }

    /**
     * @return forbidOverwrite
     */
    public String getForbidOverwrite() {
        return this.forbidOverwrite;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String key; 
        private String bucket; 
        private CompleteMultipartUpload completeMultipartUpload; 
        private EncodeType encodingType; 
        private String uploadId; 
        private String completeAll; 
        private String forbidOverwrite; 

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
         * <p>completeMultipartUpload.</p>
         */
        public Builder completeMultipartUpload(CompleteMultipartUpload completeMultipartUpload) {
            this.putBodyParameter("completeMultipartUpload", completeMultipartUpload);
            this.completeMultipartUpload = completeMultipartUpload;
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
         * <p>uploadId.</p>
         */
        public Builder uploadId(String uploadId) {
            this.putQueryParameter("uploadId", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        /**
         * <p>x-oss-complete-all.</p>
         */
        public Builder completeAll(String completeAll) {
            this.putHeaderParameter("x-oss-complete-all", completeAll);
            this.completeAll = completeAll;
            return this;
        }

        /**
         * <p>x-oss-forbid-overwrite.</p>
         */
        public Builder forbidOverwrite(String forbidOverwrite) {
            this.putHeaderParameter("x-oss-forbid-overwrite", forbidOverwrite);
            this.forbidOverwrite = forbidOverwrite;
            return this;
        }

        public CompleteMultipartUploadRequest build() {
            return new CompleteMultipartUploadRequest(this);
        } 

    } 

}
