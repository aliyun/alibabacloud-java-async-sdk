// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyLogBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyLogBackupPolicyRequest</p>
 */
public class ModifyLogBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdvancedLogPolicies")
    private java.util.List<AdvancedLogPolicies> advancedLogPolicies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogBackupAnotherRegionRegion")
    private String logBackupAnotherRegionRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogBackupAnotherRegionRetentionPeriod")
    private String logBackupAnotherRegionRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogBackupRetentionPeriod")
    private String logBackupRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyLogBackupPolicyRequest(Builder builder) {
        super(builder);
        this.advancedLogPolicies = builder.advancedLogPolicies;
        this.DBClusterId = builder.DBClusterId;
        this.logBackupAnotherRegionRegion = builder.logBackupAnotherRegionRegion;
        this.logBackupAnotherRegionRetentionPeriod = builder.logBackupAnotherRegionRetentionPeriod;
        this.logBackupRetentionPeriod = builder.logBackupRetentionPeriod;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLogBackupPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedLogPolicies
     */
    public java.util.List<AdvancedLogPolicies> getAdvancedLogPolicies() {
        return this.advancedLogPolicies;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return logBackupAnotherRegionRegion
     */
    public String getLogBackupAnotherRegionRegion() {
        return this.logBackupAnotherRegionRegion;
    }

    /**
     * @return logBackupAnotherRegionRetentionPeriod
     */
    public String getLogBackupAnotherRegionRetentionPeriod() {
        return this.logBackupAnotherRegionRetentionPeriod;
    }

    /**
     * @return logBackupRetentionPeriod
     */
    public String getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ModifyLogBackupPolicyRequest, Builder> {
        private java.util.List<AdvancedLogPolicies> advancedLogPolicies; 
        private String DBClusterId; 
        private String logBackupAnotherRegionRegion; 
        private String logBackupAnotherRegionRetentionPeriod; 
        private String logBackupRetentionPeriod; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLogBackupPolicyRequest request) {
            super(request);
            this.advancedLogPolicies = request.advancedLogPolicies;
            this.DBClusterId = request.DBClusterId;
            this.logBackupAnotherRegionRegion = request.logBackupAnotherRegionRegion;
            this.logBackupAnotherRegionRetentionPeriod = request.logBackupAnotherRegionRetentionPeriod;
            this.logBackupRetentionPeriod = request.logBackupRetentionPeriod;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The advanced backup policies.</p>
         * <blockquote>
         * <ul>
         * <li><ul>
         * <li>This parameter is not supported for PolarDB for PostgreSQL (Oracle Compatible) or PolarDB for PostgreSQL.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>This parameter is supported only for clusters for which the BackupPolicyLevel parameter is set to Advanced.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         */
        public Builder advancedLogPolicies(java.util.List<AdvancedLogPolicies> advancedLogPolicies) {
            String advancedLogPoliciesShrink = shrink(advancedLogPolicies, "AdvancedLogPolicies", "json");
            this.putQueryParameter("AdvancedLogPolicies", advancedLogPoliciesShrink);
            this.advancedLogPolicies = advancedLogPolicies;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to view information about all clusters in a specific region, including cluster IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The destination region for cross-region log backups. For information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
         * <blockquote>
         * <ul>
         * <li><ul>
         * <li>After you enable the advanced backup feature, this parameter is no longer valid. Use the AdvancedLogPolicies parameter instead.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder logBackupAnotherRegionRegion(String logBackupAnotherRegionRegion) {
            this.putQueryParameter("LogBackupAnotherRegionRegion", logBackupAnotherRegionRegion);
            this.logBackupAnotherRegionRegion = logBackupAnotherRegionRegion;
            return this;
        }

        /**
         * <p>The retention period of cross-region log backups. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Disables the cross-region log backup feature.</p>
         * </li>
         * <li><p><strong>30 to 7300</strong>: The retention period in days.</p>
         * </li>
         * <li><p><strong>-1</strong>: long-term retention.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><ul>
         * <li>When you create a cluster, the default value of this parameter is <strong>0</strong>. This value disables the cross-region log backup feature.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>After you enable the advanced backup feature, this parameter is no longer valid. Use the AdvancedLogPolicies parameter instead.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder logBackupAnotherRegionRetentionPeriod(String logBackupAnotherRegionRetentionPeriod) {
            this.putQueryParameter("LogBackupAnotherRegionRetentionPeriod", logBackupAnotherRegionRetentionPeriod);
            this.logBackupAnotherRegionRetentionPeriod = logBackupAnotherRegionRetentionPeriod;
            return this;
        }

        /**
         * <p>The retention period of log backups. Valid values:</p>
         * <ul>
         * <li><p>3 to 7300: The retention period in days.</p>
         * </li>
         * <li><p>-1: long-term retention.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><ul>
         * <li>After you enable the advanced backup feature, this parameter is no longer valid. Use the AdvancedLogPolicies parameter instead.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder logBackupRetentionPeriod(String logBackupRetentionPeriod) {
            this.putQueryParameter("LogBackupRetentionPeriod", logBackupRetentionPeriod);
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public ModifyLogBackupPolicyRequest build() {
            return new ModifyLogBackupPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyLogBackupPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyLogBackupPolicyRequest</p>
     */
    public static class AdvancedLogPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("DestRegion")
        private String destRegion;

        @com.aliyun.core.annotation.NameInMap("DestType")
        private String destType;

        @com.aliyun.core.annotation.NameInMap("EnableLogBackup")
        private Integer enableLogBackup;

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

        private AdvancedLogPolicies(Builder builder) {
            this.actionType = builder.actionType;
            this.destRegion = builder.destRegion;
            this.destType = builder.destType;
            this.enableLogBackup = builder.enableLogBackup;
            this.logRetentionType = builder.logRetentionType;
            this.logRetentionValue = builder.logRetentionValue;
            this.policyId = builder.policyId;
            this.srcRegion = builder.srcRegion;
            this.srcType = builder.srcType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedLogPolicies create() {
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
            private Integer enableLogBackup; 
            private String logRetentionType; 
            private String logRetentionValue; 
            private String policyId; 
            private String srcRegion; 
            private String srcType; 

            private Builder() {
            } 

            private Builder(AdvancedLogPolicies model) {
                this.actionType = model.actionType;
                this.destRegion = model.destRegion;
                this.destType = model.destType;
                this.enableLogBackup = model.enableLogBackup;
                this.logRetentionType = model.logRetentionType;
                this.logRetentionValue = model.logRetentionValue;
                this.policyId = model.policyId;
                this.srcRegion = model.srcRegion;
                this.srcType = model.srcType;
            } 

            /**
             * <p>The operation type. Valid values:</p>
             * <ul>
             * <li><p><strong>CREATE</strong>: Create</p>
             * </li>
             * <li><p><strong>UPDATE</strong>: Update</p>
             * </li>
             * <li><p><strong>DELETE</strong>: Delete</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREATE</p>
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>The destination region of the log backup policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * <p>The destination type of the backup policy. Valid values:</p>
             * <ul>
             * <li><p><strong>level1</strong>: level-1 backup</p>
             * </li>
             * <li><p><strong>level2</strong>: level-2 backup</p>
             * </li>
             * <li><p><strong>level2Cross</strong>: level-2 cross-region backup</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>level2</p>
             */
            public Builder destType(String destType) {
                this.destType = destType;
                return this;
            }

            /**
             * <p>Specifies whether to enable log backup. Set the value to 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enableLogBackup(Integer enableLogBackup) {
                this.enableLogBackup = enableLogBackup;
                return this;
            }

            /**
             * <p>The retention period type for log backups. Valid values:</p>
             * <ul>
             * <li><p><strong>never</strong>: The backups never expire.</p>
             * </li>
             * <li><p><strong>delay</strong>: The backups expire after a fixed number of days.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>delay</p>
             */
            public Builder logRetentionType(String logRetentionType) {
                this.logRetentionType = logRetentionType;
                return this;
            }

            /**
             * <p>The number of days to retain the log backups. Valid values:</p>
             * <ul>
             * <li><p>3 to 7300: The retention period in days.</p>
             * </li>
             * <li><p>-1: long-term retention.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder logRetentionValue(String logRetentionValue) {
                this.logRetentionValue = logRetentionValue;
                return this;
            }

            /**
             * <p>The ID of the log backup policy.</p>
             * 
             * <strong>example:</strong>
             * <p>71930ac2e9f15e41615e10627c******</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The source region of the log backup policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * <p>The source type of the log backup policy. Valid values:</p>
             * <ul>
             * <li><p><strong>db</strong>: database cluster</p>
             * </li>
             * <li><p><strong>level1</strong>: level-1 backup</p>
             * </li>
             * <li><p><strong>level2</strong>: level-2 backup</p>
             * </li>
             * <li><p><strong>level2Cross</strong>: level-2 cross-region backup</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>level1</p>
             */
            public Builder srcType(String srcType) {
                this.srcType = srcType;
                return this;
            }

            public AdvancedLogPolicies build() {
                return new AdvancedLogPolicies(this);
            } 

        } 

    }
}
