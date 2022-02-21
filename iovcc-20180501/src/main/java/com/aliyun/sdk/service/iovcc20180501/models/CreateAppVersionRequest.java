// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateAppVersionRequest</p>
 */
public class CreateAppVersionRequest extends Request {
    @Query
    @NameInMap("ApkMd5")
    private String apkMd5;

    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("AppVersion")
    private String appVersion;

    @Query
    @NameInMap("BlackVersionList")
    private String blackVersionList;

    @Query
    @NameInMap("DeviceAdapterList")
    private String deviceAdapterList;

    @Query
    @NameInMap("InstallType")
    private String installType;

    @Query
    @NameInMap("IsAllowNewInstall")
    private String isAllowNewInstall;

    @Query
    @NameInMap("IsForceUpgrade")
    private String isForceUpgrade;

    @Query
    @NameInMap("IsNeedRestart")
    private String isNeedRestart;

    @Query
    @NameInMap("IsSilentUpgrade")
    private String isSilentUpgrade;

    @Query
    @NameInMap("PackageUrl")
    private String packageUrl;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReleaseNote")
    private String releaseNote;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("RestartAppParam")
    private String restartAppParam;

    @Query
    @NameInMap("RestartAppType")
    private String restartAppType;

    @Query
    @NameInMap("RestartType")
    private String restartType;

    @Query
    @NameInMap("VersionCode")
    private String versionCode;

    @Query
    @NameInMap("WhiteVersionList")
    private String whiteVersionList;

