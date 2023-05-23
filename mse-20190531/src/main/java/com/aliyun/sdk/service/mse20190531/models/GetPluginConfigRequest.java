// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPluginConfigRequest} extends {@link RequestModel}
 *
 * <p>GetPluginConfigRequest</p>
 */
public class GetPluginConfigRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("GatewayUniqueId")
    @Validation(required = true)
    private String gatewayUniqueId;

    @Query
    @NameInMap("PluginId")
    @Validation(required = true)
    private Long pluginId;

    private GetPluginConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.pluginId = builder.pluginId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPluginConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return pluginId
     */
    public Long getPluginId() {
        return this.pluginId;
    }

    public static final class Builder extends Request.Builder<GetPluginConfigRequest, Builder> {
        private String acceptLanguage; 
        private String gatewayUniqueId; 
        private Long pluginId; 

        private Builder() {
            super();
        } 

        private Builder(GetPluginConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.pluginId = request.pluginId;
        } 

        /**
         * The name of the plug-in.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The type.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * The category of the plug-in.
         * <p>
         * 
         * 0: custom
         * 
         * 1: permission authorization
         * 
         * 2: security protection
         * 
         * 3: transmission protocol
         * 
         * 4: traffic control
         * 
         * 5: traffic observation
         */
        public Builder pluginId(Long pluginId) {
            this.putQueryParameter("PluginId", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        @Override
        public GetPluginConfigRequest build() {
            return new GetPluginConfigRequest(this);
        } 

    } 

}
