// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceSourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceSourceRequest</p>
 */
public class DeleteServiceSourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("serviceSourceId")
    private String serviceSourceId;

    private DeleteServiceSourceRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.serviceSourceId = builder.serviceSourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceSourceRequest create() {
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
     * @return serviceSourceId
     */
    public String getServiceSourceId() {
        return this.serviceSourceId;
    }

    public static final class Builder extends Request.Builder<DeleteServiceSourceRequest, Builder> {
        private String gatewayId; 
        private String serviceSourceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceSourceRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.serviceSourceId = request.serviceSourceId;
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
         * serviceSourceId.
         */
        public Builder serviceSourceId(String serviceSourceId) {
            this.putPathParameter("serviceSourceId", serviceSourceId);
            this.serviceSourceId = serviceSourceId;
            return this;
        }

        @Override
        public DeleteServiceSourceRequest build() {
            return new DeleteServiceSourceRequest(this);
        } 

    } 

}
