// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateChangeSetRequest} extends {@link RequestModel}
 *
 * <p>CreateChangeSetRequest</p>
 */
public class CreateChangeSetRequest extends Request {
    @Query
    @NameInMap("ChangeSetName")
    @Validation(required = true)
    private String changeSetName;

    @Query
    @NameInMap("ChangeSetType")
    private String changeSetType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DisableRollback")
    private Boolean disableRollback;

    @Query
    @NameInMap("NotificationURLs")
    private java.util.List < String > notificationURLs;

    @Query
    @NameInMap("Parallelism")
    private Long parallelism;

    @Query
    @NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @Query
    @NameInMap("RamRoleName")
    private String ramRoleName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReplacementOption")
    private String replacementOption;

    @Query
    @NameInMap("ResourcesToImport")
    private java.util.List < ResourcesToImport> resourcesToImport;

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
    @NameInMap("StackPolicyDuringUpdateBody")
    private String stackPolicyDuringUpdateBody;

    @Query
    @NameInMap("StackPolicyDuringUpdateURL")
    private String stackPolicyDuringUpdateURL;

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
    @NameInMap("TemplateURL")
    private String templateURL;

    @Query
    @NameInMap("TemplateVersion")
    private String templateVersion;

    @Query
    @NameInMap("TimeoutInMinutes")
    private Long timeoutInMinutes;

    @Query
    @NameInMap("UsePreviousParameters")
    private Boolean usePreviousParameters;

