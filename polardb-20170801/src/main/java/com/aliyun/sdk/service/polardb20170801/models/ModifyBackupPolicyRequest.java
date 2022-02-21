// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupPolicyRequest</p>
 */
public class ModifyBackupPolicyRequest extends Request {
    @Query
    @NameInMap("BackupFrequency")
    private String backupFrequency;

    @Query
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    private String backupRetentionPolicyOnClusterDeletion;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("DataLevel1BackupRetentionPeriod")
    private String dataLevel1BackupRetentionPeriod;

    @Query
    @NameInMap("DataLevel2BackupRetentionPeriod")
    private String dataLevel2BackupRetentionPeriod;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @Query
    @NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyBackupPolicyRequest(Builder builder) {
        super(builder);
        this.backupFrequency = builder.backupFrequency;
        this.backupRetentionPolicyOnClusterDeletion = builder.backupRetentionPolicyOnClusterDeletion;
        this.DBClusterId = builder.DBClusterId;
        this.dataLevel1BackupRetentionPeriod = builder.dataLevel1BackupRetentionPeriod;
        this.dataLevel2BackupRetentionPeriod = builder.dataLevel2BackupRetentionPeriod;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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
     * @return backupFrequency
     */
    public String getBackupFrequency() {
        return this.backupFrequency;
    }

    /**
     * @return backupRetentionPolicyOnClusterDeletion
     */
    public String getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return dataLevel1BackupRetentionPeriod
     */
    public String getDataLevel1BackupRetentionPeriod() {
        return this.dataLevel1BackupRetentionPeriod;
    }

    /**
     * @return dataLevel2BackupRetentionPeriod
     */
    public String getDataLevel2BackupRetentionPeriod() {
        return this.dataLevel2BackupRetentionPeriod;
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

    public static final class Builder extends Request.Builder<ModifyBackupPolicyRequest, Builder> {
        private String backupFrequency; 
        private String backupRetentionPolicyOnClusterDeletion; 
        private String DBClusterId; 
        private String dataLevel1BackupRetentionPeriod; 
        private String dataLevel2BackupRetentionPeriod; 
        private String ownerAccount; 
        private Long ownerId; 
        private String preferredBackupPeriod; 
        private String preferredBackupTime; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupPolicyRequest response) {
            super(response);
            this.backupFrequency = response.backupFrequency;
            this.backupRetentionPolicyOnClusterDeletion = response.backupRetentionPolicyOnClusterDeletion;
            this.DBClusterId = response.DBClusterId;
            this.dataLevel1BackupRetentionPeriod = response.dataLevel1BackupRetentionPeriod;
            this.dataLevel2BackupRetentionPeriod = response.dataLevel2BackupRetentionPeriod;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.preferredBackupPeriod = response.preferredBackupPeriod;
            this.preferredBackupTime = response.preferredBackupTime;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * BackupFrequency.
         */
        public Builder backupFrequency(String backupFrequency) {
            this.putQueryParameter("BackupFrequency", backupFrequency);
            this.backupFrequency = backupFrequency;
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
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DataLevel1BackupRetentionPeriod.
         */
        public Builder dataLevel1BackupRetentionPeriod(String dataLevel1BackupRetentionPeriod) {
            this.putQueryParameter("DataLevel1BackupRetentionPeriod", dataLevel1BackupRetentionPeriod);
            this.dataLevel1BackupRetentionPeriod = dataLevel1BackupRetentionPeriod;
            return this;
        }

        /**
         * DataLevel2BackupRetentionPeriod.
         */
        public Builder dataLevel2BackupRetentionPeriod(String dataLevel2BackupRetentionPeriod) {
            this.putQueryParameter("DataLevel2BackupRetentionPeriod", dataLevel2BackupRetentionPeriod);
            this.dataLevel2BackupRetentionPeriod = dataLevel2BackupRetentionPeriod;
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
         * PreferredBackupPeriod.
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * PreferredBackupTime.
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.putQueryParameter("PreferredBackupTime", preferredBackupTime);
            this.preferredBackupTime = preferredBackupTime;
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
        public ModifyBackupPolicyRequest build() {
            return new ModifyBackupPolicyRequest(this);
        } 

    } 

}
