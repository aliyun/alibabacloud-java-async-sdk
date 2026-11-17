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
 * {@link UpdateKnowledgeObjectRequest} extends {@link RequestModel}
 *
 * <p>UpdateKnowledgeObjectRequest</p>
 */
public class UpdateKnowledgeObjectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpectedModifyTime")
    private Long expectedModifyTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeObjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeObjectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UploadId")
    private String uploadId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionNo")
    private Long versionNo;

    private UpdateKnowledgeObjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.content = builder.content;
        this.description = builder.description;
        this.expectedModifyTime = builder.expectedModifyTime;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.knowledgeObjectId = builder.knowledgeObjectId;
        this.name = builder.name;
        this.uploadId = builder.uploadId;
        this.versionNo = builder.versionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKnowledgeObjectRequest create() {
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
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return expectedModifyTime
     */
    public Long getExpectedModifyTime() {
        return this.expectedModifyTime;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return knowledgeObjectId
     */
    public String getKnowledgeObjectId() {
        return this.knowledgeObjectId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * @return versionNo
     */
    public Long getVersionNo() {
        return this.versionNo;
    }

    public static final class Builder extends Request.Builder<UpdateKnowledgeObjectRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private Content content; 
        private String description; 
        private Long expectedModifyTime; 
        private String knowledgeBaseId; 
        private String knowledgeObjectId; 
        private String name; 
        private String uploadId; 
        private Long versionNo; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKnowledgeObjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.content = request.content;
            this.description = request.description;
            this.expectedModifyTime = request.expectedModifyTime;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.knowledgeObjectId = request.knowledgeObjectId;
            this.name = request.name;
            this.uploadId = request.uploadId;
            this.versionNo = request.versionNo;
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
         * <p>The client token. This parameter is supported only for DOCUMENT. Model updates do not guarantee exactly-once remote save notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>edit-document-text-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The typed content update. Object properties are submitted as needed. Arrays are replaced in their entirety when submitted. Unspecified properties are retained.</p>
         */
        public Builder content(Content content) {
            String contentShrink = shrink(content, "Content", "json");
            this.putBodyParameter("Content", contentShrink);
            this.content = content;
            return this;
        }

        /**
         * <p>The new description. An empty string clears the description. If this parameter is not specified, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>Actual paid amount</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The expected modification time. This parameter is supported only for DOCUMENT. It is required when modifying the body text and optional when modifying metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200800000</p>
         */
        public Builder expectedModifyTime(Long expectedModifyTime) {
            this.putBodyParameter("ExpectedModifyTime", expectedModifyTime);
            this.expectedModifyTime = expectedModifyTime;
            return this;
        }

        /**
         * <p>The ID of the knowledge base to which the object belongs.</p>
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
         * <p>The stable knowledge object ID returned by the Get or List operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>obj-model-001</p>
         */
        public Builder knowledgeObjectId(String knowledgeObjectId) {
            this.putBodyParameter("KnowledgeObjectId", knowledgeObjectId);
            this.knowledgeObjectId = knowledgeObjectId;
            return this;
        }

        /**
         * <p>The new name. This parameter cannot be empty. If this parameter is not specified, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The upload ID. This parameter is supported only for SEMANTIC_MODEL. It replaces the public model content with a complete YAML file and is mutually exclusive with Content.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abd</p>
         */
        public Builder uploadId(String uploadId) {
            this.putBodyParameter("UploadId", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        /**
         * <p>The version number. This parameter is required when updating Content or UploadId for SEMANTIC_MODEL. Use the VersionNo returned by the Get operation. This is not an optimistic lock.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder versionNo(Long versionNo) {
            this.putBodyParameter("VersionNo", versionNo);
            this.versionNo = versionNo;
            return this;
        }

        @Override
        public UpdateKnowledgeObjectRequest build() {
            return new UpdateKnowledgeObjectRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateKnowledgeObjectRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectRequest</p>
     */
    public static class Document extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentFormat")
        private String contentFormat;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Document(Builder builder) {
            this.contentFormat = builder.contentFormat;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Document create() {
            return builder().build();
        }

        /**
         * @return contentFormat
         */
        public String getContentFormat() {
            return this.contentFormat;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String contentFormat; 
            private String text; 

            private Builder() {
            } 

            private Builder(Document model) {
                this.contentFormat = model.contentFormat;
                this.text = model.text;
            } 

            /**
             * <p>The content format. This field is required when Text is provided. Initially, the supported values are MARKDOWN and TEXT.</p>
             * 
             * <strong>example:</strong>
             * <p>MARKDOWN</p>
             */
            public Builder contentFormat(String contentFormat) {
                this.contentFormat = contentFormat;
                return this;
            }

            /**
             * <p>The current document body that can be provided to the caller. This field is optional. It is omitted if parsing is incomplete, access is not authorized, or the full document cannot be provided securely. A single retrieved snippet does not stand in for the entire document.</p>
             * 
             * <strong>example:</strong>
             * <p>Updated full body text</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Document build() {
                return new Document(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateKnowledgeObjectRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectRequest</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Fields(Builder builder) {
            this.dataType = builder.dataType;
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String dataType; 
            private String description; 
            private String name; 

            private Builder() {
            } 

            private Builder(Fields model) {
                this.dataType = model.dataType;
                this.description = model.description;
                this.name = model.name;
            } 

            /**
             * <p>The data type of the field. This parameter is required for publicly available model fields and is not inferred by the server.</p>
             * 
             * <strong>example:</strong>
             * <p>DECIMAL</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The business description of the field. This parameter is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>Actual paid amount</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>pay_amount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateKnowledgeObjectRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectRequest</p>
     */
    public static class Datasets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("Fields")
        private java.util.List<Fields> fields;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PrimaryKey")
        private java.util.List<String> primaryKey;

        private Datasets(Builder builder) {
            this.description = builder.description;
            this.entityId = builder.entityId;
            this.fields = builder.fields;
            this.name = builder.name;
            this.primaryKey = builder.primaryKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datasets create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return fields
         */
        public java.util.List<Fields> getFields() {
            return this.fields;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return primaryKey
         */
        public java.util.List<String> getPrimaryKey() {
            return this.primaryKey;
        }

        public static final class Builder {
            private String description; 
            private String entityId; 
            private java.util.List<Fields> fields; 
            private String name; 
            private java.util.List<String> primaryKey; 

            private Builder() {
            } 

            private Builder(Datasets model) {
                this.description = model.description;
                this.entityId = model.entityId;
                this.fields = model.fields;
                this.name = model.name;
                this.primaryKey = model.primaryKey;
            } 

            /**
             * <p>The business description of the dataset. This parameter is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>Actual paid amount</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The DataWorks Data Map table entity ID. This field is returned when a reliable association exists. If the ID is omitted for an existing dataset of the same name, the existing ID is retained. Submitted values are processed according to the semantic layer rules for saving data.</p>
             * 
             * <strong>example:</strong>
             * <p>maxcompute-table:::project_name:schema_name:table_name</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The defined and publicly available fields of the dataset. This is an empty array if no field definitions are provided.</p>
             */
            public Builder fields(java.util.List<Fields> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * <p>The name of the dataset within the model, used for relationship positioning within the model.</p>
             * 
             * <strong>example:</strong>
             * <p>orders</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The explicitly declared primary key field name. This parameter is optional. Each item must exist in the Fields of this dataset.</p>
             */
            public Builder primaryKey(java.util.List<String> primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            public Datasets build() {
                return new Datasets(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateKnowledgeObjectRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectRequest</p>
     */
    public static class Dialects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dialect")
        private String dialect;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private String sql;

        private Dialects(Builder builder) {
            this.dialect = builder.dialect;
            this.sql = builder.sql;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dialects create() {
            return builder().build();
        }

        /**
         * @return dialect
         */
        public String getDialect() {
            return this.dialect;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        public static final class Builder {
            private String dialect; 
            private String sql; 

            private Builder() {
            } 

            private Builder(Dialects model) {
                this.dialect = model.dialect;
                this.sql = model.sql;
            } 

            /**
             * <p>The SQL dialect, such as MaxCompute or ANSI_SQL.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder dialect(String dialect) {
                this.dialect = dialect;
                return this;
            }

            /**
             * <p>The non-empty calculation expression in the specified dialect. This is not a complete query statement.</p>
             * 
             * <strong>example:</strong>
             * <p>SUM(pay_amount - refund_amount)</p>
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            public Dialects build() {
                return new Dialects(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateKnowledgeObjectRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectRequest</p>
     */
    public static class Expression extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dialects")
        private java.util.List<Dialects> dialects;

        private Expression(Builder builder) {
            this.dialects = builder.dialects;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Expression create() {
            return builder().build();
        }

        /**
         * @return dialects
         */
        public java.util.List<Dialects> getDialects() {
            return this.dialects;
        }

        public static final class Builder {
            private java.util.List<Dialects> dialects; 

            private Builder() {
            } 

            private Builder(Expression model) {
                this.dialects = model.dialects;
            } 

            /**
             * <p>The expressions for the same metric in different SQL dialects. At least one item is required. Dialects cannot be duplicated.</p>
             */
            public Builder dialects(java.util.List<Dialects> dialects) {
                this.dialects = dialects;
                return this;
            }

            public Expression build() {
                return new Expression(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateKnowledgeObjectRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectRequest</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private Expression expression;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private Metrics(Builder builder) {
            this.datasetName = builder.datasetName;
            this.description = builder.description;
            this.expression = builder.expression;
            this.name = builder.name;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expression
         */
        public Expression getExpression() {
            return this.expression;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String datasetName; 
            private String description; 
            private Expression expression; 
            private String name; 
            private String unit; 

            private Builder() {
            } 

            private Builder(Metrics model) {
                this.datasetName = model.datasetName;
                this.description = model.description;
                this.expression = model.expression;
                this.name = model.name;
                this.unit = model.unit;
            } 

            /**
             * <p>The name of the associated SemanticDataset. This must be locatable within the Datasets of this model.</p>
             * 
             * <strong>example:</strong>
             * <p>orders</p>
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * <p>The description of the metric calculation logic. This parameter is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>Actual paid amount minus refund amount</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The executable expression. This must include at least one dialect version and is not auto-generated by the model.</p>
             */
            public Builder expression(Expression expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Net sales</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The explicitly declared unit of the metric. This parameter is optional and is not returned if no reliable source is available.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateKnowledgeObjectRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectRequest</p>
     */
    public static class JoinKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromField")
        private String fromField;

        @com.aliyun.core.annotation.NameInMap("ToField")
        private String toField;

        private JoinKeys(Builder builder) {
            this.fromField = builder.fromField;
            this.toField = builder.toField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JoinKeys create() {
            return builder().build();
        }

        /**
         * @return fromField
         */
        public String getFromField() {
            return this.fromField;
        }

        /**
         * @return toField
         */
        public String getToField() {
            return this.toField;
        }

        public static final class Builder {
            private String fromField; 
            private String toField; 

            private Builder() {
            } 

            private Builder(JoinKeys model) {
                this.fromField = model.fromField;
                this.toField = model.toField;
            } 

            /**
             * <p>The field name in FromDataset.Fields.</p>
             * 
             * <strong>example:</strong>
             * <p>customer_id</p>
             */
            public Builder fromField(String fromField) {
                this.fromField = fromField;
                return this;
            }

            /**
             * <p>The field name in ToDataset.Fields.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder toField(String toField) {
                this.toField = toField;
                return this;
            }

            public JoinKeys build() {
                return new JoinKeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateKnowledgeObjectRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectRequest</p>
     */
    public static class Relationships extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromDataset")
        private String fromDataset;

        @com.aliyun.core.annotation.NameInMap("JoinKeys")
        private java.util.List<JoinKeys> joinKeys;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ToDataset")
        private String toDataset;

        private Relationships(Builder builder) {
            this.fromDataset = builder.fromDataset;
            this.joinKeys = builder.joinKeys;
            this.name = builder.name;
            this.toDataset = builder.toDataset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Relationships create() {
            return builder().build();
        }

        /**
         * @return fromDataset
         */
        public String getFromDataset() {
            return this.fromDataset;
        }

        /**
         * @return joinKeys
         */
        public java.util.List<JoinKeys> getJoinKeys() {
            return this.joinKeys;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return toDataset
         */
        public String getToDataset() {
            return this.toDataset;
        }

        public static final class Builder {
            private String fromDataset; 
            private java.util.List<JoinKeys> joinKeys; 
            private String name; 
            private String toDataset; 

            private Builder() {
            } 

            private Builder(Relationships model) {
                this.fromDataset = model.fromDataset;
                this.joinKeys = model.joinKeys;
                this.name = model.name;
                this.toDataset = model.toDataset;
            } 

            /**
             * <p>The name of the source SemanticDataset.</p>
             * 
             * <strong>example:</strong>
             * <p>orders</p>
             */
            public Builder fromDataset(String fromDataset) {
                this.fromDataset = fromDataset;
                return this;
            }

            /**
             * <p>The equi-join key pairs for the fields at both ends. At least one item is required. Composite joins are listed item by item.</p>
             */
            public Builder joinKeys(java.util.List<JoinKeys> joinKeys) {
                this.joinKeys = joinKeys;
                return this;
            }

            /**
             * <p>The name of the relationship within the model.</p>
             * 
             * <strong>example:</strong>
             * <p>orders</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the target SemanticDataset.</p>
             * 
             * <strong>example:</strong>
             * <p>customers</p>
             */
            public Builder toDataset(String toDataset) {
                this.toDataset = toDataset;
                return this;
            }

            public Relationships build() {
                return new Relationships(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateKnowledgeObjectRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectRequest</p>
     */
    public static class SemanticModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Datasets")
        private java.util.List<Datasets> datasets;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private java.util.List<Metrics> metrics;

        @com.aliyun.core.annotation.NameInMap("Relationships")
        private java.util.List<Relationships> relationships;

        private SemanticModel(Builder builder) {
            this.datasets = builder.datasets;
            this.metrics = builder.metrics;
            this.relationships = builder.relationships;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SemanticModel create() {
            return builder().build();
        }

        /**
         * @return datasets
         */
        public java.util.List<Datasets> getDatasets() {
            return this.datasets;
        }

        /**
         * @return metrics
         */
        public java.util.List<Metrics> getMetrics() {
            return this.metrics;
        }

        /**
         * @return relationships
         */
        public java.util.List<Relationships> getRelationships() {
            return this.relationships;
        }

        public static final class Builder {
            private java.util.List<Datasets> datasets; 
            private java.util.List<Metrics> metrics; 
            private java.util.List<Relationships> relationships; 

            private Builder() {
            } 

            private Builder(SemanticModel model) {
                this.datasets = model.datasets;
                this.metrics = model.metrics;
                this.relationships = model.relationships;
            } 

            /**
             * <p>The logical datasets contained in the model. This is an empty array if no public datasets are available.</p>
             */
            public Builder datasets(java.util.List<Datasets> datasets) {
                this.datasets = datasets;
                return this;
            }

            /**
             * <p>The executable metrics in the model. This is an empty array if no metrics are available. Metrics with only candidate formulas are not included.</p>
             */
            public Builder metrics(java.util.List<Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * <p>The defined relationships in the model expressed by field pairs. This is an empty array if no relationships are available. Relationships are not inferred from graph paths.</p>
             */
            public Builder relationships(java.util.List<Relationships> relationships) {
                this.relationships = relationships;
                return this;
            }

            public SemanticModel build() {
                return new SemanticModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateKnowledgeObjectRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectRequest</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Document")
        private Document document;

        @com.aliyun.core.annotation.NameInMap("SemanticModel")
        private SemanticModel semanticModel;

        private Content(Builder builder) {
            this.document = builder.document;
            this.semanticModel = builder.semanticModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return document
         */
        public Document getDocument() {
            return this.document;
        }

        /**
         * @return semanticModel
         */
        public SemanticModel getSemanticModel() {
            return this.semanticModel;
        }

        public static final class Builder {
            private Document document; 
            private SemanticModel semanticModel; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.document = model.document;
                this.semanticModel = model.semanticModel;
            } 

            /**
             * <p>The document content. This property exists only when Type is set to DOCUMENT.</p>
             */
            public Builder document(Document document) {
                this.document = document;
                return this;
            }

            /**
             * <p>The semantic model content. This property exists only when Type is set to SEMANTIC_MODEL.</p>
             */
            public Builder semanticModel(SemanticModel semanticModel) {
                this.semanticModel = semanticModel;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
