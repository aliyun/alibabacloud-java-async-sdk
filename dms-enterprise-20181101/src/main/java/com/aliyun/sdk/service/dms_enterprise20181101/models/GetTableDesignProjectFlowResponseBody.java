// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableDesignProjectFlowResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableDesignProjectFlowResponseBody</p>
 */
public class GetTableDesignProjectFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("ProjectFlow")
    private ProjectFlow projectFlow;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetTableDesignProjectFlowResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.projectFlow = builder.projectFlow;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableDesignProjectFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return projectFlow
     */
    public ProjectFlow getProjectFlow() {
        return this.projectFlow;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private ProjectFlow projectFlow; 
        private String requestId; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * ProjectFlow.
         */
        public Builder projectFlow(ProjectFlow projectFlow) {
            this.projectFlow = projectFlow;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTableDesignProjectFlowResponseBody build() {
            return new GetTableDesignProjectFlowResponseBody(this);
        } 

    } 

    public static class FlowNodeArray extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackToDesign")
        private Boolean backToDesign;

        @com.aliyun.core.annotation.NameInMap("CanSkip")
        private Boolean canSkip;

        @com.aliyun.core.annotation.NameInMap("NodeRole")
        private String nodeRole;

        @com.aliyun.core.annotation.NameInMap("NodeTitle")
        private String nodeTitle;

        @com.aliyun.core.annotation.NameInMap("Position")
        private Integer position;

        @com.aliyun.core.annotation.NameInMap("PublishAnchor")
        private Boolean publishAnchor;

        @com.aliyun.core.annotation.NameInMap("PublishStrategies")
        private java.util.List < String > publishStrategies;

        private FlowNodeArray(Builder builder) {
            this.backToDesign = builder.backToDesign;
            this.canSkip = builder.canSkip;
            this.nodeRole = builder.nodeRole;
            this.nodeTitle = builder.nodeTitle;
            this.position = builder.position;
            this.publishAnchor = builder.publishAnchor;
            this.publishStrategies = builder.publishStrategies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowNodeArray create() {
            return builder().build();
        }

        /**
         * @return backToDesign
         */
        public Boolean getBackToDesign() {
            return this.backToDesign;
        }

        /**
         * @return canSkip
         */
        public Boolean getCanSkip() {
            return this.canSkip;
        }

        /**
         * @return nodeRole
         */
        public String getNodeRole() {
            return this.nodeRole;
        }

        /**
         * @return nodeTitle
         */
        public String getNodeTitle() {
            return this.nodeTitle;
        }

        /**
         * @return position
         */
        public Integer getPosition() {
            return this.position;
        }

        /**
         * @return publishAnchor
         */
        public Boolean getPublishAnchor() {
            return this.publishAnchor;
        }

        /**
         * @return publishStrategies
         */
        public java.util.List < String > getPublishStrategies() {
            return this.publishStrategies;
        }

        public static final class Builder {
            private Boolean backToDesign; 
            private Boolean canSkip; 
            private String nodeRole; 
            private String nodeTitle; 
            private Integer position; 
            private Boolean publishAnchor; 
            private java.util.List < String > publishStrategies; 

            /**
             * BackToDesign.
             */
            public Builder backToDesign(Boolean backToDesign) {
                this.backToDesign = backToDesign;
                return this;
            }

            /**
             * CanSkip.
             */
            public Builder canSkip(Boolean canSkip) {
                this.canSkip = canSkip;
                return this;
            }

            /**
             * NodeRole.
             */
            public Builder nodeRole(String nodeRole) {
                this.nodeRole = nodeRole;
                return this;
            }

            /**
             * NodeTitle.
             */
            public Builder nodeTitle(String nodeTitle) {
                this.nodeTitle = nodeTitle;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(Integer position) {
                this.position = position;
                return this;
            }

            /**
             * PublishAnchor.
             */
            public Builder publishAnchor(Boolean publishAnchor) {
                this.publishAnchor = publishAnchor;
                return this;
            }

            /**
             * PublishStrategies.
             */
            public Builder publishStrategies(java.util.List < String > publishStrategies) {
                this.publishStrategies = publishStrategies;
                return this;
            }

            public FlowNodeArray build() {
                return new FlowNodeArray(this);
            } 

        } 

    }
    public static class ProjectFlow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPosition")
        private Integer currentPosition;

        @com.aliyun.core.annotation.NameInMap("FlowNodeArray")
        private java.util.List < FlowNodeArray> flowNodeArray;

        @com.aliyun.core.annotation.NameInMap("RuleComment")
        private String ruleComment;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private ProjectFlow(Builder builder) {
            this.currentPosition = builder.currentPosition;
            this.flowNodeArray = builder.flowNodeArray;
            this.ruleComment = builder.ruleComment;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectFlow create() {
            return builder().build();
        }

        /**
         * @return currentPosition
         */
        public Integer getCurrentPosition() {
            return this.currentPosition;
        }

        /**
         * @return flowNodeArray
         */
        public java.util.List < FlowNodeArray> getFlowNodeArray() {
            return this.flowNodeArray;
        }

        /**
         * @return ruleComment
         */
        public String getRuleComment() {
            return this.ruleComment;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private Integer currentPosition; 
            private java.util.List < FlowNodeArray> flowNodeArray; 
            private String ruleComment; 
            private String ruleName; 

            /**
             * CurrentPosition.
             */
            public Builder currentPosition(Integer currentPosition) {
                this.currentPosition = currentPosition;
                return this;
            }

            /**
             * FlowNodeArray.
             */
            public Builder flowNodeArray(java.util.List < FlowNodeArray> flowNodeArray) {
                this.flowNodeArray = flowNodeArray;
                return this;
            }

            /**
             * RuleComment.
             */
            public Builder ruleComment(String ruleComment) {
                this.ruleComment = ruleComment;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public ProjectFlow build() {
                return new ProjectFlow(this);
            } 

        } 

    }
}
