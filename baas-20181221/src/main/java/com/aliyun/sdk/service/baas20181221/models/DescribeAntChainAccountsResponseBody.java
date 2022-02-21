// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainAccountsResponseBody</p>
 */
public class DescribeAntChainAccountsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeAntChainAccountsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainAccountsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeAntChainAccountsResponseBody build() {
            return new DescribeAntChainAccountsResponseBody(this);
        } 

    } 

    public static class Accounts extends TeaModel {
        @NameInMap("Account")
        private String account;

        @NameInMap("AccountPublicKey")
        private String accountPublicKey;

        @NameInMap("AccountRecoveryKey")
        private String accountRecoveryKey;

        @NameInMap("AccountStatus")
        private String accountStatus;

        @NameInMap("AntChainId")
        private String antChainId;

        private Accounts(Builder builder) {
            this.account = builder.account;
            this.accountPublicKey = builder.accountPublicKey;
            this.accountRecoveryKey = builder.accountRecoveryKey;
            this.accountStatus = builder.accountStatus;
            this.antChainId = builder.antChainId;
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
        public String getAccount() {
            return this.account;
        }

        /**
         * @return accountPublicKey
         */
        public String getAccountPublicKey() {
            return this.accountPublicKey;
        }

        /**
         * @return accountRecoveryKey
         */
        public String getAccountRecoveryKey() {
            return this.accountRecoveryKey;
        }

        /**
         * @return accountStatus
         */
        public String getAccountStatus() {
            return this.accountStatus;
        }

        /**
         * @return antChainId
         */
        public String getAntChainId() {
            return this.antChainId;
        }

        public static final class Builder {
            private String account; 
            private String accountPublicKey; 
            private String accountRecoveryKey; 
            private String accountStatus; 
            private String antChainId; 

            /**
             * Account.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * AccountPublicKey.
             */
            public Builder accountPublicKey(String accountPublicKey) {
                this.accountPublicKey = accountPublicKey;
                return this;
            }

            /**
             * AccountRecoveryKey.
             */
            public Builder accountRecoveryKey(String accountRecoveryKey) {
                this.accountRecoveryKey = accountRecoveryKey;
                return this;
            }

            /**
             * AccountStatus.
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * AntChainId.
             */
            public Builder antChainId(String antChainId) {
                this.antChainId = antChainId;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
    public static class Pagination extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Pagination(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pagination create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Accounts")
        private java.util.List < Accounts> accounts;

        @NameInMap("Pagination")
        private Pagination pagination;

        private Result(Builder builder) {
            this.accounts = builder.accounts;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return accounts
         */
        public java.util.List < Accounts> getAccounts() {
            return this.accounts;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private java.util.List < Accounts> accounts; 
            private Pagination pagination; 

            /**
             * Accounts.
             */
            public Builder accounts(java.util.List < Accounts> accounts) {
                this.accounts = accounts;
                return this;
            }

            /**
             * Pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
