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
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("DedicatedHostIds")
    @Validation(required = true)
    private String dedicatedHostIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Duration")
    private Integer duration;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("RenewalStatus")
    private String renewalStatus;

    @Query
    @NameInMap("AutoRenewWithEcs")
    private String autoRenewWithEcs;

    private ModifyDedicatedHostAutoRenewAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.dedicatedHostIds = builder.dedicatedHostIds;
        this.regionId = builder.regionId;
        this.duration = builder.duration;
        this.autoRenew = builder.autoRenew;
        this.periodUnit = builder.periodUnit;
        this.renewalStatus = builder.renewalStatus;
        this.autoRenewWithEcs = builder.autoRenewWithEcs;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return dedicatedHostIds
     */
    public String getDedicatedHostIds() {
        return this.dedicatedHostIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return renewalStatus
     */
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    /**
     * @return autoRenewWithEcs
     */
    public String getAutoRenewWithEcs() {
        return this.autoRenewWithEcs;
    }

    public static final class Builder extends Request.Builder<ModifyDedicatedHostAutoRenewAttributeRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String dedicatedHostIds; 
        private String regionId; 
        private Integer duration; 
        private Boolean autoRenew; 
        private String periodUnit; 
        private String renewalStatus; 
        private String autoRenewWithEcs; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDedicatedHostAutoRenewAttributeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.dedicatedHostIds = request.dedicatedHostIds;
            this.regionId = request.regionId;
            this.duration = request.duration;
            this.autoRenew = request.autoRenew;
            this.periodUnit = request.periodUnit;
            this.renewalStatus = request.renewalStatus;
            this.autoRenewWithEcs = request.autoRenewWithEcs;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the dedicated host. You can enter up to 100 dedicated host IDs. Separate the IDs with commas (,).
         */
        public Builder dedicatedHostIds(String dedicatedHostIds) {
            this.putQueryParameter("DedicatedHostIds", dedicatedHostIds);
            this.dedicatedHostIds = dedicatedHostIds;
            return this;
        }

        /**
         * The ID of the region to which the dedicated host belongs.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The renewal period. Valid values:
         * <p>
         * 
         * -When PeriodUnit is set to Week, the value range of this parameter is {1, 2, 3}.
         * -If PeriodUnit is set to Month, the value range of this parameter is {1, 2, 3, 6, 12}.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * Specifies whether to automatically renew the subscription dedicated host. Valid values:
         * <p>
         * 
         * -true: The dedicated host is automatically renewed.
         * 
         * -false: The dedicated host is not automatically renewed.
         * 
         * Default value: false
         * 
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The renewal period. Unit. Valid values:
         * <p>
         * 
         * -Week: Week
         * -Month: Month
         * 
         * Default value: Month
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * Specifies whether to automatically renew the subscription dedicated host. The "RenewalStatus" parameter takes precedence over "AutoRenew ". Valid values:
         * <p>
         * 
         * -AutoRenewal: auto renewal.
         * 
         * -Normal: to be renewed.
         * 
         * -NotRenewal: no renewal or expiration notification is sent. The system automatically sends a non-renewal reminder on the third day before the expiration date. If you do not renew a dedicated host, you can set it to Normal, and then renew it ([RenewDedicatedHosts](~~ 134250 ~~)) or set it to automatic (AutoRenewal).
         */
        public Builder renewalStatus(String renewalStatus) {
            this.putQueryParameter("RenewalStatus", renewalStatus);
            this.renewalStatus = renewalStatus;
            return this;
        }

        /**
         * Specifies whether to automatically renew the subscription ECS instance on the DDH.
         * <p>
         * 
         * If the billing method of your dedicated host (DDH) is subscription, and auto-renewal is enabled for the subscription ECS instance in the DDH. You can use this parameter to set the DDH to automatically renew with the ECS instance. When an ECS instance in a DDH is automatically renewed, if the expiration time of the DDH is shorter than the expiration time after the ECS instance is renewed, the DDH is also automatically renewed. The following table describes the principles for automatic renewal of DDH with ECS instances:
         * 
         * The DDH automatically determines the expiration time of the corresponding ECS instance after renewal, and then selects the expiration time that is later than the ECS instance Expiration Time and meets the minimum renewal period of the DDH renewal period. For more information about the renewal cycles supported by DDH, see The "Dune" and "Duration" parameters.
         * 
         * For example, if a subscription DDH expires on January 15 of the current year and the subscription ECS instance in the DDH expires on November 15 of the current year after automatic renewal, the lifecycle of the DDH is 10 months shorter than that of the ECS instance. In this case, when the DDH is automatically renewed, the minimum renewal period is 12 months (that is, "PeriodUnit = Month" and "Duration = 12").
         * 
         * Valid values:
         * 
         * -AutoRenewWithEcs: auto renewal is performed on the subscription ECS instance of the dedicated host.
         * -StopRenewWithEcs: auto renewal is not followed by subscription ECS instances on the dedicated host.
         * -NoOperation: the current settings of the DDH are not changed.
         * 
         * > If you set this parameter to AutoRenewWithEcs, make sure that auto-renewal is enabled for the DDH, that is, "AutoRenew = true. Otherwise, this parameter only changes the value of the parameter, and the automatic renewal function of the ECS instance does not take effect.
         * 
         * Default value: NoOperation
         * 
         * 
         */
        public Builder autoRenewWithEcs(String autoRenewWithEcs) {
            this.putQueryParameter("AutoRenewWithEcs", autoRenewWithEcs);
            this.autoRenewWithEcs = autoRenewWithEcs;
            return this;
        }

        @Override
        public ModifyDedicatedHostAutoRenewAttributeRequest build() {
            return new ModifyDedicatedHostAutoRenewAttributeRequest(this);
        } 

    } 

}
