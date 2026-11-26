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
         * <li>hnswflat: HNSW index without quantization compression (default).</li>
         * <li>novam: Graph index without quantization compression, suitable for high-performance scenarios such as real-time recommendation.</li>
         * <li>novad: Partitioned index with rabitq quantization, suitable for large-scale, low-cost retrieval scenarios.</li>
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
         * <p>The name of the collection to be created.</p>
         * <blockquote>
         * <p>The name must comply with the PostgreSQL object naming conventions.</p>
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
         * <p>Instance ID of the instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query instance IDs of all AnalyticDB for PostgreSQL instances in the target region.</p>
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
         * <p>The vector dimensions.</p>
         * <blockquote>
         * <p>If you specify this value, an index is built, and the length of Rows.Vector in the subsequent <a href="https://help.aliyun.com/document_detail/2401493.html">UpsertCollectionData</a> operation for uploading vector data must be consistent with this value. If you do not specify this value, you can call the <a href="https://help.aliyun.com/document_detail/2401499.html">CreateVectorIndex</a> operation later to build an index.</p>
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
         * <p>Specifies whether to use mmap to build the HNSW index. Default value: 0. If the data does not need to be deleted and you have high requirements for the data upload speed, set this parameter to 1.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: Build the index by using segment-page storage. This is the default value. In this mode, shared_buffers in PostgreSQL can be used for caching, and operations such as deletion and update are supported.</li>
         * <li>1: Build the index by using mmap. This mode does not support operations such as deletion and update.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: The ExternalStorage parameter is supported only in V6.0. It is not supported in V7.0.</notice></p>
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
         * <p>The fields used to retrieve data via full-text index. Separate multiple fields with commas (,). The fields must be keys defined in Metadata.</p>
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
         * <p>The size of the candidate set when building the index by using the HNSW algorithm. The value must be greater than or equal to 2 × HNSW_M.</p>
         * <blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>AnalyticDB for PostgreSQL V6.0 instances: 40 to 4000.</li>
         * <li>AnalyticDB for PostgreSQL V7.0 instances: 4 to 1000. Default value: 64.</li>
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
         * <p>The maximum number of neighbors in the HNSW algorithm. The operation automatically sets this value based on the vector dimensions. Typically, you do not need to manually set this value.</p>
         * <blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>AnalyticDB for PostgreSQL V6.0 instances: 1 to 1000.</li>
         * <li>AnalyticDB for PostgreSQL V7.0 instances: 2 to 100. Default value: 16.</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>Recommended settings based on vector dimensions:</p>
         * <ul>
         * <li>Less than or equal to 384: 16.</li>
         * <li>Greater than 384 and less than or equal to 768: 32.</li>
         * <li>Greater than 768 and less than or equal to 1024: 64.</li>
         * <li>Greater than 1024: 128.</li>
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
         * <p>The name of the administrator account that has the rds_superuser permission.</p>
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
         * <p>The password of the administrator account.</p>
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
         * <p>The metadata of the vector data, which is a JSON string in MAP format. The key represents the field name, and the value represents the data type.</p>
         * <blockquote>
         * <p>Supported data types:</p>
         * <ul>
         * <li>For the list of data types, see <a href="https://help.aliyun.com/document_detail/424383.html">Data types</a>.</li>
         * <li>The money data type is not supported.</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>Warning: The id, vector, to_tsvector, and source fields are reserved fields and cannot be used.</warning></p>
         * </blockquote>
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
         * <p>The distance metric used to build the vector index. Valid values:</p>
         * <ul>
         * <li>l2: Euclidean distance.</li>
         * <li>ip: Inner product.</li>
         * <li>cosine: Cosine similarity.</li>
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
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation to create a namespace, and call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to view the namespace list.</p>
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
         * <p>The tokenizer used to retrieve data via full-text index. Default value: zh_cn.</p>
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
         * <p>Specifies whether to enable the Product Quantization (PQ) algorithm to accelerate the index. Enable this feature when the data volume exceeds 500,000. Valid values:</p>
         * <ul>
         * <li>0: Disable.</li>
         * <li>1: Enable (default).</li>
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
         * <p>The sparse vector index configuration. If this parameter is passed, a sparse vector index is created.</p>
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

        /**
         * <p>The ID of the workspace that consists of multiple database instances. This parameter and the DBInstanceId parameter cannot be empty at the same time. If both parameters are specified, this parameter takes precedence.</p>
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
             * <li>hnswflat: HNSW index without quantization compression (default).</li>
             * <li>novam: Graph index without quantization compression, suitable for high-performance scenarios such as real-time recommendation.</li>
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
             * <p>The size of the candidate set when building the index by using the HNSW algorithm. Valid values: 4 to 1000. Default value: 64.</p>
             * <blockquote>
             * <p>This value is required only for AnalyticDB for PostgreSQL V7.0 instances, and the value must be greater than or equal to 2 × HNSW_M.</p>
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
             * <p>The maximum number of neighbors in the HNSW algorithm. The operation automatically sets this value based on the vector dimensions. Typically, you do not need to manually set this value.</p>
             * <blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li>AnalyticDB for PostgreSQL V6.0 instances: 1 to 1000.</li>
             * <li>AnalyticDB for PostgreSQL V7.0 instances: 2 to 100. Default value: 16.</li>
             * </ul>
             * </blockquote>
             * <blockquote>
             * <p>Recommended settings based on vector dimensions:</p>
             * <ul>
             * <li>Less than or equal to 384: 16.</li>
             * <li>Greater than 384 and less than or equal to 768: 32.</li>
             * <li>Greater than 768 and less than or equal to 1024: 64.</li>
             * <li>Greater than 1024: 128.</li>
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
             * <p>The number of Novad lists (partitions). Valid values: [2, 1073741824]. Default value: 256.</p>
             * 
             * <strong>example:</strong>
             * <p>256</p>
             */
            public Builder nlist(Integer nlist) {
                this.nlist = nlist;
                return this;
            }

            /**
             * <p>The number of rabitq compression bits. Valid values: [1, 8]. Default value: 3.</p>
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
