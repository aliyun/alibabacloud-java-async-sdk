// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
    @com.aliyun.core.annotation.NameInMap("DBInstances")
    private java.util.List<DBInstances> DBInstances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNumber")
    private Integer totalNumber;

    private DescribeDBInstancesResponseBody(Builder builder) {
        this.DBInstances = builder.DBInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalNumber = builder.totalNumber;
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
     * @return DBInstances
     */
    public java.util.List<DBInstances> getDBInstances() {
        return this.DBInstances;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return this.totalNumber;
    }

    public static final class Builder {
        private java.util.List<DBInstances> DBInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalNumber; 

        private Builder() {
        } 

        private Builder(DescribeDBInstancesResponseBody model) {
            this.DBInstances = model.DBInstances;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalNumber = model.totalNumber;
        } 

        /**
         * <p>The list of instances.</p>
         */
        public Builder DBInstances(java.util.List<DBInstances> DBInstances) {
            this.DBInstances = DBInstances;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder totalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
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
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Nodes(Builder builder) {
            this.classCode = builder.classCode;
            this.id = builder.id;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return classCode
         */
        public String getClassCode() {
            return this.classCode;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String classCode; 
            private String id; 
            private String name; 
            private String regionId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.classCode = model.classCode;
                this.id = model.id;
                this.name = model.name;
                this.regionId = model.regionId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx.x4.large.2e</p>
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pxi-zd89wrzqh******</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-bjryuycxlckxxxx-cn</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g-aliyun</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesResponseBody</p>
     */
    public static class TagSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagSet(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagSet create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(TagSet model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagSet build() {
                return new TagSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesResponseBody</p>
     */
    public static class DBInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdcInstanceName")
        private String cdcInstanceName;

        @com.aliyun.core.annotation.NameInMap("CnNodeClassCode")
        private String cnNodeClassCode;

        @com.aliyun.core.annotation.NameInMap("CnNodeCount")
        private Integer cnNodeCount;

        @com.aliyun.core.annotation.NameInMap("ColumnarInstanceName")
        private String columnarInstanceName;

        @com.aliyun.core.annotation.NameInMap("ColumnarReadDBInstances")
        private java.util.List<String> columnarReadDBInstances;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("ContainBinlogX")
        private Boolean containBinlogX;

        @com.aliyun.core.annotation.NameInMap("CpuType")
        private String cpuType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("DBType")
        private String DBType;

        @com.aliyun.core.annotation.NameInMap("DBVersion")
        private String DBVersion;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DnNodeClassCode")
        private String dnNodeClassCode;

        @com.aliyun.core.annotation.NameInMap("DnNodeCount")
        private Integer dnNodeCount;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private Boolean expired;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("MinorVersion")
        private String minorVersion;

        @com.aliyun.core.annotation.NameInMap("Network")
        private String network;

        @com.aliyun.core.annotation.NameInMap("NodeClass")
        private String nodeClass;

        @com.aliyun.core.annotation.NameInMap("NodeCount")
        private Integer nodeCount;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("PrimaryInstanceId")
        private String primaryInstanceId;

        @com.aliyun.core.annotation.NameInMap("PrimaryZone")
        @com.aliyun.core.annotation.Validation(required = true)
        private String primaryZone;

        @com.aliyun.core.annotation.NameInMap("ReadDBInstances")
        private java.util.List<String> readDBInstances;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecondaryZone")
        private String secondaryZone;

        @com.aliyun.core.annotation.NameInMap("Series")
        private String series;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("StorageUsed")
        private Long storageUsed;

        @com.aliyun.core.annotation.NameInMap("SupportBinlogX")
        private Boolean supportBinlogX;

        @com.aliyun.core.annotation.NameInMap("TagSet")
        private java.util.List<TagSet> tagSet;

        @com.aliyun.core.annotation.NameInMap("TertiaryZone")
        private String tertiaryZone;

        @com.aliyun.core.annotation.NameInMap("TopologyType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String topologyType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("gdnRole")
        private String gdnRole;

        @com.aliyun.core.annotation.NameInMap("isInGdn")
        private Boolean isInGdn;

        private DBInstances(Builder builder) {
            this.cdcInstanceName = builder.cdcInstanceName;
            this.cnNodeClassCode = builder.cnNodeClassCode;
            this.cnNodeCount = builder.cnNodeCount;
            this.columnarInstanceName = builder.columnarInstanceName;
            this.columnarReadDBInstances = builder.columnarReadDBInstances;
            this.commodityCode = builder.commodityCode;
            this.containBinlogX = builder.containBinlogX;
            this.cpuType = builder.cpuType;
            this.createTime = builder.createTime;
            this.DBInstanceName = builder.DBInstanceName;
            this.DBType = builder.DBType;
            this.DBVersion = builder.DBVersion;
            this.description = builder.description;
            this.dnNodeClassCode = builder.dnNodeClassCode;
            this.dnNodeCount = builder.dnNodeCount;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.expired = builder.expired;
            this.id = builder.id;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.minorVersion = builder.minorVersion;
            this.network = builder.network;
            this.nodeClass = builder.nodeClass;
            this.nodeCount = builder.nodeCount;
            this.nodes = builder.nodes;
            this.payType = builder.payType;
            this.primaryInstanceId = builder.primaryInstanceId;
            this.primaryZone = builder.primaryZone;
            this.readDBInstances = builder.readDBInstances;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.secondaryZone = builder.secondaryZone;
            this.series = builder.series;
            this.status = builder.status;
            this.storageType = builder.storageType;
            this.storageUsed = builder.storageUsed;
            this.supportBinlogX = builder.supportBinlogX;
            this.tagSet = builder.tagSet;
            this.tertiaryZone = builder.tertiaryZone;
            this.topologyType = builder.topologyType;
            this.type = builder.type;
            this.VPCId = builder.VPCId;
            this.zoneId = builder.zoneId;
            this.gdnRole = builder.gdnRole;
            this.isInGdn = builder.isInGdn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstances create() {
            return builder().build();
        }

        /**
         * @return cdcInstanceName
         */
        public String getCdcInstanceName() {
            return this.cdcInstanceName;
        }

        /**
         * @return cnNodeClassCode
         */
        public String getCnNodeClassCode() {
            return this.cnNodeClassCode;
        }

        /**
         * @return cnNodeCount
         */
        public Integer getCnNodeCount() {
            return this.cnNodeCount;
        }

        /**
         * @return columnarInstanceName
         */
        public String getColumnarInstanceName() {
            return this.columnarInstanceName;
        }

        /**
         * @return columnarReadDBInstances
         */
        public java.util.List<String> getColumnarReadDBInstances() {
            return this.columnarReadDBInstances;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return containBinlogX
         */
        public Boolean getContainBinlogX() {
            return this.containBinlogX;
        }

        /**
         * @return cpuType
         */
        public String getCpuType() {
            return this.cpuType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return DBType
         */
        public String getDBType() {
            return this.DBType;
        }

        /**
         * @return DBVersion
         */
        public String getDBVersion() {
            return this.DBVersion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dnNodeClassCode
         */
        public String getDnNodeClassCode() {
            return this.dnNodeClassCode;
        }

        /**
         * @return dnNodeCount
         */
        public Integer getDnNodeCount() {
            return this.dnNodeCount;
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
         * @return expired
         */
        public Boolean getExpired() {
            return this.expired;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return minorVersion
         */
        public String getMinorVersion() {
            return this.minorVersion;
        }

        /**
         * @return network
         */
        public String getNetwork() {
            return this.network;
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
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return primaryInstanceId
         */
        public String getPrimaryInstanceId() {
            return this.primaryInstanceId;
        }

        /**
         * @return primaryZone
         */
        public String getPrimaryZone() {
            return this.primaryZone;
        }

        /**
         * @return readDBInstances
         */
        public java.util.List<String> getReadDBInstances() {
            return this.readDBInstances;
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
         * @return secondaryZone
         */
        public String getSecondaryZone() {
            return this.secondaryZone;
        }

        /**
         * @return series
         */
        public String getSeries() {
            return this.series;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return storageUsed
         */
        public Long getStorageUsed() {
            return this.storageUsed;
        }

        /**
         * @return supportBinlogX
         */
        public Boolean getSupportBinlogX() {
            return this.supportBinlogX;
        }

        /**
         * @return tagSet
         */
        public java.util.List<TagSet> getTagSet() {
            return this.tagSet;
        }

        /**
         * @return tertiaryZone
         */
        public String getTertiaryZone() {
            return this.tertiaryZone;
        }

        /**
         * @return topologyType
         */
        public String getTopologyType() {
            return this.topologyType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return gdnRole
         */
        public String getGdnRole() {
            return this.gdnRole;
        }

        /**
         * @return isInGdn
         */
        public Boolean getIsInGdn() {
            return this.isInGdn;
        }

        public static final class Builder {
            private String cdcInstanceName; 
            private String cnNodeClassCode; 
            private Integer cnNodeCount; 
            private String columnarInstanceName; 
            private java.util.List<String> columnarReadDBInstances; 
            private String commodityCode; 
            private Boolean containBinlogX; 
            private String cpuType; 
            private String createTime; 
            private String DBInstanceName; 
            private String DBType; 
            private String DBVersion; 
            private String description; 
            private String dnNodeClassCode; 
            private Integer dnNodeCount; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private Boolean expired; 
            private String id; 
            private String lockMode; 
            private String lockReason; 
            private String minorVersion; 
            private String network; 
            private String nodeClass; 
            private Integer nodeCount; 
            private java.util.List<Nodes> nodes; 
            private String payType; 
            private String primaryInstanceId; 
            private String primaryZone; 
            private java.util.List<String> readDBInstances; 
            private String regionId; 
            private String resourceGroupId; 
            private String secondaryZone; 
            private String series; 
            private String status; 
            private String storageType; 
            private Long storageUsed; 
            private Boolean supportBinlogX; 
            private java.util.List<TagSet> tagSet; 
            private String tertiaryZone; 
            private String topologyType; 
            private String type; 
            private String VPCId; 
            private String zoneId; 
            private String gdnRole; 
            private Boolean isInGdn; 

            private Builder() {
            } 

            private Builder(DBInstances model) {
                this.cdcInstanceName = model.cdcInstanceName;
                this.cnNodeClassCode = model.cnNodeClassCode;
                this.cnNodeCount = model.cnNodeCount;
                this.columnarInstanceName = model.columnarInstanceName;
                this.columnarReadDBInstances = model.columnarReadDBInstances;
                this.commodityCode = model.commodityCode;
                this.containBinlogX = model.containBinlogX;
                this.cpuType = model.cpuType;
                this.createTime = model.createTime;
                this.DBInstanceName = model.DBInstanceName;
                this.DBType = model.DBType;
                this.DBVersion = model.DBVersion;
                this.description = model.description;
                this.dnNodeClassCode = model.dnNodeClassCode;
                this.dnNodeCount = model.dnNodeCount;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.expireTime = model.expireTime;
                this.expired = model.expired;
                this.id = model.id;
                this.lockMode = model.lockMode;
                this.lockReason = model.lockReason;
                this.minorVersion = model.minorVersion;
                this.network = model.network;
                this.nodeClass = model.nodeClass;
                this.nodeCount = model.nodeCount;
                this.nodes = model.nodes;
                this.payType = model.payType;
                this.primaryInstanceId = model.primaryInstanceId;
                this.primaryZone = model.primaryZone;
                this.readDBInstances = model.readDBInstances;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.secondaryZone = model.secondaryZone;
                this.series = model.series;
                this.status = model.status;
                this.storageType = model.storageType;
                this.storageUsed = model.storageUsed;
                this.supportBinlogX = model.supportBinlogX;
                this.tagSet = model.tagSet;
                this.tertiaryZone = model.tertiaryZone;
                this.topologyType = model.topologyType;
                this.type = model.type;
                this.VPCId = model.VPCId;
                this.zoneId = model.zoneId;
                this.gdnRole = model.gdnRole;
                this.isInGdn = model.isInGdn;
            } 

            /**
             * <p>The name of the log node.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-c-dmlgit****</p>
             */
            public Builder cdcInstanceName(String cdcInstanceName) {
                this.cdcInstanceName = cdcInstanceName;
                return this;
            }

            /**
             * <p>The CN node specifications. Valid values:</p>
             * <ul>
             * <li><strong>polarx.x4.medium.2e</strong>: 2 cores, 8 GB</li>
             * <li><strong>polarx.x4.large.2e</strong>: 4 cores, 16 GB</li>
             * <li><strong>polarx.x8.large.2e</strong>: 4 cores, 32 GB</li>
             * <li><strong>polarx.x4.xlarge.2e</strong>: 8 cores, 32 GB</li>
             * <li><strong>polarx.x8.xlarge.2e</strong>: 8 cores, 64 GB</li>
             * <li><strong>polarx.x4.2xlarge.2e</strong>: 16 cores, 64 GB</li>
             * <li><strong>polarx.x8.2xlarge.2e</strong>: 16 cores, 128 GB</li>
             * <li><strong>polarx.x4.4xlarge.2e</strong>: 32 cores, 128 GB</li>
             * <li><strong>polarx.x8.4xlarge.2e</strong>: 32 cores, 256 GB</li>
             * <li><strong>polarx.st.8xlarge.2e</strong>: 60 cores, 470 GB</li>
             * <li><strong>polarx.st.12xlarge.2e</strong>: 90 cores, 720 GB</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>polarx.x4.large.2e</p>
             */
            public Builder cnNodeClassCode(String cnNodeClassCode) {
                this.cnNodeClassCode = cnNodeClassCode;
                return this;
            }

            /**
             * <p>The number of CN nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cnNodeCount(Integer cnNodeCount) {
                this.cnNodeCount = cnNodeCount;
                return this;
            }

            /**
             * <p>The name of the column store engine instance.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxxx</p>
             */
            public Builder columnarInstanceName(String columnarInstanceName) {
                this.columnarInstanceName = columnarInstanceName;
                return this;
            }

            /**
             * <p>The information about the column store read-only instance.</p>
             */
            public Builder columnarReadDBInstances(java.util.List<String> columnarReadDBInstances) {
                this.columnarReadDBInstances = columnarReadDBInstances;
                return this;
            }

            /**
             * <p>The commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>drds_polarxpre_public_cn</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>Indicates whether the multi-flow log service is included. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder containBinlogX(Boolean containBinlogX) {
                this.containBinlogX = containBinlogX;
                return this;
            }

            /**
             * <p>The CPU architecture.</p>
             * 
             * <strong>example:</strong>
             * <p>x86</p>
             */
            public Builder cpuType(String cpuType) {
                this.cpuType = cpuType;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-01T03:49:50.000+0000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The database instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-xxxxx</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The database type.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx</p>
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * <p>The database version.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * <p>The database description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The DN node specifications. Valid values:</p>
             * <ul>
             * <li><strong>mysql.n2.medium.25</strong>: 2 cores, 4 GB</li>
             * <li><strong>mysql.n4.medium.25</strong>: 2 cores, 8 GB</li>
             * <li><strong>mysql.x8.medium.25</strong>: 2 cores, 16 GB</li>
             * <li><strong>mysql.n2.large.25</strong>: 4 cores, 8 GB</li>
             * <li><strong>mysql.n4.large.25</strong>: 4 cores, 16 GB</li>
             * <li><strong>mysql.x8.large.25</strong>: 4 cores, 32 GB</li>
             * <li><strong>mysql.n2.xlarge.25</strong>: 8 cores, 16 GB</li>
             * <li><strong>mysql.n4.xlarge.25</strong>: 8 cores, 32 GB</li>
             * <li><strong>mysql.x8.xlarge.25</strong>: 8 cores, 64 GB</li>
             * <li><strong>mysql.n4.2xlarge.25</strong>: 16 cores, 64 GB</li>
             * <li><strong>mysql.x8.2xlarge.25</strong>: 16 cores, 128 GB</li>
             * <li><strong>mysql.x4.4xlarge.25</strong>: 32 cores, 128 GB</li>
             * <li><strong>mysql.x8.4xlarge.25</strong>: 32 cores, 256 GB</li>
             * <li><strong>mysql.st.8xlarge.25</strong>: 60 cores, 470 GB</li>
             * <li><strong>mysql.st.12xlarge.25</strong>: 90 cores, 720 GB</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mysql.n4.medium.25</p>
             */
            public Builder dnNodeClassCode(String dnNodeClassCode) {
                this.dnNodeClassCode = dnNodeClassCode;
                return this;
            }

            /**
             * <p>The number of DN nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder dnNodeCount(Integer dnNodeCount) {
                this.dnNodeCount = dnNodeCount;
                return this;
            }

            /**
             * <p>The engine type.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The database engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>8.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-01T16:00:00.000+0000</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Indicates whether the instance has expired.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-hzr2yeov******</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the instance is locked.</p>
             * 
             * <strong>example:</strong>
             * <p>Unlock</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The lock reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Overdue payments</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The current kernel version.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx-kernel_5.4.12-16349923_xcluster-20210926</p>
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
                return this;
            }

            /**
             * <p>The network type.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The node specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx.x4.large.2e</p>
             */
            public Builder nodeClass(String nodeClass) {
                this.nodeClass = nodeClass;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * <p>The list of nodes.</p>
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
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
             * <p>Prepaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The primary instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-hzrof9vitxxx</p>
             */
            public Builder primaryInstanceId(String primaryInstanceId) {
                this.primaryInstanceId = primaryInstanceId;
                return this;
            }

            /**
             * <p>The primary zone.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-j</p>
             */
            public Builder primaryZone(String primaryZone) {
                this.primaryZone = primaryZone;
                return this;
            }

            /**
             * <p>The list of read-only instances.</p>
             */
            public Builder readDBInstances(java.util.List<String> readDBInstances) {
                this.readDBInstances = readDBInstances;
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
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-xxxxxx</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The secondary zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-l</p>
             */
            public Builder secondaryZone(String secondaryZone) {
                this.secondaryZone = secondaryZone;
                return this;
            }

            /**
             * <p>The instance edition. Valid values:</p>
             * <ul>
             * <li><strong>enterprise</strong>: Enterprise Edition</li>
             * <li><strong>standard</strong>: Standard Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enterprise</p>
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            /**
             * <p>The instance status. For more information, see the following section.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * 
             * <strong>example:</strong>
             * <p>custom_local_ssd | cloud_auto</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The storage usage.</p>
             * 
             * <strong>example:</strong>
             * <p>40658534400</p>
             */
            public Builder storageUsed(Long storageUsed) {
                this.storageUsed = storageUsed;
                return this;
            }

            /**
             * <p>Indicates whether the current instance supports multi-stream. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportBinlogX(Boolean supportBinlogX) {
                this.supportBinlogX = supportBinlogX;
                return this;
            }

            /**
             * <p>The tag set.</p>
             */
            public Builder tagSet(java.util.List<TagSet> tagSet) {
                this.tagSet = tagSet;
                return this;
            }

            /**
             * <p>The third active zone in a Three-zone deployment.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-k</p>
             */
            public Builder tertiaryZone(String tertiaryZone) {
                this.tertiaryZone = tertiaryZone;
                return this;
            }

            /**
             * <p>The topology type. Valid values:</p>
             * <ul>
             * <li><strong>3azones</strong>: Three-zone deployment (three active zones)</li>
             * <li><strong>1azone</strong>: Single-zone deployment (single active zone)</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>3azones</p>
             */
            public Builder topologyType(String topologyType) {
                this.topologyType = topologyType;
                return this;
            }

            /**
             * <p>The instance type. Valid values:</p>
             * <ul>
             * <li><strong>ReadWrite</strong>: primary instance</li>
             * <li><strong>ReadOnly</strong>: read-only instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ReadWrite</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>VPCID</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * <p>The GDN role.</p>
             * 
             * <strong>example:</strong>
             * <p>master | standby</p>
             */
            public Builder gdnRole(String gdnRole) {
                this.gdnRole = gdnRole;
                return this;
            }

            /**
             * <p>Indicates whether the instance belongs to a global database network (GDN).</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isInGdn(Boolean isInGdn) {
                this.isInGdn = isInGdn;
                return this;
            }

            public DBInstances build() {
                return new DBInstances(this);
            } 

        } 

    }
}
