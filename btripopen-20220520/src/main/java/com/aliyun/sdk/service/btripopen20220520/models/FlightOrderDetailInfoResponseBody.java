// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightOrderDetailInfoResponseBody} extends {@link TeaModel}
 *
 * <p>FlightOrderDetailInfoResponseBody</p>
 */
public class FlightOrderDetailInfoResponseBody extends TeaModel {
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

    private FlightOrderDetailInfoResponseBody(Builder builder) {
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

    public static FlightOrderDetailInfoResponseBody create() {
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

        public FlightOrderDetailInfoResponseBody build() {
            return new FlightOrderDetailInfoResponseBody(this);
        } 

    } 

    public static class FlightInfoList extends TeaModel {
        @NameInMap("airline_code")
        private String airlineCode;

        @NameInMap("airline_name")
        private String airlineName;

        @NameInMap("airline_simple_name")
        private String airlineSimpleName;

        @NameInMap("arr_airport")
        private String arrAirport;

        @NameInMap("arr_airport_code")
        private String arrAirportCode;

        @NameInMap("arr_airport_code_name")
        private String arrAirportCodeName;

        @NameInMap("arr_city")
        private String arrCity;

        @NameInMap("arr_city_code")
        private String arrCityCode;

        @NameInMap("arr_terminal")
        private String arrTerminal;

        @NameInMap("arr_time")
        private String arrTime;

        @NameInMap("baggage")
        private String baggage;

        @NameInMap("build_price")
        private Long buildPrice;

        @NameInMap("cabin")
        private String cabin;

        @NameInMap("cabin_class")
        private String cabinClass;

        @NameInMap("carrier")
        private String carrier;

        @NameInMap("dep_airport")
        private String depAirport;

        @NameInMap("dep_airport_code")
        private String depAirportCode;

        @NameInMap("dep_airport_code_name")
        private String depAirportCodeName;

        @NameInMap("dep_city")
        private String depCity;

        @NameInMap("dep_city_code")
        private String depCityCode;

        @NameInMap("dep_terminal")
        private String depTerminal;

        @NameInMap("dep_time")
        private String depTime;

        @NameInMap("flight_no")
        private String flightNo;

        @NameInMap("last_cabin")
        private String lastCabin;

        @NameInMap("last_flight_no")
        private String lastFlightNo;

        @NameInMap("meal")
        private String meal;

        @NameInMap("oil_price")
        private Long oilPrice;

        @NameInMap("segment_type")
        private Integer segmentType;

        @NameInMap("stop_arr_time")
        private String stopArrTime;

        @NameInMap("stop_city")
        private String stopCity;

        @NameInMap("stop_dep_time")
        private String stopDepTime;

        @NameInMap("ticket_price")
        private Long ticketPrice;

        @NameInMap("tuigaiqian_info")
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
             * 航司二字码
             */
            public Builder airlineCode(String airlineCode) {
                this.airlineCode = airlineCode;
                return this;
            }

            /**
             * 航司名称
             */
            public Builder airlineName(String airlineName) {
                this.airlineName = airlineName;
                return this;
            }

            /**
             * 航司简称
             */
            public Builder airlineSimpleName(String airlineSimpleName) {
                this.airlineSimpleName = airlineSimpleName;
                return this;
            }

            /**
             * 到达机场
             */
            public Builder arrAirport(String arrAirport) {
                this.arrAirport = arrAirport;
                return this;
            }

            /**
             * 到达机场三字码
             */
            public Builder arrAirportCode(String arrAirportCode) {
                this.arrAirportCode = arrAirportCode;
                return this;
            }

            /**
             * 机场名称
             */
            public Builder arrAirportCodeName(String arrAirportCodeName) {
                this.arrAirportCodeName = arrAirportCodeName;
                return this;
            }

            /**
             * 到达城市
             */
            public Builder arrCity(String arrCity) {
                this.arrCity = arrCity;
                return this;
            }

            /**
             * 到达城市三字码
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * 达到航站楼
             */
            public Builder arrTerminal(String arrTerminal) {
                this.arrTerminal = arrTerminal;
                return this;
            }

            /**
             * 到达时间
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * 行李额描述
             */
            public Builder baggage(String baggage) {
                this.baggage = baggage;
                return this;
            }

            /**
             * 机建费
             */
            public Builder buildPrice(Long buildPrice) {
                this.buildPrice = buildPrice;
                return this;
            }

            /**
             * 舱位代码
             */
            public Builder cabin(String cabin) {
                this.cabin = cabin;
                return this;
            }

            /**
             * 舱等描述
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * 承运航班号
             */
            public Builder carrier(String carrier) {
                this.carrier = carrier;
                return this;
            }

            /**
             * 出发机场
             */
            public Builder depAirport(String depAirport) {
                this.depAirport = depAirport;
                return this;
            }

            /**
             * 起飞机场三字码
             */
            public Builder depAirportCode(String depAirportCode) {
                this.depAirportCode = depAirportCode;
                return this;
            }

            /**
             * 机场名称
             */
            public Builder depAirportCodeName(String depAirportCodeName) {
                this.depAirportCodeName = depAirportCodeName;
                return this;
            }

            /**
             * 出发城市
             */
            public Builder depCity(String depCity) {
                this.depCity = depCity;
                return this;
            }

            /**
             * 出发城市三字码
             */
            public Builder depCityCode(String depCityCode) {
                this.depCityCode = depCityCode;
                return this;
            }

            /**
             * 出发航站楼
             */
            public Builder depTerminal(String depTerminal) {
                this.depTerminal = depTerminal;
                return this;
            }

            /**
             * 出发时间
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * 航班号
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            /**
             * 改签前舱位
             */
            public Builder lastCabin(String lastCabin) {
                this.lastCabin = lastCabin;
                return this;
            }

            /**
             * 改签前航班
             */
            public Builder lastFlightNo(String lastFlightNo) {
                this.lastFlightNo = lastFlightNo;
                return this;
            }

            /**
             * 餐食类型
             */
            public Builder meal(String meal) {
                this.meal = meal;
                return this;
            }

            /**
             * 燃油费
             */
            public Builder oilPrice(Long oilPrice) {
                this.oilPrice = oilPrice;
                return this;
            }

            /**
             * 航程类型
             */
            public Builder segmentType(Integer segmentType) {
                this.segmentType = segmentType;
                return this;
            }

            /**
             * 经停到达时间
             */
            public Builder stopArrTime(String stopArrTime) {
                this.stopArrTime = stopArrTime;
                return this;
            }

            /**
             * 经停城市
             */
            public Builder stopCity(String stopCity) {
                this.stopCity = stopCity;
                return this;
            }

            /**
             * 经停出发时间
             */
            public Builder stopDepTime(String stopDepTime) {
                this.stopDepTime = stopDepTime;
                return this;
            }

            /**
             * 票价
             */
            public Builder ticketPrice(Long ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * 改签后的退改签文案
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
    public static class TicketInfoList extends TeaModel {
        @NameInMap("open_ticket_status")
        private String openTicketStatus;

        @NameInMap("pnr_code")
        private String pnrCode;

        @NameInMap("ticket_no")
        private String ticketNo;

        @NameInMap("ticket_status")
        private String ticketStatus;

        private TicketInfoList(Builder builder) {
            this.openTicketStatus = builder.openTicketStatus;
            this.pnrCode = builder.pnrCode;
            this.ticketNo = builder.ticketNo;
            this.ticketStatus = builder.ticketStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TicketInfoList create() {
            return builder().build();
        }

        /**
         * @return openTicketStatus
         */
        public String getOpenTicketStatus() {
            return this.openTicketStatus;
        }

        /**
         * @return pnrCode
         */
        public String getPnrCode() {
            return this.pnrCode;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        /**
         * @return ticketStatus
         */
        public String getTicketStatus() {
            return this.ticketStatus;
        }

        public static final class Builder {
            private String openTicketStatus; 
            private String pnrCode; 
            private String ticketNo; 
            private String ticketStatus; 

            /**
             * openTicket状态
             */
            public Builder openTicketStatus(String openTicketStatus) {
                this.openTicketStatus = openTicketStatus;
                return this;
            }

            /**
             * pnr编码
             */
            public Builder pnrCode(String pnrCode) {
                this.pnrCode = pnrCode;
                return this;
            }

            /**
             * 票号
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            /**
             * 票状态
             */
            public Builder ticketStatus(String ticketStatus) {
                this.ticketStatus = ticketStatus;
                return this;
            }

            public TicketInfoList build() {
                return new TicketInfoList(this);
            } 

        } 

    }
    public static class TravelerInfoList extends TeaModel {
        @NameInMap("birth_date")
        private String birthDate;

        @NameInMap("cert_no")
        private String certNo;

        @NameInMap("cert_type")
        private String certType;

        @NameInMap("open_ticket_status")
        private Integer openTicketStatus;

        @NameInMap("passenger_name")
        private String passengerName;

        @NameInMap("passenger_type")
        private String passengerType;

        @NameInMap("phone")
        private String phone;

        @NameInMap("ticket_no")
        private String ticketNo;

        @NameInMap("user_id")
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
             * 出生日期
             */
            public Builder birthDate(String birthDate) {
                this.birthDate = birthDate;
                return this;
            }

            /**
             * 证件号
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * 证件类型
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * 票状态
             */
            public Builder openTicketStatus(Integer openTicketStatus) {
                this.openTicketStatus = openTicketStatus;
                return this;
            }

            /**
             * 姓名
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
                return this;
            }

            /**
             * 乘客类型
             */
            public Builder passengerType(String passengerType) {
                this.passengerType = passengerType;
                return this;
            }

            /**
             * 手机号
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * 票号
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            /**
             * 员工编号
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
        @NameInMap("alipay_trade_no")
        private String alipayTradeNo;

        @NameInMap("book_user_id")
        private String bookUserId;

        @NameInMap("btrip_order_id")
        private Long btripOrderId;

        @NameInMap("contact_name")
        private String contactName;

        @NameInMap("contact_phone")
        private String contactPhone;

        @NameInMap("dis_order_id")
        private String disOrderId;

        @NameInMap("extra")
        private String extra;

        @NameInMap("flight_info_list")
        private java.util.List < FlightInfoList> flightInfoList;

        @NameInMap("last_pay_time")
        private String lastPayTime;

        @NameInMap("pay_status")
        private Integer payStatus;

        @NameInMap("pay_time")
        private String payTime;

        @NameInMap("promotion_price")
        private Long promotionPrice;

        @NameInMap("settle_amount")
        private Long settleAmount;

        @NameInMap("settle_type")
        private Integer settleType;

        @NameInMap("status")
        private Integer status;

        @NameInMap("ticket_info_list")
        private java.util.List < TicketInfoList> ticketInfoList;

        @NameInMap("total_build_price")
        private Long totalBuildPrice;

        @NameInMap("total_oil_price")
        private Long totalOilPrice;

        @NameInMap("total_order_price")
        private Long totalOrderPrice;

        @NameInMap("traveler_info_list")
        private java.util.List < TravelerInfoList> travelerInfoList;

        private Module(Builder builder) {
            this.alipayTradeNo = builder.alipayTradeNo;
            this.bookUserId = builder.bookUserId;
            this.btripOrderId = builder.btripOrderId;
            this.contactName = builder.contactName;
            this.contactPhone = builder.contactPhone;
            this.disOrderId = builder.disOrderId;
            this.extra = builder.extra;
            this.flightInfoList = builder.flightInfoList;
            this.lastPayTime = builder.lastPayTime;
            this.payStatus = builder.payStatus;
            this.payTime = builder.payTime;
            this.promotionPrice = builder.promotionPrice;
            this.settleAmount = builder.settleAmount;
            this.settleType = builder.settleType;
            this.status = builder.status;
            this.ticketInfoList = builder.ticketInfoList;
            this.totalBuildPrice = builder.totalBuildPrice;
            this.totalOilPrice = builder.totalOilPrice;
            this.totalOrderPrice = builder.totalOrderPrice;
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
         * @return bookUserId
         */
        public String getBookUserId() {
            return this.bookUserId;
        }

        /**
         * @return btripOrderId
         */
        public Long getBtripOrderId() {
            return this.btripOrderId;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return contactPhone
         */
        public String getContactPhone() {
            return this.contactPhone;
        }

        /**
         * @return disOrderId
         */
        public String getDisOrderId() {
            return this.disOrderId;
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
         * @return promotionPrice
         */
        public Long getPromotionPrice() {
            return this.promotionPrice;
        }

        /**
         * @return settleAmount
         */
        public Long getSettleAmount() {
            return this.settleAmount;
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
         * @return ticketInfoList
         */
        public java.util.List < TicketInfoList> getTicketInfoList() {
            return this.ticketInfoList;
        }

        /**
         * @return totalBuildPrice
         */
        public Long getTotalBuildPrice() {
            return this.totalBuildPrice;
        }

        /**
         * @return totalOilPrice
         */
        public Long getTotalOilPrice() {
            return this.totalOilPrice;
        }

        /**
         * @return totalOrderPrice
         */
        public Long getTotalOrderPrice() {
            return this.totalOrderPrice;
        }

        /**
         * @return travelerInfoList
         */
        public java.util.List < TravelerInfoList> getTravelerInfoList() {
            return this.travelerInfoList;
        }

        public static final class Builder {
            private String alipayTradeNo; 
            private String bookUserId; 
            private Long btripOrderId; 
            private String contactName; 
            private String contactPhone; 
            private String disOrderId; 
            private String extra; 
            private java.util.List < FlightInfoList> flightInfoList; 
            private String lastPayTime; 
            private Integer payStatus; 
            private String payTime; 
            private Long promotionPrice; 
            private Long settleAmount; 
            private Integer settleType; 
            private Integer status; 
            private java.util.List < TicketInfoList> ticketInfoList; 
            private Long totalBuildPrice; 
            private Long totalOilPrice; 
            private Long totalOrderPrice; 
            private java.util.List < TravelerInfoList> travelerInfoList; 

            /**
             * 支付交易流水号
             */
            public Builder alipayTradeNo(String alipayTradeNo) {
                this.alipayTradeNo = alipayTradeNo;
                return this;
            }

            /**
             * 预订人id
             */
            public Builder bookUserId(String bookUserId) {
                this.bookUserId = bookUserId;
                return this;
            }

            /**
             * 商旅订单号
             */
            public Builder btripOrderId(Long btripOrderId) {
                this.btripOrderId = btripOrderId;
                return this;
            }

            /**
             * 联系人姓名
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * 联系人电话
             */
            public Builder contactPhone(String contactPhone) {
                this.contactPhone = contactPhone;
                return this;
            }

            /**
             * 分销外部订单号
             */
            public Builder disOrderId(String disOrderId) {
                this.disOrderId = disOrderId;
                return this;
            }

            /**
             * 额外信息
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * 航班信息
             */
            public Builder flightInfoList(java.util.List < FlightInfoList> flightInfoList) {
                this.flightInfoList = flightInfoList;
                return this;
            }

            /**
             * 最迟支付时间
             */
            public Builder lastPayTime(String lastPayTime) {
                this.lastPayTime = lastPayTime;
                return this;
            }

            /**
             * 支付状态
             */
            public Builder payStatus(Integer payStatus) {
                this.payStatus = payStatus;
                return this;
            }

            /**
             * 实际支付时间
             */
            public Builder payTime(String payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * 优惠金额
             */
            public Builder promotionPrice(Long promotionPrice) {
                this.promotionPrice = promotionPrice;
                return this;
            }

            /**
             * 结算金额
             */
            public Builder settleAmount(Long settleAmount) {
                this.settleAmount = settleAmount;
                return this;
            }

            /**
             * 结算类型
             */
            public Builder settleType(Integer settleType) {
                this.settleType = settleType;
                return this;
            }

            /**
             * 订单状态
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 票信息
             */
            public Builder ticketInfoList(java.util.List < TicketInfoList> ticketInfoList) {
                this.ticketInfoList = ticketInfoList;
                return this;
            }

            /**
             * 机建费用
             */
            public Builder totalBuildPrice(Long totalBuildPrice) {
                this.totalBuildPrice = totalBuildPrice;
                return this;
            }

            /**
             * 燃油费用
             */
            public Builder totalOilPrice(Long totalOilPrice) {
                this.totalOilPrice = totalOilPrice;
                return this;
            }

            /**
             * 订单总价
             */
            public Builder totalOrderPrice(Long totalOrderPrice) {
                this.totalOrderPrice = totalOrderPrice;
                return this;
            }

            /**
             * 乘客信息
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
