// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCollectionDataRequest} extends {@link RequestModel}
 *
 * <p>QueryCollectionDataRequest</p>
 */
public class QueryCollectionDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Collection")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HybridSearch")
    private String hybridSearch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HybridSearchArgs")
    private java.util.Map < String, java.util.Map<String, ?>> hybridSearchArgs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeMetadataFields")
    private String includeMetadataFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeValues")
    private Boolean includeValues;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private String metrics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespacePassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespacePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Integer offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopK")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long topK;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vector")
    private java.util.List < Double > vector;

    private QueryCollectionDataRequest(Builder builder) {
        super(builder);
        this.collection = builder.collection;
        this.content = builder.content;
        this.DBInstanceId = builder.DBInstanceId;
        this.filter = builder.filter;
        this.hybridSearch = builder.hybridSearch;
        this.hybridSearchArgs = builder.hybridSearchArgs;
        this.includeMetadataFields = builder.includeMetadataFields;
        this.includeValues = builder.includeValues;
        this.metrics = builder.metrics;
        this.namespace = builder.namespace;
        this.namespacePassword = builder.namespacePassword;
        this.offset = builder.offset;
        this.orderBy = builder.orderBy;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.topK = builder.topK;
        this.vector = builder.vector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCollectionDataRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return hybridSearch
     */
    public String getHybridSearch() {
        return this.hybridSearch;
    }

    /**
     * @return hybridSearchArgs
     */
    public java.util.Map < String, java.util.Map<String, ?>> getHybridSearchArgs() {
        return this.hybridSearchArgs;
    }

    /**
     * @return includeMetadataFields
     */
    public String getIncludeMetadataFields() {
        return this.includeMetadataFields;
    }

    /**
     * @return includeValues
     */
    public Boolean getIncludeValues() {
        return this.includeValues;
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
     * @return namespacePassword
     */
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
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
     * @return topK
     */
    public Long getTopK() {
        return this.topK;
    }

    /**
     * @return vector
     */
    public java.util.List < Double > getVector() {
        return this.vector;
    }

    public static final class Builder extends Request.Builder<QueryCollectionDataRequest, Builder> {
        private String collection; 
        private String content; 
        private String DBInstanceId; 
        private String filter; 
        private String hybridSearch; 
        private java.util.Map < String, java.util.Map<String, ?>> hybridSearchArgs; 
        private String includeMetadataFields; 
        private Boolean includeValues; 
        private String metrics; 
        private String namespace; 
        private String namespacePassword; 
        private Integer offset; 
        private String orderBy; 
        private Long ownerId; 
        private String regionId; 
        private Long topK; 
        private java.util.List < Double > vector; 

        private Builder() {
            super();
        } 

        private Builder(QueryCollectionDataRequest request) {
            super(request);
            this.collection = request.collection;
            this.content = request.content;
            this.DBInstanceId = request.DBInstanceId;
            this.filter = request.filter;
            this.hybridSearch = request.hybridSearch;
            this.hybridSearchArgs = request.hybridSearchArgs;
            this.includeMetadataFields = request.includeMetadataFields;
            this.includeValues = request.includeValues;
            this.metrics = request.metrics;
            this.namespace = request.namespace;
            this.namespacePassword = request.namespacePassword;
            this.offset = request.offset;
            this.orderBy = request.orderBy;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.topK = request.topK;
            this.vector = request.vector;
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
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
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
         * Filter.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * HybridSearch.
         */
        public Builder hybridSearch(String hybridSearch) {
            this.putQueryParameter("HybridSearch", hybridSearch);
            this.hybridSearch = hybridSearch;
            return this;
        }

        /**
         * HybridSearchArgs.
         */
        public Builder hybridSearchArgs(java.util.Map < String, java.util.Map<String, ?>> hybridSearchArgs) {
            String hybridSearchArgsShrink = shrink(hybridSearchArgs, "HybridSearchArgs", "json");
            this.putQueryParameter("HybridSearchArgs", hybridSearchArgsShrink);
            this.hybridSearchArgs = hybridSearchArgs;
            return this;
        }

        /**
         * IncludeMetadataFields.
         */
        public Builder includeMetadataFields(String includeMetadataFields) {
            this.putQueryParameter("IncludeMetadataFields", includeMetadataFields);
            this.includeMetadataFields = includeMetadataFields;
            return this;
        }

        /**
         * IncludeValues.
         */
        public Builder includeValues(Boolean includeValues) {
            this.putQueryParameter("IncludeValues", includeValues);
            this.includeValues = includeValues;
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
         * NamespacePassword.
         */
        public Builder namespacePassword(String namespacePassword) {
            this.putQueryParameter("NamespacePassword", namespacePassword);
            this.namespacePassword = namespacePassword;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TopK.
         */
        public Builder topK(Long topK) {
            this.putQueryParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * Vector.
         */
        public Builder vector(java.util.List < Double > vector) {
            String vectorShrink = shrink(vector, "Vector", "json");
            this.putQueryParameter("Vector", vectorShrink);
            this.vector = vector;
            return this;
        }

        @Override
        public QueryCollectionDataRequest build() {
            return new QueryCollectionDataRequest(this);
        } 

    } 

}
