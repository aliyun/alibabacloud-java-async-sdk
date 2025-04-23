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
 * {@link CreateExplorerTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateExplorerTaskRequest</p>
 */
public class CreateExplorerTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InitModuleState")
    private Boolean initModuleState;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerraformVersion")
    private String terraformVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoApply")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean autoApply;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoDestroy")
    private Boolean autoDestroy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moduleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moduleVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("skipPropertyValidation")
    private Boolean skipPropertyValidation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
    private String terraformProviderVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("triggerValue")
    private String triggerValue;

    private CreateExplorerTaskRequest(Builder builder) {
        super(builder);
        this.initModuleState = builder.initModuleState;
        this.terraformVersion = builder.terraformVersion;
        this.autoApply = builder.autoApply;
        this.autoDestroy = builder.autoDestroy;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.moduleId = builder.moduleId;
        this.moduleVersion = builder.moduleVersion;
        this.name = builder.name;
        this.skipPropertyValidation = builder.skipPropertyValidation;
        this.terraformProviderVersion = builder.terraformProviderVersion;
        this.triggerValue = builder.triggerValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExplorerTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return initModuleState
     */
    public Boolean getInitModuleState() {
        return this.initModuleState;
    }

    /**
     * @return terraformVersion
     */
    public String getTerraformVersion() {
        return this.terraformVersion;
    }

    /**
     * @return autoApply
     */
    public Boolean getAutoApply() {
        return this.autoApply;
    }

    /**
     * @return autoDestroy
     */
    public Boolean getAutoDestroy() {
        return this.autoDestroy;
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
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return moduleVersion
     */
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return skipPropertyValidation
     */
    public Boolean getSkipPropertyValidation() {
        return this.skipPropertyValidation;
    }

    /**
     * @return terraformProviderVersion
     */
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

    /**
     * @return triggerValue
     */
    public String getTriggerValue() {
        return this.triggerValue;
    }

    public static final class Builder extends Request.Builder<CreateExplorerTaskRequest, Builder> {
        private Boolean initModuleState; 
        private String terraformVersion; 
        private Boolean autoApply; 
        private Boolean autoDestroy; 
        private String clientToken; 
        private String description; 
        private String moduleId; 
        private String moduleVersion; 
        private String name; 
        private Boolean skipPropertyValidation; 
        private String terraformProviderVersion; 
        private String triggerValue; 

        private Builder() {
            super();
        } 

        private Builder(CreateExplorerTaskRequest request) {
            super(request);
            this.initModuleState = request.initModuleState;
            this.terraformVersion = request.terraformVersion;
            this.autoApply = request.autoApply;
            this.autoDestroy = request.autoDestroy;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.moduleId = request.moduleId;
            this.moduleVersion = request.moduleVersion;
            this.name = request.name;
            this.skipPropertyValidation = request.skipPropertyValidation;
            this.terraformProviderVersion = request.terraformProviderVersion;
            this.triggerValue = request.triggerValue;
        } 

        /**
         * InitModuleState.
         */
        public Builder initModuleState(Boolean initModuleState) {
            this.putBodyParameter("InitModuleState", initModuleState);
            this.initModuleState = initModuleState;
            return this;
        }

        /**
         * TerraformVersion.
         */
        public Builder terraformVersion(String terraformVersion) {
            this.putBodyParameter("TerraformVersion", terraformVersion);
            this.terraformVersion = terraformVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder autoApply(Boolean autoApply) {
            this.putBodyParameter("autoApply", autoApply);
            this.autoApply = autoApply;
            return this;
        }

        /**
         * autoDestroy.
         */
        public Builder autoDestroy(Boolean autoDestroy) {
            this.putBodyParameter("autoDestroy", autoDestroy);
            this.autoDestroy = autoDestroy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder moduleId(String moduleId) {
            this.putBodyParameter("moduleId", moduleId);
            this.moduleId = moduleId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder moduleVersion(String moduleVersion) {
            this.putBodyParameter("moduleVersion", moduleVersion);
            this.moduleVersion = moduleVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * skipPropertyValidation.
         */
        public Builder skipPropertyValidation(Boolean skipPropertyValidation) {
            this.putBodyParameter("skipPropertyValidation", skipPropertyValidation);
            this.skipPropertyValidation = skipPropertyValidation;
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
         * triggerValue.
         */
        public Builder triggerValue(String triggerValue) {
            this.putBodyParameter("triggerValue", triggerValue);
            this.triggerValue = triggerValue;
            return this;
        }

        @Override
        public CreateExplorerTaskRequest build() {
            return new CreateExplorerTaskRequest(this);
        } 

    } 

}
