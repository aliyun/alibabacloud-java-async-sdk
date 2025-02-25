// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMcubeUpgradeTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetMcubeUpgradeTaskInfoResponseBody</p>
 */
public class GetMcubeUpgradeTaskInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GetTaskResult")
    private GetTaskResult getTaskResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private GetMcubeUpgradeTaskInfoResponseBody(Builder builder) {
        this.getTaskResult = builder.getTaskResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMcubeUpgradeTaskInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return getTaskResult
     */
    public GetTaskResult getGetTaskResult() {
        return this.getTaskResult;
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
        private GetTaskResult getTaskResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * GetTaskResult.
         */
        public Builder getTaskResult(GetTaskResult getTaskResult) {
            this.getTaskResult = getTaskResult;
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

        public GetMcubeUpgradeTaskInfoResponseBody build() {
            return new GetMcubeUpgradeTaskInfoResponseBody(this);
        } 

    } 

    public static class RuleJsonList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("RuleElement")
        private String ruleElement;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RuleJsonList(Builder builder) {
            this.operation = builder.operation;
            this.ruleElement = builder.ruleElement;
            this.ruleType = builder.ruleType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleJsonList create() {
            return builder().build();
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return ruleElement
         */
        public String getRuleElement() {
            return this.ruleElement;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String operation; 
            private String ruleElement; 
            private String ruleType; 
            private String value; 

            /**
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * RuleElement.
             */
            public Builder ruleElement(String ruleElement) {
                this.ruleElement = ruleElement;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RuleJsonList build() {
                return new RuleJsonList(this);
            } 

        } 

    }
    public static class Whitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        private String idType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private String userType;

        @com.aliyun.core.annotation.NameInMap("WhiteListCount")
        private Long whiteListCount;

        @com.aliyun.core.annotation.NameInMap("WhiteListName")
        private String whiteListName;

        @com.aliyun.core.annotation.NameInMap("WhitelistType")
        private String whitelistType;

        private Whitelist(Builder builder) {
            this.appCode = builder.appCode;
            this.id = builder.id;
            this.idType = builder.idType;
            this.platform = builder.platform;
            this.status = builder.status;
            this.userType = builder.userType;
            this.whiteListCount = builder.whiteListCount;
            this.whiteListName = builder.whiteListName;
            this.whitelistType = builder.whitelistType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Whitelist create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        /**
         * @return whiteListCount
         */
        public Long getWhiteListCount() {
            return this.whiteListCount;
        }

        /**
         * @return whiteListName
         */
        public String getWhiteListName() {
            return this.whiteListName;
        }

        /**
         * @return whitelistType
         */
        public String getWhitelistType() {
            return this.whitelistType;
        }

        public static final class Builder {
            private String appCode; 
            private Long id; 
            private String idType; 
            private String platform; 
            private Integer status; 
            private String userType; 
            private Long whiteListCount; 
            private String whiteListName; 
            private String whitelistType; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
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
             * IdType.
             */
            public Builder idType(String idType) {
                this.idType = idType;
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
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * UserType.
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            /**
             * WhiteListCount.
             */
            public Builder whiteListCount(Long whiteListCount) {
                this.whiteListCount = whiteListCount;
                return this;
            }

            /**
             * WhiteListName.
             */
            public Builder whiteListName(String whiteListName) {
                this.whiteListName = whiteListName;
                return this;
            }

            /**
             * WhitelistType.
             */
            public Builder whitelistType(String whitelistType) {
                this.whitelistType = whitelistType;
                return this;
            }

            public Whitelist build() {
                return new Whitelist(this);
            } 

        } 

    }
    public static class TaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppstoreUrl")
        private String appstoreUrl;

        @com.aliyun.core.annotation.NameInMap("Creater")
        private String creater;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("GreyConfigInfo")
        private String greyConfigInfo;

        @com.aliyun.core.annotation.NameInMap("GreyEndtimeData")
        private String greyEndtimeData;

        @com.aliyun.core.annotation.NameInMap("GreyNum")
        private Integer greyNum;

        @com.aliyun.core.annotation.NameInMap("HistoryForce")
        private Integer historyForce;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsEnterprise")
        private Integer isEnterprise;

        @com.aliyun.core.annotation.NameInMap("IsOfficial")
        private Integer isOfficial;

        @com.aliyun.core.annotation.NameInMap("IsRc")
        private Integer isRc;

        @com.aliyun.core.annotation.NameInMap("IsRelease")
        private Integer isRelease;

        @com.aliyun.core.annotation.NameInMap("Memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("OsVersion")
        private String osVersion;

        @com.aliyun.core.annotation.NameInMap("PackageInfoId")
        private Long packageInfoId;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("PublishMode")
        private Integer publishMode;

        @com.aliyun.core.annotation.NameInMap("PublishType")
        private Integer publishType;

        @com.aliyun.core.annotation.NameInMap("PushContent")
        private String pushContent;

        @com.aliyun.core.annotation.NameInMap("QrcodeUrl")
        private String qrcodeUrl;

        @com.aliyun.core.annotation.NameInMap("RuleJsonList")
        private java.util.List < RuleJsonList> ruleJsonList;

        @com.aliyun.core.annotation.NameInMap("SilentType")
        private Integer silentType;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Integer taskStatus;

        @com.aliyun.core.annotation.NameInMap("UpgradeContent")
        private String upgradeContent;

        @com.aliyun.core.annotation.NameInMap("UpgradeType")
        private Integer upgradeType;

        @com.aliyun.core.annotation.NameInMap("UpgradeValidTime")
        private Integer upgradeValidTime;

        @com.aliyun.core.annotation.NameInMap("Whitelist")
        private java.util.List < Whitelist> whitelist;

        @com.aliyun.core.annotation.NameInMap("WhitelistIds")
        private String whitelistIds;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private TaskInfo(Builder builder) {
            this.appCode = builder.appCode;
            this.appId = builder.appId;
            this.appstoreUrl = builder.appstoreUrl;
            this.creater = builder.creater;
            this.creator = builder.creator;
            this.downloadUrl = builder.downloadUrl;
            this.greyConfigInfo = builder.greyConfigInfo;
            this.greyEndtimeData = builder.greyEndtimeData;
            this.greyNum = builder.greyNum;
            this.historyForce = builder.historyForce;
            this.id = builder.id;
            this.isEnterprise = builder.isEnterprise;
            this.isOfficial = builder.isOfficial;
            this.isRc = builder.isRc;
            this.isRelease = builder.isRelease;
            this.memo = builder.memo;
            this.modifier = builder.modifier;
            this.netType = builder.netType;
            this.osVersion = builder.osVersion;
            this.packageInfoId = builder.packageInfoId;
            this.packageType = builder.packageType;
            this.platform = builder.platform;
            this.productId = builder.productId;
            this.publishMode = builder.publishMode;
            this.publishType = builder.publishType;
            this.pushContent = builder.pushContent;
            this.qrcodeUrl = builder.qrcodeUrl;
            this.ruleJsonList = builder.ruleJsonList;
            this.silentType = builder.silentType;
            this.taskStatus = builder.taskStatus;
            this.upgradeContent = builder.upgradeContent;
            this.upgradeType = builder.upgradeType;
            this.upgradeValidTime = builder.upgradeValidTime;
            this.whitelist = builder.whitelist;
            this.whitelistIds = builder.whitelistIds;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfo create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appstoreUrl
         */
        public String getAppstoreUrl() {
            return this.appstoreUrl;
        }

        /**
         * @return creater
         */
        public String getCreater() {
            return this.creater;
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
         * @return greyConfigInfo
         */
        public String getGreyConfigInfo() {
            return this.greyConfigInfo;
        }

        /**
         * @return greyEndtimeData
         */
        public String getGreyEndtimeData() {
            return this.greyEndtimeData;
        }

        /**
         * @return greyNum
         */
        public Integer getGreyNum() {
            return this.greyNum;
        }

        /**
         * @return historyForce
         */
        public Integer getHistoryForce() {
            return this.historyForce;
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
         * @return isOfficial
         */
        public Integer getIsOfficial() {
            return this.isOfficial;
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
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return osVersion
         */
        public String getOsVersion() {
            return this.osVersion;
        }

        /**
         * @return packageInfoId
         */
        public Long getPackageInfoId() {
            return this.packageInfoId;
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
         * @return publishMode
         */
        public Integer getPublishMode() {
            return this.publishMode;
        }

        /**
         * @return publishType
         */
        public Integer getPublishType() {
            return this.publishType;
        }

        /**
         * @return pushContent
         */
        public String getPushContent() {
            return this.pushContent;
        }

        /**
         * @return qrcodeUrl
         */
        public String getQrcodeUrl() {
            return this.qrcodeUrl;
        }

        /**
         * @return ruleJsonList
         */
        public java.util.List < RuleJsonList> getRuleJsonList() {
            return this.ruleJsonList;
        }

        /**
         * @return silentType
         */
        public Integer getSilentType() {
            return this.silentType;
        }

        /**
         * @return taskStatus
         */
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return upgradeContent
         */
        public String getUpgradeContent() {
            return this.upgradeContent;
        }

        /**
         * @return upgradeType
         */
        public Integer getUpgradeType() {
            return this.upgradeType;
        }

        /**
         * @return upgradeValidTime
         */
        public Integer getUpgradeValidTime() {
            return this.upgradeValidTime;
        }

        /**
         * @return whitelist
         */
        public java.util.List < Whitelist> getWhitelist() {
            return this.whitelist;
        }

        /**
         * @return whitelistIds
         */
        public String getWhitelistIds() {
            return this.whitelistIds;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String appCode; 
            private String appId; 
            private String appstoreUrl; 
            private String creater; 
            private String creator; 
            private String downloadUrl; 
            private String greyConfigInfo; 
            private String greyEndtimeData; 
            private Integer greyNum; 
            private Integer historyForce; 
            private Long id; 
            private Integer isEnterprise; 
            private Integer isOfficial; 
            private Integer isRc; 
            private Integer isRelease; 
            private String memo; 
            private String modifier; 
            private String netType; 
            private String osVersion; 
            private Long packageInfoId; 
            private String packageType; 
            private String platform; 
            private String productId; 
            private Integer publishMode; 
            private Integer publishType; 
            private String pushContent; 
            private String qrcodeUrl; 
            private java.util.List < RuleJsonList> ruleJsonList; 
            private Integer silentType; 
            private Integer taskStatus; 
            private String upgradeContent; 
            private Integer upgradeType; 
            private Integer upgradeValidTime; 
            private java.util.List < Whitelist> whitelist; 
            private String whitelistIds; 
            private String workspaceId; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
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
             * AppstoreUrl.
             */
            public Builder appstoreUrl(String appstoreUrl) {
                this.appstoreUrl = appstoreUrl;
                return this;
            }

            /**
             * Creater.
             */
            public Builder creater(String creater) {
                this.creater = creater;
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
             * GreyConfigInfo.
             */
            public Builder greyConfigInfo(String greyConfigInfo) {
                this.greyConfigInfo = greyConfigInfo;
                return this;
            }

            /**
             * GreyEndtimeData.
             */
            public Builder greyEndtimeData(String greyEndtimeData) {
                this.greyEndtimeData = greyEndtimeData;
                return this;
            }

            /**
             * GreyNum.
             */
            public Builder greyNum(Integer greyNum) {
                this.greyNum = greyNum;
                return this;
            }

            /**
             * HistoryForce.
             */
            public Builder historyForce(Integer historyForce) {
                this.historyForce = historyForce;
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
             * IsOfficial.
             */
            public Builder isOfficial(Integer isOfficial) {
                this.isOfficial = isOfficial;
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
             * Memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
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
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * OsVersion.
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * PackageInfoId.
             */
            public Builder packageInfoId(Long packageInfoId) {
                this.packageInfoId = packageInfoId;
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
             * PublishMode.
             */
            public Builder publishMode(Integer publishMode) {
                this.publishMode = publishMode;
                return this;
            }

            /**
             * PublishType.
             */
            public Builder publishType(Integer publishType) {
                this.publishType = publishType;
                return this;
            }

            /**
             * PushContent.
             */
            public Builder pushContent(String pushContent) {
                this.pushContent = pushContent;
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
             * RuleJsonList.
             */
            public Builder ruleJsonList(java.util.List < RuleJsonList> ruleJsonList) {
                this.ruleJsonList = ruleJsonList;
                return this;
            }

            /**
             * SilentType.
             */
            public Builder silentType(Integer silentType) {
                this.silentType = silentType;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * UpgradeContent.
             */
            public Builder upgradeContent(String upgradeContent) {
                this.upgradeContent = upgradeContent;
                return this;
            }

            /**
             * UpgradeType.
             */
            public Builder upgradeType(Integer upgradeType) {
                this.upgradeType = upgradeType;
                return this;
            }

            /**
             * UpgradeValidTime.
             */
            public Builder upgradeValidTime(Integer upgradeValidTime) {
                this.upgradeValidTime = upgradeValidTime;
                return this;
            }

            /**
             * Whitelist.
             */
            public Builder whitelist(java.util.List < Whitelist> whitelist) {
                this.whitelist = whitelist;
                return this;
            }

            /**
             * WhitelistIds.
             */
            public Builder whitelistIds(String whitelistIds) {
                this.whitelistIds = whitelistIds;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public TaskInfo build() {
                return new TaskInfo(this);
            } 

        } 

    }
    public static class GetTaskResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TaskInfo")
        private TaskInfo taskInfo;

        private GetTaskResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
            this.taskInfo = builder.taskInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetTaskResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
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
         * @return taskInfo
         */
        public TaskInfo getTaskInfo() {
            return this.taskInfo;
        }

        public static final class Builder {
            private String errorCode; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 
            private TaskInfo taskInfo; 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
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
             * TaskInfo.
             */
            public Builder taskInfo(TaskInfo taskInfo) {
                this.taskInfo = taskInfo;
                return this;
            }

            public GetTaskResult build() {
                return new GetTaskResult(this);
            } 

        } 

    }
}
