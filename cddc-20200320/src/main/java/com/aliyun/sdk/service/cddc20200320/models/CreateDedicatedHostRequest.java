// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedHostRequest} extends {@link RequestModel}
 *
 * <p>CreateDedicatedHostRequest</p>
 */
public class CreateDedicatedHostRequest extends Request {
    @Query
    @NameInMap("AutoRenew")
    private String autoRenew;

    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("DedicatedHostGroupId")
    @Validation(required = true)
    private String dedicatedHostGroupId;

    @Query
    @NameInMap("HostClass")
    @Validation(required = true)
    private String hostClass;

    @Query
    @NameInMap("HostStorage")
    private String hostStorage;

    @Query
    @NameInMap("HostStorageType")
    private String hostStorageType;

    @Query
    @NameInMap("ImageCategory")
    private String imageCategory;

    @Query
    @NameInMap("OsPassword")
    private String osPassword;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("Period")
    private String period;

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
    @NameInMap("UsedTime")
    private String usedTime;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private CreateDedicatedHostRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.clientToken = builder.clientToken;
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.hostClass = builder.hostClass;
        this.hostStorage = builder.hostStorage;
        this.hostStorageType = builder.hostStorageType;
        this.imageCategory = builder.imageCategory;
        this.osPassword = builder.osPassword;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.usedTime = builder.usedTime;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDedicatedHostRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dedicatedHostGroupId
     */
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    /**
     * @return hostClass
     */
    public String getHostClass() {
        return this.hostClass;
    }

    /**
     * @return hostStorage
     */
    public String getHostStorage() {
        return this.hostStorage;
    }

    /**
     * @return hostStorageType
     */
    public String getHostStorageType() {
        return this.hostStorageType;
    }

    /**
     * @return imageCategory
     */
    public String getImageCategory() {
        return this.imageCategory;
    }

    /**
     * @return osPassword
     */
    public String getOsPassword() {
        return this.osPassword;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
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
     * @return usedTime
     */
    public String getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDedicatedHostRequest, Builder> {
        private String autoRenew; 
        private String clientToken; 
        private String dedicatedHostGroupId; 
        private String hostClass; 
        private String hostStorage; 
        private String hostStorageType; 
        private String imageCategory; 
        private String osPassword; 
        private Long ownerId; 
        private String payType; 
        private String period; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String usedTime; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDedicatedHostRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.clientToken = request.clientToken;
            this.dedicatedHostGroupId = request.dedicatedHostGroupId;
            this.hostClass = request.hostClass;
            this.hostStorage = request.hostStorage;
            this.hostStorageType = request.hostStorageType;
            this.imageCategory = request.imageCategory;
            this.osPassword = request.osPassword;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.usedTime = request.usedTime;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DedicatedHostGroupId.
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * HostClass.
         */
        public Builder hostClass(String hostClass) {
            this.putQueryParameter("HostClass", hostClass);
            this.hostClass = hostClass;
            return this;
        }

        /**
         * HostStorage.
         */
        public Builder hostStorage(String hostStorage) {
            this.putQueryParameter("HostStorage", hostStorage);
            this.hostStorage = hostStorage;
            return this;
        }

        /**
         * HostStorageType.
         */
        public Builder hostStorageType(String hostStorageType) {
            this.putQueryParameter("HostStorageType", hostStorageType);
            this.hostStorageType = hostStorageType;
            return this;
        }

        /**
         * ImageCategory.
         */
        public Builder imageCategory(String imageCategory) {
            this.putQueryParameter("ImageCategory", imageCategory);
            this.imageCategory = imageCategory;
            return this;
        }

        /**
         * OsPassword.
         */
        public Builder osPassword(String osPassword) {
            this.putQueryParameter("OsPassword", osPassword);
            this.osPassword = osPassword;
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
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
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
         * UsedTime.
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDedicatedHostRequest build() {
            return new CreateDedicatedHostRequest(this);
        } 

    } 

}
