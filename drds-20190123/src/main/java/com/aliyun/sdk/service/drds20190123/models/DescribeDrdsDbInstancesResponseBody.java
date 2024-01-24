// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsDbInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsDbInstancesResponseBody</p>
 */
public class DescribeDrdsDbInstancesResponseBody extends TeaModel {
    @NameInMap("DbInstances")
    private DbInstances dbInstances;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private String total;

    private DescribeDrdsDbInstancesResponseBody(Builder builder) {
        this.dbInstances = builder.dbInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsDbInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return dbInstances
     */
    public DbInstances getDbInstances() {
        return this.dbInstances;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private DbInstances dbInstances; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private Boolean success; 
        private String total; 

        /**
         * Indicates information about the ApsaraDB RDS for MySQL instances that are used to store the data of the specified database.
         */
        public Builder dbInstances(DbInstances dbInstances) {
            this.dbInstances = dbInstances;
            return this;
        }

        /**
         * Indicates the page number of the returned page.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Indicates the number of entries returned per page.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Indicates the ID of the request.
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

        /**
         * Indicates the number of primary ApsaraDB RDS for MySQL instances.
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeDrdsDbInstancesResponseBody build() {
            return new DescribeDrdsDbInstancesResponseBody(this);
        } 

    } 

    public static class ReadOnlyInstance extends TeaModel {
        @NameInMap("ConnectUrl")
        private String connectUrl;

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

        @NameInMap("InstanceName")
        private String instanceName;

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
        private Integer remainDays;

        private ReadOnlyInstance(Builder builder) {
            this.connectUrl = builder.connectUrl;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.dbInstType = builder.dbInstType;
            this.dmInstanceId = builder.dmInstanceId;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.instanceName = builder.instanceName;
            this.networkType = builder.networkType;
            this.payType = builder.payType;
            this.port = builder.port;
            this.rdsInstType = builder.rdsInstType;
            this.readWeight = builder.readWeight;
            this.remainDays = builder.remainDays;
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
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
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
        public Integer getRemainDays() {
            return this.remainDays;
        }

        public static final class Builder {
            private String connectUrl; 
            private String DBInstanceStatus; 
            private String dbInstType; 
            private String dmInstanceId; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String instanceName; 
            private String networkType; 
            private String payType; 
            private Integer port; 
            private String rdsInstType; 
            private Integer readWeight; 
            private Integer remainDays; 

            /**
             * Indicates the endpoint that is used to connect to the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * Indicates the state of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database. Valid values:
             * <p>
             * 
             * *   **0**: The ApsaraDB RDS for MySQL instance is being created.
             * *   **1**: The ApsaraDB RDS for MySQL instance is running.
             * *   **3**: The ApsaraDB RDS for MySQL instance is being deleted.
             * *   **5**: The ApsaraDB RDS for MySQL instance is being restarted.
             * *   **6**: The ApsaraDB RDS for MySQL instance is being upgraded or downgraded.
             * *   **7**: The ApsaraDB RDS for MySQL instance is being backed up.
             * *   **8**: The network type of the ApsaraDB RDS for MySQL instance is being changed.
             * *   **9**: The ApsaraDB RDS for MySQL instance is being migrated.
             * *   **11**: The data of the ApsaraDB RDS for MySQL instance is being migrated.
             * *   **12**: A disaster-recovery instance is being generated.
             * *   **13**: Data is being imported to the ApsaraDB RDS for MySQL instance.
             * *   **14**: Data is being imported to the ApsaraDB RDS for MySQL instance from an another ApsaraDB RDS for MySQL instance.
             * *   **15**: A failover is being performed.
             * *   **16**: A temporary instance is being created.
             * *   **17**: A network is being created for the ApsaraDB RDS for MySQL instance.
             * *   **18**: The ApsaraDB RDS for MySQL instance is being cloned.
             * *   **19**: The link is being changed.
             * *   **20**: The read-only instances of the ApsaraDB RDS for MySQL instance are being migrated.
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * Indicates the type of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database. The value is set to RDS.
             */
            public Builder dbInstType(String dbInstType) {
                this.dbInstType = dbInstType;
                return this;
            }

            /**
             * Indicates the ID of a resource.
             */
            public Builder dmInstanceId(String dmInstanceId) {
                this.dmInstanceId = dmInstanceId;
                return this;
            }

            /**
             * Indicates the engine of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * Indicates the engine version of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * Indicates the timestamp when the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database expires.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Indicates the name of a read-only instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Indicates the network type of the read-only instance.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * Indicates the billing method of the read-only instance.
             * <p>
             * 
             * *   **drdsPre**: The instance uses the subscription billing method.
             * *   **drdsPost**: The instance uses the pay-as-you-go billing method.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * Indicates the port that is used to connect to the read-only instance.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Indicates the type of the read-only instance.
             */
            public Builder rdsInstType(String rdsInstType) {
                this.rdsInstType = rdsInstType;
                return this;
            }

            /**
             * Indicates the read weight of the read-only instance.
             */
            public Builder readWeight(Integer readWeight) {
                this.readWeight = readWeight;
                return this;
            }

            /**
             * Indicates the number of remaining days before the read-only instance expires.
             */
            public Builder remainDays(Integer remainDays) {
                this.remainDays = remainDays;
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
        private Integer remainDays;

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
        public Integer getRemainDays() {
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
            private Integer remainDays; 

            /**
             * Indicates the endpoint that is used to connect to an ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * Indicates the ID of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * Indicates the state of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database. Valid values:
             * <p>
             * 
             * *   **0**: The ApsaraDB RDS for MySQL instance is being created.
             * *   **1**: The ApsaraDB RDS for MySQL instance is running.
             * *   **3**: The ApsaraDB RDS for MySQL instance is being deleted.
             * *   **5**: The ApsaraDB RDS for MySQL instance is being restarted.
             * *   **6**: The ApsaraDB RDS for MySQL instance is being upgraded or downgraded.
             * *   **7**: The ApsaraDB RDS for MySQL instance is being backed up.
             * *   **8**: The network type of the ApsaraDB RDS for MySQL instance is being changed.
             * *   **9**: The ApsaraDB RDS for MySQL instance is being migrated.
             * *   **11**: The data of the ApsaraDB RDS for MySQL instance is being migrated.
             * *   **12**: A disaster-recovery instance is being generated.
             * *   **13**: Data is being imported to the ApsaraDB RDS for MySQL instance.
             * *   **14**: Data is being imported to the ApsaraDB RDS for MySQL instance from an another ApsaraDB RDS for MySQL instance.
             * *   **15**: A failover is being performed.
             * *   **16**: A temporary instance is being created.
             * *   **17**: A network is being created for the ApsaraDB RDS for MySQL instance.
             * *   **18**: The ApsaraDB RDS for MySQL instance is being cloned.
             * *   **19**: The link is being changed.
             * *   **20**: The read-only instances of the ApsaraDB RDS for MySQL instance are being migrated.
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * Indicates the type of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database. The value is set to RDS.
             */
            public Builder dbInstType(String dbInstType) {
                this.dbInstType = dbInstType;
                return this;
            }

            /**
             * Indicates the ID of a resource.
             */
            public Builder dmInstanceId(String dmInstanceId) {
                this.dmInstanceId = dmInstanceId;
                return this;
            }

            /**
             * Indicates the engine of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * Indicates the engine version of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * Indicates the point in time when the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database expires.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Indicates the network type of the ApsaraDB RDS for MySQL instance.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * Indicates the billing method of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database. Valid values:
             * <p>
             * 
             * *   **drdsPre**: The instance uses the subscription billing method.
             * *   **drdsPost**: The instance uses the pay-as-you-go billing method.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * Indicates the port that is used to connect to the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Indicates whether the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database is a primary instance or a read-only instance.
             * <p>
             * 
             * *   **Primary**: The instance is a primary instance.
             * *   **Readonly**: The instance is a read-only instance.
             */
            public Builder rdsInstType(String rdsInstType) {
                this.rdsInstType = rdsInstType;
                return this;
            }

            /**
             * Indicates information about the read-only instances of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.
             */
            public Builder readOnlyInstances(ReadOnlyInstances readOnlyInstances) {
                this.readOnlyInstances = readOnlyInstances;
                return this;
            }

            /**
             * Indicates the read weight of the read-only instance.
             */
            public Builder readWeight(Integer readWeight) {
                this.readWeight = readWeight;
                return this;
            }

            /**
             * Indicates the number of remaining days before a subscription instance expires.
             */
            public Builder remainDays(Integer remainDays) {
                this.remainDays = remainDays;
                return this;
            }

            public DbInstance build() {
                return new DbInstance(this);
            } 

        } 

    }
    public static class DbInstances extends TeaModel {
        @NameInMap("DbInstance")
        private java.util.List < DbInstance> dbInstance;

        private DbInstances(Builder builder) {
            this.dbInstance = builder.dbInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbInstances create() {
            return builder().build();
        }

        /**
         * @return dbInstance
         */
        public java.util.List < DbInstance> getDbInstance() {
            return this.dbInstance;
        }

        public static final class Builder {
            private java.util.List < DbInstance> dbInstance; 

            /**
             * DbInstance.
             */
            public Builder dbInstance(java.util.List < DbInstance> dbInstance) {
                this.dbInstance = dbInstance;
                return this;
            }

            public DbInstances build() {
                return new DbInstances(this);
            } 

        } 

    }
}
