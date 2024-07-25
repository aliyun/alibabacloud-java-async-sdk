// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayServiceRequest</p>
 */
public class UpdateGatewayServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayServiceId")
    private String gatewayServiceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("addresses")
    private java.util.List < String > addresses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("port")
    private Integer port;

    private UpdateGatewayServiceRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.gatewayServiceId = builder.gatewayServiceId;
        this.addresses = builder.addresses;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayServiceRequest create() {
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
     * @return addresses
     */
    public java.util.List < String > getAddresses() {
        return this.addresses;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayServiceRequest, Builder> {
        private String gatewayId; 
        private String gatewayServiceId; 
        private java.util.List < String > addresses; 
        private Integer port; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayServiceRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.gatewayServiceId = request.gatewayServiceId;
            this.addresses = request.addresses;
            this.port = request.port;
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
         * addresses.
         */
        public Builder addresses(java.util.List < String > addresses) {
            this.putBodyParameter("addresses", addresses);
            this.addresses = addresses;
            return this;
        }

        /**
         * port.
         */
        public Builder port(Integer port) {
            this.putBodyParameter("port", port);
            this.port = port;
            return this;
        }

        @Override
        public UpdateGatewayServiceRequest build() {
            return new UpdateGatewayServiceRequest(this);
        } 

    } 

}
