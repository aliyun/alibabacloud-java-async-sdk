// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyPolarFsMappingAuthRequest} extends {@link RequestModel}
 *
 * <p>ModifyPolarFsMappingAuthRequest</p>
 */
public class ModifyPolarFsMappingAuthRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketAccessKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketAccessKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketAccessKeySecret")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketAccessKeySecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polarFsInstanceId;

    private ModifyPolarFsMappingAuthRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.bucketAccessKeyId = builder.bucketAccessKeyId;
        this.bucketAccessKeySecret = builder.bucketAccessKeySecret;
        this.DBClusterId = builder.DBClusterId;
        this.path = builder.path;
        this.polarFsInstanceId = builder.polarFsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPolarFsMappingAuthRequest create() {
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
     * @return bucketAccessKeyId
     */
    public String getBucketAccessKeyId() {
        return this.bucketAccessKeyId;
    }

    /**
     * @return bucketAccessKeySecret
     */
    public String getBucketAccessKeySecret() {
        return this.bucketAccessKeySecret;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public static final class Builder extends Request.Builder<ModifyPolarFsMappingAuthRequest, Builder> {
        private String bucket; 
        private String bucketAccessKeyId; 
        private String bucketAccessKeySecret; 
        private String DBClusterId; 
        private String path; 
        private String polarFsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPolarFsMappingAuthRequest request) {
            super(request);
            this.bucket = request.bucket;
            this.bucketAccessKeyId = request.bucketAccessKeyId;
            this.bucketAccessKeySecret = request.bucketAccessKeySecret;
            this.DBClusterId = request.DBClusterId;
            this.path = request.path;
            this.polarFsInstanceId = request.polarFsInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-xxx.oss-[regionId]-internal.aliyuncs.com</p>
         */
        public Builder bucket(String bucket) {
            this.putQueryParameter("Bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder bucketAccessKeyId(String bucketAccessKeyId) {
            this.putQueryParameter("BucketAccessKeyId", bucketAccessKeyId);
            this.bucketAccessKeyId = bucketAccessKeyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder bucketAccessKeySecret(String bucketAccessKeySecret) {
            this.putQueryParameter("BucketAccessKeySecret", bucketAccessKeySecret);
            this.bucketAccessKeySecret = bucketAccessKeySecret;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-2ze0i74ka607*****</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.putQueryParameter("PolarFsInstanceId", polarFsInstanceId);
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        @Override
        public ModifyPolarFsMappingAuthRequest build() {
            return new ModifyPolarFsMappingAuthRequest(this);
        } 

    } 

}
