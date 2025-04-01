// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DeleteNatGatewayRequest} extends {@link RequestModel}
 *
 * <p>DeleteNatGatewayRequest</p>
 */
public class DeleteNatGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceDelete")
    private Boolean forceDelete;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String natGatewayId;

    private DeleteNatGatewayRequest(Builder builder) {
        super(builder);
        this.forceDelete = builder.forceDelete;
        this.natGatewayId = builder.natGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNatGatewayRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forceDelete
     */
    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public static final class Builder extends Request.Builder<DeleteNatGatewayRequest, Builder> {
        private Boolean forceDelete; 
        private String natGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNatGatewayRequest request) {
            super(request);
            this.forceDelete = request.forceDelete;
            this.natGatewayId = request.natGatewayId;
        } 

        /**
         * <p>Specifies whether to forcefully delete the VPC. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong> (default): no</li>
         * </ul>
         * <p>You can forcefully delete a VPC in the following scenarios:</p>
         * <ul>
         * <li>Only an IPv4 gateway and routes that point to the IPv4 gateway exist in the VPC.</li>
         * <li>Only an IPv6 gateway and routes that point to the IPv6 gateway exist in the VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder forceDelete(Boolean forceDelete) {
            this.putQueryParameter("ForceDelete", forceDelete);
            this.forceDelete = forceDelete;
            return this;
        }

        /**
         * <p>The ID of the NAT gateway that you want to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nat-5t7nh1cfm6kxiszlttr38****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        @Override
        public DeleteNatGatewayRequest build() {
            return new DeleteNatGatewayRequest(this);
        } 

    } 

}
