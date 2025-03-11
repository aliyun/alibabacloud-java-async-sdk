// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
    @com.aliyun.core.annotation.NameInMap("BackupPolicyDO")
    private BackupPolicyDO backupPolicyDO;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeBackupPolicyResponseBody(Builder builder) {
        this.backupPolicyDO = builder.backupPolicyDO;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupPolicyDO
     */
    public BackupPolicyDO getBackupPolicyDO() {
        return this.backupPolicyDO;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private BackupPolicyDO backupPolicyDO; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The information about the backup policy.</p>
         */
        public Builder backupPolicyDO(BackupPolicyDO backupPolicyDO) {
            this.backupPolicyDO = backupPolicyDO;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8FAF3989-79CD-4A67-8FFD-97899B64****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeBackupPolicyResponseBody build() {
            return new DescribeBackupPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPolicyResponseBody</p>
     */
    public static class BackupPolicyDO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupAppName")
        private String backupAppName;

        @com.aliyun.core.annotation.NameInMap("BackupDbName")
        private String backupDbName;

        @com.aliyun.core.annotation.NameInMap("BackupLevel")
        private String backupLevel;

        @com.aliyun.core.annotation.NameInMap("BackupLog")
        private String backupLog;

        @com.aliyun.core.annotation.NameInMap("BackupMode")
        private String backupMode;

        @com.aliyun.core.annotation.NameInMap("BackupPolicyMode")
        private String backupPolicyMode;

        @com.aliyun.core.annotation.NameInMap("BackupRetentionPeriod")
        private Long backupRetentionPeriod;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("DataBackupRetentionPeriod")
        private Long dataBackupRetentionPeriod;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("HighSpaceUsageProtection")
        private Long highSpaceUsageProtection;

        @com.aliyun.core.annotation.NameInMap("LocalLogRetentionHours")
        private Long localLogRetentionHours;

        @com.aliyun.core.annotation.NameInMap("LocalLogRetentionSpace")
        private Long localLogRetentionSpace;

        @com.aliyun.core.annotation.NameInMap("LogBackupRetentionPeriod")
        private Long logBackupRetentionPeriod;

        @com.aliyun.core.annotation.NameInMap("NextBackupActuallyTime")
        private String nextBackupActuallyTime;

        @com.aliyun.core.annotation.NameInMap("PreferredBackupPeriod")
        private String preferredBackupPeriod;

        @com.aliyun.core.annotation.NameInMap("PreferredBackupTime")
        private String preferredBackupTime;

        private BackupPolicyDO(Builder builder) {
            this.backupAppName = builder.backupAppName;
            this.backupDbName = builder.backupDbName;
            this.backupLevel = builder.backupLevel;
            this.backupLog = builder.backupLog;
            this.backupMode = builder.backupMode;
            this.backupPolicyMode = builder.backupPolicyMode;
            this.backupRetentionPeriod = builder.backupRetentionPeriod;
            this.backupType = builder.backupType;
            this.dataBackupRetentionPeriod = builder.dataBackupRetentionPeriod;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.highSpaceUsageProtection = builder.highSpaceUsageProtection;
            this.localLogRetentionHours = builder.localLogRetentionHours;
            this.localLogRetentionSpace = builder.localLogRetentionSpace;
            this.logBackupRetentionPeriod = builder.logBackupRetentionPeriod;
            this.nextBackupActuallyTime = builder.nextBackupActuallyTime;
            this.preferredBackupPeriod = builder.preferredBackupPeriod;
            this.preferredBackupTime = builder.preferredBackupTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupPolicyDO create() {
            return builder().build();
        }

        /**
         * @return backupAppName
         */
        public String getBackupAppName() {
            return this.backupAppName;
        }

        /**
         * @return backupDbName
         */
        public String getBackupDbName() {
            return this.backupDbName;
        }

        /**
         * @return backupLevel
         */
        public String getBackupLevel() {
            return this.backupLevel;
        }

        /**
         * @return backupLog
         */
        public String getBackupLog() {
            return this.backupLog;
        }

        /**
         * @return backupMode
         */
        public String getBackupMode() {
            return this.backupMode;
        }

        /**
         * @return backupPolicyMode
         */
        public String getBackupPolicyMode() {
            return this.backupPolicyMode;
        }

        /**
         * @return backupRetentionPeriod
         */
        public Long getBackupRetentionPeriod() {
            return this.backupRetentionPeriod;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return dataBackupRetentionPeriod
         */
        public Long getDataBackupRetentionPeriod() {
            return this.dataBackupRetentionPeriod;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return highSpaceUsageProtection
         */
        public Long getHighSpaceUsageProtection() {
            return this.highSpaceUsageProtection;
        }

        /**
         * @return localLogRetentionHours
         */
        public Long getLocalLogRetentionHours() {
            return this.localLogRetentionHours;
        }

        /**
         * @return localLogRetentionSpace
         */
        public Long getLocalLogRetentionSpace() {
            return this.localLogRetentionSpace;
        }

        /**
         * @return logBackupRetentionPeriod
         */
        public Long getLogBackupRetentionPeriod() {
            return this.logBackupRetentionPeriod;
        }

        /**
         * @return nextBackupActuallyTime
         */
        public String getNextBackupActuallyTime() {
            return this.nextBackupActuallyTime;
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

        public static final class Builder {
            private String backupAppName; 
            private String backupDbName; 
            private String backupLevel; 
            private String backupLog; 
            private String backupMode; 
            private String backupPolicyMode; 
            private Long backupRetentionPeriod; 
            private String backupType; 
            private Long dataBackupRetentionPeriod; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long highSpaceUsageProtection; 
            private Long localLogRetentionHours; 
            private Long localLogRetentionSpace; 
            private Long logBackupRetentionPeriod; 
            private String nextBackupActuallyTime; 
            private String preferredBackupPeriod; 
            private String preferredBackupTime; 

            /**
             * <p>No value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder backupAppName(String backupAppName) {
                this.backupAppName = backupAppName;
                return this;
            }

            /**
             * <p>No value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder backupDbName(String backupDbName) {
                this.backupDbName = backupDbName;
                return this;
            }

            /**
             * <p>The backup level. Valid values:</p>
             * <ul>
             * <li><strong>db</strong>: database backup</li>
             * <li><strong>instance</strong>: instance backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder backupLevel(String backupLevel) {
                this.backupLevel = backupLevel;
                return this;
            }

            /**
             * <p>Indicates whether the log backup feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The log backup feature is enabled.</li>
             * <li><strong>0</strong>: The log backup feature is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder backupLog(String backupLog) {
                this.backupLog = backupLog;
                return this;
            }

            /**
             * <p>The backup mode. Valid values:</p>
             * <ul>
             * <li><strong>logic</strong>: logical backup</li>
             * <li><strong>phy</strong>: fast backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>phy</p>
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * <p>The type of the backup policy. Valid values:</p>
             * <ul>
             * <li><strong>DataBackupPolicy</strong>: a data backup policy</li>
             * <li><strong>LogBackupPolicy</strong>: a log backup policy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DataBackupPolicy</p>
             */
            public Builder backupPolicyMode(String backupPolicyMode) {
                this.backupPolicyMode = backupPolicyMode;
                return this;
            }

            /**
             * <p>The retention period of backup files. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder backupRetentionPeriod(Long backupRetentionPeriod) {
                this.backupRetentionPeriod = backupRetentionPeriod;
                return this;
            }

            /**
             * <p>No value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The retention period of data backup files. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataBackupRetentionPeriod(Long dataBackupRetentionPeriod) {
                this.dataBackupRetentionPeriod = dataBackupRetentionPeriod;
                return this;
            }

            /**
             * <p>No value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>No value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>No value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder highSpaceUsageProtection(Long highSpaceUsageProtection) {
                this.highSpaceUsageProtection = highSpaceUsageProtection;
                return this;
            }

            /**
             * <p>No value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder localLogRetentionHours(Long localLogRetentionHours) {
                this.localLogRetentionHours = localLogRetentionHours;
                return this;
            }

            /**
             * <p>No value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder localLogRetentionSpace(Long localLogRetentionSpace) {
                this.localLogRetentionSpace = localLogRetentionSpace;
                return this;
            }

            /**
             * <p>The retention period of log backup files. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder logBackupRetentionPeriod(Long logBackupRetentionPeriod) {
                this.logBackupRetentionPeriod = logBackupRetentionPeriod;
                return this;
            }

            /**
             * <p>No value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder nextBackupActuallyTime(String nextBackupActuallyTime) {
                this.nextBackupActuallyTime = nextBackupActuallyTime;
                return this;
            }

            /**
             * <p>The backup cycle. You can specify multiple backup cycles. Separate multiple backup cycles with commas (,). Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: every Monday</li>
             * <li><strong>1</strong>: every Tuesday</li>
             * <li><strong>2</strong>: every Wednesday</li>
             * <li><strong>3</strong>: every Thursday</li>
             * <li><strong>4</strong>: every Friday</li>
             * <li><strong>5</strong>: every Saturday</li>
             * <li><strong>6</strong>: every Sunday</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1,4</p>
             */
            public Builder preferredBackupPeriod(String preferredBackupPeriod) {
                this.preferredBackupPeriod = preferredBackupPeriod;
                return this;
            }

            /**
             * <p>The time range in which a backup is performed. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>22:00:00-23:00:00</p>
             */
            public Builder preferredBackupTime(String preferredBackupTime) {
                this.preferredBackupTime = preferredBackupTime;
                return this;
            }

            public BackupPolicyDO build() {
                return new BackupPolicyDO(this);
            } 

        } 

    }
}
