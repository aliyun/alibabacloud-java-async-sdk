// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateTemplateRequest</p>
 */
public class CreateTemplateRequest extends Request {
    @Body
    @NameInMap("TemplateBody")
    @Validation(required = true)
    private String templateBody;

    @Body
    @NameInMap("TemplateType")
    @Validation(required = true)
    private String templateType;

    @Body
    @NameInMap("TerraformVariables")
    private java.util.List < TerraformVariables> terraformVariables;

    private CreateTemplateRequest(Builder builder) {
        super(builder);
        this.templateBody = builder.templateBody;
        this.templateType = builder.templateType;
        this.terraformVariables = builder.terraformVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateBody
     */
    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * @return terraformVariables
     */
    public java.util.List < TerraformVariables> getTerraformVariables() {
        return this.terraformVariables;
    }

    public static final class Builder extends Request.Builder<CreateTemplateRequest, Builder> {
        private String templateBody; 
        private String templateType; 
        private java.util.List < TerraformVariables> terraformVariables; 

        private Builder() {
            super();
        } 

        private Builder(CreateTemplateRequest request) {
            super(request);
            this.templateBody = request.templateBody;
            this.templateType = request.templateType;
            this.terraformVariables = request.terraformVariables;
        } 

        /**
         * The content of the template.
         * <p>
         * 
         * For more information about the template syntax, see [Structure of Terraform templates](~~184397~~).
         */
        public Builder templateBody(String templateBody) {
            this.putBodyParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * The type of the template.
         * <p>
         * 
         * Set the value to RosTerraformTemplate, which specifies the Terraform template that is supported by Resource Orchestration Service (ROS).
         */
        public Builder templateType(String templateType) {
            this.putBodyParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        /**
         * The variable settings of the Terraform template. You can configure the variables in a structured manner. Service Catalog applies the variable settings to the template.
         * <p>
         * 
         * > The variables must be defined in the Terraform template.
         */
        public Builder terraformVariables(java.util.List < TerraformVariables> terraformVariables) {
            this.putBodyParameter("TerraformVariables", terraformVariables);
            this.terraformVariables = terraformVariables;
            return this;
        }

        @Override
        public CreateTemplateRequest build() {
            return new CreateTemplateRequest(this);
        } 

    } 

    public static class TerraformVariables extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("VariableName")
        private String variableName;

        private TerraformVariables(Builder builder) {
            this.description = builder.description;
            this.variableName = builder.variableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TerraformVariables create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return variableName
         */
        public String getVariableName() {
            return this.variableName;
        }

        public static final class Builder {
            private String description; 
            private String variableName; 

            /**
             * The description of the variable.
             * <p>
             * 
             * For more information about the format of variable descriptions, see [Methods and suggestions for Terraform code development](~~322216~~).
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the variable.
             */
            public Builder variableName(String variableName) {
                this.variableName = variableName;
                return this;
            }

            public TerraformVariables build() {
                return new TerraformVariables(this);
            } 

        } 

    }
}
