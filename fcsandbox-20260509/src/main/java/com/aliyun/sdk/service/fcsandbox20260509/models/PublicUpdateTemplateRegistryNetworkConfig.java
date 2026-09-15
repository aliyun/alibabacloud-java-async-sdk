// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link PublicUpdateTemplateRegistryNetworkConfig} extends {@link TeaModel}
 *
 * <p>PublicUpdateTemplateRegistryNetworkConfig</p>
 */
public class PublicUpdateTemplateRegistryNetworkConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("securityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("vSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    private PublicUpdateTemplateRegistryNetworkConfig(Builder builder) {
        this.securityGroupId = builder.securityGroupId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicUpdateTemplateRegistryNetworkConfig create() {
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

        private Builder(PublicUpdateTemplateRegistryNetworkConfig model) {
            this.securityGroupId = model.securityGroupId;
            this.vSwitchId = model.vSwitchId;
            this.vpcId = model.vpcId;
        } 

        /**
         * <p>The ID of the security group for repository access.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1abc123</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch where the repository resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1abc123</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the VPC where the repository resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1abc123</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public PublicUpdateTemplateRegistryNetworkConfig build() {
            return new PublicUpdateTemplateRegistryNetworkConfig(this);
        } 

    } 

}
