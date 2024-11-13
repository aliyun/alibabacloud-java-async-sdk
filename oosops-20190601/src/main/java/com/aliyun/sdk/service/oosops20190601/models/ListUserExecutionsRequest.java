// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUserExecutionsRequest} extends {@link RequestModel}
 *
 * <p>ListUserExecutionsRequest</p>
 */
public class ListUserExecutionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliUid;

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
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    private ListUserExecutionsRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
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
        this.sortField = builder.sortField;
        this.sortOrder = builder.sortOrder;
        this.startDateAfter = builder.startDateAfter;
        this.startDateBefore = builder.startDateBefore;
        this.status = builder.status;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserExecutionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
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
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<ListUserExecutionsRequest, Builder> {
        private String aliUid; 
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
        private String sortField; 
        private String sortOrder; 
        private String startDateAfter; 
        private String startDateBefore; 
        private String status; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(ListUserExecutionsRequest request) {
            super(request);
            this.aliUid = request.aliUid;
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
            this.sortField = request.sortField;
            this.sortOrder = request.sortOrder;
            this.startDateAfter = request.startDateAfter;
            this.startDateBefore = request.startDateBefore;
            this.status = request.status;
            this.templateName = request.templateName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder aliUid(String aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
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
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public ListUserExecutionsRequest build() {
            return new ListUserExecutionsRequest(this);
        } 

    } 

}
