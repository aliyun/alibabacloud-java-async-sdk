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
 * {@link CreateRamPolicyExportTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRamPolicyExportTaskRequest</p>
 */
public class CreateRamPolicyExportTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authorizationAccountIds")
    private java.util.List<Long> authorizationAccountIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authorizationActions")
    private java.util.List<String> authorizationActions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authorizationRegionIds")
    private java.util.List<String> authorizationRegionIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

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
    @com.aliyun.core.annotation.NameInMap("ramRole")
    private String ramRole;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
    private String terraformProviderVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("triggerStrategy")
    private String triggerStrategy;

    private CreateRamPolicyExportTaskRequest(Builder builder) {
        super(builder);
        this.authorizationAccountIds = builder.authorizationAccountIds;
        this.authorizationActions = builder.authorizationActions;
        this.authorizationRegionIds = builder.authorizationRegionIds;
        this.clientToken = builder.clientToken;
        this.moduleId = builder.moduleId;
        this.moduleVersion = builder.moduleVersion;
        this.name = builder.name;
        this.ramRole = builder.ramRole;
        this.terraformProviderVersion = builder.terraformProviderVersion;
        this.triggerStrategy = builder.triggerStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRamPolicyExportTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationAccountIds
     */
    public java.util.List<Long> getAuthorizationAccountIds() {
        return this.authorizationAccountIds;
    }

    /**
     * @return authorizationActions
     */
    public java.util.List<String> getAuthorizationActions() {
        return this.authorizationActions;
    }

    /**
     * @return authorizationRegionIds
     */
    public java.util.List<String> getAuthorizationRegionIds() {
        return this.authorizationRegionIds;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return ramRole
     */
    public String getRamRole() {
        return this.ramRole;
    }

    /**
     * @return terraformProviderVersion
     */
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

    /**
     * @return triggerStrategy
     */
    public String getTriggerStrategy() {
        return this.triggerStrategy;
    }

    public static final class Builder extends Request.Builder<CreateRamPolicyExportTaskRequest, Builder> {
        private java.util.List<Long> authorizationAccountIds; 
        private java.util.List<String> authorizationActions; 
        private java.util.List<String> authorizationRegionIds; 
        private String clientToken; 
        private String moduleId; 
        private String moduleVersion; 
        private String name; 
        private String ramRole; 
        private String terraformProviderVersion; 
        private String triggerStrategy; 

        private Builder() {
            super();
        } 

        private Builder(CreateRamPolicyExportTaskRequest request) {
            super(request);
            this.authorizationAccountIds = request.authorizationAccountIds;
            this.authorizationActions = request.authorizationActions;
            this.authorizationRegionIds = request.authorizationRegionIds;
            this.clientToken = request.clientToken;
            this.moduleId = request.moduleId;
            this.moduleVersion = request.moduleVersion;
            this.name = request.name;
            this.ramRole = request.ramRole;
            this.terraformProviderVersion = request.terraformProviderVersion;
            this.triggerStrategy = request.triggerStrategy;
        } 

        /**
         * authorizationAccountIds.
         */
        public Builder authorizationAccountIds(java.util.List<Long> authorizationAccountIds) {
            this.putBodyParameter("authorizationAccountIds", authorizationAccountIds);
            this.authorizationAccountIds = authorizationAccountIds;
            return this;
        }

        /**
         * authorizationActions.
         */
        public Builder authorizationActions(java.util.List<String> authorizationActions) {
            this.putBodyParameter("authorizationActions", authorizationActions);
            this.authorizationActions = authorizationActions;
            return this;
        }

        /**
         * authorizationRegionIds.
         */
        public Builder authorizationRegionIds(java.util.List<String> authorizationRegionIds) {
            this.putBodyParameter("authorizationRegionIds", authorizationRegionIds);
            this.authorizationRegionIds = authorizationRegionIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2da11a5501f18cc5e004</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mod-148e785fff6b316f4eb737e</p>
         */
        public Builder moduleId(String moduleId) {
            this.putBodyParameter("moduleId", moduleId);
            this.moduleId = moduleId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder moduleVersion(String moduleVersion) {
            this.putBodyParameter("moduleVersion", moduleVersion);
            this.moduleVersion = moduleVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * ramRole.
         */
        public Builder ramRole(String ramRole) {
            this.putBodyParameter("ramRole", ramRole);
            this.ramRole = ramRole;
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
         * triggerStrategy.
         */
        public Builder triggerStrategy(String triggerStrategy) {
            this.putBodyParameter("triggerStrategy", triggerStrategy);
            this.triggerStrategy = triggerStrategy;
            return this;
        }

        @Override
        public CreateRamPolicyExportTaskRequest build() {
            return new CreateRamPolicyExportTaskRequest(this);
        } 

    } 

}
