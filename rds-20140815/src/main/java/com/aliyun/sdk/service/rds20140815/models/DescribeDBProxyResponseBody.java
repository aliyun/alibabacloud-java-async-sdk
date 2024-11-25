// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBProxyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBProxyResponseBody</p>
 */
public class DescribeDBProxyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBProxyAVZones")
    private DBProxyAVZones DBProxyAVZones;

    @com.aliyun.core.annotation.NameInMap("DBProxyConnectStringItems")
    private DBProxyConnectStringItems DBProxyConnectStringItems;

    @com.aliyun.core.annotation.NameInMap("DBProxyEngineType")
    private String DBProxyEngineType;

    @com.aliyun.core.annotation.NameInMap("DBProxyInstanceCurrentMinorVersion")
    private String DBProxyInstanceCurrentMinorVersion;

    @com.aliyun.core.annotation.NameInMap("DBProxyInstanceLatestMinorVersion")
    private String DBProxyInstanceLatestMinorVersion;

    @com.aliyun.core.annotation.NameInMap("DBProxyInstanceName")
    private String DBProxyInstanceName;

    @com.aliyun.core.annotation.NameInMap("DBProxyInstanceNum")
    private Integer DBProxyInstanceNum;

    @com.aliyun.core.annotation.NameInMap("DBProxyInstanceSize")
    private String DBProxyInstanceSize;

    @com.aliyun.core.annotation.NameInMap("DBProxyInstanceStatus")
    private String DBProxyInstanceStatus;

    @com.aliyun.core.annotation.NameInMap("DBProxyInstanceType")
    private String DBProxyInstanceType;

    @com.aliyun.core.annotation.NameInMap("DBProxyKindCode")
    private String DBProxyKindCode;

    @com.aliyun.core.annotation.NameInMap("DBProxyNodes")
    private DBProxyNodes DBProxyNodes;

    @com.aliyun.core.annotation.NameInMap("DBProxyPersistentConnectionStatus")
    private String DBProxyPersistentConnectionStatus;

    @com.aliyun.core.annotation.NameInMap("DBProxyServiceStatus")
    private String DBProxyServiceStatus;

    @com.aliyun.core.annotation.NameInMap("DbProxyEndpointItems")
    private DbProxyEndpointItems dbProxyEndpointItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeDBProxyResponseBody(Builder builder) {
        this.DBProxyAVZones = builder.DBProxyAVZones;
        this.DBProxyConnectStringItems = builder.DBProxyConnectStringItems;
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.DBProxyInstanceCurrentMinorVersion = builder.DBProxyInstanceCurrentMinorVersion;
        this.DBProxyInstanceLatestMinorVersion = builder.DBProxyInstanceLatestMinorVersion;
        this.DBProxyInstanceName = builder.DBProxyInstanceName;
        this.DBProxyInstanceNum = builder.DBProxyInstanceNum;
        this.DBProxyInstanceSize = builder.DBProxyInstanceSize;
        this.DBProxyInstanceStatus = builder.DBProxyInstanceStatus;
        this.DBProxyInstanceType = builder.DBProxyInstanceType;
        this.DBProxyKindCode = builder.DBProxyKindCode;
        this.DBProxyNodes = builder.DBProxyNodes;
        this.DBProxyPersistentConnectionStatus = builder.DBProxyPersistentConnectionStatus;
        this.DBProxyServiceStatus = builder.DBProxyServiceStatus;
        this.dbProxyEndpointItems = builder.dbProxyEndpointItems;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBProxyResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBProxyAVZones
     */
    public DBProxyAVZones getDBProxyAVZones() {
        return this.DBProxyAVZones;
    }

    /**
     * @return DBProxyConnectStringItems
     */
    public DBProxyConnectStringItems getDBProxyConnectStringItems() {
        return this.DBProxyConnectStringItems;
    }

    /**
     * @return DBProxyEngineType
     */
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    /**
     * @return DBProxyInstanceCurrentMinorVersion
     */
    public String getDBProxyInstanceCurrentMinorVersion() {
        return this.DBProxyInstanceCurrentMinorVersion;
    }

    /**
     * @return DBProxyInstanceLatestMinorVersion
     */
    public String getDBProxyInstanceLatestMinorVersion() {
        return this.DBProxyInstanceLatestMinorVersion;
    }

    /**
     * @return DBProxyInstanceName
     */
    public String getDBProxyInstanceName() {
        return this.DBProxyInstanceName;
    }

    /**
     * @return DBProxyInstanceNum
     */
    public Integer getDBProxyInstanceNum() {
        return this.DBProxyInstanceNum;
    }

    /**
     * @return DBProxyInstanceSize
     */
    public String getDBProxyInstanceSize() {
        return this.DBProxyInstanceSize;
    }

    /**
     * @return DBProxyInstanceStatus
     */
    public String getDBProxyInstanceStatus() {
        return this.DBProxyInstanceStatus;
    }

    /**
     * @return DBProxyInstanceType
     */
    public String getDBProxyInstanceType() {
        return this.DBProxyInstanceType;
    }

    /**
     * @return DBProxyKindCode
     */
    public String getDBProxyKindCode() {
        return this.DBProxyKindCode;
    }

    /**
     * @return DBProxyNodes
     */
    public DBProxyNodes getDBProxyNodes() {
        return this.DBProxyNodes;
    }

    /**
     * @return DBProxyPersistentConnectionStatus
     */
    public String getDBProxyPersistentConnectionStatus() {
        return this.DBProxyPersistentConnectionStatus;
    }

    /**
     * @return DBProxyServiceStatus
     */
    public String getDBProxyServiceStatus() {
        return this.DBProxyServiceStatus;
    }

    /**
     * @return dbProxyEndpointItems
     */
    public DbProxyEndpointItems getDbProxyEndpointItems() {
        return this.dbProxyEndpointItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder {
        private DBProxyAVZones DBProxyAVZones; 
        private DBProxyConnectStringItems DBProxyConnectStringItems; 
        private String DBProxyEngineType; 
        private String DBProxyInstanceCurrentMinorVersion; 
        private String DBProxyInstanceLatestMinorVersion; 
        private String DBProxyInstanceName; 
        private Integer DBProxyInstanceNum; 
        private String DBProxyInstanceSize; 
        private String DBProxyInstanceStatus; 
        private String DBProxyInstanceType; 
        private String DBProxyKindCode; 
        private DBProxyNodes DBProxyNodes; 
        private String DBProxyPersistentConnectionStatus; 
        private String DBProxyServiceStatus; 
        private DbProxyEndpointItems dbProxyEndpointItems; 
        private String requestId; 
        private String resourceGroupId; 

        /**
         * <p>The list of zones that are available for the database proxy.</p>
         */
        public Builder DBProxyAVZones(DBProxyAVZones DBProxyAVZones) {
            this.DBProxyAVZones = DBProxyAVZones;
            return this;
        }

        /**
         * <p>An array consisting of the information about the database proxy endpoint that is created for the instance.</p>
         */
        public Builder DBProxyConnectStringItems(DBProxyConnectStringItems DBProxyConnectStringItems) {
            this.DBProxyConnectStringItems = DBProxyConnectStringItems;
            return this;
        }

        /**
         * <p>An internal parameter. You can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder DBProxyEngineType(String DBProxyEngineType) {
            this.DBProxyEngineType = DBProxyEngineType;
            return this;
        }

        /**
         * <p>The version of the proxy instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.13.11</p>
         */
        public Builder DBProxyInstanceCurrentMinorVersion(String DBProxyInstanceCurrentMinorVersion) {
            this.DBProxyInstanceCurrentMinorVersion = DBProxyInstanceCurrentMinorVersion;
            return this;
        }

        /**
         * <p>The latest version that is available for the proxy instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.13.12</p>
         */
        public Builder DBProxyInstanceLatestMinorVersion(String DBProxyInstanceLatestMinorVersion) {
            this.DBProxyInstanceLatestMinorVersion = DBProxyInstanceLatestMinorVersion;
            return this;
        }

        /**
         * <p>The name of the proxy instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gos787jog2wk0ye1****</p>
         */
        public Builder DBProxyInstanceName(String DBProxyInstanceName) {
            this.DBProxyInstanceName = DBProxyInstanceName;
            return this;
        }

        /**
         * <p>The number of proxies that are enabled on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder DBProxyInstanceNum(Integer DBProxyInstanceNum) {
            this.DBProxyInstanceNum = DBProxyInstanceNum;
            return this;
        }

        /**
         * <p>This parameter is available only for ApsaraDB RDS for PostgreSQL instances. The specifications of the proxy instance that is enabled.</p>
         * <p>Format: <code>Number of cores/Memory capacity</code>.</p>
         * <p>For example, a value of 4/8 indicates that the proxy instance has 4 cores and 8 GB of memory.</p>
         * 
         * <strong>example:</strong>
         * <p>4/8</p>
         */
        public Builder DBProxyInstanceSize(String DBProxyInstanceSize) {
            this.DBProxyInstanceSize = DBProxyInstanceSize;
            return this;
        }

        /**
         * <p>The status of the proxy instance.</p>
         * <ul>
         * <li>DBInstanceClassChanging: The specifications of the proxy instance are being changed.</li>
         * <li>Creating: The proxy instance is being created.</li>
         * <li>Running: The proxy instance is running.</li>
         * <li>Deleting: The proxy instance is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder DBProxyInstanceStatus(String DBProxyInstanceStatus) {
            this.DBProxyInstanceStatus = DBProxyInstanceStatus;
            return this;
        }

        /**
         * <p>The type of the database proxy that is enabled on the instance. Valid values:</p>
         * <ul>
         * <li>1: shared database proxy</li>
         * <li>2: dedicated database proxy</li>
         * <li>3: general-purpose database proxy</li>
         * </ul>
         * <blockquote>
         * <p> ApsaraDB RDS for PostgreSQL does not support shared database proxies.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder DBProxyInstanceType(String DBProxyInstanceType) {
            this.DBProxyInstanceType = DBProxyInstanceType;
            return this;
        }

        /**
         * <p>Internal parameters, no need to pay attention.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        public Builder DBProxyKindCode(String DBProxyKindCode) {
            this.DBProxyKindCode = DBProxyKindCode;
            return this;
        }

        /**
         * <p>The proxy node list.</p>
         */
        public Builder DBProxyNodes(DBProxyNodes DBProxyNodes) {
            this.DBProxyNodes = DBProxyNodes;
            return this;
        }

        /**
         * <p>The status of persistence connections. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong></li>
         * <li><strong>Disabled</strong></li>
         * <li><strong>Unsupported</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder DBProxyPersistentConnectionStatus(String DBProxyPersistentConnectionStatus) {
            this.DBProxyPersistentConnectionStatus = DBProxyPersistentConnectionStatus;
            return this;
        }

        /**
         * <p>The status of the database proxy.</p>
         * <ul>
         * <li>Shutdown: disabled</li>
         * <li>Startup: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Startup</p>
         */
        public Builder DBProxyServiceStatus(String DBProxyServiceStatus) {
            this.DBProxyServiceStatus = DBProxyServiceStatus;
            return this;
        }

        /**
         * <p>The proxy terminals of the instance.</p>
         */
        public Builder dbProxyEndpointItems(DbProxyEndpointItems dbProxyEndpointItems) {
            this.dbProxyEndpointItems = dbProxyEndpointItems;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>909A69EE-71C8-4417-A0B9-FF085407E1E3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy*****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public DescribeDBProxyResponseBody build() {
            return new DescribeDBProxyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBProxyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyResponseBody</p>
     */
    public static class DBProxyAVZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBProxyAVZones")
        private java.util.List < String > DBProxyAVZones;

        private DBProxyAVZones(Builder builder) {
            this.DBProxyAVZones = builder.DBProxyAVZones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBProxyAVZones create() {
            return builder().build();
        }

        /**
         * @return DBProxyAVZones
         */
        public java.util.List < String > getDBProxyAVZones() {
            return this.DBProxyAVZones;
        }

        public static final class Builder {
            private java.util.List < String > DBProxyAVZones; 

            /**
             * <p>The list of zones that are available for the database proxy.</p>
             */
            public Builder DBProxyAVZones(java.util.List < String > DBProxyAVZones) {
                this.DBProxyAVZones = DBProxyAVZones;
                return this;
            }

            public DBProxyAVZones build() {
                return new DBProxyAVZones(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBProxyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyResponseBody</p>
     */
    public static class DBProxyConnectStringItemsDBProxyConnectStringItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBProxyConnectString")
        private String DBProxyConnectString;

        @com.aliyun.core.annotation.NameInMap("DBProxyConnectStringNetType")
        private String DBProxyConnectStringNetType;

        @com.aliyun.core.annotation.NameInMap("DBProxyConnectStringNetWorkType")
        private String DBProxyConnectStringNetWorkType;

        @com.aliyun.core.annotation.NameInMap("DBProxyConnectStringPort")
        private String DBProxyConnectStringPort;

        @com.aliyun.core.annotation.NameInMap("DBProxyEndpointId")
        private String DBProxyEndpointId;

        @com.aliyun.core.annotation.NameInMap("DBProxyEndpointName")
        private String DBProxyEndpointName;

        @com.aliyun.core.annotation.NameInMap("DBProxyVpcId")
        private String DBProxyVpcId;

        @com.aliyun.core.annotation.NameInMap("DBProxyVpcInstanceId")
        private String DBProxyVpcInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBProxyVswitchId")
        private String DBProxyVswitchId;

        private DBProxyConnectStringItemsDBProxyConnectStringItems(Builder builder) {
            this.DBProxyConnectString = builder.DBProxyConnectString;
            this.DBProxyConnectStringNetType = builder.DBProxyConnectStringNetType;
            this.DBProxyConnectStringNetWorkType = builder.DBProxyConnectStringNetWorkType;
            this.DBProxyConnectStringPort = builder.DBProxyConnectStringPort;
            this.DBProxyEndpointId = builder.DBProxyEndpointId;
            this.DBProxyEndpointName = builder.DBProxyEndpointName;
            this.DBProxyVpcId = builder.DBProxyVpcId;
            this.DBProxyVpcInstanceId = builder.DBProxyVpcInstanceId;
            this.DBProxyVswitchId = builder.DBProxyVswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBProxyConnectStringItemsDBProxyConnectStringItems create() {
            return builder().build();
        }

        /**
         * @return DBProxyConnectString
         */
        public String getDBProxyConnectString() {
            return this.DBProxyConnectString;
        }

        /**
         * @return DBProxyConnectStringNetType
         */
        public String getDBProxyConnectStringNetType() {
            return this.DBProxyConnectStringNetType;
        }

        /**
         * @return DBProxyConnectStringNetWorkType
         */
        public String getDBProxyConnectStringNetWorkType() {
            return this.DBProxyConnectStringNetWorkType;
        }

        /**
         * @return DBProxyConnectStringPort
         */
        public String getDBProxyConnectStringPort() {
            return this.DBProxyConnectStringPort;
        }

        /**
         * @return DBProxyEndpointId
         */
        public String getDBProxyEndpointId() {
            return this.DBProxyEndpointId;
        }

        /**
         * @return DBProxyEndpointName
         */
        public String getDBProxyEndpointName() {
            return this.DBProxyEndpointName;
        }

        /**
         * @return DBProxyVpcId
         */
        public String getDBProxyVpcId() {
            return this.DBProxyVpcId;
        }

        /**
         * @return DBProxyVpcInstanceId
         */
        public String getDBProxyVpcInstanceId() {
            return this.DBProxyVpcInstanceId;
        }

        /**
         * @return DBProxyVswitchId
         */
        public String getDBProxyVswitchId() {
            return this.DBProxyVswitchId;
        }

        public static final class Builder {
            private String DBProxyConnectString; 
            private String DBProxyConnectStringNetType; 
            private String DBProxyConnectStringNetWorkType; 
            private String DBProxyConnectStringPort; 
            private String DBProxyEndpointId; 
            private String DBProxyEndpointName; 
            private String DBProxyVpcId; 
            private String DBProxyVpcInstanceId; 
            private String DBProxyVswitchId; 

            /**
             * <p>The database proxy endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>gos787jog2wk0ye1****-rw4rm.rwlb.rds.aliyuncs.com</p>
             */
            public Builder DBProxyConnectString(String DBProxyConnectString) {
                this.DBProxyConnectString = DBProxyConnectString;
                return this;
            }

            /**
             * <p>The network type of the database proxy endpoint. A database proxy endpoint is formerly referred to as a proxy terminal. Valid values:</p>
             * <ul>
             * <li>OuterString: Internet</li>
             * <li>InnerString: internal network</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InnerString</p>
             */
            public Builder DBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
                this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
                return this;
            }

            /**
             * <p>The network type of the database proxy. Valid values:</p>
             * <ul>
             * <li>0: Internet</li>
             * <li>1: classic network</li>
             * <li>2: virtual private cloud (VPC)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder DBProxyConnectStringNetWorkType(String DBProxyConnectStringNetWorkType) {
                this.DBProxyConnectStringNetWorkType = DBProxyConnectStringNetWorkType;
                return this;
            }

            /**
             * <p>The port that is associated with the database proxy endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder DBProxyConnectStringPort(String DBProxyConnectStringPort) {
                this.DBProxyConnectStringPort = DBProxyConnectStringPort;
                return this;
            }

            /**
             * <p>The ID of the backend database proxy endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>20****</p>
             */
            public Builder DBProxyEndpointId(String DBProxyEndpointId) {
                this.DBProxyEndpointId = DBProxyEndpointId;
                return this;
            }

            /**
             * <p>The name of the database proxy endpoint. The name can be replaced by the ID of the database proxy endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>gos787jog2wk0ye1****</p>
             */
            public Builder DBProxyEndpointName(String DBProxyEndpointName) {
                this.DBProxyEndpointName = DBProxyEndpointName;
                return this;
            }

            /**
             * <p>The VPC of the database proxy.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf6oobt****</p>
             */
            public Builder DBProxyVpcId(String DBProxyVpcId) {
                this.DBProxyVpcId = DBProxyVpcId;
                return this;
            }

            /**
             * <p>The ID of the database proxy instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp145737x5<strong><strong>131161274792</strong></strong></p>
             */
            public Builder DBProxyVpcInstanceId(String DBProxyVpcInstanceId) {
                this.DBProxyVpcInstanceId = DBProxyVpcInstanceId;
                return this;
            }

            /**
             * <p>The vSwitch of the database proxy.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf6l0pic17****</p>
             */
            public Builder DBProxyVswitchId(String DBProxyVswitchId) {
                this.DBProxyVswitchId = DBProxyVswitchId;
                return this;
            }

            public DBProxyConnectStringItemsDBProxyConnectStringItems build() {
                return new DBProxyConnectStringItemsDBProxyConnectStringItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBProxyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyResponseBody</p>
     */
    public static class DBProxyConnectStringItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBProxyConnectStringItems")
        private java.util.List < DBProxyConnectStringItemsDBProxyConnectStringItems> DBProxyConnectStringItems;

        private DBProxyConnectStringItems(Builder builder) {
            this.DBProxyConnectStringItems = builder.DBProxyConnectStringItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBProxyConnectStringItems create() {
            return builder().build();
        }

        /**
         * @return DBProxyConnectStringItems
         */
        public java.util.List < DBProxyConnectStringItemsDBProxyConnectStringItems> getDBProxyConnectStringItems() {
            return this.DBProxyConnectStringItems;
        }

        public static final class Builder {
            private java.util.List < DBProxyConnectStringItemsDBProxyConnectStringItems> DBProxyConnectStringItems; 

            /**
             * <p>An array consisting of the information about the database proxy endpoint that is created for the instance.</p>
             */
            public Builder DBProxyConnectStringItems(java.util.List < DBProxyConnectStringItemsDBProxyConnectStringItems> DBProxyConnectStringItems) {
                this.DBProxyConnectStringItems = DBProxyConnectStringItems;
                return this;
            }

            public DBProxyConnectStringItems build() {
                return new DBProxyConnectStringItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBProxyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyResponseBody</p>
     */
    public static class DBProxyNodesDBProxyNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpuCores")
        private String cpuCores;

        @com.aliyun.core.annotation.NameInMap("nodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private DBProxyNodesDBProxyNodes(Builder builder) {
            this.cpuCores = builder.cpuCores;
            this.nodeId = builder.nodeId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBProxyNodesDBProxyNodes create() {
            return builder().build();
        }

        /**
         * @return cpuCores
         */
        public String getCpuCores() {
            return this.cpuCores;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String cpuCores; 
            private String nodeId; 
            private String zoneId; 

            /**
             * <p>The number of cpu cores for the node.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpuCores(String cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * <p>The proxy node id.</p>
             * 
             * <strong>example:</strong>
             * <p>pn-xxxxxxx01</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The id of the availability zone where the node is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-c</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBProxyNodesDBProxyNodes build() {
                return new DBProxyNodesDBProxyNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBProxyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyResponseBody</p>
     */
    public static class DBProxyNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBProxyNodes")
        private java.util.List < DBProxyNodesDBProxyNodes> DBProxyNodes;

        private DBProxyNodes(Builder builder) {
            this.DBProxyNodes = builder.DBProxyNodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBProxyNodes create() {
            return builder().build();
        }

        /**
         * @return DBProxyNodes
         */
        public java.util.List < DBProxyNodesDBProxyNodes> getDBProxyNodes() {
            return this.DBProxyNodes;
        }

        public static final class Builder {
            private java.util.List < DBProxyNodesDBProxyNodes> DBProxyNodes; 

            /**
             * <p>The proxy node list.</p>
             */
            public Builder DBProxyNodes(java.util.List < DBProxyNodesDBProxyNodes> DBProxyNodes) {
                this.DBProxyNodes = DBProxyNodes;
                return this;
            }

            public DBProxyNodes build() {
                return new DBProxyNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBProxyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyResponseBody</p>
     */
    public static class DbProxyEndpointItemsDbProxyEndpointItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbProxyEndpointAliases")
        private String dbProxyEndpointAliases;

        @com.aliyun.core.annotation.NameInMap("DbProxyEndpointName")
        private String dbProxyEndpointName;

        @com.aliyun.core.annotation.NameInMap("DbProxyEndpointType")
        private String dbProxyEndpointType;

        @com.aliyun.core.annotation.NameInMap("DbProxyReadWriteMode")
        private String dbProxyReadWriteMode;

        private DbProxyEndpointItemsDbProxyEndpointItems(Builder builder) {
            this.dbProxyEndpointAliases = builder.dbProxyEndpointAliases;
            this.dbProxyEndpointName = builder.dbProxyEndpointName;
            this.dbProxyEndpointType = builder.dbProxyEndpointType;
            this.dbProxyReadWriteMode = builder.dbProxyReadWriteMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbProxyEndpointItemsDbProxyEndpointItems create() {
            return builder().build();
        }

        /**
         * @return dbProxyEndpointAliases
         */
        public String getDbProxyEndpointAliases() {
            return this.dbProxyEndpointAliases;
        }

        /**
         * @return dbProxyEndpointName
         */
        public String getDbProxyEndpointName() {
            return this.dbProxyEndpointName;
        }

        /**
         * @return dbProxyEndpointType
         */
        public String getDbProxyEndpointType() {
            return this.dbProxyEndpointType;
        }

        /**
         * @return dbProxyReadWriteMode
         */
        public String getDbProxyReadWriteMode() {
            return this.dbProxyReadWriteMode;
        }

        public static final class Builder {
            private String dbProxyEndpointAliases; 
            private String dbProxyEndpointName; 
            private String dbProxyEndpointType; 
            private String dbProxyReadWriteMode; 

            /**
             * <p>The description of the database proxy endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>proxy-test</p>
             */
            public Builder dbProxyEndpointAliases(String dbProxyEndpointAliases) {
                this.dbProxyEndpointAliases = dbProxyEndpointAliases;
                return this;
            }

            /**
             * <p>The ID of the database proxy endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>gos787jog2wk0ye1****</p>
             */
            public Builder dbProxyEndpointName(String dbProxyEndpointName) {
                this.dbProxyEndpointName = dbProxyEndpointName;
                return this;
            }

            /**
             * <p>The type of the database proxy endpoint. Valid values:</p>
             * <ul>
             * <li>Custom: custom database proxy endpoint</li>
             * <li>RWSplit: default database proxy endpoint</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RWSplit</p>
             */
            public Builder dbProxyEndpointType(String dbProxyEndpointType) {
                this.dbProxyEndpointType = dbProxyEndpointType;
                return this;
            }

            /**
             * <p>The read and write attributes of the database proxy endpoint.</p>
             * <ul>
             * <li>ReadOnly</li>
             * <li>ReadWrite</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ReadWrite</p>
             */
            public Builder dbProxyReadWriteMode(String dbProxyReadWriteMode) {
                this.dbProxyReadWriteMode = dbProxyReadWriteMode;
                return this;
            }

            public DbProxyEndpointItemsDbProxyEndpointItems build() {
                return new DbProxyEndpointItemsDbProxyEndpointItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBProxyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyResponseBody</p>
     */
    public static class DbProxyEndpointItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbProxyEndpointItems")
        private java.util.List < DbProxyEndpointItemsDbProxyEndpointItems> dbProxyEndpointItems;

        private DbProxyEndpointItems(Builder builder) {
            this.dbProxyEndpointItems = builder.dbProxyEndpointItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbProxyEndpointItems create() {
            return builder().build();
        }

        /**
         * @return dbProxyEndpointItems
         */
        public java.util.List < DbProxyEndpointItemsDbProxyEndpointItems> getDbProxyEndpointItems() {
            return this.dbProxyEndpointItems;
        }

        public static final class Builder {
            private java.util.List < DbProxyEndpointItemsDbProxyEndpointItems> dbProxyEndpointItems; 

            /**
             * <p>The proxy terminals of the instance.</p>
             */
            public Builder dbProxyEndpointItems(java.util.List < DbProxyEndpointItemsDbProxyEndpointItems> dbProxyEndpointItems) {
                this.dbProxyEndpointItems = dbProxyEndpointItems;
                return this;
            }

            public DbProxyEndpointItems build() {
                return new DbProxyEndpointItems(this);
            } 

        } 

    }
}
