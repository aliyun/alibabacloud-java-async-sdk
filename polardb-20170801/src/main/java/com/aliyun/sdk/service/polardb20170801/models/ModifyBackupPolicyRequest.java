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
    @NameInMap("DataLevel1BackupFrequency")
    private String dataLevel1BackupFrequency;

    @Query
    @NameInMap("DataLevel1BackupPeriod")
    private String dataLevel1BackupPeriod;

    @Query
    @NameInMap("DataLevel1BackupRetentionPeriod")
    private String dataLevel1BackupRetentionPeriod;

    @Query
    @NameInMap("DataLevel1BackupTime")
    private String dataLevel1BackupTime;

    @Query
    @NameInMap("DataLevel2BackupPeriod")
    private String dataLevel2BackupPeriod;

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
        this.dataLevel1BackupFrequency = builder.dataLevel1BackupFrequency;
        this.dataLevel1BackupPeriod = builder.dataLevel1BackupPeriod;
        this.dataLevel1BackupRetentionPeriod = builder.dataLevel1BackupRetentionPeriod;
        this.dataLevel1BackupTime = builder.dataLevel1BackupTime;
        this.dataLevel2BackupPeriod = builder.dataLevel2BackupPeriod;
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
     * @return dataLevel1BackupFrequency
     */
    public String getDataLevel1BackupFrequency() {
        return this.dataLevel1BackupFrequency;
    }

    /**
     * @return dataLevel1BackupPeriod
     */
    public String getDataLevel1BackupPeriod() {
        return this.dataLevel1BackupPeriod;
    }

    /**
     * @return dataLevel1BackupRetentionPeriod
     */
    public String getDataLevel1BackupRetentionPeriod() {
        return this.dataLevel1BackupRetentionPeriod;
    }

    /**
     * @return dataLevel1BackupTime
     */
    public String getDataLevel1BackupTime() {
        return this.dataLevel1BackupTime;
    }

    /**
     * @return dataLevel2BackupPeriod
     */
    public String getDataLevel2BackupPeriod() {
        return this.dataLevel2BackupPeriod;
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
        private String dataLevel1BackupFrequency; 
        private String dataLevel1BackupPeriod; 
        private String dataLevel1BackupRetentionPeriod; 
        private String dataLevel1BackupTime; 
        private String dataLevel2BackupPeriod; 
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

        private Builder(ModifyBackupPolicyRequest request) {
            super(request);
            this.backupFrequency = request.backupFrequency;
            this.backupRetentionPolicyOnClusterDeletion = request.backupRetentionPolicyOnClusterDeletion;
            this.DBClusterId = request.DBClusterId;
            this.dataLevel1BackupFrequency = request.dataLevel1BackupFrequency;
            this.dataLevel1BackupPeriod = request.dataLevel1BackupPeriod;
            this.dataLevel1BackupRetentionPeriod = request.dataLevel1BackupRetentionPeriod;
            this.dataLevel1BackupTime = request.dataLevel1BackupTime;
            this.dataLevel2BackupPeriod = request.dataLevel2BackupPeriod;
            this.dataLevel2BackupRetentionPeriod = request.dataLevel2BackupRetentionPeriod;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.preferredBackupPeriod = request.preferredBackupPeriod;
            this.preferredBackupTime = request.preferredBackupTime;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * DataLevel1BackupFrequency.
         */
        public Builder dataLevel1BackupFrequency(String dataLevel1BackupFrequency) {
            this.putQueryParameter("DataLevel1BackupFrequency", dataLevel1BackupFrequency);
            this.dataLevel1BackupFrequency = dataLevel1BackupFrequency;
            return this;
        }

        /**
         * DataLevel1BackupPeriod.
         */
        public Builder dataLevel1BackupPeriod(String dataLevel1BackupPeriod) {
            this.putQueryParameter("DataLevel1BackupPeriod", dataLevel1BackupPeriod);
            this.dataLevel1BackupPeriod = dataLevel1BackupPeriod;
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
         * DataLevel1BackupTime.
         */
        public Builder dataLevel1BackupTime(String dataLevel1BackupTime) {
            this.putQueryParameter("DataLevel1BackupTime", dataLevel1BackupTime);
            this.dataLevel1BackupTime = dataLevel1BackupTime;
            return this;
        }

        /**
         * DataLevel2BackupPeriod.
         */
        public Builder dataLevel2BackupPeriod(String dataLevel2BackupPeriod) {
            this.putQueryParameter("DataLevel2BackupPeriod", dataLevel2BackupPeriod);
            this.dataLevel2BackupPeriod = dataLevel2BackupPeriod;
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
