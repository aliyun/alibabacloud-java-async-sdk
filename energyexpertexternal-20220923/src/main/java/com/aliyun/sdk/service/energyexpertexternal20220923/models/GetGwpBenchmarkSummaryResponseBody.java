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
 * {@link GetGwpBenchmarkSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetGwpBenchmarkSummaryResponseBody</p>
 */
public class GetGwpBenchmarkSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetGwpBenchmarkSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGwpBenchmarkSummaryResponseBody create() {
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
         * <p>The response parameters.</p>
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

        public GetGwpBenchmarkSummaryResponseBody build() {
            return new GetGwpBenchmarkSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGwpBenchmarkSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetGwpBenchmarkSummaryResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("quantity")
        private Long quantity;

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
        public Long getQuantity() {
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
            private Long quantity; 
            private String unit; 

            /**
             * <p>Name of carbon reduction details.</p>
             * 
             * <strong>example:</strong>
             * <p>Energy-Replacement</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Percentage of emissions. The value is of the string type. Two decimal places are reserved for numbers. For example, &quot;99.01&quot; indicates the 99.01% of this type of emissions to the total emissions. Note that the returned string itself does not contain a percent sign.</p>
             * 
             * <strong>example:</strong>
             * <p>99.01</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>Emission amount is presented with four decimal places. Normally, modeling doesn&quot;t result in negative values, but users can represent carbon reductions as negatives. The amount, paired with the unit, defines the emissions. Both are dynamically adjusted. If emissions exceed <code>1000 kgCO₂e/productUnit</code>, they convert to <code>tCO₂e/productUnit</code>. If they fall below <code>1 kgCO₂e/productUnit</code>, they convert to <code>gCO₂e/productUnit</code>. Otherwise, they stay in <code>kgCO₂e/productUnit</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>9.9763</p>
             */
            public Builder quantity(Long quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * <p>Unit of emissions. The default value is <code>kgCO₂e/productUnit.</code> <code>productUnit</code> is the unit selected for the product. The unit value is changed to <code>tCO₂e/productUnit</code> or <code>gCO₂e/productUnit</code>. For more information, see the remarks in the quantity column.</p>
             * 
             * <strong>example:</strong>
             * <p>kgCO₂e/kg</p>
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
     * {@link GetGwpBenchmarkSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetGwpBenchmarkSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("quantity")
        private Long quantity;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        private Data(Builder builder) {
            this.items = builder.items;
            this.quantity = builder.quantity;
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
        public Long getQuantity() {
            return this.quantity;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Long quantity; 
            private String unit; 

            /**
             * <p>Carbon Reduction Contribution Top4 Details.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>Emission amount is presented with four decimal places. Normally, modeling doesn&quot;t result in negative values, but users can represent carbon reductions as negatives. The amount, paired with the unit, defines the emissions. Both are dynamically adjusted. If emissions exceed <code>1000 kgCO₂e/productUnit</code>, they convert to <code>tCO₂e/productUnit</code>. If they fall below <code>1 kgCO₂e/productUnit</code>, they convert to <code>gCO₂e/productUnit</code>. Otherwise, they stay in <code>kgCO₂e/productUnit</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1000.0000</p>
             */
            public Builder quantity(Long quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * <p>Unit of emissions. The default value is <code>kgCO₂e/productUnit.</code> <code>productUnit</code> is the unit selected for the product. The unit value is changed to <code>tCO₂e/productUnit</code> or <code>gCO₂e/productUnit</code>. For more information, see the remarks in the quantity column.</p>
             * 
             * <strong>example:</strong>
             * <p>kgCO₂e/t</p>
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
