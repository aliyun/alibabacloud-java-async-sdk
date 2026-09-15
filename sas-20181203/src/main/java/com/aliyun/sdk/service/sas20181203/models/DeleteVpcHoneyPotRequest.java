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
 * {@link DeleteVpcHoneyPotRequest} extends {@link RequestModel}
 *
 * <p>DeleteVpcHoneyPotRequest</p>
 */
public class DeleteVpcHoneyPotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private DeleteVpcHoneyPotRequest(Builder builder) {
        super(builder);
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVpcHoneyPotRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteVpcHoneyPotRequest, Builder> {
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVpcHoneyPotRequest request) {
            super(request);
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The VPC ID of the honeypot instance that you want to delete.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeVpcHoneyPotList~~">DescribeVpcHoneyPotList</a> operation to obtain the VPC ID of the honeypot instance.</p>
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
        public DeleteVpcHoneyPotRequest build() {
            return new DeleteVpcHoneyPotRequest(this);
        } 

    } 

}
