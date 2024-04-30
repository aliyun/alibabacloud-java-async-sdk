// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
        private String DBProxyPersistentConnectionStatus; 
        private String DBProxyServiceStatus; 
        private DbProxyEndpointItems dbProxyEndpointItems; 
        private String requestId; 
        private String resourceGroupId; 

        /**
         * The list of zones that are available for the database proxy.
         */
        public Builder DBProxyAVZones(DBProxyAVZones DBProxyAVZones) {
            this.DBProxyAVZones = DBProxyAVZones;
            return this;
        }

        /**
         * An array consisting of the information about the database proxy endpoint that is created for the instance.
         */
        public Builder DBProxyConnectStringItems(DBProxyConnectStringItems DBProxyConnectStringItems) {
            this.DBProxyConnectStringItems = DBProxyConnectStringItems;
            return this;
        }

        /**
         * An internal parameter. You can ignore this parameter.
         */
        public Builder DBProxyEngineType(String DBProxyEngineType) {
            this.DBProxyEngineType = DBProxyEngineType;
            return this;
        }

        /**
         * The version of the proxy instance.
         */
        public Builder DBProxyInstanceCurrentMinorVersion(String DBProxyInstanceCurrentMinorVersion) {
            this.DBProxyInstanceCurrentMinorVersion = DBProxyInstanceCurrentMinorVersion;
            return this;
        }

        /**
         * The latest version that is available for the proxy instance.
         */
        public Builder DBProxyInstanceLatestMinorVersion(String DBProxyInstanceLatestMinorVersion) {
            this.DBProxyInstanceLatestMinorVersion = DBProxyInstanceLatestMinorVersion;
            return this;
        }

        /**
         * The name of the proxy instance.
         */
        public Builder DBProxyInstanceName(String DBProxyInstanceName) {
            this.DBProxyInstanceName = DBProxyInstanceName;
            return this;
        }

        /**
         * The number of proxies that are enabled on the instance.
         */
        public Builder DBProxyInstanceNum(Integer DBProxyInstanceNum) {
            this.DBProxyInstanceNum = DBProxyInstanceNum;
            return this;
        }

        /**
         * This parameter is available only for ApsaraDB RDS for PostgreSQL instances. The specifications of the proxy instance that is enabled.
         * <p>
         * 
         * Format: `Number of cores/Memory capacity`.
         * 
         * For example, a value of 4/8 indicates that the proxy instance has 4 cores and 8 GB of memory.
         */
        public Builder DBProxyInstanceSize(String DBProxyInstanceSize) {
            this.DBProxyInstanceSize = DBProxyInstanceSize;
            return this;
        }

        /**
         * The status of the proxy instance.
         * <p>
         * 
         * *   DBInstanceClassChanging: The specifications of the proxy instance are being changed.
         * *   Creating: The proxy instance is being created.
         * *   Running: The proxy instance is running.
         * *   Deleting: The proxy instance is being deleted.
         */
        public Builder DBProxyInstanceStatus(String DBProxyInstanceStatus) {
            this.DBProxyInstanceStatus = DBProxyInstanceStatus;
            return this;
        }

        /**
         * The type of the database proxy that is enabled on the instance.
         * <p>
         * 
         * *   1: shared proxy
         * *   2: dedicated proxy
         * 
         * >  ApsaraDB RDS for PostgreSQL instances support only dedicated proxies.
         */
        public Builder DBProxyInstanceType(String DBProxyInstanceType) {
            this.DBProxyInstanceType = DBProxyInstanceType;
            return this;
        }

        /**
         * Connection Persistence State. 
         * <p>
         * 
         * Valid values:
         * - Enabled: Enabled
         * - Disabled: Disabled
         * - Unsupported: The instance does not support connection persistence
         */
        public Builder DBProxyPersistentConnectionStatus(String DBProxyPersistentConnectionStatus) {
            this.DBProxyPersistentConnectionStatus = DBProxyPersistentConnectionStatus;
            return this;
        }

        /**
         * The status of the database proxy.
         * <p>
         * 
         * *   Shutdown: disabled
         * *   Startup: enabled
         */
        public Builder DBProxyServiceStatus(String DBProxyServiceStatus) {
            this.DBProxyServiceStatus = DBProxyServiceStatus;
            return this;
        }

        /**
         * The proxy terminals of the instance.
         */
        public Builder dbProxyEndpointItems(DbProxyEndpointItems dbProxyEndpointItems) {
            this.dbProxyEndpointItems = dbProxyEndpointItems;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public DescribeDBProxyResponseBody build() {
            return new DescribeDBProxyResponseBody(this);
        } 

    } 

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
             * The list of zones that are available for the database proxy.
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
             * The database proxy endpoint.
             */
            public Builder DBProxyConnectString(String DBProxyConnectString) {
                this.DBProxyConnectString = DBProxyConnectString;
                return this;
            }

            /**
             * The network type of the database proxy endpoint. A database proxy endpoint is formerly referred to as a proxy terminal. Valid values:
             * <p>
             * 
             * *   OuterString: Internet
             * *   InnerString: internal network
             */
            public Builder DBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
                this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
                return this;
            }

            /**
             * The network type of the database proxy. Valid values:
             * <p>
             * 
             * *   0: Internet
             * *   1: classic network
             * *   2: virtual private cloud (VPC)
             */
            public Builder DBProxyConnectStringNetWorkType(String DBProxyConnectStringNetWorkType) {
                this.DBProxyConnectStringNetWorkType = DBProxyConnectStringNetWorkType;
                return this;
            }

            /**
             * The port that is associated with the database proxy endpoint.
             */
            public Builder DBProxyConnectStringPort(String DBProxyConnectStringPort) {
                this.DBProxyConnectStringPort = DBProxyConnectStringPort;
                return this;
            }

            /**
             * The ID of the backend database proxy endpoint.
             */
            public Builder DBProxyEndpointId(String DBProxyEndpointId) {
                this.DBProxyEndpointId = DBProxyEndpointId;
                return this;
            }

            /**
             * The name of the database proxy endpoint. The name can be replaced by the ID of the database proxy endpoint.
             */
            public Builder DBProxyEndpointName(String DBProxyEndpointName) {
                this.DBProxyEndpointName = DBProxyEndpointName;
                return this;
            }

            /**
             * The VPC of the database proxy.
             */
            public Builder DBProxyVpcId(String DBProxyVpcId) {
                this.DBProxyVpcId = DBProxyVpcId;
                return this;
            }

            /**
             * The ID of the database proxy instance.
             */
            public Builder DBProxyVpcInstanceId(String DBProxyVpcInstanceId) {
                this.DBProxyVpcInstanceId = DBProxyVpcInstanceId;
                return this;
            }

            /**
             * The vSwitch of the database proxy.
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
             * An array consisting of the information about the database proxy endpoint that is created for the instance.
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
             * The description of the database proxy endpoint.
             */
            public Builder dbProxyEndpointAliases(String dbProxyEndpointAliases) {
                this.dbProxyEndpointAliases = dbProxyEndpointAliases;
                return this;
            }

            /**
             * The ID of the database proxy endpoint.
             */
            public Builder dbProxyEndpointName(String dbProxyEndpointName) {
                this.dbProxyEndpointName = dbProxyEndpointName;
                return this;
            }

            /**
             * The type of the database proxy endpoint. Valid values:
             * <p>
             * 
             * *   Custom: custom database proxy endpoint
             * *   RWSplit: default database proxy endpoint
             */
            public Builder dbProxyEndpointType(String dbProxyEndpointType) {
                this.dbProxyEndpointType = dbProxyEndpointType;
                return this;
            }

            /**
             * The read and write attributes of the database proxy endpoint.
             * <p>
             * 
             * *   ReadOnly
             * *   ReadWrite
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
             * The proxy terminals of the instance.
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
