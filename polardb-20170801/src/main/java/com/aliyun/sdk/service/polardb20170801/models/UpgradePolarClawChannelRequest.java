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
 * {@link UpgradePolarClawChannelRequest} extends {@link RequestModel}
 *
 * <p>UpgradePolarClawChannelRequest</p>
 */
public class UpgradePolarClawChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelConfig")
    private java.util.Map<String, ?> channelConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NpmPackage")
    private String npmPackage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginId")
    private String pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Restart")
    private Boolean restart;

    private UpgradePolarClawChannelRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.channelConfig = builder.channelConfig;
        this.channelId = builder.channelId;
        this.npmPackage = builder.npmPackage;
        this.pluginId = builder.pluginId;
        this.restart = builder.restart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradePolarClawChannelRequest create() {
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
     * @return channelConfig
     */
    public java.util.Map<String, ?> getChannelConfig() {
        return this.channelConfig;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return npmPackage
     */
    public String getNpmPackage() {
        return this.npmPackage;
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

    public static final class Builder extends Request.Builder<UpgradePolarClawChannelRequest, Builder> {
        private String applicationId; 
        private java.util.Map<String, ?> channelConfig; 
        private String channelId; 
        private String npmPackage; 
        private String pluginId; 
        private Boolean restart; 

        private Builder() {
            super();
        } 

        private Builder(UpgradePolarClawChannelRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.channelConfig = request.channelConfig;
            this.channelId = request.channelId;
            this.npmPackage = request.npmPackage;
            this.pluginId = request.pluginId;
            this.restart = request.restart;
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
         * ChannelConfig.
         */
        public Builder channelConfig(java.util.Map<String, ?> channelConfig) {
            String channelConfigShrink = shrink(channelConfig, "ChannelConfig", "json");
            this.putQueryParameter("ChannelConfig", channelConfigShrink);
            this.channelConfig = channelConfig;
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
         * NpmPackage.
         */
        public Builder npmPackage(String npmPackage) {
            this.putQueryParameter("NpmPackage", npmPackage);
            this.npmPackage = npmPackage;
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

        @Override
        public UpgradePolarClawChannelRequest build() {
            return new UpgradePolarClawChannelRequest(this);
        } 

    } 

}
