// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDelegatedAdministratorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDelegatedAdministratorsResponseBody</p>
 */
public class ListDelegatedAdministratorsResponseBody extends TeaModel {
    @NameInMap("Accounts")
    private Accounts accounts;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListDelegatedAdministratorsResponseBody(Builder builder) {
        this.accounts = builder.accounts;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDelegatedAdministratorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accounts
     */
    public Accounts getAccounts() {
        return this.accounts;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
        private Accounts accounts; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Accounts.
         */
        public Builder accounts(Accounts accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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

        public ListDelegatedAdministratorsResponseBody build() {
            return new ListDelegatedAdministratorsResponseBody(this);
        } 

    } 

    public static class Account extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("DelegationEnabledTime")
        private String delegationEnabledTime;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("JoinMethod")
        private String joinMethod;

        @NameInMap("ServicePrincipal")
        private String servicePrincipal;

        private Account(Builder builder) {
            this.accountId = builder.accountId;
            this.delegationEnabledTime = builder.delegationEnabledTime;
            this.displayName = builder.displayName;
            this.joinMethod = builder.joinMethod;
            this.servicePrincipal = builder.servicePrincipal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Account create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return delegationEnabledTime
         */
        public String getDelegationEnabledTime() {
            return this.delegationEnabledTime;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return joinMethod
         */
        public String getJoinMethod() {
            return this.joinMethod;
        }

        /**
         * @return servicePrincipal
         */
        public String getServicePrincipal() {
            return this.servicePrincipal;
        }

        public static final class Builder {
            private String accountId; 
            private String delegationEnabledTime; 
            private String displayName; 
            private String joinMethod; 
            private String servicePrincipal; 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * DelegationEnabledTime.
             */
            public Builder delegationEnabledTime(String delegationEnabledTime) {
                this.delegationEnabledTime = delegationEnabledTime;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * JoinMethod.
             */
            public Builder joinMethod(String joinMethod) {
                this.joinMethod = joinMethod;
                return this;
            }

            /**
             * ServicePrincipal.
             */
            public Builder servicePrincipal(String servicePrincipal) {
                this.servicePrincipal = servicePrincipal;
                return this;
            }

            public Account build() {
                return new Account(this);
            } 

        } 

    }
    public static class Accounts extends TeaModel {
        @NameInMap("Account")
        private java.util.List < Account> account;

        private Accounts(Builder builder) {
            this.account = builder.account;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public java.util.List < Account> getAccount() {
            return this.account;
        }

        public static final class Builder {
            private java.util.List < Account> account; 

            /**
             * Account.
             */
            public Builder account(java.util.List < Account> account) {
                this.account = account;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
