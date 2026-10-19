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
 * {@link DescribeAdvancedBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdvancedBackupPolicyResponseBody</p>
 */
public class DescribeAdvancedBackupPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdvancedBackupDataPolicies")
    private java.util.List<AdvancedBackupDataPolicies> advancedBackupDataPolicies;

    @com.aliyun.core.annotation.NameInMap("AdvancedBackupLogPolicies")
    private java.util.List<AdvancedBackupLogPolicies> advancedBackupLogPolicies;

    @com.aliyun.core.annotation.NameInMap("BackupRetentionPolicyOnClusterDeletion")
    private Integer backupRetentionPolicyOnClusterDeletion;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @com.aliyun.core.annotation.NameInMap("PreferredNextBackupTime")
    private String preferredNextBackupTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotBackupType")
    private String snapshotBackupType;

    private DescribeAdvancedBackupPolicyResponseBody(Builder builder) {
        this.advancedBackupDataPolicies = builder.advancedBackupDataPolicies;
        this.advancedBackupLogPolicies = builder.advancedBackupLogPolicies;
        this.backupRetentionPolicyOnClusterDeletion = builder.backupRetentionPolicyOnClusterDeletion;
        this.DBInstanceId = builder.DBInstanceId;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.preferredNextBackupTime = builder.preferredNextBackupTime;
        this.requestId = builder.requestId;
        this.snapshotBackupType = builder.snapshotBackupType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdvancedBackupPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedBackupDataPolicies
     */
    public java.util.List<AdvancedBackupDataPolicies> getAdvancedBackupDataPolicies() {
        return this.advancedBackupDataPolicies;
    }

    /**
     * @return advancedBackupLogPolicies
     */
    public java.util.List<AdvancedBackupLogPolicies> getAdvancedBackupLogPolicies() {
        return this.advancedBackupLogPolicies;
    }

    /**
     * @return backupRetentionPolicyOnClusterDeletion
     */
    public Integer getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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

    public static final class Builder {
        private java.util.List<AdvancedBackupDataPolicies> advancedBackupDataPolicies; 
        private java.util.List<AdvancedBackupLogPolicies> advancedBackupLogPolicies; 
        private Integer backupRetentionPolicyOnClusterDeletion; 
        private String DBInstanceId; 
        private String preferredBackupTime; 
        private String preferredNextBackupTime; 
        private String requestId; 
        private String snapshotBackupType; 

        private Builder() {
        } 

        private Builder(DescribeAdvancedBackupPolicyResponseBody model) {
            this.advancedBackupDataPolicies = model.advancedBackupDataPolicies;
            this.advancedBackupLogPolicies = model.advancedBackupLogPolicies;
            this.backupRetentionPolicyOnClusterDeletion = model.backupRetentionPolicyOnClusterDeletion;
            this.DBInstanceId = model.DBInstanceId;
            this.preferredBackupTime = model.preferredBackupTime;
            this.preferredNextBackupTime = model.preferredNextBackupTime;
            this.requestId = model.requestId;
            this.snapshotBackupType = model.snapshotBackupType;
        } 

        /**
         * <p>The list of backup policies.</p>
         */
        public Builder advancedBackupDataPolicies(java.util.List<AdvancedBackupDataPolicies> advancedBackupDataPolicies) {
            this.advancedBackupDataPolicies = advancedBackupDataPolicies;
            return this;
        }

        /**
         * <p>The list of log backup policies.</p>
         */
        public Builder advancedBackupLogPolicies(java.util.List<AdvancedBackupLogPolicies> advancedBackupLogPolicies) {
            this.advancedBackupLogPolicies = advancedBackupLogPolicies;
            return this;
        }

        /**
         * <p>The data retention policy. Valid values:</p>
         * <ul>
         * <li>0: All backup sets of the instance are immediately deleted when the instance is released.</li>
         * <li>1: The last backup set is retained for long-term retention (LTR) when the instance is released.</li>
         * <li>2: All backup sets are retained for long-term retention (LTR) when the instance is released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder backupRetentionPolicyOnClusterDeletion(Integer backupRetentionPolicyOnClusterDeletion) {
            this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp14bf67a76d****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The backup time in the <i>HH:mm</i>Z-<i>HH:mm</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>09:00Z-10:00Z</p>
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * <p>The time range for starting a backup. The time is in the <code>HH:mmZ-HH:mmZ</code> format (UTC). Example: 01:00Z-02:00Z. The backup starts within this time range.</p>
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
         * <p>111E7B16-0A87-4CBA-B271-F34AD61E099F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The snapshot backup type. Valid values:</p>
         * <ul>
         * <li><strong>Flash</strong>: backup within seconds</li>
         * <li><strong>Standard</strong>: standard backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder snapshotBackupType(String snapshotBackupType) {
            this.snapshotBackupType = snapshotBackupType;
            return this;
        }

        public DescribeAdvancedBackupPolicyResponseBody build() {
            return new DescribeAdvancedBackupPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAdvancedBackupPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAdvancedBackupPolicyResponseBody</p>
     */
    public static class AdvancedBackupDataPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("BackupPolicy")
        private String backupPolicy;

        @com.aliyun.core.annotation.NameInMap("DestRegion")
        private String destRegion;

        @com.aliyun.core.annotation.NameInMap("DestType")
        private String destType;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PreferredBackupPeriod")
        private String preferredBackupPeriod;

        @com.aliyun.core.annotation.NameInMap("PreserveOneEachHour")
        private Boolean preserveOneEachHour;

        @com.aliyun.core.annotation.NameInMap("RetentionPeriod")
        private Integer retentionPeriod;

        @com.aliyun.core.annotation.NameInMap("RetentionType")
        private String retentionType;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("SrcType")
        private String srcType;

        private AdvancedBackupDataPolicies(Builder builder) {
            this.actionType = builder.actionType;
            this.backupPolicy = builder.backupPolicy;
            this.destRegion = builder.destRegion;
            this.destType = builder.destType;
            this.policyId = builder.policyId;
            this.preferredBackupPeriod = builder.preferredBackupPeriod;
            this.preserveOneEachHour = builder.preserveOneEachHour;
            this.retentionPeriod = builder.retentionPeriod;
            this.retentionType = builder.retentionType;
            this.srcRegion = builder.srcRegion;
            this.srcType = builder.srcType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedBackupDataPolicies create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        /**
         * @return backupPolicy
         */
        public String getBackupPolicy() {
            return this.backupPolicy;
        }

        /**
         * @return destRegion
         */
        public String getDestRegion() {
            return this.destRegion;
        }

        /**
         * @return destType
         */
        public String getDestType() {
            return this.destType;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return preferredBackupPeriod
         */
        public String getPreferredBackupPeriod() {
            return this.preferredBackupPeriod;
        }

        /**
         * @return preserveOneEachHour
         */
        public Boolean getPreserveOneEachHour() {
            return this.preserveOneEachHour;
        }

        /**
         * @return retentionPeriod
         */
        public Integer getRetentionPeriod() {
            return this.retentionPeriod;
        }

        /**
         * @return retentionType
         */
        public String getRetentionType() {
            return this.retentionType;
        }

        /**
         * @return srcRegion
         */
        public String getSrcRegion() {
            return this.srcRegion;
        }

        /**
         * @return srcType
         */
        public String getSrcType() {
            return this.srcType;
        }

        public static final class Builder {
            private String actionType; 
            private String backupPolicy; 
            private String destRegion; 
            private String destType; 
            private String policyId; 
            private String preferredBackupPeriod; 
            private Boolean preserveOneEachHour; 
            private Integer retentionPeriod; 
            private String retentionType; 
            private String srcRegion; 
            private String srcType; 

            private Builder() {
            } 

            private Builder(AdvancedBackupDataPolicies model) {
                this.actionType = model.actionType;
                this.backupPolicy = model.backupPolicy;
                this.destRegion = model.destRegion;
                this.destType = model.destType;
                this.policyId = model.policyId;
                this.preferredBackupPeriod = model.preferredBackupPeriod;
                this.preserveOneEachHour = model.preserveOneEachHour;
                this.retentionPeriod = model.retentionPeriod;
                this.retentionType = model.retentionType;
                this.srcRegion = model.srcRegion;
                this.srcType = model.srcType;
            } 

            /**
             * <p>The action type.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>The scheduling type of the advanced policy. Valid values:</p>
             * <ul>
             * <li>dayOfWeek: weekly scheduling</li>
             * <li>dayOfMonth: monthly scheduling</li>
             * <li>dayOfYear: yearly scheduling</li>
             * <li>backupInterval: fixed-interval scheduling (high-frequency backup)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dayOfWeek</p>
             */
            public Builder backupPolicy(String backupPolicy) {
                this.backupPolicy = backupPolicy;
                return this;
            }

            /**
             * <p>The destination region of the backup policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * <p>The destination type of the backup policy. Valid values:</p>
             * <ul>
             * <li>level1: same-region backup</li>
             * <li>level2Cross: cross-region backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>level1</p>
             */
            public Builder destType(String destType) {
                this.destType = destType;
                return this;
            }

            /**
             * <p>The ID of the backup policy.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The backup cycle. </p>
             * <ul>
             * <li>When <strong>BackupPolicy</strong> is set to <strong>dayOfWeek</strong>, the values 1, 2, 3, 4, 5, 6, and 7 represent Monday to Sunday.</li>
             * <li>When <strong>BackupPolicy</strong> is set to <strong>dayOfMonth</strong>, the values 1, 3, and -1 represent the 1st, 3rd, and last day of each month.</li>
             * <li>When <strong>BackupPolicy</strong> is set to <strong>dayOfYear</strong>, the value 01-07 represents January 7.</li>
             * <li>When <strong>BackupPolicy</strong> is set to <strong>backupInterval</strong>, the value 30 represents a backup every 30 minutes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1,2,3</p>
             */
            public Builder preferredBackupPeriod(String preferredBackupPeriod) {
                this.preferredBackupPeriod = preferredBackupPeriod;
                return this;
            }

            /**
             * <p>Specifies whether to enable sparse backup within an hour. Valid values:</p>
             * <ul>
             * <li>true: When the backup frequency is minute-level, all snapshots taken within 1 hour from the current time are retained. For snapshots taken more than 1 hour but within 24 hours from the current time, only the first snapshot after each hour is retained.</li>
             * <li>false: Sparse backup within an hour is disabled. All snapshots within the retention period of high-frequency backups are retained.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder preserveOneEachHour(Boolean preserveOneEachHour) {
                this.preserveOneEachHour = preserveOneEachHour;
                return this;
            }

            /**
             * <p>The number of days for which backups are retained.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder retentionPeriod(Integer retentionPeriod) {
                this.retentionPeriod = retentionPeriod;
                return this;
            }

            /**
             * <p>The retention epoch type of the backup set. Valid values:</p>
             * <ul>
             * <li><strong>never</strong>: long-term retention (LTR)</li>
             * <li><strong>delay</strong>: fixed-day retention</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>delay</p>
             */
            public Builder retentionType(String retentionType) {
                this.retentionType = retentionType;
                return this;
            }

            /**
             * <p>The region where the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * <p>The source type of the backup policy. Valid values:</p>
             * <ul>
             * <li>db: same-region backup</li>
             * <li>level1: cross-region backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>db</p>
             */
            public Builder srcType(String srcType) {
                this.srcType = srcType;
                return this;
            }

            public AdvancedBackupDataPolicies build() {
                return new AdvancedBackupDataPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAdvancedBackupPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAdvancedBackupPolicyResponseBody</p>
     */
    public static class AdvancedBackupLogPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestRegion")
        private String destRegion;

        @com.aliyun.core.annotation.NameInMap("DestType")
        private String destType;

        @com.aliyun.core.annotation.NameInMap("EnableLogBackup")
        private Integer enableLogBackup;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("RetentionPeriod")
        private String retentionPeriod;

        @com.aliyun.core.annotation.NameInMap("RetentionType")
        private String retentionType;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("SrcType")
        private String srcType;

        private AdvancedBackupLogPolicies(Builder builder) {
            this.destRegion = builder.destRegion;
            this.destType = builder.destType;
            this.enableLogBackup = builder.enableLogBackup;
            this.policyId = builder.policyId;
            this.retentionPeriod = builder.retentionPeriod;
            this.retentionType = builder.retentionType;
            this.srcRegion = builder.srcRegion;
            this.srcType = builder.srcType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedBackupLogPolicies create() {
            return builder().build();
        }

        /**
         * @return destRegion
         */
        public String getDestRegion() {
            return this.destRegion;
        }

        /**
         * @return destType
         */
        public String getDestType() {
            return this.destType;
        }

        /**
         * @return enableLogBackup
         */
        public Integer getEnableLogBackup() {
            return this.enableLogBackup;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return retentionPeriod
         */
        public String getRetentionPeriod() {
            return this.retentionPeriod;
        }

        /**
         * @return retentionType
         */
        public String getRetentionType() {
            return this.retentionType;
        }

        /**
         * @return srcRegion
         */
        public String getSrcRegion() {
            return this.srcRegion;
        }

        /**
         * @return srcType
         */
        public String getSrcType() {
            return this.srcType;
        }

        public static final class Builder {
            private String destRegion; 
            private String destType; 
            private Integer enableLogBackup; 
            private String policyId; 
            private String retentionPeriod; 
            private String retentionType; 
            private String srcRegion; 
            private String srcType; 

            private Builder() {
            } 

            private Builder(AdvancedBackupLogPolicies model) {
                this.destRegion = model.destRegion;
                this.destType = model.destType;
                this.enableLogBackup = model.enableLogBackup;
                this.policyId = model.policyId;
                this.retentionPeriod = model.retentionPeriod;
                this.retentionType = model.retentionType;
                this.srcRegion = model.srcRegion;
                this.srcType = model.srcType;
            } 

            /**
             * <p>The destination region of the log backup policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-guangzhou</p>
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * <p>The destination type of the log backup policy. Valid values:</p>
             * <ul>
             * <li>level1: same-region backup</li>
             * <li>level2Cross: cross-region backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder destType(String destType) {
                this.destType = destType;
                return this;
            }

            /**
             * <p>Specifies whether log backup is enabled. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: enabled</li>
             * <li><strong>0</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enableLogBackup(Integer enableLogBackup) {
                this.enableLogBackup = enableLogBackup;
                return this;
            }

            /**
             * <p>The ID of the log backup policy. This parameter is returned only for cross-region log backup policies.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The number of days for which log backups are retained. This parameter takes effect only when RetentionType is set to delay.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder retentionPeriod(String retentionPeriod) {
                this.retentionPeriod = retentionPeriod;
                return this;
            }

            /**
             * <p>The retention epoch type of log backups. Valid values:</p>
             * <ul>
             * <li><strong>never</strong>: long-term retention (LTR)</li>
             * <li><strong>delay</strong>: fixed-day retention</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>delay</p>
             */
            public Builder retentionType(String retentionType) {
                this.retentionType = retentionType;
                return this;
            }

            /**
             * <p>The region where the source instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * <p>The source type of the log backup policy. Valid values:</p>
             * <ul>
             * <li>db: same-region backup</li>
             * <li>level1: cross-region backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>et</p>
             */
            public Builder srcType(String srcType) {
                this.srcType = srcType;
                return this;
            }

            public AdvancedBackupLogPolicies build() {
                return new AdvancedBackupLogPolicies(this);
            } 

        } 

    }
}
