// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
    private java.util.List<Aggregations> aggregations;

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
    private java.util.List<String> withFields;

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
    public java.util.List<Aggregations> getAggregations() {
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
    public java.util.List<String> getWithFields() {
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
        private java.util.List<Aggregations> aggregations; 
        private String datasetName; 
        private Integer maxResults; 
        private String nextToken; 
        private String order; 
        private String projectName; 
        private SimpleQuery query; 
        private String sort; 
        private java.util.List<String> withFields; 
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
         * <p>The aggregations.</p>
         * <blockquote>
         * <p> If you perform an aggregate query, the aggregation returned in the response contains only statistical results, not the actual metadata.</p>
         * </blockquote>
         */
        public Builder aggregations(java.util.List<Aggregations> aggregations) {
            String aggregationsShrink = shrink(aggregations, "Aggregations", "json");
            this.putQueryParameter("Aggregations", aggregationsShrink);
            this.aggregations = aggregations;
            return this;
        }

        /**
         * <p>The name of the dataset.<a href="~~478160~~"></a></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-dataset</p>
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <ul>
         * <li>If the Aggregations parameter is not specified, this parameter specifies the maximum number of files that can be returned. Valid values: 1 to 100.</li>
         * <li>If the Aggregations parameter is specified, this parameter specifies the maximum number of aggregation groups that can be returned. Valid values: 0 to 2000.</li>
         * <li>If you do not specify this parameter or set the parameter to 0, the default value of 100 is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token is used in the next request to retrieve a new page of results if the total number of results exceeds the value of the MaxResults parameter.</p>
         * <p>The next call to the operation returns results lexicographically after the NextToken parameter value.</p>
         * <p>You do not need to specify this parameter in your initial request.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><p>asc: sorts the results in ascending order.</p>
         * </li>
         * <li><p>desc: sorts the results in descending order. This is the default value.</p>
         * </li>
         * <li><p>You can specify multiple sort orders that are separated by commas. Example: asc,desc.</p>
         * </li>
         * <li><p>The number of elements in the Order parameter must be less than or equal to the number of elements in the Sort parameter. For example, if the value of the Sort parameter is Size,Filename, you can set the Order parameter to desc,asc.</p>
         * </li>
         * <li><p>If the number of sort orders is less than the number of sort fields, the sort fields for which no sorting orders are explicitly specified use the asc order by default. For example, if you set Sort to Size,Filename and Order to asc, the Filename field defaults to the value of asc.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asc,desc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The name of the project.<a href="~~478153~~"></a></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The query conditions.</p>
         */
        public Builder query(SimpleQuery query) {
            String queryShrink = shrink(query, "Query", "json");
            this.putQueryParameter("Query", queryShrink);
            this.query = query;
            return this;
        }

        /**
         * <p>The sort fields. For more information, see <a href="https://help.aliyun.com/document_detail/2743991.html">Supported fields and operators</a>.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you specify multiple sort fields, separate them with commas (,), as in Size,Filename.</p>
         * </li>
         * <li><p>You can specify up to five sort fields.</p>
         * </li>
         * <li><p>The order of the sort fields determines their precedence in the sorting process.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Size,Filename</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>The fields that you want to include in the response. You can use this parameter to reduce the size of the response.</p>
         * <p>If you do not specify this parameter or leave this parameter empty, the operation returns all metadata fields.</p>
         */
        public Builder withFields(java.util.List<String> withFields) {
            String withFieldsShrink = shrink(withFields, "WithFields", "json");
            this.putQueryParameter("WithFields", withFieldsShrink);
            this.withFields = withFields;
            return this;
        }

        /**
         * <p>Specifies whether to return the total number of hits. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
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

    /**
     * 
     * {@link SimpleQueryRequest} extends {@link TeaModel}
     *
     * <p>SimpleQueryRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Aggregations model) {
                this.field = model.field;
                this.operation = model.operation;
            } 

            /**
             * <p>The name of the field. For more information about supported fields, see <a href="https://help.aliyun.com/document_detail/2743991.html">Supported fields and operators</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Size</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The operator.</p>
             * <p>Enumerated values:</p>
             * <ul>
             * <li>average: calculates the average number.</li>
             * <li>min: finds the minimum value.</li>
             * <li>max: finds the maximum value.</li>
             * <li>count: counts the number of results.</li>
             * <li>distinct: counts the number of distinct results.</li>
             * <li>sum: calculates the sum of all matching results..</li>
             * <li>group: counts the number of results by group. The results are sorted by the count number in descending order.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sum</p>
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
