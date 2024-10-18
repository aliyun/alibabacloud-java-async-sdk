// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryFigureClustersRequest} extends {@link RequestModel}
 *
 * <p>QueryFigureClustersRequest</p>
 */
public class QueryFigureClustersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeRange")
    private TimeRange createTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private String customLabels;

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
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateTimeRange")
    private TimeRange updateTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithTotalCount")
    private Boolean withTotalCount;

    private QueryFigureClustersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createTimeRange = builder.createTimeRange;
        this.customLabels = builder.customLabels;
        this.datasetName = builder.datasetName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.projectName = builder.projectName;
        this.sort = builder.sort;
        this.updateTimeRange = builder.updateTimeRange;
        this.withTotalCount = builder.withTotalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFigureClustersRequest create() {
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
     * @return createTimeRange
     */
    public TimeRange getCreateTimeRange() {
        return this.createTimeRange;
    }

    /**
     * @return customLabels
     */
    public String getCustomLabels() {
        return this.customLabels;
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
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return updateTimeRange
     */
    public TimeRange getUpdateTimeRange() {
        return this.updateTimeRange;
    }

    /**
     * @return withTotalCount
     */
    public Boolean getWithTotalCount() {
        return this.withTotalCount;
    }

    public static final class Builder extends Request.Builder<QueryFigureClustersRequest, Builder> {
        private String regionId; 
        private TimeRange createTimeRange; 
        private String customLabels; 
        private String datasetName; 
        private Long maxResults; 
        private String nextToken; 
        private String order; 
        private String projectName; 
        private String sort; 
        private TimeRange updateTimeRange; 
        private Boolean withTotalCount; 

        private Builder() {
            super();
        } 

        private Builder(QueryFigureClustersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createTimeRange = request.createTimeRange;
            this.customLabels = request.customLabels;
            this.datasetName = request.datasetName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.projectName = request.projectName;
            this.sort = request.sort;
            this.updateTimeRange = request.updateTimeRange;
            this.withTotalCount = request.withTotalCount;
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
         * <p>The time period during which the faces are grouped together.</p>
         */
        public Builder createTimeRange(TimeRange createTimeRange) {
            String createTimeRangeShrink = shrink(createTimeRange, "CreateTimeRange", "json");
            this.putQueryParameter("CreateTimeRange", createTimeRangeShrink);
            this.createTimeRange = createTimeRange;
            return this;
        }

        /**
         * <p>The custom labels, which can be used as query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>key=value</p>
         */
        public Builder customLabels(String customLabels) {
            this.putQueryParameter("CustomLabels", customLabels);
            this.customLabels = customLabels;
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
         * <p>The maximum number of entries to return. Valid values: 0 to 100. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The sort order. Default value: asc.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>asc: ascending order.</li>
         * <li>desc: descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
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
         * <p>The sort field. If you leave this parameter empty, the group ID is used as the sort field.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ImageCount: the number of images.</li>
         * <li>VideoCount: the number of videos.</li>
         * <li>ProjectName: the name of the project.</li>
         * <li>DatasetName: the name of the dataset.</li>
         * <li>CreateTime: the point in time when the group is created.</li>
         * <li>UpdateTime: the most recent point in time when the group is updated.</li>
         * <li>Gender: the gender.</li>
         * <li>FaceCount: the number of faces.</li>
         * <li>GroupName: the name of the group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ImageCount</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>The time period during which the faces in the group are updated.</p>
         */
        public Builder updateTimeRange(TimeRange updateTimeRange) {
            String updateTimeRangeShrink = shrink(updateTimeRange, "UpdateTimeRange", "json");
            this.putQueryParameter("UpdateTimeRange", updateTimeRangeShrink);
            this.updateTimeRange = updateTimeRange;
            return this;
        }

        /**
         * <p>Specifies whether to return the total number of face groups that match the current query conditions. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder withTotalCount(Boolean withTotalCount) {
            this.putQueryParameter("WithTotalCount", withTotalCount);
            this.withTotalCount = withTotalCount;
            return this;
        }

        @Override
        public QueryFigureClustersRequest build() {
            return new QueryFigureClustersRequest(this);
        } 

    } 

}
