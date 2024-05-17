// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeUpgradePackageRequest} extends {@link RequestModel}
 *
 * <p>CreateMcubeUpgradePackageRequest</p>
 */
public class CreateMcubeUpgradePackageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppstoreUrl")
    private String appstoreUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BundleId")
    private String bundleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomDomainName")
    private String customDomainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Desc")
    private String desc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IconFileUrl")
    private String iconFileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstallAmount")
    private Integer installAmount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IosSymbolfileUrl")
    private String iosSymbolfileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsEnterprise")
    private Integer isEnterprise;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NeedCheck")
    private Integer needCheck;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OnexFlag")
    private Boolean onexFlag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValidDays")
    private Integer validDays;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateMcubeUpgradePackageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.appVersion = builder.appVersion;
        this.appstoreUrl = builder.appstoreUrl;
        this.bundleId = builder.bundleId;
        this.customDomainName = builder.customDomainName;
        this.desc = builder.desc;
        this.downloadUrl = builder.downloadUrl;
        this.fileUrl = builder.fileUrl;
        this.iconFileUrl = builder.iconFileUrl;
        this.installAmount = builder.installAmount;
        this.iosSymbolfileUrl = builder.iosSymbolfileUrl;
        this.isEnterprise = builder.isEnterprise;
        this.needCheck = builder.needCheck;
        this.onexFlag = builder.onexFlag;
        this.platform = builder.platform;
        this.tenantId = builder.tenantId;
        this.validDays = builder.validDays;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcubeUpgradePackageRequest create() {
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
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return appstoreUrl
     */
    public String getAppstoreUrl() {
        return this.appstoreUrl;
    }

    /**
     * @return bundleId
     */
    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * @return customDomainName
     */
    public String getCustomDomainName() {
        return this.customDomainName;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return iconFileUrl
     */
    public String getIconFileUrl() {
        return this.iconFileUrl;
    }

    /**
     * @return installAmount
     */
    public Integer getInstallAmount() {
        return this.installAmount;
    }

    /**
     * @return iosSymbolfileUrl
     */
    public String getIosSymbolfileUrl() {
        return this.iosSymbolfileUrl;
    }

    /**
     * @return isEnterprise
     */
    public Integer getIsEnterprise() {
        return this.isEnterprise;
    }

    /**
     * @return needCheck
     */
    public Integer getNeedCheck() {
        return this.needCheck;
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return validDays
     */
    public Integer getValidDays() {
        return this.validDays;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateMcubeUpgradePackageRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String appVersion; 
        private String appstoreUrl; 
        private String bundleId; 
        private String customDomainName; 
        private String desc; 
        private String downloadUrl; 
        private String fileUrl; 
        private String iconFileUrl; 
        private Integer installAmount; 
        private String iosSymbolfileUrl; 
        private Integer isEnterprise; 
        private Integer needCheck; 
        private Boolean onexFlag; 
        private String platform; 
        private String tenantId; 
        private Integer validDays; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMcubeUpgradePackageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.appVersion = request.appVersion;
            this.appstoreUrl = request.appstoreUrl;
            this.bundleId = request.bundleId;
            this.customDomainName = request.customDomainName;
            this.desc = request.desc;
            this.downloadUrl = request.downloadUrl;
            this.fileUrl = request.fileUrl;
            this.iconFileUrl = request.iconFileUrl;
            this.installAmount = request.installAmount;
            this.iosSymbolfileUrl = request.iosSymbolfileUrl;
            this.isEnterprise = request.isEnterprise;
            this.needCheck = request.needCheck;
            this.onexFlag = request.onexFlag;
            this.platform = request.platform;
            this.tenantId = request.tenantId;
            this.validDays = request.validDays;
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
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putBodyParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * AppstoreUrl.
         */
        public Builder appstoreUrl(String appstoreUrl) {
            this.putBodyParameter("AppstoreUrl", appstoreUrl);
            this.appstoreUrl = appstoreUrl;
            return this;
        }

        /**
         * BundleId.
         */
        public Builder bundleId(String bundleId) {
            this.putBodyParameter("BundleId", bundleId);
            this.bundleId = bundleId;
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
         * Desc.
         */
        public Builder desc(String desc) {
            this.putBodyParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * DownloadUrl.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.putBodyParameter("DownloadUrl", downloadUrl);
            this.downloadUrl = downloadUrl;
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
         * IconFileUrl.
         */
        public Builder iconFileUrl(String iconFileUrl) {
            this.putBodyParameter("IconFileUrl", iconFileUrl);
            this.iconFileUrl = iconFileUrl;
            return this;
        }

        /**
         * InstallAmount.
         */
        public Builder installAmount(Integer installAmount) {
            this.putBodyParameter("InstallAmount", installAmount);
            this.installAmount = installAmount;
            return this;
        }

        /**
         * IosSymbolfileUrl.
         */
        public Builder iosSymbolfileUrl(String iosSymbolfileUrl) {
            this.putBodyParameter("IosSymbolfileUrl", iosSymbolfileUrl);
            this.iosSymbolfileUrl = iosSymbolfileUrl;
            return this;
        }

        /**
         * IsEnterprise.
         */
        public Builder isEnterprise(Integer isEnterprise) {
            this.putBodyParameter("IsEnterprise", isEnterprise);
            this.isEnterprise = isEnterprise;
            return this;
        }

        /**
         * NeedCheck.
         */
        public Builder needCheck(Integer needCheck) {
            this.putBodyParameter("NeedCheck", needCheck);
            this.needCheck = needCheck;
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
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * ValidDays.
         */
        public Builder validDays(Integer validDays) {
            this.putBodyParameter("ValidDays", validDays);
            this.validDays = validDays;
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
        public CreateMcubeUpgradePackageRequest build() {
            return new CreateMcubeUpgradePackageRequest(this);
        } 

    } 

}
