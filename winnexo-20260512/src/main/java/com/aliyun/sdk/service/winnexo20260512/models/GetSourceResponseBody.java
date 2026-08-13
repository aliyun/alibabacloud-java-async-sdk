// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetSourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetSourceResponseBody</p>
 */
public class GetSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("completionTime")
    private String completionTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("hasNotes")
    private Boolean hasNotes;

    @com.aliyun.core.annotation.NameInMap("hasSettings")
    private Boolean hasSettings;

    @com.aliyun.core.annotation.NameInMap("hasStructuredTables")
    private Boolean hasStructuredTables;

    @com.aliyun.core.annotation.NameInMap("hasUnstructuredDocs")
    private Boolean hasUnstructuredDocs;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("notes")
    private String notes;

    @com.aliyun.core.annotation.NameInMap("objectBindings")
    private java.util.List<ObjectBindings> objectBindings;

    @com.aliyun.core.annotation.NameInMap("objectId")
    private String objectId;

    @com.aliyun.core.annotation.NameInMap("objectType")
    private String objectType;

    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    @com.aliyun.core.annotation.NameInMap("settings")
    private java.util.Map<String, ?> settings;

    @com.aliyun.core.annotation.NameInMap("skillOutputId")
    private String skillOutputId;

    @com.aliyun.core.annotation.NameInMap("sourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("sourceKind")
    private String sourceKind;

    @com.aliyun.core.annotation.NameInMap("sourceTags")
    private String sourceTags;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("structuredTables")
    private java.util.List<String> structuredTables;

    @com.aliyun.core.annotation.NameInMap("unstructuredDocs")
    private java.util.List<UnstructuredDocs> unstructuredDocs;

    private GetSourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.completionTime = builder.completionTime;
        this.description = builder.description;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.hasNotes = builder.hasNotes;
        this.hasSettings = builder.hasSettings;
        this.hasStructuredTables = builder.hasStructuredTables;
        this.hasUnstructuredDocs = builder.hasUnstructuredDocs;
        this.message = builder.message;
        this.name = builder.name;
        this.notes = builder.notes;
        this.objectBindings = builder.objectBindings;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
        this.operatingObjectName = builder.operatingObjectName;
        this.requestId = builder.requestId;
        this.scope = builder.scope;
        this.settings = builder.settings;
        this.skillOutputId = builder.skillOutputId;
        this.sourceId = builder.sourceId;
        this.sourceKind = builder.sourceKind;
        this.sourceTags = builder.sourceTags;
        this.sourceType = builder.sourceType;
        this.status = builder.status;
        this.structuredTables = builder.structuredTables;
        this.unstructuredDocs = builder.unstructuredDocs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSourceResponseBody create() {
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
     * @return completionTime
     */
    public String getCompletionTime() {
        return this.completionTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return hasNotes
     */
    public Boolean getHasNotes() {
        return this.hasNotes;
    }

    /**
     * @return hasSettings
     */
    public Boolean getHasSettings() {
        return this.hasSettings;
    }

    /**
     * @return hasStructuredTables
     */
    public Boolean getHasStructuredTables() {
        return this.hasStructuredTables;
    }

    /**
     * @return hasUnstructuredDocs
     */
    public Boolean getHasUnstructuredDocs() {
        return this.hasUnstructuredDocs;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return notes
     */
    public String getNotes() {
        return this.notes;
    }

    /**
     * @return objectBindings
     */
    public java.util.List<ObjectBindings> getObjectBindings() {
        return this.objectBindings;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return settings
     */
    public java.util.Map<String, ?> getSettings() {
        return this.settings;
    }

    /**
     * @return skillOutputId
     */
    public String getSkillOutputId() {
        return this.skillOutputId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceKind
     */
    public String getSourceKind() {
        return this.sourceKind;
    }

    /**
     * @return sourceTags
     */
    public String getSourceTags() {
        return this.sourceTags;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return structuredTables
     */
    public java.util.List<String> getStructuredTables() {
        return this.structuredTables;
    }

    /**
     * @return unstructuredDocs
     */
    public java.util.List<UnstructuredDocs> getUnstructuredDocs() {
        return this.unstructuredDocs;
    }

    public static final class Builder {
        private String code; 
        private String completionTime; 
        private String description; 
        private String gmtCreate; 
        private String gmtModified; 
        private Boolean hasNotes; 
        private Boolean hasSettings; 
        private Boolean hasStructuredTables; 
        private Boolean hasUnstructuredDocs; 
        private String message; 
        private String name; 
        private String notes; 
        private java.util.List<ObjectBindings> objectBindings; 
        private String objectId; 
        private String objectType; 
        private String operatingObjectName; 
        private String requestId; 
        private String scope; 
        private java.util.Map<String, ?> settings; 
        private String skillOutputId; 
        private String sourceId; 
        private String sourceKind; 
        private String sourceTags; 
        private String sourceType; 
        private String status; 
        private java.util.List<String> structuredTables; 
        private java.util.List<UnstructuredDocs> unstructuredDocs; 

        private Builder() {
        } 

        private Builder(GetSourceResponseBody model) {
            this.code = model.code;
            this.completionTime = model.completionTime;
            this.description = model.description;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.hasNotes = model.hasNotes;
            this.hasSettings = model.hasSettings;
            this.hasStructuredTables = model.hasStructuredTables;
            this.hasUnstructuredDocs = model.hasUnstructuredDocs;
            this.message = model.message;
            this.name = model.name;
            this.notes = model.notes;
            this.objectBindings = model.objectBindings;
            this.objectId = model.objectId;
            this.objectType = model.objectType;
            this.operatingObjectName = model.operatingObjectName;
            this.requestId = model.requestId;
            this.scope = model.scope;
            this.settings = model.settings;
            this.skillOutputId = model.skillOutputId;
            this.sourceId = model.sourceId;
            this.sourceKind = model.sourceKind;
            this.sourceTags = model.sourceTags;
            this.sourceType = model.sourceType;
            this.status = model.status;
            this.structuredTables = model.structuredTables;
            this.unstructuredDocs = model.unstructuredDocs;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>DocumentAgent 解析完成时间，ISO8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        public Builder completionTime(String completionTime) {
            this.completionTime = completionTime;
            return this;
        }

        /**
         * <p>数据源描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>创建时间，ISO8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>修改时间，ISO8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>是否存在备注</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasNotes(Boolean hasNotes) {
            this.hasNotes = hasNotes;
            return this;
        }

        /**
         * <p>是否存在 settings 配置</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasSettings(Boolean hasSettings) {
            this.hasSettings = hasSettings;
            return this;
        }

        /**
         * <p>是否存在结构化表</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasStructuredTables(Boolean hasStructuredTables) {
            this.hasStructuredTables = hasStructuredTables;
            return this;
        }

        /**
         * <p>是否存在非结构化文档</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasUnstructuredDocs(Boolean hasUnstructuredDocs) {
            this.hasUnstructuredDocs = hasUnstructuredDocs;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>备注（仅 includeDetails=True）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        /**
         * objectBindings.
         */
        public Builder objectBindings(java.util.List<ObjectBindings> objectBindings) {
            this.objectBindings = objectBindings;
            return this;
        }

        /**
         * <p>主对象 ID（兼容字段）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>主对象类型（兼容字段）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>运营对象名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>可见范围：PERSONAL / TENANT</p>
         * 
         * <strong>example:</strong>
         * <p>PERSONAL</p>
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * settings.
         */
        public Builder settings(java.util.Map<String, ?> settings) {
            this.settings = settings;
            return this;
        }

        /**
         * <p>技能产出 ID（由产出保存为资源时携带）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSkillOutputId</p>
         */
        public Builder skillOutputId(String skillOutputId) {
            this.skillOutputId = skillOutputId;
            return this;
        }

        /**
         * <p>数据源 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceId</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>数据源归属类型：normal / aliding_kb_doc</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder sourceKind(String sourceKind) {
            this.sourceKind = sourceKind;
            return this;
        }

        /**
         * <p>资源标签 JSON 字符串</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder sourceTags(String sourceTags) {
            this.sourceTags = sourceTags;
            return this;
        }

        /**
         * <p>数据源类型</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>数据源状态</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>structuredTables</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder structuredTables(java.util.List<String> structuredTables) {
            this.structuredTables = structuredTables;
            return this;
        }

        /**
         * unstructuredDocs.
         */
        public Builder unstructuredDocs(java.util.List<UnstructuredDocs> unstructuredDocs) {
            this.unstructuredDocs = unstructuredDocs;
            return this;
        }

        public GetSourceResponseBody build() {
            return new GetSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSourceResponseBody</p>
     */
    public static class ObjectBindings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("graphName")
        private String graphName;

        @com.aliyun.core.annotation.NameInMap("objectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("objectType")
        private String objectType;

        private ObjectBindings(Builder builder) {
            this.graphName = builder.graphName;
            this.objectId = builder.objectId;
            this.objectType = builder.objectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectBindings create() {
            return builder().build();
        }

        /**
         * @return graphName
         */
        public String getGraphName() {
            return this.graphName;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        public static final class Builder {
            private String graphName; 
            private String objectId; 
            private String objectType; 

            private Builder() {
            } 

            private Builder(ObjectBindings model) {
                this.graphName = model.graphName;
                this.objectId = model.objectId;
                this.objectType = model.objectType;
            } 

            /**
             * <p>对象归属的语义图谱名</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder graphName(String graphName) {
                this.graphName = graphName;
                return this;
            }

            /**
             * <p>对象 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleObjectId</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>对象类型</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            public ObjectBindings build() {
                return new ObjectBindings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSourceResponseBody</p>
     */
    public static class UnstructuredDocs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("completionTime")
        private String completionTime;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileRecordId")
        private String fileRecordId;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("ossUrl")
        private String ossUrl;

        @com.aliyun.core.annotation.NameInMap("semanticsId")
        private String semanticsId;

        private UnstructuredDocs(Builder builder) {
            this.completionTime = builder.completionTime;
            this.fileName = builder.fileName;
            this.fileRecordId = builder.fileRecordId;
            this.fileType = builder.fileType;
            this.ossUrl = builder.ossUrl;
            this.semanticsId = builder.semanticsId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnstructuredDocs create() {
            return builder().build();
        }

        /**
         * @return completionTime
         */
        public String getCompletionTime() {
            return this.completionTime;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileRecordId
         */
        public String getFileRecordId() {
            return this.fileRecordId;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return ossUrl
         */
        public String getOssUrl() {
            return this.ossUrl;
        }

        /**
         * @return semanticsId
         */
        public String getSemanticsId() {
            return this.semanticsId;
        }

        public static final class Builder {
            private String completionTime; 
            private String fileName; 
            private String fileRecordId; 
            private String fileType; 
            private String ossUrl; 
            private String semanticsId; 

            private Builder() {
            } 

            private Builder(UnstructuredDocs model) {
                this.completionTime = model.completionTime;
                this.fileName = model.fileName;
                this.fileRecordId = model.fileRecordId;
                this.fileType = model.fileType;
                this.ossUrl = model.ossUrl;
                this.semanticsId = model.semanticsId;
            } 

            /**
             * <p>DocumentAgent 解析完成时间，ISO8601 格式</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-01T12:00:00Z</p>
             */
            public Builder completionTime(String completionTime) {
                this.completionTime = completionTime;
                return this;
            }

            /**
             * <p>文件名</p>
             * 
             * <strong>example:</strong>
             * <p>example.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>文件记录 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleFileRecordId</p>
             */
            public Builder fileRecordId(String fileRecordId) {
                this.fileRecordId = fileRecordId;
                return this;
            }

            /**
             * <p>文件类型</p>
             * 
             * <strong>example:</strong>
             * <p>pdf</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>OSS 远程 URL</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            /**
             * <p>DocumentAgent 语义 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleSemanticsId</p>
             */
            public Builder semanticsId(String semanticsId) {
                this.semanticsId = semanticsId;
                return this;
            }

            public UnstructuredDocs build() {
                return new UnstructuredDocs(this);
            } 

        } 

    }
}
