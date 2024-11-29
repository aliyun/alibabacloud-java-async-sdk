// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetFullRequestOriginStatByInstanceIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetFullRequestOriginStatByInstanceIdResponseBody</p>
 */
public class GetFullRequestOriginStatByInstanceIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetFullRequestOriginStatByInstanceIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFullRequestOriginStatByInstanceIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7172BECE-588A-5961-8126-C216E16B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBody build() {
            return new GetFullRequestOriginStatByInstanceIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFullRequestOriginStatByInstanceIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetFullRequestOriginStatByInstanceIdResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgExaminedRows")
        private Double avgExaminedRows;

        @com.aliyun.core.annotation.NameInMap("AvgFetchRows")
        private Long avgFetchRows;

        @com.aliyun.core.annotation.NameInMap("AvgLockWaitTime")
        private Double avgLockWaitTime;

        @com.aliyun.core.annotation.NameInMap("AvgLogicalRead")
        private Double avgLogicalRead;

        @com.aliyun.core.annotation.NameInMap("AvgPhysicalAsyncRead")
        private Long avgPhysicalAsyncRead;

        @com.aliyun.core.annotation.NameInMap("AvgPhysicalSyncRead")
        private Double avgPhysicalSyncRead;

        @com.aliyun.core.annotation.NameInMap("AvgReturnedRows")
        private Double avgReturnedRows;

        @com.aliyun.core.annotation.NameInMap("AvgRows")
        private Long avgRows;

        @com.aliyun.core.annotation.NameInMap("AvgRt")
        private Double avgRt;

        @com.aliyun.core.annotation.NameInMap("AvgSqlCount")
        private Long avgSqlCount;

        @com.aliyun.core.annotation.NameInMap("AvgUpdatedRows")
        private Double avgUpdatedRows;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("CountRate")
        private Double countRate;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("ErrorCount")
        private Long errorCount;

        @com.aliyun.core.annotation.NameInMap("ExaminedRows")
        private Long examinedRows;

        @com.aliyun.core.annotation.NameInMap("FetchRows")
        private Long fetchRows;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("LockWaitTime")
        private Double lockWaitTime;

        @com.aliyun.core.annotation.NameInMap("LogicalRead")
        private Long logicalRead;

        @com.aliyun.core.annotation.NameInMap("OriginHost")
        private String originHost;

        @com.aliyun.core.annotation.NameInMap("PhysicalAsyncRead")
        private Long physicalAsyncRead;

        @com.aliyun.core.annotation.NameInMap("PhysicalSyncRead")
        private Long physicalSyncRead;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Long port;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private Long rows;

        @com.aliyun.core.annotation.NameInMap("RtGreaterThanOneSecondCount")
        private Long rtGreaterThanOneSecondCount;

        @com.aliyun.core.annotation.NameInMap("RtRate")
        private Double rtRate;

        @com.aliyun.core.annotation.NameInMap("SqlCount")
        private Long sqlCount;

