// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ModifyAutoRenewalAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyAutoRenewalAttributeRequest</p>
 */
public class ModifyAutoRenewalAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewalPeriod")
    private String autoRenewalPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewalPeriodUnit")
    private String autoRenewalPeriodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewalStatus")
    private String autoRenewalStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

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

    private ModifyAutoRenewalAttributeRequest(Builder builder) {
        super(builder);
        this.autoRenewalPeriod = builder.autoRenewalPeriod;
        this.autoRenewalPeriodUnit = builder.autoRenewalPeriodUnit;
        this.autoRenewalStatus = builder.autoRenewalStatus;
        this.DBClusterId = builder.DBClusterId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAutoRenewalAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenewalPeriod
     */
    public String getAutoRenewalPeriod() {
        return this.autoRenewalPeriod;
    }

    /**
     * @return autoRenewalPeriodUnit
     */
    public String getAutoRenewalPeriodUnit() {
        return this.autoRenewalPeriodUnit;
    }

    /**
     * @return autoRenewalStatus
     */
    public String getAutoRenewalStatus() {
        return this.autoRenewalStatus;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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

    public static final class Builder extends Request.Builder<ModifyAutoRenewalAttributeRequest, Builder> {
        private String autoRenewalPeriod; 
        private String autoRenewalPeriodUnit; 
        private String autoRenewalStatus; 
        private String DBClusterId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAutoRenewalAttributeRequest request) {
            super(request);
            this.autoRenewalPeriod = request.autoRenewalPeriod;
            this.autoRenewalPeriodUnit = request.autoRenewalPeriodUnit;
            this.autoRenewalStatus = request.autoRenewalStatus;
            this.DBClusterId = request.DBClusterId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * AutoRenewalPeriod.
         */
        public Builder autoRenewalPeriod(String autoRenewalPeriod) {
            this.putQueryParameter("AutoRenewalPeriod", autoRenewalPeriod);
            this.autoRenewalPeriod = autoRenewalPeriod;
            return this;
        }

        /**
         * AutoRenewalPeriodUnit.
         */
        public Builder autoRenewalPeriodUnit(String autoRenewalPeriodUnit) {
            this.putQueryParameter("AutoRenewalPeriodUnit", autoRenewalPeriodUnit);
            this.autoRenewalPeriodUnit = autoRenewalPeriodUnit;
            return this;
        }

        /**
         * AutoRenewalStatus.
         */
        public Builder autoRenewalStatus(String autoRenewalStatus) {
            this.putQueryParameter("AutoRenewalStatus", autoRenewalStatus);
            this.autoRenewalStatus = autoRenewalStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-uf6pl56w1j8h****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
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

        @Override
        public ModifyAutoRenewalAttributeRequest build() {
            return new ModifyAutoRenewalAttributeRequest(this);
        } 

    } 

}
