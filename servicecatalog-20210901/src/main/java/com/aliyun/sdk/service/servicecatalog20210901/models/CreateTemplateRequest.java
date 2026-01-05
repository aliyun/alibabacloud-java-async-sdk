// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link CreateTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateTemplateRequest</p>
 */
public class CreateTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateBody")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateBody;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerraformVariables")
    private java.util.List<TerraformVariables> terraformVariables;

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
    public java.util.List<TerraformVariables> getTerraformVariables() {
        return this.terraformVariables;
    }

    public static final class Builder extends Request.Builder<CreateTemplateRequest, Builder> {
        private String templateBody; 
        private String templateType; 
        private java.util.List<TerraformVariables> terraformVariables; 

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
         * <p>The content of the template.</p>
         * <p>For more information about the template syntax, see <a href="https://help.aliyun.com/document_detail/184397.html">Structure of Terraform templates</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;,
         *   &quot;Transform&quot;: &quot;Aliyun::Terraform-v1.1&quot;,
         *   &quot;Workspace&quot;: {
         *     &quot;main.tf&quot;: &quot;variable  &quot;name&quot; {  default = &quot;auto_provisioning_group&quot;}&quot;
         *   },
         *   &quot;Outputs&quot;: {}
         * }</p>
         */
        public Builder templateBody(String templateBody) {
            this.putBodyParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * <p>The type of the product template. Valid values:</p>
         * <ul>
         * <li>RosTerraformTemplate: the Terraform template that is supported by Resource Orchestration Service (ROS).</li>
         * <li>RosStandardTemplate: the standard ROS template.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RosTerraformTemplate</p>
         */
        public Builder templateType(String templateType) {
            this.putBodyParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        /**
         * <p>The variable settings of the Terraform template. You can configure the variables in a structured manner. Service Catalog applies the variable settings to the template.</p>
         * <blockquote>
         * <p> The variables must be defined in the Terraform template.</p>
         * </blockquote>
         */
        public Builder terraformVariables(java.util.List<TerraformVariables> terraformVariables) {
            this.putBodyParameter("TerraformVariables", terraformVariables);
            this.terraformVariables = terraformVariables;
            return this;
        }

        @Override
        public CreateTemplateRequest build() {
            return new CreateTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateTemplateRequest</p>
     */
    public static class TerraformVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("VariableName")
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

            private Builder() {
            } 

            private Builder(TerraformVariables model) {
                this.description = model.description;
                this.variableName = model.variableName;
            } 

            /**
             * <p>The description of the variable.</p>
             * <p>For more information about the format of variable descriptions, see <a href="https://help.aliyun.com/document_detail/322216.html">Methods and suggestions for Terraform code development</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;Label&quot;: { &quot;en&quot;: &quot;Instance Type&quot; }, &quot;AllowedValues&quot;: [ &quot;ecs.s6-c1m1.small&quot;, &quot;ecs.s6-c1m2.large&quot;, &quot;ecs.s6-c1m2.xlarge&quot; ] }</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the variable.</p>
             * 
             * <strong>example:</strong>
             * <p>instance_type</p>
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
