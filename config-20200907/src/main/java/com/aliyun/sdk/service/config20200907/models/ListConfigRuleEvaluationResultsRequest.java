// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigRuleEvaluationResultsRequest} extends {@link RequestModel}
 *
 * <p>ListConfigRuleEvaluationResultsRequest</p>
 */
public class ListConfigRuleEvaluationResultsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompliancePackId")
    private String compliancePackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComplianceType")
    private String complianceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
    private String configRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Regions")
    private String regions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupIds")
    private String resourceGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private String resourceTypes;

    private ListConfigRuleEvaluationResultsRequest(Builder builder) {
        super(builder);
        this.compliancePackId = builder.compliancePackId;
        this.complianceType = builder.complianceType;
        this.configRuleId = builder.configRuleId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regions = builder.regions;
        this.resourceGroupIds = builder.resourceGroupIds;
        this.resourceTypes = builder.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigRuleEvaluationResultsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compliancePackId
     */
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    /**
     * @return complianceType
     */
    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * @return configRuleId
     */
    public String getConfigRuleId() {
        return this.configRuleId;
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
     * @return regions
     */
    public String getRegions() {
        return this.regions;
    }

    /**
     * @return resourceGroupIds
     */
    public String getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    /**
     * @return resourceTypes
     */
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public static final class Builder extends Request.Builder<ListConfigRuleEvaluationResultsRequest, Builder> {
        private String compliancePackId; 
        private String complianceType; 
        private String configRuleId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regions; 
        private String resourceGroupIds; 
        private String resourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(ListConfigRuleEvaluationResultsRequest request) {
            super(request);
            this.compliancePackId = request.compliancePackId;
            this.complianceType = request.complianceType;
            this.configRuleId = request.configRuleId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regions = request.regions;
            this.resourceGroupIds = request.resourceGroupIds;
            this.resourceTypes = request.resourceTypes;
        } 

        /**
         * The ID of the compliance package.
         * <p>
         * 
         * For more information about how to obtain the ID of a compliance package, see [ListCompliancePacks](~~263332~~).
         */
        public Builder compliancePackId(String compliancePackId) {
            this.putQueryParameter("CompliancePackId", compliancePackId);
            this.compliancePackId = compliancePackId;
            return this;
        }

        /**
         * The compliance evaluation result of the resource. Valid values:
         * <p>
         * 
         * *   COMPLIANT: The resource is evaluated as compliant.
         * *   NON_COMPLIANT: The resource is evaluated as non-compliant.
         * *   NOT_APPLICABLE: The rule does not apply to the resources.
         * *   INSUFFICIENT_DATA: No data is available.
         * *   IGNORED: The resource is ignored during compliance evaluation.
         */
        public Builder complianceType(String complianceType) {
            this.putQueryParameter("ComplianceType", complianceType);
            this.complianceType = complianceType;
            return this;
        }

        /**
         * The rule ID.
         * <p>
         * 
         * You can call the [ListConfigRules](~~169607~~) operation to obtain the rule ID.
         */
        public Builder configRuleId(String configRuleId) {
            this.putQueryParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * The maximum number of entries to return for a single request. Valid values: 1 to 100.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of `NextToken`.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the region where the resources that you want to evaluate reside. Separate multiple region IDs with commas (,).
         */
        public Builder regions(String regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * The ID of the resource group to which the resources that you want to evaluate belong. Separate multiple resource group IDs with commas (,).
         */
        public Builder resourceGroupIds(String resourceGroupIds) {
            this.putQueryParameter("ResourceGroupIds", resourceGroupIds);
            this.resourceGroupIds = resourceGroupIds;
            return this;
        }

        /**
         * The type of the resources that you want to evaluate. Separate multiple resource types with commas (,).
         */
        public Builder resourceTypes(String resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        @Override
        public ListConfigRuleEvaluationResultsRequest build() {
            return new ListConfigRuleEvaluationResultsRequest(this);
        } 

    } 

}
