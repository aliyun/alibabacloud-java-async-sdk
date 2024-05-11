// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTasksRequest} extends {@link RequestModel}
 *
 * <p>ListTasksRequest</p>
 */
public class ListTasksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimeRange")
    private TimeRange endTimeRange;

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
    @com.aliyun.core.annotation.NameInMap("RequestDefinition")
    private Boolean requestDefinition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimeRange")
    private TimeRange startTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagSelector")
    private String tagSelector;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskTypes")
    private java.util.List < String > taskTypes;

    private ListTasksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTimeRange = builder.endTimeRange;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.projectName = builder.projectName;
        this.requestDefinition = builder.requestDefinition;
        this.sort = builder.sort;
        this.startTimeRange = builder.startTimeRange;
        this.status = builder.status;
        this.tagSelector = builder.tagSelector;
        this.taskTypes = builder.taskTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTasksRequest create() {
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
     * @return endTimeRange
     */
    public TimeRange getEndTimeRange() {
        return this.endTimeRange;
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
     * @return requestDefinition
     */
    public Boolean getRequestDefinition() {
        return this.requestDefinition;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return startTimeRange
     */
    public TimeRange getStartTimeRange() {
        return this.startTimeRange;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tagSelector
     */
    public String getTagSelector() {
        return this.tagSelector;
    }

    /**
     * @return taskTypes
     */
    public java.util.List < String > getTaskTypes() {
        return this.taskTypes;
    }

    public static final class Builder extends Request.Builder<ListTasksRequest, Builder> {
        private String regionId; 
        private TimeRange endTimeRange; 
        private Long maxResults; 
        private String nextToken; 
        private String order; 
        private String projectName; 
        private Boolean requestDefinition; 
        private String sort; 
        private TimeRange startTimeRange; 
        private String status; 
        private String tagSelector; 
        private java.util.List < String > taskTypes; 

        private Builder() {
            super();
        } 

        private Builder(ListTasksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTimeRange = request.endTimeRange;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.projectName = request.projectName;
            this.requestDefinition = request.requestDefinition;
            this.sort = request.sort;
            this.startTimeRange = request.startTimeRange;
            this.status = request.status;
            this.tagSelector = request.tagSelector;
            this.taskTypes = request.taskTypes;
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
         * EndTimeRange.
         */
        public Builder endTimeRange(TimeRange endTimeRange) {
            String endTimeRangeShrink = shrink(endTimeRange, "EndTimeRange", "json");
            this.putQueryParameter("EndTimeRange", endTimeRangeShrink);
            this.endTimeRange = endTimeRange;
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
         * RequestDefinition.
         */
        public Builder requestDefinition(Boolean requestDefinition) {
            this.putQueryParameter("RequestDefinition", requestDefinition);
            this.requestDefinition = requestDefinition;
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
         * StartTimeRange.
         */
        public Builder startTimeRange(TimeRange startTimeRange) {
            String startTimeRangeShrink = shrink(startTimeRange, "StartTimeRange", "json");
            this.putQueryParameter("StartTimeRange", startTimeRangeShrink);
            this.startTimeRange = startTimeRange;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TagSelector.
         */
        public Builder tagSelector(String tagSelector) {
            this.putQueryParameter("TagSelector", tagSelector);
            this.tagSelector = tagSelector;
            return this;
        }

        /**
         * TaskTypes.
         */
        public Builder taskTypes(java.util.List < String > taskTypes) {
            String taskTypesShrink = shrink(taskTypes, "TaskTypes", "json");
            this.putQueryParameter("TaskTypes", taskTypesShrink);
            this.taskTypes = taskTypes;
            return this;
        }

        @Override
        public ListTasksRequest build() {
            return new ListTasksRequest(this);
        } 

    } 

}
