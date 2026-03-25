// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link EditPluginConfigRequest} extends {@link RequestModel}
 *
 * <p>EditPluginConfigRequest</p>
 */
public class EditPluginConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginConfig")
    private String pluginConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginDesc")
    private String pluginDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginId")
    private String pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginName")
    private String pluginName;

    private EditPluginConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.pluginConfig = builder.pluginConfig;
        this.pluginDesc = builder.pluginDesc;
        this.pluginId = builder.pluginId;
        this.pluginName = builder.pluginName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditPluginConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return pluginConfig
     */
    public String getPluginConfig() {
        return this.pluginConfig;
    }

    /**
     * @return pluginDesc
     */
    public String getPluginDesc() {
        return this.pluginDesc;
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * @return pluginName
     */
    public String getPluginName() {
        return this.pluginName;
    }

    public static final class Builder extends Request.Builder<EditPluginConfigRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String pluginConfig; 
        private String pluginDesc; 
        private String pluginId; 
        private String pluginName; 

        private Builder() {
            super();
        } 

        private Builder(EditPluginConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.pluginConfig = request.pluginConfig;
            this.pluginDesc = request.pluginDesc;
            this.pluginId = request.pluginId;
            this.pluginName = request.pluginName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * PluginConfig.
         */
        public Builder pluginConfig(String pluginConfig) {
            this.putQueryParameter("PluginConfig", pluginConfig);
            this.pluginConfig = pluginConfig;
            return this;
        }

        /**
         * PluginDesc.
         */
        public Builder pluginDesc(String pluginDesc) {
            this.putQueryParameter("PluginDesc", pluginDesc);
            this.pluginDesc = pluginDesc;
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
         * PluginName.
         */
        public Builder pluginName(String pluginName) {
            this.putQueryParameter("PluginName", pluginName);
            this.pluginName = pluginName;
            return this;
        }

        @Override
        public EditPluginConfigRequest build() {
            return new EditPluginConfigRequest(this);
        } 

    } 

}
