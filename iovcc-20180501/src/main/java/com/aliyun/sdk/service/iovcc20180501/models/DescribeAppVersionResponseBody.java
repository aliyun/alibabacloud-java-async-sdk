// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppVersionResponseBody</p>
 */
public class DescribeAppVersionResponseBody extends TeaModel {
    @NameInMap("AppVersion")
    private AppVersion appVersion;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAppVersionResponseBody(Builder builder) {
        this.appVersion = builder.appVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return appVersion
     */
    public AppVersion getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppVersion appVersion; 
        private String requestId; 

        /**
         * AppVersion.
         */
        public Builder appVersion(AppVersion appVersion) {
            this.appVersion = appVersion;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAppVersionResponseBody build() {
            return new DescribeAppVersionResponseBody(this);
        } 

    } 

    public static class Adapters extends TeaModel {
        @NameInMap("DeviceModelId")
        private String deviceModelId;

        @NameInMap("DeviceModelName")
        private String deviceModelName;

        @NameInMap("Id")
        private Long id;

        @NameInMap("MaxOsVersion")
        private String maxOsVersion;

        @NameInMap("MinOsVersion")
        private String minOsVersion;

        @NameInMap("VersionId")
        private Long versionId;

        private Adapters(Builder builder) {
            this.deviceModelId = builder.deviceModelId;
            this.deviceModelName = builder.deviceModelName;
            this.id = builder.id;
            this.maxOsVersion = builder.maxOsVersion;
            this.minOsVersion = builder.minOsVersion;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Adapters create() {
            return builder().build();
        }

        /**
         * @return deviceModelId
         */
        public String getDeviceModelId() {
            return this.deviceModelId;
        }

        /**
         * @return deviceModelName
         */
        public String getDeviceModelName() {
            return this.deviceModelName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return maxOsVersion
         */
        public String getMaxOsVersion() {
            return this.maxOsVersion;
        }

        /**
         * @return minOsVersion
         */
        public String getMinOsVersion() {
            return this.minOsVersion;
        }

        /**
         * @return versionId
         */
        public Long getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String deviceModelId; 
            private String deviceModelName; 
            private Long id; 
            private String maxOsVersion; 
            private String minOsVersion; 
            private Long versionId; 

            /**
             * DeviceModelId.
             */
            public Builder deviceModelId(String deviceModelId) {
                this.deviceModelId = deviceModelId;
                return this;
            }

            /**
             * DeviceModelName.
             */
            public Builder deviceModelName(String deviceModelName) {
                this.deviceModelName = deviceModelName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * MaxOsVersion.
             */
            public Builder maxOsVersion(String maxOsVersion) {
                this.maxOsVersion = maxOsVersion;
                return this;
            }

            /**
             * MinOsVersion.
             */
            public Builder minOsVersion(String minOsVersion) {
                this.minOsVersion = minOsVersion;
                return this;
            }

            /**
             * VersionId.
             */
            public Builder versionId(Long versionId) {
                this.versionId = versionId;
                return this;
            }

            public Adapters build() {
                return new Adapters(this);
            } 

        } 

    }
    public static class AppVersion extends TeaModel {
        @NameInMap("Adapters")
        private java.util.List < Adapters> adapters;

        @NameInMap("ApkMd5")
        private String apkMd5;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AppVersion")
        private String appVersion;

        @NameInMap("BlackVersionList")
        private String blackVersionList;

        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModify")
        private String gmtModify;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstallType")
        private String installType;

        @NameInMap("IsAllowNewInstall")
        private String isAllowNewInstall;

        @NameInMap("IsForceUpgrade")
        private String isForceUpgrade;

        @NameInMap("IsNeedRestart")
        private String isNeedRestart;

        @NameInMap("IsSilentUpgrade")
        private String isSilentUpgrade;

        @NameInMap("Md5")
        private String md5;

        @NameInMap("OriginalUrl")
        private String originalUrl;

        @NameInMap("PackageName")
        private String packageName;

        @NameInMap("ReleaseNote")
        private String releaseNote;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("RestartAppParam")
        private String restartAppParam;

        @NameInMap("RestartAppType")
        private String restartAppType;

        @NameInMap("RestartType")
        private String restartType;

        @NameInMap("Size")
        private String size;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusName")
        private String statusName;

        @NameInMap("VersionCode")
        private Long versionCode;

        @NameInMap("WhiteVersionList")
        private String whiteVersionList;

        private AppVersion(Builder builder) {
            this.adapters = builder.adapters;
            this.apkMd5 = builder.apkMd5;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appVersion = builder.appVersion;
            this.blackVersionList = builder.blackVersionList;
            this.downloadUrl = builder.downloadUrl;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.id = builder.id;
            this.installType = builder.installType;
            this.isAllowNewInstall = builder.isAllowNewInstall;
            this.isForceUpgrade = builder.isForceUpgrade;
            this.isNeedRestart = builder.isNeedRestart;
            this.isSilentUpgrade = builder.isSilentUpgrade;
            this.md5 = builder.md5;
            this.originalUrl = builder.originalUrl;
            this.packageName = builder.packageName;
            this.releaseNote = builder.releaseNote;
            this.remark = builder.remark;
            this.restartAppParam = builder.restartAppParam;
            this.restartAppType = builder.restartAppType;
            this.restartType = builder.restartType;
            this.size = builder.size;
            this.status = builder.status;
            this.statusName = builder.statusName;
            this.versionCode = builder.versionCode;
            this.whiteVersionList = builder.whiteVersionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppVersion create() {
            return builder().build();
        }

        /**
         * @return adapters
         */
        public java.util.List < Adapters> getAdapters() {
            return this.adapters;
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
         * @return appName
         */
        public String getAppName() {
            return this.appName;
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
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return originalUrl
         */
        public String getOriginalUrl() {
            return this.originalUrl;
        }

        /**
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
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
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusName
         */
        public String getStatusName() {
            return this.statusName;
        }

        /**
         * @return versionCode
         */
        public Long getVersionCode() {
            return this.versionCode;
        }

        /**
         * @return whiteVersionList
         */
        public String getWhiteVersionList() {
            return this.whiteVersionList;
        }

        public static final class Builder {
            private java.util.List < Adapters> adapters; 
            private String apkMd5; 
            private String appId; 
            private String appName; 
            private String appVersion; 
            private String blackVersionList; 
            private String downloadUrl; 
            private String gmtCreate; 
            private String gmtModify; 
            private Long id; 
            private String installType; 
            private String isAllowNewInstall; 
            private String isForceUpgrade; 
            private String isNeedRestart; 
            private String isSilentUpgrade; 
            private String md5; 
            private String originalUrl; 
            private String packageName; 
            private String releaseNote; 
            private String remark; 
            private String restartAppParam; 
            private String restartAppType; 
            private String restartType; 
            private String size; 
            private String status; 
            private String statusName; 
            private Long versionCode; 
            private String whiteVersionList; 

            /**
             * Adapters.
             */
            public Builder adapters(java.util.List < Adapters> adapters) {
                this.adapters = adapters;
                return this;
            }

            /**
             * ApkMd5.
             */
            public Builder apkMd5(String apkMd5) {
                this.apkMd5 = apkMd5;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * BlackVersionList.
             */
            public Builder blackVersionList(String blackVersionList) {
                this.blackVersionList = blackVersionList;
                return this;
            }

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InstallType.
             */
            public Builder installType(String installType) {
                this.installType = installType;
                return this;
            }

            /**
             * IsAllowNewInstall.
             */
            public Builder isAllowNewInstall(String isAllowNewInstall) {
                this.isAllowNewInstall = isAllowNewInstall;
                return this;
            }

            /**
             * IsForceUpgrade.
             */
            public Builder isForceUpgrade(String isForceUpgrade) {
                this.isForceUpgrade = isForceUpgrade;
                return this;
            }

            /**
             * IsNeedRestart.
             */
            public Builder isNeedRestart(String isNeedRestart) {
                this.isNeedRestart = isNeedRestart;
                return this;
            }

            /**
             * IsSilentUpgrade.
             */
            public Builder isSilentUpgrade(String isSilentUpgrade) {
                this.isSilentUpgrade = isSilentUpgrade;
                return this;
            }

            /**
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * OriginalUrl.
             */
            public Builder originalUrl(String originalUrl) {
                this.originalUrl = originalUrl;
                return this;
            }

            /**
             * PackageName.
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * ReleaseNote.
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * RestartAppParam.
             */
            public Builder restartAppParam(String restartAppParam) {
                this.restartAppParam = restartAppParam;
                return this;
            }

            /**
             * RestartAppType.
             */
            public Builder restartAppType(String restartAppType) {
                this.restartAppType = restartAppType;
                return this;
            }

            /**
             * RestartType.
             */
            public Builder restartType(String restartType) {
                this.restartType = restartType;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusName.
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * VersionCode.
             */
            public Builder versionCode(Long versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            /**
             * WhiteVersionList.
             */
            public Builder whiteVersionList(String whiteVersionList) {
                this.whiteVersionList = whiteVersionList;
                return this;
            }

            public AppVersion build() {
                return new AppVersion(this);
            } 

        } 

    }
}
