// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancesResponseBody</p>
 */
public class DescribeDBInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeDBInstancesResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of instance details.</p>
         */
        public Builder items(java.util.List<Items> items) {
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
         * <p>The total number of records.</p>
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
    public static class FEClusterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbClusterId")
        private String dbClusterId;

        @com.aliyun.core.annotation.NameInMap("NodeCount")
        private Long nodeCount;

        @com.aliyun.core.annotation.NameInMap("SingleNodeCpuCores")
        private Long singleNodeCpuCores;

        @com.aliyun.core.annotation.NameInMap("SingleNodeMemoryInGB")
        private Long singleNodeMemoryInGB;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private FEClusterList(Builder builder) {
            this.dbClusterId = builder.dbClusterId;
            this.nodeCount = builder.nodeCount;
            this.singleNodeCpuCores = builder.singleNodeCpuCores;
            this.singleNodeMemoryInGB = builder.singleNodeMemoryInGB;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FEClusterList create() {
            return builder().build();
        }

        /**
         * @return dbClusterId
         */
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        /**
         * @return nodeCount
         */
        public Long getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return singleNodeCpuCores
         */
        public Long getSingleNodeCpuCores() {
            return this.singleNodeCpuCores;
        }

        /**
         * @return singleNodeMemoryInGB
         */
        public Long getSingleNodeMemoryInGB() {
            return this.singleNodeMemoryInGB;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String dbClusterId; 
            private Long nodeCount; 
            private Long singleNodeCpuCores; 
            private Long singleNodeMemoryInGB; 
            private String status; 

            private Builder() {
            } 

            private Builder(FEClusterList model) {
                this.dbClusterId = model.dbClusterId;
                this.nodeCount = model.nodeCount;
                this.singleNodeCpuCores = model.singleNodeCpuCores;
                this.singleNodeMemoryInGB = model.singleNodeMemoryInGB;
                this.status = model.status;
            } 

            /**
             * <p>The name of the FE cluster.</p>
             */
            public Builder dbClusterId(String dbClusterId) {
                this.dbClusterId = dbClusterId;
                return this;
            }

            /**
             * <p>The number of nodes in the FE cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder nodeCount(Long nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * <p>The number of CPU cores per node in the FE cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder singleNodeCpuCores(Long singleNodeCpuCores) {
                this.singleNodeCpuCores = singleNodeCpuCores;
                return this;
            }

            /**
             * <p>The memory per node in the FE cluster. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder singleNodeMemoryInGB(Long singleNodeMemoryInGB) {
                this.singleNodeMemoryInGB = singleNodeMemoryInGB;
                return this;
            }

            /**
             * <p>The status of the FE cluster.</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public FEClusterList build() {
                return new FEClusterList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesResponseBody</p>
     */
    public static class MultiZone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private MultiZone(Builder builder) {
            this.vSwitchIds = builder.vSwitchIds;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiZone create() {
            return builder().build();
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<String> vSwitchIds; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(MultiZone model) {
                this.vSwitchIds = model.vSwitchIds;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The list of vSwitch IDs.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-k</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public MultiZone build() {
                return new MultiZone(this);
            } 

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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
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

        @com.aliyun.core.annotation.NameInMap("DeployScheme")
        private String deployScheme;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineMinorVersion")
        private String engineMinorVersion;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("FEClusterList")
        private java.util.List<FEClusterList> FEClusterList;

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

        @com.aliyun.core.annotation.NameInMap("MultiZone")
        private java.util.List<MultiZone> multiZone;

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

        @com.aliyun.core.annotation.NameInMap("Serverless")
        private Boolean serverless;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Long storageSize;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

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
            this.deployScheme = builder.deployScheme;
            this.description = builder.description;
            this.engine = builder.engine;
            this.engineMinorVersion = builder.engineMinorVersion;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.FEClusterList = builder.FEClusterList;
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
            this.multiZone = builder.multiZone;
            this.objectStoreSize = builder.objectStoreSize;
            this.parentInstance = builder.parentInstance;
            this.regionId = builder.regionId;
            this.resourceCpu = builder.resourceCpu;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceMemory = builder.resourceMemory;
            this.scaleMax = builder.scaleMax;
            this.scaleMin = builder.scaleMin;
            this.scaleReplica = builder.scaleReplica;
            this.serverless = builder.serverless;
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
         * @return deployScheme
         */
        public String getDeployScheme() {
            return this.deployScheme;
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
         * @return engineMinorVersion
         */
        public String getEngineMinorVersion() {
            return this.engineMinorVersion;
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
         * @return FEClusterList
         */
        public java.util.List<FEClusterList> getFEClusterList() {
            return this.FEClusterList;
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
         * @return multiZone
         */
        public java.util.List<MultiZone> getMultiZone() {
            return this.multiZone;
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
         * @return serverless
         */
        public Boolean getServerless() {
            return this.serverless;
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
        public java.util.List<Tags> getTags() {
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
            private String deployScheme; 
            private String description; 
            private String engine; 
            private String engineMinorVersion; 
            private String engineVersion; 
            private String expireTime; 
            private java.util.List<FEClusterList> FEClusterList; 
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
            private java.util.List<MultiZone> multiZone; 
            private Long objectStoreSize; 
            private String parentInstance; 
            private String regionId; 
            private Long resourceCpu; 
            private String resourceGroupId; 
            private Long resourceMemory; 
            private Long scaleMax; 
            private Long scaleMin; 
            private Long scaleReplica; 
            private Boolean serverless; 
            private String status; 
            private Long storageSize; 
            private String storageType; 
            private java.util.List<Tags> tags; 
            private String tenantClusterId; 
            private String tenantToken; 
            private String tenantUserId; 
            private String vpcId; 
            private String vswitchId; 
            private String zoneId; 
            private String connectionString; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.category = model.category;
                this.chargeType = model.chargeType;
                this.clusterCount = model.clusterCount;
                this.DBInstanceId = model.DBInstanceId;
                this.deployScheme = model.deployScheme;
                this.description = model.description;
                this.engine = model.engine;
                this.engineMinorVersion = model.engineMinorVersion;
                this.engineVersion = model.engineVersion;
                this.expireTime = model.expireTime;
                this.FEClusterList = model.FEClusterList;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.instanceUsedType = model.instanceUsedType;
                this.isDeleted = model.isDeleted;
                this.lockMode = model.lockMode;
                this.lockReason = model.lockReason;
                this.maintainEndTimeStr = model.maintainEndTimeStr;
                this.maintainEndtime = model.maintainEndtime;
                this.maintainStartTimeStr = model.maintainStartTimeStr;
                this.maintainStarttime = model.maintainStarttime;
                this.multiZone = model.multiZone;
                this.objectStoreSize = model.objectStoreSize;
                this.parentInstance = model.parentInstance;
                this.regionId = model.regionId;
                this.resourceCpu = model.resourceCpu;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceMemory = model.resourceMemory;
                this.scaleMax = model.scaleMax;
                this.scaleMin = model.scaleMin;
                this.scaleReplica = model.scaleReplica;
                this.serverless = model.serverless;
                this.status = model.status;
                this.storageSize = model.storageSize;
                this.storageType = model.storageType;
                this.tags = model.tags;
                this.tenantClusterId = model.tenantClusterId;
                this.tenantToken = model.tenantToken;
                this.tenantUserId = model.tenantUserId;
                this.vpcId = model.vpcId;
                this.vswitchId = model.vswitchId;
                this.zoneId = model.zoneId;
                this.connectionString = model.connectionString;
            } 

            /**
             * <p>The instance edition. Default value: basic.</p>
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
             * <li><strong>Postpaid</strong>: pay-as-you-go</li>
             * <li><strong>Prepaid</strong>: subscription</li>
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
             * <p>The deployment mode of the instance. Valid values:</p>
             * <ul>
             * <li>multi_az: zone-redundant</li>
             * <li>single_az: locally redundant</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>single_az</p>
             */
            public Builder deployScheme(String deployScheme) {
                this.deployScheme = deployScheme;
                return this;
            }

            /**
             * <p>The description of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>New instance test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The minor engine version of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>4.0.4</p>
             */
            public Builder engineMinorVersion(String engineMinorVersion) {
                this.engineMinorVersion = engineMinorVersion;
                return this;
            }

            /**
             * <p>The database engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.4</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The expiration time of the cluster, in ISO 8601 format with time zone information.</p>
             * <blockquote>
             * <p>This parameter is returned only for <strong>Prepaid</strong> (subscription) clusters. For <strong>Postpaid</strong> (pay-as-you-go) clusters, an empty value is returned.</p>
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
             * <p>The list of FE clusters.</p>
             */
            public Builder FEClusterList(java.util.List<FEClusterList> FEClusterList) {
                this.FEClusterList = FEClusterList;
                return this;
            }

            /**
             * <p>The time when the task was created (GMT).</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-12T04:14Z</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The time when the task was modified (GMT).</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-12T19:05Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The instance usage type.</p>
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
             * <li><strong>true</strong>: The instance is deleted.</li>
             * <li><strong>fasle</strong>: The instance is not deleted.</li>
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
             * 
             * <strong>example:</strong>
             * <p>Reserved parameter. Not returned</p>
             */
            public Builder maintainEndTimeStr(String maintainEndTimeStr) {
                this.maintainEndTimeStr = maintainEndTimeStr;
                return this;
            }

            /**
             * <p>A reserved parameter that is not currently returned. The time format does not apply.</p>
             * 
             * <strong>example:</strong>
             * <p>Reserved parameter. Not returned</p>
             */
            public Builder maintainEndtime(String maintainEndtime) {
                this.maintainEndtime = maintainEndtime;
                return this;
            }

            /**
             * <p>The start timestamp of the maintenance window.</p>
             * 
             * <strong>example:</strong>
             * <p>Reserved parameter. Not returned</p>
             */
            public Builder maintainStartTimeStr(String maintainStartTimeStr) {
                this.maintainStartTimeStr = maintainStartTimeStr;
                return this;
            }

            /**
             * <p>A reserved parameter that is not currently returned. The time format does not apply.</p>
             * 
             * <strong>example:</strong>
             * <p>Reserved parameter. Not returned</p>
             */
            public Builder maintainStarttime(String maintainStarttime) {
                this.maintainStarttime = maintainStarttime;
                return this;
            }

            /**
             * <p>The multi-zone configuration.</p>
             */
            public Builder multiZone(java.util.List<MultiZone> multiZone) {
                this.multiZone = multiZone;
                return this;
            }

            /**
             * <p>The instance storage size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder objectStoreSize(Long objectStoreSize) {
                this.objectStoreSize = objectStoreSize;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>Reserved parameter. Not returned</p>
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
             * <p>The CPU resources.</p>
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
             * 
             * <strong>example:</strong>
             * <p>Reserved parameter. Not returned</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The memory resources.</p>
             * 
             * <strong>example:</strong>
             * <p>64</p>
             */
            public Builder resourceMemory(Long resourceMemory) {
                this.resourceMemory = resourceMemory;
                return this;
            }

            /**
             * <p>The maximum number of RDS capacity units (RCUs) in the automatic scaling range of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scaleMax(Long scaleMax) {
                this.scaleMax = scaleMax;
                return this;
            }

            /**
             * <p>The minimum number of RDS capacity units (RCUs) in the automatic scaling range of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scaleMin(Long scaleMin) {
                this.scaleMin = scaleMin;
                return this;
            }

            /**
             * <p>The redundant field.</p>
             * 
             * <strong>example:</strong>
             * <p>Null</p>
             */
            public Builder scaleReplica(Long scaleReplica) {
                this.scaleReplica = scaleReplica;
                return this;
            }

            /**
             * <p>Indicates whether the instance is a serverless instance.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder serverless(Boolean serverless) {
                this.serverless = serverless;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li><p><strong>CREATING</strong>: Creating.</p>
             * </li>
             * <li><p><strong>ACTIVATION</strong>: Running.</p>
             * </li>
             * <li><p><strong>RESOURCE_CHANGING</strong>: Changing specifications.</p>
             * </li>
             * <li><p><strong>ORDER_PREPARING</strong>: Confirming the order.</p>
             * </li>
             * <li><p><strong>READONLY_RESOURCE_CHANGING</strong>: Changing resources (the instance is locked for writing).</p>
             * </li>
             * <li><p><strong>DELETING</strong>: Deleting.</p>
             * </li>
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
             * <p>The storage capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder storageSize(Long storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * <p>The instance storage type.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The instance tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the Prometheus monitoring cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>Reserved parameter. Not returned</p>
             */
            public Builder tenantClusterId(String tenantClusterId) {
                this.tenantClusterId = tenantClusterId;
                return this;
            }

            /**
             * <p>The access token for Prometheus monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>Reserved parameter. Not returned</p>
             */
            public Builder tenantToken(String tenantToken) {
                this.tenantToken = tenantToken;
                return this;
            }

            /**
             * <p>The user account label for Prometheus monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>Reserved parameter. Not returned</p>
             */
            public Builder tenantUserId(String tenantUserId) {
                this.tenantUserId = tenantUserId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
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
             * <p>The endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>Not returned</p>
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
