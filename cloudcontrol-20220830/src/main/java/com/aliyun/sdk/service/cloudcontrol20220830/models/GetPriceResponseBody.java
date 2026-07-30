// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetPriceResponseBody model) {
            this.price = model.price;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The price.</p>
         */
        public Builder price(Price price) {
            this.price = price;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPriceResponseBody build() {
            return new GetPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetPriceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ModuleDetails model) {
                this.costAfterDiscount = model.costAfterDiscount;
                this.invoiceDiscount = model.invoiceDiscount;
                this.moduleCode = model.moduleCode;
                this.moduleName = model.moduleName;
                this.originalCost = model.originalCost;
                this.priceType = model.priceType;
            } 

            /**
             * <p>The discount price.</p>
             * 
             * <strong>example:</strong>
             * <p>0.02</p>
             */
            public Builder costAfterDiscount(Float costAfterDiscount) {
                this.costAfterDiscount = costAfterDiscount;
                return this;
            }

            /**
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder invoiceDiscount(Float invoiceDiscount) {
                this.invoiceDiscount = invoiceDiscount;
                return this;
            }

            /**
             * <p>The code of the pricing module.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceRent</p>
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * <p>The name of the pricing module.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceRent</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>1000.0</p>
             */
            public Builder originalCost(Float originalCost) {
                this.originalCost = originalCost;
                return this;
            }

            /**
             * <p>The price type.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
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
    /**
     * 
     * {@link GetPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetPriceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PromotionDetails model) {
                this.promotionDesc = model.promotionDesc;
                this.promotionId = model.promotionId;
                this.promotionName = model.promotionName;
            } 

            /**
             * <p>The description of the promotion.</p>
             * 
             * <strong>example:</strong>
             * <p>37284</p>
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * <p>The ID of the promotion.</p>
             */
            public Builder promotionId(Long promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * <p>The name of the promotion.</p>
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
    /**
     * 
     * {@link GetPriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetPriceResponseBody</p>
     */
    public static class Price extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("discountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("moduleDetails")
        private java.util.List<ModuleDetails> moduleDetails;

        @com.aliyun.core.annotation.NameInMap("originalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("promotionDetails")
        private java.util.List<PromotionDetails> promotionDetails;

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
        public java.util.List<ModuleDetails> getModuleDetails() {
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
        public java.util.List<PromotionDetails> getPromotionDetails() {
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
            private java.util.List<ModuleDetails> moduleDetails; 
            private Float originalPrice; 
            private java.util.List<PromotionDetails> promotionDetails; 
            private Float tradePrice; 

            private Builder() {
            } 

            private Builder(Price model) {
                this.currency = model.currency;
                this.discountPrice = model.discountPrice;
                this.moduleDetails = model.moduleDetails;
                this.originalPrice = model.originalPrice;
                this.promotionDetails = model.promotionDetails;
                this.tradePrice = model.tradePrice;
            } 

            /**
             * <p>The currency type. Valid values: CNY: Chinese Yuan. USD: US dollar. JPY: Japanese Yen.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The order details of the pricing module.</p>
             */
            public Builder moduleDetails(java.util.List<ModuleDetails> moduleDetails) {
                this.moduleDetails = moduleDetails;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>760.0</p>
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The details of the promotion.</p>
             */
            public Builder promotionDetails(java.util.List<PromotionDetails> promotionDetails) {
                this.promotionDetails = promotionDetails;
                return this;
            }

            /**
             * <p>The discount price.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
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
