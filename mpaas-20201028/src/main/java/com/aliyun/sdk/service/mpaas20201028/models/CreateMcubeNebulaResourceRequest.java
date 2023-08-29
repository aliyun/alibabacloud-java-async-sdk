// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeNebulaResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateMcubeNebulaResourceRequest</p>
 */
public class CreateMcubeNebulaResourceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    private String appId;

    @Body
    @NameInMap("AutoInstall")
    private Integer autoInstall;

    @Body
    @NameInMap("ClientVersionMax")
    private String clientVersionMax;

    @Body
    @NameInMap("ClientVersionMin")
    private String clientVersionMin;

    @Body
    @NameInMap("CustomDomainName")
    private String customDomainName;

    @Body
    @NameInMap("ExtendInfo")
    private String extendInfo;

    @Body
    @NameInMap("FileUrl")
    private String fileUrl;

    @Body
    @NameInMap("H5Id")
    private String h5Id;

    @Body
    @NameInMap("H5Name")
    private String h5Name;

    @Body
    @NameInMap("H5Version")
    private String h5Version;

    @Body
    @NameInMap("InstallType")
    private Integer installType;

    @Body
    @NameInMap("MainUrl")
    private String mainUrl;

    @Body
    @NameInMap("OnexFlag")
    private Boolean onexFlag;

    @Body
    @NameInMap("Platform")
    private String platform;

    @Body
    @NameInMap("RepeatNebula")
    private Integer repeatNebula;

    @Body
    @NameInMap("ResourceType")
    private Integer resourceType;

    @Body
    @NameInMap("SubUrl")
    private String subUrl;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    @Body
    @NameInMap("Vhost")
    private String vhost;

    @Body
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateMcubeNebulaResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.autoInstall = builder.autoInstall;
        this.clientVersionMax = builder.clientVersionMax;
        this.clientVersionMin = builder.clientVersionMin;
        this.customDomainName = builder.customDomainName;
        this.extendInfo = builder.extendInfo;
        this.fileUrl = builder.fileUrl;
        this.h5Id = builder.h5Id;
        this.h5Name = builder.h5Name;
        this.h5Version = builder.h5Version;
        this.installType = builder.installType;
        this.mainUrl = builder.mainUrl;
        this.onexFlag = builder.onexFlag;
        this.platform = builder.platform;
        this.repeatNebula = builder.repeatNebula;
        this.resourceType = builder.resourceType;
        this.subUrl = builder.subUrl;
        this.tenantId = builder.tenantId;
        this.vhost = builder.vhost;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcubeNebulaResourceRequest create() {
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
    public Integer getAutoInstall() {
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
     * @return customDomainName
     */
    public String getCustomDomainName() {
        return this.customDomainName;
    }

    /**
     * @return extendInfo
     */
    public String getExtendInfo() {
        return this.extendInfo;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
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
     * @return installType
     */
    public Integer getInstallType() {
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
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return repeatNebula
     */
    public Integer getRepeatNebula() {
        return this.repeatNebula;
    }

    /**
     * @return resourceType
     */
    public Integer getResourceType() {
        return this.resourceType;
    }

    /**
     * @return subUrl
     */
    public String getSubUrl() {
        return this.subUrl;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
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

    public static final class Builder extends Request.Builder<CreateMcubeNebulaResourceRequest, Builder> {
        private String regionId; 
        private String appId; 
        private Integer autoInstall; 
        private String clientVersionMax; 
        private String clientVersionMin; 
        private String customDomainName; 
        private String extendInfo; 
        private String fileUrl; 
        private String h5Id; 
        private String h5Name; 
        private String h5Version; 
        private Integer installType; 
        private String mainUrl; 
        private Boolean onexFlag; 
        private String platform; 
        private Integer repeatNebula; 
        private Integer resourceType; 
        private String subUrl; 
        private String tenantId; 
        private String vhost; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMcubeNebulaResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.autoInstall = request.autoInstall;
            this.clientVersionMax = request.clientVersionMax;
            this.clientVersionMin = request.clientVersionMin;
            this.customDomainName = request.customDomainName;
            this.extendInfo = request.extendInfo;
            this.fileUrl = request.fileUrl;
            this.h5Id = request.h5Id;
            this.h5Name = request.h5Name;
            this.h5Version = request.h5Version;
            this.installType = request.installType;
            this.mainUrl = request.mainUrl;
            this.onexFlag = request.onexFlag;
            this.platform = request.platform;
            this.repeatNebula = request.repeatNebula;
            this.resourceType = request.resourceType;
            this.subUrl = request.subUrl;
            this.tenantId = request.tenantId;
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
        public Builder autoInstall(Integer autoInstall) {
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
         * CustomDomainName.
         */
        public Builder customDomainName(String customDomainName) {
            this.putBodyParameter("CustomDomainName", customDomainName);
            this.customDomainName = customDomainName;
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
         * FileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.putBodyParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
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
         * InstallType.
         */
        public Builder installType(Integer installType) {
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
         * Platform.
         */
        public Builder platform(String platform) {
            this.putBodyParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * RepeatNebula.
         */
        public Builder repeatNebula(Integer repeatNebula) {
            this.putBodyParameter("RepeatNebula", repeatNebula);
            this.repeatNebula = repeatNebula;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(Integer resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * SubUrl.
         */
        public Builder subUrl(String subUrl) {
            this.putBodyParameter("SubUrl", subUrl);
            this.subUrl = subUrl;
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
        public CreateMcubeNebulaResourceRequest build() {
            return new CreateMcubeNebulaResourceRequest(this);
        } 

    } 

}
