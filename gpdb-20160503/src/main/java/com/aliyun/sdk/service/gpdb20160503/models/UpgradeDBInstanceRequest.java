// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link UpgradeDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpgradeDBInstanceRequest</p>
 */
public class UpgradeDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheStorageSize")
    private String cacheStorageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceGroupCount")
    private String DBInstanceGroupCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceSpec")
    private String instanceSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterNodeNum")
    private String masterNodeNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SegDiskPerformanceLevel")
    private String segDiskPerformanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SegNodeNum")
    private String segNodeNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SegStorageType")
    private String segStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessResource")
    private String serverlessResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private String storageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeType")
    private Long upgradeType;

    private UpgradeDBInstanceRequest(Builder builder) {
        super(builder);
        this.cacheStorageSize = builder.cacheStorageSize;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceGroupCount = builder.DBInstanceGroupCount;
        this.DBInstanceId = builder.DBInstanceId;
        this.effectiveTime = builder.effectiveTime;
        this.instanceSpec = builder.instanceSpec;
        this.masterNodeNum = builder.masterNodeNum;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.segDiskPerformanceLevel = builder.segDiskPerformanceLevel;
        this.segNodeNum = builder.segNodeNum;
        this.segStorageType = builder.segStorageType;
        this.serverlessResource = builder.serverlessResource;
        this.storageSize = builder.storageSize;
        this.upgradeType = builder.upgradeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeDBInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheStorageSize
     */
    public String getCacheStorageSize() {
        return this.cacheStorageSize;
    }

    /**
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return DBInstanceGroupCount
     */
    public String getDBInstanceGroupCount() {
        return this.DBInstanceGroupCount;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return instanceSpec
     */
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    /**
     * @return masterNodeNum
     */
    public String getMasterNodeNum() {
        return this.masterNodeNum;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
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
     * @return segDiskPerformanceLevel
     */
    public String getSegDiskPerformanceLevel() {
        return this.segDiskPerformanceLevel;
    }

    /**
     * @return segNodeNum
     */
    public String getSegNodeNum() {
        return this.segNodeNum;
    }

    /**
     * @return segStorageType
     */
    public String getSegStorageType() {
        return this.segStorageType;
    }

    /**
     * @return serverlessResource
     */
    public String getServerlessResource() {
        return this.serverlessResource;
    }

    /**
     * @return storageSize
     */
    public String getStorageSize() {
        return this.storageSize;
    }

    /**
     * @return upgradeType
     */
    public Long getUpgradeType() {
        return this.upgradeType;
    }

    public static final class Builder extends Request.Builder<UpgradeDBInstanceRequest, Builder> {
        private String cacheStorageSize; 
        private String DBInstanceClass; 
        private String DBInstanceGroupCount; 
        private String DBInstanceId; 
        private String effectiveTime; 
        private String instanceSpec; 
        private String masterNodeNum; 
        private Long ownerId; 
        private String payType; 
        private String regionId; 
        private String resourceGroupId; 
        private String segDiskPerformanceLevel; 
        private String segNodeNum; 
        private String segStorageType; 
        private String serverlessResource; 
        private String storageSize; 
        private Long upgradeType; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeDBInstanceRequest request) {
            super(request);
            this.cacheStorageSize = request.cacheStorageSize;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceGroupCount = request.DBInstanceGroupCount;
            this.DBInstanceId = request.DBInstanceId;
            this.effectiveTime = request.effectiveTime;
            this.instanceSpec = request.instanceSpec;
            this.masterNodeNum = request.masterNodeNum;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.segDiskPerformanceLevel = request.segDiskPerformanceLevel;
            this.segNodeNum = request.segNodeNum;
            this.segStorageType = request.segStorageType;
            this.serverlessResource = request.serverlessResource;
            this.storageSize = request.storageSize;
            this.upgradeType = request.upgradeType;
        } 

        /**
         * <p>The Serverless cache storage capacity. Unit: GB.</p>
         * <blockquote>
         * <p>This parameter is required only for Serverless Pro instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        public Builder cacheStorageSize(String cacheStorageSize) {
            this.putQueryParameter("CacheStorageSize", cacheStorageSize);
            this.cacheStorageSize = cacheStorageSize;
            return this;
        }

        /**
         * <p>This parameter is deprecated. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>This parameter is deprecated. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder DBInstanceGroupCount(String DBInstanceGroupCount) {
            this.putQueryParameter("DBInstanceGroupCount", DBInstanceGroupCount);
            this.DBInstanceGroupCount = DBInstanceGroupCount;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in the specified region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-rj***************</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * EffectiveTime.
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * <p>The specifications of segment nodes. For information about supported node specifications, see <a href="https://help.aliyun.com/document_detail/35406.html">Instance specifications</a>.</p>
         * <blockquote>
         * <p>This parameter is supported only for elastic storage mode instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4C16G</p>
         */
        public Builder instanceSpec(String instanceSpec) {
            this.putQueryParameter("InstanceSpec", instanceSpec);
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * <p>This parameter is deprecated. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder masterNodeNum(String masterNodeNum) {
            this.putQueryParameter("MasterNodeNum", masterNodeNum);
            this.masterNodeNum = masterNodeNum;
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
         * <p>This parameter is deprecated. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available region IDs.</p>
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
         * <p>The ID of the resource group to which the instance belongs. For information about how to obtain the resource group ID, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The performance level (PL) of the cloud disk. Valid values:</p>
         * <ul>
         * <li><strong>pl0</strong>: PL0.</li>
         * <li><strong>pl1</strong>: PL1.</li>
         * <li><strong>pl2</strong>: PL2.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        public Builder segDiskPerformanceLevel(String segDiskPerformanceLevel) {
            this.putQueryParameter("SegDiskPerformanceLevel", segDiskPerformanceLevel);
            this.segDiskPerformanceLevel = segDiskPerformanceLevel;
            return this;
        }

        /**
         * <p>The number of segment nodes. The supported number of nodes varies based on the instance resource type and instance edition:</p>
         * <ul>
         * <li>Elastic storage mode, High-availability Edition: Valid values: 4 to 512. The value must be a multiple of 4.</li>
         * <li>Elastic storage mode, &lt;props=&quot;china&quot;&gt;Basic Edition (formerly High-performance Edition)&lt;props=&quot;intl&quot;&gt;High-performance Edition: Valid values: 2 to 512. The value must be a multiple of 2.</li>
         * <li>Serverless manual scheduling mode: Valid values: 2 to 512. The value must be a multiple of 2.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder segNodeNum(String segNodeNum) {
            this.putQueryParameter("SegNodeNum", segNodeNum);
            this.segNodeNum = segNodeNum;
            return this;
        }

        /**
         * <p>The cloud disk storage type after the change. Currently, only ESSD cloud disks are supported. Set the value to <strong>cloud_essd</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        public Builder segStorageType(String segStorageType) {
            this.putQueryParameter("SegStorageType", segStorageType);
            this.segStorageType = segStorageType;
            return this;
        }

        /**
         * <ul>
         * <li><p>Serverless instances:
         * The compute resource threshold. Valid values: 8 to 32. The value must be a multiple of 8. Unit: ACU. Default value: 32.</p>
         * </li>
         * <li><p>Serverless Pro instances: The reserved compute resources. Valid values: 16 to 1024. Unit: ACU. Default value: 16. The step size varies based on the value range:</p>
         * <ul>
         * <li>16 to 32: step size of 4.</li>
         * <li>32 to 64: step size of 8.</li>
         * <li>64 to 128: step size of 16.</li>
         * <li>128 to 256: step size of 32.</li>
         * <li>Greater than 256: step size of 64.<blockquote>
         * <p>This parameter is required only for Serverless automatic scheduling mode and Serverless Pro instances.</p>
         * </blockquote>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder serverlessResource(String serverlessResource) {
            this.putQueryParameter("ServerlessResource", serverlessResource);
            this.serverlessResource = serverlessResource;
            return this;
        }

        /**
         * <p>The storage capacity of segment nodes. Unit: GB. Valid values: 50 to &lt;props=&quot;china&quot;&gt;8000&lt;props=&quot;intl&quot;&gt;6000. The value must be a multiple of 50.</p>
         * <blockquote>
         * <p>This parameter is supported only for elastic storage mode instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder storageSize(String storageSize) {
            this.putQueryParameter("StorageSize", storageSize);
            this.storageSize = storageSize;
            return this;
        }

        /**
         * <p>The type of the specification change. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): Changes the number of segment nodes. SegNodeNum is required. Other parameters do not take effect.</li>
         * <li><strong>1</strong>: Changes the segment node specifications and instance storage capacity. InstanceSpec is required. StorageSize is optional and must be greater than or equal to the current instance storage capacity.</li>
         * <li><strong>2</strong>: Changes the number of master nodes. MasterNodeNum is required. Other parameters do not take effect.</li>
         * <li><strong>3</strong>: Changes the cloud disk storage type and performance level (PL). SegDiskPerformanceLevel and SegStorageType are required. Other parameters do not take effect.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Different instance resource types support different Upgrade/Downgrade operations for compute nodes. For more information, see <a href="https://help.aliyun.com/document_detail/50956.html">Precautions</a>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>After you select a specification change type, only the corresponding parameters take effect. Other parameters do not take effect. For example, if <strong>UpgradeType</strong> is set to 0 and you specify both the number of segment nodes and the number of master nodes, only the number of segment nodes is changed.</li>
         * <li>Changing the number of master nodes is supported only on the China site (aliyun.com).</li>
         * <li>You can change the cloud disk storage type only from standard SSD to ESSD cloud disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder upgradeType(Long upgradeType) {
            this.putQueryParameter("UpgradeType", upgradeType);
            this.upgradeType = upgradeType;
            return this;
        }

        @Override
        public UpgradeDBInstanceRequest build() {
            return new UpgradeDBInstanceRequest(this);
        } 

    } 

}
