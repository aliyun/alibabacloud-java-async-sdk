// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMcubeMiniTaskResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMcubeMiniTaskResponseBody</p>
 */
public class QueryMcubeMiniTaskResponseBody extends TeaModel {
    @NameInMap("QueryMiniTaskResult")
    private QueryMiniTaskResult queryMiniTaskResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultMessage")
    private String resultMessage;

    private QueryMcubeMiniTaskResponseBody(Builder builder) {
        this.queryMiniTaskResult = builder.queryMiniTaskResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMcubeMiniTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return queryMiniTaskResult
     */
    public QueryMiniTaskResult getQueryMiniTaskResult() {
        return this.queryMiniTaskResult;
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
        private QueryMiniTaskResult queryMiniTaskResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * QueryMiniTaskResult.
         */
        public Builder queryMiniTaskResult(QueryMiniTaskResult queryMiniTaskResult) {
            this.queryMiniTaskResult = queryMiniTaskResult;
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

        public QueryMcubeMiniTaskResponseBody build() {
            return new QueryMcubeMiniTaskResponseBody(this);
        } 

    } 

    public static class MiniTaskInfo extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("GreyConfigInfo")
        private String greyConfigInfo;

        @NameInMap("GreyEndtime")
        private String greyEndtime;

        @NameInMap("GreyEndtimeData")
        private String greyEndtimeData;

        @NameInMap("GreyNum")
        private Long greyNum;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Memo")
        private String memo;

        @NameInMap("PackageId")
        private Long packageId;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("ProductVersion")
        private String productVersion;

        @NameInMap("PublishMode")
        private Long publishMode;

        @NameInMap("PublishType")
        private Long publishType;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskStatus")
        private Long taskStatus;

        @NameInMap("WhitelistIds")
        private String whitelistIds;

        private MiniTaskInfo(Builder builder) {
            this.appCode = builder.appCode;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.greyConfigInfo = builder.greyConfigInfo;
            this.greyEndtime = builder.greyEndtime;
            this.greyEndtimeData = builder.greyEndtimeData;
            this.greyNum = builder.greyNum;
            this.id = builder.id;
            this.memo = builder.memo;
            this.packageId = builder.packageId;
            this.platform = builder.platform;
            this.productVersion = builder.productVersion;
            this.publishMode = builder.publishMode;
            this.publishType = builder.publishType;
            this.status = builder.status;
            this.taskStatus = builder.taskStatus;
            this.whitelistIds = builder.whitelistIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MiniTaskInfo create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
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
         * @return greyEndtimeData
         */
        public String getGreyEndtimeData() {
            return this.greyEndtimeData;
        }

        /**
         * @return greyNum
         */
        public Long getGreyNum() {
            return this.greyNum;
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
         * @return packageId
         */
        public Long getPackageId() {
            return this.packageId;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
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
        public Long getPublishMode() {
            return this.publishMode;
        }

        /**
         * @return publishType
         */
        public Long getPublishType() {
            return this.publishType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskStatus
         */
        public Long getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return whitelistIds
         */
        public String getWhitelistIds() {
            return this.whitelistIds;
        }

        public static final class Builder {
            private String appCode; 
            private String gmtCreate; 
            private String gmtModified; 
            private String greyConfigInfo; 
            private String greyEndtime; 
            private String greyEndtimeData; 
            private Long greyNum; 
            private Long id; 
            private String memo; 
            private Long packageId; 
            private String platform; 
            private String productVersion; 
            private Long publishMode; 
            private Long publishType; 
            private String status; 
            private Long taskStatus; 
            private String whitelistIds; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
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
             * GreyEndtimeData.
             */
            public Builder greyEndtimeData(String greyEndtimeData) {
                this.greyEndtimeData = greyEndtimeData;
                return this;
            }

            /**
             * GreyNum.
             */
            public Builder greyNum(Long greyNum) {
                this.greyNum = greyNum;
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
             * PackageId.
             */
            public Builder packageId(Long packageId) {
                this.packageId = packageId;
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
             * ProductVersion.
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
                return this;
            }

            /**
             * PublishMode.
             */
            public Builder publishMode(Long publishMode) {
                this.publishMode = publishMode;
                return this;
            }

            /**
             * PublishType.
             */
            public Builder publishType(Long publishType) {
                this.publishType = publishType;
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
             * TaskStatus.
             */
            public Builder taskStatus(Long taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * WhitelistIds.
             */
            public Builder whitelistIds(String whitelistIds) {
                this.whitelistIds = whitelistIds;
                return this;
            }

            public MiniTaskInfo build() {
                return new MiniTaskInfo(this);
            } 

        } 

    }
    public static class QueryMiniTaskResult extends TeaModel {
        @NameInMap("MiniTaskInfo")
        private MiniTaskInfo miniTaskInfo;

        @NameInMap("ResultMsg")
        private String resultMsg;

        @NameInMap("Success")
        private Boolean success;

        private QueryMiniTaskResult(Builder builder) {
            this.miniTaskInfo = builder.miniTaskInfo;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryMiniTaskResult create() {
            return builder().build();
        }

        /**
         * @return miniTaskInfo
         */
        public MiniTaskInfo getMiniTaskInfo() {
            return this.miniTaskInfo;
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
            private MiniTaskInfo miniTaskInfo; 
            private String resultMsg; 
            private Boolean success; 

            /**
             * MiniTaskInfo.
             */
            public Builder miniTaskInfo(MiniTaskInfo miniTaskInfo) {
                this.miniTaskInfo = miniTaskInfo;
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

            public QueryMiniTaskResult build() {
                return new QueryMiniTaskResult(this);
            } 

        } 

    }
}
