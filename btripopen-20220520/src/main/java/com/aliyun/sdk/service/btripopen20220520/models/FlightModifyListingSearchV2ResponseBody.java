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
 * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
 *
 * <p>FlightModifyListingSearchV2ResponseBody</p>
 */
public class FlightModifyListingSearchV2ResponseBody extends TeaModel {
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

    private FlightModifyListingSearchV2ResponseBody(Builder builder) {
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

    public static FlightModifyListingSearchV2ResponseBody create() {
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
         * <p>module</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
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
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>2136019116915615924561621e06ee</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public FlightModifyListingSearchV2ResponseBody build() {
            return new FlightModifyListingSearchV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
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
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
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
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
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
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
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
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
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
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class FlightStopInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("stop_airport")
        private String stopAirport;

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

        private FlightStopInfo(Builder builder) {
            this.stopAirport = builder.stopAirport;
            this.stopArrTerm = builder.stopArrTerm;
            this.stopArrTime = builder.stopArrTime;
            this.stopCityCode = builder.stopCityCode;
            this.stopCityName = builder.stopCityName;
            this.stopDepTerm = builder.stopDepTerm;
            this.stopDepTime = builder.stopDepTime;
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

        public static final class Builder {
            private String stopAirport; 
            private String stopArrTerm; 
            private String stopArrTime; 
            private String stopCityCode; 
            private String stopCityName; 
            private String stopDepTerm; 
            private String stopDepTime; 

            /**
             * stop_airport.
             */
            public Builder stopAirport(String stopAirport) {
                this.stopAirport = stopAirport;
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

            public FlightStopInfo build() {
                return new FlightStopInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class TransferAirlineInfo extends TeaModel {
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

        private TransferAirlineInfo(Builder builder) {
            this.airlineChineseName = builder.airlineChineseName;
            this.airlineChineseShortName = builder.airlineChineseShortName;
            this.airlineCode = builder.airlineCode;
            this.airlineIcon = builder.airlineIcon;
            this.cheapFlight = builder.cheapFlight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferAirlineInfo create() {
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

            public TransferAirlineInfo build() {
                return new TransferAirlineInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class FlightTransferInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("transfer_airline_info")
        private TransferAirlineInfo transferAirlineInfo;

        @com.aliyun.core.annotation.NameInMap("transfer_city_code")
        private String transferCityCode;

        @com.aliyun.core.annotation.NameInMap("transfer_city_name")
        private String transferCityName;

        @com.aliyun.core.annotation.NameInMap("transfer_dep_time")
        private String transferDepTime;

        @com.aliyun.core.annotation.NameInMap("transfer_flight_no")
        private String transferFlightNo;

        @com.aliyun.core.annotation.NameInMap("transfer_flight_size")
        private String transferFlightSize;

        @com.aliyun.core.annotation.NameInMap("transfer_share")
        private Boolean transferShare;

        @com.aliyun.core.annotation.NameInMap("transfer_stop_time")
        private Integer transferStopTime;

        private FlightTransferInfo(Builder builder) {
            this.transferAirlineInfo = builder.transferAirlineInfo;
            this.transferCityCode = builder.transferCityCode;
            this.transferCityName = builder.transferCityName;
            this.transferDepTime = builder.transferDepTime;
            this.transferFlightNo = builder.transferFlightNo;
            this.transferFlightSize = builder.transferFlightSize;
            this.transferShare = builder.transferShare;
            this.transferStopTime = builder.transferStopTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightTransferInfo create() {
            return builder().build();
        }

        /**
         * @return transferAirlineInfo
         */
        public TransferAirlineInfo getTransferAirlineInfo() {
            return this.transferAirlineInfo;
        }

        /**
         * @return transferCityCode
         */
        public String getTransferCityCode() {
            return this.transferCityCode;
        }

        /**
         * @return transferCityName
         */
        public String getTransferCityName() {
            return this.transferCityName;
        }

        /**
         * @return transferDepTime
         */
        public String getTransferDepTime() {
            return this.transferDepTime;
        }

        /**
         * @return transferFlightNo
         */
        public String getTransferFlightNo() {
            return this.transferFlightNo;
        }

        /**
         * @return transferFlightSize
         */
        public String getTransferFlightSize() {
            return this.transferFlightSize;
        }

        /**
         * @return transferShare
         */
        public Boolean getTransferShare() {
            return this.transferShare;
        }

        /**
         * @return transferStopTime
         */
        public Integer getTransferStopTime() {
            return this.transferStopTime;
        }

        public static final class Builder {
            private TransferAirlineInfo transferAirlineInfo; 
            private String transferCityCode; 
            private String transferCityName; 
            private String transferDepTime; 
            private String transferFlightNo; 
            private String transferFlightSize; 
            private Boolean transferShare; 
            private Integer transferStopTime; 

            /**
             * transfer_airline_info.
             */
            public Builder transferAirlineInfo(TransferAirlineInfo transferAirlineInfo) {
                this.transferAirlineInfo = transferAirlineInfo;
                return this;
            }

            /**
             * transfer_city_code.
             */
            public Builder transferCityCode(String transferCityCode) {
                this.transferCityCode = transferCityCode;
                return this;
            }

            /**
             * transfer_city_name.
             */
            public Builder transferCityName(String transferCityName) {
                this.transferCityName = transferCityName;
                return this;
            }

            /**
             * transfer_dep_time.
             */
            public Builder transferDepTime(String transferDepTime) {
                this.transferDepTime = transferDepTime;
                return this;
            }

            /**
             * transfer_flight_no.
             */
            public Builder transferFlightNo(String transferFlightNo) {
                this.transferFlightNo = transferFlightNo;
                return this;
            }

            /**
             * transfer_flight_size.
             */
            public Builder transferFlightSize(String transferFlightSize) {
                this.transferFlightSize = transferFlightSize;
                return this;
            }

            /**
             * transfer_share.
             */
            public Builder transferShare(Boolean transferShare) {
                this.transferShare = transferShare;
                return this;
            }

            /**
             * transfer_stop_time.
             */
            public Builder transferStopTime(Integer transferStopTime) {
                this.transferStopTime = transferStopTime;
                return this;
            }

            public FlightTransferInfo build() {
                return new FlightTransferInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class ReShopPriceInfoDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("re_shop_adult_change_fee")
        private Integer reShopAdultChangeFee;

        @com.aliyun.core.annotation.NameInMap("re_shop_adult_price")
        private Integer reShopAdultPrice;

        @com.aliyun.core.annotation.NameInMap("re_shop_adult_price_gap")
        private Integer reShopAdultPriceGap;

        @com.aliyun.core.annotation.NameInMap("re_shop_child_change_fee")
        private Integer reShopChildChangeFee;

        @com.aliyun.core.annotation.NameInMap("re_shop_child_price")
        private Integer reShopChildPrice;

        @com.aliyun.core.annotation.NameInMap("re_shop_child_price_gap")
        private Integer reShopChildPriceGap;

        @com.aliyun.core.annotation.NameInMap("re_shop_inf_change_fee")
        private Integer reShopInfChangeFee;

        @com.aliyun.core.annotation.NameInMap("re_shop_inf_price")
        private Integer reShopInfPrice;

        @com.aliyun.core.annotation.NameInMap("re_shop_inf_price_gap")
        private Integer reShopInfPriceGap;

        private ReShopPriceInfoDTO(Builder builder) {
            this.reShopAdultChangeFee = builder.reShopAdultChangeFee;
            this.reShopAdultPrice = builder.reShopAdultPrice;
            this.reShopAdultPriceGap = builder.reShopAdultPriceGap;
            this.reShopChildChangeFee = builder.reShopChildChangeFee;
            this.reShopChildPrice = builder.reShopChildPrice;
            this.reShopChildPriceGap = builder.reShopChildPriceGap;
            this.reShopInfChangeFee = builder.reShopInfChangeFee;
            this.reShopInfPrice = builder.reShopInfPrice;
            this.reShopInfPriceGap = builder.reShopInfPriceGap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReShopPriceInfoDTO create() {
            return builder().build();
        }

        /**
         * @return reShopAdultChangeFee
         */
        public Integer getReShopAdultChangeFee() {
            return this.reShopAdultChangeFee;
        }

        /**
         * @return reShopAdultPrice
         */
        public Integer getReShopAdultPrice() {
            return this.reShopAdultPrice;
        }

        /**
         * @return reShopAdultPriceGap
         */
        public Integer getReShopAdultPriceGap() {
            return this.reShopAdultPriceGap;
        }

        /**
         * @return reShopChildChangeFee
         */
        public Integer getReShopChildChangeFee() {
            return this.reShopChildChangeFee;
        }

        /**
         * @return reShopChildPrice
         */
        public Integer getReShopChildPrice() {
            return this.reShopChildPrice;
        }

        /**
         * @return reShopChildPriceGap
         */
        public Integer getReShopChildPriceGap() {
            return this.reShopChildPriceGap;
        }

        /**
         * @return reShopInfChangeFee
         */
        public Integer getReShopInfChangeFee() {
            return this.reShopInfChangeFee;
        }

        /**
         * @return reShopInfPrice
         */
        public Integer getReShopInfPrice() {
            return this.reShopInfPrice;
        }

        /**
         * @return reShopInfPriceGap
         */
        public Integer getReShopInfPriceGap() {
            return this.reShopInfPriceGap;
        }

        public static final class Builder {
            private Integer reShopAdultChangeFee; 
            private Integer reShopAdultPrice; 
            private Integer reShopAdultPriceGap; 
            private Integer reShopChildChangeFee; 
            private Integer reShopChildPrice; 
            private Integer reShopChildPriceGap; 
            private Integer reShopInfChangeFee; 
            private Integer reShopInfPrice; 
            private Integer reShopInfPriceGap; 

            /**
             * re_shop_adult_change_fee.
             */
            public Builder reShopAdultChangeFee(Integer reShopAdultChangeFee) {
                this.reShopAdultChangeFee = reShopAdultChangeFee;
                return this;
            }

            /**
             * re_shop_adult_price.
             */
            public Builder reShopAdultPrice(Integer reShopAdultPrice) {
                this.reShopAdultPrice = reShopAdultPrice;
                return this;
            }

            /**
             * re_shop_adult_price_gap.
             */
            public Builder reShopAdultPriceGap(Integer reShopAdultPriceGap) {
                this.reShopAdultPriceGap = reShopAdultPriceGap;
                return this;
            }

            /**
             * re_shop_child_change_fee.
             */
            public Builder reShopChildChangeFee(Integer reShopChildChangeFee) {
                this.reShopChildChangeFee = reShopChildChangeFee;
                return this;
            }

            /**
             * re_shop_child_price.
             */
            public Builder reShopChildPrice(Integer reShopChildPrice) {
                this.reShopChildPrice = reShopChildPrice;
                return this;
            }

            /**
             * re_shop_child_price_gap.
             */
            public Builder reShopChildPriceGap(Integer reShopChildPriceGap) {
                this.reShopChildPriceGap = reShopChildPriceGap;
                return this;
            }

            /**
             * re_shop_inf_change_fee.
             */
            public Builder reShopInfChangeFee(Integer reShopInfChangeFee) {
                this.reShopInfChangeFee = reShopInfChangeFee;
                return this;
            }

            /**
             * re_shop_inf_price.
             */
            public Builder reShopInfPrice(Integer reShopInfPrice) {
                this.reShopInfPrice = reShopInfPrice;
                return this;
            }

            /**
             * re_shop_inf_price_gap.
             */
            public Builder reShopInfPriceGap(Integer reShopInfPriceGap) {
                this.reShopInfPriceGap = reShopInfPriceGap;
                return this;
            }

            public ReShopPriceInfoDTO build() {
                return new ReShopPriceInfoDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class PriceInfoDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adult_price")
        private Integer adultPrice;

        @com.aliyun.core.annotation.NameInMap("adult_tax")
        private Integer adultTax;

        @com.aliyun.core.annotation.NameInMap("adult_total_price")
        private Integer adultTotalPrice;

        @com.aliyun.core.annotation.NameInMap("before_control_price")
        private Integer beforeControlPrice;

        @com.aliyun.core.annotation.NameInMap("child_price")
        private Integer childPrice;

        @com.aliyun.core.annotation.NameInMap("child_tax")
        private Integer childTax;

        @com.aliyun.core.annotation.NameInMap("child_total_price")
        private Integer childTotalPrice;

        @com.aliyun.core.annotation.NameInMap("infant_price")
        private Integer infantPrice;

        @com.aliyun.core.annotation.NameInMap("infant_tax")
        private Integer infantTax;

        @com.aliyun.core.annotation.NameInMap("infant_total_price")
        private Integer infantTotalPrice;

        @com.aliyun.core.annotation.NameInMap("original_adult_price")
        private Integer originalAdultPrice;

        @com.aliyun.core.annotation.NameInMap("original_adult_total_price")
        private Integer originalAdultTotalPrice;

        @com.aliyun.core.annotation.NameInMap("re_shop_price_info_d_t_o")
        private ReShopPriceInfoDTO reShopPriceInfoDTO;

        private PriceInfoDTO(Builder builder) {
            this.adultPrice = builder.adultPrice;
            this.adultTax = builder.adultTax;
            this.adultTotalPrice = builder.adultTotalPrice;
            this.beforeControlPrice = builder.beforeControlPrice;
            this.childPrice = builder.childPrice;
            this.childTax = builder.childTax;
            this.childTotalPrice = builder.childTotalPrice;
            this.infantPrice = builder.infantPrice;
            this.infantTax = builder.infantTax;
            this.infantTotalPrice = builder.infantTotalPrice;
            this.originalAdultPrice = builder.originalAdultPrice;
            this.originalAdultTotalPrice = builder.originalAdultTotalPrice;
            this.reShopPriceInfoDTO = builder.reShopPriceInfoDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfoDTO create() {
            return builder().build();
        }

        /**
         * @return adultPrice
         */
        public Integer getAdultPrice() {
            return this.adultPrice;
        }

        /**
         * @return adultTax
         */
        public Integer getAdultTax() {
            return this.adultTax;
        }

        /**
         * @return adultTotalPrice
         */
        public Integer getAdultTotalPrice() {
            return this.adultTotalPrice;
        }

        /**
         * @return beforeControlPrice
         */
        public Integer getBeforeControlPrice() {
            return this.beforeControlPrice;
        }

        /**
         * @return childPrice
         */
        public Integer getChildPrice() {
            return this.childPrice;
        }

        /**
         * @return childTax
         */
        public Integer getChildTax() {
            return this.childTax;
        }

        /**
         * @return childTotalPrice
         */
        public Integer getChildTotalPrice() {
            return this.childTotalPrice;
        }

        /**
         * @return infantPrice
         */
        public Integer getInfantPrice() {
            return this.infantPrice;
        }

        /**
         * @return infantTax
         */
        public Integer getInfantTax() {
            return this.infantTax;
        }

        /**
         * @return infantTotalPrice
         */
        public Integer getInfantTotalPrice() {
            return this.infantTotalPrice;
        }

        /**
         * @return originalAdultPrice
         */
        public Integer getOriginalAdultPrice() {
            return this.originalAdultPrice;
        }

        /**
         * @return originalAdultTotalPrice
         */
        public Integer getOriginalAdultTotalPrice() {
            return this.originalAdultTotalPrice;
        }

        /**
         * @return reShopPriceInfoDTO
         */
        public ReShopPriceInfoDTO getReShopPriceInfoDTO() {
            return this.reShopPriceInfoDTO;
        }

        public static final class Builder {
            private Integer adultPrice; 
            private Integer adultTax; 
            private Integer adultTotalPrice; 
            private Integer beforeControlPrice; 
            private Integer childPrice; 
            private Integer childTax; 
            private Integer childTotalPrice; 
            private Integer infantPrice; 
            private Integer infantTax; 
            private Integer infantTotalPrice; 
            private Integer originalAdultPrice; 
            private Integer originalAdultTotalPrice; 
            private ReShopPriceInfoDTO reShopPriceInfoDTO; 

            /**
             * adult_price.
             */
            public Builder adultPrice(Integer adultPrice) {
                this.adultPrice = adultPrice;
                return this;
            }

            /**
             * adult_tax.
             */
            public Builder adultTax(Integer adultTax) {
                this.adultTax = adultTax;
                return this;
            }

            /**
             * adult_total_price.
             */
            public Builder adultTotalPrice(Integer adultTotalPrice) {
                this.adultTotalPrice = adultTotalPrice;
                return this;
            }

            /**
             * before_control_price.
             */
            public Builder beforeControlPrice(Integer beforeControlPrice) {
                this.beforeControlPrice = beforeControlPrice;
                return this;
            }

            /**
             * child_price.
             */
            public Builder childPrice(Integer childPrice) {
                this.childPrice = childPrice;
                return this;
            }

            /**
             * child_tax.
             */
            public Builder childTax(Integer childTax) {
                this.childTax = childTax;
                return this;
            }

            /**
             * child_total_price.
             */
            public Builder childTotalPrice(Integer childTotalPrice) {
                this.childTotalPrice = childTotalPrice;
                return this;
            }

            /**
             * infant_price.
             */
            public Builder infantPrice(Integer infantPrice) {
                this.infantPrice = infantPrice;
                return this;
            }

            /**
             * infant_tax.
             */
            public Builder infantTax(Integer infantTax) {
                this.infantTax = infantTax;
                return this;
            }

            /**
             * infant_total_price.
             */
            public Builder infantTotalPrice(Integer infantTotalPrice) {
                this.infantTotalPrice = infantTotalPrice;
                return this;
            }

            /**
             * original_adult_price.
             */
            public Builder originalAdultPrice(Integer originalAdultPrice) {
                this.originalAdultPrice = originalAdultPrice;
                return this;
            }

            /**
             * original_adult_total_price.
             */
            public Builder originalAdultTotalPrice(Integer originalAdultTotalPrice) {
                this.originalAdultTotalPrice = originalAdultTotalPrice;
                return this;
            }

            /**
             * re_shop_price_info_d_t_o.
             */
            public Builder reShopPriceInfoDTO(ReShopPriceInfoDTO reShopPriceInfoDTO) {
                this.reShopPriceInfoDTO = reShopPriceInfoDTO;
                return this;
            }

            public PriceInfoDTO build() {
                return new PriceInfoDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class DirectFlightList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_info")
        private AirlineInfo airlineInfo;

        @com.aliyun.core.annotation.NameInMap("arr_airport_info")
        private ArrAirportInfo arrAirportInfo;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("cabinClass")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("cabinClassName")
        private String cabinClassName;

        @com.aliyun.core.annotation.NameInMap("dep_airport_info")
        private DepAirportInfo depAirportInfo;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

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

        @com.aliyun.core.annotation.NameInMap("flight_transfer_info")
        private FlightTransferInfo flightTransferInfo;

        @com.aliyun.core.annotation.NameInMap("flight_type")
        private String flightType;

        @com.aliyun.core.annotation.NameInMap("journey_seq")
        private Integer journeySeq;

        @com.aliyun.core.annotation.NameInMap("left_num")
        private String leftNum;

        @com.aliyun.core.annotation.NameInMap("manufacturer")
        private String manufacturer;

        @com.aliyun.core.annotation.NameInMap("meal_desc")
        private String mealDesc;

        @com.aliyun.core.annotation.NameInMap("price_info_d_t_o")
        private PriceInfoDTO priceInfoDTO;

        @com.aliyun.core.annotation.NameInMap("segment_seq")
        private Integer segmentSeq;

        @com.aliyun.core.annotation.NameInMap("share")
        private Boolean share;

        @com.aliyun.core.annotation.NameInMap("short_flight_size")
        private String shortFlightSize;

        @com.aliyun.core.annotation.NameInMap("span_day")
        private String spanDay;

        @com.aliyun.core.annotation.NameInMap("stop")
        private Boolean stop;

        @com.aliyun.core.annotation.NameInMap("transfer")
        private Boolean transfer;

        private DirectFlightList(Builder builder) {
            this.airlineInfo = builder.airlineInfo;
            this.arrAirportInfo = builder.arrAirportInfo;
            this.arrCityCode = builder.arrCityCode;
            this.arrTime = builder.arrTime;
            this.cabinClass = builder.cabinClass;
            this.cabinClassName = builder.cabinClassName;
            this.depAirportInfo = builder.depAirportInfo;
            this.depCityCode = builder.depCityCode;
            this.depTime = builder.depTime;
            this.duration = builder.duration;
            this.flightNo = builder.flightNo;
            this.flightShareInfo = builder.flightShareInfo;
            this.flightSize = builder.flightSize;
            this.flightStopInfo = builder.flightStopInfo;
            this.flightTransferInfo = builder.flightTransferInfo;
            this.flightType = builder.flightType;
            this.journeySeq = builder.journeySeq;
            this.leftNum = builder.leftNum;
            this.manufacturer = builder.manufacturer;
            this.mealDesc = builder.mealDesc;
            this.priceInfoDTO = builder.priceInfoDTO;
            this.segmentSeq = builder.segmentSeq;
            this.share = builder.share;
            this.shortFlightSize = builder.shortFlightSize;
            this.spanDay = builder.spanDay;
            this.stop = builder.stop;
            this.transfer = builder.transfer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectFlightList create() {
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
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return cabinClass
         */
        public String getCabinClass() {
            return this.cabinClass;
        }

        /**
         * @return cabinClassName
         */
        public String getCabinClassName() {
            return this.cabinClassName;
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
         * @return flightTransferInfo
         */
        public FlightTransferInfo getFlightTransferInfo() {
            return this.flightTransferInfo;
        }

        /**
         * @return flightType
         */
        public String getFlightType() {
            return this.flightType;
        }

        /**
         * @return journeySeq
         */
        public Integer getJourneySeq() {
            return this.journeySeq;
        }

        /**
         * @return leftNum
         */
        public String getLeftNum() {
            return this.leftNum;
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
         * @return priceInfoDTO
         */
        public PriceInfoDTO getPriceInfoDTO() {
            return this.priceInfoDTO;
        }

        /**
         * @return segmentSeq
         */
        public Integer getSegmentSeq() {
            return this.segmentSeq;
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
         * @return spanDay
         */
        public String getSpanDay() {
            return this.spanDay;
        }

        /**
         * @return stop
         */
        public Boolean getStop() {
            return this.stop;
        }

        /**
         * @return transfer
         */
        public Boolean getTransfer() {
            return this.transfer;
        }

        public static final class Builder {
            private AirlineInfo airlineInfo; 
            private ArrAirportInfo arrAirportInfo; 
            private String arrCityCode; 
            private String arrTime; 
            private String cabinClass; 
            private String cabinClassName; 
            private DepAirportInfo depAirportInfo; 
            private String depCityCode; 
            private String depTime; 
            private Integer duration; 
            private String flightNo; 
            private FlightShareInfo flightShareInfo; 
            private String flightSize; 
            private FlightStopInfo flightStopInfo; 
            private FlightTransferInfo flightTransferInfo; 
            private String flightType; 
            private Integer journeySeq; 
            private String leftNum; 
            private String manufacturer; 
            private String mealDesc; 
            private PriceInfoDTO priceInfoDTO; 
            private Integer segmentSeq; 
            private Boolean share; 
            private String shortFlightSize; 
            private String spanDay; 
            private Boolean stop; 
            private Boolean transfer; 

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
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * cabinClass.
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * cabinClassName.
             */
            public Builder cabinClassName(String cabinClassName) {
                this.cabinClassName = cabinClassName;
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
             * flight_transfer_info.
             */
            public Builder flightTransferInfo(FlightTransferInfo flightTransferInfo) {
                this.flightTransferInfo = flightTransferInfo;
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
             * journey_seq.
             */
            public Builder journeySeq(Integer journeySeq) {
                this.journeySeq = journeySeq;
                return this;
            }

            /**
             * left_num.
             */
            public Builder leftNum(String leftNum) {
                this.leftNum = leftNum;
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
             * price_info_d_t_o.
             */
            public Builder priceInfoDTO(PriceInfoDTO priceInfoDTO) {
                this.priceInfoDTO = priceInfoDTO;
                return this;
            }

            /**
             * segment_seq.
             */
            public Builder segmentSeq(Integer segmentSeq) {
                this.segmentSeq = segmentSeq;
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
             * span_day.
             */
            public Builder spanDay(String spanDay) {
                this.spanDay = spanDay;
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
             * transfer.
             */
            public Builder transfer(Boolean transfer) {
                this.transfer = transfer;
                return this;
            }

            public DirectFlightList build() {
                return new DirectFlightList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class TransferFlightListAirlineInfo extends TeaModel {
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

        private TransferFlightListAirlineInfo(Builder builder) {
            this.airlineChineseName = builder.airlineChineseName;
            this.airlineChineseShortName = builder.airlineChineseShortName;
            this.airlineCode = builder.airlineCode;
            this.airlineIcon = builder.airlineIcon;
            this.cheapFlight = builder.cheapFlight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightListAirlineInfo create() {
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

            public TransferFlightListAirlineInfo build() {
                return new TransferFlightListAirlineInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class TransferFlightListArrAirportInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airport_code")
        private String airportCode;

        @com.aliyun.core.annotation.NameInMap("airport_name")
        private String airportName;

        @com.aliyun.core.annotation.NameInMap("airport_short_name")
        private String airportShortName;

        @com.aliyun.core.annotation.NameInMap("terminal")
        private String terminal;

        private TransferFlightListArrAirportInfo(Builder builder) {
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.airportShortName = builder.airportShortName;
            this.terminal = builder.terminal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightListArrAirportInfo create() {
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

            public TransferFlightListArrAirportInfo build() {
                return new TransferFlightListArrAirportInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class TransferFlightListDepAirportInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airport_code")
        private String airportCode;

        @com.aliyun.core.annotation.NameInMap("airport_name")
        private String airportName;

        @com.aliyun.core.annotation.NameInMap("airport_short_name")
        private String airportShortName;

        @com.aliyun.core.annotation.NameInMap("terminal")
        private String terminal;

        private TransferFlightListDepAirportInfo(Builder builder) {
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.airportShortName = builder.airportShortName;
            this.terminal = builder.terminal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightListDepAirportInfo create() {
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

            public TransferFlightListDepAirportInfo build() {
                return new TransferFlightListDepAirportInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class FlightShareInfoOperatingAirlineInfo extends TeaModel {
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

        private FlightShareInfoOperatingAirlineInfo(Builder builder) {
            this.airlineChineseName = builder.airlineChineseName;
            this.airlineChineseShortName = builder.airlineChineseShortName;
            this.airlineCode = builder.airlineCode;
            this.airlineIcon = builder.airlineIcon;
            this.cheapFlight = builder.cheapFlight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightShareInfoOperatingAirlineInfo create() {
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

            public FlightShareInfoOperatingAirlineInfo build() {
                return new FlightShareInfoOperatingAirlineInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class TransferFlightListFlightShareInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("operating_airline_info")
        private FlightShareInfoOperatingAirlineInfo operatingAirlineInfo;

        @com.aliyun.core.annotation.NameInMap("operating_flight_no")
        private String operatingFlightNo;

        private TransferFlightListFlightShareInfo(Builder builder) {
            this.operatingAirlineInfo = builder.operatingAirlineInfo;
            this.operatingFlightNo = builder.operatingFlightNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightListFlightShareInfo create() {
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

            public TransferFlightListFlightShareInfo build() {
                return new TransferFlightListFlightShareInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class TransferFlightListFlightStopInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("stop_airport")
        private String stopAirport;

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

        private TransferFlightListFlightStopInfo(Builder builder) {
            this.stopAirport = builder.stopAirport;
            this.stopArrTerm = builder.stopArrTerm;
            this.stopArrTime = builder.stopArrTime;
            this.stopCityCode = builder.stopCityCode;
            this.stopCityName = builder.stopCityName;
            this.stopDepTerm = builder.stopDepTerm;
            this.stopDepTime = builder.stopDepTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightListFlightStopInfo create() {
            return builder().build();
        }

        /**
         * @return stopAirport
         */
        public String getStopAirport() {
            return this.stopAirport;
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

        public static final class Builder {
            private String stopAirport; 
            private String stopArrTerm; 
            private String stopArrTime; 
            private String stopCityCode; 
            private String stopCityName; 
            private String stopDepTerm; 
            private String stopDepTime; 

            /**
             * stop_airport.
             */
            public Builder stopAirport(String stopAirport) {
                this.stopAirport = stopAirport;
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

            public TransferFlightListFlightStopInfo build() {
                return new TransferFlightListFlightStopInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class FlightTransferInfoTransferAirlineInfo extends TeaModel {
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

        private FlightTransferInfoTransferAirlineInfo(Builder builder) {
            this.airlineChineseName = builder.airlineChineseName;
            this.airlineChineseShortName = builder.airlineChineseShortName;
            this.airlineCode = builder.airlineCode;
            this.airlineIcon = builder.airlineIcon;
            this.cheapFlight = builder.cheapFlight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightTransferInfoTransferAirlineInfo create() {
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

            public FlightTransferInfoTransferAirlineInfo build() {
                return new FlightTransferInfoTransferAirlineInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class TransferFlightListFlightTransferInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("transfer_airline_info")
        private FlightTransferInfoTransferAirlineInfo transferAirlineInfo;

        @com.aliyun.core.annotation.NameInMap("transfer_city_code")
        private String transferCityCode;

        @com.aliyun.core.annotation.NameInMap("transfer_city_name")
        private String transferCityName;

        @com.aliyun.core.annotation.NameInMap("transfer_dep_time")
        private String transferDepTime;

        @com.aliyun.core.annotation.NameInMap("transfer_flight_no")
        private String transferFlightNo;

        @com.aliyun.core.annotation.NameInMap("transfer_flight_size")
        private String transferFlightSize;

        @com.aliyun.core.annotation.NameInMap("transfer_share")
        private Boolean transferShare;

        @com.aliyun.core.annotation.NameInMap("transfer_stop_time")
        private Integer transferStopTime;

        private TransferFlightListFlightTransferInfo(Builder builder) {
            this.transferAirlineInfo = builder.transferAirlineInfo;
            this.transferCityCode = builder.transferCityCode;
            this.transferCityName = builder.transferCityName;
            this.transferDepTime = builder.transferDepTime;
            this.transferFlightNo = builder.transferFlightNo;
            this.transferFlightSize = builder.transferFlightSize;
            this.transferShare = builder.transferShare;
            this.transferStopTime = builder.transferStopTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightListFlightTransferInfo create() {
            return builder().build();
        }

        /**
         * @return transferAirlineInfo
         */
        public FlightTransferInfoTransferAirlineInfo getTransferAirlineInfo() {
            return this.transferAirlineInfo;
        }

        /**
         * @return transferCityCode
         */
        public String getTransferCityCode() {
            return this.transferCityCode;
        }

        /**
         * @return transferCityName
         */
        public String getTransferCityName() {
            return this.transferCityName;
        }

        /**
         * @return transferDepTime
         */
        public String getTransferDepTime() {
            return this.transferDepTime;
        }

        /**
         * @return transferFlightNo
         */
        public String getTransferFlightNo() {
            return this.transferFlightNo;
        }

        /**
         * @return transferFlightSize
         */
        public String getTransferFlightSize() {
            return this.transferFlightSize;
        }

        /**
         * @return transferShare
         */
        public Boolean getTransferShare() {
            return this.transferShare;
        }

        /**
         * @return transferStopTime
         */
        public Integer getTransferStopTime() {
            return this.transferStopTime;
        }

        public static final class Builder {
            private FlightTransferInfoTransferAirlineInfo transferAirlineInfo; 
            private String transferCityCode; 
            private String transferCityName; 
            private String transferDepTime; 
            private String transferFlightNo; 
            private String transferFlightSize; 
            private Boolean transferShare; 
            private Integer transferStopTime; 

            /**
             * transfer_airline_info.
             */
            public Builder transferAirlineInfo(FlightTransferInfoTransferAirlineInfo transferAirlineInfo) {
                this.transferAirlineInfo = transferAirlineInfo;
                return this;
            }

            /**
             * transfer_city_code.
             */
            public Builder transferCityCode(String transferCityCode) {
                this.transferCityCode = transferCityCode;
                return this;
            }

            /**
             * transfer_city_name.
             */
            public Builder transferCityName(String transferCityName) {
                this.transferCityName = transferCityName;
                return this;
            }

            /**
             * transfer_dep_time.
             */
            public Builder transferDepTime(String transferDepTime) {
                this.transferDepTime = transferDepTime;
                return this;
            }

            /**
             * transfer_flight_no.
             */
            public Builder transferFlightNo(String transferFlightNo) {
                this.transferFlightNo = transferFlightNo;
                return this;
            }

            /**
             * transfer_flight_size.
             */
            public Builder transferFlightSize(String transferFlightSize) {
                this.transferFlightSize = transferFlightSize;
                return this;
            }

            /**
             * transfer_share.
             */
            public Builder transferShare(Boolean transferShare) {
                this.transferShare = transferShare;
                return this;
            }

            /**
             * transfer_stop_time.
             */
            public Builder transferStopTime(Integer transferStopTime) {
                this.transferStopTime = transferStopTime;
                return this;
            }

            public TransferFlightListFlightTransferInfo build() {
                return new TransferFlightListFlightTransferInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class PriceInfoDTOReShopPriceInfoDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("re_shop_adult_change_fee")
        private Integer reShopAdultChangeFee;

        @com.aliyun.core.annotation.NameInMap("re_shop_adult_price")
        private Integer reShopAdultPrice;

        @com.aliyun.core.annotation.NameInMap("re_shop_adult_price_gap")
        private Integer reShopAdultPriceGap;

        @com.aliyun.core.annotation.NameInMap("re_shop_child_change_fee")
        private Integer reShopChildChangeFee;

        @com.aliyun.core.annotation.NameInMap("re_shop_child_price")
        private Integer reShopChildPrice;

        @com.aliyun.core.annotation.NameInMap("re_shop_child_price_gap")
        private Integer reShopChildPriceGap;

        @com.aliyun.core.annotation.NameInMap("re_shop_inf_change_fee")
        private Integer reShopInfChangeFee;

        @com.aliyun.core.annotation.NameInMap("re_shop_inf_price")
        private Integer reShopInfPrice;

        @com.aliyun.core.annotation.NameInMap("re_shop_inf_price_gap")
        private Integer reShopInfPriceGap;

        private PriceInfoDTOReShopPriceInfoDTO(Builder builder) {
            this.reShopAdultChangeFee = builder.reShopAdultChangeFee;
            this.reShopAdultPrice = builder.reShopAdultPrice;
            this.reShopAdultPriceGap = builder.reShopAdultPriceGap;
            this.reShopChildChangeFee = builder.reShopChildChangeFee;
            this.reShopChildPrice = builder.reShopChildPrice;
            this.reShopChildPriceGap = builder.reShopChildPriceGap;
            this.reShopInfChangeFee = builder.reShopInfChangeFee;
            this.reShopInfPrice = builder.reShopInfPrice;
            this.reShopInfPriceGap = builder.reShopInfPriceGap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfoDTOReShopPriceInfoDTO create() {
            return builder().build();
        }

        /**
         * @return reShopAdultChangeFee
         */
        public Integer getReShopAdultChangeFee() {
            return this.reShopAdultChangeFee;
        }

        /**
         * @return reShopAdultPrice
         */
        public Integer getReShopAdultPrice() {
            return this.reShopAdultPrice;
        }

        /**
         * @return reShopAdultPriceGap
         */
        public Integer getReShopAdultPriceGap() {
            return this.reShopAdultPriceGap;
        }

        /**
         * @return reShopChildChangeFee
         */
        public Integer getReShopChildChangeFee() {
            return this.reShopChildChangeFee;
        }

        /**
         * @return reShopChildPrice
         */
        public Integer getReShopChildPrice() {
            return this.reShopChildPrice;
        }

        /**
         * @return reShopChildPriceGap
         */
        public Integer getReShopChildPriceGap() {
            return this.reShopChildPriceGap;
        }

        /**
         * @return reShopInfChangeFee
         */
        public Integer getReShopInfChangeFee() {
            return this.reShopInfChangeFee;
        }

        /**
         * @return reShopInfPrice
         */
        public Integer getReShopInfPrice() {
            return this.reShopInfPrice;
        }

        /**
         * @return reShopInfPriceGap
         */
        public Integer getReShopInfPriceGap() {
            return this.reShopInfPriceGap;
        }

        public static final class Builder {
            private Integer reShopAdultChangeFee; 
            private Integer reShopAdultPrice; 
            private Integer reShopAdultPriceGap; 
            private Integer reShopChildChangeFee; 
            private Integer reShopChildPrice; 
            private Integer reShopChildPriceGap; 
            private Integer reShopInfChangeFee; 
            private Integer reShopInfPrice; 
            private Integer reShopInfPriceGap; 

            /**
             * re_shop_adult_change_fee.
             */
            public Builder reShopAdultChangeFee(Integer reShopAdultChangeFee) {
                this.reShopAdultChangeFee = reShopAdultChangeFee;
                return this;
            }

            /**
             * re_shop_adult_price.
             */
            public Builder reShopAdultPrice(Integer reShopAdultPrice) {
                this.reShopAdultPrice = reShopAdultPrice;
                return this;
            }

            /**
             * re_shop_adult_price_gap.
             */
            public Builder reShopAdultPriceGap(Integer reShopAdultPriceGap) {
                this.reShopAdultPriceGap = reShopAdultPriceGap;
                return this;
            }

            /**
             * re_shop_child_change_fee.
             */
            public Builder reShopChildChangeFee(Integer reShopChildChangeFee) {
                this.reShopChildChangeFee = reShopChildChangeFee;
                return this;
            }

            /**
             * re_shop_child_price.
             */
            public Builder reShopChildPrice(Integer reShopChildPrice) {
                this.reShopChildPrice = reShopChildPrice;
                return this;
            }

            /**
             * re_shop_child_price_gap.
             */
            public Builder reShopChildPriceGap(Integer reShopChildPriceGap) {
                this.reShopChildPriceGap = reShopChildPriceGap;
                return this;
            }

            /**
             * re_shop_inf_change_fee.
             */
            public Builder reShopInfChangeFee(Integer reShopInfChangeFee) {
                this.reShopInfChangeFee = reShopInfChangeFee;
                return this;
            }

            /**
             * re_shop_inf_price.
             */
            public Builder reShopInfPrice(Integer reShopInfPrice) {
                this.reShopInfPrice = reShopInfPrice;
                return this;
            }

            /**
             * re_shop_inf_price_gap.
             */
            public Builder reShopInfPriceGap(Integer reShopInfPriceGap) {
                this.reShopInfPriceGap = reShopInfPriceGap;
                return this;
            }

            public PriceInfoDTOReShopPriceInfoDTO build() {
                return new PriceInfoDTOReShopPriceInfoDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class TransferFlightListPriceInfoDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adult_price")
        private Integer adultPrice;

        @com.aliyun.core.annotation.NameInMap("adult_tax")
        private Integer adultTax;

        @com.aliyun.core.annotation.NameInMap("adult_total_price")
        private Integer adultTotalPrice;

        @com.aliyun.core.annotation.NameInMap("before_control_price")
        private Integer beforeControlPrice;

        @com.aliyun.core.annotation.NameInMap("child_price")
        private Integer childPrice;

        @com.aliyun.core.annotation.NameInMap("child_tax")
        private Integer childTax;

        @com.aliyun.core.annotation.NameInMap("child_total_price")
        private Integer childTotalPrice;

        @com.aliyun.core.annotation.NameInMap("infant_price")
        private Integer infantPrice;

        @com.aliyun.core.annotation.NameInMap("infant_tax")
        private Integer infantTax;

        @com.aliyun.core.annotation.NameInMap("infant_total_price")
        private Integer infantTotalPrice;

        @com.aliyun.core.annotation.NameInMap("original_adult_price")
        private Integer originalAdultPrice;

        @com.aliyun.core.annotation.NameInMap("original_adult_total_price")
        private Integer originalAdultTotalPrice;

        @com.aliyun.core.annotation.NameInMap("re_shop_price_info_d_t_o")
        private PriceInfoDTOReShopPriceInfoDTO reShopPriceInfoDTO;

        private TransferFlightListPriceInfoDTO(Builder builder) {
            this.adultPrice = builder.adultPrice;
            this.adultTax = builder.adultTax;
            this.adultTotalPrice = builder.adultTotalPrice;
            this.beforeControlPrice = builder.beforeControlPrice;
            this.childPrice = builder.childPrice;
            this.childTax = builder.childTax;
            this.childTotalPrice = builder.childTotalPrice;
            this.infantPrice = builder.infantPrice;
            this.infantTax = builder.infantTax;
            this.infantTotalPrice = builder.infantTotalPrice;
            this.originalAdultPrice = builder.originalAdultPrice;
            this.originalAdultTotalPrice = builder.originalAdultTotalPrice;
            this.reShopPriceInfoDTO = builder.reShopPriceInfoDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightListPriceInfoDTO create() {
            return builder().build();
        }

        /**
         * @return adultPrice
         */
        public Integer getAdultPrice() {
            return this.adultPrice;
        }

        /**
         * @return adultTax
         */
        public Integer getAdultTax() {
            return this.adultTax;
        }

        /**
         * @return adultTotalPrice
         */
        public Integer getAdultTotalPrice() {
            return this.adultTotalPrice;
        }

        /**
         * @return beforeControlPrice
         */
        public Integer getBeforeControlPrice() {
            return this.beforeControlPrice;
        }

        /**
         * @return childPrice
         */
        public Integer getChildPrice() {
            return this.childPrice;
        }

        /**
         * @return childTax
         */
        public Integer getChildTax() {
            return this.childTax;
        }

        /**
         * @return childTotalPrice
         */
        public Integer getChildTotalPrice() {
            return this.childTotalPrice;
        }

        /**
         * @return infantPrice
         */
        public Integer getInfantPrice() {
            return this.infantPrice;
        }

        /**
         * @return infantTax
         */
        public Integer getInfantTax() {
            return this.infantTax;
        }

        /**
         * @return infantTotalPrice
         */
        public Integer getInfantTotalPrice() {
            return this.infantTotalPrice;
        }

        /**
         * @return originalAdultPrice
         */
        public Integer getOriginalAdultPrice() {
            return this.originalAdultPrice;
        }

        /**
         * @return originalAdultTotalPrice
         */
        public Integer getOriginalAdultTotalPrice() {
            return this.originalAdultTotalPrice;
        }

        /**
         * @return reShopPriceInfoDTO
         */
        public PriceInfoDTOReShopPriceInfoDTO getReShopPriceInfoDTO() {
            return this.reShopPriceInfoDTO;
        }

        public static final class Builder {
            private Integer adultPrice; 
            private Integer adultTax; 
            private Integer adultTotalPrice; 
            private Integer beforeControlPrice; 
            private Integer childPrice; 
            private Integer childTax; 
            private Integer childTotalPrice; 
            private Integer infantPrice; 
            private Integer infantTax; 
            private Integer infantTotalPrice; 
            private Integer originalAdultPrice; 
            private Integer originalAdultTotalPrice; 
            private PriceInfoDTOReShopPriceInfoDTO reShopPriceInfoDTO; 

            /**
             * adult_price.
             */
            public Builder adultPrice(Integer adultPrice) {
                this.adultPrice = adultPrice;
                return this;
            }

            /**
             * adult_tax.
             */
            public Builder adultTax(Integer adultTax) {
                this.adultTax = adultTax;
                return this;
            }

            /**
             * adult_total_price.
             */
            public Builder adultTotalPrice(Integer adultTotalPrice) {
                this.adultTotalPrice = adultTotalPrice;
                return this;
            }

            /**
             * before_control_price.
             */
            public Builder beforeControlPrice(Integer beforeControlPrice) {
                this.beforeControlPrice = beforeControlPrice;
                return this;
            }

            /**
             * child_price.
             */
            public Builder childPrice(Integer childPrice) {
                this.childPrice = childPrice;
                return this;
            }

            /**
             * child_tax.
             */
            public Builder childTax(Integer childTax) {
                this.childTax = childTax;
                return this;
            }

            /**
             * child_total_price.
             */
            public Builder childTotalPrice(Integer childTotalPrice) {
                this.childTotalPrice = childTotalPrice;
                return this;
            }

            /**
             * infant_price.
             */
            public Builder infantPrice(Integer infantPrice) {
                this.infantPrice = infantPrice;
                return this;
            }

            /**
             * infant_tax.
             */
            public Builder infantTax(Integer infantTax) {
                this.infantTax = infantTax;
                return this;
            }

            /**
             * infant_total_price.
             */
            public Builder infantTotalPrice(Integer infantTotalPrice) {
                this.infantTotalPrice = infantTotalPrice;
                return this;
            }

            /**
             * original_adult_price.
             */
            public Builder originalAdultPrice(Integer originalAdultPrice) {
                this.originalAdultPrice = originalAdultPrice;
                return this;
            }

            /**
             * original_adult_total_price.
             */
            public Builder originalAdultTotalPrice(Integer originalAdultTotalPrice) {
                this.originalAdultTotalPrice = originalAdultTotalPrice;
                return this;
            }

            /**
             * re_shop_price_info_d_t_o.
             */
            public Builder reShopPriceInfoDTO(PriceInfoDTOReShopPriceInfoDTO reShopPriceInfoDTO) {
                this.reShopPriceInfoDTO = reShopPriceInfoDTO;
                return this;
            }

            public TransferFlightListPriceInfoDTO build() {
                return new TransferFlightListPriceInfoDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class TransferFlightList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_info")
        private TransferFlightListAirlineInfo airlineInfo;

        @com.aliyun.core.annotation.NameInMap("arr_airport_info")
        private TransferFlightListArrAirportInfo arrAirportInfo;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("cabinClass")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("cabinClassName")
        private String cabinClassName;

        @com.aliyun.core.annotation.NameInMap("dep_airport_info")
        private TransferFlightListDepAirportInfo depAirportInfo;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("flight_share_info")
        private TransferFlightListFlightShareInfo flightShareInfo;

        @com.aliyun.core.annotation.NameInMap("flight_size")
        private String flightSize;

        @com.aliyun.core.annotation.NameInMap("flight_stop_info")
        private TransferFlightListFlightStopInfo flightStopInfo;

        @com.aliyun.core.annotation.NameInMap("flight_transfer_info")
        private TransferFlightListFlightTransferInfo flightTransferInfo;

        @com.aliyun.core.annotation.NameInMap("flight_type")
        private String flightType;

        @com.aliyun.core.annotation.NameInMap("journey_seq")
        private Integer journeySeq;

        @com.aliyun.core.annotation.NameInMap("left_num")
        private String leftNum;

        @com.aliyun.core.annotation.NameInMap("manufacturer")
        private String manufacturer;

        @com.aliyun.core.annotation.NameInMap("meal_desc")
        private String mealDesc;

        @com.aliyun.core.annotation.NameInMap("price_info_d_t_o")
        private TransferFlightListPriceInfoDTO priceInfoDTO;

        @com.aliyun.core.annotation.NameInMap("segment_seq")
        private Integer segmentSeq;

        @com.aliyun.core.annotation.NameInMap("share")
        private Boolean share;

        @com.aliyun.core.annotation.NameInMap("short_flight_size")
        private String shortFlightSize;

        @com.aliyun.core.annotation.NameInMap("span_day")
        private String spanDay;

        @com.aliyun.core.annotation.NameInMap("stop")
        private Boolean stop;

        @com.aliyun.core.annotation.NameInMap("transfer")
        private Boolean transfer;

        private TransferFlightList(Builder builder) {
            this.airlineInfo = builder.airlineInfo;
            this.arrAirportInfo = builder.arrAirportInfo;
            this.arrCityCode = builder.arrCityCode;
            this.arrTime = builder.arrTime;
            this.cabinClass = builder.cabinClass;
            this.cabinClassName = builder.cabinClassName;
            this.depAirportInfo = builder.depAirportInfo;
            this.depCityCode = builder.depCityCode;
            this.depTime = builder.depTime;
            this.duration = builder.duration;
            this.flightNo = builder.flightNo;
            this.flightShareInfo = builder.flightShareInfo;
            this.flightSize = builder.flightSize;
            this.flightStopInfo = builder.flightStopInfo;
            this.flightTransferInfo = builder.flightTransferInfo;
            this.flightType = builder.flightType;
            this.journeySeq = builder.journeySeq;
            this.leftNum = builder.leftNum;
            this.manufacturer = builder.manufacturer;
            this.mealDesc = builder.mealDesc;
            this.priceInfoDTO = builder.priceInfoDTO;
            this.segmentSeq = builder.segmentSeq;
            this.share = builder.share;
            this.shortFlightSize = builder.shortFlightSize;
            this.spanDay = builder.spanDay;
            this.stop = builder.stop;
            this.transfer = builder.transfer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightList create() {
            return builder().build();
        }

        /**
         * @return airlineInfo
         */
        public TransferFlightListAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        /**
         * @return arrAirportInfo
         */
        public TransferFlightListArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return cabinClass
         */
        public String getCabinClass() {
            return this.cabinClass;
        }

        /**
         * @return cabinClassName
         */
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        /**
         * @return depAirportInfo
         */
        public TransferFlightListDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
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
        public TransferFlightListFlightShareInfo getFlightShareInfo() {
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
        public TransferFlightListFlightStopInfo getFlightStopInfo() {
            return this.flightStopInfo;
        }

        /**
         * @return flightTransferInfo
         */
        public TransferFlightListFlightTransferInfo getFlightTransferInfo() {
            return this.flightTransferInfo;
        }

        /**
         * @return flightType
         */
        public String getFlightType() {
            return this.flightType;
        }

        /**
         * @return journeySeq
         */
        public Integer getJourneySeq() {
            return this.journeySeq;
        }

        /**
         * @return leftNum
         */
        public String getLeftNum() {
            return this.leftNum;
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
         * @return priceInfoDTO
         */
        public TransferFlightListPriceInfoDTO getPriceInfoDTO() {
            return this.priceInfoDTO;
        }

        /**
         * @return segmentSeq
         */
        public Integer getSegmentSeq() {
            return this.segmentSeq;
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
         * @return spanDay
         */
        public String getSpanDay() {
            return this.spanDay;
        }

        /**
         * @return stop
         */
        public Boolean getStop() {
            return this.stop;
        }

        /**
         * @return transfer
         */
        public Boolean getTransfer() {
            return this.transfer;
        }

        public static final class Builder {
            private TransferFlightListAirlineInfo airlineInfo; 
            private TransferFlightListArrAirportInfo arrAirportInfo; 
            private String arrCityCode; 
            private String arrTime; 
            private String cabinClass; 
            private String cabinClassName; 
            private TransferFlightListDepAirportInfo depAirportInfo; 
            private String depCityCode; 
            private String depTime; 
            private Integer duration; 
            private String flightNo; 
            private TransferFlightListFlightShareInfo flightShareInfo; 
            private String flightSize; 
            private TransferFlightListFlightStopInfo flightStopInfo; 
            private TransferFlightListFlightTransferInfo flightTransferInfo; 
            private String flightType; 
            private Integer journeySeq; 
            private String leftNum; 
            private String manufacturer; 
            private String mealDesc; 
            private TransferFlightListPriceInfoDTO priceInfoDTO; 
            private Integer segmentSeq; 
            private Boolean share; 
            private String shortFlightSize; 
            private String spanDay; 
            private Boolean stop; 
            private Boolean transfer; 

            /**
             * airline_info.
             */
            public Builder airlineInfo(TransferFlightListAirlineInfo airlineInfo) {
                this.airlineInfo = airlineInfo;
                return this;
            }

            /**
             * arr_airport_info.
             */
            public Builder arrAirportInfo(TransferFlightListArrAirportInfo arrAirportInfo) {
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
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * cabinClass.
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * cabinClassName.
             */
            public Builder cabinClassName(String cabinClassName) {
                this.cabinClassName = cabinClassName;
                return this;
            }

            /**
             * dep_airport_info.
             */
            public Builder depAirportInfo(TransferFlightListDepAirportInfo depAirportInfo) {
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
            public Builder flightShareInfo(TransferFlightListFlightShareInfo flightShareInfo) {
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
            public Builder flightStopInfo(TransferFlightListFlightStopInfo flightStopInfo) {
                this.flightStopInfo = flightStopInfo;
                return this;
            }

            /**
             * flight_transfer_info.
             */
            public Builder flightTransferInfo(TransferFlightListFlightTransferInfo flightTransferInfo) {
                this.flightTransferInfo = flightTransferInfo;
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
             * journey_seq.
             */
            public Builder journeySeq(Integer journeySeq) {
                this.journeySeq = journeySeq;
                return this;
            }

            /**
             * left_num.
             */
            public Builder leftNum(String leftNum) {
                this.leftNum = leftNum;
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
             * price_info_d_t_o.
             */
            public Builder priceInfoDTO(TransferFlightListPriceInfoDTO priceInfoDTO) {
                this.priceInfoDTO = priceInfoDTO;
                return this;
            }

            /**
             * segment_seq.
             */
            public Builder segmentSeq(Integer segmentSeq) {
                this.segmentSeq = segmentSeq;
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
             * span_day.
             */
            public Builder spanDay(String spanDay) {
                this.spanDay = spanDay;
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
             * transfer.
             */
            public Builder transfer(Boolean transfer) {
                this.transfer = transfer;
                return this;
            }

            public TransferFlightList build() {
                return new TransferFlightList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightModifyListingSearchV2ResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("direct_flight_list")
        private java.util.List<DirectFlightList> directFlightList;

        @com.aliyun.core.annotation.NameInMap("next_req_wait_time")
        private Long nextReqWaitTime;

        @com.aliyun.core.annotation.NameInMap("retry")
        private Boolean retry;

        @com.aliyun.core.annotation.NameInMap("search_retry_token")
        private String searchRetryToken;

        @com.aliyun.core.annotation.NameInMap("session_id")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("transfer_flight_list")
        private java.util.List<TransferFlightList> transferFlightList;

        @com.aliyun.core.annotation.NameInMap("transfer_title")
        private String transferTitle;

        private Module(Builder builder) {
            this.directFlightList = builder.directFlightList;
            this.nextReqWaitTime = builder.nextReqWaitTime;
            this.retry = builder.retry;
            this.searchRetryToken = builder.searchRetryToken;
            this.sessionId = builder.sessionId;
            this.transferFlightList = builder.transferFlightList;
            this.transferTitle = builder.transferTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return directFlightList
         */
        public java.util.List<DirectFlightList> getDirectFlightList() {
            return this.directFlightList;
        }

        /**
         * @return nextReqWaitTime
         */
        public Long getNextReqWaitTime() {
            return this.nextReqWaitTime;
        }

        /**
         * @return retry
         */
        public Boolean getRetry() {
            return this.retry;
        }

        /**
         * @return searchRetryToken
         */
        public String getSearchRetryToken() {
            return this.searchRetryToken;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return transferFlightList
         */
        public java.util.List<TransferFlightList> getTransferFlightList() {
            return this.transferFlightList;
        }

        /**
         * @return transferTitle
         */
        public String getTransferTitle() {
            return this.transferTitle;
        }

        public static final class Builder {
            private java.util.List<DirectFlightList> directFlightList; 
            private Long nextReqWaitTime; 
            private Boolean retry; 
            private String searchRetryToken; 
            private String sessionId; 
            private java.util.List<TransferFlightList> transferFlightList; 
            private String transferTitle; 

            /**
             * direct_flight_list.
             */
            public Builder directFlightList(java.util.List<DirectFlightList> directFlightList) {
                this.directFlightList = directFlightList;
                return this;
            }

            /**
             * next_req_wait_time.
             */
            public Builder nextReqWaitTime(Long nextReqWaitTime) {
                this.nextReqWaitTime = nextReqWaitTime;
                return this;
            }

            /**
             * retry.
             */
            public Builder retry(Boolean retry) {
                this.retry = retry;
                return this;
            }

            /**
             * search_retry_token.
             */
            public Builder searchRetryToken(String searchRetryToken) {
                this.searchRetryToken = searchRetryToken;
                return this;
            }

            /**
             * session_id.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * transfer_flight_list.
             */
            public Builder transferFlightList(java.util.List<TransferFlightList> transferFlightList) {
                this.transferFlightList = transferFlightList;
                return this;
            }

            /**
             * transfer_title.
             */
            public Builder transferTitle(String transferTitle) {
                this.transferTitle = transferTitle;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
