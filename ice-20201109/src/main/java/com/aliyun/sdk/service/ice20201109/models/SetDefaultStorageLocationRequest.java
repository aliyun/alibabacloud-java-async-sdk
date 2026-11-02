// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SetDefaultStorageLocationRequest} extends {@link RequestModel}
 *
 * <p>SetDefaultStorageLocationRequest</p>
 */
public class SetDefaultStorageLocationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bucket")
    private String bucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    private SetDefaultStorageLocationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bucket = builder.bucket;
        this.path = builder.path;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDefaultStorageLocationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<SetDefaultStorageLocationRequest, Builder> {
        private String regionId; 
        private String bucket; 
        private String path; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(SetDefaultStorageLocationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bucket = request.bucket;
            this.path = request.path;
            this.storageType = request.storageType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the OSS bucket that you created.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-test-bucket</p>
         */
        public Builder bucket(String bucket) {
            this.putQueryParameter("Bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <ul>
         * <li>When StorageType is set to user_oss_bucket, temporary files are stored in this path. If the path is empty or set to /, files are stored in the root directory.</li>
         * <li>This field does not take effect for VOD storage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ims/dir</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li>vod_oss_bucket: VOD-managed bucket. You can add VOD system buckets and your own OSS buckets that have been added to the VOD system. If no bucket is available, you can create a bucket in the ApsaraVideo VOD console. The ApsaraVideo VOD system assigns a storage address in each storage region. After you activate ApsaraVideo VOD, you must enable the address before you can use it. For more information, see <a href="https://help.aliyun.com/document_detail/86097.html">Manage storage buckets</a>.</li>
         * <li>user_oss_bucket: user-owned private bucket. Before adding an OSS storage address, you must activate OSS and create a storage bucket. For more information, see <a href="https://help.aliyun.com/document_detail/31885.html">Create a bucket in the console</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user_oss_bucket</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public SetDefaultStorageLocationRequest build() {
            return new SetDefaultStorageLocationRequest(this);
        } 

    } 

}
