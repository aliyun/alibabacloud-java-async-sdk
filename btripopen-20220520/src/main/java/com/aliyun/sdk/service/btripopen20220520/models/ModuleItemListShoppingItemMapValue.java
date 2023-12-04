// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModuleItemListShoppingItemMapValue} extends {@link TeaModel}
 *
 * <p>ModuleItemListShoppingItemMapValue</p>
 */
public class ModuleItemListShoppingItemMapValue extends TeaModel {
    @NameInMap("cabin_quantity_list")
    private java.util.List < CabinQuantityList> cabinQuantityList;

    @NameInMap("search_price")
    private SearchPrice searchPrice;

    @NameInMap("segment_price_list")
    private java.util.List < SegmentPriceList> segmentPriceList;

    @NameInMap("id")
    private String id;

    @NameInMap("cabin_quantity")
    private java.util.Map < String, ModuleItemListShoppingItemMapValueCabinQuantityValue > cabinQuantity;

    @NameInMap("segment_price")
    private java.util.Map < String, ModuleItemListShoppingItemMapValueSegmentPriceValue > segmentPrice;

    private ModuleItemListShoppingItemMapValue(Builder builder) {
        this.cabinQuantityList = builder.cabinQuantityList;
        this.searchPrice = builder.searchPrice;
        this.segmentPriceList = builder.segmentPriceList;
        this.id = builder.id;
        this.cabinQuantity = builder.cabinQuantity;
        this.segmentPrice = builder.segmentPrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleItemListShoppingItemMapValue create() {
        return builder().build();
    }

    /**
     * @return cabinQuantityList
     */
    public java.util.List < CabinQuantityList> getCabinQuantityList() {
        return this.cabinQuantityList;
    }

    /**
     * @return searchPrice
     */
    public SearchPrice getSearchPrice() {
        return this.searchPrice;
    }

    /**
     * @return segmentPriceList
     */
    public java.util.List < SegmentPriceList> getSegmentPriceList() {
        return this.segmentPriceList;
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
    public java.util.Map < String, ModuleItemListShoppingItemMapValueCabinQuantityValue > getCabinQuantity() {
        return this.cabinQuantity;
    }

    /**
     * @return segmentPrice
     */
    public java.util.Map < String, ModuleItemListShoppingItemMapValueSegmentPriceValue > getSegmentPrice() {
        return this.segmentPrice;
    }

    public static final class Builder {
        private java.util.List < CabinQuantityList> cabinQuantityList; 
        private SearchPrice searchPrice; 
        private java.util.List < SegmentPriceList> segmentPriceList; 
        private String id; 
        private java.util.Map < String, ModuleItemListShoppingItemMapValueCabinQuantityValue > cabinQuantity; 
        private java.util.Map < String, ModuleItemListShoppingItemMapValueSegmentPriceValue > segmentPrice; 

        /**
         * cabin_quantity_list.
         */
        public Builder cabinQuantityList(java.util.List < CabinQuantityList> cabinQuantityList) {
            this.cabinQuantityList = cabinQuantityList;
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
         * segment_price_list.
         */
        public Builder segmentPriceList(java.util.List < SegmentPriceList> segmentPriceList) {
            this.segmentPriceList = segmentPriceList;
            return this;
        }

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
        public Builder cabinQuantity(java.util.Map < String, ModuleItemListShoppingItemMapValueCabinQuantityValue > cabinQuantity) {
            this.cabinQuantity = cabinQuantity;
            return this;
        }

        /**
         * segment_price.
         */
        public Builder segmentPrice(java.util.Map < String, ModuleItemListShoppingItemMapValueSegmentPriceValue > segmentPrice) {
            this.segmentPrice = segmentPrice;
            return this;
        }

        public ModuleItemListShoppingItemMapValue build() {
            return new ModuleItemListShoppingItemMapValue(this);
        } 

    } 

    public static class SegmentPosition extends TeaModel {
        @NameInMap("journey_index")
        private Integer journeyIndex;

        @NameInMap("segment_index")
        private Integer segmentIndex;

        private SegmentPosition(Builder builder) {
            this.journeyIndex = builder.journeyIndex;
            this.segmentIndex = builder.segmentIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentPosition create() {
            return builder().build();
        }

        /**
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public static final class Builder {
            private Integer journeyIndex; 
            private Integer segmentIndex; 

            /**
             * journey_index.
             */
            public Builder journeyIndex(Integer journeyIndex) {
                this.journeyIndex = journeyIndex;
                return this;
            }

            /**
             * segment_index.
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
                return this;
            }

            public SegmentPosition build() {
                return new SegmentPosition(this);
            } 

        } 

    }
    public static class Cabin extends TeaModel {
        @NameInMap("cabin")
        private String cabin;

        @NameInMap("cabin_class")
        private String cabinClass;

        @NameInMap("cabin_class_name")
        private String cabinClassName;

        @NameInMap("quantity")
        private String quantity;

        private Cabin(Builder builder) {
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.cabinClassName = builder.cabinClassName;
            this.quantity = builder.quantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cabin create() {
            return builder().build();
        }

        /**
         * @return cabin
         */
        public String getCabin() {
            return this.cabin;
        }

        /**
         * @return cabinClass
         */
        public String getCabinClass() {
            return this.cabinClass;
        }

        /**
         * @return cabinClassName
         */
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        /**
         * @return quantity
         */
        public String getQuantity() {
            return this.quantity;
        }

        public static final class Builder {
            private String cabin; 
            private String cabinClass; 
            private String cabinClassName; 
            private String quantity; 

            /**
             * cabin.
             */
            public Builder cabin(String cabin) {
                this.cabin = cabin;
                return this;
            }

            /**
             * cabin_class.
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * cabin_class_name.
             */
            public Builder cabinClassName(String cabinClassName) {
                this.cabinClassName = cabinClassName;
                return this;
            }

            /**
             * quantity.
             */
            public Builder quantity(String quantity) {
                this.quantity = quantity;
                return this;
            }

            public Cabin build() {
                return new Cabin(this);
            } 

        } 

    }
    public static class CabinQuantityList extends TeaModel {
        @NameInMap("segment_position")
        private SegmentPosition segmentPosition;

        @NameInMap("cabin")
        private Cabin cabin;

        private CabinQuantityList(Builder builder) {
            this.segmentPosition = builder.segmentPosition;
            this.cabin = builder.cabin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CabinQuantityList create() {
            return builder().build();
        }

        /**
         * @return segmentPosition
         */
        public SegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        /**
         * @return cabin
         */
        public Cabin getCabin() {
            return this.cabin;
        }

        public static final class Builder {
            private SegmentPosition segmentPosition; 
            private Cabin cabin; 

            /**
             * segment_position.
             */
            public Builder segmentPosition(SegmentPosition segmentPosition) {
                this.segmentPosition = segmentPosition;
                return this;
            }

            /**
             * cabin.
             */
            public Builder cabin(Cabin cabin) {
                this.cabin = cabin;
                return this;
            }

            public CabinQuantityList build() {
                return new CabinQuantityList(this);
            } 

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
    public static class SegmentPriceListSegmentPosition extends TeaModel {
        @NameInMap("journey_index")
        private Integer journeyIndex;

        @NameInMap("segment_index")
        private Integer segmentIndex;

        private SegmentPriceListSegmentPosition(Builder builder) {
            this.journeyIndex = builder.journeyIndex;
            this.segmentIndex = builder.segmentIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentPriceListSegmentPosition create() {
            return builder().build();
        }

        /**
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public static final class Builder {
            private Integer journeyIndex; 
            private Integer segmentIndex; 

            /**
             * journey_index.
             */
            public Builder journeyIndex(Integer journeyIndex) {
                this.journeyIndex = journeyIndex;
                return this;
            }

            /**
             * segment_index.
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
                return this;
            }

            public SegmentPriceListSegmentPosition build() {
                return new SegmentPriceListSegmentPosition(this);
            } 

        } 

    }
    public static class SegmentPriceListSearchPrice extends TeaModel {
        @NameInMap("ticket_price")
        private Integer ticketPrice;

        @NameInMap("sell_price")
        private Integer sellPrice;

        @NameInMap("tax")
        private Integer tax;

        private SegmentPriceListSearchPrice(Builder builder) {
            this.ticketPrice = builder.ticketPrice;
            this.sellPrice = builder.sellPrice;
            this.tax = builder.tax;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentPriceListSearchPrice create() {
            return builder().build();
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
         * @return tax
         */
        public Integer getTax() {
            return this.tax;
        }

        public static final class Builder {
            private Integer ticketPrice; 
            private Integer sellPrice; 
            private Integer tax; 

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
             * tax.
             */
            public Builder tax(Integer tax) {
                this.tax = tax;
                return this;
            }

            public SegmentPriceListSearchPrice build() {
                return new SegmentPriceListSearchPrice(this);
            } 

        } 

    }
    public static class SegmentPriceList extends TeaModel {
        @NameInMap("segment_position")
        private SegmentPriceListSegmentPosition segmentPosition;

        @NameInMap("search_price")
        private SegmentPriceListSearchPrice searchPrice;

        private SegmentPriceList(Builder builder) {
            this.segmentPosition = builder.segmentPosition;
            this.searchPrice = builder.searchPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentPriceList create() {
            return builder().build();
        }

        /**
         * @return segmentPosition
         */
        public SegmentPriceListSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        /**
         * @return searchPrice
         */
        public SegmentPriceListSearchPrice getSearchPrice() {
            return this.searchPrice;
        }

        public static final class Builder {
            private SegmentPriceListSegmentPosition segmentPosition; 
            private SegmentPriceListSearchPrice searchPrice; 

            /**
             * segment_position.
             */
            public Builder segmentPosition(SegmentPriceListSegmentPosition segmentPosition) {
                this.segmentPosition = segmentPosition;
                return this;
            }

            /**
             * search_price.
             */
            public Builder searchPrice(SegmentPriceListSearchPrice searchPrice) {
                this.searchPrice = searchPrice;
                return this;
            }

            public SegmentPriceList build() {
                return new SegmentPriceList(this);
            } 

        } 

    }
}
