// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnrolledAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnrolledAccountsResponseBody</p>
 */
public class ListEnrolledAccountsResponseBody extends TeaModel {
    @NameInMap("EnrolledAccounts")
    private java.util.List < EnrolledAccounts> enrolledAccounts;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
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
         * 账号列表
         */
        public Builder enrolledAccounts(java.util.List < EnrolledAccounts> enrolledAccounts) {
            this.enrolledAccounts = enrolledAccounts;
            return this;
        }

        /**
         * 查询返回结果下一页的令牌
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 请求ID
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
        @NameInMap("AccountUid")
        private Long accountUid;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("FolderId")
        private String folderId;

        @NameInMap("PayerAccountUid")
        private Long payerAccountUid;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private String updateTime;

        private EnrolledAccounts(Builder builder) {
            this.accountUid = builder.accountUid;
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
            private String createTime; 
            private String displayName; 
            private String folderId; 
            private Long payerAccountUid; 
            private String status; 
            private String updateTime; 

            /**
             * 账号ID
             */
            public Builder accountUid(Long accountUid) {
                this.accountUid = accountUid;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 账号显示名称
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * 父资源夹ID
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * 结算账号ID
             */
            public Builder payerAccountUid(Long payerAccountUid) {
                this.payerAccountUid = payerAccountUid;
                return this;
            }

            /**
             * 创建状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 更新时间
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
