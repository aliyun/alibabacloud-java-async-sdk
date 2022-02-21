// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGatewaySlbRequest} extends {@link RequestModel}
 *
 * <p>AddGatewaySlbRequest</p>
 */
public class AddGatewaySlbRequest extends Request {
    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("SlbId")
    private String slbId;

    @Query
    @NameInMap("Type")
    private String type;

    private AddGatewaySlbRequest(Builder builder) {
        super(builder);
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.slbId = builder.slbId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGatewaySlbRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return slbId
     */
    public String getSlbId() {
        return this.slbId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AddGatewaySlbRequest, Builder> {
        private String gatewayUniqueId; 
        private String slbId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AddGatewaySlbRequest response) {
            super(response);
            this.gatewayUniqueId = response.gatewayUniqueId;
            this.slbId = response.slbId;
            this.type = response.type;
        } 

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * SlbId.
         */
        public Builder slbId(String slbId) {
            this.putQueryParameter("SlbId", slbId);
            this.slbId = slbId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AddGatewaySlbRequest build() {
            return new AddGatewaySlbRequest(this);
        } 

    } 

}
