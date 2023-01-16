// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TicketChangingFlightListResponseBody} extends {@link TeaModel}
 *
 * <p>TicketChangingFlightListResponseBody</p>
 */
public class TicketChangingFlightListResponseBody extends TeaModel {
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

    public static class AirlineInfo extends TeaModel {
        @NameInMap("airline_code")
        private String airlineCode;

        @NameInMap("airline_name")
        private String airlineName;

        @NameInMap("airline_simple_name")
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
             * 必填项,航司编码
             */
            public Builder airlineCode(String airlineCode) {
                this.airlineCode = airlineCode;
                return this;
            }

            /**
             * 必填项,航司名称
             */
            public Builder airlineName(String airlineName) {
                this.airlineName = airlineName;
                return this;
            }

            /**
             * 必填项,航司简称
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
    public static class ArrAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        private String airportCode;

        @NameInMap("airport_name")
        private String airportName;

        @NameInMap("city_code")
        private String cityCode;

        @NameInMap("city_name")
        private String cityName;

        @NameInMap("terminal")
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
             * 必填项,机场编码
             */
            public Builder airportCode(String airportCode) {
                this.airportCode = airportCode;
                return this;
            }

            /**
             * 必填项,机场编码
             */
            public Builder airportName(String airportName) {
                this.airportName = airportName;
                return this;
            }

            /**
             * 必填项,城市编码
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * 必填项,城市名称
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * 必填项,航站楼
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
    public static class ModifyPriceList extends TeaModel {
        @NameInMap("passenger_type")
        private Integer passengerType;

        @NameInMap("ticket_price")
        private Integer ticketPrice;

        @NameInMap("upgrade_fee")
        private Integer upgradeFee;

        @NameInMap("upgrade_price")
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
             * 必填项，乘客类型
             */
            public Builder passengerType(Integer passengerType) {
                this.passengerType = passengerType;
                return this;
            }

