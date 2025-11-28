// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListBackupJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBackupJobsResponseBody</p>
 */
public class ListBackupJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListBackupJobsResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBackupJobsResponseBody create() {
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

        private Builder(ListBackupJobsResponseBody model) {
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried backup jobs.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListBackupJobsResponseBody build() {
            return new ListBackupJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBackupJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBackupJobsResponseBody</p>
     */
    public static class BackupJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupJobId")
        private String backupJobId;

        @com.aliyun.core.annotation.NameInMap("BackupMode")
        private String backupMode;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("Process")
        private String process;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private BackupJob(Builder builder) {
            this.backupJobId = builder.backupJobId;
            this.backupMode = builder.backupMode;
            this.backupStatus = builder.backupStatus;
            this.process = builder.process;
            this.startTime = builder.startTime;
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
         * @return backupMode
         */
        public String getBackupMode() {
            return this.backupMode;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
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

        public static final class Builder {
            private String backupJobId; 
            private String backupMode; 
            private String backupStatus; 
            private String process; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(BackupJob model) {
                this.backupJobId = model.backupJobId;
                this.backupMode = model.backupMode;
                this.backupStatus = model.backupStatus;
                this.process = model.process;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The backup job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder backupJobId(String backupJobId) {
                this.backupJobId = backupJobId;
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
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * <p>The backup status. Valid values:</p>
             * <ul>
             * <li><strong>Success</strong></li>
             * <li><strong>Failure</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * <p>The progress of the backup job.</p>
             * 
             * <strong>example:</strong>
             * <p>50%</p>
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * <p>The time when the backup job started. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-11T09:26:43Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public BackupJob build() {
                return new BackupJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListBackupJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBackupJobsResponseBody</p>
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
