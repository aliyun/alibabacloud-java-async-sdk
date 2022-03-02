// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link CompleteMultipartUploadRequest} extends {@link RequestModel}
 *
 * <p>CompleteMultipartUploadRequest</p>
 */
public class CompleteMultipartUploadRequest extends Request {
    @Path
    @NameInMap("key")
    @Validation(required = true)
    private String key;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Body
    @NameInMap("completeMultipartUpload")
    @Validation(required = true)
    private CompleteMultipartUpload completeMultipartUpload;

    @Query
    @NameInMap("encoding-type")
    private String encodingType;

    @Query
    @NameInMap("uploadId")
    @Validation(required = true)
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
     * @return completeMultipartUpload
     */
    public CompleteMultipartUpload getCompleteMultipartUpload() {
        return this.completeMultipartUpload;
    }

    /**
     * @return encodingType
     */
    public String getEncodingType() {
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

    public static final class Builder extends Request.Builder<CompleteMultipartUploadRequest, Builder> {
        private String key; 
        private String bucket; 
        private CompleteMultipartUpload completeMultipartUpload; 
        private String encodingType; 
        private String uploadId; 
        private String completeAll; 
        private String forbidOverwrite; 

        private Builder() {
            super();
        } 

        private Builder(CompleteMultipartUploadRequest request) {
            super(request);
            this.key = request.key;
            this.bucket = request.bucket;
            this.completeMultipartUpload = request.completeMultipartUpload;
            this.encodingType = request.encodingType;
            this.uploadId = request.uploadId;
            this.completeAll = request.completeAll;
            this.forbidOverwrite = request.forbidOverwrite;
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
         * completeMultipartUpload.
         */
        public Builder completeMultipartUpload(CompleteMultipartUpload completeMultipartUpload) {
            this.putBodyParameter("completeMultipartUpload", completeMultipartUpload);
            this.completeMultipartUpload = completeMultipartUpload;
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
         * uploadId.
         */
        public Builder uploadId(String uploadId) {
            this.putQueryParameter("uploadId", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        /**
         * x-oss-complete-all.
         */
        public Builder completeAll(String completeAll) {
            this.putHeaderParameter("x-oss-complete-all", completeAll);
            this.completeAll = completeAll;
            return this;
        }

        /**
         * x-oss-forbid-overwrite.
         */
        public Builder forbidOverwrite(String forbidOverwrite) {
            this.putHeaderParameter("x-oss-forbid-overwrite", forbidOverwrite);
            this.forbidOverwrite = forbidOverwrite;
            return this;
        }

        @Override
        public CompleteMultipartUploadRequest build() {
            return new CompleteMultipartUploadRequest(this);
        } 

    } 

}
