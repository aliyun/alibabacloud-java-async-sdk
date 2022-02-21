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
         * DbInstances.
         */
        public Builder dbInstances(DbInstances dbInstances) {
            this.dbInstances = dbInstances;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
            private String networkType; 
            private String payType; 
            private Integer port; 
            private String rdsInstType; 
            private Integer readWeight; 

            /**
             * ConnectUrl.
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * DBInstanceCPU.
             */
            public Builder DBInstanceCPU(String DBInstanceCPU) {
                this.DBInstanceCPU = DBInstanceCPU;
                return this;
            }

            /**
             * DBInstanceClassType.
             */
            public Builder DBInstanceClassType(String DBInstanceClassType) {
                this.DBInstanceClassType = DBInstanceClassType;
                return this;
            }

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * DBInstanceMemory.
             */
            public Builder DBInstanceMemory(Long DBInstanceMemory) {
                this.DBInstanceMemory = DBInstanceMemory;
                return this;
            }

            /**
             * DBInstanceStatus.
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * DBInstanceStorage.
             */
            public Builder DBInstanceStorage(Long DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * DbInstType.
             */
            public Builder dbInstType(String dbInstType) {
                this.dbInstType = dbInstType;
                return this;
            }

            /**
             * DmInstanceId.
             */
            public Builder dmInstanceId(String dmInstanceId) {
                this.dmInstanceId = dmInstanceId;
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
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
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
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * RdsInstType.
             */
            public Builder rdsInstType(String rdsInstType) {
                this.rdsInstType = rdsInstType;
                return this;
            }

            /**
             * ReadWeight.
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
