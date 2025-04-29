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
 * {@link DescribeSecurityGroupAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityGroupAttributeResponseBody</p>
 */
public class DescribeSecurityGroupAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("InnerAccessPolicy")
    private String innerAccessPolicy;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Permissions")
    private Permissions permissions;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
    private String securityGroupName;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribeSecurityGroupAttributeResponseBody(Builder builder) {
        this.description = builder.description;
        this.innerAccessPolicy = builder.innerAccessPolicy;
        this.nextToken = builder.nextToken;
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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private String nextToken; 
        private Permissions permissions; 
        private String regionId; 
        private String requestId; 
        private String securityGroupId; 
        private String securityGroupName; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(DescribeSecurityGroupAttributeResponseBody model) {
            this.description = model.description;
            this.innerAccessPolicy = model.innerAccessPolicy;
            this.nextToken = model.nextToken;
            this.permissions = model.permissions;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.securityGroupId = model.securityGroupId;
            this.securityGroupName = model.securityGroupName;
            this.vpcId = model.vpcId;
        } 

        /**
         * <p>The description of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The access control policy of the security group. Valid values:</p>
         * <ul>
         * <li>Accept: All instances in the security group can communicate with each other.</li>
         * <li>Drop: All instances in the security group are isolated from each other.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Accept</p>
         */
        public Builder innerAccessPolicy(String innerAccessPolicy) {
            this.innerAccessPolicy = innerAccessPolicy;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If the return value of this parameter is empty when you specify <code>MaxResults</code> and <code>NextToken</code> for a paged query, no more results are to be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Details about the security group rules.</p>
         */
        public Builder permissions(Permissions permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1gxw6bznjjvhu3****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The name of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>SecurityGroupName Sample</p>
         */
        public Builder securityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * <p>The ID of the VPC. If a VPC ID is returned, the network type of the security group is VPC. If no VPC ID is returned, the network type of the security group is classic network.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1opxu1zkhn00gzv****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribeSecurityGroupAttributeResponseBody build() {
            return new DescribeSecurityGroupAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupAttributeResponseBody</p>
     */
    public static class Permission extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestCidrIp")
        private String destCidrIp;

        @com.aliyun.core.annotation.NameInMap("DestGroupId")
        private String destGroupId;

        @com.aliyun.core.annotation.NameInMap("DestGroupName")
        private String destGroupName;

        @com.aliyun.core.annotation.NameInMap("DestGroupOwnerAccount")
        private String destGroupOwnerAccount;

        @com.aliyun.core.annotation.NameInMap("DestPrefixListId")
        private String destPrefixListId;

        @com.aliyun.core.annotation.NameInMap("DestPrefixListName")
        private String destPrefixListName;

        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

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

        @com.aliyun.core.annotation.NameInMap("PortRangeListName")
        private String portRangeListName;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupRuleId")
        private String securityGroupRuleId;

        @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @com.aliyun.core.annotation.NameInMap("SourceGroupId")
        private String sourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SourceGroupName")
        private String sourceGroupName;

        @com.aliyun.core.annotation.NameInMap("SourceGroupOwnerAccount")
        private String sourceGroupOwnerAccount;

        @com.aliyun.core.annotation.NameInMap("SourcePortRange")
        private String sourcePortRange;

        @com.aliyun.core.annotation.NameInMap("SourcePrefixListId")
        private String sourcePrefixListId;

        @com.aliyun.core.annotation.NameInMap("SourcePrefixListName")
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
            this.portRangeListId = builder.portRangeListId;
            this.portRangeListName = builder.portRangeListName;
            this.priority = builder.priority;
            this.securityGroupRuleId = builder.securityGroupRuleId;
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
         * @return portRangeListId
         */
        public String getPortRangeListId() {
            return this.portRangeListId;
        }

        /**
         * @return portRangeListName
         */
        public String getPortRangeListName() {
            return this.portRangeListName;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return securityGroupRuleId
         */
        public String getSecurityGroupRuleId() {
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
            private String portRangeListId; 
            private String portRangeListName; 
            private String priority; 
            private String securityGroupRuleId; 
            private String sourceCidrIp; 
            private String sourceGroupId; 
            private String sourceGroupName; 
            private String sourceGroupOwnerAccount; 
            private String sourcePortRange; 
            private String sourcePrefixListId; 
            private String sourcePrefixListName; 

            private Builder() {
            } 

            private Builder(Permission model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.destCidrIp = model.destCidrIp;
                this.destGroupId = model.destGroupId;
                this.destGroupName = model.destGroupName;
                this.destGroupOwnerAccount = model.destGroupOwnerAccount;
                this.destPrefixListId = model.destPrefixListId;
                this.destPrefixListName = model.destPrefixListName;
                this.direction = model.direction;
                this.ipProtocol = model.ipProtocol;
                this.ipv6DestCidrIp = model.ipv6DestCidrIp;
                this.ipv6SourceCidrIp = model.ipv6SourceCidrIp;
                this.nicType = model.nicType;
                this.policy = model.policy;
                this.portRange = model.portRange;
                this.portRangeListId = model.portRangeListId;
                this.portRangeListName = model.portRangeListName;
                this.priority = model.priority;
                this.securityGroupRuleId = model.securityGroupRuleId;
                this.sourceCidrIp = model.sourceCidrIp;
                this.sourceGroupId = model.sourceGroupId;
                this.sourceGroupName = model.sourceGroupName;
                this.sourceGroupOwnerAccount = model.sourceGroupOwnerAccount;
                this.sourcePortRange = model.sourcePortRange;
                this.sourcePrefixListId = model.sourcePrefixListId;
                this.sourcePrefixListName = model.sourcePrefixListName;
            } 

            /**
             * <p>The time when the security group rule was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-12T07:28:38Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>Description Sample 01</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination CIDR block for outbound access control.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder destCidrIp(String destCidrIp) {
                this.destCidrIp = destCidrIp;
                return this;
            }

            /**
             * <p>The ID of the destination security group for outbound access control.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp1czdx84jd88i7v****</p>
             */
            public Builder destGroupId(String destGroupId) {
                this.destGroupId = destGroupId;
                return this;
            }

            /**
             * <p>The name of the destination security group.</p>
             * 
             * <strong>example:</strong>
             * <p>testDestGroupName</p>
             */
            public Builder destGroupName(String destGroupName) {
                this.destGroupName = destGroupName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the destination security group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
             */
            public Builder destGroupOwnerAccount(String destGroupOwnerAccount) {
                this.destGroupOwnerAccount = destGroupOwnerAccount;
                return this;
            }

            /**
             * <p>The ID of the destination prefix list for outbound access control.</p>
             * 
             * <strong>example:</strong>
             * <p>pl-x1j1k5ykzqlixabc****</p>
             */
            public Builder destPrefixListId(String destPrefixListId) {
                this.destPrefixListId = destPrefixListId;
                return this;
            }

            /**
             * <p>The name of the destination prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>DestPrefixListName Sample</p>
             */
            public Builder destPrefixListName(String destPrefixListName) {
                this.destPrefixListName = destPrefixListName;
                return this;
            }

            /**
             * <p>The direction in which the security group rule is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>ingress</p>
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>The transport layer protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The destination IPv6 CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>2001:db8:1233:1a00::***</p>
             */
            public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
                this.ipv6DestCidrIp = ipv6DestCidrIp;
                return this;
            }

            /**
             * <p>The source IPv6 CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>2001:db8:1234:1a00::***</p>
             */
            public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
                this.ipv6SourceCidrIp = ipv6SourceCidrIp;
                return this;
            }

            /**
             * <p>The network type.</p>
             * 
             * <strong>example:</strong>
             * <p>intranet</p>
             */
            public Builder nicType(String nicType) {
                this.nicType = nicType;
                return this;
            }

            /**
             * <p>The access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Accept</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The port range.</p>
             * 
             * <strong>example:</strong>
             * <p>80/80</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * <p>The ID of the port list.</p>
             * 
             * <strong>example:</strong>
             * <p>prl-2ze9743****</p>
             */
            public Builder portRangeListId(String portRangeListId) {
                this.portRangeListId = portRangeListId;
                return this;
            }

            /**
             * <p>The name of the port list.</p>
             * 
             * <strong>example:</strong>
             * <p>PortRangeListNameSample</p>
             */
            public Builder portRangeListName(String portRangeListName) {
                this.portRangeListName = portRangeListName;
                return this;
            }

            /**
             * <p>The priority of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the security group rule.</p>
             * 
             * <strong>example:</strong>
             * <p>sgr-bp12kewq32dfwrdi****</p>
             */
            public Builder securityGroupRuleId(String securityGroupRuleId) {
                this.securityGroupRuleId = securityGroupRuleId;
                return this;
            }

            /**
             * <p>The source CIDR block for inbound access control.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * <p>The source security group for inbound access control.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp12kc4rqohaf2js****</p>
             */
            public Builder sourceGroupId(String sourceGroupId) {
                this.sourceGroupId = sourceGroupId;
                return this;
            }

            /**
             * <p>The name of the source security group.</p>
             * 
             * <strong>example:</strong>
             * <p>testSourceGroupName1</p>
             */
            public Builder sourceGroupName(String sourceGroupName) {
                this.sourceGroupName = sourceGroupName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the source security group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
             */
            public Builder sourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
                this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
                return this;
            }

            /**
             * <p>The source port range.</p>
             * 
             * <strong>example:</strong>
             * <p>80/80</p>
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            /**
             * <p>The ID of the source prefix list for inbound access control.</p>
             * 
             * <strong>example:</strong>
             * <p>pl-x1j1k5ykzqlixdcy****</p>
             */
            public Builder sourcePrefixListId(String sourcePrefixListId) {
                this.sourcePrefixListId = sourcePrefixListId;
                return this;
            }

            /**
             * <p>The name of the source prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>SourcePrefixListName Sample</p>
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
    /**
     * 
     * {@link DescribeSecurityGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupAttributeResponseBody</p>
     */
    public static class Permissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Permission")
        private java.util.List<Permission> permission;

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
        public java.util.List<Permission> getPermission() {
            return this.permission;
        }

        public static final class Builder {
            private java.util.List<Permission> permission; 

            private Builder() {
            } 

            private Builder(Permissions model) {
                this.permission = model.permission;
            } 

            /**
             * Permission.
             */
            public Builder permission(java.util.List<Permission> permission) {
                this.permission = permission;
                return this;
            }

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
}
