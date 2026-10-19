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
 * {@link ModifyAdvancedBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyAdvancedBackupPolicyRequest</p>
 */
public class ModifyAdvancedBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdvancedBackupDataPolicies")
    private java.util.List<AdvancedBackupDataPolicies> advancedBackupDataPolicies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdvancedBackupLogPolicies")
    private java.util.List<AdvancedBackupLogPolicies> advancedBackupLogPolicies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupRetentionPolicyOnClusterDeletion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer backupRetentionPolicyOnClusterDeletion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotBackupType")
    private String snapshotBackupType;

    private ModifyAdvancedBackupPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.advancedBackupDataPolicies = builder.advancedBackupDataPolicies;
        this.advancedBackupLogPolicies = builder.advancedBackupLogPolicies;
        this.backupRetentionPolicyOnClusterDeletion = builder.backupRetentionPolicyOnClusterDeletion;
        this.DBInstanceId = builder.DBInstanceId;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.snapshotBackupType = builder.snapshotBackupType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAdvancedBackupPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return snapshotBackupType
     */
    public String getSnapshotBackupType() {
        return this.snapshotBackupType;
    }

    public static final class Builder extends Request.Builder<ModifyAdvancedBackupPolicyRequest, Builder> {
        private String regionId; 
        private java.util.List<AdvancedBackupDataPolicies> advancedBackupDataPolicies; 
        private java.util.List<AdvancedBackupLogPolicies> advancedBackupLogPolicies; 
        private Integer backupRetentionPolicyOnClusterDeletion; 
        private String DBInstanceId; 
        private String preferredBackupTime; 
        private String snapshotBackupType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAdvancedBackupPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.advancedBackupDataPolicies = request.advancedBackupDataPolicies;
            this.advancedBackupLogPolicies = request.advancedBackupLogPolicies;
            this.backupRetentionPolicyOnClusterDeletion = request.backupRetentionPolicyOnClusterDeletion;
            this.DBInstanceId = request.DBInstanceId;
            this.preferredBackupTime = request.preferredBackupTime;
            this.snapshotBackupType = request.snapshotBackupType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of backup policies.</p>
         */
        public Builder advancedBackupDataPolicies(java.util.List<AdvancedBackupDataPolicies> advancedBackupDataPolicies) {
            String advancedBackupDataPoliciesShrink = shrink(advancedBackupDataPolicies, "AdvancedBackupDataPolicies", "json");
            this.putQueryParameter("AdvancedBackupDataPolicies", advancedBackupDataPoliciesShrink);
            this.advancedBackupDataPolicies = advancedBackupDataPolicies;
            return this;
        }

        /**
         * <p>The list of log backup policies.</p>
         */
        public Builder advancedBackupLogPolicies(java.util.List<AdvancedBackupLogPolicies> advancedBackupLogPolicies) {
            String advancedBackupLogPoliciesShrink = shrink(advancedBackupLogPolicies, "AdvancedBackupLogPolicies", "json");
            this.putQueryParameter("AdvancedBackupLogPolicies", advancedBackupLogPoliciesShrink);
            this.advancedBackupLogPolicies = advancedBackupLogPolicies;
            return this;
        }

        /**
         * <p>The backup retention policy. Valid values:</p>
         * <ul>
         * <li>0: All backup sets of the instance are deleted immediately when the instance is released.</li>
         * <li>1: The last backup set is retained for long-term retention (LTR) when the instance is released.</li>
         * <li>2: All backup sets are retained for long-term retention (LTR) when the instance is released.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder backupRetentionPolicyOnClusterDeletion(Integer backupRetentionPolicyOnClusterDeletion) {
            this.putQueryParameter("BackupRetentionPolicyOnClusterDeletion", backupRetentionPolicyOnClusterDeletion);
            this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-2zeb2d64cb46xxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The time period during which the backup is performed. The format is <i>HH:mm</i>Z-<i>HH:mm</i>Z (UTC).</p>
         * <blockquote>
         * <p>The time range is limited to 1 hour.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>09:00Z-10:00Z</p>
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.putQueryParameter("PreferredBackupTime", preferredBackupTime);
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * <p>The snapshot backup type. Valid values:</p>
         * <ul>
         * <li><strong>Flash</strong>: backup within seconds.</li>
         * <li><strong>Standard</strong>: standard backup. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder snapshotBackupType(String snapshotBackupType) {
            this.putQueryParameter("SnapshotBackupType", snapshotBackupType);
            this.snapshotBackupType = snapshotBackupType;
            return this;
        }

        @Override
        public ModifyAdvancedBackupPolicyRequest build() {
            return new ModifyAdvancedBackupPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyAdvancedBackupPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyAdvancedBackupPolicyRequest</p>
     */
    public static class AdvancedBackupDataPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The action. Valid values:</p>
             * <ul>
             * <li><strong>CREATE</strong>: Creates a policy.</li>
             * <li><strong>UPDATE</strong>: Updates a policy.</li>
             * <li><strong>DELETE</strong>: Deletes a policy. If this value is specified, only the PolicyId parameter is required.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE</p>
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>The scheduling type of the advanced policy. Valid values:</p>
             * <ul>
             * <li>dayOfWeek: scheduled by week.</li>
             * <li>dayOfMonth: scheduled by month.</li>
             * <li>dayOfYear: scheduled by year.</li>
             * <li>backupInterval: scheduled at a fixed interval (high-frequency backup).</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>Multiple high-frequency backup policies are not supported.</li>
             * <li>Multiple geo-redundancy backups are not supported, and geo-redundancy policies only support dayOfWeek.</li>
             * </ul>
             * </blockquote>
             * <blockquote>
             * <p>Notice: Required when ActionType is not DELETE.</p>
             * </blockquote>
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
             * <blockquote>
             * <p>Notice: Required when ActionType is not DELETE.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-guangzhou</p>
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * <p>The destination type of the backup policy. Valid values:</p>
             * <ul>
             * <li>level1: same-region backup.</li>
             * <li>level2Cross: cross-region backup.</li>
             * </ul>
             * <blockquote>
             * <p>Notice: Required when ActionType is not DELETE.</p>
             * </blockquote>
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
             * <blockquote>
             * <p>Notice: Required when ActionType is not CREATE.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The backup cycle. Valid values:</p>
             * <ul>
             * <li>When BackupPolicy is set to dayOfWeek: 1, 2, 3, 4, 5, 6, and 7 represent Monday to Sunday. At least two backups must be performed per week.</li>
             * <li>When BackupPolicy is set to dayOfMonth: 1, 3, and -1 represent the 1st, 3rd, and last day of each month. -1 represents the last day of the month.</li>
             * <li>When BackupPolicy is set to dayOfYear: 01-07 represents January 7. Only one day can be selected.</li>
             * <li>When BackupPolicy is set to backupInterval: specify one of the following numbers in minutes. For sharded clusters, the valid values are 30, 60, 120, 180, 240, 360, 480, and 720. For replica sets, the valid values are 15, 30, 60, 120, 180, 240, 360, 480, and 720.</li>
             * </ul>
             * <p>Note:</p>
             * <blockquote>
             * <p>Notice: Required when ActionType is not DELETE.
             * Geo-redundancy policies only support dayOfWeek.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1,4,6</p>
             */
            public Builder preferredBackupPeriod(String preferredBackupPeriod) {
                this.preferredBackupPeriod = preferredBackupPeriod;
                return this;
            }

            /**
             * <p>Specifies whether to enable hourly sparse backup. Valid values:</p>
             * <ul>
             * <li>true: When the backup frequency is in minutes, all snapshots taken within 1 hour from the current time are retained. For snapshots taken more than 1 hour but within 24 hours from the current time, only the first snapshot after the hour is retained.</li>
             * <li>false: All snapshots within the retention period of high-frequency backups are retained.</li>
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
             * <p>The retention period of the backup plan in days. Valid values:</p>
             * <ul>
             * <li>Same-region backup: 7 to 7300 days.</li>
             * <li>Geo-redundancy: 3 to 1825 days.</li>
             * </ul>
             * <blockquote>
             * <p>Notice: Required when RetentionType is set to delay.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder retentionPeriod(Integer retentionPeriod) {
                this.retentionPeriod = retentionPeriod;
                return this;
            }

            /**
             * <p>The retention cycle type of the backup set. Valid values:</p>
             * <ul>
             * <li><strong>never</strong>: long-term retention (LTR).</li>
             * <li><strong>delay</strong>: retention for a fixed number of days.</li>
             * </ul>
             * <blockquote>
             * <p>Notice: Required when ActionType is not DELETE.</p>
             * </blockquote>
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
             * <blockquote>
             * <p>Notice: Required when ActionType is not DELETE.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-guangzhou</p>
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * <p>The source type of the backup policy. Valid values:</p>
             * <ul>
             * <li>db: same-region backup.</li>
             * <li>level1: cross-region backup.</li>
             * </ul>
             * <blockquote>
             * <p>Notice: Required when ActionType is not DELETE.</p>
             * </blockquote>
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
     * {@link ModifyAdvancedBackupPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyAdvancedBackupPolicyRequest</p>
     */
    public static class AdvancedBackupLogPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("DestRegion")
        private String destRegion;

        @com.aliyun.core.annotation.NameInMap("DestType")
        private String destType;

        @com.aliyun.core.annotation.NameInMap("EnableLogBackup")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer enableLogBackup;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("RetentionPeriod")
        private Integer retentionPeriod;

        @com.aliyun.core.annotation.NameInMap("RetentionType")
        private String retentionType;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("SrcType")
        private String srcType;

        private AdvancedBackupLogPolicies(Builder builder) {
            this.actionType = builder.actionType;
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
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
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
            private String destRegion; 
            private String destType; 
            private Integer enableLogBackup; 
            private String policyId; 
            private Integer retentionPeriod; 
            private String retentionType; 
            private String srcRegion; 
            private String srcType; 

            private Builder() {
            } 

            private Builder(AdvancedBackupLogPolicies model) {
                this.actionType = model.actionType;
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
             * <p>The operation type. Valid values:</p>
             * <ul>
             * <li>CREATE: Creates a policy.</li>
             * <li>UPDATE: Updates a policy.</li>
             * </ul>
             * <blockquote>
             * <p>Notice: This parameter takes effect only for geo-redundancy. To delete geo-redundancy, set EnableLogBackup to 0 and set ActionType to UPDATE.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE</p>
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>The region where the geo-redundancy log backup is stored.</p>
             * <blockquote>
             * <p>Required for geo-redundancy.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-huhehaote</p>
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * <p>The destination type of the log backup policy. Valid values:</p>
             * <ul>
             * <li>level1: same-region backup. </li>
             * <li>level2Cross: cross-region backup.</li>
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
             * <p>Specifies whether to enable log backup. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: enabled.</li>
             * <li><strong>0</strong>: disabled.</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>Log backup must be enabled for sharded instances.</li>
             * <li>You must enable same-region log backup before you can enable cross-region log backup.</li>
             * </ul>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enableLogBackup(Integer enableLogBackup) {
                this.enableLogBackup = enableLogBackup;
                return this;
            }

            /**
             * <p>The ID of the log backup policy. This parameter is required only for cross-region log backup policies.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The retention period of the log backup in days. This parameter takes effect when RetentionType is set to delay. Valid values:</p>
             * <ul>
             * <li>Same-region backup: 7 to 7300 days. </li>
             * <li>Geo-redundancy: 3 to 1825 days. The value must be less than the backup retention period of the geo-redundancy policy.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder retentionPeriod(Integer retentionPeriod) {
                this.retentionPeriod = retentionPeriod;
                return this;
            }

            /**
             * <p>The retention cycle type of the log backup. Valid values:</p>
             * <ul>
             * <li><strong>never</strong>: long-term retention (LTR).</li>
             * <li><strong>delay</strong>: retention for a fixed number of days.</li>
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
             * <li>db: same-region backup.</li>
             * <li>level1: cross-region backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>db</p>
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
