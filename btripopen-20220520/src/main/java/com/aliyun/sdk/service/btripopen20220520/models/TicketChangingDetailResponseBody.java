// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TicketChangingDetailResponseBody} extends {@link TeaModel}
 *
 * <p>TicketChangingDetailResponseBody</p>
 */
public class TicketChangingDetailResponseBody extends TeaModel {
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

    private TicketChangingDetailResponseBody(Builder builder) {
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

    public static TicketChangingDetailResponseBody create() {
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

        public TicketChangingDetailResponseBody build() {
            return new TicketChangingDetailResponseBody(this);
        } 

    } 

    public static class FlightInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_name")
        private String airlineName;

        @com.aliyun.core.annotation.NameInMap("airline_simple_name")
        private String airlineSimpleName;

        @com.aliyun.core.annotation.NameInMap("arr_airport")
        private String arrAirport;

        @com.aliyun.core.annotation.NameInMap("arr_airport_code")
        private String arrAirportCode;

        @com.aliyun.core.annotation.NameInMap("arr_airport_code_name")
        private String arrAirportCodeName;

        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_terminal")
        private String arrTerminal;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("baggage")
        private String baggage;

        @com.aliyun.core.annotation.NameInMap("build_price")
        private Long buildPrice;

        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("carrier")
        private String carrier;

        @com.aliyun.core.annotation.NameInMap("dep_airport")
        private String depAirport;

        @com.aliyun.core.annotation.NameInMap("dep_airport_code")
        private String depAirportCode;

        @com.aliyun.core.annotation.NameInMap("dep_airport_code_name")
        private String depAirportCodeName;

        @com.aliyun.core.annotation.NameInMap("dep_city")
        private String depCity;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_terminal")
        private String depTerminal;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("last_cabin")
        private String lastCabin;

        @com.aliyun.core.annotation.NameInMap("last_flight_no")
        private String lastFlightNo;

        @com.aliyun.core.annotation.NameInMap("meal")
        private String meal;

        @com.aliyun.core.annotation.NameInMap("oil_price")
        private Long oilPrice;

        @com.aliyun.core.annotation.NameInMap("segment_type")
        private Integer segmentType;

        @com.aliyun.core.annotation.NameInMap("stop_arr_time")
        private String stopArrTime;

        @com.aliyun.core.annotation.NameInMap("stop_city")
        private String stopCity;

        @com.aliyun.core.annotation.NameInMap("stop_dep_time")
        private String stopDepTime;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Long ticketPrice;

        @com.aliyun.core.annotation.NameInMap("tuigaiqian_info")
        private String tuigaiqianInfo;

        private FlightInfoList(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.airlineSimpleName = builder.airlineSimpleName;
            this.arrAirport = builder.arrAirport;
            this.arrAirportCode = builder.arrAirportCode;
            this.arrAirportCodeName = builder.arrAirportCodeName;
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrTerminal = builder.arrTerminal;
            this.arrTime = builder.arrTime;
            this.baggage = builder.baggage;
            this.buildPrice = builder.buildPrice;
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.carrier = builder.carrier;
            this.depAirport = builder.depAirport;
            this.depAirportCode = builder.depAirportCode;
            this.depAirportCodeName = builder.depAirportCodeName;
            this.depCity = builder.depCity;
            this.depCityCode = builder.depCityCode;
            this.depTerminal = builder.depTerminal;
            this.depTime = builder.depTime;
            this.flightNo = builder.flightNo;
            this.lastCabin = builder.lastCabin;
            this.lastFlightNo = builder.lastFlightNo;
            this.meal = builder.meal;
            this.oilPrice = builder.oilPrice;
            this.segmentType = builder.segmentType;
            this.stopArrTime = builder.stopArrTime;
            this.stopCity = builder.stopCity;
            this.stopDepTime = builder.stopDepTime;
            this.ticketPrice = builder.ticketPrice;
            this.tuigaiqianInfo = builder.tuigaiqianInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightInfoList create() {
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
         * @return airlineSimpleName
         */
        public String getAirlineSimpleName() {
            return this.airlineSimpleName;
        }

        /**
         * @return arrAirport
         */
        public String getArrAirport() {
            return this.arrAirport;
        }

        /**
         * @return arrAirportCode
         */
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        /**
         * @return arrAirportCodeName
         */
        public String getArrAirportCodeName() {
            return this.arrAirportCodeName;
        }

        /**
         * @return arrCity
         */
        public String getArrCity() {
            return this.arrCity;
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return arrTerminal
         */
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return baggage
         */
        public String getBaggage() {
            return this.baggage;
        }

        /**
         * @return buildPrice
         */
        public Long getBuildPrice() {
            return this.buildPrice;
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
         * @return carrier
         */
        public String getCarrier() {
            return this.carrier;
        }

        /**
         * @return depAirport
         */
        public String getDepAirport() {
            return this.depAirport;
        }

        /**
         * @return depAirportCode
         */
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        /**
         * @return depAirportCodeName
         */
        public String getDepAirportCodeName() {
            return this.depAirportCodeName;
        }

        /**
         * @return depCity
         */
        public String getDepCity() {
            return this.depCity;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return depTerminal
         */
        public String getDepTerminal() {
            return this.depTerminal;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return lastCabin
         */
        public String getLastCabin() {
            return this.lastCabin;
        }

        /**
         * @return lastFlightNo
         */
        public String getLastFlightNo() {
            return this.lastFlightNo;
        }

        /**
         * @return meal
         */
        public String getMeal() {
            return this.meal;
        }

        /**
         * @return oilPrice
         */
        public Long getOilPrice() {
            return this.oilPrice;
        }

        /**
         * @return segmentType
         */
        public Integer getSegmentType() {
            return this.segmentType;
        }

        /**
         * @return stopArrTime
         */
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        /**
         * @return stopCity
         */
        public String getStopCity() {
            return this.stopCity;
        }

        /**
         * @return stopDepTime
         */
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        /**
         * @return ticketPrice
         */
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return tuigaiqianInfo
         */
        public String getTuigaiqianInfo() {
            return this.tuigaiqianInfo;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private String airlineSimpleName; 
            private String arrAirport; 
            private String arrAirportCode; 
            private String arrAirportCodeName; 
            private String arrCity; 
            private String arrCityCode; 
            private String arrTerminal; 
            private String arrTime; 
            private String baggage; 
            private Long buildPrice; 
            private String cabin; 
            private String cabinClass; 
            private String carrier; 
            private String depAirport; 
            private String depAirportCode; 
            private String depAirportCodeName; 
            private String depCity; 
            private String depCityCode; 
            private String depTerminal; 
            private String depTime; 
            private String flightNo; 
            private String lastCabin; 
            private String lastFlightNo; 
            private String meal; 
            private Long oilPrice; 
            private Integer segmentType; 
            private String stopArrTime; 
            private String stopCity; 
            private String stopDepTime; 
            private Long ticketPrice; 
            private String tuigaiqianInfo; 

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
             * airline_simple_name.
             */
            public Builder airlineSimpleName(String airlineSimpleName) {
                this.airlineSimpleName = airlineSimpleName;
                return this;
            }

            /**
             * arr_airport.
             */
            public Builder arrAirport(String arrAirport) {
                this.arrAirport = arrAirport;
                return this;
            }

            /**
             * arr_airport_code.
             */
            public Builder arrAirportCode(String arrAirportCode) {
                this.arrAirportCode = arrAirportCode;
                return this;
            }

            /**
             * arr_airport_code_name.
             */
            public Builder arrAirportCodeName(String arrAirportCodeName) {
                this.arrAirportCodeName = arrAirportCodeName;
                return this;
            }

            /**
             * arr_city.
             */
            public Builder arrCity(String arrCity) {
                this.arrCity = arrCity;
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
             * arr_terminal.
             */
            public Builder arrTerminal(String arrTerminal) {
                this.arrTerminal = arrTerminal;
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
             * baggage.
             */
            public Builder baggage(String baggage) {
                this.baggage = baggage;
                return this;
            }

            /**
             * build_price.
             */
            public Builder buildPrice(Long buildPrice) {
                this.buildPrice = buildPrice;
                return this;
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
             * carrier.
             */
            public Builder carrier(String carrier) {
                this.carrier = carrier;
                return this;
            }

            /**
             * dep_airport.
             */
            public Builder depAirport(String depAirport) {
                this.depAirport = depAirport;
                return this;
            }

            /**
             * dep_airport_code.
             */
            public Builder depAirportCode(String depAirportCode) {
                this.depAirportCode = depAirportCode;
                return this;
            }

            /**
             * dep_airport_code_name.
             */
            public Builder depAirportCodeName(String depAirportCodeName) {
                this.depAirportCodeName = depAirportCodeName;
                return this;
            }

            /**
             * dep_city.
             */
            public Builder depCity(String depCity) {
                this.depCity = depCity;
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
             * dep_terminal.
             */
            public Builder depTerminal(String depTerminal) {
                this.depTerminal = depTerminal;
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
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            /**
             * last_cabin.
             */
            public Builder lastCabin(String lastCabin) {
                this.lastCabin = lastCabin;
                return this;
            }

            /**
             * last_flight_no.
             */
            public Builder lastFlightNo(String lastFlightNo) {
                this.lastFlightNo = lastFlightNo;
                return this;
            }

            /**
             * meal.
             */
            public Builder meal(String meal) {
                this.meal = meal;
                return this;
            }

            /**
             * oil_price.
             */
            public Builder oilPrice(Long oilPrice) {
                this.oilPrice = oilPrice;
                return this;
            }

            /**
             * segment_type.
             */
            public Builder segmentType(Integer segmentType) {
                this.segmentType = segmentType;
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
             * stop_city.
             */
            public Builder stopCity(String stopCity) {
                this.stopCity = stopCity;
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
             * ticket_price.
             */
            public Builder ticketPrice(Long ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * tuigaiqian_info.
             */
            public Builder tuigaiqianInfo(String tuigaiqianInfo) {
                this.tuigaiqianInfo = tuigaiqianInfo;
                return this;
            }

            public FlightInfoList build() {
                return new FlightInfoList(this);
            } 

        } 

    }
    public static class TravelerInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birth_date")
        private String birthDate;

        @com.aliyun.core.annotation.NameInMap("cert_no")
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("cert_type")
        private String certType;

        @com.aliyun.core.annotation.NameInMap("open_ticket_status")
        private Integer openTicketStatus;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        private String passengerName;

        @com.aliyun.core.annotation.NameInMap("passenger_type")
        private String passengerType;

        @com.aliyun.core.annotation.NameInMap("phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private TravelerInfoList(Builder builder) {
            this.birthDate = builder.birthDate;
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.openTicketStatus = builder.openTicketStatus;
            this.passengerName = builder.passengerName;
            this.passengerType = builder.passengerType;
            this.phone = builder.phone;
            this.ticketNo = builder.ticketNo;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TravelerInfoList create() {
            return builder().build();
        }

        /**
         * @return birthDate
         */
        public String getBirthDate() {
            return this.birthDate;
        }

        /**
         * @return certNo
         */
        public String getCertNo() {
            return this.certNo;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return openTicketStatus
         */
        public Integer getOpenTicketStatus() {
            return this.openTicketStatus;
        }

        /**
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        /**
         * @return passengerType
         */
        public String getPassengerType() {
            return this.passengerType;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String birthDate; 
            private String certNo; 
            private String certType; 
            private Integer openTicketStatus; 
            private String passengerName; 
            private String passengerType; 
            private String phone; 
            private String ticketNo; 
            private String userId; 

            /**
             * birth_date.
             */
            public Builder birthDate(String birthDate) {
                this.birthDate = birthDate;
                return this;
            }

            /**
             * cert_no.
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * cert_type.
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * open_ticket_status.
             */
            public Builder openTicketStatus(Integer openTicketStatus) {
                this.openTicketStatus = openTicketStatus;
                return this;
            }

            /**
             * passenger_name.
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
                return this;
            }

            /**
             * passenger_type.
             */
            public Builder passengerType(String passengerType) {
                this.passengerType = passengerType;
                return this;
            }

            /**
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
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
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TravelerInfoList build() {
                return new TravelerInfoList(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alipay_trade_no")
        private String alipayTradeNo;

        @com.aliyun.core.annotation.NameInMap("btrip_order_id")
        private Long btripOrderId;

        @com.aliyun.core.annotation.NameInMap("btrip_sub_order_id")
        private Long btripSubOrderId;

        @com.aliyun.core.annotation.NameInMap("dis_order_id")
        private String disOrderId;

        @com.aliyun.core.annotation.NameInMap("dis_sub_order_id")
        private String disSubOrderId;

        @com.aliyun.core.annotation.NameInMap("extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("flight_info_list")
        private java.util.List < FlightInfoList> flightInfoList;

        @com.aliyun.core.annotation.NameInMap("last_pay_time")
        private String lastPayTime;

        @com.aliyun.core.annotation.NameInMap("pay_status")
        private Integer payStatus;

        @com.aliyun.core.annotation.NameInMap("pay_time")
        private String payTime;

        @com.aliyun.core.annotation.NameInMap("settle_price")
        private Long settlePrice;

        @com.aliyun.core.annotation.NameInMap("settle_type")
        private Integer settleType;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("total_change_price")
        private Long totalChangePrice;

        @com.aliyun.core.annotation.NameInMap("total_price")
        private Long totalPrice;

        @com.aliyun.core.annotation.NameInMap("total_upgrade_price")
        private Long totalUpgradePrice;

        @com.aliyun.core.annotation.NameInMap("traveler_info_list")
        private java.util.List < TravelerInfoList> travelerInfoList;

        private Module(Builder builder) {
            this.alipayTradeNo = builder.alipayTradeNo;
            this.btripOrderId = builder.btripOrderId;
            this.btripSubOrderId = builder.btripSubOrderId;
            this.disOrderId = builder.disOrderId;
            this.disSubOrderId = builder.disSubOrderId;
            this.extra = builder.extra;
            this.flightInfoList = builder.flightInfoList;
            this.lastPayTime = builder.lastPayTime;
            this.payStatus = builder.payStatus;
            this.payTime = builder.payTime;
            this.settlePrice = builder.settlePrice;
            this.settleType = builder.settleType;
            this.status = builder.status;
            this.totalChangePrice = builder.totalChangePrice;
            this.totalPrice = builder.totalPrice;
            this.totalUpgradePrice = builder.totalUpgradePrice;
            this.travelerInfoList = builder.travelerInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return alipayTradeNo
         */
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        /**
         * @return btripOrderId
         */
        public Long getBtripOrderId() {
            return this.btripOrderId;
        }

        /**
         * @return btripSubOrderId
         */
        public Long getBtripSubOrderId() {
            return this.btripSubOrderId;
        }

        /**
         * @return disOrderId
         */
        public String getDisOrderId() {
            return this.disOrderId;
        }

        /**
         * @return disSubOrderId
         */
        public String getDisSubOrderId() {
            return this.disSubOrderId;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return flightInfoList
         */
        public java.util.List < FlightInfoList> getFlightInfoList() {
            return this.flightInfoList;
        }

        /**
         * @return lastPayTime
         */
        public String getLastPayTime() {
            return this.lastPayTime;
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
         * @return settlePrice
         */
        public Long getSettlePrice() {
            return this.settlePrice;
        }

        /**
         * @return settleType
         */
        public Integer getSettleType() {
            return this.settleType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return totalChangePrice
         */
        public Long getTotalChangePrice() {
            return this.totalChangePrice;
        }

        /**
         * @return totalPrice
         */
        public Long getTotalPrice() {
            return this.totalPrice;
        }

        /**
         * @return totalUpgradePrice
         */
        public Long getTotalUpgradePrice() {
            return this.totalUpgradePrice;
        }

        /**
         * @return travelerInfoList
         */
        public java.util.List < TravelerInfoList> getTravelerInfoList() {
            return this.travelerInfoList;
        }

        public static final class Builder {
            private String alipayTradeNo; 
            private Long btripOrderId; 
            private Long btripSubOrderId; 
            private String disOrderId; 
            private String disSubOrderId; 
            private String extra; 
            private java.util.List < FlightInfoList> flightInfoList; 
            private String lastPayTime; 
            private Integer payStatus; 
            private String payTime; 
            private Long settlePrice; 
            private Integer settleType; 
            private Integer status; 
            private Long totalChangePrice; 
            private Long totalPrice; 
            private Long totalUpgradePrice; 
            private java.util.List < TravelerInfoList> travelerInfoList; 

            /**
             * alipay_trade_no.
             */
            public Builder alipayTradeNo(String alipayTradeNo) {
                this.alipayTradeNo = alipayTradeNo;
                return this;
            }

            /**
             * btrip_order_id.
             */
            public Builder btripOrderId(Long btripOrderId) {
                this.btripOrderId = btripOrderId;
                return this;
            }

            /**
             * btrip_sub_order_id.
             */
            public Builder btripSubOrderId(Long btripSubOrderId) {
                this.btripSubOrderId = btripSubOrderId;
                return this;
            }

            /**
             * dis_order_id.
             */
            public Builder disOrderId(String disOrderId) {
                this.disOrderId = disOrderId;
                return this;
            }

            /**
             * dis_sub_order_id.
             */
            public Builder disSubOrderId(String disSubOrderId) {
                this.disSubOrderId = disSubOrderId;
                return this;
            }

            /**
             * extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * flight_info_list.
             */
            public Builder flightInfoList(java.util.List < FlightInfoList> flightInfoList) {
                this.flightInfoList = flightInfoList;
                return this;
            }

            /**
             * last_pay_time.
             */
            public Builder lastPayTime(String lastPayTime) {
                this.lastPayTime = lastPayTime;
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
             * settle_price.
             */
            public Builder settlePrice(Long settlePrice) {
                this.settlePrice = settlePrice;
                return this;
            }

            /**
             * settle_type.
             */
            public Builder settleType(Integer settleType) {
                this.settleType = settleType;
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
             * total_change_price.
             */
            public Builder totalChangePrice(Long totalChangePrice) {
                this.totalChangePrice = totalChangePrice;
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
             * total_upgrade_price.
             */
            public Builder totalUpgradePrice(Long totalUpgradePrice) {
                this.totalUpgradePrice = totalUpgradePrice;
                return this;
            }

            /**
             * traveler_info_list.
             */
            public Builder travelerInfoList(java.util.List < TravelerInfoList> travelerInfoList) {
                this.travelerInfoList = travelerInfoList;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
