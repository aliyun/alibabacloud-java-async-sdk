// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMcubeNebulaTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetMcubeNebulaTaskDetailResponseBody</p>
 */
public class GetMcubeNebulaTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GetMcubeNebulaTaskDetailResult")
    private GetMcubeNebulaTaskDetailResult getMcubeNebulaTaskDetailResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private GetMcubeNebulaTaskDetailResponseBody(Builder builder) {
        this.getMcubeNebulaTaskDetailResult = builder.getMcubeNebulaTaskDetailResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMcubeNebulaTaskDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return getMcubeNebulaTaskDetailResult
     */
    public GetMcubeNebulaTaskDetailResult getGetMcubeNebulaTaskDetailResult() {
        return this.getMcubeNebulaTaskDetailResult;
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
        private GetMcubeNebulaTaskDetailResult getMcubeNebulaTaskDetailResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * GetMcubeNebulaTaskDetailResult.
         */
        public Builder getMcubeNebulaTaskDetailResult(GetMcubeNebulaTaskDetailResult getMcubeNebulaTaskDetailResult) {
            this.getMcubeNebulaTaskDetailResult = getMcubeNebulaTaskDetailResult;
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

        public GetMcubeNebulaTaskDetailResponseBody build() {
            return new GetMcubeNebulaTaskDetailResponseBody(this);
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
    public static class NebulaTaskDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Atomic")
        private Integer atomic;

        @com.aliyun.core.annotation.NameInMap("BaseInfoId")
        private Long baseInfoId;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Cronexpress")
        private Integer cronexpress;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ExtraData")
        private String extraData;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private String fileSize;

        @com.aliyun.core.annotation.NameInMap("FullRepair")
        private Integer fullRepair;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedStr")
        private String gmtModifiedStr;

        @com.aliyun.core.annotation.NameInMap("GreyConfigInfo")
        private String greyConfigInfo;

        @com.aliyun.core.annotation.NameInMap("GreyEndtime")
        private String greyEndtime;

        @com.aliyun.core.annotation.NameInMap("GreyEndtimeData")
        private String greyEndtimeData;

        @com.aliyun.core.annotation.NameInMap("GreyEndtimeStr")
        private String greyEndtimeStr;

        @com.aliyun.core.annotation.NameInMap("GreyNum")
        private Integer greyNum;

        @com.aliyun.core.annotation.NameInMap("GreyUrl")
        private String greyUrl;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IssueDesc")
        private String issueDesc;

        @com.aliyun.core.annotation.NameInMap("Memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("OssPath")
        private String ossPath;

        @com.aliyun.core.annotation.NameInMap("PackageId")
        private Long packageId;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductVersion")
        private String productVersion;

        @com.aliyun.core.annotation.NameInMap("PublishMode")
        private Integer publishMode;

        @com.aliyun.core.annotation.NameInMap("PublishPeriod")
        private Integer publishPeriod;

        @com.aliyun.core.annotation.NameInMap("PublishType")
        private Integer publishType;

        @com.aliyun.core.annotation.NameInMap("QuickRollback")
        private Integer quickRollback;

        @com.aliyun.core.annotation.NameInMap("ReleaseVersion")
        private String releaseVersion;

        @com.aliyun.core.annotation.NameInMap("RuleJsonList")
        private java.util.List < RuleJsonList> ruleJsonList;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("SourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SyncResult")
        private String syncResult;

        @com.aliyun.core.annotation.NameInMap("SyncType")
        private Integer syncType;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Integer taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private Integer taskType;

        @com.aliyun.core.annotation.NameInMap("TaskVersion")
        private Long taskVersion;

        @com.aliyun.core.annotation.NameInMap("UpgradeNoticeNum")
        private Long upgradeNoticeNum;

        @com.aliyun.core.annotation.NameInMap("UpgradeProgress")
        private String upgradeProgress;

        @com.aliyun.core.annotation.NameInMap("WhitelistIds")
        private String whitelistIds;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private NebulaTaskDetail(Builder builder) {
            this.appCode = builder.appCode;
            this.appId = builder.appId;
            this.atomic = builder.atomic;
            this.baseInfoId = builder.baseInfoId;
            this.bizType = builder.bizType;
            this.creator = builder.creator;
            this.cronexpress = builder.cronexpress;
            this.downloadUrl = builder.downloadUrl;
            this.extraData = builder.extraData;
            this.fileSize = builder.fileSize;
            this.fullRepair = builder.fullRepair;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.gmtModifiedStr = builder.gmtModifiedStr;
            this.greyConfigInfo = builder.greyConfigInfo;
            this.greyEndtime = builder.greyEndtime;
            this.greyEndtimeData = builder.greyEndtimeData;
            this.greyEndtimeStr = builder.greyEndtimeStr;
            this.greyNum = builder.greyNum;
            this.greyUrl = builder.greyUrl;
            this.id = builder.id;
            this.issueDesc = builder.issueDesc;
            this.memo = builder.memo;
            this.modifier = builder.modifier;
            this.ossPath = builder.ossPath;
            this.packageId = builder.packageId;
            this.percent = builder.percent;
            this.platform = builder.platform;
            this.productId = builder.productId;
            this.productVersion = builder.productVersion;
            this.publishMode = builder.publishMode;
            this.publishPeriod = builder.publishPeriod;
            this.publishType = builder.publishType;
            this.quickRollback = builder.quickRollback;
            this.releaseVersion = builder.releaseVersion;
            this.ruleJsonList = builder.ruleJsonList;
            this.sourceId = builder.sourceId;
            this.sourceName = builder.sourceName;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
            this.syncResult = builder.syncResult;
            this.syncType = builder.syncType;
            this.taskName = builder.taskName;
            this.taskStatus = builder.taskStatus;
            this.taskType = builder.taskType;
            this.taskVersion = builder.taskVersion;
            this.upgradeNoticeNum = builder.upgradeNoticeNum;
            this.upgradeProgress = builder.upgradeProgress;
            this.whitelistIds = builder.whitelistIds;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NebulaTaskDetail create() {
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
         * @return atomic
         */
        public Integer getAtomic() {
            return this.atomic;
        }

        /**
         * @return baseInfoId
         */
        public Long getBaseInfoId() {
            return this.baseInfoId;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return cronexpress
         */
        public Integer getCronexpress() {
            return this.cronexpress;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return extraData
         */
        public String getExtraData() {
            return this.extraData;
        }

        /**
         * @return fileSize
         */
        public String getFileSize() {
            return this.fileSize;
        }

        /**
         * @return fullRepair
         */
        public Integer getFullRepair() {
            return this.fullRepair;
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
         * @return greyEndtimeData
         */
        public String getGreyEndtimeData() {
            return this.greyEndtimeData;
        }

        /**
         * @return greyEndtimeStr
         */
        public String getGreyEndtimeStr() {
            return this.greyEndtimeStr;
        }

        /**
         * @return greyNum
         */
        public Integer getGreyNum() {
            return this.greyNum;
        }

        /**
         * @return greyUrl
         */
        public String getGreyUrl() {
            return this.greyUrl;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return issueDesc
         */
        public String getIssueDesc() {
            return this.issueDesc;
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
         * @return ossPath
         */
        public String getOssPath() {
            return this.ossPath;
        }

        /**
         * @return packageId
         */
        public Long getPackageId() {
            return this.packageId;
        }

        /**
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
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
         * @return publishPeriod
         */
        public Integer getPublishPeriod() {
            return this.publishPeriod;
        }

        /**
         * @return publishType
         */
        public Integer getPublishType() {
            return this.publishType;
        }

        /**
         * @return quickRollback
         */
        public Integer getQuickRollback() {
            return this.quickRollback;
        }

        /**
         * @return releaseVersion
         */
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        /**
         * @return ruleJsonList
         */
        public java.util.List < RuleJsonList> getRuleJsonList() {
            return this.ruleJsonList;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceName
         */
        public String getSourceName() {
            return this.sourceName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return syncResult
         */
        public String getSyncResult() {
            return this.syncResult;
        }

        /**
         * @return syncType
         */
        public Integer getSyncType() {
            return this.syncType;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskStatus
         */
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return taskType
         */
        public Integer getTaskType() {
            return this.taskType;
        }

        /**
         * @return taskVersion
         */
        public Long getTaskVersion() {
            return this.taskVersion;
        }

        /**
         * @return upgradeNoticeNum
         */
        public Long getUpgradeNoticeNum() {
            return this.upgradeNoticeNum;
        }

        /**
         * @return upgradeProgress
         */
        public String getUpgradeProgress() {
            return this.upgradeProgress;
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
            private Integer atomic; 
            private Long baseInfoId; 
            private String bizType; 
            private String creator; 
            private Integer cronexpress; 
            private String downloadUrl; 
            private String extraData; 
            private String fileSize; 
            private Integer fullRepair; 
            private String gmtCreate; 
            private String gmtModified; 
            private String gmtModifiedStr; 
            private String greyConfigInfo; 
            private String greyEndtime; 
            private String greyEndtimeData; 
            private String greyEndtimeStr; 
            private Integer greyNum; 
            private String greyUrl; 
            private Long id; 
            private String issueDesc; 
            private String memo; 
            private String modifier; 
            private String ossPath; 
            private Long packageId; 
            private Integer percent; 
            private String platform; 
            private String productId; 
            private String productVersion; 
            private Integer publishMode; 
            private Integer publishPeriod; 
            private Integer publishType; 
            private Integer quickRollback; 
            private String releaseVersion; 
            private java.util.List < RuleJsonList> ruleJsonList; 
            private String sourceId; 
            private String sourceName; 
            private String sourceType; 
            private Integer status; 
            private String syncResult; 
            private Integer syncType; 
            private String taskName; 
            private Integer taskStatus; 
            private Integer taskType; 
            private Long taskVersion; 
            private Long upgradeNoticeNum; 
            private String upgradeProgress; 
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
             * Atomic.
             */
            public Builder atomic(Integer atomic) {
                this.atomic = atomic;
                return this;
            }

            /**
             * BaseInfoId.
             */
            public Builder baseInfoId(Long baseInfoId) {
                this.baseInfoId = baseInfoId;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
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
             * Cronexpress.
             */
            public Builder cronexpress(Integer cronexpress) {
                this.cronexpress = cronexpress;
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
             * ExtraData.
             */
            public Builder extraData(String extraData) {
                this.extraData = extraData;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * FullRepair.
             */
            public Builder fullRepair(Integer fullRepair) {
                this.fullRepair = fullRepair;
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
             * GreyEndtimeData.
             */
            public Builder greyEndtimeData(String greyEndtimeData) {
                this.greyEndtimeData = greyEndtimeData;
                return this;
            }

            /**
             * GreyEndtimeStr.
             */
            public Builder greyEndtimeStr(String greyEndtimeStr) {
                this.greyEndtimeStr = greyEndtimeStr;
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
             * GreyUrl.
             */
            public Builder greyUrl(String greyUrl) {
                this.greyUrl = greyUrl;
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
             * IssueDesc.
             */
            public Builder issueDesc(String issueDesc) {
                this.issueDesc = issueDesc;
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
             * OssPath.
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            /**
             * PackageId.
             */
            public Builder packageId(Long packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
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
             * PublishPeriod.
             */
            public Builder publishPeriod(Integer publishPeriod) {
                this.publishPeriod = publishPeriod;
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
             * QuickRollback.
             */
            public Builder quickRollback(Integer quickRollback) {
                this.quickRollback = quickRollback;
                return this;
            }

            /**
             * ReleaseVersion.
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
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
             * SourceId.
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * SourceName.
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
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
             * SyncResult.
             */
            public Builder syncResult(String syncResult) {
                this.syncResult = syncResult;
                return this;
            }

            /**
             * SyncType.
             */
            public Builder syncType(Integer syncType) {
                this.syncType = syncType;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
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
             * TaskType.
             */
            public Builder taskType(Integer taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * TaskVersion.
             */
            public Builder taskVersion(Long taskVersion) {
                this.taskVersion = taskVersion;
                return this;
            }

            /**
             * UpgradeNoticeNum.
             */
            public Builder upgradeNoticeNum(Long upgradeNoticeNum) {
                this.upgradeNoticeNum = upgradeNoticeNum;
                return this;
            }

            /**
             * UpgradeProgress.
             */
            public Builder upgradeProgress(String upgradeProgress) {
                this.upgradeProgress = upgradeProgress;
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

            public NebulaTaskDetail build() {
                return new NebulaTaskDetail(this);
            } 

        } 

    }
    public static class GetMcubeNebulaTaskDetailResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("NebulaTaskDetail")
        private NebulaTaskDetail nebulaTaskDetail;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private GetMcubeNebulaTaskDetailResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.nebulaTaskDetail = builder.nebulaTaskDetail;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetMcubeNebulaTaskDetailResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return nebulaTaskDetail
         */
        public NebulaTaskDetail getNebulaTaskDetail() {
            return this.nebulaTaskDetail;
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
            private NebulaTaskDetail nebulaTaskDetail; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * NebulaTaskDetail.
             */
            public Builder nebulaTaskDetail(NebulaTaskDetail nebulaTaskDetail) {
                this.nebulaTaskDetail = nebulaTaskDetail;
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

            public GetMcubeNebulaTaskDetailResult build() {
                return new GetMcubeNebulaTaskDetailResult(this);
            } 

        } 

    }
}
