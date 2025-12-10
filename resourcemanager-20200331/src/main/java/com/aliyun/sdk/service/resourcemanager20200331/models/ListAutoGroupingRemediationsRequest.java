// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link ListAutoGroupingRemediationsRequest} extends {@link RequestModel}
 *
 * <p>ListAutoGroupingRemediationsRequest</p>
 */
public class ListAutoGroupingRemediationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EarliestRemediationTime")
    private String earliestRemediationTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LatestRemediationTime")
    private String latestRemediationTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 50)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Service")
    private String service;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetResourceGroupId")
    private String targetResourceGroupId;

    private ListAutoGroupingRemediationsRequest(Builder builder) {
        super(builder);
        this.earliestRemediationTime = builder.earliestRemediationTime;
        this.latestRemediationTime = builder.latestRemediationTime;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.ruleId = builder.ruleId;
        this.service = builder.service;
        this.targetResourceGroupId = builder.targetResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAutoGroupingRemediationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return earliestRemediationTime
     */
    public String getEarliestRemediationTime() {
        return this.earliestRemediationTime;
    }

    /**
     * @return latestRemediationTime
     */
    public String getLatestRemediationTime() {
        return this.latestRemediationTime;
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    /**
     * @return targetResourceGroupId
     */
    public String getTargetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    public static final class Builder extends Request.Builder<ListAutoGroupingRemediationsRequest, Builder> {
        private String earliestRemediationTime; 
        private String latestRemediationTime; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceId; 
        private String resourceType; 
        private String ruleId; 
        private String service; 
        private String targetResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListAutoGroupingRemediationsRequest request) {
            super(request);
            this.earliestRemediationTime = request.earliestRemediationTime;
            this.latestRemediationTime = request.latestRemediationTime;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.ruleId = request.ruleId;
            this.service = request.service;
            this.targetResourceGroupId = request.targetResourceGroupId;
        } 

        /**
         * EarliestRemediationTime.
         */
        public Builder earliestRemediationTime(String earliestRemediationTime) {
            this.putQueryParameter("EarliestRemediationTime", earliestRemediationTime);
            this.earliestRemediationTime = earliestRemediationTime;
            return this;
        }

        /**
         * LatestRemediationTime.
         */
        public Builder latestRemediationTime(String latestRemediationTime) {
            this.putQueryParameter("LatestRemediationTime", latestRemediationTime);
            this.latestRemediationTime = latestRemediationTime;
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
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gr-acfnugygwms32yy</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * Service.
         */
        public Builder service(String service) {
            this.putQueryParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * TargetResourceGroupId.
         */
        public Builder targetResourceGroupId(String targetResourceGroupId) {
            this.putQueryParameter("TargetResourceGroupId", targetResourceGroupId);
            this.targetResourceGroupId = targetResourceGroupId;
            return this;
        }

        @Override
        public ListAutoGroupingRemediationsRequest build() {
            return new ListAutoGroupingRemediationsRequest(this);
        } 

    } 

}
