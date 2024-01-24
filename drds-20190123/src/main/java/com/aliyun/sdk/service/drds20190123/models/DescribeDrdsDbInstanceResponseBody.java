// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsDbInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsDbInstanceResponseBody</p>
 */
public class DescribeDrdsDbInstanceResponseBody extends TeaModel {
    @NameInMap("DbInstance")
    private DbInstance dbInstance;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeDrdsDbInstanceResponseBody(Builder builder) {
        this.dbInstance = builder.dbInstance;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsDbInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return dbInstance
     */
    public DbInstance getDbInstance() {
        return this.dbInstance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private DbInstance dbInstance; 
        private String requestId; 
        private Boolean success; 

        /**
         * The detailed information about the returned custom ApsaraDB RDS for MySQL instance.
         */
        public Builder dbInstance(DbInstance dbInstance) {
            this.dbInstance = dbInstance;
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
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDrdsDbInstanceResponseBody build() {
            return new DescribeDrdsDbInstanceResponseBody(this);
        } 

    } 

    public static class ReadOnlyInstance extends TeaModel {
        @NameInMap("ConnectUrl")
        private String connectUrl;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @NameInMap("DbInstType")
        private String dbInstType;

        @NameInMap("DmInstanceId")
        private String dmInstanceId;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("RdsInstType")
        private String rdsInstType;

        @NameInMap("ReadWeight")
        private Integer readWeight;

        @NameInMap("RemainDays")
        private String remainDays;

        @NameInMap("VersionAction")
        private Integer versionAction;

        private ReadOnlyInstance(Builder builder) {
            this.connectUrl = builder.connectUrl;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.dbInstType = builder.dbInstType;
            this.dmInstanceId = builder.dmInstanceId;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.networkType = builder.networkType;
            this.payType = builder.payType;
            this.port = builder.port;
            this.rdsInstType = builder.rdsInstType;
            this.readWeight = builder.readWeight;
            this.remainDays = builder.remainDays;
            this.versionAction = builder.versionAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadOnlyInstance create() {
            return builder().build();
        }

        /**
         * @return connectUrl
         */
        public String getConnectUrl() {
            return this.connectUrl;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBInstanceStatus
         */
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        /**
         * @return dbInstType
         */
        public String getDbInstType() {
            return this.dbInstType;
        }

        /**
         * @return dmInstanceId
         */
        public String getDmInstanceId() {
            return this.dmInstanceId;
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
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
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
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return rdsInstType
         */
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        /**
         * @return readWeight
         */
        public Integer getReadWeight() {
            return this.readWeight;
        }

        /**
         * @return remainDays
         */
        public String getRemainDays() {
            return this.remainDays;
        }

        /**
         * @return versionAction
         */
        public Integer getVersionAction() {
            return this.versionAction;
        }

        public static final class Builder {
            private String connectUrl; 
            private String DBInstanceId; 
            private String DBInstanceStatus; 
            private String dbInstType; 
            private String dmInstanceId; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String networkType; 
            private String payType; 
            private Integer port; 
            private String rdsInstType; 
            private Integer readWeight; 
            private String remainDays; 
            private Integer versionAction; 

            /**
             * The URL used to connect to the read-only instance.
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * The ID of the read-only instance.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The state of the read-only instance.
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * The role of the read-only instance.
             */
            public Builder dbInstType(String dbInstType) {
                this.dbInstType = dbInstType;
                return this;
            }

            /**
             * The ID of the resource.
             */
            public Builder dmInstanceId(String dmInstanceId) {
                this.dmInstanceId = dmInstanceId;
                return this;
            }

            /**
             * The engine of the database that is run on the read-only instance.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The engine version of the database that is run on the read-only instance.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The timestamp that indicates when the read-only instance expires.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The network type of the read-only instance.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The billing method of the read-only instance.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The port used to connect to the read-only instance.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the ApsaraDB RDS for MySQL instance.
             */
            public Builder rdsInstType(String rdsInstType) {
                this.rdsInstType = rdsInstType;
                return this;
            }

            /**
             * The read ratio of the read-only instance.
             */
            public Builder readWeight(Integer readWeight) {
                this.readWeight = readWeight;
                return this;
            }

            /**
             * The number of remaining days before the read-only instance expires.
             */
            public Builder remainDays(String remainDays) {
                this.remainDays = remainDays;
                return this;
            }

            /**
             * This parameter is unavailable for read-only instances.
             */
            public Builder versionAction(Integer versionAction) {
                this.versionAction = versionAction;
                return this;
            }

            public ReadOnlyInstance build() {
                return new ReadOnlyInstance(this);
            } 

        } 

    }
    public static class ReadOnlyInstances extends TeaModel {
        @NameInMap("ReadOnlyInstance")
        private java.util.List < ReadOnlyInstance> readOnlyInstance;

        private ReadOnlyInstances(Builder builder) {
            this.readOnlyInstance = builder.readOnlyInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadOnlyInstances create() {
            return builder().build();
        }

        /**
         * @return readOnlyInstance
         */
        public java.util.List < ReadOnlyInstance> getReadOnlyInstance() {
            return this.readOnlyInstance;
        }

        public static final class Builder {
            private java.util.List < ReadOnlyInstance> readOnlyInstance; 

            /**
             * ReadOnlyInstance.
             */
            public Builder readOnlyInstance(java.util.List < ReadOnlyInstance> readOnlyInstance) {
                this.readOnlyInstance = readOnlyInstance;
                return this;
            }

            public ReadOnlyInstances build() {
                return new ReadOnlyInstances(this);
            } 

        } 

    }
    public static class DbInstance extends TeaModel {
        @NameInMap("ConnectUrl")
        private String connectUrl;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @NameInMap("DbInstType")
        private String dbInstType;

        @NameInMap("DmInstanceId")
        private String dmInstanceId;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("RdsInstType")
        private String rdsInstType;

        @NameInMap("ReadOnlyInstances")
        private ReadOnlyInstances readOnlyInstances;

        @NameInMap("ReadWeight")
        private Integer readWeight;

        @NameInMap("RemainDays")
        private String remainDays;

        private DbInstance(Builder builder) {
            this.connectUrl = builder.connectUrl;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.dbInstType = builder.dbInstType;
            this.dmInstanceId = builder.dmInstanceId;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.networkType = builder.networkType;
            this.payType = builder.payType;
            this.port = builder.port;
            this.rdsInstType = builder.rdsInstType;
            this.readOnlyInstances = builder.readOnlyInstances;
            this.readWeight = builder.readWeight;
            this.remainDays = builder.remainDays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbInstance create() {
            return builder().build();
        }

        /**
         * @return connectUrl
         */
        public String getConnectUrl() {
            return this.connectUrl;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBInstanceStatus
         */
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        /**
         * @return dbInstType
         */
        public String getDbInstType() {
            return this.dbInstType;
        }

        /**
         * @return dmInstanceId
         */
        public String getDmInstanceId() {
            return this.dmInstanceId;
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
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
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
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return rdsInstType
         */
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        /**
         * @return readOnlyInstances
         */
        public ReadOnlyInstances getReadOnlyInstances() {
            return this.readOnlyInstances;
        }

        /**
         * @return readWeight
         */
        public Integer getReadWeight() {
            return this.readWeight;
        }

        /**
         * @return remainDays
         */
        public String getRemainDays() {
            return this.remainDays;
        }

        public static final class Builder {
            private String connectUrl; 
            private String DBInstanceId; 
            private String DBInstanceStatus; 
            private String dbInstType; 
            private String dmInstanceId; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String networkType; 
            private String payType; 
            private Integer port; 
            private String rdsInstType; 
            private ReadOnlyInstances readOnlyInstances; 
            private Integer readWeight; 
            private String remainDays; 

            /**
             * The URL used to connect to the custom ApsaraDB RDS for MySQL instance.
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * The ID of the ApsaraDB RDS for MySQL instance.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The state of the instance.
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * The role of the instance. Valid values:
             * <p>
             * 
             * *   **Primary**: The instance is a primary instance.
             * *   **ReadOnly**: The instance is a read-only instance.
             */
            public Builder dbInstType(String dbInstType) {
                this.dbInstType = dbInstType;
                return this;
            }

            /**
             * The ID of the resource.
             */
            public Builder dmInstanceId(String dmInstanceId) {
                this.dmInstanceId = dmInstanceId;
                return this;
            }

            /**
             * The engine of the database that is run on the instance. Valid value: **MySQL**.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The engine version of the database that is run on the instance. Valid values: **5.7**.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The time when the custom ApsaraDB RDS for MySQL instance expires. The value of this parameter is a UNIX timestamp. Unit: seconds.
             * <p>
             * 
             * >  This parameter is returned only when the custom ApsaraDB RDS for MySQL instance is a subscription instance.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The type of the network. Valid values: **VPC**.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The billing method of the custom ApsaraDB RDS for MySQL instance. Valid values:
             * <p>
             * 
             * *   **Prepaid**: subscription
             * *   **Postaid**: pay-as-you-go
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The port used to connect to the custom ApsaraDB RDS for MySQL instance.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the instance.
             */
            public Builder rdsInstType(String rdsInstType) {
                this.rdsInstType = rdsInstType;
                return this;
            }

            /**
             * The list of read-only ApsaraDB RDS for MySQL instances.
             */
            public Builder readOnlyInstances(ReadOnlyInstances readOnlyInstances) {
                this.readOnlyInstances = readOnlyInstances;
                return this;
            }

            /**
             * The read ratio of the instance.
             */
            public Builder readWeight(Integer readWeight) {
                this.readWeight = readWeight;
                return this;
            }

            /**
             * The number of remaining days before the instance expires.
             */
            public Builder remainDays(String remainDays) {
                this.remainDays = remainDays;
                return this;
            }

            public DbInstance build() {
                return new DbInstance(this);
            } 

        } 

    }
}
