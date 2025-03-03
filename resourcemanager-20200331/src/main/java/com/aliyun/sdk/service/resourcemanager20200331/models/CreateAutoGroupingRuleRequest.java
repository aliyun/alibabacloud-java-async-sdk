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
 * {@link CreateAutoGroupingRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateAutoGroupingRuleRequest</p>
 */
public class CreateAutoGroupingRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeRegionIdsScope")
    @com.aliyun.core.annotation.Validation(maxLength = 2000)
    private String excludeRegionIdsScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeResourceGroupIdsScope")
    @com.aliyun.core.annotation.Validation(maxLength = 8000)
    private String excludeResourceGroupIdsScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeResourceIdsScope")
    @com.aliyun.core.annotation.Validation(maxLength = 5000)
    private String excludeResourceIdsScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeResourceTypesScope")
    @com.aliyun.core.annotation.Validation(maxLength = 2000)
    private String excludeResourceTypesScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionIdsScope")
    @com.aliyun.core.annotation.Validation(maxLength = 2000)
    private String regionIdsScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupIdsScope")
    @com.aliyun.core.annotation.Validation(maxLength = 8000)
    private String resourceGroupIdsScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIdsScope")
    @com.aliyun.core.annotation.Validation(maxLength = 5000)
    private String resourceIdsScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypesScope")
    @com.aliyun.core.annotation.Validation(maxLength = 2000)
    private String resourceTypesScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleContents")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RuleContents> ruleContents;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleDesc")
    @com.aliyun.core.annotation.Validation(maxLength = 512)
    private String ruleDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleType;

    private CreateAutoGroupingRuleRequest(Builder builder) {
        super(builder);
        this.excludeRegionIdsScope = builder.excludeRegionIdsScope;
        this.excludeResourceGroupIdsScope = builder.excludeResourceGroupIdsScope;
        this.excludeResourceIdsScope = builder.excludeResourceIdsScope;
        this.excludeResourceTypesScope = builder.excludeResourceTypesScope;
        this.regionIdsScope = builder.regionIdsScope;
        this.resourceGroupIdsScope = builder.resourceGroupIdsScope;
        this.resourceIdsScope = builder.resourceIdsScope;
        this.resourceTypesScope = builder.resourceTypesScope;
        this.ruleContents = builder.ruleContents;
        this.ruleDesc = builder.ruleDesc;
        this.ruleName = builder.ruleName;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAutoGroupingRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return excludeRegionIdsScope
     */
    public String getExcludeRegionIdsScope() {
        return this.excludeRegionIdsScope;
    }

    /**
     * @return excludeResourceGroupIdsScope
     */
    public String getExcludeResourceGroupIdsScope() {
        return this.excludeResourceGroupIdsScope;
    }

    /**
     * @return excludeResourceIdsScope
     */
    public String getExcludeResourceIdsScope() {
        return this.excludeResourceIdsScope;
    }

    /**
     * @return excludeResourceTypesScope
     */
    public String getExcludeResourceTypesScope() {
        return this.excludeResourceTypesScope;
    }

    /**
     * @return regionIdsScope
     */
    public String getRegionIdsScope() {
        return this.regionIdsScope;
    }

    /**
     * @return resourceGroupIdsScope
     */
    public String getResourceGroupIdsScope() {
        return this.resourceGroupIdsScope;
    }

    /**
     * @return resourceIdsScope
     */
    public String getResourceIdsScope() {
        return this.resourceIdsScope;
    }

    /**
     * @return resourceTypesScope
     */
    public String getResourceTypesScope() {
        return this.resourceTypesScope;
    }

    /**
     * @return ruleContents
     */
    public java.util.List<RuleContents> getRuleContents() {
        return this.ruleContents;
    }

    /**
     * @return ruleDesc
     */
    public String getRuleDesc() {
        return this.ruleDesc;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    public static final class Builder extends Request.Builder<CreateAutoGroupingRuleRequest, Builder> {
        private String excludeRegionIdsScope; 
        private String excludeResourceGroupIdsScope; 
        private String excludeResourceIdsScope; 
        private String excludeResourceTypesScope; 
        private String regionIdsScope; 
        private String resourceGroupIdsScope; 
        private String resourceIdsScope; 
        private String resourceTypesScope; 
        private java.util.List<RuleContents> ruleContents; 
        private String ruleDesc; 
        private String ruleName; 
        private String ruleType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAutoGroupingRuleRequest request) {
            super(request);
            this.excludeRegionIdsScope = request.excludeRegionIdsScope;
            this.excludeResourceGroupIdsScope = request.excludeResourceGroupIdsScope;
            this.excludeResourceIdsScope = request.excludeResourceIdsScope;
            this.excludeResourceTypesScope = request.excludeResourceTypesScope;
            this.regionIdsScope = request.regionIdsScope;
            this.resourceGroupIdsScope = request.resourceGroupIdsScope;
            this.resourceIdsScope = request.resourceIdsScope;
            this.resourceTypesScope = request.resourceTypesScope;
            this.ruleContents = request.ruleContents;
            this.ruleDesc = request.ruleDesc;
            this.ruleName = request.ruleName;
            this.ruleType = request.ruleType;
        } 

        /**
         * <p>The IDs of regions to be excluded. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing,cn-guangzhou</p>
         */
        public Builder excludeRegionIdsScope(String excludeRegionIdsScope) {
            this.putQueryParameter("ExcludeRegionIdsScope", excludeRegionIdsScope);
            this.excludeRegionIdsScope = excludeRegionIdsScope;
            return this;
        }

        /**
         * <p>The IDs of resource groups to be excluded. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekz<strong><strong><strong>zj2oi,rg-aekz</strong></strong></strong>r62ua</p>
         */
        public Builder excludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
            this.putQueryParameter("ExcludeResourceGroupIdsScope", excludeResourceGroupIdsScope);
            this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
            return this;
        }

        /**
         * <p>The IDs of resources to be excluded. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>pc-uf6p******4h784y,rmq-cn-******ny0y</p>
         */
        public Builder excludeResourceIdsScope(String excludeResourceIdsScope) {
            this.putQueryParameter("ExcludeResourceIdsScope", excludeResourceIdsScope);
            this.excludeResourceIdsScope = excludeResourceIdsScope;
            return this;
        }

        /**
         * <p>The resource types to be excluded. Separate multiple resource types with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>mse.cluster,slb.loadbalancer</p>
         */
        public Builder excludeResourceTypesScope(String excludeResourceTypesScope) {
            this.putQueryParameter("ExcludeResourceTypesScope", excludeResourceTypesScope);
            this.excludeResourceTypesScope = excludeResourceTypesScope;
            return this;
        }

        /**
         * <p>The IDs of regions. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou,cn-shanghai</p>
         */
        public Builder regionIdsScope(String regionIdsScope) {
            this.putQueryParameter("RegionIdsScope", regionIdsScope);
            this.regionIdsScope = regionIdsScope;
            return this;
        }

        /**
         * <p>The IDs of resource groups. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekz<strong><strong><strong>4b5ea,rg-aek2</strong></strong></strong>fxykq</p>
         */
        public Builder resourceGroupIdsScope(String resourceGroupIdsScope) {
            this.putQueryParameter("ResourceGroupIdsScope", resourceGroupIdsScope);
            this.resourceGroupIdsScope = resourceGroupIdsScope;
            return this;
        }

        /**
         * <p>The IDs of resources. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zee<strong><strong><strong>ym49kfmwis,vpc-5ts6</strong></strong></strong>fnw493g849a</p>
         */
        public Builder resourceIdsScope(String resourceIdsScope) {
            this.putQueryParameter("ResourceIdsScope", resourceIdsScope);
            this.resourceIdsScope = resourceIdsScope;
            return this;
        }

        /**
         * <p>The resource types. Separate multiple resource types with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>rds.dbinstance,oss.bucket</p>
         */
        public Builder resourceTypesScope(String resourceTypesScope) {
            this.putQueryParameter("ResourceTypesScope", resourceTypesScope);
            this.resourceTypesScope = resourceTypesScope;
            return this;
        }

        /**
         * <p>The content records of the rule.</p>
         * <p>This parameter is required.</p>
         */
        public Builder ruleContents(java.util.List<RuleContents> ruleContents) {
            this.putQueryParameter("RuleContents", ruleContents);
            this.ruleContents = ruleContents;
            return this;
        }

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Transfer resources to which the {&quot;env&quot;: &quot;online&quot;} and {&quot;project&quot;: &quot;A&quot;} tags are added to the resource group rg-aek2********qcy.</p>
         */
        public Builder ruleDesc(String ruleDesc) {
            this.putQueryParameter("RuleDesc", ruleDesc);
            this.ruleDesc = ruleDesc;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom Transfer Rule for Online Resources of Project A</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li>custom_condition: custom transfer rule</li>
         * <li>associated_transfer: transfer rule for associated resources</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_condition</p>
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        @Override
        public CreateAutoGroupingRuleRequest build() {
            return new CreateAutoGroupingRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAutoGroupingRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateAutoGroupingRuleRequest</p>
     */
    public static class RuleContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoGroupingScopeCondition")
        @com.aliyun.core.annotation.Validation(maxLength = 50000)
        private String autoGroupingScopeCondition;

        @com.aliyun.core.annotation.NameInMap("TargetResourceGroupCondition")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 255)
        private String targetResourceGroupCondition;

        private RuleContents(Builder builder) {
            this.autoGroupingScopeCondition = builder.autoGroupingScopeCondition;
            this.targetResourceGroupCondition = builder.targetResourceGroupCondition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleContents create() {
            return builder().build();
        }

        /**
         * @return autoGroupingScopeCondition
         */
        public String getAutoGroupingScopeCondition() {
            return this.autoGroupingScopeCondition;
        }

        /**
         * @return targetResourceGroupCondition
         */
        public String getTargetResourceGroupCondition() {
            return this.targetResourceGroupCondition;
        }

        public static final class Builder {
            private String autoGroupingScopeCondition; 
            private String targetResourceGroupCondition; 

            /**
             * <p>The condition for the range of resources to be automatically transferred.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;children&quot;:[{&quot;desired&quot;:&quot;{&quot;env&quot;:&quot;online&quot;, &quot;project&quot;:&quot;A&quot;}&quot;,&quot;featurePath&quot;:&quot;$.tags&quot;,&quot;featureSource&quot;:&quot;RESOURCE&quot;,&quot;operator&quot;:&quot;TagMatchAll&quot;}],&quot;operator&quot;:&quot;and&quot;}</p>
             */
            public Builder autoGroupingScopeCondition(String autoGroupingScopeCondition) {
                this.autoGroupingScopeCondition = autoGroupingScopeCondition;
                return this;
            }

            /**
             * <p>The condition for the destination resource group.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;children&quot;:[{&quot;desired&quot;:&quot;rg-aek2********qcy&quot;,&quot;featurePath&quot;:&quot;$.resourceGroupId&quot;,&quot;featureSource&quot;:&quot;RESOURCE&quot;,&quot;operator&quot;:&quot;StringEquals&quot;}],&quot;operator&quot;:&quot;and&quot;}</p>
             */
            public Builder targetResourceGroupCondition(String targetResourceGroupCondition) {
                this.targetResourceGroupCondition = targetResourceGroupCondition;
                return this;
            }

            public RuleContents build() {
                return new RuleContents(this);
            } 

        } 

    }
}
