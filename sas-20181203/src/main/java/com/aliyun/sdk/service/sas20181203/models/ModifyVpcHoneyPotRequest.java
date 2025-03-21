// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyVpcHoneyPotRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpcHoneyPotRequest</p>
 */
public class ModifyVpcHoneyPotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneyPotAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String honeyPotAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private ModifyVpcHoneyPotRequest(Builder builder) {
        super(builder);
        this.honeyPotAction = builder.honeyPotAction;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcHoneyPotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return honeyPotAction
     */
    public String getHoneyPotAction() {
        return this.honeyPotAction;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ModifyVpcHoneyPotRequest, Builder> {
        private String honeyPotAction; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVpcHoneyPotRequest request) {
            super(request);
            this.honeyPotAction = request.honeyPotAction;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>Specifies whether to enable or disable the honeypot. Valid values:</p>
         * <ul>
         * <li><strong>disable</strong></li>
         * <li><strong>enable</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        public Builder honeyPotAction(String honeyPotAction) {
            this.putQueryParameter("HoneyPotAction", honeyPotAction);
            this.honeyPotAction = honeyPotAction;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) on which the honeypot is deployed.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeVpcHoneyPotList~~">DescribeVpcHoneyPotList</a> operation to query the IDs of VPCs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-d7o009q63fqy21r8u****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ModifyVpcHoneyPotRequest build() {
            return new ModifyVpcHoneyPotRequest(this);
        } 

    } 

}
