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
 * {@link AuthorizeSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeSecurityGroupRequest</p>
 */
public class AuthorizeSecurityGroupRequest extends Request {
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

    private AuthorizeSecurityGroupRequest(Builder builder) {
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

    public static final class Builder extends Request.Builder<AuthorizeSecurityGroupRequest, Builder> {
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
        private String sourceCidrIp; 
        private String sourceGroupId; 
        private String sourceGroupOwnerAccount; 
        private Long sourceGroupOwnerId; 
        private String sourcePortRange; 
        private String sourcePrefixListId; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeSecurityGroupRequest request) {
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
         * <p>A client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
         * <p>Deprecated. Use <code>Permissions.N.Description</code> to specify the description of the security group rule.</p>
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
         * <p>null</p>
         */
        public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
            this.putQueryParameter("Ipv6DestCidrIp", ipv6DestCidrIp);
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.Ipv6SourceCidrIp</code> to specify the source IPv6 Classless Inter-Domain Routing block.</p>
         * 
         * <strong>example:</strong>
         * <p>2001:250:6000::***</p>
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
         * <p>The security group rules. Array length: 1 to 100.</p>
         */
        public Builder permissions(java.util.List<Permissions> permissions) {
            this.putQueryParameter("Permissions", permissions);
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.Policy</code> to set access permissions. Settings configured through this parameter are no longer supported.</p>
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
         * <p>22/22</p>
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
            return this;
        }

        /**
         * <p>Deprecated. Use <code>Permissions.N.Priority</code> to specify the priority of the security group rule.</p>
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
         * <p>Deprecated. Use <code>Permissions.N.SourceCidrIp</code> to specify the source IPv4 Classless Inter-Domain Routing block.</p>
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
         * <p>sg-bp67acfmxazb4p****</p>
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
         * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
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
         * <p>1234567890</p>
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
         * <p>22/22</p>
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
        public AuthorizeSecurityGroupRequest build() {
            return new AuthorizeSecurityGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link AuthorizeSecurityGroupRequest} extends {@link TeaModel}
     *
     * <p>AuthorizeSecurityGroupRequest</p>
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
             * <p>The network-layer or transport-layer protocol. Two types of values are supported:</p>
             * <ol>
             * <li>Case-insensitive protocol names. Valid values:</li>
             * </ol>
             * <ul>
             * <li>ICMP</li>
             * <li>GRE</li>
             * <li>TCP</li>
             * <li>UDP</li>
             * <li>ALL: All protocols are supported.</li>
             * </ul>
             * <ol start="2">
             * <li>Protocol numbers that comply with IANA specifications, which are integers from 0 to 255. The following regions currently support this feature:</li>
             * </ol>
             * <ul>
             * <li>Philippines</li>
             * <li>UK</li>
             * <li>Malaysia</li>
             * <li>Hohhot</li>
             * <li>Qingdao</li>
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
             * <p>The destination IPv6 CIDR block. Settings support CIDR format and IPv6 format address ranges.</p>
             * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
             * <blockquote>
             * <p>This parameter takes effect only for VPC-connected ECS instances that support IPv6. This parameter and <code>DestCidrIp</code> cannot be specified at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2001:250:6000::***</p>
             */
            public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
                this.ipv6DestCidrIp = ipv6DestCidrIp;
                return this;
            }

            /**
             * <p>The source IPv6 CIDR block for which you want to set access permissions. Settings support CIDR format and IPv6 format address ranges.</p>
             * <blockquote>
             * <p>This parameter takes effect only for VPC-connected ECS instances that support IPv6. This parameter and <code>SourceCidrIp</code> cannot be specified at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2001:250:6000::***</p>
             */
            public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
                this.ipv6SourceCidrIp = ipv6SourceCidrIp;
                return this;
            }

            /**
             * <p>The network interface controller (NIC) type for a classic network security group rule. Settings include the following valid values:</p>
             * <ul>
             * <li><p>internet: public network interface controller (NIC).</p>
             * </li>
             * <li><p>intranet: internal network interface controller (NIC).</p>
             * </li>
             * </ul>
             * <p>For VPC security group rules, you do not need to set the network interface controller (NIC) type. The default value is intranet, and only intranet is supported.</p>
             * <p>When you set security groups to access each other, meaning only the DestGroupId parameter is specified, only intranet is supported.</p>
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
             * <p>Settings for access permissions. Valid values:</p>
             * <ul>
             * <li><p>accept: Accepts access.</p>
             * </li>
             * <li><p>drop: Denies access without returning a deny response. The request appears to timeout or the connection cannot be established.</p>
             * </li>
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
             * <p>The range of destination ports that correspond to the protocol for the security group. Valid values:</p>
             * <ul>
             * <li>TCP/UDP: Valid values are 1 to 65535. Separate the start port and the stop port with a forward slash (/). Example: 1/200.</li>
             * <li>ICMP: -1/-1.</li>
             * <li>GRE: -1/-1.</li>
             * <li>If IpProtocol is set to ALL: -1/-1.</li>
             * </ul>
             * <p>For more information about common scenarios of ports, see <a href="https://help.aliyun.com/document_detail/40724.html">Common ports</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>80/80</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * <p>The port address book ID.
             * You can invoke <code>DescribePortRangeLists</code> to query available port address book IDs.</p>
             * <ul>
             * <li>If you specify <code>Permissions.N.PortRange</code>, this parameter is ignored.</li>
             * <li>Port address books are not supported when the security group network type is classic network. For more information about security group and port address book limits, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>. Settings for port address books are subject to these limits.</li>
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
             * <p>The source IPv4 CIDR block for which you want to set access permissions. Settings support CIDR format and IPv4 format address ranges.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/8</p>
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * <p>The ID of the source security group for which you want to set access permissions.</p>
             * <ul>
             * <li><p>Specify at least one of the following parameters: <code>SourceGroupId</code>, <code>SourceCidrIp</code>, <code>Ipv6SourceCidrIp</code>, or <code>SourcePrefixListId</code>.</p>
             * </li>
             * <li><p>If <code>SourceGroupId</code> is specified but <code>SourceCidrIp</code> or <code>Ipv6SourceCidrIp</code> is not specified, the <code>NicType</code> parameter can only be set to <code>intranet</code>.</p>
             * </li>
             * <li><p>If both <code>SourceGroupId</code> and <code>SourceCidrIp</code> are specified, <code>SourceCidrIp</code> takes precedence.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sg-bp67acfmxazb4p****</p>
             */
            public Builder sourceGroupId(String sourceGroupId) {
                this.sourceGroupId = sourceGroupId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account that owns the source security group when you set a cross-account security group rule. Settings apply as follows:</p>
             * <ul>
             * <li><p>If neither <code>SourceGroupOwnerAccount</code> nor <code>SourceGroupOwnerId</code> is set, the rule is created to set access permissions for another security group within your account.</p>
             * </li>
             * <li><p>If the <code>SourceCidrIp</code> parameter is specified, the <code>SourceGroupOwnerAccount</code> parameter is ignored.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
             */
            public Builder sourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
                this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that owns the source security group when you set a cross-account security group rule. Settings apply as follows:</p>
             * <ul>
             * <li><p>If neither <code>SourceGroupOwnerAccount</code> nor <code>SourceGroupOwnerId</code> is set, the rule is created to set access permissions for another security group within your account.</p>
             * </li>
             * <li><p>If the <code>SourceCidrIp</code> parameter is specified, the <code>SourceGroupOwnerAccount</code> parameter is ignored.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
             */
            public Builder sourceGroupOwnerId(Long sourceGroupOwnerId) {
                this.sourceGroupOwnerId = sourceGroupOwnerId;
                return this;
            }

            /**
             * <p>The range of source ports that correspond to the protocol for the security group. Valid values:</p>
             * <ul>
             * <li>TCP/UDP: Valid values are 1 to 65535. Separate the start port and the end port with a forward slash (/). Example: 1/200.</li>
             * <li>ICMP: -1/-1.</li>
             * <li>GRE: -1/-1.</li>
             * <li>If IpProtocol is set to ALL: -1/-1.</li>
             * </ul>
             * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>7000/8000</p>
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            /**
             * <p>The ID of the source prefix list for which you want to set access permissions. You can call <a href="https://help.aliyun.com/document_detail/205046.html">DescribePrefixLists</a> to query available prefix list IDs.</p>
             * <p>Usage notes:</p>
             * <p>If you specify one of the <code>SourceCidrIp</code>, <code>Ipv6SourceCidrIp</code>, or <code>SourceGroupId</code> parameters, this parameter is ignored.</p>
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
