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
    @NameInMap("Category")
    private String category;

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
        this.category = builder.category;
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
     * @return category
     */
    public String getCategory() {
        return this.category;
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
        private String category; 
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
            this.category = request.category;
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
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * EndDateAfter.
         */
        public Builder endDateAfter(String endDateAfter) {
            this.putQueryParameter("EndDateAfter", endDateAfter);
            this.endDateAfter = endDateAfter;
            return this;
        }

        /**
         * EndDateBefore.
         */
        public Builder endDateBefore(String endDateBefore) {
            this.putQueryParameter("EndDateBefore", endDateBefore);
            this.endDateBefore = endDateBefore;
            return this;
        }

        /**
         * ExecutedBy.
         */
        public Builder executedBy(String executedBy) {
            this.putQueryParameter("ExecutedBy", executedBy);
            this.executedBy = executedBy;
            return this;
        }

        /**
         * ExecutionId.
         */
        public Builder executionId(String executionId) {
            this.putQueryParameter("ExecutionId", executionId);
            this.executionId = executionId;
            return this;
        }

        /**
         * IncludeChildExecution.
         */
        public Builder includeChildExecution(Boolean includeChildExecution) {
            this.putQueryParameter("IncludeChildExecution", includeChildExecution);
            this.includeChildExecution = includeChildExecution;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
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
         * ParentExecutionId.
         */
        public Builder parentExecutionId(String parentExecutionId) {
            this.putQueryParameter("ParentExecutionId", parentExecutionId);
            this.parentExecutionId = parentExecutionId;
            return this;
        }

        /**
         * RamRole.
         */
        public Builder ramRole(String ramRole) {
            this.putQueryParameter("RamRole", ramRole);
            this.ramRole = ramRole;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceTemplateName.
         */
        public Builder resourceTemplateName(String resourceTemplateName) {
            this.putQueryParameter("ResourceTemplateName", resourceTemplateName);
            this.resourceTemplateName = resourceTemplateName;
            return this;
        }

        /**
         * SortField.
         */
        public Builder sortField(String sortField) {
            this.putQueryParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * SortOrder.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * StartDateAfter.
         */
        public Builder startDateAfter(String startDateAfter) {
            this.putQueryParameter("StartDateAfter", startDateAfter);
            this.startDateAfter = startDateAfter;
            return this;
        }

        /**
         * StartDateBefore.
         */
        public Builder startDateBefore(String startDateBefore) {
            this.putQueryParameter("StartDateBefore", startDateBefore);
            this.startDateBefore = startDateBefore;
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
         * Tags.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * TemplateName.
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
