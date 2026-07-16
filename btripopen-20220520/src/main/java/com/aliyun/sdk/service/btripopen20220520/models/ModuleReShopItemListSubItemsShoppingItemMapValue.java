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
 * {@link ModuleReShopItemListSubItemsShoppingItemMapValue} extends {@link TeaModel}
 *
 * <p>ModuleReShopItemListSubItemsShoppingItemMapValue</p>
 */
public class ModuleReShopItemListSubItemsShoppingItemMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cabin_quantity_list")
    private java.util.List<CabinQuantityList> cabinQuantityList;

    @com.aliyun.core.annotation.NameInMap("search_price")
    private SearchPrice searchPrice;

    @com.aliyun.core.annotation.NameInMap("segment_price_list")
    private java.util.List<SegmentPriceList> segmentPriceList;

    private ModuleReShopItemListSubItemsShoppingItemMapValue(Builder builder) {
        this.cabinQuantityList = builder.cabinQuantityList;
        this.searchPrice = builder.searchPrice;
        this.segmentPriceList = builder.segmentPriceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleReShopItemListSubItemsShoppingItemMapValue create() {
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

    public static final class Builder {
        private java.util.List<CabinQuantityList> cabinQuantityList; 
        private SearchPrice searchPrice; 
        private java.util.List<SegmentPriceList> segmentPriceList; 

        private Builder() {
        } 

        private Builder(ModuleReShopItemListSubItemsShoppingItemMapValue model) {
            this.cabinQuantityList = model.cabinQuantityList;
            this.searchPrice = model.searchPrice;
            this.segmentPriceList = model.segmentPriceList;
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

        public ModuleReShopItemListSubItemsShoppingItemMapValue build() {
            return new ModuleReShopItemListSubItemsShoppingItemMapValue(this);
        } 

    } 

    /**
     * 
     * {@link ModuleReShopItemListSubItemsShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleReShopItemListSubItemsShoppingItemMapValue</p>
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
     * {@link ModuleReShopItemListSubItemsShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleReShopItemListSubItemsShoppingItemMapValue</p>
     */
    public static class CabinInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("cabin_class_name")
        private String cabinClassName;

        @com.aliyun.core.annotation.NameInMap("quantity")
        private String quantity;

        @com.aliyun.core.annotation.NameInMap("cabin_class_memo")
        private String cabinClassMemo;

        @com.aliyun.core.annotation.NameInMap("specification")
        private String specification;

        private CabinInfo(Builder builder) {
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.cabinClassName = builder.cabinClassName;
            this.quantity = builder.quantity;
            this.cabinClassMemo = builder.cabinClassMemo;
            this.specification = builder.specification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CabinInfo create() {
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

        /**
         * @return cabinClassMemo
         */
        public String getCabinClassMemo() {
            return this.cabinClassMemo;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        public static final class Builder {
            private String cabin; 
            private String cabinClass; 
            private String cabinClassName; 
            private String quantity; 
            private String cabinClassMemo; 
            private String specification; 

            private Builder() {
            } 

            private Builder(CabinInfo model) {
                this.cabin = model.cabin;
                this.cabinClass = model.cabinClass;
                this.cabinClassName = model.cabinClassName;
                this.quantity = model.quantity;
                this.cabinClassMemo = model.cabinClassMemo;
                this.specification = model.specification;
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

            /**
             * cabin_class_memo.
             */
            public Builder cabinClassMemo(String cabinClassMemo) {
                this.cabinClassMemo = cabinClassMemo;
                return this;
            }

            /**
             * specification.
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            public CabinInfo build() {
                return new CabinInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModuleReShopItemListSubItemsShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleReShopItemListSubItemsShoppingItemMapValue</p>
     */
    public static class CabinQuantityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_position")
        private SegmentPosition segmentPosition;

        @com.aliyun.core.annotation.NameInMap("cabin_info")
        private CabinInfo cabinInfo;

        private CabinQuantityList(Builder builder) {
            this.segmentPosition = builder.segmentPosition;
            this.cabinInfo = builder.cabinInfo;
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
         * @return cabinInfo
         */
        public CabinInfo getCabinInfo() {
            return this.cabinInfo;
        }

        public static final class Builder {
            private SegmentPosition segmentPosition; 
            private CabinInfo cabinInfo; 

            private Builder() {
            } 

            private Builder(CabinQuantityList model) {
                this.segmentPosition = model.segmentPosition;
                this.cabinInfo = model.cabinInfo;
            } 

            /**
             * segment_position.
             */
            public Builder segmentPosition(SegmentPosition segmentPosition) {
                this.segmentPosition = segmentPosition;
                return this;
            }

            /**
             * cabin_info.
             */
            public Builder cabinInfo(CabinInfo cabinInfo) {
                this.cabinInfo = cabinInfo;
                return this;
            }

            public CabinQuantityList build() {
                return new CabinQuantityList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModuleReShopItemListSubItemsShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleReShopItemListSubItemsShoppingItemMapValue</p>
     */
    public static class SearchPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("total_amount")
        private Long totalAmount;

        @com.aliyun.core.annotation.NameInMap("handling_amount")
        private Long handlingAmount;

        @com.aliyun.core.annotation.NameInMap("upgrade_amount")
        private Long upgradeAmount;

        @com.aliyun.core.annotation.NameInMap("tax_diff_amount")
        private Long taxDiffAmount;

        @com.aliyun.core.annotation.NameInMap("has_price")
        private Boolean hasPrice;

        @com.aliyun.core.annotation.NameInMap("non_price_text")
        private String nonPriceText;

        private SearchPrice(Builder builder) {
            this.totalAmount = builder.totalAmount;
            this.handlingAmount = builder.handlingAmount;
            this.upgradeAmount = builder.upgradeAmount;
            this.taxDiffAmount = builder.taxDiffAmount;
            this.hasPrice = builder.hasPrice;
            this.nonPriceText = builder.nonPriceText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchPrice create() {
            return builder().build();
        }

        /**
         * @return totalAmount
         */
        public Long getTotalAmount() {
            return this.totalAmount;
        }

        /**
         * @return handlingAmount
         */
        public Long getHandlingAmount() {
            return this.handlingAmount;
        }

        /**
         * @return upgradeAmount
         */
        public Long getUpgradeAmount() {
            return this.upgradeAmount;
        }

        /**
         * @return taxDiffAmount
         */
        public Long getTaxDiffAmount() {
            return this.taxDiffAmount;
        }

        /**
         * @return hasPrice
         */
        public Boolean getHasPrice() {
            return this.hasPrice;
        }

        /**
         * @return nonPriceText
         */
        public String getNonPriceText() {
            return this.nonPriceText;
        }

        public static final class Builder {
            private Long totalAmount; 
            private Long handlingAmount; 
            private Long upgradeAmount; 
            private Long taxDiffAmount; 
            private Boolean hasPrice; 
            private String nonPriceText; 

            private Builder() {
            } 

            private Builder(SearchPrice model) {
                this.totalAmount = model.totalAmount;
                this.handlingAmount = model.handlingAmount;
                this.upgradeAmount = model.upgradeAmount;
                this.taxDiffAmount = model.taxDiffAmount;
                this.hasPrice = model.hasPrice;
                this.nonPriceText = model.nonPriceText;
            } 

            /**
             * total_amount.
             */
            public Builder totalAmount(Long totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * handling_amount.
             */
            public Builder handlingAmount(Long handlingAmount) {
                this.handlingAmount = handlingAmount;
                return this;
            }

            /**
             * upgrade_amount.
             */
            public Builder upgradeAmount(Long upgradeAmount) {
                this.upgradeAmount = upgradeAmount;
                return this;
            }

            /**
             * tax_diff_amount.
             */
            public Builder taxDiffAmount(Long taxDiffAmount) {
                this.taxDiffAmount = taxDiffAmount;
                return this;
            }

            /**
             * has_price.
             */
            public Builder hasPrice(Boolean hasPrice) {
                this.hasPrice = hasPrice;
                return this;
            }

            /**
             * non_price_text.
             */
            public Builder nonPriceText(String nonPriceText) {
                this.nonPriceText = nonPriceText;
                return this;
            }

            public SearchPrice build() {
                return new SearchPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModuleReShopItemListSubItemsShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleReShopItemListSubItemsShoppingItemMapValue</p>
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
     * {@link ModuleReShopItemListSubItemsShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleReShopItemListSubItemsShoppingItemMapValue</p>
     */
    public static class SegmentPriceListSearchPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("total_amount")
        private Long totalAmount;

        @com.aliyun.core.annotation.NameInMap("handling_amount")
        private Long handlingAmount;

        @com.aliyun.core.annotation.NameInMap("upgrade_amount")
        private Long upgradeAmount;

        @com.aliyun.core.annotation.NameInMap("tax_diff_amount")
        private Long taxDiffAmount;

        @com.aliyun.core.annotation.NameInMap("has_price")
        private Boolean hasPrice;

        @com.aliyun.core.annotation.NameInMap("non_price_text")
        private String nonPriceText;

        private SegmentPriceListSearchPrice(Builder builder) {
            this.totalAmount = builder.totalAmount;
            this.handlingAmount = builder.handlingAmount;
            this.upgradeAmount = builder.upgradeAmount;
            this.taxDiffAmount = builder.taxDiffAmount;
            this.hasPrice = builder.hasPrice;
            this.nonPriceText = builder.nonPriceText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentPriceListSearchPrice create() {
            return builder().build();
        }

        /**
         * @return totalAmount
         */
        public Long getTotalAmount() {
            return this.totalAmount;
        }

        /**
         * @return handlingAmount
         */
        public Long getHandlingAmount() {
            return this.handlingAmount;
        }

        /**
         * @return upgradeAmount
         */
        public Long getUpgradeAmount() {
            return this.upgradeAmount;
        }

        /**
         * @return taxDiffAmount
         */
        public Long getTaxDiffAmount() {
            return this.taxDiffAmount;
        }

        /**
         * @return hasPrice
         */
        public Boolean getHasPrice() {
            return this.hasPrice;
        }

        /**
         * @return nonPriceText
         */
        public String getNonPriceText() {
            return this.nonPriceText;
        }

        public static final class Builder {
            private Long totalAmount; 
            private Long handlingAmount; 
            private Long upgradeAmount; 
            private Long taxDiffAmount; 
            private Boolean hasPrice; 
            private String nonPriceText; 

            private Builder() {
            } 

            private Builder(SegmentPriceListSearchPrice model) {
                this.totalAmount = model.totalAmount;
                this.handlingAmount = model.handlingAmount;
                this.upgradeAmount = model.upgradeAmount;
                this.taxDiffAmount = model.taxDiffAmount;
                this.hasPrice = model.hasPrice;
                this.nonPriceText = model.nonPriceText;
            } 

            /**
             * total_amount.
             */
            public Builder totalAmount(Long totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * handling_amount.
             */
            public Builder handlingAmount(Long handlingAmount) {
                this.handlingAmount = handlingAmount;
                return this;
            }

            /**
             * upgrade_amount.
             */
            public Builder upgradeAmount(Long upgradeAmount) {
                this.upgradeAmount = upgradeAmount;
                return this;
            }

            /**
             * tax_diff_amount.
             */
            public Builder taxDiffAmount(Long taxDiffAmount) {
                this.taxDiffAmount = taxDiffAmount;
                return this;
            }

            /**
             * has_price.
             */
            public Builder hasPrice(Boolean hasPrice) {
                this.hasPrice = hasPrice;
                return this;
            }

            /**
             * non_price_text.
             */
            public Builder nonPriceText(String nonPriceText) {
                this.nonPriceText = nonPriceText;
                return this;
            }

            public SegmentPriceListSearchPrice build() {
                return new SegmentPriceListSearchPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModuleReShopItemListSubItemsShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleReShopItemListSubItemsShoppingItemMapValue</p>
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
