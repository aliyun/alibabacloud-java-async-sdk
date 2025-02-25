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
 * {@link GetElecConstituteResponseBody} extends {@link TeaModel}
 *
 * <p>GetElecConstituteResponseBody</p>
 */
public class GetElecConstituteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetElecConstituteResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetElecConstituteResponseBody create() {
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetElecConstituteResponseBody build() {
            return new GetElecConstituteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetElecConstituteResponseBody} extends {@link TeaModel}
     *
     * <p>GetElecConstituteResponseBody</p>
     */
    public static class Light extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("carbonEmissionData")
        private Double carbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("dataUnit")
        private String dataUnit;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameKey")
        private String nameKey;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Double ratio;

        @com.aliyun.core.annotation.NameInMap("rawData")
        private Double rawData;

        private Light(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.dataUnit = builder.dataUnit;
            this.name = builder.name;
            this.nameKey = builder.nameKey;
            this.ratio = builder.ratio;
            this.rawData = builder.rawData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Light create() {
            return builder().build();
        }

        /**
         * @return carbonEmissionData
         */
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        /**
         * @return dataUnit
         */
        public String getDataUnit() {
            return this.dataUnit;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameKey
         */
        public String getNameKey() {
            return this.nameKey;
        }

        /**
         * @return ratio
         */
        public Double getRatio() {
            return this.ratio;
        }

        /**
         * @return rawData
         */
        public Double getRawData() {
            return this.rawData;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private String dataUnit; 
            private String name; 
            private String nameKey; 
            private Double ratio; 
            private Double rawData; 

            /**
             * <p>Carbon emission.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2</p>
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * <p>The unit.</p>
             * 
             * <strong>example:</strong>
             * <p>kWh</p>
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>light</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unique identifier of name.</p>
             * 
             * <strong>example:</strong>
             * <p>carbonInventory.check.light_electricity</p>
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>Electricity consumption</p>
             * 
             * <strong>example:</strong>
             * <p>1.2</p>
             */
            public Builder rawData(Double rawData) {
                this.rawData = rawData;
                return this;
            }

            public Light build() {
                return new Light(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetElecConstituteResponseBody} extends {@link TeaModel}
     *
     * <p>GetElecConstituteResponseBody</p>
     */
    public static class Nuclear extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("carbonEmissionData")
        private Double carbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("dataUnit")
        private String dataUnit;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameKey")
        private String nameKey;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Double ratio;

        @com.aliyun.core.annotation.NameInMap("rawData")
        private Double rawData;

        private Nuclear(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.dataUnit = builder.dataUnit;
            this.name = builder.name;
            this.nameKey = builder.nameKey;
            this.ratio = builder.ratio;
            this.rawData = builder.rawData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nuclear create() {
            return builder().build();
        }

        /**
         * @return carbonEmissionData
         */
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        /**
         * @return dataUnit
         */
        public String getDataUnit() {
            return this.dataUnit;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameKey
         */
        public String getNameKey() {
            return this.nameKey;
        }

        /**
         * @return ratio
         */
        public Double getRatio() {
            return this.ratio;
        }

        /**
         * @return rawData
         */
        public Double getRawData() {
            return this.rawData;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private String dataUnit; 
            private String name; 
            private String nameKey; 
            private Double ratio; 
            private Double rawData; 

            /**
             * <p>Carbon emission.</p>
             * 
             * <strong>example:</strong>
             * <p>2.3</p>
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * <p>The unit.</p>
             * 
             * <strong>example:</strong>
             * <p>kWh</p>
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>nuclear</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unique identifier of name.</p>
             * 
             * <strong>example:</strong>
             * <p>carbonInventory.check.nuclear_electricity</p>
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>Electricity consumption</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder rawData(Double rawData) {
                this.rawData = rawData;
                return this;
            }

            public Nuclear build() {
                return new Nuclear(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetElecConstituteResponseBody} extends {@link TeaModel}
     *
     * <p>GetElecConstituteResponseBody</p>
     */
    public static class Renewing extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("carbonEmissionData")
        private Double carbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("dataUnit")
        private String dataUnit;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameKey")
        private String nameKey;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Double ratio;

        @com.aliyun.core.annotation.NameInMap("rawData")
        private Double rawData;

        private Renewing(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.dataUnit = builder.dataUnit;
            this.name = builder.name;
            this.nameKey = builder.nameKey;
            this.ratio = builder.ratio;
            this.rawData = builder.rawData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Renewing create() {
            return builder().build();
        }

        /**
         * @return carbonEmissionData
         */
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        /**
         * @return dataUnit
         */
        public String getDataUnit() {
            return this.dataUnit;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameKey
         */
        public String getNameKey() {
            return this.nameKey;
        }

        /**
         * @return ratio
         */
        public Double getRatio() {
            return this.ratio;
        }

        /**
         * @return rawData
         */
        public Double getRawData() {
            return this.rawData;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private String dataUnit; 
            private String name; 
            private String nameKey; 
            private Double ratio; 
            private Double rawData; 

            /**
             * <p>Carbon emission.</p>
             * 
             * <strong>example:</strong>
             * <p>2.3</p>
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * <p>The unit.</p>
             * 
             * <strong>example:</strong>
             * <p>kWh</p>
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>renewing</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unique identifier of name.</p>
             * 
             * <strong>example:</strong>
             * <p>carbonInventory.carbonEmissionAnalysis.components.CarbonDetail.keZaiShengZiYuan</p>
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)</p>
             * 
             * <strong>example:</strong>
             * <p>0.44</p>
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>Electricity consumption</p>
             * 
             * <strong>example:</strong>
             * <p>4.3</p>
             */
            public Builder rawData(Double rawData) {
                this.rawData = rawData;
                return this;
            }

            public Renewing build() {
                return new Renewing(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetElecConstituteResponseBody} extends {@link TeaModel}
     *
     * <p>GetElecConstituteResponseBody</p>
     */
    public static class Urban extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("carbonEmissionData")
        private Double carbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("dataUnit")
        private String dataUnit;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameKey")
        private String nameKey;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Double ratio;

        @com.aliyun.core.annotation.NameInMap("rawData")
        private Double rawData;

        private Urban(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.dataUnit = builder.dataUnit;
            this.name = builder.name;
            this.nameKey = builder.nameKey;
            this.ratio = builder.ratio;
            this.rawData = builder.rawData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Urban create() {
            return builder().build();
        }

        /**
         * @return carbonEmissionData
         */
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        /**
         * @return dataUnit
         */
        public String getDataUnit() {
            return this.dataUnit;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameKey
         */
        public String getNameKey() {
            return this.nameKey;
        }

        /**
         * @return ratio
         */
        public Double getRatio() {
            return this.ratio;
        }

        /**
         * @return rawData
         */
        public Double getRawData() {
            return this.rawData;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private String dataUnit; 
            private String name; 
            private String nameKey; 
            private Double ratio; 
            private Double rawData; 

            /**
             * <p>Carbon emission.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2</p>
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * <p>The unit.</p>
             * 
             * <strong>example:</strong>
             * <p>kWh</p>
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>urban</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unique identifier of name.</p>
             * 
             * <strong>example:</strong>
             * <p>carbonInventory.check.urban_electricity</p>
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)</p>
             * 
             * <strong>example:</strong>
             * <p>0.4</p>
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>Electricity consumption</p>
             * 
             * <strong>example:</strong>
             * <p>1.2</p>
             */
            public Builder rawData(Double rawData) {
                this.rawData = rawData;
                return this;
            }

            public Urban build() {
                return new Urban(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetElecConstituteResponseBody} extends {@link TeaModel}
     *
     * <p>GetElecConstituteResponseBody</p>
     */
    public static class Water extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("carbonEmissionData")
        private Double carbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("dataUnit")
        private String dataUnit;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameKey")
        private String nameKey;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Double ratio;

        @com.aliyun.core.annotation.NameInMap("rawData")
        private Double rawData;

        private Water(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.dataUnit = builder.dataUnit;
            this.name = builder.name;
            this.nameKey = builder.nameKey;
            this.ratio = builder.ratio;
            this.rawData = builder.rawData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Water create() {
            return builder().build();
        }

        /**
         * @return carbonEmissionData
         */
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        /**
         * @return dataUnit
         */
        public String getDataUnit() {
            return this.dataUnit;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameKey
         */
        public String getNameKey() {
            return this.nameKey;
        }

        /**
         * @return ratio
         */
        public Double getRatio() {
            return this.ratio;
        }

        /**
         * @return rawData
         */
        public Double getRawData() {
            return this.rawData;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private String dataUnit; 
            private String name; 
            private String nameKey; 
            private Double ratio; 
            private Double rawData; 

            /**
             * <p>Carbon emission.</p>
             * 
             * <strong>example:</strong>
             * <p>2.1</p>
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * <p>The unit.</p>
             * 
             * <strong>example:</strong>
             * <p>kWh</p>
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>water</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unique identifier of name.</p>
             * 
             * <strong>example:</strong>
             * <p>carbonInventory.check.water_electricity</p>
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)</p>
             * 
             * <strong>example:</strong>
             * <p>0.4</p>
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>Electricity consumption</p>
             * 
             * <strong>example:</strong>
             * <p>1.2</p>
             */
            public Builder rawData(Double rawData) {
                this.rawData = rawData;
                return this;
            }

            public Water build() {
                return new Water(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetElecConstituteResponseBody} extends {@link TeaModel}
     *
     * <p>GetElecConstituteResponseBody</p>
     */
    public static class Wind extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("carbonEmissionData")
        private Double carbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("dataUnit")
        private String dataUnit;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameKey")
        private String nameKey;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Double ratio;

        @com.aliyun.core.annotation.NameInMap("rawData")
        private Double rawData;

        private Wind(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.dataUnit = builder.dataUnit;
            this.name = builder.name;
            this.nameKey = builder.nameKey;
            this.ratio = builder.ratio;
            this.rawData = builder.rawData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Wind create() {
            return builder().build();
        }

        /**
         * @return carbonEmissionData
         */
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        /**
         * @return dataUnit
         */
        public String getDataUnit() {
            return this.dataUnit;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameKey
         */
        public String getNameKey() {
            return this.nameKey;
        }

        /**
         * @return ratio
         */
        public Double getRatio() {
            return this.ratio;
        }

        /**
         * @return rawData
         */
        public Double getRawData() {
            return this.rawData;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private String dataUnit; 
            private String name; 
            private String nameKey; 
            private Double ratio; 
            private Double rawData; 

            /**
             * <p>Carbon emission.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2</p>
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * <p>The unit.</p>
             * 
             * <strong>example:</strong>
             * <p>kWh</p>
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>wind</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unique identifier of name.</p>
             * 
             * <strong>example:</strong>
             * <p>carbonInventory.check.wind_electricity</p>
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)</p>
             * 
             * <strong>example:</strong>
             * <p>0.3</p>
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>Electricity consumption</p>
             * 
             * <strong>example:</strong>
             * <p>1.1</p>
             */
            public Builder rawData(Double rawData) {
                this.rawData = rawData;
                return this;
            }

            public Wind build() {
                return new Wind(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetElecConstituteResponseBody} extends {@link TeaModel}
     *
     * <p>GetElecConstituteResponseBody</p>
     */
    public static class Zero extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("carbonEmissionData")
        private Double carbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("dataUnit")
        private String dataUnit;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameKey")
        private String nameKey;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Double ratio;

        @com.aliyun.core.annotation.NameInMap("rawData")
        private Double rawData;

        private Zero(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.dataUnit = builder.dataUnit;
            this.name = builder.name;
            this.nameKey = builder.nameKey;
            this.ratio = builder.ratio;
            this.rawData = builder.rawData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zero create() {
            return builder().build();
        }

        /**
         * @return carbonEmissionData
         */
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        /**
         * @return dataUnit
         */
        public String getDataUnit() {
            return this.dataUnit;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameKey
         */
        public String getNameKey() {
            return this.nameKey;
        }

        /**
         * @return ratio
         */
        public Double getRatio() {
            return this.ratio;
        }

        /**
         * @return rawData
         */
        public Double getRawData() {
            return this.rawData;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private String dataUnit; 
            private String name; 
            private String nameKey; 
            private Double ratio; 
            private Double rawData; 

            /**
             * <p>Carbon emission.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2</p>
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * <p>The unit.</p>
             * 
             * <strong>example:</strong>
             * <p>kWh</p>
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>zero</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unique identifier of name.</p>
             * 
             * <strong>example:</strong>
             * <p>carbonInventory.carbonEmissionAnalysis.components.CarbonDetail.lingTanDianLi</p>
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)</p>
             * 
             * <strong>example:</strong>
             * <p>0.33</p>
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>Electricity consumption</p>
             * 
             * <strong>example:</strong>
             * <p>444.3</p>
             */
            public Builder rawData(Double rawData) {
                this.rawData = rawData;
                return this;
            }

            public Zero build() {
                return new Zero(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetElecConstituteResponseBody} extends {@link TeaModel}
     *
     * <p>GetElecConstituteResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("light")
        private Light light;

        @com.aliyun.core.annotation.NameInMap("nuclear")
        private Nuclear nuclear;

        @com.aliyun.core.annotation.NameInMap("renewing")
        private Renewing renewing;

        @com.aliyun.core.annotation.NameInMap("urban")
        private Urban urban;

        @com.aliyun.core.annotation.NameInMap("water")
        private Water water;

        @com.aliyun.core.annotation.NameInMap("wind")
        private Wind wind;

        @com.aliyun.core.annotation.NameInMap("zero")
        private Zero zero;

        private Data(Builder builder) {
            this.light = builder.light;
            this.nuclear = builder.nuclear;
            this.renewing = builder.renewing;
            this.urban = builder.urban;
            this.water = builder.water;
            this.wind = builder.wind;
            this.zero = builder.zero;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return light
         */
        public Light getLight() {
            return this.light;
        }

        /**
         * @return nuclear
         */
        public Nuclear getNuclear() {
            return this.nuclear;
        }

        /**
         * @return renewing
         */
        public Renewing getRenewing() {
            return this.renewing;
        }

        /**
         * @return urban
         */
        public Urban getUrban() {
            return this.urban;
        }

        /**
         * @return water
         */
        public Water getWater() {
            return this.water;
        }

        /**
         * @return wind
         */
        public Wind getWind() {
            return this.wind;
        }

        /**
         * @return zero
         */
        public Zero getZero() {
            return this.zero;
        }

        public static final class Builder {
            private Light light; 
            private Nuclear nuclear; 
            private Renewing renewing; 
            private Urban urban; 
            private Water water; 
            private Wind wind; 
            private Zero zero; 

            /**
             * <p>Photoelectric power consumption and carbon emission data of each enterprise.</p>
             */
            public Builder light(Light light) {
                this.light = light;
                return this;
            }

            /**
             * <p>Data on nuclear power consumption and carbon emissions at each enterprise.</p>
             */
            public Builder nuclear(Nuclear nuclear) {
                this.nuclear = nuclear;
                return this;
            }

            /**
             * <p>Data on renewable electricity consumption and carbon emissions at each enterprise.</p>
             */
            public Builder renewing(Renewing renewing) {
                this.renewing = renewing;
                return this;
            }

            /**
             * <p>Data on mains power electricity consumption and carbon emission of each enterprise.</p>
             */
            public Builder urban(Urban urban) {
                this.urban = urban;
                return this;
            }

            /**
             * <p>Hydropower consumption and carbon emission data of each enterprise.</p>
             */
            public Builder water(Water water) {
                this.water = water;
                return this;
            }

            /**
             * <p>Wind power consumption and carbon emission data of each enterprise.</p>
             */
            public Builder wind(Wind wind) {
                this.wind = wind;
                return this;
            }

            /**
             * <p>Data of zero electricity consumption and carbon emission of each enterprise.</p>
             */
            public Builder zero(Zero zero) {
                this.zero = zero;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
