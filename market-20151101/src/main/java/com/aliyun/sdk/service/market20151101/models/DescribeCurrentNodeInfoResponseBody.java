// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCurrentNodeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCurrentNodeInfoResponseBody</p>
 */
public class DescribeCurrentNodeInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCurrentNodeInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCurrentNodeInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCurrentNodeInfoResponseBody build() {
            return new DescribeCurrentNodeInfoResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowRollbackNode")
        private Boolean allowRollbackNode;

        @com.aliyun.core.annotation.NameInMap("AutoFinishNode")
        private Boolean autoFinishNode;

        @com.aliyun.core.annotation.NameInMap("FinalStepNo")
        private Integer finalStepNo;

        @com.aliyun.core.annotation.NameInMap("GmtExpired")
        private Long gmtExpired;

        @com.aliyun.core.annotation.NameInMap("GmtFinished")
        private Long gmtFinished;

        @com.aliyun.core.annotation.NameInMap("GmtStart")
        private Long gmtStart;

        @com.aliyun.core.annotation.NameInMap("NeedAttachment")
        private Boolean needAttachment;

        @com.aliyun.core.annotation.NameInMap("NextNodeId")
        private Long nextNodeId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeStatus")
        private String nodeStatus;

        @com.aliyun.core.annotation.NameInMap("OperatorRole")
        private String operatorRole;

        @com.aliyun.core.annotation.NameInMap("ParentNodeId")
        private Long parentNodeId;

        @com.aliyun.core.annotation.NameInMap("PreviousNodeId")
        private Long previousNodeId;

        @com.aliyun.core.annotation.NameInMap("StepNo")
        private Integer stepNo;

        @com.aliyun.core.annotation.NameInMap("TemplateForm")
        private String templateForm;

        private Result(Builder builder) {
            this.allowRollbackNode = builder.allowRollbackNode;
            this.autoFinishNode = builder.autoFinishNode;
            this.finalStepNo = builder.finalStepNo;
            this.gmtExpired = builder.gmtExpired;
            this.gmtFinished = builder.gmtFinished;
            this.gmtStart = builder.gmtStart;
            this.needAttachment = builder.needAttachment;
            this.nextNodeId = builder.nextNodeId;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeStatus = builder.nodeStatus;
            this.operatorRole = builder.operatorRole;
            this.parentNodeId = builder.parentNodeId;
            this.previousNodeId = builder.previousNodeId;
            this.stepNo = builder.stepNo;
            this.templateForm = builder.templateForm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return allowRollbackNode
         */
        public Boolean getAllowRollbackNode() {
            return this.allowRollbackNode;
        }

        /**
         * @return autoFinishNode
         */
        public Boolean getAutoFinishNode() {
            return this.autoFinishNode;
        }

        /**
         * @return finalStepNo
         */
        public Integer getFinalStepNo() {
            return this.finalStepNo;
        }

        /**
         * @return gmtExpired
         */
        public Long getGmtExpired() {
            return this.gmtExpired;
        }

        /**
         * @return gmtFinished
         */
        public Long getGmtFinished() {
            return this.gmtFinished;
        }

        /**
         * @return gmtStart
         */
        public Long getGmtStart() {
            return this.gmtStart;
        }

        /**
         * @return needAttachment
         */
        public Boolean getNeedAttachment() {
            return this.needAttachment;
        }

        /**
         * @return nextNodeId
         */
        public Long getNextNodeId() {
            return this.nextNodeId;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
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
         * @return operatorRole
         */
        public String getOperatorRole() {
            return this.operatorRole;
        }

        /**
         * @return parentNodeId
         */
        public Long getParentNodeId() {
            return this.parentNodeId;
        }

        /**
         * @return previousNodeId
         */
        public Long getPreviousNodeId() {
            return this.previousNodeId;
        }

        /**
         * @return stepNo
         */
        public Integer getStepNo() {
            return this.stepNo;
        }

        /**
         * @return templateForm
         */
        public String getTemplateForm() {
            return this.templateForm;
        }

        public static final class Builder {
            private Boolean allowRollbackNode; 
            private Boolean autoFinishNode; 
            private Integer finalStepNo; 
            private Long gmtExpired; 
            private Long gmtFinished; 
            private Long gmtStart; 
            private Boolean needAttachment; 
            private Long nextNodeId; 
            private Long nodeId; 
            private String nodeName; 
            private String nodeStatus; 
            private String operatorRole; 
            private Long parentNodeId; 
            private Long previousNodeId; 
            private Integer stepNo; 
            private String templateForm; 

            /**
             * AllowRollbackNode.
             */
            public Builder allowRollbackNode(Boolean allowRollbackNode) {
                this.allowRollbackNode = allowRollbackNode;
                return this;
            }

            /**
             * AutoFinishNode.
             */
            public Builder autoFinishNode(Boolean autoFinishNode) {
                this.autoFinishNode = autoFinishNode;
                return this;
            }

            /**
             * FinalStepNo.
             */
            public Builder finalStepNo(Integer finalStepNo) {
                this.finalStepNo = finalStepNo;
                return this;
            }

            /**
             * GmtExpired.
             */
            public Builder gmtExpired(Long gmtExpired) {
                this.gmtExpired = gmtExpired;
                return this;
            }

            /**
             * GmtFinished.
             */
            public Builder gmtFinished(Long gmtFinished) {
                this.gmtFinished = gmtFinished;
                return this;
            }

            /**
             * GmtStart.
             */
            public Builder gmtStart(Long gmtStart) {
                this.gmtStart = gmtStart;
                return this;
            }

            /**
             * NeedAttachment.
             */
            public Builder needAttachment(Boolean needAttachment) {
                this.needAttachment = needAttachment;
                return this;
            }

            /**
             * NextNodeId.
             */
            public Builder nextNodeId(Long nextNodeId) {
                this.nextNodeId = nextNodeId;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
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
             * OperatorRole.
             */
            public Builder operatorRole(String operatorRole) {
                this.operatorRole = operatorRole;
                return this;
            }

            /**
             * ParentNodeId.
             */
            public Builder parentNodeId(Long parentNodeId) {
                this.parentNodeId = parentNodeId;
                return this;
            }

            /**
             * PreviousNodeId.
             */
            public Builder previousNodeId(Long previousNodeId) {
                this.previousNodeId = previousNodeId;
                return this;
            }

            /**
             * StepNo.
             */
            public Builder stepNo(Integer stepNo) {
                this.stepNo = stepNo;
                return this;
            }

            /**
             * TemplateForm.
             */
            public Builder templateForm(String templateForm) {
                this.templateForm = templateForm;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
