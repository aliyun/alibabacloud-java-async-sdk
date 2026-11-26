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
 * {@link UpsertCollectionDataRequest} extends {@link RequestModel}
 *
 * <p>UpsertCollectionDataRequest</p>
 */
public class UpsertCollectionDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Collection")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespacePassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespacePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rows")
    private java.util.List<Rows> rows;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private UpsertCollectionDataRequest(Builder builder) {
        super(builder);
        this.collection = builder.collection;
        this.DBInstanceId = builder.DBInstanceId;
        this.namespace = builder.namespace;
        this.namespacePassword = builder.namespacePassword;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.rows = builder.rows;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertCollectionDataRequest create() {
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
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespacePassword
     */
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rows
     */
    public java.util.List<Rows> getRows() {
        return this.rows;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpsertCollectionDataRequest, Builder> {
        private String collection; 
        private String DBInstanceId; 
        private String namespace; 
        private String namespacePassword; 
        private Long ownerId; 
        private String regionId; 
        private java.util.List<Rows> rows; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpsertCollectionDataRequest request) {
            super(request);
            this.collection = request.collection;
            this.DBInstanceId = request.DBInstanceId;
            this.namespace = request.namespace;
            this.namespacePassword = request.namespacePassword;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.rows = request.rows;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The collection name.</p>
         * <blockquote>
         * <p>You can create a collection by calling <a href="https://help.aliyun.com/document_detail/2401497.html">CreateCollection</a> and view the list of collections by calling <a href="https://help.aliyun.com/document_detail/2401503.html">ListCollections</a>.</p>
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
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a specified region, including the instance IDs.</p>
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
         * <p>The namespace used for tenant isolation. Default value: public.</p>
         * <blockquote>
         * <p>You can create a namespace by calling <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> and view the list of namespaces by calling <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a>.</p>
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
         * <p>The password for the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testpassword</p>
         */
        public Builder namespacePassword(String namespacePassword) {
            this.putQueryParameter("NamespacePassword", namespacePassword);
            this.namespacePassword = namespacePassword;
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
         * <p>The list of vector data.</p>
         */
        public Builder rows(java.util.List<Rows> rows) {
            String rowsShrink = shrink(rows, "Rows", "json");
            this.putBodyParameter("Rows", rowsShrink);
            this.rows = rows;
            return this;
        }

        /**
         * <p>The ID of the workspace that consists of multiple database instances. This parameter and the DBInstanceId parameter cannot be both empty. If both parameters are specified, this parameter takes precedence.</p>
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
        public UpsertCollectionDataRequest build() {
            return new UpsertCollectionDataRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpsertCollectionDataRequest} extends {@link TeaModel}
     *
     * <p>UpsertCollectionDataRequest</p>
     */
    public static class SparseVector extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Indices")
        private java.util.List<Long> indices;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<Double> values;

        private SparseVector(Builder builder) {
            this.indices = builder.indices;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SparseVector create() {
            return builder().build();
        }

        /**
         * @return indices
         */
        public java.util.List<Long> getIndices() {
            return this.indices;
        }

        /**
         * @return values
         */
        public java.util.List<Double> getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List<Long> indices; 
            private java.util.List<Double> values; 

            private Builder() {
            } 

            private Builder(SparseVector model) {
                this.indices = model.indices;
                this.values = model.values;
            } 

            /**
             * <p>The index array.</p>
             * <blockquote>
             * <p>The list size cannot exceed 4,000.</p>
             * </blockquote>
             */
            public Builder indices(java.util.List<Long> indices) {
                this.indices = indices;
                return this;
            }

            /**
             * <p>The sparse vector array.</p>
             */
            public Builder values(java.util.List<Double> values) {
                this.values = values;
                return this;
            }

            public SparseVector build() {
                return new SparseVector(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpsertCollectionDataRequest} extends {@link TeaModel}
     *
     * <p>UpsertCollectionDataRequest</p>
     */
    public static class Rows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map<String, String> metadata;

        @com.aliyun.core.annotation.NameInMap("SparseVector")
        private SparseVector sparseVector;

        @com.aliyun.core.annotation.NameInMap("Vector")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Double> vector;

        private Rows(Builder builder) {
            this.id = builder.id;
            this.metadata = builder.metadata;
            this.sparseVector = builder.sparseVector;
            this.vector = builder.vector;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rows create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        /**
         * @return sparseVector
         */
        public SparseVector getSparseVector() {
            return this.sparseVector;
        }

        /**
         * @return vector
         */
        public java.util.List<Double> getVector() {
            return this.vector;
        }

        public static final class Builder {
            private String id; 
            private java.util.Map<String, String> metadata; 
            private SparseVector sparseVector; 
            private java.util.List<Double> vector; 

            private Builder() {
            } 

            private Builder(Rows model) {
                this.id = model.id;
                this.metadata = model.metadata;
                this.sparseVector = model.sparseVector;
                this.vector = model.vector;
            } 

            /**
             * <p>The unique ID of the vector data record.</p>
             * <blockquote>
             * <p>If this parameter is left empty, a unique ID is automatically generated by the database uuidgen function. If this parameter is not empty and conflicts with an existing ID in the database, the value in the database is updated with the data from the API request.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>854c6949-411c-4b47-aec4-e324735f9574</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The metadata corresponding to the vector data record. The keys must be consistent with the metadata keys defined in the <a href="https://help.aliyun.com/document_detail/2401497.html">CreateCollection</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;title&quot;:&quot;test title&quot;,&quot;content&quot;:&quot;test content&quot;}</p>
             */
            public Builder metadata(java.util.Map<String, String> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The list of sparse vector data.</p>
             */
            public Builder sparseVector(SparseVector sparseVector) {
                this.sparseVector = sparseVector;
                return this;
            }

            /**
             * <p>The vector data list. The length must be consistent with the dimensions defined in the <a href="https://help.aliyun.com/document_detail/2401497.html">CreateCollection</a> operation.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[1.0123,-0.1234]</p>
             */
            public Builder vector(java.util.List<Double> vector) {
                this.vector = vector;
                return this;
            }

            public Rows build() {
                return new Rows(this);
            } 

        } 

    }
}
