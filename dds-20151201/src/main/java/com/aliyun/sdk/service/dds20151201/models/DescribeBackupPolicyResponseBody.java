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

    @com.aliyun.core.annotation.NameInMap("PreserveOneEachHour")
    private Boolean preserveOneEachHour;

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
        this.preserveOneEachHour = builder.preserveOneEachHour;
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
     * @return preserveOneEachHour
     */
    public Boolean getPreserveOneEachHour() {
        return this.preserveOneEachHour;
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
        private Boolean preserveOneEachHour; 
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
            this.preserveOneEachHour = model.preserveOneEachHour;
            this.requestId = model.requestId;
            this.snapshotBackupType = model.snapshotBackupType;
            this.srcRegion = model.srcRegion;
        } 

        /**
         * <p>The high-frequency backup frequency. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: high-frequency backup is disabled</li>
         * <li><strong>15</strong>: every 15 minutes</li>
         * <li><strong>30</strong>: every 30 minutes</li>
         * <li><strong>60</strong>: every 1 hour</li>
         * <li><strong>120</strong>: every 2 hours</li>
         * <li><strong>180</strong>: every 3 hours</li>
         * <li><strong>240</strong>: every 4 hours</li>
         * <li><strong>360</strong>: every 6 hours</li>
         * <li><strong>480</strong>: every 8 hours</li>
         * <li><strong>720</strong>: every 12 hours</li>
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
         * <p>The backup retention period in days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder backupRetentionPeriod(String backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * <p>The backup data retention policy. Valid values:</p>
         * <ul>
         * <li>0: All backup sets of the instance are immediately deleted when the instance is released.</li>
         * <li>1: An automatic backup is created when the instance is released, and the backup set is retained for long-term retention (LTR).</li>
         * <li>2: An automatic backup is created when the instance is released, and all backup sets of the cluster are retained for long-term retention (LTR).</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2779111.html">Long-term retention backup</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder backupRetentionPolicyOnClusterDeletion(Integer backupRetentionPolicyOnClusterDeletion) {
            this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
            return this;
        }

        /**
         * <p>The days of the week when geo-redundancy backups are performed. Valid values:</p>
         * <ul>
         * <li>Monday: Monday</li>
         * <li>Tuesday: Tuesday</li>
         * <li>Wednesday: Wednesday</li>
         * <li>Thursday: Thursday</li>
         * <li>Friday: Friday</li>
         * <li>Saturday: Saturday</li>
         * <li>Sunday: Sunday</li>
         * </ul>
         * <blockquote>
         * <p>Required for geo-redundancy backups.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Monday</p>
         */
        public Builder crossBackupPeriod(String crossBackupPeriod) {
            this.crossBackupPeriod = crossBackupPeriod;
            return this;
        }

        /**
         * <p>The retention type for cross-region log backups. Valid values:</p>
         * <ul>
         * <li>delay: retained for a specified period</li>
         * <li>never: never expires</li>
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
         * <p>The retention period for cross-region log backups.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder crossLogRetentionValue(Integer crossLogRetentionValue) {
            this.crossLogRetentionValue = crossLogRetentionValue;
            return this;
        }

        /**
         * <p>The retention type for geo-redundancy backups. Valid values:</p>
         * <ul>
         * <li><p>delay: retained for a specified period</p>
         * </li>
         * <li><p>never: never expires</p>
         * </li>
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
         * <p>The retention period for geo-redundancy backups.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder crossRetentionValue(Integer crossRetentionValue) {
            this.crossRetentionValue = crossRetentionValue;
            return this;
        }

        /**
         * <p>The region where geo-redundancy backups are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder destRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }

        /**
         * <p>Specifies whether to enable log backup. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled (default)</li>
         * <li><strong>1</strong>: enabled</li>
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
         * <p>Specifies whether cross-region log backup is enabled.</p>
         * <blockquote>
         * <p>Required for geo-redundancy backups.</p>
         * <ul>
         * <li>1: enabled (must be set to 1 for sharded cluster instances)</li>
         * <li>0: disabled (must be set to 0 for replica set instances)</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enableCrossLogBackup(Integer enableCrossLogBackup) {
            this.enableCrossLogBackup = enableCrossLogBackup;
            return this;
        }

        /**
         * <p>The retention period for high-frequency backups, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder highFrequencyBackupRetention(String highFrequencyBackupRetention) {
            this.highFrequencyBackupRetention = highFrequencyBackupRetention;
            return this;
        }

        /**
         * <p>The retention period for log backups, in days. Valid values: 7 to 730.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder logBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }

        /**
         * <p>The backup cycle. Valid values:</p>
         * <ul>
         * <li><strong>Monday</strong>: Monday</li>
         * <li><strong>Tuesday</strong>: Tuesday</li>
         * <li><strong>Wednesday</strong>: Wednesday</li>
         * <li><strong>Thursday</strong>: Thursday</li>
         * <li><strong>Friday</strong>: Friday</li>
         * <li><strong>Saturday</strong>: Saturday</li>
         * <li><strong>Sunday</strong>: Sunday</li>
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
         * <p>The backup time. The format is <i>HH:mm</i>Z-<i>HH:mm</i>Z (UTC time).</p>
         * 
         * <strong>example:</strong>
         * <p>09:00Z-10:00Z</p>
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * <p>The time of the next regular backup. The format is <i>yyyy-mm-dd</i>t<i>hh:mm</i>z (UTC time).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-19T19:11Z</p>
         */
        public Builder preferredNextBackupTime(String preferredNextBackupTime) {
            this.preferredNextBackupTime = preferredNextBackupTime;
            return this;
        }

        /**
         * <p>Specifies whether to enable sparse backup within an hour. Valid values:</p>
         * <ul>
         * <li><p>true: When the backup frequency is set to minutes, all snapshots taken within 1 hour from the current time are retained. For snapshots taken more than 1 hour but within 24 hours from the current time, only the first snapshot after the hour is retained.</p>
         * </li>
         * <li><p>false: Sparse backup within an hour is disabled. All snapshots within the high-frequency backup retention period are retained.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder preserveOneEachHour(Boolean preserveOneEachHour) {
            this.preserveOneEachHour = preserveOneEachHour;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
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
         * <li><strong>Flash</strong>: backup within seconds</li>
         * <li><strong>Standard</strong>: standard backup (default)</li>
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
         * <p>The region where the source instance is deployed.</p>
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
