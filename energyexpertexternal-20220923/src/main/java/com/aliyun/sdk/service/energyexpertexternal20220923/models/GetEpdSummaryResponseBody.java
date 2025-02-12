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
 * {@link GetEpdSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetEpdSummaryResponseBody</p>
 */
public class GetEpdSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetEpdSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEpdSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        /**
         * <p>Response parameters</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>B91B5559-065A-55C3-8D75-DA218EBFD1DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEpdSummaryResponseBody build() {
            return new GetEpdSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEpdSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetEpdSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("carbonEmission")
        private Double carbonEmission;

        @com.aliyun.core.annotation.NameInMap("indicator")
        private String indicator;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("num")
        private Long num;

        @com.aliyun.core.annotation.NameInMap("preUnit")
        private String preUnit;

        @com.aliyun.core.annotation.NameInMap("state")
        private Long state;

        private Data(Builder builder) {
            this.carbonEmission = builder.carbonEmission;
            this.indicator = builder.indicator;
            this.key = builder.key;
            this.method = builder.method;
            this.name = builder.name;
            this.num = builder.num;
            this.preUnit = builder.preUnit;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return carbonEmission
         */
        public Double getCarbonEmission() {
            return this.carbonEmission;
        }

        /**
         * @return indicator
         */
        public String getIndicator() {
            return this.indicator;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return num
         */
        public Long getNum() {
            return this.num;
        }

        /**
         * @return preUnit
         */
        public String getPreUnit() {
            return this.preUnit;
        }

        /**
         * @return state
         */
        public Long getState() {
            return this.state;
        }

        public static final class Builder {
            private Double carbonEmission; 
            private String indicator; 
            private String key; 
            private String method; 
            private String name; 
            private Long num; 
            private String preUnit; 
            private Long state; 

            /**
             * <p>Emissions. The result is maintained up to 31 decimal places for precise intermediate calculation and subsequently truncated for display. It is advised to pair the emissions figure with the unit of the environmental impact result for a comprehensive understanding.</p>
             * 
             * <strong>example:</strong>
             * <p>1009.976265540000000000000000000000</p>
             */
            public Builder carbonEmission(Double carbonEmission) {
                this.carbonEmission = carbonEmission;
                return this;
            }

            /**
             * <p>The evaluation index adopted for the environmental impact</p>
             * 
             * <strong>example:</strong>
             * <p>GWP100a</p>
             */
            public Builder indicator(String indicator) {
                this.indicator = indicator;
                return this;
            }

            /**
             * <p>The category key. The environmental impact category. Currently, a maximum of 19 categories are supported. Enumeration refers to <a href="https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/CarbonFootprintAppendices-en.pdf">Carbon Footprint Appendices</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>gwp</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Calculation method standard</p>
             * 
             * <strong>example:</strong>
             * <p>CML v4.8 2016</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The name of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>climate change</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Category num: the unique serial number of the environmental impact category. A maximum of 19 categories are supported. Enumeration refers to <a href="https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/CarbonFootprintAppendices-en.pdf">Carbon Footprint Appendices</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder num(Long num) {
                this.num = num;
                return this;
            }

            /**
             * <p>Environmental impact result Value Unit.</p>
             * 
             * <strong>example:</strong>
             * <p>kg CO2-Eq</p>
             */
            public Builder preUnit(String preUnit) {
                this.preUnit = preUnit;
                return this;
            }

            /**
             * <p>The data status. 1 indicates that the calculation is accurate, 2 indicates that the default data is used, and 3 indicates that the missing factor uses the value of 0.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder state(Long state) {
                this.state = state;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
