// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListCustomPrivacyPoliciesForBrandResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomPrivacyPoliciesForBrandResponseBody</p>
 */
public class ListCustomPrivacyPoliciesForBrandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BrandCustomPrivacyPolicies")
    private java.util.List<BrandCustomPrivacyPolicies> brandCustomPrivacyPolicies;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PreviousToken")
    private String previousToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCustomPrivacyPoliciesForBrandResponseBody(Builder builder) {
        this.brandCustomPrivacyPolicies = builder.brandCustomPrivacyPolicies;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.previousToken = builder.previousToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomPrivacyPoliciesForBrandResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brandCustomPrivacyPolicies
     */
    public java.util.List<BrandCustomPrivacyPolicies> getBrandCustomPrivacyPolicies() {
        return this.brandCustomPrivacyPolicies;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return previousToken
     */
    public String getPreviousToken() {
        return this.previousToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<BrandCustomPrivacyPolicies> brandCustomPrivacyPolicies; 
        private Long maxResults; 
        private String nextToken; 
        private String previousToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCustomPrivacyPoliciesForBrandResponseBody model) {
            this.brandCustomPrivacyPolicies = model.brandCustomPrivacyPolicies;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.previousToken = model.previousToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * BrandCustomPrivacyPolicies.
         */
        public Builder brandCustomPrivacyPolicies(java.util.List<BrandCustomPrivacyPolicies> brandCustomPrivacyPolicies) {
            this.brandCustomPrivacyPolicies = brandCustomPrivacyPolicies;
            return this;
        }

        /**
         * <p>分页查询时每页行数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>本次调用返回的查询凭证（Token）值，用于上一次翻页查询。</p>
         * 
         * <strong>example:</strong>
         * <p>PTxxxexample</p>
         */
        public Builder previousToken(String previousToken) {
            this.previousToken = previousToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCustomPrivacyPoliciesForBrandResponseBody build() {
            return new ListCustomPrivacyPoliciesForBrandResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomPrivacyPoliciesForBrandResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomPrivacyPoliciesForBrandResponseBody</p>
     */
    public static class BrandCustomPrivacyPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyId")
        private String customPrivacyPolicyId;

        private BrandCustomPrivacyPolicies(Builder builder) {
            this.customPrivacyPolicyId = builder.customPrivacyPolicyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BrandCustomPrivacyPolicies create() {
            return builder().build();
        }

        /**
         * @return customPrivacyPolicyId
         */
        public String getCustomPrivacyPolicyId() {
            return this.customPrivacyPolicyId;
        }

        public static final class Builder {
            private String customPrivacyPolicyId; 

            private Builder() {
            } 

            private Builder(BrandCustomPrivacyPolicies model) {
                this.customPrivacyPolicyId = model.customPrivacyPolicyId;
            } 

            /**
             * <p>条款ID</p>
             * 
             * <strong>example:</strong>
             * <p>pp_xxxx</p>
             */
            public Builder customPrivacyPolicyId(String customPrivacyPolicyId) {
                this.customPrivacyPolicyId = customPrivacyPolicyId;
                return this;
            }

            public BrandCustomPrivacyPolicies build() {
                return new BrandCustomPrivacyPolicies(this);
            } 

        } 

    }
}
