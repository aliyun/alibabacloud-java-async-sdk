// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20200710.models;

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
 * {@link GetMcubeUpgradePackageInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetMcubeUpgradePackageInfoResponseBody</p>
 */
public class GetMcubeUpgradePackageInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GetPackageResult")
    private GetPackageResult getPackageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private GetMcubeUpgradePackageInfoResponseBody(Builder builder) {
        this.getPackageResult = builder.getPackageResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMcubeUpgradePackageInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return getPackageResult
     */
    public GetPackageResult getGetPackageResult() {
        return this.getPackageResult;
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
        private GetPackageResult getPackageResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        private Builder() {
        } 

        private Builder(GetMcubeUpgradePackageInfoResponseBody model) {
            this.getPackageResult = model.getPackageResult;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMessage = model.resultMessage;
        } 

        /**
         * GetPackageResult.
         */
        public Builder getPackageResult(GetPackageResult getPackageResult) {
            this.getPackageResult = getPackageResult;
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

        public GetMcubeUpgradePackageInfoResponseBody build() {
            return new GetMcubeUpgradePackageInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMcubeUpgradePackageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcubeUpgradePackageInfoResponseBody</p>
     */
    public static class MobileTestFlightConfigDO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstallAmount")
        private Integer installAmount;

        @com.aliyun.core.annotation.NameInMap("InvalidTime")
        private String invalidTime;

        @com.aliyun.core.annotation.NameInMap("UpgradeId")
        private Long upgradeId;

        private MobileTestFlightConfigDO(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.installAmount = builder.installAmount;
            this.invalidTime = builder.invalidTime;
            this.upgradeId = builder.upgradeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MobileTestFlightConfigDO create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return installAmount
         */
        public Integer getInstallAmount() {
            return this.installAmount;
        }

        /**
         * @return invalidTime
         */
        public String getInvalidTime() {
            return this.invalidTime;
        }

        /**
         * @return upgradeId
         */
        public Long getUpgradeId() {
            return this.upgradeId;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Integer installAmount; 
            private String invalidTime; 
            private Long upgradeId; 

            private Builder() {
            } 

            private Builder(MobileTestFlightConfigDO model) {
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.installAmount = model.installAmount;
                this.invalidTime = model.invalidTime;
                this.upgradeId = model.upgradeId;
            } 

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InstallAmount.
             */
            public Builder installAmount(Integer installAmount) {
                this.installAmount = installAmount;
                return this;
            }

            /**
             * InvalidTime.
             */
            public Builder invalidTime(String invalidTime) {
                this.invalidTime = invalidTime;
                return this;
            }

            /**
             * UpgradeId.
             */
            public Builder upgradeId(Long upgradeId) {
                this.upgradeId = upgradeId;
                return this;
            }

            public MobileTestFlightConfigDO build() {
                return new MobileTestFlightConfigDO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMcubeUpgradePackageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcubeUpgradePackageInfoResponseBody</p>
     */
    public static class UpgradeBaseInfoDO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowCreateTask")
        private Boolean allowCreateTask;

        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("AppstoreUrl")
        private String appstoreUrl;

        @com.aliyun.core.annotation.NameInMap("ChangeLog")
        private String changeLog;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsEnterprise")
        private Integer isEnterprise;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("NeedCheck")
        private Integer needCheck;

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

        @com.aliyun.core.annotation.NameInMap("VerificationCode")
        private String verificationCode;

        private UpgradeBaseInfoDO(Builder builder) {
            this.allowCreateTask = builder.allowCreateTask;
            this.appCode = builder.appCode;
            this.appstoreUrl = builder.appstoreUrl;
            this.changeLog = builder.changeLog;
            this.creator = builder.creator;
            this.downloadUrl = builder.downloadUrl;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.isEnterprise = builder.isEnterprise;
            this.modifier = builder.modifier;
            this.needCheck = builder.needCheck;
            this.packageType = builder.packageType;
            this.platform = builder.platform;
            this.productId = builder.productId;
            this.productName = builder.productName;
            this.productVersion = builder.productVersion;
            this.publishPeriod = builder.publishPeriod;
            this.verificationCode = builder.verificationCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeBaseInfoDO create() {
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
         * @return changeLog
         */
        public String getChangeLog() {
            return this.changeLog;
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isEnterprise
         */
        public Integer getIsEnterprise() {
            return this.isEnterprise;
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
         * @return verificationCode
         */
        public String getVerificationCode() {
            return this.verificationCode;
        }

        public static final class Builder {
            private Boolean allowCreateTask; 
            private String appCode; 
            private String appstoreUrl; 
            private String changeLog; 
            private String creator; 
            private String downloadUrl; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Integer isEnterprise; 
            private String modifier; 
            private Integer needCheck; 
            private String packageType; 
            private String platform; 
            private String productId; 
            private String productName; 
            private String productVersion; 
            private Integer publishPeriod; 
            private String verificationCode; 

            private Builder() {
            } 

            private Builder(UpgradeBaseInfoDO model) {
                this.allowCreateTask = model.allowCreateTask;
                this.appCode = model.appCode;
                this.appstoreUrl = model.appstoreUrl;
                this.changeLog = model.changeLog;
                this.creator = model.creator;
                this.downloadUrl = model.downloadUrl;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.isEnterprise = model.isEnterprise;
                this.modifier = model.modifier;
                this.needCheck = model.needCheck;
                this.packageType = model.packageType;
                this.platform = model.platform;
                this.productId = model.productId;
                this.productName = model.productName;
                this.productVersion = model.productVersion;
                this.publishPeriod = model.publishPeriod;
                this.verificationCode = model.verificationCode;
            } 

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
             * ChangeLog.
             */
            public Builder changeLog(String changeLog) {
                this.changeLog = changeLog;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * VerificationCode.
             */
            public Builder verificationCode(String verificationCode) {
                this.verificationCode = verificationCode;
                return this;
            }

            public UpgradeBaseInfoDO build() {
                return new UpgradeBaseInfoDO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMcubeUpgradePackageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcubeUpgradePackageInfoResponseBody</p>
     */
    public static class PackageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MobileTestFlightConfigDO")
        private MobileTestFlightConfigDO mobileTestFlightConfigDO;

        @com.aliyun.core.annotation.NameInMap("UpgradeBaseInfoDO")
        private UpgradeBaseInfoDO upgradeBaseInfoDO;

        private PackageInfo(Builder builder) {
            this.mobileTestFlightConfigDO = builder.mobileTestFlightConfigDO;
            this.upgradeBaseInfoDO = builder.upgradeBaseInfoDO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageInfo create() {
            return builder().build();
        }

        /**
         * @return mobileTestFlightConfigDO
         */
        public MobileTestFlightConfigDO getMobileTestFlightConfigDO() {
            return this.mobileTestFlightConfigDO;
        }

        /**
         * @return upgradeBaseInfoDO
         */
        public UpgradeBaseInfoDO getUpgradeBaseInfoDO() {
            return this.upgradeBaseInfoDO;
        }

        public static final class Builder {
            private MobileTestFlightConfigDO mobileTestFlightConfigDO; 
            private UpgradeBaseInfoDO upgradeBaseInfoDO; 

            private Builder() {
            } 

            private Builder(PackageInfo model) {
                this.mobileTestFlightConfigDO = model.mobileTestFlightConfigDO;
                this.upgradeBaseInfoDO = model.upgradeBaseInfoDO;
            } 

            /**
             * MobileTestFlightConfigDO.
             */
            public Builder mobileTestFlightConfigDO(MobileTestFlightConfigDO mobileTestFlightConfigDO) {
                this.mobileTestFlightConfigDO = mobileTestFlightConfigDO;
                return this;
            }

            /**
             * UpgradeBaseInfoDO.
             */
            public Builder upgradeBaseInfoDO(UpgradeBaseInfoDO upgradeBaseInfoDO) {
                this.upgradeBaseInfoDO = upgradeBaseInfoDO;
                return this;
            }

            public PackageInfo build() {
                return new PackageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMcubeUpgradePackageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcubeUpgradePackageInfoResponseBody</p>
     */
    public static class GetPackageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("PackageInfo")
        private PackageInfo packageInfo;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private GetPackageResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.packageInfo = builder.packageInfo;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetPackageResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return packageInfo
         */
        public PackageInfo getPackageInfo() {
            return this.packageInfo;
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

        public static final class Builder {
            private String errorCode; 
            private PackageInfo packageInfo; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(GetPackageResult model) {
                this.errorCode = model.errorCode;
                this.packageInfo = model.packageInfo;
                this.requestId = model.requestId;
                this.resultMsg = model.resultMsg;
                this.success = model.success;
            } 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * PackageInfo.
             */
            public Builder packageInfo(PackageInfo packageInfo) {
                this.packageInfo = packageInfo;
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

            public GetPackageResult build() {
                return new GetPackageResult(this);
            } 

        } 

    }
}
