// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>RevokeSecurityGroupRequest</p>
 */
public class RevokeSecurityGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @Deprecated
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestCidrIp")
    @Deprecated
    private String destCidrIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    @Deprecated
    private String ipProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6DestCidrIp")
    @Deprecated
    private String ipv6DestCidrIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6SourceCidrIp")
    @Deprecated
    private String ipv6SourceCidrIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NicType")
    @Deprecated
    private String nicType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Permissions")
    private java.util.List < Permissions> permissions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    @Deprecated
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortRange")
    @Deprecated
    private String portRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    @Deprecated
    private String priority;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupRuleId")
    private java.util.List < String > securityGroupRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
    @Deprecated
    private String sourceCidrIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceGroupId")
    @Deprecated
    private String sourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceGroupOwnerAccount")
    @Deprecated
    private String sourceGroupOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceGroupOwnerId")
    @Deprecated
    private Long sourceGroupOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePortRange")
    @Deprecated
    private String sourcePortRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePrefixListId")
    @Deprecated
    private String sourcePrefixListId;

    private RevokeSecurityGroupRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.destCidrIp = builder.destCidrIp;
        this.ipProtocol = builder.ipProtocol;
        this.ipv6DestCidrIp = builder.ipv6DestCidrIp;
        this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
        this.nicType = builder.nicType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.permissions = builder.permissions;
        this.policy = builder.policy;
        this.portRange = builder.portRange;
        this.priority = builder.priority;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupRuleId = builder.securityGroupRuleId;
        this.sourceCidrIp = builder.sourceCidrIp;
        this.sourceGroupId = builder.sourceGroupId;
        this.sourceGroupOwnerAccount = builder.sourceGroupOwnerAccount;
        this.sourceGroupOwnerId = builder.sourceGroupOwnerId;
        this.sourcePortRange = builder.sourcePortRange;
        this.sourcePrefixListId = builder.sourcePrefixListId;
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
     * @return permissions
     */
    public java.util.List < Permissions> getPermissions() {
        return this.permissions;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return portRange
     */
    public String getPortRange() {
        return this.portRange;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
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

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return securityGroupRuleId
     */
    public java.util.List < String > getSecurityGroupRuleId() {
        return this.securityGroupRuleId;
    }

    /**
     * @return sourceCidrIp
     */
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    /**
     * @return sourceGroupId
     */
    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    /**
     * @return sourceGroupOwnerAccount
     */
    public String getSourceGroupOwnerAccount() {
        return this.sourceGroupOwnerAccount;
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
     * @return sourcePrefixListId
     */
    public String getSourcePrefixListId() {
        return this.sourcePrefixListId;
    }

    public static final class Builder extends Request.Builder<RevokeSecurityGroupRequest, Builder> {
        private String sourceRegionId; 
        private String clientToken; 
        private String description; 
        private String destCidrIp; 
        private String ipProtocol; 
        private String ipv6DestCidrIp; 
        private String ipv6SourceCidrIp; 
        private String nicType; 
        private String ownerAccount; 
        private Long ownerId; 
        private java.util.List < Permissions> permissions; 
        private String policy; 
        private String portRange; 
        private String priority; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityGroupId; 
        private java.util.List < String > securityGroupRuleId; 
        private String sourceCidrIp; 
        private String sourceGroupId; 
        private String sourceGroupOwnerAccount; 
        private Long sourceGroupOwnerId; 
        private String sourcePortRange; 
        private String sourcePrefixListId; 

        private Builder() {
            super();
        } 

        private Builder(RevokeSecurityGroupRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.destCidrIp = request.destCidrIp;
            this.ipProtocol = request.ipProtocol;
            this.ipv6DestCidrIp = request.ipv6DestCidrIp;
            this.ipv6SourceCidrIp = request.ipv6SourceCidrIp;
            this.nicType = request.nicType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.permissions = request.permissions;
            this.policy = request.policy;
            this.portRange = request.portRange;
            this.priority = request.priority;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityGroupId = request.securityGroupId;
            this.securityGroupRuleId = request.securityGroupRuleId;
            this.sourceCidrIp = request.sourceCidrIp;
            this.sourceGroupId = request.sourceGroupId;
            this.sourceGroupOwnerAccount = request.sourceGroupOwnerAccount;
            this.sourceGroupOwnerId = request.sourceGroupOwnerId;
            this.sourcePortRange = request.sourcePortRange;
            this.sourcePrefixListId = request.sourcePrefixListId;
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
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.Description` to specify the rule description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.DestCidrIp` to specify the destination IPv4 CIDR block.
         */
        public Builder destCidrIp(String destCidrIp) {
            this.putQueryParameter("DestCidrIp", destCidrIp);
            this.destCidrIp = destCidrIp;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.IpProtocol` to specify the transport layer protocol.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.Ipv6DestCidrIp` to specify the destination IPv6 CIDR block.
         */
        public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
            this.putQueryParameter("Ipv6DestCidrIp", ipv6DestCidrIp);
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.Ipv6SourceCidrIp` to specify the source IPv6 CIDR block.
         */
        public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.putQueryParameter("Ipv6SourceCidrIp", ipv6SourceCidrIp);
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.NicType` to specify the network interface type.
         */
        public Builder nicType(String nicType) {
            this.putQueryParameter("NicType", nicType);
            this.nicType = nicType;
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
         * The security group rules. Valid values of N: 1 to 100.
         */
        public Builder permissions(java.util.List < Permissions> permissions) {
            this.putQueryParameter("Permissions", permissions);
            this.permissions = permissions;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.Policy` to specify whether to allow inbound access.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.PortRange` to specify the range of destination ports.
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.Priority` to specify the rule priority.
         */
        public Builder priority(String priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The region ID of the security group. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
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

        /**
         * The ID of the security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The IDs of the security group rules. Valid values of N: 1 to 100.
         */
        public Builder securityGroupRuleId(java.util.List < String > securityGroupRuleId) {
            this.putQueryParameter("SecurityGroupRuleId", securityGroupRuleId);
            this.securityGroupRuleId = securityGroupRuleId;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.SourceCidrIp` to specify the source IPv4 CIDR block.
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.putQueryParameter("SourceCidrIp", sourceCidrIp);
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.SourceGroupId` to specify the ID of the source security group.
         */
        public Builder sourceGroupId(String sourceGroupId) {
            this.putQueryParameter("SourceGroupId", sourceGroupId);
            this.sourceGroupId = sourceGroupId;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.SourceGroupOwnerAccount` to specify the Alibaba Cloud account that manages the source security group.
         */
        public Builder sourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
            this.putQueryParameter("SourceGroupOwnerAccount", sourceGroupOwnerAccount);
            this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.SourceGroupOwnerId` to specify the ID of the Alibaba Cloud account that manages the source security group.
         */
        public Builder sourceGroupOwnerId(Long sourceGroupOwnerId) {
            this.putQueryParameter("SourceGroupOwnerId", sourceGroupOwnerId);
            this.sourceGroupOwnerId = sourceGroupOwnerId;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.SourcePortRange` to specify the range of source ports.
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.putQueryParameter("SourcePortRange", sourcePortRange);
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.SourcePrefixListId` to specify the ID of the source prefix list.
         */
        public Builder sourcePrefixListId(String sourcePrefixListId) {
            this.putQueryParameter("SourcePrefixListId", sourcePrefixListId);
            this.sourcePrefixListId = sourcePrefixListId;
            return this;
        }

        @Override
        public RevokeSecurityGroupRequest build() {
            return new RevokeSecurityGroupRequest(this);
        } 

    } 

    public static class Permissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestCidrIp")
        private String destCidrIp;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("Ipv6DestCidrIp")
        private String ipv6DestCidrIp;

        @com.aliyun.core.annotation.NameInMap("Ipv6SourceCidrIp")
        private String ipv6SourceCidrIp;

        @com.aliyun.core.annotation.NameInMap("NicType")
        private String nicType;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("PortRange")
        private String portRange;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @com.aliyun.core.annotation.NameInMap("SourceGroupId")
        private String sourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SourceGroupOwnerAccount")
        private String sourceGroupOwnerAccount;

        @com.aliyun.core.annotation.NameInMap("SourceGroupOwnerId")
        private Long sourceGroupOwnerId;

        @com.aliyun.core.annotation.NameInMap("SourcePortRange")
        private String sourcePortRange;

        @com.aliyun.core.annotation.NameInMap("SourcePrefixListId")
        private String sourcePrefixListId;

        private Permissions(Builder builder) {
            this.description = builder.description;
            this.destCidrIp = builder.destCidrIp;
            this.ipProtocol = builder.ipProtocol;
            this.ipv6DestCidrIp = builder.ipv6DestCidrIp;
            this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
            this.nicType = builder.nicType;
            this.policy = builder.policy;
            this.portRange = builder.portRange;
            this.priority = builder.priority;
            this.sourceCidrIp = builder.sourceCidrIp;
            this.sourceGroupId = builder.sourceGroupId;
            this.sourceGroupOwnerAccount = builder.sourceGroupOwnerAccount;
            this.sourceGroupOwnerId = builder.sourceGroupOwnerId;
            this.sourcePortRange = builder.sourcePortRange;
            this.sourcePrefixListId = builder.sourcePrefixListId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permissions create() {
            return builder().build();
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
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return portRange
         */
        public String getPortRange() {
            return this.portRange;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return sourceCidrIp
         */
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        /**
         * @return sourceGroupId
         */
        public String getSourceGroupId() {
            return this.sourceGroupId;
        }

        /**
         * @return sourceGroupOwnerAccount
         */
        public String getSourceGroupOwnerAccount() {
            return this.sourceGroupOwnerAccount;
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
         * @return sourcePrefixListId
         */
        public String getSourcePrefixListId() {
            return this.sourcePrefixListId;
        }

        public static final class Builder {
            private String description; 
            private String destCidrIp; 
            private String ipProtocol; 
            private String ipv6DestCidrIp; 
            private String ipv6SourceCidrIp; 
            private String nicType; 
            private String policy; 
            private String portRange; 
            private String priority; 
            private String sourceCidrIp; 
            private String sourceGroupId; 
            private String sourceGroupOwnerAccount; 
            private Long sourceGroupOwnerId; 
            private String sourcePortRange; 
            private String sourcePrefixListId; 

            /**
             * The description of security group rule N. The description must be 1 to 512 characters in length.
             * <p>
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The destination IPv4 CIDR block. CIDR blocks and IPv4 addresses are supported.
             * <p>
             * 
             * This parameter is supported by quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder destCidrIp(String destCidrIp) {
                this.destCidrIp = destCidrIp;
                return this;
            }

            /**
             * The transport layer protocol of security group rule N. The values of this parameter are not case-sensitive. Valid values:
             * <p>
             * 
             * *   TCP
             * *   UDP
             * *   ICMP
             * *   ICMPv6
             * *   GRE
             * *   ALL: All protocols are supported.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * The destination IPv6 CIDR block. CIDR blocks and IPv6 addresses are supported.
             * <p>
             * 
             * This parameter is supported by quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).
             * 
             * Valid values of N: 1 to 100.
             * 
             * > This parameter is valid only when the destination is an ECS instance that resides in a VPC and supports IPv6 CIDR blocks. You cannot specify both this parameter and the `DestCidrIp` parameter.
             */
            public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
                this.ipv6DestCidrIp = ipv6DestCidrIp;
                return this;
            }

            /**
             * The source IPv6 CIDR block for security group rule N. CIDR blocks and IPv6 addresses are supported.
             * <p>
             * 
             * Valid values of N: 1 to 100.
             * 
             * > This parameter is valid only when the source is an Elastic Compute Service (ECS) instance that resides in a virtual private cloud (VPC) and supports IPv6 CIDR blocks. You cannot specify both this parameter and the `SourceCidrIp` parameter.
             */
            public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
                this.ipv6SourceCidrIp = ipv6SourceCidrIp;
                return this;
            }

            /**
             * The network interface card (NIC) type of the security group rule if the security group is of the classic network type. Valid values:
             * <p>
             * 
             * *   internet: public NIC
             * *   intranet: internal NIC
             * 
             * If the security group is in a VPC, this parameter is set to intranet by default and cannot be changed.
             * 
             * If you specify only `SourceGroupId` when you configure access between security groups, this parameter must be set to intranet.
             * 
             * Default value: internet.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder nicType(String nicType) {
                this.nicType = nicType;
                return this;
            }

            /**
             * The action of security group rule N that determines whether to allow inbound access. Valid values:
             * <p>
             * 
             * *   accept: allows access.
             * *   drop: denies access and returns no responses. In this case, the request times out or the connection cannot be established.
             * 
             * Default value: accept.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The range of destination ports that correspond to the transport layer protocol of security group rule N. Valid values:
             * <p>
             * 
             * *   If the Permissions.N.IpProtocol parameter is set to TCP or UDP, the port range is 1 to 65535. Specify a port range in the format of \<start port number>/\<end port number>. Example: 1/200.
             * *   If the Permissions.N.IpProtocol parameter is set to ICMP, the port range is -1/-1, which indicates all ports.
             * *   If the Permissions.N.IpProtocol parameter is set to GRE, the port range is -1/-1, which indicates all ports.
             * *   If the Permissions.N.IpProtocol parameter is set to ALL, the port range is -1/-1, which indicates all ports.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * The priority of security group rule N. A smaller value specifies a higher priority. Valid values: 1 to 100.
             * <p>
             * 
             * Default value: 1.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The source IPv4 CIDR block for security group rule N. CIDR blocks and IPv4 addresses are supported.
             * <p>
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * The ID of the source security group that is referenced in security group rule N.
             * <p>
             * 
             * *   Specify at least one of the following parameters: `SourceGroupId`, `SourceCidrIp`, `Ipv6SourceCidrIp`, and `SourcePrefixListId`.
             * *   If you specify `SourceGroupId` but you do not specify `SourceCidrIp` or `Ipv6SourceCidrIp`, you must set NicType to intranet.
             * *   If you specify `SourceGroupId` and `SourceCidrIp`, `SourceCidrIp` takes precedence.
             * 
             * When you specify this parameter, take note of the following items:
             * 
             * *   You cannot reference security groups as destinations or sources in the rules of advanced security groups.
             * *   You can reference up to 20 security groups as destinations or sources in the rules of each basic security group.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder sourceGroupId(String sourceGroupId) {
                this.sourceGroupId = sourceGroupId;
                return this;
            }

            /**
             * The Alibaba Cloud account that manages the source security group when you delete security group rule N across accounts.
             * <p>
             * 
             * *   If both `SourceGroupOwnerAccount` and `SourceGroupOwnerId` are not specified, the security group rule that controls access to other security groups managed by your account is deleted.
             * *   If you specify `SourceCidrIp`, `SourceGroupOwnerAccount` is ignored.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder sourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
                this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that manages the source security group when you delete security group rule N across accounts.
             * <p>
             * 
             * *   If both `SourceGroupOwnerId` and `SourceGroupOwnerAccount` are not specified, the security group rule that controls access to other security groups managed by your account is deleted.
             * *   If you specify `SourceCidrIp`, `SourceGroupOwnerId` is ignored.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder sourceGroupOwnerId(Long sourceGroupOwnerId) {
                this.sourceGroupOwnerId = sourceGroupOwnerId;
                return this;
            }

            /**
             * The range of source ports that correspond to the transport layer protocol of security group rule N. Valid values:
             * <p>
             * 
             * *   If the Permissions.N.IpProtocol parameter is set to TCP or UDP, the port range is 1 to 65535. Specify a port range in the format of \<start port number>/\<end port number>. Example: 1/200.
             * *   If the Permissions.N.IpProtocol parameter is set to ICMP, the port range is -1/-1, which indicates all ports.
             * *   If the Permissions.N.IpProtocol parameter is set to GRE, the port range is -1/-1, which indicates all ports.
             * *   If the Permissions.N.IpProtocol parameter is set to ALL, the port range is -1/-1, which indicates all ports.
             * 
             * This parameter is supported by quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            /**
             * The ID of the source prefix list that is referenced in security group rule N. You can call the [DescribePrefixLists](~~205046~~) operation to query the IDs of available prefix lists.
             * <p>
             * 
             * When you specify this parameter, take note of the following items:
             * 
             * *   If the network type of a security group is classic network, you cannot reference prefix lists in the security group rules. For information about the limits on security groups and prefix lists, see the "Security group limits" section in [Limits](~~25412#SecurityGroupQuota1~~).
             * *   If you specify the `SourceCidrIp`, `Ipv6SourceCidrIp`, or `SourceGroupId` parameter, this parameter is ignored.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder sourcePrefixListId(String sourcePrefixListId) {
                this.sourcePrefixListId = sourcePrefixListId;
                return this;
            }

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
}
