// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVpcEndpointRequest} extends {@link RequestModel}
 *
 * <p>DeleteVpcEndpointRequest</p>
 */
public class DeleteVpcEndpointRequest extends Request {
    @Query
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Query
    @NameInMap("VpcEndpointId")
    @Validation(required = true)
    private String vpcEndpointId;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    private DeleteVpcEndpointRequest(Builder builder) {
        super(builder);
        this.ledgerId = builder.ledgerId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcEndpointId = builder.vpcEndpointId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVpcEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ledgerId
     */
    public String getLedgerId() {
        return this.ledgerId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcEndpointId
     */
    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DeleteVpcEndpointRequest, Builder> {
        private String ledgerId; 
        private String vSwitchId; 
        private String vpcEndpointId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVpcEndpointRequest response) {
            super(response);
            this.ledgerId = response.ledgerId;
            this.vSwitchId = response.vSwitchId;
            this.vpcEndpointId = response.vpcEndpointId;
            this.vpcId = response.vpcId;
        } 

        /**
         * LedgerId.
         */
        public Builder ledgerId(String ledgerId) {
            this.putQueryParameter("LedgerId", ledgerId);
            this.ledgerId = ledgerId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcEndpointId.
         */
        public Builder vpcEndpointId(String vpcEndpointId) {
            this.putQueryParameter("VpcEndpointId", vpcEndpointId);
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DeleteVpcEndpointRequest build() {
            return new DeleteVpcEndpointRequest(this);
        } 

    } 

}
