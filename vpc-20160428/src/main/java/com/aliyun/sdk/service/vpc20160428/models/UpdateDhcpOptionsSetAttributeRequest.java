// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDhcpOptionsSetAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateDhcpOptionsSetAttributeRequest</p>
 */
public class UpdateDhcpOptionsSetAttributeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DhcpOptionsSetDescription")
    private String dhcpOptionsSetDescription;

    @Query
    @NameInMap("DhcpOptionsSetId")
    @Validation(required = true)
    private String dhcpOptionsSetId;

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
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private UpdateDhcpOptionsSetAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dhcpOptionsSetDescription = builder.dhcpOptionsSetDescription;
        this.dhcpOptionsSetId = builder.dhcpOptionsSetId;
        this.dhcpOptionsSetName = builder.dhcpOptionsSetName;
        this.domainName = builder.domainName;
        this.domainNameServers = builder.domainNameServers;
        this.dryRun = builder.dryRun;
        this.ipv6LeaseTime = builder.ipv6LeaseTime;
        this.leaseTime = builder.leaseTime;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDhcpOptionsSetAttributeRequest create() {
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
     * @return dhcpOptionsSetId
     */
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
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

    public static final class Builder extends Request.Builder<UpdateDhcpOptionsSetAttributeRequest, Builder> {
        private String clientToken; 
        private String dhcpOptionsSetDescription; 
        private String dhcpOptionsSetId; 
        private String dhcpOptionsSetName; 
        private String domainName; 
        private String domainNameServers; 
        private Boolean dryRun; 
        private String ipv6LeaseTime; 
        private String leaseTime; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDhcpOptionsSetAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dhcpOptionsSetDescription = request.dhcpOptionsSetDescription;
            this.dhcpOptionsSetId = request.dhcpOptionsSetId;
            this.dhcpOptionsSetName = request.dhcpOptionsSetName;
            this.domainName = request.domainName;
            this.domainNameServers = request.domainNameServers;
            this.dryRun = request.dryRun;
            this.ipv6LeaseTime = request.ipv6LeaseTime;
            this.leaseTime = request.leaseTime;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Enter a description for the DHCP options set.
         * <p>
         * 
         * The description must be 2 to 256 characters in length. It must start with a letter and cannot start with `http://` or `https://`. You can also leave the description empty.
         */
        public Builder dhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
            this.putQueryParameter("DhcpOptionsSetDescription", dhcpOptionsSetDescription);
            this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
            return this;
        }

        /**
         * The ID of the DHCP options set.
         */
        public Builder dhcpOptionsSetId(String dhcpOptionsSetId) {
            this.putQueryParameter("DhcpOptionsSetId", dhcpOptionsSetId);
            this.dhcpOptionsSetId = dhcpOptionsSetId;
            return this;
        }

        /**
         * The name of the DHCP options set.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder dhcpOptionsSetName(String dhcpOptionsSetName) {
            this.putQueryParameter("DhcpOptionsSetName", dhcpOptionsSetName);
            this.dhcpOptionsSetName = dhcpOptionsSetName;
            return this;
        }

        /**
         * The root domain. For example, you can set the value to example.com.
         * <p>
         * 
         * After a DHCP options set is associated with a virtual private cloud (VPC), the root domain in the DHCP options set is automatically synchronized with the ECS instances in the VPC.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The IP address of the DNS server. You can enter at most four DNS server IP addresses. Separate IP addresses with commas (,).
         * <p>
         * 
         * >  If you do not specify a DNS server IP address, Elastic Compute Service (ECS) instances use the IP addresses of the Alibaba Cloud DNS servers, which are 100.100.2.136 and 100.100.2.138.
         */
        public Builder domainNameServers(String domainNameServers) {
            this.putQueryParameter("DomainNameServers", domainNameServers);
            this.domainNameServers = domainNameServers;
            return this;
        }

        /**
         * Specifies whether to perform a dry run. Valid values:
         * <p>
         * 
         * **true**: performs a dry run. The system checks the required parameters, request format, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * 
         * **false** (default): performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The lease time of the IPv6 addresses for the DHCP options set.
         * <p>
         * 
         * *   If you use hours as the unit, valid values are **24h to 1176h** and **87600h to 175200h**. Default value: **87600h**.
         * *   If you use days as the unit, valid values are **1d to 49d** and **3650d to 7300d**. Default value: **3650d**.
         * 
         * >  If you specify a value, you must also specify the unit.
         */
        public Builder ipv6LeaseTime(String ipv6LeaseTime) {
            this.putQueryParameter("Ipv6LeaseTime", ipv6LeaseTime);
            this.ipv6LeaseTime = ipv6LeaseTime;
            return this;
        }

        /**
         * The lease time of the IPv4 addresses for the DHCP options set.
         * <p>
         * 
         * *   If you use hours as the unit, valid values are **24h to 1176h** and **87600h to 175200h**. Default value: **87600h**.
         * *   If you use days as the unit, valid values are **1d to 49d** and **3650d to 7300d**. Default value: **3650d**.
         * 
         * >  If you specify a value, you must also specify the unit.
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
         * The region where the DHCP options set is deployed. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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
        public UpdateDhcpOptionsSetAttributeRequest build() {
            return new UpdateDhcpOptionsSetAttributeRequest(this);
        } 

    } 

}
