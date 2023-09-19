// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExecutionsRequest} extends {@link RequestModel}
 *
 * <p>ListExecutionsRequest</p>
 */
public class ListExecutionsRequest extends Request {
    @Query
    @NameInMap("Categories")
    private String categories;

    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("Depth")
    private String depth;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EndDateAfter")
    private String endDateAfter;

    @Query
    @NameInMap("EndDateBefore")
    private String endDateBefore;

    @Query
    @NameInMap("ExecutedBy")
    private String executedBy;

    @Query
    @NameInMap("ExecutionId")
    private String executionId;

    @Query
    @NameInMap("IncludeChildExecution")
    private Boolean includeChildExecution;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("Mode")
    private String mode;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ParentExecutionId")
    private String parentExecutionId;

    @Query
    @NameInMap("RamRole")
    private String ramRole;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("ResourceTemplateName")
    private String resourceTemplateName;

    @Query
    @NameInMap("SortField")
    private String sortField;

    @Query
    @NameInMap("SortOrder")
    private String sortOrder;

    @Query
    @NameInMap("StartDateAfter")
    private String startDateAfter;

    @Query
    @NameInMap("StartDateBefore")
    private String startDateBefore;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    @Query
    @NameInMap("TemplateName")
    private String templateName;

    private ListExecutionsRequest(Builder builder) {
        super(builder);
        this.categories = builder.categories;
        this.category = builder.category;
        this.depth = builder.depth;
        this.description = builder.description;
        this.endDateAfter = builder.endDateAfter;
        this.endDateBefore = builder.endDateBefore;
        this.executedBy = builder.executedBy;
        this.executionId = builder.executionId;
        this.includeChildExecution = builder.includeChildExecution;
        this.maxResults = builder.maxResults;
        this.mode = builder.mode;
        this.nextToken = builder.nextToken;
        this.parentExecutionId = builder.parentExecutionId;
        this.ramRole = builder.ramRole;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceId = builder.resourceId;
        this.resourceTemplateName = builder.resourceTemplateName;
        this.sortField = builder.sortField;
        this.sortOrder = builder.sortOrder;
        this.startDateAfter = builder.startDateAfter;
        this.startDateBefore = builder.startDateBefore;
        this.status = builder.status;
        this.tags = builder.tags;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categories
     */
    public String getCategories() {
        return this.categories;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return depth
     */
    public String getDepth() {
        return this.depth;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endDateAfter
     */
    public String getEndDateAfter() {
        return this.endDateAfter;
    }

    /**
     * @return endDateBefore
     */
    public String getEndDateBefore() {
        return this.endDateBefore;
    }

    /**
     * @return executedBy
     */
    public String getExecutedBy() {
        return this.executedBy;
    }

    /**
     * @return executionId
     */
    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * @return includeChildExecution
     */
    public Boolean getIncludeChildExecution() {
        return this.includeChildExecution;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return parentExecutionId
     */
    public String getParentExecutionId() {
        return this.parentExecutionId;
    }

    /**
     * @return ramRole
     */
    public String getRamRole() {
        return this.ramRole;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceTemplateName
     */
    public String getResourceTemplateName() {
        return this.resourceTemplateName;
    }

    /**
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return startDateAfter
     */
    public String getStartDateAfter() {
        return this.startDateAfter;
    }

    /**
     * @return startDateBefore
     */
    public String getStartDateBefore() {
        return this.startDateBefore;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, ? > getTags() {
        return this.tags;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<ListExecutionsRequest, Builder> {
        private String categories; 
        private String category; 
        private String depth; 
        private String description; 
        private String endDateAfter; 
        private String endDateBefore; 
        private String executedBy; 
        private String executionId; 
        private Boolean includeChildExecution; 
        private Integer maxResults; 
        private String mode; 
        private String nextToken; 
        private String parentExecutionId; 
        private String ramRole; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceId; 
        private String resourceTemplateName; 
        private String sortField; 
        private String sortOrder; 
        private String startDateAfter; 
        private String startDateBefore; 
        private String status; 
        private java.util.Map < String, ? > tags; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(ListExecutionsRequest request) {
            super(request);
            this.categories = request.categories;
            this.category = request.category;
            this.depth = request.depth;
            this.description = request.description;
            this.endDateAfter = request.endDateAfter;
            this.endDateBefore = request.endDateBefore;
            this.executedBy = request.executedBy;
            this.executionId = request.executionId;
            this.includeChildExecution = request.includeChildExecution;
            this.maxResults = request.maxResults;
            this.mode = request.mode;
            this.nextToken = request.nextToken;
            this.parentExecutionId = request.parentExecutionId;
            this.ramRole = request.ramRole;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceId = request.resourceId;
            this.resourceTemplateName = request.resourceTemplateName;
            this.sortField = request.sortField;
            this.sortOrder = request.sortOrder;
            this.startDateAfter = request.startDateAfter;
            this.startDateBefore = request.startDateBefore;
            this.status = request.status;
            this.tags = request.tags;
            this.templateName = request.templateName;
        } 

        /**
         * The types of the execution template. Valid values: Other, TimerTrigger, EventTrigger, and AlarmTrigger. You can specify only one of the Categories and Category parameters. We recommend that you specify Categories.
         */
        public Builder categories(String categories) {
            this.putQueryParameter("Categories", categories);
            this.categories = categories;
            return this;
        }

        /**
         * The type of the execution template. Valid values: Other, TimerTrigger, EventTrigger, and AlarmTrigger.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The depth of execution. Valid values: RootDepth and FirstChildDepth. If you set this parameter to RootDepth, only the parent execution is returned. If you set this parameter to FirstChildDepth, only the child executions at the first level are returned. You can specify only one of the Depth and IncludeChildExecution parameters. We recommend that you specify Depth.
         */
        public Builder depth(String depth) {
            this.putQueryParameter("Depth", depth);
            this.depth = depth;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The earliest end time. The executions that stop running at or later than the specified time are queried.
         */
        public Builder endDateAfter(String endDateAfter) {
            this.putQueryParameter("EndDateAfter", endDateAfter);
            this.endDateAfter = endDateAfter;
            return this;
        }

        /**
         * The latest end time. The executions that stop running at or earlier than the specified time are queried.
         */
        public Builder endDateBefore(String endDateBefore) {
            this.putQueryParameter("EndDateBefore", endDateBefore);
            this.endDateBefore = endDateBefore;
            return this;
        }

        /**
         * The executor.
         */
        public Builder executedBy(String executedBy) {
            this.putQueryParameter("ExecutedBy", executedBy);
            this.executedBy = executedBy;
            return this;
        }

        /**
         * The ID of the execution.
         */
        public Builder executionId(String executionId) {
            this.putQueryParameter("ExecutionId", executionId);
            this.executionId = executionId;
            return this;
        }

        /**
         * Specifies whether to include child executions. Default value: False.
         */
        public Builder includeChildExecution(Boolean includeChildExecution) {
            this.putQueryParameter("IncludeChildExecution", includeChildExecution);
            this.includeChildExecution = includeChildExecution;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 10 to 100. Default value: 50.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The execution mode. Valid values:
         * <p>
         * 
         * *   **Automatic**
         * *   **Debug**
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * The token that is used to retrieve the next page of results.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the parent execution.
         */
        public Builder parentExecutionId(String parentExecutionId) {
            this.putQueryParameter("ParentExecutionId", parentExecutionId);
            this.parentExecutionId = parentExecutionId;
            return this;
        }

        /**
         * The RAM role.
         */
        public Builder ramRole(String ramRole) {
            this.putQueryParameter("RamRole", ramRole);
            this.ramRole = ramRole;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the instances you want to query belong.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the Elastic Compute Service (ECS) resource.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The name of the resource template.
         */
        public Builder resourceTemplateName(String resourceTemplateName) {
            this.putQueryParameter("ResourceTemplateName", resourceTemplateName);
            this.resourceTemplateName = resourceTemplateName;
            return this;
        }

        /**
         * The field that is used to sort the executions to query. Valid values:
         * <p>
         * 
         * *   **StartDate**: specifies that the executions are sorted based on the time when they are created. This is the default value.
         * *   **EndDate**: specifies that the executions are sorted based on the time when they stop running.
         * *   **Status**: specifies that the executions are sorted based on their states.
         */
        public Builder sortField(String sortField) {
            this.putQueryParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * The order in which you want to sort the results. Valid values:
         * <p>
         * 
         * *   **Ascending**: ascending order.
         * *   **Descending**: descending order. This is the default value.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The earliest start time. The executions that start to run at or later than the specified time are queried.
         */
        public Builder startDateAfter(String startDateAfter) {
            this.putQueryParameter("StartDateAfter", startDateAfter);
            this.startDateAfter = startDateAfter;
            return this;
        }

        /**
         * The latest start time. The executions that start to run at or earlier than the specified point in time are queried.
         */
        public Builder startDateBefore(String startDateBefore) {
            this.putQueryParameter("StartDateBefore", startDateBefore);
            this.startDateBefore = startDateBefore;
            return this;
        }

        /**
         * The status of the execution. Valid values: Running, Started, Success, Failed, Waiting, Cancelled, Pending, and Skipped.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The tags for the execution.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * The name of the template. All templates whose names contain the specified template name are queried.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public ListExecutionsRequest build() {
            return new ListExecutionsRequest(this);
        } 

    } 

}
