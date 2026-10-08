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
 * {@link QueryStoriesRequest} extends {@link RequestModel}
 *
 * <p>QueryStoriesRequest</p>
 */
public class QueryStoriesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("FigureClusterIds")
    private java.util.List<String> figureClusterIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

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
    @com.aliyun.core.annotation.NameInMap("StoryEndTimeRange")
    private TimeRange storyEndTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoryName")
    private String storyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoryStartTimeRange")
    private TimeRange storyStartTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorySubType")
    private String storySubType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoryType")
    private String storyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithEmptyStories")
    private Boolean withEmptyStories;

    private QueryStoriesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createTimeRange = builder.createTimeRange;
        this.customLabels = builder.customLabels;
        this.datasetName = builder.datasetName;
        this.figureClusterIds = builder.figureClusterIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.objectId = builder.objectId;
        this.order = builder.order;
        this.projectName = builder.projectName;
        this.sort = builder.sort;
        this.storyEndTimeRange = builder.storyEndTimeRange;
        this.storyName = builder.storyName;
        this.storyStartTimeRange = builder.storyStartTimeRange;
        this.storySubType = builder.storySubType;
        this.storyType = builder.storyType;
        this.withEmptyStories = builder.withEmptyStories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStoriesRequest create() {
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
     * @return figureClusterIds
     */
    public java.util.List<String> getFigureClusterIds() {
        return this.figureClusterIds;
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
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
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
     * @return storyEndTimeRange
     */
    public TimeRange getStoryEndTimeRange() {
        return this.storyEndTimeRange;
    }

    /**
     * @return storyName
     */
    public String getStoryName() {
        return this.storyName;
    }

    /**
     * @return storyStartTimeRange
     */
    public TimeRange getStoryStartTimeRange() {
        return this.storyStartTimeRange;
    }

    /**
     * @return storySubType
     */
    public String getStorySubType() {
        return this.storySubType;
    }

    /**
     * @return storyType
     */
    public String getStoryType() {
        return this.storyType;
    }

    /**
     * @return withEmptyStories
     */
    public Boolean getWithEmptyStories() {
        return this.withEmptyStories;
    }

    public static final class Builder extends Request.Builder<QueryStoriesRequest, Builder> {
        private String regionId; 
        private TimeRange createTimeRange; 
        private String customLabels; 
        private String datasetName; 
        private java.util.List<String> figureClusterIds; 
        private Long maxResults; 
        private String nextToken; 
        private String objectId; 
        private String order; 
        private String projectName; 
        private String sort; 
        private TimeRange storyEndTimeRange; 
        private String storyName; 
        private TimeRange storyStartTimeRange; 
        private String storySubType; 
        private String storyType; 
        private Boolean withEmptyStories; 

        private Builder() {
            super();
        } 

        private Builder(QueryStoriesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createTimeRange = request.createTimeRange;
            this.customLabels = request.customLabels;
            this.datasetName = request.datasetName;
            this.figureClusterIds = request.figureClusterIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.objectId = request.objectId;
            this.order = request.order;
            this.projectName = request.projectName;
            this.sort = request.sort;
            this.storyEndTimeRange = request.storyEndTimeRange;
            this.storyName = request.storyName;
            this.storyStartTimeRange = request.storyStartTimeRange;
            this.storySubType = request.storySubType;
            this.storyType = request.storyType;
            this.withEmptyStories = request.withEmptyStories;
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
         * <p>The creation time range of the story.</p>
         */
        public Builder createTimeRange(TimeRange createTimeRange) {
            String createTimeRangeShrink = shrink(createTimeRange, "CreateTimeRange", "json");
            this.putQueryParameter("CreateTimeRange", createTimeRangeShrink);
            this.createTimeRange = createTimeRange;
            return this;
        }

        /**
         * <p>The custom label key-value pairs. Only stories that match the specified label pairs are returned.</p>
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
         * <p>The name of the dataset. For more information about how to obtain the name, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
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
         * <p>The IDs of the figure clusters.</p>
         */
        public Builder figureClusterIds(java.util.List<String> figureClusterIds) {
            String figureClusterIdsShrink = shrink(figureClusterIds, "FigureClusterIds", "json");
            this.putQueryParameter("FigureClusterIds", figureClusterIdsShrink);
            this.figureClusterIds = figureClusterIds;
            return this;
        }

        /**
         * <p>The maximum number of entries to return in a single call. Valid values: 1 to 100. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. If this parameter is left empty, the query starts from the beginning. To query the next page, set this parameter to the NextToken value returned in the previous call.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpw****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the story object.</p>
         * 
         * <strong>example:</strong>
         * <p>id1</p>
         */
        public Builder objectId(String objectId) {
            this.putQueryParameter("ObjectId", objectId);
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>The sorting order. Valid values:</p>
         * <ul>
         * <li><p>asc: Ascending order.</p>
         * </li>
         * <li><p>desc: Descending order.</p>
         * </li>
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
         * <p>The name of the project. For more information about how to obtain the name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
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
         * <p>The field used for sorting. Valid values:</p>
         * <ul>
         * <li><p>CreateTime: Sorts by story creation time.</p>
         * </li>
         * <li><p>StoryName: Sorts by story name.</p>
         * </li>
         * <li><p>StoryStartTime: Sorts by story start time.</p>
         * </li>
         * <li><p>StoryEndTime: Sorts by story end time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateTime</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>The end time range of the photos or videos in the story.</p>
         */
        public Builder storyEndTimeRange(TimeRange storyEndTimeRange) {
            String storyEndTimeRangeShrink = shrink(storyEndTimeRange, "StoryEndTimeRange", "json");
            this.putQueryParameter("StoryEndTimeRange", storyEndTimeRangeShrink);
            this.storyEndTimeRange = storyEndTimeRange;
            return this;
        }

        /**
         * <p>The name of the story.</p>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
         */
        public Builder storyName(String storyName) {
            this.putQueryParameter("StoryName", storyName);
            this.storyName = storyName;
            return this;
        }

        /**
         * <p>The start time range of the photos or videos in the story.</p>
         */
        public Builder storyStartTimeRange(TimeRange storyStartTimeRange) {
            String storyStartTimeRangeShrink = shrink(storyStartTimeRange, "StoryStartTimeRange", "json");
            this.putQueryParameter("StoryStartTimeRange", storyStartTimeRangeShrink);
            this.storyStartTimeRange = storyStartTimeRange;
            return this;
        }

        /**
         * <p>The subtype of the story. For valid values, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>SeasonHighlights</p>
         */
        public Builder storySubType(String storySubType) {
            this.putQueryParameter("StorySubType", storySubType);
            this.storySubType = storySubType;
            return this;
        }

        /**
         * <p>The type of the story. For valid values, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>TimeMemory</p>
         */
        public Builder storyType(String storyType) {
            this.putQueryParameter("StoryType", storyType);
            this.storyType = storyType;
            return this;
        }

        /**
         * <p>Specifies whether to return empty stories. Valid values:</p>
         * <ul>
         * <li><p>true: Returns empty stories. This is the default value.</p>
         * </li>
         * <li><p>false: Does not return empty stories.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withEmptyStories(Boolean withEmptyStories) {
            this.putQueryParameter("WithEmptyStories", withEmptyStories);
            this.withEmptyStories = withEmptyStories;
            return this;
        }

        @Override
        public QueryStoriesRequest build() {
            return new QueryStoriesRequest(this);
        } 

    } 

}
