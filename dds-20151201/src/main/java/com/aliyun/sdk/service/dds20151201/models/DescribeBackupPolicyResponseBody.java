// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeBackupPolicyResponseBody model) {
            this.backupInterval = model.backupInterval;
            this.backupRetentionPeriod = model.backupRetentionPeriod;
            this.backupRetentionPolicyOnClusterDeletion = model.backupRetentionPolicyOnClusterDeletion;
            this.crossBackupPeriod = model.crossBackupPeriod;
            this.crossLogRetentionType = model.crossLogRetentionType;
            this.crossLogRetentionValue = model.crossLogRetentionValue;
            this.crossRetentionType = model.crossRetentionType;
            this.crossRetentionValue = model.crossRetentionValue;
            this.destRegion = model.destRegion;
            this.enableBackupLog = model.enableBackupLog;
            this.enableCrossLogBackup = model.enableCrossLogBackup;
            this.highFrequencyBackupRetention = model.highFrequencyBackupRetention;
            this.logBackupRetentionPeriod = model.logBackupRetentionPeriod;
            this.preferredBackupPeriod = model.preferredBackupPeriod;
            this.preferredBackupTime = model.preferredBackupTime;
            this.preferredNextBackupTime = model.preferredNextBackupTime;
            this.requestId = model.requestId;
            this.snapshotBackupType = model.snapshotBackupType;
            this.srcRegion = model.srcRegion;
        } 

        /**
         * <p>The frequency at which high-frequency backup is created. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: High-frequency backup is disabled.</li>
         * <li><strong>15</strong>: every 15 minutes.</li>
         * <li><strong>30</strong>: every 30 minutes.</li>
         * <li><strong>60</strong>: every hour.</li>
         * <li><strong>120</strong>: every 2 hours.</li>
         * <li><strong>180</strong>: every 3 hours.</li>
         * <li><strong>240</strong>: every 4 hours.</li>
         * <li><strong>360</strong>: every 6 hours.</li>
         * <li><strong>480</strong>: every 8 hours.</li>
         * <li><strong>720</strong>: every 12 hours.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder backupInterval(Integer backupInterval) {
            this.backupInterval = backupInterval;
            return this;
        }

        /**
         * <p>The retention period of the backup data. Unit: day.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder backupRetentionPeriod(String backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * <p>The backup retention policy configured for the instance. Valid values:</p>
         * <ol>
         * <li>0: All backup sets are immediately deleted when the instance is released.</li>
         * <li>1: Automatic backup is performed and the backup set is retained for a long period of time when the instance is released.</li>
         * <li>2: Automatic backup is performed and all backup sets are retained for a long period of time when the instance is released.</li>
         * </ol>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2779111.html">Retain the backup files of an ApsaraDB for MongoDB instance for a long period of time</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder backupRetentionPolicyOnClusterDeletion(Integer backupRetentionPolicyOnClusterDeletion) {
            this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
            return this;
        }

        /**
         * <p>The retention period of Cross-regional backup.
         * Valid values:</p>
         * <ul>
         * <li><strong>Monday</strong></li>
         * <li><strong>Tuesday</strong></li>
         * <li><strong>Wednesday</strong></li>
         * <li><strong>Thursday</strong></li>
         * <li><strong>Friday</strong></li>
         * <li><strong>Saturday</strong></li>
         * <li><strong>Sunday</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Monday</p>
         */
        public Builder crossBackupPeriod(String crossBackupPeriod) {
            this.crossBackupPeriod = crossBackupPeriod;
            return this;
        }

        /**
         * <p>The retention type of Cross-regional  log backup.</p>
         * <ul>
         * <li>delay : retain the backup for a period of time.</li>
         * <li>never : retain the backup permanently.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>delay</p>
         */
        public Builder crossLogRetentionType(String crossLogRetentionType) {
            this.crossLogRetentionType = crossLogRetentionType;
            return this;
        }

        /**
         * <p>The retention time of Cross-regional log backup.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder crossLogRetentionValue(Integer crossLogRetentionValue) {
            this.crossLogRetentionValue = crossLogRetentionValue;
            return this;
        }

        /**
         * <p>The retention type of Cross-regional backup.</p>
         * <ul>
         * <li>delay : retain the backup for a period of time.</li>
         * <li>never : retain the backup permanently.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>delay</p>
         */
        public Builder crossRetentionType(String crossRetentionType) {
            this.crossRetentionType = crossRetentionType;
            return this;
        }

        /**
         * <p>The retention time of Cross-regional backup.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder crossRetentionValue(Integer crossRetentionValue) {
            this.crossRetentionValue = crossRetentionValue;
            return this;
        }

        /**
         * <p>The region ID of the cross-regional backup..</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder destRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }

        /**
         * <p>Indicates whether the log backup feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): The log backup feature is disabled.</li>
         * <li><strong>1</strong>: The log backup feature is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enableBackupLog(Integer enableBackupLog) {
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * <p>Whether to turn on cross-regional log backup.</p>
         * <ul>
         * <li>1: turn on . Used for sharded cluster.</li>
         * <li>0: turn off. Used for replicate set.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enableCrossLogBackup(Integer enableCrossLogBackup) {
            this.enableCrossLogBackup = enableCrossLogBackup;
            return this;
        }

        /**
         * <p>The retention period of high-frequency backups. Unit: day.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder highFrequencyBackupRetention(String highFrequencyBackupRetention) {
            this.highFrequencyBackupRetention = highFrequencyBackupRetention;
            return this;
        }

        /**
         * <p>The number of days for which log backups are retained. Valid values: 7 to 730.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder logBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }

        /**
         * <p>The day of a week on which to back up data. Valid values:</p>
         * <ul>
         * <li><strong>Monday</strong></li>
         * <li><strong>Tuesday</strong></li>
         * <li><strong>Wednesday</strong></li>
         * <li><strong>Thursday</strong></li>
         * <li><strong>Friday</strong></li>
         * <li><strong>Saturday</strong></li>
         * <li><strong>Sunday</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday</p>
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * <p>The time range during which the backup was created. The time follows the ISO 8601 standard in the <em>HH:mm</em>Z-<em>HH:mm</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00Z-10:00Z</p>
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * <p>The time of next standard backup.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-19T19:11Z</p>
         */
        public Builder preferredNextBackupTime(String preferredNextBackupTime) {
            this.preferredNextBackupTime = preferredNextBackupTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5A9464CA-F7DC-5434-90B1-DF7F197C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The snapshot backup type. Valid values:</p>
         * <ul>
         * <li><strong>Flash</strong>: single-digit second backup</li>
         * <li><strong>Standard</strong> (default): standard backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder snapshotBackupType(String snapshotBackupType) {
            this.snapshotBackupType = snapshotBackupType;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
