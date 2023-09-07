// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupTasksResponseBody</p>
 */
public class DescribeBackupTasksResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("RequestId")
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

        /**
         * The details of the backup task.
         */
        public Builder items(Items items) {
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

        public DescribeBackupTasksResponseBody build() {
            return new DescribeBackupTasksResponseBody(this);
        } 

    } 

    public static class BackupJob extends TeaModel {
        @NameInMap("BackupJobId")
        private String backupJobId;

        @NameInMap("BackupProgressStatus")
        private String backupProgressStatus;

        @NameInMap("JobMode")
        private String jobMode;

        @NameInMap("Process")
        private String process;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("TaskAction")
        private String taskAction;

        private BackupJob(Builder builder) {
            this.backupJobId = builder.backupJobId;
            this.backupProgressStatus = builder.backupProgressStatus;
            this.jobMode = builder.jobMode;
            this.process = builder.process;
            this.startTime = builder.startTime;
            this.taskAction = builder.taskAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupJob create() {
            return builder().build();
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return taskAction
         */
        public String getTaskAction() {
            return this.taskAction;
        }

        public static final class Builder {
            private String backupJobId; 
            private String backupProgressStatus; 
            private String jobMode; 
            private String process; 
            private String startTime; 
            private String taskAction; 

            /**
             * The ID of the backup task.
             */
            public Builder backupJobId(String backupJobId) {
                this.backupJobId = backupJobId;
                return this;
            }

            /**
             * The state of the backup task. Valid values:
             * <p>
             * 
             * *   **NoStart**
             * *   **Preparing**
             * *   **Waiting**
             * *   **Uploading**
             * *   **Checking**
             * *   **Finished**
             */
            public Builder backupProgressStatus(String backupProgressStatus) {
                this.backupProgressStatus = backupProgressStatus;
                return this;
            }

            /**
             * The backup mode. Valid values:
             * <p>
             * 
             * *   **Automated**
             * *   **Manual**
             */
            public Builder jobMode(String jobMode) {
                this.jobMode = jobMode;
                return this;
            }

            /**
             * The progress of the backup task in percentage.
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * The time when the backup task started. The time follows the ISO 8601 standard in the `YYYY-MM-DDThh:mm:ssZ` format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The type of the backup task. Valid values:
             * <p>
             * 
             * *   **TempBackupTask**: The backup task is an adhoc backup task.
             * *   **NormalBackupTask**: The backup task is a common backup task.
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
    public static class Items extends TeaModel {
        @NameInMap("BackupJob")
        private java.util.List < BackupJob> backupJob;

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
        public java.util.List < BackupJob> getBackupJob() {
            return this.backupJob;
        }

        public static final class Builder {
            private java.util.List < BackupJob> backupJob; 

            /**
             * BackupJob.
             */
            public Builder backupJob(java.util.List < BackupJob> backupJob) {
                this.backupJob = backupJob;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
