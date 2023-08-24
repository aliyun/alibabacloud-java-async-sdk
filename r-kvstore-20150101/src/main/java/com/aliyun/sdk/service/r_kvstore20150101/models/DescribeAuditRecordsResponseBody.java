// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditRecordsResponseBody</p>
 */
public class DescribeAuditRecordsResponseBody extends TeaModel {
    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("InstanceName")
    private String instanceName;

    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeAuditRecordsResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.instanceName = builder.instanceName;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
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
        private String endTime; 
        private String instanceName; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String startTime; 
        private Integer totalRecordCount; 

        /**
         * The end time of the query.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The name of the instance.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The collection of returned audit log entries.
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
         * The maximum number of entries returned per page.
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

    public static class SQL extends TeaModel {
        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("ExecuteTime")
        private String executeTime;

        @NameInMap("HostAddress")
        private String hostAddress;

        @NameInMap("IPAddress")
        private String IPAddress;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("SQLText")
        private String SQLText;

        @NameInMap("SQLType")
        private String SQLType;

        @NameInMap("TotalExecutionTimes")
        private String totalExecutionTimes;

        private SQL(Builder builder) {
            this.accountName = builder.accountName;
            this.databaseName = builder.databaseName;
            this.executeTime = builder.executeTime;
            this.hostAddress = builder.hostAddress;
            this.IPAddress = builder.IPAddress;
            this.nodeId = builder.nodeId;
            this.SQLText = builder.SQLText;
            this.SQLType = builder.SQLType;
            this.totalExecutionTimes = builder.totalExecutionTimes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQL create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
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

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        /**
         * @return SQLType
         */
        public String getSQLType() {
            return this.SQLType;
        }

        /**
         * @return totalExecutionTimes
         */
        public String getTotalExecutionTimes() {
            return this.totalExecutionTimes;
        }

        public static final class Builder {
            private String accountName; 
            private String databaseName; 
            private String executeTime; 
            private String hostAddress; 
            private String IPAddress; 
            private String nodeId; 
            private String SQLText; 
            private String SQLType; 
            private String totalExecutionTimes; 

            /**
             * The username of the account.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The database name.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The time when the command was run.
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * The IP address of the client.
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * The IP address of the instance.
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * The ID of the node.
             * <p>
             * 
             * > A specific node ID is returned only if the instance uses the cluster or read/write splitting architecture.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The command that was run.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * The type of the command.
             */
            public Builder SQLType(String SQLType) {
                this.SQLType = SQLType;
                return this;
            }

            /**
             * The amount of time consumed to run the command.
             */
            public Builder totalExecutionTimes(String totalExecutionTimes) {
                this.totalExecutionTimes = totalExecutionTimes;
                return this;
            }

            public SQL build() {
                return new SQL(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("SQL")
        private java.util.List < SQL> SQL;

        private Items(Builder builder) {
            this.SQL = builder.SQL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return SQL
         */
        public java.util.List < SQL> getSQL() {
            return this.SQL;
        }

        public static final class Builder {
            private java.util.List < SQL> SQL; 

            /**
             * SQL.
             */
            public Builder SQL(java.util.List < SQL> SQL) {
                this.SQL = SQL;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
