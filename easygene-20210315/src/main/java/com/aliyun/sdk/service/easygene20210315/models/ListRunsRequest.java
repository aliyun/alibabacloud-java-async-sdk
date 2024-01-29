// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRunsRequest} extends {@link RequestModel}
 *
 * <p>ListRunsRequest</p>
 */
public class ListRunsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("AppRevision")
    private String appRevision;

    @Query
    @NameInMap("EntityName")
    private String entityName;

    @Query
    @NameInMap("EntityType")
    private String entityType;

    @Query
    @NameInMap("GetTotal")
    private Boolean getTotal;

    @Query
    @NameInMap("IsReversed")
    private Boolean isReversed;

    @Query
    @NameInMap("LabelSelector")
    private String labelSelector;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 2147483647, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("Search")
    private String search;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("SubmissionId")
    private String submissionId;

    @Query
    @NameInMap("Workspace")
    private String workspace;

    private ListRunsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.appRevision = builder.appRevision;
        this.entityName = builder.entityName;
        this.entityType = builder.entityType;
        this.getTotal = builder.getTotal;
        this.isReversed = builder.isReversed;
        this.labelSelector = builder.labelSelector;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.search = builder.search;
        this.status = builder.status;
        this.submissionId = builder.submissionId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRunsRequest create() {
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appRevision
     */
    public String getAppRevision() {
        return this.appRevision;
    }

    /**
     * @return entityName
     */
    public String getEntityName() {
        return this.entityName;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return getTotal
     */
    public Boolean getGetTotal() {
        return this.getTotal;
    }

    /**
     * @return isReversed
     */
    public Boolean getIsReversed() {
        return this.isReversed;
    }

    /**
     * @return labelSelector
     */
    public String getLabelSelector() {
        return this.labelSelector;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return search
     */
    public String getSearch() {
        return this.search;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return submissionId
     */
    public String getSubmissionId() {
        return this.submissionId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ListRunsRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String appRevision; 
        private String entityName; 
        private String entityType; 
        private Boolean getTotal; 
        private Boolean isReversed; 
        private String labelSelector; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderBy; 
        private String search; 
        private String status; 
        private String submissionId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListRunsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.appRevision = request.appRevision;
            this.entityName = request.entityName;
            this.entityType = request.entityType;
            this.getTotal = request.getTotal;
            this.isReversed = request.isReversed;
            this.labelSelector = request.labelSelector;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.search = request.search;
            this.status = request.status;
            this.submissionId = request.submissionId;
            this.workspace = request.workspace;
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
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AppRevision.
         */
        public Builder appRevision(String appRevision) {
            this.putQueryParameter("AppRevision", appRevision);
            this.appRevision = appRevision;
            return this;
        }

        /**
         * EntityName.
         */
        public Builder entityName(String entityName) {
            this.putQueryParameter("EntityName", entityName);
            this.entityName = entityName;
            return this;
        }

        /**
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * GetTotal.
         */
        public Builder getTotal(Boolean getTotal) {
            this.putQueryParameter("GetTotal", getTotal);
            this.getTotal = getTotal;
            return this;
        }

        /**
         * IsReversed.
         */
        public Builder isReversed(Boolean isReversed) {
            this.putQueryParameter("IsReversed", isReversed);
            this.isReversed = isReversed;
            return this;
        }

        /**
         * LabelSelector.
         */
        public Builder labelSelector(String labelSelector) {
            this.putQueryParameter("LabelSelector", labelSelector);
            this.labelSelector = labelSelector;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * Search.
         */
        public Builder search(String search) {
            this.putQueryParameter("Search", search);
            this.search = search;
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
         * SubmissionId.
         */
        public Builder submissionId(String submissionId) {
            this.putQueryParameter("SubmissionId", submissionId);
            this.submissionId = submissionId;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("Workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public ListRunsRequest build() {
            return new ListRunsRequest(this);
        } 

    } 

}
