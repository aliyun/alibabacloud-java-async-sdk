// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    @com.aliyun.core.annotation.NameInMap("DBProxyInstanceMinorVersions")
    private DBProxyInstanceMinorVersions DBProxyInstanceMinorVersions;

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
        this.DBProxyInstanceMinorVersions = builder.DBProxyInstanceMinorVersions;
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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return DBProxyInstanceMinorVersions
     */
    public DBProxyInstanceMinorVersions getDBProxyInstanceMinorVersions() {
        return this.DBProxyInstanceMinorVersions;
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
        private DBProxyInstanceMinorVersions DBProxyInstanceMinorVersions; 
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

        private Builder() {
        } 

        private Builder(DescribeDBProxyResponseBody model) {
            this.DBProxyAVZones = model.DBProxyAVZones;
            this.DBProxyConnectStringItems = model.DBProxyConnectStringItems;
            this.DBProxyEngineType = model.DBProxyEngineType;
            this.DBProxyInstanceCurrentMinorVersion = model.DBProxyInstanceCurrentMinorVersion;
            this.DBProxyInstanceLatestMinorVersion = model.DBProxyInstanceLatestMinorVersion;
            this.DBProxyInstanceMinorVersions = model.DBProxyInstanceMinorVersions;
            this.DBProxyInstanceName = model.DBProxyInstanceName;
            this.DBProxyInstanceNum = model.DBProxyInstanceNum;
            this.DBProxyInstanceSize = model.DBProxyInstanceSize;
            this.DBProxyInstanceStatus = model.DBProxyInstanceStatus;
            this.DBProxyInstanceType = model.DBProxyInstanceType;
            this.DBProxyKindCode = model.DBProxyKindCode;
            this.DBProxyNodes = model.DBProxyNodes;
            this.DBProxyPersistentConnectionStatus = model.DBProxyPersistentConnectionStatus;
            this.DBProxyServiceStatus = model.DBProxyServiceStatus;
            this.dbProxyEndpointItems = model.dbProxyEndpointItems;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
        } 

        /**
         * DBProxyAVZones.
         */
        public Builder DBProxyAVZones(DBProxyAVZones DBProxyAVZones) {
            this.DBProxyAVZones = DBProxyAVZones;
            return this;
        }

        /**
         * DBProxyConnectStringItems.
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
         * <p>The current minor version of the proxy instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.13.11</p>
         */
        public Builder DBProxyInstanceCurrentMinorVersion(String DBProxyInstanceCurrentMinorVersion) {
            this.DBProxyInstanceCurrentMinorVersion = DBProxyInstanceCurrentMinorVersion;
            return this;
        }

        /**
         * <p>The latest minor version of the proxy instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.13.12</p>
         */
        public Builder DBProxyInstanceLatestMinorVersion(String DBProxyInstanceLatestMinorVersion) {
            this.DBProxyInstanceLatestMinorVersion = DBProxyInstanceLatestMinorVersion;
            return this;
        }

        /**
         * DBProxyInstanceMinorVersions.
         */
        public Builder DBProxyInstanceMinorVersions(DBProxyInstanceMinorVersions DBProxyInstanceMinorVersions) {
            this.DBProxyInstanceMinorVersions = DBProxyInstanceMinorVersions;
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
         * <p>The number of enabled proxy instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder DBProxyInstanceNum(Integer DBProxyInstanceNum) {
            this.DBProxyInstanceNum = DBProxyInstanceNum;
            return this;
        }

        /**
         * <p>This parameter is supported only for ApsaraDB RDS for PostgreSQL. The actual specification size of the proxy instance.</p>
         * <p>Format: <code>CPU/Memory</code>.</p>
         * <p>Example: 4/8 indicates 4 CPU cores and 8 GB of memory.</p>
         * 
         * <strong>example:</strong>
         * <p>4/8</p>
         */
        public Builder DBProxyInstanceSize(String DBProxyInstanceSize) {
            this.DBProxyInstanceSize = DBProxyInstanceSize;
            return this;
        }

        /**
         * <p>The running status of the proxy instance. Valid values:</p>
         * <ul>
         * <li>DBInstanceClassChanging: The specification is being changed.</li>
         * <li>Creating: The instance is being created.</li>
         * <li>Running: The instance is running.</li>
         * <li>Deleting: The instance is being deleted.</li>
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
         * <p>The type of the proxy service. Valid values:</p>
         * <ul>
         * <li>1: shared database proxy</li>
         * <li>2: dedicated database proxy</li>
         * <li>3: general-purpose database proxy</li>
         * </ul>
         * <blockquote>
         * <p>ApsaraDB RDS for PostgreSQL does not support shared database proxies.</p>
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
         * <p>An internal parameter. You can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        public Builder DBProxyKindCode(String DBProxyKindCode) {
            this.DBProxyKindCode = DBProxyKindCode;
            return this;
        }

        /**
         * DBProxyNodes.
         */
        public Builder DBProxyNodes(DBProxyNodes DBProxyNodes) {
            this.DBProxyNodes = DBProxyNodes;
            return this;
        }

        /**
         * <p>The persistent connection status. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Persistent connections are enabled.</li>
         * <li><strong>Disabled</strong>: Persistent connections are disabled.</li>
         * <li><strong>Unsupported</strong>: The instance does not support persistent connections.</li>
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
         * <p>The status of the database proxy feature. Valid values:</p>
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
         * DbProxyEndpointItems.
         */
        public Builder dbProxyEndpointItems(DbProxyEndpointItems dbProxyEndpointItems) {
            this.dbProxyEndpointItems = dbProxyEndpointItems;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>909A69EE-71C8-4417-A0B9-FF085407E1E3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy****</p>
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
        private java.util.List<String> DBProxyAVZones;

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
        public java.util.List<String> getDBProxyAVZones() {
            return this.DBProxyAVZones;
        }

        public static final class Builder {
            private java.util.List<String> DBProxyAVZones; 

            private Builder() {
            } 

            private Builder(DBProxyAVZones model) {
                this.DBProxyAVZones = model.DBProxyAVZones;
            } 

            /**
             * DBProxyAVZones.
             */
            public Builder DBProxyAVZones(java.util.List<String> DBProxyAVZones) {
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

            private Builder() {
            } 

            private Builder(DBProxyConnectStringItemsDBProxyConnectStringItems model) {
                this.DBProxyConnectString = model.DBProxyConnectString;
                this.DBProxyConnectStringNetType = model.DBProxyConnectStringNetType;
                this.DBProxyConnectStringNetWorkType = model.DBProxyConnectStringNetWorkType;
                this.DBProxyConnectStringPort = model.DBProxyConnectStringPort;
                this.DBProxyEndpointId = model.DBProxyEndpointId;
                this.DBProxyEndpointName = model.DBProxyEndpointName;
                this.DBProxyVpcId = model.DBProxyVpcId;
                this.DBProxyVpcInstanceId = model.DBProxyVpcInstanceId;
                this.DBProxyVswitchId = model.DBProxyVswitchId;
            } 

            /**
             * DBProxyConnectString.
             */
            public Builder DBProxyConnectString(String DBProxyConnectString) {
                this.DBProxyConnectString = DBProxyConnectString;
                return this;
            }

            /**
             * DBProxyConnectStringNetType.
             */
            public Builder DBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
                this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
                return this;
            }

            /**
             * DBProxyConnectStringNetWorkType.
             */
            public Builder DBProxyConnectStringNetWorkType(String DBProxyConnectStringNetWorkType) {
                this.DBProxyConnectStringNetWorkType = DBProxyConnectStringNetWorkType;
                return this;
            }

            /**
             * DBProxyConnectStringPort.
             */
            public Builder DBProxyConnectStringPort(String DBProxyConnectStringPort) {
                this.DBProxyConnectStringPort = DBProxyConnectStringPort;
                return this;
            }

            /**
             * DBProxyEndpointId.
             */
            public Builder DBProxyEndpointId(String DBProxyEndpointId) {
                this.DBProxyEndpointId = DBProxyEndpointId;
                return this;
            }

            /**
             * DBProxyEndpointName.
             */
            public Builder DBProxyEndpointName(String DBProxyEndpointName) {
                this.DBProxyEndpointName = DBProxyEndpointName;
                return this;
            }

            /**
             * DBProxyVpcId.
             */
            public Builder DBProxyVpcId(String DBProxyVpcId) {
                this.DBProxyVpcId = DBProxyVpcId;
                return this;
            }

            /**
             * DBProxyVpcInstanceId.
             */
            public Builder DBProxyVpcInstanceId(String DBProxyVpcInstanceId) {
                this.DBProxyVpcInstanceId = DBProxyVpcInstanceId;
                return this;
            }

            /**
             * DBProxyVswitchId.
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
        private java.util.List<DBProxyConnectStringItemsDBProxyConnectStringItems> DBProxyConnectStringItems;

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
        public java.util.List<DBProxyConnectStringItemsDBProxyConnectStringItems> getDBProxyConnectStringItems() {
            return this.DBProxyConnectStringItems;
        }

        public static final class Builder {
            private java.util.List<DBProxyConnectStringItemsDBProxyConnectStringItems> DBProxyConnectStringItems; 

            private Builder() {
            } 

            private Builder(DBProxyConnectStringItems model) {
                this.DBProxyConnectStringItems = model.DBProxyConnectStringItems;
            } 

            /**
             * DBProxyConnectStringItems.
             */
            public Builder DBProxyConnectStringItems(java.util.List<DBProxyConnectStringItemsDBProxyConnectStringItems> DBProxyConnectStringItems) {
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
    public static class DBProxyInstanceMinorVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBProxyInstanceMinorVersions")
        private java.util.List<String> DBProxyInstanceMinorVersions;

        private DBProxyInstanceMinorVersions(Builder builder) {
            this.DBProxyInstanceMinorVersions = builder.DBProxyInstanceMinorVersions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBProxyInstanceMinorVersions create() {
            return builder().build();
        }

        /**
         * @return DBProxyInstanceMinorVersions
         */
        public java.util.List<String> getDBProxyInstanceMinorVersions() {
            return this.DBProxyInstanceMinorVersions;
        }

        public static final class Builder {
            private java.util.List<String> DBProxyInstanceMinorVersions; 

            private Builder() {
            } 

            private Builder(DBProxyInstanceMinorVersions model) {
                this.DBProxyInstanceMinorVersions = model.DBProxyInstanceMinorVersions;
            } 

            /**
             * DBProxyInstanceMinorVersions.
             */
            public Builder DBProxyInstanceMinorVersions(java.util.List<String> DBProxyInstanceMinorVersions) {
                this.DBProxyInstanceMinorVersions = DBProxyInstanceMinorVersions;
                return this;
            }

            public DBProxyInstanceMinorVersions build() {
                return new DBProxyInstanceMinorVersions(this);
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

            private Builder() {
            } 

            private Builder(DBProxyNodesDBProxyNodes model) {
                this.cpuCores = model.cpuCores;
                this.nodeId = model.nodeId;
                this.zoneId = model.zoneId;
            } 

            /**
             * cpuCores.
             */
            public Builder cpuCores(String cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * nodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * zoneId.
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
        private java.util.List<DBProxyNodesDBProxyNodes> DBProxyNodes;

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
        public java.util.List<DBProxyNodesDBProxyNodes> getDBProxyNodes() {
            return this.DBProxyNodes;
        }

        public static final class Builder {
            private java.util.List<DBProxyNodesDBProxyNodes> DBProxyNodes; 

            private Builder() {
            } 

            private Builder(DBProxyNodes model) {
                this.DBProxyNodes = model.DBProxyNodes;
            } 

            /**
             * DBProxyNodes.
             */
            public Builder DBProxyNodes(java.util.List<DBProxyNodesDBProxyNodes> DBProxyNodes) {
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

            private Builder() {
            } 

            private Builder(DbProxyEndpointItemsDbProxyEndpointItems model) {
                this.dbProxyEndpointAliases = model.dbProxyEndpointAliases;
                this.dbProxyEndpointName = model.dbProxyEndpointName;
                this.dbProxyEndpointType = model.dbProxyEndpointType;
                this.dbProxyReadWriteMode = model.dbProxyReadWriteMode;
            } 

            /**
             * DbProxyEndpointAliases.
             */
            public Builder dbProxyEndpointAliases(String dbProxyEndpointAliases) {
                this.dbProxyEndpointAliases = dbProxyEndpointAliases;
                return this;
            }

            /**
             * DbProxyEndpointName.
             */
            public Builder dbProxyEndpointName(String dbProxyEndpointName) {
                this.dbProxyEndpointName = dbProxyEndpointName;
                return this;
            }

            /**
             * DbProxyEndpointType.
             */
            public Builder dbProxyEndpointType(String dbProxyEndpointType) {
                this.dbProxyEndpointType = dbProxyEndpointType;
                return this;
            }

            /**
             * DbProxyReadWriteMode.
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
        private java.util.List<DbProxyEndpointItemsDbProxyEndpointItems> dbProxyEndpointItems;

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
        public java.util.List<DbProxyEndpointItemsDbProxyEndpointItems> getDbProxyEndpointItems() {
            return this.dbProxyEndpointItems;
        }

        public static final class Builder {
            private java.util.List<DbProxyEndpointItemsDbProxyEndpointItems> dbProxyEndpointItems; 

            private Builder() {
            } 

            private Builder(DbProxyEndpointItems model) {
                this.dbProxyEndpointItems = model.dbProxyEndpointItems;
            } 

            /**
             * DbProxyEndpointItems.
             */
            public Builder dbProxyEndpointItems(java.util.List<DbProxyEndpointItemsDbProxyEndpointItems> dbProxyEndpointItems) {
                this.dbProxyEndpointItems = dbProxyEndpointItems;
                return this;
            }

            public DbProxyEndpointItems build() {
                return new DbProxyEndpointItems(this);
            } 

        } 

    }
}
