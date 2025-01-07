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
 * {@link IntlFlightListingSearchResponseBody} extends {@link TeaModel}
 *
 * <p>IntlFlightListingSearchResponseBody</p>
 */
public class IntlFlightListingSearchResponseBody extends TeaModel {
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

    private IntlFlightListingSearchResponseBody(Builder builder) {
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

    public static IntlFlightListingSearchResponseBody create() {
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

        public IntlFlightListingSearchResponseBody build() {
            return new IntlFlightListingSearchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightListingSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightListingSearchResponseBody</p>
     */
    public static class BestPriceItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agreement_price_codes")
        private java.util.List<String> agreementPriceCodes;

        @com.aliyun.core.annotation.NameInMap("item_type")
        private String itemType;

        @com.aliyun.core.annotation.NameInMap("shopping_item_map")
        private java.util.Map<String, ModuleFlightItemListBestPriceItemShoppingItemMapValue> shoppingItemMap;

        private BestPriceItem(Builder builder) {
            this.agreementPriceCodes = builder.agreementPriceCodes;
            this.itemType = builder.itemType;
            this.shoppingItemMap = builder.shoppingItemMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BestPriceItem create() {
            return builder().build();
        }

        /**
         * @return agreementPriceCodes
         */
        public java.util.List<String> getAgreementPriceCodes() {
            return this.agreementPriceCodes;
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
        public java.util.Map<String, ModuleFlightItemListBestPriceItemShoppingItemMapValue> getShoppingItemMap() {
            return this.shoppingItemMap;
        }

        public static final class Builder {
            private java.util.List<String> agreementPriceCodes; 
            private String itemType; 
            private java.util.Map<String, ModuleFlightItemListBestPriceItemShoppingItemMapValue> shoppingItemMap; 

            /**
             * agreement_price_codes.
             */
            public Builder agreementPriceCodes(java.util.List<String> agreementPriceCodes) {
                this.agreementPriceCodes = agreementPriceCodes;
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
            public Builder shoppingItemMap(java.util.Map<String, ModuleFlightItemListBestPriceItemShoppingItemMapValue> shoppingItemMap) {
                this.shoppingItemMap = shoppingItemMap;
                return this;
            }

            public BestPriceItem build() {
                return new BestPriceItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightListingSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightListingSearchResponseBody</p>
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
     * {@link IntlFlightListingSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightListingSearchResponseBody</p>
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
     * {@link IntlFlightListingSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightListingSearchResponseBody</p>
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
     * {@link IntlFlightListingSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightListingSearchResponseBody</p>
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
     * {@link IntlFlightListingSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightListingSearchResponseBody</p>
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
     * {@link IntlFlightListingSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightListingSearchResponseBody</p>
     */
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
        private java.util.List<String> stopCityNames;

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
        public java.util.List<String> getStopCityNames() {
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
            private java.util.List<String> stopCityNames; 
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
            public Builder stopCityNames(java.util.List<String> stopCityNames) {
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
    /**
     * 
     * {@link IntlFlightListingSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightListingSearchResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("manufacturer")
        private String manufacturer;

        @com.aliyun.core.annotation.NameInMap("meal_desc")
        private String mealDesc;

        @com.aliyun.core.annotation.NameInMap("miles")
        private Integer miles;

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
            this.manufacturer = builder.manufacturer;
            this.mealDesc = builder.mealDesc;
            this.miles = builder.miles;
            this.onTimeRate = builder.onTimeRate;
            this.oneMore = builder.oneMore;
            this.oneMoreShow = builder.oneMoreShow;
            this.segmentIndex = builder.segmentIndex;
            this.segmentKey = builder.segmentKey;
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
         * @return miles
         */
        public Integer getMiles() {
            return this.miles;
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
            private String manufacturer; 
            private String mealDesc; 
            private Integer miles; 
            private String onTimeRate; 
            private Integer oneMore; 
            private String oneMoreShow; 
            private Integer segmentIndex; 
            private String segmentKey; 
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
             * <p>duration</p>
             * 
             * <strong>example:</strong>
             * <p>140</p>
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
             * miles.
             */
            public Builder miles(Integer miles) {
                this.miles = miles;
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
    /**
     * 
     * {@link IntlFlightListingSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightListingSearchResponseBody</p>
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
             * <p>duration</p>
             * 
             * <strong>example:</strong>
             * <p>140</p>
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
     * {@link IntlFlightListingSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightListingSearchResponseBody</p>
     */
    public static class FlightItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("best_price_item")
        private BestPriceItem bestPriceItem;

        @com.aliyun.core.annotation.NameInMap("flight_journey_infos")
        private java.util.List<FlightJourneyInfos> flightJourneyInfos;

        private FlightItemList(Builder builder) {
            this.bestPriceItem = builder.bestPriceItem;
            this.flightJourneyInfos = builder.flightJourneyInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightItemList create() {
            return builder().build();
        }

        /**
         * @return bestPriceItem
         */
        public BestPriceItem getBestPriceItem() {
            return this.bestPriceItem;
        }

        /**
         * @return flightJourneyInfos
         */
        public java.util.List<FlightJourneyInfos> getFlightJourneyInfos() {
            return this.flightJourneyInfos;
        }

        public static final class Builder {
            private BestPriceItem bestPriceItem; 
            private java.util.List<FlightJourneyInfos> flightJourneyInfos; 

            /**
             * best_price_item.
             */
            public Builder bestPriceItem(BestPriceItem bestPriceItem) {
                this.bestPriceItem = bestPriceItem;
                return this;
            }

            /**
             * flight_journey_infos.
             */
            public Builder flightJourneyInfos(java.util.List<FlightJourneyInfos> flightJourneyInfos) {
                this.flightJourneyInfos = flightJourneyInfos;
                return this;
            }

            public FlightItemList build() {
                return new FlightItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightListingSearchResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightListingSearchResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flight_item_list")
        private java.util.List<FlightItemList> flightItemList;

        @com.aliyun.core.annotation.NameInMap("need_continue")
        private Boolean needContinue;

        @com.aliyun.core.annotation.NameInMap("query_record_id")
        private String queryRecordId;

        @com.aliyun.core.annotation.NameInMap("token")
        private String token;

        private Module(Builder builder) {
            this.flightItemList = builder.flightItemList;
            this.needContinue = builder.needContinue;
            this.queryRecordId = builder.queryRecordId;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return flightItemList
         */
        public java.util.List<FlightItemList> getFlightItemList() {
            return this.flightItemList;
        }

        /**
         * @return needContinue
         */
        public Boolean getNeedContinue() {
            return this.needContinue;
        }

        /**
         * @return queryRecordId
         */
        public String getQueryRecordId() {
            return this.queryRecordId;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private java.util.List<FlightItemList> flightItemList; 
            private Boolean needContinue; 
            private String queryRecordId; 
            private String token; 

            /**
             * flight_item_list.
             */
            public Builder flightItemList(java.util.List<FlightItemList> flightItemList) {
                this.flightItemList = flightItemList;
                return this;
            }

            /**
             * need_continue.
             */
            public Builder needContinue(Boolean needContinue) {
                this.needContinue = needContinue;
                return this;
            }

            /**
             * query_record_id.
             */
            public Builder queryRecordId(String queryRecordId) {
                this.queryRecordId = queryRecordId;
                return this;
            }

            /**
             * token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
