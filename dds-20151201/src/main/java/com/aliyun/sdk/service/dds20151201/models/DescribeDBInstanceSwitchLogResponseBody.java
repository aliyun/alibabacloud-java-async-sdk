// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeDBInstanceSwitchLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceSwitchLogResponseBody</p>
 */
public class DescribeDBInstanceSwitchLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("LogItems")
    private java.util.List<LogItems> logItems;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<LogItems> getLogItems() {
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
        private java.util.List<LogItems> logItems; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-uf68f1b5a57exxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The primary/secondary switchover logs.</p>
         */
        public Builder logItems(java.util.List<LogItems> logItems) {
            this.logItems = logItems;
            return this;
        }

        /**
         * <p>The page number returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ECBCA991-XXXX-XXXX-834C-B3E8007F33AA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of primary/secondary switching entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDBInstanceSwitchLogResponseBody build() {
            return new DescribeDBInstanceSwitchLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceSwitchLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceSwitchLogResponseBody</p>
     */
    public static class LogItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("SwitchCode")
        private String switchCode;

        @com.aliyun.core.annotation.NameInMap("SwitchStatus")
        private String switchStatus;

        @com.aliyun.core.annotation.NameInMap("SwitchTime")
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
             * <p>The ID of the replica set instance or the ID of the node on which a primary/secondary switchover is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>dds-uf68f1b5a57exxxx</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The code that indicates the reason of a primary/secondary switchover. Valid values:</p>
             * <ul>
             * <li>USER_CONSOLE_OPERATION: The switchover is manually performed.</li>
             * <li>OPERATION_AND_MAINTENANCE: Potential risks exist.</li>
             * <li>MACHINE_DOWNTIME: The host is offline.</li>
             * <li>PRIMARY_UNHEALTHY: An exception occurs on the primary node of the instance.</li>
             * <li>SECONDARY_UNHEALTHY: An exception occurs on the secondary node of the instance.</li>
             * <li>MULTIPLE_NODE_FAILURES: An exception occurs on multiple nodes of the instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>USER_CONSOLE_OPERATION</p>
             */
            public Builder switchCode(String switchCode) {
                this.switchCode = switchCode;
                return this;
            }

            /**
             * <p>The switchover status. Valid values: <strong>1</strong> and <strong>0</strong>. The value 1 indicates a successful primary/secondary switchover and the value 0 indicates a failed primary/secondary switchover.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder switchStatus(String switchStatus) {
                this.switchStatus = switchStatus;
                return this;
            }

            /**
             * <p>The point in time when a primary/secondary switchover was performed. The time follows the ISO 8601 standard in the <em>yyyy-mm-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-07T18:00:00Z</p>
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
