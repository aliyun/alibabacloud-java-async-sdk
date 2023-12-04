// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModuleItemListShoppingItemMapValueValue} extends {@link TeaModel}
 *
 * <p>ModuleItemListShoppingItemMapValueValue</p>
 */
public class ModuleItemListShoppingItemMapValueValue extends TeaModel {
    @NameInMap("segment_position")
    private SegmentPosition segmentPosition;

    @NameInMap("search_price")
    private SearchPrice searchPrice;

    private ModuleItemListShoppingItemMapValueValue(Builder builder) {
        this.segmentPosition = builder.segmentPosition;
        this.searchPrice = builder.searchPrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleItemListShoppingItemMapValueValue create() {
        return builder().build();
    }

    /**
     * @return segmentPosition
     */
    public SegmentPosition getSegmentPosition() {
        return this.segmentPosition;
    }

    /**
     * @return searchPrice
     */
    public SearchPrice getSearchPrice() {
        return this.searchPrice;
    }

    public static final class Builder {
        private SegmentPosition segmentPosition; 
        private SearchPrice searchPrice; 

        /**
         * segment_position.
         */
        public Builder segmentPosition(SegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }

        /**
         * search_price.
         */
        public Builder searchPrice(SearchPrice searchPrice) {
            this.searchPrice = searchPrice;
            return this;
        }

        public ModuleItemListShoppingItemMapValueValue build() {
            return new ModuleItemListShoppingItemMapValueValue(this);
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
    public static class SearchPrice extends TeaModel {
        @NameInMap("ticket_price")
        private Integer ticketPrice;

        @NameInMap("sell_price")
        private Integer sellPrice;

        @NameInMap("tax")
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
}
