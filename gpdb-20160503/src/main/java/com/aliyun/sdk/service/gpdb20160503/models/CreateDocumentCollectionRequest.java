// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDocumentCollectionRequest} extends {@link RequestModel}
 *
 * <p>CreateDocumentCollectionRequest</p>
 */
public class CreateDocumentCollectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Collection")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmbeddingModel")
    private String embeddingModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalStorage")
    private Integer externalStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FullTextRetrievalFields")
    private String fullTextRetrievalFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HnswM")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
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
    private String metadata;

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

    private CreateDocumentCollectionRequest(Builder builder) {
        super(builder);
        this.collection = builder.collection;
        this.DBInstanceId = builder.DBInstanceId;
        this.embeddingModel = builder.embeddingModel;
        this.externalStorage = builder.externalStorage;
        this.fullTextRetrievalFields = builder.fullTextRetrievalFields;
        this.hnswM = builder.hnswM;
        this.managerAccount = builder.managerAccount;
        this.managerAccountPassword = builder.managerAccountPassword;
        this.metadata = builder.metadata;
        this.metrics = builder.metrics;
        this.namespace = builder.namespace;
        this.ownerId = builder.ownerId;
        this.parser = builder.parser;
        this.pqEnable = builder.pqEnable;
        this.regionId = builder.regionId;
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
     * @return embeddingModel
     */
    public String getEmbeddingModel() {
        return this.embeddingModel;
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

    public static final class Builder extends Request.Builder<CreateDocumentCollectionRequest, Builder> {
        private String collection; 
        private String DBInstanceId; 
        private String embeddingModel; 
        private Integer externalStorage; 
        private String fullTextRetrievalFields; 
        private Integer hnswM; 
        private String managerAccount; 
        private String managerAccountPassword; 
        private String metadata; 
        private String metrics; 
        private String namespace; 
        private Long ownerId; 
        private String parser; 
        private Integer pqEnable; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDocumentCollectionRequest request) {
            super(request);
            this.collection = request.collection;
            this.DBInstanceId = request.DBInstanceId;
            this.embeddingModel = request.embeddingModel;
            this.externalStorage = request.externalStorage;
            this.fullTextRetrievalFields = request.fullTextRetrievalFields;
            this.hnswM = request.hnswM;
            this.managerAccount = request.managerAccount;
            this.managerAccountPassword = request.managerAccountPassword;
            this.metadata = request.metadata;
            this.metrics = request.metrics;
            this.namespace = request.namespace;
            this.ownerId = request.ownerId;
            this.parser = request.parser;
            this.pqEnable = request.pqEnable;
            this.regionId = request.regionId;
        } 

        /**
         * Collection.
         */
        public Builder collection(String collection) {
            this.putQueryParameter("Collection", collection);
            this.collection = collection;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The vectorization algorithm.
         * <p>
         * 
         * >  Valid values:
         * 
         * *   text-embedding-v1: the algorithm that produces 1536-dimensional vectors.
         * 
         * *   text-embedding-v2: the algorithm that produces 1536-dimensional vectors.
         * 
         * *   text2vec: the algorithm that produces 1024-dimensional vectors.
         * 
         * *   m3e-base: the algorithm that produces 768-dimensional vectors.
         * 
         * *   m3e-small: the algorithm that produces 512-dimensional vectors.
         * 
         * *   multimodal-embedding-one-peace-v1: the image vectorization algorithm that produces 1536-dimensional vectors.
         * 
         * *   clip-vit-b-32: the image vectorization algorithm that uses the Contrastive Language-Image Pre-Training (CLIP) ViT-B/32 model and produces 512-dimensional vectors.
         * 
         * *   clip-vit-b-16: the image vectorization algorithm that uses the CLIP ViT-B/16 model and produces 512-dimensional vectors.
         * 
         * *   clip-vit-l-14: the image vectorization algorithm that uses the CLIP ViT-L/14 model and produces 768-dimensional vectors.
         * 
         * *   clip-vit-l-14-336px: the image vectorization algorithm that uses the CLIP ViT-L/14@336px model and produces 768-dimensional vectors.
         * 
         * *   clip-rn50: the image vectorization algorithm that uses the CLIP RN50 model and produces 1024-dimensional vectors.
         * 
         * *   clip-rn101: the image vectorization algorithm that uses the CLIP RN101 model and produces 512-dimensional vectors.
         * 
         * *   clip-rn50x4: the image vectorization algorithm that uses the CLIP RN50x4 model and produces 640-dimensional vectors.
         * 
         * *   clip-rn50x16: the image vectorization algorithm that uses the CLIP RN50x16 model and produces 768-dimensional vectors.
         * 
         * *   clip-rn50x64: the image vectorization algorithm that uses the CLIP RN50x64 model and produces 1024-dimensional vectors.
         */
        public Builder embeddingModel(String embeddingModel) {
            this.putQueryParameter("EmbeddingModel", embeddingModel);
            this.embeddingModel = embeddingModel;
            return this;
        }

        /**
         * Specifies whether to use the memory mapping technology to create HNSW indexes. Valid values: 0 and 1. Default value: 0. We recommend that you set the value to 1 in scenarios that require upload speed but not data deletion.
         * <p>
         * 
         * > 
         * 
         * *   0: uses segmented paging storage to create indexes. This method uses the shared buffer of PostgreSQL for caching and supports the delete and update operations.
         * 
         * *   1: uses the memory mapping technology to create indexes. This method does not support the delete or update operation.
         */
        public Builder externalStorage(Integer externalStorage) {
            this.putQueryParameter("ExternalStorage", externalStorage);
            this.externalStorage = externalStorage;
            return this;
        }

        /**
         * FullTextRetrievalFields.
         */
        public Builder fullTextRetrievalFields(String fullTextRetrievalFields) {
            this.putQueryParameter("FullTextRetrievalFields", fullTextRetrievalFields);
            this.fullTextRetrievalFields = fullTextRetrievalFields;
            return this;
        }

        /**
         * The maximum number of neighbors for the Hierarchical Navigable Small World (HNSW) algorithm. Valid values: 1 to 1000. In most cases, this parameter is automatically configured based on the value of the Dimension parameter. You do not need to configure this parameter.
         * <p>
         * 
         * >  We recommend that you configure this parameter based on the value of the Dimension parameter.
         * 
         * *   If you set Dimension to a value less than or equal to 384, set the value of HnswM to 16.
         * 
         * *   If you set Dimension to a value greater than 384 and less than or equal to 768, set the value of HnswM to 32.
         * 
         * *   If you set Dimension to a value greater than 768 and less than or equal to 1024, set the value of HnswM to 64.
         * 
         * *   If you set Dimension to a value greater than 1024, set the value of HnswM to 128.
         */
        public Builder hnswM(Integer hnswM) {
            this.putQueryParameter("HnswM", hnswM);
            this.hnswM = hnswM;
            return this;
        }

        /**
         * ManagerAccount.
         */
        public Builder managerAccount(String managerAccount) {
            this.putQueryParameter("ManagerAccount", managerAccount);
            this.managerAccount = managerAccount;
            return this;
        }

        /**
         * ManagerAccountPassword.
         */
        public Builder managerAccountPassword(String managerAccountPassword) {
            this.putQueryParameter("ManagerAccountPassword", managerAccountPassword);
            this.managerAccountPassword = managerAccountPassword;
            return this;
        }

        /**
         * The metadata of the vector data, which is a JSON string in the MAP format. The key specifies the field name, and the value specifies the data type.
         * <p>
         * 
         * > 
         * 
         * *   For information about the supported data types, see [Data types](https://help.aliyun.com/zh/analyticdb-for-postgresql/developer-reference/data-types-1/?spm=a2c4g.11186623.0.0.43e567a1C35QRD).
         * 
         * *   The money data type is not supported.
         * 
         * **
         * 
         * **Warning**
         * Reserved fields such as id, vector, doc_name, content, loader_metadata, source, and to_tsvector cannot be used.
         */
        public Builder metadata(String metadata) {
            this.putQueryParameter("Metadata", metadata);
            this.metadata = metadata;
            return this;
        }

        /**
         * Metrics.
         */
        public Builder metrics(String metrics) {
            this.putQueryParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * Namespace.
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
         * Parser.
         */
        public Builder parser(String parser) {
            this.putQueryParameter("Parser", parser);
            this.parser = parser;
            return this;
        }

        /**
         * Specifies whether to enable the product quantization (PQ) feature for index acceleration. We recommend that you enable this feature for more than 500,000 rows of data. Valid values:
         * <p>
         * 
         * *   0: no.
         * *   1 (default): yes.
         */
        public Builder pqEnable(Integer pqEnable) {
            this.putQueryParameter("PqEnable", pqEnable);
            this.pqEnable = pqEnable;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateDocumentCollectionRequest build() {
            return new CreateDocumentCollectionRequest(this);
        } 

    } 

}
