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
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
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
             * The details of the task.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The creation time. The time is displayed in UTC.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * The modification time. The time is displayed in UTC.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The synchronization information. This parameter is a reserved parameter.
             */
            public Builder replicationInfo(String replicationInfo) {
                this.replicationInfo = replicationInfo;
                return this;
            }

            /**
             * The status of the synchronization. Valid values:
             * <p>
             * 
             * *   **steaming**: The synchronization is in progress.
             * *   **finish**: The synchronization is complete.
             * *   **disconnect**: The synchronization is disconnected.
             */
            public Builder replicationState(String replicationState) {
                this.replicationState = replicationState;
                return this;
            }

            /**
             * The account of the database that is used for data synchronization.
             */
            public Builder replicatorAccount(String replicatorAccount) {
                this.replicatorAccount = replicatorAccount;
                return this;
            }

            /**
             * The password of the account.
             */
            public Builder replicatorPassword(String replicatorPassword) {
                this.replicatorPassword = replicatorPassword;
                return this;
            }

            /**
             * The endpoint of the source instance.
             */
            public Builder sourceAddress(String sourceAddress) {
                this.sourceAddress = sourceAddress;
                return this;
            }

            /**
             * The type of the source instance. Valid values:
             * <p>
             * 
             * *   other: other instances
             * *   aliyunRDS: an ApsaraDB RDS instance
             */
            public Builder sourceCategory(String sourceCategory) {
                this.sourceCategory = sourceCategory;
                return this;
            }

            /**
             * The port number of the source instance.
             */
            public Builder sourcePort(Long sourcePort) {
                this.sourcePort = sourcePort;
                return this;
            }

            /**
             * The destination instance ID.
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * The ID of the task.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The name of the task.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * The stage of the task. Valid values:
             * <p>
             * 
             * *   **precheck**: the precheck stage.
             * *   **basebackup**: the basic backup stage.
             * *   **startup**: the startup stage.
             * *   **increment**: the incremental synchronization stage.
             */
            public Builder taskStage(String taskStage) {
                this.taskStage = taskStage;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **success**
             * *   **failure**
             * *   **running**
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * The type of the task. Valid values:
             * <p>
             * 
             * *   **create**: creates a synchronization link.
             * *   **create-dryrun**: performs a precheck before a synchronization link is created.
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
