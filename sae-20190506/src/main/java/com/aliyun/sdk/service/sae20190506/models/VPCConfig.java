// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VPCConfig} extends {@link TeaModel}
 *
 * <p>VPCConfig</p>
 */
public class VPCConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("anytunnelViaENI")
    private Boolean anytunnelViaENI;

    @com.aliyun.core.annotation.NameInMap("role")
    @com.aliyun.core.annotation.Validation(maxLength = 300)
    private String role;

    @com.aliyun.core.annotation.NameInMap("securityGroupId")
    @com.aliyun.core.annotation.Validation(maxLength = 50)
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("vSwitchIds")
    private java.util.List < String > vSwitchIds;

    @com.aliyun.core.annotation.NameInMap("vpcId")
    @com.aliyun.core.annotation.Validation(maxLength = 50)
    private String vpcId;

    private VPCConfig(Builder builder) {
        this.anytunnelViaENI = builder.anytunnelViaENI;
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
     * @return anytunnelViaENI
     */
    public Boolean getAnytunnelViaENI() {
        return this.anytunnelViaENI;
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
        private Boolean anytunnelViaENI; 
        private String role; 
        private String securityGroupId; 
        private java.util.List < String > vSwitchIds; 
        private String vpcId; 

        /**
         * anytunnelViaENI.
         */
        public Builder anytunnelViaENI(Boolean anytunnelViaENI) {
            this.anytunnelViaENI = anytunnelViaENI;
            return this;
        }

        /**
         * role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * securityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * vSwitchIds.
         */
        public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * vpcId.
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
