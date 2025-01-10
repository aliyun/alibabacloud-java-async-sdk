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
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateCollectionRequest(Builder builder) {
        super(builder);
        this.collection = builder.collection;
        this.DBInstanceId = builder.DBInstanceId;
        this.dimension = builder.dimension;
        this.externalStorage = builder.externalStorage;
        this.fullTextRetrievalFields = builder.fullTextRetrievalFields;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateCollectionRequest, Builder> {
        private String collection; 
        private String DBInstanceId; 
        private Long dimension; 
        private Integer externalStorage; 
        private String fullTextRetrievalFields; 
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
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCollectionRequest request) {
            super(request);
            this.collection = request.collection;
            this.DBInstanceId = request.DBInstanceId;
            this.dimension = request.dimension;
            this.externalStorage = request.externalStorage;
            this.fullTextRetrievalFields = request.fullTextRetrievalFields;
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
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The name of the collection that you want to create.</p>
         * <blockquote>
         * <p> The name must comply with the naming conventions of PostgreSQL objects.</p>
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
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in a specific region.</p>
         * </blockquote>
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
         * <p>The number of vector dimensions.</p>
         * <blockquote>
         * <p> If you specify this parameter, an index is created. When you call the <a href="https://help.aliyun.com/document_detail/2401493.html">UpsertCollectionData</a> operation, make sure that the length of the Rows.Vector parameter is the same as the value of this parameter. If you do not specify this parameter, you can call the <a href="https://help.aliyun.com/document_detail/2401499.html">CreateVectorIndex</a> operation to create an index.</p>
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
         * <p>Specifies whether to use the memory mapping technology to create HNSW indexes. Valid values: 0 and 1. Default value: 0. We recommend that you set the value to 1 in scenarios that require upload speed but not data deletion.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>0: uses segmented paging storage to create indexes. This method uses the shared buffer of PostgreSQL for caching and supports the delete and update operations.</p>
         * </li>
         * <li><p>1: uses the memory mapping technology to create indexes. This method does not support the delete or update operation.</p>
         * </li>
         * </ul>
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
         * <p>The fields used for full-text search. Separate multiple fields with commas (,). These fields must be keys defined in Metadata.</p>
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
         * <p>The maximum number of neighbors for the Hierarchical Navigable Small World (HNSW) algorithm. Valid values: 1 to 1000. In most cases, this parameter is automatically configured based on the value of the Dimension parameter. You do not need to configure this parameter.</p>
         * <blockquote>
         * <p> We recommend that you configure this parameter based on the value of the Dimension parameter.</p>
         * </blockquote>
         * <p>*If you set Dimension to a value less than or equal to 384, set the value of HnswM to 16.</p>
         * <p>*If you set Dimension to a value greater than 384 and less than or equal to 768, set the value of HnswM to 32.</p>
         * <p>*If you set Dimension to a value greater than 768 and less than or equal to 1024, set the value of HnswM to 64.</p>
         * <p>*If you set Dimension to a value greater than 1024, set the value of HnswM to 128.</p>
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
         * <p>The password of the manager account.</p>
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
         * <p>The metadata of the vector data, which is a JSON string in the MAP format. The key specifies the field name, and the value specifies the data type.</p>
         * <blockquote>
         * <p> Supported data types:</p>
         * </blockquote>
         * <ul>
         * <li><p>For information about the supported data types, see <a href="https://www.alibabacloud.com/help/zh/analyticdb/analyticdb-for-postgresql/developer-reference/data-types-1/">Data types</a>.</p>
         * </li>
         * <li><p>The money data type is not supported.</p>
         * </li>
         * </ul>
         * <p>**</p>
         * <p><strong>Warning</strong> Reserved fields such as id, vector, to_tsvector, and source cannot be used.</p>
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
         * <p>The scalar index fields. Separate multiple fields with commas (,). These fields must be keys defined in Metadata.</p>
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
         * <p>The method that is used to create vector indexes. Valid values:</p>
         * <ul>
         * <li>l2: Euclidean distance.</li>
         * <li>ip: inner product distance.</li>
         * <li>cosine: cosine similarity.</li>
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
         * <p>The name of the namespace.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation to create a namespace and call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to query a list of namespaces.</p>
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
         * <p>The analyzer that is used for full-text search.</p>
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
         * <p>Specifies whether to enable the product quantization (PQ) feature for index acceleration. We recommend that you enable this feature for more than 500,000 rows of data. Valid values:</p>
         * <ul>
         * <li>0: no.</li>
         * <li>1 (default): yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The ID of the workspace that consists of multiple AnalyticDB for PostgreSQL instances. You must specify one of the WorkspaceId and DBInstanceId parameters. If you specify both parameters, the WorkspaceId parameter takes effect.</p>
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

}
