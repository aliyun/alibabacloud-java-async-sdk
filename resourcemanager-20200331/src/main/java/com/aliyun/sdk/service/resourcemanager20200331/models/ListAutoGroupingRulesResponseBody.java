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
 * {@link ListAutoGroupingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAutoGroupingRulesResponseBody</p>
 */
public class ListAutoGroupingRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    private ListAutoGroupingRulesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAutoGroupingRulesResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Rules> rules; 

        /**
         * <p>The maximum number of entries returned for a single request. Valid values: 1 to 50.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried rules.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        public ListAutoGroupingRulesResponseBody build() {
            return new ListAutoGroupingRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAutoGroupingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoGroupingRulesResponseBody</p>
     */
    public static class RuleContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoGroupingScopeCondition")
        private String autoGroupingScopeCondition;

        @com.aliyun.core.annotation.NameInMap("RuleContentId")
        private String ruleContentId;

        @com.aliyun.core.annotation.NameInMap("TargetResourceGroupCondition")
        private String targetResourceGroupCondition;

        private RuleContents(Builder builder) {
            this.autoGroupingScopeCondition = builder.autoGroupingScopeCondition;
            this.ruleContentId = builder.ruleContentId;
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
         * @return ruleContentId
         */
        public String getRuleContentId() {
            return this.ruleContentId;
        }

        /**
         * @return targetResourceGroupCondition
         */
        public String getTargetResourceGroupCondition() {
            return this.targetResourceGroupCondition;
        }

        public static final class Builder {
            private String autoGroupingScopeCondition; 
            private String ruleContentId; 
            private String targetResourceGroupCondition; 

            /**
             * <p>The condition for the range of resources that are automatically transferred.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;children&quot;:[{&quot;desired&quot;:&quot;{&quot;env&quot;:&quot;online&quot;, &quot;project&quot;:&quot;A&quot;}&quot;,&quot;featurePath&quot;:&quot;$.tags&quot;,&quot;featureSource&quot;:&quot;RESOURCE&quot;,&quot;operator&quot;:&quot;TagMatchAll&quot;}],&quot;operator&quot;:&quot;and&quot;}</p>
             */
            public Builder autoGroupingScopeCondition(String autoGroupingScopeCondition) {
                this.autoGroupingScopeCondition = autoGroupingScopeCondition;
                return this;
            }

            /**
             * <p>The ID of the content record.</p>
             * 
             * <strong>example:</strong>
             * <p>grc-acfo******fwybpq</p>
             */
            public Builder ruleContentId(String ruleContentId) {
                this.ruleContentId = ruleContentId;
                return this;
            }

            /**
             * <p>The condition for the destination resource group.</p>
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
    /**
     * 
     * {@link ListAutoGroupingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoGroupingRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExcludeRegionIdsScope")
        private String excludeRegionIdsScope;

        @com.aliyun.core.annotation.NameInMap("ExcludeResourceGroupIdsScope")
        private String excludeResourceGroupIdsScope;

        @com.aliyun.core.annotation.NameInMap("ExcludeResourceIdsScope")
        private String excludeResourceIdsScope;

        @com.aliyun.core.annotation.NameInMap("ExcludeResourceTypesScope")
        private String excludeResourceTypesScope;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("RegionIdsScope")
        private String regionIdsScope;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupIdsScope")
        private String resourceGroupIdsScope;

        @com.aliyun.core.annotation.NameInMap("ResourceIdsScope")
        private String resourceIdsScope;

        @com.aliyun.core.annotation.NameInMap("ResourceTypesScope")
        private String resourceTypesScope;

        @com.aliyun.core.annotation.NameInMap("RuleContents")
        private java.util.List<RuleContents> ruleContents;

        @com.aliyun.core.annotation.NameInMap("RuleDesc")
        private String ruleDesc;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        private Rules(Builder builder) {
            this.createTime = builder.createTime;
            this.excludeRegionIdsScope = builder.excludeRegionIdsScope;
            this.excludeResourceGroupIdsScope = builder.excludeResourceGroupIdsScope;
            this.excludeResourceIdsScope = builder.excludeResourceIdsScope;
            this.excludeResourceTypesScope = builder.excludeResourceTypesScope;
            this.modifyTime = builder.modifyTime;
            this.regionIdsScope = builder.regionIdsScope;
            this.resourceGroupIdsScope = builder.resourceGroupIdsScope;
            this.resourceIdsScope = builder.resourceIdsScope;
            this.resourceTypesScope = builder.resourceTypesScope;
            this.ruleContents = builder.ruleContents;
            this.ruleDesc = builder.ruleDesc;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleType = builder.ruleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
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
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
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

        public static final class Builder {
            private String createTime; 
            private String excludeRegionIdsScope; 
            private String excludeResourceGroupIdsScope; 
            private String excludeResourceIdsScope; 
            private String excludeResourceTypesScope; 
            private String modifyTime; 
            private String regionIdsScope; 
            private String resourceGroupIdsScope; 
            private String resourceIdsScope; 
            private String resourceTypesScope; 
            private java.util.List<RuleContents> ruleContents; 
            private String ruleDesc; 
            private String ruleId; 
            private String ruleName; 
            private String ruleType; 

            /**
             * <p>The time when the rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-01T10:00:00+08:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The IDs of excluded regions. Multiple IDs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou,cn-shanghai</p>
             */
            public Builder excludeRegionIdsScope(String excludeRegionIdsScope) {
                this.excludeRegionIdsScope = excludeRegionIdsScope;
                return this;
            }

            /**
             * <p>The IDs of excluded resource groups. Multiple IDs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekz<strong><strong>ql4b5ea,rg-aek2</strong></strong>akfxykq</p>
             */
            public Builder excludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
                this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
                return this;
            }

            /**
             * <p>The IDs of excluded resources. Multiple IDs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>i-2zee<strong><strong><strong>ym49kfmwis,vpc-5ts6</strong></strong></strong>fnw493g849a</p>
             */
            public Builder excludeResourceIdsScope(String excludeResourceIdsScope) {
                this.excludeResourceIdsScope = excludeResourceIdsScope;
                return this;
            }

            /**
             * <p>The excluded resource types. Multiple resource types are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.instance,vpc.vpc</p>
             */
            public Builder excludeResourceTypesScope(String excludeResourceTypesScope) {
                this.excludeResourceTypesScope = excludeResourceTypesScope;
                return this;
            }

            /**
             * <p>The time when the rule was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-01T10:00:00+08:00</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The IDs of regions. Multiple IDs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou,cn-shanghai</p>
             */
            public Builder regionIdsScope(String regionIdsScope) {
                this.regionIdsScope = regionIdsScope;
                return this;
            }

            /**
             * <p>The IDs of resource groups. Multiple IDs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekz<strong><strong>ql4b5ea,rg-aek2</strong></strong>akfxykq</p>
             */
            public Builder resourceGroupIdsScope(String resourceGroupIdsScope) {
                this.resourceGroupIdsScope = resourceGroupIdsScope;
                return this;
            }

            /**
             * <p>The IDs of resources. Multiple IDs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>i-2zee<strong><strong><strong>ym49kfmwis,vpc-5ts6</strong></strong></strong>fnw493g849a</p>
             */
            public Builder resourceIdsScope(String resourceIdsScope) {
                this.resourceIdsScope = resourceIdsScope;
                return this;
            }

            /**
             * <p>The resource types. Multiple resource types are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.instance,vpc.vpc</p>
             */
            public Builder resourceTypesScope(String resourceTypesScope) {
                this.resourceTypesScope = resourceTypesScope;
                return this;
            }

            /**
             * <p>The content records of the rule.</p>
             */
            public Builder ruleContents(java.util.List<RuleContents> ruleContents) {
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
                this.ruleDesc = ruleDesc;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>gr-acfo******hy6a</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom Transfer Rule for Online Resources of Project A</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The type of the rule. Valid values:</p>
             * <ul>
             * <li>custom_condition: custom transfer rule</li>
             * <li>associated_transfer: transfer rule for associated resources</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom_condition</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
