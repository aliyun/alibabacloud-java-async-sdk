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
 * {@link UpdateRamPolicyExportTaskAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateRamPolicyExportTaskAttributeRequest</p>
 */
public class UpdateRamPolicyExportTaskAttributeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ramPolicyExportTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ramPolicyExportTaskId;

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
    @com.aliyun.core.annotation.NameInMap("triggerStrategy")
    private String triggerStrategy;

    private UpdateRamPolicyExportTaskAttributeRequest(Builder builder) {
        super(builder);
        this.ramPolicyExportTaskId = builder.ramPolicyExportTaskId;
        this.authorizationAccountIds = builder.authorizationAccountIds;
        this.authorizationActions = builder.authorizationActions;
        this.authorizationRegionIds = builder.authorizationRegionIds;
        this.moduleId = builder.moduleId;
        this.moduleVersion = builder.moduleVersion;
        this.name = builder.name;
        this.ramRole = builder.ramRole;
        this.triggerStrategy = builder.triggerStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRamPolicyExportTaskAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ramPolicyExportTaskId
     */
    public String getRamPolicyExportTaskId() {
        return this.ramPolicyExportTaskId;
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
     * @return triggerStrategy
     */
    public String getTriggerStrategy() {
        return this.triggerStrategy;
    }

    public static final class Builder extends Request.Builder<UpdateRamPolicyExportTaskAttributeRequest, Builder> {
        private String ramPolicyExportTaskId; 
        private java.util.List<Long> authorizationAccountIds; 
        private java.util.List<String> authorizationActions; 
        private java.util.List<String> authorizationRegionIds; 
        private String moduleId; 
        private String moduleVersion; 
        private String name; 
        private String ramRole; 
        private String triggerStrategy; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRamPolicyExportTaskAttributeRequest request) {
            super(request);
            this.ramPolicyExportTaskId = request.ramPolicyExportTaskId;
            this.authorizationAccountIds = request.authorizationAccountIds;
            this.authorizationActions = request.authorizationActions;
            this.authorizationRegionIds = request.authorizationRegionIds;
            this.moduleId = request.moduleId;
            this.moduleVersion = request.moduleVersion;
            this.name = request.name;
            this.ramRole = request.ramRole;
            this.triggerStrategy = request.triggerStrategy;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rpe-433aead756057ffe0252e48f9286a</p>
         */
        public Builder ramPolicyExportTaskId(String ramPolicyExportTaskId) {
            this.putPathParameter("ramPolicyExportTaskId", ramPolicyExportTaskId);
            this.ramPolicyExportTaskId = ramPolicyExportTaskId;
            return this;
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
         * <p>mod-143574fff6b316f4eb737e</p>
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
         * triggerStrategy.
         */
        public Builder triggerStrategy(String triggerStrategy) {
            this.putBodyParameter("triggerStrategy", triggerStrategy);
            this.triggerStrategy = triggerStrategy;
            return this;
        }

        @Override
        public UpdateRamPolicyExportTaskAttributeRequest build() {
            return new UpdateRamPolicyExportTaskAttributeRequest(this);
        } 

    } 

}
