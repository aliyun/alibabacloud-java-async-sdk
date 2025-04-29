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
 * {@link ModuleGroupItemShoppingItemMapValue} extends {@link TeaModel}
 *
 * <p>ModuleGroupItemShoppingItemMapValue</p>
 */
public class ModuleGroupItemShoppingItemMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cabin_quantity_list")
    private java.util.List<CabinQuantityList> cabinQuantityList;

    @com.aliyun.core.annotation.NameInMap("search_price")
    private SearchPrice searchPrice;

    @com.aliyun.core.annotation.NameInMap("segment_price_list")
    private java.util.List<SegmentPriceList> segmentPriceList;

    private ModuleGroupItemShoppingItemMapValue(Builder builder) {
        this.cabinQuantityList = builder.cabinQuantityList;
        this.searchPrice = builder.searchPrice;
        this.segmentPriceList = builder.segmentPriceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleGroupItemShoppingItemMapValue create() {
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

        private Builder(ModuleGroupItemShoppingItemMapValue model) {
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

        public ModuleGroupItemShoppingItemMapValue build() {
            return new ModuleGroupItemShoppingItemMapValue(this);
        } 

    } 

    /**
     * 
     * {@link ModuleGroupItemShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleGroupItemShoppingItemMapValue</p>
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
     * {@link ModuleGroupItemShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleGroupItemShoppingItemMapValue</p>
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
     * {@link ModuleGroupItemShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleGroupItemShoppingItemMapValue</p>
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
     * {@link ModuleGroupItemShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleGroupItemShoppingItemMapValue</p>
     */
    public static class SearchPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Integer ticketPrice;

        @com.aliyun.core.annotation.NameInMap("sell_price")
        private Integer sellPrice;

        @com.aliyun.core.annotation.NameInMap("tax")
        private Integer tax;

        private SearchPrice(Builder builder) {
            this.ticketPrice = builder.ticketPrice;
            this.sellPrice = builder.sellPrice;
            this.tax = builder.tax;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchPrice create() {
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

            private Builder(SearchPrice model) {
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

            public SearchPrice build() {
                return new SearchPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModuleGroupItemShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleGroupItemShoppingItemMapValue</p>
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
     * {@link ModuleGroupItemShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleGroupItemShoppingItemMapValue</p>
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
     * {@link ModuleGroupItemShoppingItemMapValue} extends {@link TeaModel}
     *
     * <p>ModuleGroupItemShoppingItemMapValue</p>
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
