// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatabaseInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatabaseInstancesResponseBody</p>
 */
public class DescribeDatabaseInstancesResponseBody extends TeaModel {
    @NameInMap("DatabaseInstances")
    private java.util.List < DatabaseInstances> databaseInstances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * DatabaseInstances.
         */
        public Builder databaseInstances(java.util.List < DatabaseInstances> databaseInstances) {
            this.databaseInstances = databaseInstances;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
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
         * TotalCount.
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
        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("Cpu")
        private String cpu;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DatabaseInstanceEdition")
        private String databaseInstanceEdition;

        @NameInMap("DatabaseInstanceId")
        private String databaseInstanceId;

        @NameInMap("DatabaseInstanceName")
        private String databaseInstanceName;

        @NameInMap("DatabaseInstanceStatus")
        private String databaseInstanceStatus;

        @NameInMap("DatabaseVersion")
        private String databaseVersion;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("Memory")
        private String memory;

        @NameInMap("PrivateConnection")
        private String privateConnection;

        @NameInMap("PublicConnection")
        private String publicConnection;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Storage")
        private Integer storage;

        @NameInMap("SuperAccountName")
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
             * BusinessStatus.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DatabaseInstanceEdition.
             */
            public Builder databaseInstanceEdition(String databaseInstanceEdition) {
                this.databaseInstanceEdition = databaseInstanceEdition;
                return this;
            }

            /**
             * DatabaseInstanceId.
             */
            public Builder databaseInstanceId(String databaseInstanceId) {
                this.databaseInstanceId = databaseInstanceId;
                return this;
            }

            /**
             * DatabaseInstanceName.
             */
            public Builder databaseInstanceName(String databaseInstanceName) {
                this.databaseInstanceName = databaseInstanceName;
                return this;
            }

            /**
             * DatabaseInstanceStatus.
             */
            public Builder databaseInstanceStatus(String databaseInstanceStatus) {
                this.databaseInstanceStatus = databaseInstanceStatus;
                return this;
            }

            /**
             * DatabaseVersion.
             */
            public Builder databaseVersion(String databaseVersion) {
                this.databaseVersion = databaseVersion;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * PrivateConnection.
             */
            public Builder privateConnection(String privateConnection) {
                this.privateConnection = privateConnection;
                return this;
            }

            /**
             * PublicConnection.
             */
            public Builder publicConnection(String publicConnection) {
                this.publicConnection = publicConnection;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Storage.
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            /**
             * SuperAccountName.
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
