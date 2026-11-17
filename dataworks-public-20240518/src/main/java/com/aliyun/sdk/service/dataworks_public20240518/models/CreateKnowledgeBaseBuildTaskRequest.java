// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateKnowledgeBaseBuildTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateKnowledgeBaseBuildTaskRequest</p>
 */
public class CreateKnowledgeBaseBuildTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentLocale")
    private String contentLocale;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private Input input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LlmModel")
    private String llmModel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeResource")
    @com.aliyun.core.annotation.Validation(required = true)
    private RuntimeResource runtimeResource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Trigger")
    private Trigger trigger;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateKnowledgeBaseBuildTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.contentLocale = builder.contentLocale;
        this.description = builder.description;
        this.input = builder.input;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.llmModel = builder.llmModel;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.runtimeResource = builder.runtimeResource;
        this.trigger = builder.trigger;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeBaseBuildTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return contentLocale
     */
    public String getContentLocale() {
        return this.contentLocale;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return llmModel
     */
    public String getLlmModel() {
        return this.llmModel;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return runtimeResource
     */
    public RuntimeResource getRuntimeResource() {
        return this.runtimeResource;
    }

    /**
     * @return trigger
     */
    public Trigger getTrigger() {
        return this.trigger;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateKnowledgeBaseBuildTaskRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String contentLocale; 
        private String description; 
        private Input input; 
        private String knowledgeBaseId; 
        private String llmModel; 
        private String name; 
        private Long projectId; 
        private RuntimeResource runtimeResource; 
        private Trigger trigger; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateKnowledgeBaseBuildTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.contentLocale = request.contentLocale;
            this.description = request.description;
            this.input = request.input;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.llmModel = request.llmModel;
            this.name = request.name;
            this.projectId = request.projectId;
            this.runtimeResource = request.runtimeResource;
            this.trigger = request.trigger;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The idempotency token for the creation request.</p>
         * 
         * <strong>example:</strong>
         * <p>task-create-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The language of the content.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder contentLocale(String contentLocale) {
            this.putBodyParameter("ContentLocale", contentLocale);
            this.contentLocale = contentLocale;
            return this;
        }

        /**
         * <p>The description of the task. The description can be up to 1,024 characters in length. If this parameter is omitted, no description is set.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales metrics and policy documents</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies the input scope by selecting projects, entities, sources, or files based on the type.</p>
         * <p>This parameter is required.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putBodyParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * <p>The ID of the knowledge base to which the task belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putBodyParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The specific model ID or AUTO.</p>
         * 
         * <strong>example:</strong>
         * <p>model-001</p>
         */
        public Builder llmModel(String llmModel) {
            this.putBodyParameter("LlmModel", llmModel);
            this.llmModel = llmModel;
            return this;
        }

        /**
         * <p>The name of the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Project space knowledge building</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the workspace where the task runs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>67890</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The resource group and Builder compute units (CUs).</p>
         * <p>This parameter is required.</p>
         */
        public Builder runtimeResource(RuntimeResource runtimeResource) {
            String runtimeResourceShrink = shrink(runtimeResource, "RuntimeResource", "json");
            this.putBodyParameter("RuntimeResource", runtimeResourceShrink);
            this.runtimeResource = runtimeResource;
            return this;
        }

        /**
         * <p>The manual or periodic trigger configuration.</p>
         */
        public Builder trigger(Trigger trigger) {
            String triggerShrink = shrink(trigger, "Trigger", "json");
            this.putBodyParameter("Trigger", triggerShrink);
            this.trigger = trigger;
            return this;
        }

        /**
         * <p>The available build types.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_SPACE_BUILD</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateKnowledgeBaseBuildTaskRequest build() {
            return new CreateKnowledgeBaseBuildTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateKnowledgeBaseBuildTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseBuildTaskRequest</p>
     */
    public static class Entities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        private Entities(Builder builder) {
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entities create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        public static final class Builder {
            private String entityId; 
            private String entityType; 

            private Builder() {
            } 

            private Builder(Entities model) {
                this.entityId = model.entityId;
                this.entityType = model.entityType;
            } 

            /**
             * <p>The metadata entity ID returned by Data Map. The client must pass this value as is and must not concatenate database, schema, or table identifiers.</p>
             * 
             * <strong>example:</strong>
             * <p>maxcompute-table:::project_name:schema_name:table_name</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The entity level, such as DATABASE, SCHEMA, or TABLE. The server validates this value based on the Data Map identity. The presence of an enum value does not guarantee that all engines support it.</p>
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            public Entities build() {
                return new Entities(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateKnowledgeBaseBuildTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseBuildTaskRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Entities")
        private java.util.List<Entities> entities;

        @com.aliyun.core.annotation.NameInMap("KnowledgeObjectIds")
        private java.util.List<String> knowledgeObjectIds;

        @com.aliyun.core.annotation.NameInMap("ProjectIds")
        private java.util.List<Long> projectIds;

        @com.aliyun.core.annotation.NameInMap("SourceIds")
        private java.util.List<String> sourceIds;

        @com.aliyun.core.annotation.NameInMap("YamlUploadId")
        private String yamlUploadId;

        private Input(Builder builder) {
            this.entities = builder.entities;
            this.knowledgeObjectIds = builder.knowledgeObjectIds;
            this.projectIds = builder.projectIds;
            this.sourceIds = builder.sourceIds;
            this.yamlUploadId = builder.yamlUploadId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return entities
         */
        public java.util.List<Entities> getEntities() {
            return this.entities;
        }

        /**
         * @return knowledgeObjectIds
         */
        public java.util.List<String> getKnowledgeObjectIds() {
            return this.knowledgeObjectIds;
        }

        /**
         * @return projectIds
         */
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        /**
         * @return sourceIds
         */
        public java.util.List<String> getSourceIds() {
            return this.sourceIds;
        }

        /**
         * @return yamlUploadId
         */
        public String getYamlUploadId() {
            return this.yamlUploadId;
        }

        public static final class Builder {
            private java.util.List<Entities> entities; 
            private java.util.List<String> knowledgeObjectIds; 
            private java.util.List<Long> projectIds; 
            private java.util.List<String> sourceIds; 
            private String yamlUploadId; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.entities = model.entities;
                this.knowledgeObjectIds = model.knowledgeObjectIds;
                this.projectIds = model.projectIds;
                this.sourceIds = model.sourceIds;
                this.yamlUploadId = model.yamlUploadId;
            } 

            /**
             * <p>The Data Map entities such as databases, schemas, and tables selected for data asset-scoped builds. The list cannot be empty and must contain unique values.</p>
             */
            public Builder entities(java.util.List<Entities> entities) {
                this.entities = entities;
                return this;
            }

            /**
             * <p>Required when building from document objects in the current knowledge base. The list cannot be empty and must contain unique values. Each item is the KnowledgeObjectId of a DOCUMENT type object in the current knowledge base. This parameter cannot be mixed with SourceIds for external connector synchronization scopes.</p>
             */
            public Builder knowledgeObjectIds(java.util.List<String> knowledgeObjectIds) {
                this.knowledgeObjectIds = knowledgeObjectIds;
                return this;
            }

            /**
             * <p>The IDs of the DataWorks workspaces selected for workspace-scoped builds. The list cannot be empty and must contain unique values.</p>
             */
            public Builder projectIds(java.util.List<Long> projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * <p>The IDs of the registered sources in the current knowledge base. The list must contain unique values. Whether this parameter is required and the allowed source types depend on the task input scenario. For more information, see the following table.</p>
             */
            public Builder sourceIds(java.util.List<String> sourceIds) {
                this.sourceIds = sourceIds;
                return this;
            }

            /**
             * <p>The YAML upload session ID in the current knowledge base used for SEMANTIC_MODEL import tasks. This ID is bound when the task is created and cannot be mixed with other input scopes.</p>
             * 
             * <strong>example:</strong>
             * <p>upload-yaml-001</p>
             */
            public Builder yamlUploadId(String yamlUploadId) {
                this.yamlUploadId = yamlUploadId;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateKnowledgeBaseBuildTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseBuildTaskRequest</p>
     */
    public static class RuntimeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cu")
        private Integer cu;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private RuntimeResource(Builder builder) {
            this.cu = builder.cu;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuntimeResource create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public Integer getCu() {
            return this.cu;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private Integer cu; 
            private String resourceGroupId; 

            private Builder() {
            } 

            private Builder(RuntimeResource model) {
                this.cu = model.cu;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * <p>The Builder compute specifications. Valid values: 4 to 16. If this parameter is omitted during creation, the default value is 4. The actual valid value is returned in read operations.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The ID of the DataWorks resource group used by the actual Builder nodes. The server validates that the resource group is available in the workspace corresponding to the top-level ProjectId of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-001</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public RuntimeResource build() {
                return new RuntimeResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateKnowledgeBaseBuildTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseBuildTaskRequest</p>
     */
    public static class Trigger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        private Trigger(Builder builder) {
            this.cron = builder.cron;
            this.enabled = builder.enabled;
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trigger create() {
            return builder().build();
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private String cron; 
            private Boolean enabled; 
            private String mode; 

            private Builder() {
            } 

            private Builder(Trigger model) {
                this.cron = model.cron;
                this.enabled = model.enabled;
                this.mode = model.mode;
            } 

            /**
             * <p>The DataWorks scheduling cron expression. This parameter is provided only when the mode is set to PERIODIC.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 2 * * ?</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>Specifies whether to enable or disable automatic periodic triggering. This parameter is provided only when the mode is set to PERIODIC and does not indicate the instance status.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The trigger mode. Valid values: MANUAL and PERIODIC. Manual tasks do not create instances automatically.</p>
             * 
             * <strong>example:</strong>
             * <p>MANUAL</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public Trigger build() {
                return new Trigger(this);
            } 

        } 

    }
}
