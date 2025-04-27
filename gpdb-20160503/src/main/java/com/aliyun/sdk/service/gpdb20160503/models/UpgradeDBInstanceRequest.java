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
    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private String storageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeType")
    private Long upgradeType;

    private UpgradeDBInstanceRequest(Builder builder) {
        super(builder);
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceGroupCount = builder.DBInstanceGroupCount;
        this.DBInstanceId = builder.DBInstanceId;
        this.instanceSpec = builder.instanceSpec;
        this.masterNodeNum = builder.masterNodeNum;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.segDiskPerformanceLevel = builder.segDiskPerformanceLevel;
        this.segNodeNum = builder.segNodeNum;
        this.segStorageType = builder.segStorageType;
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
        private String DBInstanceClass; 
        private String DBInstanceGroupCount; 
        private String DBInstanceId; 
        private String instanceSpec; 
        private String masterNodeNum; 
        private Long ownerId; 
        private String payType; 
        private String regionId; 
        private String resourceGroupId; 
        private String segDiskPerformanceLevel; 
        private String segNodeNum; 
        private String segStorageType; 
        private String storageSize; 
        private Long upgradeType; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeDBInstanceRequest request) {
            super(request);
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceGroupCount = request.DBInstanceGroupCount;
            this.DBInstanceId = request.DBInstanceId;
            this.instanceSpec = request.instanceSpec;
            this.masterNodeNum = request.masterNodeNum;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.segDiskPerformanceLevel = request.segDiskPerformanceLevel;
            this.segNodeNum = request.segNodeNum;
            this.segStorageType = request.segStorageType;
            this.storageSize = request.storageSize;
            this.upgradeType = request.upgradeType;
        } 

        /**
         * <p>This parameter is no longer used.</p>
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
         * <p>This parameter is no longer used.</p>
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
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances within a region.</p>
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
         * <p>The specifications of each compute node. For information about the supported specifications, see <a href="https://help.aliyun.com/document_detail/35406.html">Instance specifications</a>.</p>
         * <blockquote>
         * <p>This parameter is available only for instances in elastic storage mode.</p>
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
         * <p>This parameter is no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>This parameter is no longer used.</p>
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
         * <p>The region ID of the instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the resource group to which the instance belongs. For information about how to obtain the ID of a resource group, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
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
         * <p>The performance level of Enterprise SSDs (ESSDs). Valid values:</p>
         * <ul>
         * <li><strong>pl0</strong></li>
         * <li><strong>pl1</strong></li>
         * <li><strong>pl2</strong></li>
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
         * <p>The number of compute nodes. The number of compute nodes varies based on the instance resource type and edition.</p>
         * <ul>
         * <li>Valid values for High-availability Edition instances in elastic storage mode: 4 to 512, in 4 increments.</li>
         * <li>Valid values for High-performance Edition instances in elastic storage mode: 2 to 512, in 2 increments.</li>
         * <li>Valid values for instances in manual Serverless mode: 2 to 512, in 2 increments.</li>
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
         * <p>The disk storage type of the instance after the change. The disk storage type can be changed only to ESSD. Set the value to <strong>cloud_essd</strong>.</p>
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
         * <p>The storage capacity of each compute node. Unit: GB. Valid values: 50 to 6000, in 50 increments.</p>
         * <blockquote>
         * <p> This parameter is available only for instances in elastic storage mode.</p>
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
         * <p>The type of the instance configuration change. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): changes the number of compute nodes.</li>
         * <li><strong>1</strong>: changes the specifications and storage capacity of each compute node.</li>
         * <li><strong>2</strong>: changes the number of coordinator nodes.</li>
         * <li><strong>3</strong>: changes the disk storage type and ESSD performance level of the instance.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The supported changes to compute node configurations vary based on the instance resource type. For more information, see the &quot;Usage notes&quot; section of the <a href="https://help.aliyun.com/document_detail/50956.html">Change compute node configurations</a> topic.</p>
         * </li>
         * <li><p>After you specify a change type, only the corresponding parameters take effect. For example, if you set <strong>UpgradeType</strong> to 0, the parameter that is used to change the number of compute nodes takes effect, but the parameter that is used to change the number of coordinator nodes does not.</p>
         * </li>
         * <li><p>The number of coordinator nodes can be changed only on the China site (aliyun.com).</p>
         * </li>
         * <li><p>The disk storage type can be changed only from ultra disks to ESSDs.</p>
         * </li>
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
