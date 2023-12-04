// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModuleGroupItemSubItemsShoppingItemMapValue} extends {@link TeaModel}
 *
 * <p>ModuleGroupItemSubItemsShoppingItemMapValue</p>
 */
public class ModuleGroupItemSubItemsShoppingItemMapValue extends TeaModel {
    @NameInMap("search_price")
    private SearchPrice searchPrice;

    private ModuleGroupItemSubItemsShoppingItemMapValue(Builder builder) {
        this.searchPrice = builder.searchPrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleGroupItemSubItemsShoppingItemMapValue create() {
        return builder().build();
    }

    /**
     * @return searchPrice
     */
    public SearchPrice getSearchPrice() {
        return this.searchPrice;
    }

    public static final class Builder {
        private SearchPrice searchPrice; 

        /**
         * search_price.
         */
        public Builder searchPrice(SearchPrice searchPrice) {
            this.searchPrice = searchPrice;
            return this;
        }

        public ModuleGroupItemSubItemsShoppingItemMapValue build() {
            return new ModuleGroupItemSubItemsShoppingItemMapValue(this);
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
