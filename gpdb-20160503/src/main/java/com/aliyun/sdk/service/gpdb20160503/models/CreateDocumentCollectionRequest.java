// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link CreateDocumentCollectionRequest} extends {@link RequestModel}
 *
 * <p>CreateDocumentCollectionRequest</p>
 */
public class CreateDocumentCollectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Collection")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimension")
    private Integer dimension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmbeddingModel")
    private String embeddingModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableGraph")
    private Boolean enableGraph;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityTypes")
    private java.util.List<String> entityTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalStorage")
    private Integer externalStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FullTextRetrievalFields")
    private String fullTextRetrievalFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HnswEfConstruction")
    private String hnswEfConstruction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HnswM")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer hnswM;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LLMModel")
    private String LLMModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagerAccount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String managerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagerAccountPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String managerAccountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Metadata")
    private String metadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetadataIndices")
    private String metadataIndices;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private String metrics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parser")
    private String parser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PqEnable")
    private Integer pqEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelationshipTypes")
    private java.util.List<String> relationshipTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SparseRetrievalFields")
    private String sparseRetrievalFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SparseVectorIndexConfig")
    private SparseVectorIndexConfig sparseVectorIndexConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportSparse")
    private Boolean supportSparse;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VectorIndexConfig")
    private VectorIndexConfig vectorIndexConfig;

    private CreateDocumentCollectionRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.collection = builder.collection;
        this.DBInstanceId = builder.DBInstanceId;
        this.dimension = builder.dimension;
        this.embeddingModel = builder.embeddingModel;
        this.enableGraph = builder.enableGraph;
        this.entityTypes = builder.entityTypes;
        this.externalStorage = builder.externalStorage;
        this.fullTextRetrievalFields = builder.fullTextRetrievalFields;
        this.hnswEfConstruction = builder.hnswEfConstruction;
        this.hnswM = builder.hnswM;
        this.LLMModel = builder.LLMModel;
        this.language = builder.language;
        this.managerAccount = builder.managerAccount;
        this.managerAccountPassword = builder.managerAccountPassword;
        this.metadata = builder.metadata;
        this.metadataIndices = builder.metadataIndices;
        this.metrics = builder.metrics;
        this.namespace = builder.namespace;
        this.ownerId = builder.ownerId;
        this.parser = builder.parser;
        this.pqEnable = builder.pqEnable;
        this.regionId = builder.regionId;
        this.relationshipTypes = builder.relationshipTypes;
        this.sparseRetrievalFields = builder.sparseRetrievalFields;
        this.sparseVectorIndexConfig = builder.sparseVectorIndexConfig;
        this.supportSparse = builder.supportSparse;
        this.vectorIndexConfig = builder.vectorIndexConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDocumentCollectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return collection
     */
    public String getCollection() {
        return this.collection;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return dimension
     */
    public Integer getDimension() {
        return this.dimension;
    }

    /**
     * @return embeddingModel
     */
    public String getEmbeddingModel() {
        return this.embeddingModel;
    }

    /**
     * @return enableGraph
     */
    public Boolean getEnableGraph() {
        return this.enableGraph;
    }

    /**
     * @return entityTypes
     */
    public java.util.List<String> getEntityTypes() {
        return this.entityTypes;
    }

    /**
     * @return externalStorage
     */
    public Integer getExternalStorage() {
        return this.externalStorage;
    }

    /**
     * @return fullTextRetrievalFields
     */
    public String getFullTextRetrievalFields() {
        return this.fullTextRetrievalFields;
    }

    /**
     * @return hnswEfConstruction
     */
    public String getHnswEfConstruction() {
        return this.hnswEfConstruction;
    }

    /**
     * @return hnswM
     */
    public Integer getHnswM() {
        return this.hnswM;
    }

    /**
     * @return LLMModel
     */
    public String getLLMModel() {
        return this.LLMModel;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return managerAccount
     */
    public String getManagerAccount() {
        return this.managerAccount;
    }

    /**
     * @return managerAccountPassword
     */
    public String getManagerAccountPassword() {
        return this.managerAccountPassword;
    }

    /**
     * @return metadata
     */
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * @return metadataIndices
     */
    public String getMetadataIndices() {
        return this.metadataIndices;
    }

    /**
     * @return metrics
     */
    public String getMetrics() {
        return this.metrics;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return parser
     */
    public String getParser() {
        return this.parser;
    }

    /**
     * @return pqEnable
     */
    public Integer getPqEnable() {
        return this.pqEnable;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return relationshipTypes
     */
    public java.util.List<String> getRelationshipTypes() {
        return this.relationshipTypes;
    }

    /**
     * @return sparseRetrievalFields
     */
    public String getSparseRetrievalFields() {
        return this.sparseRetrievalFields;
    }

    /**
     * @return sparseVectorIndexConfig
     */
    public SparseVectorIndexConfig getSparseVectorIndexConfig() {
        return this.sparseVectorIndexConfig;
    }

    /**
     * @return supportSparse
     */
    public Boolean getSupportSparse() {
        return this.supportSparse;
    }

    /**
     * @return vectorIndexConfig
     */
    public VectorIndexConfig getVectorIndexConfig() {
        return this.vectorIndexConfig;
    }

    public static final class Builder extends Request.Builder<CreateDocumentCollectionRequest, Builder> {
        private String algorithm; 
        private String collection; 
        private String DBInstanceId; 
        private Integer dimension; 
        private String embeddingModel; 
        private Boolean enableGraph; 
        private java.util.List<String> entityTypes; 
        private Integer externalStorage; 
        private String fullTextRetrievalFields; 
        private String hnswEfConstruction; 
        private Integer hnswM; 
        private String LLMModel; 
        private String language; 
        private String managerAccount; 
        private String managerAccountPassword; 
        private String metadata; 
        private String metadataIndices; 
        private String metrics; 
        private String namespace; 
        private Long ownerId; 
        private String parser; 
        private Integer pqEnable; 
        private String regionId; 
        private java.util.List<String> relationshipTypes; 
        private String sparseRetrievalFields; 
        private SparseVectorIndexConfig sparseVectorIndexConfig; 
        private Boolean supportSparse; 
        private VectorIndexConfig vectorIndexConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateDocumentCollectionRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.collection = request.collection;
            this.DBInstanceId = request.DBInstanceId;
            this.dimension = request.dimension;
            this.embeddingModel = request.embeddingModel;
            this.enableGraph = request.enableGraph;
            this.entityTypes = request.entityTypes;
            this.externalStorage = request.externalStorage;
            this.fullTextRetrievalFields = request.fullTextRetrievalFields;
            this.hnswEfConstruction = request.hnswEfConstruction;
            this.hnswM = request.hnswM;
            this.LLMModel = request.LLMModel;
            this.language = request.language;
            this.managerAccount = request.managerAccount;
            this.managerAccountPassword = request.managerAccountPassword;
            this.metadata = request.metadata;
            this.metadataIndices = request.metadataIndices;
            this.metrics = request.metrics;
            this.namespace = request.namespace;
            this.ownerId = request.ownerId;
            this.parser = request.parser;
            this.pqEnable = request.pqEnable;
            this.regionId = request.regionId;
            this.relationshipTypes = request.relationshipTypes;
            this.sparseRetrievalFields = request.sparseRetrievalFields;
            this.sparseVectorIndexConfig = request.sparseVectorIndexConfig;
            this.supportSparse = request.supportSparse;
            this.vectorIndexConfig = request.vectorIndexConfig;
        } 

        /**
         * <p>The vector index algorithm.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>hnswflat: HNSW index without quantization compression (default).</li>
         * <li>novam: graph index without quantization compression, suitable for high-performance scenarios such as real-time recommendations.</li>
         * <li>novad: partitioned index with RaBitQ quantization, suitable for large-scale low-cost retrieval scenarios.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hnswflat</p>
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * <p>The name of the knowledge base to create.</p>
         * <blockquote>
         * <p>The name must comply with PostgreSQL object naming conventions.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>document</p>
         */
        public Builder collection(String collection) {
            this.putQueryParameter("Collection", collection);
            this.collection = collection;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a region, including instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The vector dimensions. The default value is the dimension supported by the embedding model.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder dimension(Integer dimension) {
            this.putQueryParameter("Dimension", dimension);
            this.dimension = dimension;
            return this;
        }

        /**
         * <p>The embedding model. Default value: text-embedding-v3.</p>
         * <blockquote>
         * <p>Supported models:</p>
         * <ul>
         * <li>text-embedding-v3 (recommended, default): 1024, 768, or 512 dimensions</li>
         * <li>multimodal-embedding-v1 (recommended): 1024 dimensions, multimodal embedding model</li>
         * <li>text-embedding-v1: 1536 dimensions</li>
         * <li>text-embedding-v2: 1536 dimensions</li>
         * <li>text2vec (not recommended): 1024 dimensions</li>
         * <li>m3e-base (not recommended): 768 dimensions</li>
         * <li>m3e-small (not recommended): 512 dimensions</li>
         * <li>clip-vit-b-32 (not recommended): CLIP ViT-B/32 model, 512 dimensions, image embedding model</li>
         * <li>clip-vit-b-16 (not recommended): CLIP ViT-B/16 model, 512 dimensions, image embedding model</li>
         * <li>clip-vit-l-14 (not recommended): CLIP ViT-L/14 model, 768 dimensions, image embedding model</li>
         * <li>clip-vit-l-14-336px (not recommended): CLIP ViT-L/14@336px model, 768 dimensions, image embedding model</li>
         * <li>clip-rn50 (not recommended): CLIP RN50 model, 1024 dimensions, image embedding model</li>
         * <li>clip-rn101 (not recommended): CLIP RN101 model, 512 dimensions, image embedding model</li>
         * <li>clip-rn50x4 (not recommended): CLIP RN50x4 model, 640 dimensions, image embedding model</li>
         * <li>clip-rn50x16 (not recommended): CLIP RN50x16 model, 768 dimensions, image embedding model</li>
         * <li>clip-rn50x64 (not recommended): CLIP RN50x64 model, 1024 dimensions, image embedding model</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v1</p>
         */
        public Builder embeddingModel(String embeddingModel) {
            this.putQueryParameter("EmbeddingModel", embeddingModel);
            this.embeddingModel = embeddingModel;
            return this;
        }

        /**
         * <p>Specifies whether to enable knowledge graph construction. Default value: false.</p>
         * <blockquote>
         * <p>Before using this parameter, upgrade the instance to a version that supports the graph engine. (During the public preview, submit a ticket to upgrade the version.)</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableGraph(Boolean enableGraph) {
            this.putQueryParameter("EnableGraph", enableGraph);
            this.enableGraph = enableGraph;
            return this;
        }

        /**
         * <p>The list of entity types.</p>
         * <blockquote>
         * <p>This parameter is required when knowledge graph construction is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Location</p>
         */
        public Builder entityTypes(java.util.List<String> entityTypes) {
            String entityTypesShrink = shrink(entityTypes, "EntityTypes", "json");
            this.putQueryParameter("EntityTypes", entityTypesShrink);
            this.entityTypes = entityTypes;
            return this;
        }

        /**
         * <p>Specifies whether to use mmap to build the HNSW index. Default value: 0. If data does not need to be deleted and you require high upload performance, set this parameter to 1.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: uses segment-page storage to build the index. This mode uses shared_buffer in PostgreSQL as cache and supports delete and update operations.</li>
         * <li>1: uses mmap to build the index. This mode does not support delete or update operations.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: Only version 6.0 supports the ExternalStorage parameter. Version 7.0 does not support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder externalStorage(Integer externalStorage) {
            this.putQueryParameter("ExternalStorage", externalStorage);
            this.externalStorage = externalStorage;
            return this;
        }

        /**
         * <p>The fields used for full-text retrieval. Separate multiple fields with commas (,). The fields must be keys defined in Metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>title,page</p>
         */
        public Builder fullTextRetrievalFields(String fullTextRetrievalFields) {
            this.putQueryParameter("FullTextRetrievalFields", fullTextRetrievalFields);
            this.fullTextRetrievalFields = fullTextRetrievalFields;
            return this;
        }

        /**
         * <p>The candidate set size when building an index with the HNSW algorithm. The value must be &gt;= 2*HNSW_M.</p>
         * <blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>AnalyticDB for PostgreSQL 6.0 instances: 40 to 4000.</li>
         * <li>AnalyticDB for PostgreSQL 7.0 instances: 4 to 1000. Default value: 64.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder hnswEfConstruction(String hnswEfConstruction) {
            this.putQueryParameter("HnswEfConstruction", hnswEfConstruction);
            this.hnswEfConstruction = hnswEfConstruction;
            return this;
        }

        /**
         * <p>The maximum number of neighbors in the HNSW algorithm. This value is automatically set based on the vector dimensions. Manual configuration is generally not required.</p>
         * <blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>AnalyticDB for PostgreSQL 6.0 instances: 1 to 1000.</li>
         * <li>AnalyticDB for PostgreSQL 7.0 instances: 2 to 100. Default value: 16.</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>Recommended values based on vector dimensions:</p>
         * <ul>
         * <li>384 or fewer: 16</li>
         * <li>Greater than 384 and up to 768: 32</li>
         * <li>Greater than 768 and up to 1024: 64</li>
         * <li>Greater than 1024: 128</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        public Builder hnswM(Integer hnswM) {
            this.putQueryParameter("HnswM", hnswM);
            this.hnswM = hnswM;
            return this;
        }

        /**
         * <p>The LLM model name. Valid values:</p>
         * <ul>
         * <li>knowledge-extract-standard: default value.</li>
         * <li>knowledge-extract-mini<blockquote>
         * <p>This parameter takes effect only when knowledge graph construction is enabled.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>knowledge-extract-standard</p>
         */
        public Builder LLMModel(String LLMModel) {
            this.putQueryParameter("LLMModel", LLMModel);
            this.LLMModel = LLMModel;
            return this;
        }

        /**
         * <p>The language used for knowledge graph construction. Valid values:</p>
         * <ul>
         * <li>Simplified Chinese: Simplified Chinese. Default value.</li>
         * <li>English: English.<blockquote>
         * <p>This parameter takes effect only when knowledge graph construction is enabled.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Simplified Chinese</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The name of the management account that has the rds_superuser permission.</p>
         * <blockquote>
         * <p>You can create an account in the console by navigating to Account Management, or by calling the <a href="https://help.aliyun.com/document_detail/2361789.html">CreateAccount</a> operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testaccount</p>
         */
        public Builder managerAccount(String managerAccount) {
            this.putQueryParameter("ManagerAccount", managerAccount);
            this.managerAccount = managerAccount;
            return this;
        }

        /**
         * <p>The password of the management account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testpassword</p>
         */
        public Builder managerAccountPassword(String managerAccountPassword) {
            this.putQueryParameter("ManagerAccountPassword", managerAccountPassword);
            this.managerAccountPassword = managerAccountPassword;
            return this;
        }

        /**
         * <p>The metadata of vector data, in the format of a JSON string representing a MAP. The key represents the field name, and the value represents the data type.</p>
         * <blockquote>
         * <p>Supported data types:</p>
         * <ul>
         * <li>For the list of data types, see <a href="https://help.aliyun.com/document_detail/424383.html">Data types</a>.</li>
         * <li>The money type is not supported.</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>Warning: The following fields are reserved and cannot be used: id, vector, doc_name, content, loader_metadata, source, and to_tsvector.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;title&quot;:&quot;text&quot;,&quot;page&quot;:&quot;int&quot;}</p>
         */
        public Builder metadata(String metadata) {
            this.putQueryParameter("Metadata", metadata);
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The scalar index fields. Separate multiple fields with commas (,). The fields must be keys defined in Metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        public Builder metadataIndices(String metadataIndices) {
            this.putQueryParameter("MetadataIndices", metadataIndices);
            this.metadataIndices = metadataIndices;
            return this;
        }

        /**
         * <p>The distance metric used for building vector indexes.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>l2</strong>: Euclidean distance.</li>
         * <li><strong>ip</strong>: inner product distance.</li>
         * <li><strong>cosine</strong> (default): cosine similarity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cosine</p>
         */
        public Builder metrics(String metrics) {
            this.putQueryParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * <p>The namespace. Default value: public.</p>
         * <blockquote>
         * <p>You can create a namespace by calling the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation and query the list of namespaces by calling the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mynamespace</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The tokenizer used for full-text retrieval. Default value: zh_cn.</p>
         * 
         * <strong>example:</strong>
         * <p>zh_cn</p>
         */
        public Builder parser(String parser) {
            this.putQueryParameter("Parser", parser);
            this.parser = parser;
            return this;
        }

        /**
         * <p>Specifies whether to enable Product Quantization (PQ) algorithm acceleration for the index. We recommend enabling this feature when the data volume exceeds 500,000. Valid values:</p>
         * <ul>
         * <li>0: disabled.</li>
         * <li>1: enabled (default).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pqEnable(Integer pqEnable) {
            this.putQueryParameter("PqEnable", pqEnable);
            this.pqEnable = pqEnable;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of relationship edge types.</p>
         * <blockquote>
         * <p>This parameter is required when knowledge graph construction is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Occurred</p>
         */
        public Builder relationshipTypes(java.util.List<String> relationshipTypes) {
            String relationshipTypesShrink = shrink(relationshipTypes, "RelationshipTypes", "json");
            this.putQueryParameter("RelationshipTypes", relationshipTypesShrink);
            this.relationshipTypes = relationshipTypes;
            return this;
        }

        /**
         * <p>The metadata fields used for building sparse vectors. Separate multiple fields with commas (,). The fields must be keys defined in Metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>title,abstract</p>
         */
        public Builder sparseRetrievalFields(String sparseRetrievalFields) {
            this.putQueryParameter("SparseRetrievalFields", sparseRetrievalFields);
            this.sparseRetrievalFields = sparseRetrievalFields;
            return this;
        }

        /**
         * <p>The sparse vector index configuration. If specified, a sparse vector index is created.</p>
         */
        public Builder sparseVectorIndexConfig(SparseVectorIndexConfig sparseVectorIndexConfig) {
            String sparseVectorIndexConfigShrink = shrink(sparseVectorIndexConfig, "SparseVectorIndexConfig", "json");
            this.putQueryParameter("SparseVectorIndexConfig", sparseVectorIndexConfigShrink);
            this.sparseVectorIndexConfig = sparseVectorIndexConfig;
            return this;
        }

        /**
         * <p>Specifies whether to support sparse vectors. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder supportSparse(Boolean supportSparse) {
            this.putQueryParameter("SupportSparse", supportSparse);
            this.supportSparse = supportSparse;
            return this;
        }

        /**
         * <p>The dense vector index configuration.</p>
         */
        public Builder vectorIndexConfig(VectorIndexConfig vectorIndexConfig) {
            String vectorIndexConfigShrink = shrink(vectorIndexConfig, "VectorIndexConfig", "json");
            this.putQueryParameter("VectorIndexConfig", vectorIndexConfigShrink);
            this.vectorIndexConfig = vectorIndexConfig;
            return this;
        }

        @Override
        public CreateDocumentCollectionRequest build() {
            return new CreateDocumentCollectionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDocumentCollectionRequest} extends {@link TeaModel}
     *
     * <p>CreateDocumentCollectionRequest</p>
     */
    public static class SparseVectorIndexConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("HnswEfConstruction")
        private Integer hnswEfConstruction;

        @com.aliyun.core.annotation.NameInMap("HnswM")
        private Integer hnswM;

        private SparseVectorIndexConfig(Builder builder) {
            this.algorithm = builder.algorithm;
            this.hnswEfConstruction = builder.hnswEfConstruction;
            this.hnswM = builder.hnswM;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SparseVectorIndexConfig create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return hnswEfConstruction
         */
        public Integer getHnswEfConstruction() {
            return this.hnswEfConstruction;
        }

        /**
         * @return hnswM
         */
        public Integer getHnswM() {
            return this.hnswM;
        }

        public static final class Builder {
            private String algorithm; 
            private Integer hnswEfConstruction; 
            private Integer hnswM; 

            private Builder() {
            } 

            private Builder(SparseVectorIndexConfig model) {
                this.algorithm = model.algorithm;
                this.hnswEfConstruction = model.hnswEfConstruction;
                this.hnswM = model.hnswM;
            } 

            /**
             * <p>The vector index algorithm.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>hnswflat: HNSW index without quantization compression (default).</li>
             * <li>novam: graph index without quantization compression, suitable for high-performance scenarios such as real-time recommendations.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>hnswflat</p>
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>The candidate set size when building an index with the HNSW algorithm. Valid values: 4 to 1000. Default value: 64.</p>
             * <blockquote>
             * <p>This parameter is required only for AnalyticDB for PostgreSQL 7.0 instances, and the value must be &gt;= 2*HNSW_M.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder hnswEfConstruction(Integer hnswEfConstruction) {
                this.hnswEfConstruction = hnswEfConstruction;
                return this;
            }

            /**
             * <p>The maximum number of neighbors in the HNSW algorithm. This value is automatically set based on the vector dimensions. Manual configuration is generally not required.</p>
             * <blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li>AnalyticDB for PostgreSQL 6.0 instances: 1 to 1000.</li>
             * <li>AnalyticDB for PostgreSQL 7.0 instances: 2 to 100. Default value: 16.</li>
             * </ul>
             * </blockquote>
             * <blockquote>
             * <p>Recommended values based on vector dimensions:</p>
             * <ul>
             * <li>384 or fewer: 16</li>
             * <li>Greater than 384 and up to 768: 32</li>
             * <li>Greater than 768 and up to 1024: 64</li>
             * <li>Greater than 1024: 128</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>64</p>
             */
            public Builder hnswM(Integer hnswM) {
                this.hnswM = hnswM;
                return this;
            }

            public SparseVectorIndexConfig build() {
                return new SparseVectorIndexConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDocumentCollectionRequest} extends {@link TeaModel}
     *
     * <p>CreateDocumentCollectionRequest</p>
     */
    public static class VectorIndexConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nlist")
        private Integer nlist;

        @com.aliyun.core.annotation.NameInMap("RabitqBits")
        private Integer rabitqBits;

        private VectorIndexConfig(Builder builder) {
            this.nlist = builder.nlist;
            this.rabitqBits = builder.rabitqBits;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VectorIndexConfig create() {
            return builder().build();
        }

        /**
         * @return nlist
         */
        public Integer getNlist() {
            return this.nlist;
        }

        /**
         * @return rabitqBits
         */
        public Integer getRabitqBits() {
            return this.rabitqBits;
        }

        public static final class Builder {
            private Integer nlist; 
            private Integer rabitqBits; 

            private Builder() {
            } 

            private Builder(VectorIndexConfig model) {
                this.nlist = model.nlist;
                this.rabitqBits = model.rabitqBits;
            } 

            /**
             * <p>The Novad list count (number of partitions). Valid values: 2 to 1073741824. Default value: 256.</p>
             * 
             * <strong>example:</strong>
             * <p>256</p>
             */
            public Builder nlist(Integer nlist) {
                this.nlist = nlist;
                return this;
            }

            /**
             * <p>The number of RaBitQ compression bits. Valid values: 1 to 8. Default value: 3.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder rabitqBits(Integer rabitqBits) {
                this.rabitqBits = rabitqBits;
                return this;
            }

            public VectorIndexConfig build() {
                return new VectorIndexConfig(this);
            } 

        } 

    }
}