            /**
             * 票价
             */
            public Builder ticketPrice(Integer ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * 必填项，改签手续费
             */
            public Builder upgradeFee(Integer upgradeFee) {
                this.upgradeFee = upgradeFee;
                return this;
            }

            /**
             * 必填项，升舱差价
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
    public static class CabinList extends TeaModel {
        @NameInMap("cabin")
        private String cabin;

        @NameInMap("cabin_class")
        private String cabinClass;

        @NameInMap("cabin_desc")
        private String cabinDesc;

        @NameInMap("cabin_discount")
        private Integer cabinDiscount;

        @NameInMap("child_cabin")
        private String childCabin;

        @NameInMap("left_num")
        private String leftNum;

        @NameInMap("modify_price_list")
        private java.util.List < ModifyPriceList> modifyPriceList;

        @NameInMap("ota_itemid")
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
             * 必填项，舱位代码
             */
            public Builder cabin(String cabin) {
                this.cabin = cabin;
                return this;
            }

            /**
             * 必填项，舱等
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * 必填项，舱位描述
             */
            public Builder cabinDesc(String cabinDesc) {
                this.cabinDesc = cabinDesc;
                return this;
            }

            /**
             * 舱等折扣，八折用80表示（null代表不限制）
             */
            public Builder cabinDiscount(Integer cabinDiscount) {
                this.cabinDiscount = cabinDiscount;
                return this;
            }

            /**
             * 必填项，子舱位
             */
            public Builder childCabin(String childCabin) {
                this.childCabin = childCabin;
                return this;
            }

            /**
             * 必填项，av
             */
            public Builder leftNum(String leftNum) {
                this.leftNum = leftNum;
                return this;
            }

            /**
             * 改签费用信息
             */
            public Builder modifyPriceList(java.util.List < ModifyPriceList> modifyPriceList) {
                this.modifyPriceList = modifyPriceList;
                return this;
            }

            /**
             * 商品Id"360379a11ee84e9aa011baa41b758fe6"
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
    public static class DepAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        private String airportCode;

        @NameInMap("airport_name")
        private String airportName;

        @NameInMap("city_code")
        private String cityCode;

        @NameInMap("city_name")
        private String cityName;

        @NameInMap("terminal")
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
             * 必填项,机场编码
             */
            public Builder airportCode(String airportCode) {
                this.airportCode = airportCode;
                return this;
            }

            /**
             * 必填项,机场编码
             */
            public Builder airportName(String airportName) {
                this.airportName = airportName;
                return this;
            }

            /**
             * 必填项,城市编码
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * 必填项,城市名称
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * 必填项,航站楼
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
    public static class LowestCabinPrice extends TeaModel {
        @NameInMap("passenger_type")
        private Integer passengerType;

        @NameInMap("ticket_price")
        private Integer ticketPrice;

        @NameInMap("upgrade_fee")
        private Integer upgradeFee;

        @NameInMap("upgrade_price")
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
             * 必填项，乘客类型
             */
            public Builder passengerType(Integer passengerType) {
                this.passengerType = passengerType;
                return this;
            }

            /**
             * 票价
             */
            public Builder ticketPrice(Integer ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * 必填项，改签手续费
             */
            public Builder upgradeFee(Integer upgradeFee) {
                this.upgradeFee = upgradeFee;
                return this;
            }

            /**
             * 必填项，升舱差价
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
    public static class FlightInfoList extends TeaModel {
        @NameInMap("airline_info")
        private AirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        private ArrAirportInfo arrAirportInfo;

        @NameInMap("cabin_list")
        private java.util.List < CabinList> cabinList;

        @NameInMap("carrier_airline")
        private String carrierAirline;

        @NameInMap("carrier_no")
        private String carrierNo;

        @NameInMap("dep_airport_info")
        private DepAirportInfo depAirportInfo;

        @NameInMap("flight_no")
        private String flightNo;

        @NameInMap("flight_size")
        private String flightSize;

        @NameInMap("flight_type")
        private String flightType;

        @NameInMap("is_protocol")
        private Boolean isProtocol;

        @NameInMap("is_share")
        private Boolean isShare;

        @NameInMap("is_stop")
        private Boolean isStop;

        @NameInMap("lowest_cabin")
        private String lowestCabin;

        @NameInMap("lowest_cabin_class")
        private String lowestCabinClass;

        @NameInMap("lowest_cabin_desc")
        private String lowestCabinDesc;

        @NameInMap("lowest_cabin_num")
        private String lowestCabinNum;

        @NameInMap("lowest_cabin_price")
        private java.util.List < LowestCabinPrice> lowestCabinPrice;

        @NameInMap("meal_desc")
        private String mealDesc;

        @NameInMap("modify_flight_arr_time")
        private String modifyFlightArrTime;

        @NameInMap("modify_flight_dep_date")
        private String modifyFlightDepDate;

        @NameInMap("modify_flight_dep_time")
        private String modifyFlightDepTime;

        @NameInMap("session_id")
        private String sessionId;

        @NameInMap("stop_arr_time")
        private String stopArrTime;

        @NameInMap("stop_city")
        private String stopCity;

        @NameInMap("stop_dep_time")
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
             * 必填项,AirlineInfo 销售航司信息
             */
            public Builder airlineInfo(AirlineInfo airlineInfo) {
                this.airlineInfo = airlineInfo;
                return this;
            }

            /**
             * 必填项,AirportInfo 到达机场信息
             */
            public Builder arrAirportInfo(ArrAirportInfo arrAirportInfo) {
                this.arrAirportInfo = arrAirportInfo;
                return this;
            }

            /**
             * 必填项,仓位列表
             */
            public Builder cabinList(java.util.List < CabinList> cabinList) {
                this.cabinList = cabinList;
                return this;
            }

            /**
             * 承运航班信息（共享航班时有值）
             */
            public Builder carrierAirline(String carrierAirline) {
                this.carrierAirline = carrierAirline;
                return this;
            }

            /**
             * 承运航班信息（共享航班时有值）
             */
            public Builder carrierNo(String carrierNo) {
                this.carrierNo = carrierNo;
                return this;
            }

            /**
             * 必填项,AirportInfo 出发机场信息
             */
            public Builder depAirportInfo(DepAirportInfo depAirportInfo) {
                this.depAirportInfo = depAirportInfo;
                return this;
            }

            /**
             * 必填项,销售航班号
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            /**
             * 机型
             */
            public Builder flightSize(String flightSize) {
                this.flightSize = flightSize;
                return this;
            }

            /**
             * 机型号
             */
            public Builder flightType(String flightType) {
                this.flightType = flightType;
                return this;
            }

            /**
             * 是否协议价
             */
            public Builder isProtocol(Boolean isProtocol) {
                this.isProtocol = isProtocol;
                return this;
            }

            /**
             * 必填项,是否共享航班
             */
            public Builder isShare(Boolean isShare) {
                this.isShare = isShare;
                return this;
            }

            /**
             * 必填项,是否经停
             */
            public Builder isStop(Boolean isStop) {
                this.isStop = isStop;
                return this;
            }

            /**
             * 必填项,最低价舱位代码
             */
            public Builder lowestCabin(String lowestCabin) {
                this.lowestCabin = lowestCabin;
                return this;
            }

            /**
             * 必填项,最低价舱等
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
             * 必填项,最低价舱位av
             */
            public Builder lowestCabinNum(String lowestCabinNum) {
                this.lowestCabinNum = lowestCabinNum;
                return this;
            }

            /**
             * 必填项,最低价舱位改签价格
             */
            public Builder lowestCabinPrice(java.util.List < LowestCabinPrice> lowestCabinPrice) {
                this.lowestCabinPrice = lowestCabinPrice;
                return this;
            }

            /**
             * 餐食
             */
            public Builder mealDesc(String mealDesc) {
                this.mealDesc = mealDesc;
                return this;
            }

            /**
             * 改签航班到达时间
             */
            public Builder modifyFlightArrTime(String modifyFlightArrTime) {
                this.modifyFlightArrTime = modifyFlightArrTime;
                return this;
            }

            /**
             * 改签航班出发日期
             */
            public Builder modifyFlightDepDate(String modifyFlightDepDate) {
                this.modifyFlightDepDate = modifyFlightDepDate;
                return this;
            }

            /**
             * 改签航班出发时间
             */
            public Builder modifyFlightDepTime(String modifyFlightDepTime) {
                this.modifyFlightDepTime = modifyFlightDepTime;
                return this;
            }

            /**
             * ??id
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * 经停落地时间
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
             * 经停起飞时间
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
    public static class Module extends TeaModel {
        @NameInMap("flight_info_list")
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
             * 改签航班列表
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
