// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCashCouponsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCashCouponsResponseBody</p>
 */
public class QueryCashCouponsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCashCouponsResponseBody build() {
            return new QueryCashCouponsResponseBody(this);
        } 

    } 

    public static class CashCoupon extends TeaModel {
        @NameInMap("ApplicableProducts")
        private String applicableProducts;

        @NameInMap("ApplicableScenarios")
        private String applicableScenarios;

        @NameInMap("Balance")
        private String balance;

        @NameInMap("CashCouponId")
        private Long cashCouponId;

        @NameInMap("CashCouponNo")
        private String cashCouponNo;

        @NameInMap("EffectiveTime")
        private String effectiveTime;

        @NameInMap("ExpiryTime")
        private String expiryTime;

        @NameInMap("GrantedTime")
        private String grantedTime;

        @NameInMap("NominalValue")
        private String nominalValue;

        @NameInMap("Status")
        private String status;

        private CashCoupon(Builder builder) {
            this.applicableProducts = builder.applicableProducts;
            this.applicableScenarios = builder.applicableScenarios;
            this.balance = builder.balance;
            this.cashCouponId = builder.cashCouponId;
            this.cashCouponNo = builder.cashCouponNo;
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
            private String effectiveTime; 
            private String expiryTime; 
            private String grantedTime; 
            private String nominalValue; 
            private String status; 

            /**
             * ApplicableProducts.
             */
            public Builder applicableProducts(String applicableProducts) {
                this.applicableProducts = applicableProducts;
                return this;
            }

            /**
             * ApplicableScenarios.
             */
            public Builder applicableScenarios(String applicableScenarios) {
                this.applicableScenarios = applicableScenarios;
                return this;
            }

            /**
             * Balance.
             */
            public Builder balance(String balance) {
                this.balance = balance;
                return this;
            }

            /**
             * CashCouponId.
             */
            public Builder cashCouponId(Long cashCouponId) {
                this.cashCouponId = cashCouponId;
                return this;
            }

            /**
             * CashCouponNo.
             */
            public Builder cashCouponNo(String cashCouponNo) {
                this.cashCouponNo = cashCouponNo;
                return this;
            }

            /**
             * EffectiveTime.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * ExpiryTime.
             */
            public Builder expiryTime(String expiryTime) {
                this.expiryTime = expiryTime;
                return this;
            }

            /**
             * GrantedTime.
             */
            public Builder grantedTime(String grantedTime) {
                this.grantedTime = grantedTime;
                return this;
            }

            /**
             * NominalValue.
             */
            public Builder nominalValue(String nominalValue) {
                this.nominalValue = nominalValue;
                return this;
            }

            /**
             * Status.
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
    public static class Data extends TeaModel {
        @NameInMap("CashCoupon")
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
