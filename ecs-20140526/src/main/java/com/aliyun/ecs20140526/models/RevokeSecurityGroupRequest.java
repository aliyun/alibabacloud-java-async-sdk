// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>RevokeSecurityGroupRequest</p>
 */
public class RevokeSecurityGroupRequest extends Request {
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
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("SourcePortRange")
    private String sourcePortRange;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("PortRange")
    private String portRange;

    @Query
    @NameInMap("SourceCidrIp")
    private String sourceCidrIp;

    @Query
    @NameInMap("SourceGroupOwnerAccount")
    private String sourceGroupOwnerAccount;

    @Query
    @NameInMap("SourceGroupId")
    private String sourceGroupId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DestCidrIp")
    private String destCidrIp;

    @Query
    @NameInMap("Ipv6DestCidrIp")
    private String ipv6DestCidrIp;

    @Query
    @NameInMap("Priority")
    private String priority;

    @Query
    @NameInMap("Policy")
    private String policy;

    @Query
    @NameInMap("NicType")
    private String nicType;

    @Query
    @NameInMap("SourceGroupOwnerId")
    private Long sourceGroupOwnerId;

    @Query
    @NameInMap("Ipv6SourceCidrIp")
    private String ipv6SourceCidrIp;

    @Query
    @NameInMap("SourcePrefixListId")
    private String sourcePrefixListId;

    @Query
    @NameInMap("IpProtocol")
    private String ipProtocol;

    @Query
    @NameInMap("Description")
    private String description;

