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
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("key")
    private String key;

    @Query
    @NameInMap("uploadId")
    private String uploadId;

    @Body
    @NameInMap("completeMultipartUpload")
    private CompleteMultipartUpload completeMultipartUpload;

    @Query
    @NameInMap("encoding-type")
    private String encodingType;

    @Header
    @NameInMap("x-oss-forbid-overwrite")
    private String xOssForbidOverwrite;

    @Header
    @NameInMap("x-oss-complete-all")
    private String xOssCompleteAll;


    private CompleteMultipartUploadRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.uploadId = builder.uploadId;
        this.completeMultipartUpload = builder.completeMultipartUpload;
        this.encodingType = builder.encodingType;
        this.xOssForbidOverwrite = builder.xOssForbidOverwrite;
        this.xOssCompleteAll = builder.xOssCompleteAll;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteMultipartUploadRequest create() {
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
     * @return completeMultipartUpload
     */
    public CompleteMultipartUpload completeMultipartUpload() {
        return this.completeMultipartUpload;
    }

    /**
     * @return encodingType
     */
    public String encodingType() {
        return this.encodingType;
    }

    /**
     * @return xOssForbidOverwrite
     */
    public String xOssForbidOverwrite() {
        return this.xOssForbidOverwrite;
    }

    /**
     * @return xOssCompleteAll
     */
    public String xOssCompleteAll() {
        return this.xOssCompleteAll;
    }

    public static final class Builder extends Request.Builder<CompleteMultipartUploadRequest.Builder> {
        private String bucket; 
        private String key; 
        private String uploadId; 
        private CompleteMultipartUpload completeMultipartUpload; 
        private String encodingType; 
        private String xOssForbidOverwrite; 
        private String xOssCompleteAll; 

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
        public Builder encodingType(String encodingType) {
            this.putQueryParameter("encoding-type", encodingType);
            this.encodingType = encodingType;
            return this;
        }

        /**
         * <p>x-oss-forbid-overwrite.</p>
         */
        public Builder xOssForbidOverwrite(String xOssForbidOverwrite) {
            this.putHeaderParameter("x-oss-forbid-overwrite", xOssForbidOverwrite);
            this.xOssForbidOverwrite = xOssForbidOverwrite;
            return this;
        }

        /**
         * <p>x-oss-complete-all.</p>
         */
        public Builder xOssCompleteAll(String xOssCompleteAll) {
            this.putHeaderParameter("x-oss-complete-all", xOssCompleteAll);
            this.xOssCompleteAll = xOssCompleteAll;
            return this;
        }

        public CompleteMultipartUploadRequest build() {
            return new CompleteMultipartUploadRequest(this);
        } 

    } 

}
