// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActivateAllInOneGatewayRequest} extends {@link RequestModel}
 *
 * <p>ActivateAllInOneGatewayRequest</p>
 */
public class ActivateAllInOneGatewayRequest extends Request {
    @Query
    @NameInMap("ClientUUID")
    private String clientUUID;

    @Query
    @NameInMap("DeviceNumber")
    private String deviceNumber;

    @Query
    @NameInMap("GatewayId")
    private String gatewayId;

    @Query
    @NameInMap("Model")
    private String model;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SerialNumber")
    @Validation(required = true)
    private String serialNumber;

    private ActivateAllInOneGatewayRequest(Builder builder) {
        super(builder);
        this.clientUUID = builder.clientUUID;
        this.deviceNumber = builder.deviceNumber;
        this.gatewayId = builder.gatewayId;
        this.model = builder.model;
        this.securityToken = builder.securityToken;
        this.serialNumber = builder.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActivateAllInOneGatewayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientUUID
     */
    public String getClientUUID() {
        return this.clientUUID;
    }

    /**
     * @return deviceNumber
     */
    public String getDeviceNumber() {
        return this.deviceNumber;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public static final class Builder extends Request.Builder<ActivateAllInOneGatewayRequest, Builder> {
        private String clientUUID; 
        private String deviceNumber; 
        private String gatewayId; 
        private String model; 
        private String securityToken; 
        private String serialNumber; 

        private Builder() {
            super();
        } 

        private Builder(ActivateAllInOneGatewayRequest request) {
            super(request);
            this.clientUUID = request.clientUUID;
            this.deviceNumber = request.deviceNumber;
            this.gatewayId = request.gatewayId;
            this.model = request.model;
            this.securityToken = request.securityToken;
            this.serialNumber = request.serialNumber;
        } 

        /**
         * ClientUUID.
         */
        public Builder clientUUID(String clientUUID) {
            this.putQueryParameter("ClientUUID", clientUUID);
            this.clientUUID = clientUUID;
            return this;
        }

        /**
         * DeviceNumber.
         */
        public Builder deviceNumber(String deviceNumber) {
            this.putQueryParameter("DeviceNumber", deviceNumber);
            this.deviceNumber = deviceNumber;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * SerialNumber.
         */
        public Builder serialNumber(String serialNumber) {
            this.putQueryParameter("SerialNumber", serialNumber);
            this.serialNumber = serialNumber;
            return this;
        }

        @Override
        public ActivateAllInOneGatewayRequest build() {
            return new ActivateAllInOneGatewayRequest(this);
        } 

    } 

}
