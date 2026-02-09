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
 * {@link GetGameReviewByStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetGameReviewByStatusResponseBody</p>
 */
public class GetGameReviewByStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultContent")
    private ResultContent resultContent;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private GetGameReviewByStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultContent = builder.resultContent;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGameReviewByStatusResponseBody create() {
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

        private Builder(GetGameReviewByStatusResponseBody model) {
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

        public GetGameReviewByStatusResponseBody build() {
            return new GetGameReviewByStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGameReviewByStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetGameReviewByStatusResponseBody</p>
     */
    public static class ReviewProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FlowNodeId")
        private Long flowNodeId;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("NodeIndex")
        private Integer nodeIndex;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeStatus")
        private String nodeStatus;

        @com.aliyun.core.annotation.NameInMap("NodeStatusId")
        private Integer nodeStatusId;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private Long roleId;

        private ReviewProgress(Builder builder) {
            this.description = builder.description;
            this.flowNodeId = builder.flowNodeId;
            this.gmtModified = builder.gmtModified;
            this.nodeIndex = builder.nodeIndex;
            this.nodeName = builder.nodeName;
            this.nodeStatus = builder.nodeStatus;
            this.nodeStatusId = builder.nodeStatusId;
            this.operator = builder.operator;
            this.remark = builder.remark;
            this.roleId = builder.roleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewProgress create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return flowNodeId
         */
        public Long getFlowNodeId() {
            return this.flowNodeId;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return nodeIndex
         */
        public Integer getNodeIndex() {
            return this.nodeIndex;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeStatus
         */
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        /**
         * @return nodeStatusId
         */
        public Integer getNodeStatusId() {
            return this.nodeStatusId;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return roleId
         */
        public Long getRoleId() {
            return this.roleId;
        }

        public static final class Builder {
            private String description; 
            private Long flowNodeId; 
            private String gmtModified; 
            private Integer nodeIndex; 
            private String nodeName; 
            private String nodeStatus; 
            private Integer nodeStatusId; 
            private String operator; 
            private String remark; 
            private Long roleId; 

            private Builder() {
            } 

            private Builder(ReviewProgress model) {
                this.description = model.description;
                this.flowNodeId = model.flowNodeId;
                this.gmtModified = model.gmtModified;
                this.nodeIndex = model.nodeIndex;
                this.nodeName = model.nodeName;
                this.nodeStatus = model.nodeStatus;
                this.nodeStatusId = model.nodeStatusId;
                this.operator = model.operator;
                this.remark = model.remark;
                this.roleId = model.roleId;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FlowNodeId.
             */
            public Builder flowNodeId(Long flowNodeId) {
                this.flowNodeId = flowNodeId;
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
             * NodeIndex.
             */
            public Builder nodeIndex(Integer nodeIndex) {
                this.nodeIndex = nodeIndex;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * NodeStatus.
             */
            public Builder nodeStatus(String nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * NodeStatusId.
             */
            public Builder nodeStatusId(Integer nodeStatusId) {
                this.nodeStatusId = nodeStatusId;
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
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * RoleId.
             */
            public Builder roleId(Long roleId) {
                this.roleId = roleId;
                return this;
            }

            public ReviewProgress build() {
                return new ReviewProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGameReviewByStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetGameReviewByStatusResponseBody</p>
     */
    public static class TargetDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoOnline")
        private Boolean autoOnline;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("GameMaker")
        private String gameMaker;

        @com.aliyun.core.annotation.NameInMap("IconUrl")
        private String iconUrl;

        @com.aliyun.core.annotation.NameInMap("Introduction")
        private String introduction;

        @com.aliyun.core.annotation.NameInMap("MiniProgramCode")
        private String miniProgramCode;

        @com.aliyun.core.annotation.NameInMap("MiniProgramInfoId")
        private Long miniProgramInfoId;

        @com.aliyun.core.annotation.NameInMap("MiniProgramName")
        private String miniProgramName;

        @com.aliyun.core.annotation.NameInMap("MiniResourceId")
        private Long miniResourceId;

        @com.aliyun.core.annotation.NameInMap("PublishStatus")
        private Integer publishStatus;

        @com.aliyun.core.annotation.NameInMap("QrCodeUrl")
        private String qrCodeUrl;

        @com.aliyun.core.annotation.NameInMap("ReviewTargetType")
        private String reviewTargetType;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private Integer subType;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private Long targetId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private TargetDetail(Builder builder) {
            this.autoOnline = builder.autoOnline;
            this.category = builder.category;
            this.detail = builder.detail;
            this.gameMaker = builder.gameMaker;
            this.iconUrl = builder.iconUrl;
            this.introduction = builder.introduction;
            this.miniProgramCode = builder.miniProgramCode;
            this.miniProgramInfoId = builder.miniProgramInfoId;
            this.miniProgramName = builder.miniProgramName;
            this.miniResourceId = builder.miniResourceId;
            this.publishStatus = builder.publishStatus;
            this.qrCodeUrl = builder.qrCodeUrl;
            this.reviewTargetType = builder.reviewTargetType;
            this.subType = builder.subType;
            this.targetId = builder.targetId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetDetail create() {
            return builder().build();
        }

        /**
         * @return autoOnline
         */
        public Boolean getAutoOnline() {
            return this.autoOnline;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return gameMaker
         */
        public String getGameMaker() {
            return this.gameMaker;
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return introduction
         */
        public String getIntroduction() {
            return this.introduction;
        }

        /**
         * @return miniProgramCode
         */
        public String getMiniProgramCode() {
            return this.miniProgramCode;
        }

        /**
         * @return miniProgramInfoId
         */
        public Long getMiniProgramInfoId() {
            return this.miniProgramInfoId;
        }

        /**
         * @return miniProgramName
         */
        public String getMiniProgramName() {
            return this.miniProgramName;
        }

        /**
         * @return miniResourceId
         */
        public Long getMiniResourceId() {
            return this.miniResourceId;
        }

        /**
         * @return publishStatus
         */
        public Integer getPublishStatus() {
            return this.publishStatus;
        }

        /**
         * @return qrCodeUrl
         */
        public String getQrCodeUrl() {
            return this.qrCodeUrl;
        }

        /**
         * @return reviewTargetType
         */
        public String getReviewTargetType() {
            return this.reviewTargetType;
        }

        /**
         * @return subType
         */
        public Integer getSubType() {
            return this.subType;
        }

        /**
         * @return targetId
         */
        public Long getTargetId() {
            return this.targetId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean autoOnline; 
            private String category; 
            private String detail; 
            private String gameMaker; 
            private String iconUrl; 
            private String introduction; 
            private String miniProgramCode; 
            private Long miniProgramInfoId; 
            private String miniProgramName; 
            private Long miniResourceId; 
            private Integer publishStatus; 
            private String qrCodeUrl; 
            private String reviewTargetType; 
            private Integer subType; 
            private Long targetId; 
            private String version; 

            private Builder() {
            } 

            private Builder(TargetDetail model) {
                this.autoOnline = model.autoOnline;
                this.category = model.category;
                this.detail = model.detail;
                this.gameMaker = model.gameMaker;
                this.iconUrl = model.iconUrl;
                this.introduction = model.introduction;
                this.miniProgramCode = model.miniProgramCode;
                this.miniProgramInfoId = model.miniProgramInfoId;
                this.miniProgramName = model.miniProgramName;
                this.miniResourceId = model.miniResourceId;
                this.publishStatus = model.publishStatus;
                this.qrCodeUrl = model.qrCodeUrl;
                this.reviewTargetType = model.reviewTargetType;
                this.subType = model.subType;
                this.targetId = model.targetId;
                this.version = model.version;
            } 

            /**
             * AutoOnline.
             */
            public Builder autoOnline(Boolean autoOnline) {
                this.autoOnline = autoOnline;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * GameMaker.
             */
            public Builder gameMaker(String gameMaker) {
                this.gameMaker = gameMaker;
                return this;
            }

            /**
             * IconUrl.
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * Introduction.
             */
            public Builder introduction(String introduction) {
                this.introduction = introduction;
                return this;
            }

            /**
             * MiniProgramCode.
             */
            public Builder miniProgramCode(String miniProgramCode) {
                this.miniProgramCode = miniProgramCode;
                return this;
            }

            /**
             * MiniProgramInfoId.
             */
            public Builder miniProgramInfoId(Long miniProgramInfoId) {
                this.miniProgramInfoId = miniProgramInfoId;
                return this;
            }

            /**
             * MiniProgramName.
             */
            public Builder miniProgramName(String miniProgramName) {
                this.miniProgramName = miniProgramName;
                return this;
            }

            /**
             * MiniResourceId.
             */
            public Builder miniResourceId(Long miniResourceId) {
                this.miniResourceId = miniResourceId;
                return this;
            }

            /**
             * PublishStatus.
             */
            public Builder publishStatus(Integer publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * QrCodeUrl.
             */
            public Builder qrCodeUrl(String qrCodeUrl) {
                this.qrCodeUrl = qrCodeUrl;
                return this;
            }

            /**
             * ReviewTargetType.
             */
            public Builder reviewTargetType(String reviewTargetType) {
                this.reviewTargetType = reviewTargetType;
                return this;
            }

            /**
             * SubType.
             */
            public Builder subType(Integer subType) {
                this.subType = subType;
                return this;
            }

            /**
             * TargetId.
             */
            public Builder targetId(Long targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public TargetDetail build() {
                return new TargetDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGameReviewByStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetGameReviewByStatusResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Appendix")
        private String appendix;

        @com.aliyun.core.annotation.NameInMap("AutoOnline")
        private Boolean autoOnline;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private Long flowId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Icons")
        private java.util.List<String> icons;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ReviewChannel")
        private String reviewChannel;

        @com.aliyun.core.annotation.NameInMap("ReviewIntegerStatus")
        private Integer reviewIntegerStatus;

        @com.aliyun.core.annotation.NameInMap("ReviewProgress")
        private java.util.List<ReviewProgress> reviewProgress;

        @com.aliyun.core.annotation.NameInMap("ReviewStatus")
        private String reviewStatus;

        @com.aliyun.core.annotation.NameInMap("ReviewTarget")
        private Long reviewTarget;

        @com.aliyun.core.annotation.NameInMap("TargetDetail")
        private TargetDetail targetDetail;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private Content(Builder builder) {
            this.appendix = builder.appendix;
            this.autoOnline = builder.autoOnline;
            this.creator = builder.creator;
            this.extension = builder.extension;
            this.flowId = builder.flowId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.icons = builder.icons;
            this.id = builder.id;
            this.reviewChannel = builder.reviewChannel;
            this.reviewIntegerStatus = builder.reviewIntegerStatus;
            this.reviewProgress = builder.reviewProgress;
            this.reviewStatus = builder.reviewStatus;
            this.reviewTarget = builder.reviewTarget;
            this.targetDetail = builder.targetDetail;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return appendix
         */
        public String getAppendix() {
            return this.appendix;
        }

        /**
         * @return autoOnline
         */
        public Boolean getAutoOnline() {
            return this.autoOnline;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return flowId
         */
        public Long getFlowId() {
            return this.flowId;
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
         * @return icons
         */
        public java.util.List<String> getIcons() {
            return this.icons;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return reviewChannel
         */
        public String getReviewChannel() {
            return this.reviewChannel;
        }

        /**
         * @return reviewIntegerStatus
         */
        public Integer getReviewIntegerStatus() {
            return this.reviewIntegerStatus;
        }

        /**
         * @return reviewProgress
         */
        public java.util.List<ReviewProgress> getReviewProgress() {
            return this.reviewProgress;
        }

        /**
         * @return reviewStatus
         */
        public String getReviewStatus() {
            return this.reviewStatus;
        }

        /**
         * @return reviewTarget
         */
        public Long getReviewTarget() {
            return this.reviewTarget;
        }

        /**
         * @return targetDetail
         */
        public TargetDetail getTargetDetail() {
            return this.targetDetail;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String appendix; 
            private Boolean autoOnline; 
            private String creator; 
            private String extension; 
            private Long flowId; 
            private String gmtCreate; 
            private String gmtModified; 
            private java.util.List<String> icons; 
            private Long id; 
            private String reviewChannel; 
            private Integer reviewIntegerStatus; 
            private java.util.List<ReviewProgress> reviewProgress; 
            private String reviewStatus; 
            private Long reviewTarget; 
            private TargetDetail targetDetail; 
            private String targetType; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.appendix = model.appendix;
                this.autoOnline = model.autoOnline;
                this.creator = model.creator;
                this.extension = model.extension;
                this.flowId = model.flowId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.icons = model.icons;
                this.id = model.id;
                this.reviewChannel = model.reviewChannel;
                this.reviewIntegerStatus = model.reviewIntegerStatus;
                this.reviewProgress = model.reviewProgress;
                this.reviewStatus = model.reviewStatus;
                this.reviewTarget = model.reviewTarget;
                this.targetDetail = model.targetDetail;
                this.targetType = model.targetType;
            } 

            /**
             * Appendix.
             */
            public Builder appendix(String appendix) {
                this.appendix = appendix;
                return this;
            }

            /**
             * AutoOnline.
             */
            public Builder autoOnline(Boolean autoOnline) {
                this.autoOnline = autoOnline;
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
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * FlowId.
             */
            public Builder flowId(Long flowId) {
                this.flowId = flowId;
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
             * Icons.
             */
            public Builder icons(java.util.List<String> icons) {
                this.icons = icons;
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
             * ReviewChannel.
             */
            public Builder reviewChannel(String reviewChannel) {
                this.reviewChannel = reviewChannel;
                return this;
            }

            /**
             * ReviewIntegerStatus.
             */
            public Builder reviewIntegerStatus(Integer reviewIntegerStatus) {
                this.reviewIntegerStatus = reviewIntegerStatus;
                return this;
            }

            /**
             * ReviewProgress.
             */
            public Builder reviewProgress(java.util.List<ReviewProgress> reviewProgress) {
                this.reviewProgress = reviewProgress;
                return this;
            }

            /**
             * ReviewStatus.
             */
            public Builder reviewStatus(String reviewStatus) {
                this.reviewStatus = reviewStatus;
                return this;
            }

            /**
             * ReviewTarget.
             */
            public Builder reviewTarget(Long reviewTarget) {
                this.reviewTarget = reviewTarget;
                return this;
            }

            /**
             * TargetDetail.
             */
            public Builder targetDetail(TargetDetail targetDetail) {
                this.targetDetail = targetDetail;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGameReviewByStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetGameReviewByStatusResponseBody</p>
     */
    public static class ResultContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

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

        private ResultContent(Builder builder) {
            this.content = builder.content;
            this.errorCode = builder.errorCode;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultContent create() {
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
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
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
            private java.util.List<Content> content; 
            private String errorCode; 
            private Integer pageNum; 
            private Integer pageSize; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(ResultContent model) {
                this.content = model.content;
                this.errorCode = model.errorCode;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.requestId = model.requestId;
                this.resultMsg = model.resultMsg;
                this.success = model.success;
                this.totalCount = model.totalCount;
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
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
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

            public ResultContent build() {
                return new ResultContent(this);
            } 

        } 

    }
}
