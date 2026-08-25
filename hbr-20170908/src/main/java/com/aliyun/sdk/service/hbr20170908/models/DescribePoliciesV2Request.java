// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DescribePoliciesV2Request} extends {@link RequestModel}
 *
 * <p>DescribePoliciesV2Request</p>
 */
public class DescribePoliciesV2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountScope")
    private String accountScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accounts")
    private java.util.List<Accounts> accounts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleScope")
    private String ruleScope;

    private DescribePoliciesV2Request(Builder builder) {
        super(builder);
        this.accountScope = builder.accountScope;
        this.accounts = builder.accounts;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.policyId = builder.policyId;
        this.ruleScope = builder.ruleScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePoliciesV2Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountScope
     */
    public String getAccountScope() {
        return this.accountScope;
    }

    /**
     * @return accounts
     */
    public java.util.List<Accounts> getAccounts() {
        return this.accounts;
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
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return ruleScope
     */
    public String getRuleScope() {
        return this.ruleScope;
    }

    public static final class Builder extends Request.Builder<DescribePoliciesV2Request, Builder> {
        private String accountScope; 
        private java.util.List<Accounts> accounts; 
        private Integer maxResults; 
        private String nextToken; 
        private String policyId; 
        private String ruleScope; 

        private Builder() {
            super();
        } 

        private Builder(DescribePoliciesV2Request request) {
            super(request);
            this.accountScope = request.accountScope;
            this.accounts = request.accounts;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.policyId = request.policyId;
            this.ruleScope = request.ruleScope;
        } 

        /**
         * AccountScope.
         */
        public Builder accountScope(String accountScope) {
            this.putBodyParameter("AccountScope", accountScope);
            this.accountScope = accountScope;
            return this;
        }

        /**
         * Accounts.
         */
        public Builder accounts(java.util.List<Accounts> accounts) {
            String accountsShrink = shrink(accounts, "Accounts", "json");
            this.putBodyParameter("Accounts", accountsShrink);
            this.accounts = accounts;
            return this;
        }

        /**
         * <p>The number of results for each query.</p>
         * <p>Valid values: 10 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to obtain the next page of backup policies.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>po-000************2l6</p>
         */
        public Builder policyId(String policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * RuleScope.
         */
        public Builder ruleScope(String ruleScope) {
            this.putBodyParameter("RuleScope", ruleScope);
            this.ruleScope = ruleScope;
            return this;
        }

        @Override
        public DescribePoliciesV2Request build() {
            return new DescribePoliciesV2Request(this);
        } 

    } 

    /**
     * 
     * {@link DescribePoliciesV2Request} extends {@link TeaModel}
     *
     * <p>DescribePoliciesV2Request</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
        private String crossAccountRoleName;

        @com.aliyun.core.annotation.NameInMap("CrossAccountType")
        private String crossAccountType;

        @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
        private Long crossAccountUserId;

        private Accounts(Builder builder) {
            this.crossAccountRoleName = builder.crossAccountRoleName;
            this.crossAccountType = builder.crossAccountType;
            this.crossAccountUserId = builder.crossAccountUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return crossAccountRoleName
         */
        public String getCrossAccountRoleName() {
            return this.crossAccountRoleName;
        }

        /**
         * @return crossAccountType
         */
        public String getCrossAccountType() {
            return this.crossAccountType;
        }

        /**
         * @return crossAccountUserId
         */
        public Long getCrossAccountUserId() {
            return this.crossAccountUserId;
        }

        public static final class Builder {
            private String crossAccountRoleName; 
            private String crossAccountType; 
            private Long crossAccountUserId; 

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.crossAccountRoleName = model.crossAccountRoleName;
                this.crossAccountType = model.crossAccountType;
                this.crossAccountUserId = model.crossAccountUserId;
            } 

            /**
             * CrossAccountRoleName.
             */
            public Builder crossAccountRoleName(String crossAccountRoleName) {
                this.crossAccountRoleName = crossAccountRoleName;
                return this;
            }

            /**
             * CrossAccountType.
             */
            public Builder crossAccountType(String crossAccountType) {
                this.crossAccountType = crossAccountType;
                return this;
            }

            /**
             * CrossAccountUserId.
             */
            public Builder crossAccountUserId(Long crossAccountUserId) {
                this.crossAccountUserId = crossAccountUserId;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
