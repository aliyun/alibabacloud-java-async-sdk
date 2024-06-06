// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetElecConstituteResponseBody build() {
            return new GetElecConstituteResponseBody(this);
        } 

    } 

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
             * Carbon emission.
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * The unit.
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * The name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unique identifier of name.
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * Electricity consumption
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
             * Carbon emission.
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * The unit.
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * The name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unique identifier of name.
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * Electricity consumption
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
             * Carbon emission.
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * The unit.
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * The name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unique identifier of name.
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * Electricity consumption
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
             * Carbon emission.
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * The unit.
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * The name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unique identifier of name.
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * Electricity consumption
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
             * Carbon emission.
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * The unit.
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * The name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unique identifier of name.
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * Electricity consumption
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
             * Carbon emission.
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * The unit.
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * The name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unique identifier of name.
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * Electricity consumption
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
             * Carbon emission.
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * The unit.
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * The name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unique identifier of name.
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e., 50%)
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * Electricity consumption
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
             * Photoelectric power consumption and carbon emission data of each enterprise.
             */
            public Builder light(Light light) {
                this.light = light;
                return this;
            }

            /**
             * Data on nuclear power consumption and carbon emissions at each enterprise.
             */
            public Builder nuclear(Nuclear nuclear) {
                this.nuclear = nuclear;
                return this;
            }

            /**
             * Data on renewable electricity consumption and carbon emissions at each enterprise.
             */
            public Builder renewing(Renewing renewing) {
                this.renewing = renewing;
                return this;
            }

            /**
             * Data on mains power electricity consumption and carbon emission of each enterprise.
             */
            public Builder urban(Urban urban) {
                this.urban = urban;
                return this;
            }

            /**
             * Hydropower consumption and carbon emission data of each enterprise.
             */
            public Builder water(Water water) {
                this.water = water;
                return this;
            }

            /**
             * Wind power consumption and carbon emission data of each enterprise.
             */
            public Builder wind(Wind wind) {
                this.wind = wind;
                return this;
            }

            /**
             * Data of zero electricity consumption and carbon emission of each enterprise.
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
