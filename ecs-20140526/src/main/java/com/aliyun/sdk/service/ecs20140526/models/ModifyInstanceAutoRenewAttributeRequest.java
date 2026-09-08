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
 * {@link ModifyInstanceAutoRenewAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceAutoRenewAttributeRequest</p>
 */
public class ModifyInstanceAutoRenewAttributeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

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

    private ModifyInstanceAutoRenewAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.autoRenew = builder.autoRenew;
        this.duration = builder.duration;
        this.instanceId = builder.instanceId;
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

    public static ModifyInstanceAutoRenewAttributeRequest create() {
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
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<ModifyInstanceAutoRenewAttributeRequest, Builder> {
        private String sourceRegionId; 
        private Boolean autoRenew; 
        private Integer duration; 
        private String instanceId; 
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

        private Builder(ModifyInstanceAutoRenewAttributeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.autoRenew = request.autoRenew;
            this.duration = request.duration;
            this.instanceId = request.instanceId;
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
         * <p>Specifies whether to enable auto-renewal before the instance expires.</p>
         * <ul>
         * <li>true: enables auto-renewal.</li>
         * <li>false: disables auto-renewal.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The auto-renewal duration of the instance.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>If <code>PeriodUnit</code> is set to <code>Year</code>, valid values of <code>Duration</code> are: {&quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;4&quot;, &quot;5&quot;}.</li>
         * <li>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values of <code>Duration</code> are: {&quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;6&quot;, &quot;12&quot;, &quot;24&quot;, &quot;36&quot;, &quot;48&quot;, &quot;60&quot;}.</li>
         * <li>If <code>PeriodUnit</code> is set to <code>Week</code>, valid values of <code>Duration</code> are: {&quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;4&quot;}.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>If <code>PeriodUnit</code> is set to <code>Year</code>, valid values of <code>Duration</code> are: {&quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;4&quot;, &quot;5&quot;}.</li>
         * <li>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values of <code>Duration</code> are: {&quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;6&quot;, &quot;12&quot;, &quot;24&quot;, &quot;36&quot;, &quot;48&quot;, &quot;60&quot;}.</li>
         * </ul>
         * <p>&lt;props=&quot;partner&quot;&gt;</p>
         * <ul>
         * <li>If <code>PeriodUnit</code> is set to <code>Year</code>, valid values of <code>Duration</code> are: {&quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;4&quot;, &quot;5&quot;}.</li>
         * <li>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values of <code>Duration</code> are: {&quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;6&quot;, &quot;12&quot;, &quot;24&quot;, &quot;36&quot;, &quot;48&quot;, &quot;60&quot;}.</li>
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
         * <p>The instance IDs. You can specify up to 100 subscription instance IDs at a time. Separate multiple instance IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4ph****,i-bp67acfmxazb4pi****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * <p>The unit of the renewal duration specified by the <code>Duration</code> parameter. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>Week</li>
         * <li>Month (default)</li>
         * <li>Year</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>Month (default)</li>
         * <li>Year</li>
         * </ul>
         * <p>&lt;props=&quot;partner&quot;&gt;</p>
         * <ul>
         * <li>Month (default)</li>
         * <li>Year</li>
         * </ul>
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
         * <p>The region ID of the instances. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * <p>The auto-renewal status of ECS instance. Valid values:</p>
         * <ul>
         * <li><p>AutoRenewal: enables auto-renewal.</p>
         * </li>
         * <li><p>Normal: disables auto-renewal.</p>
         * </li>
         * <li><p>NotRenewal: does not renew ECS instance. After this value is specified, the system no longer sends expiration notifications. Only a non-renewal reminder is sent three days before ECS instance expires. You can change the value for an instance from NotRenewal to <code>Normal</code> and then manually renew ECS instance or configure auto-renewal.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The <code>RenewalStatus</code> parameter takes precedence over the <code>AutoRenew</code> parameter. If <code>RenewalStatus</code> is not specified, the <code>AutoRenew</code> parameter is used by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AutoRenewal</p>
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
        public ModifyInstanceAutoRenewAttributeRequest build() {
            return new ModifyInstanceAutoRenewAttributeRequest(this);
        } 

    } 

}
