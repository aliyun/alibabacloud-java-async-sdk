// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureSecurityGroupPermissionsRequest} extends {@link RequestModel}
 *
 * <p>ConfigureSecurityGroupPermissionsRequest</p>
 */
public class ConfigureSecurityGroupPermissionsRequest extends Request {
    @Query
    @NameInMap("AuthorizePermission")
    private java.util.List < AuthorizePermission> authorizePermission;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

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

    @Query
    @NameInMap("RevokePermission")
    private java.util.List < RevokePermission> revokePermission;

    @Query
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    private String securityGroupId;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    private ConfigureSecurityGroupPermissionsRequest(Builder builder) {
        super(builder);
        this.authorizePermission = builder.authorizePermission;
        this.clientToken = builder.clientToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.revokePermission = builder.revokePermission;
        this.securityGroupId = builder.securityGroupId;
        this.sourceRegionId = builder.sourceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureSecurityGroupPermissionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizePermission
     */
    public java.util.List < AuthorizePermission> getAuthorizePermission() {
        return this.authorizePermission;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    /**
     * @return revokePermission
     */
    public java.util.List < RevokePermission> getRevokePermission() {
        return this.revokePermission;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public static final class Builder extends Request.Builder<ConfigureSecurityGroupPermissionsRequest, Builder> {
        private java.util.List < AuthorizePermission> authorizePermission; 
        private String clientToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < RevokePermission> revokePermission; 
        private String securityGroupId; 
        private String sourceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureSecurityGroupPermissionsRequest response) {
            super(response);
            this.authorizePermission = response.authorizePermission;
            this.clientToken = response.clientToken;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.revokePermission = response.revokePermission;
            this.securityGroupId = response.securityGroupId;
            this.sourceRegionId = response.sourceRegionId;
        } 

        /**
         * AuthorizePermission.
         */
        public Builder authorizePermission(java.util.List < AuthorizePermission> authorizePermission) {
            this.putQueryParameter("AuthorizePermission", authorizePermission);
            this.authorizePermission = authorizePermission;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * RegionId.
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
         * RevokePermission.
         */
        public Builder revokePermission(java.util.List < RevokePermission> revokePermission) {
            this.putQueryParameter("RevokePermission", revokePermission);
            this.revokePermission = revokePermission;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        @Override
        public ConfigureSecurityGroupPermissionsRequest build() {
            return new ConfigureSecurityGroupPermissionsRequest(this);
        } 

    } 

    public static class AuthorizePermission extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DestCidrIp")
        private String destCidrIp;

        @NameInMap("DestGroupId")
        private String destGroupId;

        @NameInMap("DestPrefixListId")
        private String destPrefixListId;

        @NameInMap("GressFlow")
        @Validation(required = true)
        private String gressFlow;

        @NameInMap("GroupOwnerAccount")
        private String groupOwnerAccount;

        @NameInMap("GroupOwnerId")
        private Long groupOwnerId;

        @NameInMap("IpProtocol")
        @Validation(required = true)
        private String ipProtocol;

        @NameInMap("Ipv6DestCidrIp")
        private String ipv6DestCidrIp;

        @NameInMap("Ipv6SourceCidrIp")
        private String ipv6SourceCidrIp;

        @NameInMap("NicType")
        private String nicType;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("PortRange")
        @Validation(required = true)
        private String portRange;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @NameInMap("SourceGroupId")
        private String sourceGroupId;

        @NameInMap("SourcePortRange")
        private String sourcePortRange;

        @NameInMap("SourcePrefixListId")
        private String sourcePrefixListId;

        private AuthorizePermission(Builder builder) {
            this.description = builder.description;
            this.destCidrIp = builder.destCidrIp;
            this.destGroupId = builder.destGroupId;
            this.destPrefixListId = builder.destPrefixListId;
            this.gressFlow = builder.gressFlow;
            this.groupOwnerAccount = builder.groupOwnerAccount;
            this.groupOwnerId = builder.groupOwnerId;
            this.ipProtocol = builder.ipProtocol;
            this.ipv6DestCidrIp = builder.ipv6DestCidrIp;
            this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
            this.nicType = builder.nicType;
            this.policy = builder.policy;
            this.portRange = builder.portRange;
            this.priority = builder.priority;
            this.sourceCidrIp = builder.sourceCidrIp;
            this.sourceGroupId = builder.sourceGroupId;
            this.sourcePortRange = builder.sourcePortRange;
            this.sourcePrefixListId = builder.sourcePrefixListId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizePermission create() {
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
         * @return destPrefixListId
         */
        public String getDestPrefixListId() {
            return this.destPrefixListId;
        }

        /**
         * @return gressFlow
         */
        public String getGressFlow() {
            return this.gressFlow;
        }

        /**
         * @return groupOwnerAccount
         */
        public String getGroupOwnerAccount() {
            return this.groupOwnerAccount;
        }

        /**
         * @return groupOwnerId
         */
        public Long getGroupOwnerId() {
            return this.groupOwnerId;
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
            private String destGroupId; 
            private String destPrefixListId; 
            private String gressFlow; 
            private String groupOwnerAccount; 
            private Long groupOwnerId; 
            private String ipProtocol; 
            private String ipv6DestCidrIp; 
            private String ipv6SourceCidrIp; 
            private String nicType; 
            private String policy; 
            private String portRange; 
            private String priority; 
            private String sourceCidrIp; 
            private String sourceGroupId; 
            private String sourcePortRange; 
            private String sourcePrefixListId; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DestCidrIp.
             */
            public Builder destCidrIp(String destCidrIp) {
                this.destCidrIp = destCidrIp;
                return this;
            }

            /**
             * DestGroupId.
             */
            public Builder destGroupId(String destGroupId) {
                this.destGroupId = destGroupId;
                return this;
            }

            /**
             * DestPrefixListId.
             */
            public Builder destPrefixListId(String destPrefixListId) {
                this.destPrefixListId = destPrefixListId;
                return this;
            }

            /**
             * GressFlow.
             */
            public Builder gressFlow(String gressFlow) {
                this.gressFlow = gressFlow;
                return this;
            }

            /**
             * GroupOwnerAccount.
             */
            public Builder groupOwnerAccount(String groupOwnerAccount) {
                this.groupOwnerAccount = groupOwnerAccount;
                return this;
            }

            /**
             * GroupOwnerId.
             */
            public Builder groupOwnerId(Long groupOwnerId) {
                this.groupOwnerId = groupOwnerId;
                return this;
            }

            /**
             * IpProtocol.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * Ipv6DestCidrIp.
             */
            public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
                this.ipv6DestCidrIp = ipv6DestCidrIp;
                return this;
            }

            /**
             * Ipv6SourceCidrIp.
             */
            public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
                this.ipv6SourceCidrIp = ipv6SourceCidrIp;
                return this;
            }

            /**
             * NicType.
             */
            public Builder nicType(String nicType) {
                this.nicType = nicType;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * PortRange.
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * SourceCidrIp.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * SourceGroupId.
             */
            public Builder sourceGroupId(String sourceGroupId) {
                this.sourceGroupId = sourceGroupId;
                return this;
            }

            /**
             * SourcePortRange.
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            /**
             * SourcePrefixListId.
             */
            public Builder sourcePrefixListId(String sourcePrefixListId) {
                this.sourcePrefixListId = sourcePrefixListId;
                return this;
            }

            public AuthorizePermission build() {
                return new AuthorizePermission(this);
            } 

        } 

    }
    public static class RevokePermission extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DestCidrIp")
        private String destCidrIp;

        @NameInMap("DestGroupId")
        private String destGroupId;

        @NameInMap("DestPrefixListId")
        private String destPrefixListId;

        @NameInMap("GressFlow")
        @Validation(required = true)
        private String gressFlow;

        @NameInMap("GroupOwnerAccount")
        private String groupOwnerAccount;

        @NameInMap("GroupOwnerId")
        private Long groupOwnerId;

        @NameInMap("IpProtocol")
        @Validation(required = true)
        private String ipProtocol;

        @NameInMap("Ipv6DestCidrIp")
        private String ipv6DestCidrIp;

        @NameInMap("Ipv6SourceCidrIp")
        private String ipv6SourceCidrIp;

        @NameInMap("NicType")
        private String nicType;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("PortRange")
        @Validation(required = true)
        private String portRange;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @NameInMap("SourceGroupId")
        private String sourceGroupId;

        @NameInMap("SourcePortRange")
        private String sourcePortRange;

        @NameInMap("SourcePrefixListId")
        private String sourcePrefixListId;

        private RevokePermission(Builder builder) {
            this.description = builder.description;
            this.destCidrIp = builder.destCidrIp;
            this.destGroupId = builder.destGroupId;
            this.destPrefixListId = builder.destPrefixListId;
            this.gressFlow = builder.gressFlow;
            this.groupOwnerAccount = builder.groupOwnerAccount;
            this.groupOwnerId = builder.groupOwnerId;
            this.ipProtocol = builder.ipProtocol;
            this.ipv6DestCidrIp = builder.ipv6DestCidrIp;
            this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
            this.nicType = builder.nicType;
            this.policy = builder.policy;
            this.portRange = builder.portRange;
            this.priority = builder.priority;
            this.sourceCidrIp = builder.sourceCidrIp;
            this.sourceGroupId = builder.sourceGroupId;
            this.sourcePortRange = builder.sourcePortRange;
            this.sourcePrefixListId = builder.sourcePrefixListId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RevokePermission create() {
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
         * @return destPrefixListId
         */
        public String getDestPrefixListId() {
            return this.destPrefixListId;
        }

        /**
         * @return gressFlow
         */
        public String getGressFlow() {
            return this.gressFlow;
        }

        /**
         * @return groupOwnerAccount
         */
        public String getGroupOwnerAccount() {
            return this.groupOwnerAccount;
        }

        /**
         * @return groupOwnerId
         */
        public Long getGroupOwnerId() {
            return this.groupOwnerId;
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
            private String destGroupId; 
            private String destPrefixListId; 
            private String gressFlow; 
            private String groupOwnerAccount; 
            private Long groupOwnerId; 
            private String ipProtocol; 
            private String ipv6DestCidrIp; 
            private String ipv6SourceCidrIp; 
            private String nicType; 
            private String policy; 
            private String portRange; 
            private String priority; 
            private String sourceCidrIp; 
            private String sourceGroupId; 
            private String sourcePortRange; 
            private String sourcePrefixListId; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DestCidrIp.
             */
            public Builder destCidrIp(String destCidrIp) {
                this.destCidrIp = destCidrIp;
                return this;
            }

            /**
             * DestGroupId.
             */
            public Builder destGroupId(String destGroupId) {
                this.destGroupId = destGroupId;
                return this;
            }

            /**
             * DestPrefixListId.
             */
            public Builder destPrefixListId(String destPrefixListId) {
                this.destPrefixListId = destPrefixListId;
                return this;
            }

            /**
             * GressFlow.
             */
            public Builder gressFlow(String gressFlow) {
                this.gressFlow = gressFlow;
                return this;
            }

            /**
             * GroupOwnerAccount.
             */
            public Builder groupOwnerAccount(String groupOwnerAccount) {
                this.groupOwnerAccount = groupOwnerAccount;
                return this;
            }

            /**
             * GroupOwnerId.
             */
            public Builder groupOwnerId(Long groupOwnerId) {
                this.groupOwnerId = groupOwnerId;
                return this;
            }

            /**
             * IpProtocol.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * Ipv6DestCidrIp.
             */
            public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
                this.ipv6DestCidrIp = ipv6DestCidrIp;
                return this;
            }

            /**
             * Ipv6SourceCidrIp.
             */
            public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
                this.ipv6SourceCidrIp = ipv6SourceCidrIp;
                return this;
            }

            /**
             * NicType.
             */
            public Builder nicType(String nicType) {
                this.nicType = nicType;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * PortRange.
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * SourceCidrIp.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * SourceGroupId.
             */
            public Builder sourceGroupId(String sourceGroupId) {
                this.sourceGroupId = sourceGroupId;
                return this;
            }

            /**
             * SourcePortRange.
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            /**
             * SourcePrefixListId.
             */
            public Builder sourcePrefixListId(String sourcePrefixListId) {
                this.sourcePrefixListId = sourcePrefixListId;
                return this;
            }

            public RevokePermission build() {
                return new RevokePermission(this);
            } 

        } 

    }
}
