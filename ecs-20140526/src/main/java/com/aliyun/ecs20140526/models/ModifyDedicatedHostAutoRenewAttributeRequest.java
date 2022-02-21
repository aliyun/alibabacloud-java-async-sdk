// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DedicatedHostIds")
    private String dedicatedHostIds;

    @Query
    @NameInMap("Duration")
    private Integer duration;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

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
        this.regionId = builder.regionId;
        this.dedicatedHostIds = builder.dedicatedHostIds;
        this.duration = builder.duration;
        this.periodUnit = builder.periodUnit;
        this.autoRenew = builder.autoRenew;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
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
        private String regionId; 
        private String dedicatedHostIds; 
        private Integer duration; 
        private String periodUnit; 
        private Boolean autoRenew; 
        private String renewalStatus; 
        private String autoRenewWithEcs; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDedicatedHostAutoRenewAttributeRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.regionId = response.regionId;
            this.dedicatedHostIds = response.dedicatedHostIds;
            this.duration = response.duration;
            this.periodUnit = response.periodUnit;
            this.autoRenew = response.autoRenew;
            this.renewalStatus = response.renewalStatus;
            this.autoRenewWithEcs = response.autoRenewWithEcs;
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
         * The ID of the region to which the dedicated host belongs.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * Renewal cycle. Valid values:
         * <p>
         * 
         * -When PeriodUnit = Week when the parameter value range is {1, 2, 3}.
         * -When PeriodUnit = Month when the parameter value range is {1, 2, 3, 6, 12}.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * Renew length units. Valid values:
         * <p>
         * 
         * -Week: Weeks
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
         * Specifies whether to automatically renew the subscription dedicated host. Valid values:
         * <p>
         * 
         * -true: The dedicated host is automatically renewed.
         * 
         * -false: no automatic renew annual commitment monthly proprietary host.
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
         * Whether to automatically renew annual commitment monthly proprietary host, parameter "renewalstatus" higher priority than "autorenew ". Valid values:
         * <p>
         * 
         * -AutoRenewal: auto renewal.
         * 
         * -Normal: to be renewed.
         * 
         * -NotRenewal: no renewal or expiration notification is sent. Before expiration third day system will automatically send non-renewal reminder. Don"t renew proprietary host can be set to be continued fee (Normal), again self renewal ([RenewDedicatedHosts](~~ 134250 ~~)) or set to automatically renew (AutoRenewal).
         */
        public Builder renewalStatus(String renewalStatus) {
            this.putQueryParameter("RenewalStatus", renewalStatus);
            this.renewalStatus = renewalStatus;
            return this;
        }

        /**
         * Sets whether follow proprietary host inside the annual commitment monthly ECS instance automatic renewals.
         * <p>
         * 
         * If your proprietary host (DDH) for annual commitment monthly billing, and the DDH in-annual commitment monthly ECS instance opens automatic renewals. You can use this parameter to set the DDH to automatically renew with the ECS instance. When DDH in-ECS instance automatically renew when, if DDH expiration time than the ECS instance renew after the expiration time of the short, the DDH also automatically renewals. DDH follow ECS instance automatically renew the principle of description:
         * 
         * DDH automatically determines corresponding ECS instance renew after the expiration time of the, and then automatically renew DDH when long, Select Greater than ECS instance Expiration Time, and meet DDH renewal cycle minimum renewal length to renew. DDH support renewals cycle details, see "periodunit" and "duration" parameter description.
         * 
         * For example: annual commitment monthly DDH in the year 01 yue 15 ri due DDH in annual commitment monthly ECS instance automatically renew after, will length extension to year 11 yue 15 ri due, the DDH life cycle than ECS instance life cycle less 10 months. The DDH in automatically renew when, will select greater than 10 months, and meet DDH renewal cycle minimum renewal length 12 months (the "periodunit = month" and "duration = 12") to renew.
         * 
         * Valid values:
         * 
         * -AutoRenewWithEcs: follow proprietary host machine annual commitment monthly ECS instance automatic renewals.
         * -StopRenewWithEcs: auto renewal is not followed by subscription ECS instances on the dedicated host.
         * -NoOperation: No change proprietary host the current settings.
         * 
         * > If you set the parameter is AutoRenewWithEcs, need to ensure that proprietary host open automatically renew (that is "autorenew = true"). Otherwise, this parameter only changes the value of the parameter, and the automatic renewal function of the ECS instance does not take effect.
         * 
         * Default: NoOperation
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
