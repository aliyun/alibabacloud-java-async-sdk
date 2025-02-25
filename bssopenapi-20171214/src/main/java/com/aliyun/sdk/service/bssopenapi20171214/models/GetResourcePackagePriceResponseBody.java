// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link GetResourcePackagePriceResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourcePackagePriceResponseBody</p>
 */
public class GetResourcePackagePriceResponseBody extends TeaModel {
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

    private GetResourcePackagePriceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourcePackagePriceResponseBody create() {
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
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BBEF51A3-E933-4F40-A534-C673CBDB9C80</p>
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

        public GetResourcePackagePriceResponseBody build() {
            return new GetResourcePackagePriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourcePackagePriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourcePackagePriceResponseBody</p>
     */
    public static class Promotion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Promotion(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Promotion create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * <p>The ID of the promotion.</p>
             * 
             * <strong>example:</strong>
             * <p>1000680914</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The description of the discount.</p>
             * 
             * <strong>example:</strong>
             * <p>A discount of 17% is offered if you purchase a resource plan for six months.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Promotion build() {
                return new Promotion(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourcePackagePriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourcePackagePriceResponseBody</p>
     */
    public static class Promotions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Promotion")
        private java.util.List<Promotion> promotion;

        private Promotions(Builder builder) {
            this.promotion = builder.promotion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Promotions create() {
            return builder().build();
        }

        /**
         * @return promotion
         */
        public java.util.List<Promotion> getPromotion() {
            return this.promotion;
        }

        public static final class Builder {
            private java.util.List<Promotion> promotion; 

            /**
             * Promotion.
             */
            public Builder promotion(java.util.List<Promotion> promotion) {
                this.promotion = promotion;
                return this;
            }

            public Promotions build() {
                return new Promotions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourcePackagePriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourcePackagePriceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("Promotions")
        private Promotions promotions;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Float tradePrice;

        private Data(Builder builder) {
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.originalPrice = builder.originalPrice;
            this.promotions = builder.promotions;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return discountPrice
         */
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return promotions
         */
        public Promotions getPromotions() {
            return this.promotions;
        }

        /**
         * @return tradePrice
         */
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private String currency; 
            private Float discountPrice; 
            private Float originalPrice; 
            private Promotions promotions; 
            private Float tradePrice; 

            /**
             * <p>The type of the currency.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The discounted amount. Unit: CNY.</p>
             * 
             * <strong>example:</strong>
             * <p>215040</p>
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The original price. Unit: CNY.</p>
             * 
             * <strong>example:</strong>
             * <p>1290240</p>
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The details of the discount.</p>
             */
            public Builder promotions(Promotions promotions) {
                this.promotions = promotions;
                return this;
            }

            /**
             * <p>The price at which the transaction is made. Unit: CNY.</p>
             * 
             * <strong>example:</strong>
             * <p>1075200</p>
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