    private CreateChangeSetRequest(Builder builder) {
        super(builder);
        this.changeSetName = builder.changeSetName;
        this.changeSetType = builder.changeSetType;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.disableRollback = builder.disableRollback;
        this.notificationURLs = builder.notificationURLs;
        this.parallelism = builder.parallelism;
        this.parameters = builder.parameters;
        this.ramRoleName = builder.ramRoleName;
        this.regionId = builder.regionId;
        this.replacementOption = builder.replacementOption;
        this.resourcesToImport = builder.resourcesToImport;
        this.stackId = builder.stackId;
        this.stackName = builder.stackName;
        this.stackPolicyBody = builder.stackPolicyBody;
        this.stackPolicyDuringUpdateBody = builder.stackPolicyDuringUpdateBody;
        this.stackPolicyDuringUpdateURL = builder.stackPolicyDuringUpdateURL;
        this.stackPolicyURL = builder.stackPolicyURL;
        this.templateBody = builder.templateBody;
        this.templateId = builder.templateId;
        this.templateScratchId = builder.templateScratchId;
        this.templateURL = builder.templateURL;
        this.templateVersion = builder.templateVersion;
        this.timeoutInMinutes = builder.timeoutInMinutes;
        this.usePreviousParameters = builder.usePreviousParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChangeSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeSetName
     */
    public String getChangeSetName() {
        return this.changeSetName;
    }

    /**
     * @return changeSetType
     */
    public String getChangeSetType() {
        return this.changeSetType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return disableRollback
     */
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    /**
     * @return notificationURLs
     */
    public java.util.List < String > getNotificationURLs() {
        return this.notificationURLs;
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
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return replacementOption
     */
    public String getReplacementOption() {
        return this.replacementOption;
    }

    /**
     * @return resourcesToImport
     */
    public java.util.List < ResourcesToImport> getResourcesToImport() {
        return this.resourcesToImport;
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
     * @return stackPolicyDuringUpdateBody
     */
    public String getStackPolicyDuringUpdateBody() {
        return this.stackPolicyDuringUpdateBody;
    }

    /**
     * @return stackPolicyDuringUpdateURL
     */
    public String getStackPolicyDuringUpdateURL() {
        return this.stackPolicyDuringUpdateURL;
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

    /**
     * @return usePreviousParameters
     */
    public Boolean getUsePreviousParameters() {
        return this.usePreviousParameters;
    }

    public static final class Builder extends Request.Builder<CreateChangeSetRequest, Builder> {
        private String changeSetName; 
        private String changeSetType; 
        private String clientToken; 
        private String description; 
        private Boolean disableRollback; 
        private java.util.List < String > notificationURLs; 
        private Long parallelism; 
        private java.util.List < Parameters> parameters; 
        private String ramRoleName; 
        private String regionId; 
        private String replacementOption; 
        private java.util.List < ResourcesToImport> resourcesToImport; 
        private String stackId; 
        private String stackName; 
        private String stackPolicyBody; 
        private String stackPolicyDuringUpdateBody; 
        private String stackPolicyDuringUpdateURL; 
        private String stackPolicyURL; 
        private String templateBody; 
        private String templateId; 
        private String templateScratchId; 
        private String templateURL; 
        private String templateVersion; 
        private Long timeoutInMinutes; 
        private Boolean usePreviousParameters; 

        private Builder() {
            super();
        } 

        private Builder(CreateChangeSetRequest request) {
            super(request);
            this.changeSetName = request.changeSetName;
            this.changeSetType = request.changeSetType;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.disableRollback = request.disableRollback;
            this.notificationURLs = request.notificationURLs;
            this.parallelism = request.parallelism;
            this.parameters = request.parameters;
            this.ramRoleName = request.ramRoleName;
            this.regionId = request.regionId;
            this.replacementOption = request.replacementOption;
            this.resourcesToImport = request.resourcesToImport;
            this.stackId = request.stackId;
            this.stackName = request.stackName;
            this.stackPolicyBody = request.stackPolicyBody;
            this.stackPolicyDuringUpdateBody = request.stackPolicyDuringUpdateBody;
            this.stackPolicyDuringUpdateURL = request.stackPolicyDuringUpdateURL;
            this.stackPolicyURL = request.stackPolicyURL;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateScratchId = request.templateScratchId;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
            this.timeoutInMinutes = request.timeoutInMinutes;
            this.usePreviousParameters = request.usePreviousParameters;
        } 

        /**
         * ChangeSetName.
         */
        public Builder changeSetName(String changeSetName) {
            this.putQueryParameter("ChangeSetName", changeSetName);
            this.changeSetName = changeSetName;
            return this;
        }

        /**
         * ChangeSetType.
         */
        public Builder changeSetType(String changeSetType) {
            this.putQueryParameter("ChangeSetType", changeSetType);
            this.changeSetType = changeSetType;
            return this;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * NotificationURLs.
         */
        public Builder notificationURLs(java.util.List < String > notificationURLs) {
            this.putQueryParameter("NotificationURLs", notificationURLs);
            this.notificationURLs = notificationURLs;
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
         * RamRoleName.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
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
         * ReplacementOption.
         */
        public Builder replacementOption(String replacementOption) {
            this.putQueryParameter("ReplacementOption", replacementOption);
            this.replacementOption = replacementOption;
            return this;
        }

        /**
         * ResourcesToImport.
         */
        public Builder resourcesToImport(java.util.List < ResourcesToImport> resourcesToImport) {
            this.putQueryParameter("ResourcesToImport", resourcesToImport);
            this.resourcesToImport = resourcesToImport;
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
         * StackPolicyDuringUpdateBody.
         */
        public Builder stackPolicyDuringUpdateBody(String stackPolicyDuringUpdateBody) {
            this.putQueryParameter("StackPolicyDuringUpdateBody", stackPolicyDuringUpdateBody);
            this.stackPolicyDuringUpdateBody = stackPolicyDuringUpdateBody;
            return this;
        }

        /**
         * StackPolicyDuringUpdateURL.
         */
        public Builder stackPolicyDuringUpdateURL(String stackPolicyDuringUpdateURL) {
            this.putQueryParameter("StackPolicyDuringUpdateURL", stackPolicyDuringUpdateURL);
            this.stackPolicyDuringUpdateURL = stackPolicyDuringUpdateURL;
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

        /**
         * UsePreviousParameters.
         */
        public Builder usePreviousParameters(Boolean usePreviousParameters) {
            this.putQueryParameter("UsePreviousParameters", usePreviousParameters);
            this.usePreviousParameters = usePreviousParameters;
            return this;
        }

        @Override
        public CreateChangeSetRequest build() {
            return new CreateChangeSetRequest(this);
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
    public static class ResourcesToImport extends TeaModel {
        @NameInMap("LogicalResourceId")
        @Validation(required = true)
        private String logicalResourceId;

        @NameInMap("ResourceIdentifier")
        @Validation(required = true)
        private String resourceIdentifier;

        @NameInMap("ResourceType")
        @Validation(required = true)
        private String resourceType;

        private ResourcesToImport(Builder builder) {
            this.logicalResourceId = builder.logicalResourceId;
            this.resourceIdentifier = builder.resourceIdentifier;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcesToImport create() {
            return builder().build();
        }

        /**
         * @return logicalResourceId
         */
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        /**
         * @return resourceIdentifier
         */
        public String getResourceIdentifier() {
            return this.resourceIdentifier;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String logicalResourceId; 
            private String resourceIdentifier; 
            private String resourceType; 

            /**
             * LogicalResourceId.
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * ResourceIdentifier.
             */
            public Builder resourceIdentifier(String resourceIdentifier) {
                this.resourceIdentifier = resourceIdentifier;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourcesToImport build() {
                return new ResourcesToImport(this);
            } 

        } 

    }
}
