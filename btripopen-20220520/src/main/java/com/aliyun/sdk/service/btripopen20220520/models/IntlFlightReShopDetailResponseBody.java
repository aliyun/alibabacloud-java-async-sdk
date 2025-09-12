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
 * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
 *
 * <p>IntlFlightReShopDetailResponseBody</p>
 */
public class IntlFlightReShopDetailResponseBody extends TeaModel {
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

    private IntlFlightReShopDetailResponseBody(Builder builder) {
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

    public static IntlFlightReShopDetailResponseBody create() {
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

        private Builder(IntlFlightReShopDetailResponseBody model) {
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

        public IntlFlightReShopDetailResponseBody build() {
            return new IntlFlightReShopDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class BaggageRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baggage_rule_desc")
        private String baggageRuleDesc;

        private BaggageRule(Builder builder) {
            this.baggageRuleDesc = builder.baggageRuleDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaggageRule create() {
            return builder().build();
        }

        /**
         * @return baggageRuleDesc
         */
        public String getBaggageRuleDesc() {
            return this.baggageRuleDesc;
        }

        public static final class Builder {
            private String baggageRuleDesc; 

            private Builder() {
            } 

            private Builder(BaggageRule model) {
                this.baggageRuleDesc = model.baggageRuleDesc;
            } 

            /**
             * baggage_rule_desc.
             */
            public Builder baggageRuleDesc(String baggageRuleDesc) {
                this.baggageRuleDesc = baggageRuleDesc;
                return this;
            }

            public BaggageRule build() {
                return new BaggageRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
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
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
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
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
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
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
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
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
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
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
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
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
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
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
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
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

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
            this.journeyIndex = builder.journeyIndex;
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
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
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
            private Integer journeyIndex; 
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
                this.journeyIndex = model.journeyIndex;
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
             * journey_index.
             */
            public Builder journeyIndex(Integer journeyIndex) {
                this.journeyIndex = journeyIndex;
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
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class JourneyList extends TeaModel {
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

        private JourneyList(Builder builder) {
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

        public static JourneyList create() {
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

            private Builder(JourneyList model) {
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

            public JourneyList build() {
                return new JourneyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class FlightSegmentInfosAirlineInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_name")
        private String airlineName;

        @com.aliyun.core.annotation.NameInMap("short_name")
        private String shortName;

        private FlightSegmentInfosAirlineInfo(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.shortName = builder.shortName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightSegmentInfosAirlineInfo create() {
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

            private Builder(FlightSegmentInfosAirlineInfo model) {
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

            public FlightSegmentInfosAirlineInfo build() {
                return new FlightSegmentInfosAirlineInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class FlightSegmentInfosArrAirportInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airport_code")
        private String airportCode;

        @com.aliyun.core.annotation.NameInMap("airport_name")
        private String airportName;

        @com.aliyun.core.annotation.NameInMap("airport_short_name")
        private String airportShortName;

        @com.aliyun.core.annotation.NameInMap("terminal")
        private String terminal;

        private FlightSegmentInfosArrAirportInfo(Builder builder) {
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.airportShortName = builder.airportShortName;
            this.terminal = builder.terminal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightSegmentInfosArrAirportInfo create() {
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

            private Builder(FlightSegmentInfosArrAirportInfo model) {
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

            public FlightSegmentInfosArrAirportInfo build() {
                return new FlightSegmentInfosArrAirportInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class FlightSegmentInfosDepAirportInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airport_code")
        private String airportCode;

        @com.aliyun.core.annotation.NameInMap("airport_name")
        private String airportName;

        @com.aliyun.core.annotation.NameInMap("airport_short_name")
        private String airportShortName;

        @com.aliyun.core.annotation.NameInMap("terminal")
        private String terminal;

        private FlightSegmentInfosDepAirportInfo(Builder builder) {
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.airportShortName = builder.airportShortName;
            this.terminal = builder.terminal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightSegmentInfosDepAirportInfo create() {
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

            private Builder(FlightSegmentInfosDepAirportInfo model) {
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

            public FlightSegmentInfosDepAirportInfo build() {
                return new FlightSegmentInfosDepAirportInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class FlightShareInfoOperatingAirlineInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_name")
        private String airlineName;

        @com.aliyun.core.annotation.NameInMap("short_name")
        private String shortName;

        private FlightShareInfoOperatingAirlineInfo(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.shortName = builder.shortName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightShareInfoOperatingAirlineInfo create() {
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

            private Builder(FlightShareInfoOperatingAirlineInfo model) {
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

            public FlightShareInfoOperatingAirlineInfo build() {
                return new FlightShareInfoOperatingAirlineInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class FlightSegmentInfosFlightShareInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("operating_airline_info")
        private FlightShareInfoOperatingAirlineInfo operatingAirlineInfo;

        @com.aliyun.core.annotation.NameInMap("operating_flight_no")
        private String operatingFlightNo;

        private FlightSegmentInfosFlightShareInfo(Builder builder) {
            this.operatingAirlineInfo = builder.operatingAirlineInfo;
            this.operatingFlightNo = builder.operatingFlightNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightSegmentInfosFlightShareInfo create() {
            return builder().build();
        }

        /**
         * @return operatingAirlineInfo
         */
        public FlightShareInfoOperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

        /**
         * @return operatingFlightNo
         */
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public static final class Builder {
            private FlightShareInfoOperatingAirlineInfo operatingAirlineInfo; 
            private String operatingFlightNo; 

            private Builder() {
            } 

            private Builder(FlightSegmentInfosFlightShareInfo model) {
                this.operatingAirlineInfo = model.operatingAirlineInfo;
                this.operatingFlightNo = model.operatingFlightNo;
            } 

            /**
             * operating_airline_info.
             */
            public Builder operatingAirlineInfo(FlightShareInfoOperatingAirlineInfo operatingAirlineInfo) {
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

            public FlightSegmentInfosFlightShareInfo build() {
                return new FlightSegmentInfosFlightShareInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class FlightSegmentInfosFlightStopInfoList extends TeaModel {
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

        private FlightSegmentInfosFlightStopInfoList(Builder builder) {
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

        public static FlightSegmentInfosFlightStopInfoList create() {
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

            private Builder(FlightSegmentInfosFlightStopInfoList model) {
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

            public FlightSegmentInfosFlightStopInfoList build() {
                return new FlightSegmentInfosFlightStopInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class FlightSegmentInfosLuggageDirectInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dep_city_luggage_direct")
        private Integer depCityLuggageDirect;

        @com.aliyun.core.annotation.NameInMap("stop_city_luggage_direct")
        private Integer stopCityLuggageDirect;

        private FlightSegmentInfosLuggageDirectInfo(Builder builder) {
            this.depCityLuggageDirect = builder.depCityLuggageDirect;
            this.stopCityLuggageDirect = builder.stopCityLuggageDirect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightSegmentInfosLuggageDirectInfo create() {
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

            private Builder(FlightSegmentInfosLuggageDirectInfo model) {
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

            public FlightSegmentInfosLuggageDirectInfo build() {
                return new FlightSegmentInfosLuggageDirectInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class FlightSegmentInfosSegmentVisaRemark extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dep_city_visa_remark")
        private String depCityVisaRemark;

        @com.aliyun.core.annotation.NameInMap("dep_city_visa_type")
        private Integer depCityVisaType;

        @com.aliyun.core.annotation.NameInMap("stop_city_visa_remarks")
        private java.util.List<String> stopCityVisaRemarks;

        @com.aliyun.core.annotation.NameInMap("stop_city_visa_types")
        private java.util.List<Integer> stopCityVisaTypes;

        private FlightSegmentInfosSegmentVisaRemark(Builder builder) {
            this.depCityVisaRemark = builder.depCityVisaRemark;
            this.depCityVisaType = builder.depCityVisaType;
            this.stopCityVisaRemarks = builder.stopCityVisaRemarks;
            this.stopCityVisaTypes = builder.stopCityVisaTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightSegmentInfosSegmentVisaRemark create() {
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

            private Builder(FlightSegmentInfosSegmentVisaRemark model) {
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

            public FlightSegmentInfosSegmentVisaRemark build() {
                return new FlightSegmentInfosSegmentVisaRemark(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class OriginJourneyListFlightSegmentInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_info")
        private FlightSegmentInfosAirlineInfo airlineInfo;

        @com.aliyun.core.annotation.NameInMap("arr_airport_info")
        private FlightSegmentInfosArrAirportInfo arrAirportInfo;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_city_name")
        private String arrCityName;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("dep_airport_info")
        private FlightSegmentInfosDepAirportInfo depAirportInfo;

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
        private FlightSegmentInfosFlightShareInfo flightShareInfo;

        @com.aliyun.core.annotation.NameInMap("flight_size")
        private String flightSize;

        @com.aliyun.core.annotation.NameInMap("flight_stop_info_list")
        private java.util.List<FlightSegmentInfosFlightStopInfoList> flightStopInfoList;

        @com.aliyun.core.annotation.NameInMap("flight_type")
        private String flightType;

        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("luggage_direct_info")
        private FlightSegmentInfosLuggageDirectInfo luggageDirectInfo;

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
        private FlightSegmentInfosSegmentVisaRemark segmentVisaRemark;

        @com.aliyun.core.annotation.NameInMap("share")
        private Boolean share;

        @com.aliyun.core.annotation.NameInMap("short_flight_size")
        private String shortFlightSize;

        @com.aliyun.core.annotation.NameInMap("stop")
        private Boolean stop;

        @com.aliyun.core.annotation.NameInMap("total_time")
        private String totalTime;

        private OriginJourneyListFlightSegmentInfos(Builder builder) {
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
            this.journeyIndex = builder.journeyIndex;
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

        public static OriginJourneyListFlightSegmentInfos create() {
            return builder().build();
        }

        /**
         * @return airlineInfo
         */
        public FlightSegmentInfosAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        /**
         * @return arrAirportInfo
         */
        public FlightSegmentInfosArrAirportInfo getArrAirportInfo() {
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
        public FlightSegmentInfosDepAirportInfo getDepAirportInfo() {
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
        public FlightSegmentInfosFlightShareInfo getFlightShareInfo() {
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
        public java.util.List<FlightSegmentInfosFlightStopInfoList> getFlightStopInfoList() {
            return this.flightStopInfoList;
        }

        /**
         * @return flightType
         */
        public String getFlightType() {
            return this.flightType;
        }

        /**
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        /**
         * @return luggageDirectInfo
         */
        public FlightSegmentInfosLuggageDirectInfo getLuggageDirectInfo() {
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
        public FlightSegmentInfosSegmentVisaRemark getSegmentVisaRemark() {
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
            private FlightSegmentInfosAirlineInfo airlineInfo; 
            private FlightSegmentInfosArrAirportInfo arrAirportInfo; 
            private String arrCityCode; 
            private String arrCityName; 
            private String arrTime; 
            private FlightSegmentInfosDepAirportInfo depAirportInfo; 
            private String depCityCode; 
            private String depCityName; 
            private String depTime; 
            private Integer duration; 
            private String flightNo; 
            private FlightSegmentInfosFlightShareInfo flightShareInfo; 
            private String flightSize; 
            private java.util.List<FlightSegmentInfosFlightStopInfoList> flightStopInfoList; 
            private String flightType; 
            private Integer journeyIndex; 
            private FlightSegmentInfosLuggageDirectInfo luggageDirectInfo; 
            private String manufacturer; 
            private String mealDesc; 
            private Integer oneMore; 
            private String oneMoreShow; 
            private Integer segmentIndex; 
            private String segmentKey; 
            private FlightSegmentInfosSegmentVisaRemark segmentVisaRemark; 
            private Boolean share; 
            private String shortFlightSize; 
            private Boolean stop; 
            private String totalTime; 

            private Builder() {
            } 

            private Builder(OriginJourneyListFlightSegmentInfos model) {
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
                this.journeyIndex = model.journeyIndex;
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
            public Builder airlineInfo(FlightSegmentInfosAirlineInfo airlineInfo) {
                this.airlineInfo = airlineInfo;
                return this;
            }

            /**
             * arr_airport_info.
             */
            public Builder arrAirportInfo(FlightSegmentInfosArrAirportInfo arrAirportInfo) {
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
            public Builder depAirportInfo(FlightSegmentInfosDepAirportInfo depAirportInfo) {
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
            public Builder flightShareInfo(FlightSegmentInfosFlightShareInfo flightShareInfo) {
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
            public Builder flightStopInfoList(java.util.List<FlightSegmentInfosFlightStopInfoList> flightStopInfoList) {
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
             * journey_index.
             */
            public Builder journeyIndex(Integer journeyIndex) {
                this.journeyIndex = journeyIndex;
                return this;
            }

            /**
             * luggage_direct_info.
             */
            public Builder luggageDirectInfo(FlightSegmentInfosLuggageDirectInfo luggageDirectInfo) {
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
            public Builder segmentVisaRemark(FlightSegmentInfosSegmentVisaRemark segmentVisaRemark) {
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

            public OriginJourneyListFlightSegmentInfos build() {
                return new OriginJourneyListFlightSegmentInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class OriginJourneyList extends TeaModel {
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
        private java.util.List<OriginJourneyListFlightSegmentInfos> flightSegmentInfos;

        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("transfer_time")
        private Integer transferTime;

        private OriginJourneyList(Builder builder) {
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

        public static OriginJourneyList create() {
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
        public java.util.List<OriginJourneyListFlightSegmentInfos> getFlightSegmentInfos() {
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
            private java.util.List<OriginJourneyListFlightSegmentInfos> flightSegmentInfos; 
            private Integer journeyIndex; 
            private Integer transferTime; 

            private Builder() {
            } 

            private Builder(OriginJourneyList model) {
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
            public Builder flightSegmentInfos(java.util.List<OriginJourneyListFlightSegmentInfos> flightSegmentInfos) {
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

            public OriginJourneyList build() {
                return new OriginJourneyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class PassengerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("full_name")
        private String fullName;

        @com.aliyun.core.annotation.NameInMap("gender")
        private Integer gender;

        @com.aliyun.core.annotation.NameInMap("job_no")
        private String jobNo;

        @com.aliyun.core.annotation.NameInMap("nationality")
        private String nationality;

        @com.aliyun.core.annotation.NameInMap("nationality_code")
        private String nationalityCode;

        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private Long passengerId;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_type")
        private Integer userType;

        private PassengerList(Builder builder) {
            this.fullName = builder.fullName;
            this.gender = builder.gender;
            this.jobNo = builder.jobNo;
            this.nationality = builder.nationality;
            this.nationalityCode = builder.nationalityCode;
            this.passengerId = builder.passengerId;
            this.type = builder.type;
            this.userId = builder.userId;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerList create() {
            return builder().build();
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
        }

        /**
         * @return gender
         */
        public Integer getGender() {
            return this.gender;
        }

        /**
         * @return jobNo
         */
        public String getJobNo() {
            return this.jobNo;
        }

        /**
         * @return nationality
         */
        public String getNationality() {
            return this.nationality;
        }

        /**
         * @return nationalityCode
         */
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        /**
         * @return passengerId
         */
        public Long getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userType
         */
        public Integer getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String fullName; 
            private Integer gender; 
            private String jobNo; 
            private String nationality; 
            private String nationalityCode; 
            private Long passengerId; 
            private Integer type; 
            private String userId; 
            private Integer userType; 

            private Builder() {
            } 

            private Builder(PassengerList model) {
                this.fullName = model.fullName;
                this.gender = model.gender;
                this.jobNo = model.jobNo;
                this.nationality = model.nationality;
                this.nationalityCode = model.nationalityCode;
                this.passengerId = model.passengerId;
                this.type = model.type;
                this.userId = model.userId;
                this.userType = model.userType;
            } 

            /**
             * full_name.
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * gender.
             */
            public Builder gender(Integer gender) {
                this.gender = gender;
                return this;
            }

            /**
             * job_no.
             */
            public Builder jobNo(String jobNo) {
                this.jobNo = jobNo;
                return this;
            }

            /**
             * nationality.
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * nationality_code.
             */
            public Builder nationalityCode(String nationalityCode) {
                this.nationalityCode = nationalityCode;
                return this;
            }

            /**
             * passenger_id.
             */
            public Builder passengerId(Long passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * user_type.
             */
            public Builder userType(Integer userType) {
                this.userType = userType;
                return this;
            }

            public PassengerList build() {
                return new PassengerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class PriceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("handling_amount")
        private Long handlingAmount;

        @com.aliyun.core.annotation.NameInMap("tax_diff_amount")
        private Long taxDiffAmount;

        @com.aliyun.core.annotation.NameInMap("total_amount")
        private Long totalAmount;

        @com.aliyun.core.annotation.NameInMap("upgrade_amount")
        private Long upgradeAmount;

        private PriceInfo(Builder builder) {
            this.handlingAmount = builder.handlingAmount;
            this.taxDiffAmount = builder.taxDiffAmount;
            this.totalAmount = builder.totalAmount;
            this.upgradeAmount = builder.upgradeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfo create() {
            return builder().build();
        }

        /**
         * @return handlingAmount
         */
        public Long getHandlingAmount() {
            return this.handlingAmount;
        }

        /**
         * @return taxDiffAmount
         */
        public Long getTaxDiffAmount() {
            return this.taxDiffAmount;
        }

        /**
         * @return totalAmount
         */
        public Long getTotalAmount() {
            return this.totalAmount;
        }

        /**
         * @return upgradeAmount
         */
        public Long getUpgradeAmount() {
            return this.upgradeAmount;
        }

        public static final class Builder {
            private Long handlingAmount; 
            private Long taxDiffAmount; 
            private Long totalAmount; 
            private Long upgradeAmount; 

            private Builder() {
            } 

            private Builder(PriceInfo model) {
                this.handlingAmount = model.handlingAmount;
                this.taxDiffAmount = model.taxDiffAmount;
                this.totalAmount = model.totalAmount;
                this.upgradeAmount = model.upgradeAmount;
            } 

            /**
             * handling_amount.
             */
            public Builder handlingAmount(Long handlingAmount) {
                this.handlingAmount = handlingAmount;
                return this;
            }

            /**
             * tax_diff_amount.
             */
            public Builder taxDiffAmount(Long taxDiffAmount) {
                this.taxDiffAmount = taxDiffAmount;
                return this;
            }

            /**
             * total_amount.
             */
            public Builder totalAmount(Long totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * upgrade_amount.
             */
            public Builder upgradeAmount(Long upgradeAmount) {
                this.upgradeAmount = upgradeAmount;
                return this;
            }

            public PriceInfo build() {
                return new PriceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class PassengerPriceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private Long passengerId;

        @com.aliyun.core.annotation.NameInMap("price_info")
        private PriceInfo priceInfo;

        private PassengerPriceInfoList(Builder builder) {
            this.passengerId = builder.passengerId;
            this.priceInfo = builder.priceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerPriceInfoList create() {
            return builder().build();
        }

        /**
         * @return passengerId
         */
        public Long getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return priceInfo
         */
        public PriceInfo getPriceInfo() {
            return this.priceInfo;
        }

        public static final class Builder {
            private Long passengerId; 
            private PriceInfo priceInfo; 

            private Builder() {
            } 

            private Builder(PassengerPriceInfoList model) {
                this.passengerId = model.passengerId;
                this.priceInfo = model.priceInfo;
            } 

            /**
             * passenger_id.
             */
            public Builder passengerId(Long passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * price_info.
             */
            public Builder priceInfo(PriceInfo priceInfo) {
                this.priceInfo = priceInfo;
                return this;
            }

            public PassengerPriceInfoList build() {
                return new PassengerPriceInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class TicketSegmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("modified")
        private Boolean modified;

        @com.aliyun.core.annotation.NameInMap("open_ticket_status")
        private String openTicketStatus;

        @com.aliyun.core.annotation.NameInMap("refunded")
        private Boolean refunded;

        @com.aliyun.core.annotation.NameInMap("segment_key")
        private String segmentKey;

        private TicketSegmentList(Builder builder) {
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.modified = builder.modified;
            this.openTicketStatus = builder.openTicketStatus;
            this.refunded = builder.refunded;
            this.segmentKey = builder.segmentKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TicketSegmentList create() {
            return builder().build();
        }

        /**
         * @return cabin
         */
        public String getCabin() {
            return this.cabin;
        }

        /**
         * @return cabinClass
         */
        public String getCabinClass() {
            return this.cabinClass;
        }

        /**
         * @return modified
         */
        public Boolean getModified() {
            return this.modified;
        }

        /**
         * @return openTicketStatus
         */
        public String getOpenTicketStatus() {
            return this.openTicketStatus;
        }

        /**
         * @return refunded
         */
        public Boolean getRefunded() {
            return this.refunded;
        }

        /**
         * @return segmentKey
         */
        public String getSegmentKey() {
            return this.segmentKey;
        }

        public static final class Builder {
            private String cabin; 
            private String cabinClass; 
            private Boolean modified; 
            private String openTicketStatus; 
            private Boolean refunded; 
            private String segmentKey; 

            private Builder() {
            } 

            private Builder(TicketSegmentList model) {
                this.cabin = model.cabin;
                this.cabinClass = model.cabinClass;
                this.modified = model.modified;
                this.openTicketStatus = model.openTicketStatus;
                this.refunded = model.refunded;
                this.segmentKey = model.segmentKey;
            } 

            /**
             * cabin.
             */
            public Builder cabin(String cabin) {
                this.cabin = cabin;
                return this;
            }

            /**
             * cabin_class.
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * modified.
             */
            public Builder modified(Boolean modified) {
                this.modified = modified;
                return this;
            }

            /**
             * open_ticket_status.
             */
            public Builder openTicketStatus(String openTicketStatus) {
                this.openTicketStatus = openTicketStatus;
                return this;
            }

            /**
             * refunded.
             */
            public Builder refunded(Boolean refunded) {
                this.refunded = refunded;
                return this;
            }

            /**
             * segment_key.
             */
            public Builder segmentKey(String segmentKey) {
                this.segmentKey = segmentKey;
                return this;
            }

            public TicketSegmentList build() {
                return new TicketSegmentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class TicketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("issue_time")
        private String issueTime;

        @com.aliyun.core.annotation.NameInMap("pnr_no")
        private String pnrNo;

        @com.aliyun.core.annotation.NameInMap("segment_key_list")
        private java.util.List<String> segmentKeyList;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        @com.aliyun.core.annotation.NameInMap("ticket_segment_list")
        private java.util.List<TicketSegmentList> ticketSegmentList;

        private TicketList(Builder builder) {
            this.issueTime = builder.issueTime;
            this.pnrNo = builder.pnrNo;
            this.segmentKeyList = builder.segmentKeyList;
            this.ticketNo = builder.ticketNo;
            this.ticketSegmentList = builder.ticketSegmentList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TicketList create() {
            return builder().build();
        }

        /**
         * @return issueTime
         */
        public String getIssueTime() {
            return this.issueTime;
        }

        /**
         * @return pnrNo
         */
        public String getPnrNo() {
            return this.pnrNo;
        }

        /**
         * @return segmentKeyList
         */
        public java.util.List<String> getSegmentKeyList() {
            return this.segmentKeyList;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        /**
         * @return ticketSegmentList
         */
        public java.util.List<TicketSegmentList> getTicketSegmentList() {
            return this.ticketSegmentList;
        }

        public static final class Builder {
            private String issueTime; 
            private String pnrNo; 
            private java.util.List<String> segmentKeyList; 
            private String ticketNo; 
            private java.util.List<TicketSegmentList> ticketSegmentList; 

            private Builder() {
            } 

            private Builder(TicketList model) {
                this.issueTime = model.issueTime;
                this.pnrNo = model.pnrNo;
                this.segmentKeyList = model.segmentKeyList;
                this.ticketNo = model.ticketNo;
                this.ticketSegmentList = model.ticketSegmentList;
            } 

            /**
             * issue_time.
             */
            public Builder issueTime(String issueTime) {
                this.issueTime = issueTime;
                return this;
            }

            /**
             * pnr_no.
             */
            public Builder pnrNo(String pnrNo) {
                this.pnrNo = pnrNo;
                return this;
            }

            /**
             * segment_key_list.
             */
            public Builder segmentKeyList(java.util.List<String> segmentKeyList) {
                this.segmentKeyList = segmentKeyList;
                return this;
            }

            /**
             * ticket_no.
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            /**
             * ticket_segment_list.
             */
            public Builder ticketSegmentList(java.util.List<TicketSegmentList> ticketSegmentList) {
                this.ticketSegmentList = ticketSegmentList;
                return this;
            }

            public TicketList build() {
                return new TicketList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class PassengerTicketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private Long passengerId;

        @com.aliyun.core.annotation.NameInMap("ticket_list")
        private java.util.List<TicketList> ticketList;

        private PassengerTicketList(Builder builder) {
            this.passengerId = builder.passengerId;
            this.ticketList = builder.ticketList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerTicketList create() {
            return builder().build();
        }

        /**
         * @return passengerId
         */
        public Long getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return ticketList
         */
        public java.util.List<TicketList> getTicketList() {
            return this.ticketList;
        }

        public static final class Builder {
            private Long passengerId; 
            private java.util.List<TicketList> ticketList; 

            private Builder() {
            } 

            private Builder(PassengerTicketList model) {
                this.passengerId = model.passengerId;
                this.ticketList = model.ticketList;
            } 

            /**
             * passenger_id.
             */
            public Builder passengerId(Long passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * ticket_list.
             */
            public Builder ticketList(java.util.List<TicketList> ticketList) {
                this.ticketList = ticketList;
                return this;
            }

            public PassengerTicketList build() {
                return new PassengerTicketList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class ModulePriceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("handling_amount")
        private Long handlingAmount;

        @com.aliyun.core.annotation.NameInMap("tax_diff_amount")
        private Long taxDiffAmount;

        @com.aliyun.core.annotation.NameInMap("total_amount")
        private Long totalAmount;

        @com.aliyun.core.annotation.NameInMap("upgrade_amount")
        private Long upgradeAmount;

        private ModulePriceInfo(Builder builder) {
            this.handlingAmount = builder.handlingAmount;
            this.taxDiffAmount = builder.taxDiffAmount;
            this.totalAmount = builder.totalAmount;
            this.upgradeAmount = builder.upgradeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModulePriceInfo create() {
            return builder().build();
        }

        /**
         * @return handlingAmount
         */
        public Long getHandlingAmount() {
            return this.handlingAmount;
        }

        /**
         * @return taxDiffAmount
         */
        public Long getTaxDiffAmount() {
            return this.taxDiffAmount;
        }

        /**
         * @return totalAmount
         */
        public Long getTotalAmount() {
            return this.totalAmount;
        }

        /**
         * @return upgradeAmount
         */
        public Long getUpgradeAmount() {
            return this.upgradeAmount;
        }

        public static final class Builder {
            private Long handlingAmount; 
            private Long taxDiffAmount; 
            private Long totalAmount; 
            private Long upgradeAmount; 

            private Builder() {
            } 

            private Builder(ModulePriceInfo model) {
                this.handlingAmount = model.handlingAmount;
                this.taxDiffAmount = model.taxDiffAmount;
                this.totalAmount = model.totalAmount;
                this.upgradeAmount = model.upgradeAmount;
            } 

            /**
             * handling_amount.
             */
            public Builder handlingAmount(Long handlingAmount) {
                this.handlingAmount = handlingAmount;
                return this;
            }

            /**
             * tax_diff_amount.
             */
            public Builder taxDiffAmount(Long taxDiffAmount) {
                this.taxDiffAmount = taxDiffAmount;
                return this;
            }

            /**
             * total_amount.
             */
            public Builder totalAmount(Long totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * upgrade_amount.
             */
            public Builder upgradeAmount(Long upgradeAmount) {
                this.upgradeAmount = upgradeAmount;
                return this;
            }

            public ModulePriceInfo build() {
                return new ModulePriceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class RefundChangeRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("refund_change_rule_desc")
        private String refundChangeRuleDesc;

        private RefundChangeRule(Builder builder) {
            this.refundChangeRuleDesc = builder.refundChangeRuleDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundChangeRule create() {
            return builder().build();
        }

        /**
         * @return refundChangeRuleDesc
         */
        public String getRefundChangeRuleDesc() {
            return this.refundChangeRuleDesc;
        }

        public static final class Builder {
            private String refundChangeRuleDesc; 

            private Builder() {
            } 

            private Builder(RefundChangeRule model) {
                this.refundChangeRuleDesc = model.refundChangeRuleDesc;
            } 

            /**
             * refund_change_rule_desc.
             */
            public Builder refundChangeRuleDesc(String refundChangeRuleDesc) {
                this.refundChangeRuleDesc = refundChangeRuleDesc;
                return this;
            }

            public RefundChangeRule build() {
                return new RefundChangeRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopDetailResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baggage_rule")
        private BaggageRule baggageRule;

        @com.aliyun.core.annotation.NameInMap("close_reason")
        private String closeReason;

        @com.aliyun.core.annotation.NameInMap("close_time")
        private String closeTime;

        @com.aliyun.core.annotation.NameInMap("close_type")
        private Integer closeType;

        @com.aliyun.core.annotation.NameInMap("journey_list")
        private java.util.List<JourneyList> journeyList;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("origin_journey_list")
        private java.util.List<OriginJourneyList> originJourneyList;

        @com.aliyun.core.annotation.NameInMap("out_order_id")
        private String outOrderId;

        @com.aliyun.core.annotation.NameInMap("out_re_shop_apply_id")
        private String outReShopApplyId;

        @com.aliyun.core.annotation.NameInMap("passenger_list")
        private java.util.List<PassengerList> passengerList;

        @com.aliyun.core.annotation.NameInMap("passenger_price_info_list")
        private java.util.List<PassengerPriceInfoList> passengerPriceInfoList;

        @com.aliyun.core.annotation.NameInMap("passenger_ticket_list")
        private java.util.List<PassengerTicketList> passengerTicketList;

        @com.aliyun.core.annotation.NameInMap("pay_latest_time")
        private String payLatestTime;

        @com.aliyun.core.annotation.NameInMap("pay_status")
        private Integer payStatus;

        @com.aliyun.core.annotation.NameInMap("price_info")
        private ModulePriceInfo priceInfo;

        @com.aliyun.core.annotation.NameInMap("re_shop_apply_id")
        private Long reShopApplyId;

        @com.aliyun.core.annotation.NameInMap("re_shop_reason_code")
        private String reShopReasonCode;

        @com.aliyun.core.annotation.NameInMap("re_shop_reason_desc")
        private String reShopReasonDesc;

        @com.aliyun.core.annotation.NameInMap("refund_change_rule")
        private RefundChangeRule refundChangeRule;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("success_time")
        private String successTime;

        @com.aliyun.core.annotation.NameInMap("user_intention_memo")
        private String userIntentionMemo;

        private Module(Builder builder) {
            this.baggageRule = builder.baggageRule;
            this.closeReason = builder.closeReason;
            this.closeTime = builder.closeTime;
            this.closeType = builder.closeType;
            this.journeyList = builder.journeyList;
            this.orderId = builder.orderId;
            this.originJourneyList = builder.originJourneyList;
            this.outOrderId = builder.outOrderId;
            this.outReShopApplyId = builder.outReShopApplyId;
            this.passengerList = builder.passengerList;
            this.passengerPriceInfoList = builder.passengerPriceInfoList;
            this.passengerTicketList = builder.passengerTicketList;
            this.payLatestTime = builder.payLatestTime;
            this.payStatus = builder.payStatus;
            this.priceInfo = builder.priceInfo;
            this.reShopApplyId = builder.reShopApplyId;
            this.reShopReasonCode = builder.reShopReasonCode;
            this.reShopReasonDesc = builder.reShopReasonDesc;
            this.refundChangeRule = builder.refundChangeRule;
            this.status = builder.status;
            this.successTime = builder.successTime;
            this.userIntentionMemo = builder.userIntentionMemo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return baggageRule
         */
        public BaggageRule getBaggageRule() {
            return this.baggageRule;
        }

        /**
         * @return closeReason
         */
        public String getCloseReason() {
            return this.closeReason;
        }

        /**
         * @return closeTime
         */
        public String getCloseTime() {
            return this.closeTime;
        }

        /**
         * @return closeType
         */
        public Integer getCloseType() {
            return this.closeType;
        }

        /**
         * @return journeyList
         */
        public java.util.List<JourneyList> getJourneyList() {
            return this.journeyList;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return originJourneyList
         */
        public java.util.List<OriginJourneyList> getOriginJourneyList() {
            return this.originJourneyList;
        }

        /**
         * @return outOrderId
         */
        public String getOutOrderId() {
            return this.outOrderId;
        }

        /**
         * @return outReShopApplyId
         */
        public String getOutReShopApplyId() {
            return this.outReShopApplyId;
        }

        /**
         * @return passengerList
         */
        public java.util.List<PassengerList> getPassengerList() {
            return this.passengerList;
        }

        /**
         * @return passengerPriceInfoList
         */
        public java.util.List<PassengerPriceInfoList> getPassengerPriceInfoList() {
            return this.passengerPriceInfoList;
        }

        /**
         * @return passengerTicketList
         */
        public java.util.List<PassengerTicketList> getPassengerTicketList() {
            return this.passengerTicketList;
        }

        /**
         * @return payLatestTime
         */
        public String getPayLatestTime() {
            return this.payLatestTime;
        }

        /**
         * @return payStatus
         */
        public Integer getPayStatus() {
            return this.payStatus;
        }

        /**
         * @return priceInfo
         */
        public ModulePriceInfo getPriceInfo() {
            return this.priceInfo;
        }

        /**
         * @return reShopApplyId
         */
        public Long getReShopApplyId() {
            return this.reShopApplyId;
        }

        /**
         * @return reShopReasonCode
         */
        public String getReShopReasonCode() {
            return this.reShopReasonCode;
        }

        /**
         * @return reShopReasonDesc
         */
        public String getReShopReasonDesc() {
            return this.reShopReasonDesc;
        }

        /**
         * @return refundChangeRule
         */
        public RefundChangeRule getRefundChangeRule() {
            return this.refundChangeRule;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return successTime
         */
        public String getSuccessTime() {
            return this.successTime;
        }

        /**
         * @return userIntentionMemo
         */
        public String getUserIntentionMemo() {
            return this.userIntentionMemo;
        }

        public static final class Builder {
            private BaggageRule baggageRule; 
            private String closeReason; 
            private String closeTime; 
            private Integer closeType; 
            private java.util.List<JourneyList> journeyList; 
            private Long orderId; 
            private java.util.List<OriginJourneyList> originJourneyList; 
            private String outOrderId; 
            private String outReShopApplyId; 
            private java.util.List<PassengerList> passengerList; 
            private java.util.List<PassengerPriceInfoList> passengerPriceInfoList; 
            private java.util.List<PassengerTicketList> passengerTicketList; 
            private String payLatestTime; 
            private Integer payStatus; 
            private ModulePriceInfo priceInfo; 
            private Long reShopApplyId; 
            private String reShopReasonCode; 
            private String reShopReasonDesc; 
            private RefundChangeRule refundChangeRule; 
            private Integer status; 
            private String successTime; 
            private String userIntentionMemo; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.baggageRule = model.baggageRule;
                this.closeReason = model.closeReason;
                this.closeTime = model.closeTime;
                this.closeType = model.closeType;
                this.journeyList = model.journeyList;
                this.orderId = model.orderId;
                this.originJourneyList = model.originJourneyList;
                this.outOrderId = model.outOrderId;
                this.outReShopApplyId = model.outReShopApplyId;
                this.passengerList = model.passengerList;
                this.passengerPriceInfoList = model.passengerPriceInfoList;
                this.passengerTicketList = model.passengerTicketList;
                this.payLatestTime = model.payLatestTime;
                this.payStatus = model.payStatus;
                this.priceInfo = model.priceInfo;
                this.reShopApplyId = model.reShopApplyId;
                this.reShopReasonCode = model.reShopReasonCode;
                this.reShopReasonDesc = model.reShopReasonDesc;
                this.refundChangeRule = model.refundChangeRule;
                this.status = model.status;
                this.successTime = model.successTime;
                this.userIntentionMemo = model.userIntentionMemo;
            } 

            /**
             * baggage_rule.
             */
            public Builder baggageRule(BaggageRule baggageRule) {
                this.baggageRule = baggageRule;
                return this;
            }

            /**
             * close_reason.
             */
            public Builder closeReason(String closeReason) {
                this.closeReason = closeReason;
                return this;
            }

            /**
             * close_time.
             */
            public Builder closeTime(String closeTime) {
                this.closeTime = closeTime;
                return this;
            }

            /**
             * close_type.
             */
            public Builder closeType(Integer closeType) {
                this.closeType = closeType;
                return this;
            }

            /**
             * journey_list.
             */
            public Builder journeyList(java.util.List<JourneyList> journeyList) {
                this.journeyList = journeyList;
                return this;
            }

            /**
             * order_id.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * origin_journey_list.
             */
            public Builder originJourneyList(java.util.List<OriginJourneyList> originJourneyList) {
                this.originJourneyList = originJourneyList;
                return this;
            }

            /**
             * out_order_id.
             */
            public Builder outOrderId(String outOrderId) {
                this.outOrderId = outOrderId;
                return this;
            }

            /**
             * out_re_shop_apply_id.
             */
            public Builder outReShopApplyId(String outReShopApplyId) {
                this.outReShopApplyId = outReShopApplyId;
                return this;
            }

            /**
             * passenger_list.
             */
            public Builder passengerList(java.util.List<PassengerList> passengerList) {
                this.passengerList = passengerList;
                return this;
            }

            /**
             * passenger_price_info_list.
             */
            public Builder passengerPriceInfoList(java.util.List<PassengerPriceInfoList> passengerPriceInfoList) {
                this.passengerPriceInfoList = passengerPriceInfoList;
                return this;
            }

            /**
             * passenger_ticket_list.
             */
            public Builder passengerTicketList(java.util.List<PassengerTicketList> passengerTicketList) {
                this.passengerTicketList = passengerTicketList;
                return this;
            }

            /**
             * pay_latest_time.
             */
            public Builder payLatestTime(String payLatestTime) {
                this.payLatestTime = payLatestTime;
                return this;
            }

            /**
             * pay_status.
             */
            public Builder payStatus(Integer payStatus) {
                this.payStatus = payStatus;
                return this;
            }

            /**
             * price_info.
             */
            public Builder priceInfo(ModulePriceInfo priceInfo) {
                this.priceInfo = priceInfo;
                return this;
            }

            /**
             * re_shop_apply_id.
             */
            public Builder reShopApplyId(Long reShopApplyId) {
                this.reShopApplyId = reShopApplyId;
                return this;
            }

            /**
             * re_shop_reason_code.
             */
            public Builder reShopReasonCode(String reShopReasonCode) {
                this.reShopReasonCode = reShopReasonCode;
                return this;
            }

            /**
             * re_shop_reason_desc.
             */
            public Builder reShopReasonDesc(String reShopReasonDesc) {
                this.reShopReasonDesc = reShopReasonDesc;
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
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * success_time.
             */
            public Builder successTime(String successTime) {
                this.successTime = successTime;
                return this;
            }

            /**
             * user_intention_memo.
             */
            public Builder userIntentionMemo(String userIntentionMemo) {
                this.userIntentionMemo = userIntentionMemo;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
