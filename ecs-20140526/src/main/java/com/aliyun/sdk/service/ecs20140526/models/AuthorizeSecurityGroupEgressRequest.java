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
 * {@link AuthorizeSecurityGroupEgressRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeSecurityGroupEgressRequest</p>
 */
public class AuthorizeSecurityGroupEgressRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("DestGroupId")
    @Deprecated
    private String destGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestGroupOwnerAccount")
    @Deprecated
    private String destGroupOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestGroupOwnerId")
    @Deprecated
    private Long destGroupOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestPrefixListId")
    @Deprecated
    private String destPrefixListId;

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
    @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
    @Deprecated
    private String sourceCidrIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePortRange")
    @Deprecated
    private String sourcePortRange;

    private AuthorizeSecurityGroupEgressRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.destCidrIp = builder.destCidrIp;
        this.destGroupId = builder.destGroupId;
        this.destGroupOwnerAccount = builder.destGroupOwnerAccount;
        this.destGroupOwnerId = builder.destGroupOwnerId;
        this.destPrefixListId = builder.destPrefixListId;
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
        this.sourceCidrIp = builder.sourceCidrIp;
        this.sourcePortRange = builder.sourcePortRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeSecurityGroupEgressRequest create() {
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
     * @return destGroupId
     */
    public String getDestGroupId() {
        return this.destGroupId;
    }

    /**
     * @return destGroupOwnerAccount
     */
    public String getDestGroupOwnerAccount() {
        return this.destGroupOwnerAccount;
    }

    /**
     * @return destGroupOwnerId
     */
    public Long getDestGroupOwnerId() {
        return this.destGroupOwnerId;
    }

    /**
     * @return destPrefixListId
     */
    public String getDestPrefixListId() {
        return this.destPrefixListId;
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

    public static final class Builder extends Request.Builder<AuthorizeSecurityGroupEgressRequest, Builder> {
        private String sourceRegionId; 
        private String clientToken; 
        private String description; 
        private String destCidrIp; 
        private String destGroupId; 
        private String destGroupOwnerAccount; 
        private Long destGroupOwnerId; 
        private String destPrefixListId; 
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
        private String sourceCidrIp; 
        private String sourcePortRange; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeSecurityGroupEgressRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.destCidrIp = request.destCidrIp;
            this.destGroupId = request.destGroupId;
            this.destGroupOwnerAccount = request.destGroupOwnerAccount;
            this.destGroupOwnerId = request.destGroupOwnerId;
            this.destPrefixListId = request.destPrefixListId;
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
            this.sourceCidrIp = request.sourceCidrIp;
            this.sourcePortRange = request.sourcePortRange;
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
         * <p><strong>[Deprecated]</strong> Use Permissions.N.Description to specify the description of the rule.</p>
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
         * <p><strong>[Deprecated]</strong> Use Permissions.N.DestCidrIp to specify the destination IPv4 Classless Inter-Domain Routing (CIDR) block.</p>
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
         * <p><strong>[Deprecated]</strong> Use Permissions.N.DestGroupId to specify the destination security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxazb4p****</p>
         */
        public Builder destGroupId(String destGroupId) {
            this.putQueryParameter("DestGroupId", destGroupId);
            this.destGroupId = destGroupId;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Use Permissions.N.DestGroupOwnerAccount to specify the Alibaba Cloud account to which the destination security group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:Test@aliyun.com">Test@aliyun.com</a></p>
         */
        public Builder destGroupOwnerAccount(String destGroupOwnerAccount) {
            this.putQueryParameter("DestGroupOwnerAccount", destGroupOwnerAccount);
            this.destGroupOwnerAccount = destGroupOwnerAccount;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Use Permissions.N.DestGroupOwnerId to specify the ID of the Alibaba Cloud account to which the destination security group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678910</p>
         */
        public Builder destGroupOwnerId(Long destGroupOwnerId) {
            this.putQueryParameter("DestGroupOwnerId", destGroupOwnerId);
            this.destGroupOwnerId = destGroupOwnerId;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Use Permissions.N.DestPrefixListId to specify the destination prefix list ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-x1j1k5ykzqlixdcy****</p>
         */
        public Builder destPrefixListId(String destPrefixListId) {
            this.putQueryParameter("DestPrefixListId", destPrefixListId);
            this.destPrefixListId = destPrefixListId;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Use Permissions.N.IpProtocol to specify the protocol type.</p>
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
         * <p><strong>[Deprecated]</strong> Use Permissions.N.Ipv6DestCidrIp to specify the destination IPv6 Classless Inter-Domain Routing (CIDR) block.</p>
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
         * <p><strong>[Deprecated]</strong> Use Permissions.N.Ipv6SourceCidrIp to specify the source IPv6 CIDR block.</p>
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
         * <p><strong>[Deprecated]</strong> Use Permissions.N.NicType to specify the NIC type.</p>
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
         * <p>The array of security group rules. Length: 1 to 100.</p>
         */
        public Builder permissions(java.util.List<Permissions> permissions) {
            this.putQueryParameter("Permissions", permissions);
            this.permissions = permissions;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Use Permissions.N.Policy for the access permission settings.</p>
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
         * <p><strong>[Deprecated]</strong> Use Permissions.N.PortRange to specify the port range.</p>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Use Permissions.N.Priority to specify the rule priority.</p>
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
         * <p>The region ID of the source security group. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p><strong>[Deprecated]</strong> Use Permissions.N.SourceCidrIp to specify the source IPv4 CIDR block.</p>
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
         * <p><strong>[Deprecated]</strong> Use Permissions.N.SourcePortRange to specify the source port range.</p>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.putQueryParameter("SourcePortRange", sourcePortRange);
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        @Override
        public AuthorizeSecurityGroupEgressRequest build() {
            return new AuthorizeSecurityGroupEgressRequest(this);
        } 

    } 

    /**
     * 
     * {@link AuthorizeSecurityGroupEgressRequest} extends {@link TeaModel}
     *
     * <p>AuthorizeSecurityGroupEgressRequest</p>
     */
    public static class Permissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestCidrIp")
        private String destCidrIp;

        @com.aliyun.core.annotation.NameInMap("DestGroupId")
        private String destGroupId;

        @com.aliyun.core.annotation.NameInMap("DestGroupOwnerAccount")
        private String destGroupOwnerAccount;

        @com.aliyun.core.annotation.NameInMap("DestGroupOwnerId")
        private Long destGroupOwnerId;

        @com.aliyun.core.annotation.NameInMap("DestPrefixListId")
        private String destPrefixListId;

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

        @com.aliyun.core.annotation.NameInMap("SourcePortRange")
        private String sourcePortRange;

        private Permissions(Builder builder) {
            this.description = builder.description;
            this.destCidrIp = builder.destCidrIp;
            this.destGroupId = builder.destGroupId;
            this.destGroupOwnerAccount = builder.destGroupOwnerAccount;
            this.destGroupOwnerId = builder.destGroupOwnerId;
            this.destPrefixListId = builder.destPrefixListId;
            this.ipProtocol = builder.ipProtocol;
            this.ipv6DestCidrIp = builder.ipv6DestCidrIp;
            this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
            this.nicType = builder.nicType;
            this.policy = builder.policy;
            this.portRange = builder.portRange;
            this.portRangeListId = builder.portRangeListId;
            this.priority = builder.priority;
            this.sourceCidrIp = builder.sourceCidrIp;
            this.sourcePortRange = builder.sourcePortRange;
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
         * @return destGroupId
         */
        public String getDestGroupId() {
            return this.destGroupId;
        }

        /**
         * @return destGroupOwnerAccount
         */
        public String getDestGroupOwnerAccount() {
            return this.destGroupOwnerAccount;
        }

        /**
         * @return destGroupOwnerId
         */
        public Long getDestGroupOwnerId() {
            return this.destGroupOwnerId;
        }

        /**
         * @return destPrefixListId
         */
        public String getDestPrefixListId() {
            return this.destPrefixListId;
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
         * @return sourcePortRange
         */
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public static final class Builder {
            private String description; 
            private String destCidrIp; 
            private String destGroupId; 
            private String destGroupOwnerAccount; 
            private Long destGroupOwnerId; 
            private String destPrefixListId; 
            private String ipProtocol; 
            private String ipv6DestCidrIp; 
            private String ipv6SourceCidrIp; 
            private String nicType; 
            private String policy; 
            private String portRange; 
            private String portRangeListId; 
            private String priority; 
            private String sourceCidrIp; 
            private String sourcePortRange; 

            private Builder() {
            } 

            private Builder(Permissions model) {
                this.description = model.description;
                this.destCidrIp = model.destCidrIp;
                this.destGroupId = model.destGroupId;
                this.destGroupOwnerAccount = model.destGroupOwnerAccount;
                this.destGroupOwnerId = model.destGroupOwnerId;
                this.destPrefixListId = model.destPrefixListId;
                this.ipProtocol = model.ipProtocol;
                this.ipv6DestCidrIp = model.ipv6DestCidrIp;
                this.ipv6SourceCidrIp = model.ipv6SourceCidrIp;
                this.nicType = model.nicType;
                this.policy = model.policy;
                this.portRange = model.portRange;
                this.portRangeListId = model.portRangeListId;
                this.priority = model.priority;
                this.sourceCidrIp = model.sourceCidrIp;
                this.sourcePortRange = model.sourcePortRange;
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
             * <p>The destination IPv4 Classless Inter-Domain Routing (CIDR) block settings for access permissions. Supports Classless Inter-Domain Routing (CIDR) format and IPv4 format IP address ranges.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/8</p>
             */
            public Builder destCidrIp(String destCidrIp) {
                this.destCidrIp = destCidrIp;
                return this;
            }

            /**
             * <p>The ID of the destination security group for which you want to configure access permissions.</p>
             * <ul>
             * <li><p>You must specify at least one of the following parameters: DestGroupId, DestCidrIp, Ipv6DestCidrIp, and DestPrefixListId.</p>
             * </li>
             * <li><p>If you specify DestGroupId but do not specify DestCidrIp, the NicType parameter can only be set to intranet.</p>
             * </li>
             * <li><p>If you specify both DestGroupId and DestCidrIp, the DestCidrIp parameter takes precedence.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sg-bp67acfmxazb4p****</p>
             */
            public Builder destGroupId(String destGroupId) {
                this.destGroupId = destGroupId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account to which the destination security group belongs when you configure security group rules across accounts. </p>
             * <ul>
             * <li>If neither DestGroupOwnerAccount nor DestGroupOwnerId is specified, the rule is considered to configure access permissions for your other security groups.</li>
             * <li>If the DestCidrIp parameter is specified, the DestGroupOwnerAccount parameter is invalid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:Test@aliyun.com">Test@aliyun.com</a></p>
             */
            public Builder destGroupOwnerAccount(String destGroupOwnerAccount) {
                this.destGroupOwnerAccount = destGroupOwnerAccount;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the destination security group belongs when you configure security group rules across accounts. </p>
             * <ul>
             * <li>If neither DestGroupOwnerId nor DestGroupOwnerAccount is specified, the rule is considered to configure access permissions for your other security groups.</li>
             * <li>If the DestCidrIp parameter is specified, the DestGroupOwnerId parameter is invalid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>12345678910</p>
             */
            public Builder destGroupOwnerId(Long destGroupOwnerId) {
                this.destGroupOwnerId = destGroupOwnerId;
                return this;
            }

            /**
             * <p>The ID of the destination prefix list for which you want to configure access permissions. You can call the <a href="https://help.aliyun.com/document_detail/205046.html">DescribePrefixLists</a> operation to query the IDs of available prefix lists.</p>
             * <p>Precautions:</p>
             * <p>If you specify the DestCidrIp, Ipv6DestCidrIp, or DestGroupId parameter, this parameter is ignored.</p>
             * <p>For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>pl-x1j1k5ykzqlixdcy****</p>
             */
            public Builder destPrefixListId(String destPrefixListId) {
                this.destPrefixListId = destPrefixListId;
                return this;
            }

            /**
             * <p>The network layer or transport layer protocol. Two types of values are supported:</p>
             * <ol>
             * <li>Case-insensitive protocol names. Valid values:</li>
             * </ol>
             * <ul>
             * <li>ICMP</li>
             * <li>GRE</li>
             * <li>TCP</li>
             * <li>UDP</li>
             * <li>ALL: all protocols.</li>
             * </ul>
             * <ol start="2">
             * <li>IANA-standard protocol numbers, which are integers from 0 to 255. This is supported in the following regions:</li>
             * </ol>
             * <ul>
             * <li>Philippines</li>
             * <li>UK</li>
             * <li>Malaysia</li>
             * <li>China (Hohhot)</li>
             * <li>China (Qingdao)</li>
             * <li>US West</li>
             * <li>Singapore</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The destination IPv6 Classless Inter-Domain Routing (CIDR) block settings for access permissions. Supports Classless Inter-Domain Routing (CIDR) format and IPv6 format IP address ranges.</p>
             * <blockquote>
             * <p>This parameter is valid only for VPC-type ECS instances that support IPv6. You cannot specify both this parameter and the DestCidrIp parameter.</p>
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
             * <p>The source IPv6 CIDR block. CIDR blocks and IPv6 address ranges are supported. </p>
             * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Quintuple rules for security groups</a>.</p>
             * <blockquote>
             * <p>This parameter is valid only for VPC-type ECS instances that support IPv6. You cannot specify both this parameter and the DestCidrIp parameter.</p>
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
             * <p>The network interface controller (NIC) type for security group rules in the classic network type. Valid values: </p>
             * <ul>
             * <li>internet: public NIC.</li>
             * <li>intranet: internal network NIC.<ul>
             * <li>For security group rules in a VPC, you do not need to set the NIC type settings. The default value is intranet.</li>
             * <li>When you configure mutual access between security groups by specifying only the DestGroupId parameter, the default value is intranet.</li>
             * </ul>
             * </li>
             * </ul>
             * <p>Default value: internet.</p>
             * 
             * <strong>example:</strong>
             * <p>intranet</p>
             */
            public Builder nicType(String nicType) {
                this.nicType = nicType;
                return this;
            }

            /**
             * <p>The access permission settings. Valid values: </p>
             * <ul>
             * <li>accept: allows access.</li>
             * <li>drop: denies access and does not return a rejection message. The request from the source experiences a timeout or fails to establish a connection.</li>
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
             * <p>The destination port range for the protocols enabled in the security group. Valid values:</p>
             * <ul>
             * <li>TCP or UDP: 1 to 65535. Separate the start port and the end port with a forward slash (/). Example: 1/200.</li>
             * <li>ICMP: -1/-1.</li>
             * <li>GRE: -1/-1.</li>
             * <li>ALL: -1/-1.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>80/80</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * <p>The ID of the port range list.
             * You can invoke the DescribePortRangeLists operation to query the IDs of available port range lists.</p>
             * <ul>
             * <li>If you specify the Permissions.N.PortRange parameter, this parameter is ignored.</li>
             * <li>Port range list settings are not supported when the network type of the security group is classic network. For more information about the limits on security groups and port range lists, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</li>
             * </ul>
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
             * <p>The source IPv4 CIDR block. CIDR blocks and IPv4 address ranges are supported.</p>
             * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Quintuple rules for security groups</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/8</p>
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * <p>The source port range for the protocols enabled in the security group. Valid values:</p>
             * <ul>
             * <li>TCP or UDP: 1 to 65535. Separate the start port and the end port with a forward slash (/). Example: 1/200.</li>
             * <li>ICMP: -1/-1.</li>
             * <li>GRE: -1/-1.</li>
             * <li>ALL: -1/-1.</li>
             * </ul>
             * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Quintuple rules for security groups</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>80/80</p>
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
}
