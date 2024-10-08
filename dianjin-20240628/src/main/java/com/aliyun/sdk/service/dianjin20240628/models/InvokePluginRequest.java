// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InvokePluginRequest} extends {@link RequestModel}
 *
 * <p>InvokePluginRequest</p>
 */
public class InvokePluginRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("params")
    private java.util.Map < String, ? > params;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pluginId")
    private String pluginId;

    private InvokePluginRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.params = builder.params;
        this.pluginId = builder.pluginId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokePluginRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return params
     */
    public java.util.Map < String, ? > getParams() {
        return this.params;
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    public static final class Builder extends Request.Builder<InvokePluginRequest, Builder> {
        private String workspaceId; 
        private java.util.Map < String, ? > params; 
        private String pluginId; 

        private Builder() {
            super();
        } 

        private Builder(InvokePluginRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.params = request.params;
            this.pluginId = request.pluginId;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * params.
         */
        public Builder params(java.util.Map < String, ? > params) {
            this.putBodyParameter("params", params);
            this.params = params;
            return this;
        }

        /**
         * pluginId.
         */
        public Builder pluginId(String pluginId) {
            this.putBodyParameter("pluginId", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        @Override
        public InvokePluginRequest build() {
            return new InvokePluginRequest(this);
        } 

    } 

}
