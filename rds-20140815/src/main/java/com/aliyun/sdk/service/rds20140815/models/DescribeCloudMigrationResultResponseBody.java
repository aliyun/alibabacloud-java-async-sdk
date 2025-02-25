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
 * {@link DescribeCloudMigrationResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudMigrationResultResponseBody</p>
 */
public class DescribeCloudMigrationResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalSize")
    private Integer totalSize;

    private DescribeCloudMigrationResultResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudMigrationResultResponseBody create() {
        return builder().build();
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
     * @return totalSize
     */
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Integer totalSize; 

        /**
         * <p>The details about the cloud migration task.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1B983C48-9793-5EAA-8F7F-00EAEC517675</p>
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

        public DescribeCloudMigrationResultResponseBody build() {
            return new DescribeCloudMigrationResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudMigrationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudMigrationResultResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("MigrateStage")
        private String migrateStage;

        @com.aliyun.core.annotation.NameInMap("ReplicationInfo")
        private String replicationInfo;

        @com.aliyun.core.annotation.NameInMap("ReplicationState")
        private String replicationState;

        @com.aliyun.core.annotation.NameInMap("SourceAccount")
        private String sourceAccount;

        @com.aliyun.core.annotation.NameInMap("SourceCategory")
        private String sourceCategory;

        @com.aliyun.core.annotation.NameInMap("SourceIpAddress")
        private String sourceIpAddress;

        @com.aliyun.core.annotation.NameInMap("SourcePassword")
        private String sourcePassword;

        @com.aliyun.core.annotation.NameInMap("SourcePort")
        private Long sourcePort;

        @com.aliyun.core.annotation.NameInMap("SwitchTime")
        private String switchTime;

        @com.aliyun.core.annotation.NameInMap("TargetEip")
        private String targetEip;

        @com.aliyun.core.annotation.NameInMap("TargetInstanceName")
        private String targetInstanceName;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        private Items(Builder builder) {
            this.detail = builder.detail;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.migrateStage = builder.migrateStage;
            this.replicationInfo = builder.replicationInfo;
            this.replicationState = builder.replicationState;
            this.sourceAccount = builder.sourceAccount;
            this.sourceCategory = builder.sourceCategory;
            this.sourceIpAddress = builder.sourceIpAddress;
            this.sourcePassword = builder.sourcePassword;
            this.sourcePort = builder.sourcePort;
            this.switchTime = builder.switchTime;
            this.targetEip = builder.targetEip;
            this.targetInstanceName = builder.targetInstanceName;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
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
         * @return migrateStage
         */
        public String getMigrateStage() {
            return this.migrateStage;
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
         * @return sourceAccount
         */
        public String getSourceAccount() {
            return this.sourceAccount;
        }

        /**
         * @return sourceCategory
         */
        public String getSourceCategory() {
            return this.sourceCategory;
        }

        /**
         * @return sourceIpAddress
         */
        public String getSourceIpAddress() {
            return this.sourceIpAddress;
        }

        /**
         * @return sourcePassword
         */
        public String getSourcePassword() {
            return this.sourcePassword;
        }

        /**
         * @return sourcePort
         */
        public Long getSourcePort() {
            return this.sourcePort;
        }

        /**
         * @return switchTime
         */
        public String getSwitchTime() {
            return this.switchTime;
        }

        /**
         * @return targetEip
         */
        public String getTargetEip() {
            return this.targetEip;
        }

        /**
         * @return targetInstanceName
         */
        public String getTargetInstanceName() {
            return this.targetInstanceName;
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

        public static final class Builder {
            private String detail; 
            private String gmtCreated; 
            private String gmtModified; 
            private String migrateStage; 
            private String replicationInfo; 
            private String replicationState; 
            private String sourceAccount; 
            private String sourceCategory; 
            private String sourceIpAddress; 
            private String sourcePassword; 
            private Long sourcePort; 
            private String switchTime; 
            private String targetEip; 
            private String targetInstanceName; 
            private Long taskId; 
            private String taskName; 

            /**
             * <p>The details about the migration task.</p>
             * 
             * <strong>example:</strong>
             * <p>[Check rds empty]\nCheck rds databases: success\n[Check source connectivity]\nCheck ip connectable: success\nCheck port connectable: success\nCheck database connectable: success\nCheck account replication privilege: success\nCheck account createrole privilege: success\nCheck account monitor privilege: success\n[Check source version]\nCheck major version consistent: success\n[Check source glibc version]\nCheck source glibc version compatible: warning(warning:source glibc version is not compatible with rds pg)\n[Check disk size]\nCheck disk size enough: success\n[Check wal keep size]\nCheck wal keep size large enough: success\n[Check spec params]\nCheck if spec params too large: success\n[Start RDS instance]\n2022-02-25 17:00:29 --- Start RDS instance as slave for data replication\n[Synchronize data]\n2022-02-25 17:01:05 --- Synchronize data from source to RDS by streaming replication \n</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-25T08:53:13Z</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The time when the task was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-01T06:39:51Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The migration phase of the migration task.</p>
             * <ul>
             * <li><strong>precheck</strong>: precheck</li>
             * <li><strong>basebackup</strong>: full data backup</li>
             * <li><strong>startup</strong>: link establishment</li>
             * <li><strong>increment</strong>: incremental data synchronization</li>
             * <li><strong>switch</strong>: cloud migration-triggered switchover</li>
             * <li><strong>success</strong>: cloud migration completed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>switch</p>
             */
            public Builder migrateStage(String migrateStage) {
                this.migrateStage = migrateStage;
                return this;
            }

            /**
             * <p>The information about the replication link.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Status&quot;:&quot;streaming&quot;,&quot;ReceiveStartLsn&quot;:&quot;0/3000000&quot;,&quot;ReceivedTli&quot;:&quot;1&quot;,&quot;LatestEndTime&quot;:&quot;2022-02-25 17:03:59.3344+08&quot;,&quot;Synced&quot;:&quot;true&quot;,&quot;IsSlave&quot;:&quot;true&quot;,&quot;ReplayTimestamp&quot;:&quot;null&quot;,&quot;LastMsgSendTime&quot;:&quot;2022-03-01 14:42:57.967537+08&quot;,&quot;Conninfo&quot;:&quot;user=migratetest password=******** channel_binding=prefer dbname=replication host=172.16.254.203 port=5432 application_name=rds_db_instance fallback_application_name=walreceiver sslmode=prefer sslcompression=1 sslsni=1 ssl_min_protocol_version=TLSv1.2 gssencmode=prefer krbsrvname=postgres target_session_attrs=any&quot;,&quot;LastMsgReceiptTime&quot;:&quot;2022-03-01 14:42:57.96727+08&quot;,&quot;LatestEndLsn&quot;:&quot;0/3000148&quot;,&quot;ReceivedLsn&quot;:&quot;0/3000148&quot;,&quot;ReplayLsn&quot;:&quot;0/3000148&quot;,&quot;ReceiveStartTli&quot;:&quot;1&quot;,&quot;ReplayLag&quot;:&quot;0&quot;}</p>
             */
            public Builder replicationInfo(String replicationInfo) {
                this.replicationInfo = replicationInfo;
                return this;
            }

            /**
             * <p>The status of data replication.</p>
             * <ul>
             * <li><strong>unstarted</strong></li>
             * <li><strong>catchup</strong></li>
             * <li><strong>streaming</strong></li>
             * <li><strong>disconnect</strong></li>
             * <li><strong>finish</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>streaming</p>
             */
            public Builder replicationState(String replicationState) {
                this.replicationState = replicationState;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>migratetest</p>
             */
            public Builder sourceAccount(String sourceAccount) {
                this.sourceAccount = sourceAccount;
                return this;
            }

            /**
             * <p>The environment in which the self-managed PostgreSQL instance runs.</p>
             * <ul>
             * <li><strong>idcOnVpc</strong>: The self-managed PostgreSQL instance resides in a data center. The data center can communicate with the VPC to which the ApsaraDB RDS for PostgreSQL instance belongs.</li>
             * <li><strong>ecsOnVpc</strong>: The self-managed PostgreSQL instance resides on an ECS instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ecsonvpc</p>
             */
            public Builder sourceCategory(String sourceCategory) {
                this.sourceCategory = sourceCategory;
                return this;
            }

            /**
             * <p>The private IP address that is used to connect to the self-managed PostgreSQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder sourceIpAddress(String sourceIpAddress) {
                this.sourceIpAddress = sourceIpAddress;
                return this;
            }

            /**
             * <p>The password.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder sourcePassword(String sourcePassword) {
                this.sourcePassword = sourcePassword;
                return this;
            }

            /**
             * <p>The port number that is used to connect to the self-managed PostgreSQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5432</p>
             */
            public Builder sourcePort(Long sourcePort) {
                this.sourcePort = sourcePort;
                return this;
            }

            /**
             * <p>The time when the switchover was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-01T06:40:51Z</p>
             */
            public Builder switchTime(String switchTime) {
                this.switchTime = switchTime;
                return this;
            }

            /**
             * <p>A reserved parameter. The return value of this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder targetEip(String targetEip) {
                this.targetEip = targetEip;
                return this;
            }

            /**
             * <p>The ID of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pgm-bp102g323jd4****</p>
             */
            public Builder targetInstanceName(String targetInstanceName) {
                this.targetInstanceName = targetInstanceName;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>440437220</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>362c6c7a-4d20-4eac-898c-1495ceab374c</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
