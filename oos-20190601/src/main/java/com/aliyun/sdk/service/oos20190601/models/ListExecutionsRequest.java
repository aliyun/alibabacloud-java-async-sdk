// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListExecutionsRequest} extends {@link RequestModel}
 *
 * <p>ListExecutionsRequest</p>
 */
public class ListExecutionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Categories")
    private String categories;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Depth")
    private String depth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDateAfter")
    private String endDateAfter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDateBefore")
    private String endDateBefore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutedBy")
    private String executedBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionId")
    private String executionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeChildExecution")
    private Boolean includeChildExecution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentExecutionId")
    private String parentExecutionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamRole")
    private String ramRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTemplateName")
    private String resourceTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortField")
    private String sortField;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDateAfter")
    private String startDateAfter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDateBefore")
    private String startDateBefore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, ?> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
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
    public java.util.Map<String, ?> getTags() {
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
        private java.util.Map<String, ?> tags; 
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
         * <p>The types of the execution template. Valid values: Other, TimerTrigger, EventTrigger, and AlarmTrigger. You can specify only one of the Categories and Category parameters. We recommend that you specify Categories.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;TimerTrigger&quot;、&quot;EventTrigger&quot;]</p>
         */
        public Builder categories(String categories) {
            this.putQueryParameter("Categories", categories);
            this.categories = categories;
            return this;
        }

        /**
         * <p>The type of the execution template. Valid values: Other, TimerTrigger, EventTrigger, and AlarmTrigger.</p>
         * 
         * <strong>example:</strong>
         * <p>Other</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The depth of execution. Valid values: RootDepth and FirstChildDepth. If you set this parameter to RootDepth, only the parent execution is returned. If you set this parameter to FirstChildDepth, only the child executions at the first level are returned. You can specify only one of the Depth and IncludeChildExecution parameters. We recommend that you specify Depth.</p>
         * 
         * <strong>example:</strong>
         * <p>RootDepth</p>
         */
        public Builder depth(String depth) {
            this.putQueryParameter("Depth", depth);
            this.depth = depth;
            return this;
        }

        /**
         * <p>The description of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>MyDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The earliest end time. The executions that stop running at or later than the specified time are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        public Builder endDateAfter(String endDateAfter) {
            this.putQueryParameter("EndDateAfter", endDateAfter);
            this.endDateAfter = endDateAfter;
            return this;
        }

        /**
         * <p>The latest end time. The executions that stop running at or earlier than the specified time are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        public Builder endDateBefore(String endDateBefore) {
            this.putQueryParameter("EndDateBefore", endDateBefore);
            this.endDateBefore = endDateBefore;
            return this;
        }

        /**
         * <p>The executor.</p>
         * 
         * <strong>example:</strong>
         * <p>vme</p>
         */
        public Builder executedBy(String executedBy) {
            this.putQueryParameter("ExecutedBy", executedBy);
            this.executedBy = executedBy;
            return this;
        }

        /**
         * <p>The ID of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>exec-xxx</p>
         */
        public Builder executionId(String executionId) {
            this.putQueryParameter("ExecutionId", executionId);
            this.executionId = executionId;
            return this;
        }

        /**
         * <p>Specifies whether to include child executions. Default value: False.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeChildExecution(Boolean includeChildExecution) {
            this.putQueryParameter("IncludeChildExecution", includeChildExecution);
            this.includeChildExecution = includeChildExecution;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 10 to 100. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The execution mode. Valid values:</p>
         * <ul>
         * <li><strong>Automatic</strong></li>
         * <li><strong>Debug</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Automatic</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctMTJDQzQ</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the parent execution.</p>
         * 
         * <strong>example:</strong>
         * <p>exec-xxx</p>
         */
        public Builder parentExecutionId(String parentExecutionId) {
            this.putQueryParameter("ParentExecutionId", parentExecutionId);
            this.parentExecutionId = parentExecutionId;
            return this;
        }

        /**
         * <p>The RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>OOSServiceRole</p>
         */
        public Builder ramRole(String ramRole) {
            this.putQueryParameter("RamRole", ramRole);
            this.ramRole = ramRole;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instances you want to query belong.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m4******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the Elastic Compute Service (ECS) resource.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxx</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The name of the resource template.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-ECS-TEST</p>
         */
        public Builder resourceTemplateName(String resourceTemplateName) {
            this.putQueryParameter("ResourceTemplateName", resourceTemplateName);
            this.resourceTemplateName = resourceTemplateName;
            return this;
        }

        /**
         * <p>The field that is used to sort the executions to query. Valid values:</p>
         * <ul>
         * <li><strong>StartDate</strong>: specifies that the executions are sorted based on the time when they are created. This is the default value.</li>
         * <li><strong>EndDate</strong>: specifies that the executions are sorted based on the time when they stop running.</li>
         * <li><strong>Status</strong>: specifies that the executions are sorted based on their states.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>StartDate</p>
         */
        public Builder sortField(String sortField) {
            this.putQueryParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * <p>The order in which you want to sort the results. Valid values:</p>
         * <ul>
         * <li><strong>Ascending</strong>: ascending order.</li>
         * <li><strong>Descending</strong>: descending order. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ascending</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>The earliest start time. The executions that start to run at or later than the specified time are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        public Builder startDateAfter(String startDateAfter) {
            this.putQueryParameter("StartDateAfter", startDateAfter);
            this.startDateAfter = startDateAfter;
            return this;
        }

        /**
         * <p>The latest start time. The executions that start to run at or earlier than the specified point in time are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        public Builder startDateBefore(String startDateBefore) {
            this.putQueryParameter("StartDateBefore", startDateBefore);
            this.startDateBefore = startDateBefore;
            return this;
        }

        /**
         * <p>The status of the execution. Valid values: Running, Started, Success, Failed, Waiting, Cancelled, Pending, and Skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tags for the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;v2&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The name of the template. All templates whose names contain the specified template name are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>MyTemplate</p>
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
