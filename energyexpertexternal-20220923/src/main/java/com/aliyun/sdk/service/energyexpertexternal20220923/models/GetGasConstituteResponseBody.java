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
 * {@link GetGasConstituteResponseBody} extends {@link TeaModel}
 *
 * <p>GetGasConstituteResponseBody</p>
 */
public class GetGasConstituteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetGasConstituteResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGasConstituteResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetGasConstituteResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGasConstituteResponseBody build() {
            return new GetGasConstituteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGasConstituteResponseBody} extends {@link TeaModel}
     *
     * <p>GetGasConstituteResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("carbonEmissionData")
        private Double carbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("gasEmissionData")
        private Double gasEmissionData;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Double ratio;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        private Data(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.gasEmissionData = builder.gasEmissionData;
            this.name = builder.name;
            this.ratio = builder.ratio;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return carbonEmissionData
         */
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        /**
         * @return gasEmissionData
         */
        public Double getGasEmissionData() {
            return this.gasEmissionData;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ratio
         */
        public Double getRatio() {
            return this.ratio;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private Double gasEmissionData; 
            private String name; 
            private Double ratio; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.carbonEmissionData = model.carbonEmissionData;
                this.gasEmissionData = model.gasEmissionData;
                this.name = model.name;
                this.ratio = model.ratio;
                this.type = model.type;
            } 

            /**
             * <p>Carbon emissions</p>
             * 
             * <strong>example:</strong>
             * <p>3.14</p>
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * <p>Gas emissions</p>
             * 
             * <strong>example:</strong>
             * <p>3.14</p>
             */
            public Builder gasEmissionData(Double gasEmissionData) {
                this.gasEmissionData = gasEmissionData;
                return this;
            }

            /**
             * <p>Name of gas</p>
             * 
             * <strong>example:</strong>
             * <p>CO₂</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Proportion of carbon emissions. Example value: 0.5 (50%)</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>Gas Type</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
