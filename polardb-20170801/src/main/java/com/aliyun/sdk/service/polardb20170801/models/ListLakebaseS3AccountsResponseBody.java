// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ListLakebaseS3AccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLakebaseS3AccountsResponseBody</p>
 */
public class ListLakebaseS3AccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("S3Accounts")
    private java.util.List<S3Accounts> s3Accounts;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListLakebaseS3AccountsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.s3Accounts = builder.s3Accounts;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLakebaseS3AccountsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return s3Accounts
     */
    public java.util.List<S3Accounts> getS3Accounts() {
        return this.s3Accounts;
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
        private String requestId; 
        private java.util.List<S3Accounts> s3Accounts; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListLakebaseS3AccountsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.s3Accounts = model.s3Accounts;
            this.totalCount = model.totalCount;
        } 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * S3Accounts.
         */
        public Builder s3Accounts(java.util.List<S3Accounts> s3Accounts) {
            this.s3Accounts = s3Accounts;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLakebaseS3AccountsResponseBody build() {
            return new ListLakebaseS3AccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLakebaseS3AccountsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLakebaseS3AccountsResponseBody</p>
     */
    public static class S3Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("UserAccAk")
        private String userAccAk;

        @com.aliyun.core.annotation.NameInMap("UserAccSk")
        private String userAccSk;

        private S3Accounts(Builder builder) {
            this.accountType = builder.accountType;
            this.userAccAk = builder.userAccAk;
            this.userAccSk = builder.userAccSk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static S3Accounts create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return userAccAk
         */
        public String getUserAccAk() {
            return this.userAccAk;
        }

        /**
         * @return userAccSk
         */
        public String getUserAccSk() {
            return this.userAccSk;
        }

        public static final class Builder {
            private String accountType; 
            private String userAccAk; 
            private String userAccSk; 

            private Builder() {
            } 

            private Builder(S3Accounts model) {
                this.accountType = model.accountType;
                this.userAccAk = model.userAccAk;
                this.userAccSk = model.userAccSk;
            } 

            /**
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * UserAccAk.
             */
            public Builder userAccAk(String userAccAk) {
                this.userAccAk = userAccAk;
                return this;
            }

            /**
             * UserAccSk.
             */
            public Builder userAccSk(String userAccSk) {
                this.userAccSk = userAccSk;
                return this;
            }

            public S3Accounts build() {
                return new S3Accounts(this);
            } 

        } 

    }
}
