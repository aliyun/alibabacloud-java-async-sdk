// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
         * <p>The details of the backup task.</p>
         */
        public Builder backupJobs(java.util.List < BackupJobs> backupJobs) {
            this.backupJobs = backupJobs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D648B367-15B6-1B42-BD4B-47507C9CC****</p>
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
             * <p>The backup task status. Valid values:</p>
             * <ul>
             * <li><strong>Scheduled</strong>: The backup task is in planning. Regular backup tasks that have not started are also in this state.</li>
             * <li><strong>Checking</strong>: The instance is being checked before the backup.</li>
             * <li><strong>Backuping</strong>: The backup task is in progress.</li>
             * <li><strong>Finished</strong>: The backup task is completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Scheduled</p>
             */
            public Builder backupSetStatus(String backupSetStatus) {
                this.backupSetStatus = backupSetStatus;
                return this;
            }

            /**
             * <p>The start time of the backup task.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-16T11:04:56Z</p>
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * <p>The ID of the backup task.</p>
             * 
             * <strong>example:</strong>
             * <p>170034</p>
             */
            public Builder backupjobId(String backupjobId) {
                this.backupjobId = backupjobId;
                return this;
            }

            /**
             * <p>The backup mode. Valid values:</p>
             * <ul>
             * <li><strong>Automated</strong>: automatic backup</li>
             * <li><strong>Manual</strong>: manual backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder jobMode(String jobMode) {
                this.jobMode = jobMode;
                return this;
            }

            /**
             * <p>The progress of the backup task. Unit: %. The progress is returned only for running backup tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>18%</p>
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
