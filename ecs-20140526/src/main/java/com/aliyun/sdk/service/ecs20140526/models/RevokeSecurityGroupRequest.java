// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    private java.util.List<Permissions> permissions;

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
    private java.util.List<String> securityGroupRuleId;

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
    public java.util.List<Permissions> getPermissions() {
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
    public java.util.List<String> getSecurityGroupRuleId() {
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
        private java.util.List<Permissions> permissions; 
        private String policy; 
        private String portRange; 
        private String priority; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityGroupId; 
        private java.util.List<String> securityGroupRuleId; 
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
         * <p>A client token used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.Description</code> to specify the rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.DestCidrIp</code> to specify the destination IPv4 CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        public Builder destCidrIp(String destCidrIp) {
            this.putQueryParameter("DestCidrIp", destCidrIp);
            this.destCidrIp = destCidrIp;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.IpProtocol</code> to specify the protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.Ipv6DestCidrIp</code> to specify the destination IPv6 CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>2001:db8:1233:1a00::***</p>
         */
        public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
            this.putQueryParameter("Ipv6DestCidrIp", ipv6DestCidrIp);
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.Ipv6SourceCidrIp</code> to specify the source IPv6 Classless Inter-Domain Routing (CIDR) block.</p>
         * 
         * <strong>example:</strong>
         * <p>2001:db8:1234:1a00::***</p>
         */
        public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.putQueryParameter("Ipv6SourceCidrIp", ipv6SourceCidrIp);
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.NicType</code> to specify the NIC type.</p>
         * 
         * <strong>example:</strong>
         * <p>intranet</p>
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
         * <p>The security group rules. Array length: 0 to 100.</p>
         */
        public Builder permissions(java.util.List<Permissions> permissions) {
            this.putQueryParameter("Permissions", permissions);
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.Policy</code> in Settings to specify the access permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.PortRange</code> to specify the port range.</p>
         * 
         * <strong>example:</strong>
         * <p>1/200</p>
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.Priority</code> to specify the rule priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(String priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The region ID of the security group. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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

        /**
         * <p>The security group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxazb4p****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The IDs of security group rules. Array length: 0 to 100.</p>
         */
        public Builder securityGroupRuleId(java.util.List<String> securityGroupRuleId) {
            this.putQueryParameter("SecurityGroupRuleId", securityGroupRuleId);
            this.securityGroupRuleId = securityGroupRuleId;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.SourceCidrIp</code> to specify the source IPv4 Classless Inter-Domain Routing (CIDR) block.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.putQueryParameter("SourceCidrIp", sourceCidrIp);
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.SourceGroupId</code> to specify the source security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxa123b****</p>
         */
        public Builder sourceGroupId(String sourceGroupId) {
            this.putQueryParameter("SourceGroupId", sourceGroupId);
            this.sourceGroupId = sourceGroupId;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.SourceGroupOwnerAccount</code> to specify the Alibaba Cloud account that owns the source security group.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:Test@aliyun.com">Test@aliyun.com</a></p>
         */
        public Builder sourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
            this.putQueryParameter("SourceGroupOwnerAccount", sourceGroupOwnerAccount);
            this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.SourceGroupOwnerId</code> to specify the ID of the Alibaba Cloud account that owns the source security group.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678910</p>
         */
        public Builder sourceGroupOwnerId(Long sourceGroupOwnerId) {
            this.putQueryParameter("SourceGroupOwnerId", sourceGroupOwnerId);
            this.sourceGroupOwnerId = sourceGroupOwnerId;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.SourcePortRange</code> to specify the source port range.</p>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.putQueryParameter("SourcePortRange", sourcePortRange);
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.SourcePrefixListId</code> to specify the source prefix list ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-x1j1k5ykzqlixdcy****</p>
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

    /**
     * 
     * {@link RevokeSecurityGroupRequest} extends {@link TeaModel}
     *
     * <p>RevokeSecurityGroupRequest</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("PortRangeListId")
        private String portRangeListId;

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
            this.portRangeListId = builder.portRangeListId;
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
         * @return portRangeListId
         */
        public String getPortRangeListId() {
            return this.portRangeListId;
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
            private String portRangeListId; 
            private String priority; 
            private String sourceCidrIp; 
            private String sourceGroupId; 
            private String sourceGroupOwnerAccount; 
            private Long sourceGroupOwnerId; 
            private String sourcePortRange; 
            private String sourcePrefixListId; 

            private Builder() {
            } 

            private Builder(Permissions model) {
                this.description = model.description;
                this.destCidrIp = model.destCidrIp;
                this.ipProtocol = model.ipProtocol;
                this.ipv6DestCidrIp = model.ipv6DestCidrIp;
                this.ipv6SourceCidrIp = model.ipv6SourceCidrIp;
                this.nicType = model.nicType;
                this.policy = model.policy;
                this.portRange = model.portRange;
                this.portRangeListId = model.portRangeListId;
                this.priority = model.priority;
                this.sourceCidrIp = model.sourceCidrIp;
                this.sourceGroupId = model.sourceGroupId;
                this.sourceGroupOwnerAccount = model.sourceGroupOwnerAccount;
                this.sourceGroupOwnerId = model.sourceGroupOwnerId;
                this.sourcePortRange = model.sourcePortRange;
                this.sourcePrefixListId = model.sourcePrefixListId;
            } 

            /**
             * <p>The description of the security group rule. The description must be 1 to 512 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination IPv4 CIDR block. CIDR blocks and IPv4 address ranges are supported.</p>
             * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/8</p>
             */
            public Builder destCidrIp(String destCidrIp) {
                this.destCidrIp = destCidrIp;
                return this;
            }

            /**
             * <p>The protocol type. The value is case-insensitive. Valid values: </p>
             * <ul>
             * <li>TCP.</li>
             * <li>UDP.</li>
             * <li>ICMP.</li>
             * <li>ICMPv6.</li>
             * <li>GRE.</li>
             * <li>ALL: all protocols.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The destination IPv6 CIDR block. CIDR blocks and IPv6 address ranges are supported.</p>
             * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
             * <blockquote>
             * <p>This parameter is valid only for VPC-type ECS instances that support IPv6. You cannot specify this parameter and <code>DestCidrIp</code> in Settings at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2001:db8:1233:1a00::***</p>
             */
            public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
                this.ipv6DestCidrIp = ipv6DestCidrIp;
                return this;
            }

            /**
             * <p>The source IPv6 Classless Inter-Domain Routing (CIDR) block from which you want to revoke access permissions. CIDR format and IPv6 format address ranges are supported.</p>
             * <blockquote>
             * <p>This parameter is valid only for VPC-type ECS instances that support IPv6. You cannot specify this parameter and <code>SourceCidrIp</code> in Settings at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2001:db8:1234:1a00::***</p>
             */
            public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
                this.ipv6SourceCidrIp = ipv6SourceCidrIp;
                return this;
            }

            /**
             * <p>The network interface controller (NIC) type of the security group rule. For VPC-type security groups, you do not need to configure the network interface controller (NIC) type in Settings. The default value is intranet, and only intranet is supported.</p>
             * <blockquote>
             * <p>The classic network feature has been offline. For details, see <a href="https://help.aliyun.com/document_detail/2833134.html">Discontinuation notice</a>. The network interface controller (NIC) type for classic network security group rules. Valid values:</p>
             * <ul>
             * <li>internet: public network interface controller (NIC).</li>
             * <li>intranet: internal network interface controller (NIC).</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>intranet</p>
             */
            public Builder nicType(String nicType) {
                this.nicType = nicType;
                return this;
            }

            /**
             * <p>The access permissions. Valid values: </p>
             * <ul>
             * <li>accept: Accepts access.</li>
             * <li>drop: Denies access and returns no deny information. The request appears to timeout or the connection cannot be established.</li>
             * </ul>
             * <p>Default value: accept.</p>
             * 
             * <strong>example:</strong>
             * <p>accept</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The range of destination ports for the specified protocol. Valid values:</p>
             * <ul>
             * <li>TCP/UDP: valid values are 1 to 65535. Separate the start port and the end port with a forward slash (/). Example: 1/200.</li>
             * <li>ICMP: -1/-1.</li>
             * <li>GRE: -1/-1.</li>
             * <li>ALL: -1/-1.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1/200</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * <p>The port list ID.</p>
             * <p>You can call <code>DescribePortRangeLists</code> to query available port list IDs.</p>
             * <p>If you specify <code>Permissions.N.PortRange</code>, this parameter is ignored.</p>
             * <p>For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>prl-2ze9743****</p>
             */
            public Builder portRangeListId(String portRangeListId) {
                this.portRangeListId = portRangeListId;
                return this;
            }

            /**
             * <p>The priority of the security group rule. A smaller value indicates a higher priority. Valid values: 1 to 100.</p>
             * <p>Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The source IPv4 Classless Inter-Domain Routing (CIDR) block from which you want to revoke access permissions. CIDR format and IPv4 format address ranges are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/8</p>
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * <p>The ID of the source security group from which you want to revoke access permissions.</p>
             * <ul>
             * <li><p>You must specify at least one of the following parameters in Settings: <code>SourceGroupId</code>, <code>SourceCidrIp</code>, <code>Ipv6SourceCidrIp</code>, or <code>SourcePrefixListId</code>.</p>
             * </li>
             * <li><p>If <code>SourceGroupId</code> is specified but neither <code>SourceCidrIp</code> nor <code>Ipv6SourceCidrIp</code> is specified, the NicType parameter must be set to intranet.</p>
             * </li>
             * <li><p>If both <code>SourceGroupId</code> and <code>SourceCidrIp</code> are specified, <code>SourceCidrIp</code> takes precedence by default.</p>
             * </li>
             * </ul>
             * <p>Note:</p>
             * <ul>
             * <li><p>Advanced security groups do not support authorization by security group access.</p>
             * </li>
             * <li><p>A maximum of 20 security groups can be authorized for a basic security group.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sg-bp67acfmxa123b****</p>
             */
            public Builder sourceGroupId(String sourceGroupId) {
                this.sourceGroupId = sourceGroupId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account that owns the source security group when you revoke a cross-account authorization security group rule.</p>
             * <ul>
             * <li>If neither <code>SourceGroupOwnerAccount</code> nor <code>SourceGroupOwnerId</code> is specified in Settings, the rule is revoked for access permissions of another security group within your account.</li>
             * <li>If the <code>SourceCidrIp</code> parameter is specified, the <code>SourceGroupOwnerAccount</code> parameter is ignored.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:Test@aliyun.com">Test@aliyun.com</a></p>
             */
            public Builder sourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
                this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that owns the source security group when you revoke a cross-account authorization security group rule.</p>
             * <ul>
             * <li>If neither <code>SourceGroupOwnerId</code> nor <code>SourceGroupOwnerAccount</code> is specified in Settings, the rule is revoked for access permissions of another security group within your account.</li>
             * <li>If the <code>SourceCidrIp</code> parameter is specified, the <code>SourceGroupOwnerId</code> parameter is ignored.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>12345678910</p>
             */
            public Builder sourceGroupOwnerId(Long sourceGroupOwnerId) {
                this.sourceGroupOwnerId = sourceGroupOwnerId;
                return this;
            }

            /**
             * <p>The range of source ports for the specified protocol. Valid values: </p>
             * <ul>
             * <li>TCP/UDP: valid values are 1 to 65535. Separate the start port and the end port with a forward slash (/). Example: 1/200.</li>
             * <li>ICMP: -1/-1.</li>
             * <li>GRE: -1/-1.</li>
             * <li>ALL: -1/-1.</li>
             * </ul>
             * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>80/80</p>
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            /**
             * <p>The ID of the source prefix list from which you want to revoke access permissions. You can invoke <a href="https://help.aliyun.com/document_detail/205046.html">DescribePrefixLists</a> to query available prefix list IDs.</p>
             * <p>Note:</p>
             * <p>If you specify one of <code>SourceCidrIp</code>, <code>Ipv6SourceCidrIp</code>, or <code>SourceGroupId</code>, this parameter is ignored.</p>
             * <p>For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>pl-x1j1k5ykzqlixdcy****</p>
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
