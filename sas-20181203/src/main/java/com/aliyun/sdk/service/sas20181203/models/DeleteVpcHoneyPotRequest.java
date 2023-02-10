// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVpcHoneyPotRequest} extends {@link RequestModel}
 *
 * <p>DeleteVpcHoneyPotRequest</p>
 */
public class DeleteVpcHoneyPotRequest extends Request {
    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
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
         * The ID of the virtual private cloud (VPC) on which the honeypot is deployed.
         * <p>
         * 
         * > You can call the [DescribeVpcHoneyPotList](~~DescribeVpcHoneyPotList~~) operation to query the IDs of VPCs.
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
