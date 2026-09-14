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
         * <p>The vector indexing algorithm.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>hnswflat</code>: (Default) An HNSW index that does not use quantization compression.</p>
         * </li>
         * <li><p><code>novam</code>: A graph-based index that does not use quantization compression. This algorithm is suitable for high-performance scenarios, such as real-time recommendations.</p>
         * </li>
         * <li><p><code>novad</code>: A partitioned index that uses rabitq quantization. This algorithm is suitable for large-scale, cost-effective retrieval scenarios.</p>
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
         * <p>The collection name.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401503.html">ListCollections</a> operation to list all collections.</p>
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
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to view the details of all AnalyticDB for PostgreSQL instances in a specific region, including the instance ID.</p>
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
         * <p>The vector dimension.</p>
         * <blockquote>
         * <ul>
         * <li><p>This parameter is required for dense vectors.</p>
         * </li>
         * <li><p>This value must match the length of the <code>Rows.Vector</code> data provided when calling the <a href="https://help.aliyun.com/document_detail/2401493.html">UpsertCollectionData</a> operation.</p>
         * </li>
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
         * <p>Specifies whether to use <code>mmap</code> to build the HNSW index. The default value is 0. Set this to 1 for high-performance data uploads in scenarios where data deletion is not required.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>0</code>: (Default) Builds the index by using segmented page storage. This mode uses the <code>shared_buffer</code> in PostgreSQL for caching and supports delete and update operations.</p>
         * </li>
         * <li><p><code>1</code>: Builds the index by using <code>mmap</code>. This mode does not support delete and update operations.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>The <code>ExternalStorage</code> parameter is supported only by AnalyticDB for PostgreSQL V6.0.</p>
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
         * <p>The size of the candidate set for the HNSW algorithm during index construction. The value must be in the range of 4 to 1,000. The default value is 64.</p>
         * <blockquote>
         * <p>This parameter applies only to AnalyticDB for PostgreSQL V7.0 instances, and its value must be greater than or equal to <code>2 * HnswM</code>.</p>
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
         * <p>The maximum number of neighbors for the Hierarchical Navigable Small World (HNSW) algorithm. The system automatically sets this value based on the vector dimension. You do not typically need to configure this parameter manually.</p>
         * <blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>For AnalyticDB for PostgreSQL V6.0 instances: 1 to 1,000.</p>
         * </li>
         * <li><p>For AnalyticDB for PostgreSQL V7.0 instances: 2 to 100. The default value is 16.</p>
         * </li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>We recommend the following values based on the vector dimension:</p>
         * <ul>
         * <li><p>For dimensions of 384 or less: 16</p>
         * </li>
         * <li><p>For dimensions from 385 to 768: 32</p>
         * </li>
         * <li><p>For dimensions from 769 to 1,024: 64</p>
         * </li>
         * <li><p>For dimensions greater than 1,024: 128</p>
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
         * <p>The name of the management account that has <code>rds_superuser</code> permissions.</p>
         * <blockquote>
         * <p>You can create an account on the \<em>\<em>account management\</em>\</em> page in the console or by calling the <a href="https://help.aliyun.com/document_detail/2361789.html">CreateAccount</a> operation.</p>
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
         * <li><p><code>l2</code>: euclidean distance</p>
         * </li>
         * <li><p><code>ip</code>: dot product (inner product)</p>
         * </li>
         * <li><p><code>cosine</code>: cosine similarity</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Sparse vectors support only <code>ip</code>.</p>
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
         * <p>The namespace. The default value is <code>public</code>.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to list all namespaces.</p>
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
         * <p>The number of lists (partitions) for the Novad algorithm. The value must be in the range of 2 to 1,073,741,824. The default value is 256.</p>
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
         * <p>Specifies whether to enable Product Quantization (PQ) to accelerate indexing. Recommended for collections with over 500,000 vectors. Valid values:</p>
         * <ul>
         * <li><p><code>0</code>: Disabled.</p>
         * </li>
         * <li><p><code>1</code>: Enabled. (Default)</p>
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
         * <p>The number of bits for rabitq compression. The valid range is 1 to 8. The default value is 3.</p>
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
         * <li><p><code>Dense</code>: (Default) a dense vector</p>
         * </li>
         * <li><p><code>Sparse</code>: a sparse vector</p>
         * </li>
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
