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
 * {@link UploadAppPluginVersionRequest} extends {@link RequestModel}
 *
 * <p>UploadAppPluginVersionRequest</p>
 */
public class UploadAppPluginVersionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Changelog")
    private String changelog;

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
    @com.aliyun.core.annotation.NameInMap("OssKey")
    private String ossKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginId")
    private String pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginVersion")
    private String pluginVersion;

    private UploadAppPluginVersionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.changelog = builder.changelog;
        this.description = builder.description;
        this.downloadUrl = builder.downloadUrl;
        this.extend = builder.extend;
        this.ossKey = builder.ossKey;
        this.pluginId = builder.pluginId;
        this.pluginVersion = builder.pluginVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadAppPluginVersionRequest create() {
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
     * @return changelog
     */
    public String getChangelog() {
        return this.changelog;
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
     * @return pluginVersion
     */
    public String getPluginVersion() {
        return this.pluginVersion;
    }

    public static final class Builder extends Request.Builder<UploadAppPluginVersionRequest, Builder> {
        private String regionId; 
        private String changelog; 
        private String description; 
        private String downloadUrl; 
        private String extend; 
        private String ossKey; 
        private String pluginId; 
        private String pluginVersion; 

        private Builder() {
            super();
        } 

        private Builder(UploadAppPluginVersionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.changelog = request.changelog;
            this.description = request.description;
            this.downloadUrl = request.downloadUrl;
            this.extend = request.extend;
            this.ossKey = request.ossKey;
            this.pluginId = request.pluginId;
            this.pluginVersion = request.pluginVersion;
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
         * <p>The changelog.</p>
         * 
         * <strong>example:</strong>
         * <p>x x x</p>
         */
        public Builder changelog(String changelog) {
            this.putQueryParameter("Changelog", changelog);
            this.changelog = changelog;
            return this;
        }

        /**
         * <p>The description. This parameter is optional. If this parameter is not empty, the description field in the primary table is updated accordingly.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The downloadable URL of the ZIP file. This parameter and OssKey are mutually exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://sfile.chatglm.cn/chatglm4/file/a8/a87340a5ba.pdf">https://sfile.chatglm.cn/chatglm4/file/a8/a87340a5ba.pdf</a></p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.putQueryParameter("DownloadUrl", downloadUrl);
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The extended JSON string. This parameter is optional and must be in the same format as the extend parameter synchronized from the sandbox. If this parameter is not empty, the extend field in the primary table is updated accordingly.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;deliveryNodeName&quot;:&quot;Delivery Quality Inspection&quot;,&quot;deliveryNodeStatus&quot;:&quot;Finish&quot;,&quot;deliveryOperatorRole&quot;:&quot;Provider&quot;}</p>
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * <p>The Object Storage Service (OSS) key after the file is directly uploaded from the frontend. This parameter and DownloadUrl are mutually exclusive.</p>
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
         * <p>The ID of the gateway plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>aliplayer-react</p>
         */
        public Builder pluginId(String pluginId) {
            this.putQueryParameter("PluginId", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        /**
         * <p>The new version number. The version number must follow the Semantic Versioning (SemVer) specification and be greater than the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder pluginVersion(String pluginVersion) {
            this.putQueryParameter("PluginVersion", pluginVersion);
            this.pluginVersion = pluginVersion;
            return this;
        }

        @Override
        public UploadAppPluginVersionRequest build() {
            return new UploadAppPluginVersionRequest(this);
        } 

    } 

}
