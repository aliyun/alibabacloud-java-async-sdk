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
    @com.aliyun.core.annotation.NameInMap("skipRegionValidation")
    private Boolean skipRegionValidation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
    private String terraformProviderVersion;

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
        this.skipRegionValidation = builder.skipRegionValidation;
        this.tags = builder.tags;
        this.terraformProviderVersion = builder.terraformProviderVersion;
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
     * @return skipRegionValidation
     */
    public Boolean getSkipRegionValidation() {
        return this.skipRegionValidation;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return terraformProviderVersion
     */
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
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
        private Boolean skipRegionValidation; 
        private java.util.List<Tags> tags; 
        private String terraformProviderVersion; 
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
            this.skipRegionValidation = request.skipRegionValidation;
            this.tags = request.tags;
            this.terraformProviderVersion = request.terraformProviderVersion;
            this.terraformVersion = request.terraformVersion;
            this.triggerStrategy = request.triggerStrategy;
        } 

        /**
         * <p>The node ID.</p>
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
         * <p>Specifies whether to automatically execute the node. Default value: false.</p>
         * <ul>
         * <li>true: After the preview is complete (terraform plan), the execution (terraform apply) is automatically performed without manual confirmation.</li>
         * <li>false: After the preview is complete (terraform plan), manual confirmation is required before the execution (terraform apply) starts.</li>
         * </ul>
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
         * <p>Specifies whether to automatically destroy resources after creation. Default value: false.</p>
         * <ul>
         * <li>true: After the execution is complete (terraform apply), the destroy operation (terraform destroy) is automatically performed without manual confirmation.</li>
         * <li>false: After the execution is complete (terraform apply), no further action is taken.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoDestroy(Boolean autoDestroy) {
            this.putBodyParameter("autoDestroy", autoDestroy);
            this.autoDestroy = autoDestroy;
            return this;
        }

        /**
         * <p>The idempotency token. Format: [0-9a-zA-Z-]{1,64}. Use a UUID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a65451293e64979ba7a4b573950217fe</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>this is description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The project group information.</p>
         */
        public Builder groupInfo(GroupInfo groupInfo) {
            this.putBodyParameter("groupInfo", groupInfo);
            this.groupInfo = groupInfo;
            return this;
        }

        /**
         * <p>Specifies whether to use a state file. Default value: false. This parameter applies to templates that originate from resource export. Only one node can use this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder initModuleState(Boolean initModuleState) {
            this.putBodyParameter("initModuleState", initModuleState);
            this.initModuleState = initModuleState;
            return this;
        }

        /**
         * <p>The template version.</p>
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
         * <p>The node name. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be 2 to 128 characters in length.</li>
         * <li>The name can contain letters, digits, Chinese characters, hyphens (-), underscores (_), and periods (.). The name cannot start or end with a hyphen, underscore, or period.</li>
         * <li>The name must be unique among all node resources within the current account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TaskName</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The list of resource protection strategies.</p>
         */
        public Builder protectionStrategy(java.util.List<String> protectionStrategy) {
            this.putBodyParameter("protectionStrategy", protectionStrategy);
            this.protectionStrategy = protectionStrategy;
            return this;
        }

        /**
         * <p>The RAM role. The system assumes this role to execute the template when a new job is triggered. This parameter is required when the job trigger method is not manual.</p>
         * 
         * <strong>example:</strong>
         * <p>role</p>
         */
        public Builder ramRole(String ramRole) {
            this.putBodyParameter("ramRole", ramRole);
            this.ramRole = ramRole;
            return this;
        }

        /**
         * <p>Specifies whether to skip enumeration value validation. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder skipPropertyValidation(Boolean skipPropertyValidation) {
            this.putBodyParameter("skipPropertyValidation", skipPropertyValidation);
            this.skipPropertyValidation = skipPropertyValidation;
            return this;
        }

        /**
         * <p>Specifies whether to skip region validation. Valid values: true indicates skipping, false indicates not skipping.</p>
         */
        public Builder skipRegionValidation(Boolean skipRegionValidation) {
            this.putBodyParameter("skipRegionValidation", skipRegionValidation);
            this.skipRegionValidation = skipRegionValidation;
            return this;
        }

        /**
         * <p>The list of tags for the node.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The Terraform Provider version. Use the <strong>ListTerraformProviderVersions</strong> API to query the list of supported versions.</p>
         * 
         * <strong>example:</strong>
         * <p>1.248.0</p>
         */
        public Builder terraformProviderVersion(String terraformProviderVersion) {
            this.putBodyParameter("terraformProviderVersion", terraformProviderVersion);
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }

        /**
         * <p>The Terraform version. Use the <strong>ListAvailableTerraformVersions</strong> API to obtain the list of supported versions. Default value: 1.5.7.</p>
         * 
         * <strong>example:</strong>
         * <p>1.5.7</p>
         */
        public Builder terraformVersion(String terraformVersion) {
            this.putBodyParameter("terraformVersion", terraformVersion);
            this.terraformVersion = terraformVersion;
            return this;
        }

        /**
         * <p>The job trigger method.</p>
         * <ul>
         * <li>Manual: manual trigger (default).</li>
         * <li>NewVersion: triggered when a new template version is published.</li>
         * <li>ParameterSetUpdated: triggered when the parameter set content changes or the parameter set attach relationship changes.</li>
         * <li>Auto: automatically triggered when the node properties change, such as creating a node, changing the execution version, or changing the job trigger policy (when changed from another method to Auto).</li>
         * </ul>
         * <p>The <strong>ramRole</strong> parameter is required for non-manual triggers.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
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
             * <p>The group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>g-433aead7560571e66e31274ffd3</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>p-433aead75605713865c386cb9d</p>
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
             * <p>The tag key of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
