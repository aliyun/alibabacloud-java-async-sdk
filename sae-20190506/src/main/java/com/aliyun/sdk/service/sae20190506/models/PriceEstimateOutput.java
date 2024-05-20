// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PriceEstimateOutput} extends {@link TeaModel}
 *
 * <p>PriceEstimateOutput</p>
 */
public class PriceEstimateOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Apps")
    private java.util.List < Apps> apps;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("TotalPrice")
    private Float totalPrice;

    private PriceEstimateOutput(Builder builder) {
        this.apps = builder.apps;
        this.items = builder.items;
        this.totalPrice = builder.totalPrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PriceEstimateOutput create() {
        return builder().build();
    }

    /**
     * @return apps
     */
    public java.util.List < Apps> getApps() {
        return this.apps;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return totalPrice
     */
    public Float getTotalPrice() {
        return this.totalPrice;
    }

    public static final class Builder {
        private java.util.List < Apps> apps; 
        private java.util.List < Items> items; 
        private Float totalPrice; 

        /**
         * Apps.
         */
        public Builder apps(java.util.List < Apps> apps) {
            this.apps = apps;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * TotalPrice.
         */
        public Builder totalPrice(Float totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public PriceEstimateOutput build() {
            return new PriceEstimateOutput(this);
        } 

    } 

    public static class Usages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Float amount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private Usages(Builder builder) {
            this.amount = builder.amount;
            this.id = builder.id;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usages create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Float getAmount() {
            return this.amount;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private Float amount; 
            private String id; 
            private String unit; 

            /**
             * Amount.
             */
            public Builder amount(Float amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Usages build() {
                return new Usages(this);
            } 

        } 

    }
    public static class Apps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Feature")
        private PriceEstimateFeature feature;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Usages")
        private java.util.List < Usages> usages;

        private Apps(Builder builder) {
            this.feature = builder.feature;
            this.id = builder.id;
            this.usages = builder.usages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Apps create() {
            return builder().build();
        }

        /**
         * @return feature
         */
        public PriceEstimateFeature getFeature() {
            return this.feature;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return usages
         */
        public java.util.List < Usages> getUsages() {
            return this.usages;
        }

        public static final class Builder {
            private PriceEstimateFeature feature; 
            private Long id; 
            private java.util.List < Usages> usages; 

            /**
             * Feature.
             */
            public Builder feature(PriceEstimateFeature feature) {
                this.feature = feature;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Usages.
             */
            public Builder usages(java.util.List < Usages> usages) {
                this.usages = usages;
                return this;
            }

            public Apps build() {
                return new Apps(this);
            } 

        } 

    }
    public static class Steps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        private Long begin;

        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Float price;

        @com.aliyun.core.annotation.NameInMap("RegionIds")
        private java.util.List < String > regionIds;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private Steps(Builder builder) {
            this.begin = builder.begin;
            this.end = builder.end;
            this.price = builder.price;
            this.regionIds = builder.regionIds;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Steps create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Long getBegin() {
            return this.begin;
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return price
         */
        public Float getPrice() {
            return this.price;
        }

        /**
         * @return regionIds
         */
        public java.util.List < String > getRegionIds() {
            return this.regionIds;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private Long begin; 
            private Long end; 
            private Float price; 
            private java.util.List < String > regionIds; 
            private String unit; 

            /**
             * Begin.
             */
            public Builder begin(Long begin) {
                this.begin = begin;
                return this;
            }

            /**
             * End.
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(Float price) {
                this.price = price;
                return this;
            }

            /**
             * RegionIds.
             */
            public Builder regionIds(java.util.List < String > regionIds) {
                this.regionIds = regionIds;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Steps build() {
                return new Steps(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Float amount;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Float price;

        @com.aliyun.core.annotation.NameInMap("Steps")
        private java.util.List < Steps> steps;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private Items(Builder builder) {
            this.amount = builder.amount;
            this.count = builder.count;
            this.id = builder.id;
            this.price = builder.price;
            this.steps = builder.steps;
            this.type = builder.type;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Float getAmount() {
            return this.amount;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return price
         */
        public Float getPrice() {
            return this.price;
        }

        /**
         * @return steps
         */
        public java.util.List < Steps> getSteps() {
            return this.steps;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private Float amount; 
            private Long count; 
            private String id; 
            private Float price; 
            private java.util.List < Steps> steps; 
            private String type; 
            private String unit; 

            /**
             * Amount.
             */
            public Builder amount(Float amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(Float price) {
                this.price = price;
                return this;
            }

            /**
             * Steps.
             */
            public Builder steps(java.util.List < Steps> steps) {
                this.steps = steps;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
