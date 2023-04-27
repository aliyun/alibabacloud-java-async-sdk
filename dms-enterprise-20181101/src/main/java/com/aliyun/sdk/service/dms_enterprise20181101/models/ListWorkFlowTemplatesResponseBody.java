// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkFlowTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkFlowTemplatesResponseBody</p>
 */
public class ListWorkFlowTemplatesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("WorkFlowTemplates")
    private WorkFlowTemplates workFlowTemplates;

    private ListWorkFlowTemplatesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.workFlowTemplates = builder.workFlowTemplates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkFlowTemplatesResponseBody create() {
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

    /**
     * @return workFlowTemplates
     */
    public WorkFlowTemplates getWorkFlowTemplates() {
        return this.workFlowTemplates;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private WorkFlowTemplates workFlowTemplates; 

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

        /**
         * WorkFlowTemplates.
         */
        public Builder workFlowTemplates(WorkFlowTemplates workFlowTemplates) {
            this.workFlowTemplates = workFlowTemplates;
            return this;
        }

        public ListWorkFlowTemplatesResponseBody build() {
            return new ListWorkFlowTemplatesResponseBody(this);
        } 

    } 

    public static class WorkflowNode extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("CreateUserId")
        private Long createUserId;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("Position")
        private Integer position;

        @NameInMap("TemplateId")
        private Long templateId;

        private WorkflowNode(Builder builder) {
            this.comment = builder.comment;
            this.createUserId = builder.createUserId;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeType = builder.nodeType;
            this.position = builder.position;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowNode create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createUserId
         */
        public Long getCreateUserId() {
            return this.createUserId;
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
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return position
         */
        public Integer getPosition() {
            return this.position;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String comment; 
            private Long createUserId; 
            private Long nodeId; 
            private String nodeName; 
            private String nodeType; 
            private Integer position; 
            private Long templateId; 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CreateUserId.
             */
            public Builder createUserId(Long createUserId) {
                this.createUserId = createUserId;
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
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
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
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public WorkflowNode build() {
                return new WorkflowNode(this);
            } 

        } 

    }
    public static class WorkflowNodes extends TeaModel {
        @NameInMap("WorkflowNode")
        private java.util.List < WorkflowNode> workflowNode;

        private WorkflowNodes(Builder builder) {
            this.workflowNode = builder.workflowNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowNodes create() {
            return builder().build();
        }

        /**
         * @return workflowNode
         */
        public java.util.List < WorkflowNode> getWorkflowNode() {
            return this.workflowNode;
        }

        public static final class Builder {
            private java.util.List < WorkflowNode> workflowNode; 

            /**
             * WorkflowNode.
             */
            public Builder workflowNode(java.util.List < WorkflowNode> workflowNode) {
                this.workflowNode = workflowNode;
                return this;
            }

            public WorkflowNodes build() {
                return new WorkflowNodes(this);
            } 

        } 

    }
    public static class WorkFlowTemplate extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("CreateUserId")
        private Long createUserId;

        @NameInMap("Enabled")
        private String enabled;

        @NameInMap("IsSystem")
        private Integer isSystem;

        @NameInMap("TemplateId")
        private Long templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("WorkflowNodes")
        private WorkflowNodes workflowNodes;

        private WorkFlowTemplate(Builder builder) {
            this.comment = builder.comment;
            this.createUserId = builder.createUserId;
            this.enabled = builder.enabled;
            this.isSystem = builder.isSystem;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.workflowNodes = builder.workflowNodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkFlowTemplate create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createUserId
         */
        public Long getCreateUserId() {
            return this.createUserId;
        }

        /**
         * @return enabled
         */
        public String getEnabled() {
            return this.enabled;
        }

        /**
         * @return isSystem
         */
        public Integer getIsSystem() {
            return this.isSystem;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return workflowNodes
         */
        public WorkflowNodes getWorkflowNodes() {
            return this.workflowNodes;
        }

        public static final class Builder {
            private String comment; 
            private Long createUserId; 
            private String enabled; 
            private Integer isSystem; 
            private Long templateId; 
            private String templateName; 
            private WorkflowNodes workflowNodes; 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CreateUserId.
             */
            public Builder createUserId(Long createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(String enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * IsSystem.
             */
            public Builder isSystem(Integer isSystem) {
                this.isSystem = isSystem;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * WorkflowNodes.
             */
            public Builder workflowNodes(WorkflowNodes workflowNodes) {
                this.workflowNodes = workflowNodes;
                return this;
            }

            public WorkFlowTemplate build() {
                return new WorkFlowTemplate(this);
            } 

        } 

    }
    public static class WorkFlowTemplates extends TeaModel {
        @NameInMap("WorkFlowTemplate")
        private java.util.List < WorkFlowTemplate> workFlowTemplate;

        private WorkFlowTemplates(Builder builder) {
            this.workFlowTemplate = builder.workFlowTemplate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkFlowTemplates create() {
            return builder().build();
        }

        /**
         * @return workFlowTemplate
         */
        public java.util.List < WorkFlowTemplate> getWorkFlowTemplate() {
            return this.workFlowTemplate;
        }

        public static final class Builder {
            private java.util.List < WorkFlowTemplate> workFlowTemplate; 

            /**
             * WorkFlowTemplate.
             */
            public Builder workFlowTemplate(java.util.List < WorkFlowTemplate> workFlowTemplate) {
                this.workFlowTemplate = workFlowTemplate;
                return this;
            }

            public WorkFlowTemplates build() {
                return new WorkFlowTemplates(this);
            } 

        } 

    }
}
