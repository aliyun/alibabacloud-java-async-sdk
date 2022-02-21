// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyAutoSnapshotPolicyRequest</p>
 */
public class ModifyAutoSnapshotPolicyRequest extends Request {
    @Query
    @NameInMap("DataDiskPolicyEnabled")
    private Boolean dataDiskPolicyEnabled;

    @Query
    @NameInMap("DataDiskPolicyRetentionDays")
    private Integer dataDiskPolicyRetentionDays;

    @Query
    @NameInMap("DataDiskPolicyRetentionLastWeek")
    private Boolean dataDiskPolicyRetentionLastWeek;

    @Query
    @NameInMap("DataDiskPolicyTimePeriod")
    private Integer dataDiskPolicyTimePeriod;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SystemDiskPolicyEnabled")
    private Boolean systemDiskPolicyEnabled;

    @Query
    @NameInMap("SystemDiskPolicyRetentionDays")
    private Integer systemDiskPolicyRetentionDays;

    @Query
    @NameInMap("SystemDiskPolicyRetentionLastWeek")
    private Boolean systemDiskPolicyRetentionLastWeek;

    @Query
    @NameInMap("SystemDiskPolicyTimePeriod")
    private Integer systemDiskPolicyTimePeriod;

    private ModifyAutoSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.dataDiskPolicyEnabled = builder.dataDiskPolicyEnabled;
        this.dataDiskPolicyRetentionDays = builder.dataDiskPolicyRetentionDays;
        this.dataDiskPolicyRetentionLastWeek = builder.dataDiskPolicyRetentionLastWeek;
        this.dataDiskPolicyTimePeriod = builder.dataDiskPolicyTimePeriod;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.systemDiskPolicyEnabled = builder.systemDiskPolicyEnabled;
        this.systemDiskPolicyRetentionDays = builder.systemDiskPolicyRetentionDays;
        this.systemDiskPolicyRetentionLastWeek = builder.systemDiskPolicyRetentionLastWeek;
        this.systemDiskPolicyTimePeriod = builder.systemDiskPolicyTimePeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAutoSnapshotPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataDiskPolicyEnabled
     */
    public Boolean getDataDiskPolicyEnabled() {
        return this.dataDiskPolicyEnabled;
    }

    /**
     * @return dataDiskPolicyRetentionDays
     */
    public Integer getDataDiskPolicyRetentionDays() {
        return this.dataDiskPolicyRetentionDays;
    }

    /**
     * @return dataDiskPolicyRetentionLastWeek
     */
    public Boolean getDataDiskPolicyRetentionLastWeek() {
        return this.dataDiskPolicyRetentionLastWeek;
    }

