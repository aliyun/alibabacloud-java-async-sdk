// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPriceResponseBody} extends {@link TeaModel}
 *
 * <p>GetPriceResponseBody</p>
 */
public class GetPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("price")
    private Price price;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetPriceResponseBody(Builder builder) {
        this.price = builder.price;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPriceResponseBody create() {
        return builder().build();
    }

    /**
     * @return price
     */
    public Price getPrice() {
        return this.price;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Price price; 
        private String requestId; 

        /**
         * price.
         */
        public Builder price(Price price) {
            this.price = price;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPriceResponseBody build() {
            return new GetPriceResponseBody(this);
        } 

    } 

    public static class ModuleDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("costAfterDiscount")
        private Float costAfterDiscount;

        @com.aliyun.core.annotation.NameInMap("invoiceDiscount")
        private Float invoiceDiscount;

        @com.aliyun.core.annotation.NameInMap("moduleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("moduleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("originalCost")
        private Float originalCost;

        @com.aliyun.core.annotation.NameInMap("priceType")
        private String priceType;

        private ModuleDetails(Builder builder) {
            this.costAfterDiscount = builder.costAfterDiscount;
            this.invoiceDiscount = builder.invoiceDiscount;
            this.moduleCode = builder.moduleCode;
            this.moduleName = builder.moduleName;
            this.originalCost = builder.originalCost;
            this.priceType = builder.priceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleDetails create() {
            return builder().build();
        }

        /**
         * @return costAfterDiscount
         */
        public Float getCostAfterDiscount() {
            return this.costAfterDiscount;
        }

        /**
         * @return invoiceDiscount
         */
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return originalCost
         */
        public Float getOriginalCost() {
            return this.originalCost;
        }

        /**
         * @return priceType
         */
        public String getPriceType() {
            return this.priceType;
        }

        public static final class Builder {
            private Float costAfterDiscount; 
            private Float invoiceDiscount; 
            private String moduleCode; 
            private String moduleName; 
            private Float originalCost; 
            private String priceType; 

            /**
             * costAfterDiscount.
             */
            public Builder costAfterDiscount(Float costAfterDiscount) {
                this.costAfterDiscount = costAfterDiscount;
                return this;
            }

            /**
             * invoiceDiscount.
             */
            public Builder invoiceDiscount(Float invoiceDiscount) {
                this.invoiceDiscount = invoiceDiscount;
                return this;
            }

            /**
             * moduleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * moduleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * originalCost.
             */
            public Builder originalCost(Float originalCost) {
                this.originalCost = originalCost;
                return this;
            }

            /**
             * priceType.
             */
            public Builder priceType(String priceType) {
                this.priceType = priceType;
                return this;
            }

            public ModuleDetails build() {
                return new ModuleDetails(this);
            } 

        } 

    }
    public static class PromotionDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("promotionDesc")
        private String promotionDesc;

        @com.aliyun.core.annotation.NameInMap("promotionId")
        private Long promotionId;

        @com.aliyun.core.annotation.NameInMap("promotionName")
        private String promotionName;

        private PromotionDetails(Builder builder) {
            this.promotionDesc = builder.promotionDesc;
            this.promotionId = builder.promotionId;
            this.promotionName = builder.promotionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromotionDetails create() {
            return builder().build();
        }

        /**
         * @return promotionDesc
         */
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        /**
         * @return promotionId
         */
        public Long getPromotionId() {
            return this.promotionId;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        public static final class Builder {
            private String promotionDesc; 
            private Long promotionId; 
            private String promotionName; 

            /**
             * promotionDesc.
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * promotionId.
             */
            public Builder promotionId(Long promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * promotionName.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            public PromotionDetails build() {
                return new PromotionDetails(this);
            } 

        } 

    }
    public static class Price extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("discountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("moduleDetails")
        private java.util.List < ModuleDetails> moduleDetails;

        @com.aliyun.core.annotation.NameInMap("originalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("promotionDetails")
        private java.util.List < PromotionDetails> promotionDetails;

        @com.aliyun.core.annotation.NameInMap("tradePrice")
        private Float tradePrice;

        private Price(Builder builder) {
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.moduleDetails = builder.moduleDetails;
            this.originalPrice = builder.originalPrice;
            this.promotionDetails = builder.promotionDetails;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Price create() {
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
         * @return moduleDetails
         */
        public java.util.List < ModuleDetails> getModuleDetails() {
            return this.moduleDetails;
        }

        /**
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return promotionDetails
         */
        public java.util.List < PromotionDetails> getPromotionDetails() {
            return this.promotionDetails;
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
            private java.util.List < ModuleDetails> moduleDetails; 
            private Float originalPrice; 
            private java.util.List < PromotionDetails> promotionDetails; 
            private Float tradePrice; 

            /**
             * currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * discountPrice.
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * moduleDetails.
             */
            public Builder moduleDetails(java.util.List < ModuleDetails> moduleDetails) {
                this.moduleDetails = moduleDetails;
                return this;
            }

            /**
             * originalPrice.
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * promotionDetails.
             */
            public Builder promotionDetails(java.util.List < PromotionDetails> promotionDetails) {
                this.promotionDetails = promotionDetails;
                return this;
            }

            /**
             * tradePrice.
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public Price build() {
                return new Price(this);
            } 

        } 

    }
}
