// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetInventoryListResponseBody} extends {@link TeaModel}
 *
 * <p>GetInventoryListResponseBody</p>
 */
public class GetInventoryListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetInventoryListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInventoryListResponseBody create() {
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

        public GetInventoryListResponseBody build() {
            return new GetInventoryListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInventoryListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInventoryListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("carbonEmission")
        private Double carbonEmission;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("processName")
        private String processName;

        private Items(Builder builder) {
            this.carbonEmission = builder.carbonEmission;
            this.name = builder.name;
            this.percent = builder.percent;
            this.processName = builder.processName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return carbonEmission
         */
        public Double getCarbonEmission() {
            return this.carbonEmission;
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
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        public static final class Builder {
            private Double carbonEmission; 
            private String name; 
            private String percent; 
            private String processName; 

            /**
             * <p>Emission quantity: may be positive, negative, or 0. To ensure the calculation accuracy, 24 decimal places are reserved for the calculation process. We recommend that you intercept data based on your business requirements.</p>
             * 
             * <strong>example:</strong>
             * <p>1000.000000000000000000000000000000</p>
             */
            public Builder carbonEmission(Double carbonEmission) {
                this.carbonEmission = carbonEmission;
                return this;
            }

            /**
             * <p>Name </p>
             * <blockquote>
             * <p>The name is related to the request parameters group. Request parameters: resource, return name parameter meaning: list name; request parameters: process, return name parameter meaning: process name; request parameters: resourceType, return name parameter meaning: inventory resource type name; request parameters: processType, return name parameter meaning: flow name.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Energy</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Percentage</p>
             * 
             * <strong>example:</strong>
             * <p>99.01</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>Process Name: It is only meaningful when the request parameters group is resource.</p>
             * 
             * <strong>example:</strong>
             * <p>Process-1</p>
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInventoryListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInventoryListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List < Items> items;

        @com.aliyun.core.annotation.NameInMap("productUnit")
        private String productUnit;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        private Data(Builder builder) {
            this.items = builder.items;
            this.productUnit = builder.productUnit;
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
         * @return productUnit
         */
        public String getProductUnit() {
            return this.productUnit;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private String productUnit; 
            private String unit; 

            /**
             * <p>Inventory detail.</p>
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>Unit of product.</p>
             * 
             * <strong>example:</strong>
             * <p>kg</p>
             */
            public Builder productUnit(String productUnit) {
                this.productUnit = productUnit;
                return this;
            }

            /**
             * <p>Emission Unit: The default value is kgCO₂ /productUnit. productUnit is the unit selected for the product. The unit value is changed to tCO₂ e/productUnit or gCO₂ e/productUnit based on the emission quantity. For more information, see the quantity column.</p>
             * 
             * <strong>example:</strong>
             * <p>kgCO₂e/kg</p>
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
