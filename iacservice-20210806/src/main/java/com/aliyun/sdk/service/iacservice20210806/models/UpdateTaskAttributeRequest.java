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
    @com.aliyun.core.annotation.NameInMap("groupInfo")
    private GroupInfo groupInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("initModuleState")
    private Boolean initModuleState;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moduleVersion")
    private String moduleVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("protectionStrategy")
    private java.util.List<String> protectionStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ramRole")
    private String ramRole;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("skipPropertyValidation")
    private Boolean skipPropertyValidation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("terraformVersion")
    private String terraformVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("triggerStrategy")
    private String triggerStrategy;

    private UpdateTaskAttributeRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.autoApply = builder.autoApply;
        this.autoDestroy = builder.autoDestroy;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.groupInfo = builder.groupInfo;
        this.initModuleState = builder.initModuleState;
        this.moduleVersion = builder.moduleVersion;
        this.name = builder.name;
        this.protectionStrategy = builder.protectionStrategy;
        this.ramRole = builder.ramRole;
        this.skipPropertyValidation = builder.skipPropertyValidation;
        this.tags = builder.tags;
        this.terraformVersion = builder.terraformVersion;
        this.triggerStrategy = builder.triggerStrategy;
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
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
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

    public static final class Builder extends Request.Builder<UpdateTaskAttributeRequest, Builder> {
        private String taskId; 
        private Boolean autoApply; 
        private Boolean autoDestroy; 
        private String clientToken; 
        private String description; 
        private GroupInfo groupInfo; 
        private Boolean initModuleState; 
        private String moduleVersion; 
        private String name; 
        private java.util.List<String> protectionStrategy; 
        private String ramRole; 
        private Boolean skipPropertyValidation; 
        private java.util.List<Tags> tags; 
        private String terraformVersion; 
        private String triggerStrategy; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskAttributeRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.autoApply = request.autoApply;
            this.autoDestroy = request.autoDestroy;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.groupInfo = request.groupInfo;
            this.initModuleState = request.initModuleState;
            this.moduleVersion = request.moduleVersion;
            this.name = request.name;
            this.protectionStrategy = request.protectionStrategy;
            this.ramRole = request.ramRole;
            this.skipPropertyValidation = request.skipPropertyValidation;
            this.tags = request.tags;
            this.terraformVersion = request.terraformVersion;
            this.triggerStrategy = request.triggerStrategy;
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
         * autoApply.
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
         * moduleVersion.
         */
        public Builder moduleVersion(String moduleVersion) {
            this.putBodyParameter("moduleVersion", moduleVersion);
            this.moduleVersion = moduleVersion;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
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
         * ramRole.
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
         * tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
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
         * triggerStrategy.
         */
        public Builder triggerStrategy(String triggerStrategy) {
            this.putBodyParameter("triggerStrategy", triggerStrategy);
            this.triggerStrategy = triggerStrategy;
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
    /**
     * 
     * {@link UpdateTaskAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateTaskAttributeRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * tagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * tagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
