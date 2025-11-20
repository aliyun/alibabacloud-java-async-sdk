// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link InstallPluginRequest} extends {@link RequestModel}
 *
 * <p>InstallPluginRequest</p>
 */
public class InstallPluginRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayIds")
    private java.util.List<String> gatewayIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pluginClassId")
    private String pluginClassId;

    private InstallPluginRequest(Builder builder) {
        super(builder);
        this.gatewayIds = builder.gatewayIds;
        this.pluginClassId = builder.pluginClassId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallPluginRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayIds
     */
    public java.util.List<String> getGatewayIds() {
        return this.gatewayIds;
    }

    /**
     * @return pluginClassId
     */
    public String getPluginClassId() {
        return this.pluginClassId;
    }

    public static final class Builder extends Request.Builder<InstallPluginRequest, Builder> {
        private java.util.List<String> gatewayIds; 
        private String pluginClassId; 

        private Builder() {
            super();
        } 

        private Builder(InstallPluginRequest request) {
            super(request);
            this.gatewayIds = request.gatewayIds;
            this.pluginClassId = request.pluginClassId;
        } 

        /**
         * <p>The list of gateway IDs.</p>
         */
        public Builder gatewayIds(java.util.List<String> gatewayIds) {
            this.putBodyParameter("gatewayIds", gatewayIds);
            this.gatewayIds = gatewayIds;
            return this;
        }

        /**
         * <p>The plug-in type ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pls-csqmjndlhtguk0loef21</p>
         */
        public Builder pluginClassId(String pluginClassId) {
            this.putBodyParameter("pluginClassId", pluginClassId);
            this.pluginClassId = pluginClassId;
            return this;
        }

        @Override
        public InstallPluginRequest build() {
            return new InstallPluginRequest(this);
        } 

    } 

}
