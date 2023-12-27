// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceSwitchLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceSwitchLogResponseBody</p>
 */
public class DescribeDBInstanceSwitchLogResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("LogItems")
    private java.util.List < LogItems> logItems;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDBInstanceSwitchLogResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.logItems = builder.logItems;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceSwitchLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return logItems
     */
    public java.util.List < LogItems> getLogItems() {
        return this.logItems;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private java.util.List < LogItems> logItems; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The primary/secondary switchover logs.
         */
        public Builder logItems(java.util.List < LogItems> logItems) {
            this.logItems = logItems;
            return this;
        }

        /**
         * The page number returned.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder pageSize(Long pageSize) {
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
         * The number of primary/secondary switching entries.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDBInstanceSwitchLogResponseBody build() {
            return new DescribeDBInstanceSwitchLogResponseBody(this);
        } 

    } 

    public static class LogItems extends TeaModel {
        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("SwitchCode")
        private String switchCode;

        @NameInMap("SwitchStatus")
        private String switchStatus;

        @NameInMap("SwitchTime")
        private String switchTime;

        private LogItems(Builder builder) {
            this.nodeId = builder.nodeId;
            this.switchCode = builder.switchCode;
            this.switchStatus = builder.switchStatus;
            this.switchTime = builder.switchTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogItems create() {
            return builder().build();
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return switchCode
         */
        public String getSwitchCode() {
            return this.switchCode;
        }

        /**
         * @return switchStatus
         */
        public String getSwitchStatus() {
            return this.switchStatus;
        }

        /**
         * @return switchTime
         */
        public String getSwitchTime() {
            return this.switchTime;
        }

        public static final class Builder {
            private String nodeId; 
            private String switchCode; 
            private String switchStatus; 
            private String switchTime; 

            /**
             * The ID of the replica set instance or the ID of the node on which a primary/secondary switchover is performed.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The code that indicates the reason of a primary/secondary switchover. Valid values:
             * <p>
             * 
             * *   USER_CONSOLE_OPERATION: The switchover is manually performed.
             * *   OPERATION_AND_MAINTENANCE: Potential risks exist.
             * *   MACHINE_DOWNTIME: The host is offline.
             * *   PRIMARY_UNHEALTHY: An exception occurs on the primary node of the instance.
             * *   SECONDARY_UNHEALTHY: An exception occurs on the secondary node of the instance.
             * *   MULTIPLE_NODE_FAILURES: An exception occurs on multiple nodes of the instance.
             */
            public Builder switchCode(String switchCode) {
                this.switchCode = switchCode;
                return this;
            }

            /**
             * The switchover status. Valid values: **1** and **0**. The value 1 indicates a successful primary/secondary switchover and the value 0 indicates a failed primary/secondary switchover.
             */
            public Builder switchStatus(String switchStatus) {
                this.switchStatus = switchStatus;
                return this;
            }

            /**
             * The point in time when a primary/secondary switchover was performed. The time follows the ISO 8601 standard in the *yyyy-mm-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder switchTime(String switchTime) {
                this.switchTime = switchTime;
                return this;
            }

            public LogItems build() {
                return new LogItems(this);
            } 

        } 

    }
}
