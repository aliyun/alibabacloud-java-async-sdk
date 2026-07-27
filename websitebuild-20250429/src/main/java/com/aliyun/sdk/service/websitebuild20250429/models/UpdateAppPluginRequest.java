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
 * {@link UpdateAppPluginRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppPluginRequest</p>
 */
public class UpdateAppPluginRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigItems")
    private String configItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hooks")
    private String hooks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Icon")
    private String icon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginId")
    private String pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginName")
    private String pluginName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginVersion")
    private String pluginVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillHeader")
    private String skillHeader;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Visibility")
    private String visibility;

    private UpdateAppPluginRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.category = builder.category;
        this.configItems = builder.configItems;
        this.description = builder.description;
        this.extend = builder.extend;
        this.hooks = builder.hooks;
        this.icon = builder.icon;
        this.pluginId = builder.pluginId;
        this.pluginName = builder.pluginName;
        this.pluginVersion = builder.pluginVersion;
        this.skillHeader = builder.skillHeader;
        this.tags = builder.tags;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppPluginRequest create() {
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
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return configItems
     */
    public String getConfigItems() {
        return this.configItems;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return hooks
     */
    public String getHooks() {
        return this.hooks;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return this.icon;
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

    /**
     * @return pluginVersion
     */
    public String getPluginVersion() {
        return this.pluginVersion;
    }

    /**
     * @return skillHeader
     */
    public String getSkillHeader() {
        return this.skillHeader;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder extends Request.Builder<UpdateAppPluginRequest, Builder> {
        private String regionId; 
        private String category; 
        private String configItems; 
        private String description; 
        private String extend; 
        private String hooks; 
        private String icon; 
        private String pluginId; 
        private String pluginName; 
        private String pluginVersion; 
        private String skillHeader; 
        private String tags; 
        private String visibility; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppPluginRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.category = request.category;
            this.configItems = request.configItems;
            this.description = request.description;
            this.extend = request.extend;
            this.hooks = request.hooks;
            this.icon = request.icon;
            this.pluginId = request.pluginId;
            this.pluginName = request.pluginName;
            this.pluginVersion = request.pluginVersion;
            this.skillHeader = request.skillHeader;
            this.tags = request.tags;
            this.visibility = request.visibility;
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
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * ConfigItems.
         */
        public Builder configItems(String configItems) {
            this.putQueryParameter("ConfigItems", configItems);
            this.configItems = configItems;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Extend.
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * Hooks.
         */
        public Builder hooks(String hooks) {
            this.putQueryParameter("Hooks", hooks);
            this.hooks = hooks;
            return this;
        }

        /**
         * Icon.
         */
        public Builder icon(String icon) {
            this.putQueryParameter("Icon", icon);
            this.icon = icon;
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

        /**
         * PluginVersion.
         */
        public Builder pluginVersion(String pluginVersion) {
            this.putQueryParameter("PluginVersion", pluginVersion);
            this.pluginVersion = pluginVersion;
            return this;
        }

        /**
         * SkillHeader.
         */
        public Builder skillHeader(String skillHeader) {
            this.putQueryParameter("SkillHeader", skillHeader);
            this.skillHeader = skillHeader;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * Visibility.
         */
        public Builder visibility(String visibility) {
            this.putQueryParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        @Override
        public UpdateAppPluginRequest build() {
            return new UpdateAppPluginRequest(this);
        } 

    } 

}
