// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link ConfigureNatGatewayRequest} extends {@link RequestModel}
 *
 * <p>ConfigureNatGatewayRequest</p>
 */
public class ConfigureNatGatewayRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipAllocationId")
    private String eipAllocationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipBandwidth")
    private Integer eipBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayInstanceId")
    private String natGatewayInstanceId;

    private ConfigureNatGatewayRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.eipAllocationId = builder.eipAllocationId;
        this.eipBandwidth = builder.eipBandwidth;
        this.instanceId = builder.instanceId;
        this.natGatewayInstanceId = builder.natGatewayInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureNatGatewayRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eipAllocationId
     */
    public String getEipAllocationId() {
        return this.eipAllocationId;
    }

    /**
     * @return eipBandwidth
     */
    public Integer getEipBandwidth() {
        return this.eipBandwidth;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return natGatewayInstanceId
     */
    public String getNatGatewayInstanceId() {
        return this.natGatewayInstanceId;
    }

    public static final class Builder extends Request.Builder<ConfigureNatGatewayRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String eipAllocationId; 
        private Integer eipBandwidth; 
        private String instanceId; 
        private String natGatewayInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureNatGatewayRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.eipAllocationId = request.eipAllocationId;
            this.eipBandwidth = request.eipBandwidth;
            this.instanceId = request.instanceId;
            this.natGatewayInstanceId = request.natGatewayInstanceId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EipAllocationId.
         */
        public Builder eipAllocationId(String eipAllocationId) {
            this.putQueryParameter("EipAllocationId", eipAllocationId);
            this.eipAllocationId = eipAllocationId;
            return this;
        }

        /**
         * EipBandwidth.
         */
        public Builder eipBandwidth(Integer eipBandwidth) {
            this.putQueryParameter("EipBandwidth", eipBandwidth);
            this.eipBandwidth = eipBandwidth;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <instanceId>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NatGatewayInstanceId.
         */
        public Builder natGatewayInstanceId(String natGatewayInstanceId) {
            this.putQueryParameter("NatGatewayInstanceId", natGatewayInstanceId);
            this.natGatewayInstanceId = natGatewayInstanceId;
            return this;
        }

        @Override
        public ConfigureNatGatewayRequest build() {
            return new ConfigureNatGatewayRequest(this);
        } 

    } 

}
