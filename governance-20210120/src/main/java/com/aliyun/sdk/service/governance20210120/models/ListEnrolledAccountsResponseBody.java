// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnrolledAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnrolledAccountsResponseBody</p>
 */
public class ListEnrolledAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnrolledAccounts")
    private java.util.List < EnrolledAccounts> enrolledAccounts;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListEnrolledAccountsResponseBody(Builder builder) {
        this.enrolledAccounts = builder.enrolledAccounts;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnrolledAccountsResponseBody create() {
        return builder().build();
    }

    /**
     * @return enrolledAccounts
     */
    public java.util.List < EnrolledAccounts> getEnrolledAccounts() {
        return this.enrolledAccounts;
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

    public static final class Builder {
        private java.util.List < EnrolledAccounts> enrolledAccounts; 
        private String nextToken; 
        private String requestId; 

        /**
         * The accounts.
         */
        public Builder enrolledAccounts(java.util.List < EnrolledAccounts> enrolledAccounts) {
            this.enrolledAccounts = enrolledAccounts;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEnrolledAccountsResponseBody build() {
            return new ListEnrolledAccountsResponseBody(this);
        } 

    } 

    public static class EnrolledAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountUid")
        private Long accountUid;

        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private String baselineId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("FolderId")
        private String folderId;

        @com.aliyun.core.annotation.NameInMap("PayerAccountUid")
        private Long payerAccountUid;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private EnrolledAccounts(Builder builder) {
            this.accountUid = builder.accountUid;
            this.baselineId = builder.baselineId;
            this.createTime = builder.createTime;
            this.displayName = builder.displayName;
            this.folderId = builder.folderId;
            this.payerAccountUid = builder.payerAccountUid;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnrolledAccounts create() {
            return builder().build();
        }

        /**
         * @return accountUid
         */
        public Long getAccountUid() {
            return this.accountUid;
        }

        /**
         * @return baselineId
         */
        public String getBaselineId() {
            return this.baselineId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return folderId
         */
        public String getFolderId() {
            return this.folderId;
        }

        /**
         * @return payerAccountUid
         */
        public Long getPayerAccountUid() {
            return this.payerAccountUid;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long accountUid; 
            private String baselineId; 
            private String createTime; 
            private String displayName; 
            private String folderId; 
            private Long payerAccountUid; 
            private String status; 
            private String updateTime; 

            /**
             * The account ID.
             */
            public Builder accountUid(Long accountUid) {
                this.accountUid = accountUid;
                return this;
            }

            /**
             * The baseline ID.
             */
            public Builder baselineId(String baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * The time at which the account was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The display name of the account.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The ID of the parent folder.
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * The ID of the billing account.
             */
            public Builder payerAccountUid(Long payerAccountUid) {
                this.payerAccountUid = payerAccountUid;
                return this;
            }

            /**
             * The creation status of the account. Valid values:
             * <p>
             * 
             * *   Pending: The account is waiting to be created.
             * *   Running: The account is being created.
             * *   Finished: The account is created.
             * *   Failed: The account failed to be created.
             * *   Scheduling: The account is being scheduled.
             * *   ScheduleFailed: The account failed to be scheduled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the information about the account was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public EnrolledAccounts build() {
                return new EnrolledAccounts(this);
            } 

        } 

    }
}
