// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
    @NameInMap("Engine")
    private String engine;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("TotalRecordCount")
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
         * The database engine that the instance runs.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The slow query log entries.
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
         * The number of log entries returned on the current page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The maximum number of log entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The start time of the query.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The total number of returned log entries.
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
        @NameInMap("Account")
        private String account;

        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("Command")
        private String command;

        @NameInMap("DBName")
        private String DBName;

        @NameInMap("DataBaseName")
        private String dataBaseName;

        @NameInMap("ElapsedTime")
        private Long elapsedTime;

        @NameInMap("ExecuteTime")
        private String executeTime;

        @NameInMap("IPAddress")
        private String IPAddress;

        @NameInMap("NodeId")
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
             * The ID of the account.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * The username of the account.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The slow query statement.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * The database name.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * The database name. This parameter serves the same purpose as the **DBName** parameter. We recommend that you use the **DBName** parameter.
             */
            public Builder dataBaseName(String dataBaseName) {
                this.dataBaseName = dataBaseName;
                return this;
            }

            /**
             * The amount of time consumed to execute the slow query statement. Unit: microseconds.
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * The start time when the slow query statement was executed. The time is displayed in the YYYY-MM-DDTHH:mm:ssZ format.
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * The IP address of the client.
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * The node ID.
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
    public static class Items extends TeaModel {
        @NameInMap("LogRecords")
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
