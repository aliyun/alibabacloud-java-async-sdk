// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private UserVpc(Builder builder) {
        this.securityGroupId = builder.securityGroupId;
        this.vSwitchId = builder.vSwitchId;
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
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String securityGroupId; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(UserVpc model) {
            this.securityGroupId = model.securityGroupId;
            this.vSwitchId = model.vSwitchId;
            this.vpcId = model.vpcId;
        } 

        /**
         * <p>用户安全组的ID</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>用户交换机的ID</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>用户VPC的ID</p>
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
