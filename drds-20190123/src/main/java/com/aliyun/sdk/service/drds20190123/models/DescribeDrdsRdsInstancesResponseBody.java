// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsRdsInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsRdsInstancesResponseBody</p>
 */
public class DescribeDrdsRdsInstancesResponseBody extends TeaModel {
    @NameInMap("DbInstances")
    private DbInstances dbInstances;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeDrdsRdsInstancesResponseBody(Builder builder) {
        this.dbInstances = builder.dbInstances;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsRdsInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return dbInstances
     */
    public DbInstances getDbInstances() {
        return this.dbInstances;
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
        private DbInstances dbInstances; 
        private String requestId; 
        private Boolean success; 

        /**
         * The information about the custom ApsaraDB RDS for MySQL instances at the storage layer.
         */
        public Builder dbInstances(DbInstances dbInstances) {
            this.dbInstances = dbInstances;
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
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDrdsRdsInstancesResponseBody build() {
            return new DescribeDrdsRdsInstancesResponseBody(this);
        } 

    } 

    public static class DbInstance extends TeaModel {
        @NameInMap("ConnectUrl")
        private String connectUrl;

        @NameInMap("DBInstanceCPU")
        private String DBInstanceCPU;

        @NameInMap("DBInstanceClassType")
        private String DBInstanceClassType;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBInstanceMemory")
        private Long DBInstanceMemory;

        @NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @NameInMap("DBInstanceStorage")
        private Long DBInstanceStorage;

        @NameInMap("DbInstType")
        private String dbInstType;

        @NameInMap("DmInstanceId")
        private String dmInstanceId;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("LockMode")
        private Integer lockMode;

        @NameInMap("LockReason")
        private String lockReason;

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

        private DbInstance(Builder builder) {
            this.connectUrl = builder.connectUrl;
            this.DBInstanceCPU = builder.DBInstanceCPU;
            this.DBInstanceClassType = builder.DBInstanceClassType;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceMemory = builder.DBInstanceMemory;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.DBInstanceStorage = builder.DBInstanceStorage;
            this.dbInstType = builder.dbInstType;
            this.dmInstanceId = builder.dmInstanceId;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.networkType = builder.networkType;
            this.payType = builder.payType;
            this.port = builder.port;
            this.rdsInstType = builder.rdsInstType;
            this.readWeight = builder.readWeight;
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
         * @return DBInstanceCPU
         */
        public String getDBInstanceCPU() {
            return this.DBInstanceCPU;
        }

        /**
         * @return DBInstanceClassType
         */
        public String getDBInstanceClassType() {
            return this.DBInstanceClassType;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBInstanceMemory
         */
        public Long getDBInstanceMemory() {
            return this.DBInstanceMemory;
        }

        /**
         * @return DBInstanceStatus
         */
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        /**
         * @return DBInstanceStorage
         */
        public Long getDBInstanceStorage() {
            return this.DBInstanceStorage;
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
         * @return lockMode
         */
        public Integer getLockMode() {
            return this.lockMode;
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
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

        public static final class Builder {
            private String connectUrl; 
            private String DBInstanceCPU; 
            private String DBInstanceClassType; 
            private String DBInstanceId; 
            private Long DBInstanceMemory; 
            private String DBInstanceStatus; 
            private Long DBInstanceStorage; 
            private String dbInstType; 
            private String dmInstanceId; 
            private String engine; 
            private String engineVersion; 
            private Integer lockMode; 
            private String lockReason; 
            private String networkType; 
            private String payType; 
            private Integer port; 
            private String rdsInstType; 
            private Integer readWeight; 

            /**
             * The internal endpoint of the custom ApsaraDB RDS for MySQL instance at the storage layer.
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * The number of CPU cores of the custom ApsaraDB RDS for MySQL instance at the storage layer.
             */
            public Builder DBInstanceCPU(String DBInstanceCPU) {
                this.DBInstanceCPU = DBInstanceCPU;
                return this;
            }

            /**
             * The instance family of the custom ApsaraDB RDS for MySQL instance at the storage layer. Valid values:
             * <p>
             * 
             * *   **x**: general-purpose instance family
             * *   **d**: dedicated instance family
             * *   **h**: dedicated host instance family
             */
            public Builder DBInstanceClassType(String DBInstanceClassType) {
                this.DBInstanceClassType = DBInstanceClassType;
                return this;
            }

            /**
             * The ID of the custom ApsaraDB RDS for MySQL instance at the storage layer.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The memory size of the custom ApsaraDB RDS for MySQL instance at the storage layer. Unit: MB.
             */
            public Builder DBInstanceMemory(Long DBInstanceMemory) {
                this.DBInstanceMemory = DBInstanceMemory;
                return this;
            }

            /**
             * The status of the custom ApsaraDB RDS for MySQL instance at the storage layer. Valid values:
             * <p>
             * 
             * *   0: The instance is being created.
             * *   1: The instance is running.
             * *   3: The instance is being deleted.
             * *   5: The instance is being restarted.
             * *   6: The instance is being upgraded or downgraded.
             * *   7: The instance is being backed up.
             * *   8: The network type of the instance is being changed.
             * *   9: The instance is being migrated.
             * *   11: The data stored on the instance is being migrated.
             * *   12: A disaster recovery instance is being generated.
             * *   13: Data is being imported to the instance.
             * *   14: Data is being imported from another RDS instance to the instance.
             * *   15: A switchover is being performed.
             * *   16: A temporary instance is being created.
             * *   17: The network of the instance is being created.
             * *   18: The instance is being cloned.
             * *   19: The link is being changed.
             * *   20: The read-only RDS instances of the instance are being migrated.
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * The storage space of the custom ApsaraDB RDS for MySQL instance at the storage layer. Unit: GB.
             */
            public Builder DBInstanceStorage(Long DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * The type of the instance at the storage layer. The value is RDS.
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
             * The engine type of the custom ApsaraDB RDS for MySQL instance at the storage layer. The value is MySQL.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The engine version of the custom ApsaraDB RDS for MySQL instance at the storage layer. The value is 8.0.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The lock mode of the RDS instance. Valid values:
             * <p>
             * 
             * 0: The instance is not locked.
             * 
             * 1: The instance is manually locked.
             * 
             * 2: The instance is automatically locked if the instance expires.
             * 
             * 3: The instance is automatically locked if the instance is rolled back.
             * 
             * 4: The instance is automatically locked if the storage space of the instance reaches the upper limit.
             * 
             * 5: The instance is automatically locked if the storage space of the read-only instances reaches the upper limit.
             */
            public Builder lockMode(Integer lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * The reason why the RDS instance is locked.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * The network type of the custom ApsaraDB RDS for MySQL instance at the storage layer. The value is VPC.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The billing method of the custom ApsaraDB RDS for MySQL instance at the storage layer. Valid values:
             * <p>
             * 
             * *   Postpaid: pay-as-you-go
             * *   Prepaid: subscription
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The port used to connect to the instance over an internal network.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the custom ApsaraDB RDS for MySQL instance at the storage layer. Valid values:
             * <p>
             * 
             * *   Primary: primary instance
             * *   Readonly: read-only instance
             */
            public Builder rdsInstType(String rdsInstType) {
                this.rdsInstType = rdsInstType;
                return this;
            }

            /**
             * The read and write weights of the custom ApsaraDB RDS for MySQL instance at the storage layer.
             */
            public Builder readWeight(Integer readWeight) {
                this.readWeight = readWeight;
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
