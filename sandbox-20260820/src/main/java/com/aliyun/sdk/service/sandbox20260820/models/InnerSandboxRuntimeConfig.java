// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link InnerSandboxRuntimeConfig} extends {@link TeaModel}
 *
 * <p>InnerSandboxRuntimeConfig</p>
 */
public class InnerSandboxRuntimeConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("vpcConfig")
    private VpcConfig vpcConfig;

    private InnerSandboxRuntimeConfig(Builder builder) {
        this.role = builder.role;
        this.vpcConfig = builder.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InnerSandboxRuntimeConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return vpcConfig
     */
    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static final class Builder {
        private String role; 
        private VpcConfig vpcConfig; 

        private Builder() {
        } 

        private Builder(InnerSandboxRuntimeConfig model) {
            this.role = model.role;
            this.vpcConfig = model.vpcConfig;
        } 

        /**
         * <p>The RAM role that grants the required permissions to the sandbox.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::xxxx:role/xxx_role</p>
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * <p>The VPC configuration.</p>
         */
        public Builder vpcConfig(VpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public InnerSandboxRuntimeConfig build() {
            return new InnerSandboxRuntimeConfig(this);
        } 

    } 

    /**
     * 
     * {@link InnerSandboxRuntimeConfig} extends {@link TeaModel}
     *
     * <p>InnerSandboxRuntimeConfig</p>
     */
    public static class VpcConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("vSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private VpcConfig(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcConfig create() {
            return builder().build();
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
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String securityGroupId; 
            private java.util.List<String> vSwitchIds; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(VpcConfig model) {
                this.securityGroupId = model.securityGroupId;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-xxxx</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The vSwitch IDs.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VpcConfig build() {
                return new VpcConfig(this);
            } 

        } 

    }
}
