// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupTasksResponseBody</p>
 */
public class DescribeBackupTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupJobs")
    private java.util.List < BackupJobs> backupJobs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBackupTasksResponseBody(Builder builder) {
        this.backupJobs = builder.backupJobs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupJobs
     */
    public java.util.List < BackupJobs> getBackupJobs() {
        return this.backupJobs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < BackupJobs> backupJobs; 
        private String requestId; 

        /**
         * The details of the backup task.
         */
        public Builder backupJobs(java.util.List < BackupJobs> backupJobs) {
            this.backupJobs = backupJobs;
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

    public static class BackupJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupSetStatus")
        private String backupSetStatus;

        @com.aliyun.core.annotation.NameInMap("BackupStartTime")
        private String backupStartTime;

        @com.aliyun.core.annotation.NameInMap("BackupjobId")
        private String backupjobId;

        @com.aliyun.core.annotation.NameInMap("JobMode")
        private String jobMode;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        private BackupJobs(Builder builder) {
            this.backupSetStatus = builder.backupSetStatus;
            this.backupStartTime = builder.backupStartTime;
            this.backupjobId = builder.backupjobId;
            this.jobMode = builder.jobMode;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupJobs create() {
            return builder().build();
        }

        /**
         * @return backupSetStatus
         */
        public String getBackupSetStatus() {
            return this.backupSetStatus;
        }

        /**
         * @return backupStartTime
         */
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        /**
         * @return backupjobId
         */
        public String getBackupjobId() {
            return this.backupjobId;
        }

        /**
         * @return jobMode
         */
        public String getJobMode() {
            return this.jobMode;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private String backupSetStatus; 
            private String backupStartTime; 
            private String backupjobId; 
            private String jobMode; 
            private String progress; 

            /**
             * The backup task status. Valid values:
             * <p>
             * 
             * *   **Scheduled**: The backup task is in planning. Regular backup tasks that have not started are also in this state.
             * *   **Checking**: The instance is being checked before the backup.
             * *   **Backuping**: The backup task is in progress.
             * *   **Finished**: The backup task is completed.
             */
            public Builder backupSetStatus(String backupSetStatus) {
                this.backupSetStatus = backupSetStatus;
                return this;
            }

            /**
             * The start time of the backup task.
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * The ID of the backup task.
             */
            public Builder backupjobId(String backupjobId) {
                this.backupjobId = backupjobId;
                return this;
            }

            /**
             * The backup mode. Valid values:
             * <p>
             * 
             * *   **Automated**: automatic backup
             * *   **Manual**: manual backup
             */
            public Builder jobMode(String jobMode) {
                this.jobMode = jobMode;
                return this;
            }

            /**
             * The progress of the backup task. Unit: %. The progress is returned only for running backup tasks.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            public BackupJobs build() {
                return new BackupJobs(this);
            } 

        } 

    }
}