    private RevokeSecurityGroupRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityGroupId = builder.securityGroupId;
        this.sourcePortRange = builder.sourcePortRange;
        this.clientToken = builder.clientToken;
        this.portRange = builder.portRange;
        this.sourceCidrIp = builder.sourceCidrIp;
        this.sourceGroupOwnerAccount = builder.sourceGroupOwnerAccount;
        this.sourceGroupId = builder.sourceGroupId;
        this.regionId = builder.regionId;
        this.destCidrIp = builder.destCidrIp;
        this.ipv6DestCidrIp = builder.ipv6DestCidrIp;
        this.priority = builder.priority;
        this.policy = builder.policy;
        this.nicType = builder.nicType;
        this.sourceGroupOwnerId = builder.sourceGroupOwnerId;
        this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
        this.sourcePrefixListId = builder.sourcePrefixListId;
        this.ipProtocol = builder.ipProtocol;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeSecurityGroupRequest create() {
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
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
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
     * @return portRange
     */
    public String getPortRange() {
        return this.portRange;
    }

    /**
     * @return sourceCidrIp
     */
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    /**
     * @return sourceGroupOwnerAccount
     */
    public String getSourceGroupOwnerAccount() {
        return this.sourceGroupOwnerAccount;
    }

    /**
     * @return sourceGroupId
     */
    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return destCidrIp
     */
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    /**
     * @return ipv6DestCidrIp
     */
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return nicType
     */
    public String getNicType() {
        return this.nicType;
    }

    /**
     * @return sourceGroupOwnerId
     */
    public Long getSourceGroupOwnerId() {
        return this.sourceGroupOwnerId;
    }

    /**
     * @return ipv6SourceCidrIp
     */
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    /**
     * @return sourcePrefixListId
     */
    public String getSourcePrefixListId() {
        return this.sourcePrefixListId;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<RevokeSecurityGroupRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityGroupId; 
        private String sourcePortRange; 
        private String clientToken; 
        private String portRange; 
        private String sourceCidrIp; 
        private String sourceGroupOwnerAccount; 
        private String sourceGroupId; 
        private String regionId; 
        private String destCidrIp; 
        private String ipv6DestCidrIp; 
        private String priority; 
        private String policy; 
        private String nicType; 
        private Long sourceGroupOwnerId; 
        private String ipv6SourceCidrIp; 
        private String sourcePrefixListId; 
        private String ipProtocol; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(RevokeSecurityGroupRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.securityGroupId = response.securityGroupId;
            this.sourcePortRange = response.sourcePortRange;
            this.clientToken = response.clientToken;
            this.portRange = response.portRange;
            this.sourceCidrIp = response.sourceCidrIp;
            this.sourceGroupOwnerAccount = response.sourceGroupOwnerAccount;
            this.sourceGroupId = response.sourceGroupId;
            this.regionId = response.regionId;
            this.destCidrIp = response.destCidrIp;
            this.ipv6DestCidrIp = response.ipv6DestCidrIp;
            this.priority = response.priority;
            this.policy = response.policy;
            this.nicType = response.nicType;
            this.sourceGroupOwnerId = response.sourceGroupOwnerId;
            this.ipv6SourceCidrIp = response.ipv6SourceCidrIp;
            this.sourcePrefixListId = response.sourcePrefixListId;
            this.ipProtocol = response.ipProtocol;
            this.description = response.description;
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
         * The ID of the destination security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
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
         * The source IPv4 CIDR block to which you want to revoke access permissions. CIDR and IPv4 IP addresses are supported.
         * <p>
         * 
         * Default value: 0.0.0.0/0
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.putQueryParameter("SourceCidrIp", sourceCidrIp);
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }

        /**
         * The Alibaba Cloud account to which the source Security Group belongs when you delete a security group rule across accounts.
         * <p>
         * 
         * -If "SourceGroupOwnerAccount" and "SourceGroupOwnerId" are not set, the access permission of other security groups is revoked.
         * -If the "SourceCidrIp" parameter is set, the "SourceGroupOwnerAccount" parameter is invalid.
         */
        public Builder sourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
            this.putQueryParameter("SourceGroupOwnerAccount", sourceGroupOwnerAccount);
            this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
            return this;
        }

        /**
         * The ID of the source security group to which you want to revoke access permissions. Set at least one "SourceGroupId" or "SourceCidrIp" parameter.
         * <p>
         * 
         * -If "SourceGroupId" is specified but "SourceCidrIp" is not specified, the value of "NicType" can only be intranet.
         * -If both "SourceGroupId" and "SourceCidrIp" are specified, the default value is "SourceCidrIp.
         */
        public Builder sourceGroupId(String sourceGroupId) {
            this.putQueryParameter("SourceGroupId", sourceGroupId);
            this.sourceGroupId = sourceGroupId;
            return this;
        }

        /**
         * The region ID of the destination security group. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The range of destination IP addresses. CIDR and IPv4 IP addresses are supported. Default value: 0.0.0.0/0
         */
        public Builder destCidrIp(String destCidrIp) {
            this.putQueryParameter("DestCidrIp", destCidrIp);
            this.destCidrIp = destCidrIp;
            return this;
        }

        /**
         * The Destination IPv6 CIDR block. CIDR and IPv6 IP addresses are supported.
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
         * The access permission. Valid values:
         * <p>
         * 
         * -accept: accept access
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
         * -When you set the mutual access between security groups, that is, only the "SourceGroupId" parameter is specified, it can only be intranet.
         * 
         * 
         */
        public Builder nicType(String nicType) {
            this.putQueryParameter("NicType", nicType);
            this.nicType = nicType;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the source Security Group belongs when you delete a security group rule across accounts.
         * <p>
         * 
         * -If "SourceGroupOwnerId" and "SourceGroupOwnerAccount" are not set, the access permission of other security groups is revoked.
         * -If you have set the "SourceCidrIp" parameter, the "SourceGroupOwnerId" parameter is invalid.
         */
        public Builder sourceGroupOwnerId(Long sourceGroupOwnerId) {
            this.putQueryParameter("SourceGroupOwnerId", sourceGroupOwnerId);
            this.sourceGroupOwnerId = sourceGroupOwnerId;
            return this;
        }

        /**
         * The source IPv6 CIDR block to which you want to revoke access permissions. CIDR and IPv6 IP addresses are supported.
         * <p>
         * 
         * > only VPC-type IP addresses are supported.
         * 
         * Default value: None
         * 
         */
        public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.putQueryParameter("Ipv6SourceCidrIp", ipv6SourceCidrIp);
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }

        /**
         * The ID of the source prefix to be revoked. You can call [DescribePrefixLists](~~ 205046 ~~) to query the list IDs of available prefixes.
         * <p>
         * 
         * Note:
         * 
         * -If the network type of a security group is classic network, the prefix list cannot be set. For more information about security groups and Prefix List restrictions, see [Security Group restrictions](~~ 25412#SecurityGroupQuota1 ~~).
         * -If you specify one of the "SourceCidrIp", "Ipv6SourceCidrIp", or "SourceGroupId" parameters, this parameter is ignored.
         */
        public Builder sourcePrefixListId(String sourcePrefixListId) {
            this.putQueryParameter("SourcePrefixListId", sourcePrefixListId);
            this.sourcePrefixListId = sourcePrefixListId;
            return this;
        }

        /**
         * The transport layer protocol. Parameter values are case sensitive. Valid values:
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

        /**
         * Security Group rule description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        @Override
        public RevokeSecurityGroupRequest build() {
            return new RevokeSecurityGroupRequest(this);
        } 

    } 

}
