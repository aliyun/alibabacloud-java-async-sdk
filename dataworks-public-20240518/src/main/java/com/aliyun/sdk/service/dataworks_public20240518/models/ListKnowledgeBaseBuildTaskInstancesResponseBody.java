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
 * {@link ListKnowledgeBaseBuildTaskInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListKnowledgeBaseBuildTaskInstancesResponseBody</p>
 */
public class ListKnowledgeBaseBuildTaskInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListKnowledgeBaseBuildTaskInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgeBaseBuildTaskInstancesResponseBody create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
        private Integer maxResults; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListKnowledgeBaseBuildTaskInstancesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
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
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The secure error message returned when the request fails.</p>
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

        public ListKnowledgeBaseBuildTaskInstancesResponseBody build() {
            return new ListKnowledgeBaseBuildTaskInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKnowledgeBaseBuildTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseBuildTaskInstancesResponseBody</p>
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
             * <p>The Builder compute specifications. Valid values: 4 to 16. If omitted during creation, the default value is 4. The read operation returns the effective value.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The DataWorks resource group ID used by the actual Builder nodes. The server verifies its availability in the workspace corresponding to the top-level ProjectId of the task.</p>
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
     * {@link ListKnowledgeBaseBuildTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseBuildTaskInstancesResponseBody</p>
     */
    public static class ConfigSnapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentLocale")
        private String contentLocale;

        @com.aliyun.core.annotation.NameInMap("LlmModel")
        private String llmModel;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        private RuntimeResource runtimeResource;

        private ConfigSnapshot(Builder builder) {
            this.contentLocale = builder.contentLocale;
            this.llmModel = builder.llmModel;
            this.projectId = builder.projectId;
            this.runtimeResource = builder.runtimeResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigSnapshot create() {
            return builder().build();
        }

        /**
         * @return contentLocale
         */
        public String getContentLocale() {
            return this.contentLocale;
        }

        /**
         * @return llmModel
         */
        public String getLlmModel() {
            return this.llmModel;
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

        public static final class Builder {
            private String contentLocale; 
            private String llmModel; 
            private Long projectId; 
            private RuntimeResource runtimeResource; 

            private Builder() {
            } 

            private Builder(ConfigSnapshot model) {
                this.contentLocale = model.contentLocale;
                this.llmModel = model.llmModel;
                this.projectId = model.projectId;
                this.runtimeResource = model.runtimeResource;
            } 

            /**
             * <p>The content language used for the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>zh-CN</p>
             */
            public Builder contentLocale(String contentLocale) {
                this.contentLocale = contentLocale;
                return this;
            }

            /**
             * <p>The specific model ID actually used and frozen for the execution. AUTO is not returned. This field can be empty for tasks that do not call models, such as pure synchronization tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>model-001</p>
             */
            public Builder llmModel(String llmModel) {
                this.llmModel = llmModel;
                return this;
            }

            /**
             * <p>The DataWorks workspace ID used for the execution, frozen from the task definition when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>67890</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The resource group and Builder CUs actually used for the execution.</p>
             */
            public Builder runtimeResource(RuntimeResource runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            public ConfigSnapshot build() {
                return new ConfigSnapshot(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKnowledgeBaseBuildTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseBuildTaskInstancesResponseBody</p>
     */
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Error(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(Error model) {
                this.code = model.code;
                this.message = model.message;
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
             * <p>The secure error message returned when the request fails.</p>
             * 
             * <strong>example:</strong>
             * <p>The request parameters are invalid</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Error build() {
                return new Error(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKnowledgeBaseBuildTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseBuildTaskInstancesResponseBody</p>
     */
    public static class GeneratedModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("VersionNo")
        private Long versionNo;

        private GeneratedModels(Builder builder) {
            this.modelId = builder.modelId;
            this.versionNo = builder.versionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GeneratedModels create() {
            return builder().build();
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return versionNo
         */
        public Long getVersionNo() {
            return this.versionNo;
        }

        public static final class Builder {
            private String modelId; 
            private Long versionNo; 

            private Builder() {
            } 

            private Builder(GeneratedModels model) {
                this.modelId = model.modelId;
                this.versionNo = model.versionNo;
            } 

            /**
             * <p>The model ID generated by the semantic layer. You can use it as a KnowledgeObjectId to read the corresponding semantic model.</p>
             * 
             * <strong>example:</strong>
             * <p>01MODELULID</p>
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>The current version of the SEMANTIC_MODEL being read. Pass this value when updating content. The version can be edited in place.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder versionNo(Long versionNo) {
                this.versionNo = versionNo;
                return this;
            }

            public GeneratedModels build() {
                return new GeneratedModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKnowledgeBaseBuildTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseBuildTaskInstancesResponseBody</p>
     */
    public static class ResolvedEntities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        private ResolvedEntities(Builder builder) {
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResolvedEntities create() {
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

            private Builder(ResolvedEntities model) {
                this.entityId = model.entityId;
                this.entityType = model.entityType;
            } 

            /**
             * <p>The metadata entity ID returned by Data Map. The client must pass this ID as is without concatenating database, schema, or table identifiers.</p>
             * 
             * <strong>example:</strong>
             * <p>maxcompute-table:::project_name:schema_name:table_name</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The entity level, such as DATABASE, SCHEMA, or TABLE. The server validates this based on Data Map identities. The presence of an enum value does not guarantee that all engines support it.</p>
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            public ResolvedEntities build() {
                return new ResolvedEntities(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKnowledgeBaseBuildTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseBuildTaskInstancesResponseBody</p>
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
             * <p>The metadata entity ID returned by Data Map. The client must pass this ID as is without concatenating database, schema, or table identifiers.</p>
             * 
             * <strong>example:</strong>
             * <p>maxcompute-table:::project_name:schema_name:table_name</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The entity level, such as DATABASE, SCHEMA, or TABLE. The server validates this based on Data Map identities. The presence of an enum value does not guarantee that all engines support it.</p>
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
     * {@link ListKnowledgeBaseBuildTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseBuildTaskInstancesResponseBody</p>
     */
    public static class SelectedInput extends TeaModel {
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

        private SelectedInput(Builder builder) {
            this.entities = builder.entities;
            this.knowledgeObjectIds = builder.knowledgeObjectIds;
            this.projectIds = builder.projectIds;
            this.sourceIds = builder.sourceIds;
            this.yamlUploadId = builder.yamlUploadId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectedInput create() {
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

            private Builder(SelectedInput model) {
                this.entities = model.entities;
                this.knowledgeObjectIds = model.knowledgeObjectIds;
                this.projectIds = model.projectIds;
                this.sourceIds = model.sourceIds;
                this.yamlUploadId = model.yamlUploadId;
            } 

            /**
             * <p>The Data Map entities, such as databases, schemas, and tables, selected for data asset-scoped builds. The list is non-empty and deduplicated.</p>
             */
            public Builder entities(java.util.List<Entities> entities) {
                this.entities = entities;
                return this;
            }

            /**
             * <p>Required, non-empty, and deduplicated when building from document objects in the knowledge base. Each item is a KnowledgeObjectId with Type=DOCUMENT in the knowledge base. This field cannot be mixed with SourceIds used for external connector synchronization scopes.</p>
             */
            public Builder knowledgeObjectIds(java.util.List<String> knowledgeObjectIds) {
                this.knowledgeObjectIds = knowledgeObjectIds;
                return this;
            }

            /**
             * <p>The DataWorks workspace IDs selected for workspace-scoped builds. The list is non-empty and deduplicated.</p>
             */
            public Builder projectIds(java.util.List<Long> projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * <p>The IDs of the registered sources in the knowledge base. The list is deduplicated. Whether this field is required and the allowed source types depend on the task input scenario. Refer to the following table.</p>
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

            public SelectedInput build() {
                return new SelectedInput(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKnowledgeBaseBuildTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseBuildTaskInstancesResponseBody</p>
     */
    public static class InputSnapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocumentSourceCount")
        private Long documentSourceCount;

        @com.aliyun.core.annotation.NameInMap("FilePaths")
        private java.util.List<String> filePaths;

        @com.aliyun.core.annotation.NameInMap("ResolvedEntities")
        private java.util.List<ResolvedEntities> resolvedEntities;

        @com.aliyun.core.annotation.NameInMap("ResolvedEntityCount")
        private Long resolvedEntityCount;

        @com.aliyun.core.annotation.NameInMap("SelectedInput")
        private SelectedInput selectedInput;

        private InputSnapshot(Builder builder) {
            this.documentSourceCount = builder.documentSourceCount;
            this.filePaths = builder.filePaths;
            this.resolvedEntities = builder.resolvedEntities;
            this.resolvedEntityCount = builder.resolvedEntityCount;
            this.selectedInput = builder.selectedInput;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputSnapshot create() {
            return builder().build();
        }

        /**
         * @return documentSourceCount
         */
        public Long getDocumentSourceCount() {
            return this.documentSourceCount;
        }

        /**
         * @return filePaths
         */
        public java.util.List<String> getFilePaths() {
            return this.filePaths;
        }

        /**
         * @return resolvedEntities
         */
        public java.util.List<ResolvedEntities> getResolvedEntities() {
            return this.resolvedEntities;
        }

        /**
         * @return resolvedEntityCount
         */
        public Long getResolvedEntityCount() {
            return this.resolvedEntityCount;
        }

        /**
         * @return selectedInput
         */
        public SelectedInput getSelectedInput() {
            return this.selectedInput;
        }

        public static final class Builder {
            private Long documentSourceCount; 
            private java.util.List<String> filePaths; 
            private java.util.List<ResolvedEntities> resolvedEntities; 
            private Long resolvedEntityCount; 
            private SelectedInput selectedInput; 

            private Builder() {
            } 

            private Builder(InputSnapshot model) {
                this.documentSourceCount = model.documentSourceCount;
                this.filePaths = model.filePaths;
                this.resolvedEntities = model.resolvedEntities;
                this.resolvedEntityCount = model.resolvedEntityCount;
                this.selectedInput = model.selectedInput;
            } 

            /**
             * <p>The number of external document sources selected for the execution. This field is not returned when not applicable.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder documentSourceCount(Long documentSourceCount) {
                this.documentSourceCount = documentSourceCount;
                return this;
            }

            /**
             * <p>The relative file paths in the knowledge base processed for page upload builds in the execution. These paths are from the frozen upload list of the instance. OSS addresses or verification information are not returned, and the current task or file list is not re-read.</p>
             */
            public Builder filePaths(java.util.List<String> filePaths) {
                this.filePaths = filePaths;
                return this;
            }

            /**
             * <p>The actual Data Map entities resolved from the project, database, or schema scope for the execution. This field is not returned when not applicable.</p>
             */
            public Builder resolvedEntities(java.util.List<ResolvedEntities> resolvedEntities) {
                this.resolvedEntities = resolvedEntities;
                return this;
            }

            /**
             * <p>The total number of resolved entities. An accurate count is returned even if the array is omitted due to its size.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder resolvedEntityCount(Long resolvedEntityCount) {
                this.resolvedEntityCount = resolvedEntityCount;
                return this;
            }

            /**
             * <p>The snapshot of the selection conditions in the task definition when the instance was created. This snapshot does not change when the task is updated. This field is omitted if no fixed object is selected for page upload builds.</p>
             */
            public Builder selectedInput(SelectedInput selectedInput) {
                this.selectedInput = selectedInput;
                return this;
            }

            public InputSnapshot build() {
                return new InputSnapshot(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKnowledgeBaseBuildTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseBuildTaskInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigSnapshot")
        private ConfigSnapshot configSnapshot;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CurrentStage")
        private String currentStage;

        @com.aliyun.core.annotation.NameInMap("Error")
        private Error error;

        @com.aliyun.core.annotation.NameInMap("FinishedTime")
        private Long finishedTime;

        @com.aliyun.core.annotation.NameInMap("GeneratedModels")
        private java.util.List<GeneratedModels> generatedModels;

        @com.aliyun.core.annotation.NameInMap("InputSnapshot")
        private InputSnapshot inputSnapshot;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("StartedTime")
        private Long startedTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskInstanceId")
        private String taskInstanceId;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        private Instances(Builder builder) {
            this.configSnapshot = builder.configSnapshot;
            this.createTime = builder.createTime;
            this.currentStage = builder.currentStage;
            this.error = builder.error;
            this.finishedTime = builder.finishedTime;
            this.generatedModels = builder.generatedModels;
            this.inputSnapshot = builder.inputSnapshot;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.startedTime = builder.startedTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskInstanceId = builder.taskInstanceId;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return configSnapshot
         */
        public ConfigSnapshot getConfigSnapshot() {
            return this.configSnapshot;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentStage
         */
        public String getCurrentStage() {
            return this.currentStage;
        }

        /**
         * @return error
         */
        public Error getError() {
            return this.error;
        }

        /**
         * @return finishedTime
         */
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return generatedModels
         */
        public java.util.List<GeneratedModels> getGeneratedModels() {
            return this.generatedModels;
        }

        /**
         * @return inputSnapshot
         */
        public InputSnapshot getInputSnapshot() {
            return this.inputSnapshot;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return startedTime
         */
        public Long getStartedTime() {
            return this.startedTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskInstanceId
         */
        public String getTaskInstanceId() {
            return this.taskInstanceId;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private ConfigSnapshot configSnapshot; 
            private Long createTime; 
            private String currentStage; 
            private Error error; 
            private Long finishedTime; 
            private java.util.List<GeneratedModels> generatedModels; 
            private InputSnapshot inputSnapshot; 
            private String knowledgeBaseId; 
            private Long startedTime; 
            private String status; 
            private String taskId; 
            private String taskInstanceId; 
            private String triggerType; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.configSnapshot = model.configSnapshot;
                this.createTime = model.createTime;
                this.currentStage = model.currentStage;
                this.error = model.error;
                this.finishedTime = model.finishedTime;
                this.generatedModels = model.generatedModels;
                this.inputSnapshot = model.inputSnapshot;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.startedTime = model.startedTime;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskInstanceId = model.taskInstanceId;
                this.triggerType = model.triggerType;
            } 

            /**
             * <p>The snapshot of the model, content language, and runtime resources for the execution. This snapshot does not change when the task is updated.</p>
             */
            public Builder configSnapshot(ConfigSnapshot configSnapshot) {
                this.configSnapshot = configSnapshot;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1790200400000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The current business stage, returned when reliable records are available. For standard build stages and semantic model import stages, refer to the domain model. This field does not replace the overall status.</p>
             * 
             * <strong>example:</strong>
             * <p>INITIALIZE</p>
             */
            public Builder currentStage(String currentStage) {
                this.currentStage = currentStage;
                return this;
            }

            /**
             * <p>The error code and secure error message returned when the execution fails.</p>
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The time when the execution finished. This field is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>1790200060000</p>
             */
            public Builder finishedTime(Long finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * <p>The confirmed ModelId and VersionNo for model imports only. For their structure, see GetKnowledgeBaseBuildTaskInstance.</p>
             */
            public Builder generatedModels(java.util.List<GeneratedModels> generatedModels) {
                this.generatedModels = generatedModels;
                return this;
            }

            /**
             * <p>The non-sensitive input snapshot after selection and parsing for the execution. This snapshot does not change when the task is updated.</p>
             */
            public Builder inputSnapshot(InputSnapshot inputSnapshot) {
                this.inputSnapshot = inputSnapshot;
                return this;
            }

            /**
             * <p>The ID of the knowledge base to which the instance belongs. Use it for scope validation and queries.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678-1234-4234-8234-123456789abc</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The time when the execution started. This field is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>1790200001000</p>
             */
            public Builder startedTime(Long startedTime) {
                this.startedTime = startedTime;
                return this;
            }

            /**
             * <p>The overall status of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The source task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20001</p>
             */
            public Builder taskInstanceId(String taskInstanceId) {
                this.taskInstanceId = taskInstanceId;
                return this;
            }

            /**
             * <p>The trigger type of the execution, which can be manual, periodic, or a supported event.</p>
             * 
             * <strong>example:</strong>
             * <p>MANUAL</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKnowledgeBaseBuildTaskInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseBuildTaskInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instances")
        private java.util.List<Instances> instances;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        private Data(Builder builder) {
            this.instances = builder.instances;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instances
         */
        public java.util.List<Instances> getInstances() {
            return this.instances;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private java.util.List<Instances> instances; 
            private String nextToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.instances = model.instances;
                this.nextToken = model.nextToken;
            } 

            /**
             * <p>The knowledge objects that you have permissions to read on the current page.</p>
             */
            public Builder instances(java.util.List<Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * <p>The pagination token for the next page. This field is null if there is no next page.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJvZmZzZXQiOjIwfQ</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
