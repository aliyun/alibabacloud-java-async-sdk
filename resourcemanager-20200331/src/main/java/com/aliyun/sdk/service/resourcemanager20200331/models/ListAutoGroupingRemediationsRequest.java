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
         * <p>The earliest remediation time. This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01 00:00:00</p>
         */
        public Builder earliestRemediationTime(String earliestRemediationTime) {
            this.putQueryParameter("EarliestRemediationTime", earliestRemediationTime);
            this.earliestRemediationTime = earliestRemediationTime;
            return this;
        }

        /**
         * <p>The latest remediation time. This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-01 00:00:00</p>
         */
        public Builder latestRemediationTime(String latestRemediationTime) {
            this.putQueryParameter("LatestRemediationTime", latestRemediationTime);
            this.latestRemediationTime = latestRemediationTime;
            return this;
        }

        /**
         * <p>The maximum number of data entries to return.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. If you leave this parameter empty, the query starts from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The resource ID,</p>
         * 
         * <strong>example:</strong>
         * <p>i-23v38****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The resource type,</p>
         * <p>You can obtain the resource type from the <strong>Resource type</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The rule ID.</p>
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
         * <p>The ID of the Alibaba Cloud service.</p>
         * <p>You can obtain the ID from the <strong>Service code</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder service(String service) {
            this.putQueryParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * <p>The ID of the new resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekz26emqhc****</p>
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
