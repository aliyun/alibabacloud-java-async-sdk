// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeDrdsRdsInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsRdsInstancesResponseBody</p>
 */
public class DescribeDrdsRdsInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbInstances")
    private DbInstances dbInstances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The information about the custom ApsaraDB RDS for MySQL instances at the storage layer.</p>
         */
        public Builder dbInstances(DbInstances dbInstances) {
            this.dbInstances = dbInstances;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>123DB16B-02F2-45F7-A571-843991******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDrdsRdsInstancesResponseBody build() {
            return new DescribeDrdsRdsInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDrdsRdsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsRdsInstancesResponseBody</p>
     */
    public static class DbInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectUrl")
        private String connectUrl;

        @com.aliyun.core.annotation.NameInMap("DBInstanceCPU")
        private String DBInstanceCPU;

        @com.aliyun.core.annotation.NameInMap("DBInstanceClassType")
        private String DBInstanceClassType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceMemory")
        private Long DBInstanceMemory;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
        private Long DBInstanceStorage;

        @com.aliyun.core.annotation.NameInMap("DbInstType")
        private String dbInstType;

        @com.aliyun.core.annotation.NameInMap("DmInstanceId")
        private String dmInstanceId;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private Integer lockMode;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RdsInstType")
        private String rdsInstType;

        @com.aliyun.core.annotation.NameInMap("ReadWeight")
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
             * <p>The internal endpoint of the custom ApsaraDB RDS for MySQL instance at the storage layer.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-***************.mysql.rds.aliyuncs.com</p>
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * <p>The number of CPU cores of the custom ApsaraDB RDS for MySQL instance at the storage layer.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder DBInstanceCPU(String DBInstanceCPU) {
                this.DBInstanceCPU = DBInstanceCPU;
                return this;
            }

            /**
             * <p>The instance family of the custom ApsaraDB RDS for MySQL instance at the storage layer. Valid values:</p>
             * <ul>
             * <li><strong>x</strong>: general-purpose instance family</li>
             * <li><strong>d</strong>: dedicated instance family</li>
             * <li><strong>h</strong>: dedicated host instance family</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>x</p>
             */
            public Builder DBInstanceClassType(String DBInstanceClassType) {
                this.DBInstanceClassType = DBInstanceClassType;
                return this;
            }

            /**
             * <p>The ID of the custom ApsaraDB RDS for MySQL instance at the storage layer.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-*****************</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The memory size of the custom ApsaraDB RDS for MySQL instance at the storage layer. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder DBInstanceMemory(Long DBInstanceMemory) {
                this.DBInstanceMemory = DBInstanceMemory;
                return this;
            }

            /**
             * <p>The status of the custom ApsaraDB RDS for MySQL instance at the storage layer. Valid values:</p>
             * <ul>
             * <li>0: The instance is being created.</li>
             * <li>1: The instance is running.</li>
             * <li>3: The instance is being deleted.</li>
             * <li>5: The instance is being restarted.</li>
             * <li>6: The instance is being upgraded or downgraded.</li>
             * <li>7: The instance is being backed up.</li>
             * <li>8: The network type of the instance is being changed.</li>
             * <li>9: The instance is being migrated.</li>
             * <li>11: The data stored on the instance is being migrated.</li>
             * <li>12: A disaster recovery instance is being generated.</li>
             * <li>13: Data is being imported to the instance.</li>
             * <li>14: Data is being imported from another RDS instance to the instance.</li>
             * <li>15: A switchover is being performed.</li>
             * <li>16: A temporary instance is being created.</li>
             * <li>17: The network of the instance is being created.</li>
             * <li>18: The instance is being cloned.</li>
             * <li>19: The link is being changed.</li>
             * <li>20: The read-only RDS instances of the instance are being migrated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * <p>The storage space of the custom ApsaraDB RDS for MySQL instance at the storage layer. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder DBInstanceStorage(Long DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * <p>The type of the instance at the storage layer. The value is RDS.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder dbInstType(String dbInstType) {
                this.dbInstType = dbInstType;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>dm-*************</p>
             */
            public Builder dmInstanceId(String dmInstanceId) {
                this.dmInstanceId = dmInstanceId;
                return this;
            }

            /**
             * <p>The engine type of the custom ApsaraDB RDS for MySQL instance at the storage layer. The value is MySQL.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The engine version of the custom ApsaraDB RDS for MySQL instance at the storage layer. The value is 8.0.</p>
             * 
             * <strong>example:</strong>
             * <p>8.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The lock mode of the RDS instance. Valid values:</p>
             * <p>0: The instance is not locked.</p>
             * <p>1: The instance is manually locked.</p>
             * <p>2: The instance is automatically locked if the instance expires.</p>
             * <p>3: The instance is automatically locked if the instance is rolled back.</p>
             * <p>4: The instance is automatically locked if the storage space of the instance reaches the upper limit.</p>
             * <p>5: The instance is automatically locked if the storage space of the read-only instances reaches the upper limit.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lockMode(Integer lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The reason why the RDS instance is locked.</p>
             * 
             * <strong>example:</strong>
             * <p>Manually Locked</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The network type of the custom ApsaraDB RDS for MySQL instance at the storage layer. The value is VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The billing method of the custom ApsaraDB RDS for MySQL instance at the storage layer. Valid values:</p>
             * <ul>
             * <li>Postpaid: pay-as-you-go</li>
             * <li>Prepaid: subscription</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The port used to connect to the instance over an internal network.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The type of the custom ApsaraDB RDS for MySQL instance at the storage layer. Valid values:</p>
             * <ul>
             * <li>Primary: primary instance</li>
             * <li>Readonly: read-only instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Primary</p>
             */
            public Builder rdsInstType(String rdsInstType) {
                this.rdsInstType = rdsInstType;
                return this;
            }

            /**
             * <p>The read and write weights of the custom ApsaraDB RDS for MySQL instance at the storage layer.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeDrdsRdsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsRdsInstancesResponseBody</p>
     */
    public static class DbInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbInstance")
        private java.util.List<DbInstance> dbInstance;

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
        public java.util.List<DbInstance> getDbInstance() {
            return this.dbInstance;
        }

        public static final class Builder {
            private java.util.List<DbInstance> dbInstance; 

            /**
             * DbInstance.
             */
            public Builder dbInstance(java.util.List<DbInstance> dbInstance) {
                this.dbInstance = dbInstance;
                return this;
            }

            public DbInstances build() {
                return new DbInstances(this);
            } 

        } 

    }
}
