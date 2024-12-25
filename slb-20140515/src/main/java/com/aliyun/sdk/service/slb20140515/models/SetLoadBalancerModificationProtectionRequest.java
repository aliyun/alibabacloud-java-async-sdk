// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link SetLoadBalancerModificationProtectionRequest} extends {@link RequestModel}
 *
 * <p>SetLoadBalancerModificationProtectionRequest</p>
 */
public class SetLoadBalancerModificationProtectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModificationProtectionReason")
    private String modificationProtectionReason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModificationProtectionStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modificationProtectionStatus;

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

    private SetLoadBalancerModificationProtectionRequest(Builder builder) {
        super(builder);
        this.loadBalancerId = builder.loadBalancerId;
        this.modificationProtectionReason = builder.modificationProtectionReason;
        this.modificationProtectionStatus = builder.modificationProtectionStatus;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLoadBalancerModificationProtectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return modificationProtectionReason
     */
    public String getModificationProtectionReason() {
        return this.modificationProtectionReason;
    }

    /**
     * @return modificationProtectionStatus
     */
    public String getModificationProtectionStatus() {
        return this.modificationProtectionStatus;
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

    public static final class Builder extends Request.Builder<SetLoadBalancerModificationProtectionRequest, Builder> {
        private String loadBalancerId; 
        private String modificationProtectionReason; 
        private String modificationProtectionStatus; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(SetLoadBalancerModificationProtectionRequest request) {
            super(request);
            this.loadBalancerId = request.loadBalancerId;
            this.modificationProtectionReason = request.modificationProtectionReason;
            this.modificationProtectionStatus = request.modificationProtectionStatus;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the CLB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1b6c719dfa08e*****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The reason why the configuration read-only mode is enabled. The value must be 1 to 80 characters in length. It must start with a letter and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * <blockquote>
         * <p> This parameter is valid only if the <strong>ModificationProtectionStatus</strong> parameter is set to <strong>ConsoleProtection</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Configuration change</p>
         */
        public Builder modificationProtectionReason(String modificationProtectionReason) {
            this.putQueryParameter("ModificationProtectionReason", modificationProtectionReason);
            this.modificationProtectionReason = modificationProtectionReason;
            return this;
        }

        /**
         * <p>Specifies whether to enable the configuration read-only mode. Valid values:</p>
         * <ul>
         * <li><strong>NonProtection</strong>: disables the configuration read-only mode. After you disable the configuration read-only mode, the value of <strong>ModificationProtectionReason</strong> is cleared.</li>
         * <li><strong>ConsoleProtection</strong>: enables the configuration read-only mode.</li>
         * </ul>
         * <blockquote>
         * <p> If you set this parameter to <strong>ConsoleProtection</strong>, you cannot use the CLB console to modify instance configurations. However, you can call API operations to modify instance configurations.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ConsoleProtection</p>
         */
        public Builder modificationProtectionStatus(String modificationProtectionStatus) {
            this.putQueryParameter("ModificationProtectionStatus", modificationProtectionStatus);
            this.modificationProtectionStatus = modificationProtectionStatus;
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
         * <p>The region ID of the CLB instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/27584.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
        public SetLoadBalancerModificationProtectionRequest build() {
            return new SetLoadBalancerModificationProtectionRequest(this);
        } 

    } 

}
