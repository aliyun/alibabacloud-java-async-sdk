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
 * {@link UpdateTaskAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskAttributeRequest</p>
 */
public class UpdateTaskAttributeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoApply")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean autoApply;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoDestroy")
    private Boolean autoDestroy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupInfo")
    private GroupInfo groupInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("initModuleState")
    private Boolean initModuleState;

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
    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.Map<String, String> parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("protectionStrategy")
    private java.util.List<String> protectionStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ramRole")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ramRole;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("skipPropertyValidation")
    private Boolean skipPropertyValidation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("terraformVersion")
    private String terraformVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("triggerStrategy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String triggerStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("triggerValue")
    private String triggerValue;

    private UpdateTaskAttributeRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.autoApply = builder.autoApply;
        this.autoDestroy = builder.autoDestroy;
        this.description = builder.description;
        this.groupInfo = builder.groupInfo;
        this.initModuleState = builder.initModuleState;
        this.moduleId = builder.moduleId;
        this.moduleVersion = builder.moduleVersion;
        this.name = builder.name;
        this.parameters = builder.parameters;
        this.protectionStrategy = builder.protectionStrategy;
        this.ramRole = builder.ramRole;
        this.skipPropertyValidation = builder.skipPropertyValidation;
        this.terraformVersion = builder.terraformVersion;
        this.triggerStrategy = builder.triggerStrategy;
        this.triggerValue = builder.triggerValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupInfo
     */
    public GroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    /**
     * @return initModuleState
     */
    public Boolean getInitModuleState() {
        return this.initModuleState;
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
     * @return parameters
     */
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    /**
     * @return protectionStrategy
     */
    public java.util.List<String> getProtectionStrategy() {
        return this.protectionStrategy;
    }

    /**
     * @return ramRole
     */
    public String getRamRole() {
        return this.ramRole;
    }

    /**
     * @return skipPropertyValidation
     */
    public Boolean getSkipPropertyValidation() {
        return this.skipPropertyValidation;
    }

    /**
     * @return terraformVersion
     */
    public String getTerraformVersion() {
        return this.terraformVersion;
    }

    /**
     * @return triggerStrategy
     */
    public String getTriggerStrategy() {
        return this.triggerStrategy;
    }

    /**
     * @return triggerValue
     */
    public String getTriggerValue() {
        return this.triggerValue;
    }

    public static final class Builder extends Request.Builder<UpdateTaskAttributeRequest, Builder> {
        private String taskId; 
        private Boolean autoApply; 
        private Boolean autoDestroy; 
        private String description; 
        private GroupInfo groupInfo; 
        private Boolean initModuleState; 
        private String moduleId; 
        private String moduleVersion; 
        private String name; 
        private java.util.Map<String, String> parameters; 
        private java.util.List<String> protectionStrategy; 
        private String ramRole; 
        private Boolean skipPropertyValidation; 
        private String terraformVersion; 
        private String triggerStrategy; 
        private String triggerValue; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskAttributeRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.autoApply = request.autoApply;
            this.autoDestroy = request.autoDestroy;
            this.description = request.description;
            this.groupInfo = request.groupInfo;
            this.initModuleState = request.initModuleState;
            this.moduleId = request.moduleId;
            this.moduleVersion = request.moduleVersion;
            this.name = request.name;
            this.parameters = request.parameters;
            this.protectionStrategy = request.protectionStrategy;
            this.ramRole = request.ramRole;
            this.skipPropertyValidation = request.skipPropertyValidation;
            this.terraformVersion = request.terraformVersion;
            this.triggerStrategy = request.triggerStrategy;
            this.triggerValue = request.triggerValue;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task-4267dcfbf1b6dfff67fea425525e2</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * groupInfo.
         */
        public Builder groupInfo(GroupInfo groupInfo) {
            this.putBodyParameter("groupInfo", groupInfo);
            this.groupInfo = groupInfo;
            return this;
        }

        /**
         * initModuleState.
         */
        public Builder initModuleState(Boolean initModuleState) {
            this.putBodyParameter("initModuleState", initModuleState);
            this.initModuleState = initModuleState;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mod-148e7853433574fff6b316f4eb737e</p>
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
         * parameters.
         */
        public Builder parameters(java.util.Map<String, String> parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * protectionStrategy.
         */
        public Builder protectionStrategy(java.util.List<String> protectionStrategy) {
            this.putBodyParameter("protectionStrategy", protectionStrategy);
            this.protectionStrategy = protectionStrategy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder ramRole(String ramRole) {
            this.putBodyParameter("ramRole", ramRole);
            this.ramRole = ramRole;
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
         * terraformVersion.
         */
        public Builder terraformVersion(String terraformVersion) {
            this.putBodyParameter("terraformVersion", terraformVersion);
            this.terraformVersion = terraformVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        public Builder triggerStrategy(String triggerStrategy) {
            this.putBodyParameter("triggerStrategy", triggerStrategy);
            this.triggerStrategy = triggerStrategy;
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
        public UpdateTaskAttributeRequest build() {
            return new UpdateTaskAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTaskAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateTaskAttributeRequest</p>
     */
    public static class GroupInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private String projectId;

        private GroupInfo(Builder builder) {
            this.groupId = builder.groupId;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupInfo create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String groupId; 
            private String projectId; 

            private Builder() {
            } 

            private Builder(GroupInfo model) {
                this.groupId = model.groupId;
                this.projectId = model.projectId;
            } 

            /**
             * groupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * projectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            public GroupInfo build() {
                return new GroupInfo(this);
            } 

        } 

    }
}
