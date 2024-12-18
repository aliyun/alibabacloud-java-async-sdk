// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyInstanceCrossBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceCrossBackupPolicyRequest</p>
 */
public class ModifyInstanceCrossBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupEnabled")
    private String backupEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossBackupRegion")
    private String crossBackupRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossBackupType")
    private String crossBackupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogBackupEnabled")
    private String logBackupEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetentType")
    private Integer retentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Retention")
    private Integer retention;

    private ModifyInstanceCrossBackupPolicyRequest(Builder builder) {
        super(builder);
        this.backupEnabled = builder.backupEnabled;
        this.crossBackupRegion = builder.crossBackupRegion;
        this.crossBackupType = builder.crossBackupType;
        this.DBInstanceId = builder.DBInstanceId;
        this.logBackupEnabled = builder.logBackupEnabled;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.retentType = builder.retentType;
        this.retention = builder.retention;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceCrossBackupPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupEnabled
     */
    public String getBackupEnabled() {
        return this.backupEnabled;
    }

    /**
     * @return crossBackupRegion
     */
    public String getCrossBackupRegion() {
        return this.crossBackupRegion;
    }

    /**
     * @return crossBackupType
     */
    public String getCrossBackupType() {
        return this.crossBackupType;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return logBackupEnabled
     */
    public String getLogBackupEnabled() {
        return this.logBackupEnabled;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    /**
     * @return retentType
     */
    public Integer getRetentType() {
        return this.retentType;
    }

    /**
     * @return retention
     */
    public Integer getRetention() {
        return this.retention;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceCrossBackupPolicyRequest, Builder> {
        private String backupEnabled; 
        private String crossBackupRegion; 
        private String crossBackupType; 
        private String DBInstanceId; 
        private String logBackupEnabled; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer retentType; 
        private Integer retention; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceCrossBackupPolicyRequest request) {
            super(request);
            this.backupEnabled = request.backupEnabled;
            this.crossBackupRegion = request.crossBackupRegion;
            this.crossBackupType = request.crossBackupType;
            this.DBInstanceId = request.DBInstanceId;
            this.logBackupEnabled = request.logBackupEnabled;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.retentType = request.retentType;
            this.retention = request.retention;
        } 

        /**
         * <p>Specifies whether to enable the cross-region backup feature on the instance. This parameter specifies whether you can back up data and logs. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disables the feature.</li>
         * <li><strong>1:</strong> enables the feature.</li>
         * </ul>
         * <blockquote>
         * <p>Before you enable the cross-region backup feature, you must configure the CrossBackupRegion parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder backupEnabled(String backupEnabled) {
            this.putQueryParameter("BackupEnabled", backupEnabled);
            this.backupEnabled = backupEnabled;
            return this;
        }

        /**
         * <p>The ID of the region in which the cross-region backup files of the instance are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder crossBackupRegion(String crossBackupRegion) {
            this.putQueryParameter("CrossBackupRegion", crossBackupRegion);
            this.crossBackupRegion = crossBackupRegion;
            return this;
        }

        /**
         * <p>The policy that is used to save the cross-region backup files of the instance. Set the value to <strong>1</strong>. The value 1 specifies that all cross-region backup files are saved.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder crossBackupType(String crossBackupType) {
            this.putQueryParameter("CrossBackupType", crossBackupType);
            this.crossBackupType = crossBackupType;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the cross-region log backup feature on the instance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disables the feature.</li>
         * <li><strong>1:</strong> enables the feature.</li>
         * </ul>
         * <blockquote>
         * <p>You can enable the cross-region log backup feature only when the cross-region backup feature is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder logBackupEnabled(String logBackupEnabled) {
            this.putQueryParameter("LogBackupEnabled", logBackupEnabled);
            this.logBackupEnabled = logBackupEnabled;
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
         * <p>The region ID of the source instance. You can call the DescribeRegions operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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

        /**
         * <p>The policy that is used to retain the cross-region backup files of the instance. Set the value to 1. The value <strong>1</strong> specifies that the cross-region backup files of the instance are retained based on the specified retention period.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder retentType(Integer retentType) {
            this.putQueryParameter("RetentType", retentType);
            this.retentType = retentType;
            return this;
        }

        /**
         * <p>The number of days for which the cross-region backup files of the instance are retained. Valid values: <strong>7 to 1825</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder retention(Integer retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        @Override
        public ModifyInstanceCrossBackupPolicyRequest build() {
            return new ModifyInstanceCrossBackupPolicyRequest(this);
        } 

    } 

}
