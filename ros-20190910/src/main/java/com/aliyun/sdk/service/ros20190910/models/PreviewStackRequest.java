// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreviewStackRequest} extends {@link RequestModel}
 *
 * <p>PreviewStackRequest</p>
 */
public class PreviewStackRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DisableRollback")
    private Boolean disableRollback;

    @Query
    @NameInMap("Parallelism")
    private Long parallelism;

    @Query
    @NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceConfigRules")
    private java.util.List < ResourceConfigRules> resourceConfigRules;

    @Query
    @NameInMap("StackId")
    private String stackId;

    @Query
    @NameInMap("StackName")
    private String stackName;

    @Query
    @NameInMap("StackPolicyBody")
    private String stackPolicyBody;

    @Query
    @NameInMap("StackPolicyURL")
    private String stackPolicyURL;

    @Query
    @NameInMap("TemplateBody")
    private String templateBody;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Query
    @NameInMap("TemplateScratchId")
    private String templateScratchId;

    @Query
    @NameInMap("TemplateScratchRegionId")
    private String templateScratchRegionId;

    @Query
    @NameInMap("TemplateURL")
    private String templateURL;

    @Query
    @NameInMap("TemplateVersion")
    private String templateVersion;

    @Query
    @NameInMap("TimeoutInMinutes")
    private Long timeoutInMinutes;

    private PreviewStackRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.disableRollback = builder.disableRollback;
        this.parallelism = builder.parallelism;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.resourceConfigRules = builder.resourceConfigRules;
        this.stackId = builder.stackId;
        this.stackName = builder.stackName;
        this.stackPolicyBody = builder.stackPolicyBody;
        this.stackPolicyURL = builder.stackPolicyURL;
        this.templateBody = builder.templateBody;
        this.templateId = builder.templateId;
        this.templateScratchId = builder.templateScratchId;
        this.templateScratchRegionId = builder.templateScratchRegionId;
        this.templateURL = builder.templateURL;
        this.templateVersion = builder.templateVersion;
        this.timeoutInMinutes = builder.timeoutInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewStackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return disableRollback
     */
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    /**
     * @return parallelism
     */
    public Long getParallelism() {
        return this.parallelism;
    }

    /**
     * @return parameters
     */
    public java.util.List < Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceConfigRules
     */
    public java.util.List < ResourceConfigRules> getResourceConfigRules() {
        return this.resourceConfigRules;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return stackName
     */
    public String getStackName() {
        return this.stackName;
    }

    /**
     * @return stackPolicyBody
     */
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    /**
     * @return stackPolicyURL
     */
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    /**
     * @return templateBody
     */
    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateScratchId
     */
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    /**
     * @return templateScratchRegionId
     */
    public String getTemplateScratchRegionId() {
        return this.templateScratchRegionId;
    }

    /**
     * @return templateURL
     */
    public String getTemplateURL() {
        return this.templateURL;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    /**
     * @return timeoutInMinutes
     */
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static final class Builder extends Request.Builder<PreviewStackRequest, Builder> {
        private String clientToken; 
        private Boolean disableRollback; 
        private Long parallelism; 
        private java.util.List < Parameters> parameters; 
        private String regionId; 
        private java.util.List < ResourceConfigRules> resourceConfigRules; 
        private String stackId; 
        private String stackName; 
        private String stackPolicyBody; 
        private String stackPolicyURL; 
        private String templateBody; 
        private String templateId; 
        private String templateScratchId; 
        private String templateScratchRegionId; 
        private String templateURL; 
        private String templateVersion; 
        private Long timeoutInMinutes; 

        private Builder() {
            super();
        } 

        private Builder(PreviewStackRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.disableRollback = request.disableRollback;
            this.parallelism = request.parallelism;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.resourceConfigRules = request.resourceConfigRules;
            this.stackId = request.stackId;
            this.stackName = request.stackName;
            this.stackPolicyBody = request.stackPolicyBody;
            this.stackPolicyURL = request.stackPolicyURL;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateScratchId = request.templateScratchId;
            this.templateScratchRegionId = request.templateScratchRegionId;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
            this.timeoutInMinutes = request.timeoutInMinutes;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DisableRollback.
         */
        public Builder disableRollback(Boolean disableRollback) {
            this.putQueryParameter("DisableRollback", disableRollback);
            this.disableRollback = disableRollback;
            return this;
        }

        /**
         * Parallelism.
         */
        public Builder parallelism(Long parallelism) {
            this.putQueryParameter("Parallelism", parallelism);
            this.parallelism = parallelism;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceConfigRules.
         */
        public Builder resourceConfigRules(java.util.List < ResourceConfigRules> resourceConfigRules) {
            String resourceConfigRulesShrink = shrink(resourceConfigRules, "ResourceConfigRules", "json");
            this.putQueryParameter("ResourceConfigRules", resourceConfigRulesShrink);
            this.resourceConfigRules = resourceConfigRules;
            return this;
        }

        /**
         * StackId.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * StackName.
         */
        public Builder stackName(String stackName) {
            this.putQueryParameter("StackName", stackName);
            this.stackName = stackName;
            return this;
        }

        /**
         * StackPolicyBody.
         */
        public Builder stackPolicyBody(String stackPolicyBody) {
            this.putQueryParameter("StackPolicyBody", stackPolicyBody);
            this.stackPolicyBody = stackPolicyBody;
            return this;
        }

        /**
         * StackPolicyURL.
         */
        public Builder stackPolicyURL(String stackPolicyURL) {
            this.putQueryParameter("StackPolicyURL", stackPolicyURL);
            this.stackPolicyURL = stackPolicyURL;
            return this;
        }

        /**
         * TemplateBody.
         */
        public Builder templateBody(String templateBody) {
            this.putQueryParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateScratchId.
         */
        public Builder templateScratchId(String templateScratchId) {
            this.putQueryParameter("TemplateScratchId", templateScratchId);
            this.templateScratchId = templateScratchId;
            return this;
        }

        /**
         * TemplateScratchRegionId.
         */
        public Builder templateScratchRegionId(String templateScratchRegionId) {
            this.putQueryParameter("TemplateScratchRegionId", templateScratchRegionId);
            this.templateScratchRegionId = templateScratchRegionId;
            return this;
        }

        /**
         * TemplateURL.
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        /**
         * TemplateVersion.
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * TimeoutInMinutes.
         */
        public Builder timeoutInMinutes(Long timeoutInMinutes) {
            this.putQueryParameter("TimeoutInMinutes", timeoutInMinutes);
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }

        @Override
        public PreviewStackRequest build() {
            return new PreviewStackRequest(this);
        } 

    } 

    public static class Parameters extends TeaModel {
        @NameInMap("ParameterKey")
        @Validation(required = true)
        private String parameterKey;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        private String parameterValue;

        private Parameters(Builder builder) {
            this.parameterKey = builder.parameterKey;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameterKey
         */
        public String getParameterKey() {
            return this.parameterKey;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterKey; 
            private String parameterValue; 

            /**
             * ParameterKey.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * ParameterValue.
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    public static class ResourceConfigRules extends TeaModel {
        @NameInMap("Identifier")
        private String identifier;

        @NameInMap("InputParameters")
        private java.util.Map < String, ? > inputParameters;

        @NameInMap("ResourceType")
        private String resourceType;

        private ResourceConfigRules(Builder builder) {
            this.identifier = builder.identifier;
            this.inputParameters = builder.inputParameters;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceConfigRules create() {
            return builder().build();
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return inputParameters
         */
        public java.util.Map < String, ? > getInputParameters() {
            return this.inputParameters;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String identifier; 
            private java.util.Map < String, ? > inputParameters; 
            private String resourceType; 

            /**
             * Identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * InputParameters.
             */
            public Builder inputParameters(java.util.Map < String, ? > inputParameters) {
                this.inputParameters = inputParameters;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceConfigRules build() {
                return new ResourceConfigRules(this);
            } 

        } 

    }
}
