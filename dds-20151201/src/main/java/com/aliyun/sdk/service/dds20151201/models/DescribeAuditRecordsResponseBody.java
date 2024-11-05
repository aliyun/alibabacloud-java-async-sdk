// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>An array that consists of the information of audit log entries.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The maximum number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3278BEB8-503B-4E46-8F7E-D26E040C9769</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeAuditRecordsResponseBody build() {
            return new DescribeAuditRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAuditRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAuditRecordsResponseBody</p>
     */
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
             * <p>The account of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test123</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The time when the statement was executed. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-03-11T03:30:27Z</p>
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * <p>The IP addresses of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>11.xxx.xxx.xxx</p>
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * <p>The number of SQL audit log entries that are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder returnRowCounts(Long returnRowCounts) {
                this.returnRowCounts = returnRowCounts;
                return this;
            }

            /**
             * <p>The statement that was executed.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;atype&quot; : &quot;createCollection&quot;, &quot;param&quot; : { &quot;ns&quot; : &quot;123.test1&quot; }, &quot;result&quot;: &quot;OK&quot; }</p>
             */
            public Builder syntax(String syntax) {
                this.syntax = syntax;
                return this;
            }

            /**
             * <p>The name of the collection.</p>
             * 
             * <strong>example:</strong>
             * <p>C1</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The ID of the thread.</p>
             * 
             * <strong>example:</strong>
             * <p>140682188297984</p>
             */
            public Builder threadID(String threadID) {
                this.threadID = threadID;
                return this;
            }

            /**
             * <p>The duration of the statement execution. Unit: microseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>700</p>
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
    /**
     * 
     * {@link DescribeAuditRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAuditRecordsResponseBody</p>
     */
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
