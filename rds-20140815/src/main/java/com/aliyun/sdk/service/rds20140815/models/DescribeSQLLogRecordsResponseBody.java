// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLLogRecordsResponseBody</p>
 */
public class DescribeSQLLogRecordsResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescribeSQLLogRecordsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLLogRecordsResponseBody create() {
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
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Long totalRecordCount; 

        /**
         * An array that consists of the details about each SQL audit log entry.
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
         * The number of SQL audit log entries on the current page.
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
         * The total number of entries returned.
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeSQLLogRecordsResponseBody build() {
            return new DescribeSQLLogRecordsResponseBody(this);
        } 

    } 

    public static class SQLRecord extends TeaModel {
        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("DBName")
        private String DBName;

        @NameInMap("ExecuteTime")
        private String executeTime;

        @NameInMap("HostAddress")
        private String hostAddress;

        @NameInMap("ReturnRowCounts")
        private Long returnRowCounts;

        @NameInMap("SQLText")
        private String SQLText;

        @NameInMap("ThreadID")
        private String threadID;

        @NameInMap("TotalExecutionTimes")
        private Long totalExecutionTimes;

        private SQLRecord(Builder builder) {
            this.accountName = builder.accountName;
            this.DBName = builder.DBName;
            this.executeTime = builder.executeTime;
            this.hostAddress = builder.hostAddress;
            this.returnRowCounts = builder.returnRowCounts;
            this.SQLText = builder.SQLText;
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
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
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
            private String SQLText; 
            private String threadID; 
            private Long totalExecutionTimes; 

            /**
             * The username of the account that is recorded in the SQL audit log entry.
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
             * The time at which the SQL statement was executed. The time follows the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * The IP address of the client that is connected to the instance.
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
             * The SQL statement that is executed in the query.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
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
             * The execution duration of the SQL statement. Unit: microseconds.
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
        @NameInMap("SQLRecord")
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
