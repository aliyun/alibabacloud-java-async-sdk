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
 * {@link CreateWorkflowDefinitionRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkflowDefinitionRequest</p>
 */
public class CreateWorkflowDefinitionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Spec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spec;

    private CreateWorkflowDefinitionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectId = builder.projectId;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkflowDefinitionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreateWorkflowDefinitionRequest, Builder> {
        private String regionId; 
        private Long projectId; 
        private String spec; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkflowDefinitionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectId = request.projectId;
            this.spec = request.spec;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The FlowSpec field information about the workflow. For more information, see <a href="https://github.com/aliyun/alibabacloud-dataworks-tool-dflow/">FlowSpec</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;kind&quot;: &quot;CycleWorkflow&quot;,
         *     &quot;version&quot;: &quot;1.1.0&quot;,
         *     &quot;spec&quot;: {
         *         &quot;name&quot;: &quot;OpenAPITestWorkflowDemo&quot;,
         *         &quot;type&quot;: &quot;CycleWorkflow&quot;,
         *         &quot;workflows&quot;: [
         *             {
         *                 &quot;script&quot;: {
         *                     &quot;path&quot;: &quot;XX/OpenAPITest/WorkflowTest/OpenAPITestWorkflowDemo&quot;,
         *                     &quot;runtime&quot;: {
         *                         &quot;command&quot;: &quot;WORKFLOW&quot;
         *                     }
         *                 },
         *                 &quot;trigger&quot;: {
         *                     &quot;type&quot;: &quot;Scheduler&quot;,
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
         *                 &quot;name&quot;: &quot;OpenAPITestWorkflowDemo&quot;,
         *                 &quot;inputs&quot;: {},
         *                 &quot;outputs&quot;: {
         *                     &quot;nodeOutputs&quot;: [
         *                         {
         *                             &quot;data&quot;: &quot;workflow_output&quot;,
         *                             &quot;artifactType&quot;: &quot;NodeOutput&quot;,
         *                             &quot;refTableName&quot;: &quot;OpenAPITestWorkflowDemo&quot;
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
            this.putBodyParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        @Override
        public CreateWorkflowDefinitionRequest build() {
            return new CreateWorkflowDefinitionRequest(this);
        } 

    } 

}
