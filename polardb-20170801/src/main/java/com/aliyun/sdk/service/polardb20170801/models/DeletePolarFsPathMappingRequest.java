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
 * {@link DeletePolarFsPathMappingRequest} extends {@link RequestModel}
 *
 * <p>DeletePolarFsPathMappingRequest</p>
 */
public class DeletePolarFsPathMappingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomBucketPathList")
    private java.util.List<CustomBucketPathList> customBucketPathList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polarFsInstanceId;

    private DeletePolarFsPathMappingRequest(Builder builder) {
        super(builder);
        this.customBucketPathList = builder.customBucketPathList;
        this.DBClusterId = builder.DBClusterId;
        this.polarFsInstanceId = builder.polarFsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolarFsPathMappingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customBucketPathList
     */
    public java.util.List<CustomBucketPathList> getCustomBucketPathList() {
        return this.customBucketPathList;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public static final class Builder extends Request.Builder<DeletePolarFsPathMappingRequest, Builder> {
        private java.util.List<CustomBucketPathList> customBucketPathList; 
        private String DBClusterId; 
        private String polarFsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolarFsPathMappingRequest request) {
            super(request);
            this.customBucketPathList = request.customBucketPathList;
            this.DBClusterId = request.DBClusterId;
            this.polarFsInstanceId = request.polarFsInstanceId;
        } 

        /**
         * CustomBucketPathList.
         */
        public Builder customBucketPathList(java.util.List<CustomBucketPathList> customBucketPathList) {
            this.putQueryParameter("CustomBucketPathList", customBucketPathList);
            this.customBucketPathList = customBucketPathList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
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
         * <p>pfs-2ze0i74ka607*****</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.putQueryParameter("PolarFsInstanceId", polarFsInstanceId);
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        @Override
        public DeletePolarFsPathMappingRequest build() {
            return new DeletePolarFsPathMappingRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeletePolarFsPathMappingRequest} extends {@link TeaModel}
     *
     * <p>DeletePolarFsPathMappingRequest</p>
     */
    public static class CustomBucketPathList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private CustomBucketPathList(Builder builder) {
            this.bucket = builder.bucket;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomBucketPathList create() {
            return builder().build();
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

        public static final class Builder {
            private String bucket; 
            private String path; 

            private Builder() {
            } 

            private Builder(CustomBucketPathList model) {
                this.bucket = model.bucket;
                this.path = model.path;
            } 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public CustomBucketPathList build() {
                return new CustomBucketPathList(this);
            } 

        } 

    }
}
