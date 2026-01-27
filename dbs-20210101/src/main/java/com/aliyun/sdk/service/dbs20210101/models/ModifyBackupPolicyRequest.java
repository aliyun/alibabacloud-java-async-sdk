// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

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
 * {@link ModifyBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupPolicyRequest</p>
 */
public class ModifyBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdvanceDataPolicies")
    private java.util.List<AdvanceDataPolicies> advanceDataPolicies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdvanceIncPolicies")
    private java.util.List<AdvanceIncPolicies> advanceIncPolicies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdvanceLogPolicies")
    private java.util.List<AdvanceLogPolicies> advanceLogPolicies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMethod")
    private String backupMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPriority")
    private Integer backupPriority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupRetentionPolicyOnClusterDeletion")
    private String backupRetentionPolicyOnClusterDeletion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableIncBackup")
    private Boolean enableIncBackup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupWindowBegin")
    private String preferredBackupWindowBegin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionCode")
    private String regionCode;

    private ModifyBackupPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.advanceDataPolicies = builder.advanceDataPolicies;
        this.advanceIncPolicies = builder.advanceIncPolicies;
        this.advanceLogPolicies = builder.advanceLogPolicies;
        this.backupMethod = builder.backupMethod;
        this.backupPriority = builder.backupPriority;
        this.backupRetentionPolicyOnClusterDeletion = builder.backupRetentionPolicyOnClusterDeletion;
        this.category = builder.category;
        this.enableIncBackup = builder.enableIncBackup;
        this.instanceName = builder.instanceName;
        this.preferredBackupWindowBegin = builder.preferredBackupWindowBegin;
        this.regionCode = builder.regionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupPolicyRequest create() {
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
     * @return advanceDataPolicies
     */
    public java.util.List<AdvanceDataPolicies> getAdvanceDataPolicies() {
        return this.advanceDataPolicies;
    }

    /**
     * @return advanceIncPolicies
     */
    public java.util.List<AdvanceIncPolicies> getAdvanceIncPolicies() {
        return this.advanceIncPolicies;
    }

    /**
     * @return advanceLogPolicies
     */
    public java.util.List<AdvanceLogPolicies> getAdvanceLogPolicies() {
        return this.advanceLogPolicies;
    }

    /**
     * @return backupMethod
     */
    public String getBackupMethod() {
        return this.backupMethod;
    }

    /**
     * @return backupPriority
     */
    public Integer getBackupPriority() {
        return this.backupPriority;
    }

    /**
     * @return backupRetentionPolicyOnClusterDeletion
     */
    public String getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return enableIncBackup
     */
    public Boolean getEnableIncBackup() {
        return this.enableIncBackup;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return preferredBackupWindowBegin
     */
    public String getPreferredBackupWindowBegin() {
        return this.preferredBackupWindowBegin;
    }

    /**
     * @return regionCode
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    public static final class Builder extends Request.Builder<ModifyBackupPolicyRequest, Builder> {
        private String regionId; 
        private java.util.List<AdvanceDataPolicies> advanceDataPolicies; 
        private java.util.List<AdvanceIncPolicies> advanceIncPolicies; 
        private java.util.List<AdvanceLogPolicies> advanceLogPolicies; 
        private String backupMethod; 
        private Integer backupPriority; 
        private String backupRetentionPolicyOnClusterDeletion; 
        private String category; 
        private Boolean enableIncBackup; 
        private String instanceName; 
        private String preferredBackupWindowBegin; 
        private String regionCode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.advanceDataPolicies = request.advanceDataPolicies;
            this.advanceIncPolicies = request.advanceIncPolicies;
            this.advanceLogPolicies = request.advanceLogPolicies;
            this.backupMethod = request.backupMethod;
            this.backupPriority = request.backupPriority;
            this.backupRetentionPolicyOnClusterDeletion = request.backupRetentionPolicyOnClusterDeletion;
            this.category = request.category;
            this.enableIncBackup = request.enableIncBackup;
            this.instanceName = request.instanceName;
            this.preferredBackupWindowBegin = request.preferredBackupWindowBegin;
            this.regionCode = request.regionCode;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The details of data backup policies.</p>
         */
        public Builder advanceDataPolicies(java.util.List<AdvanceDataPolicies> advanceDataPolicies) {
            String advanceDataPoliciesShrink = shrink(advanceDataPolicies, "AdvanceDataPolicies", "json");
            this.putQueryParameter("AdvanceDataPolicies", advanceDataPoliciesShrink);
            this.advanceDataPolicies = advanceDataPolicies;
            return this;
        }

        /**
         * AdvanceIncPolicies.
         */
        public Builder advanceIncPolicies(java.util.List<AdvanceIncPolicies> advanceIncPolicies) {
            String advanceIncPoliciesShrink = shrink(advanceIncPolicies, "AdvanceIncPolicies", "json");
            this.putQueryParameter("AdvanceIncPolicies", advanceIncPoliciesShrink);
            this.advanceIncPolicies = advanceIncPolicies;
            return this;
        }

        /**
         * AdvanceLogPolicies.
         */
        public Builder advanceLogPolicies(java.util.List<AdvanceLogPolicies> advanceLogPolicies) {
            String advanceLogPoliciesShrink = shrink(advanceLogPolicies, "AdvanceLogPolicies", "json");
            this.putQueryParameter("AdvanceLogPolicies", advanceLogPoliciesShrink);
            this.advanceLogPolicies = advanceLogPolicies;
            return this;
        }

        /**
         * BackupMethod.
         */
        public Builder backupMethod(String backupMethod) {
            this.putQueryParameter("BackupMethod", backupMethod);
            this.backupMethod = backupMethod;
            return this;
        }

        /**
         * BackupPriority.
         */
        public Builder backupPriority(Integer backupPriority) {
            this.putQueryParameter("BackupPriority", backupPriority);
            this.backupPriority = backupPriority;
            return this;
        }

        /**
         * BackupRetentionPolicyOnClusterDeletion.
         */
        public Builder backupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
            this.putQueryParameter("BackupRetentionPolicyOnClusterDeletion", backupRetentionPolicyOnClusterDeletion);
            this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * EnableIncBackup.
         */
        public Builder enableIncBackup(Boolean enableIncBackup) {
            this.putQueryParameter("EnableIncBackup", enableIncBackup);
            this.enableIncBackup = enableIncBackup;
            return this;
        }

        /**
         * <p>The ID of the PolarDB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze3nrr64c5****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The start time of a basic backup.</p>
         * 
         * <strong>example:</strong>
         * <p>17:00Z</p>
         */
        public Builder preferredBackupWindowBegin(String preferredBackupWindowBegin) {
            this.putQueryParameter("PreferredBackupWindowBegin", preferredBackupWindowBegin);
            this.preferredBackupWindowBegin = preferredBackupWindowBegin;
            return this;
        }

        /**
         * <p>The region in which backup sets reside.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionCode(String regionCode) {
            this.putQueryParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
            return this;
        }

        @Override
        public ModifyBackupPolicyRequest build() {
            return new ModifyBackupPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyBackupPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyBackupPolicyRequest</p>
     */
    public static class AdvanceDataPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("DestRegion")
        private String destRegion;

        @com.aliyun.core.annotation.NameInMap("DestType")
        private String destType;

        @com.aliyun.core.annotation.NameInMap("FilterKey")
        private String filterKey;

        @com.aliyun.core.annotation.NameInMap("FilterType")
        private String filterType;

        @com.aliyun.core.annotation.NameInMap("FilterValue")
        private String filterValue;

        @com.aliyun.core.annotation.NameInMap("OnlyPreserveOneEachDay")
        private Boolean onlyPreserveOneEachDay;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("RetentionType")
        private String retentionType;

        @com.aliyun.core.annotation.NameInMap("RetentionValue")
        private String retentionValue;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("SrcType")
        private String srcType;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        private AdvanceDataPolicies(Builder builder) {
            this.actionType = builder.actionType;
            this.destRegion = builder.destRegion;
            this.destType = builder.destType;
            this.filterKey = builder.filterKey;
            this.filterType = builder.filterType;
            this.filterValue = builder.filterValue;
            this.onlyPreserveOneEachDay = builder.onlyPreserveOneEachDay;
            this.policyId = builder.policyId;
            this.retentionType = builder.retentionType;
            this.retentionValue = builder.retentionValue;
            this.srcRegion = builder.srcRegion;
            this.srcType = builder.srcType;
            this.storageClass = builder.storageClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvanceDataPolicies create() {
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
         * @return filterKey
         */
        public String getFilterKey() {
            return this.filterKey;
        }

        /**
         * @return filterType
         */
        public String getFilterType() {
            return this.filterType;
        }

        /**
         * @return filterValue
         */
        public String getFilterValue() {
            return this.filterValue;
        }

        /**
         * @return onlyPreserveOneEachDay
         */
        public Boolean getOnlyPreserveOneEachDay() {
            return this.onlyPreserveOneEachDay;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return retentionType
         */
        public String getRetentionType() {
            return this.retentionType;
        }

        /**
         * @return retentionValue
         */
        public String getRetentionValue() {
            return this.retentionValue;
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

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        public static final class Builder {
            private String actionType; 
            private String destRegion; 
            private String destType; 
            private String filterKey; 
            private String filterType; 
            private String filterValue; 
            private Boolean onlyPreserveOneEachDay; 
            private String policyId; 
            private String retentionType; 
            private String retentionValue; 
            private String srcRegion; 
            private String srcType; 
            private String storageClass; 

            private Builder() {
            } 

            private Builder(AdvanceDataPolicies model) {
                this.actionType = model.actionType;
                this.destRegion = model.destRegion;
                this.destType = model.destType;
                this.filterKey = model.filterKey;
                this.filterType = model.filterType;
                this.filterValue = model.filterValue;
                this.onlyPreserveOneEachDay = model.onlyPreserveOneEachDay;
                this.policyId = model.policyId;
                this.retentionType = model.retentionType;
                this.retentionValue = model.retentionValue;
                this.srcRegion = model.srcRegion;
                this.srcType = model.srcType;
                this.storageClass = model.storageClass;
            } 

            /**
             * <p>The type of the operation. Valid values:</p>
             * <ul>
             * <li><strong>CREATE</strong></li>
             * <li><strong>UPDATE</strong></li>
             * <li><strong>DELETE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UPDATE</p>
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>The region in which backup files are stored.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * <p>The storage method of backup files. Valid values:</p>
             * <ul>
             * <li><strong>db</strong>: database.</li>
             * <li><strong>level1</strong>: level-1 backup.</li>
             * <li><strong>level2</strong>: level-2 backup.</li>
             * <li><strong>level2Cross</strong>: level-2 cross-region backup.</li>
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
             * <p>The scheduling cycle. Valid values:</p>
             * <ul>
             * <li><strong>dayOfWeek</strong>: scheduling by week.</li>
             * <li><strong>dayOfMonth</strong>: scheduling by month.</li>
             * <li><strong>dayOfYear</strong>: scheduling by year.</li>
             * <li><strong>backupInterval</strong>: scheduling at a specific interval.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is required only when FilterType is set to <strong>crontab</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>backupInterval</p>
             */
            public Builder filterKey(String filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * <p>The scheduling mode of the advanced backup policy. Valid values:</p>
             * <ul>
             * <li><strong>crontab</strong>: periodic scheduling.</li>
             * <li><strong>event</strong>: event-based scheduling.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>crontab</p>
             */
            public Builder filterType(String filterType) {
                this.filterType = filterType;
                return this;
            }

            /**
             * <p>The backup cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder filterValue(String filterValue) {
                this.filterValue = filterValue;
                return this;
            }

            /**
             * OnlyPreserveOneEachDay.
             */
            public Builder onlyPreserveOneEachDay(Boolean onlyPreserveOneEachDay) {
                this.onlyPreserveOneEachDay = onlyPreserveOneEachDay;
                return this;
            }

            /**
             * <p>The ID of the advanced backup policy. You can call the <a href="https://help.aliyun.com/document_detail/2869783.html">DescribeBackupPolicy</a> operation to query the ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6s67c7i3y8f8p72808p******</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The retention type of backup sets. Valid values:</p>
             * <ul>
             * <li><strong>never</strong>: Backup sets never expire.</li>
             * <li><strong>delay</strong>: Backup sets are retained for a specific number of days.</li>
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
             * <p>The retention period. Unit: day.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder retentionValue(String retentionValue) {
                this.retentionValue = retentionValue;
                return this;
            }

            /**
             * <p>The region in which the data source of the backup policy resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * <p>The type of the data source of the backup policy. Valid values:</p>
             * <ul>
             * <li><strong>db</strong>: database.</li>
             * <li><strong>level1</strong>: level-1 backup.</li>
             * <li><strong>level2</strong>: level-2 backup.</li>
             * <li><strong>level2Cross</strong>: level-2 cross-region backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>db</p>
             */
            public Builder srcType(String srcType) {
                this.srcType = srcType;
                return this;
            }

            /**
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            public AdvanceDataPolicies build() {
                return new AdvanceDataPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyBackupPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyBackupPolicyRequest</p>
     */
    public static class AdvanceIncPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("DestRegion")
        private String destRegion;

        @com.aliyun.core.annotation.NameInMap("DestType")
        private String destType;

        @com.aliyun.core.annotation.NameInMap("FilterKey")
        private String filterKey;

        @com.aliyun.core.annotation.NameInMap("FilterType")
        private String filterType;

        @com.aliyun.core.annotation.NameInMap("FilterValue")
        private String filterValue;

        @com.aliyun.core.annotation.NameInMap("OnlyPreserveOneEachDay")
        private Boolean onlyPreserveOneEachDay;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("RetentionType")
        private String retentionType;

        @com.aliyun.core.annotation.NameInMap("RetentionValue")
        private String retentionValue;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("SrcType")
        private String srcType;

        private AdvanceIncPolicies(Builder builder) {
            this.actionType = builder.actionType;
            this.destRegion = builder.destRegion;
            this.destType = builder.destType;
            this.filterKey = builder.filterKey;
            this.filterType = builder.filterType;
            this.filterValue = builder.filterValue;
            this.onlyPreserveOneEachDay = builder.onlyPreserveOneEachDay;
            this.policyId = builder.policyId;
            this.retentionType = builder.retentionType;
            this.retentionValue = builder.retentionValue;
            this.srcRegion = builder.srcRegion;
            this.srcType = builder.srcType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvanceIncPolicies create() {
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
         * @return filterKey
         */
        public String getFilterKey() {
            return this.filterKey;
        }

        /**
         * @return filterType
         */
        public String getFilterType() {
            return this.filterType;
        }

        /**
         * @return filterValue
         */
        public String getFilterValue() {
            return this.filterValue;
        }

        /**
         * @return onlyPreserveOneEachDay
         */
        public Boolean getOnlyPreserveOneEachDay() {
            return this.onlyPreserveOneEachDay;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return retentionType
         */
        public String getRetentionType() {
            return this.retentionType;
        }

        /**
         * @return retentionValue
         */
        public String getRetentionValue() {
            return this.retentionValue;
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
            private String filterKey; 
            private String filterType; 
            private String filterValue; 
            private Boolean onlyPreserveOneEachDay; 
            private String policyId; 
            private String retentionType; 
            private String retentionValue; 
            private String srcRegion; 
            private String srcType; 

            private Builder() {
            } 

            private Builder(AdvanceIncPolicies model) {
                this.actionType = model.actionType;
                this.destRegion = model.destRegion;
                this.destType = model.destType;
                this.filterKey = model.filterKey;
                this.filterType = model.filterType;
                this.filterValue = model.filterValue;
                this.onlyPreserveOneEachDay = model.onlyPreserveOneEachDay;
                this.policyId = model.policyId;
                this.retentionType = model.retentionType;
                this.retentionValue = model.retentionValue;
                this.srcRegion = model.srcRegion;
                this.srcType = model.srcType;
            } 

            /**
             * <p>The type of the operation. Valid values:</p>
             * <ul>
             * <li><strong>CREATE</strong></li>
             * <li><strong>UPDATE</strong></li>
             * <li><strong>DELETE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UPDATE</p>
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>The region in which backup files are stored.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * <p>The storage method of backup files. Valid values:</p>
             * <ul>
             * <li><strong>db</strong>: database.</li>
             * <li><strong>level1</strong>: level-1 backup.</li>
             * <li><strong>level2</strong>: level-2 backup.</li>
             * <li><strong>level2Cross</strong>: level-2 cross-region backup.</li>
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
             * <p>The scheduling cycle. Valid values:</p>
             * <ul>
             * <li><strong>dayOfWeek</strong>: scheduling by week.</li>
             * <li><strong>dayOfMonth</strong>: scheduling by month.</li>
             * <li><strong>dayOfYear</strong>: scheduling by year.</li>
             * <li><strong>backupInterval</strong>: scheduling at a specific interval.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is required only when FilterType is set to <strong>crontab</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>backupInterval</p>
             */
            public Builder filterKey(String filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * <p>The scheduling mode of the advanced backup policy. Valid values:</p>
             * <ul>
             * <li><strong>crontab</strong>: periodic scheduling.</li>
             * <li><strong>event</strong>: event-based scheduling.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>crontab</p>
             */
            public Builder filterType(String filterType) {
                this.filterType = filterType;
                return this;
            }

            /**
             * <p>The backup cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder filterValue(String filterValue) {
                this.filterValue = filterValue;
                return this;
            }

            /**
             * OnlyPreserveOneEachDay.
             */
            public Builder onlyPreserveOneEachDay(Boolean onlyPreserveOneEachDay) {
                this.onlyPreserveOneEachDay = onlyPreserveOneEachDay;
                return this;
            }

            /**
             * <p>The ID of the advanced backup policy. You can call the <a href="https://help.aliyun.com/document_detail/2869783.html">DescribeBackupPolicy</a> operation to query the ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6s67c7i3y8f8p72808p******</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The retention type of backup sets. Valid values:</p>
             * <ul>
             * <li><strong>never</strong>: Backup sets never expire.</li>
             * <li><strong>delay</strong>: Backup sets are retained for a specific number of days.</li>
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
             * <p>The retention period. Unit: day.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder retentionValue(String retentionValue) {
                this.retentionValue = retentionValue;
                return this;
            }

            /**
             * <p>The region in which the data source of the backup policy resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * <p>The type of the data source of the backup policy. Valid values:</p>
             * <ul>
             * <li><strong>db</strong>: database.</li>
             * <li><strong>level1</strong>: level-1 backup.</li>
             * <li><strong>level2</strong>: level-2 backup.</li>
             * <li><strong>level2Cross</strong>: level-2 cross-region backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>db</p>
             */
            public Builder srcType(String srcType) {
                this.srcType = srcType;
                return this;
            }

            public AdvanceIncPolicies build() {
                return new AdvanceIncPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyBackupPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyBackupPolicyRequest</p>
     */
    public static class AdvanceLogPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("DestRegion")
        private String destRegion;

        @com.aliyun.core.annotation.NameInMap("DestType")
        private String destType;

        @com.aliyun.core.annotation.NameInMap("EnableLogBackup")
        private Long enableLogBackup;

        @com.aliyun.core.annotation.NameInMap("FilterKey")
        private String filterKey;

        @com.aliyun.core.annotation.NameInMap("FilterType")
        private String filterType;

        @com.aliyun.core.annotation.NameInMap("FilterValue")
        private String filterValue;

        @com.aliyun.core.annotation.NameInMap("LogRetentionType")
        private String logRetentionType;

        @com.aliyun.core.annotation.NameInMap("LogRetentionValue")
        private String logRetentionValue;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("SrcType")
        private String srcType;

        private AdvanceLogPolicies(Builder builder) {
            this.actionType = builder.actionType;
            this.destRegion = builder.destRegion;
            this.destType = builder.destType;
            this.enableLogBackup = builder.enableLogBackup;
            this.filterKey = builder.filterKey;
            this.filterType = builder.filterType;
            this.filterValue = builder.filterValue;
            this.logRetentionType = builder.logRetentionType;
            this.logRetentionValue = builder.logRetentionValue;
            this.policyId = builder.policyId;
            this.srcRegion = builder.srcRegion;
            this.srcType = builder.srcType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvanceLogPolicies create() {
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
        public Long getEnableLogBackup() {
            return this.enableLogBackup;
        }

        /**
         * @return filterKey
         */
        public String getFilterKey() {
            return this.filterKey;
        }

        /**
         * @return filterType
         */
        public String getFilterType() {
            return this.filterType;
        }

        /**
         * @return filterValue
         */
        public String getFilterValue() {
            return this.filterValue;
        }

        /**
         * @return logRetentionType
         */
        public String getLogRetentionType() {
            return this.logRetentionType;
        }

        /**
         * @return logRetentionValue
         */
        public String getLogRetentionValue() {
            return this.logRetentionValue;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
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
            private Long enableLogBackup; 
            private String filterKey; 
            private String filterType; 
            private String filterValue; 
            private String logRetentionType; 
            private String logRetentionValue; 
            private String policyId; 
            private String srcRegion; 
            private String srcType; 

            private Builder() {
            } 

            private Builder(AdvanceLogPolicies model) {
                this.actionType = model.actionType;
                this.destRegion = model.destRegion;
                this.destType = model.destType;
                this.enableLogBackup = model.enableLogBackup;
                this.filterKey = model.filterKey;
                this.filterType = model.filterType;
                this.filterValue = model.filterValue;
                this.logRetentionType = model.logRetentionType;
                this.logRetentionValue = model.logRetentionValue;
                this.policyId = model.policyId;
                this.srcRegion = model.srcRegion;
                this.srcType = model.srcType;
            } 

            /**
             * <p>The type of the operation. Valid values:</p>
             * <ul>
             * <li><strong>CREATE</strong></li>
             * <li><strong>UPDATE</strong></li>
             * <li><strong>DELETE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UPDATE</p>
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>The region in which backup files are stored.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * <p>The storage method of backup files. Valid values:</p>
             * <ul>
             * <li><strong>db</strong>: database.</li>
             * <li><strong>level1</strong>: level-1 backup.</li>
             * <li><strong>level2</strong>: level-2 backup.</li>
             * <li><strong>level2Cross</strong>: level-2 cross-region backup.</li>
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
             * EnableLogBackup.
             */
            public Builder enableLogBackup(Long enableLogBackup) {
                this.enableLogBackup = enableLogBackup;
                return this;
            }

            /**
             * <p>The scheduling cycle. Valid values:</p>
             * <ul>
             * <li><strong>dayOfWeek</strong>: scheduling by week.</li>
             * <li><strong>dayOfMonth</strong>: scheduling by month.</li>
             * <li><strong>dayOfYear</strong>: scheduling by year.</li>
             * <li><strong>backupInterval</strong>: scheduling at a specific interval.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is required only when FilterType is set to <strong>crontab</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>backupInterval</p>
             */
            public Builder filterKey(String filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * <p>The scheduling mode of the advanced backup policy. Valid values:</p>
             * <ul>
             * <li><strong>crontab</strong>: periodic scheduling.</li>
             * <li><strong>event</strong>: event-based scheduling.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>crontab</p>
             */
            public Builder filterType(String filterType) {
                this.filterType = filterType;
                return this;
            }

            /**
             * <p>The backup cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder filterValue(String filterValue) {
                this.filterValue = filterValue;
                return this;
            }

            /**
             * LogRetentionType.
             */
            public Builder logRetentionType(String logRetentionType) {
                this.logRetentionType = logRetentionType;
                return this;
            }

            /**
             * LogRetentionValue.
             */
            public Builder logRetentionValue(String logRetentionValue) {
                this.logRetentionValue = logRetentionValue;
                return this;
            }

            /**
             * <p>The ID of the advanced backup policy. You can call the <a href="https://help.aliyun.com/document_detail/2869783.html">DescribeBackupPolicy</a> operation to query the ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6s67c7i3y8f8p72808p******</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The region in which the data source of the backup policy resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * <p>The type of the data source of the backup policy. Valid values:</p>
             * <ul>
             * <li><strong>db</strong>: database.</li>
             * <li><strong>level1</strong>: level-1 backup.</li>
             * <li><strong>level2</strong>: level-2 backup.</li>
             * <li><strong>level2Cross</strong>: level-2 cross-region backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>db</p>
             */
            public Builder srcType(String srcType) {
                this.srcType = srcType;
                return this;
            }

            public AdvanceLogPolicies build() {
                return new AdvanceLogPolicies(this);
            } 

        } 

    }
}
