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
 * {@link UpgradePolarClawPluginRequest} extends {@link RequestModel}
 *
 * <p>UpgradePolarClawPluginRequest</p>
 */
public class UpgradePolarClawPluginRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NpmPackage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String npmPackage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Restart")
    private Boolean restart;

    private UpgradePolarClawPluginRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.npmPackage = builder.npmPackage;
        this.pluginId = builder.pluginId;
        this.restart = builder.restart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradePolarClawPluginRequest create() {
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

    public static final class Builder extends Request.Builder<UpgradePolarClawPluginRequest, Builder> {
        private String applicationId; 
        private String npmPackage; 
        private String pluginId; 
        private Boolean restart; 

        private Builder() {
            super();
        } 

        private Builder(UpgradePolarClawPluginRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.npmPackage = request.npmPackage;
            this.pluginId = request.pluginId;
            this.restart = request.restart;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-********************</p>
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
         * <p>@larksuite/<a href="mailto:openclaw-lark@2026.4.7">openclaw-lark@2026.4.7</a></p>
         */
        public Builder npmPackage(String npmPackage) {
            this.putQueryParameter("NpmPackage", npmPackage);
            this.npmPackage = npmPackage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>openclaw-lark</p>
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
        public UpgradePolarClawPluginRequest build() {
            return new UpgradePolarClawPluginRequest(this);
        } 

    } 

}
