// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRdsAnalysisResourceQuotasRequest} extends {@link RequestModel}
 *
 * <p>DescribeRdsAnalysisResourceQuotasRequest</p>
 */
public class DescribeRdsAnalysisResourceQuotasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterCategory")
    private String clusterCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterMode")
    private String clusterMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeClass")
    private String nodeClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeCount")
    private Integer nodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RdsInstanceId")
    private String rdsInstanceId;

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
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    private DescribeRdsAnalysisResourceQuotasRequest(Builder builder) {
        super(builder);
        this.clusterCategory = builder.clusterCategory;
        this.clusterMode = builder.clusterMode;
        this.nodeClass = builder.nodeClass;
        this.nodeCount = builder.nodeCount;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.rdsInstanceId = builder.rdsInstanceId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdsAnalysisResourceQuotasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterCategory
     */
    public String getClusterCategory() {
        return this.clusterCategory;
    }

    /**
     * @return clusterMode
     */
    public String getClusterMode() {
        return this.clusterMode;
    }

    /**
     * @return nodeClass
     */
    public String getNodeClass() {
        return this.nodeClass;
    }

    /**
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return this.nodeCount;
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
     * @return rdsInstanceId
     */
    public String getRdsInstanceId() {
        return this.rdsInstanceId;
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
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<DescribeRdsAnalysisResourceQuotasRequest, Builder> {
        private String clusterCategory; 
        private String clusterMode; 
        private String nodeClass; 
        private Integer nodeCount; 
        private String ownerAccount; 
        private Long ownerId; 
        private String rdsInstanceId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRdsAnalysisResourceQuotasRequest request) {
            super(request);
            this.clusterCategory = request.clusterCategory;
            this.clusterMode = request.clusterMode;
            this.nodeClass = request.nodeClass;
            this.nodeCount = request.nodeCount;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.rdsInstanceId = request.rdsInstanceId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.storageType = request.storageType;
        } 

        /**
         * ClusterCategory.
         */
        public Builder clusterCategory(String clusterCategory) {
            this.putQueryParameter("ClusterCategory", clusterCategory);
            this.clusterCategory = clusterCategory;
            return this;
        }

        /**
         * ClusterMode.
         */
        public Builder clusterMode(String clusterMode) {
            this.putQueryParameter("ClusterMode", clusterMode);
            this.clusterMode = clusterMode;
            return this;
        }

        /**
         * NodeClass.
         */
        public Builder nodeClass(String nodeClass) {
            this.putQueryParameter("NodeClass", nodeClass);
            this.nodeClass = nodeClass;
            return this;
        }

        /**
         * NodeCount.
         */
        public Builder nodeCount(Integer nodeCount) {
            this.putQueryParameter("NodeCount", nodeCount);
            this.nodeCount = nodeCount;
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
         * RdsInstanceId.
         */
        public Builder rdsInstanceId(String rdsInstanceId) {
            this.putQueryParameter("RdsInstanceId", rdsInstanceId);
            this.rdsInstanceId = rdsInstanceId;
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
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public DescribeRdsAnalysisResourceQuotasRequest build() {
            return new DescribeRdsAnalysisResourceQuotasRequest(this);
        } 

    } 

}
