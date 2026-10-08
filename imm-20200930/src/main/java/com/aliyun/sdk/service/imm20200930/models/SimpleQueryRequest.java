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
         * <p>The list of aggregation field information.</p>
         * <blockquote>
         * <p>Notice: When you use an aggregation query, only the aggregation results are returned, and the list of matched metadata is not returned.</notice></p>
         * </blockquote>
         */
        public Builder aggregations(java.util.List<Aggregations> aggregations) {
            String aggregationsShrink = shrink(aggregations, "Aggregations", "json");
            this.putQueryParameter("Aggregations", aggregationsShrink);
            this.aggregations = aggregations;
            return this;
        }

        /**
         * <p>The name of the dataset. For more information about how to obtain the dataset name, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
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
         * <li><p>When you perform a query for files without specifying the Aggregations parameter, this parameter specifies the maximum number of files to return. Valid values: 0 to 100.</p>
         * </li>
         * <li><p>When you specify the Aggregations parameter for aggregation statistics, this parameter specifies the maximum number of groups to return. Valid values: 0 to 2000.</p>
         * </li>
         * <li><p>If you do not specify this parameter or set it to 0, the default value is 100.</p>
         * </li>
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
         * <p>The token used for pagination when the total number of files exceeds the value of MaxResults.</p>
         * <p>The list of files is returned in lexicographical order starting from NextToken.</p>
         * <p>Set this parameter to empty when you call this operation for the first time.</p>
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
         * <p>The sort order of the sort fields. Valid values:</p>
         * <ul>
         * <li><p>asc: ascending order</p>
         * </li>
         * <li><p>desc: descending order (default)</p>
         * <blockquote>
         * <ul>
         * <li>You can separate multiple sort orders with commas (,), for example, asc,desc.</li>
         * <li>The number of sort orders cannot exceed the number of sort fields. That is, the number of elements in the Order parameter must be less than or equal to the number of elements in the Sort parameter. For example, if Sort is set to Size,Filename, Order can be set to &quot;asc,desc&quot;.</li>
         * <li>If the number of sort orders is less than the number of sort fields, the default sort order for the unspecified fields is desc. For example, if Sort is set to Size,Filename and Order is set to asc, the default sort order for Filename is desc, which means descending order.</li>
         * </ul>
         * </blockquote>
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
         * <p>The name of the project. For more information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
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
         * <p>The simple query conditions. Click the link on the left to view details.</p>
         */
        public Builder query(SimpleQuery query) {
            String queryShrink = shrink(query, "Query", "json");
            this.putQueryParameter("Query", queryShrink);
            this.query = query;
            return this;
        }

        /**
         * <p>The list of sort fields. For more information, see <a href="https://help.aliyun.com/document_detail/2743991.html">Supported fields and operators</a>.</p>
         * <blockquote>
         * <ul>
         * <li>You can separate multiple sort fields with commas (,), for example, Size,Filename.</li>
         * <li>You can specify a maximum of 5 sort fields.</li>
         * <li>The order of the sort fields determines the sorting priority.</li>
         * </ul>
         * </blockquote>
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
         * <p>Specifies the specific fields to return instead of all existing metadata fields. This can be used to reduce the size of the returned struct.</p>
         * <p>If you do not specify this parameter or leave it empty, all fields are returned.</p>
         */
        public Builder withFields(java.util.List<String> withFields) {
            String withFieldsShrink = shrink(withFields, "WithFields", "json");
            this.putQueryParameter("WithFields", withFieldsShrink);
            this.withFields = withFields;
            return this;
        }

        /**
         * <p>Specifies whether to return the total number of matched records. Valid values:</p>
         * <ul>
         * <li>true: The TotalHits field is not returned.</li>
         * <li>false: The TotalHits field is returned.</li>
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
             * <p>The operator for the aggregation field.</p>
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
