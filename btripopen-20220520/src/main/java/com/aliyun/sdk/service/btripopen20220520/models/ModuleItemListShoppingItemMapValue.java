// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link ModuleItemListShoppingItemMapValue} extends {@link TeaModel}
 *
 * <p>ModuleItemListShoppingItemMapValue</p>
 */
public class ModuleItemListShoppingItemMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cabin_quantity_list")
    private java.util.List<CabinQuantityList> cabinQuantityList;

    @com.aliyun.core.annotation.NameInMap("search_price")
    private SearchPrice searchPrice;

    @com.aliyun.core.annotation.NameInMap("segment_price_list")
    private java.util.List<SegmentPriceList> segmentPriceList;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("cabin_quantity")
    private java.util.Map<String, ModuleItemListShoppingItemMapValueCabinQuantityValue> cabinQuantity;

    @com.aliyun.core.annotation.NameInMap("segment_price")
    private java.util.Map<String, ModuleItemListShoppingItemMapValueSegmentPriceValue> segmentPrice;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cabinQuantityList
     */
    public java.util.List<CabinQuantityList> getCabinQuantityList() {
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
    public java.util.List<SegmentPriceList> getSegmentPriceList() {
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
    public java.util.Map<String, ModuleItemListShoppingItemMapValueCabinQuantityValue> getCabinQuantity() {
        return this.cabinQuantity;
    }

    /**
     * @return segmentPrice
     */
    public java.util.Map<String, ModuleItemListShoppingItemMapValueSegmentPriceValue> getSegmentPrice() {
        return this.segmentPrice;
    }

    public static final class Builder {
        private java.util.List<CabinQuantityList> cabinQuantityList; 
        private SearchPrice searchPrice; 
        private java.util.List<SegmentPriceList> segmentPriceList; 
        private String id; 
        private java.util.Map<String, ModuleItemListShoppingItemMapValueCabinQuantityValue> cabinQuantity; 
        private java.util.Map<String, ModuleItemListShoppingItemMapValueSegmentPriceValue> segmentPrice; 

        private Builder() {
        } 

        private Builder(ModuleItemListShoppingItemMapValue model) {
            this.cabinQuantityList = model.cabinQuantityList;
            this.searchPrice = model.searchPrice;
            this.segmentPriceList = model.segmentPriceList;
            this.id = model.id;
            this.cabinQuantity = model.cabinQuantity;
            this.segmentPrice = model.segmentPrice;
        } 

        /**
         * cabin_quantity_list.
         */
        public Builder cabinQuantityList(java.util.List<CabinQuantityList> cabinQuantityList) {
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
        public Builder segmentPriceList(java.util.List<SegmentPriceList> segmentPriceList) {
            this.segmentPriceList = segmentPriceList;
            return this;
        }

        /**
         * <p>id</p>
         * 
         * <strong>example:</strong>
         * <p>ADT07df0bd9-f803-4a50-8449-f4bd675d9939</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * cabin_quantity.
         */
        public Builder cabinQuantity(java.util.Map<String, ModuleItemListShoppingItemMapValueCabinQuantityValue> cabinQuantity) {
            this.cabinQuantity = cabinQuantity;
            return this;
        }

        /**
         * segment_price.
         */
        public Builder segmentPrice(java.util.Map<String, ModuleItemListShoppingItemMapValueSegmentPriceValue> segmentPrice) {
            this.segmentPrice = segmentPrice;
            return this;
        }

        public ModuleItemListShoppingItemMapValue build() {
            return new ModuleItemListShoppingItemMapValue(this);
        } 

    } 

    /**
     * 
     * {@link ModuleItemListShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleItemListShoppingItemMapValue</p>
     */
    public static class SegmentPosition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("segment_index")
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

            private Builder() {
            } 

            private Builder(SegmentPosition model) {
                this.journeyIndex = model.journeyIndex;
                this.segmentIndex = model.segmentIndex;
            } 

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
    /**
     * 
     * {@link ModuleItemListShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleItemListShoppingItemMapValue</p>
     */
    public static class Cabin extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("cabin_class_name")
        private String cabinClassName;

        @com.aliyun.core.annotation.NameInMap("quantity")
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

            private Builder() {
            } 

            private Builder(Cabin model) {
                this.cabin = model.cabin;
                this.cabinClass = model.cabinClass;
                this.cabinClassName = model.cabinClassName;
                this.quantity = model.quantity;
            } 

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
    /**
     * 
     * {@link ModuleItemListShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleItemListShoppingItemMapValue</p>
     */
    public static class CabinQuantityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_position")
        private SegmentPosition segmentPosition;

        @com.aliyun.core.annotation.NameInMap("cabin")
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

            private Builder() {
            } 

            private Builder(CabinQuantityList model) {
                this.segmentPosition = model.segmentPosition;
                this.cabin = model.cabin;
            } 

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
    /**
     * 
     * {@link ModuleItemListShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleItemListShoppingItemMapValue</p>
     */
    public static class PriceShowInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("discount_info")
        private String discountInfo;

        @com.aliyun.core.annotation.NameInMap("discount_num")
        private Double discountNum;

        @com.aliyun.core.annotation.NameInMap("show_ticket_price")
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

            private Builder() {
            } 

            private Builder(PriceShowInfo model) {
                this.discountInfo = model.discountInfo;
                this.discountNum = model.discountNum;
                this.showTicketPrice = model.showTicketPrice;
            } 

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
    /**
     * 
     * {@link ModuleItemListShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleItemListShoppingItemMapValue</p>
     */
    public static class SearchPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("floor_price")
        private Integer floorPrice;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Integer ticketPrice;

        @com.aliyun.core.annotation.NameInMap("sell_price")
        private Integer sellPrice;

        @com.aliyun.core.annotation.NameInMap("original_sell_price")
        private Integer originalSellPrice;

        @com.aliyun.core.annotation.NameInMap("base_total_price")
        private Integer baseTotalPrice;

        @com.aliyun.core.annotation.NameInMap("before_control_price")
        private Integer beforeControlPrice;

        @com.aliyun.core.annotation.NameInMap("tax")
        private Integer tax;

        @com.aliyun.core.annotation.NameInMap("supply_price")
        private Integer supplyPrice;

        @com.aliyun.core.annotation.NameInMap("basic_cabin_price")
        private Integer basicCabinPrice;

        @com.aliyun.core.annotation.NameInMap("build_price")
        private Integer buildPrice;

        @com.aliyun.core.annotation.NameInMap("oil_price")
        private Integer oilPrice;

        @com.aliyun.core.annotation.NameInMap("first_standard_price")
        private Integer firstStandardPrice;

        @com.aliyun.core.annotation.NameInMap("business_standard_price")
        private Integer businessStandardPrice;

        @com.aliyun.core.annotation.NameInMap("common_standard_price")
        private Integer commonStandardPrice;

        @com.aliyun.core.annotation.NameInMap("inter_ticket_price")
        private Integer interTicketPrice;

        @com.aliyun.core.annotation.NameInMap("subtracted_price")
        private Integer subtractedPrice;

        @com.aliyun.core.annotation.NameInMap("origin_common_price")
        private Integer originCommonPrice;

        @com.aliyun.core.annotation.NameInMap("dynamic_promotion_price")
        private Integer dynamicPromotionPrice;

        @com.aliyun.core.annotation.NameInMap("installment_num")
        private Integer installmentNum;

        @com.aliyun.core.annotation.NameInMap("installment_price")
        private Double installmentPrice;

        @com.aliyun.core.annotation.NameInMap("competition_dynamic_price")
        private Integer competitionDynamicPrice;

        @com.aliyun.core.annotation.NameInMap("competition_promotion_price")
        private Integer competitionPromotionPrice;

        @com.aliyun.core.annotation.NameInMap("min_before_control_price_of_normal")
        private Integer minBeforeControlPriceOfNormal;

        @com.aliyun.core.annotation.NameInMap("price_show_info")
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

            private Builder() {
            } 

            private Builder(SearchPrice model) {
                this.floorPrice = model.floorPrice;
                this.ticketPrice = model.ticketPrice;
                this.sellPrice = model.sellPrice;
                this.originalSellPrice = model.originalSellPrice;
                this.baseTotalPrice = model.baseTotalPrice;
                this.beforeControlPrice = model.beforeControlPrice;
                this.tax = model.tax;
                this.supplyPrice = model.supplyPrice;
                this.basicCabinPrice = model.basicCabinPrice;
                this.buildPrice = model.buildPrice;
                this.oilPrice = model.oilPrice;
                this.firstStandardPrice = model.firstStandardPrice;
                this.businessStandardPrice = model.businessStandardPrice;
                this.commonStandardPrice = model.commonStandardPrice;
                this.interTicketPrice = model.interTicketPrice;
                this.subtractedPrice = model.subtractedPrice;
                this.originCommonPrice = model.originCommonPrice;
                this.dynamicPromotionPrice = model.dynamicPromotionPrice;
                this.installmentNum = model.installmentNum;
                this.installmentPrice = model.installmentPrice;
                this.competitionDynamicPrice = model.competitionDynamicPrice;
                this.competitionPromotionPrice = model.competitionPromotionPrice;
                this.minBeforeControlPriceOfNormal = model.minBeforeControlPriceOfNormal;
                this.priceShowInfo = model.priceShowInfo;
            } 

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
             * <p>fdPrice</p>
             * 
             * <strong>example:</strong>
             * <p>fdPrice</p>
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
    /**
     * 
     * {@link ModuleItemListShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleItemListShoppingItemMapValue</p>
     */
    public static class SegmentPriceListSegmentPosition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("segment_index")
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

            private Builder() {
            } 

            private Builder(SegmentPriceListSegmentPosition model) {
                this.journeyIndex = model.journeyIndex;
                this.segmentIndex = model.segmentIndex;
            } 

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
    /**
     * 
     * {@link ModuleItemListShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleItemListShoppingItemMapValue</p>
     */
    public static class SegmentPriceListSearchPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Integer ticketPrice;

        @com.aliyun.core.annotation.NameInMap("sell_price")
        private Integer sellPrice;

        @com.aliyun.core.annotation.NameInMap("tax")
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

            private Builder() {
            } 

            private Builder(SegmentPriceListSearchPrice model) {
                this.ticketPrice = model.ticketPrice;
                this.sellPrice = model.sellPrice;
                this.tax = model.tax;
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
    /**
     * 
     * {@link ModuleItemListShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleItemListShoppingItemMapValue</p>
     */
    public static class SegmentPriceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_position")
        private SegmentPriceListSegmentPosition segmentPosition;

        @com.aliyun.core.annotation.NameInMap("search_price")
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

            private Builder() {
            } 

            private Builder(SegmentPriceList model) {
                this.segmentPosition = model.segmentPosition;
                this.searchPrice = model.searchPrice;
            } 

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
