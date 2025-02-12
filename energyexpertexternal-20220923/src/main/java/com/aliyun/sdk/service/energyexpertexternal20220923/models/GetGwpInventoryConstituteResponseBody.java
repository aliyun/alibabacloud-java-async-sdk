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
 * {@link GetGwpInventoryConstituteResponseBody} extends {@link TeaModel}
 *
 * <p>GetGwpInventoryConstituteResponseBody</p>
 */
public class GetGwpInventoryConstituteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetGwpInventoryConstituteResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGwpInventoryConstituteResponseBody create() {
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
         * <p>06DA2909-7736-5738-AA31-ACD617D828F1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGwpInventoryConstituteResponseBody build() {
            return new GetGwpInventoryConstituteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGwpInventoryConstituteResponseBody} extends {@link TeaModel}
     *
     * <p>GetGwpInventoryConstituteResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("byResourceType")
        private java.util.List<GwpInventoryConstitute> byResourceType;

        @com.aliyun.core.annotation.NameInMap("carbonEmission")
        private Double carbonEmission;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<GwpInventoryConstitute> items;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        private Data(Builder builder) {
            this.byResourceType = builder.byResourceType;
            this.carbonEmission = builder.carbonEmission;
            this.items = builder.items;
            this.name = builder.name;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return byResourceType
         */
        public java.util.List<GwpInventoryConstitute> getByResourceType() {
            return this.byResourceType;
        }

        /**
         * @return carbonEmission
         */
        public Double getCarbonEmission() {
            return this.carbonEmission;
        }

        /**
         * @return items
         */
        public java.util.List<GwpInventoryConstitute> getItems() {
            return this.items;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private java.util.List<GwpInventoryConstitute> byResourceType; 
            private Double carbonEmission; 
            private java.util.List<GwpInventoryConstitute> items; 
            private String name; 
            private String unit; 

            /**
             * <p>Aggregated by resource type of an inventory.</p>
             */
            public Builder byResourceType(java.util.List<GwpInventoryConstitute> byResourceType) {
                this.byResourceType = byResourceType;
                return this;
            }

            /**
             * <p>Emission quantity: may be positive, negative, or 0. To ensure the calculation accuracy, 24 decimal places are reserved for the calculation process. We recommend that you intercept data based on your business requirements.</p>
             * 
             * <strong>example:</strong>
             * <p>1009.976265540000000000000000000000</p>
             */
            public Builder carbonEmission(Double carbonEmission) {
                this.carbonEmission = carbonEmission;
                return this;
            }

            /**
             * <p>Organized by hierarchy from high to low, according to the flow-&gt; process-&gt; inventory hierarchy.</p>
             */
            public Builder items(java.util.List<GwpInventoryConstitute> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>This is not used for displaying</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Emission Unit.</p>
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
