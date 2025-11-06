// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link ListMdsCubeTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListMdsCubeTasksResponseBody</p>
 */
public class ListMdsCubeTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultContent")
    private ResultContent resultContent;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private ListMdsCubeTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultContent = builder.resultContent;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMdsCubeTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resultContent
     */
    public ResultContent getResultContent() {
        return this.resultContent;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private String requestId; 
        private String resultCode; 
        private ResultContent resultContent; 
        private String resultMessage; 

        private Builder() {
        } 

        private Builder(ListMdsCubeTasksResponseBody model) {
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultContent = model.resultContent;
            this.resultMessage = model.resultMessage;
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
         * ResultContent.
         */
        public Builder resultContent(ResultContent resultContent) {
            this.resultContent = resultContent;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public ListMdsCubeTasksResponseBody build() {
            return new ListMdsCubeTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMdsCubeTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListMdsCubeTasksResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GreyConfigInfo")
        private String greyConfigInfo;

        @com.aliyun.core.annotation.NameInMap("GreyEndtimeData")
        private String greyEndtimeData;

        @com.aliyun.core.annotation.NameInMap("GreyNum")
        private Integer greyNum;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("PublishMode")
        private Integer publishMode;

        @com.aliyun.core.annotation.NameInMap("PublishType")
        private Integer publishType;

        @com.aliyun.core.annotation.NameInMap("ResourceVersion")
        private String resourceVersion;

        @com.aliyun.core.annotation.NameInMap("TaskDesc")
        private String taskDesc;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Integer taskStatus;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateResourceId")
        private Long templateResourceId;

        @com.aliyun.core.annotation.NameInMap("WhitelistIds")
        private String whitelistIds;

        private Content(Builder builder) {
            this.appCode = builder.appCode;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.greyConfigInfo = builder.greyConfigInfo;
            this.greyEndtimeData = builder.greyEndtimeData;
            this.greyNum = builder.greyNum;
            this.id = builder.id;
            this.operator = builder.operator;
            this.publishMode = builder.publishMode;
            this.publishType = builder.publishType;
            this.resourceVersion = builder.resourceVersion;
            this.taskDesc = builder.taskDesc;
            this.taskStatus = builder.taskStatus;
            this.templateId = builder.templateId;
            this.templateResourceId = builder.templateResourceId;
            this.whitelistIds = builder.whitelistIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
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
         * @return resourceVersion
         */
        public String getResourceVersion() {
            return this.resourceVersion;
        }

        /**
         * @return taskDesc
         */
        public String getTaskDesc() {
            return this.taskDesc;
        }

        /**
         * @return taskStatus
         */
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateResourceId
         */
        public Long getTemplateResourceId() {
            return this.templateResourceId;
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
            private String greyEndtimeData; 
            private Integer greyNum; 
            private Long id; 
            private String operator; 
            private Integer publishMode; 
            private Integer publishType; 
            private String resourceVersion; 
            private String taskDesc; 
            private Integer taskStatus; 
            private String templateId; 
            private Long templateResourceId; 
            private String whitelistIds; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.appCode = model.appCode;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.greyConfigInfo = model.greyConfigInfo;
                this.greyEndtimeData = model.greyEndtimeData;
                this.greyNum = model.greyNum;
                this.id = model.id;
                this.operator = model.operator;
                this.publishMode = model.publishMode;
                this.publishType = model.publishType;
                this.resourceVersion = model.resourceVersion;
                this.taskDesc = model.taskDesc;
                this.taskStatus = model.taskStatus;
                this.templateId = model.templateId;
                this.templateResourceId = model.templateResourceId;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
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
             * ResourceVersion.
             */
            public Builder resourceVersion(String resourceVersion) {
                this.resourceVersion = resourceVersion;
                return this;
            }

            /**
             * TaskDesc.
             */
            public Builder taskDesc(String taskDesc) {
                this.taskDesc = taskDesc;
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
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateResourceId.
             */
            public Builder templateResourceId(Long templateResourceId) {
                this.templateResourceId = templateResourceId;
                return this;
            }

            /**
             * WhitelistIds.
             */
            public Builder whitelistIds(String whitelistIds) {
                this.whitelistIds = whitelistIds;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMdsCubeTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListMdsCubeTasksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.content = builder.content;
            this.errorCode = builder.errorCode;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
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

        public static final class Builder {
            private java.util.List<Content> content; 
            private String errorCode; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.errorCode = model.errorCode;
                this.requestId = model.requestId;
                this.resultMsg = model.resultMsg;
                this.success = model.success;
            } 

            /**
             * Content.
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMdsCubeTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListMdsCubeTasksResponseBody</p>
     */
    public static class ResultContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        private ResultContent(Builder builder) {
            this.data = builder.data;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultContent create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private Data data; 
            private String requestId; 

            private Builder() {
            } 

            private Builder(ResultContent model) {
                this.data = model.data;
                this.requestId = model.requestId;
            } 

            /**
             * Data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public ResultContent build() {
                return new ResultContent(this);
            } 

        } 

    }
}
