// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DeletePolarClawChannelRequest} extends {@link RequestModel}
 *
 * <p>DeletePolarClawChannelRequest</p>
 */
public class DeletePolarClawChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginId")
    private String pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Restart")
    private Boolean restart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UninstallPlugin")
    private Boolean uninstallPlugin;

    private DeletePolarClawChannelRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.channelId = builder.channelId;
        this.pluginId = builder.pluginId;
        this.restart = builder.restart;
        this.uninstallPlugin = builder.uninstallPlugin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolarClawChannelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * @return restart
     */
    public Boolean getRestart() {
        return this.restart;
    }

    /**
     * @return uninstallPlugin
     */
    public Boolean getUninstallPlugin() {
        return this.uninstallPlugin;
    }

    public static final class Builder extends Request.Builder<DeletePolarClawChannelRequest, Builder> {
        private String applicationId; 
        private String channelId; 
        private String pluginId; 
        private Boolean restart; 
        private Boolean uninstallPlugin; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolarClawChannelRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.channelId = request.channelId;
            this.pluginId = request.pluginId;
            this.restart = request.restart;
            this.uninstallPlugin = request.uninstallPlugin;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>feishu</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * PluginId.
         */
        public Builder pluginId(String pluginId) {
            this.putQueryParameter("PluginId", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        /**
         * Restart.
         */
        public Builder restart(Boolean restart) {
            this.putQueryParameter("Restart", restart);
            this.restart = restart;
            return this;
        }

        /**
         * UninstallPlugin.
         */
        public Builder uninstallPlugin(Boolean uninstallPlugin) {
            this.putQueryParameter("UninstallPlugin", uninstallPlugin);
            this.uninstallPlugin = uninstallPlugin;
            return this;
        }

        @Override
        public DeletePolarClawChannelRequest build() {
            return new DeletePolarClawChannelRequest(this);
        } 

    } 

}
