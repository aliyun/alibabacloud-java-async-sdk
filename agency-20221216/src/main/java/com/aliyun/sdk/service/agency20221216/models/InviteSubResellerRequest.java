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
 * {@link InviteSubResellerRequest} extends {@link RequestModel}
 *
 * <p>InviteSubResellerRequest</p>
 */
public class InviteSubResellerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountInfoList")
    private java.util.List<AccountInfoList> accountInfoList;

    private InviteSubResellerRequest(Builder builder) {
        super(builder);
        this.accountInfoList = builder.accountInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InviteSubResellerRequest create() {
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

    public static final class Builder extends Request.Builder<InviteSubResellerRequest, Builder> {
        private java.util.List<AccountInfoList> accountInfoList; 

        private Builder() {
            super();
        } 

        private Builder(InviteSubResellerRequest request) {
            super(request);
            this.accountInfoList = request.accountInfoList;
        } 

        /**
         * <p>The list of account information for the invitation. A maximum of five accounts can be specified at a time.</p>
         */
        public Builder accountInfoList(java.util.List<AccountInfoList> accountInfoList) {
            this.putQueryParameter("AccountInfoList", accountInfoList);
            this.accountInfoList = accountInfoList;
            return this;
        }

        @Override
        public InviteSubResellerRequest build() {
            return new InviteSubResellerRequest(this);
        } 

    } 

    /**
     * 
     * {@link InviteSubResellerRequest} extends {@link TeaModel}
     *
     * <p>InviteSubResellerRequest</p>
     */
    public static class AccountInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountNickname")
        private String accountNickname;

        @com.aliyun.core.annotation.NameInMap("CreditLine")
        private String creditLine;

        @com.aliyun.core.annotation.NameInMap("CrossScopeRemark")
        private String crossScopeRemark;

        @com.aliyun.core.annotation.NameInMap("CustomerBd")
        private String customerBd;

        @com.aliyun.core.annotation.NameInMap("EmailAddress")
        private String emailAddress;

        @com.aliyun.core.annotation.NameInMap("NewBuyStatus")
        private String newBuyStatus;

        @com.aliyun.core.annotation.NameInMap("RegisterNation")
        private String registerNation;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SubAccountType")
        private String subAccountType;

        @com.aliyun.core.annotation.NameInMap("ZeroCreditShutdownPolicy")
        private String zeroCreditShutdownPolicy;

        private AccountInfoList(Builder builder) {
            this.accountNickname = builder.accountNickname;
            this.creditLine = builder.creditLine;
            this.crossScopeRemark = builder.crossScopeRemark;
            this.customerBd = builder.customerBd;
            this.emailAddress = builder.emailAddress;
            this.newBuyStatus = builder.newBuyStatus;
            this.registerNation = builder.registerNation;
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
         * @return crossScopeRemark
         */
        public String getCrossScopeRemark() {
            return this.crossScopeRemark;
        }

        /**
         * @return customerBd
         */
        public String getCustomerBd() {
            return this.customerBd;
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
         * @return registerNation
         */
        public String getRegisterNation() {
            return this.registerNation;
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
            private String crossScopeRemark; 
            private String customerBd; 
            private String emailAddress; 
            private String newBuyStatus; 
            private String registerNation; 
            private String remark; 
            private String subAccountType; 
            private String zeroCreditShutdownPolicy; 

            private Builder() {
            } 

            private Builder(AccountInfoList model) {
                this.accountNickname = model.accountNickname;
                this.creditLine = model.creditLine;
                this.crossScopeRemark = model.crossScopeRemark;
                this.customerBd = model.customerBd;
                this.emailAddress = model.emailAddress;
                this.newBuyStatus = model.newBuyStatus;
                this.registerNation = model.registerNation;
                this.remark = model.remark;
                this.subAccountType = model.subAccountType;
                this.zeroCreditShutdownPolicy = model.zeroCreditShutdownPolicy;
            } 

            /**
             * <p>The name of the distribution customer.</p>
             * <ul>
             * <li>If the distribution customer is an enterprise, this is the company name.</li>
             * <li>If the distribution customer is a T2 Reseller partner, this is the partner name.</li>
             * </ul>
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
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder creditLine(String creditLine) {
                this.creditLine = creditLine;
                return this;
            }

            /**
             * <p>The reason for applying for a cross-region association.</p>
             * 
             * <strong>example:</strong>
             * <p>XXX</p>
             */
            public Builder crossScopeRemark(String crossScopeRemark) {
                this.crossScopeRemark = crossScopeRemark;
                return this;
            }

            /**
             * <p>The customer account manager. The value can be up to 50 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder customerBd(String customerBd) {
                this.customerBd = customerBd;
                return this;
            }

            /**
             * <p>The email address to which the invitation email is sent.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:nejatox206@getasail.com">nejatox206@getasail.com</a></p>
             */
            public Builder emailAddress(String emailAddress) {
                this.emailAddress = emailAddress;
                return this;
            }

            /**
             * <p>The initial order placement status. Valid values:</p>
             * <ul>
             * <li>ban: Purchase is prohibited. After the customer is registered and associated, the customer cannot place orders to purchase cloud resources immediately. You must set the order control to Normal before the customer can place orders.</li>
             * <li>normal: Normal. After the customer is registered and associated, the customer can place orders to purchase cloud resources immediately.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder newBuyStatus(String newBuyStatus) {
                this.newBuyStatus = newBuyStatus;
                return this;
            }

            /**
             * <p>The country or region of the invited T2 Reseller. The value must comply with the ISO 3166-1 alpha-2 code. You can call the ListCountries operation to query the contract coverage area list of the current UID.</p>
             * <p>The system automatically determines whether the invitation is cross-region based on whether this parameter falls within the T1 contract coverage area.</p>
             * <ul>
             * <li>If the invitation is cross-region, a cross-region invitation approval process is initiated. After the approval is granted, an invitation registration email is sent to the specified email address.</li>
             * <li>If the invitation is not cross-region, an invitation registration email is sent directly.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SG</p>
             */
            public Builder registerNation(String registerNation) {
                this.registerNation = registerNation;
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
             * <p>This parameter is deprecated. You do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder subAccountType(String subAccountType) {
                this.subAccountType = subAccountType;
                return this;
            }

            /**
             * <p>The shutdown policy that the partner sets for the distribution customer.</p>
             * <ul>
             * <li>1: delayStop. The account uses the delayed shutdown quota for deferred instance shutdown. Alibaba Cloud takes over the resources. When the delayed shutdown quota is exhausted, instance shutdown is triggered. If the payment is not made within 15 days, storage resources are released.</li>
             * <li>2: noStop. Manual management with no shutdown on overdue payment. The system does not manage the resource lifecycle of the non-trusteeship linked account. The partner must manually manage the instance shutdown status of the customer.</li>
             * <li>3: immediatelyStop. Immediate shutdown on overdue payment. When the active quota of the customer account is less than 0, the account enters the overdue payment status and instance shutdown is triggered.</li>
             * </ul>
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
