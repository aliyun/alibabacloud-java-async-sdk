// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMemberAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMemberAccountsResponseBody</p>
 */
public class DescribeMemberAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountInfos")
    private java.util.List < AccountInfos> accountInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMemberAccountsResponseBody(Builder builder) {
        this.accountInfos = builder.accountInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMemberAccountsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountInfos
     */
    public java.util.List < AccountInfos> getAccountInfos() {
        return this.accountInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AccountInfos> accountInfos; 
        private String requestId; 

        /**
         * <p>The information about the member.</p>
         */
        public Builder accountInfos(java.util.List < AccountInfos> accountInfos) {
            this.accountInfos = accountInfos;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>50C4A80D-D46C-57E0-9A7D-03C0****4852</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMemberAccountsResponseBody build() {
            return new DescribeMemberAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMemberAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMemberAccountsResponseBody</p>
     */
    public static class AccountInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountStatus")
        private String accountStatus;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        private AccountInfos(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.accountStatus = builder.accountStatus;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountInfos create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return accountStatus
         */
        public String getAccountStatus() {
            return this.accountStatus;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public static final class Builder {
            private String accountId; 
            private String accountName; 
            private String accountStatus; 
            private String description; 
            private Long gmtCreate; 

            /**
             * <p>The ID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>169************21</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The name of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>ipflgmqqnbjg</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The status of the member.</p>
             * <ul>
             * <li><strong>enabled</strong>: managed.</li>
             * <li><strong>disabled</strong>: not managed.</li>
             * <li><strong>disabling</strong>: being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * <p>The description of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the member was added.</p>
             * 
             * <strong>example:</strong>
             * <p>1683367751000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            public AccountInfos build() {
                return new AccountInfos(this);
            } 

        } 

    }
}
