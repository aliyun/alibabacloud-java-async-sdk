// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SimpleQueryRequest} extends {@link RequestModel}
 *
 * <p>SimpleQueryRequest</p>
 */
public class SimpleQueryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Aggregations")
    private java.util.List < Aggregations> aggregations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private SimpleQuery query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithFields")
    private java.util.List < String > withFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithoutTotalHits")
    private Boolean withoutTotalHits;

    private SimpleQueryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aggregations = builder.aggregations;
        this.datasetName = builder.datasetName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.projectName = builder.projectName;
        this.query = builder.query;
        this.sort = builder.sort;
        this.withFields = builder.withFields;
        this.withoutTotalHits = builder.withoutTotalHits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SimpleQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return aggregations
     */
    public java.util.List < Aggregations> getAggregations() {
        return this.aggregations;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return query
     */
    public SimpleQuery getQuery() {
        return this.query;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return withFields
     */
    public java.util.List < String > getWithFields() {
        return this.withFields;
    }

    /**
     * @return withoutTotalHits
     */
    public Boolean getWithoutTotalHits() {
        return this.withoutTotalHits;
    }

    public static final class Builder extends Request.Builder<SimpleQueryRequest, Builder> {
        private String regionId; 
        private java.util.List < Aggregations> aggregations; 
        private String datasetName; 
        private Integer maxResults; 
        private String nextToken; 
        private String order; 
        private String projectName; 
        private SimpleQuery query; 
        private String sort; 
        private java.util.List < String > withFields; 
        private Boolean withoutTotalHits; 

        private Builder() {
            super();
        } 

        private Builder(SimpleQueryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aggregations = request.aggregations;
            this.datasetName = request.datasetName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.projectName = request.projectName;
            this.query = request.query;
            this.sort = request.sort;
            this.withFields = request.withFields;
            this.withoutTotalHits = request.withoutTotalHits;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Aggregations.
         */
        public Builder aggregations(java.util.List < Aggregations> aggregations) {
            String aggregationsShrink = shrink(aggregations, "Aggregations", "json");
            this.putQueryParameter("Aggregations", aggregationsShrink);
            this.aggregations = aggregations;
            return this;
        }

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(SimpleQuery query) {
            String queryShrink = shrink(query, "Query", "json");
            this.putQueryParameter("Query", queryShrink);
            this.query = query;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * WithFields.
         */
        public Builder withFields(java.util.List < String > withFields) {
            String withFieldsShrink = shrink(withFields, "WithFields", "json");
            this.putQueryParameter("WithFields", withFieldsShrink);
            this.withFields = withFields;
            return this;
        }

        /**
         * WithoutTotalHits.
         */
        public Builder withoutTotalHits(Boolean withoutTotalHits) {
            this.putQueryParameter("WithoutTotalHits", withoutTotalHits);
            this.withoutTotalHits = withoutTotalHits;
            return this;
        }

        @Override
        public SimpleQueryRequest build() {
            return new SimpleQueryRequest(this);
        } 

    } 

    public static class Aggregations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        private Aggregations(Builder builder) {
            this.field = builder.field;
            this.operation = builder.operation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Aggregations create() {
            return builder().build();
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        public static final class Builder {
            private String field; 
            private String operation; 

            /**
             * Field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            public Aggregations build() {
                return new Aggregations(this);
            } 

        } 

    }
}
