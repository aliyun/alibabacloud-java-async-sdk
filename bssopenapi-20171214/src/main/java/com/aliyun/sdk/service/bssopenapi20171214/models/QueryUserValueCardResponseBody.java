// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserValueCardResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserValueCardResponseBody</p>
 */
public class QueryUserValueCardResponseBody extends TeaModel {
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

    private QueryUserValueCardResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserValueCardResponseBody create() {
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

        public QueryUserValueCardResponseBody build() {
            return new QueryUserValueCardResponseBody(this);
        } 

    } 

    public static class UserCoupon extends TeaModel {
        @NameInMap("CouponId")
        private Long couponId;

        @NameInMap("CouponNum")
        private String couponNum;

        @NameInMap("Effective")
        private Boolean effective;

        @NameInMap("EffectiveTime")
        private Long effectiveTime;

        @NameInMap("FaceValue")
        private String faceValue;

        @NameInMap("GrantTime")
        private Long grantTime;

        @NameInMap("InEffectiveTime")
        private Long inEffectiveTime;

        @NameInMap("SurplusAmount")
        private String surplusAmount;

        @NameInMap("UseCase")
        private String useCase;

        private UserCoupon(Builder builder) {
            this.couponId = builder.couponId;
            this.couponNum = builder.couponNum;
            this.effective = builder.effective;
            this.effectiveTime = builder.effectiveTime;
            this.faceValue = builder.faceValue;
            this.grantTime = builder.grantTime;
            this.inEffectiveTime = builder.inEffectiveTime;
            this.surplusAmount = builder.surplusAmount;
            this.useCase = builder.useCase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserCoupon create() {
            return builder().build();
        }

        /**
         * @return couponId
         */
        public Long getCouponId() {
            return this.couponId;
        }

        /**
         * @return couponNum
         */
        public String getCouponNum() {
            return this.couponNum;
        }

        /**
         * @return effective
         */
        public Boolean getEffective() {
            return this.effective;
        }

        /**
         * @return effectiveTime
         */
        public Long getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return faceValue
         */
        public String getFaceValue() {
            return this.faceValue;
        }

        /**
         * @return grantTime
         */
        public Long getGrantTime() {
            return this.grantTime;
        }

        /**
         * @return inEffectiveTime
         */
        public Long getInEffectiveTime() {
            return this.inEffectiveTime;
        }

        /**
         * @return surplusAmount
         */
        public String getSurplusAmount() {
            return this.surplusAmount;
        }

        /**
         * @return useCase
         */
        public String getUseCase() {
            return this.useCase;
        }

        public static final class Builder {
            private Long couponId; 
            private String couponNum; 
            private Boolean effective; 
            private Long effectiveTime; 
            private String faceValue; 
            private Long grantTime; 
            private Long inEffectiveTime; 
            private String surplusAmount; 
            private String useCase; 

            /**
             * CouponId.
             */
            public Builder couponId(Long couponId) {
                this.couponId = couponId;
                return this;
            }

            /**
             * CouponNum.
             */
            public Builder couponNum(String couponNum) {
                this.couponNum = couponNum;
                return this;
            }

            /**
             * Effective.
             */
            public Builder effective(Boolean effective) {
                this.effective = effective;
                return this;
            }

            /**
             * EffectiveTime.
             */
            public Builder effectiveTime(Long effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * FaceValue.
             */
            public Builder faceValue(String faceValue) {
                this.faceValue = faceValue;
                return this;
            }

            /**
             * GrantTime.
             */
            public Builder grantTime(Long grantTime) {
                this.grantTime = grantTime;
                return this;
            }

            /**
             * InEffectiveTime.
             */
            public Builder inEffectiveTime(Long inEffectiveTime) {
                this.inEffectiveTime = inEffectiveTime;
                return this;
            }

            /**
             * SurplusAmount.
             */
            public Builder surplusAmount(String surplusAmount) {
                this.surplusAmount = surplusAmount;
                return this;
            }

            /**
             * UseCase.
             */
            public Builder useCase(String useCase) {
                this.useCase = useCase;
                return this;
            }

            public UserCoupon build() {
                return new UserCoupon(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("UserCoupon")
        private java.util.List < UserCoupon> userCoupon;

        private Data(Builder builder) {
            this.userCoupon = builder.userCoupon;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return userCoupon
         */
        public java.util.List < UserCoupon> getUserCoupon() {
            return this.userCoupon;
        }

        public static final class Builder {
            private java.util.List < UserCoupon> userCoupon; 

            /**
             * UserCoupon.
             */
            public Builder userCoupon(java.util.List < UserCoupon> userCoupon) {
                this.userCoupon = userCoupon;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
