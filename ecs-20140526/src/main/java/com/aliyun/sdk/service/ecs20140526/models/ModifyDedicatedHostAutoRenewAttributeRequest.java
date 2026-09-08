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
 * {@link ModifyDedicatedHostAutoRenewAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDedicatedHostAutoRenewAttributeRequest</p>
 */
public class ModifyDedicatedHostAutoRenewAttributeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewWithEcs")
    private String autoRenewWithEcs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dedicatedHostIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenewalStatus")
    private String renewalStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
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
         * <p>Specifies whether to enable auto-renewal for the subscription dedicated host. Valid values:</p>
         * <ul>
         * <li><p>true: Enables auto-renewal for the subscription dedicated host.</p>
         * </li>
         * <li><p>false: Disables auto-renewal for the subscription dedicated host.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal for the dedicated host to follow the subscription ECS instances on the host.</p>
         * <p>If your dedicated host (DDH) uses the subscription billing method and the subscription ECS instances on the DDH have auto-renewal enabled, you can use this parameter to configure the DDH to automatically renew along with the ECS instances. When an ECS instance on the DDH is automatically renewed, if the DDH expires earlier than the new expiration time of the ECS instance, the DDH is also automatically renewed. The principle of DDH auto-renewal following ECS instances is as follows:</p>
         * <p>The DDH automatically determines the new expiration time of the corresponding ECS instance, and then selects the minimum renewal period that is greater than the ECS instance expiration time and meets the DDH renewal cycle. For details about the supported renewal cycles of DDHs, see the metric descriptions of the PeriodUnit and Duration parameters.</p>
         * <p>Example: A subscription DDH expires on January 15 of the current year. After a subscription ECS instance on the DDH is automatically renewed, the ECS instance expiration is extended to November 15 of the current year. The DDH lifecycle is 10 months shorter than the ECS instance lifecycle. In this case, the DDH selects the minimum renewal period that is greater than 10 months and meets the DDH renewal cycle, which is 12 months (PeriodUnit=Month and Duration=12).</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AutoRenewWithEcs: Enables auto-renewal following the subscription ECS instances on the dedicated host.</li>
         * <li>StopRenewWithEcs: Disables auto-renewal following the subscription ECS instances on the dedicated host.</li>
         * <li>NoOperation: Does not change the current settings of the dedicated host.</li>
         * </ul>
         * <blockquote>
         * <p>If you set this parameter to AutoRenewWithEcs, make sure that auto-renewal is enabled for the dedicated host (AutoRenew=true). Otherwise, this parameter only changes the parameter value, and the actual auto-renewal feature following ECS instances does not take effect.</p>
         * </blockquote>
         * <p>Default value: NoOperation.</p>
         * 
         * <strong>example:</strong>
         * <p>StopRenewWithEcs</p>
         */
        public Builder autoRenewWithEcs(String autoRenewWithEcs) {
            this.putQueryParameter("AutoRenewWithEcs", autoRenewWithEcs);
            this.autoRenewWithEcs = autoRenewWithEcs;
            return this;
        }

        /**
         * <p>The IDs of dedicated hosts. You can specify up to 100 subscription dedicated host IDs. Separate multiple IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dh-bp165p6xk2tlw61e****</p>
         */
        public Builder dedicatedHostIds(String dedicatedHostIds) {
            this.putQueryParameter("DedicatedHostIds", dedicatedHostIds);
            this.dedicatedHostIds = dedicatedHostIds;
            return this;
        }

        /**
         * <p>The renewal period. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>If PeriodUnit is set to Week: 1, 2, 3, and 4.</li>
         * <li>If PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</li>
         * <li>If PeriodUnit is set to Year: 1, 2, 3, 4, and 5.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>If PeriodUnit is set to Month: 1 and 12.</li>
         * <li>If PeriodUnit is set to Year: 1 and 12.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The unit of the renewal period. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>Week</li>
         * <li>Month</li>
         * <li>Year</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>Month</li>
         * <li>Year</li>
         * </ul>
         * <p>Default value: Month.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The region ID of the dedicated host.</p>
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
         * <p>Specifies whether to enable auto-renewal for the subscription dedicated host. The RenewalStatus parameter takes precedence over the AutoRenew parameter. Valid values:</p>
         * <ul>
         * <li><p>AutoRenewal: Enables auto-renewal.</p>
         * </li>
         * <li><p>Normal: Disables auto-renewal but the system still sends expiration notifications.</p>
         * </li>
         * <li><p>NotRenewal: Disables auto-renewal and the system does not send expiration notifications. Three days before expiration, the system automatically sends a non-renewal notification. You can change the value of this parameter to Normal for a dedicated host, and then manually renew the host by calling <a href="https://help.aliyun.com/document_detail/134250.html">RenewDedicatedHosts</a> or set the value to AutoRenewal to enable auto-renewal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
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
