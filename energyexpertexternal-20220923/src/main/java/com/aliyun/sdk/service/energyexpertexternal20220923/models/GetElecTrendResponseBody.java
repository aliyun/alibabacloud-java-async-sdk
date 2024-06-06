// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetElecTrendResponseBody} extends {@link TeaModel}
 *
 * <p>GetElecTrendResponseBody</p>
 */
public class GetElecTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetElecTrendResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetElecTrendResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
        private String code; 
        private Data data; 
        private String requestId; 

        /**
         * The code returned for the request. A value of Success indicates that the request was successful. Other values indicate that the request failed. You can troubleshoot the error by viewing the error message returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetElecTrendResponseBody build() {
            return new GetElecTrendResponseBody(this);
        } 

    } 

    public static class Light extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("carbonEmissionData")
        private Double carbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("dataUnit")
        private String dataUnit;

        @com.aliyun.core.annotation.NameInMap("month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameKey")
        private String nameKey;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Double ratio;

        @com.aliyun.core.annotation.NameInMap("rawData")
        private Double rawData;

        @com.aliyun.core.annotation.NameInMap("year")
        private String year;

        private Light(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.dataUnit = builder.dataUnit;
            this.month = builder.month;
            this.name = builder.name;
            this.nameKey = builder.nameKey;
            this.ratio = builder.ratio;
            this.rawData = builder.rawData;
            this.year = builder.year;
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
         * @return month
         */
        public Integer getMonth() {
            return this.month;
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

        /**
         * @return year
         */
        public String getYear() {
            return this.year;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private String dataUnit; 
            private Integer month; 
            private String name; 
            private String nameKey; 
            private Double ratio; 
            private Double rawData; 
            private String year; 

            /**
             * Carbon emissions
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
             * Month
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * Power type name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Power Type Code
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e. 50%).
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

            /**
             * Year
             */
            public Builder year(String year) {
                this.year = year;
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

        @com.aliyun.core.annotation.NameInMap("month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameKey")
        private String nameKey;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Double ratio;

        @com.aliyun.core.annotation.NameInMap("rawData")
        private Double rawData;

        @com.aliyun.core.annotation.NameInMap("year")
        private String year;

        private Nuclear(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.dataUnit = builder.dataUnit;
            this.month = builder.month;
            this.name = builder.name;
            this.nameKey = builder.nameKey;
            this.ratio = builder.ratio;
            this.rawData = builder.rawData;
            this.year = builder.year;
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
         * @return month
         */
        public Integer getMonth() {
            return this.month;
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

        /**
         * @return year
         */
        public String getYear() {
            return this.year;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private String dataUnit; 
            private Integer month; 
            private String name; 
            private String nameKey; 
            private Double ratio; 
            private Double rawData; 
            private String year; 

            /**
             * Carbon emissions
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * The price unit.
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * Month
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * Power Type Name
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Power Type Code
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

            /**
             * Year
             */
            public Builder year(String year) {
                this.year = year;
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

        @com.aliyun.core.annotation.NameInMap("month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameKey")
        private String nameKey;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Double ratio;

        @com.aliyun.core.annotation.NameInMap("rawData")
        private Double rawData;

        @com.aliyun.core.annotation.NameInMap("year")
        private String year;

        private Renewing(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.dataUnit = builder.dataUnit;
            this.month = builder.month;
            this.name = builder.name;
            this.nameKey = builder.nameKey;
            this.ratio = builder.ratio;
            this.rawData = builder.rawData;
            this.year = builder.year;
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
         * @return month
         */
        public Integer getMonth() {
            return this.month;
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

        /**
         * @return year
         */
        public String getYear() {
            return this.year;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private String dataUnit; 
            private Integer month; 
            private String name; 
            private String nameKey; 
            private Double ratio; 
            private Double rawData; 
            private String year; 

            /**
             * Carbon emissions
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * The price unit.
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * Month
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * Power Type Name
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Power Type Code
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

            /**
             * Year
             */
            public Builder year(String year) {
                this.year = year;
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

        @com.aliyun.core.annotation.NameInMap("month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameKey")
        private String nameKey;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Double ratio;

        @com.aliyun.core.annotation.NameInMap("rawData")
        private Double rawData;

        @com.aliyun.core.annotation.NameInMap("year")
        private String year;

        private Urban(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.dataUnit = builder.dataUnit;
            this.month = builder.month;
            this.name = builder.name;
            this.nameKey = builder.nameKey;
            this.ratio = builder.ratio;
            this.rawData = builder.rawData;
            this.year = builder.year;
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
         * @return month
         */
        public Integer getMonth() {
            return this.month;
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

        /**
         * @return year
         */
        public String getYear() {
            return this.year;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private String dataUnit; 
            private Integer month; 
            private String name; 
            private String nameKey; 
            private Double ratio; 
            private Double rawData; 
            private String year; 

            /**
             * Carbon emissions
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * The price unit.
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * Month
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * Power Type Name
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Power Type Code
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e. 50%).
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

            /**
             * Year
             */
            public Builder year(String year) {
                this.year = year;
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

        @com.aliyun.core.annotation.NameInMap("month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameKey")
        private String nameKey;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Double ratio;

        @com.aliyun.core.annotation.NameInMap("rawData")
        private Double rawData;

        @com.aliyun.core.annotation.NameInMap("year")
        private String year;

        private Water(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.dataUnit = builder.dataUnit;
            this.month = builder.month;
            this.name = builder.name;
            this.nameKey = builder.nameKey;
            this.ratio = builder.ratio;
            this.rawData = builder.rawData;
            this.year = builder.year;
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
         * @return month
         */
        public Integer getMonth() {
            return this.month;
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

        /**
         * @return year
         */
        public String getYear() {
            return this.year;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private String dataUnit; 
            private Integer month; 
            private String name; 
            private String nameKey; 
            private Double ratio; 
            private Double rawData; 
            private String year; 

            /**
             * Carbon emissions
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
             * Month
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * Power Type Name
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Power Type Code
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e. 50%).
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

            /**
             * Year
             */
            public Builder year(String year) {
                this.year = year;
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

        @com.aliyun.core.annotation.NameInMap("month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameKey")
        private String nameKey;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Double ratio;

        @com.aliyun.core.annotation.NameInMap("rawData")
        private Double rawData;

        @com.aliyun.core.annotation.NameInMap("year")
        private String year;

        private Wind(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.dataUnit = builder.dataUnit;
            this.month = builder.month;
            this.name = builder.name;
            this.nameKey = builder.nameKey;
            this.ratio = builder.ratio;
            this.rawData = builder.rawData;
            this.year = builder.year;
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
         * @return month
         */
        public Integer getMonth() {
            return this.month;
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

        /**
         * @return year
         */
        public String getYear() {
            return this.year;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private String dataUnit; 
            private Integer month; 
            private String name; 
            private String nameKey; 
            private Double ratio; 
            private Double rawData; 
            private String year; 

            /**
             * Carbon emissions
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * The price unit.
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * Month
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * Power Type Name
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Power Type Code
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

            /**
             * Year
             */
            public Builder year(String year) {
                this.year = year;
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

        @com.aliyun.core.annotation.NameInMap("month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameKey")
        private String nameKey;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Double ratio;

        @com.aliyun.core.annotation.NameInMap("rawData")
        private Double rawData;

        @com.aliyun.core.annotation.NameInMap("year")
        private String year;

        private Zero(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.dataUnit = builder.dataUnit;
            this.month = builder.month;
            this.name = builder.name;
            this.nameKey = builder.nameKey;
            this.ratio = builder.ratio;
            this.rawData = builder.rawData;
            this.year = builder.year;
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
         * @return month
         */
        public Integer getMonth() {
            return this.month;
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

        /**
         * @return year
         */
        public String getYear() {
            return this.year;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private String dataUnit; 
            private Integer month; 
            private String name; 
            private String nameKey; 
            private Double ratio; 
            private Double rawData; 
            private String year; 

            /**
             * Carbon emissions
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * The price unit.
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * Month
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * Power Type Name
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Power Type Code
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

            /**
             * Year
             */
            public Builder year(String year) {
                this.year = year;
                return this;
            }

            public Zero build() {
                return new Zero(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("light")
        private java.util.List < Light> light;

        @com.aliyun.core.annotation.NameInMap("nuclear")
        private java.util.List < Nuclear> nuclear;

        @com.aliyun.core.annotation.NameInMap("renewing")
        private java.util.List < Renewing> renewing;

        @com.aliyun.core.annotation.NameInMap("urban")
        private java.util.List < Urban> urban;

        @com.aliyun.core.annotation.NameInMap("water")
        private java.util.List < Water> water;

        @com.aliyun.core.annotation.NameInMap("wind")
        private java.util.List < Wind> wind;

        @com.aliyun.core.annotation.NameInMap("zero")
        private java.util.List < Zero> zero;

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
        public java.util.List < Light> getLight() {
            return this.light;
        }

        /**
         * @return nuclear
         */
        public java.util.List < Nuclear> getNuclear() {
            return this.nuclear;
        }

        /**
         * @return renewing
         */
        public java.util.List < Renewing> getRenewing() {
            return this.renewing;
        }

        /**
         * @return urban
         */
        public java.util.List < Urban> getUrban() {
            return this.urban;
        }

        /**
         * @return water
         */
        public java.util.List < Water> getWater() {
            return this.water;
        }

        /**
         * @return wind
         */
        public java.util.List < Wind> getWind() {
            return this.wind;
        }

        /**
         * @return zero
         */
        public java.util.List < Zero> getZero() {
            return this.zero;
        }

        public static final class Builder {
            private java.util.List < Light> light; 
            private java.util.List < Nuclear> nuclear; 
            private java.util.List < Renewing> renewing; 
            private java.util.List < Urban> urban; 
            private java.util.List < Water> water; 
            private java.util.List < Wind> wind; 
            private java.util.List < Zero> zero; 

            /**
             * Photoelectricity monthly electricity consumption and carbon emissions and other data.
             */
            public Builder light(java.util.List < Light> light) {
                this.light = light;
                return this;
            }

            /**
             * Monthly electricity consumption and carbon emissions data for nuclear power
             */
            public Builder nuclear(java.util.List < Nuclear> nuclear) {
                this.nuclear = nuclear;
                return this;
            }

            /**
             * Monthly data on renewable electricity consumption and carbon emissions
             */
            public Builder renewing(java.util.List < Renewing> renewing) {
                this.renewing = renewing;
                return this;
            }

            /**
             * Data such as monthly electricity consumption and carbon emissions from the mains.
             */
            public Builder urban(java.util.List < Urban> urban) {
                this.urban = urban;
                return this;
            }

            /**
             * Monthly data on electricity consumption and carbon emissions for hydropower.
             */
            public Builder water(java.util.List < Water> water) {
                this.water = water;
                return this;
            }

            /**
             * Monthly wind power consumption and carbon emission data
             */
            public Builder wind(java.util.List < Wind> wind) {
                this.wind = wind;
                return this;
            }

            /**
             * Zero electricity monthly electricity consumption and carbon emissions and other data.
             */
            public Builder zero(java.util.List < Zero> zero) {
                this.zero = zero;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
