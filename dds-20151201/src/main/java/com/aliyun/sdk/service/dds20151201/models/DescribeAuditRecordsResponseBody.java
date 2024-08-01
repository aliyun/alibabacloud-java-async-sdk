// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditRecordsResponseBody</p>
 */
public class DescribeAuditRecordsResponseBody extends TeaModel {
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

    private DescribeAuditRecordsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditRecordsResponseBody create() {
        return builder().build();
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
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * An array that consists of the information of audit log entries.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The maximum number of entries on the current page.
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

        public DescribeAuditRecordsResponseBody build() {
            return new DescribeAuditRecordsResponseBody(this);
        } 

    } 

    public static class SQLRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private String executeTime;

        @com.aliyun.core.annotation.NameInMap("HostAddress")
        private String hostAddress;

        @com.aliyun.core.annotation.NameInMap("ReturnRowCounts")
        private Long returnRowCounts;

        @com.aliyun.core.annotation.NameInMap("Syntax")
        private String syntax;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("ThreadID")
        private String threadID;

        @com.aliyun.core.annotation.NameInMap("TotalExecutionTimes")
        private Long totalExecutionTimes;

        private SQLRecord(Builder builder) {
            this.accountName = builder.accountName;
            this.DBName = builder.DBName;
            this.executeTime = builder.executeTime;
            this.hostAddress = builder.hostAddress;
            this.returnRowCounts = builder.returnRowCounts;
            this.syntax = builder.syntax;
            this.tableName = builder.tableName;
            this.threadID = builder.threadID;
            this.totalExecutionTimes = builder.totalExecutionTimes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQLRecord create() {
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
         * @return executeTime
         */
        public String getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return hostAddress
         */
        public String getHostAddress() {
            return this.hostAddress;
        }

        /**
         * @return returnRowCounts
         */
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        /**
         * @return syntax
         */
        public String getSyntax() {
            return this.syntax;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return threadID
         */
        public String getThreadID() {
            return this.threadID;
        }

        /**
         * @return totalExecutionTimes
         */
        public Long getTotalExecutionTimes() {
            return this.totalExecutionTimes;
        }

        public static final class Builder {
            private String accountName; 
            private String DBName; 
            private String executeTime; 
            private String hostAddress; 
            private Long returnRowCounts; 
            private String syntax; 
            private String tableName; 
            private String threadID; 
            private Long totalExecutionTimes; 

            /**
             * The account of the database.
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
             * The time when the statement was executed. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * The IP addresses of the client.
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * The number of SQL audit log entries that are returned.
             */
            public Builder returnRowCounts(Long returnRowCounts) {
                this.returnRowCounts = returnRowCounts;
                return this;
            }

            /**
             * The statement that was executed.
             */
            public Builder syntax(String syntax) {
                this.syntax = syntax;
                return this;
            }

            /**
             * The name of the collection.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The ID of the thread.
             */
            public Builder threadID(String threadID) {
                this.threadID = threadID;
                return this;
            }

            /**
             * The duration of the statement execution. Unit: microseconds.
             */
            public Builder totalExecutionTimes(Long totalExecutionTimes) {
                this.totalExecutionTimes = totalExecutionTimes;
                return this;
            }

            public SQLRecord build() {
                return new SQLRecord(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SQLRecord")
        private java.util.List < SQLRecord> SQLRecord;

        private Items(Builder builder) {
            this.SQLRecord = builder.SQLRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return SQLRecord
         */
        public java.util.List < SQLRecord> getSQLRecord() {
            return this.SQLRecord;
        }

        public static final class Builder {
            private java.util.List < SQLRecord> SQLRecord; 

            /**
             * SQLRecord.
             */
            public Builder SQLRecord(java.util.List < SQLRecord> SQLRecord) {
                this.SQLRecord = SQLRecord;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
