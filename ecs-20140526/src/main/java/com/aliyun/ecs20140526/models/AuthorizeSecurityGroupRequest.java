// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeSecurityGroupRequest</p>
 */
public class AuthorizeSecurityGroupRequest extends Request {
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
    @NameInMap("IpProtocol")
    private String ipProtocol;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("SourceGroupId")
    private String sourceGroupId;

    @Query
    @NameInMap("SourceGroupOwnerId")
    private Long sourceGroupOwnerId;

    @Query
    @NameInMap("SourceCidrIp")
    private String sourceCidrIp;

    @Query
    @NameInMap("SourcePortRange")
    private String sourcePortRange;

    @Query
    @NameInMap("Policy")
    private String policy;

    @Query
    @NameInMap("Priority")
    private String priority;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DestCidrIp")
    private String destCidrIp;

    @Query
    @NameInMap("SourcePrefixListId")
    private String sourcePrefixListId;

    @Query
    @NameInMap("SourceGroupOwnerAccount")
    private String sourceGroupOwnerAccount;

    @Query
    @NameInMap("PortRange")
    private String portRange;

    @Query
    @NameInMap("NicType")
    private String nicType;

    @Query
    @NameInMap("Ipv6DestCidrIp")
    private String ipv6DestCidrIp;

    @Query
    @NameInMap("Ipv6SourceCidrIp")
    private String ipv6SourceCidrIp;

    private AuthorizeSecurityGroupRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.ipProtocol = builder.ipProtocol;
        this.securityGroupId = builder.securityGroupId;
        this.sourceGroupId = builder.sourceGroupId;
        this.sourceGroupOwnerId = builder.sourceGroupOwnerId;
        this.sourceCidrIp = builder.sourceCidrIp;
        this.sourcePortRange = builder.sourcePortRange;
        this.policy = builder.policy;
        this.priority = builder.priority;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.destCidrIp = builder.destCidrIp;
        this.sourcePrefixListId = builder.sourcePrefixListId;
        this.sourceGroupOwnerAccount = builder.sourceGroupOwnerAccount;
        this.portRange = builder.portRange;
        this.nicType = builder.nicType;
        this.ipv6DestCidrIp = builder.ipv6DestCidrIp;
        this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeSecurityGroupRequest create() {
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
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return sourceGroupId
     */
    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    /**
     * @return sourceGroupOwnerId
     */
    public Long getSourceGroupOwnerId() {
        return this.sourceGroupOwnerId;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destCidrIp
     */
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    /**
     * @return sourcePrefixListId
     */
    public String getSourcePrefixListId() {
        return this.sourcePrefixListId;
    }

    /**
     * @return sourceGroupOwnerAccount
     */
    public String getSourceGroupOwnerAccount() {
        return this.sourceGroupOwnerAccount;
    }

    /**
     * @return portRange
     */
    public String getPortRange() {
        return this.portRange;
    }

    /**
     * @return nicType
     */
    public String getNicType() {
        return this.nicType;
    }

    /**
     * @return ipv6DestCidrIp
     */
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    /**
     * @return ipv6SourceCidrIp
     */
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    public static final class Builder extends Request.Builder<AuthorizeSecurityGroupRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String ipProtocol; 
        private String securityGroupId; 
        private String sourceGroupId; 
        private Long sourceGroupOwnerId; 
        private String sourceCidrIp; 
        private String sourcePortRange; 
        private String policy; 
        private String priority; 
        private String clientToken; 
        private String description; 
        private String destCidrIp; 
        private String sourcePrefixListId; 
        private String sourceGroupOwnerAccount; 
        private String portRange; 
        private String nicType; 
        private String ipv6DestCidrIp; 
        private String ipv6SourceCidrIp; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeSecurityGroupRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.regionId = response.regionId;
            this.ipProtocol = response.ipProtocol;
            this.securityGroupId = response.securityGroupId;
            this.sourceGroupId = response.sourceGroupId;
            this.sourceGroupOwnerId = response.sourceGroupOwnerId;
            this.sourceCidrIp = response.sourceCidrIp;
            this.sourcePortRange = response.sourcePortRange;
            this.policy = response.policy;
            this.priority = response.priority;
            this.clientToken = response.clientToken;
            this.description = response.description;
            this.destCidrIp = response.destCidrIp;
            this.sourcePrefixListId = response.sourcePrefixListId;
            this.sourceGroupOwnerAccount = response.sourceGroupOwnerAccount;
            this.portRange = response.portRange;
            this.nicType = response.nicType;
            this.ipv6DestCidrIp = response.ipv6DestCidrIp;
            this.ipv6SourceCidrIp = response.ipv6SourceCidrIp;
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
         * The ID of the region to which the security group belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The transport layer protocol. The value is case sensitive. Valid values:
         * <p>
         * 
         * -tcp
         * -udp
         * -icmp
         * -gre
         * -all: all protocols are supported.
         * 
         * > The icmp protocol only supports IPv4 addresses.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
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
         * The ID of the source security group to which you want to configure access permissions. Set at least one "SourceGroupId" or "SourceCidrIp" parameter.
         * <p>
         * 
         * -If "SourceGroupId" is specified but "SourceCidrIp" is not specified, the value of "NicType" can only be "intranet ".
         * -If both "SourceGroupId" and "SourceCidrIp" are specified, the default value is "SourceCidrIp.
         */
        public Builder sourceGroupId(String sourceGroupId) {
            this.putQueryParameter("SourceGroupId", sourceGroupId);
            this.sourceGroupId = sourceGroupId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the source Security Group belongs.
         * <p>
         * 
         * -If "SourceGroupOwnerId" and "SourceGroupOwnerAccount" are not set, the access permissions of other security groups are set.
         * -If you have set the "SourceCidrIp" parameter, the "SourceGroupOwnerId" parameter is invalid.
         */
        public Builder sourceGroupOwnerId(Long sourceGroupOwnerId) {
            this.putQueryParameter("SourceGroupOwnerId", sourceGroupOwnerId);
            this.sourceGroupOwnerId = sourceGroupOwnerId;
            return this;
        }

        /**
         * The source IPv4 CIDR block to which you want to configure access permissions. CIDR and IPv4 IP addresses are supported.
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
         * The value of-IpProtocol is all:-1/-1.
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.putQueryParameter("SourcePortRange", sourcePortRange);
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * Set the access permission. Valid values:
         * <p>
         * 
         * -accept: Accepts access.
         * -drop: The request is denied. If no request is returned, the request of the initiator times out or the connection cannot be established.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * The priority of security group rules. A smaller number indicates a higher priority. Valid values: 1 to 100.
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
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the security group rule. The description must be 1 to 512 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The Destination IPv4 CIDR block. CIDR and IPv4 IP addresses are supported.
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
         * The ID of the source prefix that you want to configure. You can call [DescribePrefixLists](~~ 205046 ~~) to query the list IDs of available prefixes.
         * <p>
         * 
         * Note:
         * 
         * -If the network type of a security group is classic network, the prefix list cannot be set. For more information about security groups and Prefix List restrictions, see [Security Group restrictions](~~ 25412#SecurityGroupQuota1 ~~).
         * 
         * -If you specify one of the "SourceCidrIp", "Ipv6SourceCidrIp", or "SourceGroupId" parameters, this parameter is ignored.
         */
        public Builder sourcePrefixListId(String sourcePrefixListId) {
            this.putQueryParameter("SourcePrefixListId", sourcePrefixListId);
            this.sourcePrefixListId = sourcePrefixListId;
            return this;
        }

        /**
         * The Alibaba Cloud account to which the source Security Group belongs.
         * <p>
         * 
         * -If "SourceGroupOwnerAccount" and "SourceGroupOwnerId" are not set, the access permissions of other security groups are set.
         * -If the "SourceCidrIp" parameter is set, the "SourceGroupOwnerAccount" parameter is invalid.
         */
        public Builder sourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
            this.putQueryParameter("SourceGroupOwnerAccount", sourceGroupOwnerAccount);
            this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
            return this;
        }

        /**
         * The port range related to the transport layer protocol opened by the destination security group. Valid values:
         * <p>
         * 
         * -TCP/UDP: valid values: 1 to 65535. Use a slash (/) to separate the start port from the end port. Example: 1/200
         * -ICMP:-1/-1
         * -GRE protocol:-1/-1
         * The value of-IpProtocol is all:-1/-1.
         * 
         * For more information about Port application scenarios, see [common ports for typical applications](~~ 40724 ~~).
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
            return this;
        }

        /**
         * The NIC type of the classic network security group rule. Valid values:
         * <p>
         * 
         * -internet: The internet Nic.
         * -intranet: The intranet Nic.
         * -You do not need to set the Nic type for VPC-type security group rules. The default value is intranet, which can only be intranet.
         * -If you specify the "SourceGroupId" parameter for mutual access between security groups, the value can only be intranet.
         * 
         * Default value: internet
         */
        public Builder nicType(String nicType) {
            this.putQueryParameter("NicType", nicType);
            this.nicType = nicType;
            return this;
        }

        /**
         * The Destination IPv6 CIDR block. CIDR and IPv6 IP addresses are supported.
         * <p>
         * 
         * > only IPv6 addresses of VPC-type ECS instances are supported. This parameter and the "DestCidrIp" parameter cannot be set at the same time.
         * 
         * Default value: None
         * 
         */
        public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
            this.putQueryParameter("Ipv6DestCidrIp", ipv6DestCidrIp);
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }

        /**
         * The source IPv6 CIDR block for which you want to set the access permission. CIDR and IPv6 IP addresses are supported.
         * <p>
         * 
         * > only IPv6 addresses of VPC-type ECS instances are supported. This parameter cannot be set at the same time as the sourcecidrip" parameter.
         * 
         * Default value: None
         */
        public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.putQueryParameter("Ipv6SourceCidrIp", ipv6SourceCidrIp);
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }

        @Override
        public AuthorizeSecurityGroupRequest build() {
            return new AuthorizeSecurityGroupRequest(this);
        } 

    } 

}
