// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogRecordsResponseBody</p>
 */
public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("Engine")
    private String engine;

    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeSlowLogRecordsResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.engine = builder.engine;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowLogRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String engine; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * The ID of cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The type of the database engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * Details about slow query logs.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * The total number of SQL statements.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeSlowLogRecordsResponseBody build() {
            return new DescribeSlowLogRecordsResponseBody(this);
        } 

    } 

    public static class SQLSlowRecord extends TeaModel {
        @NameInMap("DBName")
        private String DBName;

        @NameInMap("DBNodeId")
        private String DBNodeId;

        @NameInMap("ExecutionStartTime")
        private String executionStartTime;

        @NameInMap("HostAddress")
        private String hostAddress;

        @NameInMap("LockTimes")
        private Long lockTimes;

        @NameInMap("ParseRowCounts")
        private Long parseRowCounts;

        @NameInMap("QueryTimeMS")
        private Long queryTimeMS;

        @NameInMap("QueryTimes")
        private Long queryTimes;

        @NameInMap("ReturnRowCounts")
        private Long returnRowCounts;

        @NameInMap("SQLText")
        private String SQLText;

        private SQLSlowRecord(Builder builder) {
            this.DBName = builder.DBName;
            this.DBNodeId = builder.DBNodeId;
            this.executionStartTime = builder.executionStartTime;
            this.hostAddress = builder.hostAddress;
            this.lockTimes = builder.lockTimes;
            this.parseRowCounts = builder.parseRowCounts;
            this.queryTimeMS = builder.queryTimeMS;
            this.queryTimes = builder.queryTimes;
            this.returnRowCounts = builder.returnRowCounts;
            this.SQLText = builder.SQLText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQLSlowRecord create() {
            return builder().build();
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return DBNodeId
         */
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        /**
         * @return executionStartTime
         */
        public String getExecutionStartTime() {
            return this.executionStartTime;
        }

        /**
         * @return hostAddress
         */
        public String getHostAddress() {
            return this.hostAddress;
        }

        /**
         * @return lockTimes
         */
        public Long getLockTimes() {
            return this.lockTimes;
        }

        /**
         * @return parseRowCounts
         */
        public Long getParseRowCounts() {
            return this.parseRowCounts;
        }

        /**
         * @return queryTimeMS
         */
        public Long getQueryTimeMS() {
            return this.queryTimeMS;
        }

        /**
         * @return queryTimes
         */
        public Long getQueryTimes() {
            return this.queryTimes;
        }

        /**
         * @return returnRowCounts
         */
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        public static final class Builder {
            private String DBName; 
            private String DBNodeId; 
            private String executionStartTime; 
            private String hostAddress; 
            private Long lockTimes; 
            private Long parseRowCounts; 
            private Long queryTimeMS; 
            private Long queryTimes; 
            private Long returnRowCounts; 
            private String SQLText; 

            /**
             * The name of the database.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * The time when the SQL statement was executed. The time is in the `yyyy-MM-ddTHH:mmZ` format. The time is displayed in UTC.
             */
            public Builder executionStartTime(String executionStartTime) {
                this.executionStartTime = executionStartTime;
                return this;
            }

            /**
             * The IP address of the client that is used to connect to the database.
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * The period of time during which the SQL statement was locked. Unit: seconds.
             */
            public Builder lockTimes(Long lockTimes) {
                this.lockTimes = lockTimes;
                return this;
            }

            /**
             * The number of rows parsed by the SQL statement.
             */
            public Builder parseRowCounts(Long parseRowCounts) {
                this.parseRowCounts = parseRowCounts;
                return this;
            }

            /**
             * The time range for the query. Unit: milliseconds.
             */
            public Builder queryTimeMS(Long queryTimeMS) {
                this.queryTimeMS = queryTimeMS;
                return this;
            }

            /**
             * The amount of time that was consumed to execute the SQL statement. Unit: seconds.
             */
            public Builder queryTimes(Long queryTimes) {
                this.queryTimes = queryTimes;
                return this;
            }

            /**
             * The number of rows returned by the SQL statement.
             */
            public Builder returnRowCounts(Long returnRowCounts) {
                this.returnRowCounts = returnRowCounts;
                return this;
            }

            /**
             * The SQL statement that is executed in the query.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            public SQLSlowRecord build() {
                return new SQLSlowRecord(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("SQLSlowRecord")
        private java.util.List < SQLSlowRecord> SQLSlowRecord;

        private Items(Builder builder) {
            this.SQLSlowRecord = builder.SQLSlowRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return SQLSlowRecord
         */
        public java.util.List < SQLSlowRecord> getSQLSlowRecord() {
            return this.SQLSlowRecord;
        }

        public static final class Builder {
            private java.util.List < SQLSlowRecord> SQLSlowRecord; 

            /**
             * SQLSlowRecord.
             */
            public Builder SQLSlowRecord(java.util.List < SQLSlowRecord> SQLSlowRecord) {
                this.SQLSlowRecord = SQLSlowRecord;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
