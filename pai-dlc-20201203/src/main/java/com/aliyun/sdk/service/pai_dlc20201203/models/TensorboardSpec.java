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
 * {@link TensorboardSpec} extends {@link TeaModel}
 *
 * <p>TensorboardSpec</p>
 */
public class TensorboardSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EcsType")
    private String ecsType;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("SwitchId")
    private String switchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private TensorboardSpec(Builder builder) {
        this.ecsType = builder.ecsType;
        this.securityGroupId = builder.securityGroupId;
        this.switchId = builder.switchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TensorboardSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ecsType
     */
    public String getEcsType() {
        return this.ecsType;
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
        private String ecsType; 
        private String securityGroupId; 
        private String switchId; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(TensorboardSpec model) {
            this.ecsType = model.ecsType;
            this.securityGroupId = model.securityGroupId;
            this.switchId = model.switchId;
            this.vpcId = model.vpcId;
        } 

        /**
         * <p>The specifications of the ECS instance configured for the pay-as-you-go Tensorboard task.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        public Builder ecsType(String ecsType) {
            this.ecsType = ecsType;
            return this;
        }

        /**
         * <p>The ID of the security group configured for the pay-as-you-go Tensorboard task.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxxxx</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch configured for the pay-as-you-go Tensorboard task.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxx</p>
         */
        public Builder switchId(String switchId) {
            this.switchId = switchId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) configured for the pay-as-you-go Tensorboard task.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxx</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public TensorboardSpec build() {
            return new TensorboardSpec(this);
        } 

    } 

}
