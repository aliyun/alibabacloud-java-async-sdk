// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindAppVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>FindAppVersionsResponseBody</p>
 */
public class FindAppVersionsResponseBody extends TeaModel {
    @NameInMap("AppVersionList")
    private AppVersionList appVersionList;

    @NameInMap("RequestId")
    private String requestId;

    private FindAppVersionsResponseBody(Builder builder) {
        this.appVersionList = builder.appVersionList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindAppVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return appVersionList
     */
    public AppVersionList getAppVersionList() {
        return this.appVersionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppVersionList appVersionList; 
        private String requestId; 

        /**
         * AppVersionList.
         */
        public Builder appVersionList(AppVersionList appVersionList) {
            this.appVersionList = appVersionList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FindAppVersionsResponseBody build() {
            return new FindAppVersionsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AppPackageName")
        private String appPackageName;

        @NameInMap("AppVersion")
        private String appVersion;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @NameInMap("GmtModify")
        private String gmtModify;

        @NameInMap("GmtModifyTimestamp")
        private Long gmtModifyTimestamp;

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

        @NameInMap("RestartAppParam")
        private String restartAppParam;

        @NameInMap("RestartAppType")
        private String restartAppType;

        @NameInMap("RestartType")
        private String restartType;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusName")
        private String statusName;

        @NameInMap("VersionCode")
        private String versionCode;

        private Items(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appPackageName = builder.appPackageName;
            this.appVersion = builder.appVersion;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModify = builder.gmtModify;
            this.gmtModifyTimestamp = builder.gmtModifyTimestamp;
            this.id = builder.id;
            this.installType = builder.installType;
            this.isAllowNewInstall = builder.isAllowNewInstall;
            this.isForceUpgrade = builder.isForceUpgrade;
            this.isNeedRestart = builder.isNeedRestart;
            this.isSilentUpgrade = builder.isSilentUpgrade;
            this.restartAppParam = builder.restartAppParam;
            this.restartAppType = builder.restartAppType;
            this.restartType = builder.restartType;
            this.status = builder.status;
            this.statusName = builder.statusName;
            this.versionCode = builder.versionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
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
         * @return appPackageName
         */
        public String getAppPackageName() {
            return this.appPackageName;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtCreateTimestamp
         */
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return gmtModifyTimestamp
         */
        public Long getGmtModifyTimestamp() {
            return this.gmtModifyTimestamp;
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
        public String getVersionCode() {
            return this.versionCode;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String appPackageName; 
            private String appVersion; 
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private String gmtModify; 
            private Long gmtModifyTimestamp; 
            private Long id; 
            private String installType; 
            private String isAllowNewInstall; 
            private String isForceUpgrade; 
            private String isNeedRestart; 
            private String isSilentUpgrade; 
            private String restartAppParam; 
            private String restartAppType; 
            private String restartType; 
            private String status; 
            private String statusName; 
            private String versionCode; 

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
             * AppPackageName.
             */
            public Builder appPackageName(String appPackageName) {
                this.appPackageName = appPackageName;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtCreateTimestamp.
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
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
             * GmtModifyTimestamp.
             */
            public Builder gmtModifyTimestamp(Long gmtModifyTimestamp) {
                this.gmtModifyTimestamp = gmtModifyTimestamp;
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
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class AppVersionList extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private AppVersionList(Builder builder) {
            this.items = builder.items;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppVersionList create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private Integer totalCount; 

            /**
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public AppVersionList build() {
                return new AppVersionList(this);
            } 

        } 

    }
}
