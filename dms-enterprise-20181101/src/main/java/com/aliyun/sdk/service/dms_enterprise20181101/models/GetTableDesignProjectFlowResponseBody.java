// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetTableDesignProjectFlowResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.projectFlow = model.projectFlow;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The information about the schema design process.</p>
         */
        public Builder projectFlow(ProjectFlow projectFlow) {
            this.projectFlow = projectFlow;
            return this;
        }

        /**
         * <p>The request ID. You can use the request ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>B5FD0BC8-2D90-4478-B8EC-A0E92E0B1773</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTableDesignProjectFlowResponseBody build() {
            return new GetTableDesignProjectFlowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTableDesignProjectFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableDesignProjectFlowResponseBody</p>
     */
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
        private java.util.List<String> publishStrategies;

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
        public java.util.List<String> getPublishStrategies() {
            return this.publishStrategies;
        }

        public static final class Builder {
            private Boolean backToDesign; 
            private Boolean canSkip; 
            private String nodeRole; 
            private String nodeTitle; 
            private Integer position; 
            private Boolean publishAnchor; 
            private java.util.List<String> publishStrategies; 

            private Builder() {
            } 

            private Builder(FlowNodeArray model) {
                this.backToDesign = model.backToDesign;
                this.canSkip = model.canSkip;
                this.nodeRole = model.nodeRole;
                this.nodeTitle = model.nodeTitle;
                this.position = model.position;
                this.publishAnchor = model.publishAnchor;
                this.publishStrategies = model.publishStrategies;
            } 

            /**
             * <p>Indicates whether the ticket can be returned to the schema design node. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The ticket can be returned to the schema design node.</li>
             * <li><strong>0</strong>: The ticket cannot be returned to the schema design node. This value can be returned only for the PUBLISH node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder backToDesign(Boolean backToDesign) {
                this.backToDesign = backToDesign;
                return this;
            }

            /**
             * <p>Indicates whether the current node can be skipped. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The current node can be skipped.</li>
             * <li><strong>0</strong>: The current node cannot be skipped. This value can be returned only for the PUBLISH node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder canSkip(Boolean canSkip) {
                this.canSkip = canSkip;
                return this;
            }

            /**
             * <p>The role of the node in the process.</p>
             * <ul>
             * <li>START: The ticket was created.</li>
             * <li>DESIGN: The schema is being created.</li>
             * <li>PUBLISH: The schema is published.</li>
             * <li>END: The ticket is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DESIGN</p>
             */
            public Builder nodeRole(String nodeRole) {
                this.nodeRole = nodeRole;
                return this;
            }

            /**
             * <p>The title of the node.</p>
             */
            public Builder nodeTitle(String nodeTitle) {
                this.nodeTitle = nodeTitle;
                return this;
            }

            /**
             * <p>The position of the node in the process. The value starts from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder position(Integer position) {
                this.position = position;
                return this;
            }

            /**
             * <p>Indicates whether the node is the anchor node. A schema design process has only one anchor node, on which the schema is published. After the schema is published on the anchor node, a post-publish image is generated and the DDL metadata lock is released.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder publishAnchor(Boolean publishAnchor) {
                this.publishAnchor = publishAnchor;
                return this;
            }

            /**
             * <p>The available publishing strategies.</p>
             */
            public Builder publishStrategies(java.util.List<String> publishStrategies) {
                this.publishStrategies = publishStrategies;
                return this;
            }

            public FlowNodeArray build() {
                return new FlowNodeArray(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTableDesignProjectFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableDesignProjectFlowResponseBody</p>
     */
    public static class ProjectFlow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPosition")
        private Integer currentPosition;

        @com.aliyun.core.annotation.NameInMap("FlowNodeArray")
        private java.util.List<FlowNodeArray> flowNodeArray;

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
        public java.util.List<FlowNodeArray> getFlowNodeArray() {
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
            private java.util.List<FlowNodeArray> flowNodeArray; 
            private String ruleComment; 
            private String ruleName; 

            private Builder() {
            } 

            private Builder(ProjectFlow model) {
                this.currentPosition = model.currentPosition;
                this.flowNodeArray = model.flowNodeArray;
                this.ruleComment = model.ruleComment;
                this.ruleName = model.ruleName;
            } 

            /**
             * <p>The position of the current node in the process.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder currentPosition(Integer currentPosition) {
                this.currentPosition = currentPosition;
                return this;
            }

            /**
             * <p>The nodes in the process.</p>
             */
            public Builder flowNodeArray(java.util.List<FlowNodeArray> flowNodeArray) {
                this.flowNodeArray = flowNodeArray;
                return this;
            }

            /**
             * <p>The description of the security rule set that is applied to the schema design ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>mysq_test</p>
             */
            public Builder ruleComment(String ruleComment) {
                this.ruleComment = ruleComment;
                return this;
            }

            /**
             * <p>The name of the security rule set that is applied to the schema design ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql default</p>
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
