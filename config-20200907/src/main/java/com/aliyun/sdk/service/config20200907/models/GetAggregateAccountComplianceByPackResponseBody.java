// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateAccountComplianceByPackResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateAccountComplianceByPackResponseBody</p>
 */
public class GetAggregateAccountComplianceByPackResponseBody extends TeaModel {
    @NameInMap("AccountComplianceResult")
    private AccountComplianceResult accountComplianceResult;

    @NameInMap("RequestId")
    private String requestId;

    private GetAggregateAccountComplianceByPackResponseBody(Builder builder) {
        this.accountComplianceResult = builder.accountComplianceResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateAccountComplianceByPackResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountComplianceResult
     */
    public AccountComplianceResult getAccountComplianceResult() {
        return this.accountComplianceResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccountComplianceResult accountComplianceResult; 
        private String requestId; 

        /**
         * The compliance evaluation results of member accounts for which the compliance package takes effect in an account group.
         */
        public Builder accountComplianceResult(AccountComplianceResult accountComplianceResult) {
            this.accountComplianceResult = accountComplianceResult;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAggregateAccountComplianceByPackResponseBody build() {
            return new GetAggregateAccountComplianceByPackResponseBody(this);
        } 

    } 

    public static class AccountCompliances extends TeaModel {
        @NameInMap("AccountId")
        private Long accountId;

        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("ComplianceType")
        private String complianceType;

        private AccountCompliances(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.complianceType = builder.complianceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountCompliances create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return complianceType
         */
        public String getComplianceType() {
            return this.complianceType;
        }

        public static final class Builder {
            private Long accountId; 
            private String accountName; 
            private String complianceType; 

            /**
             * The ID of the member account in the account group.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The name of the member account in the account group.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The compliance evaluation result. Valid values:
             * <p>
             * 
             * *   COMPLIANT: The resource was evaluated as compliant.
             * *   NON_COMPLIANT: The resource was evaluated as incompliant.
             * *   NOT_APPLICABLE: The rule did not apply to your resource.
             * *   INSUFFICIENT_DATA: No resource data was available.
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            public AccountCompliances build() {
                return new AccountCompliances(this);
            } 

        } 

    }
    public static class AccountComplianceResult extends TeaModel {
        @NameInMap("AccountCompliances")
        private java.util.List < AccountCompliances> accountCompliances;

        @NameInMap("CompliancePackId")
        private String compliancePackId;

        @NameInMap("NonCompliantCount")
        private Integer nonCompliantCount;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private AccountComplianceResult(Builder builder) {
            this.accountCompliances = builder.accountCompliances;
            this.compliancePackId = builder.compliancePackId;
            this.nonCompliantCount = builder.nonCompliantCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountComplianceResult create() {
            return builder().build();
        }

        /**
         * @return accountCompliances
         */
        public java.util.List < AccountCompliances> getAccountCompliances() {
            return this.accountCompliances;
        }

        /**
         * @return compliancePackId
         */
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        /**
         * @return nonCompliantCount
         */
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < AccountCompliances> accountCompliances; 
            private String compliancePackId; 
            private Integer nonCompliantCount; 
            private Integer totalCount; 

            /**
             * The compliance evaluation result of member accounts.
             */
            public Builder accountCompliances(java.util.List < AccountCompliances> accountCompliances) {
                this.accountCompliances = accountCompliances;
                return this;
            }

            /**
             * The ID of the compliance package.
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * The number of non-compliant member accounts.
             */
            public Builder nonCompliantCount(Integer nonCompliantCount) {
                this.nonCompliantCount = nonCompliantCount;
                return this;
            }

            /**
             * The total number of member accounts.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public AccountComplianceResult build() {
                return new AccountComplianceResult(this);
            } 

        } 

    }
}
