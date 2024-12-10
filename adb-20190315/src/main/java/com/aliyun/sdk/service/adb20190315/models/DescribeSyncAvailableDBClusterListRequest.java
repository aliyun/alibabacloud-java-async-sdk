// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
    private java.util.List < SourceDBCluster> sourceDBCluster;

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
    public java.util.List < SourceDBCluster> getSourceDBCluster() {
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
        private java.util.List < SourceDBCluster> sourceDBCluster; 
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
         * ResourceGroupId.
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
         * SourceDBCluster.
         */
        public Builder sourceDBCluster(java.util.List < SourceDBCluster> sourceDBCluster) {
            this.putQueryParameter("SourceDBCluster", sourceDBCluster);
            this.sourceDBCluster = sourceDBCluster;
            return this;
        }

        /**
         * SyncPlatform.
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

            /**
             * ClusterIds.
             */
            public Builder clusterIds(String clusterIds) {
                this.clusterIds = clusterIds;
                return this;
            }

            /**
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
             * Type.
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
