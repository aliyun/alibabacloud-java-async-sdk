// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupLocalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupLocalResponseBody</p>
 */
public class DescribeBackupLocalResponseBody extends TeaModel {
    @NameInMap("BackupPolicyDO")
    private BackupPolicyDO backupPolicyDO;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeBackupLocalResponseBody(Builder builder) {
        this.backupPolicyDO = builder.backupPolicyDO;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupLocalResponseBody create() {
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
         * The information about the backup policy.
         */
        public Builder backupPolicyDO(BackupPolicyDO backupPolicyDO) {
            this.backupPolicyDO = backupPolicyDO;
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
         * The result of the request.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeBackupLocalResponseBody build() {
            return new DescribeBackupLocalResponseBody(this);
        } 

    } 

    public static class BackupPolicyDO extends TeaModel {
        @NameInMap("BackupAppName")
        private String backupAppName;

        @NameInMap("BackupDbName")
        private String backupDbName;

        @NameInMap("BackupLevel")
        private String backupLevel;

        @NameInMap("BackupLog")
        private String backupLog;

        @NameInMap("BackupMode")
        private String backupMode;

        @NameInMap("BackupPolicyMode")
        private String backupPolicyMode;

        @NameInMap("BackupRetentionPeriod")
        private Long backupRetentionPeriod;

        @NameInMap("BackupType")
        private String backupType;

        @NameInMap("DataBackupRetentionPeriod")
        private Long dataBackupRetentionPeriod;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("HighSpaceUsageProtection")
        private Long highSpaceUsageProtection;

        @NameInMap("LocalLogRetentionHours")
        private Long localLogRetentionHours;

        @NameInMap("LocalLogRetentionSpace")
        private Long localLogRetentionSpace;

        @NameInMap("LogBackupRetentionPeriod")
        private Long logBackupRetentionPeriod;

        @NameInMap("NextBackupActuallyTime")
        private String nextBackupActuallyTime;

        @NameInMap("PreferredBackupPeriod")
        private String preferredBackupPeriod;

        @NameInMap("PreferredBackupTime")
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
             * No value is returned.
             */
            public Builder backupAppName(String backupAppName) {
                this.backupAppName = backupAppName;
                return this;
            }

            /**
             * No value is returned.
             */
            public Builder backupDbName(String backupDbName) {
                this.backupDbName = backupDbName;
                return this;
            }

            /**
             * No value is returned.
             */
            public Builder backupLevel(String backupLevel) {
                this.backupLevel = backupLevel;
                return this;
            }

            /**
             * No value is returned.
             */
            public Builder backupLog(String backupLog) {
                this.backupLog = backupLog;
                return this;
            }

            /**
             * No value is returned.
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * No value is returned.
             */
            public Builder backupPolicyMode(String backupPolicyMode) {
                this.backupPolicyMode = backupPolicyMode;
                return this;
            }

            /**
             * No value is returned.
             */
            public Builder backupRetentionPeriod(Long backupRetentionPeriod) {
                this.backupRetentionPeriod = backupRetentionPeriod;
                return this;
            }

            /**
             * No value is returned.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * No value is returned.
             */
            public Builder dataBackupRetentionPeriod(Long dataBackupRetentionPeriod) {
                this.dataBackupRetentionPeriod = dataBackupRetentionPeriod;
                return this;
            }

            /**
             * No value is returned.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * No value is returned.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Indicates whether the feature is enabled to forcibly delete binary log files if the used storage space of the instance exceeds 90% of the total storage space or the remaining storage space is less than 5 GB. Valid values:
             * <p>
             * 
             * *   1: The feature is enabled.
             * *   0: The feature is disabled.
             */
            public Builder highSpaceUsageProtection(Long highSpaceUsageProtection) {
                this.highSpaceUsageProtection = highSpaceUsageProtection;
                return this;
            }

            /**
             * The number of hours for which log backup files are retained on the instance. Valid values: 0 to 168. Default value: **18**. The value **0** indicates that log backup files are not retained.
             */
            public Builder localLogRetentionHours(Long localLogRetentionHours) {
                this.localLogRetentionHours = localLogRetentionHours;
                return this;
            }

            /**
             * The maximum storage usage that is allowed for local log files. Valid values: 0 to 50. Default value: 30.
             */
            public Builder localLogRetentionSpace(Long localLogRetentionSpace) {
                this.localLogRetentionSpace = localLogRetentionSpace;
                return this;
            }

            /**
             * No value is returned.
             */
            public Builder logBackupRetentionPeriod(Long logBackupRetentionPeriod) {
                this.logBackupRetentionPeriod = logBackupRetentionPeriod;
                return this;
            }

            /**
             * No value is returned.
             */
            public Builder nextBackupActuallyTime(String nextBackupActuallyTime) {
                this.nextBackupActuallyTime = nextBackupActuallyTime;
                return this;
            }

            /**
             * No value is returned.
             */
            public Builder preferredBackupPeriod(String preferredBackupPeriod) {
                this.preferredBackupPeriod = preferredBackupPeriod;
                return this;
            }

            /**
             * No value is returned.
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
