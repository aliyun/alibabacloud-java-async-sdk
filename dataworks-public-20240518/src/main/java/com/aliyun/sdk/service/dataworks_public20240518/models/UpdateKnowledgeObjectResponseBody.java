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
 * {@link UpdateKnowledgeObjectResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateKnowledgeObjectResponseBody</p>
 */
public class UpdateKnowledgeObjectResponseBody extends TeaModel {
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

    private UpdateKnowledgeObjectResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKnowledgeObjectResponseBody create() {
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

        private Builder(UpdateKnowledgeObjectResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business error code. You can use this code to determine the error type when the request fails.</p>
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
         * <p>The error message returned when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The request parameters are invalid</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request. You can use this ID to troubleshoot issues.</p>
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

        public UpdateKnowledgeObjectResponseBody build() {
            return new UpdateKnowledgeObjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateKnowledgeObjectResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectResponseBody</p>
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
     * {@link UpdateKnowledgeObjectResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectResponseBody</p>
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
     * {@link UpdateKnowledgeObjectResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectResponseBody</p>
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
     * {@link UpdateKnowledgeObjectResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectResponseBody</p>
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
     * {@link UpdateKnowledgeObjectResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectResponseBody</p>
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
     * {@link UpdateKnowledgeObjectResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectResponseBody</p>
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
     * {@link UpdateKnowledgeObjectResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectResponseBody</p>
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
     * {@link UpdateKnowledgeObjectResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectResponseBody</p>
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
     * {@link UpdateKnowledgeObjectResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectResponseBody</p>
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
             * <p>The logical datasets included in the model. An empty array is returned if no public datasets are available.</p>
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
     * {@link UpdateKnowledgeObjectResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectResponseBody</p>
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
    /**
     * 
     * {@link UpdateKnowledgeObjectResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectResponseBody</p>
     */
    public static class DownloadFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        private DownloadFiles(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownloadFiles create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private String downloadUrl; 
            private String fileName; 

            private Builder() {
            } 

            private Builder(DownloadFiles model) {
                this.downloadUrl = model.downloadUrl;
                this.fileName = model.fileName;
            } 

            /**
             * <p>The temporary download URL for the single-file YAML specification. This field is optional.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.invalid/short-lived-result-download">https://example.invalid/short-lived-result-download</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The original file name of the uploaded document. This field is read-only. Renaming the object does not change this value. This field is not returned for external documents and semantic models.</p>
             * 
             * <strong>example:</strong>
             * <p>policy.md</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public DownloadFiles build() {
                return new DownloadFiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateKnowledgeObjectResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectResponseBody</p>
     */
    public static class SourceReferences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SourceReferences(Builder builder) {
            this.sourceId = builder.sourceId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceReferences create() {
            return builder().build();
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String sourceId; 
            private String type; 

            private Builder() {
            } 

            private Builder(SourceReferences model) {
                this.sourceId = model.sourceId;
                this.type = model.type;
            } 

            /**
             * <p>The source ID of the registered KnowledgeSource in the current knowledge base. This field exists only when the type is KNOWLEDGE_SOURCE.</p>
             * 
             * <strong>example:</strong>
             * <p>src-001</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The category of the source reference. The structure retains KNOWLEDGE_SOURCE. The SourceReferences array is currently empty.</p>
             * 
             * <strong>example:</strong>
             * <p>SEMANTIC_MODEL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SourceReferences build() {
                return new SourceReferences(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateKnowledgeObjectResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeObjectResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private Content content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DownloadFiles")
        private java.util.List<DownloadFiles> downloadFiles;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("Editable")
        private Boolean editable;

        @com.aliyun.core.annotation.NameInMap("ExpiresIn")
        private Integer expiresIn;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("KnowledgeObjectId")
        private String knowledgeObjectId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SizeBytes")
        private Long sizeBytes;

        @com.aliyun.core.annotation.NameInMap("SourceReferences")
        private java.util.List<SourceReferences> sourceReferences;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VersionNo")
        private Long versionNo;

        private Data(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.downloadFiles = builder.downloadFiles;
            this.downloadUrl = builder.downloadUrl;
            this.editable = builder.editable;
            this.expiresIn = builder.expiresIn;
            this.fileName = builder.fileName;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.knowledgeObjectId = builder.knowledgeObjectId;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.sizeBytes = builder.sizeBytes;
            this.sourceReferences = builder.sourceReferences;
            this.type = builder.type;
            this.versionNo = builder.versionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public Content getContent() {
            return this.content;
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
         * @return downloadFiles
         */
        public java.util.List<DownloadFiles> getDownloadFiles() {
            return this.downloadFiles;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return editable
         */
        public Boolean getEditable() {
            return this.editable;
        }

        /**
         * @return expiresIn
         */
        public Integer getExpiresIn() {
            return this.expiresIn;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
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
         * @return sizeBytes
         */
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        /**
         * @return sourceReferences
         */
        public java.util.List<SourceReferences> getSourceReferences() {
            return this.sourceReferences;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return versionNo
         */
        public Long getVersionNo() {
            return this.versionNo;
        }

        public static final class Builder {
            private Content content; 
            private Long createTime; 
            private String description; 
            private java.util.List<DownloadFiles> downloadFiles; 
            private String downloadUrl; 
            private Boolean editable; 
            private Integer expiresIn; 
            private String fileName; 
            private String knowledgeBaseId; 
            private String knowledgeObjectId; 
            private Long modifyTime; 
            private String name; 
            private Long sizeBytes; 
            private java.util.List<SourceReferences> sourceReferences; 
            private String type; 
            private Long versionNo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.createTime = model.createTime;
                this.description = model.description;
                this.downloadFiles = model.downloadFiles;
                this.downloadUrl = model.downloadUrl;
                this.editable = model.editable;
                this.expiresIn = model.expiresIn;
                this.fileName = model.fileName;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.knowledgeObjectId = model.knowledgeObjectId;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.sizeBytes = model.sizeBytes;
                this.sourceReferences = model.sourceReferences;
                this.type = model.type;
                this.versionNo = model.versionNo;
            } 

            /**
             * <p>The current valid typed knowledge content. The document or semantic model structure is returned based on the type.</p>
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The time when the object was first created.</p>
             * 
             * <strong>example:</strong>
             * <p>1790200800000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the knowledge object. This field is editable. Pass an empty string to clear the description.</p>
             * 
             * <strong>example:</strong>
             * <p>Actual paid amount</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The complete specification shards for multi-file models. Each item includes FileName and DownloadUrl. This field is optional.</p>
             */
            public Builder downloadFiles(java.util.List<DownloadFiles> downloadFiles) {
                this.downloadFiles = downloadFiles;
                return this;
            }

            /**
             * <p>The temporary download URL for the single-file YAML specification. This field is optional.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.invalid/short-lived-result-download">https://example.invalid/short-lived-result-download</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>Indicates whether the current caller has full content editing permissions. The value is true for OWNER and ADMIN and false for VIEWER. Authorization is checked again for write operations.</p>
             */
            public Builder editable(Boolean editable) {
                this.editable = editable;
                return this;
            }

            /**
             * <p>The validity period of the download URL, in seconds. This field is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder expiresIn(Integer expiresIn) {
                this.expiresIn = expiresIn;
                return this;
            }

            /**
             * <p>The original file name of the uploaded document. This field is read-only. Renaming the object does not change this value. This field is not returned for external documents and semantic models.</p>
             * 
             * <strong>example:</strong>
             * <p>policy.md</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
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
             * <p>The ID of the knowledge object. For semantic models, use the model ID from the semantic layer. For documents, use the stable ID from the local document table. Callers must treat the ID as opaque and must not use a retrieval ID in its place.</p>
             * 
             * <strong>example:</strong>
             * <p>obj-model-001</p>
             */
            public Builder knowledgeObjectId(String knowledgeObjectId) {
                this.knowledgeObjectId = knowledgeObjectId;
                return this;
            }

            /**
             * <p>The time when the object was last modified, in milliseconds. This value is used for conditional updates of DOCUMENT content. This field does not indicate that optimistic locking updates are supported for semantic models.</p>
             * 
             * <strong>example:</strong>
             * <p>1791789000000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The user-facing name of the knowledge object. This field is editable. Renaming the object does not change the KnowledgeObjectId.</p>
             * 
             * <strong>example:</strong>
             * <p>orders</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The size of the original uploaded file in bytes. This field is read-only and does not represent the length of the edited content.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder sizeBytes(Long sizeBytes) {
                this.sizeBytes = sizeBytes;
                return this;
            }

            /**
             * <p>The array of source references. An empty array is currently returned.</p>
             */
            public Builder sourceReferences(java.util.List<SourceReferences> sourceReferences) {
                this.sourceReferences = sourceReferences;
                return this;
            }

            /**
             * <p>The knowledge object type. The current values are SEMANTIC_MODEL and DOCUMENT. More types may be added in the future.</p>
             * 
             * <strong>example:</strong>
             * <p>SEMANTIC_MODEL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version of the model that is saved and read in the current operation.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder versionNo(Long versionNo) {
                this.versionNo = versionNo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
