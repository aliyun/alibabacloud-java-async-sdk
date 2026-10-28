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
         * <p>The list of account information for the invitation. A maximum of five accounts can be invited at a time.</p>
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

            private Builder() {
            } 

            private Builder(AccountInfoList model) {
                this.accountNickname = model.accountNickname;
                this.creditLine = model.creditLine;
                this.customerBd = model.customerBd;
                this.customerId = model.customerId;
                this.emailAddress = model.emailAddress;
                this.newBuyStatus = model.newBuyStatus;
                this.remark = model.remark;
                this.subAccountType = model.subAccountType;
                this.zeroCreditShutdownPolicy = model.zeroCreditShutdownPolicy;
            } 

            /**
             * <p>The name of the distribution customer. Valid values:</p>
             * <ul>
             * <li>If the distribution customer is an enterprise, this is the company name.</li>
             * <li>If the distribution customer is a T2 reseller partner, this is the partner name.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>XXX技术有限公司</p>
             */
            public Builder accountNickname(String accountNickname) {
                this.accountNickname = accountNickname;
                return this;
            }

            /**
             * <p>The total budget quota that the partner allocates to the distribution customer.</p>
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
             * <p>The account manager of the customer. Maximum length: 50 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder customerBd(String customerBd) {
                this.customerBd = customerBd;
                return this;
            }

            /**
             * <p>The customer ID returned by the CreateCustomer API.</p>
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
             * <p>The email address of the distribution customer account. The invitation email is sent to this address.</p>
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
             * <p>The initial order placement status. Valid values:</p>
             * <ul>
             * <li>ban: Purchase is prohibited. After the customer is registered and associated, the customer cannot immediately place orders to purchase cloud resources. You must set the order control to normal before the customer can place orders.</li>
             * <li>normal: Normal. After the customer is registered and associated, the customer can immediately place orders to purchase cloud resources.</li>
             * </ul>
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
             * <p>The description of the distribution customer.</p>
             * 
             * <strong>example:</strong>
             * <p>发展xx为客户的邀请</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The type of the sub-account. Valid values:</p>
             * <ul>
             * <li>1: end user of Agency.</li>
             * <li>2: end user of Reseller. </li>
             * <li>5: T2 partner of Reseller.</li>
             * </ul>
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
             * <p>The shutdown policy that the partner manages for the distribution customer. Valid values:</p>
             * <ul>
             * <li>1: delayStop. Alibaba Cloud takes over the resources and the customer enjoys a delayed shutdown quota. When the delayed shutdown quota is exhausted, instance shutdown is triggered. If payment is not made within 15 days, storage resources are released.</li>
             * <li>2: noStop. Manual management with no shutdown on overdue payment. The system does not manage the resource lifecycle of the non-trusteeship linked account. The partner must manually manage the instance shutdown status of the customer.</li>
             * <li>3: immediatelyStop. Instances are immediately shut down on overdue payment. When the available quota of the customer account is less than 0, the account enters the overdue payment status and instance shutdown is triggered.</li>
             * </ul>
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
