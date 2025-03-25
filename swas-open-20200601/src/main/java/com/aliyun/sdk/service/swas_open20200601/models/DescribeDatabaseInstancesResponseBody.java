// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link DescribeDatabaseInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatabaseInstancesResponseBody</p>
 */
public class DescribeDatabaseInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatabaseInstances")
    private java.util.List<DatabaseInstances> databaseInstances;

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
    public java.util.List<DatabaseInstances> getDatabaseInstances() {
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
        private java.util.List<DatabaseInstances> databaseInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The information about the Simple Database Service instances.</p>
         */
        public Builder databaseInstances(java.util.List<DatabaseInstances> databaseInstances) {
            this.databaseInstances = databaseInstances;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDatabaseInstancesResponseBody build() {
            return new DescribeDatabaseInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDatabaseInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatabaseInstancesResponseBody</p>
     */
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
             * <p>The business status of the instance. Valid values:</p>
             * <ul>
             * <li>normal</li>
             * <li>expired</li>
             * <li>overdue</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>The billing method of the Simple Database Service instance. Set the value to PrePaid. This value indicates the subscription billing method.</p>
             * <p>Default value: PrePaid.</p>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The time when the instance was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-01T02:39:46Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The plan edition ID of the Simple Database Service instance. Valid values:</p>
             * <ul>
             * <li>swas.db.c1m1s25: CNY 35/month.</li>
             * <li>swas.db.c1m2s80: CNY 100/month.</li>
             * <li>swas.db.c2m4s120: CNY 200/month.</li>
             * <li>swas.db.c2m8s240: CNY 300/month.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>swas.db.c1m1s25</p>
             */
            public Builder databaseInstanceEdition(String databaseInstanceEdition) {
                this.databaseInstanceEdition = databaseInstanceEdition;
                return this;
            }

            /**
             * <p>The ID of the Simple Database Service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>db-38263fa955774501a2ae1bdaed6f****</p>
             */
            public Builder databaseInstanceId(String databaseInstanceId) {
                this.databaseInstanceId = databaseInstanceId;
                return this;
            }

            /**
             * <p>The name of the Simple Database Service instance.</p>
             */
            public Builder databaseInstanceName(String databaseInstanceName) {
                this.databaseInstanceName = databaseInstanceName;
                return this;
            }

            /**
             * <p>The status of the Simple Database Service instance. Valid values:</p>
             * <ul>
             * <li>Pending: The instance is being created.</li>
             * <li>Restarting: The instance is being restarted.</li>
             * <li>Running: The instance is running.</li>
             * <li>Stopping: The instance is being stopped.</li>
             * <li>Stopped: The instance is stopped.</li>
             * <li>UPGRADING: The instance is being upgraded.</li>
             * <li>DISABLED: The instance is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder databaseInstanceStatus(String databaseInstanceStatus) {
                this.databaseInstanceStatus = databaseInstanceStatus;
                return this;
            }

            /**
             * <p>The database engine version of the instance. Valid values:</p>
             * <ul>
             * <li>5.7: MySQL 5.7.</li>
             * <li>8.0: MySQL 8.0.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder databaseVersion(String databaseVersion) {
                this.databaseVersion = databaseVersion;
                return this;
            }

            /**
             * <p>The time when the instance expires. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p> The time displayed in the Simple Application Server console is in the format of UTC+8.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2022-10-01T16:00:00Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The memory size of the instance. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The private endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1d39opj7906****.mysql.rds.aliyuncs.com</p>
             */
            public Builder privateConnection(String privateConnection) {
                this.privateConnection = privateConnection;
                return this;
            }

            /**
             * <p>The public endpoint.</p>
             * <blockquote>
             * <p> This parameter is displayed only after you apply for a public endpoint for the instance and a public endpoint is assigned to the instance. You can call <a href="https://help.aliyun.com/document_detail/451413.html">AllocatePublicConnection</a> to apply for a public endpoint for the instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>db-38263fa955774501a2ae1bdaed6f****.mysql.rds.aliyuncs.com</p>
             */
            public Builder publicConnection(String publicConnection) {
                this.publicConnection = publicConnection;
                return this;
            }

            /**
             * <p>The region ID of the Simple Database Service instances.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The size of the enhanced SSD (ESSD). Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            /**
             * <p>The name of the super administrator account of the Simple Database Service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>administrator</p>
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
