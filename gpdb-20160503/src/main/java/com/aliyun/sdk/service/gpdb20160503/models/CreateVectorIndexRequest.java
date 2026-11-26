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
 * {@link CreateVectorIndexRequest} extends {@link RequestModel}
 *
 * <p>CreateVectorIndexRequest</p>
 */
public class CreateVectorIndexRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ExternalStorage")
    private Integer externalStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HnswEfConstruction")
    private Integer hnswEfConstruction;

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
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private String metrics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nlist")
    private Integer nlist;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PqEnable")
    private Integer pqEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RabitqBits")
    private Integer rabitqBits;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreateVectorIndexRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.collection = builder.collection;
        this.DBInstanceId = builder.DBInstanceId;
        this.dimension = builder.dimension;
        this.externalStorage = builder.externalStorage;
        this.hnswEfConstruction = builder.hnswEfConstruction;
        this.hnswM = builder.hnswM;
        this.managerAccount = builder.managerAccount;
        this.managerAccountPassword = builder.managerAccountPassword;
        this.metrics = builder.metrics;
        this.namespace = builder.namespace;
        this.nlist = builder.nlist;
        this.ownerId = builder.ownerId;
        this.pqEnable = builder.pqEnable;
        this.rabitqBits = builder.rabitqBits;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVectorIndexRequest create() {
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
     * @return externalStorage
     */
    public Integer getExternalStorage() {
        return this.externalStorage;
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
     * @return nlist
     */
    public Integer getNlist() {
        return this.nlist;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pqEnable
     */
    public Integer getPqEnable() {
        return this.pqEnable;
    }

    /**
     * @return rabitqBits
     */
    public Integer getRabitqBits() {
        return this.rabitqBits;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateVectorIndexRequest, Builder> {
        private String algorithm; 
        private String collection; 
        private String DBInstanceId; 
        private Integer dimension; 
        private Integer externalStorage; 
        private Integer hnswEfConstruction; 
        private Integer hnswM; 
        private String managerAccount; 
        private String managerAccountPassword; 
        private String metrics; 
        private String namespace; 
        private Integer nlist; 
        private Long ownerId; 
        private Integer pqEnable; 
        private Integer rabitqBits; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateVectorIndexRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.collection = request.collection;
            this.DBInstanceId = request.DBInstanceId;
            this.dimension = request.dimension;
            this.externalStorage = request.externalStorage;
            this.hnswEfConstruction = request.hnswEfConstruction;
            this.hnswM = request.hnswM;
            this.managerAccount = request.managerAccount;
            this.managerAccountPassword = request.managerAccountPassword;
            this.metrics = request.metrics;
            this.namespace = request.namespace;
            this.nlist = request.nlist;
            this.ownerId = request.ownerId;
            this.pqEnable = request.pqEnable;
            this.rabitqBits = request.rabitqBits;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * <p>The vector index algorithm. Valid values:</p>
         * <ul>
         * <li>hnswflat: HNSW index without quantization compression (default).</li>
         * <li>novam: graph index without quantization compression, suitable for high-performance scenarios such as real-time recommendation.</li>
         * <li>novad: partitioned index with RaBitQ quantization, suitable for large-scale, low-cost retrieval scenarios.</li>
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
         * <p>The collection name.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401503.html">ListCollections</a> operation to query the list.</p>
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
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including the instance IDs.</p>
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
         * <p>The vector dimensions.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required for dense vectors.</li>
         * <li>The value must be the same as the length of the vector data Rows.Vector in the <a href="https://help.aliyun.com/document_detail/2401493.html">UpsertCollectionData</a> operation.</li>
         * </ul>
         * </blockquote>
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
         * <p>Specifies whether to use mmap to build the HNSW index. Default value: 0. If data does not need to be deleted and you have high requirements for data upload speed, we recommend that you set this parameter to 1.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: uses the default segment-page storage to build the index. In this mode, shared_buffer in PostgreSQL can be used for caching, and operations such as deletion and update are supported.</li>
         * <li>1: uses mmap to build the index. This mode does not support operations such as deletion and update.</li>
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
         * <p>The size of the candidate set when the HNSW algorithm builds the index. Valid values: 4 to 1000. Default value: 64.</p>
         * <blockquote>
         * <p>This parameter is required only for AnalyticDB for PostgreSQL V7.0 instances, and the value must be greater than or equal to 2 × HNSW_M.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder hnswEfConstruction(Integer hnswEfConstruction) {
            this.putQueryParameter("HnswEfConstruction", hnswEfConstruction);
            this.hnswEfConstruction = hnswEfConstruction;
            return this;
        }

        /**
         * <p>The maximum number of neighbors in the HNSW algorithm. The operation automatically sets this value based on the vector dimensions. You do not need to manually set this value in most cases.</p>
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
         * <li>384 or less: 16</li>
         * <li>Greater than 384 and less than or equal to 768: 32</li>
         * <li>Greater than 768 and less than or equal to 1024: 64</li>
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
         * <p>The name of the management account that has the rds_superuser permission.</p>
         * <blockquote>
         * <p>You can create an account in the console by navigating to Account Management, or call the <a href="https://help.aliyun.com/document_detail/2361789.html">CreateAccount</a> operation.</p>
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
         * <p>The distance metric used to build the vector index. Valid values:</p>
         * <ul>
         * <li>l2: Euclidean distance.</li>
         * <li>ip: inner product.</li>
         * <li>cosine: cosine similarity.</li>
         * </ul>
         * <blockquote>
         * <p>Only ip is supported for sparse vectors.</p>
         * </blockquote>
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
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to query the list.</p>
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
         * <p>The number of lists (partitions) for Novad. Valid values: 2 to 1073741824. Default value: 256.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        public Builder nlist(Integer nlist) {
            this.putQueryParameter("Nlist", nlist);
            this.nlist = nlist;
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
         * <p>Specifies whether to enable product quantization (PQ) algorithm acceleration for the index. We recommend that you enable this feature when the data volume exceeds 500,000. Valid values:</p>
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
         * <p>The number of bits for RaBitQ compression. Valid values: 1 to 8. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder rabitqBits(Integer rabitqBits) {
            this.putQueryParameter("RabitqBits", rabitqBits);
            this.rabitqBits = rabitqBits;
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
         * <p>The vector type. Valid values:</p>
         * <ul>
         * <li>Dense: dense vector (default).</li>
         * <li>Sparse: sparse vector.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Dense</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateVectorIndexRequest build() {
            return new CreateVectorIndexRequest(this);
        } 

    } 

}
