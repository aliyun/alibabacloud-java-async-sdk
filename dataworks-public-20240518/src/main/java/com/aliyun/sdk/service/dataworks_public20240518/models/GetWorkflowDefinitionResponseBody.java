// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetWorkflowDefinitionResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkflowDefinitionResponseBody</p>
 */
public class GetWorkflowDefinitionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkflowDefinition")
    private WorkflowDefinition workflowDefinition;

    private GetWorkflowDefinitionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.workflowDefinition = builder.workflowDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkflowDefinitionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workflowDefinition
     */
    public WorkflowDefinition getWorkflowDefinition() {
        return this.workflowDefinition;
    }

    public static final class Builder {
        private String requestId; 
        private WorkflowDefinition workflowDefinition; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F2BDD628-8A21-5BD1-B930-1A2D5989XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the workflow.</p>
         */
        public Builder workflowDefinition(WorkflowDefinition workflowDefinition) {
            this.workflowDefinition = workflowDefinition;
            return this;
        }

        public GetWorkflowDefinitionResponseBody build() {
            return new GetWorkflowDefinitionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkflowDefinitionResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkflowDefinitionResponseBody</p>
     */
    public static class WorkflowDefinition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        private WorkflowDefinition(Builder builder) {
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowDefinition create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Long createTime; 
            private Long id; 
            private Long modifyTime; 
            private String name; 
            private String owner; 
            private Long projectId; 
            private String spec; 

            /**
             * <p>The time when the workflow was created. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1708481905000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>463497880880954XXXX</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time when the workflow was last modified. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1708481905000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the workflow.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The owner of the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>110755000425XXXX</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the workflow belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>307XXX</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The FlowSpec field information about the workflow. For more information, see <a href="https://github.com/aliyun/alibabacloud-dataworks-tool-dflow/">FlowSpec</a>.</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public WorkflowDefinition build() {
                return new WorkflowDefinition(this);
            } 

        } 

    }
}
