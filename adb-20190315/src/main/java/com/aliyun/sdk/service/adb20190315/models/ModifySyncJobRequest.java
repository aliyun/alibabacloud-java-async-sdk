// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifySyncJobRequest} extends {@link RequestModel}
 *
 * <p>ModifySyncJobRequest</p>
 */
public class ModifySyncJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDBCluster")
    private java.util.List < SourceDBCluster> sourceDBCluster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncPlatform")
    private String syncPlatform;

    private ModifySyncJobRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceDBCluster = builder.sourceDBCluster;
        this.syncPlatform = builder.syncPlatform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySyncJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceDBCluster
     */
    public java.util.List < SourceDBCluster> getSourceDBCluster() {
        return this.sourceDBCluster;
    }

    /**
     * @return syncPlatform
     */
    public String getSyncPlatform() {
        return this.syncPlatform;
    }

    public static final class Builder extends Request.Builder<ModifySyncJobRequest, Builder> {
        private String DBClusterId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < SourceDBCluster> sourceDBCluster; 
        private String syncPlatform; 

        private Builder() {
            super();
        } 

        private Builder(ModifySyncJobRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceDBCluster = request.sourceDBCluster;
            this.syncPlatform = request.syncPlatform;
        } 

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition clusters within a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp12bh6z59nh8497f</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The source instances or clusters.</p>
         */
        public Builder sourceDBCluster(java.util.List < SourceDBCluster> sourceDBCluster) {
            this.putQueryParameter("SourceDBCluster", sourceDBCluster);
            this.sourceDBCluster = sourceDBCluster;
            return this;
        }

        /**
         * <p>The synchronization platform.</p>
         * 
         * <strong>example:</strong>
         * <p>ADB-CDC</p>
         */
        public Builder syncPlatform(String syncPlatform) {
            this.putQueryParameter("SyncPlatform", syncPlatform);
            this.syncPlatform = syncPlatform;
            return this;
        }

        @Override
        public ModifySyncJobRequest build() {
            return new ModifySyncJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifySyncJobRequest} extends {@link TeaModel}
     *
     * <p>ModifySyncJobRequest</p>
     */
    public static class SourceDBCluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private String clusterIds;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("OperateType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operateType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private SourceDBCluster(Builder builder) {
            this.clusterIds = builder.clusterIds;
            this.jobId = builder.jobId;
            this.operateType = builder.operateType;
            this.regionId = builder.regionId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceDBCluster create() {
            return builder().build();
        }

        /**
         * @return clusterIds
         */
        public String getClusterIds() {
            return this.clusterIds;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return operateType
         */
        public String getOperateType() {
            return this.operateType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String clusterIds; 
            private String jobId; 
            private String operateType; 
            private String regionId; 
            private String type; 

            /**
             * <p>The ID of the source instance or cluster. Separate multiple IDs with commas (,).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2zepqn129i9s3l2z3,rm-2zea4dj583129ksp6</p>
             */
            public Builder clusterIds(String clusterIds) {
                this.clusterIds = clusterIds;
                return this;
            }

            /**
             * <p>The ID of the synchronization job.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-xxxxxx</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The operation type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Create</li>
             * <li>Modify</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Create</p>
             */
            public Builder operateType(String operateType) {
                this.operateType = operateType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The source database type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>rds: ApsaraDB RDS.</li>
             * <li>sls: Simple Log Service.</li>
             * <li>polardb: PolarDB.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sls</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SourceDBCluster build() {
                return new SourceDBCluster(this);
            } 

        } 

    }
}
