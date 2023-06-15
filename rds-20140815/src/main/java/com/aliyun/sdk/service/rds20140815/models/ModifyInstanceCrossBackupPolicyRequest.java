// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceCrossBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceCrossBackupPolicyRequest</p>
 */
public class ModifyInstanceCrossBackupPolicyRequest extends Request {
    @Query
    @NameInMap("BackupEnabled")
    private String backupEnabled;

    @Query
    @NameInMap("CrossBackupRegion")
    private String crossBackupRegion;

    @Query
    @NameInMap("CrossBackupType")
    private String crossBackupType;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("LogBackupEnabled")
    private String logBackupEnabled;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RetentType")
    private Integer retentType;

    @Query
    @NameInMap("Retention")
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
         * Specifies whether to enable the cross-region backup feature on the instance. This parameter specifies whether you can back up data and logs. Valid values:
         * <p>
         * 
         * *   **0**: disables the feature.
         * *   **1:** enables the feature.
         * 
         * > Before you enable the cross-region backup feature, you must configure the CrossBackupRegion parameter.
         */
        public Builder backupEnabled(String backupEnabled) {
            this.putQueryParameter("BackupEnabled", backupEnabled);
            this.backupEnabled = backupEnabled;
            return this;
        }

        /**
         * The ID of the region in which the cross-region backup files of the instance are stored.
         */
        public Builder crossBackupRegion(String crossBackupRegion) {
            this.putQueryParameter("CrossBackupRegion", crossBackupRegion);
            this.crossBackupRegion = crossBackupRegion;
            return this;
        }

        /**
         * The policy that is used to save the cross-region backup files of the instance. Set the value to **1**. The value 1 specifies that all cross-region backup files are saved.
         */
        public Builder crossBackupType(String crossBackupType) {
            this.putQueryParameter("CrossBackupType", crossBackupType);
            this.crossBackupType = crossBackupType;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Specifies whether to enable the cross-region log backup feature on the instance. Valid values:
         * <p>
         * 
         * *   **0**: disables the feature.
         * *   **1:** enables the feature.
         * 
         * > You can enable the cross-region log backup feature only when the cross-region backup feature is enabled.
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
         * The ID of the region to which the source instance belongs. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.
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
         * The policy that is used to retain the cross-region backup files of the instance. Set the value to 1. The value **1** specifies that the cross-region backup files of the instance are retained based on the specified retention period.
         */
        public Builder retentType(Integer retentType) {
            this.putQueryParameter("RetentType", retentType);
            this.retentType = retentType;
            return this;
        }

        /**
         * The number of days for which the cross-region backup files of the instance are retained. Valid values: **7 to 1825**.
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
