// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewayServiceVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteGatewayServiceVersionRequest</p>
 */
public class DeleteGatewayServiceVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayServiceId")
    private String gatewayServiceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private DeleteGatewayServiceVersionRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.gatewayServiceId = builder.gatewayServiceId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewayServiceVersionRequest create() {
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

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DeleteGatewayServiceVersionRequest, Builder> {
        private String gatewayId; 
        private String gatewayServiceId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGatewayServiceVersionRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.gatewayServiceId = request.gatewayServiceId;
            this.name = request.name;
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

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteGatewayServiceVersionRequest build() {
            return new DeleteGatewayServiceVersionRequest(this);
        } 

    } 

}
