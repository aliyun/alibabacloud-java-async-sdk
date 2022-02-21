// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkItemWorkFlowInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkItemWorkFlowInfoResponseBody</p>
 */
public class GetWorkItemWorkFlowInfoResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("workflow")
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
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * true或者false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * 工作项信息
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
        @NameInMap("creator")
        private String creator;

        @NameInMap("description")
        private String description;

        @NameInMap("gmtCreate")
        private Long gmtCreate;

        @NameInMap("gmtModified")
        private Long gmtModified;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("modifier")
        private String modifier;

        @NameInMap("name")
        private String name;

        @NameInMap("resourceType")
        private String resourceType;

        @NameInMap("source")
        private String source;

        @NameInMap("workflowStageIdentifier")
        private String workflowStageIdentifier;

        @NameInMap("workflowStageName")
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
             * 创建人
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * 描述信息
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 修改时间
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * 状态唯一标识
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * 修改人
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * 状态名
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 资源来源
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * 状态来源
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * 阶段信息-阶段的唯一标识
             */
            public Builder workflowStageIdentifier(String workflowStageIdentifier) {
                this.workflowStageIdentifier = workflowStageIdentifier;
                return this;
            }

            /**
             * 阶段信息-名称
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
        @NameInMap("id")
        private Long id;

        @NameInMap("name")
        private String name;

        @NameInMap("nextWorkflowStatusIdentifier")
        private String nextWorkflowStatusIdentifier;

        @NameInMap("workflowIdentifier")
        private String workflowIdentifier;

        @NameInMap("workflowStatusIdentifier")
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
             * 流转步骤的id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * action的名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * action对应的下个状态的信息id
             */
            public Builder nextWorkflowStatusIdentifier(String nextWorkflowStatusIdentifier) {
                this.nextWorkflowStatusIdentifier = nextWorkflowStatusIdentifier;
                return this;
            }

            /**
             * action对应的工作流
             */
            public Builder workflowIdentifier(String workflowIdentifier) {
                this.workflowIdentifier = workflowIdentifier;
                return this;
            }

            /**
             * action对应的当前状态id
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
        @NameInMap("creator")
        private String creator;

        @NameInMap("defaultStatusIdentifier")
        private String defaultStatusIdentifier;

        @NameInMap("description")
        private String description;

        @NameInMap("gmtCreate")
        private Long gmtCreate;

        @NameInMap("gmtModified")
        private Long gmtModified;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("modifier")
        private String modifier;

        @NameInMap("name")
        private String name;

        @NameInMap("ownerSpaceIdentifier")
        private String ownerSpaceIdentifier;

        @NameInMap("ownerSpaceType")
        private String ownerSpaceType;

        @NameInMap("resourceType")
        private String resourceType;

        @NameInMap("source")
        private String source;

        @NameInMap("statusOrder")
        private String statusOrder;

        @NameInMap("statuses")
        private java.util.List < Statuses> statuses;

        @NameInMap("workflowActions")
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
             * 创建人
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * 工作流的默认状态
             */
            public Builder defaultStatusIdentifier(String defaultStatusIdentifier) {
                this.defaultStatusIdentifier = defaultStatusIdentifier;
                return this;
            }

            /**
             * 工作流的描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 修改时间
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * 工作流唯一标识
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * 修改人
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * 工作流名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 工作流所属的团队空间或项目的identifier
             */
            public Builder ownerSpaceIdentifier(String ownerSpaceIdentifier) {
                this.ownerSpaceIdentifier = ownerSpaceIdentifier;
                return this;
            }

            /**
             * 工作流所属的团队项目类型
             */
            public Builder ownerSpaceType(String ownerSpaceType) {
                this.ownerSpaceType = ownerSpaceType;
                return this;
            }

            /**
             * 资源类型
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * 工作流来源
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * 工作流的状态顺序
             */
            public Builder statusOrder(String statusOrder) {
                this.statusOrder = statusOrder;
                return this;
            }

            /**
             * 状态列表
             */
            public Builder statuses(java.util.List < Statuses> statuses) {
                this.statuses = statuses;
                return this;
            }

            /**
             * 工作流的流转步骤
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
