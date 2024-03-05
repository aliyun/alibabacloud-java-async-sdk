// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
    @NameInMap("BackupJobs")
    private java.util.List < BackupJobs> backupJobs;

    @NameInMap("RequestId")
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
         * BackupJobs.
         */
        public Builder backupJobs(java.util.List < BackupJobs> backupJobs) {
            this.backupJobs = backupJobs;
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

    public static class BackupJobs extends TeaModel {
        @NameInMap("BackupSetStatus")
        private String backupSetStatus;

        @NameInMap("BackupStartTime")
        private String backupStartTime;

        @NameInMap("BackupjobId")
        private Long backupjobId;

        @NameInMap("JobMode")
        private String jobMode;

        @NameInMap("Progress")
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
        public Long getBackupjobId() {
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
            private Long backupjobId; 
            private String jobMode; 
            private String progress; 

            /**
             * BackupSetStatus.
             */
            public Builder backupSetStatus(String backupSetStatus) {
                this.backupSetStatus = backupSetStatus;
                return this;
            }

            /**
             * BackupStartTime.
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * BackupjobId.
             */
            public Builder backupjobId(Long backupjobId) {
                this.backupjobId = backupjobId;
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
             * Progress.
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
