// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FuzzyQueryRequest} extends {@link RequestModel}
 *
 * <p>FuzzyQueryRequest</p>
 */
public class FuzzyQueryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithFields")
    private java.util.List < String > withFields;

    private FuzzyQueryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasetName = builder.datasetName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.projectName = builder.projectName;
        this.query = builder.query;
        this.sort = builder.sort;
        this.withFields = builder.withFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FuzzyQueryRequest create() {
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
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
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
    public String getQuery() {
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

    public static final class Builder extends Request.Builder<FuzzyQueryRequest, Builder> {
        private String regionId; 
        private String datasetName; 
        private Long maxResults; 
        private String nextToken; 
        private String order; 
        private String projectName; 
        private String query; 
        private String sort; 
        private java.util.List < String > withFields; 

        private Builder() {
            super();
        } 

        private Builder(FuzzyQueryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasetName = request.datasetName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.projectName = request.projectName;
            this.query = request.query;
            this.sort = request.sort;
            this.withFields = request.withFields;
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
         * <p>The name of the dataset. You can obtain the name of the dataset from the response of the <a href="https://help.aliyun.com/document_detail/478160.html">CreateDataset</a> operation.</p>
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
         * <p>The maximum number of entries to return. Valid values: 0 to 200.</p>
         * <p>Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. If the total number of files is greater than the value of MaxResults, you must specify NextToken.</p>
         * <p>The file information is returned in alphabetical order starting from the value of NextToken.</p>
         * <p>You do not need to specify this parameter for the first request.</p>
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
         * <p>The sorting method. Valid values:</p>
         * <ul>
         * <li>asc: ascending order.</li>
         * <li>desc (default): descending order.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>Separate multiple sorting methods with commas (,). Example: asc,desc.</p>
         * </li>
         * <li><p>The number of values for Order must be less than or equal to the number of values for Sort. For example, if you set Sort to Size,Filename, you can set Order only to desc or asc.</p>
         * </li>
         * <li><p>If the number of values for Order is less than the number of values for Sort, the unsorted fields are default to the value of asc. For example, if you set Sort to Size,Filename and Order to asc, the Filename field is default to the value of asc.</p>
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
         * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
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
         * <p>The query content. The value can be up to 1 MB in size.</p>
         * <p>This parameter is required.</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The sort field. For more information, see <a href="https://help.aliyun.com/document_detail/252856.html">Supported fields and operators</a>.</p>
         * <ul>
         * <li>Separate multiple sort fields with commas (,). Example: <code>Size,Filename</code>.</li>
         * <li>You can specify up to five sort fields.</li>
         * <li>The priority order of sorting is determined based on the order of the sort fields.</li>
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
         * <p>The fields that you want to include in the response. To help reduce the size of the response, include only necessary metadata fields.</p>
         * <p>If you do not specify this parameter or set the value to null, all existing metadata fields are returned.</p>
         */
        public Builder withFields(java.util.List < String > withFields) {
            String withFieldsShrink = shrink(withFields, "WithFields", "json");
            this.putQueryParameter("WithFields", withFieldsShrink);
            this.withFields = withFields;
            return this;
        }

        @Override
        public FuzzyQueryRequest build() {
            return new FuzzyQueryRequest(this);
        } 

    } 

}
