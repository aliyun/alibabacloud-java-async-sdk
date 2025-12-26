// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeRelatedDefenseRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeRelatedDefenseRulesRequest</p>
 */
public class DescribeRelatedDefenseRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefenseScene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defenseScene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefenseType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defenseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    private DescribeRelatedDefenseRulesRequest(Builder builder) {
        super(builder);
        this.defenseScene = builder.defenseScene;
        this.defenseType = builder.defenseType;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRelatedDefenseRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defenseScene
     */
    public String getDefenseScene() {
        return this.defenseScene;
    }

    /**
     * @return defenseType
     */
    public String getDefenseType() {
        return this.defenseType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DescribeRelatedDefenseRulesRequest, Builder> {
        private String defenseScene; 
        private String defenseType; 
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRelatedDefenseRulesRequest request) {
            super(request);
            this.defenseScene = request.defenseScene;
            this.defenseType = request.defenseType;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>address_book</p>
         */
        public Builder defenseScene(String defenseScene) {
            this.putQueryParameter("DefenseScene", defenseScene);
            this.defenseScene = defenseScene;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        public Builder defenseType(String defenseType) {
            this.putQueryParameter("DefenseType", defenseType);
            this.defenseType = defenseType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf-cn-zz11sr5****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceManagerResourceGroupId.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DescribeRelatedDefenseRulesRequest build() {
            return new DescribeRelatedDefenseRulesRequest(this);
        } 

    } 

}
