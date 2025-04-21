// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link UpdatePluginConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdatePluginConfigRequest</p>
 */
public class UpdatePluginConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigLevel")
    private Integer configLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    @Deprecated
    private Long gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    @Deprecated
    private String gmtCreate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtModified")
    @Deprecated
    private String gmtModified;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginId")
    private Long pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIdList")
    private java.util.List<Long> resourceIdList;

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
        this.resourceIdList = builder.resourceIdList;
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

    /**
     * @return resourceIdList
     */
    public java.util.List<Long> getResourceIdList() {
        return this.resourceIdList;
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
        private java.util.List<Long> resourceIdList; 

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
            this.resourceIdList = request.resourceIdList;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <p>zh: Chinese en: English</p>
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
         * Config.
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The application scope of the plug-in.</p>
         * <ul>
         * <li>0: global</li>
         * <li>1: route</li>
         * <li>2: domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder configLevel(Integer configLevel) {
            this.putQueryParameter("ConfigLevel", configLevel);
            this.configLevel = configLevel;
            return this;
        }

        /**
         * <p>Specifies whether to enable the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-ubuwqygbq4783gqb2y3f87q****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1667309705000</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.putQueryParameter("GmtCreate", gmtCreate);
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1667309705000</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.putQueryParameter("GmtModified", gmtModified);
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The ID of the plug-in configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The ID of the gateway plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pluginId(Long pluginId) {
            this.putQueryParameter("PluginId", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        /**
         * ResourceIdList.
         */
        public Builder resourceIdList(java.util.List<Long> resourceIdList) {
            String resourceIdListShrink = shrink(resourceIdList, "ResourceIdList", "json");
            this.putQueryParameter("ResourceIdList", resourceIdListShrink);
            this.resourceIdList = resourceIdList;
            return this;
        }

        @Override
        public UpdatePluginConfigRequest build() {
            return new UpdatePluginConfigRequest(this);
        } 

    } 

}
