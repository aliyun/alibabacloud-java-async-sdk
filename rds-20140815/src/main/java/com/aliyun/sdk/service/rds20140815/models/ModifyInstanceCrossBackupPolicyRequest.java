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

        private Builder(ModifyInstanceCrossBackupPolicyRequest response) {
            super(response);
            this.backupEnabled = response.backupEnabled;
            this.crossBackupRegion = response.crossBackupRegion;
            this.crossBackupType = response.crossBackupType;
            this.DBInstanceId = response.DBInstanceId;
            this.logBackupEnabled = response.logBackupEnabled;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.retentType = response.retentType;
            this.retention = response.retention;
        } 

        /**
         * BackupEnabled.
         */
        public Builder backupEnabled(String backupEnabled) {
            this.putQueryParameter("BackupEnabled", backupEnabled);
            this.backupEnabled = backupEnabled;
            return this;
        }

        /**
         * CrossBackupRegion.
         */
        public Builder crossBackupRegion(String crossBackupRegion) {
            this.putQueryParameter("CrossBackupRegion", crossBackupRegion);
            this.crossBackupRegion = crossBackupRegion;
            return this;
        }

        /**
         * CrossBackupType.
         */
        public Builder crossBackupType(String crossBackupType) {
            this.putQueryParameter("CrossBackupType", crossBackupType);
            this.crossBackupType = crossBackupType;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * LogBackupEnabled.
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
         * RegionId.
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
         * RetentType.
         */
        public Builder retentType(Integer retentType) {
            this.putQueryParameter("RetentType", retentType);
            this.retentType = retentType;
            return this;
        }

        /**
         * Retention.
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
