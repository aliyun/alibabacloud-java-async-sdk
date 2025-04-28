// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAuditLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditLogRecordsResponseBody</p>
 */
public class DescribeAuditLogRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAuditLogRecordsResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-t4nj8619bz2w3****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The queried SQL audit logs.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8A564B7F-8C00-43C0-8EC5-919FBB70573</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAuditLogRecordsResponseBody build() {
            return new DescribeAuditLogRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAuditLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAuditLogRecordsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.connId = model.connId;
                this.DBName = model.DBName;
                this.executeTime = model.executeTime;
                this.hostAddress = model.hostAddress;
                this.processID = model.processID;
                this.SQLText = model.SQLText;
                this.SQLType = model.SQLType;
                this.succeed = model.succeed;
                this.totalTime = model.totalTime;
                this.user = model.user;
            } 

            /**
             * <p>This parameter is unavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder connId(String connId) {
                this.connId = connId;
                return this;
            }

            /**
             * <p>The name of the database on which the SQL statement was executed.</p>
             * 
             * <strong>example:</strong>
             * <p>adb_test</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The start time of the execution of the SQL statement. The time is displayed in the ISO 8601 standard in the yyyy-MM-dd HH:mm:ss format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-23 16:05:08</p>
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * <p>The IP address and port number of the client that is used to execute the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>100.104.XX.XX:43908</p>
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>202106081752021720161662490345362390</p>
             */
            public Builder processID(String processID) {
                this.processID = processID;
                return this;
            }

            /**
             * <p>Details of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM tb_courses</p>
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * <p>The type of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT</p>
             */
            public Builder SQLType(String SQLType) {
                this.SQLType = SQLType;
                return this;
            }

            /**
             * <p>Indicates whether the SQL statement was successfully executed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder succeed(String succeed) {
                this.succeed = succeed;
                return this;
            }

            /**
             * <p>The amount of time that is consumed to execute the SQL statement. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>216</p>
             */
            public Builder totalTime(String totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            /**
             * <p>The name of the user who executed the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>test_user</p>
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
