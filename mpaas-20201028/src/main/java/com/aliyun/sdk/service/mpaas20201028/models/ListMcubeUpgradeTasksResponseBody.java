// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMcubeUpgradeTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListMcubeUpgradeTasksResponseBody</p>
 */
public class ListMcubeUpgradeTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ListTaskResult")
    private ListTaskResult listTaskResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private ListMcubeUpgradeTasksResponseBody(Builder builder) {
        this.listTaskResult = builder.listTaskResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcubeUpgradeTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return listTaskResult
     */
    public ListTaskResult getListTaskResult() {
        return this.listTaskResult;
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
        private ListTaskResult listTaskResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * ListTaskResult.
         */
        public Builder listTaskResult(ListTaskResult listTaskResult) {
            this.listTaskResult = listTaskResult;
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

        public ListMcubeUpgradeTasksResponseBody build() {
            return new ListMcubeUpgradeTasksResponseBody(this);
        } 

    } 

    public static class TaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DevicePercent")
        private Integer devicePercent;

        @com.aliyun.core.annotation.NameInMap("ExecutionOrder")
        private Integer executionOrder;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtCreateStr")
        private String gmtCreateStr;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedStr")
        private String gmtModifiedStr;

        @com.aliyun.core.annotation.NameInMap("GreyConfigInfo")
        private String greyConfigInfo;

        @com.aliyun.core.annotation.NameInMap("GreyEndtime")
        private String greyEndtime;

        @com.aliyun.core.annotation.NameInMap("GreyNotice")
        private Integer greyNotice;

        @com.aliyun.core.annotation.NameInMap("GreyNum")
        private Integer greyNum;

        @com.aliyun.core.annotation.NameInMap("GreyPausePoint")
        private Integer greyPausePoint;

        @com.aliyun.core.annotation.NameInMap("GreyPauseType")
        private Integer greyPauseType;

        @com.aliyun.core.annotation.NameInMap("GreyUv")
        private Integer greyUv;

        @com.aliyun.core.annotation.NameInMap("HistoryForce")
        private Integer historyForce;

        @com.aliyun.core.annotation.NameInMap("HuobanNoticeId")
        private String huobanNoticeId;

        @com.aliyun.core.annotation.NameInMap("HuobanUrl")
        private String huobanUrl;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InnerVersion")
        private String innerVersion;

        @com.aliyun.core.annotation.NameInMap("IsEnterprise")
        private Integer isEnterprise;

        @com.aliyun.core.annotation.NameInMap("IsOfficial")
        private Integer isOfficial;

        @com.aliyun.core.annotation.NameInMap("IsPush")
        private Integer isPush;

        @com.aliyun.core.annotation.NameInMap("IsRelease")
        private Integer isRelease;

        @com.aliyun.core.annotation.NameInMap("MaxVersion")
        private String maxVersion;

        @com.aliyun.core.annotation.NameInMap("Memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("PackageInfoId")
        private Long packageInfoId;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductVersion")
        private String productVersion;

        @com.aliyun.core.annotation.NameInMap("PublishMode")
        private Integer publishMode;

        @com.aliyun.core.annotation.NameInMap("PublishType")
        private Integer publishType;

        @com.aliyun.core.annotation.NameInMap("PushContent")
        private String pushContent;

        @com.aliyun.core.annotation.NameInMap("RealGreyEndtime")
        private String realGreyEndtime;

        @com.aliyun.core.annotation.NameInMap("RealGreyEndtimeStr")
        private String realGreyEndtimeStr;

        @com.aliyun.core.annotation.NameInMap("RealGreyEndtype")
        private Integer realGreyEndtype;

        @com.aliyun.core.annotation.NameInMap("RealGreyNum")
        private Integer realGreyNum;

        @com.aliyun.core.annotation.NameInMap("RealGreyUv")
        private Integer realGreyUv;

        @com.aliyun.core.annotation.NameInMap("SilentType")
        private Integer silentType;

        @com.aliyun.core.annotation.NameInMap("SyncResult")
        private String syncResult;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Integer taskStatus;

        @com.aliyun.core.annotation.NameInMap("UpgradeContent")
        private String upgradeContent;

        @com.aliyun.core.annotation.NameInMap("UpgradeType")
        private Integer upgradeType;

        @com.aliyun.core.annotation.NameInMap("UpgradeValidTime")
        private Integer upgradeValidTime;

        @com.aliyun.core.annotation.NameInMap("WhitelistIds")
        private String whitelistIds;

        private TaskInfo(Builder builder) {
            this.appCode = builder.appCode;
            this.creator = builder.creator;
            this.devicePercent = builder.devicePercent;
            this.executionOrder = builder.executionOrder;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateStr = builder.gmtCreateStr;
            this.gmtModified = builder.gmtModified;
            this.gmtModifiedStr = builder.gmtModifiedStr;
            this.greyConfigInfo = builder.greyConfigInfo;
            this.greyEndtime = builder.greyEndtime;
            this.greyNotice = builder.greyNotice;
            this.greyNum = builder.greyNum;
            this.greyPausePoint = builder.greyPausePoint;
            this.greyPauseType = builder.greyPauseType;
            this.greyUv = builder.greyUv;
            this.historyForce = builder.historyForce;
            this.huobanNoticeId = builder.huobanNoticeId;
            this.huobanUrl = builder.huobanUrl;
            this.id = builder.id;
            this.innerVersion = builder.innerVersion;
            this.isEnterprise = builder.isEnterprise;
            this.isOfficial = builder.isOfficial;
            this.isPush = builder.isPush;
            this.isRelease = builder.isRelease;
            this.maxVersion = builder.maxVersion;
            this.memo = builder.memo;
            this.modifier = builder.modifier;
            this.packageInfoId = builder.packageInfoId;
            this.platform = builder.platform;
            this.productId = builder.productId;
            this.productVersion = builder.productVersion;
            this.publishMode = builder.publishMode;
            this.publishType = builder.publishType;
            this.pushContent = builder.pushContent;
            this.realGreyEndtime = builder.realGreyEndtime;
            this.realGreyEndtimeStr = builder.realGreyEndtimeStr;
            this.realGreyEndtype = builder.realGreyEndtype;
            this.realGreyNum = builder.realGreyNum;
            this.realGreyUv = builder.realGreyUv;
            this.silentType = builder.silentType;
            this.syncResult = builder.syncResult;
            this.taskStatus = builder.taskStatus;
            this.upgradeContent = builder.upgradeContent;
            this.upgradeType = builder.upgradeType;
            this.upgradeValidTime = builder.upgradeValidTime;
            this.whitelistIds = builder.whitelistIds;
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
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return devicePercent
         */
        public Integer getDevicePercent() {
            return this.devicePercent;
        }

        /**
         * @return executionOrder
         */
        public Integer getExecutionOrder() {
            return this.executionOrder;
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
         * @return greyConfigInfo
         */
        public String getGreyConfigInfo() {
            return this.greyConfigInfo;
        }

        /**
         * @return greyEndtime
         */
        public String getGreyEndtime() {
            return this.greyEndtime;
        }

        /**
         * @return greyNotice
         */
        public Integer getGreyNotice() {
            return this.greyNotice;
        }

        /**
         * @return greyNum
         */
        public Integer getGreyNum() {
            return this.greyNum;
        }

        /**
         * @return greyPausePoint
         */
        public Integer getGreyPausePoint() {
            return this.greyPausePoint;
        }

        /**
         * @return greyPauseType
         */
        public Integer getGreyPauseType() {
            return this.greyPauseType;
        }

        /**
         * @return greyUv
         */
        public Integer getGreyUv() {
            return this.greyUv;
        }

        /**
         * @return historyForce
         */
        public Integer getHistoryForce() {
            return this.historyForce;
        }

        /**
         * @return huobanNoticeId
         */
        public String getHuobanNoticeId() {
            return this.huobanNoticeId;
        }

        /**
         * @return huobanUrl
         */
        public String getHuobanUrl() {
            return this.huobanUrl;
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
         * @return isPush
         */
        public Integer getIsPush() {
            return this.isPush;
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
         * @return packageInfoId
         */
        public Long getPackageInfoId() {
            return this.packageInfoId;
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
         * @return productVersion
         */
        public String getProductVersion() {
            return this.productVersion;
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
         * @return realGreyEndtime
         */
        public String getRealGreyEndtime() {
            return this.realGreyEndtime;
        }

        /**
         * @return realGreyEndtimeStr
         */
        public String getRealGreyEndtimeStr() {
            return this.realGreyEndtimeStr;
        }

        /**
         * @return realGreyEndtype
         */
        public Integer getRealGreyEndtype() {
            return this.realGreyEndtype;
        }

        /**
         * @return realGreyNum
         */
        public Integer getRealGreyNum() {
            return this.realGreyNum;
        }

        /**
         * @return realGreyUv
         */
        public Integer getRealGreyUv() {
            return this.realGreyUv;
        }

        /**
         * @return silentType
         */
        public Integer getSilentType() {
            return this.silentType;
        }

        /**
         * @return syncResult
         */
        public String getSyncResult() {
            return this.syncResult;
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
         * @return whitelistIds
         */
        public String getWhitelistIds() {
            return this.whitelistIds;
        }

        public static final class Builder {
            private String appCode; 
            private String creator; 
            private Integer devicePercent; 
            private Integer executionOrder; 
            private String gmtCreate; 
            private String gmtCreateStr; 
            private String gmtModified; 
            private String gmtModifiedStr; 
            private String greyConfigInfo; 
            private String greyEndtime; 
            private Integer greyNotice; 
            private Integer greyNum; 
            private Integer greyPausePoint; 
            private Integer greyPauseType; 
            private Integer greyUv; 
            private Integer historyForce; 
            private String huobanNoticeId; 
            private String huobanUrl; 
            private Long id; 
            private String innerVersion; 
            private Integer isEnterprise; 
            private Integer isOfficial; 
            private Integer isPush; 
            private Integer isRelease; 
            private String maxVersion; 
            private String memo; 
            private String modifier; 
            private Long packageInfoId; 
            private String platform; 
            private String productId; 
            private String productVersion; 
            private Integer publishMode; 
            private Integer publishType; 
            private String pushContent; 
            private String realGreyEndtime; 
            private String realGreyEndtimeStr; 
            private Integer realGreyEndtype; 
            private Integer realGreyNum; 
            private Integer realGreyUv; 
            private Integer silentType; 
            private String syncResult; 
            private Integer taskStatus; 
            private String upgradeContent; 
            private Integer upgradeType; 
            private Integer upgradeValidTime; 
            private String whitelistIds; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
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
             * DevicePercent.
             */
            public Builder devicePercent(Integer devicePercent) {
                this.devicePercent = devicePercent;
                return this;
            }

            /**
             * ExecutionOrder.
             */
            public Builder executionOrder(Integer executionOrder) {
                this.executionOrder = executionOrder;
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
             * GreyConfigInfo.
             */
            public Builder greyConfigInfo(String greyConfigInfo) {
                this.greyConfigInfo = greyConfigInfo;
                return this;
            }

            /**
             * GreyEndtime.
             */
            public Builder greyEndtime(String greyEndtime) {
                this.greyEndtime = greyEndtime;
                return this;
            }

            /**
             * GreyNotice.
             */
            public Builder greyNotice(Integer greyNotice) {
                this.greyNotice = greyNotice;
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
             * GreyPausePoint.
             */
            public Builder greyPausePoint(Integer greyPausePoint) {
                this.greyPausePoint = greyPausePoint;
                return this;
            }

            /**
             * GreyPauseType.
             */
            public Builder greyPauseType(Integer greyPauseType) {
                this.greyPauseType = greyPauseType;
                return this;
            }

            /**
             * GreyUv.
             */
            public Builder greyUv(Integer greyUv) {
                this.greyUv = greyUv;
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
             * HuobanNoticeId.
             */
            public Builder huobanNoticeId(String huobanNoticeId) {
                this.huobanNoticeId = huobanNoticeId;
                return this;
            }

            /**
             * HuobanUrl.
             */
            public Builder huobanUrl(String huobanUrl) {
                this.huobanUrl = huobanUrl;
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
             * IsPush.
             */
            public Builder isPush(Integer isPush) {
                this.isPush = isPush;
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
             * PackageInfoId.
             */
            public Builder packageInfoId(Long packageInfoId) {
                this.packageInfoId = packageInfoId;
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
             * ProductVersion.
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
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
             * RealGreyEndtime.
             */
            public Builder realGreyEndtime(String realGreyEndtime) {
                this.realGreyEndtime = realGreyEndtime;
                return this;
            }

            /**
             * RealGreyEndtimeStr.
             */
            public Builder realGreyEndtimeStr(String realGreyEndtimeStr) {
                this.realGreyEndtimeStr = realGreyEndtimeStr;
                return this;
            }

            /**
             * RealGreyEndtype.
             */
            public Builder realGreyEndtype(Integer realGreyEndtype) {
                this.realGreyEndtype = realGreyEndtype;
                return this;
            }

            /**
             * RealGreyNum.
             */
            public Builder realGreyNum(Integer realGreyNum) {
                this.realGreyNum = realGreyNum;
                return this;
            }

            /**
             * RealGreyUv.
             */
            public Builder realGreyUv(Integer realGreyUv) {
                this.realGreyUv = realGreyUv;
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
             * SyncResult.
             */
            public Builder syncResult(String syncResult) {
                this.syncResult = syncResult;
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
             * WhitelistIds.
             */
            public Builder whitelistIds(String whitelistIds) {
                this.whitelistIds = whitelistIds;
                return this;
            }

            public TaskInfo build() {
                return new TaskInfo(this);
            } 

        } 

    }
    public static class ListTaskResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TaskInfo")
        private java.util.List < TaskInfo> taskInfo;

        private ListTaskResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
            this.taskInfo = builder.taskInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListTaskResult create() {
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
        public java.util.List < TaskInfo> getTaskInfo() {
            return this.taskInfo;
        }

        public static final class Builder {
            private String errorCode; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 
            private java.util.List < TaskInfo> taskInfo; 

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
            public Builder taskInfo(java.util.List < TaskInfo> taskInfo) {
                this.taskInfo = taskInfo;
                return this;
            }

            public ListTaskResult build() {
                return new ListTaskResult(this);
            } 

        } 

    }
}
