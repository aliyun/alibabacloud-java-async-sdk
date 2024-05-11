// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > figureClusterIds;

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
    public java.util.List < String > getFigureClusterIds() {
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
        private java.util.List < String > figureClusterIds; 
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
         * CreateTimeRange.
         */
        public Builder createTimeRange(TimeRange createTimeRange) {
            String createTimeRangeShrink = shrink(createTimeRange, "CreateTimeRange", "json");
            this.putQueryParameter("CreateTimeRange", createTimeRangeShrink);
            this.createTimeRange = createTimeRange;
            return this;
        }

        /**
         * CustomLabels.
         */
        public Builder customLabels(String customLabels) {
            this.putQueryParameter("CustomLabels", customLabels);
            this.customLabels = customLabels;
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
         * FigureClusterIds.
         */
        public Builder figureClusterIds(java.util.List < String > figureClusterIds) {
            String figureClusterIdsShrink = shrink(figureClusterIds, "FigureClusterIds", "json");
            this.putQueryParameter("FigureClusterIds", figureClusterIdsShrink);
            this.figureClusterIds = figureClusterIds;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
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
         * ObjectId.
         */
        public Builder objectId(String objectId) {
            this.putQueryParameter("ObjectId", objectId);
            this.objectId = objectId;
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
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * StoryEndTimeRange.
         */
        public Builder storyEndTimeRange(TimeRange storyEndTimeRange) {
            String storyEndTimeRangeShrink = shrink(storyEndTimeRange, "StoryEndTimeRange", "json");
            this.putQueryParameter("StoryEndTimeRange", storyEndTimeRangeShrink);
            this.storyEndTimeRange = storyEndTimeRange;
            return this;
        }

        /**
         * StoryName.
         */
        public Builder storyName(String storyName) {
            this.putQueryParameter("StoryName", storyName);
            this.storyName = storyName;
            return this;
        }

        /**
         * StoryStartTimeRange.
         */
        public Builder storyStartTimeRange(TimeRange storyStartTimeRange) {
            String storyStartTimeRangeShrink = shrink(storyStartTimeRange, "StoryStartTimeRange", "json");
            this.putQueryParameter("StoryStartTimeRange", storyStartTimeRangeShrink);
            this.storyStartTimeRange = storyStartTimeRange;
            return this;
        }

        /**
         * StorySubType.
         */
        public Builder storySubType(String storySubType) {
            this.putQueryParameter("StorySubType", storySubType);
            this.storySubType = storySubType;
            return this;
        }

        /**
         * StoryType.
         */
        public Builder storyType(String storyType) {
            this.putQueryParameter("StoryType", storyType);
            this.storyType = storyType;
            return this;
        }

        /**
         * WithEmptyStories.
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
