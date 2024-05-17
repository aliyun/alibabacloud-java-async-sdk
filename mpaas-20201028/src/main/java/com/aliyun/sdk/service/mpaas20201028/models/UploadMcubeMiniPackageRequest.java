// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadMcubeMiniPackageRequest} extends {@link RequestModel}
 *
 * <p>UploadMcubeMiniPackageRequest</p>
 */
public class UploadMcubeMiniPackageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoInstall")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long autoInstall;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientVersionMax")
    private String clientVersionMax;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientVersionMin")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientVersionMin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableKeepAlive")
    @com.aliyun.core.annotation.Validation(required = true)
    private String enableKeepAlive;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableOptionMenu")
    @com.aliyun.core.annotation.Validation(required = true)
    private String enableOptionMenu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableTabBar")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enableTabBar;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtendInfo")
    private String extendInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("H5Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String h5Id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("H5Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String h5Name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("H5Version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String h5Version;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IconFileUrl")
    private String iconFileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IconUrl")
    private String iconUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstallType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long installType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MainUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mainUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OnexFlag")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean onexFlag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PackageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long packageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Platform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String platform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceFileUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceFileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Vhost")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vhost;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UploadMcubeMiniPackageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.autoInstall = builder.autoInstall;
        this.clientVersionMax = builder.clientVersionMax;
        this.clientVersionMin = builder.clientVersionMin;
        this.enableKeepAlive = builder.enableKeepAlive;
        this.enableOptionMenu = builder.enableOptionMenu;
        this.enableTabBar = builder.enableTabBar;
        this.extendInfo = builder.extendInfo;
        this.h5Id = builder.h5Id;
        this.h5Name = builder.h5Name;
        this.h5Version = builder.h5Version;
        this.iconFileUrl = builder.iconFileUrl;
        this.iconUrl = builder.iconUrl;
        this.installType = builder.installType;
        this.mainUrl = builder.mainUrl;
        this.onexFlag = builder.onexFlag;
        this.packageType = builder.packageType;
        this.platform = builder.platform;
        this.resourceFileUrl = builder.resourceFileUrl;
        this.resourceType = builder.resourceType;
        this.tenantId = builder.tenantId;
        this.userId = builder.userId;
        this.uuid = builder.uuid;
        this.vhost = builder.vhost;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadMcubeMiniPackageRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return autoInstall
     */
    public Long getAutoInstall() {
        return this.autoInstall;
    }

    /**
     * @return clientVersionMax
     */
    public String getClientVersionMax() {
        return this.clientVersionMax;
    }

    /**
     * @return clientVersionMin
     */
    public String getClientVersionMin() {
        return this.clientVersionMin;
    }

    /**
     * @return enableKeepAlive
     */
    public String getEnableKeepAlive() {
        return this.enableKeepAlive;
    }

    /**
     * @return enableOptionMenu
     */
    public String getEnableOptionMenu() {
        return this.enableOptionMenu;
    }

    /**
     * @return enableTabBar
     */
    public Long getEnableTabBar() {
        return this.enableTabBar;
    }

    /**
     * @return extendInfo
     */
    public String getExtendInfo() {
        return this.extendInfo;
    }

    /**
     * @return h5Id
     */
    public String getH5Id() {
        return this.h5Id;
    }

    /**
     * @return h5Name
     */
    public String getH5Name() {
        return this.h5Name;
    }

    /**
     * @return h5Version
     */
    public String getH5Version() {
        return this.h5Version;
    }

    /**
     * @return iconFileUrl
     */
    public String getIconFileUrl() {
        return this.iconFileUrl;
    }

    /**
     * @return iconUrl
     */
    public String getIconUrl() {
        return this.iconUrl;
    }

    /**
     * @return installType
     */
    public Long getInstallType() {
        return this.installType;
    }

    /**
     * @return mainUrl
     */
    public String getMainUrl() {
        return this.mainUrl;
    }

    /**
     * @return onexFlag
     */
    public Boolean getOnexFlag() {
        return this.onexFlag;
    }

    /**
     * @return packageType
     */
    public Long getPackageType() {
        return this.packageType;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return resourceFileUrl
     */
    public String getResourceFileUrl() {
        return this.resourceFileUrl;
    }

    /**
     * @return resourceType
     */
    public Long getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return vhost
     */
    public String getVhost() {
        return this.vhost;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UploadMcubeMiniPackageRequest, Builder> {
        private String regionId; 
        private String appId; 
        private Long autoInstall; 
        private String clientVersionMax; 
        private String clientVersionMin; 
        private String enableKeepAlive; 
        private String enableOptionMenu; 
        private Long enableTabBar; 
        private String extendInfo; 
        private String h5Id; 
        private String h5Name; 
        private String h5Version; 
        private String iconFileUrl; 
        private String iconUrl; 
        private Long installType; 
        private String mainUrl; 
        private Boolean onexFlag; 
        private Long packageType; 
        private String platform; 
        private String resourceFileUrl; 
        private Long resourceType; 
        private String tenantId; 
        private String userId; 
        private String uuid; 
        private String vhost; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UploadMcubeMiniPackageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.autoInstall = request.autoInstall;
            this.clientVersionMax = request.clientVersionMax;
            this.clientVersionMin = request.clientVersionMin;
            this.enableKeepAlive = request.enableKeepAlive;
            this.enableOptionMenu = request.enableOptionMenu;
            this.enableTabBar = request.enableTabBar;
            this.extendInfo = request.extendInfo;
            this.h5Id = request.h5Id;
            this.h5Name = request.h5Name;
            this.h5Version = request.h5Version;
            this.iconFileUrl = request.iconFileUrl;
            this.iconUrl = request.iconUrl;
            this.installType = request.installType;
            this.mainUrl = request.mainUrl;
            this.onexFlag = request.onexFlag;
            this.packageType = request.packageType;
            this.platform = request.platform;
            this.resourceFileUrl = request.resourceFileUrl;
            this.resourceType = request.resourceType;
            this.tenantId = request.tenantId;
            this.userId = request.userId;
            this.uuid = request.uuid;
            this.vhost = request.vhost;
            this.workspaceId = request.workspaceId;
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
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AutoInstall.
         */
        public Builder autoInstall(Long autoInstall) {
            this.putBodyParameter("AutoInstall", autoInstall);
            this.autoInstall = autoInstall;
            return this;
        }

        /**
         * ClientVersionMax.
         */
        public Builder clientVersionMax(String clientVersionMax) {
            this.putBodyParameter("ClientVersionMax", clientVersionMax);
            this.clientVersionMax = clientVersionMax;
            return this;
        }

        /**
         * ClientVersionMin.
         */
        public Builder clientVersionMin(String clientVersionMin) {
            this.putBodyParameter("ClientVersionMin", clientVersionMin);
            this.clientVersionMin = clientVersionMin;
            return this;
        }

        /**
         * EnableKeepAlive.
         */
        public Builder enableKeepAlive(String enableKeepAlive) {
            this.putBodyParameter("EnableKeepAlive", enableKeepAlive);
            this.enableKeepAlive = enableKeepAlive;
            return this;
        }

        /**
         * EnableOptionMenu.
         */
        public Builder enableOptionMenu(String enableOptionMenu) {
            this.putBodyParameter("EnableOptionMenu", enableOptionMenu);
            this.enableOptionMenu = enableOptionMenu;
            return this;
        }

        /**
         * EnableTabBar.
         */
        public Builder enableTabBar(Long enableTabBar) {
            this.putBodyParameter("EnableTabBar", enableTabBar);
            this.enableTabBar = enableTabBar;
            return this;
        }

        /**
         * ExtendInfo.
         */
        public Builder extendInfo(String extendInfo) {
            this.putBodyParameter("ExtendInfo", extendInfo);
            this.extendInfo = extendInfo;
            return this;
        }

        /**
         * H5Id.
         */
        public Builder h5Id(String h5Id) {
            this.putBodyParameter("H5Id", h5Id);
            this.h5Id = h5Id;
            return this;
        }

        /**
         * H5Name.
         */
        public Builder h5Name(String h5Name) {
            this.putBodyParameter("H5Name", h5Name);
            this.h5Name = h5Name;
            return this;
        }

        /**
         * H5Version.
         */
        public Builder h5Version(String h5Version) {
            this.putBodyParameter("H5Version", h5Version);
            this.h5Version = h5Version;
            return this;
        }

        /**
         * IconFileUrl.
         */
        public Builder iconFileUrl(String iconFileUrl) {
            this.putBodyParameter("IconFileUrl", iconFileUrl);
            this.iconFileUrl = iconFileUrl;
            return this;
        }

        /**
         * IconUrl.
         */
        public Builder iconUrl(String iconUrl) {
            this.putBodyParameter("IconUrl", iconUrl);
            this.iconUrl = iconUrl;
            return this;
        }

        /**
         * InstallType.
         */
        public Builder installType(Long installType) {
            this.putBodyParameter("InstallType", installType);
            this.installType = installType;
            return this;
        }

        /**
         * MainUrl.
         */
        public Builder mainUrl(String mainUrl) {
            this.putBodyParameter("MainUrl", mainUrl);
            this.mainUrl = mainUrl;
            return this;
        }

        /**
         * OnexFlag.
         */
        public Builder onexFlag(Boolean onexFlag) {
            this.putBodyParameter("OnexFlag", onexFlag);
            this.onexFlag = onexFlag;
            return this;
        }

        /**
         * PackageType.
         */
        public Builder packageType(Long packageType) {
            this.putBodyParameter("PackageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putBodyParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * ResourceFileUrl.
         */
        public Builder resourceFileUrl(String resourceFileUrl) {
            this.putBodyParameter("ResourceFileUrl", resourceFileUrl);
            this.resourceFileUrl = resourceFileUrl;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(Long resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * Vhost.
         */
        public Builder vhost(String vhost) {
            this.putBodyParameter("Vhost", vhost);
            this.vhost = vhost;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UploadMcubeMiniPackageRequest build() {
            return new UploadMcubeMiniPackageRequest(this);
        } 

    } 

}
