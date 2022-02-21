// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeSecurityGroupEgressRequest} extends {@link RequestModel}
 *
 * <p>RevokeSecurityGroupEgressRequest</p>
 */
public class RevokeSecurityGroupEgressRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("PortRange")
    private String portRange;

    @Query
    @NameInMap("DestGroupOwnerAccount")
    private String destGroupOwnerAccount;

    @Query
    @NameInMap("DestPrefixListId")
    private String destPrefixListId;

    @Query
    @NameInMap("SourceCidrIp")
    private String sourceCidrIp;

    @Query
    @NameInMap("SourcePortRange")
    private String sourcePortRange;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Ipv6SourceCidrIp")
    private String ipv6SourceCidrIp;

    @Query
    @NameInMap("NicType")
    private String nicType;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DestGroupOwnerId")
    private Long destGroupOwnerId;

    @Query
    @NameInMap("Ipv6DestCidrIp")
    private String ipv6DestCidrIp;

    @Query
    @NameInMap("DestGroupId")
    private String destGroupId;

    @Query
    @NameInMap("DestCidrIp")
    private String destCidrIp;

    @Query
    @NameInMap("Policy")
    private String policy;

    @Query
    @NameInMap("Priority")
    private String priority;

    @Query
    @NameInMap("IpProtocol")
    private String ipProtocol;

    private RevokeSecurityGroupEgressRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.securityGroupId = builder.securityGroupId;
        this.portRange = builder.portRange;
        this.destGroupOwnerAccount = builder.destGroupOwnerAccount;
        this.destPrefixListId = builder.destPrefixListId;
        this.sourceCidrIp = builder.sourceCidrIp;
        this.sourcePortRange = builder.sourcePortRange;
        this.clientToken = builder.clientToken;
        this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
        this.nicType = builder.nicType;
        this.description = builder.description;
        this.destGroupOwnerId = builder.destGroupOwnerId;
        this.ipv6DestCidrIp = builder.ipv6DestCidrIp;
        this.destGroupId = builder.destGroupId;
        this.destCidrIp = builder.destCidrIp;
        this.policy = builder.policy;
        this.priority = builder.priority;
        this.ipProtocol = builder.ipProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeSecurityGroupEgressRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return portRange
     */
    public String getPortRange() {
        return this.portRange;
    }

    /**
     * @return destGroupOwnerAccount
     */
    public String getDestGroupOwnerAccount() {
        return this.destGroupOwnerAccount;
    }

    /**
     * @return destPrefixListId
     */
    public String getDestPrefixListId() {
        return this.destPrefixListId;
    }

    /**
     * @return sourceCidrIp
     */
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    /**
     * @return sourcePortRange
     */
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ipv6SourceCidrIp
     */
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    /**
     * @return nicType
     */
    public String getNicType() {
        return this.nicType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destGroupOwnerId
     */
    public Long getDestGroupOwnerId() {
        return this.destGroupOwnerId;
    }

    /**
     * @return ipv6DestCidrIp
     */
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    /**
     * @return destGroupId
     */
    public String getDestGroupId() {
        return this.destGroupId;
    }

    /**
     * @return destCidrIp
     */
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public static final class Builder extends Request.Builder<RevokeSecurityGroupEgressRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String securityGroupId; 
        private String portRange; 
        private String destGroupOwnerAccount; 
        private String destPrefixListId; 
        private String sourceCidrIp; 
        private String sourcePortRange; 
        private String clientToken; 
        private String ipv6SourceCidrIp; 
        private String nicType; 
        private String description; 
        private Long destGroupOwnerId; 
        private String ipv6DestCidrIp; 
        private String destGroupId; 
        private String destCidrIp; 
        private String policy; 
        private String priority; 
        private String ipProtocol; 

        private Builder() {
            super();
        } 

        private Builder(RevokeSecurityGroupEgressRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.regionId = response.regionId;
            this.securityGroupId = response.securityGroupId;
            this.portRange = response.portRange;
            this.destGroupOwnerAccount = response.destGroupOwnerAccount;
            this.destPrefixListId = response.destPrefixListId;
            this.sourceCidrIp = response.sourceCidrIp;
            this.sourcePortRange = response.sourcePortRange;
            this.clientToken = response.clientToken;
            this.ipv6SourceCidrIp = response.ipv6SourceCidrIp;
            this.nicType = response.nicType;
            this.description = response.description;
            this.destGroupOwnerId = response.destGroupOwnerId;
            this.ipv6DestCidrIp = response.ipv6DestCidrIp;
            this.destGroupId = response.destGroupId;
            this.destCidrIp = response.destCidrIp;
            this.policy = response.policy;
            this.priority = response.priority;
            this.ipProtocol = response.ipProtocol;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The region ID of the source security group. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the source security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The port range related to the transport layer protocol opened by the destination security group. Valid values:
         * <p>
         * 
         * -TCP/UDP: valid values: 1 to 65535. Use a slash (/) to separate the start port from the end port. Example: 1/200
         * -ICMP:-1/-1
         * -GRE protocol:-1/-1
         * -all:-1/-1
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
            return this;
        }

        /**
         * The Alibaba Cloud account to which the destination security group belongs when you delete a security group rule across accounts.
         * <p>
         * 
         * -If "DestGroupOwnerAccount" and "DestGroupOwnerId" are not set, the access permission of other security groups is revoked.
         * -If the "DestCidrIp" parameter is set, the "DestGroupOwnerAccount" parameter is invalid.
         * 
         */
        public Builder destGroupOwnerAccount(String destGroupOwnerAccount) {
            this.putQueryParameter("DestGroupOwnerAccount", destGroupOwnerAccount);
            this.destGroupOwnerAccount = destGroupOwnerAccount;
            return this;
        }

        /**
         * The list of destination prefixes to be revoked. You can call [DescribePrefixLists](~~ 205046 ~~) to query the list IDs of available prefixes.
         * <p>
         * 
         * Note:
         * 
         * -If the network type of a security group is classic network, the prefix list cannot be set. For more information about security groups and Prefix List restrictions, see [Security Group restrictions](~~ 25412#SecurityGroupQuota1 ~~).
         * -If you specify one of the "DestCidrIp", "Ipv6DestCidrIp", and "DestGroupId" parameters, this parameter is ignored.
         */
        public Builder destPrefixListId(String destPrefixListId) {
            this.putQueryParameter("DestPrefixListId", destPrefixListId);
            this.destPrefixListId = destPrefixListId;
            return this;
        }

        /**
         * The range of source IP addresses. CIDR and IPv4 IP addresses are supported.
         * <p>
         * 
         * Default value: None
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.putQueryParameter("SourceCidrIp", sourceCidrIp);
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }

        /**
         * The range of ports related to the transport layer protocol opened by the source security group. Valid values:
         * <p>
         * 
         * -TCP/UDP: valid values: 1 to 65535. Use a slash (/) to separate the start port from the end port. Example: 1/200
         * -ICMP:-1/-1
         * -GRE protocol:-1/-1
         * -all:-1/-1
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.putQueryParameter("SourcePortRange", sourcePortRange);
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The source IPv6 CIDR block. CIDR and IPv6 IP addresses are supported.
         * <p>
         * 
         * 
         * Default value: None
         * 
         * > only VPC-type IP addresses are supported.
         */
        public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.putQueryParameter("Ipv6SourceCidrIp", ipv6SourceCidrIp);
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }

        /**
         * The NIC type of the classic network security group rule. Valid values:
         * <p>
         * 
         * -internet: internet Nic
         * -intranet: intranet Nic
         * 
         * Default value: internet
         * 
         * In the following cases, the parameter NicType can only be set to intranet:
         * -You do not need to set the Nic type for VPC-type security group rules. The default value is intranet, which can only be intranet.
         * -When the security group is configured to access each other, that is, only the "DestGroupId" parameter is specified, it can only be intranet.
         * 
         * 
         */
        public Builder nicType(String nicType) {
            this.putQueryParameter("NicType", nicType);
            this.nicType = nicType;
            return this;
        }

        /**
         * The description of the security group rule.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the destination security group belongs when you delete a security group rule across accounts.
         * <p>
         * 
         * -If "DestGroupOwnerId" and "DestGroupOwnerAccount" are not set, the access permission of other security groups is revoked.
         * -If you have set the "DestCidrIp" parameter, the "DestGroupOwnerId" parameter is invalid.
         * 
         */
        public Builder destGroupOwnerId(Long destGroupOwnerId) {
            this.putQueryParameter("DestGroupOwnerId", destGroupOwnerId);
            this.destGroupOwnerId = destGroupOwnerId;
            return this;
        }

        /**
         * The Destination IPv6 CIDR block to which you want to revoke access permissions. CIDR and IPv6 IP addresses are supported.
         * <p>
         * 
         * > only VPC-type IP addresses are supported.
         * 
         * Default value: None
         */
        public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
            this.putQueryParameter("Ipv6DestCidrIp", ipv6DestCidrIp);
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }

        /**
         * The ID of the destination security group to which you want to revoke access permissions. Set at least one of the "DestGroupId" or "DestCidrIp" parameters.
         * <p>
         * 
         * -If "DestGroupId" is specified but "DestCidrIp" is not specified, the value of "NicType" can only be intranet.
         * -If both "DestGroupId" and "DestCidrIp" are specified, the default value is "DestCidrIp.
         */
        public Builder destGroupId(String destGroupId) {
            this.putQueryParameter("DestGroupId", destGroupId);
            this.destGroupId = destGroupId;
            return this;
        }

        /**
         * The Destination IPv4 CIDR block to which you want to revoke access permissions. CIDR and IPv4 IP addresses are supported.
         * <p>
         * 
         * Default value: None
         */
        public Builder destCidrIp(String destCidrIp) {
            this.putQueryParameter("DestCidrIp", destCidrIp);
            this.destCidrIp = destCidrIp;
            return this;
        }

        /**
         * The access permission. Valid values:
         * <p>
         * 
         * -accept: Accepts access.
         * -drop: denies access and does not send back the deny message.
         * 
         * Default value: accept
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * The priority of the security group rule. Valid values: 1 to 100.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder priority(String priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The transport layer protocol. Case insensitive. Valid values:
         * <p>
         * 
         * -icmp
         * -gre
         * -tcp
         * -udp
         * -all: all protocols are supported.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        @Override
        public RevokeSecurityGroupEgressRequest build() {
            return new RevokeSecurityGroupEgressRequest(this);
        } 

    } 

}
