// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GenerateModuleRequest} extends {@link RequestModel}
 *
 * <p>GenerateModuleRequest</p>
 */
public class GenerateModuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("generateSource")
    private String generateSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.Map<String, ?> parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("syntax")
    private String syntax;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("template")
    private String template;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
    private String terraformProviderVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("terraformResourceType")
    private String terraformResourceType;

    private GenerateModuleRequest(Builder builder) {
        super(builder);
        this.generateSource = builder.generateSource;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.syntax = builder.syntax;
        this.template = builder.template;
        this.terraformProviderVersion = builder.terraformProviderVersion;
        this.terraformResourceType = builder.terraformResourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateModuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return generateSource
     */
    public String getGenerateSource() {
        return this.generateSource;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return syntax
     */
    public String getSyntax() {
        return this.syntax;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    /**
     * @return terraformProviderVersion
     */
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

    /**
     * @return terraformResourceType
     */
    public String getTerraformResourceType() {
        return this.terraformResourceType;
    }

    public static final class Builder extends Request.Builder<GenerateModuleRequest, Builder> {
        private String generateSource; 
        private java.util.Map<String, ?> parameters; 
        private String regionId; 
        private String syntax; 
        private String template; 
        private String terraformProviderVersion; 
        private String terraformResourceType; 

        private Builder() {
            super();
        } 

        private Builder(GenerateModuleRequest request) {
            super(request);
            this.generateSource = request.generateSource;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.syntax = request.syntax;
            this.template = request.template;
            this.terraformProviderVersion = request.terraformProviderVersion;
            this.terraformResourceType = request.terraformResourceType;
        } 

        /**
         * <p>The generation source. Valid values:</p>
         * <ul>
         * <li>Resource: Generates a Terraform HCL template based on resource properties.</li>
         * <li>VariableToCode: Generates a final Terraform HCL template by combining variables with an existing Terraform HCL template.</li>
         * <li>CodeToVariable: Extracts variable information from a Terraform HCL template.</li>
         * <li>Module: Generates Terraform Module code based on variables.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Resource</p>
         */
        public Builder generateSource(String generateSource) {
            this.putBodyParameter("generateSource", generateSource);
            this.generateSource = generateSource;
            return this;
        }

        /**
         * <p>The collection of parameters, passed in key:value format, such as {&quot;vpc_name&quot;:&quot;vpc-test&quot;}.</p>
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The syntax. Valid values:</p>
         * <ul>
         * <li>hcl (default).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hcl</p>
         */
        public Builder syntax(String syntax) {
            this.putBodyParameter("syntax", syntax);
            this.syntax = syntax;
            return this;
        }

        /**
         * <p>The existing Terraform HCL template content.</p>
         * 
         * <strong>example:</strong>
         * <p>terraform {
         * }</p>
         */
        public Builder template(String template) {
            this.putBodyParameter("template", template);
            this.template = template;
            return this;
        }

        /**
         * <p>The Terraform provider version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.260.0</p>
         */
        public Builder terraformProviderVersion(String terraformProviderVersion) {
            this.putBodyParameter("terraformProviderVersion", terraformProviderVersion);
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }

        /**
         * <p>The Terraform resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud_vpc</p>
         */
        public Builder terraformResourceType(String terraformResourceType) {
            this.putBodyParameter("terraformResourceType", terraformResourceType);
            this.terraformResourceType = terraformResourceType;
            return this;
        }

        @Override
        public GenerateModuleRequest build() {
            return new GenerateModuleRequest(this);
        } 

    } 

}
