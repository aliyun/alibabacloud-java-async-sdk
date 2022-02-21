// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityGroupEgressRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityGroupEgressRuleRequest</p>
 */
public class ModifySecurityGroupEgressRuleRequest extends Request {
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
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("DestGroupOwnerAccount")
    private String destGroupOwnerAccount;

    @Query
    @NameInMap("DestCidrIp")
    private String destCidrIp;

    @Query
    @NameInMap("SourcePortRange")
    private String sourcePortRange;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("PortRange")
    private String portRange;

    @Query
    @NameInMap("DestPrefixListId")
    private String destPrefixListId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("SourceCidrIp")
    private String sourceCidrIp;

    @Query
    @NameInMap("Policy")
    private String policy;

    @Query
    @NameInMap("Priority")
    private String priority;

    @Query
    @NameInMap("Ipv6SourceCidrIp")
    private String ipv6SourceCidrIp;

    @Query
    @NameInMap("DestGroupId")
    private String destGroupId;

    @Query
    @NameInMap("IpProtocol")
    private String ipProtocol;

    @Query
    @NameInMap("Ipv6DestCidrIp")
    private String ipv6DestCidrIp;

    @Query
    @NameInMap("DestGroupOwnerId")
    private Long destGroupOwnerId;

    @Query
    @NameInMap("NicType")
    private String nicType;

    private ModifySecurityGroupEgressRuleRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.securityGroupId = builder.securityGroupId;
        this.destGroupOwnerAccount = builder.destGroupOwnerAccount;
        this.destCidrIp = builder.destCidrIp;
        this.sourcePortRange = builder.sourcePortRange;
        this.description = builder.description;
        this.portRange = builder.portRange;
        this.destPrefixListId = builder.destPrefixListId;
        this.clientToken = builder.clientToken;
        this.sourceCidrIp = builder.sourceCidrIp;
        this.policy = builder.policy;
        this.priority = builder.priority;
        this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
        this.destGroupId = builder.destGroupId;
        this.ipProtocol = builder.ipProtocol;
        this.ipv6DestCidrIp = builder.ipv6DestCidrIp;
        this.destGroupOwnerId = builder.destGroupOwnerId;
        this.nicType = builder.nicType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityGroupEgressRuleRequest create() {
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
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return destGroupOwnerAccount
     */
    public String getDestGroupOwnerAccount() {
        return this.destGroupOwnerAccount;
    }

    /**
     * @return destCidrIp
     */
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    /**
     * @return sourcePortRange
     */
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return portRange
     */
    public String getPortRange() {
        return this.portRange;
    }

    /**
     * @return destPrefixListId
     */
    public String getDestPrefixListId() {
        return this.destPrefixListId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return sourceCidrIp
     */
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
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
     * @return ipv6SourceCidrIp
     */
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    /**
     * @return destGroupId
     */
    public String getDestGroupId() {
        return this.destGroupId;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return ipv6DestCidrIp
     */
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    /**
     * @return destGroupOwnerId
     */
    public Long getDestGroupOwnerId() {
        return this.destGroupOwnerId;
    }

    /**
     * @return nicType
     */
    public String getNicType() {
        return this.nicType;
    }

    public static final class Builder extends Request.Builder<ModifySecurityGroupEgressRuleRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String securityGroupId; 
        private String destGroupOwnerAccount; 
        private String destCidrIp; 
        private String sourcePortRange; 
        private String description; 
        private String portRange; 
        private String destPrefixListId; 
        private String clientToken; 
        private String sourceCidrIp; 
        private String policy; 
        private String priority; 
        private String ipv6SourceCidrIp; 
        private String destGroupId; 
        private String ipProtocol; 
        private String ipv6DestCidrIp; 
        private Long destGroupOwnerId; 
        private String nicType; 

        private Builder() {
            super();
        } 

        private Builder(ModifySecurityGroupEgressRuleRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.regionId = response.regionId;
            this.securityGroupId = response.securityGroupId;
            this.destGroupOwnerAccount = response.destGroupOwnerAccount;
            this.destCidrIp = response.destCidrIp;
            this.sourcePortRange = response.sourcePortRange;
            this.description = response.description;
            this.portRange = response.portRange;
            this.destPrefixListId = response.destPrefixListId;
            this.clientToken = response.clientToken;
            this.sourceCidrIp = response.sourceCidrIp;
            this.policy = response.policy;
            this.priority = response.priority;
            this.ipv6SourceCidrIp = response.ipv6SourceCidrIp;
            this.destGroupId = response.destGroupId;
            this.ipProtocol = response.ipProtocol;
            this.ipv6DestCidrIp = response.ipv6DestCidrIp;
            this.destGroupOwnerId = response.destGroupOwnerId;
            this.nicType = response.nicType;
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
         * The logon name of the account to which the destination security group belongs.
         */
        public Builder destGroupOwnerAccount(String destGroupOwnerAccount) {
            this.putQueryParameter("DestGroupOwnerAccount", destGroupOwnerAccount);
            this.destGroupOwnerAccount = destGroupOwnerAccount;
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
         * The description of the security group rule. The description must be 1 to 512 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * The ID of the destination Prefix List. You can call [DescribePrefixLists](~~ 205046 ~~) to query the list IDs of available prefixes.
         * <p>
         * 
         * If you specify one of the "DestCidrIp", "Ipv6DestCidrIp", or "DestGroupId" parameters, this parameter is ignored.
         */
        public Builder destPrefixListId(String destPrefixListId) {
            this.putQueryParameter("DestPrefixListId", destPrefixListId);
            this.destPrefixListId = destPrefixListId;
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
         * The source IPv4 CIDR block. CIDR and IPv4 IP addresses are supported.
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
         * The source IPv6 CIDR block. CIDR and IPv6 IP addresses are supported.
         * <p>
         * 
         * > only VPC-type IP addresses are supported. This parameter cannot be set at the same time as the sourcecidrip" parameter.
         * 
         * Default value: None
         */
        public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.putQueryParameter("Ipv6SourceCidrIp", ipv6SourceCidrIp);
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }

        /**
         * The ID of the destination security group. Set at least one of the "DestGroupId" or "DestCidrIp" parameters.
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

        /**
         * The Destination IPv6 CIDR block. CIDR and IPv6 IP addresses are supported.
         * <p>
         * 
         * > only VPC-type IP addresses are supported. This parameter and the "DestCidrIp" parameter cannot be set at the same time.
         * 
         * Default value: None
         */
        public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
            this.putQueryParameter("Ipv6DestCidrIp", ipv6DestCidrIp);
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }

        /**
         * The ID of the account to which the destination security group belongs.
         */
        public Builder destGroupOwnerId(Long destGroupOwnerId) {
            this.putQueryParameter("DestGroupOwnerId", destGroupOwnerId);
            this.destGroupOwnerId = destGroupOwnerId;
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
         * 
         * -If the network type of the security group rule is VPC, you must set the NicType parameter, which can only be intranet.
         * -Set security group between access each other when that specifies only "destgroupid" when, only for intranet.
         */
        public Builder nicType(String nicType) {
            this.putQueryParameter("NicType", nicType);
            this.nicType = nicType;
            return this;
        }

        @Override
        public ModifySecurityGroupEgressRuleRequest build() {
            return new ModifySecurityGroupEgressRuleRequest(this);
        } 

    } 

}
