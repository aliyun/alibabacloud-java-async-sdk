// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RestoreOssImageRequest} extends {@link RequestModel}
 *
 * <p>RestoreOssImageRequest</p>
 */
public class RestoreOssImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetObjectKey")
    private String targetObjectKey;

    private RestoreOssImageRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.lang = builder.lang;
        this.objectKey = builder.objectKey;
        this.serviceRegionId = builder.serviceRegionId;
        this.targetObjectKey = builder.targetObjectKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreOssImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return objectKey
     */
    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * @return serviceRegionId
     */
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    /**
     * @return targetObjectKey
     */
    public String getTargetObjectKey() {
        return this.targetObjectKey;
    }

    public static final class Builder extends Request.Builder<RestoreOssImageRequest, Builder> {
        private String bucket; 
        private String lang; 
        private String objectKey; 
        private String serviceRegionId; 
        private String targetObjectKey; 

        private Builder() {
            super();
        } 

        private Builder(RestoreOssImageRequest request) {
            super(request);
            this.bucket = request.bucket;
            this.lang = request.lang;
            this.objectKey = request.objectKey;
            this.serviceRegionId = request.serviceRegionId;
            this.targetObjectKey = request.targetObjectKey;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-sddp</p>
         */
        public Builder bucket(String bucket) {
            this.putQueryParameter("Bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_dsc_desensitization/dir1/test.png</p>
         */
        public Builder objectKey(String objectKey) {
            this.putQueryParameter("ObjectKey", objectKey);
            this.objectKey = objectKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder serviceRegionId(String serviceRegionId) {
            this.putQueryParameter("ServiceRegionId", serviceRegionId);
            this.serviceRegionId = serviceRegionId;
            return this;
        }

        /**
         * TargetObjectKey.
         */
        public Builder targetObjectKey(String targetObjectKey) {
            this.putQueryParameter("TargetObjectKey", targetObjectKey);
            this.targetObjectKey = targetObjectKey;
            return this;
        }

        @Override
        public RestoreOssImageRequest build() {
            return new RestoreOssImageRequest(this);
        } 

    } 

}
