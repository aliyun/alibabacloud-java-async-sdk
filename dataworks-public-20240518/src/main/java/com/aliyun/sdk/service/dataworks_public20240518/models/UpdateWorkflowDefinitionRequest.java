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
 * {@link UpdateWorkflowDefinitionRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkflowDefinitionRequest</p>
 */
public class UpdateWorkflowDefinitionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Spec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spec;

    private UpdateWorkflowDefinitionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
        this.projectId = builder.projectId;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkflowDefinitionRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<UpdateWorkflowDefinitionRequest, Builder> {
        private String regionId; 
        private String id; 
        private Long projectId; 
        private String spec; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkflowDefinitionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
            this.projectId = request.projectId;
            this.spec = request.spec;
        } 

        /**
         * <p>代表region的资源属性字段</p>
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The unique identifier of the Data Studio workflow.</p>
         * <blockquote>
         * <p> This field is of the Long type in SDK versions prior to 8.0.0, and of the String type in SDK versions 8.0.0 and later. This change does not affect normal SDK usage; the parameter will still be returned according to the type defined in the SDK. However, compilation failures may occur due to the type change only when upgrading the SDK across version 8.0.0. In this case, you must manually update the data type.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>652567824470354XXXX</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The unique identifier of the Data Studio workflow.</p>
         * <blockquote>
         * <p> Prior to SDK version 8.0.0, this field is of type Long. In SDK version 8.0.0 and later, it is of type String. This change does not affect the normal use of the SDK. The parameter is returned based on the type defined in the SDK. However, compilation failures may occur due to the type change only when upgrading the SDK across version 8.0.0. In this case, you must manually update the data type.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;kind&quot;: &quot;CycleWorkflow&quot;,
         *     &quot;version&quot;: &quot;1.1.0&quot;,
         *     &quot;spec&quot;: {
         *         &quot;name&quot;: &quot;OpenAPI Test Workflow Demo&quot;,
         *         &quot;type&quot;: &quot;CycleWorkflow&quot;,
         *         &quot;id&quot;: &quot;652567824470354XXXX&quot;,
         *         &quot;workflows&quot;: [
         *             {
         *                 &quot;id&quot;: &quot;652567824470354XXXX&quot;,
         *                 &quot;script&quot;: {
         *                     &quot;path&quot;: &quot;XX/OpenAPI_Test/Workflow_Test/OpenAPI_Test_Workflow_Demo&quot;,
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
         *                 &quot;name&quot;: &quot;OpenAPI Test Workflow Demo&quot;,
         *                 &quot;inputs&quot;: {},
         *                 &quot;outputs&quot;: {
         *                     &quot;nodeOutputs&quot;: [
         *                         {
         *                             &quot;data&quot;: &quot;workflow_output&quot;,
         *                             &quot;artifactType&quot;: &quot;NodeOutput&quot;,
         *                             &quot;refTableName&quot;: &quot;OpenAPI_Test_Workflow_Demo&quot;
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
        public UpdateWorkflowDefinitionRequest build() {
            return new UpdateWorkflowDefinitionRequest(this);
        } 

    } 

}
