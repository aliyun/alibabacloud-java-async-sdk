// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryCashCouponsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCashCouponsResponseBody</p>
 */
public class QueryCashCouponsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryCashCouponsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCashCouponsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>147B566E-DB4C-4E43-BDBB-5DB1D9D268DB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCashCouponsResponseBody build() {
            return new QueryCashCouponsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCashCouponsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCashCouponsResponseBody</p>
     */
    public static class CashCoupon extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicableProducts")
        private String applicableProducts;

        @com.aliyun.core.annotation.NameInMap("ApplicableScenarios")
        private String applicableScenarios;

        @com.aliyun.core.annotation.NameInMap("Balance")
        private String balance;

        @com.aliyun.core.annotation.NameInMap("CashCouponId")
        private Long cashCouponId;

        @com.aliyun.core.annotation.NameInMap("CashCouponNo")
        private String cashCouponNo;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
        private String effectiveTime;

        @com.aliyun.core.annotation.NameInMap("ExpiryTime")
        private String expiryTime;

        @com.aliyun.core.annotation.NameInMap("GrantedTime")
        private String grantedTime;

        @com.aliyun.core.annotation.NameInMap("NominalValue")
        private String nominalValue;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private CashCoupon(Builder builder) {
            this.applicableProducts = builder.applicableProducts;
            this.applicableScenarios = builder.applicableScenarios;
            this.balance = builder.balance;
            this.cashCouponId = builder.cashCouponId;
            this.cashCouponNo = builder.cashCouponNo;
            this.description = builder.description;
            this.effectiveTime = builder.effectiveTime;
            this.expiryTime = builder.expiryTime;
            this.grantedTime = builder.grantedTime;
            this.nominalValue = builder.nominalValue;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CashCoupon create() {
            return builder().build();
        }

        /**
         * @return applicableProducts
         */
        public String getApplicableProducts() {
            return this.applicableProducts;
        }

        /**
         * @return applicableScenarios
         */
        public String getApplicableScenarios() {
            return this.applicableScenarios;
        }

        /**
         * @return balance
         */
        public String getBalance() {
            return this.balance;
        }

        /**
         * @return cashCouponId
         */
        public Long getCashCouponId() {
            return this.cashCouponId;
        }

        /**
         * @return cashCouponNo
         */
        public String getCashCouponNo() {
            return this.cashCouponNo;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return effectiveTime
         */
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return expiryTime
         */
        public String getExpiryTime() {
            return this.expiryTime;
        }

        /**
         * @return grantedTime
         */
        public String getGrantedTime() {
            return this.grantedTime;
        }

        /**
         * @return nominalValue
         */
        public String getNominalValue() {
            return this.nominalValue;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String applicableProducts; 
            private String applicableScenarios; 
            private String balance; 
            private Long cashCouponId; 
            private String cashCouponNo; 
            private String description; 
            private String effectiveTime; 
            private String expiryTime; 
            private String grantedTime; 
            private String nominalValue; 
            private String status; 

            /**
             * <p>The service to which the voucher is applicable.</p>
             * 
             * <strong>example:</strong>
             * <p>All Alibaba Cloud services</p>
             */
            public Builder applicableProducts(String applicableProducts) {
                this.applicableProducts = applicableProducts;
                return this;
            }

            /**
             * <p>The scenario to which the voucher is applicable.</p>
             * 
             * <strong>example:</strong>
             * <p>Pay for the pay-as-you-go bills of Alibaba Cloud services or purchase an instance of an Alibaba Cloud service</p>
             */
            public Builder applicableScenarios(String applicableScenarios) {
                this.applicableScenarios = applicableScenarios;
                return this;
            }

            /**
             * <p>The remaining quota of the voucher.</p>
             * 
             * <strong>example:</strong>
             * <p>100.00</p>
             */
            public Builder balance(String balance) {
                this.balance = balance;
                return this;
            }

            /**
             * <p>The ID of the voucher.</p>
             * 
             * <strong>example:</strong>
             * <p>34534253254325</p>
             */
            public Builder cashCouponId(Long cashCouponId) {
                this.cashCouponId = cashCouponId;
                return this;
            }

            /**
             * <p>The code of the voucher.</p>
             * 
             * <strong>example:</strong>
             * <p>Q-b1485def8f04a</p>
             */
            public Builder cashCouponNo(String cashCouponNo) {
                this.cashCouponNo = cashCouponNo;
                return this;
            }

            /**
             * <p>The description of the voucher.</p>
             * 
             * <strong>example:</strong>
             * <p>This voucher is used for testing product function</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the voucher took effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-02T15:15:50Z</p>
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * <p>The time when the voucher expired.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-29T15:15:50Z</p>
             */
            public Builder expiryTime(String expiryTime) {
                this.expiryTime = expiryTime;
                return this;
            }

            /**
             * <p>The time when the voucher was released.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-02T15:15:50Z</p>
             */
            public Builder grantedTime(String grantedTime) {
                this.grantedTime = grantedTime;
                return this;
            }

            /**
             * <p>The denomination of the voucher.</p>
             * 
             * <strong>example:</strong>
             * <p>100.00</p>
             */
            public Builder nominalValue(String nominalValue) {
                this.nominalValue = nominalValue;
                return this;
            }

            /**
             * <p>The state of the voucher. Valid values:</p>
             * <ul>
             * <li>Available: The voucher is valid.</li>
             * <li>Expired: The voucher has expired.</li>
             * <li>Cancelled: The voucher is canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CashCoupon build() {
                return new CashCoupon(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCashCouponsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCashCouponsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CashCoupon")
        private java.util.List < CashCoupon> cashCoupon;

        private Data(Builder builder) {
            this.cashCoupon = builder.cashCoupon;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cashCoupon
         */
        public java.util.List < CashCoupon> getCashCoupon() {
            return this.cashCoupon;
        }

        public static final class Builder {
            private java.util.List < CashCoupon> cashCoupon; 

            /**
             * CashCoupon.
             */
            public Builder cashCoupon(java.util.List < CashCoupon> cashCoupon) {
                this.cashCoupon = cashCoupon;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
