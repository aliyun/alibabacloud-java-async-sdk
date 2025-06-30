// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
 *
 * <p>IntlFlightOtaSearchResponseBody</p>
 */
public class IntlFlightOtaSearchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private IntlFlightOtaSearchResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightOtaSearchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(IntlFlightOtaSearchResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>module。</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public IntlFlightOtaSearchResponseBody build() {
            return new IntlFlightOtaSearchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOtaSearchResponseBody</p>
     */
    public static class AirlineInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_name")
        private String airlineName;

        @com.aliyun.core.annotation.NameInMap("short_name")
        private String shortName;

        private AirlineInfo(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.shortName = builder.shortName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AirlineInfo create() {
            return builder().build();
        }

        /**
         * @return airlineCode
         */
        public String getAirlineCode() {
            return this.airlineCode;
        }

        /**
         * @return airlineName
         */
        public String getAirlineName() {
            return this.airlineName;
        }

        /**
         * @return shortName
         */
        public String getShortName() {
            return this.shortName;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private String shortName; 

            private Builder() {
            } 

            private Builder(AirlineInfo model) {
                this.airlineCode = model.airlineCode;
                this.airlineName = model.airlineName;
                this.shortName = model.shortName;
            } 

            /**
             * airline_code.
             */
            public Builder airlineCode(String airlineCode) {
                this.airlineCode = airlineCode;
                return this;
            }

            /**
             * airline_name.
             */
            public Builder airlineName(String airlineName) {
                this.airlineName = airlineName;
                return this;
            }

            /**
             * short_name.
             */
            public Builder shortName(String shortName) {
                this.shortName = shortName;
                return this;
            }

            public AirlineInfo build() {
                return new AirlineInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOtaSearchResponseBody</p>
     */
    public static class ArrAirportInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airport_code")
        private String airportCode;

        @com.aliyun.core.annotation.NameInMap("airport_name")
        private String airportName;

        @com.aliyun.core.annotation.NameInMap("airport_short_name")
        private String airportShortName;

        @com.aliyun.core.annotation.NameInMap("terminal")
        private String terminal;

        private ArrAirportInfo(Builder builder) {
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.airportShortName = builder.airportShortName;
            this.terminal = builder.terminal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArrAirportInfo create() {
            return builder().build();
        }

        /**
         * @return airportCode
         */
        public String getAirportCode() {
            return this.airportCode;
        }

        /**
         * @return airportName
         */
        public String getAirportName() {
            return this.airportName;
        }

        /**
         * @return airportShortName
         */
        public String getAirportShortName() {
            return this.airportShortName;
        }

        /**
         * @return terminal
         */
        public String getTerminal() {
            return this.terminal;
        }

        public static final class Builder {
            private String airportCode; 
            private String airportName; 
            private String airportShortName; 
            private String terminal; 

            private Builder() {
            } 

            private Builder(ArrAirportInfo model) {
                this.airportCode = model.airportCode;
                this.airportName = model.airportName;
                this.airportShortName = model.airportShortName;
                this.terminal = model.terminal;
            } 

            /**
             * airport_code.
             */
            public Builder airportCode(String airportCode) {
                this.airportCode = airportCode;
                return this;
            }

            /**
             * airport_name.
             */
            public Builder airportName(String airportName) {
                this.airportName = airportName;
                return this;
            }

            /**
             * airport_short_name.
             */
            public Builder airportShortName(String airportShortName) {
                this.airportShortName = airportShortName;
                return this;
            }

            /**
             * terminal.
             */
            public Builder terminal(String terminal) {
                this.terminal = terminal;
                return this;
            }

            public ArrAirportInfo build() {
                return new ArrAirportInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOtaSearchResponseBody</p>
     */
    public static class DepAirportInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airport_code")
        private String airportCode;

        @com.aliyun.core.annotation.NameInMap("airport_name")
        private String airportName;

        @com.aliyun.core.annotation.NameInMap("airport_short_name")
        private String airportShortName;

        @com.aliyun.core.annotation.NameInMap("terminal")
        private String terminal;

        private DepAirportInfo(Builder builder) {
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.airportShortName = builder.airportShortName;
            this.terminal = builder.terminal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DepAirportInfo create() {
            return builder().build();
        }

        /**
         * @return airportCode
         */
        public String getAirportCode() {
            return this.airportCode;
        }

        /**
         * @return airportName
         */
        public String getAirportName() {
            return this.airportName;
        }

        /**
         * @return airportShortName
         */
        public String getAirportShortName() {
            return this.airportShortName;
        }

        /**
         * @return terminal
         */
        public String getTerminal() {
            return this.terminal;
        }

        public static final class Builder {
            private String airportCode; 
            private String airportName; 
            private String airportShortName; 
            private String terminal; 

            private Builder() {
            } 

            private Builder(DepAirportInfo model) {
                this.airportCode = model.airportCode;
                this.airportName = model.airportName;
                this.airportShortName = model.airportShortName;
                this.terminal = model.terminal;
            } 

            /**
             * airport_code.
             */
            public Builder airportCode(String airportCode) {
                this.airportCode = airportCode;
                return this;
            }

            /**
             * airport_name.
             */
            public Builder airportName(String airportName) {
                this.airportName = airportName;
                return this;
            }

            /**
             * airport_short_name.
             */
            public Builder airportShortName(String airportShortName) {
                this.airportShortName = airportShortName;
                return this;
            }

            /**
             * terminal.
             */
            public Builder terminal(String terminal) {
                this.terminal = terminal;
                return this;
            }

            public DepAirportInfo build() {
                return new DepAirportInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOtaSearchResponseBody</p>
     */
    public static class OperatingAirlineInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_name")
        private String airlineName;

        @com.aliyun.core.annotation.NameInMap("short_name")
        private String shortName;

        private OperatingAirlineInfo(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.shortName = builder.shortName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperatingAirlineInfo create() {
            return builder().build();
        }

        /**
         * @return airlineCode
         */
        public String getAirlineCode() {
            return this.airlineCode;
        }

        /**
         * @return airlineName
         */
        public String getAirlineName() {
            return this.airlineName;
        }

        /**
         * @return shortName
         */
        public String getShortName() {
            return this.shortName;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private String shortName; 

            private Builder() {
            } 

            private Builder(OperatingAirlineInfo model) {
                this.airlineCode = model.airlineCode;
                this.airlineName = model.airlineName;
                this.shortName = model.shortName;
            } 

            /**
             * airline_code.
             */
            public Builder airlineCode(String airlineCode) {
                this.airlineCode = airlineCode;
                return this;
            }

            /**
             * airline_name.
             */
            public Builder airlineName(String airlineName) {
                this.airlineName = airlineName;
                return this;
            }

            /**
             * short_name.
             */
            public Builder shortName(String shortName) {
                this.shortName = shortName;
                return this;
            }

            public OperatingAirlineInfo build() {
                return new OperatingAirlineInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOtaSearchResponseBody</p>
     */
    public static class FlightShareInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("operating_airline_info")
        private OperatingAirlineInfo operatingAirlineInfo;

        @com.aliyun.core.annotation.NameInMap("operating_flight_no")
        private String operatingFlightNo;

        private FlightShareInfo(Builder builder) {
            this.operatingAirlineInfo = builder.operatingAirlineInfo;
            this.operatingFlightNo = builder.operatingFlightNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightShareInfo create() {
            return builder().build();
        }

        /**
         * @return operatingAirlineInfo
         */
        public OperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

        /**
         * @return operatingFlightNo
         */
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public static final class Builder {
            private OperatingAirlineInfo operatingAirlineInfo; 
            private String operatingFlightNo; 

            private Builder() {
            } 

            private Builder(FlightShareInfo model) {
                this.operatingAirlineInfo = model.operatingAirlineInfo;
                this.operatingFlightNo = model.operatingFlightNo;
            } 

            /**
             * operating_airline_info.
             */
            public Builder operatingAirlineInfo(OperatingAirlineInfo operatingAirlineInfo) {
                this.operatingAirlineInfo = operatingAirlineInfo;
                return this;
            }

            /**
             * operating_flight_no.
             */
            public Builder operatingFlightNo(String operatingFlightNo) {
                this.operatingFlightNo = operatingFlightNo;
                return this;
            }

            public FlightShareInfo build() {
                return new FlightShareInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOtaSearchResponseBody</p>
     */
    public static class FlightStopInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("stop_airport")
        private String stopAirport;

        @com.aliyun.core.annotation.NameInMap("stop_airport_name")
        private String stopAirportName;

        @com.aliyun.core.annotation.NameInMap("stop_arr_term")
        private String stopArrTerm;

        @com.aliyun.core.annotation.NameInMap("stop_arr_time")
        private String stopArrTime;

        @com.aliyun.core.annotation.NameInMap("stop_city_code")
        private String stopCityCode;

        @com.aliyun.core.annotation.NameInMap("stop_city_name")
        private String stopCityName;

        @com.aliyun.core.annotation.NameInMap("stop_dep_term")
        private String stopDepTerm;

        @com.aliyun.core.annotation.NameInMap("stop_dep_time")
        private String stopDepTime;

        @com.aliyun.core.annotation.NameInMap("stop_time")
        private String stopTime;

        private FlightStopInfoList(Builder builder) {
            this.stopAirport = builder.stopAirport;
            this.stopAirportName = builder.stopAirportName;
            this.stopArrTerm = builder.stopArrTerm;
            this.stopArrTime = builder.stopArrTime;
            this.stopCityCode = builder.stopCityCode;
            this.stopCityName = builder.stopCityName;
            this.stopDepTerm = builder.stopDepTerm;
            this.stopDepTime = builder.stopDepTime;
            this.stopTime = builder.stopTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightStopInfoList create() {
            return builder().build();
        }

        /**
         * @return stopAirport
         */
        public String getStopAirport() {
            return this.stopAirport;
        }

        /**
         * @return stopAirportName
         */
        public String getStopAirportName() {
            return this.stopAirportName;
        }

        /**
         * @return stopArrTerm
         */
        public String getStopArrTerm() {
            return this.stopArrTerm;
        }

        /**
         * @return stopArrTime
         */
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        /**
         * @return stopCityCode
         */
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        /**
         * @return stopCityName
         */
        public String getStopCityName() {
            return this.stopCityName;
        }

        /**
         * @return stopDepTerm
         */
        public String getStopDepTerm() {
            return this.stopDepTerm;
        }

        /**
         * @return stopDepTime
         */
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        /**
         * @return stopTime
         */
        public String getStopTime() {
            return this.stopTime;
        }

        public static final class Builder {
            private String stopAirport; 
            private String stopAirportName; 
            private String stopArrTerm; 
            private String stopArrTime; 
            private String stopCityCode; 
            private String stopCityName; 
            private String stopDepTerm; 
            private String stopDepTime; 
            private String stopTime; 

            private Builder() {
            } 

            private Builder(FlightStopInfoList model) {
                this.stopAirport = model.stopAirport;
                this.stopAirportName = model.stopAirportName;
                this.stopArrTerm = model.stopArrTerm;
                this.stopArrTime = model.stopArrTime;
                this.stopCityCode = model.stopCityCode;
                this.stopCityName = model.stopCityName;
                this.stopDepTerm = model.stopDepTerm;
                this.stopDepTime = model.stopDepTime;
                this.stopTime = model.stopTime;
            } 

            /**
             * stop_airport.
             */
            public Builder stopAirport(String stopAirport) {
                this.stopAirport = stopAirport;
                return this;
            }

            /**
             * stop_airport_name.
             */
            public Builder stopAirportName(String stopAirportName) {
                this.stopAirportName = stopAirportName;
                return this;
            }

            /**
             * stop_arr_term.
             */
            public Builder stopArrTerm(String stopArrTerm) {
                this.stopArrTerm = stopArrTerm;
                return this;
            }

            /**
             * stop_arr_time.
             */
            public Builder stopArrTime(String stopArrTime) {
                this.stopArrTime = stopArrTime;
                return this;
            }

            /**
             * stop_city_code.
             */
            public Builder stopCityCode(String stopCityCode) {
                this.stopCityCode = stopCityCode;
                return this;
            }

            /**
             * stop_city_name.
             */
            public Builder stopCityName(String stopCityName) {
                this.stopCityName = stopCityName;
                return this;
            }

            /**
             * stop_dep_term.
             */
            public Builder stopDepTerm(String stopDepTerm) {
                this.stopDepTerm = stopDepTerm;
                return this;
            }

            /**
             * stop_dep_time.
             */
            public Builder stopDepTime(String stopDepTime) {
                this.stopDepTime = stopDepTime;
                return this;
            }

            /**
             * stop_time.
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            public FlightStopInfoList build() {
                return new FlightStopInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOtaSearchResponseBody</p>
     */
    public static class LuggageDirectInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dep_city_luggage_direct")
        private Integer depCityLuggageDirect;

        @com.aliyun.core.annotation.NameInMap("stop_city_luggage_direct")
        private Integer stopCityLuggageDirect;

        private LuggageDirectInfo(Builder builder) {
            this.depCityLuggageDirect = builder.depCityLuggageDirect;
            this.stopCityLuggageDirect = builder.stopCityLuggageDirect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LuggageDirectInfo create() {
            return builder().build();
        }

        /**
         * @return depCityLuggageDirect
         */
        public Integer getDepCityLuggageDirect() {
            return this.depCityLuggageDirect;
        }

        /**
         * @return stopCityLuggageDirect
         */
        public Integer getStopCityLuggageDirect() {
            return this.stopCityLuggageDirect;
        }

        public static final class Builder {
            private Integer depCityLuggageDirect; 
            private Integer stopCityLuggageDirect; 

            private Builder() {
            } 

            private Builder(LuggageDirectInfo model) {
                this.depCityLuggageDirect = model.depCityLuggageDirect;
                this.stopCityLuggageDirect = model.stopCityLuggageDirect;
            } 

            /**
             * dep_city_luggage_direct.
             */
            public Builder depCityLuggageDirect(Integer depCityLuggageDirect) {
                this.depCityLuggageDirect = depCityLuggageDirect;
                return this;
            }

            /**
             * stop_city_luggage_direct.
             */
            public Builder stopCityLuggageDirect(Integer stopCityLuggageDirect) {
                this.stopCityLuggageDirect = stopCityLuggageDirect;
                return this;
            }

            public LuggageDirectInfo build() {
                return new LuggageDirectInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOtaSearchResponseBody</p>
     */
    public static class SegmentVisaRemark extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dep_city_visa_remark")
        private String depCityVisaRemark;

        @com.aliyun.core.annotation.NameInMap("dep_city_visa_type")
        private Integer depCityVisaType;

        @com.aliyun.core.annotation.NameInMap("stop_city_visa_remarks")
        private java.util.List<String> stopCityVisaRemarks;

        @com.aliyun.core.annotation.NameInMap("stop_city_visa_types")
        private java.util.List<Integer> stopCityVisaTypes;

        private SegmentVisaRemark(Builder builder) {
            this.depCityVisaRemark = builder.depCityVisaRemark;
            this.depCityVisaType = builder.depCityVisaType;
            this.stopCityVisaRemarks = builder.stopCityVisaRemarks;
            this.stopCityVisaTypes = builder.stopCityVisaTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentVisaRemark create() {
            return builder().build();
        }

        /**
         * @return depCityVisaRemark
         */
        public String getDepCityVisaRemark() {
            return this.depCityVisaRemark;
        }

        /**
         * @return depCityVisaType
         */
        public Integer getDepCityVisaType() {
            return this.depCityVisaType;
        }

        /**
         * @return stopCityVisaRemarks
         */
        public java.util.List<String> getStopCityVisaRemarks() {
            return this.stopCityVisaRemarks;
        }

        /**
         * @return stopCityVisaTypes
         */
        public java.util.List<Integer> getStopCityVisaTypes() {
            return this.stopCityVisaTypes;
        }

        public static final class Builder {
            private String depCityVisaRemark; 
            private Integer depCityVisaType; 
            private java.util.List<String> stopCityVisaRemarks; 
            private java.util.List<Integer> stopCityVisaTypes; 

            private Builder() {
            } 

            private Builder(SegmentVisaRemark model) {
                this.depCityVisaRemark = model.depCityVisaRemark;
                this.depCityVisaType = model.depCityVisaType;
                this.stopCityVisaRemarks = model.stopCityVisaRemarks;
                this.stopCityVisaTypes = model.stopCityVisaTypes;
            } 

            /**
             * dep_city_visa_remark.
             */
            public Builder depCityVisaRemark(String depCityVisaRemark) {
                this.depCityVisaRemark = depCityVisaRemark;
                return this;
            }

            /**
             * dep_city_visa_type.
             */
            public Builder depCityVisaType(Integer depCityVisaType) {
                this.depCityVisaType = depCityVisaType;
                return this;
            }

            /**
             * stop_city_visa_remarks.
             */
            public Builder stopCityVisaRemarks(java.util.List<String> stopCityVisaRemarks) {
                this.stopCityVisaRemarks = stopCityVisaRemarks;
                return this;
            }

            /**
             * stop_city_visa_types.
             */
            public Builder stopCityVisaTypes(java.util.List<Integer> stopCityVisaTypes) {
                this.stopCityVisaTypes = stopCityVisaTypes;
                return this;
            }

            public SegmentVisaRemark build() {
                return new SegmentVisaRemark(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOtaSearchResponseBody</p>
     */
    public static class FlightSegmentInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_info")
        private AirlineInfo airlineInfo;

        @com.aliyun.core.annotation.NameInMap("arr_airport_info")
        private ArrAirportInfo arrAirportInfo;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_city_name")
        private String arrCityName;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("dep_airport_info")
        private DepAirportInfo depAirportInfo;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_name")
        private String depCityName;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("flight_share_info")
        private FlightShareInfo flightShareInfo;

        @com.aliyun.core.annotation.NameInMap("flight_size")
        private String flightSize;

        @com.aliyun.core.annotation.NameInMap("flight_stop_info_list")
        private java.util.List<FlightStopInfoList> flightStopInfoList;

        @com.aliyun.core.annotation.NameInMap("flight_type")
        private String flightType;

        @com.aliyun.core.annotation.NameInMap("luggage_direct_info")
        private LuggageDirectInfo luggageDirectInfo;

        @com.aliyun.core.annotation.NameInMap("manufacturer")
        private String manufacturer;

        @com.aliyun.core.annotation.NameInMap("meal_desc")
        private String mealDesc;

        @com.aliyun.core.annotation.NameInMap("one_more")
        private Integer oneMore;

        @com.aliyun.core.annotation.NameInMap("one_more_show")
        private String oneMoreShow;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        @com.aliyun.core.annotation.NameInMap("segment_key")
        private String segmentKey;

        @com.aliyun.core.annotation.NameInMap("segment_visa_remark")
        private SegmentVisaRemark segmentVisaRemark;

        @com.aliyun.core.annotation.NameInMap("share")
        private Boolean share;

        @com.aliyun.core.annotation.NameInMap("short_flight_size")
        private String shortFlightSize;

        @com.aliyun.core.annotation.NameInMap("stop")
        private Boolean stop;

        @com.aliyun.core.annotation.NameInMap("total_time")
        private String totalTime;

        private FlightSegmentInfos(Builder builder) {
            this.airlineInfo = builder.airlineInfo;
            this.arrAirportInfo = builder.arrAirportInfo;
            this.arrCityCode = builder.arrCityCode;
            this.arrCityName = builder.arrCityName;
            this.arrTime = builder.arrTime;
            this.depAirportInfo = builder.depAirportInfo;
            this.depCityCode = builder.depCityCode;
            this.depCityName = builder.depCityName;
            this.depTime = builder.depTime;
            this.duration = builder.duration;
            this.flightNo = builder.flightNo;
            this.flightShareInfo = builder.flightShareInfo;
            this.flightSize = builder.flightSize;
            this.flightStopInfoList = builder.flightStopInfoList;
            this.flightType = builder.flightType;
            this.luggageDirectInfo = builder.luggageDirectInfo;
            this.manufacturer = builder.manufacturer;
            this.mealDesc = builder.mealDesc;
            this.oneMore = builder.oneMore;
            this.oneMoreShow = builder.oneMoreShow;
            this.segmentIndex = builder.segmentIndex;
            this.segmentKey = builder.segmentKey;
            this.segmentVisaRemark = builder.segmentVisaRemark;
            this.share = builder.share;
            this.shortFlightSize = builder.shortFlightSize;
            this.stop = builder.stop;
            this.totalTime = builder.totalTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightSegmentInfos create() {
            return builder().build();
        }

        /**
         * @return airlineInfo
         */
        public AirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        /**
         * @return arrAirportInfo
         */
        public ArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return arrCityName
         */
        public String getArrCityName() {
            return this.arrCityName;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return depAirportInfo
         */
        public DepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return depCityName
         */
        public String getDepCityName() {
            return this.depCityName;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return flightShareInfo
         */
        public FlightShareInfo getFlightShareInfo() {
            return this.flightShareInfo;
        }

        /**
         * @return flightSize
         */
        public String getFlightSize() {
            return this.flightSize;
        }

        /**
         * @return flightStopInfoList
         */
        public java.util.List<FlightStopInfoList> getFlightStopInfoList() {
            return this.flightStopInfoList;
        }

        /**
         * @return flightType
         */
        public String getFlightType() {
            return this.flightType;
        }

        /**
         * @return luggageDirectInfo
         */
        public LuggageDirectInfo getLuggageDirectInfo() {
            return this.luggageDirectInfo;
        }

        /**
         * @return manufacturer
         */
        public String getManufacturer() {
            return this.manufacturer;
        }

        /**
         * @return mealDesc
         */
        public String getMealDesc() {
            return this.mealDesc;
        }

        /**
         * @return oneMore
         */
        public Integer getOneMore() {
            return this.oneMore;
        }

        /**
         * @return oneMoreShow
         */
        public String getOneMoreShow() {
            return this.oneMoreShow;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        /**
         * @return segmentKey
         */
        public String getSegmentKey() {
            return this.segmentKey;
        }

        /**
         * @return segmentVisaRemark
         */
        public SegmentVisaRemark getSegmentVisaRemark() {
            return this.segmentVisaRemark;
        }

        /**
         * @return share
         */
        public Boolean getShare() {
            return this.share;
        }

        /**
         * @return shortFlightSize
         */
        public String getShortFlightSize() {
            return this.shortFlightSize;
        }

        /**
         * @return stop
         */
        public Boolean getStop() {
            return this.stop;
        }

        /**
         * @return totalTime
         */
        public String getTotalTime() {
            return this.totalTime;
        }

        public static final class Builder {
            private AirlineInfo airlineInfo; 
            private ArrAirportInfo arrAirportInfo; 
            private String arrCityCode; 
            private String arrCityName; 
            private String arrTime; 
            private DepAirportInfo depAirportInfo; 
            private String depCityCode; 
            private String depCityName; 
            private String depTime; 
            private Integer duration; 
            private String flightNo; 
            private FlightShareInfo flightShareInfo; 
            private String flightSize; 
            private java.util.List<FlightStopInfoList> flightStopInfoList; 
            private String flightType; 
            private LuggageDirectInfo luggageDirectInfo; 
            private String manufacturer; 
            private String mealDesc; 
            private Integer oneMore; 
            private String oneMoreShow; 
            private Integer segmentIndex; 
            private String segmentKey; 
            private SegmentVisaRemark segmentVisaRemark; 
            private Boolean share; 
            private String shortFlightSize; 
            private Boolean stop; 
            private String totalTime; 

            private Builder() {
            } 

            private Builder(FlightSegmentInfos model) {
                this.airlineInfo = model.airlineInfo;
                this.arrAirportInfo = model.arrAirportInfo;
                this.arrCityCode = model.arrCityCode;
                this.arrCityName = model.arrCityName;
                this.arrTime = model.arrTime;
                this.depAirportInfo = model.depAirportInfo;
                this.depCityCode = model.depCityCode;
                this.depCityName = model.depCityName;
                this.depTime = model.depTime;
                this.duration = model.duration;
                this.flightNo = model.flightNo;
                this.flightShareInfo = model.flightShareInfo;
                this.flightSize = model.flightSize;
                this.flightStopInfoList = model.flightStopInfoList;
                this.flightType = model.flightType;
                this.luggageDirectInfo = model.luggageDirectInfo;
                this.manufacturer = model.manufacturer;
                this.mealDesc = model.mealDesc;
                this.oneMore = model.oneMore;
                this.oneMoreShow = model.oneMoreShow;
                this.segmentIndex = model.segmentIndex;
                this.segmentKey = model.segmentKey;
                this.segmentVisaRemark = model.segmentVisaRemark;
                this.share = model.share;
                this.shortFlightSize = model.shortFlightSize;
                this.stop = model.stop;
                this.totalTime = model.totalTime;
            } 

            /**
             * airline_info.
             */
            public Builder airlineInfo(AirlineInfo airlineInfo) {
                this.airlineInfo = airlineInfo;
                return this;
            }

            /**
             * arr_airport_info.
             */
            public Builder arrAirportInfo(ArrAirportInfo arrAirportInfo) {
                this.arrAirportInfo = arrAirportInfo;
                return this;
            }

            /**
             * arr_city_code.
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * arr_city_name.
             */
            public Builder arrCityName(String arrCityName) {
                this.arrCityName = arrCityName;
                return this;
            }

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * dep_airport_info.
             */
            public Builder depAirportInfo(DepAirportInfo depAirportInfo) {
                this.depAirportInfo = depAirportInfo;
                return this;
            }

            /**
             * dep_city_code.
             */
            public Builder depCityCode(String depCityCode) {
                this.depCityCode = depCityCode;
                return this;
            }

            /**
             * dep_city_name.
             */
            public Builder depCityName(String depCityName) {
                this.depCityName = depCityName;
                return this;
            }

            /**
             * dep_time.
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            /**
             * flight_share_info.
             */
            public Builder flightShareInfo(FlightShareInfo flightShareInfo) {
                this.flightShareInfo = flightShareInfo;
                return this;
            }

            /**
             * flight_size.
             */
            public Builder flightSize(String flightSize) {
                this.flightSize = flightSize;
                return this;
            }

            /**
             * flight_stop_info_list.
             */
            public Builder flightStopInfoList(java.util.List<FlightStopInfoList> flightStopInfoList) {
                this.flightStopInfoList = flightStopInfoList;
                return this;
            }

            /**
             * flight_type.
             */
            public Builder flightType(String flightType) {
                this.flightType = flightType;
                return this;
            }

            /**
             * luggage_direct_info.
             */
            public Builder luggageDirectInfo(LuggageDirectInfo luggageDirectInfo) {
                this.luggageDirectInfo = luggageDirectInfo;
                return this;
            }

            /**
             * manufacturer.
             */
            public Builder manufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
                return this;
            }

            /**
             * meal_desc.
             */
            public Builder mealDesc(String mealDesc) {
                this.mealDesc = mealDesc;
                return this;
            }

            /**
             * one_more.
             */
            public Builder oneMore(Integer oneMore) {
                this.oneMore = oneMore;
                return this;
            }

            /**
             * one_more_show.
             */
            public Builder oneMoreShow(String oneMoreShow) {
                this.oneMoreShow = oneMoreShow;
                return this;
            }

            /**
             * segment_index.
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
                return this;
            }

            /**
             * segment_key.
             */
            public Builder segmentKey(String segmentKey) {
                this.segmentKey = segmentKey;
                return this;
            }

            /**
             * segment_visa_remark.
             */
            public Builder segmentVisaRemark(SegmentVisaRemark segmentVisaRemark) {
                this.segmentVisaRemark = segmentVisaRemark;
                return this;
            }

            /**
             * share.
             */
            public Builder share(Boolean share) {
                this.share = share;
                return this;
            }

            /**
             * short_flight_size.
             */
            public Builder shortFlightSize(String shortFlightSize) {
                this.shortFlightSize = shortFlightSize;
                return this;
            }

            /**
             * stop.
             */
            public Builder stop(Boolean stop) {
                this.stop = stop;
                return this;
            }

            /**
             * total_time.
             */
            public Builder totalTime(String totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            public FlightSegmentInfos build() {
                return new FlightSegmentInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOtaSearchResponseBody</p>
     */
    public static class FlightJourneyInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_city_name")
        private String arrCityName;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_name")
        private String depCityName;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("flight_segment_infos")
        private java.util.List<FlightSegmentInfos> flightSegmentInfos;

        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("transfer_time")
        private Integer transferTime;

        private FlightJourneyInfos(Builder builder) {
            this.arrCityCode = builder.arrCityCode;
            this.arrCityName = builder.arrCityName;
            this.arrTime = builder.arrTime;
            this.depCityCode = builder.depCityCode;
            this.depCityName = builder.depCityName;
            this.depTime = builder.depTime;
            this.duration = builder.duration;
            this.flightSegmentInfos = builder.flightSegmentInfos;
            this.journeyIndex = builder.journeyIndex;
            this.transferTime = builder.transferTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightJourneyInfos create() {
            return builder().build();
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return arrCityName
         */
        public String getArrCityName() {
            return this.arrCityName;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return depCityName
         */
        public String getDepCityName() {
            return this.depCityName;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return flightSegmentInfos
         */
        public java.util.List<FlightSegmentInfos> getFlightSegmentInfos() {
            return this.flightSegmentInfos;
        }

        /**
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        /**
         * @return transferTime
         */
        public Integer getTransferTime() {
            return this.transferTime;
        }

        public static final class Builder {
            private String arrCityCode; 
            private String arrCityName; 
            private String arrTime; 
            private String depCityCode; 
            private String depCityName; 
            private String depTime; 
            private Integer duration; 
            private java.util.List<FlightSegmentInfos> flightSegmentInfos; 
            private Integer journeyIndex; 
            private Integer transferTime; 

            private Builder() {
            } 

            private Builder(FlightJourneyInfos model) {
                this.arrCityCode = model.arrCityCode;
                this.arrCityName = model.arrCityName;
                this.arrTime = model.arrTime;
                this.depCityCode = model.depCityCode;
                this.depCityName = model.depCityName;
                this.depTime = model.depTime;
                this.duration = model.duration;
                this.flightSegmentInfos = model.flightSegmentInfos;
                this.journeyIndex = model.journeyIndex;
                this.transferTime = model.transferTime;
            } 

            /**
             * arr_city_code.
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * arr_city_name.
             */
            public Builder arrCityName(String arrCityName) {
                this.arrCityName = arrCityName;
                return this;
            }

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * dep_city_code.
             */
            public Builder depCityCode(String depCityCode) {
                this.depCityCode = depCityCode;
                return this;
            }

            /**
             * dep_city_name.
             */
            public Builder depCityName(String depCityName) {
                this.depCityName = depCityName;
                return this;
            }

            /**
             * dep_time.
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * flight_segment_infos.
             */
            public Builder flightSegmentInfos(java.util.List<FlightSegmentInfos> flightSegmentInfos) {
                this.flightSegmentInfos = flightSegmentInfos;
                return this;
            }

            /**
             * journey_index.
             */
            public Builder journeyIndex(Integer journeyIndex) {
                this.journeyIndex = journeyIndex;
                return this;
            }

            /**
             * transfer_time.
             */
            public Builder transferTime(Integer transferTime) {
                this.transferTime = transferTime;
                return this;
            }

            public FlightJourneyInfos build() {
                return new FlightJourneyInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOtaSearchResponseBody</p>
     */
    public static class AgreementPriceCodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        private AgreementPriceCodes(Builder builder) {
            this.code = builder.code;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgreementPriceCodes create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(AgreementPriceCodes model) {
                this.code = model.code;
                this.type = model.type;
            } 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public AgreementPriceCodes build() {
                return new AgreementPriceCodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOtaSearchResponseBody</p>
     */
    public static class BaggageRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baggage_digest")
        private String baggageDigest;

        @com.aliyun.core.annotation.NameInMap("offer_baggage_info_map")
        private java.util.Map<String, java.util.List<ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue>> offerBaggageInfoMap;

        @com.aliyun.core.annotation.NameInMap("structured_baggage")
        private Boolean structuredBaggage;

        private BaggageRule(Builder builder) {
            this.baggageDigest = builder.baggageDigest;
            this.offerBaggageInfoMap = builder.offerBaggageInfoMap;
            this.structuredBaggage = builder.structuredBaggage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaggageRule create() {
            return builder().build();
        }

        /**
         * @return baggageDigest
         */
        public String getBaggageDigest() {
            return this.baggageDigest;
        }

        /**
         * @return offerBaggageInfoMap
         */
        public java.util.Map<String, java.util.List<ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue>> getOfferBaggageInfoMap() {
            return this.offerBaggageInfoMap;
        }

        /**
         * @return structuredBaggage
         */
        public Boolean getStructuredBaggage() {
            return this.structuredBaggage;
        }

        public static final class Builder {
            private String baggageDigest; 
            private java.util.Map<String, java.util.List<ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue>> offerBaggageInfoMap; 
            private Boolean structuredBaggage; 

            private Builder() {
            } 

            private Builder(BaggageRule model) {
                this.baggageDigest = model.baggageDigest;
                this.offerBaggageInfoMap = model.offerBaggageInfoMap;
                this.structuredBaggage = model.structuredBaggage;
            } 

            /**
             * baggage_digest.
             */
            public Builder baggageDigest(String baggageDigest) {
                this.baggageDigest = baggageDigest;
                return this;
            }

            /**
             * offer_baggage_info_map.
             */
            public Builder offerBaggageInfoMap(java.util.Map<String, java.util.List<ModuleItemListSubItemsBaggageRuleOfferBaggageInfoMapValue>> offerBaggageInfoMap) {
                this.offerBaggageInfoMap = offerBaggageInfoMap;
                return this;
            }

            /**
             * structured_baggage.
             */
            public Builder structuredBaggage(Boolean structuredBaggage) {
                this.structuredBaggage = structuredBaggage;
                return this;
            }

            public BaggageRule build() {
                return new BaggageRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOtaSearchResponseBody</p>
     */
    public static class RefundChangeRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cancel_fee_ind")
        private Boolean cancelFeeInd;

        @com.aliyun.core.annotation.NameInMap("change_fee_ind")
        private Boolean changeFeeInd;

        @com.aliyun.core.annotation.NameInMap("change_rule_desc")
        private String changeRuleDesc;

        @com.aliyun.core.annotation.NameInMap("offer_penalty_info_map")
        private java.util.Map<String, java.util.List<ModuleItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap;

        @com.aliyun.core.annotation.NameInMap("refund_change_digest")
        private String refundChangeDigest;

        @com.aliyun.core.annotation.NameInMap("refund_rule_desc")
        private String refundRuleDesc;

        @com.aliyun.core.annotation.NameInMap("structured_refund")
        private Boolean structuredRefund;

        private RefundChangeRule(Builder builder) {
            this.cancelFeeInd = builder.cancelFeeInd;
            this.changeFeeInd = builder.changeFeeInd;
            this.changeRuleDesc = builder.changeRuleDesc;
            this.offerPenaltyInfoMap = builder.offerPenaltyInfoMap;
            this.refundChangeDigest = builder.refundChangeDigest;
            this.refundRuleDesc = builder.refundRuleDesc;
            this.structuredRefund = builder.structuredRefund;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundChangeRule create() {
            return builder().build();
        }

        /**
         * @return cancelFeeInd
         */
        public Boolean getCancelFeeInd() {
            return this.cancelFeeInd;
        }

        /**
         * @return changeFeeInd
         */
        public Boolean getChangeFeeInd() {
            return this.changeFeeInd;
        }

        /**
         * @return changeRuleDesc
         */
        public String getChangeRuleDesc() {
            return this.changeRuleDesc;
        }

        /**
         * @return offerPenaltyInfoMap
         */
        public java.util.Map<String, java.util.List<ModuleItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue>> getOfferPenaltyInfoMap() {
            return this.offerPenaltyInfoMap;
        }

        /**
         * @return refundChangeDigest
         */
        public String getRefundChangeDigest() {
            return this.refundChangeDigest;
        }

        /**
         * @return refundRuleDesc
         */
        public String getRefundRuleDesc() {
            return this.refundRuleDesc;
        }

        /**
         * @return structuredRefund
         */
        public Boolean getStructuredRefund() {
            return this.structuredRefund;
        }

        public static final class Builder {
            private Boolean cancelFeeInd; 
            private Boolean changeFeeInd; 
            private String changeRuleDesc; 
            private java.util.Map<String, java.util.List<ModuleItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap; 
            private String refundChangeDigest; 
            private String refundRuleDesc; 
            private Boolean structuredRefund; 

            private Builder() {
            } 

            private Builder(RefundChangeRule model) {
                this.cancelFeeInd = model.cancelFeeInd;
                this.changeFeeInd = model.changeFeeInd;
                this.changeRuleDesc = model.changeRuleDesc;
                this.offerPenaltyInfoMap = model.offerPenaltyInfoMap;
                this.refundChangeDigest = model.refundChangeDigest;
                this.refundRuleDesc = model.refundRuleDesc;
                this.structuredRefund = model.structuredRefund;
            } 

            /**
             * cancel_fee_ind.
             */
            public Builder cancelFeeInd(Boolean cancelFeeInd) {
                this.cancelFeeInd = cancelFeeInd;
                return this;
            }

            /**
             * change_fee_ind.
             */
            public Builder changeFeeInd(Boolean changeFeeInd) {
                this.changeFeeInd = changeFeeInd;
                return this;
            }

            /**
             * change_rule_desc.
             */
            public Builder changeRuleDesc(String changeRuleDesc) {
                this.changeRuleDesc = changeRuleDesc;
                return this;
            }

            /**
             * offer_penalty_info_map.
             */
            public Builder offerPenaltyInfoMap(java.util.Map<String, java.util.List<ModuleItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap) {
                this.offerPenaltyInfoMap = offerPenaltyInfoMap;
                return this;
            }

            /**
             * refund_change_digest.
             */
            public Builder refundChangeDigest(String refundChangeDigest) {
                this.refundChangeDigest = refundChangeDigest;
                return this;
            }

            /**
             * refund_rule_desc.
             */
            public Builder refundRuleDesc(String refundRuleDesc) {
                this.refundRuleDesc = refundRuleDesc;
                return this;
            }

            /**
             * structured_refund.
             */
            public Builder structuredRefund(Boolean structuredRefund) {
                this.structuredRefund = structuredRefund;
                return this;
            }

            public RefundChangeRule build() {
                return new RefundChangeRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOtaSearchResponseBody</p>
     */
    public static class SegmentPositionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        private SegmentPositionList(Builder builder) {
            this.journeyIndex = builder.journeyIndex;
            this.segmentIndex = builder.segmentIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentPositionList create() {
            return builder().build();
        }

        /**
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public static final class Builder {
            private Integer journeyIndex; 
            private Integer segmentIndex; 

            private Builder() {
            } 

            private Builder(SegmentPositionList model) {
                this.journeyIndex = model.journeyIndex;
                this.segmentIndex = model.segmentIndex;
            } 

            /**
             * journey_index.
             */
            public Builder journeyIndex(Integer journeyIndex) {
                this.journeyIndex = journeyIndex;
                return this;
            }

            /**
             * segment_index.
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
                return this;
            }

            public SegmentPositionList build() {
                return new SegmentPositionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOtaSearchResponseBody</p>
     */
    public static class SubItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baggage_rule")
        private BaggageRule baggageRule;

        @com.aliyun.core.annotation.NameInMap("refund_change_rule")
        private RefundChangeRule refundChangeRule;

        @com.aliyun.core.annotation.NameInMap("segment_keys")
        private java.util.List<String> segmentKeys;

        @com.aliyun.core.annotation.NameInMap("segment_position_list")
        private java.util.List<SegmentPositionList> segmentPositionList;

        @com.aliyun.core.annotation.NameInMap("shopping_item_map")
        private java.util.Map<String, ModuleItemListSubItemsShoppingItemMapValue> shoppingItemMap;

        @com.aliyun.core.annotation.NameInMap("uniq_key")
        private String uniqKey;

        private SubItems(Builder builder) {
            this.baggageRule = builder.baggageRule;
            this.refundChangeRule = builder.refundChangeRule;
            this.segmentKeys = builder.segmentKeys;
            this.segmentPositionList = builder.segmentPositionList;
            this.shoppingItemMap = builder.shoppingItemMap;
            this.uniqKey = builder.uniqKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubItems create() {
            return builder().build();
        }

        /**
         * @return baggageRule
         */
        public BaggageRule getBaggageRule() {
            return this.baggageRule;
        }

        /**
         * @return refundChangeRule
         */
        public RefundChangeRule getRefundChangeRule() {
            return this.refundChangeRule;
        }

        /**
         * @return segmentKeys
         */
        public java.util.List<String> getSegmentKeys() {
            return this.segmentKeys;
        }

        /**
         * @return segmentPositionList
         */
        public java.util.List<SegmentPositionList> getSegmentPositionList() {
            return this.segmentPositionList;
        }

        /**
         * @return shoppingItemMap
         */
        public java.util.Map<String, ModuleItemListSubItemsShoppingItemMapValue> getShoppingItemMap() {
            return this.shoppingItemMap;
        }

        /**
         * @return uniqKey
         */
        public String getUniqKey() {
            return this.uniqKey;
        }

        public static final class Builder {
            private BaggageRule baggageRule; 
            private RefundChangeRule refundChangeRule; 
            private java.util.List<String> segmentKeys; 
            private java.util.List<SegmentPositionList> segmentPositionList; 
            private java.util.Map<String, ModuleItemListSubItemsShoppingItemMapValue> shoppingItemMap; 
            private String uniqKey; 

            private Builder() {
            } 

            private Builder(SubItems model) {
                this.baggageRule = model.baggageRule;
                this.refundChangeRule = model.refundChangeRule;
                this.segmentKeys = model.segmentKeys;
                this.segmentPositionList = model.segmentPositionList;
                this.shoppingItemMap = model.shoppingItemMap;
                this.uniqKey = model.uniqKey;
            } 

            /**
             * baggage_rule.
             */
            public Builder baggageRule(BaggageRule baggageRule) {
                this.baggageRule = baggageRule;
                return this;
            }

            /**
             * refund_change_rule.
             */
            public Builder refundChangeRule(RefundChangeRule refundChangeRule) {
                this.refundChangeRule = refundChangeRule;
                return this;
            }

            /**
             * segment_keys.
             */
            public Builder segmentKeys(java.util.List<String> segmentKeys) {
                this.segmentKeys = segmentKeys;
                return this;
            }

            /**
             * segment_position_list.
             */
            public Builder segmentPositionList(java.util.List<SegmentPositionList> segmentPositionList) {
                this.segmentPositionList = segmentPositionList;
                return this;
            }

            /**
             * shopping_item_map.
             */
            public Builder shoppingItemMap(java.util.Map<String, ModuleItemListSubItemsShoppingItemMapValue> shoppingItemMap) {
                this.shoppingItemMap = shoppingItemMap;
                return this;
            }

            /**
             * uniq_key.
             */
            public Builder uniqKey(String uniqKey) {
                this.uniqKey = uniqKey;
                return this;
            }

            public SubItems build() {
                return new SubItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOtaSearchResponseBody</p>
     */
    public static class ItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agreement_price_codes")
        private java.util.List<AgreementPriceCodes> agreementPriceCodes;

        @com.aliyun.core.annotation.NameInMap("item_id")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("item_type")
        private String itemType;

        @com.aliyun.core.annotation.NameInMap("shopping_item_map")
        private java.util.Map<String, ModuleItemListShoppingItemMapValue> shoppingItemMap;

        @com.aliyun.core.annotation.NameInMap("sub_items")
        private java.util.List<SubItems> subItems;

        private ItemList(Builder builder) {
            this.agreementPriceCodes = builder.agreementPriceCodes;
            this.itemId = builder.itemId;
            this.itemType = builder.itemType;
            this.shoppingItemMap = builder.shoppingItemMap;
            this.subItems = builder.subItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemList create() {
            return builder().build();
        }

        /**
         * @return agreementPriceCodes
         */
        public java.util.List<AgreementPriceCodes> getAgreementPriceCodes() {
            return this.agreementPriceCodes;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemType
         */
        public String getItemType() {
            return this.itemType;
        }

        /**
         * @return shoppingItemMap
         */
        public java.util.Map<String, ModuleItemListShoppingItemMapValue> getShoppingItemMap() {
            return this.shoppingItemMap;
        }

        /**
         * @return subItems
         */
        public java.util.List<SubItems> getSubItems() {
            return this.subItems;
        }

        public static final class Builder {
            private java.util.List<AgreementPriceCodes> agreementPriceCodes; 
            private String itemId; 
            private String itemType; 
            private java.util.Map<String, ModuleItemListShoppingItemMapValue> shoppingItemMap; 
            private java.util.List<SubItems> subItems; 

            private Builder() {
            } 

            private Builder(ItemList model) {
                this.agreementPriceCodes = model.agreementPriceCodes;
                this.itemId = model.itemId;
                this.itemType = model.itemType;
                this.shoppingItemMap = model.shoppingItemMap;
                this.subItems = model.subItems;
            } 

            /**
             * agreement_price_codes.
             */
            public Builder agreementPriceCodes(java.util.List<AgreementPriceCodes> agreementPriceCodes) {
                this.agreementPriceCodes = agreementPriceCodes;
                return this;
            }

            /**
             * item_id.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * item_type.
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * shopping_item_map.
             */
            public Builder shoppingItemMap(java.util.Map<String, ModuleItemListShoppingItemMapValue> shoppingItemMap) {
                this.shoppingItemMap = shoppingItemMap;
                return this;
            }

            /**
             * sub_items.
             */
            public Builder subItems(java.util.List<SubItems> subItems) {
                this.subItems = subItems;
                return this;
            }

            public ItemList build() {
                return new ItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOtaSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOtaSearchResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flight_journey_infos")
        private java.util.List<FlightJourneyInfos> flightJourneyInfos;

        @com.aliyun.core.annotation.NameInMap("item_list")
        private java.util.List<ItemList> itemList;

        private Module(Builder builder) {
            this.flightJourneyInfos = builder.flightJourneyInfos;
            this.itemList = builder.itemList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return flightJourneyInfos
         */
        public java.util.List<FlightJourneyInfos> getFlightJourneyInfos() {
            return this.flightJourneyInfos;
        }

        /**
         * @return itemList
         */
        public java.util.List<ItemList> getItemList() {
            return this.itemList;
        }

        public static final class Builder {
            private java.util.List<FlightJourneyInfos> flightJourneyInfos; 
            private java.util.List<ItemList> itemList; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.flightJourneyInfos = model.flightJourneyInfos;
                this.itemList = model.itemList;
            } 

            /**
             * flight_journey_infos.
             */
            public Builder flightJourneyInfos(java.util.List<FlightJourneyInfos> flightJourneyInfos) {
                this.flightJourneyInfos = flightJourneyInfos;
                return this;
            }

            /**
             * item_list.
             */
            public Builder itemList(java.util.List<ItemList> itemList) {
                this.itemList = itemList;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
