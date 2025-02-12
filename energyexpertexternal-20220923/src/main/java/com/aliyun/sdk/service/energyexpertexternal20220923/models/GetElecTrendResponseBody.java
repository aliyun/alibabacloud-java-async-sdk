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
         * <p>The code returned for the request. A value of Success indicates that the request was successful. Other values indicate that the request failed. You can troubleshoot the error by viewing the error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
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

        public GetElecTrendResponseBody build() {
            return new GetElecTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetElecTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetElecTrendResponseBody</p>
     */
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
             * <p>Month</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * <p>Power type name.</p>
             * 
             * <strong>example:</strong>
             * <p>Solar Power</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Power Type Code</p>
             * 
             * <strong>example:</strong>
             * <p>carbonInventory.check.light_electricity</p>
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e. 50%).</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>Electricity consumption</p>
             * 
             * <strong>example:</strong>
             * <p>3.14</p>
             */
            public Builder rawData(Double rawData) {
                this.rawData = rawData;
                return this;
            }

            /**
             * <p>Year</p>
             * 
             * <strong>example:</strong>
             * <p>2024</p>
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
    /**
     * 
     * {@link GetElecTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetElecTrendResponseBody</p>
     */
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
             * <p>The price unit.</p>
             * 
             * <strong>example:</strong>
             * <p>kWh</p>
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * <p>Month</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * <p>Power Type Name</p>
             * 
             * <strong>example:</strong>
             * <p>Nuclear power</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Power Type Code</p>
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
             * <p>0.5</p>
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>Electricity consumption</p>
             * 
             * <strong>example:</strong>
             * <p>3.14</p>
             */
            public Builder rawData(Double rawData) {
                this.rawData = rawData;
                return this;
            }

            /**
             * <p>Year</p>
             * 
             * <strong>example:</strong>
             * <p>2024</p>
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
    /**
     * 
     * {@link GetElecTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetElecTrendResponseBody</p>
     */
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
             * <p>The price unit.</p>
             * 
             * <strong>example:</strong>
             * <p>kWh</p>
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * <p>Month</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * <p>Power Type Name</p>
             * 
             * <strong>example:</strong>
             * <p>Renewable electricity</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Power Type Code</p>
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
             * <p>0.5</p>
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>Electricity consumption</p>
             * 
             * <strong>example:</strong>
             * <p>3.14</p>
             */
            public Builder rawData(Double rawData) {
                this.rawData = rawData;
                return this;
            }

            /**
             * <p>Year</p>
             * 
             * <strong>example:</strong>
             * <p>2024</p>
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
    /**
     * 
     * {@link GetElecTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetElecTrendResponseBody</p>
     */
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
             * <p>The price unit.</p>
             * 
             * <strong>example:</strong>
             * <p>kWh</p>
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * <p>Month</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * <p>Power Type Name</p>
             * 
             * <strong>example:</strong>
             * <p>Grid power</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Power Type Code</p>
             * 
             * <strong>example:</strong>
             * <p>carbonInventory.check.urban_electricity</p>
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e. 50%).</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>Electricity consumption</p>
             * 
             * <strong>example:</strong>
             * <p>3.14</p>
             */
            public Builder rawData(Double rawData) {
                this.rawData = rawData;
                return this;
            }

            /**
             * <p>Year</p>
             * 
             * <strong>example:</strong>
             * <p>2024</p>
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
    /**
     * 
     * {@link GetElecTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetElecTrendResponseBody</p>
     */
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
             * <p>Month</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * <p>Power Type Name</p>
             * 
             * <strong>example:</strong>
             * <p>Hydro power</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Power Type Code</p>
             * 
             * <strong>example:</strong>
             * <p>carbonInventory.check.water_electricity</p>
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * <p>Proportion of electricity consumption to all electricity consumption in the month: example value: 0.5 (i. e. 50%).</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>Electricity consumption</p>
             * 
             * <strong>example:</strong>
             * <p>3.14</p>
             */
            public Builder rawData(Double rawData) {
                this.rawData = rawData;
                return this;
            }

            /**
             * <p>Year</p>
             * 
             * <strong>example:</strong>
             * <p>2024</p>
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
    /**
     * 
     * {@link GetElecTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetElecTrendResponseBody</p>
     */
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
             * <p>The price unit.</p>
             * 
             * <strong>example:</strong>
             * <p>kWh</p>
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * <p>Month</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * <p>Power Type Name</p>
             * 
             * <strong>example:</strong>
             * <p>Wind power</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Power Type Code</p>
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
             * <p>0.5</p>
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>Electricity consumption</p>
             * 
             * <strong>example:</strong>
             * <p>3.14</p>
             */
            public Builder rawData(Double rawData) {
                this.rawData = rawData;
                return this;
            }

            /**
             * <p>Year</p>
             * 
             * <strong>example:</strong>
             * <p>2024</p>
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
    /**
     * 
     * {@link GetElecTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetElecTrendResponseBody</p>
     */
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
             * <p>The price unit.</p>
             * 
             * <strong>example:</strong>
             * <p>kWh</p>
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * <p>Month</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * <p>Power Type Name</p>
             * 
             * <strong>example:</strong>
             * <p>Zero carbon electricity</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Power Type Code</p>
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
             * <p>0.5</p>
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>Electricity consumption</p>
             * 
             * <strong>example:</strong>
             * <p>3.14</p>
             */
            public Builder rawData(Double rawData) {
                this.rawData = rawData;
                return this;
            }

            /**
             * <p>Year</p>
             * 
             * <strong>example:</strong>
             * <p>2024</p>
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
    /**
     * 
     * {@link GetElecTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetElecTrendResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("light")
        private java.util.List<Light> light;

        @com.aliyun.core.annotation.NameInMap("nuclear")
        private java.util.List<Nuclear> nuclear;

        @com.aliyun.core.annotation.NameInMap("renewing")
        private java.util.List<Renewing> renewing;

        @com.aliyun.core.annotation.NameInMap("urban")
        private java.util.List<Urban> urban;

        @com.aliyun.core.annotation.NameInMap("water")
        private java.util.List<Water> water;

        @com.aliyun.core.annotation.NameInMap("wind")
        private java.util.List<Wind> wind;

        @com.aliyun.core.annotation.NameInMap("zero")
        private java.util.List<Zero> zero;

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
        public java.util.List<Light> getLight() {
            return this.light;
        }

        /**
         * @return nuclear
         */
        public java.util.List<Nuclear> getNuclear() {
            return this.nuclear;
        }

        /**
         * @return renewing
         */
        public java.util.List<Renewing> getRenewing() {
            return this.renewing;
        }

        /**
         * @return urban
         */
        public java.util.List<Urban> getUrban() {
            return this.urban;
        }

        /**
         * @return water
         */
        public java.util.List<Water> getWater() {
            return this.water;
        }

        /**
         * @return wind
         */
        public java.util.List<Wind> getWind() {
            return this.wind;
        }

        /**
         * @return zero
         */
        public java.util.List<Zero> getZero() {
            return this.zero;
        }

        public static final class Builder {
            private java.util.List<Light> light; 
            private java.util.List<Nuclear> nuclear; 
            private java.util.List<Renewing> renewing; 
            private java.util.List<Urban> urban; 
            private java.util.List<Water> water; 
            private java.util.List<Wind> wind; 
            private java.util.List<Zero> zero; 

            /**
             * <p>Photoelectricity monthly electricity consumption and carbon emissions and other data.</p>
             */
            public Builder light(java.util.List<Light> light) {
                this.light = light;
                return this;
            }

            /**
             * <p>Monthly electricity consumption and carbon emissions data for nuclear power</p>
             */
            public Builder nuclear(java.util.List<Nuclear> nuclear) {
                this.nuclear = nuclear;
                return this;
            }

            /**
             * <p>Monthly data on renewable electricity consumption and carbon emissions</p>
             */
            public Builder renewing(java.util.List<Renewing> renewing) {
                this.renewing = renewing;
                return this;
            }

            /**
             * <p>Data such as monthly electricity consumption and carbon emissions from the mains.</p>
             */
            public Builder urban(java.util.List<Urban> urban) {
                this.urban = urban;
                return this;
            }

            /**
             * <p>Monthly data on electricity consumption and carbon emissions for hydropower.</p>
             */
            public Builder water(java.util.List<Water> water) {
                this.water = water;
                return this;
            }

            /**
             * <p>Monthly wind power consumption and carbon emission data</p>
             */
            public Builder wind(java.util.List<Wind> wind) {
                this.wind = wind;
                return this;
            }

            /**
             * <p>Zero electricity monthly electricity consumption and carbon emissions and other data.</p>
             */
            public Builder zero(java.util.List<Zero> zero) {
                this.zero = zero;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
