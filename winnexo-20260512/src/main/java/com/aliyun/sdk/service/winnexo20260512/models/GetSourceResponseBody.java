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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The completion time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        public Builder completionTime(String completionTime) {
            this.completionTime = completionTime;
            return this;
        }

        /**
         * <p>The description of the to-do card type.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>Indicates whether notes exist.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasNotes(Boolean hasNotes) {
            this.hasNotes = hasNotes;
            return this;
        }

        /**
         * <p>Indicates whether settings configuration exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasSettings(Boolean hasSettings) {
            this.hasSettings = hasSettings;
            return this;
        }

        /**
         * <p>Indicates whether structured tables exist.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasStructuredTables(Boolean hasStructuredTables) {
            this.hasStructuredTables = hasStructuredTables;
            return this;
        }

        /**
         * <p>Indicates whether unstructured documents exist.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasUnstructuredDocs(Boolean hasUnstructuredDocs) {
            this.hasUnstructuredDocs = hasUnstructuredDocs;
            return this;
        }

        /**
         * <p>The status code description.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName.pdf</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The meeting notes content (optional). The notes are used for auxiliary analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        /**
         * <p>The object bindings.</p>
         */
        public Builder objectBindings(java.util.List<ObjectBindings> objectBindings) {
            this.objectBindings = objectBindings;
            return this;
        }

        /**
         * <p>The associated variable ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>The object type, such as customer. This field has a value when type is set to mention.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>The digital employee name (operating object name, optional).</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task scope.</p>
         * 
         * <strong>example:</strong>
         * <p>PERSONAL</p>
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * <p>The user profile settings.</p>
         */
        public Builder settings(java.util.Map<String, ?> settings) {
            this.settings = settings;
            return this;
        }

        /**
         * <p>The skill output ID (carried when the output is saved as a resource).</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSkillOutputId</p>
         */
        public Builder skillOutputId(String skillOutputId) {
            this.skillOutputId = skillOutputId;
            return this;
        }

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceId</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The knowledge base (KB) ownership type. Valid values:</p>
         * <ul>
         * <li>aliding_kb_doc: DingTalk knowledge base document.</li>
         * <li>normal: common knowledge.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder sourceKind(String sourceKind) {
            this.sourceKind = sourceKind;
            return this;
        }

        /**
         * <p>The resource tags (optional, a JSON string list such as [&quot;tagA&quot;,&quot;tagB&quot;]).</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder sourceTags(String sourceTags) {
            this.sourceTags = sourceTags;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The final status of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The list of structured tables.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder structuredTables(java.util.List<String> structuredTables) {
            this.structuredTables = structuredTables;
            return this;
        }

        /**
         * <p>The unstructured documents.</p>
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
             * <p>The semantic graph name to which the object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder graphName(String graphName) {
                this.graphName = graphName;
                return this;
            }

            /**
             * <p>The ID of the recommended item, which can be a <strong>feedId</strong> or a micro-application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleObjectId</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>The object type, such as customer. This field has a value when type is set to mention.</p>
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
             * <p>The completion time, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-01T12:00:00Z</p>
             */
            public Builder completionTime(String completionTime) {
                this.completionTime = completionTime;
                return this;
            }

            /**
             * <p>The file name, including the file name extension.</p>
             * 
             * <strong>example:</strong>
             * <p>example.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The file record ID (optional, corresponding to settings.file_record_id).</p>
             * 
             * <strong>example:</strong>
             * <p>exampleFileRecordId</p>
             */
            public Builder fileRecordId(String fileRecordId) {
                this.fileRecordId = fileRecordId;
                return this;
            }

            /**
             * <p>The file type. Valid values:</p>
             * <ul>
             * <li><strong>file</strong>: file.</li>
             * <li><strong>folder</strong>: folder.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pdf</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The session analysis result in OSS URL format. The URL expires in one hour.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            /**
             * <p>The DocumentAgent semantic ID.</p>
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