    private CreateAppVersionRequest(Builder builder) {
        super(builder);
        this.apkMd5 = builder.apkMd5;
        this.appId = builder.appId;
        this.appVersion = builder.appVersion;
        this.blackVersionList = builder.blackVersionList;
        this.deviceAdapterList = builder.deviceAdapterList;
        this.installType = builder.installType;
        this.isAllowNewInstall = builder.isAllowNewInstall;
        this.isForceUpgrade = builder.isForceUpgrade;
        this.isNeedRestart = builder.isNeedRestart;
        this.isSilentUpgrade = builder.isSilentUpgrade;
        this.packageUrl = builder.packageUrl;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.releaseNote = builder.releaseNote;
        this.remark = builder.remark;
        this.restartAppParam = builder.restartAppParam;
        this.restartAppType = builder.restartAppType;
        this.restartType = builder.restartType;
        this.versionCode = builder.versionCode;
        this.whiteVersionList = builder.whiteVersionList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apkMd5
     */
    public String getApkMd5() {
        return this.apkMd5;
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
     * @return blackVersionList
     */
    public String getBlackVersionList() {
        return this.blackVersionList;
    }

    /**
     * @return deviceAdapterList
     */
    public String getDeviceAdapterList() {
        return this.deviceAdapterList;
    }

    /**
     * @return installType
     */
    public String getInstallType() {
        return this.installType;
    }

    /**
     * @return isAllowNewInstall
     */
    public String getIsAllowNewInstall() {
        return this.isAllowNewInstall;
    }

    /**
     * @return isForceUpgrade
     */
    public String getIsForceUpgrade() {
        return this.isForceUpgrade;
    }

    /**
     * @return isNeedRestart
     */
    public String getIsNeedRestart() {
        return this.isNeedRestart;
    }

    /**
     * @return isSilentUpgrade
     */
    public String getIsSilentUpgrade() {
        return this.isSilentUpgrade;
    }

    /**
     * @return packageUrl
     */
    public String getPackageUrl() {
        return this.packageUrl;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return releaseNote
     */
    public String getReleaseNote() {
        return this.releaseNote;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return restartAppParam
     */
    public String getRestartAppParam() {
        return this.restartAppParam;
    }

    /**
     * @return restartAppType
     */
    public String getRestartAppType() {
        return this.restartAppType;
    }

    /**
     * @return restartType
     */
    public String getRestartType() {
        return this.restartType;
    }

    /**
     * @return versionCode
     */
    public String getVersionCode() {
        return this.versionCode;
    }

    /**
     * @return whiteVersionList
     */
    public String getWhiteVersionList() {
        return this.whiteVersionList;
    }

    public static final class Builder extends Request.Builder<CreateAppVersionRequest, Builder> {
        private String apkMd5; 
        private String appId; 
        private String appVersion; 
        private String blackVersionList; 
        private String deviceAdapterList; 
        private String installType; 
        private String isAllowNewInstall; 
        private String isForceUpgrade; 
        private String isNeedRestart; 
        private String isSilentUpgrade; 
        private String packageUrl; 
        private String projectId; 
        private String regionId; 
        private String releaseNote; 
        private String remark; 
        private String restartAppParam; 
        private String restartAppType; 
        private String restartType; 
        private String versionCode; 
        private String whiteVersionList; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppVersionRequest response) {
            super(response);
            this.apkMd5 = response.apkMd5;
            this.appId = response.appId;
            this.appVersion = response.appVersion;
            this.blackVersionList = response.blackVersionList;
            this.deviceAdapterList = response.deviceAdapterList;
            this.installType = response.installType;
            this.isAllowNewInstall = response.isAllowNewInstall;
            this.isForceUpgrade = response.isForceUpgrade;
            this.isNeedRestart = response.isNeedRestart;
            this.isSilentUpgrade = response.isSilentUpgrade;
            this.packageUrl = response.packageUrl;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.releaseNote = response.releaseNote;
            this.remark = response.remark;
            this.restartAppParam = response.restartAppParam;
            this.restartAppType = response.restartAppType;
            this.restartType = response.restartType;
            this.versionCode = response.versionCode;
            this.whiteVersionList = response.whiteVersionList;
        } 

        /**
         * ApkMd5.
         */
        public Builder apkMd5(String apkMd5) {
            this.putQueryParameter("ApkMd5", apkMd5);
            this.apkMd5 = apkMd5;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * BlackVersionList.
         */
        public Builder blackVersionList(String blackVersionList) {
            this.putQueryParameter("BlackVersionList", blackVersionList);
            this.blackVersionList = blackVersionList;
            return this;
        }

        /**
         * DeviceAdapterList.
         */
        public Builder deviceAdapterList(String deviceAdapterList) {
            this.putQueryParameter("DeviceAdapterList", deviceAdapterList);
            this.deviceAdapterList = deviceAdapterList;
            return this;
        }

        /**
         * InstallType.
         */
        public Builder installType(String installType) {
            this.putQueryParameter("InstallType", installType);
            this.installType = installType;
            return this;
        }

        /**
         * IsAllowNewInstall.
         */
        public Builder isAllowNewInstall(String isAllowNewInstall) {
            this.putQueryParameter("IsAllowNewInstall", isAllowNewInstall);
            this.isAllowNewInstall = isAllowNewInstall;
            return this;
        }

        /**
         * IsForceUpgrade.
         */
        public Builder isForceUpgrade(String isForceUpgrade) {
            this.putQueryParameter("IsForceUpgrade", isForceUpgrade);
            this.isForceUpgrade = isForceUpgrade;
            return this;
        }

        /**
         * IsNeedRestart.
         */
        public Builder isNeedRestart(String isNeedRestart) {
            this.putQueryParameter("IsNeedRestart", isNeedRestart);
            this.isNeedRestart = isNeedRestart;
            return this;
        }

        /**
         * IsSilentUpgrade.
         */
        public Builder isSilentUpgrade(String isSilentUpgrade) {
            this.putQueryParameter("IsSilentUpgrade", isSilentUpgrade);
            this.isSilentUpgrade = isSilentUpgrade;
            return this;
        }

        /**
         * PackageUrl.
         */
        public Builder packageUrl(String packageUrl) {
            this.putQueryParameter("PackageUrl", packageUrl);
            this.packageUrl = packageUrl;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
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
         * ReleaseNote.
         */
        public Builder releaseNote(String releaseNote) {
            this.putQueryParameter("ReleaseNote", releaseNote);
            this.releaseNote = releaseNote;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * RestartAppParam.
         */
        public Builder restartAppParam(String restartAppParam) {
            this.putQueryParameter("RestartAppParam", restartAppParam);
            this.restartAppParam = restartAppParam;
            return this;
        }

        /**
         * RestartAppType.
         */
        public Builder restartAppType(String restartAppType) {
            this.putQueryParameter("RestartAppType", restartAppType);
            this.restartAppType = restartAppType;
            return this;
        }

        /**
         * RestartType.
         */
        public Builder restartType(String restartType) {
            this.putQueryParameter("RestartType", restartType);
            this.restartType = restartType;
            return this;
        }

        /**
         * VersionCode.
         */
        public Builder versionCode(String versionCode) {
            this.putQueryParameter("VersionCode", versionCode);
            this.versionCode = versionCode;
            return this;
        }

        /**
         * WhiteVersionList.
         */
        public Builder whiteVersionList(String whiteVersionList) {
            this.putQueryParameter("WhiteVersionList", whiteVersionList);
            this.whiteVersionList = whiteVersionList;
            return this;
        }

        @Override
        public CreateAppVersionRequest build() {
            return new CreateAppVersionRequest(this);
        } 

    } 

}
