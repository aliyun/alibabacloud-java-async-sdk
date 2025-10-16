// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeAclChecksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAclChecksResponseBody</p>
 */
public class DescribeAclChecksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckRecords")
    private CheckRecords checkRecords;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAclChecksResponseBody(Builder builder) {
        this.checkRecords = builder.checkRecords;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAclChecksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkRecords
     */
    public CheckRecords getCheckRecords() {
        return this.checkRecords;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CheckRecords checkRecords; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAclChecksResponseBody model) {
            this.checkRecords = model.checkRecords;
            this.requestId = model.requestId;
        } 

        /**
         * CheckRecords.
         */
        public Builder checkRecords(CheckRecords checkRecords) {
            this.checkRecords = checkRecords;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAclChecksResponseBody build() {
            return new DescribeAclChecksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAclChecksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAclChecksResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclPendingCount")
        private Long aclPendingCount;

        @com.aliyun.core.annotation.NameInMap("AclTotalCount")
        private Long aclTotalCount;

        @com.aliyun.core.annotation.NameInMap("CheckName")
        private String checkName;

        @com.aliyun.core.annotation.NameInMap("CheckStatus")
        private String checkStatus;

        @com.aliyun.core.annotation.NameInMap("CheckType")
        private String checkType;

        @com.aliyun.core.annotation.NameInMap("LastCheckTime")
        private String lastCheckTime;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Records(Builder builder) {
            this.aclPendingCount = builder.aclPendingCount;
            this.aclTotalCount = builder.aclTotalCount;
            this.checkName = builder.checkName;
            this.checkStatus = builder.checkStatus;
            this.checkType = builder.checkType;
            this.lastCheckTime = builder.lastCheckTime;
            this.level = builder.level;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return aclPendingCount
         */
        public Long getAclPendingCount() {
            return this.aclPendingCount;
        }

        /**
         * @return aclTotalCount
         */
        public Long getAclTotalCount() {
            return this.aclTotalCount;
        }

        /**
         * @return checkName
         */
        public String getCheckName() {
            return this.checkName;
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return checkType
         */
        public String getCheckType() {
            return this.checkType;
        }

        /**
         * @return lastCheckTime
         */
        public String getLastCheckTime() {
            return this.lastCheckTime;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long aclPendingCount; 
            private Long aclTotalCount; 
            private String checkName; 
            private String checkStatus; 
            private String checkType; 
            private String lastCheckTime; 
            private String level; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.aclPendingCount = model.aclPendingCount;
                this.aclTotalCount = model.aclTotalCount;
                this.checkName = model.checkName;
                this.checkStatus = model.checkStatus;
                this.checkType = model.checkType;
                this.lastCheckTime = model.lastCheckTime;
                this.level = model.level;
                this.taskId = model.taskId;
            } 

            /**
             * AclPendingCount.
             */
            public Builder aclPendingCount(Long aclPendingCount) {
                this.aclPendingCount = aclPendingCount;
                return this;
            }

            /**
             * AclTotalCount.
             */
            public Builder aclTotalCount(Long aclTotalCount) {
                this.aclTotalCount = aclTotalCount;
                return this;
            }

            /**
             * CheckName.
             */
            public Builder checkName(String checkName) {
                this.checkName = checkName;
                return this;
            }

            /**
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * CheckType.
             */
            public Builder checkType(String checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * LastCheckTime.
             */
            public Builder lastCheckTime(String lastCheckTime) {
                this.lastCheckTime = lastCheckTime;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAclChecksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAclChecksResponseBody</p>
     */
    public static class CheckRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclType")
        private String aclType;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        private CheckRecords(Builder builder) {
            this.aclType = builder.aclType;
            this.records = builder.records;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckRecords create() {
            return builder().build();
        }

        /**
         * @return aclType
         */
        public String getAclType() {
            return this.aclType;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        public static final class Builder {
            private String aclType; 
            private java.util.List<Records> records; 

            private Builder() {
            } 

            private Builder(CheckRecords model) {
                this.aclType = model.aclType;
                this.records = model.records;
            } 

            /**
             * AclType.
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            public CheckRecords build() {
                return new CheckRecords(this);
            } 

        } 

    }
}
