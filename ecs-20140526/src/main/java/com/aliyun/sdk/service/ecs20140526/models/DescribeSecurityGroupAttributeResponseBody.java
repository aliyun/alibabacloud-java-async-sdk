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
    @NameInMap("VpcId")
    private String vpcId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("InnerAccessPolicy")
    private String innerAccessPolicy;

    @NameInMap("Description")
    private String description;

    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @NameInMap("SecurityGroupName")
    private String securityGroupName;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("Permissions")
    private Permissions permissions;

    private DescribeSecurityGroupAttributeResponseBody(Builder builder) {
        this.vpcId = builder.vpcId;
        this.requestId = builder.requestId;
        this.innerAccessPolicy = builder.innerAccessPolicy;
        this.description = builder.description;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupName = builder.securityGroupName;
        this.regionId = builder.regionId;
        this.permissions = builder.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityGroupAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return innerAccessPolicy
     */
    public String getInnerAccessPolicy() {
        return this.innerAccessPolicy;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return permissions
     */
    public Permissions getPermissions() {
        return this.permissions;
    }

    public static final class Builder {
        private String vpcId; 
        private String requestId; 
        private String innerAccessPolicy; 
        private String description; 
        private String securityGroupId; 
        private String securityGroupName; 
        private String regionId; 
        private Permissions permissions; 

        /**
         * VPC ID. If VPC ID is returned, the network type of the security group is VPC. Otherwise, it indicates a classic network security group.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The network connection policy in the security group. Possible values:
         * <p>
         * 
         * -Accept: intranet interconnection
         * -Drop: internal network isolation
         */
        public Builder innerAccessPolicy(String innerAccessPolicy) {
            this.innerAccessPolicy = innerAccessPolicy;
            return this;
        }

        /**
         * The description of the security group.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The ID of the Target security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The name of the target security group.
         */
        public Builder securityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The set of Security Group permission rules.
         */
        public Builder permissions(Permissions permissions) {
            this.permissions = permissions;
            return this;
        }

        public DescribeSecurityGroupAttributeResponseBody build() {
            return new DescribeSecurityGroupAttributeResponseBody(this);
        } 

    } 

    public static class Permission extends TeaModel {
        @NameInMap("Direction")
        private String direction;

        @NameInMap("SourceGroupId")
        private String sourceGroupId;

        @NameInMap("DestGroupOwnerAccount")
        private String destGroupOwnerAccount;

        @NameInMap("DestPrefixListId")
        private String destPrefixListId;

        @NameInMap("DestPrefixListName")
        private String destPrefixListName;

        @NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @NameInMap("Ipv6DestCidrIp")
        private String ipv6DestCidrIp;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Ipv6SourceCidrIp")
        private String ipv6SourceCidrIp;

        @NameInMap("DestGroupId")
        private String destGroupId;

        @NameInMap("DestCidrIp")
        private String destCidrIp;

        @NameInMap("IpProtocol")
        private String ipProtocol;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("DestGroupName")
        private String destGroupName;

        @NameInMap("NicType")
        private String nicType;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Description")
        private String description;

        @NameInMap("PortRange")
        private String portRange;

        @NameInMap("SourcePrefixListName")
        private String sourcePrefixListName;

        @NameInMap("SourcePrefixListId")
        private String sourcePrefixListId;

        @NameInMap("SourceGroupOwnerAccount")
        private String sourceGroupOwnerAccount;

        @NameInMap("SourceGroupName")
        private String sourceGroupName;

        @NameInMap("SourcePortRange")
        private String sourcePortRange;

        private Permission(Builder builder) {
            this.direction = builder.direction;
            this.sourceGroupId = builder.sourceGroupId;
            this.destGroupOwnerAccount = builder.destGroupOwnerAccount;
            this.destPrefixListId = builder.destPrefixListId;
            this.destPrefixListName = builder.destPrefixListName;
            this.sourceCidrIp = builder.sourceCidrIp;
            this.ipv6DestCidrIp = builder.ipv6DestCidrIp;
            this.createTime = builder.createTime;
            this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
            this.destGroupId = builder.destGroupId;
            this.destCidrIp = builder.destCidrIp;
            this.ipProtocol = builder.ipProtocol;
            this.priority = builder.priority;
            this.destGroupName = builder.destGroupName;
            this.nicType = builder.nicType;
            this.policy = builder.policy;
            this.description = builder.description;
            this.portRange = builder.portRange;
            this.sourcePrefixListName = builder.sourcePrefixListName;
            this.sourcePrefixListId = builder.sourcePrefixListId;
            this.sourceGroupOwnerAccount = builder.sourceGroupOwnerAccount;
            this.sourceGroupName = builder.sourceGroupName;
            this.sourcePortRange = builder.sourcePortRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permission create() {
            return builder().build();
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return sourceGroupId
         */
        public String getSourceGroupId() {
            return this.sourceGroupId;
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
         * @return sourceCidrIp
         */
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        /**
         * @return ipv6DestCidrIp
         */
        public String getIpv6DestCidrIp() {
            return this.ipv6DestCidrIp;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return destGroupName
         */
        public String getDestGroupName() {
            return this.destGroupName;
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
         * @return sourcePrefixListName
         */
        public String getSourcePrefixListName() {
            return this.sourcePrefixListName;
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
         * @return sourceGroupName
         */
        public String getSourceGroupName() {
            return this.sourceGroupName;
        }

        /**
         * @return sourcePortRange
         */
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public static final class Builder {
            private String direction; 
            private String sourceGroupId; 
            private String destGroupOwnerAccount; 
            private String destPrefixListId; 
            private String destPrefixListName; 
            private String sourceCidrIp; 
            private String ipv6DestCidrIp; 
            private String createTime; 
            private String ipv6SourceCidrIp; 
            private String destGroupId; 
            private String destCidrIp; 
            private String ipProtocol; 
            private String priority; 
            private String destGroupName; 
            private String nicType; 
            private String policy; 
            private String description; 
            private String portRange; 
            private String sourcePrefixListName; 
            private String sourcePrefixListId; 
            private String sourceGroupOwnerAccount; 
            private String sourceGroupName; 
            private String sourcePortRange; 

            /**
             * The authorization direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * The source security group used for inbound authorization.
             */
            public Builder sourceGroupId(String sourceGroupId) {
                this.sourceGroupId = sourceGroupId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the destination security group belongs.
             */
            public Builder destGroupOwnerAccount(String destGroupOwnerAccount) {
                this.destGroupOwnerAccount = destGroupOwnerAccount;
                return this;
            }

            /**
             * The destination Prefix List ID, which is used for outbound authorization.
             */
            public Builder destPrefixListId(String destPrefixListId) {
                this.destPrefixListId = destPrefixListId;
                return this;
            }

            /**
             * The name of the destination Prefix List.
             */
            public Builder destPrefixListName(String destPrefixListName) {
                this.destPrefixListName = destPrefixListName;
                return this;
            }

            /**
             * The source IP address segment used for inbound authorization.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * The Destination IPv6 CIDR block.
             */
            public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
                this.ipv6DestCidrIp = ipv6DestCidrIp;
                return this;
            }

            /**
             * The creation time in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The source IPv6 CIDR block.
             */
            public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
                this.ipv6SourceCidrIp = ipv6SourceCidrIp;
                return this;
            }

            /**
             * The destination security group used for outbound authorization.
             */
            public Builder destGroupId(String destGroupId) {
                this.destGroupId = destGroupId;
                return this;
            }

            /**
             * The destination IP address segment used for outbound authorization.
             */
            public Builder destCidrIp(String destCidrIp) {
                this.destCidrIp = destCidrIp;
                return this;
            }

            /**
             * The IP protocol.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * The priority of the rule.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The name of the destination security group.
             */
            public Builder destGroupName(String destGroupName) {
                this.destGroupName = destGroupName;
                return this;
            }

            /**
             * The network type.
             */
            public Builder nicType(String nicType) {
                this.nicType = nicType;
                return this;
            }

            /**
             * The authorization policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The description of the security group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The port range.
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * The name of the source prefix list.
             */
            public Builder sourcePrefixListName(String sourcePrefixListName) {
                this.sourcePrefixListName = sourcePrefixListName;
                return this;
            }

            /**
             * The source Prefix List ID, which is used for inbound authorization.
             */
            public Builder sourcePrefixListId(String sourcePrefixListId) {
                this.sourcePrefixListId = sourcePrefixListId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the source Security Group belongs.
             */
            public Builder sourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
                this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
                return this;
            }

            /**
             * The name of the source security group.
             */
            public Builder sourceGroupName(String sourceGroupName) {
                this.sourceGroupName = sourceGroupName;
                return this;
            }

            /**
             * The range of source ports.
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
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
