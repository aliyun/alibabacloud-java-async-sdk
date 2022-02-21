// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VPCConfig} extends {@link TeaModel}
 *
 * <p>VPCConfig</p>
 */
public class VPCConfig extends TeaModel {
    @NameInMap("role")
    private String role;

    @NameInMap("securityGroupId")
    private String securityGroupId;

    @NameInMap("vSwitchIds")
    private java.util.List < String > vSwitchIds;

    @NameInMap("vpcId")
    private String vpcId;

    private VPCConfig(Builder builder) {
        this.role = builder.role;
        this.securityGroupId = builder.securityGroupId;
        this.vSwitchIds = builder.vSwitchIds;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VPCConfig create() {
        return builder().build();
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return vSwitchIds
     */
    public java.util.List < String > getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String role; 
        private String securityGroupId; 
        private java.util.List < String > vSwitchIds; 
        private String vpcId; 

        /**
         * Role
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * 安全组ID
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * VSwitch ID列表
         */
        public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * VPC ID
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public VPCConfig build() {
            return new VPCConfig(this);
        } 

    } 

}
