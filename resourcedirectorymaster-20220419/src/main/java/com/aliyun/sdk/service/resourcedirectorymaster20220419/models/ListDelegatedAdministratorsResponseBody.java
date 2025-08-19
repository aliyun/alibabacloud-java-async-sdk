// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link ListDelegatedAdministratorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDelegatedAdministratorsResponseBody</p>
 */
public class ListDelegatedAdministratorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accounts")
    private Accounts accounts;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListDelegatedAdministratorsResponseBody model) {
            this.accounts = model.accounts;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the delegated administrator accounts.</p>
         */
        public Builder accounts(Accounts accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>009C3A02-7D4B-416C-9CE7-548C91508F1E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDelegatedAdministratorsResponseBody build() {
            return new ListDelegatedAdministratorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDelegatedAdministratorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDelegatedAdministratorsResponseBody</p>
     */
    public static class Account extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("DelegationEnabledTime")
        private String delegationEnabledTime;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("JoinMethod")
        private String joinMethod;

        @com.aliyun.core.annotation.NameInMap("ServicePrincipal")
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

            private Builder() {
            } 

            private Builder(Account model) {
                this.accountId = model.accountId;
                this.delegationEnabledTime = model.delegationEnabledTime;
                this.displayName = model.displayName;
                this.joinMethod = model.joinMethod;
                this.servicePrincipal = model.servicePrincipal;
            } 

            /**
             * <p>The Alibaba Cloud account ID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>138660628348****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The time when the member was specified as a delegated administrator account.</p>
             * 
             * <strong>example:</strong>
             * <p>1616652684164</p>
             */
            public Builder delegationEnabledTime(String delegationEnabledTime) {
                this.delegationEnabledTime = delegationEnabledTime;
                return this;
            }

            /**
             * <p>The display name of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The way in which the member joins the resource directory. Valid values:</p>
             * <ul>
             * <li>invited: The member is invited to join the resource directory.</li>
             * <li>created: The member is directly created in the resource directory.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>created</p>
             */
            public Builder joinMethod(String joinMethod) {
                this.joinMethod = joinMethod;
                return this;
            }

            /**
             * <p>The identifier of the trusted service.</p>
             * 
             * <strong>example:</strong>
             * <p>cloudfw.aliyuncs.com</p>
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
    /**
     * 
     * {@link ListDelegatedAdministratorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDelegatedAdministratorsResponseBody</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private java.util.List<Account> account;

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
        public java.util.List<Account> getAccount() {
            return this.account;
        }

        public static final class Builder {
            private java.util.List<Account> account; 

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.account = model.account;
            } 

            /**
             * Account.
             */
            public Builder account(java.util.List<Account> account) {
                this.account = account;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
