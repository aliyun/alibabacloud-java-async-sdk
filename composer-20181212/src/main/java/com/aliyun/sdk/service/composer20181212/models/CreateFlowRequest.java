// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowRequest</p>
 */
public class CreateFlowRequest extends Request {
    @Body
    @NameInMap("Definition")
    private String definition;

    @Body
    @NameInMap("FlowDescription")
    private String flowDescription;

    @Body
    @NameInMap("FlowName")
    @Validation(required = true)
    private String flowName;

    @Body
    @NameInMap("FlowSource")
    private String flowSource;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Body
    @NameInMap("TemplateId")
    private String templateId;

    private CreateFlowRequest(Builder builder) {
        super(builder);
        this.definition = builder.definition;
        this.flowDescription = builder.flowDescription;
        this.flowName = builder.flowName;
        this.flowSource = builder.flowSource;
        this.resourceGroupId = builder.resourceGroupId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return flowDescription
     */
    public String getFlowDescription() {
        return this.flowDescription;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return flowSource
     */
    public String getFlowSource() {
        return this.flowSource;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<CreateFlowRequest, Builder> {
        private String definition; 
        private String flowDescription; 
        private String flowName; 
        private String flowSource; 
        private String resourceGroupId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFlowRequest request) {
            super(request);
            this.definition = request.definition;
            this.flowDescription = request.flowDescription;
            this.flowName = request.flowName;
            this.flowSource = request.flowSource;
            this.resourceGroupId = request.resourceGroupId;
            this.templateId = request.templateId;
        } 

        /**
         * The definition of the workflow, which must be a JSON string.
         */
        public Builder definition(String definition) {
            this.putBodyParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * The description of the workflow.
         */
        public Builder flowDescription(String flowDescription) {
            this.putBodyParameter("FlowDescription", flowDescription);
            this.flowDescription = flowDescription;
            return this;
        }

        /**
         * The name of the workflow.
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * The source of the workflow. Valid values:
         * <p>
         * 
         * *   Default: Create the workflow in the console.
         * *   CloudConfig: Create the workflow by using Cloud Config.
         * *   Solution: Create the workflow by using Logic Composer.
         */
        public Builder flowSource(String flowSource) {
            this.putBodyParameter("FlowSource", flowSource);
            this.flowSource = flowSource;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the template.
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public CreateFlowRequest build() {
            return new CreateFlowRequest(this);
        } 

    } 

}
