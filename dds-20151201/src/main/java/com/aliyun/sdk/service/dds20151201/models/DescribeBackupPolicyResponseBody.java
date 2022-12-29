// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPolicyResponseBody</p>
 */
public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("BackupInterval")
    private Integer backupInterval;

    @NameInMap("BackupRetentionPeriod")
    private String backupRetentionPeriod;

    @NameInMap("EnableBackupLog")
    private Integer enableBackupLog;

    @NameInMap("LogBackupRetentionPeriod")
    private Integer logBackupRetentionPeriod;

    @NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SnapshotBackupType")
    private String snapshotBackupType;

    private DescribeBackupPolicyResponseBody(Builder builder) {
        this.backupInterval = builder.backupInterval;
        this.backupRetentionPeriod = builder.backupRetentionPeriod;
        this.enableBackupLog = builder.enableBackupLog;
        this.logBackupRetentionPeriod = builder.logBackupRetentionPeriod;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.requestId = builder.requestId;
        this.snapshotBackupType = builder.snapshotBackupType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupInterval
     */
    public Integer getBackupInterval() {
        return this.backupInterval;
    }

    /**
     * @return backupRetentionPeriod
     */
    public String getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * @return enableBackupLog
     */
    public Integer getEnableBackupLog() {
        return this.enableBackupLog;
    }

    /**
     * @return logBackupRetentionPeriod
     */
    public Integer getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    /**
     * @return preferredBackupPeriod
     */
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    /**
     * @return preferredBackupTime
     */
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotBackupType
     */
    public String getSnapshotBackupType() {
        return this.snapshotBackupType;
    }

    public static final class Builder {
        private Integer backupInterval; 
        private String backupRetentionPeriod; 
        private Integer enableBackupLog; 
        private Integer logBackupRetentionPeriod; 
        private String preferredBackupPeriod; 
        private String preferredBackupTime; 
        private String requestId; 
        private String snapshotBackupType; 

        /**
         * The frequency at which high-frequency backups are created. Valid values:
         * <p>
         * 
         * *   **-1**: disables high-frequency backup.
         * *   **15**: every 15 minutes.
         * *   **30**: every 30 minutes.
         * *   **60**: every hour.
         * *   **120**: every 2 hours.
         * *   **180**: every 3 hours.
         * *   **240**: every 4 hours.
         * *   **360**: every 6 hours.
         * *   **480**: every 8 hours.
         * *   **720**: every 12 hours.
         */
        public Builder backupInterval(Integer backupInterval) {
            this.backupInterval = backupInterval;
            return this;
        }

        /**
         * The retention period of backups. Unit: days.
         */
        public Builder backupRetentionPeriod(String backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * Indicates whether log backup is enabled. Default value: 0. Valid values:
         * <p>
         * 
         * *   **0**: disables log backup.
         * *   **1**: enables log backup.
         */
        public Builder enableBackupLog(Integer enableBackupLog) {
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * The number of days for which to retain log backups. Valid values: 7 to 730.
         */
        public Builder logBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }

        /**
         * The day of a week on which to back up data. Valid values:
         * <p>
         * 
         * *   **Monday**
         * *   **Tuesday**
         * *   **Wednesday**
         * *   **Thursday**
         * *   **Friday**
         * *   **Saturday**
         * *   **Sunday**
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * The time range to back up data. The time is in the *HH:mm*Z-*HH:mm*Z format. The time is displayed in UTC.
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The snapshot backup type. Default value: Standard. Valid values:
         * <p>
         * 
         * *   **Flash**: single-digit second backup
         * *   **Standard**: standard backup
         */
        public Builder snapshotBackupType(String snapshotBackupType) {
            this.snapshotBackupType = snapshotBackupType;
            return this;
        }

        public DescribeBackupPolicyResponseBody build() {
            return new DescribeBackupPolicyResponseBody(this);
        } 

    } 

}
