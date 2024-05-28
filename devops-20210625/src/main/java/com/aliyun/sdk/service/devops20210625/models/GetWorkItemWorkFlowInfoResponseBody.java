// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkItemWorkFlowInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkItemWorkFlowInfoResponseBody</p>
 */
public class GetWorkItemWorkFlowInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("workflow")
    private Workflow workflow;

    private GetWorkItemWorkFlowInfoResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.workflow = builder.workflow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkItemWorkFlowInfoResponseBody create() {
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
     * @return workflow
     */
    public Workflow getWorkflow() {
        return this.workflow;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Workflow workflow; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * workflow.
         */
        public Builder workflow(Workflow workflow) {
            this.workflow = workflow;
            return this;
        }

        public GetWorkItemWorkFlowInfoResponseBody build() {
            return new GetWorkItemWorkFlowInfoResponseBody(this);
        } 

    } 

    public static class Statuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("workflowStageIdentifier")
        private String workflowStageIdentifier;

        @com.aliyun.core.annotation.NameInMap("workflowStageName")
        private String workflowStageName;

        private Statuses(Builder builder) {
            this.creator = builder.creator;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.identifier = builder.identifier;
            this.modifier = builder.modifier;
            this.name = builder.name;
            this.resourceType = builder.resourceType;
            this.source = builder.source;
            this.workflowStageIdentifier = builder.workflowStageIdentifier;
            this.workflowStageName = builder.workflowStageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statuses create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return workflowStageIdentifier
         */
        public String getWorkflowStageIdentifier() {
            return this.workflowStageIdentifier;
        }

        /**
         * @return workflowStageName
         */
        public String getWorkflowStageName() {
            return this.workflowStageName;
        }

        public static final class Builder {
            private String creator; 
            private String description; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String identifier; 
            private String modifier; 
            private String name; 
            private String resourceType; 
            private String source; 
            private String workflowStageIdentifier; 
            private String workflowStageName; 

            /**
             * creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * workflowStageIdentifier.
             */
            public Builder workflowStageIdentifier(String workflowStageIdentifier) {
                this.workflowStageIdentifier = workflowStageIdentifier;
                return this;
            }

            /**
             * workflowStageName.
             */
            public Builder workflowStageName(String workflowStageName) {
                this.workflowStageName = workflowStageName;
                return this;
            }

            public Statuses build() {
                return new Statuses(this);
            } 

        } 

    }
    public static class WorkflowActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nextWorkflowStatusIdentifier")
        private String nextWorkflowStatusIdentifier;

        @com.aliyun.core.annotation.NameInMap("workflowIdentifier")
        private String workflowIdentifier;

        @com.aliyun.core.annotation.NameInMap("workflowStatusIdentifier")
        private String workflowStatusIdentifier;

        private WorkflowActions(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.nextWorkflowStatusIdentifier = builder.nextWorkflowStatusIdentifier;
            this.workflowIdentifier = builder.workflowIdentifier;
            this.workflowStatusIdentifier = builder.workflowStatusIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowActions create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nextWorkflowStatusIdentifier
         */
        public String getNextWorkflowStatusIdentifier() {
            return this.nextWorkflowStatusIdentifier;
        }

        /**
         * @return workflowIdentifier
         */
        public String getWorkflowIdentifier() {
            return this.workflowIdentifier;
        }

        /**
         * @return workflowStatusIdentifier
         */
        public String getWorkflowStatusIdentifier() {
            return this.workflowStatusIdentifier;
        }

        public static final class Builder {
            private Long id; 
            private String name; 
            private String nextWorkflowStatusIdentifier; 
            private String workflowIdentifier; 
            private String workflowStatusIdentifier; 

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * nextWorkflowStatusIdentifier.
             */
            public Builder nextWorkflowStatusIdentifier(String nextWorkflowStatusIdentifier) {
                this.nextWorkflowStatusIdentifier = nextWorkflowStatusIdentifier;
                return this;
            }

            /**
             * workflowIdentifier.
             */
            public Builder workflowIdentifier(String workflowIdentifier) {
                this.workflowIdentifier = workflowIdentifier;
                return this;
            }

            /**
             * workflowStatusIdentifier.
             */
            public Builder workflowStatusIdentifier(String workflowStatusIdentifier) {
                this.workflowStatusIdentifier = workflowStatusIdentifier;
                return this;
            }

            public WorkflowActions build() {
                return new WorkflowActions(this);
            } 

        } 

    }
    public static class Workflow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("defaultStatusIdentifier")
        private String defaultStatusIdentifier;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ownerSpaceIdentifier")
        private String ownerSpaceIdentifier;

        @com.aliyun.core.annotation.NameInMap("ownerSpaceType")
        private String ownerSpaceType;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("statusOrder")
        private String statusOrder;

        @com.aliyun.core.annotation.NameInMap("statuses")
        private java.util.List < Statuses> statuses;

        @com.aliyun.core.annotation.NameInMap("workflowActions")
        private java.util.List < WorkflowActions> workflowActions;

        private Workflow(Builder builder) {
            this.creator = builder.creator;
            this.defaultStatusIdentifier = builder.defaultStatusIdentifier;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.identifier = builder.identifier;
            this.modifier = builder.modifier;
            this.name = builder.name;
            this.ownerSpaceIdentifier = builder.ownerSpaceIdentifier;
            this.ownerSpaceType = builder.ownerSpaceType;
            this.resourceType = builder.resourceType;
            this.source = builder.source;
            this.statusOrder = builder.statusOrder;
            this.statuses = builder.statuses;
            this.workflowActions = builder.workflowActions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workflow create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return defaultStatusIdentifier
         */
        public String getDefaultStatusIdentifier() {
            return this.defaultStatusIdentifier;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerSpaceIdentifier
         */
        public String getOwnerSpaceIdentifier() {
            return this.ownerSpaceIdentifier;
        }

        /**
         * @return ownerSpaceType
         */
        public String getOwnerSpaceType() {
            return this.ownerSpaceType;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return statusOrder
         */
        public String getStatusOrder() {
            return this.statusOrder;
        }

        /**
         * @return statuses
         */
        public java.util.List < Statuses> getStatuses() {
            return this.statuses;
        }

        /**
         * @return workflowActions
         */
        public java.util.List < WorkflowActions> getWorkflowActions() {
            return this.workflowActions;
        }

        public static final class Builder {
            private String creator; 
            private String defaultStatusIdentifier; 
            private String description; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String identifier; 
            private String modifier; 
            private String name; 
            private String ownerSpaceIdentifier; 
            private String ownerSpaceType; 
            private String resourceType; 
            private String source; 
            private String statusOrder; 
            private java.util.List < Statuses> statuses; 
            private java.util.List < WorkflowActions> workflowActions; 

            /**
             * creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * defaultStatusIdentifier.
             */
            public Builder defaultStatusIdentifier(String defaultStatusIdentifier) {
                this.defaultStatusIdentifier = defaultStatusIdentifier;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ownerSpaceIdentifier.
             */
            public Builder ownerSpaceIdentifier(String ownerSpaceIdentifier) {
                this.ownerSpaceIdentifier = ownerSpaceIdentifier;
                return this;
            }

            /**
             * ownerSpaceType.
             */
            public Builder ownerSpaceType(String ownerSpaceType) {
                this.ownerSpaceType = ownerSpaceType;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * statusOrder.
             */
            public Builder statusOrder(String statusOrder) {
                this.statusOrder = statusOrder;
                return this;
            }

            /**
             * statuses.
             */
            public Builder statuses(java.util.List < Statuses> statuses) {
                this.statuses = statuses;
                return this;
            }

            /**
             * workflowActions.
             */
            public Builder workflowActions(java.util.List < WorkflowActions> workflowActions) {
                this.workflowActions = workflowActions;
                return this;
            }

            public Workflow build() {
                return new Workflow(this);
            } 

        } 

    }
}