        @com.aliyun.core.annotation.NameInMap("SumUpdatedRows")
        private Long sumUpdatedRows;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private List(Builder builder) {
            this.avgExaminedRows = builder.avgExaminedRows;
            this.avgFetchRows = builder.avgFetchRows;
            this.avgLockWaitTime = builder.avgLockWaitTime;
            this.avgLogicalRead = builder.avgLogicalRead;
            this.avgPhysicalAsyncRead = builder.avgPhysicalAsyncRead;
            this.avgPhysicalSyncRead = builder.avgPhysicalSyncRead;
            this.avgReturnedRows = builder.avgReturnedRows;
            this.avgRows = builder.avgRows;
            this.avgRt = builder.avgRt;
            this.avgSqlCount = builder.avgSqlCount;
            this.avgUpdatedRows = builder.avgUpdatedRows;
            this.count = builder.count;
            this.countRate = builder.countRate;
            this.database = builder.database;
            this.errorCount = builder.errorCount;
            this.examinedRows = builder.examinedRows;
            this.fetchRows = builder.fetchRows;
            this.ip = builder.ip;
            this.key = builder.key;
            this.lockWaitTime = builder.lockWaitTime;
            this.logicalRead = builder.logicalRead;
            this.originHost = builder.originHost;
            this.physicalAsyncRead = builder.physicalAsyncRead;
            this.physicalSyncRead = builder.physicalSyncRead;
            this.port = builder.port;
            this.rows = builder.rows;
            this.rtGreaterThanOneSecondCount = builder.rtGreaterThanOneSecondCount;
            this.rtRate = builder.rtRate;
            this.sqlCount = builder.sqlCount;
            this.sumUpdatedRows = builder.sumUpdatedRows;
            this.version = builder.version;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return avgExaminedRows
         */
        public Double getAvgExaminedRows() {
            return this.avgExaminedRows;
        }

        /**
         * @return avgFetchRows
         */
        public Long getAvgFetchRows() {
            return this.avgFetchRows;
        }

        /**
         * @return avgLockWaitTime
         */
        public Double getAvgLockWaitTime() {
            return this.avgLockWaitTime;
        }

        /**
         * @return avgLogicalRead
         */
        public Double getAvgLogicalRead() {
            return this.avgLogicalRead;
        }

        /**
         * @return avgPhysicalAsyncRead
         */
        public Long getAvgPhysicalAsyncRead() {
            return this.avgPhysicalAsyncRead;
        }

        /**
         * @return avgPhysicalSyncRead
         */
        public Double getAvgPhysicalSyncRead() {
            return this.avgPhysicalSyncRead;
        }

        /**
         * @return avgReturnedRows
         */
        public Double getAvgReturnedRows() {
            return this.avgReturnedRows;
        }

        /**
         * @return avgRows
         */
        public Long getAvgRows() {
            return this.avgRows;
        }

        /**
         * @return avgRt
         */
        public Double getAvgRt() {
            return this.avgRt;
        }

        /**
         * @return avgSqlCount
         */
        public Long getAvgSqlCount() {
            return this.avgSqlCount;
        }

        /**
         * @return avgUpdatedRows
         */
        public Double getAvgUpdatedRows() {
            return this.avgUpdatedRows;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return countRate
         */
        public Double getCountRate() {
            return this.countRate;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return errorCount
         */
        public Long getErrorCount() {
            return this.errorCount;
        }

        /**
         * @return examinedRows
         */
        public Long getExaminedRows() {
            return this.examinedRows;
        }

        /**
         * @return fetchRows
         */
        public Long getFetchRows() {
            return this.fetchRows;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return lockWaitTime
         */
        public Double getLockWaitTime() {
            return this.lockWaitTime;
        }

        /**
         * @return logicalRead
         */
        public Long getLogicalRead() {
            return this.logicalRead;
        }

        /**
         * @return originHost
         */
        public String getOriginHost() {
            return this.originHost;
        }

        /**
         * @return physicalAsyncRead
         */
        public Long getPhysicalAsyncRead() {
            return this.physicalAsyncRead;
        }

        /**
         * @return physicalSyncRead
         */
        public Long getPhysicalSyncRead() {
            return this.physicalSyncRead;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return rows
         */
        public Long getRows() {
            return this.rows;
        }

        /**
         * @return rtGreaterThanOneSecondCount
         */
        public Long getRtGreaterThanOneSecondCount() {
            return this.rtGreaterThanOneSecondCount;
        }

        /**
         * @return rtRate
         */
        public Double getRtRate() {
            return this.rtRate;
        }

        /**
         * @return sqlCount
         */
        public Long getSqlCount() {
            return this.sqlCount;
        }

        /**
         * @return sumUpdatedRows
         */
        public Long getSumUpdatedRows() {
            return this.sumUpdatedRows;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Double avgExaminedRows; 
            private Long avgFetchRows; 
            private Double avgLockWaitTime; 
            private Double avgLogicalRead; 
            private Long avgPhysicalAsyncRead; 
            private Double avgPhysicalSyncRead; 
            private Double avgReturnedRows; 
            private Long avgRows; 
            private Double avgRt; 
            private Long avgSqlCount; 
            private Double avgUpdatedRows; 
            private Long count; 
            private Double countRate; 
            private String database; 
            private Long errorCount; 
            private Long examinedRows; 
            private Long fetchRows; 
            private String ip; 
            private String key; 
            private Double lockWaitTime; 
            private Long logicalRead; 
            private String originHost; 
            private Long physicalAsyncRead; 
            private Long physicalSyncRead; 
            private Long port; 
            private Long rows; 
            private Long rtGreaterThanOneSecondCount; 
            private Double rtRate; 
            private Long sqlCount; 
            private Long sumUpdatedRows; 
            private Long version; 
            private String vpcId; 

            /**
             * <p>The average number of scanned rows.</p>
             * <blockquote>
             * <p>This parameter is returned only for ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and PolarDB for MySQL databases.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder avgExaminedRows(Double avgExaminedRows) {
                this.avgExaminedRows = avgExaminedRows;
                return this;
            }

            /**
             * <p>The average number of rows that are fetched from data nodes by compute nodes on the PolarDB-X 2.0 instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder avgFetchRows(Long avgFetchRows) {
                this.avgFetchRows = avgFetchRows;
                return this;
            }

            /**
             * <p>The average lock wait duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0.00009589874265269765</p>
             */
            public Builder avgLockWaitTime(Double avgLockWaitTime) {
                this.avgLockWaitTime = avgLockWaitTime;
                return this;
            }

            /**
             * <p>The average number of logical reads.</p>
             * 
             * <strong>example:</strong>
             * <p>654.4470327860251</p>
             */
            public Builder avgLogicalRead(Double avgLogicalRead) {
                this.avgLogicalRead = avgLogicalRead;
                return this;
            }

            /**
             * <p>The average number of physical asynchronous reads.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder avgPhysicalAsyncRead(Long avgPhysicalAsyncRead) {
                this.avgPhysicalAsyncRead = avgPhysicalAsyncRead;
                return this;
            }

            /**
             * <p>The average number of physical synchronous reads.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder avgPhysicalSyncRead(Double avgPhysicalSyncRead) {
                this.avgPhysicalSyncRead = avgPhysicalSyncRead;
                return this;
            }

            /**
             * <p>The average number of returned rows.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder avgReturnedRows(Double avgReturnedRows) {
                this.avgReturnedRows = avgReturnedRows;
                return this;
            }

            /**
             * <p>The average number of rows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder avgRows(Long avgRows) {
                this.avgRows = avgRows;
                return this;
            }

            /**
             * <p>The average execution duration.</p>
             * 
             * <strong>example:</strong>
             * <p>2.499</p>
             */
            public Builder avgRt(Double avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * <p>The average number of SQL statements.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder avgSqlCount(Long avgSqlCount) {
                this.avgSqlCount = avgSqlCount;
                return this;
            }

            /**
             * <p>The average number of updated rows.</p>
             * <blockquote>
             * <p>This parameter is returned only for ApsaraDB RDS for MySQL and PolarDB-X 2.0 databases.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder avgUpdatedRows(Double avgUpdatedRows) {
                this.avgUpdatedRows = avgUpdatedRows;
                return this;
            }

            /**
             * <p>The total number of executions.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The percentage of the total number of executions.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0586</p>
             */
            public Builder countRate(Double countRate) {
                this.countRate = countRate;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>dbtest01</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The number of failed executions.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder errorCount(Long errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * <p>The total number of scanned rows.</p>
             * <blockquote>
             * <p>This parameter is returned only for ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and PolarDB for MySQL databases.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder examinedRows(Long examinedRows) {
                this.examinedRows = examinedRows;
                return this;
            }

            /**
             * <p>The number of rows that are fetched from data nodes by compute nodes on the PolarDB-X 2.0 instance.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder fetchRows(Long fetchRows) {
                this.fetchRows = fetchRows;
                return this;
            }

            /**
             * <p>The network address of the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6dyi58dm6****.mysql.rds.aliy****.com</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The IP address of the client that executes the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>172.26.6****</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The lock wait duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1089.4177720290281</p>
             */
            public Builder lockWaitTime(Double lockWaitTime) {
                this.lockWaitTime = lockWaitTime;
                return this;
            }

            /**
             * <p>The number of logical reads.</p>
             * 
             * <strong>example:</strong>
             * <p>7.434573266E9</p>
             */
            public Builder logicalRead(Long logicalRead) {
                this.logicalRead = logicalRead;
                return this;
            }

            /**
             * <p>The IP address of the client that executes the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>172.26.6****</p>
             */
            public Builder originHost(String originHost) {
                this.originHost = originHost;
                return this;
            }

            /**
             * <p>The number of physical asynchronous reads.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicalAsyncRead(Long physicalAsyncRead) {
                this.physicalAsyncRead = physicalAsyncRead;
                return this;
            }

            /**
             * <p>The number of physical synchronous reads.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicalSyncRead(Long physicalSyncRead) {
                this.physicalSyncRead = physicalSyncRead;
                return this;
            }

            /**
             * <p>The port number that is used to connect to the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The total number of rows updated or returned by the compute nodes of the PolarDB-X 2.0 instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rows(Long rows) {
                this.rows = rows;
                return this;
            }

            /**
             * <p>The number of SQL statements that take longer than 1 second to execute.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder rtGreaterThanOneSecondCount(Long rtGreaterThanOneSecondCount) {
                this.rtGreaterThanOneSecondCount = rtGreaterThanOneSecondCount;
                return this;
            }

            /**
             * <p>The execution duration percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1384</p>
             */
            public Builder rtRate(Double rtRate) {
                this.rtRate = rtRate;
                return this;
            }

            /**
             * <p>The number of SQL statements.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder sqlCount(Long sqlCount) {
                this.sqlCount = sqlCount;
                return this;
            }

            /**
             * <p>The total number of updated rows.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder sumUpdatedRows(Long sumUpdatedRows) {
                this.sumUpdatedRows = sumUpdatedRows;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zentqj1sk4qmolci****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFullRequestOriginStatByInstanceIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetFullRequestOriginStatByInstanceIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Long total; 

            /**
             * <p>The details of the full request data.</p>
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
