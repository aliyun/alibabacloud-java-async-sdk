// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDedicatedHostAutoRenewAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDedicatedHostAutoRenewAttributeRequest</p>
 */
public class ModifyDedicatedHostAutoRenewAttributeRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("AutoRenewWithEcs")
    private String autoRenewWithEcs;

    @Query
    @NameInMap("DedicatedHostIds")
    @Validation(required = true)
    private String dedicatedHostIds;

    @Query
    @NameInMap("Duration")
    private Integer duration;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RenewalStatus")
    private String renewalStatus;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDedicatedHostAutoRenewAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.autoRenew = builder.autoRenew;
        this.autoRenewWithEcs = builder.autoRenewWithEcs;
        this.dedicatedHostIds = builder.dedicatedHostIds;
        this.duration = builder.duration;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.renewalStatus = builder.renewalStatus;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDedicatedHostAutoRenewAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewWithEcs
     */
    public String getAutoRenewWithEcs() {
        return this.autoRenewWithEcs;
    }

    /**
     * @return dedicatedHostIds
     */
    public String getDedicatedHostIds() {
        return this.dedicatedHostIds;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
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
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return renewalStatus
     */
    public String getRenewalStatus() {
        return this.renewalStatus;
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

    public static final class Builder extends Request.Builder<ModifyDedicatedHostAutoRenewAttributeRequest, Builder> {
        private String sourceRegionId; 
        private Boolean autoRenew; 
        private String autoRenewWithEcs; 
        private String dedicatedHostIds; 
        private Integer duration; 
        private String ownerAccount; 
        private Long ownerId; 
        private String periodUnit; 
        private String regionId; 
        private String renewalStatus; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDedicatedHostAutoRenewAttributeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.autoRenew = request.autoRenew;
            this.autoRenewWithEcs = request.autoRenewWithEcs;
            this.dedicatedHostIds = request.dedicatedHostIds;
            this.duration = request.duration;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.periodUnit = request.periodUnit;
            this.regionId = request.regionId;
            this.renewalStatus = request.renewalStatus;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * Specifies whether to automatically renew the subscription dedicated host. Valid values:
         * <p>
         * 
         * *   true: automatically renews the subscription dedicated host.
         * *   false: does not automatically renew the subscription dedicated host.
         * 
         * Default value: false.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * Specifies whether to automatically renew the subscription dedicated host along with the subscription ECS instances hosted on it.
         * <p>
         * 
         * If auto-renewal is enabled for the subscription ECS instances hosted on your subscription dedicated host, you can specify this parameter to automatically renew the dedicated host along with the subscription ECS instances. When the subscription ECS instances hosted on your dedicated host are automatically renewed, the dedicated host is also automatically renewed if the expiration time of the dedicated host is earlier than the expiration time of the renewed instances.
         * 
         * When the dedicated host is configured to be automatically renewed along with the subscription ECS instances hosted on it, the dedicated host determines the expiration time of the renewed instances, and selects a minimum value from the valid values of the Duration parameter so that the dedicated host is renewed by a duration that expires later than the expiration time of the renewed instances. For more information about supported renewal durations, see the descriptions of the `PeriodUnit` and `Duration` parameters.
         * 
         * For example, assume that you have a subscription dedicated host that expires on January 15 of the current year. Subscription ECS instances hosted on the dedicated host have the auto-renewal feature enabled, and are automatically renewed to November 15 of the same year. The expiration time of the dedicated host is earlier than the expiration time of the ECS instances by 10 months. In this case, the dedicated host selects a renewal duration of 12 months, which is the minimum value of the `Duration` parameter (`PeriodUnit=Month`) that allows the dedicated host to expire later than the ECS instances.
         * 
         * Valid values:
         * 
         * *   AutoRenewWithEcs: automatically renews the subscription dedicated host along with the subscription ECS instances hosted on it.
         * *   StopRenewWithEcs: does not automatically renew the subscription dedicated host along with the subscription ECS instances hosted on it.
         * *   NoOperation: does not change the current settings for the dedicated host.
         * 
         * >  If you set this parameter to AutoRenewWithEcs, make sure that `AutoRenew` is set to true to enable auto-renewal for the dedicated host. Otherwise, only the parameter value is changed. The dedicated host is not automatically renewed along with the subscription ECS instances hosted on it.
         * 
         * Default value: NoOperation.
         */
        public Builder autoRenewWithEcs(String autoRenewWithEcs) {
            this.putQueryParameter("AutoRenewWithEcs", autoRenewWithEcs);
            this.autoRenewWithEcs = autoRenewWithEcs;
            return this;
        }

        /**
         * The IDs of the dedicated hosts. You can specify up to 100 subscription dedicated host IDs. Separate multiple IDs with commas (,).
         */
        public Builder dedicatedHostIds(String dedicatedHostIds) {
            this.putQueryParameter("DedicatedHostIds", dedicatedHostIds);
            this.dedicatedHostIds = dedicatedHostIds;
            return this;
        }

        /**
         * The renewal duration of the dedicated host. Valid values:
         * <p>
         * 
         * *   When the PeriodUnit parameter is set to Week, the valid values of the Duration parameter are 1, 2, and 3.
         * *   When the PeriodUnit parameter is set to Month, the valid values of the Duration parameter are 1, 2, 3, 6, and 12.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
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
         * The unit of the renewal duration. Valid values:
         * <p>
         * 
         * *   Week
         * *   Month
         * 
         * Default value: Month.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The region ID of the dedicated host.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to automatically renew the subscription dedicated host. The `RenewalStatus` parameter takes precedence over the `AutoRenew` parameter. Valid values:
         * <p>
         * 
         * *   AutoRenewal: automatically renews the subscription dedicated host.
         * *   Normal: does not automatically renew the subscription dedicated host, but notifications for renewal are sent.
         * *   NotRenewal: does not automatically renew the subscription dedicated host, and no expiration notification is sent. Notifications for renewal are automatically sent three days before the expiration time of the subscription dedicated host. You can change the value of this parameter from NotRenewal to Normal for the dedicated host and manually renew it by calling the [RenewDedicatedHosts](~~134250~~) operation. Alternatively, you can renew it by setting this parameter to AutoRenewal.
         */
        public Builder renewalStatus(String renewalStatus) {
            this.putQueryParameter("RenewalStatus", renewalStatus);
            this.renewalStatus = renewalStatus;
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
        public ModifyDedicatedHostAutoRenewAttributeRequest build() {
            return new ModifyDedicatedHostAutoRenewAttributeRequest(this);
        } 

    } 

}
