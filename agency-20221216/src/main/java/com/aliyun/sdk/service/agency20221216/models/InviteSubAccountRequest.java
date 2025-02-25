// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link InviteSubAccountRequest} extends {@link RequestModel}
 *
 * <p>InviteSubAccountRequest</p>
 */
public class InviteSubAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountInfoList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AccountInfoList> accountInfoList;

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
    public java.util.List<AccountInfoList> getAccountInfoList() {
        return this.accountInfoList;
    }

    public static final class Builder extends Request.Builder<InviteSubAccountRequest, Builder> {
        private java.util.List<AccountInfoList> accountInfoList; 

        private Builder() {
            super();
        } 

        private Builder(InviteSubAccountRequest request) {
            super(request);
            this.accountInfoList = request.accountInfoList;
        } 

        /**
         * <p>List of invited account information,  less than 5 accounts at a time.</br>
         * <code>Sub-levels &lt;= 5</code></p>
         * <p>This parameter is required.</p>
         */
        public Builder accountInfoList(java.util.List<AccountInfoList> accountInfoList) {
            this.putQueryParameter("AccountInfoList", accountInfoList);
            this.accountInfoList = accountInfoList;
            return this;
        }

        @Override
        public InviteSubAccountRequest build() {
            return new InviteSubAccountRequest(this);
        } 

    } 

    /**
     * 
     * {@link InviteSubAccountRequest} extends {@link TeaModel}
     *
     * <p>InviteSubAccountRequest</p>
     */
    public static class AccountInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountNickname")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountNickname;

        @com.aliyun.core.annotation.NameInMap("CreditLine")
        @com.aliyun.core.annotation.Validation(required = true)
        private String creditLine;

        @com.aliyun.core.annotation.NameInMap("CustomerBd")
        private String customerBd;

        @com.aliyun.core.annotation.NameInMap("CustomerId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("EmailAddress")
        @com.aliyun.core.annotation.Validation(required = true)
        private String emailAddress;

        @com.aliyun.core.annotation.NameInMap("NewBuyStatus")
        @com.aliyun.core.annotation.Validation(required = true)
        private String newBuyStatus;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SubAccountType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String subAccountType;

        @com.aliyun.core.annotation.NameInMap("ZeroCreditShutdownPolicy")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The name of Sub Account:</br></p>
             * <ol>
             * <li>Use the official name of Company, if Sub Account is an enterprise.</br></li>
             * <li>Use the official name of Partner, if Sub Account is a T2 reseller.</br></li>
             * </ol>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>XXX Technology LTD.</p>
             */
            public Builder accountNickname(String accountNickname) {
                this.accountNickname = accountNickname;
                return this;
            }

            /**
             * <p>The total budget Credit of Sub Account that distributed by Partner.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
             * <p>Customer ID, Returning ID from CreateCustomer API.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567</p>
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * <p>The email address of End User,  which will receive the invitation email.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:12345@163.com">12345@163.com</a></p>
             */
            public Builder emailAddress(String emailAddress) {
                this.emailAddress = emailAddress;
                return this;
            }

            /**
             * <p>Initial Order Status</br></p>
             * <ol>
             * <li>ban：Ban the new purchase action--After End User finish registration and authorization, they can&quot;t issue Cloud Resource order immediately. Partner should manually update the &quot;Order Control&quot; settings as &quot;Normal&quot; to enable new order.</br></li>
             * <li>normal：Normal--After End User finished registration and authorization, they can issue Cloud Resource order immediately.</br></li>
             * </ol>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ban</p>
             */
            public Builder newBuyStatus(String newBuyStatus) {
                this.newBuyStatus = newBuyStatus;
                return this;
            }

            /**
             * <p>Description of Sub Account.</p>
             * 
             * <strong>example:</strong>
             * <p>The invitation to develop XX as a Sub Account</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The type of Sub Account</br></p>
             * <p>1 Agency&quot;s End User</br>
             * 2 Reseller&quot;s End user</br>
             * 5 Reseller&quot;s T2 Partner</br></p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder subAccountType(String subAccountType) {
                this.subAccountType = subAccountType;
                return this;
            }

            /**
             * <p>Partner&quot;s Shutdown Policy Management for Sub Account.</br>
             * 1: delayStop. The account have Shutdown-delay Privilege,  After Shutdown-delay Credit is ran out, Alibaba Cloud will take over resources and keep the instance for 15 days. In addition, the instance will be released if Sub Account failed to pay the bill within these 15 days.</br>
             * 2: noStop. Partner will manually manage Shutdown Status for Sub Account. Meanwhile, System would not manage the resource&quot;s life-circle of Sub Account.</br>
             * 3: immediatelyStop. Once valid quota of Sub Account falls below 0 and be identified as defaulting account, it will trigger the instance shutdown immediately.</br></p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
