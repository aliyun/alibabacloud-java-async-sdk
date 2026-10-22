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
 * {@link CreateAppPluginRequest} extends {@link RequestModel}
 *
 * <p>CreateAppPluginRequest</p>
 */
public class CreateAppPluginRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Icon")
    private String icon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssKey")
    private String ossKey;

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
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Visibility")
    private String visibility;

    private CreateAppPluginRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.category = builder.category;
        this.description = builder.description;
        this.downloadUrl = builder.downloadUrl;
        this.extend = builder.extend;
        this.icon = builder.icon;
        this.ossKey = builder.ossKey;
        this.pluginId = builder.pluginId;
        this.pluginName = builder.pluginName;
        this.pluginVersion = builder.pluginVersion;
        this.tags = builder.tags;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppPluginRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * @return ossKey
     */
    public String getOssKey() {
        return this.ossKey;
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

    public static final class Builder extends Request.Builder<CreateAppPluginRequest, Builder> {
        private String regionId; 
        private String category; 
        private String description; 
        private String downloadUrl; 
        private String extend; 
        private String icon; 
        private String ossKey; 
        private String pluginId; 
        private String pluginName; 
        private String pluginVersion; 
        private String tags; 
        private String visibility; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppPluginRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.category = request.category;
            this.description = request.description;
            this.downloadUrl = request.downloadUrl;
            this.extend = request.extend;
            this.icon = request.icon;
            this.ossKey = request.ossKey;
            this.pluginId = request.pluginId;
            this.pluginName = request.pluginName;
            this.pluginVersion = request.pluginVersion;
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
         * <p>The category of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Depth\&quot;: 4, \&quot;ParentCategoryId\&quot;: 5281, \&quot;Name\&quot;: \&quot;1\&quot;, \&quot;CategoryId\&quot;: 5282, \&quot;CreateTime\&quot;: \&quot;2025-08-26 10:20:37\&quot;}</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The description of the skill. The description must be 10 to 512 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The URL of the downloadable ZIP file. Specify either this parameter or OssKey.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://geoip-sdk-user.oss-cn-zhangjiakou.aliyuncs.com/product/v1/ipv6-inner/common/v1.20230608104522.dex?Expires=1753324652&OSSAccessKeyId=x6R87i97yKeKRggz&Signature=IwS6V56TlgjcX0AgikXLvf3CVtw%3D">http://geoip-sdk-user.oss-cn-zhangjiakou.aliyuncs.com/product/v1/ipv6-inner/common/v1.20230608104522.dex?Expires=1753324652&amp;OSSAccessKeyId=x6R87i97yKeKRggz&amp;Signature=IwS6V56TlgjcX0AgikXLvf3CVtw%3D</a></p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.putQueryParameter("DownloadUrl", downloadUrl);
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The extended JSON data. The format is the same as the extend parameter synchronized with the sandbox. If this parameter is not empty, it is saved to the database. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;user_device_id\&quot;:\&quot;6bef45cb0c76de284d24de074c088b73\&quot;}\n</p>
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * <p>The URL of the icon.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder icon(String icon) {
            this.putQueryParameter("Icon", icon);
            this.icon = icon;
            return this;
        }

        /**
         * <p>The Object Storage Service (OSS) key generated after a direct upload from the frontend. Specify either this parameter or DownloadUrl.</p>
         * 
         * <strong>example:</strong>
         * <p>backend/detection/objects/r-0008ujvfksltf5j45n81/task-000hckiuwyau0gwn17vq.jpg</p>
         */
        public Builder ossKey(String ossKey) {
            this.putQueryParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        /**
         * <p>The unique identifier of the skill. The identifier must be 3 to 64 characters in length and can contain only lowercase letters, digits, and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>1bae9ceaceea432d91c7069fab0dfc02</p>
         */
        public Builder pluginId(String pluginId) {
            this.putQueryParameter("PluginId", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        /**
         * <p>The name of the skill. The name must be 2 to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>alisecguard</p>
         */
        public Builder pluginName(String pluginName) {
            this.putQueryParameter("PluginName", pluginName);
            this.pluginName = pluginName;
            return this;
        }

        /**
         * <p>The version number of the plug-in. The version number must be in the Semantic Versioning (SemVer) format. Default value: 0.1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.6</p>
         */
        public Builder pluginVersion(String pluginVersion) {
            this.putQueryParameter("PluginVersion", pluginVersion);
            this.pluginVersion = pluginVersion;
            return this;
        }

        /**
         * <p>The tags of the skill. Separate multiple tags with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The visibility of the skill. Default value: private.</p>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        public Builder visibility(String visibility) {
            this.putQueryParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        @Override
        public CreateAppPluginRequest build() {
            return new CreateAppPluginRequest(this);
        } 

    } 

}
