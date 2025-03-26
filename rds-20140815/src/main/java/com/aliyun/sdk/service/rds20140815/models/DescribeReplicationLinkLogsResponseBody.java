// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeReplicationLinkLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReplicationLinkLogsResponseBody</p>
 */
public class DescribeReplicationLinkLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

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
     * @return items
     */
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private String requestId; 
        private Integer totalSize; 

        private Builder() {
        } 

        private Builder(DescribeReplicationLinkLogsResponseBody model) {
            this.DBInstanceId = model.DBInstanceId;
            this.items = model.items;
            this.requestId = model.requestId;
            this.totalSize = model.totalSize;
        } 

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp1trqb4p1xd****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The items.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16C62438-491B-5C02-9B49-BA924A1372A2</p>
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
        public Builder totalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public DescribeReplicationLinkLogsResponseBody build() {
            return new DescribeReplicationLinkLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeReplicationLinkLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicationLinkLogsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.detail = model.detail;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.replicationInfo = model.replicationInfo;
                this.replicationState = model.replicationState;
                this.replicatorAccount = model.replicatorAccount;
                this.replicatorPassword = model.replicatorPassword;
                this.sourceAddress = model.sourceAddress;
                this.sourceCategory = model.sourceCategory;
                this.sourcePort = model.sourcePort;
                this.targetInstanceId = model.targetInstanceId;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.taskStage = model.taskStage;
                this.taskStatus = model.taskStatus;
                this.taskType = model.taskType;
            } 

            /**
             * <p>The details of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>[Check rds empty]\nCheck rds databases: success\n[Check source connectivity]\nCheck ip connectable: success\nCheck port connectable: success\nCheck database connectable: success\nCheck account replication privilege: success\nCheck account createrole privilege: success\nCheck account monitor privilege: success\n[Check source version]\nCheck major version consistent: success\n[Check source glibc version]\nCheck source glibc version compatible: warning(warning:source glibc version is not compatible with rds pg)\n[Check disk size]\nCheck disk size enough: success\n[Check wal keep size]\nCheck wal keep size large enough: success\n[Check spec params]\nCheck if spec params too large: success\n [Check triggers]\nCheck triggers compatible: success\n[Check user functions]\nCheck user functions compatible: success\n<em>Migrate check success</em></p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The creation time. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-25T06:57:41Z</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The modification time. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-01T06:39:51Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The synchronization information. This parameter is a reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder replicationInfo(String replicationInfo) {
                this.replicationInfo = replicationInfo;
                return this;
            }

            /**
             * <p>The status of the synchronization. Valid values:</p>
             * <ul>
             * <li><strong>steaming</strong>: The synchronization is in progress.</li>
             * <li><strong>finish</strong>: The synchronization is complete.</li>
             * <li><strong>disconnect</strong>: The synchronization is disconnected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>finish</p>
             */
            public Builder replicationState(String replicationState) {
                this.replicationState = replicationState;
                return this;
            }

            /**
             * <p>The account of the database that is used for data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>testdbuser</p>
             */
            public Builder replicatorAccount(String replicatorAccount) {
                this.replicatorAccount = replicatorAccount;
                return this;
            }

            /**
             * <p>The password of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>testpassword</p>
             */
            public Builder replicatorPassword(String replicatorPassword) {
                this.replicatorPassword = replicatorPassword;
                return this;
            }

            /**
             * <p>The endpoint of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pgm-****.pg.rds.aliyuncs.com</p>
             */
            public Builder sourceAddress(String sourceAddress) {
                this.sourceAddress = sourceAddress;
                return this;
            }

            /**
             * <p>The type of the source instance. Valid values:</p>
             * <ul>
             * <li>other: other instances</li>
             * <li>aliyunRDS: an ApsaraDB RDS instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>aliyunRDS</p>
             */
            public Builder sourceCategory(String sourceCategory) {
                this.sourceCategory = sourceCategory;
                return this;
            }

            /**
             * <p>The port number of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5432</p>
             */
            public Builder sourcePort(Long sourcePort) {
                this.sourcePort = sourcePort;
                return this;
            }

            /**
             * <p>The destination instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pgm-bp1l4dutw453****</p>
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>8413252</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>test01</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The stage of the task. Valid values:</p>
             * <ul>
             * <li><strong>precheck</strong>: the precheck stage.</li>
             * <li><strong>basebackup</strong>: the basic backup stage.</li>
             * <li><strong>startup</strong>: the startup stage.</li>
             * <li><strong>increment</strong>: the incremental synchronization stage.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>increment</p>
             */
            public Builder taskStage(String taskStage) {
                this.taskStage = taskStage;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>success</strong></li>
             * <li><strong>failure</strong></li>
             * <li><strong>running</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The type of the task. Valid values:</p>
             * <ul>
             * <li><strong>create</strong>: creates a synchronization link.</li>
             * <li><strong>create-dryrun</strong>: performs a precheck before a synchronization link is created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>create</p>
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
