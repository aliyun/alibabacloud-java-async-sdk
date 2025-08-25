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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListMcubeUpgradeTasksResponseBody model) {
            this.listTaskResult = model.listTaskResult;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMessage = model.resultMessage;
        } 

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

    /**
     * 
     * {@link ListMcubeUpgradeTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcubeUpgradeTasksResponseBody</p>
     */
    public static class TaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GreyConfigInfo")
        private String greyConfigInfo;

        @com.aliyun.core.annotation.NameInMap("GreyEndtime")
        private String greyEndtime;

        @com.aliyun.core.annotation.NameInMap("GreyNum")
        private Integer greyNum;

        @com.aliyun.core.annotation.NameInMap("HistoryForce")
        private Integer historyForce;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsEnterprise")
        private Integer isEnterprise;

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

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Integer taskStatus;

        @com.aliyun.core.annotation.NameInMap("UpgradeContent")
        private String upgradeContent;

        @com.aliyun.core.annotation.NameInMap("UpgradeType")
        private Integer upgradeType;

        @com.aliyun.core.annotation.NameInMap("WhitelistIds")
        private String whitelistIds;

        private TaskInfo(Builder builder) {
            this.appCode = builder.appCode;
            this.creator = builder.creator;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.greyConfigInfo = builder.greyConfigInfo;
            this.greyEndtime = builder.greyEndtime;
            this.greyNum = builder.greyNum;
            this.historyForce = builder.historyForce;
            this.id = builder.id;
            this.isEnterprise = builder.isEnterprise;
            this.memo = builder.memo;
            this.modifier = builder.modifier;
            this.packageInfoId = builder.packageInfoId;
            this.platform = builder.platform;
            this.productId = builder.productId;
            this.productVersion = builder.productVersion;
            this.publishMode = builder.publishMode;
            this.publishType = builder.publishType;
            this.pushContent = builder.pushContent;
            this.taskStatus = builder.taskStatus;
            this.upgradeContent = builder.upgradeContent;
            this.upgradeType = builder.upgradeType;
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
         * @return whitelistIds
         */
        public String getWhitelistIds() {
            return this.whitelistIds;
        }

        public static final class Builder {
            private String appCode; 
            private String creator; 
            private String gmtCreate; 
            private String gmtModified; 
            private String greyConfigInfo; 
            private String greyEndtime; 
            private Integer greyNum; 
            private Integer historyForce; 
            private Long id; 
            private Integer isEnterprise; 
            private String memo; 
            private String modifier; 
            private Long packageInfoId; 
            private String platform; 
            private String productId; 
            private String productVersion; 
            private Integer publishMode; 
            private Integer publishType; 
            private String pushContent; 
            private Integer taskStatus; 
            private String upgradeContent; 
            private Integer upgradeType; 
            private String whitelistIds; 

            private Builder() {
            } 

            private Builder(TaskInfo model) {
                this.appCode = model.appCode;
                this.creator = model.creator;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.greyConfigInfo = model.greyConfigInfo;
                this.greyEndtime = model.greyEndtime;
                this.greyNum = model.greyNum;
                this.historyForce = model.historyForce;
                this.id = model.id;
                this.isEnterprise = model.isEnterprise;
                this.memo = model.memo;
                this.modifier = model.modifier;
                this.packageInfoId = model.packageInfoId;
                this.platform = model.platform;
                this.productId = model.productId;
                this.productVersion = model.productVersion;
                this.publishMode = model.publishMode;
                this.publishType = model.publishType;
                this.pushContent = model.pushContent;
                this.taskStatus = model.taskStatus;
                this.upgradeContent = model.upgradeContent;
                this.upgradeType = model.upgradeType;
                this.whitelistIds = model.whitelistIds;
            } 

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
    /**
     * 
     * {@link ListMcubeUpgradeTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcubeUpgradeTasksResponseBody</p>
     */
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
        private java.util.List<TaskInfo> taskInfo;

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
        public java.util.List<TaskInfo> getTaskInfo() {
            return this.taskInfo;
        }

        public static final class Builder {
            private String errorCode; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 
            private java.util.List<TaskInfo> taskInfo; 

            private Builder() {
            } 

            private Builder(ListTaskResult model) {
                this.errorCode = model.errorCode;
                this.requestId = model.requestId;
                this.resultMsg = model.resultMsg;
                this.success = model.success;
                this.taskInfo = model.taskInfo;
            } 

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
            public Builder taskInfo(java.util.List<TaskInfo> taskInfo) {
                this.taskInfo = taskInfo;
                return this;
            }

            public ListTaskResult build() {
                return new ListTaskResult(this);
            } 

        } 

    }
}
