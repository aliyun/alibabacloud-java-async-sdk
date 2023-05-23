// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePluginConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdatePluginConfigRequest</p>
 */
public class UpdatePluginConfigRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("Config")
    private String config;

    @Query
    @NameInMap("ConfigLevel")
    private Integer configLevel;

    @Query
    @NameInMap("Enable")
    private Boolean enable;

    @Query
    @NameInMap("GatewayId")
    private Long gatewayId;

    @Query
    @NameInMap("GatewayUniqueId")
    @Validation(required = true)
    private String gatewayUniqueId;

    @Query
    @NameInMap("GmtCreate")
    private String gmtCreate;

    @Query
    @NameInMap("GmtModified")
    private String gmtModified;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("PluginId")
    @Validation(required = true)
    private Long pluginId;

    private UpdatePluginConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.config = builder.config;
        this.configLevel = builder.configLevel;
        this.enable = builder.enable;
        this.gatewayId = builder.gatewayId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.pluginId = builder.pluginId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePluginConfigRequest create() {
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
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return configLevel
     */
    public Integer getConfigLevel() {
        return this.configLevel;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return gatewayId
     */
    public Long getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return pluginId
     */
    public Long getPluginId() {
        return this.pluginId;
    }

    public static final class Builder extends Request.Builder<UpdatePluginConfigRequest, Builder> {
        private String acceptLanguage; 
        private String config; 
        private Integer configLevel; 
        private Boolean enable; 
        private Long gatewayId; 
        private String gatewayUniqueId; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private Long pluginId; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePluginConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.config = request.config;
            this.configLevel = request.configLevel;
            this.enable = request.enable;
            this.gatewayId = request.gatewayId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.gmtCreate = request.gmtCreate;
            this.gmtModified = request.gmtModified;
            this.id = request.id;
            this.pluginId = request.pluginId;
        } 

        /**
         * systemError
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * illegal request:%s
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * clusterNotFound
         */
        public Builder configLevel(Integer configLevel) {
            this.putQueryParameter("ConfigLevel", configLevel);
            this.configLevel = configLevel;
            return this;
        }

        /**
         * illegalRequest
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * duplicatedClusterAliasName
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * duplicated cluster alias name
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * cluster not found
         */
        public Builder gmtCreate(String gmtCreate) {
            this.putQueryParameter("GmtCreate", gmtCreate);
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * mse-100-001
         */
        public Builder gmtModified(String gmtModified) {
            this.putQueryParameter("GmtModified", gmtModified);
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * mse-200-105
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * mse-100-007
         */
        public Builder pluginId(Long pluginId) {
            this.putQueryParameter("PluginId", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        @Override
        public UpdatePluginConfigRequest build() {
            return new UpdatePluginConfigRequest(this);
        } 

    } 

}
