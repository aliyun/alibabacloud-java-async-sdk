// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityGroupAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityGroupAttributeResponseBody</p>
 */
public class DescribeSecurityGroupAttributeResponseBody extends TeaModel {
    @NameInMap("Description")
    private String description;

    @NameInMap("InnerAccessPolicy")
    private String innerAccessPolicy;

    @NameInMap("Permissions")
    private Permissions permissions;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @NameInMap("SecurityGroupName")
    private String securityGroupName;

    @NameInMap("VpcId")
    private String vpcId;

    private DescribeSecurityGroupAttributeResponseBody(Builder builder) {
        this.description = builder.description;
        this.innerAccessPolicy = builder.innerAccessPolicy;
        this.permissions = builder.permissions;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupName = builder.securityGroupName;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityGroupAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return innerAccessPolicy
     */
    public String getInnerAccessPolicy() {
        return this.innerAccessPolicy;
    }

    /**
     * @return permissions
     */
    public Permissions getPermissions() {
        return this.permissions;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String description; 
        private String innerAccessPolicy; 
        private Permissions permissions; 
        private String regionId; 
        private String requestId; 
        private String securityGroupId; 
        private String securityGroupName; 
        private String vpcId; 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * InnerAccessPolicy.
         */
        public Builder innerAccessPolicy(String innerAccessPolicy) {
            this.innerAccessPolicy = innerAccessPolicy;
            return this;
        }

        /**
         * Permissions.
         */
        public Builder permissions(Permissions permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * SecurityGroupName.
         */
        public Builder securityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribeSecurityGroupAttributeResponseBody build() {
            return new DescribeSecurityGroupAttributeResponseBody(this);
        } 

    } 

    public static class Permission extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DestCidrIp")
        private String destCidrIp;

        @NameInMap("DestGroupId")
        private String destGroupId;

        @NameInMap("DestGroupName")
        private String destGroupName;

        @NameInMap("DestGroupOwnerAccount")
        private String destGroupOwnerAccount;

        @NameInMap("DestPrefixListId")
        private String destPrefixListId;

        @NameInMap("DestPrefixListName")
        private String destPrefixListName;

        @NameInMap("Direction")
        private String direction;

        @NameInMap("IpProtocol")
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
        private String portRange;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @NameInMap("SourceGroupId")
        private String sourceGroupId;

        @NameInMap("SourceGroupName")
        private String sourceGroupName;

        @NameInMap("SourceGroupOwnerAccount")
        private String sourceGroupOwnerAccount;

        @NameInMap("SourcePortRange")
        private String sourcePortRange;

        @NameInMap("SourcePrefixListId")
        private String sourcePrefixListId;

        @NameInMap("SourcePrefixListName")
        private String sourcePrefixListName;

        private Permission(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.destCidrIp = builder.destCidrIp;
            this.destGroupId = builder.destGroupId;
            this.destGroupName = builder.destGroupName;
            this.destGroupOwnerAccount = builder.destGroupOwnerAccount;
            this.destPrefixListId = builder.destPrefixListId;
            this.destPrefixListName = builder.destPrefixListName;
            this.direction = builder.direction;
            this.ipProtocol = builder.ipProtocol;
            this.ipv6DestCidrIp = builder.ipv6DestCidrIp;
            this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
            this.nicType = builder.nicType;
            this.policy = builder.policy;
            this.portRange = builder.portRange;
            this.priority = builder.priority;
            this.sourceCidrIp = builder.sourceCidrIp;
            this.sourceGroupId = builder.sourceGroupId;
            this.sourceGroupName = builder.sourceGroupName;
            this.sourceGroupOwnerAccount = builder.sourceGroupOwnerAccount;
            this.sourcePortRange = builder.sourcePortRange;
            this.sourcePrefixListId = builder.sourcePrefixListId;
            this.sourcePrefixListName = builder.sourcePrefixListName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permission create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return destGroupName
         */
        public String getDestGroupName() {
            return this.destGroupName;
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
         * @return destPrefixListName
         */
        public String getDestPrefixListName() {
            return this.destPrefixListName;
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
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
         * @return sourceGroupName
         */
        public String getSourceGroupName() {
            return this.sourceGroupName;
        }

        /**
         * @return sourceGroupOwnerAccount
         */
        public String getSourceGroupOwnerAccount() {
            return this.sourceGroupOwnerAccount;
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

        /**
         * @return sourcePrefixListName
         */
        public String getSourcePrefixListName() {
            return this.sourcePrefixListName;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String destCidrIp; 
            private String destGroupId; 
            private String destGroupName; 
            private String destGroupOwnerAccount; 
            private String destPrefixListId; 
            private String destPrefixListName; 
            private String direction; 
            private String ipProtocol; 
            private String ipv6DestCidrIp; 
            private String ipv6SourceCidrIp; 
            private String nicType; 
            private String policy; 
            private String portRange; 
            private String priority; 
            private String sourceCidrIp; 
            private String sourceGroupId; 
            private String sourceGroupName; 
            private String sourceGroupOwnerAccount; 
            private String sourcePortRange; 
            private String sourcePrefixListId; 
            private String sourcePrefixListName; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

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
             * DestGroupName.
             */
            public Builder destGroupName(String destGroupName) {
                this.destGroupName = destGroupName;
                return this;
            }

            /**
             * DestGroupOwnerAccount.
             */
            public Builder destGroupOwnerAccount(String destGroupOwnerAccount) {
                this.destGroupOwnerAccount = destGroupOwnerAccount;
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
             * DestPrefixListName.
             */
            public Builder destPrefixListName(String destPrefixListName) {
                this.destPrefixListName = destPrefixListName;
                return this;
            }

            /**
             * Direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
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
             * SourceGroupName.
             */
            public Builder sourceGroupName(String sourceGroupName) {
                this.sourceGroupName = sourceGroupName;
                return this;
            }

            /**
             * SourceGroupOwnerAccount.
             */
            public Builder sourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
                this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
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

            /**
             * SourcePrefixListName.
             */
            public Builder sourcePrefixListName(String sourcePrefixListName) {
                this.sourcePrefixListName = sourcePrefixListName;
                return this;
            }

            public Permission build() {
                return new Permission(this);
            } 

        } 

    }
    public static class Permissions extends TeaModel {
        @NameInMap("Permission")
        private java.util.List < Permission> permission;

        private Permissions(Builder builder) {
            this.permission = builder.permission;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permissions create() {
            return builder().build();
        }

        /**
         * @return permission
         */
        public java.util.List < Permission> getPermission() {
            return this.permission;
        }

        public static final class Builder {
            private java.util.List < Permission> permission; 

            /**
             * Permission.
             */
            public Builder permission(java.util.List < Permission> permission) {
                this.permission = permission;
                return this;
            }

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
}
