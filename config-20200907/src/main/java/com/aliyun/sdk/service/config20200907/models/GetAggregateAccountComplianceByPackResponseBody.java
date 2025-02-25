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
 * {@link GetAggregateAccountComplianceByPackResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateAccountComplianceByPackResponseBody</p>
 */
public class GetAggregateAccountComplianceByPackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountComplianceResult")
    private AccountComplianceResult accountComplianceResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The compliance evaluation results of member accounts for which the compliance package takes effect in an account group.</p>
         */
        public Builder accountComplianceResult(AccountComplianceResult accountComplianceResult) {
            this.accountComplianceResult = accountComplianceResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAggregateAccountComplianceByPackResponseBody build() {
            return new GetAggregateAccountComplianceByPackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAggregateAccountComplianceByPackResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregateAccountComplianceByPackResponseBody</p>
     */
    public static class AccountCompliances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("ComplianceType")
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
             * <p>The ID of the member account in the account group.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The name of the member account in the account group.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The compliance evaluation result. Valid values:</p>
             * <ul>
             * <li>COMPLIANT: The resource was evaluated as compliant.</li>
             * <li>NON_COMPLIANT: The resource was evaluated as incompliant.</li>
             * <li>NOT_APPLICABLE: The rule did not apply to your resource.</li>
             * <li>INSUFFICIENT_DATA: No resource data was available.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLIANT</p>
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
    /**
     * 
     * {@link GetAggregateAccountComplianceByPackResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregateAccountComplianceByPackResponseBody</p>
     */
    public static class AccountComplianceResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountCompliances")
        private java.util.List<AccountCompliances> accountCompliances;

        @com.aliyun.core.annotation.NameInMap("CompliancePackId")
        private String compliancePackId;

        @com.aliyun.core.annotation.NameInMap("NonCompliantCount")
        private Integer nonCompliantCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List<AccountCompliances> getAccountCompliances() {
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
            private java.util.List<AccountCompliances> accountCompliances; 
            private String compliancePackId; 
            private Integer nonCompliantCount; 
            private Integer totalCount; 

            /**
             * <p>The compliance evaluation result of member accounts.</p>
             */
            public Builder accountCompliances(java.util.List<AccountCompliances> accountCompliances) {
                this.accountCompliances = accountCompliances;
                return this;
            }

            /**
             * <p>The ID of the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>cp-541e626622af0087****</p>
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * <p>The number of non-compliant member accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder nonCompliantCount(Integer nonCompliantCount) {
                this.nonCompliantCount = nonCompliantCount;
                return this;
            }

            /**
             * <p>The total number of member accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
