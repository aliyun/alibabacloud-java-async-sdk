// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link ModifyAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyAutoSnapshotPolicyRequest</p>
 */
public class ModifyAutoSnapshotPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDiskPolicyEnabled")
    private Boolean dataDiskPolicyEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDiskPolicyRetentionDays")
    @com.aliyun.core.annotation.Validation(maximum = 3, minimum = 1)
    private Integer dataDiskPolicyRetentionDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDiskPolicyRetentionLastWeek")
    private Boolean dataDiskPolicyRetentionLastWeek;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDiskPolicyTimePeriod")
    @com.aliyun.core.annotation.Validation(maximum = 4, minimum = 1)
    private Integer dataDiskPolicyTimePeriod;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskPolicyEnabled")
    private Boolean systemDiskPolicyEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskPolicyRetentionDays")
    @com.aliyun.core.annotation.Validation(maximum = 3, minimum = 1)
    private Integer systemDiskPolicyRetentionDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskPolicyRetentionLastWeek")
    private Boolean systemDiskPolicyRetentionLastWeek;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskPolicyTimePeriod")
    @com.aliyun.core.annotation.Validation(maximum = 4, minimum = 1)
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

        private Builder(ModifyAutoSnapshotPolicyRequest request) {
            super(request);
            this.dataDiskPolicyEnabled = request.dataDiskPolicyEnabled;
            this.dataDiskPolicyRetentionDays = request.dataDiskPolicyRetentionDays;
            this.dataDiskPolicyRetentionLastWeek = request.dataDiskPolicyRetentionLastWeek;
            this.dataDiskPolicyTimePeriod = request.dataDiskPolicyTimePeriod;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.systemDiskPolicyEnabled = request.systemDiskPolicyEnabled;
            this.systemDiskPolicyRetentionDays = request.systemDiskPolicyRetentionDays;
            this.systemDiskPolicyRetentionLastWeek = request.systemDiskPolicyRetentionLastWeek;
            this.systemDiskPolicyTimePeriod = request.systemDiskPolicyTimePeriod;
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
