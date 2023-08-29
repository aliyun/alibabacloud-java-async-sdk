// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMcubeNebulaTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListMcubeNebulaTasksResponseBody</p>
 */
public class ListMcubeNebulaTasksResponseBody extends TeaModel {
    @NameInMap("ListMcubeNebulaTaskResult")
    private ListMcubeNebulaTaskResult listMcubeNebulaTaskResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultMessage")
    private String resultMessage;

    private ListMcubeNebulaTasksResponseBody(Builder builder) {
        this.listMcubeNebulaTaskResult = builder.listMcubeNebulaTaskResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcubeNebulaTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return listMcubeNebulaTaskResult
     */
    public ListMcubeNebulaTaskResult getListMcubeNebulaTaskResult() {
        return this.listMcubeNebulaTaskResult;
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
        private ListMcubeNebulaTaskResult listMcubeNebulaTaskResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * ListMcubeNebulaTaskResult.
         */
        public Builder listMcubeNebulaTaskResult(ListMcubeNebulaTaskResult listMcubeNebulaTaskResult) {
            this.listMcubeNebulaTaskResult = listMcubeNebulaTaskResult;
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

        public ListMcubeNebulaTasksResponseBody build() {
            return new ListMcubeNebulaTasksResponseBody(this);
        } 

    } 

    public static class NebulaTaskInfo extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("GmtModifiedStr")
        private String gmtModifiedStr;

        @NameInMap("GreyConfigInfo")
        private String greyConfigInfo;

        @NameInMap("GreyEndtime")
        private String greyEndtime;

        @NameInMap("GreyEndtimeData")
        private String greyEndtimeData;

        @NameInMap("GreyEndtimeStr")
        private String greyEndtimeStr;

        @NameInMap("GreyNum")
        private Integer greyNum;

        @NameInMap("GreyUrl")
        private String greyUrl;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Memo")
        private String memo;

        @NameInMap("Modifier")
        private String modifier;

        @NameInMap("PackageId")
        private Long packageId;

        @NameInMap("Percent")
        private Integer percent;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("ProductVersion")
        private String productVersion;

        @NameInMap("PublishMode")
        private Integer publishMode;

        @NameInMap("PublishType")
        private Integer publishType;

        @NameInMap("ReleaseVersion")
        private String releaseVersion;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SyncResult")
        private String syncResult;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TaskStatus")
        private Integer taskStatus;

        @NameInMap("TaskType")
        private Integer taskType;

        @NameInMap("TaskVersion")
        private Long taskVersion;

        @NameInMap("UpgradeNoticeNum")
        private Long upgradeNoticeNum;

        @NameInMap("UpgradeProgress")
        private String upgradeProgress;

        @NameInMap("WhitelistIds")
        private String whitelistIds;

        private NebulaTaskInfo(Builder builder) {
            this.appCode = builder.appCode;
            this.bizType = builder.bizType;
            this.creator = builder.creator;
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
            this.memo = builder.memo;
            this.modifier = builder.modifier;
            this.packageId = builder.packageId;
            this.percent = builder.percent;
            this.platform = builder.platform;
            this.productId = builder.productId;
            this.productVersion = builder.productVersion;
            this.publishMode = builder.publishMode;
            this.publishType = builder.publishType;
            this.releaseVersion = builder.releaseVersion;
            this.status = builder.status;
            this.syncResult = builder.syncResult;
            this.taskName = builder.taskName;
            this.taskStatus = builder.taskStatus;
            this.taskType = builder.taskType;
            this.taskVersion = builder.taskVersion;
            this.upgradeNoticeNum = builder.upgradeNoticeNum;
            this.upgradeProgress = builder.upgradeProgress;
            this.whitelistIds = builder.whitelistIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NebulaTaskInfo create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
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
         * @return publishType
         */
        public Integer getPublishType() {
            return this.publishType;
        }

        /**
         * @return releaseVersion
         */
        public String getReleaseVersion() {
            return this.releaseVersion;
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

        public static final class Builder {
            private String appCode; 
            private String bizType; 
            private String creator; 
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
            private String memo; 
            private String modifier; 
            private Long packageId; 
            private Integer percent; 
            private String platform; 
            private String productId; 
            private String productVersion; 
            private Integer publishMode; 
            private Integer publishType; 
            private String releaseVersion; 
            private Integer status; 
            private String syncResult; 
            private String taskName; 
            private Integer taskStatus; 
            private Integer taskType; 
            private Long taskVersion; 
            private Long upgradeNoticeNum; 
            private String upgradeProgress; 
            private String whitelistIds; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
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
             * PublishType.
             */
            public Builder publishType(Integer publishType) {
                this.publishType = publishType;
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

            public NebulaTaskInfo build() {
                return new NebulaTaskInfo(this);
            } 

        } 

    }
    public static class ListMcubeNebulaTaskResult extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("NebulaTaskInfo")
        private java.util.List < NebulaTaskInfo> nebulaTaskInfo;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("ResultMsg")
        private String resultMsg;

        @NameInMap("Success")
        private Boolean success;

        private ListMcubeNebulaTaskResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.nebulaTaskInfo = builder.nebulaTaskInfo;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListMcubeNebulaTaskResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return nebulaTaskInfo
         */
        public java.util.List < NebulaTaskInfo> getNebulaTaskInfo() {
            return this.nebulaTaskInfo;
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
            private java.util.List < NebulaTaskInfo> nebulaTaskInfo; 
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
             * NebulaTaskInfo.
             */
            public Builder nebulaTaskInfo(java.util.List < NebulaTaskInfo> nebulaTaskInfo) {
                this.nebulaTaskInfo = nebulaTaskInfo;
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

            public ListMcubeNebulaTaskResult build() {
                return new ListMcubeNebulaTaskResult(this);
            } 

        } 

    }
}
