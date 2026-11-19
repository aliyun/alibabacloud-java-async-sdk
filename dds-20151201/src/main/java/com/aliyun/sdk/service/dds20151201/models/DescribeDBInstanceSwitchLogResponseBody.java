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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDBInstanceSwitchLogResponseBody model) {
            this.DBInstanceId = model.DBInstanceId;
            this.logItems = model.logItems;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

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
         * <p>The list of primary/secondary switchover logs.</p>
         */
        public Builder logItems(java.util.List<LogItems> logItems) {
            this.logItems = logItems;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ECBCA991-XXXX-XXXX-834C-B3E8007F33AA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of primary/secondary switchover records returned in the query.</p>
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

            private Builder() {
            } 

            private Builder(LogItems model) {
                this.nodeId = model.nodeId;
                this.switchCode = model.switchCode;
                this.switchStatus = model.switchStatus;
                this.switchTime = model.switchTime;
            } 

            /**
             * <p>Instance ID of the instance if the instance is a replica set instance, or instance ID of the switched node if the instance is a sharded cluster instance.</p>
             * 
             * <strong>example:</strong>
             * <p>If the instance is a replica set instance: dds-uf68f1b5a57exxxx.
             * If the instance is a sharded cluster instance: d-uf652b73f554xxxx</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The cause code of the switchover. Valid values:</p>
             * <ul>
             * <li>USER_CONSOLE_OPERATION: manual operation</li>
             * <li>OPERATION_AND_MAINTENANCE: potential risk</li>
             * <li>MACHINE_DOWNTIME: host offline</li>
             * <li>PRIMARY_UNHEALTHY: instance failures</li>
             * <li>SECONDARY_UNHEALTHY: instance failures</li>
             * <li>MULTIPLE_NODE_FAILURES: instance failures</li>
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
             * <p>The switchover status. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The switchover is successful.</li>
             * <li><strong>0</strong>: The switchover failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder switchStatus(String switchStatus) {
                this.switchStatus = switchStatus;
                return this;
            }

            /**
             * <p>The switchover time. The time is in the <i>yyyy-mm-dd</i>T<i>hh:mm:ss</i>Z format (UTC).</p>
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
