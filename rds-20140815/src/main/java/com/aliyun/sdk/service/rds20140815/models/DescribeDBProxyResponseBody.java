// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBProxyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBProxyResponseBody</p>
 */
public class DescribeDBProxyResponseBody extends TeaModel {
    @NameInMap("DBProxyConnectStringItems")
    private DBProxyConnectStringItems DBProxyConnectStringItems;

    @NameInMap("DBProxyInstanceCurrentMinorVersion")
    private String DBProxyInstanceCurrentMinorVersion;

    @NameInMap("DBProxyInstanceLatestMinorVersion")
    private String DBProxyInstanceLatestMinorVersion;

    @NameInMap("DBProxyInstanceName")
    private String DBProxyInstanceName;

    @NameInMap("DBProxyInstanceNum")
    private Integer DBProxyInstanceNum;

    @NameInMap("DBProxyInstanceStatus")
    private String DBProxyInstanceStatus;

    @NameInMap("DBProxyInstanceType")
    private String DBProxyInstanceType;

    @NameInMap("DBProxyServiceStatus")
    private String DBProxyServiceStatus;

    @NameInMap("DbProxyEndpointItems")
    private DbProxyEndpointItems dbProxyEndpointItems;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBProxyResponseBody(Builder builder) {
        this.DBProxyConnectStringItems = builder.DBProxyConnectStringItems;
        this.DBProxyInstanceCurrentMinorVersion = builder.DBProxyInstanceCurrentMinorVersion;
        this.DBProxyInstanceLatestMinorVersion = builder.DBProxyInstanceLatestMinorVersion;
        this.DBProxyInstanceName = builder.DBProxyInstanceName;
        this.DBProxyInstanceNum = builder.DBProxyInstanceNum;
        this.DBProxyInstanceStatus = builder.DBProxyInstanceStatus;
        this.DBProxyInstanceType = builder.DBProxyInstanceType;
        this.DBProxyServiceStatus = builder.DBProxyServiceStatus;
        this.dbProxyEndpointItems = builder.dbProxyEndpointItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBProxyResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBProxyConnectStringItems
     */
    public DBProxyConnectStringItems getDBProxyConnectStringItems() {
        return this.DBProxyConnectStringItems;
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

    public static final class Builder {
        private DBProxyConnectStringItems DBProxyConnectStringItems; 
        private String DBProxyInstanceCurrentMinorVersion; 
        private String DBProxyInstanceLatestMinorVersion; 
        private String DBProxyInstanceName; 
        private Integer DBProxyInstanceNum; 
        private String DBProxyInstanceStatus; 
        private String DBProxyInstanceType; 
        private String DBProxyServiceStatus; 
        private DbProxyEndpointItems dbProxyEndpointItems; 
        private String requestId; 

        /**
         * DBProxyConnectStringItems.
         */
        public Builder DBProxyConnectStringItems(DBProxyConnectStringItems DBProxyConnectStringItems) {
            this.DBProxyConnectStringItems = DBProxyConnectStringItems;
            return this;
        }

        /**
         * DBProxyInstanceCurrentMinorVersion.
         */
        public Builder DBProxyInstanceCurrentMinorVersion(String DBProxyInstanceCurrentMinorVersion) {
            this.DBProxyInstanceCurrentMinorVersion = DBProxyInstanceCurrentMinorVersion;
            return this;
        }

        /**
         * DBProxyInstanceLatestMinorVersion.
         */
        public Builder DBProxyInstanceLatestMinorVersion(String DBProxyInstanceLatestMinorVersion) {
            this.DBProxyInstanceLatestMinorVersion = DBProxyInstanceLatestMinorVersion;
            return this;
        }

        /**
         * DBProxyInstanceName.
         */
        public Builder DBProxyInstanceName(String DBProxyInstanceName) {
            this.DBProxyInstanceName = DBProxyInstanceName;
            return this;
        }

        /**
         * DBProxyInstanceNum.
         */
        public Builder DBProxyInstanceNum(Integer DBProxyInstanceNum) {
            this.DBProxyInstanceNum = DBProxyInstanceNum;
            return this;
        }

        /**
         * DBProxyInstanceStatus.
         */
        public Builder DBProxyInstanceStatus(String DBProxyInstanceStatus) {
            this.DBProxyInstanceStatus = DBProxyInstanceStatus;
            return this;
        }

        /**
         * DBProxyInstanceType.
         */
        public Builder DBProxyInstanceType(String DBProxyInstanceType) {
            this.DBProxyInstanceType = DBProxyInstanceType;
            return this;
        }

        /**
         * DBProxyServiceStatus.
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBProxyResponseBody build() {
            return new DescribeDBProxyResponseBody(this);
        } 

    } 

    public static class DBProxyConnectStringItemsDBProxyConnectStringItems extends TeaModel {
        @NameInMap("DBProxyConnectString")
        private String DBProxyConnectString;

        @NameInMap("DBProxyConnectStringNetType")
        private String DBProxyConnectStringNetType;

        @NameInMap("DBProxyConnectStringNetWorkType")
        private String DBProxyConnectStringNetWorkType;

        @NameInMap("DBProxyConnectStringPort")
        private String DBProxyConnectStringPort;

        @NameInMap("DBProxyEndpointId")
        private String DBProxyEndpointId;

        @NameInMap("DBProxyEndpointName")
        private String DBProxyEndpointName;

        @NameInMap("DBProxyVpcInstanceId")
        private String DBProxyVpcInstanceId;

        private DBProxyConnectStringItemsDBProxyConnectStringItems(Builder builder) {
            this.DBProxyConnectString = builder.DBProxyConnectString;
            this.DBProxyConnectStringNetType = builder.DBProxyConnectStringNetType;
            this.DBProxyConnectStringNetWorkType = builder.DBProxyConnectStringNetWorkType;
            this.DBProxyConnectStringPort = builder.DBProxyConnectStringPort;
            this.DBProxyEndpointId = builder.DBProxyEndpointId;
            this.DBProxyEndpointName = builder.DBProxyEndpointName;
            this.DBProxyVpcInstanceId = builder.DBProxyVpcInstanceId;
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
         * @return DBProxyVpcInstanceId
         */
        public String getDBProxyVpcInstanceId() {
            return this.DBProxyVpcInstanceId;
        }

        public static final class Builder {
            private String DBProxyConnectString; 
            private String DBProxyConnectStringNetType; 
            private String DBProxyConnectStringNetWorkType; 
            private String DBProxyConnectStringPort; 
            private String DBProxyEndpointId; 
            private String DBProxyEndpointName; 
            private String DBProxyVpcInstanceId; 

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
             * DBProxyVpcInstanceId.
             */
            public Builder DBProxyVpcInstanceId(String DBProxyVpcInstanceId) {
                this.DBProxyVpcInstanceId = DBProxyVpcInstanceId;
                return this;
            }

            public DBProxyConnectStringItemsDBProxyConnectStringItems build() {
                return new DBProxyConnectStringItemsDBProxyConnectStringItems(this);
            } 

        } 

    }
    public static class DBProxyConnectStringItems extends TeaModel {
        @NameInMap("DBProxyConnectStringItems")
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
             * DBProxyConnectStringItems.
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
        @NameInMap("DbProxyEndpointAliases")
        private String dbProxyEndpointAliases;

        @NameInMap("DbProxyEndpointName")
        private String dbProxyEndpointName;

        @NameInMap("DbProxyEndpointType")
        private String dbProxyEndpointType;

        @NameInMap("DbProxyReadWriteMode")
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
    public static class DbProxyEndpointItems extends TeaModel {
        @NameInMap("DbProxyEndpointItems")
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
             * DbProxyEndpointItems.
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
