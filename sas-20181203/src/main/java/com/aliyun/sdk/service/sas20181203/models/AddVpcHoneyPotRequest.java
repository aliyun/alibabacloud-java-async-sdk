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
 * {@link AddVpcHoneyPotRequest} extends {@link RequestModel}
 *
 * <p>AddVpcHoneyPotRequest</p>
 */
public class AddVpcHoneyPotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private AddVpcHoneyPotRequest(Builder builder) {
        super(builder);
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVpcHoneyPotRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<AddVpcHoneyPotRequest, Builder> {
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(AddVpcHoneyPotRequest request) {
            super(request);
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The ID of the virtual private cloud (VPC) in which you want to create a honeypot.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeVpcList~~">DescribeVpcList</a> operation to obtain the VPC ID. The VPC ID is the value of the InstanceId parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-p0w5fgkfsl5a6791q****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public AddVpcHoneyPotRequest build() {
            return new AddVpcHoneyPotRequest(this);
        } 

    } 

}
