// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyAutoRenewAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyAutoRenewAttributeRequest</p>
 */
public class ModifyAutoRenewAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudProvider")
    private String cloudProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private String duration;

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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyAutoRenewAttributeRequest(Builder builder) {
        super(builder);
        this.cloudProvider = builder.cloudProvider;
        this.DBClusterIds = builder.DBClusterIds;
        this.duration = builder.duration;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.renewalStatus = builder.renewalStatus;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAutoRenewAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudProvider
     */
    public String getCloudProvider() {
        return this.cloudProvider;
    }

    /**
     * @return DBClusterIds
     */
    public String getDBClusterIds() {
        return this.DBClusterIds;
    }

    /**
     * @return duration
     */
    public String getDuration() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public static final class Builder extends Request.Builder<ModifyAutoRenewAttributeRequest, Builder> {
        private String cloudProvider; 
        private String DBClusterIds; 
        private String duration; 
        private String ownerAccount; 
        private Long ownerId; 
        private String periodUnit; 
        private String regionId; 
        private String renewalStatus; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAutoRenewAttributeRequest request) {
            super(request);
            this.cloudProvider = request.cloudProvider;
            this.DBClusterIds = request.DBClusterIds;
            this.duration = request.duration;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.periodUnit = request.periodUnit;
            this.regionId = request.regionId;
            this.renewalStatus = request.renewalStatus;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The cloud provider of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ENS</p>
         */
        public Builder cloudProvider(String cloudProvider) {
            this.putQueryParameter("CloudProvider", cloudProvider);
            this.cloudProvider = cloudProvider;
            return this;
        }

        /**
         * <p>The ID of the database cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-***************</p>
         */
        public Builder DBClusterIds(String DBClusterIds) {
            this.putQueryParameter("DBClusterIds", DBClusterIds);
            this.DBClusterIds = DBClusterIds;
            return this;
        }

        /**
         * <p>The auto-renewal period. Valid values:</p>
         * <ul>
         * <li><p>When <strong>PeriodUnit</strong> is <strong>Month</strong>, the valid values are <code>[1,2,3,6,12]</code>.</p>
         * </li>
         * <li><p>When <strong>PeriodUnit</strong> is <strong>Year</strong>, the valid values are <code>[1-3]</code>.</p>
         * </li>
         * </ul>
         * <p>Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder duration(String duration) {
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
         * <p>The unit of the auto-renewal period. Valid values:</p>
         * <ul>
         * <li><p><strong>Year</strong></p>
         * </li>
         * <li><p><strong>Month</strong></p>
         * </li>
         * </ul>
         * <p>Default value: <strong>Month</strong>.</p>
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
         * <p>The region ID. The ID can be up to 50 characters in length.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2319134.html">DescribeRegions</a> operation to query available regions.</p>
         * </blockquote>
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
         * <p>The auto-renewal status. Valid values:</p>
         * <ul>
         * <li><p><strong>AutoRenewal</strong>: Enables auto-renewal.</p>
         * </li>
         * <li><p><strong>Normal</strong>: Enables manual renewal.</p>
         * </li>
         * <li><p><strong>NotRenewal</strong>: Disables renewal.</p>
         * </li>
         * </ul>
         * <p>Default value: <strong>AutoRenewal</strong>.</p>
         * <blockquote>
         * <p>When you set this parameter to <strong>NotRenewal</strong>, the system stops sending expiration reminders and sends only a non-renewal notification three days before the expiration date.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-************</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
        public ModifyAutoRenewAttributeRequest build() {
            return new ModifyAutoRenewAttributeRequest(this);
        } 

    } 

}