    /**
     * @return dataDiskPolicyTimePeriod
     */
    public Integer getDataDiskPolicyTimePeriod() {
        return this.dataDiskPolicyTimePeriod;
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

    /**
     * @return systemDiskPolicyEnabled
     */
    public Boolean getSystemDiskPolicyEnabled() {
        return this.systemDiskPolicyEnabled;
    }

    /**
     * @return systemDiskPolicyRetentionDays
     */
    public Integer getSystemDiskPolicyRetentionDays() {
        return this.systemDiskPolicyRetentionDays;
    }

    /**
     * @return systemDiskPolicyRetentionLastWeek
     */
    public Boolean getSystemDiskPolicyRetentionLastWeek() {
        return this.systemDiskPolicyRetentionLastWeek;
    }

    /**
     * @return systemDiskPolicyTimePeriod
     */
    public Integer getSystemDiskPolicyTimePeriod() {
        return this.systemDiskPolicyTimePeriod;
    }

    public static final class Builder extends Request.Builder<ModifyAutoSnapshotPolicyRequest, Builder> {
        private Boolean dataDiskPolicyEnabled; 
        private Integer dataDiskPolicyRetentionDays; 
        private Boolean dataDiskPolicyRetentionLastWeek; 
        private Integer dataDiskPolicyTimePeriod; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean systemDiskPolicyEnabled; 
        private Integer systemDiskPolicyRetentionDays; 
        private Boolean systemDiskPolicyRetentionLastWeek; 
        private Integer systemDiskPolicyTimePeriod; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAutoSnapshotPolicyRequest response) {
            super(response);
            this.dataDiskPolicyEnabled = response.dataDiskPolicyEnabled;
            this.dataDiskPolicyRetentionDays = response.dataDiskPolicyRetentionDays;
            this.dataDiskPolicyRetentionLastWeek = response.dataDiskPolicyRetentionLastWeek;
            this.dataDiskPolicyTimePeriod = response.dataDiskPolicyTimePeriod;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.systemDiskPolicyEnabled = response.systemDiskPolicyEnabled;
            this.systemDiskPolicyRetentionDays = response.systemDiskPolicyRetentionDays;
            this.systemDiskPolicyRetentionLastWeek = response.systemDiskPolicyRetentionLastWeek;
            this.systemDiskPolicyTimePeriod = response.systemDiskPolicyTimePeriod;
        } 

        /**
         * DataDiskPolicyEnabled.
         */
        public Builder dataDiskPolicyEnabled(Boolean dataDiskPolicyEnabled) {
            this.putQueryParameter("DataDiskPolicyEnabled", dataDiskPolicyEnabled);
            this.dataDiskPolicyEnabled = dataDiskPolicyEnabled;
            return this;
        }

        /**
         * DataDiskPolicyRetentionDays.
         */
        public Builder dataDiskPolicyRetentionDays(Integer dataDiskPolicyRetentionDays) {
            this.putQueryParameter("DataDiskPolicyRetentionDays", dataDiskPolicyRetentionDays);
            this.dataDiskPolicyRetentionDays = dataDiskPolicyRetentionDays;
            return this;
        }

        /**
         * DataDiskPolicyRetentionLastWeek.
         */
        public Builder dataDiskPolicyRetentionLastWeek(Boolean dataDiskPolicyRetentionLastWeek) {
            this.putQueryParameter("DataDiskPolicyRetentionLastWeek", dataDiskPolicyRetentionLastWeek);
            this.dataDiskPolicyRetentionLastWeek = dataDiskPolicyRetentionLastWeek;
            return this;
        }

        /**
         * DataDiskPolicyTimePeriod.
         */
        public Builder dataDiskPolicyTimePeriod(Integer dataDiskPolicyTimePeriod) {
            this.putQueryParameter("DataDiskPolicyTimePeriod", dataDiskPolicyTimePeriod);
            this.dataDiskPolicyTimePeriod = dataDiskPolicyTimePeriod;
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

        /**
         * SystemDiskPolicyEnabled.
         */
        public Builder systemDiskPolicyEnabled(Boolean systemDiskPolicyEnabled) {
            this.putQueryParameter("SystemDiskPolicyEnabled", systemDiskPolicyEnabled);
            this.systemDiskPolicyEnabled = systemDiskPolicyEnabled;
            return this;
        }

        /**
         * SystemDiskPolicyRetentionDays.
         */
        public Builder systemDiskPolicyRetentionDays(Integer systemDiskPolicyRetentionDays) {
            this.putQueryParameter("SystemDiskPolicyRetentionDays", systemDiskPolicyRetentionDays);
            this.systemDiskPolicyRetentionDays = systemDiskPolicyRetentionDays;
            return this;
        }

        /**
         * SystemDiskPolicyRetentionLastWeek.
         */
        public Builder systemDiskPolicyRetentionLastWeek(Boolean systemDiskPolicyRetentionLastWeek) {
            this.putQueryParameter("SystemDiskPolicyRetentionLastWeek", systemDiskPolicyRetentionLastWeek);
            this.systemDiskPolicyRetentionLastWeek = systemDiskPolicyRetentionLastWeek;
            return this;
        }

        /**
         * SystemDiskPolicyTimePeriod.
         */
        public Builder systemDiskPolicyTimePeriod(Integer systemDiskPolicyTimePeriod) {
            this.putQueryParameter("SystemDiskPolicyTimePeriod", systemDiskPolicyTimePeriod);
            this.systemDiskPolicyTimePeriod = systemDiskPolicyTimePeriod;
            return this;
        }

        @Override
        public ModifyAutoSnapshotPolicyRequest build() {
            return new ModifyAutoSnapshotPolicyRequest(this);
        } 

    } 

}
