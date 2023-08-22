// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightModifyListingSearchV2ResponseBody} extends {@link TeaModel}
 *
 * <p>FlightModifyListingSearchV2ResponseBody</p>
 */
public class FlightModifyListingSearchV2ResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
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
         * module
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId
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
         * requestId
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public FlightModifyListingSearchV2ResponseBody build() {
            return new FlightModifyListingSearchV2ResponseBody(this);
        } 

    } 

    public static class AirlineInfo extends TeaModel {
        @NameInMap("airline_chinese_name")
        private String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        private String airlineChineseShortName;

        @NameInMap("airline_code")
        private String airlineCode;

        @NameInMap("airline_icon")
        private String airlineIcon;

        @NameInMap("cheap_flight")
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
        @NameInMap("airport_code")
        private String airportCode;

        @NameInMap("airport_name")
        private String airportName;

        @NameInMap("airport_short_name")
        private String airportShortName;

        @NameInMap("terminal")
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
        @NameInMap("airport_code")
        private String airportCode;

        @NameInMap("airport_name")
        private String airportName;

        @NameInMap("airport_short_name")
        private String airportShortName;

        @NameInMap("terminal")
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
        @NameInMap("airline_chinese_name")
        private String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        private String airlineChineseShortName;

        @NameInMap("airline_code")
        private String airlineCode;

        @NameInMap("airline_icon")
        private String airlineIcon;

        @NameInMap("cheap_flight")
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
        @NameInMap("operating_airline_info")
        private OperatingAirlineInfo operatingAirlineInfo;

        @NameInMap("operating_flight_no")
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
        @NameInMap("stop_airport")
        private String stopAirport;

        @NameInMap("stop_arr_term")
        private String stopArrTerm;

        @NameInMap("stop_arr_time")
        private String stopArrTime;

        @NameInMap("stop_city_code")
        private String stopCityCode;

        @NameInMap("stop_city_name")
        private String stopCityName;

        @NameInMap("stop_dep_term")
        private String stopDepTerm;

        @NameInMap("stop_dep_time")
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
    public static class TransferAirlineInfo extends TeaModel {
        @NameInMap("airline_chinese_name")
        private String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        private String airlineChineseShortName;

        @NameInMap("airline_code")
        private String airlineCode;

        @NameInMap("airline_icon")
        private String airlineIcon;

        @NameInMap("cheap_flight")
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
    public static class FlightTransferInfo extends TeaModel {
        @NameInMap("transfer_airline_info")
        private TransferAirlineInfo transferAirlineInfo;

        @NameInMap("transfer_city_code")
        private String transferCityCode;

        @NameInMap("transfer_city_name")
        private String transferCityName;

        @NameInMap("transfer_dep_time")
        private String transferDepTime;

        @NameInMap("transfer_flight_no")
        private String transferFlightNo;

        @NameInMap("transfer_flight_size")
        private String transferFlightSize;

        @NameInMap("transfer_share")
        private Boolean transferShare;

        @NameInMap("transfer_stop_time")
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
    public static class ReShopPriceInfoDTO extends TeaModel {
        @NameInMap("re_shop_adult_change_fee")
        private Integer reShopAdultChangeFee;

        @NameInMap("re_shop_adult_price")
        private Integer reShopAdultPrice;

        @NameInMap("re_shop_adult_price_gap")
        private Integer reShopAdultPriceGap;

        @NameInMap("re_shop_child_change_fee")
        private Integer reShopChildChangeFee;

        @NameInMap("re_shop_child_price")
        private Integer reShopChildPrice;

        @NameInMap("re_shop_child_price_gap")
        private Integer reShopChildPriceGap;

        @NameInMap("re_shop_inf_change_fee")
        private Integer reShopInfChangeFee;

        @NameInMap("re_shop_inf_price")
        private Integer reShopInfPrice;

        @NameInMap("re_shop_inf_price_gap")
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
    public static class PriceInfoDTO extends TeaModel {
        @NameInMap("adult_price")
        private Integer adultPrice;

        @NameInMap("adult_tax")
        private Integer adultTax;

        @NameInMap("adult_total_price")
        private Integer adultTotalPrice;

        @NameInMap("before_control_price")
        private Integer beforeControlPrice;

        @NameInMap("child_price")
        private Integer childPrice;

        @NameInMap("child_tax")
        private Integer childTax;

        @NameInMap("child_total_price")
        private Integer childTotalPrice;

        @NameInMap("infant_price")
        private Integer infantPrice;

        @NameInMap("infant_tax")
        private Integer infantTax;

        @NameInMap("infant_total_price")
        private Integer infantTotalPrice;

        @NameInMap("original_adult_price")
        private Integer originalAdultPrice;

        @NameInMap("original_adult_total_price")
        private Integer originalAdultTotalPrice;

        @NameInMap("re_shop_price_info_d_t_o")
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
    public static class DirectFlightList extends TeaModel {
        @NameInMap("airline_info")
        private AirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        private ArrAirportInfo arrAirportInfo;

        @NameInMap("arr_city_code")
        private String arrCityCode;

        @NameInMap("arr_time")
        private String arrTime;

        @NameInMap("dep_airport_info")
        private DepAirportInfo depAirportInfo;

        @NameInMap("dep_city_code")
        private String depCityCode;

        @NameInMap("dep_time")
        private String depTime;

        @NameInMap("duration")
        private Integer duration;

        @NameInMap("flight_no")
        private String flightNo;

        @NameInMap("flight_share_info")
        private FlightShareInfo flightShareInfo;

        @NameInMap("flight_size")
        private String flightSize;

        @NameInMap("flight_stop_info")
        private FlightStopInfo flightStopInfo;

        @NameInMap("flight_transfer_info")
        private FlightTransferInfo flightTransferInfo;

        @NameInMap("flight_type")
        private String flightType;

        @NameInMap("journey_seq")
        private Integer journeySeq;

        @NameInMap("left_num")
        private String leftNum;

        @NameInMap("manufacturer")
        private String manufacturer;

        @NameInMap("meal_desc")
        private String mealDesc;

        @NameInMap("price_info_d_t_o")
        private PriceInfoDTO priceInfoDTO;

        @NameInMap("segment_seq")
        private Integer segmentSeq;

        @NameInMap("share")
        private Boolean share;

        @NameInMap("short_flight_size")
        private String shortFlightSize;

        @NameInMap("span_day")
        private String spanDay;

        @NameInMap("stop")
        private Boolean stop;

        @NameInMap("transfer")
        private Boolean transfer;

        private DirectFlightList(Builder builder) {
            this.airlineInfo = builder.airlineInfo;
            this.arrAirportInfo = builder.arrAirportInfo;
            this.arrCityCode = builder.arrCityCode;
            this.arrTime = builder.arrTime;
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
    public static class TransferFlightListAirlineInfo extends TeaModel {
        @NameInMap("airline_chinese_name")
        private String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        private String airlineChineseShortName;

        @NameInMap("airline_code")
        private String airlineCode;

        @NameInMap("airline_icon")
        private String airlineIcon;

        @NameInMap("cheap_flight")
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
    public static class TransferFlightListArrAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        private String airportCode;

        @NameInMap("airport_name")
        private String airportName;

        @NameInMap("airport_short_name")
        private String airportShortName;

        @NameInMap("terminal")
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
    public static class TransferFlightListDepAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        private String airportCode;

        @NameInMap("airport_name")
        private String airportName;

        @NameInMap("airport_short_name")
        private String airportShortName;

        @NameInMap("terminal")
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
    public static class FlightShareInfoOperatingAirlineInfo extends TeaModel {
        @NameInMap("airline_chinese_name")
        private String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        private String airlineChineseShortName;

        @NameInMap("airline_code")
        private String airlineCode;

        @NameInMap("airline_icon")
        private String airlineIcon;

        @NameInMap("cheap_flight")
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
    public static class TransferFlightListFlightShareInfo extends TeaModel {
        @NameInMap("operating_airline_info")
        private FlightShareInfoOperatingAirlineInfo operatingAirlineInfo;

        @NameInMap("operating_flight_no")
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
    public static class TransferFlightListFlightStopInfo extends TeaModel {
        @NameInMap("stop_airport")
        private String stopAirport;

        @NameInMap("stop_arr_term")
        private String stopArrTerm;

        @NameInMap("stop_arr_time")
        private String stopArrTime;

        @NameInMap("stop_city_code")
        private String stopCityCode;

        @NameInMap("stop_city_name")
        private String stopCityName;

        @NameInMap("stop_dep_term")
        private String stopDepTerm;

        @NameInMap("stop_dep_time")
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
    public static class FlightTransferInfoTransferAirlineInfo extends TeaModel {
        @NameInMap("airline_chinese_name")
        private String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        private String airlineChineseShortName;

        @NameInMap("airline_code")
        private String airlineCode;

        @NameInMap("airline_icon")
        private String airlineIcon;

        @NameInMap("cheap_flight")
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
    public static class TransferFlightListFlightTransferInfo extends TeaModel {
        @NameInMap("transfer_airline_info")
        private FlightTransferInfoTransferAirlineInfo transferAirlineInfo;

        @NameInMap("transfer_city_code")
        private String transferCityCode;

        @NameInMap("transfer_city_name")
        private String transferCityName;

        @NameInMap("transfer_dep_time")
        private String transferDepTime;

        @NameInMap("transfer_flight_no")
        private String transferFlightNo;

        @NameInMap("transfer_flight_size")
        private String transferFlightSize;

        @NameInMap("transfer_share")
        private Boolean transferShare;

        @NameInMap("transfer_stop_time")
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
    public static class PriceInfoDTOReShopPriceInfoDTO extends TeaModel {
        @NameInMap("re_shop_adult_change_fee")
        private Integer reShopAdultChangeFee;

        @NameInMap("re_shop_adult_price")
        private Integer reShopAdultPrice;

        @NameInMap("re_shop_adult_price_gap")
        private Integer reShopAdultPriceGap;

        @NameInMap("re_shop_child_change_fee")
        private Integer reShopChildChangeFee;

        @NameInMap("re_shop_child_price")
        private Integer reShopChildPrice;

        @NameInMap("re_shop_child_price_gap")
        private Integer reShopChildPriceGap;

        @NameInMap("re_shop_inf_change_fee")
        private Integer reShopInfChangeFee;

        @NameInMap("re_shop_inf_price")
        private Integer reShopInfPrice;

        @NameInMap("re_shop_inf_price_gap")
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
    public static class TransferFlightListPriceInfoDTO extends TeaModel {
        @NameInMap("adult_price")
        private Integer adultPrice;

        @NameInMap("adult_tax")
        private Integer adultTax;

        @NameInMap("adult_total_price")
        private Integer adultTotalPrice;

        @NameInMap("before_control_price")
        private Integer beforeControlPrice;

        @NameInMap("child_price")
        private Integer childPrice;

        @NameInMap("child_tax")
        private Integer childTax;

        @NameInMap("child_total_price")
        private Integer childTotalPrice;

        @NameInMap("infant_price")
        private Integer infantPrice;

        @NameInMap("infant_tax")
        private Integer infantTax;

        @NameInMap("infant_total_price")
        private Integer infantTotalPrice;

        @NameInMap("original_adult_price")
        private Integer originalAdultPrice;

        @NameInMap("original_adult_total_price")
        private Integer originalAdultTotalPrice;

        @NameInMap("re_shop_price_info_d_t_o")
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
    public static class TransferFlightList extends TeaModel {
        @NameInMap("airline_info")
        private TransferFlightListAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        private TransferFlightListArrAirportInfo arrAirportInfo;

        @NameInMap("arr_city_code")
        private String arrCityCode;

        @NameInMap("arr_time")
        private String arrTime;

        @NameInMap("dep_airport_info")
        private TransferFlightListDepAirportInfo depAirportInfo;

        @NameInMap("dep_city_code")
        private String depCityCode;

        @NameInMap("dep_time")
        private String depTime;

        @NameInMap("duration")
        private Integer duration;

        @NameInMap("flight_no")
        private String flightNo;

        @NameInMap("flight_share_info")
        private TransferFlightListFlightShareInfo flightShareInfo;

        @NameInMap("flight_size")
        private String flightSize;

        @NameInMap("flight_stop_info")
        private TransferFlightListFlightStopInfo flightStopInfo;

        @NameInMap("flight_transfer_info")
        private TransferFlightListFlightTransferInfo flightTransferInfo;

        @NameInMap("flight_type")
        private String flightType;

        @NameInMap("journey_seq")
        private Integer journeySeq;

        @NameInMap("left_num")
        private String leftNum;

        @NameInMap("manufacturer")
        private String manufacturer;

        @NameInMap("meal_desc")
        private String mealDesc;

        @NameInMap("price_info_d_t_o")
        private TransferFlightListPriceInfoDTO priceInfoDTO;

        @NameInMap("segment_seq")
        private Integer segmentSeq;

        @NameInMap("share")
        private Boolean share;

        @NameInMap("short_flight_size")
        private String shortFlightSize;

        @NameInMap("span_day")
        private String spanDay;

        @NameInMap("stop")
        private Boolean stop;

        @NameInMap("transfer")
        private Boolean transfer;

        private TransferFlightList(Builder builder) {
            this.airlineInfo = builder.airlineInfo;
            this.arrAirportInfo = builder.arrAirportInfo;
            this.arrCityCode = builder.arrCityCode;
            this.arrTime = builder.arrTime;
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
    public static class Module extends TeaModel {
        @NameInMap("direct_flight_list")
        private java.util.List < DirectFlightList> directFlightList;

        @NameInMap("session_id")
        private String sessionId;

        @NameInMap("transfer_flight_list")
        private java.util.List < TransferFlightList> transferFlightList;

        @NameInMap("transfer_title")
        private String transferTitle;

        private Module(Builder builder) {
            this.directFlightList = builder.directFlightList;
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
        public java.util.List < DirectFlightList> getDirectFlightList() {
            return this.directFlightList;
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
        public java.util.List < TransferFlightList> getTransferFlightList() {
            return this.transferFlightList;
        }

        /**
         * @return transferTitle
         */
        public String getTransferTitle() {
            return this.transferTitle;
        }

        public static final class Builder {
            private java.util.List < DirectFlightList> directFlightList; 
            private String sessionId; 
            private java.util.List < TransferFlightList> transferFlightList; 
            private String transferTitle; 

            /**
             * direct_flight_list.
             */
            public Builder directFlightList(java.util.List < DirectFlightList> directFlightList) {
                this.directFlightList = directFlightList;
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
            public Builder transferFlightList(java.util.List < TransferFlightList> transferFlightList) {
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
