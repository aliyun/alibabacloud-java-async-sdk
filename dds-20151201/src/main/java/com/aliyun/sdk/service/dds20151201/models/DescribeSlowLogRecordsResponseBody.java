// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogRecordsResponseBody</p>
 */
public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeSlowLogRecordsResponseBody(Builder builder) {
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
        private String engine; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * The database engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * An array that consists of the information about each slow query.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The page number of the returned page. The value is a positive integer that does not exceed the maximum value of the INTEGER data type. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of slow query log entries returned on the page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * The total number of returned entries.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeSlowLogRecordsResponseBody build() {
            return new DescribeSlowLogRecordsResponseBody(this);
        } 

    } 

    public static class LogRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("DocsExamined")
        private Long docsExamined;

        @com.aliyun.core.annotation.NameInMap("ExecutionStartTime")
        private String executionStartTime;

        @com.aliyun.core.annotation.NameInMap("HostAddress")
        private String hostAddress;

        @com.aliyun.core.annotation.NameInMap("KeysExamined")
        private Long keysExamined;

        @com.aliyun.core.annotation.NameInMap("QueryTimes")
        private String queryTimes;

        @com.aliyun.core.annotation.NameInMap("ReturnRowCounts")
        private Long returnRowCounts;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private LogRecords(Builder builder) {
            this.accountName = builder.accountName;
            this.DBName = builder.DBName;
            this.docsExamined = builder.docsExamined;
            this.executionStartTime = builder.executionStartTime;
            this.hostAddress = builder.hostAddress;
            this.keysExamined = builder.keysExamined;
            this.queryTimes = builder.queryTimes;
            this.returnRowCounts = builder.returnRowCounts;
            this.SQLText = builder.SQLText;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogRecords create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return docsExamined
         */
        public Long getDocsExamined() {
            return this.docsExamined;
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
         * @return keysExamined
         */
        public Long getKeysExamined() {
            return this.keysExamined;
        }

        /**
         * @return queryTimes
         */
        public String getQueryTimes() {
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

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String accountName; 
            private String DBName; 
            private Long docsExamined; 
            private String executionStartTime; 
            private String hostAddress; 
            private Long keysExamined; 
            private String queryTimes; 
            private Long returnRowCounts; 
            private String SQLText; 
            private String tableName; 

            /**
             * The username of the database account that performs the operation.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * The number of documents that are scanned during the operation.
             */
            public Builder docsExamined(Long docsExamined) {
                this.docsExamined = docsExamined;
                return this;
            }

            /**
             * The start time of the operation. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder executionStartTime(String executionStartTime) {
                this.executionStartTime = executionStartTime;
                return this;
            }

            /**
             * The host IP address that is used to connect to the database.
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * The number of rows involved in index scans.
             */
            public Builder keysExamined(Long keysExamined) {
                this.keysExamined = keysExamined;
                return this;
            }

            /**
             * The execution time of the statement. Unit: milliseconds.
             */
            public Builder queryTimes(String queryTimes) {
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
             * The SQL statement that is executed during the slow operation.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * The name of the collection.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public LogRecords build() {
                return new LogRecords(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogRecords")
        private java.util.List < LogRecords> logRecords;

        private Items(Builder builder) {
            this.logRecords = builder.logRecords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return logRecords
         */
        public java.util.List < LogRecords> getLogRecords() {
            return this.logRecords;
        }

        public static final class Builder {
            private java.util.List < LogRecords> logRecords; 

            /**
             * LogRecords.
             */
            public Builder logRecords(java.util.List < LogRecords> logRecords) {
                this.logRecords = logRecords;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
