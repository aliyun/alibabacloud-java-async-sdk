// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IntlFlightOtaItemDetailResponseBody} extends {@link TeaModel}
 *
 * <p>IntlFlightOtaItemDetailResponseBody</p>
 */
public class IntlFlightOtaItemDetailResponseBody extends TeaModel {
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

    private IntlFlightOtaItemDetailResponseBody(Builder builder) {
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

    public static IntlFlightOtaItemDetailResponseBody create() {
        return builder().build();
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
         * module.
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

        public IntlFlightOtaItemDetailResponseBody build() {
            return new IntlFlightOtaItemDetailResponseBody(this);
        } 

    } 

    public static class AirlineInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_chinese_name")
        private String airlineChineseName;

        @com.aliyun.core.annotation.NameInMap("airline_chinese_short_name")
        private String airlineChineseShortName;

        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_icon")
        private String airlineIcon;

        @com.aliyun.core.annotation.NameInMap("cheap_flight")
        private Boolean cheapFlight;

        private AirlineInfo(Builder builder) {
            this.airlineChineseName = builder.airlineChineseName;
            this.airlineChineseShortName = builder.airlineChineseShortName;
            this.airlineCode = builder.airlineCode;
            this.airlineIcon = builder.airlineIcon;
            this.cheapFlight = builder.cheapFlight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AirlineInfo create() {
            return builder().build();
        }

        /**
         * @return airlineChineseName
         */
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        /**
         * @return airlineChineseShortName
         */
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        /**
         * @return airlineCode
         */
        public String getAirlineCode() {
            return this.airlineCode;
        }

        /**
         * @return airlineIcon
         */
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        /**
         * @return cheapFlight
         */
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

        public static final class Builder {
            private String airlineChineseName; 
            private String airlineChineseShortName; 
            private String airlineCode; 
            private String airlineIcon; 
            private Boolean cheapFlight; 

            /**
             * airline_chinese_name.
             */
            public Builder airlineChineseName(String airlineChineseName) {
                this.airlineChineseName = airlineChineseName;
                return this;
            }

            /**
             * airline_chinese_short_name.
             */
            public Builder airlineChineseShortName(String airlineChineseShortName) {
                this.airlineChineseShortName = airlineChineseShortName;
                return this;
            }

            /**
             * airline_code.
             */
            public Builder airlineCode(String airlineCode) {
                this.airlineCode = airlineCode;
                return this;
            }

            /**
             * airline_icon.
             */
            public Builder airlineIcon(String airlineIcon) {
                this.airlineIcon = airlineIcon;
                return this;
            }

            /**
             * cheap_flight.
             */
            public Builder cheapFlight(Boolean cheapFlight) {
                this.cheapFlight = cheapFlight;
                return this;
            }

            public AirlineInfo build() {
                return new AirlineInfo(this);
            } 

        } 

    }
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
    public static class OperatingAirlineInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_chinese_name")
        private String airlineChineseName;

        @com.aliyun.core.annotation.NameInMap("airline_chinese_short_name")
        private String airlineChineseShortName;

        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_icon")
        private String airlineIcon;

        @com.aliyun.core.annotation.NameInMap("cheap_flight")
        private Boolean cheapFlight;

        private OperatingAirlineInfo(Builder builder) {
            this.airlineChineseName = builder.airlineChineseName;
            this.airlineChineseShortName = builder.airlineChineseShortName;
            this.airlineCode = builder.airlineCode;
            this.airlineIcon = builder.airlineIcon;
            this.cheapFlight = builder.cheapFlight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperatingAirlineInfo create() {
            return builder().build();
        }

        /**
         * @return airlineChineseName
         */
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        /**
         * @return airlineChineseShortName
         */
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        /**
         * @return airlineCode
         */
        public String getAirlineCode() {
            return this.airlineCode;
        }

        /**
         * @return airlineIcon
         */
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        /**
         * @return cheapFlight
         */
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

        public static final class Builder {
            private String airlineChineseName; 
            private String airlineChineseShortName; 
            private String airlineCode; 
            private String airlineIcon; 
            private Boolean cheapFlight; 

            /**
             * airline_chinese_name.
             */
            public Builder airlineChineseName(String airlineChineseName) {
                this.airlineChineseName = airlineChineseName;
                return this;
            }

            /**
             * airline_chinese_short_name.
             */
            public Builder airlineChineseShortName(String airlineChineseShortName) {
                this.airlineChineseShortName = airlineChineseShortName;
                return this;
            }

            /**
             * airline_code.
             */
            public Builder airlineCode(String airlineCode) {
                this.airlineCode = airlineCode;
                return this;
            }

            /**
             * airline_icon.
             */
            public Builder airlineIcon(String airlineIcon) {
                this.airlineIcon = airlineIcon;
                return this;
            }

            /**
             * cheap_flight.
             */
            public Builder cheapFlight(Boolean cheapFlight) {
                this.cheapFlight = cheapFlight;
                return this;
            }

            public OperatingAirlineInfo build() {
                return new OperatingAirlineInfo(this);
            } 

        } 

    }
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
    public static class FlightStopInfo extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("stop_city_names")
        private java.util.List < String > stopCityNames;

        @com.aliyun.core.annotation.NameInMap("stop_dep_term")
        private String stopDepTerm;

        @com.aliyun.core.annotation.NameInMap("stop_dep_time")
        private String stopDepTime;

        @com.aliyun.core.annotation.NameInMap("stop_time")
        private String stopTime;

        private FlightStopInfo(Builder builder) {
            this.stopAirport = builder.stopAirport;
            this.stopAirportName = builder.stopAirportName;
            this.stopArrTerm = builder.stopArrTerm;
            this.stopArrTime = builder.stopArrTime;
            this.stopCityCode = builder.stopCityCode;
            this.stopCityName = builder.stopCityName;
            this.stopCityNames = builder.stopCityNames;
            this.stopDepTerm = builder.stopDepTerm;
            this.stopDepTime = builder.stopDepTime;
            this.stopTime = builder.stopTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightStopInfo create() {
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
         * @return stopCityNames
         */
        public java.util.List < String > getStopCityNames() {
            return this.stopCityNames;
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
            private java.util.List < String > stopCityNames; 
            private String stopDepTerm; 
            private String stopDepTime; 
            private String stopTime; 

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
             * stop_city_names.
             */
            public Builder stopCityNames(java.util.List < String > stopCityNames) {
                this.stopCityNames = stopCityNames;
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

            public FlightStopInfo build() {
                return new FlightStopInfo(this);
            } 

        } 

    }
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
    public static class SegmentVisaRemark extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dep_city_visa_remark")
        private String depCityVisaRemark;

        @com.aliyun.core.annotation.NameInMap("dep_city_visa_type")
        private Integer depCityVisaType;

        @com.aliyun.core.annotation.NameInMap("stop_city_visa_remarks")
        private java.util.List < String > stopCityVisaRemarks;

        @com.aliyun.core.annotation.NameInMap("stop_city_visa_types")
        private java.util.List < Integer > stopCityVisaTypes;

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
        public java.util.List < String > getStopCityVisaRemarks() {
            return this.stopCityVisaRemarks;
        }

        /**
         * @return stopCityVisaTypes
         */
        public java.util.List < Integer > getStopCityVisaTypes() {
            return this.stopCityVisaTypes;
        }

        public static final class Builder {
            private String depCityVisaRemark; 
            private Integer depCityVisaType; 
            private java.util.List < String > stopCityVisaRemarks; 
            private java.util.List < Integer > stopCityVisaTypes; 

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
            public Builder stopCityVisaRemarks(java.util.List < String > stopCityVisaRemarks) {
                this.stopCityVisaRemarks = stopCityVisaRemarks;
                return this;
            }

            /**
             * stop_city_visa_types.
             */
            public Builder stopCityVisaTypes(java.util.List < Integer > stopCityVisaTypes) {
                this.stopCityVisaTypes = stopCityVisaTypes;
                return this;
            }

            public SegmentVisaRemark build() {
                return new SegmentVisaRemark(this);
            } 

        } 

    }
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

        @com.aliyun.core.annotation.NameInMap("baggage_desc")
        private String baggageDesc;

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

        @com.aliyun.core.annotation.NameInMap("flight_stop_info")
        private FlightStopInfo flightStopInfo;

        @com.aliyun.core.annotation.NameInMap("flight_type")
        private String flightType;

        @com.aliyun.core.annotation.NameInMap("luggage_direct_info")
        private LuggageDirectInfo luggageDirectInfo;

        @com.aliyun.core.annotation.NameInMap("manufacturer")
        private String manufacturer;

        @com.aliyun.core.annotation.NameInMap("meal_desc")
        private String mealDesc;

        @com.aliyun.core.annotation.NameInMap("on_time_rate")
        private String onTimeRate;

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

        @com.aliyun.core.annotation.NameInMap("transfer_time")
        private String transferTime;

        @com.aliyun.core.annotation.NameInMap("transfer_time_number")
        private Integer transferTimeNumber;

        private FlightSegmentInfos(Builder builder) {
            this.airlineInfo = builder.airlineInfo;
            this.arrAirportInfo = builder.arrAirportInfo;
            this.arrCityCode = builder.arrCityCode;
            this.arrCityName = builder.arrCityName;
            this.arrTime = builder.arrTime;
            this.baggageDesc = builder.baggageDesc;
            this.depAirportInfo = builder.depAirportInfo;
            this.depCityCode = builder.depCityCode;
            this.depCityName = builder.depCityName;
            this.depTime = builder.depTime;
            this.duration = builder.duration;
            this.flightNo = builder.flightNo;
            this.flightShareInfo = builder.flightShareInfo;
            this.flightSize = builder.flightSize;
            this.flightStopInfo = builder.flightStopInfo;
            this.flightType = builder.flightType;
            this.luggageDirectInfo = builder.luggageDirectInfo;
            this.manufacturer = builder.manufacturer;
            this.mealDesc = builder.mealDesc;
            this.onTimeRate = builder.onTimeRate;
            this.oneMore = builder.oneMore;
            this.oneMoreShow = builder.oneMoreShow;
            this.segmentIndex = builder.segmentIndex;
            this.segmentKey = builder.segmentKey;
            this.segmentVisaRemark = builder.segmentVisaRemark;
            this.share = builder.share;
            this.shortFlightSize = builder.shortFlightSize;
            this.stop = builder.stop;
            this.totalTime = builder.totalTime;
            this.transferTime = builder.transferTime;
            this.transferTimeNumber = builder.transferTimeNumber;
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
         * @return baggageDesc
         */
        public String getBaggageDesc() {
            return this.baggageDesc;
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
         * @return flightStopInfo
         */
        public FlightStopInfo getFlightStopInfo() {
            return this.flightStopInfo;
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
         * @return onTimeRate
         */
        public String getOnTimeRate() {
            return this.onTimeRate;
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

        /**
         * @return transferTime
         */
        public String getTransferTime() {
            return this.transferTime;
        }

        /**
         * @return transferTimeNumber
         */
        public Integer getTransferTimeNumber() {
            return this.transferTimeNumber;
        }

        public static final class Builder {
            private AirlineInfo airlineInfo; 
            private ArrAirportInfo arrAirportInfo; 
            private String arrCityCode; 
            private String arrCityName; 
            private String arrTime; 
            private String baggageDesc; 
            private DepAirportInfo depAirportInfo; 
            private String depCityCode; 
            private String depCityName; 
            private String depTime; 
            private Integer duration; 
            private String flightNo; 
            private FlightShareInfo flightShareInfo; 
            private String flightSize; 
            private FlightStopInfo flightStopInfo; 
            private String flightType; 
            private LuggageDirectInfo luggageDirectInfo; 
            private String manufacturer; 
            private String mealDesc; 
            private String onTimeRate; 
            private Integer oneMore; 
            private String oneMoreShow; 
            private Integer segmentIndex; 
            private String segmentKey; 
            private SegmentVisaRemark segmentVisaRemark; 
            private Boolean share; 
            private String shortFlightSize; 
            private Boolean stop; 
            private String totalTime; 
            private String transferTime; 
            private Integer transferTimeNumber; 

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
             * baggage_desc.
             */
            public Builder baggageDesc(String baggageDesc) {
                this.baggageDesc = baggageDesc;
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
             * flight_stop_info.
             */
            public Builder flightStopInfo(FlightStopInfo flightStopInfo) {
                this.flightStopInfo = flightStopInfo;
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
             * on_time_rate.
             */
            public Builder onTimeRate(String onTimeRate) {
                this.onTimeRate = onTimeRate;
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

            /**
             * transfer_time.
             */
            public Builder transferTime(String transferTime) {
                this.transferTime = transferTime;
                return this;
            }

            /**
             * transfer_time_number.
             */
            public Builder transferTimeNumber(Integer transferTimeNumber) {
                this.transferTimeNumber = transferTimeNumber;
                return this;
            }

            public FlightSegmentInfos build() {
                return new FlightSegmentInfos(this);
            } 

        } 

    }
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

        @com.aliyun.core.annotation.NameInMap("extensions")
        private java.util.Map < String, String > extensions;

        @com.aliyun.core.annotation.NameInMap("flight_segment_infos")
        private java.util.List < FlightSegmentInfos> flightSegmentInfos;

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
            this.extensions = builder.extensions;
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
         * @return extensions
         */
        public java.util.Map < String, String > getExtensions() {
            return this.extensions;
        }

        /**
         * @return flightSegmentInfos
         */
        public java.util.List < FlightSegmentInfos> getFlightSegmentInfos() {
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
            private java.util.Map < String, String > extensions; 
            private java.util.List < FlightSegmentInfos> flightSegmentInfos; 
            private Integer journeyIndex; 
            private Integer transferTime; 

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
             * extensions.
             */
            public Builder extensions(java.util.Map < String, String > extensions) {
                this.extensions = extensions;
                return this;
            }

            /**
             * flight_segment_infos.
             */
            public Builder flightSegmentInfos(java.util.List < FlightSegmentInfos> flightSegmentInfos) {
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
    public static class FlightRuleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baggage_desc")
        private String baggageDesc;

        @com.aliyun.core.annotation.NameInMap("refund_change_rule_desc")
        private String refundChangeRuleDesc;

        private FlightRuleInfo(Builder builder) {
            this.baggageDesc = builder.baggageDesc;
            this.refundChangeRuleDesc = builder.refundChangeRuleDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRuleInfo create() {
            return builder().build();
        }

        /**
         * @return baggageDesc
         */
        public String getBaggageDesc() {
            return this.baggageDesc;
        }

        /**
         * @return refundChangeRuleDesc
         */
        public String getRefundChangeRuleDesc() {
            return this.refundChangeRuleDesc;
        }

        public static final class Builder {
            private String baggageDesc; 
            private String refundChangeRuleDesc; 

            /**
             * baggage_desc.
             */
            public Builder baggageDesc(String baggageDesc) {
                this.baggageDesc = baggageDesc;
                return this;
            }

            /**
             * refund_change_rule_desc.
             */
            public Builder refundChangeRuleDesc(String refundChangeRuleDesc) {
                this.refundChangeRuleDesc = refundChangeRuleDesc;
                return this;
            }

            public FlightRuleInfo build() {
                return new FlightRuleInfo(this);
            } 

        } 

    }
    public static class SegmentPosition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        private SegmentPosition(Builder builder) {
            this.journeyIndex = builder.journeyIndex;
            this.segmentIndex = builder.segmentIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentPosition create() {
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

            public SegmentPosition build() {
                return new SegmentPosition(this);
            } 

        } 

    }
    public static class FlightRuleInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flight_rule_info")
        private FlightRuleInfo flightRuleInfo;

        @com.aliyun.core.annotation.NameInMap("segment_position")
        private SegmentPosition segmentPosition;

        private FlightRuleInfoList(Builder builder) {
            this.flightRuleInfo = builder.flightRuleInfo;
            this.segmentPosition = builder.segmentPosition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRuleInfoList create() {
            return builder().build();
        }

        /**
         * @return flightRuleInfo
         */
        public FlightRuleInfo getFlightRuleInfo() {
            return this.flightRuleInfo;
        }

        /**
         * @return segmentPosition
         */
        public SegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public static final class Builder {
            private FlightRuleInfo flightRuleInfo; 
            private SegmentPosition segmentPosition; 

            /**
             * flight_rule_info.
             */
            public Builder flightRuleInfo(FlightRuleInfo flightRuleInfo) {
                this.flightRuleInfo = flightRuleInfo;
                return this;
            }

            /**
             * segment_position.
             */
            public Builder segmentPosition(SegmentPosition segmentPosition) {
                this.segmentPosition = segmentPosition;
                return this;
            }

            public FlightRuleInfoList build() {
                return new FlightRuleInfoList(this);
            } 

        } 

    }
    public static class BaggageRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baggage_digest")
        private String baggageDigest;

        @com.aliyun.core.annotation.NameInMap("baggage_info_map")
        private java.util.Map < String, java.util.List<ModuleGroupItemSubItemsBaggageRuleBaggageInfoMapValue>> baggageInfoMap;

        @com.aliyun.core.annotation.NameInMap("structured_baggage")
        private Boolean structuredBaggage;

        private BaggageRule(Builder builder) {
            this.baggageDigest = builder.baggageDigest;
            this.baggageInfoMap = builder.baggageInfoMap;
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
         * @return baggageInfoMap
         */
        public java.util.Map < String, java.util.List<ModuleGroupItemSubItemsBaggageRuleBaggageInfoMapValue>> getBaggageInfoMap() {
            return this.baggageInfoMap;
        }

        /**
         * @return structuredBaggage
         */
        public Boolean getStructuredBaggage() {
            return this.structuredBaggage;
        }

        public static final class Builder {
            private String baggageDigest; 
            private java.util.Map < String, java.util.List<ModuleGroupItemSubItemsBaggageRuleBaggageInfoMapValue>> baggageInfoMap; 
            private Boolean structuredBaggage; 

            /**
             * baggage_digest.
             */
            public Builder baggageDigest(String baggageDigest) {
                this.baggageDigest = baggageDigest;
                return this;
            }

            /**
             * baggage_info_map.
             */
            public Builder baggageInfoMap(java.util.Map < String, java.util.List<ModuleGroupItemSubItemsBaggageRuleBaggageInfoMapValue>> baggageInfoMap) {
                this.baggageInfoMap = baggageInfoMap;
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
    public static class RefundChangeRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cancel_fee_ind")
        private Boolean cancelFeeInd;

        @com.aliyun.core.annotation.NameInMap("change_fee_ind")
        private Boolean changeFeeInd;

        @com.aliyun.core.annotation.NameInMap("offer_penalty_info_map")
        private java.util.Map < String, java.util.List<ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap;

        @com.aliyun.core.annotation.NameInMap("refund_change_digest")
        private String refundChangeDigest;

        @com.aliyun.core.annotation.NameInMap("structured_refund")
        private Boolean structuredRefund;

        private RefundChangeRule(Builder builder) {
            this.cancelFeeInd = builder.cancelFeeInd;
            this.changeFeeInd = builder.changeFeeInd;
            this.offerPenaltyInfoMap = builder.offerPenaltyInfoMap;
            this.refundChangeDigest = builder.refundChangeDigest;
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
         * @return offerPenaltyInfoMap
         */
        public java.util.Map < String, java.util.List<ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue>> getOfferPenaltyInfoMap() {
            return this.offerPenaltyInfoMap;
        }

        /**
         * @return refundChangeDigest
         */
        public String getRefundChangeDigest() {
            return this.refundChangeDigest;
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
            private java.util.Map < String, java.util.List<ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap; 
            private String refundChangeDigest; 
            private Boolean structuredRefund; 

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
             * offer_penalty_info_map.
             */
            public Builder offerPenaltyInfoMap(java.util.Map < String, java.util.List<ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap) {
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
    public static class SubItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baggage_rule")
        private BaggageRule baggageRule;

        @com.aliyun.core.annotation.NameInMap("refund_change_rule")
        private RefundChangeRule refundChangeRule;

        @com.aliyun.core.annotation.NameInMap("segment_keys")
        private java.util.List < String > segmentKeys;

        @com.aliyun.core.annotation.NameInMap("shopping_item_map")
        private java.util.Map < String, ModuleGroupItemSubItemsShoppingItemMapValue > shoppingItemMap;

        @com.aliyun.core.annotation.NameInMap("uniq_key")
        private String uniqKey;

        private SubItems(Builder builder) {
            this.baggageRule = builder.baggageRule;
            this.refundChangeRule = builder.refundChangeRule;
            this.segmentKeys = builder.segmentKeys;
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
        public java.util.List < String > getSegmentKeys() {
            return this.segmentKeys;
        }

        /**
         * @return shoppingItemMap
         */
        public java.util.Map < String, ModuleGroupItemSubItemsShoppingItemMapValue > getShoppingItemMap() {
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
            private java.util.List < String > segmentKeys; 
            private java.util.Map < String, ModuleGroupItemSubItemsShoppingItemMapValue > shoppingItemMap; 
            private String uniqKey; 

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
            public Builder segmentKeys(java.util.List < String > segmentKeys) {
                this.segmentKeys = segmentKeys;
                return this;
            }

            /**
             * shopping_item_map.
             */
            public Builder shoppingItemMap(java.util.Map < String, ModuleGroupItemSubItemsShoppingItemMapValue > shoppingItemMap) {
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
    public static class GroupItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agreement_price_codes")
        private java.util.List < String > agreementPriceCodes;

        @com.aliyun.core.annotation.NameInMap("flight_rule_info_list")
        private java.util.List < FlightRuleInfoList> flightRuleInfoList;

        @com.aliyun.core.annotation.NameInMap("item_id")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("item_type")
        private String itemType;

        @com.aliyun.core.annotation.NameInMap("shopping_item_map")
        private java.util.Map < String, ModuleGroupItemShoppingItemMapValue > shoppingItemMap;

        @com.aliyun.core.annotation.NameInMap("sub_item_position_map")
        private java.util.Map < String, java.util.List<ModuleGroupItemSubItemPositionMapValue>> subItemPositionMap;

        @com.aliyun.core.annotation.NameInMap("sub_items")
        private java.util.List < SubItems> subItems;

        private GroupItem(Builder builder) {
            this.agreementPriceCodes = builder.agreementPriceCodes;
            this.flightRuleInfoList = builder.flightRuleInfoList;
            this.itemId = builder.itemId;
            this.itemType = builder.itemType;
            this.shoppingItemMap = builder.shoppingItemMap;
            this.subItemPositionMap = builder.subItemPositionMap;
            this.subItems = builder.subItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupItem create() {
            return builder().build();
        }

        /**
         * @return agreementPriceCodes
         */
        public java.util.List < String > getAgreementPriceCodes() {
            return this.agreementPriceCodes;
        }

        /**
         * @return flightRuleInfoList
         */
        public java.util.List < FlightRuleInfoList> getFlightRuleInfoList() {
            return this.flightRuleInfoList;
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
        public java.util.Map < String, ModuleGroupItemShoppingItemMapValue > getShoppingItemMap() {
            return this.shoppingItemMap;
        }

        /**
         * @return subItemPositionMap
         */
        public java.util.Map < String, java.util.List<ModuleGroupItemSubItemPositionMapValue>> getSubItemPositionMap() {
            return this.subItemPositionMap;
        }

        /**
         * @return subItems
         */
        public java.util.List < SubItems> getSubItems() {
            return this.subItems;
        }

        public static final class Builder {
            private java.util.List < String > agreementPriceCodes; 
            private java.util.List < FlightRuleInfoList> flightRuleInfoList; 
            private String itemId; 
            private String itemType; 
            private java.util.Map < String, ModuleGroupItemShoppingItemMapValue > shoppingItemMap; 
            private java.util.Map < String, java.util.List<ModuleGroupItemSubItemPositionMapValue>> subItemPositionMap; 
            private java.util.List < SubItems> subItems; 

            /**
             * agreement_price_codes.
             */
            public Builder agreementPriceCodes(java.util.List < String > agreementPriceCodes) {
                this.agreementPriceCodes = agreementPriceCodes;
                return this;
            }

            /**
             * flight_rule_info_list.
             */
            public Builder flightRuleInfoList(java.util.List < FlightRuleInfoList> flightRuleInfoList) {
                this.flightRuleInfoList = flightRuleInfoList;
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
            public Builder shoppingItemMap(java.util.Map < String, ModuleGroupItemShoppingItemMapValue > shoppingItemMap) {
                this.shoppingItemMap = shoppingItemMap;
                return this;
            }

            /**
             * sub_item_position_map.
             */
            public Builder subItemPositionMap(java.util.Map < String, java.util.List<ModuleGroupItemSubItemPositionMapValue>> subItemPositionMap) {
                this.subItemPositionMap = subItemPositionMap;
                return this;
            }

            /**
             * sub_items.
             */
            public Builder subItems(java.util.List < SubItems> subItems) {
                this.subItems = subItems;
                return this;
            }

            public GroupItem build() {
                return new GroupItem(this);
            } 

        } 

    }
    public static class ShutterDocs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contents")
        private java.util.List < String > contents;

        @com.aliyun.core.annotation.NameInMap("main_title")
        private String mainTitle;

        private ShutterDocs(Builder builder) {
            this.contents = builder.contents;
            this.mainTitle = builder.mainTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShutterDocs create() {
            return builder().build();
        }

        /**
         * @return contents
         */
        public java.util.List < String > getContents() {
            return this.contents;
        }

        /**
         * @return mainTitle
         */
        public String getMainTitle() {
            return this.mainTitle;
        }

        public static final class Builder {
            private java.util.List < String > contents; 
            private String mainTitle; 

            /**
             * contents.
             */
            public Builder contents(java.util.List < String > contents) {
                this.contents = contents;
                return this;
            }

            /**
             * main_title.
             */
            public Builder mainTitle(String mainTitle) {
                this.mainTitle = mainTitle;
                return this;
            }

            public ShutterDocs build() {
                return new ShutterDocs(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flight_journey_infos")
        private java.util.List < FlightJourneyInfos> flightJourneyInfos;

        @com.aliyun.core.annotation.NameInMap("group_item")
        private GroupItem groupItem;

        @com.aliyun.core.annotation.NameInMap("shutter_docs")
        private java.util.List < ShutterDocs> shutterDocs;

        @com.aliyun.core.annotation.NameInMap("trip_type")
        private Integer tripType;

        private Module(Builder builder) {
            this.flightJourneyInfos = builder.flightJourneyInfos;
            this.groupItem = builder.groupItem;
            this.shutterDocs = builder.shutterDocs;
            this.tripType = builder.tripType;
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
        public java.util.List < FlightJourneyInfos> getFlightJourneyInfos() {
            return this.flightJourneyInfos;
        }

        /**
         * @return groupItem
         */
        public GroupItem getGroupItem() {
            return this.groupItem;
        }

        /**
         * @return shutterDocs
         */
        public java.util.List < ShutterDocs> getShutterDocs() {
            return this.shutterDocs;
        }

        /**
         * @return tripType
         */
        public Integer getTripType() {
            return this.tripType;
        }

        public static final class Builder {
            private java.util.List < FlightJourneyInfos> flightJourneyInfos; 
            private GroupItem groupItem; 
            private java.util.List < ShutterDocs> shutterDocs; 
            private Integer tripType; 

            /**
             * flight_journey_infos.
             */
            public Builder flightJourneyInfos(java.util.List < FlightJourneyInfos> flightJourneyInfos) {
                this.flightJourneyInfos = flightJourneyInfos;
                return this;
            }

            /**
             * group_item.
             */
            public Builder groupItem(GroupItem groupItem) {
                this.groupItem = groupItem;
                return this;
            }

            /**
             * shutter_docs.
             */
            public Builder shutterDocs(java.util.List < ShutterDocs> shutterDocs) {
                this.shutterDocs = shutterDocs;
                return this;
            }

            /**
             * trip_type.
             */
            public Builder tripType(Integer tripType) {
                this.tripType = tripType;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
