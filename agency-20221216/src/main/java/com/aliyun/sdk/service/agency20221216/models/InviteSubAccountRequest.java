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
         * List of invited account information,  less than 5 accounts at a time.</br>
         * <p>
         * `Sub-levels <= 5`
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

        @NameInMap("CustomerBd")
        private String customerBd;

        @NameInMap("CustomerId")
        @Validation(required = true)
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
            this.customerBd = builder.customerBd;
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
         * @return customerBd
         */
        public String getCustomerBd() {
            return this.customerBd;
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
            private String customerBd; 
            private String customerId; 
            private String emailAddress; 
            private String newBuyStatus; 
            private String remark; 
            private String subAccountType; 
            private String zeroCreditShutdownPolicy; 

            /**
             * The name of Sub Account:</br>
             * <p>
             * 1. Use the official name of Company, if Sub Account is an enterprise.</br>
             * 2. Use the official name of Partner, if Sub Account is a T2 reseller.</br>
             */
            public Builder accountNickname(String accountNickname) {
                this.accountNickname = accountNickname;
                return this;
            }

            /**
             * The total budget Credit of Sub Account that distributed by Partner.
             */
            public Builder creditLine(String creditLine) {
                this.creditLine = creditLine;
                return this;
            }

            /**
             * CustomerBd.
             */
            public Builder customerBd(String customerBd) {
                this.customerBd = customerBd;
                return this;
            }

            /**
             * Customer ID, Returning ID from CreateCustomer API.
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * The email address of End User,  which will receive the invitation email.
             */
            public Builder emailAddress(String emailAddress) {
                this.emailAddress = emailAddress;
                return this;
            }

            /**
             * Initial Order Status</br>
             * <p>
             * 1. ban：Ban the new purchase action--After End User finish registration and authorization, they can\"t issue Cloud Resource order immediately. Partner should manually update the "Order Control" settings as "Normal" to enable new order.</br>
             * 2. normal：Normal--After End User finished registration and authorization, they can issue Cloud Resource order immediately.</br>
             */
            public Builder newBuyStatus(String newBuyStatus) {
                this.newBuyStatus = newBuyStatus;
                return this;
            }

            /**
             * Description of Sub Account.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The type of Sub Account</br>
             * <p>
             * 
             * 1 Agency\"s End User</br>
             * 2 Reseller\"s End user</br>
             * 5 Reseller\"s T2 Partner</br>
             */
            public Builder subAccountType(String subAccountType) {
                this.subAccountType = subAccountType;
                return this;
            }

            /**
             * Partner\"s Shutdown Policy Management for Sub Account.</br>
             * <p>
             * 1: delayStop. The account have Shutdown-delay Privilege,  After Shutdown-delay Credit is ran out, Alibaba Cloud will take over resources and keep the instance for 15 days. In addition, the instance will be released if Sub Account failed to pay the bill within these 15 days.</br>
             * 2: noStop. Partner will manually manage Shutdown Status for Sub Account. Meanwhile, System would not manage the resource\"s life-circle of Sub Account.</br>
             * 3: immediatelyStop. Once valid quota of Sub Account falls below 0 and be identified as defaulting account, it will trigger the instance shutdown immediately.</br>
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
