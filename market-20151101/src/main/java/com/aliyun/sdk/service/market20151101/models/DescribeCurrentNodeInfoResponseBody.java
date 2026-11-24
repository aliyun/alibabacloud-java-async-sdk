// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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

        private Builder() {
        } 

        private Builder(DescribeCurrentNodeInfoResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>00eb4de1-6cff-4f56-833e-7b1e070e398d</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The process node information returned upon success.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCurrentNodeInfoResponseBody build() {
            return new DescribeCurrentNodeInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCurrentNodeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCurrentNodeInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.allowRollbackNode = model.allowRollbackNode;
                this.autoFinishNode = model.autoFinishNode;
                this.finalStepNo = model.finalStepNo;
                this.gmtExpired = model.gmtExpired;
                this.gmtFinished = model.gmtFinished;
                this.gmtStart = model.gmtStart;
                this.needAttachment = model.needAttachment;
                this.nextNodeId = model.nextNodeId;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.nodeStatus = model.nodeStatus;
                this.operatorRole = model.operatorRole;
                this.parentNodeId = model.parentNodeId;
                this.previousNodeId = model.previousNodeId;
                this.stepNo = model.stepNo;
                this.templateForm = model.templateForm;
            } 

            /**
             * <p>Indicates whether rollback to the previous process node is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowRollbackNode(Boolean allowRollbackNode) {
                this.allowRollbackNode = allowRollbackNode;
                return this;
            }

            /**
             * <p>Indicates whether the node is automatically completed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoFinishNode(Boolean autoFinishNode) {
                this.autoFinishNode = autoFinishNode;
                return this;
            }

            /**
             * <p>The sequence number of the last node.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder finalStepNo(Integer finalStepNo) {
                this.finalStepNo = finalStepNo;
                return this;
            }

            /**
             * <p>The timeout of the process node. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1588920725000</p>
             */
            public Builder gmtExpired(Long gmtExpired) {
                this.gmtExpired = gmtExpired;
                return this;
            }

            /**
             * <p>The completion time of the process node. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1588920725000</p>
             */
            public Builder gmtFinished(Long gmtFinished) {
                this.gmtFinished = gmtFinished;
                return this;
            }

            /**
             * <p>The start time of the process node. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1588834325000</p>
             */
            public Builder gmtStart(Long gmtStart) {
                this.gmtStart = gmtStart;
                return this;
            }

            /**
             * <p>Indicates whether uploading an attachment is mandatory.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder needAttachment(Boolean needAttachment) {
                this.needAttachment = needAttachment;
                return this;
            }

            /**
             * <p>The ID of the next process node.</p>
             * 
             * <strong>example:</strong>
             * <p>8473</p>
             */
            public Builder nextNodeId(Long nextNodeId) {
                this.nextNodeId = nextNodeId;
                return this;
            }

            /**
             * <p>The ID of the process node.</p>
             * 
             * <strong>example:</strong>
             * <p>8472</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Waiting for service activation</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The execution status of the node. Valid values:</p>
             * <ul>
             * <li>NotStart: not started.</li>
             * <li>Starting: in progress.</li>
             * <li>Cancel: canceled.</li>
             * <li>Finish: completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Starting</p>
             */
            public Builder nodeStatus(String nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * <p>The role of the operator for the process node. Valid values:</p>
             * <ul>
             * <li>system: system.</li>
             * <li>custom: user.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Provider</p>
             */
            public Builder operatorRole(String operatorRole) {
                this.operatorRole = operatorRole;
                return this;
            }

            /**
             * <p>The ID of the parent process node.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parentNodeId(Long parentNodeId) {
                this.parentNodeId = parentNodeId;
                return this;
            }

            /**
             * <p>The ID of the previous process node.</p>
             * 
             * <strong>example:</strong>
             * <p>8471</p>
             */
            public Builder previousNodeId(Long previousNodeId) {
                this.previousNodeId = previousNodeId;
                return this;
            }

            /**
             * <p>The sequence number of the process node.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder stepNo(Integer stepNo) {
                this.stepNo = stepNo;
                return this;
            }

            /**
             * <p>The form content of the process node in JSON format.
             * Sample code:
             * <code>[ { &quot;fieldKey&quot;: &quot;TFD0&quot;, //form key &quot;isRequired&quot;: true, //whether the field is required &quot;maxLength&quot;: 50, //maximum length &quot;placeHolder&quot;: &quot;Name&quot;, //form value description &quot;stepNum&quot;: 0, //sort value (ascending) &quot;title&quot;: &quot;Consignee name&quot;, //form title &quot;type&quot;: &quot;text&quot; //form type }, { &quot;fieldKey&quot;: &quot;TFD1&quot;, &quot;isRequired&quot;: true, &quot;maxLength&quot;: 50, &quot;placeHolder&quot;: &quot;Phone number&quot;, &quot;stepNum&quot;: 1, &quot;title&quot;: &quot;Consignee phone number&quot;, &quot;type&quot;: &quot;text&quot; }, { &quot;fieldKey&quot;: &quot;TFD2&quot;, &quot;isRequired&quot;: true, &quot;maxLength&quot;: 50, &quot;placeHolder&quot;: &quot;Province, city, district, street, and house number&quot;, &quot;stepNum&quot;: 2, &quot;title&quot;: &quot;Detailed shipping address&quot;, &quot;type&quot;: &quot;textarea&quot; } ]</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>[ {&quot;fieldKey&quot;: &quot;TFD0&quot;,&quot;isRequired&quot;: true,&quot;maxLength&quot;: 50, &quot;placeHolder&quot;: &quot;Name&quot;,&quot;stepNum&quot;: 0,&quot;title&quot;: &quot;Consignee name&quot;,&quot;type&quot;: &quot;text&quot; },{ &quot;fieldKey&quot;: &quot;TFD1&quot;,&quot;isRequired&quot;: true,&quot;maxLength&quot;: 50,&quot;placeHolder&quot;: &quot;Phone number&quot;,&quot;stepNum&quot;: 1,&quot;title&quot;: &quot;Consignee phone number&quot;,&quot;type&quot;: &quot;text&quot;},{&quot;fieldKey&quot;: &quot;TFD2&quot;,&quot;isRequired&quot;: true,&quot;maxLength&quot;: 50,&quot;placeHolder&quot;: &quot;Province, city, district, street, and house number&quot;,&quot;stepNum&quot;: 2,&quot;title&quot;: &quot;Detailed shipping address&quot;,&quot;type&quot;: &quot;textarea&quot;}]</p>
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
