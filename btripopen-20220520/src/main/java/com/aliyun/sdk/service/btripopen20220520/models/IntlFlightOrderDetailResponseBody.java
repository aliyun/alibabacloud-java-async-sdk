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
 * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>IntlFlightOrderDetailResponseBody</p>
 */
public class IntlFlightOrderDetailResponseBody extends TeaModel {
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

    private IntlFlightOrderDetailResponseBody(Builder builder) {
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

    public static IntlFlightOrderDetailResponseBody create() {
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

        private Builder(IntlFlightOrderDetailResponseBody model) {
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

        public IntlFlightOrderDetailResponseBody build() {
            return new IntlFlightOrderDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
     */
    public static class ContactInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contact_name")
        private String contactName;

        private ContactInfo(Builder builder) {
            this.contactName = builder.contactName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactInfo create() {
            return builder().build();
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        public static final class Builder {
            private String contactName; 

            private Builder() {
            } 

            private Builder(ContactInfo model) {
                this.contactName = model.contactName;
            } 

            /**
             * contact_name.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            public ContactInfo build() {
                return new ContactInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
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
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
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
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
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
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
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
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
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
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
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
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
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
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
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
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
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
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
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
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
     */
    public static class BaggageRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baggage_digest")
        private String baggageDigest;

        @com.aliyun.core.annotation.NameInMap("offer_baggage_info_map")
        private java.util.Map<String, java.util.List<ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue>> offerBaggageInfoMap;

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
        public java.util.Map<String, java.util.List<ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue>> getOfferBaggageInfoMap() {
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
            private java.util.Map<String, java.util.List<ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue>> offerBaggageInfoMap; 
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
            public Builder offerBaggageInfoMap(java.util.Map<String, java.util.List<ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue>> offerBaggageInfoMap) {
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
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
     */
    public static class PassengerPriceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_type")
        private Integer passengerType;

        @com.aliyun.core.annotation.NameInMap("sell_price")
        private Integer sellPrice;

        @com.aliyun.core.annotation.NameInMap("tax")
        private Integer tax;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Integer ticketPrice;

        private PassengerPriceList(Builder builder) {
            this.passengerType = builder.passengerType;
            this.sellPrice = builder.sellPrice;
            this.tax = builder.tax;
            this.ticketPrice = builder.ticketPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerPriceList create() {
            return builder().build();
        }

        /**
         * @return passengerType
         */
        public Integer getPassengerType() {
            return this.passengerType;
        }

        /**
         * @return sellPrice
         */
        public Integer getSellPrice() {
            return this.sellPrice;
        }

        /**
         * @return tax
         */
        public Integer getTax() {
            return this.tax;
        }

        /**
         * @return ticketPrice
         */
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public static final class Builder {
            private Integer passengerType; 
            private Integer sellPrice; 
            private Integer tax; 
            private Integer ticketPrice; 

            private Builder() {
            } 

            private Builder(PassengerPriceList model) {
                this.passengerType = model.passengerType;
                this.sellPrice = model.sellPrice;
                this.tax = model.tax;
                this.ticketPrice = model.ticketPrice;
            } 

            /**
             * passenger_type.
             */
            public Builder passengerType(Integer passengerType) {
                this.passengerType = passengerType;
                return this;
            }

            /**
             * sell_price.
             */
            public Builder sellPrice(Integer sellPrice) {
                this.sellPrice = sellPrice;
                return this;
            }

            /**
             * tax.
             */
            public Builder tax(Integer tax) {
                this.tax = tax;
                return this;
            }

            /**
             * ticket_price.
             */
            public Builder ticketPrice(Integer ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            public PassengerPriceList build() {
                return new PassengerPriceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
     */
    public static class RefundChangeRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cancel_fee_ind")
        private Boolean cancelFeeInd;

        @com.aliyun.core.annotation.NameInMap("change_fee_ind")
        private Boolean changeFeeInd;

        @com.aliyun.core.annotation.NameInMap("change_rule_desc")
        private String changeRuleDesc;

        @com.aliyun.core.annotation.NameInMap("offer_penalty_info_map")
        private java.util.Map<String, java.util.List<ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap;

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
        public java.util.Map<String, java.util.List<ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue>> getOfferPenaltyInfoMap() {
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
            private java.util.Map<String, java.util.List<ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap; 
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
            public Builder offerPenaltyInfoMap(java.util.Map<String, java.util.List<ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap) {
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
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
     */
    public static class OrderItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baggage_rule")
        private BaggageRule baggageRule;

        @com.aliyun.core.annotation.NameInMap("passenger_price_list")
        private java.util.List<PassengerPriceList> passengerPriceList;

        @com.aliyun.core.annotation.NameInMap("refund_change_rule")
        private RefundChangeRule refundChangeRule;

        @com.aliyun.core.annotation.NameInMap("segment_key_list")
        private java.util.List<String> segmentKeyList;

        private OrderItemList(Builder builder) {
            this.baggageRule = builder.baggageRule;
            this.passengerPriceList = builder.passengerPriceList;
            this.refundChangeRule = builder.refundChangeRule;
            this.segmentKeyList = builder.segmentKeyList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderItemList create() {
            return builder().build();
        }

        /**
         * @return baggageRule
         */
        public BaggageRule getBaggageRule() {
            return this.baggageRule;
        }

        /**
         * @return passengerPriceList
         */
        public java.util.List<PassengerPriceList> getPassengerPriceList() {
            return this.passengerPriceList;
        }

        /**
         * @return refundChangeRule
         */
        public RefundChangeRule getRefundChangeRule() {
            return this.refundChangeRule;
        }

        /**
         * @return segmentKeyList
         */
        public java.util.List<String> getSegmentKeyList() {
            return this.segmentKeyList;
        }

        public static final class Builder {
            private BaggageRule baggageRule; 
            private java.util.List<PassengerPriceList> passengerPriceList; 
            private RefundChangeRule refundChangeRule; 
            private java.util.List<String> segmentKeyList; 

            private Builder() {
            } 

            private Builder(OrderItemList model) {
                this.baggageRule = model.baggageRule;
                this.passengerPriceList = model.passengerPriceList;
                this.refundChangeRule = model.refundChangeRule;
                this.segmentKeyList = model.segmentKeyList;
            } 

            /**
             * baggage_rule.
             */
            public Builder baggageRule(BaggageRule baggageRule) {
                this.baggageRule = baggageRule;
                return this;
            }

            /**
             * passenger_price_list.
             */
            public Builder passengerPriceList(java.util.List<PassengerPriceList> passengerPriceList) {
                this.passengerPriceList = passengerPriceList;
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
             * segment_key_list.
             */
            public Builder segmentKeyList(java.util.List<String> segmentKeyList) {
                this.segmentKeyList = segmentKeyList;
                return this;
            }

            public OrderItemList build() {
                return new OrderItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
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
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
     */
    public static class PriceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sell_price")
        private Integer sellPrice;

        @com.aliyun.core.annotation.NameInMap("tax")
        private Integer tax;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Integer ticketPrice;

        private PriceInfo(Builder builder) {
            this.sellPrice = builder.sellPrice;
            this.tax = builder.tax;
            this.ticketPrice = builder.ticketPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfo create() {
            return builder().build();
        }

        /**
         * @return sellPrice
         */
        public Integer getSellPrice() {
            return this.sellPrice;
        }

        /**
         * @return tax
         */
        public Integer getTax() {
            return this.tax;
        }

        /**
         * @return ticketPrice
         */
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public static final class Builder {
            private Integer sellPrice; 
            private Integer tax; 
            private Integer ticketPrice; 

            private Builder() {
            } 

            private Builder(PriceInfo model) {
                this.sellPrice = model.sellPrice;
                this.tax = model.tax;
                this.ticketPrice = model.ticketPrice;
            } 

            /**
             * sell_price.
             */
            public Builder sellPrice(Integer sellPrice) {
                this.sellPrice = sellPrice;
                return this;
            }

            /**
             * tax.
             */
            public Builder tax(Integer tax) {
                this.tax = tax;
                return this;
            }

            /**
             * ticket_price.
             */
            public Builder ticketPrice(Integer ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            public PriceInfo build() {
                return new PriceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
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
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
     */
    public static class TicketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("issue_time")
        private String issueTime;

        @com.aliyun.core.annotation.NameInMap("price_info")
        private PriceInfo priceInfo;

        @com.aliyun.core.annotation.NameInMap("segment_key_list")
        private java.util.List<String> segmentKeyList;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        @com.aliyun.core.annotation.NameInMap("ticket_segment_list")
        private java.util.List<TicketSegmentList> ticketSegmentList;

        private TicketList(Builder builder) {
            this.issueTime = builder.issueTime;
            this.priceInfo = builder.priceInfo;
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
         * @return priceInfo
         */
        public PriceInfo getPriceInfo() {
            return this.priceInfo;
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
            private PriceInfo priceInfo; 
            private java.util.List<String> segmentKeyList; 
            private String ticketNo; 
            private java.util.List<TicketSegmentList> ticketSegmentList; 

            private Builder() {
            } 

            private Builder(TicketList model) {
                this.issueTime = model.issueTime;
                this.priceInfo = model.priceInfo;
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
             * price_info.
             */
            public Builder priceInfo(PriceInfo priceInfo) {
                this.priceInfo = priceInfo;
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
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
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
     * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderDetailResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("booker_user_id")
        private String bookerUserId;

        @com.aliyun.core.annotation.NameInMap("booker_user_name")
        private String bookerUserName;

        @com.aliyun.core.annotation.NameInMap("close_reason")
        private String closeReason;

        @com.aliyun.core.annotation.NameInMap("close_time")
        private String closeTime;

        @com.aliyun.core.annotation.NameInMap("contact_info")
        private ContactInfo contactInfo;

        @com.aliyun.core.annotation.NameInMap("journey_list")
        private java.util.List<JourneyList> journeyList;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("order_item_list")
        private java.util.List<OrderItemList> orderItemList;

        @com.aliyun.core.annotation.NameInMap("order_status")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("out_order_id")
        private String outOrderId;

        @com.aliyun.core.annotation.NameInMap("passenger_list")
        private java.util.List<PassengerList> passengerList;

        @com.aliyun.core.annotation.NameInMap("passenger_ticket_list")
        private java.util.List<PassengerTicketList> passengerTicketList;

        @com.aliyun.core.annotation.NameInMap("pay_latest_time")
        private String payLatestTime;

        @com.aliyun.core.annotation.NameInMap("pay_status")
        private Integer payStatus;

        @com.aliyun.core.annotation.NameInMap("pay_time")
        private String payTime;

        @com.aliyun.core.annotation.NameInMap("pay_type")
        private Integer payType;

        @com.aliyun.core.annotation.NameInMap("success_time")
        private String successTime;

        @com.aliyun.core.annotation.NameInMap("total_price")
        private Long totalPrice;

        @com.aliyun.core.annotation.NameInMap("total_tax_price")
        private Long totalTaxPrice;

        @com.aliyun.core.annotation.NameInMap("total_ticket_price")
        private Long totalTicketPrice;

        @com.aliyun.core.annotation.NameInMap("trip_type")
        private Integer tripType;

        private Module(Builder builder) {
            this.bookerUserId = builder.bookerUserId;
            this.bookerUserName = builder.bookerUserName;
            this.closeReason = builder.closeReason;
            this.closeTime = builder.closeTime;
            this.contactInfo = builder.contactInfo;
            this.journeyList = builder.journeyList;
            this.orderId = builder.orderId;
            this.orderItemList = builder.orderItemList;
            this.orderStatus = builder.orderStatus;
            this.outOrderId = builder.outOrderId;
            this.passengerList = builder.passengerList;
            this.passengerTicketList = builder.passengerTicketList;
            this.payLatestTime = builder.payLatestTime;
            this.payStatus = builder.payStatus;
            this.payTime = builder.payTime;
            this.payType = builder.payType;
            this.successTime = builder.successTime;
            this.totalPrice = builder.totalPrice;
            this.totalTaxPrice = builder.totalTaxPrice;
            this.totalTicketPrice = builder.totalTicketPrice;
            this.tripType = builder.tripType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return bookerUserId
         */
        public String getBookerUserId() {
            return this.bookerUserId;
        }

        /**
         * @return bookerUserName
         */
        public String getBookerUserName() {
            return this.bookerUserName;
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
         * @return contactInfo
         */
        public ContactInfo getContactInfo() {
            return this.contactInfo;
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
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderItemList
         */
        public java.util.List<OrderItemList> getOrderItemList() {
            return this.orderItemList;
        }

        /**
         * @return orderStatus
         */
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return outOrderId
         */
        public String getOutOrderId() {
            return this.outOrderId;
        }

        /**
         * @return passengerList
         */
        public java.util.List<PassengerList> getPassengerList() {
            return this.passengerList;
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
         * @return payTime
         */
        public String getPayTime() {
            return this.payTime;
        }

        /**
         * @return payType
         */
        public Integer getPayType() {
            return this.payType;
        }

        /**
         * @return successTime
         */
        public String getSuccessTime() {
            return this.successTime;
        }

        /**
         * @return totalPrice
         */
        public Long getTotalPrice() {
            return this.totalPrice;
        }

        /**
         * @return totalTaxPrice
         */
        public Long getTotalTaxPrice() {
            return this.totalTaxPrice;
        }

        /**
         * @return totalTicketPrice
         */
        public Long getTotalTicketPrice() {
            return this.totalTicketPrice;
        }

        /**
         * @return tripType
         */
        public Integer getTripType() {
            return this.tripType;
        }

        public static final class Builder {
            private String bookerUserId; 
            private String bookerUserName; 
            private String closeReason; 
            private String closeTime; 
            private ContactInfo contactInfo; 
            private java.util.List<JourneyList> journeyList; 
            private String orderId; 
            private java.util.List<OrderItemList> orderItemList; 
            private Integer orderStatus; 
            private String outOrderId; 
            private java.util.List<PassengerList> passengerList; 
            private java.util.List<PassengerTicketList> passengerTicketList; 
            private String payLatestTime; 
            private Integer payStatus; 
            private String payTime; 
            private Integer payType; 
            private String successTime; 
            private Long totalPrice; 
            private Long totalTaxPrice; 
            private Long totalTicketPrice; 
            private Integer tripType; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.bookerUserId = model.bookerUserId;
                this.bookerUserName = model.bookerUserName;
                this.closeReason = model.closeReason;
                this.closeTime = model.closeTime;
                this.contactInfo = model.contactInfo;
                this.journeyList = model.journeyList;
                this.orderId = model.orderId;
                this.orderItemList = model.orderItemList;
                this.orderStatus = model.orderStatus;
                this.outOrderId = model.outOrderId;
                this.passengerList = model.passengerList;
                this.passengerTicketList = model.passengerTicketList;
                this.payLatestTime = model.payLatestTime;
                this.payStatus = model.payStatus;
                this.payTime = model.payTime;
                this.payType = model.payType;
                this.successTime = model.successTime;
                this.totalPrice = model.totalPrice;
                this.totalTaxPrice = model.totalTaxPrice;
                this.totalTicketPrice = model.totalTicketPrice;
                this.tripType = model.tripType;
            } 

            /**
             * booker_user_id.
             */
            public Builder bookerUserId(String bookerUserId) {
                this.bookerUserId = bookerUserId;
                return this;
            }

            /**
             * booker_user_name.
             */
            public Builder bookerUserName(String bookerUserName) {
                this.bookerUserName = bookerUserName;
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
             * contact_info.
             */
            public Builder contactInfo(ContactInfo contactInfo) {
                this.contactInfo = contactInfo;
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
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * order_item_list.
             */
            public Builder orderItemList(java.util.List<OrderItemList> orderItemList) {
                this.orderItemList = orderItemList;
                return this;
            }

            /**
             * order_status.
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
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
             * passenger_list.
             */
            public Builder passengerList(java.util.List<PassengerList> passengerList) {
                this.passengerList = passengerList;
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
             * pay_time.
             */
            public Builder payTime(String payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * pay_type.
             */
            public Builder payType(Integer payType) {
                this.payType = payType;
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
             * total_price.
             */
            public Builder totalPrice(Long totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            /**
             * total_tax_price.
             */
            public Builder totalTaxPrice(Long totalTaxPrice) {
                this.totalTaxPrice = totalTaxPrice;
                return this;
            }

            /**
             * total_ticket_price.
             */
            public Builder totalTicketPrice(Long totalTicketPrice) {
                this.totalTicketPrice = totalTicketPrice;
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
