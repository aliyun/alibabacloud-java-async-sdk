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
         * DbInstances.
         */
        public Builder dbInstances(DbInstances dbInstances) {
            this.dbInstances = dbInstances;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
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

        /**
         * Total.
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
             * ConnectUrl.
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
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
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
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

            /**
             * RemainDays.
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
             * ConnectUrl.
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
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
             * DBInstanceStatus.
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
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
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
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
             * ReadOnlyInstances.
             */
            public Builder readOnlyInstances(ReadOnlyInstances readOnlyInstances) {
                this.readOnlyInstances = readOnlyInstances;
                return this;
            }

            /**
             * ReadWeight.
             */
            public Builder readWeight(Integer readWeight) {
                this.readWeight = readWeight;
                return this;
            }

            /**
             * RemainDays.
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
