// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReplicationLinkLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReplicationLinkLogsResponseBody</p>
 */
public class DescribeReplicationLinkLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalSize")
    private Integer totalSize;

    private DescribeReplicationLinkLogsResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.items = builder.items;
        this.requestId = builder.requestId;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReplicationLinkLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalSize
     */
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private java.util.List < Items> items; 
        private String requestId; 
        private Integer totalSize; 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalSize.
         */
        public Builder totalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public DescribeReplicationLinkLogsResponseBody build() {
            return new DescribeReplicationLinkLogsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ReplicationInfo")
        private String replicationInfo;

        @com.aliyun.core.annotation.NameInMap("ReplicationState")
        private String replicationState;

        @com.aliyun.core.annotation.NameInMap("ReplicatorAccount")
        private String replicatorAccount;

        @com.aliyun.core.annotation.NameInMap("ReplicatorPassword")
        private String replicatorPassword;

        @com.aliyun.core.annotation.NameInMap("SourceAddress")
        private String sourceAddress;

        @com.aliyun.core.annotation.NameInMap("SourceCategory")
        private String sourceCategory;

        @com.aliyun.core.annotation.NameInMap("SourcePort")
        private Long sourcePort;

        @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
        private String targetInstanceId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskStage")
        private String taskStage;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private Items(Builder builder) {
            this.detail = builder.detail;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.replicationInfo = builder.replicationInfo;
            this.replicationState = builder.replicationState;
            this.replicatorAccount = builder.replicatorAccount;
            this.replicatorPassword = builder.replicatorPassword;
            this.sourceAddress = builder.sourceAddress;
            this.sourceCategory = builder.sourceCategory;
            this.sourcePort = builder.sourcePort;
            this.targetInstanceId = builder.targetInstanceId;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskStage = builder.taskStage;
            this.taskStatus = builder.taskStatus;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return replicationInfo
         */
        public String getReplicationInfo() {
            return this.replicationInfo;
        }

        /**
         * @return replicationState
         */
        public String getReplicationState() {
            return this.replicationState;
        }

        /**
         * @return replicatorAccount
         */
        public String getReplicatorAccount() {
            return this.replicatorAccount;
        }

        /**
         * @return replicatorPassword
         */
        public String getReplicatorPassword() {
            return this.replicatorPassword;
        }

        /**
         * @return sourceAddress
         */
        public String getSourceAddress() {
            return this.sourceAddress;
        }

        /**
         * @return sourceCategory
         */
        public String getSourceCategory() {
            return this.sourceCategory;
        }

        /**
         * @return sourcePort
         */
        public Long getSourcePort() {
            return this.sourcePort;
        }

        /**
         * @return targetInstanceId
         */
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskStage
         */
        public String getTaskStage() {
            return this.taskStage;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String detail; 
            private String gmtCreated; 
            private String gmtModified; 
            private String replicationInfo; 
            private String replicationState; 
            private String replicatorAccount; 
            private String replicatorPassword; 
            private String sourceAddress; 
            private String sourceCategory; 
            private Long sourcePort; 
            private String targetInstanceId; 
            private Long taskId; 
            private String taskName; 
            private String taskStage; 
            private String taskStatus; 
            private String taskType; 

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * ReplicationInfo.
             */
            public Builder replicationInfo(String replicationInfo) {
                this.replicationInfo = replicationInfo;
                return this;
            }

            /**
             * ReplicationState.
             */
            public Builder replicationState(String replicationState) {
                this.replicationState = replicationState;
                return this;
            }

            /**
             * ReplicatorAccount.
             */
            public Builder replicatorAccount(String replicatorAccount) {
                this.replicatorAccount = replicatorAccount;
                return this;
            }

            /**
             * ReplicatorPassword.
             */
            public Builder replicatorPassword(String replicatorPassword) {
                this.replicatorPassword = replicatorPassword;
                return this;
            }

            /**
             * SourceAddress.
             */
            public Builder sourceAddress(String sourceAddress) {
                this.sourceAddress = sourceAddress;
                return this;
            }

            /**
             * SourceCategory.
             */
            public Builder sourceCategory(String sourceCategory) {
                this.sourceCategory = sourceCategory;
                return this;
            }

            /**
             * SourcePort.
             */
            public Builder sourcePort(Long sourcePort) {
                this.sourcePort = sourcePort;
                return this;
            }

            /**
             * TargetInstanceId.
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * TaskStage.
             */
            public Builder taskStage(String taskStage) {
                this.taskStage = taskStage;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
