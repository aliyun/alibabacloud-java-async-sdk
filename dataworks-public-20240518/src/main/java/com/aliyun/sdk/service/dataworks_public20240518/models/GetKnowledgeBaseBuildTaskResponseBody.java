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
 * {@link GetKnowledgeBaseBuildTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetKnowledgeBaseBuildTaskResponseBody</p>
 */
public class GetKnowledgeBaseBuildTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetKnowledgeBaseBuildTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgeBaseBuildTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetKnowledgeBaseBuildTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business error code, which is used to determine the error type when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data returned when the request is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The security error message returned when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The request parameters are invalid</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which can be used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetKnowledgeBaseBuildTaskResponseBody build() {
            return new GetKnowledgeBaseBuildTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKnowledgeBaseBuildTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseBuildTaskResponseBody</p>
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
             * <p>The metadata entity ID returned by Data Map. The client passes this ID as is and does not concatenate database, schema, or table identifiers.</p>
             * 
             * <strong>example:</strong>
             * <p>maxcompute-table:::project_name:schema_name:table_name</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The entity level, such as DATABASE, SCHEMA, or TABLE. The server validates this based on the Data Map identity. The presence of an enum value does not guarantee that all engines support it.</p>
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
     * {@link GetKnowledgeBaseBuildTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseBuildTaskResponseBody</p>
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
             * <p>The Data Map entities such as databases, schemas, and tables selected for data asset-scoped builds. The values must be non-empty and deduplicated.</p>
             */
            public Builder entities(java.util.List<Entities> entities) {
                this.entities = entities;
                return this;
            }

            /**
             * <p>Required, non-empty, and deduplicated when building from document objects in the knowledge base. Each item is a KnowledgeObjectId with Type=DOCUMENT in the knowledge base. Do not mix this with SourceIds for external connector synchronization scopes.</p>
             */
            public Builder knowledgeObjectIds(java.util.List<String> knowledgeObjectIds) {
                this.knowledgeObjectIds = knowledgeObjectIds;
                return this;
            }

            /**
             * <p>The IDs of the DataWorks workspaces selected for workspace-scoped builds. The values must be non-empty and deduplicated.</p>
             */
            public Builder projectIds(java.util.List<Long> projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * <p>The IDs of the registered sources in the knowledge base. The values are deduplicated. Whether this parameter is required and the allowed source types depend on the task input scenario. For more information, see the following table.</p>
             */
            public Builder sourceIds(java.util.List<String> sourceIds) {
                this.sourceIds = sourceIds;
                return this;
            }

            /**
             * <p>The YAML upload session ID in the knowledge base used for SEMANTIC_MODEL import tasks. This ID is bound when the task is created and cannot be mixed with other input scopes.</p>
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
     * {@link GetKnowledgeBaseBuildTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseBuildTaskResponseBody</p>
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
             * <p>The Builder compute specifications. Valid values: 4 to 16. If this parameter is omitted during creation, the default value is 4. The read operation returns the effective value.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The ID of the DataWorks resource group used by the actual Builder nodes. The server validates that it is available in the workspace corresponding to the top-level ProjectId of the task.</p>
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
     * {@link GetKnowledgeBaseBuildTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseBuildTaskResponseBody</p>
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
             * <p>The DataWorks scheduling cron expression. This parameter is provided only when the mode is PERIODIC.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 2 * * ?</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>Specifies whether periodic automatic triggering is enabled. This parameter is provided only when the mode is PERIODIC and does not indicate the instance status.</p>
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
    /**
     * 
     * {@link GetKnowledgeBaseBuildTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseBuildTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentLocale")
        private String contentLocale;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("LlmModel")
        private String llmModel;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        private RuntimeResource runtimeResource;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        private Trigger trigger;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.contentLocale = builder.contentLocale;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.input = builder.input;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.llmModel = builder.llmModel;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.runtimeResource = builder.runtimeResource;
            this.taskId = builder.taskId;
            this.trigger = builder.trigger;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return contentLocale
         */
        public String getContentLocale() {
            return this.contentLocale;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
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
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
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

        public static final class Builder {
            private String contentLocale; 
            private Long createTime; 
            private String description; 
            private Input input; 
            private String knowledgeBaseId; 
            private String llmModel; 
            private Long modifyTime; 
            private String name; 
            private Long projectId; 
            private RuntimeResource runtimeResource; 
            private String taskId; 
            private Trigger trigger; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.contentLocale = model.contentLocale;
                this.createTime = model.createTime;
                this.description = model.description;
                this.input = model.input;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.llmModel = model.llmModel;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.projectId = model.projectId;
                this.runtimeResource = model.runtimeResource;
                this.taskId = model.taskId;
                this.trigger = model.trigger;
                this.type = model.type;
            } 

            /**
             * <p>The content language of the task. This field is optional and is specified explicitly when the task is created.</p>
             * 
             * <strong>example:</strong>
             * <p>zh-CN</p>
             */
            public Builder contentLocale(String contentLocale) {
                this.contentLocale = contentLocale;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1790200000000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The task description. This parameter is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales metrics and policy documents</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The typed input scope selected for the task. System-managed upload build tasks do not have fixed inputs, and this field is omitted when reading.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The ID of the associated knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678-1234-4234-8234-123456789abc</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The large language model (LLM) configured for tasks that require a model. You can specify a model ID or set this parameter to AUTO. If this parameter is omitted during creation, the default value is AUTO. Do not configure this parameter for tasks that do not call a model.</p>
             * 
             * <strong>example:</strong>
             * <p>AUTO</p>
             */
            public Builder llmModel(String llmModel) {
                this.llmModel = llmModel;
                return this;
            }

            /**
             * <p>The time when the definition was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1790200300000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>Project workspace knowledge build</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the DataWorks workspace where the task runs. This is different from the build asset scope specified by Input.ProjectIds.</p>
             * 
             * <strong>example:</strong>
             * <p>67890</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The resource group and Builder compute specifications for running the task.</p>
             */
            public Builder runtimeResource(RuntimeResource runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            /**
             * <p>The stable task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The manual or periodic trigger configuration.</p>
             */
            public Builder trigger(Trigger trigger) {
                this.trigger = trigger;
                return this;
            }

            /**
             * <p>The task type. Valid values: PROJECT_SPACE_BUILD, SEMANTIC_GRAPH, DOCUMENT_GRAPH, DOCUMENT_SYNC, DOCUMENT_SYNC_AND_GRAPH, and SEMANTIC_MODEL. SEMANTIC_MODEL is used only for YAML import.</p>
             * 
             * <strong>example:</strong>
             * <p>PROJECT_SPACE_BUILD</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
