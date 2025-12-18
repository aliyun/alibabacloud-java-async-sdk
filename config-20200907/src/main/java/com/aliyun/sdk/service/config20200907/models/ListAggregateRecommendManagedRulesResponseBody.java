// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListAggregateRecommendManagedRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAggregateRecommendManagedRulesResponseBody</p>
 */
public class ListAggregateRecommendManagedRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecommendedManagedRules")
    private RecommendedManagedRules recommendedManagedRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAggregateRecommendManagedRulesResponseBody(Builder builder) {
        this.recommendedManagedRules = builder.recommendedManagedRules;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateRecommendManagedRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recommendedManagedRules
     */
    public RecommendedManagedRules getRecommendedManagedRules() {
        return this.recommendedManagedRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RecommendedManagedRules recommendedManagedRules; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAggregateRecommendManagedRulesResponseBody model) {
            this.recommendedManagedRules = model.recommendedManagedRules;
            this.requestId = model.requestId;
        } 

        /**
         * RecommendedManagedRules.
         */
        public Builder recommendedManagedRules(RecommendedManagedRules recommendedManagedRules) {
            this.recommendedManagedRules = recommendedManagedRules;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6CE4ABA1-9A57-41A9-8EA9-E8B17D4671CD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAggregateRecommendManagedRulesResponseBody build() {
            return new ListAggregateRecommendManagedRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAggregateRecommendManagedRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateRecommendManagedRulesResponseBody</p>
     */
    public static class RecommendedManagedRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigRuleName")
        private String configRuleName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("ResourceTypeScope")
        private String resourceTypeScope;

        private RecommendedManagedRuleList(Builder builder) {
            this.configRuleName = builder.configRuleName;
            this.description = builder.description;
            this.identifier = builder.identifier;
            this.resourceTypeScope = builder.resourceTypeScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendedManagedRuleList create() {
            return builder().build();
        }

        /**
         * @return configRuleName
         */
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return resourceTypeScope
         */
        public String getResourceTypeScope() {
            return this.resourceTypeScope;
        }

        public static final class Builder {
            private String configRuleName; 
            private String description; 
            private String identifier; 
            private String resourceTypeScope; 

            private Builder() {
            } 

            private Builder(RecommendedManagedRuleList model) {
                this.configRuleName = model.configRuleName;
                this.description = model.description;
                this.identifier = model.identifier;
                this.resourceTypeScope = model.resourceTypeScope;
            } 

            /**
             * ConfigRuleName.
             */
            public Builder configRuleName(String configRuleName) {
                this.configRuleName = configRuleName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * ResourceTypeScope.
             */
            public Builder resourceTypeScope(String resourceTypeScope) {
                this.resourceTypeScope = resourceTypeScope;
                return this;
            }

            public RecommendedManagedRuleList build() {
                return new RecommendedManagedRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAggregateRecommendManagedRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateRecommendManagedRulesResponseBody</p>
     */
    public static class RecommendedManagedRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("RecommendedManagedRuleList")
        private java.util.List<RecommendedManagedRuleList> recommendedManagedRuleList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private RecommendedManagedRules(Builder builder) {
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.recommendedManagedRuleList = builder.recommendedManagedRuleList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendedManagedRules create() {
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
         * @return recommendedManagedRuleList
         */
        public java.util.List<RecommendedManagedRuleList> getRecommendedManagedRuleList() {
            return this.recommendedManagedRuleList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer maxResults; 
            private String nextToken; 
            private java.util.List<RecommendedManagedRuleList> recommendedManagedRuleList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(RecommendedManagedRules model) {
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.recommendedManagedRuleList = model.recommendedManagedRuleList;
                this.totalCount = model.totalCount;
            } 

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * RecommendedManagedRuleList.
             */
            public Builder recommendedManagedRuleList(java.util.List<RecommendedManagedRuleList> recommendedManagedRuleList) {
                this.recommendedManagedRuleList = recommendedManagedRuleList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public RecommendedManagedRules build() {
                return new RecommendedManagedRules(this);
            } 

        } 

    }
}
