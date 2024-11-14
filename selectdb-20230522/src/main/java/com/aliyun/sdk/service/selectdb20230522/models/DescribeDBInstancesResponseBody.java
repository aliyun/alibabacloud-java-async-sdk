// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancesResponseBody</p>
 */
public class DescribeDBInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescribeDBInstancesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalRecordCount; 

        /**
         * <p>The details about each instance returned.</p>
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong> (default)</li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BC854513-E85E-54F3-9842-B9CCD3308CDD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDBInstancesResponseBody build() {
            return new DescribeDBInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("ClusterCount")
        private Integer clusterCount;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("InstanceUsedType")
        private String instanceUsedType;

        @com.aliyun.core.annotation.NameInMap("IsDeleted")
        private Boolean isDeleted;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private Long lockMode;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("MaintainEndTimeStr")
        private String maintainEndTimeStr;

        @com.aliyun.core.annotation.NameInMap("MaintainEndtime")
        private String maintainEndtime;

        @com.aliyun.core.annotation.NameInMap("MaintainStartTimeStr")
        private String maintainStartTimeStr;

        @com.aliyun.core.annotation.NameInMap("MaintainStarttime")
        private String maintainStarttime;

        @com.aliyun.core.annotation.NameInMap("ObjectStoreSize")
        private Long objectStoreSize;

        @com.aliyun.core.annotation.NameInMap("ParentInstance")
        private String parentInstance;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceCpu")
        private Long resourceCpu;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceMemory")
        private Long resourceMemory;

        @com.aliyun.core.annotation.NameInMap("ScaleMax")
        private Long scaleMax;

        @com.aliyun.core.annotation.NameInMap("ScaleMin")
        private Long scaleMin;

        @com.aliyun.core.annotation.NameInMap("ScaleReplica")
        private Long scaleReplica;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Long storageSize;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TenantClusterId")
        private String tenantClusterId;

        @com.aliyun.core.annotation.NameInMap("TenantToken")
        private String tenantToken;

        @com.aliyun.core.annotation.NameInMap("TenantUserId")
        private String tenantUserId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("connectionString")
        private String connectionString;

        private Items(Builder builder) {
            this.category = builder.category;
            this.chargeType = builder.chargeType;
            this.clusterCount = builder.clusterCount;
            this.DBInstanceId = builder.DBInstanceId;
            this.description = builder.description;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.instanceUsedType = builder.instanceUsedType;
            this.isDeleted = builder.isDeleted;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.maintainEndTimeStr = builder.maintainEndTimeStr;
            this.maintainEndtime = builder.maintainEndtime;
            this.maintainStartTimeStr = builder.maintainStartTimeStr;
            this.maintainStarttime = builder.maintainStarttime;
            this.objectStoreSize = builder.objectStoreSize;
            this.parentInstance = builder.parentInstance;
            this.regionId = builder.regionId;
            this.resourceCpu = builder.resourceCpu;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceMemory = builder.resourceMemory;
            this.scaleMax = builder.scaleMax;
            this.scaleMin = builder.scaleMin;
            this.scaleReplica = builder.scaleReplica;
            this.status = builder.status;
            this.storageSize = builder.storageSize;
            this.storageType = builder.storageType;
            this.tags = builder.tags;
            this.tenantClusterId = builder.tenantClusterId;
            this.tenantToken = builder.tenantToken;
            this.tenantUserId = builder.tenantUserId;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
            this.connectionString = builder.connectionString;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return clusterCount
         */
        public Integer getClusterCount() {
            return this.clusterCount;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instanceUsedType
         */
        public String getInstanceUsedType() {
            return this.instanceUsedType;
        }

        /**
         * @return isDeleted
         */
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return lockMode
         */
        public Long getLockMode() {
            return this.lockMode;
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return maintainEndTimeStr
         */
        public String getMaintainEndTimeStr() {
            return this.maintainEndTimeStr;
        }

        /**
         * @return maintainEndtime
         */
        public String getMaintainEndtime() {
            return this.maintainEndtime;
        }

        /**
         * @return maintainStartTimeStr
         */
        public String getMaintainStartTimeStr() {
            return this.maintainStartTimeStr;
        }

        /**
         * @return maintainStarttime
         */
        public String getMaintainStarttime() {
            return this.maintainStarttime;
        }

        /**
         * @return objectStoreSize
         */
        public Long getObjectStoreSize() {
            return this.objectStoreSize;
        }

        /**
         * @return parentInstance
         */
        public String getParentInstance() {
            return this.parentInstance;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceCpu
         */
        public Long getResourceCpu() {
            return this.resourceCpu;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceMemory
         */
        public Long getResourceMemory() {
            return this.resourceMemory;
        }

        /**
         * @return scaleMax
         */
        public Long getScaleMax() {
            return this.scaleMax;
        }

        /**
         * @return scaleMin
         */
        public Long getScaleMin() {
            return this.scaleMin;
        }

        /**
         * @return scaleReplica
         */
        public Long getScaleReplica() {
            return this.scaleReplica;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageSize
         */
        public Long getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return tenantClusterId
         */
        public String getTenantClusterId() {
            return this.tenantClusterId;
        }

        /**
         * @return tenantToken
         */
        public String getTenantToken() {
            return this.tenantToken;
        }

        /**
         * @return tenantUserId
         */
        public String getTenantUserId() {
            return this.tenantUserId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        public static final class Builder {
            private String category; 
            private String chargeType; 
            private Integer clusterCount; 
            private String DBInstanceId; 
            private String description; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String gmtCreated; 
            private String gmtModified; 
            private String instanceUsedType; 
            private Boolean isDeleted; 
            private Long lockMode; 
            private String lockReason; 
            private String maintainEndTimeStr; 
            private String maintainEndtime; 
            private String maintainStartTimeStr; 
            private String maintainStarttime; 
            private Long objectStoreSize; 
            private String parentInstance; 
            private String regionId; 
            private Long resourceCpu; 
            private String resourceGroupId; 
            private Long resourceMemory; 
            private Long scaleMax; 
            private Long scaleMin; 
            private Long scaleReplica; 
            private String status; 
            private Long storageSize; 
            private String storageType; 
            private java.util.List < Tags> tags; 
            private String tenantClusterId; 
            private String tenantToken; 
            private String tenantUserId; 
            private String vpcId; 
            private String vswitchId; 
            private String zoneId; 
            private String connectionString; 

            /**
             * <p>The edition of the instance. Default value: basic.</p>
             * 
             * <strong>example:</strong>
             * <p>basic</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
             * <li><strong>Prepaid</strong>: subscription.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The total number of clusters.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder clusterCount(Integer clusterCount) {
                this.clusterCount = clusterCount;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb-cn-7213cjv****</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The description of the instance.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The database engine of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The database engine version of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2.4</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The time when the cluster expires.</p>
             * <blockquote>
             * <p> A specific value is returned only for subscription clusters whose billing method is <strong>Prepaid</strong>. For pay-as-you-go clusters whose billing method is <strong>Postpaid</strong>, no value is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2024-03-29T03:47:05Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The time when the task was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-12T04:14Z</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The time when the task was last modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-12T19:05Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Instance</p>
             */
            public Builder instanceUsedType(String instanceUsedType) {
                this.instanceUsedType = instanceUsedType;
                return this;
            }

            /**
             * <p>Indicates whether the instance is deleted. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDeleted(Boolean isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * <p>The lock mode of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lockMode(Long lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The reason why the instance is locked.</p>
             * 
             * <strong>example:</strong>
             * <p>nolock</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The end timestamp of the maintenance window.</p>
             */
            public Builder maintainEndTimeStr(String maintainEndTimeStr) {
                this.maintainEndTimeStr = maintainEndTimeStr;
                return this;
            }

            /**
             * <p>The end time of the instance maintenance window.</p>
             */
            public Builder maintainEndtime(String maintainEndtime) {
                this.maintainEndtime = maintainEndtime;
                return this;
            }

            /**
             * <p>The start timestamp of the maintenance window.</p>
             */
            public Builder maintainStartTimeStr(String maintainStartTimeStr) {
                this.maintainStartTimeStr = maintainStartTimeStr;
                return this;
            }

            /**
             * <p>The start time of the instance maintenance window.</p>
             */
            public Builder maintainStarttime(String maintainStarttime) {
                this.maintainStarttime = maintainStarttime;
                return this;
            }

            /**
             * <p>The storage capacity of the instance. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder objectStoreSize(Long objectStoreSize) {
                this.objectStoreSize = objectStoreSize;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             */
            public Builder parentInstance(String parentInstance) {
                this.parentInstance = parentInstance;
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
             * <p>The number of CPU cores of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder resourceCpu(Long resourceCpu) {
                this.resourceCpu = resourceCpu;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The memory capacity of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>64</p>
             */
            public Builder resourceMemory(Long resourceMemory) {
                this.resourceMemory = resourceMemory;
                return this;
            }

            /**
             * <p>The maximum number of RCUs.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scaleMax(Long scaleMax) {
                this.scaleMax = scaleMax;
                return this;
            }

            /**
             * <p>The minimum number of RDS capacity units (RCUs).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scaleMin(Long scaleMin) {
                this.scaleMin = scaleMin;
                return this;
            }

            /**
             * <p>This parameter is not returned.</p>
             */
            public Builder scaleReplica(Long scaleReplica) {
                this.scaleReplica = scaleReplica;
                return this;
            }

            /**
             * <p>The state of the instance. Valid values:</p>
             * <ul>
             * <li><strong>CREATING</strong>: The instance is being created.</li>
             * <li><strong>ACTIVATION</strong>: The instance is running.</li>
             * <li><strong>RESOURCE_CHANGING</strong>: The resource configuration of the instance is being changed.</li>
             * <li><strong>ORDER_PREPARING</strong>: The order is being confirmed.</li>
             * <li><strong>READONLY_RESOURCE_CHANGING</strong>: The resource configuration of the instance is being changed and the instance is write-locked.</li>
             * <li><strong>DELETING</strong>: The instance is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVATION</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The cache size.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder storageSize(Long storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * <p>The storage type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The details about each tag returned.</p>
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the cluster that is monitored by Managed Service for Prometheus.</p>
             */
            public Builder tenantClusterId(String tenantClusterId) {
                this.tenantClusterId = tenantClusterId;
                return this;
            }

            /**
             * <p>The token that is used to access Managed Service for Prometheus.</p>
             */
            public Builder tenantToken(String tenantToken) {
                this.tenantToken = tenantToken;
                return this;
            }

            /**
             * <p>The ID of the account that uses Managed Service for Prometheus.</p>
             */
            public Builder tenantUserId(String tenantUserId) {
                this.tenantUserId = tenantUserId;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp175iuvg8nxqraf2****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1gzt31twhlo0sa5****</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * <p>The connection string of the instance.</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
