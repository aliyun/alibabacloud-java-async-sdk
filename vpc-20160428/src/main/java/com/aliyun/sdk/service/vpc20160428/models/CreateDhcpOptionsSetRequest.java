// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDhcpOptionsSetRequest} extends {@link RequestModel}
 *
 * <p>CreateDhcpOptionsSetRequest</p>
 */
public class CreateDhcpOptionsSetRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DhcpOptionsSetDescription")
    private String dhcpOptionsSetDescription;

    @Query
    @NameInMap("DhcpOptionsSetName")
    private String dhcpOptionsSetName;

    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("DomainNameServers")
    private String domainNameServers;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("Ipv6LeaseTime")
    private String ipv6LeaseTime;

    @Query
    @NameInMap("LeaseTime")
    private String leaseTime;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateDhcpOptionsSetRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dhcpOptionsSetDescription = builder.dhcpOptionsSetDescription;
        this.dhcpOptionsSetName = builder.dhcpOptionsSetName;
        this.domainName = builder.domainName;
        this.domainNameServers = builder.domainNameServers;
        this.dryRun = builder.dryRun;
        this.ipv6LeaseTime = builder.ipv6LeaseTime;
        this.leaseTime = builder.leaseTime;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDhcpOptionsSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dhcpOptionsSetDescription
     */
    public String getDhcpOptionsSetDescription() {
        return this.dhcpOptionsSetDescription;
    }

    /**
     * @return dhcpOptionsSetName
     */
    public String getDhcpOptionsSetName() {
        return this.dhcpOptionsSetName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainNameServers
     */
    public String getDomainNameServers() {
        return this.domainNameServers;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ipv6LeaseTime
     */
    public String getIpv6LeaseTime() {
        return this.ipv6LeaseTime;
    }

    /**
     * @return leaseTime
     */
    public String getLeaseTime() {
        return this.leaseTime;
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

    public static final class Builder extends Request.Builder<CreateDhcpOptionsSetRequest, Builder> {
        private String clientToken; 
        private String dhcpOptionsSetDescription; 
        private String dhcpOptionsSetName; 
        private String domainName; 
        private String domainNameServers; 
        private Boolean dryRun; 
        private String ipv6LeaseTime; 
        private String leaseTime; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDhcpOptionsSetRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dhcpOptionsSetDescription = request.dhcpOptionsSetDescription;
            this.dhcpOptionsSetName = request.dhcpOptionsSetName;
            this.domainName = request.domainName;
            this.domainNameServers = request.domainNameServers;
            this.dryRun = request.dryRun;
            this.ipv6LeaseTime = request.ipv6LeaseTime;
            this.leaseTime = request.leaseTime;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * DhcpOptionsSetDescription.
         */
        public Builder dhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
            this.putQueryParameter("DhcpOptionsSetDescription", dhcpOptionsSetDescription);
            this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
            return this;
        }

        /**
         * DhcpOptionsSetName.
         */
        public Builder dhcpOptionsSetName(String dhcpOptionsSetName) {
            this.putQueryParameter("DhcpOptionsSetName", dhcpOptionsSetName);
            this.dhcpOptionsSetName = dhcpOptionsSetName;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * DomainNameServers.
         */
        public Builder domainNameServers(String domainNameServers) {
            this.putQueryParameter("DomainNameServers", domainNameServers);
            this.domainNameServers = domainNameServers;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Ipv6LeaseTime.
         */
        public Builder ipv6LeaseTime(String ipv6LeaseTime) {
            this.putQueryParameter("Ipv6LeaseTime", ipv6LeaseTime);
            this.ipv6LeaseTime = ipv6LeaseTime;
            return this;
        }

        /**
         * LeaseTime.
         */
        public Builder leaseTime(String leaseTime) {
            this.putQueryParameter("LeaseTime", leaseTime);
            this.leaseTime = leaseTime;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
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
        public CreateDhcpOptionsSetRequest build() {
            return new CreateDhcpOptionsSetRequest(this);
        } 

    } 

}
