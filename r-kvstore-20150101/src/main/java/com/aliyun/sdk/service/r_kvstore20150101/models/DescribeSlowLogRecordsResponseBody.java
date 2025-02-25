// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogRecordsResponseBody</p>
 */
public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeSlowLogRecordsResponseBody(Builder builder) {
        this.engine = builder.engine;
        this.instanceId = builder.instanceId;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String engine; 
        private String instanceId; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private Integer pageSize; 
        private String requestId; 
        private String startTime; 
        private Integer totalRecordCount; 

        /**
         * <p>The database engine that the instance runs.</p>
         * 
         * <strong>example:</strong>
         * <p>Redis</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp10n********</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The slow query log entries.</p>
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
         * <p>The number of log entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The maximum number of log entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>686BB8A6-BBA5-47E5-8A75-D2ADE433****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-10T13:11Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The total number of returned log entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeSlowLogRecordsResponseBody build() {
            return new DescribeSlowLogRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogRecordsResponseBody</p>
     */
    public static class LogRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("DataBaseName")
        private String dataBaseName;

        @com.aliyun.core.annotation.NameInMap("ElapsedTime")
        private Long elapsedTime;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private String executeTime;

        @com.aliyun.core.annotation.NameInMap("IPAddress")
        private String IPAddress;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private LogRecords(Builder builder) {
            this.account = builder.account;
            this.accountName = builder.accountName;
            this.command = builder.command;
            this.DBName = builder.DBName;
            this.dataBaseName = builder.dataBaseName;
            this.elapsedTime = builder.elapsedTime;
            this.executeTime = builder.executeTime;
            this.IPAddress = builder.IPAddress;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogRecords create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return dataBaseName
         */
        public String getDataBaseName() {
            return this.dataBaseName;
        }

        /**
         * @return elapsedTime
         */
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return executeTime
         */
        public String getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return IPAddress
         */
        public String getIPAddress() {
            return this.IPAddress;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private String account; 
            private String accountName; 
            private String command; 
            private String DBName; 
            private String dataBaseName; 
            private Long elapsedTime; 
            private String executeTime; 
            private String IPAddress; 
            private String nodeId; 

            /**
             * <p>The ID of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * <p>The username of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The slow query statement.</p>
             * 
             * <strong>example:</strong>
             * <p>KEYS *</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The database name. This parameter serves the same purpose as the <strong>DBName</strong> parameter. We recommend that you use the <strong>DBName</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder dataBaseName(String dataBaseName) {
                this.dataBaseName = dataBaseName;
                return this;
            }

            /**
             * <p>The amount of time consumed to execute the slow query statement. Unit: microseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>248</p>
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * <p>The start time when the slow query statement was executed. The time is displayed in the YYYY-MM-DDTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-03-20T09:18:41Z</p>
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * <p>The IP address of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.88.***</p>
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1zxszhcgatnx****-db-0</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public LogRecords build() {
                return new LogRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogRecordsResponseBody</p>
     */
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
