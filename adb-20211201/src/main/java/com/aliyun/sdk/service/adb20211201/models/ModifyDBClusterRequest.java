// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ModifyDBClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterRequest</p>
 */
public class ModifyDBClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeResource")
    private String computeResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableDefaultResourcePool")
    private Boolean enableDefaultResourcePool;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductForm")
    private String productForm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservedNodeCount")
    private Integer reservedNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservedNodeSize")
    private String reservedNodeSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageResource")
    private String storageResource;

    private ModifyDBClusterRequest(Builder builder) {
        super(builder);
        this.computeResource = builder.computeResource;
        this.DBClusterId = builder.DBClusterId;
        this.enableDefaultResourcePool = builder.enableDefaultResourcePool;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.productForm = builder.productForm;
        this.regionId = builder.regionId;
        this.reservedNodeCount = builder.reservedNodeCount;
        this.reservedNodeSize = builder.reservedNodeSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.storageResource = builder.storageResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return computeResource
     */
    public String getComputeResource() {
        return this.computeResource;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return enableDefaultResourcePool
     */
    public Boolean getEnableDefaultResourcePool() {
        return this.enableDefaultResourcePool;
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
     * @return productForm
     */
    public String getProductForm() {
        return this.productForm;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reservedNodeCount
     */
    public Integer getReservedNodeCount() {
        return this.reservedNodeCount;
    }

    /**
     * @return reservedNodeSize
     */
    public String getReservedNodeSize() {
        return this.reservedNodeSize;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return storageResource
     */
    public String getStorageResource() {
        return this.storageResource;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterRequest, Builder> {
        private String computeResource; 
        private String DBClusterId; 
        private Boolean enableDefaultResourcePool; 
        private String ownerAccount; 
        private Long ownerId; 
        private String productForm; 
        private String regionId; 
        private Integer reservedNodeCount; 
        private String reservedNodeSize; 
        private String resourceOwnerAccount; 
        private String storageResource; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterRequest request) {
            super(request);
            this.computeResource = request.computeResource;
            this.DBClusterId = request.DBClusterId;
            this.enableDefaultResourcePool = request.enableDefaultResourcePool;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.productForm = request.productForm;
            this.regionId = request.regionId;
            this.reservedNodeCount = request.reservedNodeCount;
            this.reservedNodeSize = request.reservedNodeSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.storageResource = request.storageResource;
        } 

        /**
         * <p>The reserved computing resources. Valid values: 0ACU to 4096ACU. The value must be in increments of 16ACU. Each ACU is approximately equal to 1 core and 4 GB memory.</p>
         * <blockquote>
         * <p> This parameter must be specified with a unit.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16ACU</p>
         */
        public Builder computeResource(String computeResource) {
            this.putQueryParameter("ComputeResource", computeResource);
            this.computeResource = computeResource;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition clusters within a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1r053byu48p****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to allocate all reserved computing resources to the user_default resource group. Valid values:</p>
         * <ul>
         * <li>true (default)</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableDefaultResourcePool(Boolean enableDefaultResourcePool) {
            this.putQueryParameter("EnableDefaultResourcePool", enableDefaultResourcePool);
            this.enableDefaultResourcePool = enableDefaultResourcePool;
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
         * ProductForm.
         */
        public Builder productForm(String productForm) {
            this.putQueryParameter("ProductForm", productForm);
            this.productForm = productForm;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
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
         * ReservedNodeCount.
         */
        public Builder reservedNodeCount(Integer reservedNodeCount) {
            this.putQueryParameter("ReservedNodeCount", reservedNodeCount);
            this.reservedNodeCount = reservedNodeCount;
            return this;
        }

        /**
         * ReservedNodeSize.
         */
        public Builder reservedNodeSize(String reservedNodeSize) {
            this.putQueryParameter("ReservedNodeSize", reservedNodeSize);
            this.reservedNodeSize = reservedNodeSize;
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
         * <p>The reserved storage resources. Valid values: 0ACU to 2064ACU. The value must be in increments of 24ACU. Each ACU is approximately equal to 1 core and 4 GB memory.</p>
         * <blockquote>
         * <p> This parameter must be specified with a unit.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>24ACU</p>
         */
        public Builder storageResource(String storageResource) {
            this.putQueryParameter("StorageResource", storageResource);
            this.storageResource = storageResource;
            return this;
        }

        @Override
        public ModifyDBClusterRequest build() {
            return new ModifyDBClusterRequest(this);
        } 

    } 

}
