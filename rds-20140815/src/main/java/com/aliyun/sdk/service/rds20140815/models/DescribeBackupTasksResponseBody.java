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
 * {@link DescribeBackupTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupTasksResponseBody</p>
 */
public class DescribeBackupTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBackupTasksResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Items items; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeBackupTasksResponseBody model) {
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The backup tasks.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>90496720-2319-42A8-87CD-FCE4DF95EBED</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupTasksResponseBody build() {
            return new DescribeBackupTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupTasksResponseBody</p>
     */
    public static class BackupJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("BackupJobId")
        private String backupJobId;

        @com.aliyun.core.annotation.NameInMap("BackupProgressStatus")
        private String backupProgressStatus;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("JobMode")
        private String jobMode;

        @com.aliyun.core.annotation.NameInMap("Process")
        private String process;

        @com.aliyun.core.annotation.NameInMap("TaskAction")
        private String taskAction;

        private BackupJob(Builder builder) {
            this.backupId = builder.backupId;
            this.backupJobId = builder.backupJobId;
            this.backupProgressStatus = builder.backupProgressStatus;
            this.backupStatus = builder.backupStatus;
            this.jobMode = builder.jobMode;
            this.process = builder.process;
            this.taskAction = builder.taskAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupJob create() {
            return builder().build();
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return backupJobId
         */
        public String getBackupJobId() {
            return this.backupJobId;
        }

        /**
         * @return backupProgressStatus
         */
        public String getBackupProgressStatus() {
            return this.backupProgressStatus;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
        }

        /**
         * @return jobMode
         */
        public String getJobMode() {
            return this.jobMode;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        /**
         * @return taskAction
         */
        public String getTaskAction() {
            return this.taskAction;
        }

        public static final class Builder {
            private String backupId; 
            private String backupJobId; 
            private String backupProgressStatus; 
            private String backupStatus; 
            private String jobMode; 
            private String process; 
            private String taskAction; 

            private Builder() {
            } 

            private Builder(BackupJob model) {
                this.backupId = model.backupId;
                this.backupJobId = model.backupJobId;
                this.backupProgressStatus = model.backupProgressStatus;
                this.backupStatus = model.backupStatus;
                this.jobMode = model.jobMode;
                this.process = model.process;
                this.taskAction = model.taskAction;
            } 

            /**
             * <p>The ID of the backup set that is generated by the backup task.</p>
             * <blockquote>
             * <p> If the value of the <strong>BackupStatus</strong> parameter is <strong>Finished</strong>, you can view the backup set ID only if you configure the <strong>BackupJobId</strong> parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>346650271</p>
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * <p>The ID of the backup task.</p>
             * 
             * <strong>example:</strong>
             * <p>4762614</p>
             */
            public Builder backupJobId(String backupJobId) {
                this.backupJobId = backupJobId;
                return this;
            }

            /**
             * <p>The status of the backup program. Valid values:</p>
             * <ul>
             * <li><strong>NoStart</strong></li>
             * <li><strong>Preparing</strong></li>
             * <li><strong>Waiting</strong></li>
             * <li><strong>Uploading</strong></li>
             * <li><strong>Checking</strong></li>
             * <li><strong>Finished</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoStart</p>
             */
            public Builder backupProgressStatus(String backupProgressStatus) {
                this.backupProgressStatus = backupProgressStatus;
                return this;
            }

            /**
             * <p>The status of the backup task. Valid values:</p>
             * <ul>
             * <li><strong>NoStart</strong></li>
             * <li><strong>Checking</strong></li>
             * <li><strong>Preparing</strong></li>
             * <li><strong>Waiting</strong></li>
             * <li><strong>Uploading</strong></li>
             * <li><strong>Finished</strong></li>
             * <li><strong>Failed</strong></li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only after a backup task is run.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>NoStart</p>
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * <p>The backup mode. Valid values:</p>
             * <ul>
             * <li><strong>Automated</strong></li>
             * <li><strong>Manual</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Automated</p>
             */
            public Builder jobMode(String jobMode) {
                this.jobMode = jobMode;
                return this;
            }

            /**
             * <p>The progress of the task in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * <p>The type of the task. Valid values:</p>
             * <ul>
             * <li><strong>TempBackupTask</strong>: The backup task is an adhoc backup task.</li>
             * <li><strong>NormalBackupTask</strong>: The backup task is a common backup task.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NormalBackupTask</p>
             */
            public Builder taskAction(String taskAction) {
                this.taskAction = taskAction;
                return this;
            }

            public BackupJob build() {
                return new BackupJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupTasksResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupJob")
        private java.util.List<BackupJob> backupJob;

        private Items(Builder builder) {
            this.backupJob = builder.backupJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return backupJob
         */
        public java.util.List<BackupJob> getBackupJob() {
            return this.backupJob;
        }

        public static final class Builder {
            private java.util.List<BackupJob> backupJob; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.backupJob = model.backupJob;
            } 

            /**
             * BackupJob.
             */
            public Builder backupJob(java.util.List<BackupJob> backupJob) {
                this.backupJob = backupJob;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
