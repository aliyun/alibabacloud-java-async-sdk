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
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PqEnable")
    private Integer pqEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreateVectorIndexRequest(Builder builder) {
        super(builder);
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
        this.ownerId = builder.ownerId;
        this.pqEnable = builder.pqEnable;
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
        private Long ownerId; 
        private Integer pqEnable; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateVectorIndexRequest request) {
            super(request);
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
            this.ownerId = request.ownerId;
            this.pqEnable = request.pqEnable;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * <p>Collection name.</p>
         * <blockquote>
         * <p>You can use the <a href="https://help.aliyun.com/document_detail/2401503.html">ListCollections</a> API to view the list.</p>
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
         * <p>Instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> API to view details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.</p>
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
         * <p>Vector dimension.</p>
         * <blockquote>
         * <p>This value must be consistent with the length of the vector data (Rows. Vector) uploaded via the <a href="https://help.aliyun.com/document_detail/2401493.html">UpsertCollectionData</a> API.</p>
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
         * <p>Whether to use mmap to build the HNSW index, default is 0. If the data does not need to be deleted and there are performance requirements for uploading data, it is recommended to set this to 1.</p>
         * <blockquote>
         * <ul>
         * <li>When set to 0, the segment-page storage mode is used to build the index, which can use the shared_buffer in PostgreSQL for caching and supports deletion and update operations.</li>
         * <li>When set to 1, the index is built using mmap, which does not support deletion and update operations.</li>
         * </ul>
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
         * HnswEfConstruction.
         */
        public Builder hnswEfConstruction(Integer hnswEfConstruction) {
            this.putQueryParameter("HnswEfConstruction", hnswEfConstruction);
            this.hnswEfConstruction = hnswEfConstruction;
            return this;
        }

        /**
         * <p>The maximum number of neighbors in the HNSW algorithm, ranging from 1 to 1000. The API will automatically set this value based on the vector dimension, and it generally does not need to be manually set.</p>
         * <blockquote>
         * <p>It is suggested to set this based on the vector dimension as follows:</p>
         * <ul>
         * <li>Less than or equal to 384: 16</li>
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
         * <p>Name of the management account with rds_superuser permissions.</p>
         * <blockquote>
         * <p>You can create an account through the console -&gt; Account Management, or by using the <a href="https://help.aliyun.com/document_detail/2361789.html">CreateAccount</a> API.</p>
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
         * <p>Management account password.</p>
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
         * <p>Method used for building the vector index. Value description:</p>
         * <ul>
         * <li>l2: Euclidean distance.</li>
         * <li>ip: Inner product (dot product) distance.</li>
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
         * <p>Namespace, default is public.</p>
         * <blockquote>
         * <p>You can use the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> API to view the list.</p>
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
         * <p>Whether to enable PQ (Product Quantization) algorithm acceleration for the index. It is recommended to enable this when the data volume exceeds 500,000. Value description:</p>
         * <ul>
         * <li>0: Disabled.</li>
         * <li>1: Enabled (default).</li>
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
         * <p>Region ID where the instance is located.</p>
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
         * Type.
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
