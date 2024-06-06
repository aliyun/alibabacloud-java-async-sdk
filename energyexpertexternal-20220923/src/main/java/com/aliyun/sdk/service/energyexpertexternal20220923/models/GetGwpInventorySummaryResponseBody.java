// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGwpInventorySummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetGwpInventorySummaryResponseBody</p>
 */
public class GetGwpInventorySummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetGwpInventorySummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGwpInventorySummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The returned results.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGwpInventorySummaryResponseBody build() {
            return new GetGwpInventorySummaryResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("quantity")
        private Double quantity;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        private Items(Builder builder) {
            this.name = builder.name;
            this.percent = builder.percent;
            this.quantity = builder.quantity;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return quantity
         */
        public Double getQuantity() {
            return this.quantity;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String name; 
            private String percent; 
            private Double quantity; 
            private String unit; 

            /**
             * Inventory resource type name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Double quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * The unit.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List < Items> items;

        @com.aliyun.core.annotation.NameInMap("quantity")
        private Double quantity;

        @com.aliyun.core.annotation.NameInMap("resultGenerateTime")
        private Long resultGenerateTime;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        private Data(Builder builder) {
            this.items = builder.items;
            this.quantity = builder.quantity;
            this.resultGenerateTime = builder.resultGenerateTime;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return quantity
         */
        public Double getQuantity() {
            return this.quantity;
        }

        /**
         * @return resultGenerateTime
         */
        public Long getResultGenerateTime() {
            return this.resultGenerateTime;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private Double quantity; 
            private Long resultGenerateTime; 
            private String unit; 

            /**
             * Top 4 types of carbon footprint contribution.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * The emission quantity.
             */
            public Builder quantity(Double quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * The time when the result was generated, in the millisecond timestamp format.
             */
            public Builder resultGenerateTime(Long resultGenerateTime) {
                this.resultGenerateTime = resultGenerateTime;
                return this;
            }

            /**
             * Emission Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
