// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditLogRecordsResponseBody</p>
 */
public class DescribeAuditLogRecordsResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("ConnId")
        private String connId;

        @NameInMap("DBName")
        private String DBName;

        @NameInMap("ExecuteTime")
        private String executeTime;

        @NameInMap("HostAddress")
        private String hostAddress;

        @NameInMap("ProcessID")
        private String processID;

        @NameInMap("SQLText")
        private String SQLText;

        @NameInMap("SQLType")
        private String SQLType;

        @NameInMap("Succeed")
        private String succeed;

        @NameInMap("TotalTime")
        private String totalTime;

        @NameInMap("User")
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
             * ConnId.
             */
            public Builder connId(String connId) {
                this.connId = connId;
                return this;
            }

            /**
             * DBName.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * ExecuteTime.
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * HostAddress.
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * ProcessID.
             */
            public Builder processID(String processID) {
                this.processID = processID;
                return this;
            }

            /**
             * SQLText.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * SQLType.
             */
            public Builder SQLType(String SQLType) {
                this.SQLType = SQLType;
                return this;
            }

            /**
             * Succeed.
             */
            public Builder succeed(String succeed) {
                this.succeed = succeed;
                return this;
            }

            /**
             * TotalTime.
             */
            public Builder totalTime(String totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            /**
             * User.
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
