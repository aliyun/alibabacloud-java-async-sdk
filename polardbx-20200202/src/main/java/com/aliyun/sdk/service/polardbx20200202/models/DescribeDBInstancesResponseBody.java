// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancesResponseBody</p>
 */
public class DescribeDBInstancesResponseBody extends TeaModel {
    @NameInMap("DBInstances")
    private java.util.List < DBInstances> DBInstances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalNumber")
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

    /**
     * @return DBInstances
     */
    public java.util.List < DBInstances> getDBInstances() {
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
        private java.util.List < DBInstances> DBInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalNumber; 

        /**
         * DBInstances.
         */
        public Builder DBInstances(java.util.List < DBInstances> DBInstances) {
            this.DBInstances = DBInstances;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalNumber.
         */
        public Builder totalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }

        public DescribeDBInstancesResponseBody build() {
            return new DescribeDBInstancesResponseBody(this);
        } 

    } 

    public static class Nodes extends TeaModel {
        @NameInMap("ClassCode")
        private String classCode;

        @NameInMap("Id")
        private String id;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ZoneId")
        private String zoneId;

        private Nodes(Builder builder) {
            this.classCode = builder.classCode;
            this.id = builder.id;
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
            private String regionId; 
            private String zoneId; 

            /**
             * ClassCode.
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ZoneId.
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
    public static class TagSet extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class DBInstances extends TeaModel {
        @NameInMap("CdcInstanceName")
        private String cdcInstanceName;

        @NameInMap("CnNodeClassCode")
        private String cnNodeClassCode;

        @NameInMap("CnNodeCount")
        private Integer cnNodeCount;

        @NameInMap("ColumnarInstanceName")
        private String columnarInstanceName;

        @NameInMap("ColumnarReadDBInstances")
        private java.util.List < String > columnarReadDBInstances;

        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("ContainBinlogX")
        private Boolean containBinlogX;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DBInstanceName")
        private String DBInstanceName;

        @NameInMap("DBType")
        private String DBType;

        @NameInMap("DBVersion")
        private String DBVersion;

        @NameInMap("Description")
        private String description;

        @NameInMap("DnNodeClassCode")
        private String dnNodeClassCode;

        @NameInMap("DnNodeCount")
        private Integer dnNodeCount;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("Expired")
        private Boolean expired;

        @NameInMap("Id")
        private String id;

        @NameInMap("LockMode")
        private String lockMode;

        @NameInMap("LockReason")
        private String lockReason;

        @NameInMap("MinorVersion")
        private String minorVersion;

        @NameInMap("Network")
        private String network;

        @NameInMap("NodeClass")
        private String nodeClass;

        @NameInMap("NodeCount")
        private Integer nodeCount;

        @NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("PrimaryZone")
        @Validation(required = true)
        private String primaryZone;

        @NameInMap("ReadDBInstances")
        private java.util.List < String > readDBInstances;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SecondaryZone")
        private String secondaryZone;

        @NameInMap("Series")
        private String series;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageUsed")
        private Long storageUsed;

        @NameInMap("SupportBinlogX")
        private Boolean supportBinlogX;

        @NameInMap("TagSet")
        private java.util.List < TagSet> tagSet;

        @NameInMap("TertiaryZone")
        private String tertiaryZone;

        @NameInMap("TopologyType")
        @Validation(required = true)
        private String topologyType;

        @NameInMap("Type")
        private String type;

        @NameInMap("VPCId")
        private String VPCId;

        @NameInMap("ZoneId")
        private String zoneId;

        private DBInstances(Builder builder) {
            this.cdcInstanceName = builder.cdcInstanceName;
            this.cnNodeClassCode = builder.cnNodeClassCode;
            this.cnNodeCount = builder.cnNodeCount;
            this.columnarInstanceName = builder.columnarInstanceName;
            this.columnarReadDBInstances = builder.columnarReadDBInstances;
            this.commodityCode = builder.commodityCode;
            this.containBinlogX = builder.containBinlogX;
            this.createTime = builder.createTime;
            this.DBInstanceName = builder.DBInstanceName;
            this.DBType = builder.DBType;
            this.DBVersion = builder.DBVersion;
            this.description = builder.description;
            this.dnNodeClassCode = builder.dnNodeClassCode;
            this.dnNodeCount = builder.dnNodeCount;
            this.engine = builder.engine;
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
            this.primaryZone = builder.primaryZone;
            this.readDBInstances = builder.readDBInstances;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.secondaryZone = builder.secondaryZone;
            this.series = builder.series;
            this.status = builder.status;
            this.storageUsed = builder.storageUsed;
            this.supportBinlogX = builder.supportBinlogX;
            this.tagSet = builder.tagSet;
            this.tertiaryZone = builder.tertiaryZone;
            this.topologyType = builder.topologyType;
            this.type = builder.type;
            this.VPCId = builder.VPCId;
            this.zoneId = builder.zoneId;
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
        public java.util.List < String > getColumnarReadDBInstances() {
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
        public java.util.List < Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
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
        public java.util.List < String > getReadDBInstances() {
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
        public java.util.List < TagSet> getTagSet() {
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

        public static final class Builder {
            private String cdcInstanceName; 
            private String cnNodeClassCode; 
            private Integer cnNodeCount; 
            private String columnarInstanceName; 
            private java.util.List < String > columnarReadDBInstances; 
            private String commodityCode; 
            private Boolean containBinlogX; 
            private String createTime; 
            private String DBInstanceName; 
            private String DBType; 
            private String DBVersion; 
            private String description; 
            private String dnNodeClassCode; 
            private Integer dnNodeCount; 
            private String engine; 
            private String expireTime; 
            private Boolean expired; 
            private String id; 
            private String lockMode; 
            private String lockReason; 
            private String minorVersion; 
            private String network; 
            private String nodeClass; 
            private Integer nodeCount; 
            private java.util.List < Nodes> nodes; 
            private String payType; 
            private String primaryZone; 
            private java.util.List < String > readDBInstances; 
            private String regionId; 
            private String resourceGroupId; 
            private String secondaryZone; 
            private String series; 
            private String status; 
            private Long storageUsed; 
            private Boolean supportBinlogX; 
            private java.util.List < TagSet> tagSet; 
            private String tertiaryZone; 
            private String topologyType; 
            private String type; 
            private String VPCId; 
            private String zoneId; 

            /**
             * CdcInstanceName.
             */
            public Builder cdcInstanceName(String cdcInstanceName) {
                this.cdcInstanceName = cdcInstanceName;
                return this;
            }

            /**
             * CnNodeClassCode.
             */
            public Builder cnNodeClassCode(String cnNodeClassCode) {
                this.cnNodeClassCode = cnNodeClassCode;
                return this;
            }

            /**
             * CnNodeCount.
             */
            public Builder cnNodeCount(Integer cnNodeCount) {
                this.cnNodeCount = cnNodeCount;
                return this;
            }

            /**
             * ColumnarInstanceName.
             */
            public Builder columnarInstanceName(String columnarInstanceName) {
                this.columnarInstanceName = columnarInstanceName;
                return this;
            }

            /**
             * ColumnarReadDBInstances.
             */
            public Builder columnarReadDBInstances(java.util.List < String > columnarReadDBInstances) {
                this.columnarReadDBInstances = columnarReadDBInstances;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * ContainBinlogX.
             */
            public Builder containBinlogX(Boolean containBinlogX) {
                this.containBinlogX = containBinlogX;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DBInstanceName.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * DBType.
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * DBVersion.
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DnNodeClassCode.
             */
            public Builder dnNodeClassCode(String dnNodeClassCode) {
                this.dnNodeClassCode = dnNodeClassCode;
                return this;
            }

            /**
             * DnNodeCount.
             */
            public Builder dnNodeCount(Integer dnNodeCount) {
                this.dnNodeCount = dnNodeCount;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Expired.
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * LockMode.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * LockReason.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * MinorVersion.
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
                return this;
            }

            /**
             * Network.
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * NodeClass.
             */
            public Builder nodeClass(String nodeClass) {
                this.nodeClass = nodeClass;
                return this;
            }

            /**
             * NodeCount.
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * 主可用区。
             */
            public Builder primaryZone(String primaryZone) {
                this.primaryZone = primaryZone;
                return this;
            }

            /**
             * ReadDBInstances.
             */
            public Builder readDBInstances(java.util.List < String > readDBInstances) {
                this.readDBInstances = readDBInstances;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * 次可用区。
             */
            public Builder secondaryZone(String secondaryZone) {
                this.secondaryZone = secondaryZone;
                return this;
            }

            /**
             * Series.
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StorageUsed.
             */
            public Builder storageUsed(Long storageUsed) {
                this.storageUsed = storageUsed;
                return this;
            }

            /**
             * SupportBinlogX.
             */
            public Builder supportBinlogX(Boolean supportBinlogX) {
                this.supportBinlogX = supportBinlogX;
                return this;
            }

            /**
             * TagSet.
             */
            public Builder tagSet(java.util.List < TagSet> tagSet) {
                this.tagSet = tagSet;
                return this;
            }

            /**
             * 第三可用区。
             */
            public Builder tertiaryZone(String tertiaryZone) {
                this.tertiaryZone = tertiaryZone;
                return this;
            }

            /**
             * 拓扑类型：
             * <p>
             * 
             * - **3azones**：三可用区；
             * - **1azone**：单可用区。
             */
            public Builder topologyType(String topologyType) {
                this.topologyType = topologyType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * VPC ID。
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBInstances build() {
                return new DBInstances(this);
            } 

        } 

    }
}
