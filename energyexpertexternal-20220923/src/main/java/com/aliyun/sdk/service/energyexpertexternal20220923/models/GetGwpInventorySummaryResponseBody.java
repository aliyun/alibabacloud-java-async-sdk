// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetGwpInventorySummaryResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned results.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGwpInventorySummaryResponseBody build() {
            return new GetGwpInventorySummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGwpInventorySummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetGwpInventorySummaryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.name = model.name;
                this.percent = model.percent;
                this.quantity = model.quantity;
                this.unit = model.unit;
            } 

            /**
             * <p>Inventory resource type name.</p>
             * 
             * <strong>example:</strong>
             * <p>Energy</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>99.01</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>Quantity.</p>
             * 
             * <strong>example:</strong>
             * <p>9.9763</p>
             */
            public Builder quantity(Double quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * <p>The unit.</p>
             * 
             * <strong>example:</strong>
             * <p>kgCO₂e/Piece(s)</p>
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
    /**
     * 
     * {@link GetGwpInventorySummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetGwpInventorySummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

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
        public java.util.List<Items> getItems() {
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
            private java.util.List<Items> items; 
            private Double quantity; 
            private Long resultGenerateTime; 
            private String unit; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.quantity = model.quantity;
                this.resultGenerateTime = model.resultGenerateTime;
                this.unit = model.unit;
            } 

            /**
             * <p>Top 4 types of carbon footprint contribution.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The emission quantity.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0100</p>
             */
            public Builder quantity(Double quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * <p>The time when the result was generated, in the millisecond timestamp format.</p>
             * 
             * <strong>example:</strong>
             * <p>1709108026000</p>
             */
            public Builder resultGenerateTime(Long resultGenerateTime) {
                this.resultGenerateTime = resultGenerateTime;
                return this;
            }

            /**
             * <p>Emission Unit.</p>
             * 
             * <strong>example:</strong>
             * <p>tCO₂e/Piece(s)</p>
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
