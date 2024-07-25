// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewayServiceRequest} extends {@link RequestModel}
 *
 * <p>DeleteGatewayServiceRequest</p>
 */
public class DeleteGatewayServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayServiceId")
    private String gatewayServiceId;

    private DeleteGatewayServiceRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.gatewayServiceId = builder.gatewayServiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewayServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayServiceId
     */
    public String getGatewayServiceId() {
        return this.gatewayServiceId;
    }

    public static final class Builder extends Request.Builder<DeleteGatewayServiceRequest, Builder> {
        private String gatewayId; 
        private String gatewayServiceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGatewayServiceRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.gatewayServiceId = request.gatewayServiceId;
        } 

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * gatewayServiceId.
         */
        public Builder gatewayServiceId(String gatewayServiceId) {
            this.putPathParameter("gatewayServiceId", gatewayServiceId);
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }

        @Override
        public DeleteGatewayServiceRequest build() {
            return new DeleteGatewayServiceRequest(this);
        } 

    } 

}
