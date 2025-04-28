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
 * {@link DescribeEIURangeRequest} extends {@link RequestModel}
 *
 * <p>DescribeEIURangeRequest</p>
 */
public class DescribeEIURangeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeResource")
    private String computeResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterVersion")
    private String DBClusterVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductVersion")
    private String productVersion;

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
    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private String storageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubOperation")
    private String subOperation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeEIURangeRequest(Builder builder) {
        super(builder);
        this.computeResource = builder.computeResource;
        this.DBClusterId = builder.DBClusterId;
        this.DBClusterVersion = builder.DBClusterVersion;
        this.operation = builder.operation;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.productVersion = builder.productVersion;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.storageSize = builder.storageSize;
        this.subOperation = builder.subOperation;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEIURangeRequest create() {
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
     * @return DBClusterVersion
     */
    public String getDBClusterVersion() {
        return this.DBClusterVersion;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
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
     * @return productVersion
     */
    public String getProductVersion() {
        return this.productVersion;
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
     * @return storageSize
     */
    public String getStorageSize() {
        return this.storageSize;
    }

    /**
     * @return subOperation
     */
    public String getSubOperation() {
        return this.subOperation;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeEIURangeRequest, Builder> {
        private String computeResource; 
        private String DBClusterId; 
        private String DBClusterVersion; 
        private String operation; 
        private String ownerAccount; 
        private Long ownerId; 
        private String productVersion; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String storageSize; 
        private String subOperation; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEIURangeRequest request) {
            super(request);
            this.computeResource = request.computeResource;
            this.DBClusterId = request.DBClusterId;
            this.DBClusterVersion = request.DBClusterVersion;
            this.operation = request.operation;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.productVersion = request.productVersion;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.storageSize = request.storageSize;
            this.subOperation = request.subOperation;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The specifications of computing resources.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/469002.html">DescribeComputeResource</a> operation to query the specifications of computing resources.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;RealValue&quot;: &quot;32Core128GBNEW&quot;,
         *       &quot;DisplayValue&quot;: &quot;32Core128GB&quot;
         *     }</p>
         */
        public Builder computeResource(String computeResource) {
            this.putQueryParameter("ComputeResource", computeResource);
            this.computeResource = computeResource;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
         * <ul>
         * <li>This parameter can be left empty when <strong>Operation</strong> is set to <strong>Buy</strong>.</li>
         * <li>This parameter must be specified when <strong>Operation</strong> is set to <strong>Upgrade</strong> or <strong>Downgrade</strong>.</li>
         * </ul>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>am-bp16t5ci7r74s****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The version of the AnalyticDB for MySQL Data Warehouse Edition cluster. Set the value to <strong>3.0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0</p>
         */
        public Builder DBClusterVersion(String DBClusterVersion) {
            this.putQueryParameter("DBClusterVersion", DBClusterVersion);
            this.DBClusterVersion = DBClusterVersion;
            return this;
        }

        /**
         * <p>The type of the operation. Valid values:</p>
         * <ul>
         * <li><strong>Buy</strong>: purchases a cluster.</li>
         * <li><strong>Modify</strong>: changes configurations of a cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Buy</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
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
         * ProductVersion.
         */
        public Builder productVersion(String productVersion) {
            this.putQueryParameter("ProductVersion", productVersion);
            this.productVersion = productVersion;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
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
         * <p>The specifications of storage resources. Default value: <strong>8ACU</strong>. Valid values:</p>
         * <ul>
         * <li><strong>8ACU</strong></li>
         * <li><strong>12ACU</strong></li>
         * <li><strong>16ACU</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8ACU</p>
         */
        public Builder storageSize(String storageSize) {
            this.putQueryParameter("StorageSize", storageSize);
            this.storageSize = storageSize;
            return this;
        }

        /**
         * <p>The type of the sub-operation. Valid values:</p>
         * <ul>
         * <li><strong>Upgrade</strong>: upgrades a cluster.</li>
         * <li><strong>Downgrade</strong>: downgrades a cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Upgrade</p>
         */
        public Builder subOperation(String subOperation) {
            this.putQueryParameter("SubOperation", subOperation);
            this.subOperation = subOperation;
            return this;
        }

        /**
         * <p>The zone ID of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/612293.html">DescribeRegions</a> operation to query the most recent zone list.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeEIURangeRequest build() {
            return new DescribeEIURangeRequest(this);
        } 

    } 

}
