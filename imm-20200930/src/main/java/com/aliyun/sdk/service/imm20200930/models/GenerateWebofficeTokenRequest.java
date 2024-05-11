// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateWebofficeTokenRequest} extends {@link RequestModel}
 *
 * <p>GenerateWebofficeTokenRequest</p>
 */
public class GenerateWebofficeTokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CachePreview")
    private Boolean cachePreview;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalUploaded")
    private Boolean externalUploaded;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filename")
    private String filename;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hidecmb")
    private Boolean hidecmb;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyTopicName")
    private String notifyTopicName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Permission")
    private WebofficePermission permission;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreviewPages")
    private Long previewPages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Referer")
    private String referer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private WebofficeUser user;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Watermark")
    private WebofficeWatermark watermark;

    private GenerateWebofficeTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cachePreview = builder.cachePreview;
        this.credentialConfig = builder.credentialConfig;
        this.externalUploaded = builder.externalUploaded;
        this.filename = builder.filename;
        this.hidecmb = builder.hidecmb;
        this.notification = builder.notification;
        this.notifyTopicName = builder.notifyTopicName;
        this.password = builder.password;
        this.permission = builder.permission;
        this.previewPages = builder.previewPages;
        this.projectName = builder.projectName;
        this.referer = builder.referer;
        this.sourceURI = builder.sourceURI;
        this.user = builder.user;
        this.userData = builder.userData;
        this.watermark = builder.watermark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateWebofficeTokenRequest create() {
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
     * @return cachePreview
     */
    public Boolean getCachePreview() {
        return this.cachePreview;
    }

    /**
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return externalUploaded
     */
    public Boolean getExternalUploaded() {
        return this.externalUploaded;
    }

    /**
     * @return filename
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * @return hidecmb
     */
    public Boolean getHidecmb() {
        return this.hidecmb;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return notifyTopicName
     */
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return permission
     */
    public WebofficePermission getPermission() {
        return this.permission;
    }

    /**
     * @return previewPages
     */
    public Long getPreviewPages() {
        return this.previewPages;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return referer
     */
    public String getReferer() {
        return this.referer;
    }

    /**
     * @return sourceURI
     */
    public String getSourceURI() {
        return this.sourceURI;
    }

    /**
     * @return user
     */
    public WebofficeUser getUser() {
        return this.user;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return watermark
     */
    public WebofficeWatermark getWatermark() {
        return this.watermark;
    }

    public static final class Builder extends Request.Builder<GenerateWebofficeTokenRequest, Builder> {
        private String regionId; 
        private Boolean cachePreview; 
        private CredentialConfig credentialConfig; 
        private Boolean externalUploaded; 
        private String filename; 
        private Boolean hidecmb; 
        private Notification notification; 
        private String notifyTopicName; 
        private String password; 
        private WebofficePermission permission; 
        private Long previewPages; 
        private String projectName; 
        private String referer; 
        private String sourceURI; 
        private WebofficeUser user; 
        private String userData; 
        private WebofficeWatermark watermark; 

        private Builder() {
            super();
        } 

        private Builder(GenerateWebofficeTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cachePreview = request.cachePreview;
            this.credentialConfig = request.credentialConfig;
            this.externalUploaded = request.externalUploaded;
            this.filename = request.filename;
            this.hidecmb = request.hidecmb;
            this.notification = request.notification;
            this.notifyTopicName = request.notifyTopicName;
            this.password = request.password;
            this.permission = request.permission;
            this.previewPages = request.previewPages;
            this.projectName = request.projectName;
            this.referer = request.referer;
            this.sourceURI = request.sourceURI;
            this.user = request.user;
            this.userData = request.userData;
            this.watermark = request.watermark;
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
         * CachePreview.
         */
        public Builder cachePreview(Boolean cachePreview) {
            this.putQueryParameter("CachePreview", cachePreview);
            this.cachePreview = cachePreview;
            return this;
        }

        /**
         * CredentialConfig.
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * ExternalUploaded.
         */
        public Builder externalUploaded(Boolean externalUploaded) {
            this.putQueryParameter("ExternalUploaded", externalUploaded);
            this.externalUploaded = externalUploaded;
            return this;
        }

        /**
         * Filename.
         */
        public Builder filename(String filename) {
            this.putQueryParameter("Filename", filename);
            this.filename = filename;
            return this;
        }

        /**
         * Hidecmb.
         */
        public Builder hidecmb(Boolean hidecmb) {
            this.putQueryParameter("Hidecmb", hidecmb);
            this.hidecmb = hidecmb;
            return this;
        }

        /**
         * 消息通知配置，支持使用MNS、RocketMQ接收异步消息通知。
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * NotifyTopicName.
         */
        public Builder notifyTopicName(String notifyTopicName) {
            this.putQueryParameter("NotifyTopicName", notifyTopicName);
            this.notifyTopicName = notifyTopicName;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Permission.
         */
        public Builder permission(WebofficePermission permission) {
            String permissionShrink = shrink(permission, "Permission", "json");
            this.putQueryParameter("Permission", permissionShrink);
            this.permission = permission;
            return this;
        }

        /**
         * PreviewPages.
         */
        public Builder previewPages(Long previewPages) {
            this.putQueryParameter("PreviewPages", previewPages);
            this.previewPages = previewPages;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * Referer.
         */
        public Builder referer(String referer) {
            this.putQueryParameter("Referer", referer);
            this.referer = referer;
            return this;
        }

        /**
         * SourceURI.
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * User.
         */
        public Builder user(WebofficeUser user) {
            String userShrink = shrink(user, "User", "json");
            this.putQueryParameter("User", userShrink);
            this.user = user;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * Watermark.
         */
        public Builder watermark(WebofficeWatermark watermark) {
            String watermarkShrink = shrink(watermark, "Watermark", "json");
            this.putQueryParameter("Watermark", watermarkShrink);
            this.watermark = watermark;
            return this;
        }

        @Override
        public GenerateWebofficeTokenRequest build() {
            return new GenerateWebofficeTokenRequest(this);
        } 

    } 

}
