// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatabaseInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatabaseInstancesResponseBody</p>
 */
public class DescribeDatabaseInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatabaseInstances")
    private java.util.List < DatabaseInstances> databaseInstances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDatabaseInstancesResponseBody(Builder builder) {
        this.databaseInstances = builder.databaseInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabaseInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return databaseInstances
     */
    public java.util.List < DatabaseInstances> getDatabaseInstances() {
        return this.databaseInstances;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DatabaseInstances> databaseInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the Simple Database Service instances.
         */
        public Builder databaseInstances(java.util.List < DatabaseInstances> databaseInstances) {
            this.databaseInstances = databaseInstances;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDatabaseInstancesResponseBody build() {
            return new DescribeDatabaseInstancesResponseBody(this);
        } 

    } 

    public static class DatabaseInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DatabaseInstanceEdition")
        private String databaseInstanceEdition;

        @com.aliyun.core.annotation.NameInMap("DatabaseInstanceId")
        private String databaseInstanceId;

        @com.aliyun.core.annotation.NameInMap("DatabaseInstanceName")
        private String databaseInstanceName;

        @com.aliyun.core.annotation.NameInMap("DatabaseInstanceStatus")
        private String databaseInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("DatabaseVersion")
        private String databaseVersion;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("PrivateConnection")
        private String privateConnection;

        @com.aliyun.core.annotation.NameInMap("PublicConnection")
        private String publicConnection;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Storage")
        private Integer storage;

        @com.aliyun.core.annotation.NameInMap("SuperAccountName")
        private String superAccountName;

        private DatabaseInstances(Builder builder) {
            this.businessStatus = builder.businessStatus;
            this.chargeType = builder.chargeType;
            this.cpu = builder.cpu;
            this.creationTime = builder.creationTime;
            this.databaseInstanceEdition = builder.databaseInstanceEdition;
            this.databaseInstanceId = builder.databaseInstanceId;
            this.databaseInstanceName = builder.databaseInstanceName;
            this.databaseInstanceStatus = builder.databaseInstanceStatus;
            this.databaseVersion = builder.databaseVersion;
            this.expiredTime = builder.expiredTime;
            this.memory = builder.memory;
            this.privateConnection = builder.privateConnection;
            this.publicConnection = builder.publicConnection;
            this.regionId = builder.regionId;
            this.storage = builder.storage;
            this.superAccountName = builder.superAccountName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseInstances create() {
            return builder().build();
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return databaseInstanceEdition
         */
        public String getDatabaseInstanceEdition() {
            return this.databaseInstanceEdition;
        }

        /**
         * @return databaseInstanceId
         */
        public String getDatabaseInstanceId() {
            return this.databaseInstanceId;
        }

        /**
         * @return databaseInstanceName
         */
        public String getDatabaseInstanceName() {
            return this.databaseInstanceName;
        }

        /**
         * @return databaseInstanceStatus
         */
        public String getDatabaseInstanceStatus() {
            return this.databaseInstanceStatus;
        }

        /**
         * @return databaseVersion
         */
        public String getDatabaseVersion() {
            return this.databaseVersion;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return privateConnection
         */
        public String getPrivateConnection() {
            return this.privateConnection;
        }

        /**
         * @return publicConnection
         */
        public String getPublicConnection() {
            return this.publicConnection;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return storage
         */
        public Integer getStorage() {
            return this.storage;
        }

        /**
         * @return superAccountName
         */
        public String getSuperAccountName() {
            return this.superAccountName;
        }

        public static final class Builder {
            private String businessStatus; 
            private String chargeType; 
            private String cpu; 
            private String creationTime; 
            private String databaseInstanceEdition; 
            private String databaseInstanceId; 
            private String databaseInstanceName; 
            private String databaseInstanceStatus; 
            private String databaseVersion; 
            private String expiredTime; 
            private String memory; 
            private String privateConnection; 
            private String publicConnection; 
            private String regionId; 
            private Integer storage; 
            private String superAccountName; 

            /**
             * The business status of the instance. Valid values:
             * <p>
             * 
             * *   normal
             * *   expired
             * *   overdue
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * The billing method of the Simple Database Service instance. Set the value to PrePaid. This value indicates the subscription billing method.
             * <p>
             * 
             * Default value: PrePaid.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The number of vCPUs.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The time when the instance was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The plan edition ID of the Simple Database Service instance. Valid values:
             * <p>
             * 
             * *   swas.db.c1m1s25: CNY 35/month.
             * *   swas.db.c1m2s80: CNY 100/month.
             * *   swas.db.c2m4s120: CNY 200/month.
             * *   swas.db.c2m8s240: CNY 300/month.
             */
            public Builder databaseInstanceEdition(String databaseInstanceEdition) {
                this.databaseInstanceEdition = databaseInstanceEdition;
                return this;
            }

            /**
             * The ID of the Simple Database Service instance.
             */
            public Builder databaseInstanceId(String databaseInstanceId) {
                this.databaseInstanceId = databaseInstanceId;
                return this;
            }

            /**
             * The name of the Simple Database Service instance.
             */
            public Builder databaseInstanceName(String databaseInstanceName) {
                this.databaseInstanceName = databaseInstanceName;
                return this;
            }

            /**
             * The status of the Simple Database Service instance. Valid values:
             * <p>
             * 
             * *   Pending: The instance is being created.
             * *   Restarting: The instance is being restarted.
             * *   Running: The instance is running.
             * *   Stopping: The instance is being stopped.
             * *   Stopped: The instance is stopped.
             * *   UPGRADING: The instance is being upgraded.
             * *   DISABLED: The instance is disabled.
             */
            public Builder databaseInstanceStatus(String databaseInstanceStatus) {
                this.databaseInstanceStatus = databaseInstanceStatus;
                return this;
            }

            /**
             * The database engine version of the instance. Valid values:
             * <p>
             * 
             * *   5.7: MySQL 5.7.
             * *   8.0: MySQL 8.0.
             */
            public Builder databaseVersion(String databaseVersion) {
                this.databaseVersion = databaseVersion;
                return this;
            }

            /**
             * The time when the instance expires. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             * <p>
             * 
             * >  The time displayed in the Simple Application Server console is in the format of UTC+8.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The memory size of the instance. Unit: GB.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The private endpoint.
             */
            public Builder privateConnection(String privateConnection) {
                this.privateConnection = privateConnection;
                return this;
            }

            /**
             * The public endpoint.
             * <p>
             * 
             * >  This parameter is displayed only after you apply for a public endpoint for the instance and a public endpoint is assigned to the instance. You can call [AllocatePublicConnection](~~451413~~) to apply for a public endpoint for the instance.
             */
            public Builder publicConnection(String publicConnection) {
                this.publicConnection = publicConnection;
                return this;
            }

            /**
             * The region ID of the Simple Database Service instances.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The size of the enhanced SSD (ESSD). Unit: GB.
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            /**
             * The name of the super administrator account of the Simple Database Service instance.
             */
            public Builder superAccountName(String superAccountName) {
                this.superAccountName = superAccountName;
                return this;
            }

            public DatabaseInstances build() {
                return new DatabaseInstances(this);
            } 

        } 

    }
}
