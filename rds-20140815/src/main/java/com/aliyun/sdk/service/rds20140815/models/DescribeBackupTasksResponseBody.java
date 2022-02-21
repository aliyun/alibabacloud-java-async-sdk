// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
         * Items.
         */
        public Builder items(Items items) {
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

        public DescribeBackupTasksResponseBody build() {
            return new DescribeBackupTasksResponseBody(this);
        } 

    } 

    public static class BackupJob extends TeaModel {
        @NameInMap("BackupId")
        private String backupId;

        @NameInMap("BackupJobId")
        private String backupJobId;

        @NameInMap("BackupProgressStatus")
        private String backupProgressStatus;

        @NameInMap("BackupStatus")
        private String backupStatus;

        @NameInMap("JobMode")
        private String jobMode;

        @NameInMap("Process")
        private String process;

        @NameInMap("TaskAction")
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

            /**
             * BackupId.
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * BackupJobId.
             */
            public Builder backupJobId(String backupJobId) {
                this.backupJobId = backupJobId;
                return this;
            }

            /**
             * BackupProgressStatus.
             */
            public Builder backupProgressStatus(String backupProgressStatus) {
                this.backupProgressStatus = backupProgressStatus;
                return this;
            }

            /**
             * BackupStatus.
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * JobMode.
             */
            public Builder jobMode(String jobMode) {
                this.jobMode = jobMode;
                return this;
            }

            /**
             * Process.
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * TaskAction.
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
