// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The range of task end time. You can specify this parameter to filter tasks that end within the specified range.</p>
         */
        public Builder endTimeRange(TimeRange endTimeRange) {
            String endTimeRangeShrink = shrink(endTimeRange, "EndTimeRange", "json");
            this.putQueryParameter("EndTimeRange", endTimeRangeShrink);
            this.endTimeRange = endTimeRange;
            return this;
        }

        /**
         * <p>The maximum number of results to return. Valid value range: (0, 100]. Default value: 100.</p>
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
         * <p>The pagination token.</p>
         * <p>The pagination token is used in the next request to retrieve a new page of results if the total number of results exceeds the value of the MaxResults parameter. The next call to the operation returns results lexicographically after the NextToken parameter value.</p>
         * <blockquote>
         * <p> Leave this parameter empty in your first call to the operation.</p>
         * </blockquote>
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
         * <li>ASC: sorts the results in ascending order. This is the default sort order.</li>
         * <li>DES: sorts the results in descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
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
         * <p>Specifies whether to return request parameters in the initial request to create the task. Default value: False.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder requestDefinition(Boolean requestDefinition) {
            this.putQueryParameter("RequestDefinition", requestDefinition);
            this.requestDefinition = requestDefinition;
            return this;
        }

        /**
         * <p>The field used to sort the results by. Valid values:</p>
         * <ul>
         * <li>TaskId: sorts the results by task ID. This is the default sort field.</li>
         * <li>StartTime: sorts the results by task start time.</li>
         * <li>StartTime: sorts the results by task end time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TaskId</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>The range of task start time. You can specify this parameter to filter tasks that start within the specified range.</p>
         */
        public Builder startTimeRange(TimeRange startTimeRange) {
            String startTimeRangeShrink = shrink(startTimeRange, "StartTimeRange", "json");
            this.putQueryParameter("StartTimeRange", startTimeRangeShrink);
            this.startTimeRange = startTimeRange;
            return this;
        }

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Running: The task is running.</li>
         * <li>Succeeded: The task is successful.</li>
         * <li>Failed: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The custom tags of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>test=val1</p>
         */
        public Builder tagSelector(String tagSelector) {
            this.putQueryParameter("TagSelector", tagSelector);
            this.tagSelector = tagSelector;
            return this;
        }

        /**
         * <p>The task types.</p>
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
