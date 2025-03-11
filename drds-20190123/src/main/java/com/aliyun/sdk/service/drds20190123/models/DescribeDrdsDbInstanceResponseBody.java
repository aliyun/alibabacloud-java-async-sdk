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
 * {@link DescribeDrdsDbInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsDbInstanceResponseBody</p>
 */
public class DescribeDrdsDbInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbInstance")
    private DbInstance dbInstance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The detailed information about the returned custom ApsaraDB RDS for MySQL instance.</p>
         */
        public Builder dbInstance(DbInstance dbInstance) {
            this.dbInstance = dbInstance;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4FE09970-CA69-4144-88CA-67FB4BTY56G3</p>
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

        public DescribeDrdsDbInstanceResponseBody build() {
            return new DescribeDrdsDbInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDrdsDbInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsDbInstanceResponseBody</p>
     */
    public static class ReadOnlyInstance extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("ReadWeight")
        private Integer readWeight;

        @com.aliyun.core.annotation.NameInMap("RemainDays")
        private String remainDays;

        @com.aliyun.core.annotation.NameInMap("VersionAction")
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
             * <p>The URL used to connect to the read-only instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1ub71ct9skc3yxx.mysql.rds.aliyuncs.com</p>
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * <p>The ID of the read-only instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1ub71ct9skc****</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The state of the read-only instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * <p>The role of the read-only instance.</p>
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
             * <p>The engine of the database that is run on the read-only instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The engine version of the database that is run on the read-only instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the read-only instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>1823487328173</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The network type of the read-only instance.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The billing method of the read-only instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Postpaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The port used to connect to the read-only instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The type of the ApsaraDB RDS for MySQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder rdsInstType(String rdsInstType) {
                this.rdsInstType = rdsInstType;
                return this;
            }

            /**
             * <p>The read ratio of the read-only instance.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder readWeight(Integer readWeight) {
                this.readWeight = readWeight;
                return this;
            }

            /**
             * <p>The number of remaining days before the read-only instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder remainDays(String remainDays) {
                this.remainDays = remainDays;
                return this;
            }

            /**
             * <p>This parameter is unavailable for read-only instances.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeDrdsDbInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsDbInstanceResponseBody</p>
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
     * {@link DescribeDrdsDbInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsDbInstanceResponseBody</p>
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
             * <p>The URL used to connect to the custom ApsaraDB RDS for MySQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-***************.mysql.rds.aliyuncs.com</p>
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * <p>The ID of the ApsaraDB RDS for MySQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-***************</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The state of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * <p>The role of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Primary</strong>: The instance is a primary instance.</li>
             * <li><strong>ReadOnly</strong>: The instance is a read-only instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Primary</p>
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
             * <p>The engine of the database that is run on the instance. Valid value: <strong>MySQL</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The engine version of the database that is run on the instance. Valid values: <strong>5.7</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The time when the custom ApsaraDB RDS for MySQL instance expires. The value of this parameter is a UNIX timestamp. Unit: seconds.</p>
             * <blockquote>
             * <p> This parameter is returned only when the custom ApsaraDB RDS for MySQL instance is a subscription instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>12341434315</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The type of the network. Valid values: <strong>VPC</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The billing method of the custom ApsaraDB RDS for MySQL instance. Valid values:</p>
             * <ul>
             * <li><strong>Prepaid</strong>: subscription</li>
             * <li><strong>Postaid</strong>: pay-as-you-go</li>
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
             * <p>The port used to connect to the custom ApsaraDB RDS for MySQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder rdsInstType(String rdsInstType) {
                this.rdsInstType = rdsInstType;
                return this;
            }

            /**
             * <p>The list of read-only ApsaraDB RDS for MySQL instances.</p>
             */
            public Builder readOnlyInstances(ReadOnlyInstances readOnlyInstances) {
                this.readOnlyInstances = readOnlyInstances;
                return this;
            }

            /**
             * <p>The read ratio of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder readWeight(Integer readWeight) {
                this.readWeight = readWeight;
                return this;
            }

            /**
             * <p>The number of remaining days before the instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
