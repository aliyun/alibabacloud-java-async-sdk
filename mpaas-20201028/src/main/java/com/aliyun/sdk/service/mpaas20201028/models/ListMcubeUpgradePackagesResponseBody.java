// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMcubeUpgradePackagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMcubeUpgradePackagesResponseBody</p>
 */
public class ListMcubeUpgradePackagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ListPackagesResult")
    private ListPackagesResult listPackagesResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private ListMcubeUpgradePackagesResponseBody(Builder builder) {
        this.listPackagesResult = builder.listPackagesResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcubeUpgradePackagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return listPackagesResult
     */
    public ListPackagesResult getListPackagesResult() {
        return this.listPackagesResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private ListPackagesResult listPackagesResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * ListPackagesResult.
         */
        public Builder listPackagesResult(ListPackagesResult listPackagesResult) {
            this.listPackagesResult = listPackagesResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public ListMcubeUpgradePackagesResponseBody build() {
            return new ListMcubeUpgradePackagesResponseBody(this);
        } 

    } 

    public static class Packages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowCreateTask")
        private Boolean allowCreateTask;

        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("AppstoreUrl")
        private String appstoreUrl;

        @com.aliyun.core.annotation.NameInMap("BackLog")
        private String backLog;

        @com.aliyun.core.annotation.NameInMap("ChangeLog")
        private String changeLog;

        @com.aliyun.core.annotation.NameInMap("ClientFileSize")
        private Integer clientFileSize;

        @com.aliyun.core.annotation.NameInMap("ClientName")
        private String clientName;

        @com.aliyun.core.annotation.NameInMap("CpId")
        private String cpId;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("GlobalVariables")
        private String globalVariables;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtCreateStr")
        private String gmtCreateStr;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedStr")
        private String gmtModifiedStr;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InnerVersion")
        private String innerVersion;

        @com.aliyun.core.annotation.NameInMap("IosSymbol")
        private String iosSymbol;

        @com.aliyun.core.annotation.NameInMap("IsEnterprise")
        private Integer isEnterprise;

        @com.aliyun.core.annotation.NameInMap("IsRc")
        private Integer isRc;

        @com.aliyun.core.annotation.NameInMap("IsRelease")
        private Integer isRelease;

        @com.aliyun.core.annotation.NameInMap("MaxVersion")
        private String maxVersion;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("NeedCheck")
        private Integer needCheck;

        @com.aliyun.core.annotation.NameInMap("OssPath")
        private String ossPath;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("ProductVersion")
        private String productVersion;

        @com.aliyun.core.annotation.NameInMap("PublishPeriod")
        private Integer publishPeriod;

        @com.aliyun.core.annotation.NameInMap("QrcodeUrl")
        private String qrcodeUrl;

        @com.aliyun.core.annotation.NameInMap("ReleaseType")
        private String releaseType;

        @com.aliyun.core.annotation.NameInMap("ReleaseWindow")
        private String releaseWindow;

        @com.aliyun.core.annotation.NameInMap("ScmDownloadUrl")
        private String scmDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("ServerVersion")
        private Integer serverVersion;

        @com.aliyun.core.annotation.NameInMap("VerificationCode")
        private String verificationCode;

        @com.aliyun.core.annotation.NameInMap("VerifyResult")
        private Integer verifyResult;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        private String versionCode;

        private Packages(Builder builder) {
            this.allowCreateTask = builder.allowCreateTask;
            this.appCode = builder.appCode;
            this.appstoreUrl = builder.appstoreUrl;
            this.backLog = builder.backLog;
            this.changeLog = builder.changeLog;
            this.clientFileSize = builder.clientFileSize;
            this.clientName = builder.clientName;
            this.cpId = builder.cpId;
            this.creator = builder.creator;
            this.downloadUrl = builder.downloadUrl;
            this.globalVariables = builder.globalVariables;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateStr = builder.gmtCreateStr;
            this.gmtModified = builder.gmtModified;
            this.gmtModifiedStr = builder.gmtModifiedStr;
            this.id = builder.id;
            this.innerVersion = builder.innerVersion;
            this.iosSymbol = builder.iosSymbol;
            this.isEnterprise = builder.isEnterprise;
            this.isRc = builder.isRc;
            this.isRelease = builder.isRelease;
            this.maxVersion = builder.maxVersion;
            this.md5 = builder.md5;
            this.modifier = builder.modifier;
            this.needCheck = builder.needCheck;
            this.ossPath = builder.ossPath;
            this.packageType = builder.packageType;
            this.platform = builder.platform;
            this.productId = builder.productId;
            this.productName = builder.productName;
            this.productVersion = builder.productVersion;
            this.publishPeriod = builder.publishPeriod;
            this.qrcodeUrl = builder.qrcodeUrl;
            this.releaseType = builder.releaseType;
            this.releaseWindow = builder.releaseWindow;
            this.scmDownloadUrl = builder.scmDownloadUrl;
            this.serverVersion = builder.serverVersion;
            this.verificationCode = builder.verificationCode;
            this.verifyResult = builder.verifyResult;
            this.versionCode = builder.versionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Packages create() {
            return builder().build();
        }

        /**
         * @return allowCreateTask
         */
        public Boolean getAllowCreateTask() {
            return this.allowCreateTask;
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return appstoreUrl
         */
        public String getAppstoreUrl() {
            return this.appstoreUrl;
        }

        /**
         * @return backLog
         */
        public String getBackLog() {
            return this.backLog;
        }

        /**
         * @return changeLog
         */
        public String getChangeLog() {
            return this.changeLog;
        }

        /**
         * @return clientFileSize
         */
        public Integer getClientFileSize() {
            return this.clientFileSize;
        }

        /**
         * @return clientName
         */
        public String getClientName() {
            return this.clientName;
        }

        /**
         * @return cpId
         */
        public String getCpId() {
            return this.cpId;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return globalVariables
         */
        public String getGlobalVariables() {
            return this.globalVariables;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtCreateStr
         */
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtModifiedStr
         */
        public String getGmtModifiedStr() {
            return this.gmtModifiedStr;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return innerVersion
         */
        public String getInnerVersion() {
            return this.innerVersion;
        }

        /**
         * @return iosSymbol
         */
        public String getIosSymbol() {
            return this.iosSymbol;
        }

        /**
         * @return isEnterprise
         */
        public Integer getIsEnterprise() {
            return this.isEnterprise;
        }

        /**
         * @return isRc
         */
        public Integer getIsRc() {
            return this.isRc;
        }

        /**
         * @return isRelease
         */
        public Integer getIsRelease() {
            return this.isRelease;
        }

        /**
         * @return maxVersion
         */
        public String getMaxVersion() {
            return this.maxVersion;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return needCheck
         */
        public Integer getNeedCheck() {
            return this.needCheck;
        }

        /**
         * @return ossPath
         */
        public String getOssPath() {
            return this.ossPath;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productVersion
         */
        public String getProductVersion() {
            return this.productVersion;
        }

        /**
         * @return publishPeriod
         */
        public Integer getPublishPeriod() {
            return this.publishPeriod;
        }

        /**
         * @return qrcodeUrl
         */
        public String getQrcodeUrl() {
            return this.qrcodeUrl;
        }

        /**
         * @return releaseType
         */
        public String getReleaseType() {
            return this.releaseType;
        }

        /**
         * @return releaseWindow
         */
        public String getReleaseWindow() {
            return this.releaseWindow;
        }

        /**
         * @return scmDownloadUrl
         */
        public String getScmDownloadUrl() {
            return this.scmDownloadUrl;
        }

        /**
         * @return serverVersion
         */
        public Integer getServerVersion() {
            return this.serverVersion;
        }

        /**
         * @return verificationCode
         */
        public String getVerificationCode() {
            return this.verificationCode;
        }

        /**
         * @return verifyResult
         */
        public Integer getVerifyResult() {
            return this.verifyResult;
        }

        /**
         * @return versionCode
         */
        public String getVersionCode() {
            return this.versionCode;
        }

        public static final class Builder {
            private Boolean allowCreateTask; 
            private String appCode; 
            private String appstoreUrl; 
            private String backLog; 
            private String changeLog; 
            private Integer clientFileSize; 
            private String clientName; 
            private String cpId; 
            private String creator; 
            private String downloadUrl; 
            private String globalVariables; 
            private String gmtCreate; 
            private String gmtCreateStr; 
            private String gmtModified; 
            private String gmtModifiedStr; 
            private Long id; 
            private String innerVersion; 
            private String iosSymbol; 
            private Integer isEnterprise; 
            private Integer isRc; 
            private Integer isRelease; 
            private String maxVersion; 
            private String md5; 
            private String modifier; 
            private Integer needCheck; 
            private String ossPath; 
            private String packageType; 
            private String platform; 
            private String productId; 
            private String productName; 
            private String productVersion; 
            private Integer publishPeriod; 
            private String qrcodeUrl; 
            private String releaseType; 
            private String releaseWindow; 
            private String scmDownloadUrl; 
            private Integer serverVersion; 
            private String verificationCode; 
            private Integer verifyResult; 
            private String versionCode; 

            /**
             * AllowCreateTask.
             */
            public Builder allowCreateTask(Boolean allowCreateTask) {
                this.allowCreateTask = allowCreateTask;
                return this;
            }

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * AppstoreUrl.
             */
            public Builder appstoreUrl(String appstoreUrl) {
                this.appstoreUrl = appstoreUrl;
                return this;
            }

            /**
             * BackLog.
             */
            public Builder backLog(String backLog) {
                this.backLog = backLog;
                return this;
            }

            /**
             * ChangeLog.
             */
            public Builder changeLog(String changeLog) {
                this.changeLog = changeLog;
                return this;
            }

            /**
             * ClientFileSize.
             */
            public Builder clientFileSize(Integer clientFileSize) {
                this.clientFileSize = clientFileSize;
                return this;
            }

            /**
             * ClientName.
             */
            public Builder clientName(String clientName) {
                this.clientName = clientName;
                return this;
            }

            /**
             * CpId.
             */
            public Builder cpId(String cpId) {
                this.cpId = cpId;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
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
             * GlobalVariables.
             */
            public Builder globalVariables(String globalVariables) {
                this.globalVariables = globalVariables;
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
             * GmtCreateStr.
             */
            public Builder gmtCreateStr(String gmtCreateStr) {
                this.gmtCreateStr = gmtCreateStr;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GmtModifiedStr.
             */
            public Builder gmtModifiedStr(String gmtModifiedStr) {
                this.gmtModifiedStr = gmtModifiedStr;
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
             * InnerVersion.
             */
            public Builder innerVersion(String innerVersion) {
                this.innerVersion = innerVersion;
                return this;
            }

            /**
             * IosSymbol.
             */
            public Builder iosSymbol(String iosSymbol) {
                this.iosSymbol = iosSymbol;
                return this;
            }

            /**
             * IsEnterprise.
             */
            public Builder isEnterprise(Integer isEnterprise) {
                this.isEnterprise = isEnterprise;
                return this;
            }

            /**
             * IsRc.
             */
            public Builder isRc(Integer isRc) {
                this.isRc = isRc;
                return this;
            }

            /**
             * IsRelease.
             */
            public Builder isRelease(Integer isRelease) {
                this.isRelease = isRelease;
                return this;
            }

            /**
             * MaxVersion.
             */
            public Builder maxVersion(String maxVersion) {
                this.maxVersion = maxVersion;
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
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * NeedCheck.
             */
            public Builder needCheck(Integer needCheck) {
                this.needCheck = needCheck;
                return this;
            }

            /**
             * OssPath.
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * ProductVersion.
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
                return this;
            }

            /**
             * PublishPeriod.
             */
            public Builder publishPeriod(Integer publishPeriod) {
                this.publishPeriod = publishPeriod;
                return this;
            }

            /**
             * QrcodeUrl.
             */
            public Builder qrcodeUrl(String qrcodeUrl) {
                this.qrcodeUrl = qrcodeUrl;
                return this;
            }

            /**
             * ReleaseType.
             */
            public Builder releaseType(String releaseType) {
                this.releaseType = releaseType;
                return this;
            }

            /**
             * ReleaseWindow.
             */
            public Builder releaseWindow(String releaseWindow) {
                this.releaseWindow = releaseWindow;
                return this;
            }

            /**
             * ScmDownloadUrl.
             */
            public Builder scmDownloadUrl(String scmDownloadUrl) {
                this.scmDownloadUrl = scmDownloadUrl;
                return this;
            }

            /**
             * ServerVersion.
             */
            public Builder serverVersion(Integer serverVersion) {
                this.serverVersion = serverVersion;
                return this;
            }

            /**
             * VerificationCode.
             */
            public Builder verificationCode(String verificationCode) {
                this.verificationCode = verificationCode;
                return this;
            }

            /**
             * VerifyResult.
             */
            public Builder verifyResult(Integer verifyResult) {
                this.verifyResult = verifyResult;
                return this;
            }

            /**
             * VersionCode.
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            public Packages build() {
                return new Packages(this);
            } 

        } 

    }
    public static class ListPackagesResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("Packages")
        private java.util.List < Packages> packages;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private ListPackagesResult(Builder builder) {
            this.currentPage = builder.currentPage;
            this.errorCode = builder.errorCode;
            this.hasMore = builder.hasMore;
            this.packages = builder.packages;
            this.pageSize = builder.pageSize;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListPackagesResult create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return packages
         */
        public java.util.List < Packages> getPackages() {
            return this.packages;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return resultMsg
         */
        public String getResultMsg() {
            return this.resultMsg;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private String errorCode; 
            private Boolean hasMore; 
            private java.util.List < Packages> packages; 
            private Integer pageSize; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 
            private Long totalCount; 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * HasMore.
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * Packages.
             */
            public Builder packages(java.util.List < Packages> packages) {
                this.packages = packages;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * ResultMsg.
             */
            public Builder resultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ListPackagesResult build() {
                return new ListPackagesResult(this);
            } 

        } 

    }
}
