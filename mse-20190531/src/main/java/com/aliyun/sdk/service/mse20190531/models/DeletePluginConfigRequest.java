// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeletePluginConfigRequest} extends {@link RequestModel}
 *
 * <p>DeletePluginConfigRequest</p>
 */
public class DeletePluginConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pluginConfigId;

    private DeletePluginConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.pluginConfigId = builder.pluginConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePluginConfigRequest create() {
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
     * @return pluginConfigId
     */
    public Long getPluginConfigId() {
        return this.pluginConfigId;
    }

    public static final class Builder extends Request.Builder<DeletePluginConfigRequest, Builder> {
        private String acceptLanguage; 
        private String gatewayUniqueId; 
        private Long pluginConfigId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePluginConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.pluginConfigId = request.pluginConfigId;
        } 

        /**
         * <p>The language in which you want to display the results. Valid values: zh and en. zh indicates Chinese, which is the default value. en indicates English.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-e2d226bba4b2445c9e29fa7f8216****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The plug-in configuration ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder pluginConfigId(Long pluginConfigId) {
            this.putQueryParameter("PluginConfigId", pluginConfigId);
            this.pluginConfigId = pluginConfigId;
            return this;
        }

        @Override
        public DeletePluginConfigRequest build() {
            return new DeletePluginConfigRequest(this);
        } 

    } 

}
