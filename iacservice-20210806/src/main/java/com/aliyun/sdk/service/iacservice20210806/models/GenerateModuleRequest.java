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
         * generateSource.
         */
        public Builder generateSource(String generateSource) {
            this.putBodyParameter("generateSource", generateSource);
            this.generateSource = generateSource;
            return this;
        }

        /**
         * parameters.
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * syntax.
         */
        public Builder syntax(String syntax) {
            this.putBodyParameter("syntax", syntax);
            this.syntax = syntax;
            return this;
        }

        /**
         * template.
         */
        public Builder template(String template) {
            this.putBodyParameter("template", template);
            this.template = template;
            return this;
        }

        /**
         * terraformProviderVersion.
         */
        public Builder terraformProviderVersion(String terraformProviderVersion) {
            this.putBodyParameter("terraformProviderVersion", terraformProviderVersion);
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }

        /**
         * terraformResourceType.
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
