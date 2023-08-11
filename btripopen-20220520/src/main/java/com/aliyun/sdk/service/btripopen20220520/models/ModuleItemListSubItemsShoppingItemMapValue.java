// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModuleItemListSubItemsShoppingItemMapValue} extends {@link TeaModel}
 *
 * <p>ModuleItemListSubItemsShoppingItemMapValue</p>
 */
public class ModuleItemListSubItemsShoppingItemMapValue extends TeaModel {
    @NameInMap("id")
    private String id;

    @NameInMap("cabin_quantity")
    private java.util.Map < String, ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue > cabinQuantity;

    @NameInMap("search_price")
    private SearchPrice searchPrice;

    @NameInMap("segment_price")
    private java.util.Map < String, ModuleItemListSubItemsShoppingItemMapValueSegmentPriceValue > segmentPrice;

    private ModuleItemListSubItemsShoppingItemMapValue(Builder builder) {
        this.id = builder.id;
        this.cabinQuantity = builder.cabinQuantity;
        this.searchPrice = builder.searchPrice;
        this.segmentPrice = builder.segmentPrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleItemListSubItemsShoppingItemMapValue create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return cabinQuantity
     */
    public java.util.Map < String, ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue > getCabinQuantity() {
        return this.cabinQuantity;
    }

    /**
     * @return searchPrice
     */
    public SearchPrice getSearchPrice() {
        return this.searchPrice;
    }

    /**
     * @return segmentPrice
     */
    public java.util.Map < String, ModuleItemListSubItemsShoppingItemMapValueSegmentPriceValue > getSegmentPrice() {
        return this.segmentPrice;
    }

    public static final class Builder {
        private String id; 
        private java.util.Map < String, ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue > cabinQuantity; 
        private SearchPrice searchPrice; 
        private java.util.Map < String, ModuleItemListSubItemsShoppingItemMapValueSegmentPriceValue > segmentPrice; 

        /**
         * id
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * cabin_quantity.
         */
        public Builder cabinQuantity(java.util.Map < String, ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue > cabinQuantity) {
            this.cabinQuantity = cabinQuantity;
            return this;
        }

        /**
         * search_price.
         */
        public Builder searchPrice(SearchPrice searchPrice) {
            this.searchPrice = searchPrice;
            return this;
        }

        /**
         * segment_price.
         */
        public Builder segmentPrice(java.util.Map < String, ModuleItemListSubItemsShoppingItemMapValueSegmentPriceValue > segmentPrice) {
            this.segmentPrice = segmentPrice;
            return this;
        }

        public ModuleItemListSubItemsShoppingItemMapValue build() {
            return new ModuleItemListSubItemsShoppingItemMapValue(this);
        } 

    } 

    public static class PriceShowInfo extends TeaModel {
        @NameInMap("discount_info")
        private String discountInfo;

        @NameInMap("discount_num")
        private Double discountNum;

        @NameInMap("show_ticket_price")
        private Boolean showTicketPrice;

        private PriceShowInfo(Builder builder) {
            this.discountInfo = builder.discountInfo;
            this.discountNum = builder.discountNum;
            this.showTicketPrice = builder.showTicketPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceShowInfo create() {
            return builder().build();
        }

        /**
         * @return discountInfo
         */
        public String getDiscountInfo() {
            return this.discountInfo;
        }

        /**
         * @return discountNum
         */
        public Double getDiscountNum() {
            return this.discountNum;
        }

        /**
         * @return showTicketPrice
         */
        public Boolean getShowTicketPrice() {
            return this.showTicketPrice;
        }

        public static final class Builder {
            private String discountInfo; 
            private Double discountNum; 
            private Boolean showTicketPrice; 

            /**
             * discount_info.
             */
            public Builder discountInfo(String discountInfo) {
                this.discountInfo = discountInfo;
                return this;
            }

            /**
             * discount_num.
             */
            public Builder discountNum(Double discountNum) {
                this.discountNum = discountNum;
                return this;
            }

            /**
             * show_ticket_price.
             */
            public Builder showTicketPrice(Boolean showTicketPrice) {
                this.showTicketPrice = showTicketPrice;
                return this;
            }

            public PriceShowInfo build() {
                return new PriceShowInfo(this);
            } 

        } 

    }
    public static class SearchPrice extends TeaModel {
        @NameInMap("floor_price")
        private Integer floorPrice;

        @NameInMap("ticket_price")
        private Integer ticketPrice;

        @NameInMap("sell_price")
        private Integer sellPrice;

        @NameInMap("original_sell_price")
        private Integer originalSellPrice;

        @NameInMap("base_total_price")
        private Integer baseTotalPrice;

        @NameInMap("before_control_price")
        private Integer beforeControlPrice;

        @NameInMap("tax")
        private Integer tax;

        @NameInMap("supply_price")
        private Integer supplyPrice;

        @NameInMap("basic_cabin_price")
        private Integer basicCabinPrice;

        @NameInMap("build_price")
        private Integer buildPrice;

        @NameInMap("oil_price")
        private Integer oilPrice;

        @NameInMap("first_standard_price")
        private Integer firstStandardPrice;

        @NameInMap("business_standard_price")
        private Integer businessStandardPrice;

        @NameInMap("common_standard_price")
        private Integer commonStandardPrice;

        @NameInMap("inter_ticket_price")
        private Integer interTicketPrice;

        @NameInMap("subtracted_price")
        private Integer subtractedPrice;

        @NameInMap("origin_common_price")
        private Integer originCommonPrice;

        @NameInMap("dynamic_promotion_price")
        private Integer dynamicPromotionPrice;

        @NameInMap("installment_num")
        private Integer installmentNum;

        @NameInMap("installment_price")
        private Double installmentPrice;

        @NameInMap("competition_dynamic_price")
        private Integer competitionDynamicPrice;

        @NameInMap("competition_promotion_price")
        private Integer competitionPromotionPrice;

        @NameInMap("min_before_control_price_of_normal")
        private Integer minBeforeControlPriceOfNormal;

        @NameInMap("price_show_info")
        private PriceShowInfo priceShowInfo;

        private SearchPrice(Builder builder) {
            this.floorPrice = builder.floorPrice;
            this.ticketPrice = builder.ticketPrice;
            this.sellPrice = builder.sellPrice;
            this.originalSellPrice = builder.originalSellPrice;
            this.baseTotalPrice = builder.baseTotalPrice;
            this.beforeControlPrice = builder.beforeControlPrice;
            this.tax = builder.tax;
            this.supplyPrice = builder.supplyPrice;
            this.basicCabinPrice = builder.basicCabinPrice;
            this.buildPrice = builder.buildPrice;
            this.oilPrice = builder.oilPrice;
            this.firstStandardPrice = builder.firstStandardPrice;
            this.businessStandardPrice = builder.businessStandardPrice;
            this.commonStandardPrice = builder.commonStandardPrice;
            this.interTicketPrice = builder.interTicketPrice;
            this.subtractedPrice = builder.subtractedPrice;
            this.originCommonPrice = builder.originCommonPrice;
            this.dynamicPromotionPrice = builder.dynamicPromotionPrice;
            this.installmentNum = builder.installmentNum;
            this.installmentPrice = builder.installmentPrice;
            this.competitionDynamicPrice = builder.competitionDynamicPrice;
            this.competitionPromotionPrice = builder.competitionPromotionPrice;
            this.minBeforeControlPriceOfNormal = builder.minBeforeControlPriceOfNormal;
            this.priceShowInfo = builder.priceShowInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchPrice create() {
            return builder().build();
        }

        /**
         * @return floorPrice
         */
        public Integer getFloorPrice() {
            return this.floorPrice;
        }

        /**
         * @return ticketPrice
         */
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return sellPrice
         */
        public Integer getSellPrice() {
            return this.sellPrice;
        }

        /**
         * @return originalSellPrice
         */
        public Integer getOriginalSellPrice() {
            return this.originalSellPrice;
        }

        /**
         * @return baseTotalPrice
         */
        public Integer getBaseTotalPrice() {
            return this.baseTotalPrice;
        }

        /**
         * @return beforeControlPrice
         */
        public Integer getBeforeControlPrice() {
            return this.beforeControlPrice;
        }

        /**
         * @return tax
         */
        public Integer getTax() {
            return this.tax;
        }

        /**
         * @return supplyPrice
         */
        public Integer getSupplyPrice() {
            return this.supplyPrice;
        }

        /**
         * @return basicCabinPrice
         */
        public Integer getBasicCabinPrice() {
            return this.basicCabinPrice;
        }

        /**
         * @return buildPrice
         */
        public Integer getBuildPrice() {
            return this.buildPrice;
        }

        /**
         * @return oilPrice
         */
        public Integer getOilPrice() {
            return this.oilPrice;
        }

        /**
         * @return firstStandardPrice
         */
        public Integer getFirstStandardPrice() {
            return this.firstStandardPrice;
        }

        /**
         * @return businessStandardPrice
         */
        public Integer getBusinessStandardPrice() {
            return this.businessStandardPrice;
        }

        /**
         * @return commonStandardPrice
         */
        public Integer getCommonStandardPrice() {
            return this.commonStandardPrice;
        }

        /**
         * @return interTicketPrice
         */
        public Integer getInterTicketPrice() {
            return this.interTicketPrice;
        }

        /**
         * @return subtractedPrice
         */
        public Integer getSubtractedPrice() {
            return this.subtractedPrice;
        }

        /**
         * @return originCommonPrice
         */
        public Integer getOriginCommonPrice() {
            return this.originCommonPrice;
        }

        /**
         * @return dynamicPromotionPrice
         */
        public Integer getDynamicPromotionPrice() {
            return this.dynamicPromotionPrice;
        }

        /**
         * @return installmentNum
         */
        public Integer getInstallmentNum() {
            return this.installmentNum;
        }

        /**
         * @return installmentPrice
         */
        public Double getInstallmentPrice() {
            return this.installmentPrice;
        }

        /**
         * @return competitionDynamicPrice
         */
        public Integer getCompetitionDynamicPrice() {
            return this.competitionDynamicPrice;
        }

        /**
         * @return competitionPromotionPrice
         */
        public Integer getCompetitionPromotionPrice() {
            return this.competitionPromotionPrice;
        }

        /**
         * @return minBeforeControlPriceOfNormal
         */
        public Integer getMinBeforeControlPriceOfNormal() {
            return this.minBeforeControlPriceOfNormal;
        }

        /**
         * @return priceShowInfo
         */
        public PriceShowInfo getPriceShowInfo() {
            return this.priceShowInfo;
        }

        public static final class Builder {
            private Integer floorPrice; 
            private Integer ticketPrice; 
            private Integer sellPrice; 
            private Integer originalSellPrice; 
            private Integer baseTotalPrice; 
            private Integer beforeControlPrice; 
            private Integer tax; 
            private Integer supplyPrice; 
            private Integer basicCabinPrice; 
            private Integer buildPrice; 
            private Integer oilPrice; 
            private Integer firstStandardPrice; 
            private Integer businessStandardPrice; 
            private Integer commonStandardPrice; 
            private Integer interTicketPrice; 
            private Integer subtractedPrice; 
            private Integer originCommonPrice; 
            private Integer dynamicPromotionPrice; 
            private Integer installmentNum; 
            private Double installmentPrice; 
            private Integer competitionDynamicPrice; 
            private Integer competitionPromotionPrice; 
            private Integer minBeforeControlPriceOfNormal; 
            private PriceShowInfo priceShowInfo; 

            /**
             * floor_price.
             */
            public Builder floorPrice(Integer floorPrice) {
                this.floorPrice = floorPrice;
                return this;
            }

            /**
             * ticket_price.
             */
            public Builder ticketPrice(Integer ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * sell_price.
             */
            public Builder sellPrice(Integer sellPrice) {
                this.sellPrice = sellPrice;
                return this;
            }

            /**
             * original_sell_price.
             */
            public Builder originalSellPrice(Integer originalSellPrice) {
                this.originalSellPrice = originalSellPrice;
                return this;
            }

            /**
             * base_total_price.
             */
            public Builder baseTotalPrice(Integer baseTotalPrice) {
                this.baseTotalPrice = baseTotalPrice;
                return this;
            }

            /**
             * before_control_price.
             */
            public Builder beforeControlPrice(Integer beforeControlPrice) {
                this.beforeControlPrice = beforeControlPrice;
                return this;
            }

            /**
             * tax.
             */
            public Builder tax(Integer tax) {
                this.tax = tax;
                return this;
            }

            /**
             * supply_price.
             */
            public Builder supplyPrice(Integer supplyPrice) {
                this.supplyPrice = supplyPrice;
                return this;
            }

            /**
             * basic_cabin_price.
             */
            public Builder basicCabinPrice(Integer basicCabinPrice) {
                this.basicCabinPrice = basicCabinPrice;
                return this;
            }

            /**
             * build_price.
             */
            public Builder buildPrice(Integer buildPrice) {
                this.buildPrice = buildPrice;
                return this;
            }

            /**
             * oil_price.
             */
            public Builder oilPrice(Integer oilPrice) {
                this.oilPrice = oilPrice;
                return this;
            }

            /**
             * first_standard_price.
             */
            public Builder firstStandardPrice(Integer firstStandardPrice) {
                this.firstStandardPrice = firstStandardPrice;
                return this;
            }

            /**
             * business_standard_price.
             */
            public Builder businessStandardPrice(Integer businessStandardPrice) {
                this.businessStandardPrice = businessStandardPrice;
                return this;
            }

            /**
             * common_standard_price.
             */
            public Builder commonStandardPrice(Integer commonStandardPrice) {
                this.commonStandardPrice = commonStandardPrice;
                return this;
            }

            /**
             * fdPrice
             */
            public Builder interTicketPrice(Integer interTicketPrice) {
                this.interTicketPrice = interTicketPrice;
                return this;
            }

            /**
             * subtracted_price.
             */
            public Builder subtractedPrice(Integer subtractedPrice) {
                this.subtractedPrice = subtractedPrice;
                return this;
            }

            /**
             * origin_common_price.
             */
            public Builder originCommonPrice(Integer originCommonPrice) {
                this.originCommonPrice = originCommonPrice;
                return this;
            }

            /**
             * dynamic_promotion_price.
             */
            public Builder dynamicPromotionPrice(Integer dynamicPromotionPrice) {
                this.dynamicPromotionPrice = dynamicPromotionPrice;
                return this;
            }

            /**
             * installment_num.
             */
            public Builder installmentNum(Integer installmentNum) {
                this.installmentNum = installmentNum;
                return this;
            }

            /**
             * installment_price.
             */
            public Builder installmentPrice(Double installmentPrice) {
                this.installmentPrice = installmentPrice;
                return this;
            }

            /**
             * competition_dynamic_price.
             */
            public Builder competitionDynamicPrice(Integer competitionDynamicPrice) {
                this.competitionDynamicPrice = competitionDynamicPrice;
                return this;
            }

            /**
             * competition_promotion_price.
             */
            public Builder competitionPromotionPrice(Integer competitionPromotionPrice) {
                this.competitionPromotionPrice = competitionPromotionPrice;
                return this;
            }

            /**
             * min_before_control_price_of_normal.
             */
            public Builder minBeforeControlPriceOfNormal(Integer minBeforeControlPriceOfNormal) {
                this.minBeforeControlPriceOfNormal = minBeforeControlPriceOfNormal;
                return this;
            }

            /**
             * price_show_info.
             */
            public Builder priceShowInfo(PriceShowInfo priceShowInfo) {
                this.priceShowInfo = priceShowInfo;
                return this;
            }

            public SearchPrice build() {
                return new SearchPrice(this);
            } 

        } 

    }
}
