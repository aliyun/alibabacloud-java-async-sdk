// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeSyncAvailableDBClusterListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSyncAvailableDBClusterListRequest</p>
 */
public class DescribeSyncAvailableDBClusterListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDBCluster")
    private java.util.List<SourceDBCluster> sourceDBCluster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncPlatform")
    private String syncPlatform;

    private DescribeSyncAvailableDBClusterListRequest(Builder builder) {
        super(builder);
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.queryType = builder.queryType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceDBCluster = builder.sourceDBCluster;
        this.syncPlatform = builder.syncPlatform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSyncAvailableDBClusterListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
    public java.util.List<SourceDBCluster> getSourceDBCluster() {
        return this.sourceDBCluster;
    }

    /**
     * @return syncPlatform
     */
    public String getSyncPlatform() {
        return this.syncPlatform;
    }

    public static final class Builder extends Request.Builder<DescribeSyncAvailableDBClusterListRequest, Builder> {
        private String ownerAccount; 
        private Long ownerId; 
        private String queryType; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<SourceDBCluster> sourceDBCluster; 
        private String syncPlatform; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSyncAvailableDBClusterListRequest request) {
            super(request);
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.queryType = request.queryType;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceDBCluster = request.sourceDBCluster;
            this.syncPlatform = request.syncPlatform;
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
         * <p>The query type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Target</li>
         * <li>Source</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Source</p>
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-4690g37929****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
        public Builder sourceDBCluster(java.util.List<SourceDBCluster> sourceDBCluster) {
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
        public DescribeSyncAvailableDBClusterListRequest build() {
            return new DescribeSyncAvailableDBClusterListRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSyncAvailableDBClusterListRequest} extends {@link TeaModel}
     *
     * <p>DescribeSyncAvailableDBClusterListRequest</p>
     */
    public static class SourceDBCluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterIds")
        private String clusterIds;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SourceDBCluster(Builder builder) {
            this.clusterIds = builder.clusterIds;
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
            private String regionId; 
            private String type; 

            private Builder() {
            } 

            private Builder(SourceDBCluster model) {
                this.clusterIds = model.clusterIds;
                this.regionId = model.regionId;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the source instance or cluster. Separate multiple IDs with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1l3yh04y7us147n</p>
             */
            public Builder clusterIds(String clusterIds) {
                this.clusterIds = clusterIds;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The database type of the source instance or cluster.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>rds: ApsaraDB RDS.</li>
             * <li>sls: Simple Log Service.</li>
             * <li>polardb: PolarDB.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
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
