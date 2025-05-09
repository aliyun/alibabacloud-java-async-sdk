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
 * {@link DescribeDBInstanceViaEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceViaEndpointResponseBody</p>
 */
public class DescribeDBInstanceViaEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstance")
    private DBInstance DBInstance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceViaEndpointResponseBody(Builder builder) {
        this.DBInstance = builder.DBInstance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceViaEndpointResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstance
     */
    public DBInstance getDBInstance() {
        return this.DBInstance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DBInstance DBInstance; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceViaEndpointResponseBody model) {
            this.DBInstance = model.DBInstance;
            this.requestId = model.requestId;
        } 

        /**
         * DBInstance.
         */
        public Builder DBInstance(DBInstance DBInstance) {
            this.DBInstance = DBInstance;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceViaEndpointResponseBody build() {
            return new DescribeDBInstanceViaEndpointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceViaEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceViaEndpointResponseBody</p>
     */
    public static class ConnAddrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Long port;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        private ConnAddrs(Builder builder) {
            this.connectionString = builder.connectionString;
            this.port = builder.port;
            this.type = builder.type;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcInstanceId = builder.vpcInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnAddrs create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
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
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public static final class Builder {
            private String connectionString; 
            private Long port; 
            private String type; 
            private String VPCId; 
            private String vSwitchId; 
            private String vpcInstanceId; 

            private Builder() {
            } 

            private Builder(ConnAddrs model) {
                this.connectionString = model.connectionString;
                this.port = model.port;
                this.type = model.type;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
                this.vpcInstanceId = model.vpcInstanceId;
            } 

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
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
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxxxxx</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcInstanceId.
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            public ConnAddrs build() {
                return new ConnAddrs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceViaEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceViaEndpointResponseBody</p>
     */
    public static class DBNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComputeNodeId")
        private String computeNodeId;

        @com.aliyun.core.annotation.NameInMap("DataNodeId")
        private String dataNodeId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("NodeClass")
        private String nodeClass;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBNodes(Builder builder) {
            this.computeNodeId = builder.computeNodeId;
            this.dataNodeId = builder.dataNodeId;
            this.id = builder.id;
            this.nodeClass = builder.nodeClass;
            this.regionId = builder.regionId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNodes create() {
            return builder().build();
        }

        /**
         * @return computeNodeId
         */
        public String getComputeNodeId() {
            return this.computeNodeId;
        }

        /**
         * @return dataNodeId
         */
        public String getDataNodeId() {
            return this.dataNodeId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return nodeClass
         */
        public String getNodeClass() {
            return this.nodeClass;
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
            private String computeNodeId; 
            private String dataNodeId; 
            private String id; 
            private String nodeClass; 
            private String regionId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(DBNodes model) {
                this.computeNodeId = model.computeNodeId;
                this.dataNodeId = model.dataNodeId;
                this.id = model.id;
                this.nodeClass = model.nodeClass;
                this.regionId = model.regionId;
                this.zoneId = model.zoneId;
            } 

            /**
             * ComputeNodeId.
             */
            public Builder computeNodeId(String computeNodeId) {
                this.computeNodeId = computeNodeId;
                return this;
            }

            /**
             * DataNodeId.
             */
            public Builder dataNodeId(String dataNodeId) {
                this.dataNodeId = dataNodeId;
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
             * NodeClass.
             */
            public Builder nodeClass(String nodeClass) {
                this.nodeClass = nodeClass;
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

            public DBNodes build() {
                return new DBNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceViaEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceViaEndpointResponseBody</p>
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
    /**
     * 
     * {@link DescribeDBInstanceViaEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceViaEndpointResponseBody</p>
     */
    public static class DBInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CnNodeClassCode")
        private String cnNodeClassCode;

        @com.aliyun.core.annotation.NameInMap("CnNodeCount")
        private Integer cnNodeCount;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("ConnAddrs")
        private java.util.List<ConnAddrs> connAddrs;

        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBInstanceType")
        private String DBInstanceType;

        @com.aliyun.core.annotation.NameInMap("DBNodeClass")
        private String DBNodeClass;

        @com.aliyun.core.annotation.NameInMap("DBNodeCount")
        private Integer DBNodeCount;

        @com.aliyun.core.annotation.NameInMap("DBNodes")
        private java.util.List<DBNodes> DBNodes;

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

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private String expired;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("KindCode")
        private Integer kindCode;

        @com.aliyun.core.annotation.NameInMap("LTSVersions")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> LTSVersions;

        @com.aliyun.core.annotation.NameInMap("LatestMinorVersion")
        private String latestMinorVersion;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
        private String maintainStartTime;

        @com.aliyun.core.annotation.NameInMap("MinorVersion")
        private String minorVersion;

        @com.aliyun.core.annotation.NameInMap("Network")
        private String network;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("ReadDBInstances")
        private java.util.List<String> readDBInstances;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RightsSeparationEnabled")
        private Boolean rightsSeparationEnabled;

        @com.aliyun.core.annotation.NameInMap("RightsSeparationStatus")
        private String rightsSeparationStatus;

        @com.aliyun.core.annotation.NameInMap("Series")
        private String series;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageUsed")
        private Long storageUsed;

        @com.aliyun.core.annotation.NameInMap("TagSet")
        private java.util.List<TagSet> tagSet;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBInstance(Builder builder) {
            this.cnNodeClassCode = builder.cnNodeClassCode;
            this.cnNodeCount = builder.cnNodeCount;
            this.commodityCode = builder.commodityCode;
            this.connAddrs = builder.connAddrs;
            this.connectionString = builder.connectionString;
            this.createTime = builder.createTime;
            this.DBInstanceType = builder.DBInstanceType;
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodeCount = builder.DBNodeCount;
            this.DBNodes = builder.DBNodes;
            this.DBType = builder.DBType;
            this.DBVersion = builder.DBVersion;
            this.description = builder.description;
            this.dnNodeClassCode = builder.dnNodeClassCode;
            this.dnNodeCount = builder.dnNodeCount;
            this.engine = builder.engine;
            this.expireDate = builder.expireDate;
            this.expired = builder.expired;
            this.id = builder.id;
            this.kindCode = builder.kindCode;
            this.LTSVersions = builder.LTSVersions;
            this.latestMinorVersion = builder.latestMinorVersion;
            this.lockMode = builder.lockMode;
            this.maintainEndTime = builder.maintainEndTime;
            this.maintainStartTime = builder.maintainStartTime;
            this.minorVersion = builder.minorVersion;
            this.network = builder.network;
            this.payType = builder.payType;
            this.port = builder.port;
            this.readDBInstances = builder.readDBInstances;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.rightsSeparationEnabled = builder.rightsSeparationEnabled;
            this.rightsSeparationStatus = builder.rightsSeparationStatus;
            this.series = builder.series;
            this.status = builder.status;
            this.storageUsed = builder.storageUsed;
            this.tagSet = builder.tagSet;
            this.type = builder.type;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstance create() {
            return builder().build();
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
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return connAddrs
         */
        public java.util.List<ConnAddrs> getConnAddrs() {
            return this.connAddrs;
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBInstanceType
         */
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        /**
         * @return DBNodeClass
         */
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        /**
         * @return DBNodeCount
         */
        public Integer getDBNodeCount() {
            return this.DBNodeCount;
        }

        /**
         * @return DBNodes
         */
        public java.util.List<DBNodes> getDBNodes() {
            return this.DBNodes;
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
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return expired
         */
        public String getExpired() {
            return this.expired;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return kindCode
         */
        public Integer getKindCode() {
            return this.kindCode;
        }

        /**
         * @return LTSVersions
         */
        public java.util.List<String> getLTSVersions() {
            return this.LTSVersions;
        }

        /**
         * @return latestMinorVersion
         */
        public String getLatestMinorVersion() {
            return this.latestMinorVersion;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return maintainEndTime
         */
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        /**
         * @return maintainStartTime
         */
        public String getMaintainStartTime() {
            return this.maintainStartTime;
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
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
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
         * @return rightsSeparationEnabled
         */
        public Boolean getRightsSeparationEnabled() {
            return this.rightsSeparationEnabled;
        }

        /**
         * @return rightsSeparationStatus
         */
        public String getRightsSeparationStatus() {
            return this.rightsSeparationStatus;
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
         * @return tagSet
         */
        public java.util.List<TagSet> getTagSet() {
            return this.tagSet;
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
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String cnNodeClassCode; 
            private Integer cnNodeCount; 
            private String commodityCode; 
            private java.util.List<ConnAddrs> connAddrs; 
            private String connectionString; 
            private String createTime; 
            private String DBInstanceType; 
            private String DBNodeClass; 
            private Integer DBNodeCount; 
            private java.util.List<DBNodes> DBNodes; 
            private String DBType; 
            private String DBVersion; 
            private String description; 
            private String dnNodeClassCode; 
            private Integer dnNodeCount; 
            private String engine; 
            private String expireDate; 
            private String expired; 
            private String id; 
            private Integer kindCode; 
            private java.util.List<String> LTSVersions; 
            private String latestMinorVersion; 
            private String lockMode; 
            private String maintainEndTime; 
            private String maintainStartTime; 
            private String minorVersion; 
            private String network; 
            private String payType; 
            private String port; 
            private java.util.List<String> readDBInstances; 
            private String regionId; 
            private String resourceGroupId; 
            private Boolean rightsSeparationEnabled; 
            private String rightsSeparationStatus; 
            private String series; 
            private String status; 
            private Long storageUsed; 
            private java.util.List<TagSet> tagSet; 
            private String type; 
            private String VPCId; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(DBInstance model) {
                this.cnNodeClassCode = model.cnNodeClassCode;
                this.cnNodeCount = model.cnNodeCount;
                this.commodityCode = model.commodityCode;
                this.connAddrs = model.connAddrs;
                this.connectionString = model.connectionString;
                this.createTime = model.createTime;
                this.DBInstanceType = model.DBInstanceType;
                this.DBNodeClass = model.DBNodeClass;
                this.DBNodeCount = model.DBNodeCount;
                this.DBNodes = model.DBNodes;
                this.DBType = model.DBType;
                this.DBVersion = model.DBVersion;
                this.description = model.description;
                this.dnNodeClassCode = model.dnNodeClassCode;
                this.dnNodeCount = model.dnNodeCount;
                this.engine = model.engine;
                this.expireDate = model.expireDate;
                this.expired = model.expired;
                this.id = model.id;
                this.kindCode = model.kindCode;
                this.LTSVersions = model.LTSVersions;
                this.latestMinorVersion = model.latestMinorVersion;
                this.lockMode = model.lockMode;
                this.maintainEndTime = model.maintainEndTime;
                this.maintainStartTime = model.maintainStartTime;
                this.minorVersion = model.minorVersion;
                this.network = model.network;
                this.payType = model.payType;
                this.port = model.port;
                this.readDBInstances = model.readDBInstances;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.rightsSeparationEnabled = model.rightsSeparationEnabled;
                this.rightsSeparationStatus = model.rightsSeparationStatus;
                this.series = model.series;
                this.status = model.status;
                this.storageUsed = model.storageUsed;
                this.tagSet = model.tagSet;
                this.type = model.type;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
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
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * ConnAddrs.
             */
            public Builder connAddrs(java.util.List<ConnAddrs> connAddrs) {
                this.connAddrs = connAddrs;
                return this;
            }

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
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
             * DBInstanceType.
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * DBNodeClass.
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * DBNodeCount.
             */
            public Builder DBNodeCount(Integer DBNodeCount) {
                this.DBNodeCount = DBNodeCount;
                return this;
            }

            /**
             * DBNodes.
             */
            public Builder DBNodes(java.util.List<DBNodes> DBNodes) {
                this.DBNodes = DBNodes;
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
             * ExpireDate.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * Expired.
             */
            public Builder expired(String expired) {
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
             * KindCode.
             */
            public Builder kindCode(Integer kindCode) {
                this.kindCode = kindCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder LTSVersions(java.util.List<String> LTSVersions) {
                this.LTSVersions = LTSVersions;
                return this;
            }

            /**
             * LatestMinorVersion.
             */
            public Builder latestMinorVersion(String latestMinorVersion) {
                this.latestMinorVersion = latestMinorVersion;
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
             * MaintainEndTime.
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * MaintainStartTime.
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
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
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * ReadDBInstances.
             */
            public Builder readDBInstances(java.util.List<String> readDBInstances) {
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
             * RightsSeparationEnabled.
             */
            public Builder rightsSeparationEnabled(Boolean rightsSeparationEnabled) {
                this.rightsSeparationEnabled = rightsSeparationEnabled;
                return this;
            }

            /**
             * RightsSeparationStatus.
             */
            public Builder rightsSeparationStatus(String rightsSeparationStatus) {
                this.rightsSeparationStatus = rightsSeparationStatus;
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
             * TagSet.
             */
            public Builder tagSet(java.util.List<TagSet> tagSet) {
                this.tagSet = tagSet;
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
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxxxx</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBInstance build() {
                return new DBInstance(this);
            } 

        } 

    }
}
