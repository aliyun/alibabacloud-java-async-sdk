// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditLogRecordsResponseBody</p>
 */
public class DescribeAuditLogRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeAuditLogRecordsResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditLogRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String DBClusterId; 
        private java.util.List < Items> items; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The queried SQL audit logs.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
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
         * The total number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAuditLogRecordsResponseBody build() {
            return new DescribeAuditLogRecordsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnId")
        private String connId;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private String executeTime;

        @com.aliyun.core.annotation.NameInMap("HostAddress")
        private String hostAddress;

        @com.aliyun.core.annotation.NameInMap("ProcessID")
        private String processID;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        @com.aliyun.core.annotation.NameInMap("SQLType")
        private String SQLType;

        @com.aliyun.core.annotation.NameInMap("Succeed")
        private String succeed;

        @com.aliyun.core.annotation.NameInMap("TotalTime")
        private String totalTime;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private Items(Builder builder) {
            this.connId = builder.connId;
            this.DBName = builder.DBName;
            this.executeTime = builder.executeTime;
            this.hostAddress = builder.hostAddress;
            this.processID = builder.processID;
            this.SQLText = builder.SQLText;
            this.SQLType = builder.SQLType;
            this.succeed = builder.succeed;
            this.totalTime = builder.totalTime;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return connId
         */
        public String getConnId() {
            return this.connId;
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
         * @return processID
         */
        public String getProcessID() {
            return this.processID;
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
         * @return succeed
         */
        public String getSucceed() {
            return this.succeed;
        }

        /**
         * @return totalTime
         */
        public String getTotalTime() {
            return this.totalTime;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String connId; 
            private String DBName; 
            private String executeTime; 
            private String hostAddress; 
            private String processID; 
            private String SQLText; 
            private String SQLType; 
            private String succeed; 
            private String totalTime; 
            private String user; 

            /**
             * The connection ID.
             */
            public Builder connId(String connId) {
                this.connId = connId;
                return this;
            }

            /**
             * The name of the database on which the SQL statement was executed.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * The start time of the execution of the SQL statement. The time is displayed in the ISO 8601 standard in the yyyy-MM-dd HH:mm:ss format. The time must be in UTC.
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * The IP address and port number of the client that is used to execute the SQL statement.
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder processID(String processID) {
                this.processID = processID;
                return this;
            }

            /**
             * The SQL statement.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * The type of the SQL statement.
             */
            public Builder SQLType(String SQLType) {
                this.SQLType = SQLType;
                return this;
            }

            /**
             * Indicates whether the SQL statement was successfully executed. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder succeed(String succeed) {
                this.succeed = succeed;
                return this;
            }

            /**
             * The amount of time that is consumed to execute the SQL statement. Unit: milliseconds.
             */
            public Builder totalTime(String totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            /**
             * The username that is used to execute the SQL statement.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
