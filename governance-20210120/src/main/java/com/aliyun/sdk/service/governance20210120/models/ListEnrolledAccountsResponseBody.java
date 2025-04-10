// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

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
 * {@link ListEnrolledAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnrolledAccountsResponseBody</p>
 */
public class ListEnrolledAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnrolledAccounts")
    private java.util.List<EnrolledAccounts> enrolledAccounts;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enrolledAccounts
     */
    public java.util.List<EnrolledAccounts> getEnrolledAccounts() {
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
        private java.util.List<EnrolledAccounts> enrolledAccounts; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListEnrolledAccountsResponseBody model) {
            this.enrolledAccounts = model.enrolledAccounts;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The enrolled accounts.</p>
         */
        public Builder enrolledAccounts(java.util.List<EnrolledAccounts> enrolledAccounts) {
            this.enrolledAccounts = enrolledAccounts;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAALHWGpGoYCcYMxiFfmlhvh62Xr2DzYbz/SAfc*****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>768F908D-A66A-5A5D-816C-20C93CBBFEE3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEnrolledAccountsResponseBody build() {
            return new ListEnrolledAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEnrolledAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnrolledAccountsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(EnrolledAccounts model) {
                this.accountUid = model.accountUid;
                this.baselineId = model.baselineId;
                this.createTime = model.createTime;
                this.displayName = model.displayName;
                this.folderId = model.folderId;
                this.payerAccountUid = model.payerAccountUid;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>19534534552*****</p>
             */
            public Builder accountUid(Long accountUid) {
                this.accountUid = accountUid;
                return this;
            }

            /**
             * <p>The ID of the baseline that is implemented.</p>
             * 
             * <strong>example:</strong>
             * <p>afb-bp1durvn3lgqe28v****</p>
             */
            public Builder baselineId(String baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-01T02:38:27Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The display name of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>TestAccount</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The ID of the parent folder.</p>
             * 
             * <strong>example:</strong>
             * <p>fd-5ESoku****</p>
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>The ID of the settlement account.</p>
             * 
             * <strong>example:</strong>
             * <p>13161210500*****</p>
             */
            public Builder payerAccountUid(Long payerAccountUid) {
                this.payerAccountUid = payerAccountUid;
                return this;
            }

            /**
             * <p>The creation status. Valid values:</p>
             * <ul>
             * <li>Pending: The account is pending to be created.</li>
             * <li>Running: The account is being created.</li>
             * <li>Finished: The account is created.</li>
             * <li>Failed: The account fails to be created.</li>
             * <li>Scheduling: The account is being scheduled.</li>
             * <li>ScheduleFailed: The account fails to be scheduled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-01T02:38:27Z</p>
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
