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
 * {@link PublicTemplateVPCConfig} extends {@link TeaModel}
 *
 * <p>PublicTemplateVPCConfig</p>
 */
public class PublicTemplateVPCConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("securityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("vSwitchIds")
    private java.util.List<String> vSwitchIds;

    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    private PublicTemplateVPCConfig(Builder builder) {
        this.role = builder.role;
        this.securityGroupId = builder.securityGroupId;
        this.vSwitchIds = builder.vSwitchIds;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicTemplateVPCConfig create() {
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
        private String role; 
        private String securityGroupId; 
        private java.util.List<String> vSwitchIds; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(PublicTemplateVPCConfig model) {
            this.role = model.role;
            this.securityGroupId = model.securityGroupId;
            this.vSwitchIds = model.vSwitchIds;
            this.vpcId = model.vpcId;
        } 

        /**
         * <p>The ARN of the RAM role that the sandbox instance assumes when accessing the VPC. The format is acs:ram::{account ID}:role/{role name}.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890123456:role/aliyunfcdefaultrole</p>
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * <p>The ID of the security group used by the sandbox instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The list of vSwitch IDs that the sandbox instance connects to.</p>
         */
        public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>The ID of the VPC that the sandbox instance connects to.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public PublicTemplateVPCConfig build() {
            return new PublicTemplateVPCConfig(this);
        } 

    } 

}
