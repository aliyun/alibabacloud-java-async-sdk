// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCSecurityGroupPermissionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCSecurityGroupPermissionResponseBody</p>
 */
public class DescribeRCSecurityGroupPermissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InnerAccessPolicy")
    private String innerAccessPolicy;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupPermissions")
    private java.util.List<SecurityGroupPermissions> securityGroupPermissions;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribeRCSecurityGroupPermissionResponseBody(Builder builder) {
        this.innerAccessPolicy = builder.innerAccessPolicy;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupPermissions = builder.securityGroupPermissions;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCSecurityGroupPermissionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return innerAccessPolicy
     */
    public String getInnerAccessPolicy() {
        return this.innerAccessPolicy;
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
     * @return securityGroupPermissions
     */
    public java.util.List<SecurityGroupPermissions> getSecurityGroupPermissions() {
        return this.securityGroupPermissions;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String innerAccessPolicy; 
        private String regionId; 
        private String requestId; 
        private String securityGroupId; 
        private java.util.List<SecurityGroupPermissions> securityGroupPermissions; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(DescribeRCSecurityGroupPermissionResponseBody model) {
            this.innerAccessPolicy = model.innerAccessPolicy;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.securityGroupId = model.securityGroupId;
            this.securityGroupPermissions = model.securityGroupPermissions;
            this.vpcId = model.vpcId;
        } 

        /**
         * InnerAccessPolicy.
         */
        public Builder innerAccessPolicy(String innerAccessPolicy) {
            this.innerAccessPolicy = innerAccessPolicy;
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
         * SecurityGroupPermissions.
         */
        public Builder securityGroupPermissions(java.util.List<SecurityGroupPermissions> securityGroupPermissions) {
            this.securityGroupPermissions = securityGroupPermissions;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribeRCSecurityGroupPermissionResponseBody build() {
            return new DescribeRCSecurityGroupPermissionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCSecurityGroupPermissionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCSecurityGroupPermissionResponseBody</p>
     */
    public static class SecurityGroupPermissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DestCidrIp")
        private String destCidrIp;

        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("PortRange")
        private String portRange;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupRuleId")
        private String securityGroupRuleId;

        @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @com.aliyun.core.annotation.NameInMap("SourcePortRange")
        private String sourcePortRange;

        private SecurityGroupPermissions(Builder builder) {
            this.createTime = builder.createTime;
            this.destCidrIp = builder.destCidrIp;
            this.direction = builder.direction;
            this.ipProtocol = builder.ipProtocol;
            this.policy = builder.policy;
            this.portRange = builder.portRange;
            this.priority = builder.priority;
            this.securityGroupRuleId = builder.securityGroupRuleId;
            this.sourceCidrIp = builder.sourceCidrIp;
            this.sourcePortRange = builder.sourcePortRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupPermissions create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return destCidrIp
         */
        public String getDestCidrIp() {
            return this.destCidrIp;
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
         * @return sourcePortRange
         */
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public static final class Builder {
            private String createTime; 
            private String destCidrIp; 
            private String direction; 
            private String ipProtocol; 
            private String policy; 
            private String portRange; 
            private String priority; 
            private String securityGroupRuleId; 
            private String sourceCidrIp; 
            private String sourcePortRange; 

            private Builder() {
            } 

            private Builder(SecurityGroupPermissions model) {
                this.createTime = model.createTime;
                this.destCidrIp = model.destCidrIp;
                this.direction = model.direction;
                this.ipProtocol = model.ipProtocol;
                this.policy = model.policy;
                this.portRange = model.portRange;
                this.priority = model.priority;
                this.securityGroupRuleId = model.securityGroupRuleId;
                this.sourceCidrIp = model.sourceCidrIp;
                this.sourcePortRange = model.sourcePortRange;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * SecurityGroupRuleId.
             */
            public Builder securityGroupRuleId(String securityGroupRuleId) {
                this.securityGroupRuleId = securityGroupRuleId;
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
             * SourcePortRange.
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            public SecurityGroupPermissions build() {
                return new SecurityGroupPermissions(this);
            } 

        } 

    }
}
