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
     * @return workflowDefinition
     */
    public WorkflowDefinition getWorkflowDefinition() {
        return this.workflowDefinition;
    }

    public static final class Builder {
        private String requestId; 
        private WorkflowDefinition workflowDefinition; 

        private Builder() {
        } 

        private Builder(GetWorkflowDefinitionResponseBody model) {
            this.requestId = model.requestId;
            this.workflowDefinition = model.workflowDefinition;
        } 

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

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private Long workflowId;

        private WorkflowDefinition(Builder builder) {
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.spec = builder.spec;
            this.workflowId = builder.workflowId;
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

        /**
         * @return workflowId
         */
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public static final class Builder {
            private Long createTime; 
            private Long id; 
            private Long modifyTime; 
            private String name; 
            private String owner; 
            private Long projectId; 
            private String spec; 
            private Long workflowId; 

            private Builder() {
            } 

            private Builder(WorkflowDefinition model) {
                this.createTime = model.createTime;
                this.id = model.id;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.owner = model.owner;
                this.projectId = model.projectId;
                this.spec = model.spec;
                this.workflowId = model.workflowId;
            } 

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
             * 
             * <strong>example:</strong>
             * <p>OpenAPI test workflow Demo</p>
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
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;metadata&quot;: {
             *         &quot;tenantId&quot;: &quot;52425742456XXXX&quot;,
             *         &quot;projectId&quot;: &quot;307XXXX&quot;,
             *         &quot;uuid&quot;: &quot;463497880880954XXXX&quot;
             *     },
             *     &quot;kind&quot;: &quot;CycleWorkflow&quot;,
             *     &quot;version&quot;: &quot;1.1.0&quot;,
             *     &quot;spec&quot;: {
             *         &quot;name&quot;: &quot;OpenAPI_Test_Workflow_Demo&quot;,
             *         &quot;id&quot;: &quot;463497880880954XXXX&quot;,
             *         &quot;type&quot;: &quot;CycleWorkflow&quot;,
             *         &quot;owner&quot;: &quot;110755000425XXXX&quot;,
             *         &quot;workflows&quot;: [
             *             {
             *                 &quot;script&quot;: {
             *                     &quot;path&quot;: &quot;XX/OpenAPI_Test/Workflow_Test/OpenAPI_Test_Workflow_Demo&quot;,
             *                     &quot;runtime&quot;: {
             *                         &quot;command&quot;: &quot;WORKFLOW&quot;
             *                     },
             *                     &quot;id&quot;: &quot;698002781368644XXXX&quot;
             *                 },
             *                 &quot;id&quot;: &quot;463497880880954XXXX&quot;,
             *                 &quot;trigger&quot;: {
             *                     &quot;type&quot;: &quot;Scheduler&quot;,
             *                     &quot;id&quot;: &quot;652567824470354XXXX&quot;,
             *                     &quot;cron&quot;: &quot;00 02 00 * * ?&quot;,
             *                     &quot;startTime&quot;: &quot;1970-01-01 00:00:00&quot;,
             *                     &quot;endTime&quot;: &quot;9999-01-01 00:00:00&quot;,
             *                     &quot;timezone&quot;: &quot;Asia/Shanghai&quot;,
             *                     &quot;delaySeconds&quot;: 0
             *                 },
             *                 &quot;strategy&quot;: {
             *                     &quot;timeout&quot;: 0,
             *                     &quot;instanceMode&quot;: &quot;T+1&quot;,
             *                     &quot;rerunMode&quot;: &quot;Allowed&quot;,
             *                     &quot;rerunTimes&quot;: 3,
             *                     &quot;rerunInterval&quot;: 180000,
             *                     &quot;failureStrategy&quot;: &quot;Break&quot;
             *                 },
             *                 &quot;name&quot;: &quot;OpenAPI_Test_Workflow_Demo&quot;,
             *                 &quot;owner&quot;: &quot;110755000425XXXX&quot;,
             *                 &quot;metadata&quot;: {
             *                     &quot;owner&quot;: &quot;110755000425XXXX&quot;,
             *                     &quot;ownerName&quot;: &quot;<a href="mailto:XXXX@test.XXXX.com">XXXX@test.XXXX.com</a>&quot;,
             *                     &quot;tenantId&quot;: &quot;52425742456XXXX&quot;,
             *                     &quot;project&quot;: {
             *                         &quot;mode&quot;: &quot;STANDARD&quot;,
             *                         &quot;projectId&quot;: &quot;307303&quot;,
             *                         &quot;projectIdentifier&quot;: &quot;lwttest_standard&quot;,
             *                         &quot;projectName&quot;: &quot;XXXX&quot;,
             *                         &quot;projectOwnerId&quot;: &quot;110755000425XXXX&quot;,
             *                         &quot;simple&quot;: false,
             *                         &quot;tenantId&quot;: &quot;52425742456XXXX&quot;
             *                     },
             *                     &quot;projectId&quot;: &quot;307XXXX&quot;
             *                 },
             *                 &quot;inputs&quot;: {},
             *                 &quot;outputs&quot;: {
             *                     &quot;nodeOutputs&quot;: [
             *                         {
             *                             &quot;data&quot;: &quot;463497880880954XXXX&quot;,
             *                             &quot;artifactType&quot;: &quot;NodeOutput&quot;,
             *                             &quot;refTableName&quot;: &quot;OpenAPI_Test_Workflow_Demo&quot;,
             *                             &quot;isDefault&quot;: true
             *                         }
             *                     ]
             *                 },
             *                 &quot;nodes&quot;: [],
             *                 &quot;dependencies&quot;: []
             *             }
             *         ]
             *     }
             * }</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The ID of the workflow on the scheduling side after publishing.</p>
             * 
             * <strong>example:</strong>
             * <p>700006657495</p>
             */
            public Builder workflowId(Long workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            public WorkflowDefinition build() {
                return new WorkflowDefinition(this);
            } 

        } 

    }
}
