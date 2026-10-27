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
 * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceAttributeResponseBody</p>
 */
public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstance")
    private DBInstance DBInstance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceAttributeResponseBody(Builder builder) {
        this.DBInstance = builder.DBInstance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceAttributeResponseBody create() {
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

        private Builder(DescribeDBInstanceAttributeResponseBody model) {
            this.DBInstance = model.DBInstance;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The database instance information.</p>
         */
        public Builder DBInstance(DBInstance DBInstance) {
            this.DBInstance = DBInstance;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceAttributeResponseBody build() {
            return new DescribeDBInstanceAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
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
             * <p>The endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>polardbx-xxx.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The connection port number.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The connection type. <strong>VPC</strong> indicates an internal network connection, and <strong>PUBLIC</strong> indicates a public network connection.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxxxxx</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-*********</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The internal CloudInstanceId in the VPC. You can ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-zkralxpc5d****</p>
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
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
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
             * <p>The name of the compute node.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-i-********</p>
             */
            public Builder computeNodeId(String computeNodeId) {
                this.computeNodeId = computeNodeId;
                return this;
            }

            /**
             * <p>The name of the storage node.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-xdb-xxxxxx</p>
             */
            public Builder dataNodeId(String dataNodeId) {
                this.dataNodeId = dataNodeId;
                return this;
            }

            /**
             * <p>The logical node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pxi-*********</p>
             */
            public Builder id(String id) {
                this.id = id;
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
             * <p>The region ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the zone where the node is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
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
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class GdnMemberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private GdnMemberList(Builder builder) {
            this.memberName = builder.memberName;
            this.role = builder.role;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GdnMemberList create() {
            return builder().build();
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String memberName; 
            private String role; 
            private String status; 

            private Builder() {
            } 

            private Builder(GdnMemberList model) {
                this.memberName = model.memberName;
                this.role = model.role;
                this.status = model.status;
            } 

            /**
             * <p>The name of the member, which is the name of the PolarDB-X instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc</p>
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * <p>The role of the node. Valid values:</p>
             * <ul>
             * <li><strong>master</strong>: The primary node.</li>
             * <li><strong>standby</strong>: The secondary node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>polarx_cn</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public GdnMemberList build() {
                return new GdnMemberList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
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
             * <p>key2</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value2</p>
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
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class DBInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiGatewayEnabled")
        private String aiGatewayEnabled;

        @com.aliyun.core.annotation.NameInMap("CanNotCreateColumnar")
        private Boolean canNotCreateColumnar;

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

        @com.aliyun.core.annotation.NameInMap("ConnAddrs")
        private java.util.List<ConnAddrs> connAddrs;

        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("CpuType")
        private String cpuType;

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

        @com.aliyun.core.annotation.NameInMap("DifferentDNSpec")
        private Boolean differentDNSpec;

        @com.aliyun.core.annotation.NameInMap("DnNodeClassCode")
        private String dnNodeClassCode;

        @com.aliyun.core.annotation.NameInMap("DnNodeCount")
        private Integer dnNodeCount;

        @com.aliyun.core.annotation.NameInMap("DnStorageSpace")
        private String dnStorageSpace;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private String expired;

        @com.aliyun.core.annotation.NameInMap("GdnInstanceName")
        private String gdnInstanceName;

        @com.aliyun.core.annotation.NameInMap("GdnMemberList")
        private java.util.List<GdnMemberList> gdnMemberList;

        @com.aliyun.core.annotation.NameInMap("GdnRole")
        private String gdnRole;

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

        @com.aliyun.core.annotation.NameInMap("RightsSeparationEnabled")
        private Boolean rightsSeparationEnabled;

        @com.aliyun.core.annotation.NameInMap("RightsSeparationStatus")
        private String rightsSeparationStatus;

        @com.aliyun.core.annotation.NameInMap("SecondaryZone")
        private String secondaryZone;

        @com.aliyun.core.annotation.NameInMap("Series")
        private String series;

        @com.aliyun.core.annotation.NameInMap("SpecCategory")
        private String specCategory;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("StorageUsed")
        private Long storageUsed;

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

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBInstance(Builder builder) {
            this.aiGatewayEnabled = builder.aiGatewayEnabled;
            this.canNotCreateColumnar = builder.canNotCreateColumnar;
            this.cnNodeClassCode = builder.cnNodeClassCode;
            this.cnNodeCount = builder.cnNodeCount;
            this.columnarInstanceName = builder.columnarInstanceName;
            this.columnarReadDBInstances = builder.columnarReadDBInstances;
            this.commodityCode = builder.commodityCode;
            this.connAddrs = builder.connAddrs;
            this.connectionString = builder.connectionString;
            this.cpuType = builder.cpuType;
            this.createTime = builder.createTime;
            this.DBInstanceType = builder.DBInstanceType;
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodeCount = builder.DBNodeCount;
            this.DBNodes = builder.DBNodes;
            this.DBType = builder.DBType;
            this.DBVersion = builder.DBVersion;
            this.description = builder.description;
            this.differentDNSpec = builder.differentDNSpec;
            this.dnNodeClassCode = builder.dnNodeClassCode;
            this.dnNodeCount = builder.dnNodeCount;
            this.dnStorageSpace = builder.dnStorageSpace;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireDate = builder.expireDate;
            this.expired = builder.expired;
            this.gdnInstanceName = builder.gdnInstanceName;
            this.gdnMemberList = builder.gdnMemberList;
            this.gdnRole = builder.gdnRole;
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
            this.primaryInstanceId = builder.primaryInstanceId;
            this.primaryZone = builder.primaryZone;
            this.readDBInstances = builder.readDBInstances;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.rightsSeparationEnabled = builder.rightsSeparationEnabled;
            this.rightsSeparationStatus = builder.rightsSeparationStatus;
            this.secondaryZone = builder.secondaryZone;
            this.series = builder.series;
            this.specCategory = builder.specCategory;
            this.status = builder.status;
            this.storageType = builder.storageType;
            this.storageUsed = builder.storageUsed;
            this.tagSet = builder.tagSet;
            this.tertiaryZone = builder.tertiaryZone;
            this.topologyType = builder.topologyType;
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
         * @return aiGatewayEnabled
         */
        public String getAiGatewayEnabled() {
            return this.aiGatewayEnabled;
        }

        /**
         * @return canNotCreateColumnar
         */
        public Boolean getCanNotCreateColumnar() {
            return this.canNotCreateColumnar;
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
         * @return differentDNSpec
         */
        public Boolean getDifferentDNSpec() {
            return this.differentDNSpec;
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
         * @return dnStorageSpace
         */
        public String getDnStorageSpace() {
            return this.dnStorageSpace;
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
         * @return gdnInstanceName
         */
        public String getGdnInstanceName() {
            return this.gdnInstanceName;
        }

        /**
         * @return gdnMemberList
         */
        public java.util.List<GdnMemberList> getGdnMemberList() {
            return this.gdnMemberList;
        }

        /**
         * @return gdnRole
         */
        public String getGdnRole() {
            return this.gdnRole;
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
         * @return specCategory
         */
        public String getSpecCategory() {
            return this.specCategory;
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
            private String aiGatewayEnabled; 
            private Boolean canNotCreateColumnar; 
            private String cnNodeClassCode; 
            private Integer cnNodeCount; 
            private String columnarInstanceName; 
            private java.util.List<String> columnarReadDBInstances; 
            private String commodityCode; 
            private java.util.List<ConnAddrs> connAddrs; 
            private String connectionString; 
            private String cpuType; 
            private String createTime; 
            private String DBInstanceType; 
            private String DBNodeClass; 
            private Integer DBNodeCount; 
            private java.util.List<DBNodes> DBNodes; 
            private String DBType; 
            private String DBVersion; 
            private String description; 
            private Boolean differentDNSpec; 
            private String dnNodeClassCode; 
            private Integer dnNodeCount; 
            private String dnStorageSpace; 
            private String engine; 
            private String engineVersion; 
            private String expireDate; 
            private String expired; 
            private String gdnInstanceName; 
            private java.util.List<GdnMemberList> gdnMemberList; 
            private String gdnRole; 
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
            private String primaryInstanceId; 
            private String primaryZone; 
            private java.util.List<String> readDBInstances; 
            private String regionId; 
            private String resourceGroupId; 
            private Boolean rightsSeparationEnabled; 
            private String rightsSeparationStatus; 
            private String secondaryZone; 
            private String series; 
            private String specCategory; 
            private String status; 
            private String storageType; 
            private Long storageUsed; 
            private java.util.List<TagSet> tagSet; 
            private String tertiaryZone; 
            private String topologyType; 
            private String type; 
            private String VPCId; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(DBInstance model) {
                this.aiGatewayEnabled = model.aiGatewayEnabled;
                this.canNotCreateColumnar = model.canNotCreateColumnar;
                this.cnNodeClassCode = model.cnNodeClassCode;
                this.cnNodeCount = model.cnNodeCount;
                this.columnarInstanceName = model.columnarInstanceName;
                this.columnarReadDBInstances = model.columnarReadDBInstances;
                this.commodityCode = model.commodityCode;
                this.connAddrs = model.connAddrs;
                this.connectionString = model.connectionString;
                this.cpuType = model.cpuType;
                this.createTime = model.createTime;
                this.DBInstanceType = model.DBInstanceType;
                this.DBNodeClass = model.DBNodeClass;
                this.DBNodeCount = model.DBNodeCount;
                this.DBNodes = model.DBNodes;
                this.DBType = model.DBType;
                this.DBVersion = model.DBVersion;
                this.description = model.description;
                this.differentDNSpec = model.differentDNSpec;
                this.dnNodeClassCode = model.dnNodeClassCode;
                this.dnNodeCount = model.dnNodeCount;
                this.dnStorageSpace = model.dnStorageSpace;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.expireDate = model.expireDate;
                this.expired = model.expired;
                this.gdnInstanceName = model.gdnInstanceName;
                this.gdnMemberList = model.gdnMemberList;
                this.gdnRole = model.gdnRole;
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
                this.primaryInstanceId = model.primaryInstanceId;
                this.primaryZone = model.primaryZone;
                this.readDBInstances = model.readDBInstances;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.rightsSeparationEnabled = model.rightsSeparationEnabled;
                this.rightsSeparationStatus = model.rightsSeparationStatus;
                this.secondaryZone = model.secondaryZone;
                this.series = model.series;
                this.specCategory = model.specCategory;
                this.status = model.status;
                this.storageType = model.storageType;
                this.storageUsed = model.storageUsed;
                this.tagSet = model.tagSet;
                this.tertiaryZone = model.tertiaryZone;
                this.topologyType = model.topologyType;
                this.type = model.type;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>Specifies whether the AI gateway is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder aiGatewayEnabled(String aiGatewayEnabled) {
                this.aiGatewayEnabled = aiGatewayEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the In-Memory Column Index (IMCI) feature is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canNotCreateColumnar(Boolean canNotCreateColumnar) {
                this.canNotCreateColumnar = canNotCreateColumnar;
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
             * <p>polarx.x4.xlarge.2e</p>
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
             * <p>xxxx</p>
             */
            public Builder columnarInstanceName(String columnarInstanceName) {
                this.columnarInstanceName = columnarInstanceName;
                return this;
            }

            /**
             * <p>The column store read-only instance information.</p>
             */
            public Builder columnarReadDBInstances(java.util.List<String> columnarReadDBInstances) {
                this.columnarReadDBInstances = columnarReadDBInstances;
                return this;
            }

            /**
             * <p>The commodity type of the instance. The value is fixed as drds_polarxpost_public_cn.</p>
             * 
             * <strong>example:</strong>
             * <p>drds_polarxpost_public_cn</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The endpoint information.</p>
             */
            public Builder connAddrs(java.util.List<ConnAddrs> connAddrs) {
                this.connAddrs = connAddrs;
                return this;
            }

            /**
             * <p>The internal network connection string.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-sprpx766vo****.polarx.singapore.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The processor type. Default value: intel.</p>
             * 
             * <strong>example:</strong>
             * <p>intel | hygon</p>
             */
            public Builder cpuType(String cpuType) {
                this.cpuType = cpuType;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-31T08:56:25.000+0000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance type. Valid values:</p>
             * <ul>
             * <li><strong>ReadWrite</strong>: Primary instance.</li>
             * <li><strong>ReadOnly</strong>: Read-only instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ReadWrite</p>
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * <p>The node specifications of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx.x4.large.2e</p>
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * <p>The number of nodes in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder DBNodeCount(Integer DBNodeCount) {
                this.DBNodeCount = DBNodeCount;
                return this;
            }

            /**
             * <p>The database node information.</p>
             */
            public Builder DBNodes(java.util.List<DBNodes> DBNodes) {
                this.DBNodes = DBNodes;
                return this;
            }

            /**
             * <p>The database type. The value is fixed as polarx.</p>
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
             * <p>5.5</p>
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * <p>The description of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test instance</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the specifications of the DN nodes in the instance are different. Valid values:</p>
             * <ul>
             * <li>true: The specifications are different.</li>
             * <li>false: The specifications are the same.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder differentDNSpec(Boolean differentDNSpec) {
                this.differentDNSpec = differentDNSpec;
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
             * <p>mysql.x8.large.25</p>
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
             * <p>The disk space of the storage node. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder dnStorageSpace(String dnStorageSpace) {
                this.dnStorageSpace = dnStorageSpace;
                return this;
            }

            /**
             * <p>The database type. The value is fixed as polarx.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The database engine version. Default value: 2.0.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0 | 3.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The expiration time. The format is yyyy-MM-ddTHH:mm:ss.sss+0000 (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-31T16:00:00.000+0000</p>
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>Indicates whether the instance has expired. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Expired.</li>
             * <li><strong>false</strong>: Normal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder expired(String expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The GDN instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>gdn-zkrkuykqglbizdhm</p>
             */
            public Builder gdnInstanceName(String gdnInstanceName) {
                this.gdnInstanceName = gdnInstanceName;
                return this;
            }

            /**
             * <p>The GDN member list.</p>
             */
            public Builder gdnMemberList(java.util.List<GdnMemberList> gdnMemberList) {
                this.gdnMemberList = gdnMemberList;
                return this;
            }

            /**
             * <p>The role in the global database network (GDN).</p>
             * 
             * <strong>example:</strong>
             * <p>master | standby</p>
             */
            public Builder gdnRole(String gdnRole) {
                this.gdnRole = gdnRole;
                return this;
            }

            /**
             * <p>The ID of the primary instance. If this parameter is not returned, the instance is a primary instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-zkralxpc5d****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The database engine version of the instance DPI engine. This is an internal parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder kindCode(Integer kindCode) {
                this.kindCode = kindCode;
                return this;
            }

            /**
             * <p>The instance version.</p>
             * <p>This parameter is required.</p>
             */
            public Builder LTSVersions(java.util.List<String> LTSVersions) {
                this.LTSVersions = LTSVersions;
                return this;
            }

            /**
             * <p>The latest kernel Milvus version supported by the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx-kernel_5.4.11-16301083_xcluster-20210805</p>
             */
            public Builder latestMinorVersion(String latestMinorVersion) {
                this.latestMinorVersion = latestMinorVersion;
                return this;
            }

            /**
             * <p>The lock mode of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Unlock</strong>: Normal.</li>
             * <li><strong>ManualLock</strong>: Manually locked.</li>
             * <li><strong>LockByExpiration</strong>: Automatically locked due to expiration.</li>
             * <li><strong>LockByRestoration</strong>: Automatically locked before a rollback.</li>
             * <li><strong>LockByDiskQuota</strong>: Automatically locked due to full storage space.</li>
             * <li><strong>LockReadInstanceByDiskQuota</strong>: Automatically locked due to full storage space of the read-only instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unlock</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The end time of the maintenance window for the instance. The time is in UTC. Add 8 hours to obtain the maintenance window displayed in the console.</p>
             * 
             * <strong>example:</strong>
             * <p>06:00</p>
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * <p>The start time of the maintenance window for the instance. The time is in UTC. Add 8 hours to obtain the maintenance window displayed in the console.</p>
             * 
             * <strong>example:</strong>
             * <p>06:00</p>
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            /**
             * <p>The current kernel Milvus version.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx-kernel_5.4.11-16301083_xcluster-20210805</p>
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
                return this;
            }

            /**
             * <p>The network type of the instance. Only VPC is supported, which indicates a virtual private cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Postpaid</strong>: Pay-as-you-go.</li>
             * <li><strong>Prepaid</strong>: Subscription.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Postpaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The internal network connection port.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The primary instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-hzrof9vitnu8uu</p>
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
             * <p>cn-shenzhen-e</p>
             */
            public Builder primaryZone(String primaryZone) {
                this.primaryZone = primaryZone;
                return this;
            }

            /**
             * <p>The list of read-only instance names.</p>
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
             * <p>rg-*********</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the three-role mode is enabled. Valid values:</p>
             * <ul>
             * <li><strong>false</strong>: Disabled.</li>
             * <li><strong>true</strong>: Enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder rightsSeparationEnabled(Boolean rightsSeparationEnabled) {
                this.rightsSeparationEnabled = rightsSeparationEnabled;
                return this;
            }

            /**
             * <p>The three-role mode status. Valid values:</p>
             * <ul>
             * <li><strong>disabled</strong>: Disabled.</li>
             * <li><strong>enabled</strong>: Enabled.</li>
             * <li><strong>processing</strong>: Processing.</li>
             * <li><strong>unknown</strong>: Unknown. This may be caused by a connection failure to the instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder rightsSeparationStatus(String rightsSeparationStatus) {
                this.rightsSeparationStatus = rightsSeparationStatus;
                return this;
            }

            /**
             * <p>The secondary zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen-a</p>
             */
            public Builder secondaryZone(String secondaryZone) {
                this.secondaryZone = secondaryZone;
                return this;
            }

            /**
             * <p>The instance edition. Valid values:</p>
             * <ul>
             * <li><strong>enterprise</strong>: Enterprise Edition.</li>
             * <li><strong>standard</strong>: Standard Edition.</li>
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
             * <p>The specification category. Valid values:</p>
             * <ul>
             * <li>exclusive: Dedicated.</li>
             * <li>general: General-purpose.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>exclusive | general</p>
             */
            public Builder specCategory(String specCategory) {
                this.specCategory = specCategory;
                return this;
            }

            /**
             * <p>The instance status.</p>
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
             * <p>The used storage space, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>17042505728</p>
             */
            public Builder storageUsed(Long storageUsed) {
                this.storageUsed = storageUsed;
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
             * <p>The third zone in a Three-zone deployment.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen-e</p>
             */
            public Builder tertiaryZone(String tertiaryZone) {
                this.tertiaryZone = tertiaryZone;
                return this;
            }

            /**
             * <p>The topology type. Valid values:</p>
             * <ul>
             * <li><strong>3azones</strong>: Three-zone deployment.</li>
             * <li><strong>1azone</strong>: Single-zone deployment.</li>
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
             * <li><strong>ReadWrite</strong>: Primary instance.</li>
             * <li><strong>ReadOnly</strong>: Read-only instance.</li>
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
             * <p>vpc-xxxxx</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-********</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone where the instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
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
