// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InviteSubAccountRequest} extends {@link RequestModel}
 *
 * <p>InviteSubAccountRequest</p>
 */
public class InviteSubAccountRequest extends Request {
    @Query
    @NameInMap("AccountInfoList")
    @Validation(required = true)
    private java.util.List < AccountInfoList> accountInfoList;

    private InviteSubAccountRequest(Builder builder) {
        super(builder);
        this.accountInfoList = builder.accountInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InviteSubAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountInfoList
     */
    public java.util.List < AccountInfoList> getAccountInfoList() {
        return this.accountInfoList;
    }

    public static final class Builder extends Request.Builder<InviteSubAccountRequest, Builder> {
        private java.util.List < AccountInfoList> accountInfoList; 

        private Builder() {
            super();
        } 

        private Builder(InviteSubAccountRequest request) {
            super(request);
            this.accountInfoList = request.accountInfoList;
        } 

        /**
         * AccountInfoList.
         */
        public Builder accountInfoList(java.util.List < AccountInfoList> accountInfoList) {
            this.putQueryParameter("AccountInfoList", accountInfoList);
            this.accountInfoList = accountInfoList;
            return this;
        }

        @Override
        public InviteSubAccountRequest build() {
            return new InviteSubAccountRequest(this);
        } 

    } 

    public static class AccountInfoList extends TeaModel {
        @NameInMap("AccountNickname")
        @Validation(required = true)
        private String accountNickname;

        @NameInMap("CreditLine")
        @Validation(required = true)
        private String creditLine;

        @NameInMap("CustomerId")
        private String customerId;

        @NameInMap("EmailAddress")
        @Validation(required = true)
        private String emailAddress;

        @NameInMap("NewBuyStatus")
        @Validation(required = true)
        private String newBuyStatus;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("SubAccountType")
        @Validation(required = true)
        private String subAccountType;

        @NameInMap("ZeroCreditShutdownPolicy")
        @Validation(required = true)
        private String zeroCreditShutdownPolicy;

        private AccountInfoList(Builder builder) {
            this.accountNickname = builder.accountNickname;
            this.creditLine = builder.creditLine;
            this.customerId = builder.customerId;
            this.emailAddress = builder.emailAddress;
            this.newBuyStatus = builder.newBuyStatus;
            this.remark = builder.remark;
            this.subAccountType = builder.subAccountType;
            this.zeroCreditShutdownPolicy = builder.zeroCreditShutdownPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountInfoList create() {
            return builder().build();
        }

        /**
         * @return accountNickname
         */
        public String getAccountNickname() {
            return this.accountNickname;
        }

        /**
         * @return creditLine
         */
        public String getCreditLine() {
            return this.creditLine;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return emailAddress
         */
        public String getEmailAddress() {
            return this.emailAddress;
        }

        /**
         * @return newBuyStatus
         */
        public String getNewBuyStatus() {
            return this.newBuyStatus;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return subAccountType
         */
        public String getSubAccountType() {
            return this.subAccountType;
        }

        /**
         * @return zeroCreditShutdownPolicy
         */
        public String getZeroCreditShutdownPolicy() {
            return this.zeroCreditShutdownPolicy;
        }

        public static final class Builder {
            private String accountNickname; 
            private String creditLine; 
            private String customerId; 
            private String emailAddress; 
            private String newBuyStatus; 
            private String remark; 
            private String subAccountType; 
            private String zeroCreditShutdownPolicy; 

            /**
             * AccountNickname.
             */
            public Builder accountNickname(String accountNickname) {
                this.accountNickname = accountNickname;
                return this;
            }

            /**
             * CreditLine.
             */
            public Builder creditLine(String creditLine) {
                this.creditLine = creditLine;
                return this;
            }

            /**
             * CustomerId.
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * EmailAddress.
             */
            public Builder emailAddress(String emailAddress) {
                this.emailAddress = emailAddress;
                return this;
            }

            /**
             * NewBuyStatus.
             */
            public Builder newBuyStatus(String newBuyStatus) {
                this.newBuyStatus = newBuyStatus;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * SubAccountType.
             */
            public Builder subAccountType(String subAccountType) {
                this.subAccountType = subAccountType;
                return this;
            }

            /**
             * ZeroCreditShutdownPolicy.
             */
            public Builder zeroCreditShutdownPolicy(String zeroCreditShutdownPolicy) {
                this.zeroCreditShutdownPolicy = zeroCreditShutdownPolicy;
                return this;
            }

            public AccountInfoList build() {
                return new AccountInfoList(this);
            } 

        } 

    }
}
