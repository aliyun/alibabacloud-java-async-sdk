// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartExecutionRequest} extends {@link RequestModel}
 *
 * <p>StartExecutionRequest</p>
 */
public class StartExecutionRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("LoopMode")
    private String loopMode;

    @Query
    @NameInMap("Mode")
    private String mode;

    @Query
    @NameInMap("Parameters")
    private String parameters;

    @Query
    @NameInMap("ParentExecutionId")
    private String parentExecutionId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SafetyCheck")
    private String safetyCheck;

    @Query
    @NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    @Query
    @NameInMap("TemplateContent")
    private String templateContent;

    @Query
    @NameInMap("TemplateName")
    private String templateName;

    @Query
    @NameInMap("TemplateURL")
    private String templateURL;

    @Query
    @NameInMap("TemplateVersion")
    private String templateVersion;

    private StartExecutionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.loopMode = builder.loopMode;
        this.mode = builder.mode;
        this.parameters = builder.parameters;
        this.parentExecutionId = builder.parentExecutionId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.safetyCheck = builder.safetyCheck;
        this.tags = builder.tags;
        this.templateContent = builder.templateContent;
        this.templateName = builder.templateName;
        this.templateURL = builder.templateURL;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartExecutionRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return loopMode
     */
    public String getLoopMode() {
        return this.loopMode;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return parentExecutionId
     */
    public String getParentExecutionId() {
        return this.parentExecutionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return safetyCheck
     */
    public String getSafetyCheck() {
        return this.safetyCheck;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, ? > getTags() {
        return this.tags;
    }

    /**
     * @return templateContent
     */
    public String getTemplateContent() {
        return this.templateContent;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
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

    public static final class Builder extends Request.Builder<StartExecutionRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String loopMode; 
        private String mode; 
        private String parameters; 
        private String parentExecutionId; 
        private String regionId; 
        private String resourceGroupId; 
        private String safetyCheck; 
        private java.util.Map < String, ? > tags; 
        private String templateContent; 
        private String templateName; 
        private String templateURL; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(StartExecutionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.loopMode = request.loopMode;
            this.mode = request.mode;
            this.parameters = request.parameters;
            this.parentExecutionId = request.parentExecutionId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.safetyCheck = request.safetyCheck;
            this.tags = request.tags;
            this.templateContent = request.templateContent;
            this.templateName = request.templateName;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
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
         * LoopMode.
         */
        public Builder loopMode(String loopMode) {
            this.putQueryParameter("LoopMode", loopMode);
            this.loopMode = loopMode;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * ParentExecutionId.
         */
        public Builder parentExecutionId(String parentExecutionId) {
            this.putQueryParameter("ParentExecutionId", parentExecutionId);
            this.parentExecutionId = parentExecutionId;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SafetyCheck.
         */
        public Builder safetyCheck(String safetyCheck) {
            this.putQueryParameter("SafetyCheck", safetyCheck);
            this.safetyCheck = safetyCheck;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * TemplateContent.
         */
        public Builder templateContent(String templateContent) {
            this.putQueryParameter("TemplateContent", templateContent);
            this.templateContent = templateContent;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
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

        @Override
        public StartExecutionRequest build() {
            return new StartExecutionRequest(this);
        } 

    } 

}
