// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPolicyResponseBody</p>
 */
public class DescribeBackupPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupInterval")
    private Integer backupInterval;

    @com.aliyun.core.annotation.NameInMap("BackupRetentionPeriod")
    private String backupRetentionPeriod;

    @com.aliyun.core.annotation.NameInMap("BackupRetentionPolicyOnClusterDeletion")
    private Integer backupRetentionPolicyOnClusterDeletion;

    @com.aliyun.core.annotation.NameInMap("CrossBackupPeriod")
    private String crossBackupPeriod;

    @com.aliyun.core.annotation.NameInMap("CrossLogRetentionType")
    private String crossLogRetentionType;

    @com.aliyun.core.annotation.NameInMap("CrossLogRetentionValue")
    private Integer crossLogRetentionValue;

    @com.aliyun.core.annotation.NameInMap("CrossRetentionType")
    private String crossRetentionType;

    @com.aliyun.core.annotation.NameInMap("CrossRetentionValue")
    private Integer crossRetentionValue;

    @com.aliyun.core.annotation.NameInMap("DestRegion")
    private String destRegion;

    @com.aliyun.core.annotation.NameInMap("EnableBackupLog")
    private Integer enableBackupLog;

    @com.aliyun.core.annotation.NameInMap("EnableCrossLogBackup")
    private Integer enableCrossLogBackup;

    @com.aliyun.core.annotation.NameInMap("HighFrequencyBackupRetention")
    private String highFrequencyBackupRetention;

    @com.aliyun.core.annotation.NameInMap("LogBackupRetentionPeriod")
    private Integer logBackupRetentionPeriod;

    @com.aliyun.core.annotation.NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @com.aliyun.core.annotation.NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @com.aliyun.core.annotation.NameInMap("PreferredNextBackupTime")
    private String preferredNextBackupTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotBackupType")
    private String snapshotBackupType;

    @com.aliyun.core.annotation.NameInMap("SrcRegion")
    private String srcRegion;

    private DescribeBackupPolicyResponseBody(Builder builder) {
        this.backupInterval = builder.backupInterval;
        this.backupRetentionPeriod = builder.backupRetentionPeriod;
        this.backupRetentionPolicyOnClusterDeletion = builder.backupRetentionPolicyOnClusterDeletion;
        this.crossBackupPeriod = builder.crossBackupPeriod;
        this.crossLogRetentionType = builder.crossLogRetentionType;
        this.crossLogRetentionValue = builder.crossLogRetentionValue;
        this.crossRetentionType = builder.crossRetentionType;
        this.crossRetentionValue = builder.crossRetentionValue;
        this.destRegion = builder.destRegion;
        this.enableBackupLog = builder.enableBackupLog;
        this.enableCrossLogBackup = builder.enableCrossLogBackup;
        this.highFrequencyBackupRetention = builder.highFrequencyBackupRetention;
        this.logBackupRetentionPeriod = builder.logBackupRetentionPeriod;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.preferredNextBackupTime = builder.preferredNextBackupTime;
        this.requestId = builder.requestId;
        this.snapshotBackupType = builder.snapshotBackupType;
        this.srcRegion = builder.srcRegion;
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
     * @return backupRetentionPolicyOnClusterDeletion
     */
    public Integer getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    /**
     * @return crossBackupPeriod
     */
    public String getCrossBackupPeriod() {
        return this.crossBackupPeriod;
    }

    /**
     * @return crossLogRetentionType
     */
    public String getCrossLogRetentionType() {
        return this.crossLogRetentionType;
    }

    /**
     * @return crossLogRetentionValue
     */
    public Integer getCrossLogRetentionValue() {
        return this.crossLogRetentionValue;
    }

    /**
     * @return crossRetentionType
     */
    public String getCrossRetentionType() {
        return this.crossRetentionType;
    }

    /**
     * @return crossRetentionValue
     */
    public Integer getCrossRetentionValue() {
        return this.crossRetentionValue;
    }

    /**
     * @return destRegion
     */
    public String getDestRegion() {
        return this.destRegion;
    }

    /**
     * @return enableBackupLog
     */
    public Integer getEnableBackupLog() {
        return this.enableBackupLog;
    }

    /**
     * @return enableCrossLogBackup
     */
    public Integer getEnableCrossLogBackup() {
        return this.enableCrossLogBackup;
    }

    /**
     * @return highFrequencyBackupRetention
     */
    public String getHighFrequencyBackupRetention() {
        return this.highFrequencyBackupRetention;
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
     * @return preferredNextBackupTime
     */
    public String getPreferredNextBackupTime() {
        return this.preferredNextBackupTime;
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

    /**
     * @return srcRegion
     */
    public String getSrcRegion() {
        return this.srcRegion;
    }

    public static final class Builder {
        private Integer backupInterval; 
        private String backupRetentionPeriod; 
        private Integer backupRetentionPolicyOnClusterDeletion; 
        private String crossBackupPeriod; 
        private String crossLogRetentionType; 
        private Integer crossLogRetentionValue; 
        private String crossRetentionType; 
        private Integer crossRetentionValue; 
        private String destRegion; 
        private Integer enableBackupLog; 
        private Integer enableCrossLogBackup; 
        private String highFrequencyBackupRetention; 
        private Integer logBackupRetentionPeriod; 
        private String preferredBackupPeriod; 
        private String preferredBackupTime; 
        private String preferredNextBackupTime; 
        private String requestId; 
        private String snapshotBackupType; 
        private String srcRegion; 

        /**
         * The frequency at which high-frequency backup is created. Valid values:
         * <p>
         * 
         * *   **-1**: High-frequency backup is disabled.
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
         * The retention period of the backup data. Unit: day.
         */
        public Builder backupRetentionPeriod(String backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * BackupRetentionPolicyOnClusterDeletion.
         */
        public Builder backupRetentionPolicyOnClusterDeletion(Integer backupRetentionPolicyOnClusterDeletion) {
            this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
            return this;
        }

        /**
         * CrossBackupPeriod.
         */
        public Builder crossBackupPeriod(String crossBackupPeriod) {
            this.crossBackupPeriod = crossBackupPeriod;
            return this;
        }

        /**
         * CrossLogRetentionType.
         */
        public Builder crossLogRetentionType(String crossLogRetentionType) {
            this.crossLogRetentionType = crossLogRetentionType;
            return this;
        }

        /**
         * CrossLogRetentionValue.
         */
        public Builder crossLogRetentionValue(Integer crossLogRetentionValue) {
            this.crossLogRetentionValue = crossLogRetentionValue;
            return this;
        }

        /**
         * CrossRetentionType.
         */
        public Builder crossRetentionType(String crossRetentionType) {
            this.crossRetentionType = crossRetentionType;
            return this;
        }

        /**
         * CrossRetentionValue.
         */
        public Builder crossRetentionValue(Integer crossRetentionValue) {
            this.crossRetentionValue = crossRetentionValue;
            return this;
        }

        /**
         * DestRegion.
         */
        public Builder destRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }

        /**
         * Indicates whether the log backup feature is enabled. Valid values:
         * <p>
         * 
         * *   **0** (default): The log backup feature is disabled.
         * *   **1**: The log backup feature is enabled.
         */
        public Builder enableBackupLog(Integer enableBackupLog) {
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * EnableCrossLogBackup.
         */
        public Builder enableCrossLogBackup(Integer enableCrossLogBackup) {
            this.enableCrossLogBackup = enableCrossLogBackup;
            return this;
        }

        /**
         * The retention period of high-frequency backups. Unit: day.
         */
        public Builder highFrequencyBackupRetention(String highFrequencyBackupRetention) {
            this.highFrequencyBackupRetention = highFrequencyBackupRetention;
            return this;
        }

        /**
         * The number of days for which log backups are retained. Valid values: 7 to 730.
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
         * The time range during which the backup was created. The time follows the ISO 8601 standard in the *HH:mm*Z-*HH:mm*Z format. The time is displayed in UTC.
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * PreferredNextBackupTime.
         */
        public Builder preferredNextBackupTime(String preferredNextBackupTime) {
            this.preferredNextBackupTime = preferredNextBackupTime;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The snapshot backup type. Valid values:
         * <p>
         * 
         * *   **Flash**: single-digit second backup
         * *   **Standard** (default): standard backup
         */
        public Builder snapshotBackupType(String snapshotBackupType) {
            this.snapshotBackupType = snapshotBackupType;
            return this;
        }

        /**
         * SrcRegion.
         */
        public Builder srcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }

        public DescribeBackupPolicyResponseBody build() {
            return new DescribeBackupPolicyResponseBody(this);
        } 

    } 

}
