// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TicketChangingFlightListResponseBody} extends {@link TeaModel}
 *
 * <p>TicketChangingFlightListResponseBody</p>
 */
public class TicketChangingFlightListResponseBody extends TeaModel {
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

    private TicketChangingFlightListResponseBody(Builder builder) {
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

    public static TicketChangingFlightListResponseBody create() {
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

        public TicketChangingFlightListResponseBody build() {
            return new TicketChangingFlightListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TicketChangingFlightListResponseBody} extends {@link TeaModel}
     *
     * <p>TicketChangingFlightListResponseBody</p>
     */
    public static class AirlineInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_name")
        private String airlineName;

        @com.aliyun.core.annotation.NameInMap("airline_simple_name")
        private String airlineSimpleName;

        private AirlineInfo(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.airlineSimpleName = builder.airlineSimpleName;
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
         * @return airlineSimpleName
         */
        public String getAirlineSimpleName() {
            return this.airlineSimpleName;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private String airlineSimpleName; 

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

            public AirlineInfo build() {
                return new AirlineInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketChangingFlightListResponseBody} extends {@link TeaModel}
     *
     * <p>TicketChangingFlightListResponseBody</p>
     */
    public static class ArrAirportInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airport_code")
        private String airportCode;

        @com.aliyun.core.annotation.NameInMap("airport_name")
        private String airportName;

        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("terminal")
        private String terminal;

        private ArrAirportInfo(Builder builder) {
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
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
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
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
            private String cityCode; 
            private String cityName; 
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
             * city_code.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * city_name.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
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
     * {@link TicketChangingFlightListResponseBody} extends {@link TeaModel}
     *
     * <p>TicketChangingFlightListResponseBody</p>
     */
    public static class ModifyPriceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_type")
        private Integer passengerType;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Integer ticketPrice;

        @com.aliyun.core.annotation.NameInMap("upgrade_fee")
        private Integer upgradeFee;

        @com.aliyun.core.annotation.NameInMap("upgrade_price")
        private Integer upgradePrice;

        private ModifyPriceList(Builder builder) {
            this.passengerType = builder.passengerType;
            this.ticketPrice = builder.ticketPrice;
            this.upgradeFee = builder.upgradeFee;
            this.upgradePrice = builder.upgradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyPriceList create() {
            return builder().build();
        }

        /**
         * @return passengerType
         */
        public Integer getPassengerType() {
            return this.passengerType;
        }

        /**
         * @return ticketPrice
         */
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return upgradeFee
         */
        public Integer getUpgradeFee() {
            return this.upgradeFee;
        }

        /**
         * @return upgradePrice
         */
        public Integer getUpgradePrice() {
            return this.upgradePrice;
        }

        public static final class Builder {
            private Integer passengerType; 
            private Integer ticketPrice; 
            private Integer upgradeFee; 
            private Integer upgradePrice; 

            /**
             * passenger_type.
             */
            public Builder passengerType(Integer passengerType) {
                this.passengerType = passengerType;
                return this;
            }

            /**
             * ticket_price.
             */
            public Builder ticketPrice(Integer ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * upgrade_fee.
             */
            public Builder upgradeFee(Integer upgradeFee) {
                this.upgradeFee = upgradeFee;
                return this;
            }

            /**
             * upgrade_price.
             */
            public Builder upgradePrice(Integer upgradePrice) {
                this.upgradePrice = upgradePrice;
                return this;
            }

            public ModifyPriceList build() {
                return new ModifyPriceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketChangingFlightListResponseBody} extends {@link TeaModel}
     *
     * <p>TicketChangingFlightListResponseBody</p>
     */
    public static class CabinList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("cabin_desc")
        private String cabinDesc;

        @com.aliyun.core.annotation.NameInMap("cabin_discount")
        private Integer cabinDiscount;

        @com.aliyun.core.annotation.NameInMap("child_cabin")
        private String childCabin;

        @com.aliyun.core.annotation.NameInMap("left_num")
        private String leftNum;

        @com.aliyun.core.annotation.NameInMap("modify_price_list")
        private java.util.List < ModifyPriceList> modifyPriceList;

        @com.aliyun.core.annotation.NameInMap("ota_itemid")
        private String otaItemid;

        private CabinList(Builder builder) {
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.cabinDesc = builder.cabinDesc;
            this.cabinDiscount = builder.cabinDiscount;
            this.childCabin = builder.childCabin;
            this.leftNum = builder.leftNum;
            this.modifyPriceList = builder.modifyPriceList;
            this.otaItemid = builder.otaItemid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CabinList create() {
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
         * @return cabinDesc
         */
        public String getCabinDesc() {
            return this.cabinDesc;
        }

        /**
         * @return cabinDiscount
         */
        public Integer getCabinDiscount() {
            return this.cabinDiscount;
        }

        /**
         * @return childCabin
         */
        public String getChildCabin() {
            return this.childCabin;
        }

        /**
         * @return leftNum
         */
        public String getLeftNum() {
            return this.leftNum;
        }

        /**
         * @return modifyPriceList
         */
        public java.util.List < ModifyPriceList> getModifyPriceList() {
            return this.modifyPriceList;
        }

        /**
         * @return otaItemid
         */
        public String getOtaItemid() {
            return this.otaItemid;
        }

        public static final class Builder {
            private String cabin; 
            private String cabinClass; 
            private String cabinDesc; 
            private Integer cabinDiscount; 
            private String childCabin; 
            private String leftNum; 
            private java.util.List < ModifyPriceList> modifyPriceList; 
            private String otaItemid; 

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
             * cabin_desc.
             */
            public Builder cabinDesc(String cabinDesc) {
                this.cabinDesc = cabinDesc;
                return this;
            }

            /**
             * cabin_discount.
             */
            public Builder cabinDiscount(Integer cabinDiscount) {
                this.cabinDiscount = cabinDiscount;
                return this;
            }

            /**
             * child_cabin.
             */
            public Builder childCabin(String childCabin) {
                this.childCabin = childCabin;
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
             * modify_price_list.
             */
            public Builder modifyPriceList(java.util.List < ModifyPriceList> modifyPriceList) {
                this.modifyPriceList = modifyPriceList;
                return this;
            }

            /**
             * ota_itemid.
             */
            public Builder otaItemid(String otaItemid) {
                this.otaItemid = otaItemid;
                return this;
            }

            public CabinList build() {
                return new CabinList(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketChangingFlightListResponseBody} extends {@link TeaModel}
     *
     * <p>TicketChangingFlightListResponseBody</p>
     */
    public static class DepAirportInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airport_code")
        private String airportCode;

        @com.aliyun.core.annotation.NameInMap("airport_name")
        private String airportName;

        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("terminal")
        private String terminal;

        private DepAirportInfo(Builder builder) {
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
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
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
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
            private String cityCode; 
            private String cityName; 
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
             * city_code.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * city_name.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
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
     * {@link TicketChangingFlightListResponseBody} extends {@link TeaModel}
     *
     * <p>TicketChangingFlightListResponseBody</p>
     */
    public static class LowestCabinPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_type")
        private Integer passengerType;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Integer ticketPrice;

        @com.aliyun.core.annotation.NameInMap("upgrade_fee")
        private Integer upgradeFee;

        @com.aliyun.core.annotation.NameInMap("upgrade_price")
        private Integer upgradePrice;

        private LowestCabinPrice(Builder builder) {
            this.passengerType = builder.passengerType;
            this.ticketPrice = builder.ticketPrice;
            this.upgradeFee = builder.upgradeFee;
            this.upgradePrice = builder.upgradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LowestCabinPrice create() {
            return builder().build();
        }

        /**
         * @return passengerType
         */
        public Integer getPassengerType() {
            return this.passengerType;
        }

        /**
         * @return ticketPrice
         */
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return upgradeFee
         */
        public Integer getUpgradeFee() {
            return this.upgradeFee;
        }

        /**
         * @return upgradePrice
         */
        public Integer getUpgradePrice() {
            return this.upgradePrice;
        }

        public static final class Builder {
            private Integer passengerType; 
            private Integer ticketPrice; 
            private Integer upgradeFee; 
            private Integer upgradePrice; 

            /**
             * passenger_type.
             */
            public Builder passengerType(Integer passengerType) {
                this.passengerType = passengerType;
                return this;
            }

            /**
             * ticket_price.
             */
            public Builder ticketPrice(Integer ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * upgrade_fee.
             */
            public Builder upgradeFee(Integer upgradeFee) {
                this.upgradeFee = upgradeFee;
                return this;
            }

            /**
             * upgrade_price.
             */
            public Builder upgradePrice(Integer upgradePrice) {
                this.upgradePrice = upgradePrice;
                return this;
            }

            public LowestCabinPrice build() {
                return new LowestCabinPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketChangingFlightListResponseBody} extends {@link TeaModel}
     *
     * <p>TicketChangingFlightListResponseBody</p>
     */
    public static class FlightInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_info")
        private AirlineInfo airlineInfo;

        @com.aliyun.core.annotation.NameInMap("arr_airport_info")
        private ArrAirportInfo arrAirportInfo;

        @com.aliyun.core.annotation.NameInMap("cabin_list")
        private java.util.List < CabinList> cabinList;

        @com.aliyun.core.annotation.NameInMap("carrier_airline")
        private String carrierAirline;

        @com.aliyun.core.annotation.NameInMap("carrier_no")
        private String carrierNo;

        @com.aliyun.core.annotation.NameInMap("dep_airport_info")
        private DepAirportInfo depAirportInfo;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("flight_size")
        private String flightSize;

        @com.aliyun.core.annotation.NameInMap("flight_type")
        private String flightType;

        @com.aliyun.core.annotation.NameInMap("is_protocol")
        private Boolean isProtocol;

        @com.aliyun.core.annotation.NameInMap("is_share")
        private Boolean isShare;

        @com.aliyun.core.annotation.NameInMap("is_stop")
        private Boolean isStop;

        @com.aliyun.core.annotation.NameInMap("lowest_cabin")
        private String lowestCabin;

        @com.aliyun.core.annotation.NameInMap("lowest_cabin_class")
        private String lowestCabinClass;

        @com.aliyun.core.annotation.NameInMap("lowest_cabin_desc")
        private String lowestCabinDesc;

        @com.aliyun.core.annotation.NameInMap("lowest_cabin_num")
        private String lowestCabinNum;

        @com.aliyun.core.annotation.NameInMap("lowest_cabin_price")
        private java.util.List < LowestCabinPrice> lowestCabinPrice;

        @com.aliyun.core.annotation.NameInMap("meal_desc")
        private String mealDesc;

        @com.aliyun.core.annotation.NameInMap("modify_flight_arr_time")
        private String modifyFlightArrTime;

        @com.aliyun.core.annotation.NameInMap("modify_flight_dep_date")
        private String modifyFlightDepDate;

        @com.aliyun.core.annotation.NameInMap("modify_flight_dep_time")
        private String modifyFlightDepTime;

        @com.aliyun.core.annotation.NameInMap("session_id")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("stop_arr_time")
        private String stopArrTime;

        @com.aliyun.core.annotation.NameInMap("stop_city")
        private String stopCity;

        @com.aliyun.core.annotation.NameInMap("stop_dep_time")
        private String stopDepTime;

        private FlightInfoList(Builder builder) {
            this.airlineInfo = builder.airlineInfo;
            this.arrAirportInfo = builder.arrAirportInfo;
            this.cabinList = builder.cabinList;
            this.carrierAirline = builder.carrierAirline;
            this.carrierNo = builder.carrierNo;
            this.depAirportInfo = builder.depAirportInfo;
            this.flightNo = builder.flightNo;
            this.flightSize = builder.flightSize;
            this.flightType = builder.flightType;
            this.isProtocol = builder.isProtocol;
            this.isShare = builder.isShare;
            this.isStop = builder.isStop;
            this.lowestCabin = builder.lowestCabin;
            this.lowestCabinClass = builder.lowestCabinClass;
            this.lowestCabinDesc = builder.lowestCabinDesc;
            this.lowestCabinNum = builder.lowestCabinNum;
            this.lowestCabinPrice = builder.lowestCabinPrice;
            this.mealDesc = builder.mealDesc;
            this.modifyFlightArrTime = builder.modifyFlightArrTime;
            this.modifyFlightDepDate = builder.modifyFlightDepDate;
            this.modifyFlightDepTime = builder.modifyFlightDepTime;
            this.sessionId = builder.sessionId;
            this.stopArrTime = builder.stopArrTime;
            this.stopCity = builder.stopCity;
            this.stopDepTime = builder.stopDepTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightInfoList create() {
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
         * @return cabinList
         */
        public java.util.List < CabinList> getCabinList() {
            return this.cabinList;
        }

        /**
         * @return carrierAirline
         */
        public String getCarrierAirline() {
            return this.carrierAirline;
        }

        /**
         * @return carrierNo
         */
        public String getCarrierNo() {
            return this.carrierNo;
        }

        /**
         * @return depAirportInfo
         */
        public DepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return flightSize
         */
        public String getFlightSize() {
            return this.flightSize;
        }

        /**
         * @return flightType
         */
        public String getFlightType() {
            return this.flightType;
        }

        /**
         * @return isProtocol
         */
        public Boolean getIsProtocol() {
            return this.isProtocol;
        }

        /**
         * @return isShare
         */
        public Boolean getIsShare() {
            return this.isShare;
        }

        /**
         * @return isStop
         */
        public Boolean getIsStop() {
            return this.isStop;
        }

        /**
         * @return lowestCabin
         */
        public String getLowestCabin() {
            return this.lowestCabin;
        }

        /**
         * @return lowestCabinClass
         */
        public String getLowestCabinClass() {
            return this.lowestCabinClass;
        }

        /**
         * @return lowestCabinDesc
         */
        public String getLowestCabinDesc() {
            return this.lowestCabinDesc;
        }

        /**
         * @return lowestCabinNum
         */
        public String getLowestCabinNum() {
            return this.lowestCabinNum;
        }

        /**
         * @return lowestCabinPrice
         */
        public java.util.List < LowestCabinPrice> getLowestCabinPrice() {
            return this.lowestCabinPrice;
        }

        /**
         * @return mealDesc
         */
        public String getMealDesc() {
            return this.mealDesc;
        }

        /**
         * @return modifyFlightArrTime
         */
        public String getModifyFlightArrTime() {
            return this.modifyFlightArrTime;
        }

        /**
         * @return modifyFlightDepDate
         */
        public String getModifyFlightDepDate() {
            return this.modifyFlightDepDate;
        }

        /**
         * @return modifyFlightDepTime
         */
        public String getModifyFlightDepTime() {
            return this.modifyFlightDepTime;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
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

        public static final class Builder {
            private AirlineInfo airlineInfo; 
            private ArrAirportInfo arrAirportInfo; 
            private java.util.List < CabinList> cabinList; 
            private String carrierAirline; 
            private String carrierNo; 
            private DepAirportInfo depAirportInfo; 
            private String flightNo; 
            private String flightSize; 
            private String flightType; 
            private Boolean isProtocol; 
            private Boolean isShare; 
            private Boolean isStop; 
            private String lowestCabin; 
            private String lowestCabinClass; 
            private String lowestCabinDesc; 
            private String lowestCabinNum; 
            private java.util.List < LowestCabinPrice> lowestCabinPrice; 
            private String mealDesc; 
            private String modifyFlightArrTime; 
            private String modifyFlightDepDate; 
            private String modifyFlightDepTime; 
            private String sessionId; 
            private String stopArrTime; 
            private String stopCity; 
            private String stopDepTime; 

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
             * cabin_list.
             */
            public Builder cabinList(java.util.List < CabinList> cabinList) {
                this.cabinList = cabinList;
                return this;
            }

            /**
             * carrier_airline.
             */
            public Builder carrierAirline(String carrierAirline) {
                this.carrierAirline = carrierAirline;
                return this;
            }

            /**
             * carrier_no.
             */
            public Builder carrierNo(String carrierNo) {
                this.carrierNo = carrierNo;
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
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
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
             * flight_type.
             */
            public Builder flightType(String flightType) {
                this.flightType = flightType;
                return this;
            }

            /**
             * is_protocol.
             */
            public Builder isProtocol(Boolean isProtocol) {
                this.isProtocol = isProtocol;
                return this;
            }

            /**
             * is_share.
             */
            public Builder isShare(Boolean isShare) {
                this.isShare = isShare;
                return this;
            }

            /**
             * is_stop.
             */
            public Builder isStop(Boolean isStop) {
                this.isStop = isStop;
                return this;
            }

            /**
             * lowest_cabin.
             */
            public Builder lowestCabin(String lowestCabin) {
                this.lowestCabin = lowestCabin;
                return this;
            }

            /**
             * lowest_cabin_class.
             */
            public Builder lowestCabinClass(String lowestCabinClass) {
                this.lowestCabinClass = lowestCabinClass;
                return this;
            }

            /**
             * lowest_cabin_desc.
             */
            public Builder lowestCabinDesc(String lowestCabinDesc) {
                this.lowestCabinDesc = lowestCabinDesc;
                return this;
            }

            /**
             * lowest_cabin_num.
             */
            public Builder lowestCabinNum(String lowestCabinNum) {
                this.lowestCabinNum = lowestCabinNum;
                return this;
            }

            /**
             * lowest_cabin_price.
             */
            public Builder lowestCabinPrice(java.util.List < LowestCabinPrice> lowestCabinPrice) {
                this.lowestCabinPrice = lowestCabinPrice;
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
             * modify_flight_arr_time.
             */
            public Builder modifyFlightArrTime(String modifyFlightArrTime) {
                this.modifyFlightArrTime = modifyFlightArrTime;
                return this;
            }

            /**
             * modify_flight_dep_date.
             */
            public Builder modifyFlightDepDate(String modifyFlightDepDate) {
                this.modifyFlightDepDate = modifyFlightDepDate;
                return this;
            }

            /**
             * modify_flight_dep_time.
             */
            public Builder modifyFlightDepTime(String modifyFlightDepTime) {
                this.modifyFlightDepTime = modifyFlightDepTime;
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

            public FlightInfoList build() {
                return new FlightInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketChangingFlightListResponseBody} extends {@link TeaModel}
     *
     * <p>TicketChangingFlightListResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flight_info_list")
        private java.util.List < FlightInfoList> flightInfoList;

        private Module(Builder builder) {
            this.flightInfoList = builder.flightInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return flightInfoList
         */
        public java.util.List < FlightInfoList> getFlightInfoList() {
            return this.flightInfoList;
        }

        public static final class Builder {
            private java.util.List < FlightInfoList> flightInfoList; 

            /**
             * flight_info_list.
             */
            public Builder flightInfoList(java.util.List < FlightInfoList> flightInfoList) {
                this.flightInfoList = flightInfoList;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
