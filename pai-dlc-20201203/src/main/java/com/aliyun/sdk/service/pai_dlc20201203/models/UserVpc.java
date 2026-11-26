// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link UserVpc} extends {@link TeaModel}
 *
 * <p>UserVpc</p>
 */
public class UserVpc extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultRoute")
    private String defaultRoute;

    @com.aliyun.core.annotation.NameInMap("ExtendedCIDRs")
    private java.util.List<String> extendedCIDRs;

    @com.aliyun.core.annotation.NameInMap("RoleChain")
    private String roleChain;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("SwitchId")
    private String switchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private UserVpc(Builder builder) {
        this.defaultRoute = builder.defaultRoute;
        this.extendedCIDRs = builder.extendedCIDRs;
        this.roleChain = builder.roleChain;
        this.securityGroupId = builder.securityGroupId;
        this.switchId = builder.switchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserVpc create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultRoute
     */
    public String getDefaultRoute() {
        return this.defaultRoute;
    }

    /**
     * @return extendedCIDRs
     */
    public java.util.List<String> getExtendedCIDRs() {
        return this.extendedCIDRs;
    }

    /**
     * @return roleChain
     */
    public String getRoleChain() {
        return this.roleChain;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return switchId
     */
    public String getSwitchId() {
        return this.switchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String defaultRoute; 
        private java.util.List<String> extendedCIDRs; 
        private String roleChain; 
        private String securityGroupId; 
        private String switchId; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(UserVpc model) {
            this.defaultRoute = model.defaultRoute;
            this.extendedCIDRs = model.extendedCIDRs;
            this.roleChain = model.roleChain;
            this.securityGroupId = model.securityGroupId;
            this.switchId = model.switchId;
            this.vpcId = model.vpcId;
        } 

        /**
         * <p>The default route configuration. Valid values: eth0 and eth1. Currently, this parameter is used only in general-purpose computing 1.0 scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>eth1</p>
         */
        public Builder defaultRoute(String defaultRoute) {
            this.defaultRoute = defaultRoute;
            return this;
        }

        /**
         * <p>The secondary CIDR block (route configuration).</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *   &quot;192.168.0.0/24&quot;,
         *   &quot;192.168.1.0/24&quot;
         * ]</p>
         */
        public Builder extendedCIDRs(java.util.List<String> extendedCIDRs) {
            this.extendedCIDRs = extendedCIDRs;
            return this;
        }

        /**
         * <p>The role chain configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *   {
         *     &quot;roleType&quot;:&quot;service&quot;,
         *     &quot;roleArn&quot;:&quot;acs:ram::service account UID:role/roletoassumecustomerrole&quot;,
         *     &quot;assumeRoleFor&quot;: &quot;service account UID&quot;
         *   },
         *   {
         *     &quot;roleType&quot;:&quot;service&quot;,
         *     &quot;roleArn&quot;:&quot;acs:ram::end user UID:role/user-role&quot;,
         *     &quot;assumeRoleFor&quot;:&quot;end user UID&quot;
         *   }
         * ]</p>
         */
        public Builder roleChain(String roleChain) {
            this.roleChain = roleChain;
            return this;
        }

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxx</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>vSwitch ID</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxx</p>
         */
        public Builder switchId(String switchId) {
            this.switchId = switchId;
            return this;
        }

        /**
         * <p>Vpc ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxx</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public UserVpc build() {
            return new UserVpc(this);
        } 

    } 

}
