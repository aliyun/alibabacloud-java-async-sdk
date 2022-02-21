// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    @NameInMap("ArchiveBackupKeepCount")
    private String archiveBackupKeepCount;

    @NameInMap("ArchiveBackupKeepPolicy")
    private String archiveBackupKeepPolicy;

    @NameInMap("ArchiveBackupRetentionPeriod")
    private String archiveBackupRetentionPeriod;

    @NameInMap("BackupInterval")
    private String backupInterval;

    @NameInMap("BackupLog")
    private String backupLog;

    @NameInMap("BackupMethod")
    private String backupMethod;

    @NameInMap("BackupRetentionPeriod")
    private Integer backupRetentionPeriod;

    @NameInMap("Category")
    private String category;

    @NameInMap("CompressType")
    private String compressType;

    @NameInMap("EnableBackupLog")
    private String enableBackupLog;

    @NameInMap("HighSpaceUsageProtection")
    private String highSpaceUsageProtection;

    @NameInMap("LocalLogRetentionHours")
    private Integer localLogRetentionHours;

    @NameInMap("LocalLogRetentionSpace")
    private String localLogRetentionSpace;

    @NameInMap("LogBackupFrequency")
    private String logBackupFrequency;

    @NameInMap("LogBackupLocalRetentionNumber")
    private Integer logBackupLocalRetentionNumber;

    @NameInMap("LogBackupRetentionPeriod")
    private Integer logBackupRetentionPeriod;

    @NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @NameInMap("PreferredNextBackupTime")
    private String preferredNextBackupTime;

    @NameInMap("ReleasedKeepPolicy")
    private String releasedKeepPolicy;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SupportReleasedKeep")
    private Integer supportReleasedKeep;

    @NameInMap("SupportVolumeShadowCopy")
    private Integer supportVolumeShadowCopy;

    private DescribeBackupPolicyResponseBody(Builder builder) {
        this.archiveBackupKeepCount = builder.archiveBackupKeepCount;
        this.archiveBackupKeepPolicy = builder.archiveBackupKeepPolicy;
        this.archiveBackupRetentionPeriod = builder.archiveBackupRetentionPeriod;
        this.backupInterval = builder.backupInterval;
        this.backupLog = builder.backupLog;
        this.backupMethod = builder.backupMethod;
        this.backupRetentionPeriod = builder.backupRetentionPeriod;
        this.category = builder.category;
        this.compressType = builder.compressType;
        this.enableBackupLog = builder.enableBackupLog;
        this.highSpaceUsageProtection = builder.highSpaceUsageProtection;
        this.localLogRetentionHours = builder.localLogRetentionHours;
        this.localLogRetentionSpace = builder.localLogRetentionSpace;
        this.logBackupFrequency = builder.logBackupFrequency;
        this.logBackupLocalRetentionNumber = builder.logBackupLocalRetentionNumber;
        this.logBackupRetentionPeriod = builder.logBackupRetentionPeriod;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.preferredNextBackupTime = builder.preferredNextBackupTime;
        this.releasedKeepPolicy = builder.releasedKeepPolicy;
        this.requestId = builder.requestId;
        this.supportReleasedKeep = builder.supportReleasedKeep;
        this.supportVolumeShadowCopy = builder.supportVolumeShadowCopy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return archiveBackupKeepCount
     */
    public String getArchiveBackupKeepCount() {
        return this.archiveBackupKeepCount;
    }

    /**
     * @return archiveBackupKeepPolicy
     */
    public String getArchiveBackupKeepPolicy() {
        return this.archiveBackupKeepPolicy;
    }

    /**
     * @return archiveBackupRetentionPeriod
     */
    public String getArchiveBackupRetentionPeriod() {
        return this.archiveBackupRetentionPeriod;
    }

    /**
     * @return backupInterval
     */
    public String getBackupInterval() {
        return this.backupInterval;
    }

    /**
     * @return backupLog
     */
    public String getBackupLog() {
        return this.backupLog;
    }

    /**
     * @return backupMethod
     */
    public String getBackupMethod() {
        return this.backupMethod;
    }

    /**
     * @return backupRetentionPeriod
     */
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return compressType
     */
    public String getCompressType() {
        return this.compressType;
    }

    /**
     * @return enableBackupLog
     */
    public String getEnableBackupLog() {
        return this.enableBackupLog;
    }

    /**
     * @return highSpaceUsageProtection
     */
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
    }

    /**
     * @return localLogRetentionHours
     */
    public Integer getLocalLogRetentionHours() {
        return this.localLogRetentionHours;
    }

    /**
     * @return localLogRetentionSpace
     */
    public String getLocalLogRetentionSpace() {
        return this.localLogRetentionSpace;
    }

    /**
     * @return logBackupFrequency
     */
    public String getLogBackupFrequency() {
        return this.logBackupFrequency;
    }

    /**
     * @return logBackupLocalRetentionNumber
     */
    public Integer getLogBackupLocalRetentionNumber() {
        return this.logBackupLocalRetentionNumber;
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
     * @return releasedKeepPolicy
     */
    public String getReleasedKeepPolicy() {
        return this.releasedKeepPolicy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportReleasedKeep
     */
    public Integer getSupportReleasedKeep() {
        return this.supportReleasedKeep;
    }

    /**
     * @return supportVolumeShadowCopy
     */
    public Integer getSupportVolumeShadowCopy() {
        return this.supportVolumeShadowCopy;
    }

    public static final class Builder {
        private String archiveBackupKeepCount; 
        private String archiveBackupKeepPolicy; 
        private String archiveBackupRetentionPeriod; 
        private String backupInterval; 
        private String backupLog; 
        private String backupMethod; 
        private Integer backupRetentionPeriod; 
        private String category; 
        private String compressType; 
        private String enableBackupLog; 
        private String highSpaceUsageProtection; 
        private Integer localLogRetentionHours; 
        private String localLogRetentionSpace; 
        private String logBackupFrequency; 
        private Integer logBackupLocalRetentionNumber; 
        private Integer logBackupRetentionPeriod; 
        private String preferredBackupPeriod; 
        private String preferredBackupTime; 
        private String preferredNextBackupTime; 
        private String releasedKeepPolicy; 
        private String requestId; 
        private Integer supportReleasedKeep; 
        private Integer supportVolumeShadowCopy; 

        /**
         * ArchiveBackupKeepCount.
         */
        public Builder archiveBackupKeepCount(String archiveBackupKeepCount) {
            this.archiveBackupKeepCount = archiveBackupKeepCount;
            return this;
        }

        /**
         * ArchiveBackupKeepPolicy.
         */
        public Builder archiveBackupKeepPolicy(String archiveBackupKeepPolicy) {
            this.archiveBackupKeepPolicy = archiveBackupKeepPolicy;
            return this;
        }

        /**
         * ArchiveBackupRetentionPeriod.
         */
        public Builder archiveBackupRetentionPeriod(String archiveBackupRetentionPeriod) {
            this.archiveBackupRetentionPeriod = archiveBackupRetentionPeriod;
            return this;
        }

        /**
         * BackupInterval.
         */
        public Builder backupInterval(String backupInterval) {
            this.backupInterval = backupInterval;
            return this;
        }

        /**
         * BackupLog.
         */
        public Builder backupLog(String backupLog) {
            this.backupLog = backupLog;
            return this;
        }

        /**
         * BackupMethod.
         */
        public Builder backupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }

        /**
         * BackupRetentionPeriod.
         */
        public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * CompressType.
         */
        public Builder compressType(String compressType) {
            this.compressType = compressType;
            return this;
        }

        /**
         * EnableBackupLog.
         */
        public Builder enableBackupLog(String enableBackupLog) {
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * HighSpaceUsageProtection.
         */
        public Builder highSpaceUsageProtection(String highSpaceUsageProtection) {
            this.highSpaceUsageProtection = highSpaceUsageProtection;
            return this;
        }

        /**
         * LocalLogRetentionHours.
         */
        public Builder localLogRetentionHours(Integer localLogRetentionHours) {
            this.localLogRetentionHours = localLogRetentionHours;
            return this;
        }

        /**
         * LocalLogRetentionSpace.
         */
        public Builder localLogRetentionSpace(String localLogRetentionSpace) {
            this.localLogRetentionSpace = localLogRetentionSpace;
            return this;
        }

        /**
         * LogBackupFrequency.
         */
        public Builder logBackupFrequency(String logBackupFrequency) {
            this.logBackupFrequency = logBackupFrequency;
            return this;
        }

        /**
         * LogBackupLocalRetentionNumber.
         */
        public Builder logBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
            this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
            return this;
        }

        /**
         * LogBackupRetentionPeriod.
         */
        public Builder logBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }

        /**
         * PreferredBackupPeriod.
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * PreferredBackupTime.
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
         * ReleasedKeepPolicy.
         */
        public Builder releasedKeepPolicy(String releasedKeepPolicy) {
            this.releasedKeepPolicy = releasedKeepPolicy;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SupportReleasedKeep.
         */
        public Builder supportReleasedKeep(Integer supportReleasedKeep) {
            this.supportReleasedKeep = supportReleasedKeep;
            return this;
        }

        /**
         * SupportVolumeShadowCopy.
         */
        public Builder supportVolumeShadowCopy(Integer supportVolumeShadowCopy) {
            this.supportVolumeShadowCopy = supportVolumeShadowCopy;
            return this;
        }

        public DescribeBackupPolicyResponseBody build() {
            return new DescribeBackupPolicyResponseBody(this);
        } 

    } 

}
