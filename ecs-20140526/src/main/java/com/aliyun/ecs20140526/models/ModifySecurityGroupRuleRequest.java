// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityGroupRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityGroupRuleRequest</p>
 */
public class ModifySecurityGroupRuleRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("PortRange")
    private String portRange;

    @Query
    @NameInMap("SourceGroupOwnerId")
    private Long sourceGroupOwnerId;

    @Query
    @NameInMap("SourcePortRange")
    private String sourcePortRange;

    @Query
    @NameInMap("DestCidrIp")
    private String destCidrIp;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("SourceGroupId")
    private String sourceGroupId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Ipv6DestCidrIp")
    private String ipv6DestCidrIp;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SourceCidrIp")
    private String sourceCidrIp;

    @Query
    @NameInMap("Policy")
    private String policy;

    @Query
    @NameInMap("NicType")
    private String nicType;

    @Query
    @NameInMap("IpProtocol")
    private String ipProtocol;

    @Query
    @NameInMap("Ipv6SourceCidrIp")
    private String ipv6SourceCidrIp;

    @Query
    @NameInMap("Priority")
    private String priority;

    @Query
    @NameInMap("SourcePrefixListId")
    private String sourcePrefixListId;

    @Query
    @NameInMap("SourceGroupOwnerAccount")
    private String sourceGroupOwnerAccount;

    private ModifySecurityGroupRuleRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityGroupId = builder.securityGroupId;
        this.portRange = builder.portRange;
        this.sourceGroupOwnerId = builder.sourceGroupOwnerId;
        this.sourcePortRange = builder.sourcePortRange;
        this.destCidrIp = builder.destCidrIp;
        this.description = builder.description;
        this.sourceGroupId = builder.sourceGroupId;
        this.clientToken = builder.clientToken;
        this.ipv6DestCidrIp = builder.ipv6DestCidrIp;
        this.regionId = builder.regionId;
        this.sourceCidrIp = builder.sourceCidrIp;
        this.policy = builder.policy;
        this.nicType = builder.nicType;
        this.ipProtocol = builder.ipProtocol;
        this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
        this.priority = builder.priority;
        this.sourcePrefixListId = builder.sourcePrefixListId;
        this.sourceGroupOwnerAccount = builder.sourceGroupOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityGroupRuleRequest create() {
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
     * @return sourceGroupOwnerId
     */
    public Long getSourceGroupOwnerId() {
        return this.sourceGroupOwnerId;
    }

    /**
     * @return sourcePortRange
     */
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * @return destCidrIp
     */
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return sourceGroupId
     */
    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ipv6DestCidrIp
     */
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return nicType
     */
    public String getNicType() {
        return this.nicType;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return ipv6SourceCidrIp
     */
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
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

    public static final class Builder extends Request.Builder<ModifySecurityGroupRuleRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String securityGroupId; 
        private String portRange; 
        private Long sourceGroupOwnerId; 
        private String sourcePortRange; 
        private String destCidrIp; 
        private String description; 
        private String sourceGroupId; 
        private String clientToken; 
        private String ipv6DestCidrIp; 
        private String regionId; 
        private String sourceCidrIp; 
        private String policy; 
        private String nicType; 
        private String ipProtocol; 
        private String ipv6SourceCidrIp; 
        private String priority; 
        private String sourcePrefixListId; 
        private String sourceGroupOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(ModifySecurityGroupRuleRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.securityGroupId = response.securityGroupId;
            this.portRange = response.portRange;
            this.sourceGroupOwnerId = response.sourceGroupOwnerId;
            this.sourcePortRange = response.sourcePortRange;
            this.destCidrIp = response.destCidrIp;
            this.description = response.description;
            this.sourceGroupId = response.sourceGroupId;
            this.clientToken = response.clientToken;
            this.ipv6DestCidrIp = response.ipv6DestCidrIp;
            this.regionId = response.regionId;
            this.sourceCidrIp = response.sourceCidrIp;
            this.policy = response.policy;
            this.nicType = response.nicType;
            this.ipProtocol = response.ipProtocol;
            this.ipv6SourceCidrIp = response.ipv6SourceCidrIp;
            this.priority = response.priority;
            this.sourcePrefixListId = response.sourcePrefixListId;
            this.sourceGroupOwnerAccount = response.sourceGroupOwnerAccount;
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
         * The ID of the Target security group.
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
         * The description of the security group rule. The description must be 1 to 512 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the source security group. Set at least one "SourceGroupId" or "SourceCidrIp" parameter.
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
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * The region ID of the Target security group. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Set the source IPv4 CIDR block for the access permission. CIDR and IPv4 IP addresses are supported.
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
         * -drop: The request is denied. No deny message is returned.
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
         * -internet: public network
         * -intranet: intranet
         * 
         * Default value: internet
         * 
         * In the following cases, the parameter NicType can only be set to intranet:
         * 
         * -If the network type of the security group rule is VPC, you must set the NicType parameter, which can only be intranet.
         * -If you set the mutual access between security groups, that is, only the "SourceGroupId" parameter is specified, it can only be set to intranet.
         * 
         * 
         */
        public Builder nicType(String nicType) {
            this.putQueryParameter("NicType", nicType);
            this.nicType = nicType;
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
         * Set the Source IPv6 CIDR block for the access permission. CIDR and IPv6 IP addresses are supported.
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
         * Security Group rule priority. Valid values: 1 to 100.
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
         * Setting access permissions source end Prefix List ID. You can call [DescribePrefixLists](~~ 205046 ~~) to query the list IDs of available prefixes.
         * <p>
         * 
         * When you have specified "sourcecidrip", "ipv6sourcecidrip" or "sourcegroupid" parameter in a when, will be ignored.
         */
        public Builder sourcePrefixListId(String sourcePrefixListId) {
            this.putQueryParameter("SourcePrefixListId", sourcePrefixListId);
            this.sourcePrefixListId = sourcePrefixListId;
            return this;
        }

        /**
         * Cross-account settings security group rules when source-side security group belongs Alibaba cloud account.
         * <p>
         * 
         * -If "sourcegroupowneraccount" and "sourcegroupownerid" not set is considered is set up your other security group"s access.
         * -If you have set parameters "sourcecidrip", the parameter "sourcegroupowneraccount" is invalid.
         */
        public Builder sourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
            this.putQueryParameter("SourceGroupOwnerAccount", sourceGroupOwnerAccount);
            this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
            return this;
        }

        @Override
        public ModifySecurityGroupRuleRequest build() {
            return new ModifySecurityGroupRuleRequest(this);
        } 

    } 

}
