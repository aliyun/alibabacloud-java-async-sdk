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
 * {@link DescribeDrdsDbInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsDbInstancesResponseBody</p>
 */
public class DescribeDrdsDbInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbInstances")
    private DbInstances dbInstances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
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
         * <p>Indicates information about the ApsaraDB RDS for MySQL instances that are used to store the data of the specified database.</p>
         */
        public Builder dbInstances(DbInstances dbInstances) {
            this.dbInstances = dbInstances;
            return this;
        }

        /**
         * <p>Indicates the page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Indicates the number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Indicates the ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2F7F8080-9132-4279-85D0-B7E5C4305162</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Indicates the number of primary ApsaraDB RDS for MySQL instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeDrdsDbInstancesResponseBody build() {
            return new DescribeDrdsDbInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDrdsDbInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsDbInstancesResponseBody</p>
     */
    public static class ReadOnlyInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectUrl")
        private String connectUrl;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("DbInstType")
        private String dbInstType;

        @com.aliyun.core.annotation.NameInMap("DmInstanceId")
        private String dmInstanceId;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

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

        @com.aliyun.core.annotation.NameInMap("RemainDays")
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
             * <p>Indicates the endpoint that is used to connect to the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1t1mk5a5b******.mysql.rds.aliyuncs.com</p>
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * <p>Indicates the state of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The ApsaraDB RDS for MySQL instance is being created.</li>
             * <li><strong>1</strong>: The ApsaraDB RDS for MySQL instance is running.</li>
             * <li><strong>3</strong>: The ApsaraDB RDS for MySQL instance is being deleted.</li>
             * <li><strong>5</strong>: The ApsaraDB RDS for MySQL instance is being restarted.</li>
             * <li><strong>6</strong>: The ApsaraDB RDS for MySQL instance is being upgraded or downgraded.</li>
             * <li><strong>7</strong>: The ApsaraDB RDS for MySQL instance is being backed up.</li>
             * <li><strong>8</strong>: The network type of the ApsaraDB RDS for MySQL instance is being changed.</li>
             * <li><strong>9</strong>: The ApsaraDB RDS for MySQL instance is being migrated.</li>
             * <li><strong>11</strong>: The data of the ApsaraDB RDS for MySQL instance is being migrated.</li>
             * <li><strong>12</strong>: A disaster-recovery instance is being generated.</li>
             * <li><strong>13</strong>: Data is being imported to the ApsaraDB RDS for MySQL instance.</li>
             * <li><strong>14</strong>: Data is being imported to the ApsaraDB RDS for MySQL instance from an another ApsaraDB RDS for MySQL instance.</li>
             * <li><strong>15</strong>: A failover is being performed.</li>
             * <li><strong>16</strong>: A temporary instance is being created.</li>
             * <li><strong>17</strong>: A network is being created for the ApsaraDB RDS for MySQL instance.</li>
             * <li><strong>18</strong>: The ApsaraDB RDS for MySQL instance is being cloned.</li>
             * <li><strong>19</strong>: The link is being changed.</li>
             * <li><strong>20</strong>: The read-only instances of the ApsaraDB RDS for MySQL instance are being migrated.</li>
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
             * <p>Indicates the type of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database. The value is set to RDS.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder dbInstType(String dbInstType) {
                this.dbInstType = dbInstType;
                return this;
            }

            /**
             * <p>Indicates the ID of a resource.</p>
             * 
             * <strong>example:</strong>
             * <p>dm-hbgau1zp****</p>
             */
            public Builder dmInstanceId(String dmInstanceId) {
                this.dmInstanceId = dmInstanceId;
                return this;
            }

            /**
             * <p>Indicates the engine of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>Indicates the engine version of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>Indicates the timestamp when the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database expires.</p>
             * 
             * <strong>example:</strong>
             * <p>123421352351234</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Indicates the name of a read-only instance.</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Indicates the network type of the read-only instance.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>Indicates the billing method of the read-only instance.</p>
             * <ul>
             * <li><strong>drdsPre</strong>: The instance uses the subscription billing method.</li>
             * <li><strong>drdsPost</strong>: The instance uses the pay-as-you-go billing method.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Postpaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>Indicates the port that is used to connect to the read-only instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>Indicates the type of the read-only instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder rdsInstType(String rdsInstType) {
                this.rdsInstType = rdsInstType;
                return this;
            }

            /**
             * <p>Indicates the read weight of the read-only instance.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder readWeight(Integer readWeight) {
                this.readWeight = readWeight;
                return this;
            }

            /**
             * <p>Indicates the number of remaining days before the read-only instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeDrdsDbInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsDbInstancesResponseBody</p>
     */
    public static class ReadOnlyInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReadOnlyInstance")
        private java.util.List<ReadOnlyInstance> readOnlyInstance;

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
        public java.util.List<ReadOnlyInstance> getReadOnlyInstance() {
            return this.readOnlyInstance;
        }

        public static final class Builder {
            private java.util.List<ReadOnlyInstance> readOnlyInstance; 

            /**
             * ReadOnlyInstance.
             */
            public Builder readOnlyInstance(java.util.List<ReadOnlyInstance> readOnlyInstance) {
                this.readOnlyInstance = readOnlyInstance;
                return this;
            }

            public ReadOnlyInstances build() {
                return new ReadOnlyInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDrdsDbInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsDbInstancesResponseBody</p>
     */
    public static class DbInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectUrl")
        private String connectUrl;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("DbInstType")
        private String dbInstType;

        @com.aliyun.core.annotation.NameInMap("DmInstanceId")
        private String dmInstanceId;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RdsInstType")
        private String rdsInstType;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyInstances")
        private ReadOnlyInstances readOnlyInstances;

        @com.aliyun.core.annotation.NameInMap("ReadWeight")
        private Integer readWeight;

        @com.aliyun.core.annotation.NameInMap("RemainDays")
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
             * <p>Indicates the endpoint that is used to connect to an ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1t1mk5a5b******.mysql.rds.aliyuncs.com</p>
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * <p>Indicates the ID of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1t1mk5a5bdj****</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>Indicates the state of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The ApsaraDB RDS for MySQL instance is being created.</li>
             * <li><strong>1</strong>: The ApsaraDB RDS for MySQL instance is running.</li>
             * <li><strong>3</strong>: The ApsaraDB RDS for MySQL instance is being deleted.</li>
             * <li><strong>5</strong>: The ApsaraDB RDS for MySQL instance is being restarted.</li>
             * <li><strong>6</strong>: The ApsaraDB RDS for MySQL instance is being upgraded or downgraded.</li>
             * <li><strong>7</strong>: The ApsaraDB RDS for MySQL instance is being backed up.</li>
             * <li><strong>8</strong>: The network type of the ApsaraDB RDS for MySQL instance is being changed.</li>
             * <li><strong>9</strong>: The ApsaraDB RDS for MySQL instance is being migrated.</li>
             * <li><strong>11</strong>: The data of the ApsaraDB RDS for MySQL instance is being migrated.</li>
             * <li><strong>12</strong>: A disaster-recovery instance is being generated.</li>
             * <li><strong>13</strong>: Data is being imported to the ApsaraDB RDS for MySQL instance.</li>
             * <li><strong>14</strong>: Data is being imported to the ApsaraDB RDS for MySQL instance from an another ApsaraDB RDS for MySQL instance.</li>
             * <li><strong>15</strong>: A failover is being performed.</li>
             * <li><strong>16</strong>: A temporary instance is being created.</li>
             * <li><strong>17</strong>: A network is being created for the ApsaraDB RDS for MySQL instance.</li>
             * <li><strong>18</strong>: The ApsaraDB RDS for MySQL instance is being cloned.</li>
             * <li><strong>19</strong>: The link is being changed.</li>
             * <li><strong>20</strong>: The read-only instances of the ApsaraDB RDS for MySQL instance are being migrated.</li>
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
             * <p>Indicates the type of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database. The value is set to RDS.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder dbInstType(String dbInstType) {
                this.dbInstType = dbInstType;
                return this;
            }

            /**
             * <p>Indicates the ID of a resource.</p>
             * 
             * <strong>example:</strong>
             * <p>dm-hbgau1zp****</p>
             */
            public Builder dmInstanceId(String dmInstanceId) {
                this.dmInstanceId = dmInstanceId;
                return this;
            }

            /**
             * <p>Indicates the engine of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>Indicates the engine version of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>Indicates the point in time when the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database expires.</p>
             * 
             * <strong>example:</strong>
             * <p>1237486127634</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Indicates the network type of the ApsaraDB RDS for MySQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>Indicates the billing method of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database. Valid values:</p>
             * <ul>
             * <li><strong>drdsPre</strong>: The instance uses the subscription billing method.</li>
             * <li><strong>drdsPost</strong>: The instance uses the pay-as-you-go billing method.</li>
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
             * <p>Indicates the port that is used to connect to the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>Indicates whether the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database is a primary instance or a read-only instance.</p>
             * <ul>
             * <li><strong>Primary</strong>: The instance is a primary instance.</li>
             * <li><strong>Readonly</strong>: The instance is a read-only instance.</li>
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
             * <p>Indicates information about the read-only instances of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
             */
            public Builder readOnlyInstances(ReadOnlyInstances readOnlyInstances) {
                this.readOnlyInstances = readOnlyInstances;
                return this;
            }

            /**
             * <p>Indicates the read weight of the read-only instance.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder readWeight(Integer readWeight) {
                this.readWeight = readWeight;
                return this;
            }

            /**
             * <p>Indicates the number of remaining days before a subscription instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeDrdsDbInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsDbInstancesResponseBody</p>
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
