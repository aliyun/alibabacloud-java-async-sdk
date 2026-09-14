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
 * {@link CreateCollectionRequest} extends {@link RequestModel}
 *
 * <p>CreateCollectionRequest</p>
 */
public class CreateCollectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Collection")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimension")
    private Long dimension;

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
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer hnswM;

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
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("SparseVectorIndexConfig")
    private SparseVectorIndexConfig sparseVectorIndexConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportSparse")
    private Boolean supportSparse;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VectorIndexConfig")
    private VectorIndexConfig vectorIndexConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateCollectionRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.collection = builder.collection;
        this.DBInstanceId = builder.DBInstanceId;
        this.dimension = builder.dimension;
        this.externalStorage = builder.externalStorage;
        this.fullTextRetrievalFields = builder.fullTextRetrievalFields;
        this.hnswEfConstruction = builder.hnswEfConstruction;
        this.hnswM = builder.hnswM;
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
        this.sparseVectorIndexConfig = builder.sparseVectorIndexConfig;
        this.supportSparse = builder.supportSparse;
        this.vectorIndexConfig = builder.vectorIndexConfig;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCollectionRequest create() {
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
    public Long getDimension() {
        return this.dimension;
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

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateCollectionRequest, Builder> {
        private String algorithm; 
        private String collection; 
        private String DBInstanceId; 
        private Long dimension; 
        private Integer externalStorage; 
        private String fullTextRetrievalFields; 
        private String hnswEfConstruction; 
        private Integer hnswM; 
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
        private SparseVectorIndexConfig sparseVectorIndexConfig; 
        private Boolean supportSparse; 
        private VectorIndexConfig vectorIndexConfig; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCollectionRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.collection = request.collection;
            this.DBInstanceId = request.DBInstanceId;
            this.dimension = request.dimension;
            this.externalStorage = request.externalStorage;
            this.fullTextRetrievalFields = request.fullTextRetrievalFields;
            this.hnswEfConstruction = request.hnswEfConstruction;
            this.hnswM = request.hnswM;
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
            this.sparseVectorIndexConfig = request.sparseVectorIndexConfig;
            this.supportSparse = request.supportSparse;
            this.vectorIndexConfig = request.vectorIndexConfig;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The vector index algorithm.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>hnswflat</code>: (Default) An HNSW index without quantization compression.</p>
         * </li>
         * <li><p><code>novam</code>: A graph index without quantization compression. This algorithm is suitable for high-performance scenarios, such as real-time recommendations.</p>
         * </li>
         * <li><p><code>novad</code>: A partitioned index with <code>rabitq</code> quantization. This algorithm is suitable for large-scale, low-cost retrieval scenarios.</p>
         * </li>
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
         * <p>The name of the collection to create.</p>
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
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in a specific region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gp-bp152460513z****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The vector dimension.</p>
         * <blockquote>
         * <p>If you specify this parameter, a vector index is created. In subsequent calls to the <a href="https://help.aliyun.com/document_detail/2401493.html">UpsertCollectionData</a> operation, the length of <code>Rows.Vector</code> must match this dimension. If you do not specify this parameter, you must call the <a href="https://help.aliyun.com/document_detail/2401499.html">CreateVectorIndex</a> operation to create an index later.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder dimension(Long dimension) {
            this.putQueryParameter("Dimension", dimension);
            this.dimension = dimension;
            return this;
        }

        /**
         * <p>Specifies whether to use <code>mmap</code> to build the HNSW index. The default value is 0. We recommend setting this to 1 if your data does not require deletion and you need high-performance data ingestion.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>0</code>: (Default) Builds the index by using segmented page storage. This mode can use the <code>shared_buffer</code> in PostgreSQL for caching and supports <code>DELETE</code> and <code>UPDATE</code> operations.</p>
         * </li>
         * <li><p><code>1</code>: Builds the index by using <code>mmap</code>. This mode does not support <code>DELETE</code> or <code>UPDATE</code> operations.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>The <code>ExternalStorage</code> parameter is available only for AnalyticDB for PostgreSQL v6.0 instances and is not supported in v7.0.</p>
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
         * <p>The fields to use for full-text search. Use commas (<code>,</code>) to separate multiple field names. These fields must be keys defined in the <code>Metadata</code> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>title,content</p>
         */
        public Builder fullTextRetrievalFields(String fullTextRetrievalFields) {
            this.putQueryParameter("FullTextRetrievalFields", fullTextRetrievalFields);
            this.fullTextRetrievalFields = fullTextRetrievalFields;
            return this;
        }

        /**
         * <p>The size of the candidate set for HNSW index construction. The value must be greater than or equal to <code>2 * HnswM</code>.</p>
         * <blockquote>
         * <p>Value range:</p>
         * <ul>
         * <li><p>For AnalyticDB for PostgreSQL V6.0 instances: 40 to 4000.</p>
         * </li>
         * <li><p>For AnalyticDB for PostgreSQL V7.0 instances: 4 to 1000. The default value is 64.</p>
         * </li>
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
         * <p>The maximum number of neighbors for the HNSW algorithm. You do not typically need to set this parameter, as the system automatically determines a value based on the vector dimension.</p>
         * <blockquote>
         * <p>Value range:</p>
         * <ul>
         * <li><p>For AnalyticDB for PostgreSQL V6.0 instances: 1 to 1000.</p>
         * </li>
         * <li><p>For AnalyticDB for PostgreSQL V7.0 instances: 2 to 100. The default value is 16.</p>
         * </li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>We recommend that you set this parameter based on the vector dimension:</p>
         * <ul>
         * <li><p>16 for dimensions less than or equal to 384.</p>
         * </li>
         * <li><p>32 for dimensions greater than 384 and less than or equal to 768.</p>
         * </li>
         * <li><p>64 for dimensions greater than 768 and less than or equal to 1024.</p>
         * </li>
         * <li><p>128 for dimensions greater than 1024.</p>
         * </li>
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
         * <p>The name of the management account that has the <code>rds_superuser</code> privilege.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2361789.html">CreateAccount</a> operation to create an account.</p>
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
         * <p>A JSON string that defines the metadata schema as a map. The keys are field names, and the values are their corresponding data types.</p>
         * <blockquote>
         * <p>Supported data types</p>
         * <ul>
         * <li><p>For a list of supported data types, see <a href="https://help.aliyun.com/document_detail/424383.html">Data types</a>.</p>
         * </li>
         * <li><p>The <code>money</code> data type is not supported.</p>
         * </li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>Warning: </p>
         * </blockquote>
         * <p>The field names <code>id</code>, <code>vector</code>, <code>to_tsvector</code>, and <code>source</code> are reserved and cannot be used.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;title&quot;:&quot;text&quot;,&quot;content&quot;:&quot;text&quot;,&quot;response&quot;:&quot;int&quot;}</p>
         */
        public Builder metadata(String metadata) {
            this.putQueryParameter("Metadata", metadata);
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The scalar index fields. Separate multiple fields with commas (<code>,</code>). The fields must be keys that are defined in <code>Metadata</code>.</p>
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
         * <p>The distance metric used to build the vector index. Valid values:</p>
         * <ul>
         * <li><p><code>l2</code>: Euclidean distance.</p>
         * </li>
         * <li><p><code>ip</code>: dot product.</p>
         * </li>
         * <li><p><code>cosine</code>: cosine similarity.</p>
         * </li>
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
         * <p>The namespace.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation to create a namespace or the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to list existing namespaces.</p>
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
         * <p>The parser for full-text search. The default is <code>zh_cn</code>.</p>
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
         * <p>Specifies whether to enable Product Quantization (PQ) for index acceleration. This is recommended for datasets with more than 500,000 entries. Valid values:</p>
         * <ul>
         * <li><p><code>0</code>: Disabled.</p>
         * </li>
         * <li><p><code>1</code>: (Default) Enabled.</p>
         * </li>
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
         * <p>The ID of the region where the instance is located.</p>
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
         * <p>The configuration for the sparse vector index. If specified, a sparse vector index is created.</p>
         */
        public Builder sparseVectorIndexConfig(SparseVectorIndexConfig sparseVectorIndexConfig) {
            String sparseVectorIndexConfigShrink = shrink(sparseVectorIndexConfig, "SparseVectorIndexConfig", "json");
            this.putQueryParameter("SparseVectorIndexConfig", sparseVectorIndexConfigShrink);
            this.sparseVectorIndexConfig = sparseVectorIndexConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable support for sparse vectors. The default value is <code>false</code>.</p>
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
         * <p>The configuration for the dense vector index.</p>
         */
        public Builder vectorIndexConfig(VectorIndexConfig vectorIndexConfig) {
            String vectorIndexConfigShrink = shrink(vectorIndexConfig, "VectorIndexConfig", "json");
            this.putQueryParameter("VectorIndexConfig", vectorIndexConfigShrink);
            this.vectorIndexConfig = vectorIndexConfig;
            return this;
        }

        /**
         * <p>The ID of the workspace, which contains multiple database instances. You must specify either <code>WorkspaceId</code> or <code>DBInstanceId</code>. If both are specified, <code>WorkspaceId</code> takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-ws-*****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateCollectionRequest build() {
            return new CreateCollectionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCollectionRequest} extends {@link TeaModel}
     *
     * <p>CreateCollectionRequest</p>
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
             * <li><p><code>hnswflat</code>: (Default) An HNSW index without quantization compression.</p>
             * </li>
             * <li><p><code>novam</code>: A graph index without quantization compression. This algorithm is suitable for high-performance scenarios, such as real-time recommendations.</p>
             * </li>
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
             * <p>The size of the candidate set for HNSW index construction. The value must be an integer from 4 to 1,000. The default is 64.</p>
             * <blockquote>
             * <p>This parameter is required only for AnalyticDB for PostgreSQL V7.0 instances, and its value must be greater than or equal to <code>2 * HnswM</code>.</p>
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
             * <p>The maximum number of neighbors for the HNSW algorithm. You do not typically need to set this parameter, as the system automatically determines a value based on the vector dimension.</p>
             * <blockquote>
             * <p>Value range:</p>
             * <ul>
             * <li><p>For AnalyticDB for PostgreSQL V6.0 instances: 1 to 1000.</p>
             * </li>
             * <li><p>For AnalyticDB for PostgreSQL V7.0 instances: 2 to 100. The default value is 16.</p>
             * </li>
             * </ul>
             * </blockquote>
             * <blockquote>
             * <p>We recommend that you set this parameter based on the vector dimension:</p>
             * <ul>
             * <li><p>16 for dimensions less than or equal to 384.</p>
             * </li>
             * <li><p>32 for dimensions greater than 384 and less than or equal to 768.</p>
             * </li>
             * <li><p>64 for dimensions greater than 768 and less than or equal to 1024.</p>
             * </li>
             * <li><p>128 for dimensions greater than 1024.</p>
             * </li>
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
     * {@link CreateCollectionRequest} extends {@link TeaModel}
     *
     * <p>CreateCollectionRequest</p>
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
             * <p>The number of lists (partitions) for a <code>novad</code> index. The value must be an integer from 2 to 1,073,741,824. The default is 256.</p>
             * 
             * <strong>example:</strong>
             * <p>256</p>
             */
            public Builder nlist(Integer nlist) {
                this.nlist = nlist;
                return this;
            }

            /**
             * <p>The number of bits for <code>rabitq</code> compression. The value must be an integer from 1 to 8. The default is 3.</p>
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
