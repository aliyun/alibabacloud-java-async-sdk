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
 * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
 *
 * <p>IFlightOrderListQueryResponseBody</p>
 */
public class IFlightOrderListQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private java.util.List<Module> module;

    @com.aliyun.core.annotation.NameInMap("pageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private IFlightOrderListQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IFlightOrderListQueryResponseBody create() {
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
    public java.util.List<Module> getModule() {
        return this.module;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
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
        private java.util.List<Module> module; 
        private PageInfo pageInfo; 
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
        public Builder module(java.util.List<Module> module) {
            this.module = module;
            return this;
        }

        /**
         * pageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
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

        public IFlightOrderListQueryResponseBody build() {
            return new IFlightOrderListQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class FlightModifySegmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_name")
        private String airlineName;

        @com.aliyun.core.annotation.NameInMap("arr_apt")
        private String arrApt;

        @com.aliyun.core.annotation.NameInMap("arr_apt_code")
        private String arrAptCode;

        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_terminal")
        private String arrTerminal;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("carrier_airline_code")
        private String carrierAirlineCode;

        @com.aliyun.core.annotation.NameInMap("carrier_airline_name")
        private String carrierAirlineName;

        @com.aliyun.core.annotation.NameInMap("dep_apt")
        private String depApt;

        @com.aliyun.core.annotation.NameInMap("dep_apt_code")
        private String depAptCode;

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

        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        @com.aliyun.core.annotation.NameInMap("share")
        private Boolean share;

        @com.aliyun.core.annotation.NameInMap("stop_apt_code")
        private String stopAptCode;

        @com.aliyun.core.annotation.NameInMap("stop_arr_time")
        private String stopArrTime;

        @com.aliyun.core.annotation.NameInMap("stop_city")
        private String stopCity;

        @com.aliyun.core.annotation.NameInMap("stop_city_code")
        private String stopCityCode;

        @com.aliyun.core.annotation.NameInMap("stop_dep_time")
        private String stopDepTime;

        private FlightModifySegmentList(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.arrApt = builder.arrApt;
            this.arrAptCode = builder.arrAptCode;
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrTerminal = builder.arrTerminal;
            this.arrTime = builder.arrTime;
            this.carrierAirlineCode = builder.carrierAirlineCode;
            this.carrierAirlineName = builder.carrierAirlineName;
            this.depApt = builder.depApt;
            this.depAptCode = builder.depAptCode;
            this.depCity = builder.depCity;
            this.depCityCode = builder.depCityCode;
            this.depTerminal = builder.depTerminal;
            this.depTime = builder.depTime;
            this.flightNo = builder.flightNo;
            this.journeyIndex = builder.journeyIndex;
            this.segmentIndex = builder.segmentIndex;
            this.share = builder.share;
            this.stopAptCode = builder.stopAptCode;
            this.stopArrTime = builder.stopArrTime;
            this.stopCity = builder.stopCity;
            this.stopCityCode = builder.stopCityCode;
            this.stopDepTime = builder.stopDepTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightModifySegmentList create() {
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
         * @return arrApt
         */
        public String getArrApt() {
            return this.arrApt;
        }

        /**
         * @return arrAptCode
         */
        public String getArrAptCode() {
            return this.arrAptCode;
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
         * @return carrierAirlineCode
         */
        public String getCarrierAirlineCode() {
            return this.carrierAirlineCode;
        }

        /**
         * @return carrierAirlineName
         */
        public String getCarrierAirlineName() {
            return this.carrierAirlineName;
        }

        /**
         * @return depApt
         */
        public String getDepApt() {
            return this.depApt;
        }

        /**
         * @return depAptCode
         */
        public String getDepAptCode() {
            return this.depAptCode;
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

        /**
         * @return share
         */
        public Boolean getShare() {
            return this.share;
        }

        /**
         * @return stopAptCode
         */
        public String getStopAptCode() {
            return this.stopAptCode;
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
         * @return stopCityCode
         */
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        /**
         * @return stopDepTime
         */
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private String arrApt; 
            private String arrAptCode; 
            private String arrCity; 
            private String arrCityCode; 
            private String arrTerminal; 
            private String arrTime; 
            private String carrierAirlineCode; 
            private String carrierAirlineName; 
            private String depApt; 
            private String depAptCode; 
            private String depCity; 
            private String depCityCode; 
            private String depTerminal; 
            private String depTime; 
            private String flightNo; 
            private Integer journeyIndex; 
            private Integer segmentIndex; 
            private Boolean share; 
            private String stopAptCode; 
            private String stopArrTime; 
            private String stopCity; 
            private String stopCityCode; 
            private String stopDepTime; 

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
             * arr_apt.
             */
            public Builder arrApt(String arrApt) {
                this.arrApt = arrApt;
                return this;
            }

            /**
             * arr_apt_code.
             */
            public Builder arrAptCode(String arrAptCode) {
                this.arrAptCode = arrAptCode;
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
             * carrier_airline_code.
             */
            public Builder carrierAirlineCode(String carrierAirlineCode) {
                this.carrierAirlineCode = carrierAirlineCode;
                return this;
            }

            /**
             * carrier_airline_name.
             */
            public Builder carrierAirlineName(String carrierAirlineName) {
                this.carrierAirlineName = carrierAirlineName;
                return this;
            }

            /**
             * dep_apt.
             */
            public Builder depApt(String depApt) {
                this.depApt = depApt;
                return this;
            }

            /**
             * dep_apt_code.
             */
            public Builder depAptCode(String depAptCode) {
                this.depAptCode = depAptCode;
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

            /**
             * share.
             */
            public Builder share(Boolean share) {
                this.share = share;
                return this;
            }

            /**
             * stop_apt_code.
             */
            public Builder stopAptCode(String stopAptCode) {
                this.stopAptCode = stopAptCode;
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
             * stop_city_code.
             */
            public Builder stopCityCode(String stopCityCode) {
                this.stopCityCode = stopCityCode;
                return this;
            }

            /**
             * stop_dep_time.
             */
            public Builder stopDepTime(String stopDepTime) {
                this.stopDepTime = stopDepTime;
                return this;
            }

            public FlightModifySegmentList build() {
                return new FlightModifySegmentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class CabinClass extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        private CabinClass(Builder builder) {
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.flightNo = builder.flightNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CabinClass create() {
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
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        public static final class Builder {
            private String cabin; 
            private String cabinClass; 
            private String flightNo; 

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
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            public CabinClass build() {
                return new CabinClass(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class FlightOrderModifyTicketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private java.util.List<CabinClass> cabinClass;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private FlightOrderModifyTicketList(Builder builder) {
            this.cabinClass = builder.cabinClass;
            this.flightNo = builder.flightNo;
            this.ticketNo = builder.ticketNo;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightOrderModifyTicketList create() {
            return builder().build();
        }

        /**
         * @return cabinClass
         */
        public java.util.List<CabinClass> getCabinClass() {
            return this.cabinClass;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
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
            private java.util.List<CabinClass> cabinClass; 
            private String flightNo; 
            private String ticketNo; 
            private String userId; 

            /**
             * cabin_class.
             */
            public Builder cabinClass(java.util.List<CabinClass> cabinClass) {
                this.cabinClass = cabinClass;
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

            public FlightOrderModifyTicketList build() {
                return new FlightOrderModifyTicketList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class PassengerFee extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modify_hand_fee")
        private Long modifyHandFee;

        @com.aliyun.core.annotation.NameInMap("modify_upgrade_fee")
        private Long modifyUpgradeFee;

        @com.aliyun.core.annotation.NameInMap("tax_gap")
        private Long taxGap;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private PassengerFee(Builder builder) {
            this.modifyHandFee = builder.modifyHandFee;
            this.modifyUpgradeFee = builder.modifyUpgradeFee;
            this.taxGap = builder.taxGap;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerFee create() {
            return builder().build();
        }

        /**
         * @return modifyHandFee
         */
        public Long getModifyHandFee() {
            return this.modifyHandFee;
        }

        /**
         * @return modifyUpgradeFee
         */
        public Long getModifyUpgradeFee() {
            return this.modifyUpgradeFee;
        }

        /**
         * @return taxGap
         */
        public Long getTaxGap() {
            return this.taxGap;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long modifyHandFee; 
            private Long modifyUpgradeFee; 
            private Long taxGap; 
            private String userId; 

            /**
             * modify_hand_fee.
             */
            public Builder modifyHandFee(Long modifyHandFee) {
                this.modifyHandFee = modifyHandFee;
                return this;
            }

            /**
             * modify_upgrade_fee.
             */
            public Builder modifyUpgradeFee(Long modifyUpgradeFee) {
                this.modifyUpgradeFee = modifyUpgradeFee;
                return this;
            }

            /**
             * tax_gap.
             */
            public Builder taxGap(Long taxGap) {
                this.taxGap = taxGap;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public PassengerFee build() {
                return new PassengerFee(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class FlightModifyOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("corp_pay_price")
        private Integer corpPayPrice;

        @com.aliyun.core.annotation.NameInMap("flight_modify_segment_list")
        private java.util.List<FlightModifySegmentList> flightModifySegmentList;

        @com.aliyun.core.annotation.NameInMap("flight_order_modify_ticket_list")
        private java.util.List<FlightOrderModifyTicketList> flightOrderModifyTicketList;

        @com.aliyun.core.annotation.NameInMap("modify_apply_id")
        private Long modifyApplyId;

        @com.aliyun.core.annotation.NameInMap("passenger_fee")
        private java.util.List<PassengerFee> passengerFee;

        @com.aliyun.core.annotation.NameInMap("passenger_list")
        private java.util.List<String> passengerList;

        @com.aliyun.core.annotation.NameInMap("person_pay_price")
        private Integer personPayPrice;

        @com.aliyun.core.annotation.NameInMap("relate_modify_apply_id")
        private Long relateModifyApplyId;

        @com.aliyun.core.annotation.NameInMap("service_fee")
        private Long serviceFee;

        @com.aliyun.core.annotation.NameInMap("total_fee")
        private Long totalFee;

        private FlightModifyOrderList(Builder builder) {
            this.corpPayPrice = builder.corpPayPrice;
            this.flightModifySegmentList = builder.flightModifySegmentList;
            this.flightOrderModifyTicketList = builder.flightOrderModifyTicketList;
            this.modifyApplyId = builder.modifyApplyId;
            this.passengerFee = builder.passengerFee;
            this.passengerList = builder.passengerList;
            this.personPayPrice = builder.personPayPrice;
            this.relateModifyApplyId = builder.relateModifyApplyId;
            this.serviceFee = builder.serviceFee;
            this.totalFee = builder.totalFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightModifyOrderList create() {
            return builder().build();
        }

        /**
         * @return corpPayPrice
         */
        public Integer getCorpPayPrice() {
            return this.corpPayPrice;
        }

        /**
         * @return flightModifySegmentList
         */
        public java.util.List<FlightModifySegmentList> getFlightModifySegmentList() {
            return this.flightModifySegmentList;
        }

        /**
         * @return flightOrderModifyTicketList
         */
        public java.util.List<FlightOrderModifyTicketList> getFlightOrderModifyTicketList() {
            return this.flightOrderModifyTicketList;
        }

        /**
         * @return modifyApplyId
         */
        public Long getModifyApplyId() {
            return this.modifyApplyId;
        }

        /**
         * @return passengerFee
         */
        public java.util.List<PassengerFee> getPassengerFee() {
            return this.passengerFee;
        }

        /**
         * @return passengerList
         */
        public java.util.List<String> getPassengerList() {
            return this.passengerList;
        }

        /**
         * @return personPayPrice
         */
        public Integer getPersonPayPrice() {
            return this.personPayPrice;
        }

        /**
         * @return relateModifyApplyId
         */
        public Long getRelateModifyApplyId() {
            return this.relateModifyApplyId;
        }

        /**
         * @return serviceFee
         */
        public Long getServiceFee() {
            return this.serviceFee;
        }

        /**
         * @return totalFee
         */
        public Long getTotalFee() {
            return this.totalFee;
        }

        public static final class Builder {
            private Integer corpPayPrice; 
            private java.util.List<FlightModifySegmentList> flightModifySegmentList; 
            private java.util.List<FlightOrderModifyTicketList> flightOrderModifyTicketList; 
            private Long modifyApplyId; 
            private java.util.List<PassengerFee> passengerFee; 
            private java.util.List<String> passengerList; 
            private Integer personPayPrice; 
            private Long relateModifyApplyId; 
            private Long serviceFee; 
            private Long totalFee; 

            /**
             * corp_pay_price.
             */
            public Builder corpPayPrice(Integer corpPayPrice) {
                this.corpPayPrice = corpPayPrice;
                return this;
            }

            /**
             * flight_modify_segment_list.
             */
            public Builder flightModifySegmentList(java.util.List<FlightModifySegmentList> flightModifySegmentList) {
                this.flightModifySegmentList = flightModifySegmentList;
                return this;
            }

            /**
             * flight_order_modify_ticket_list.
             */
            public Builder flightOrderModifyTicketList(java.util.List<FlightOrderModifyTicketList> flightOrderModifyTicketList) {
                this.flightOrderModifyTicketList = flightOrderModifyTicketList;
                return this;
            }

            /**
             * modify_apply_id.
             */
            public Builder modifyApplyId(Long modifyApplyId) {
                this.modifyApplyId = modifyApplyId;
                return this;
            }

            /**
             * passenger_fee.
             */
            public Builder passengerFee(java.util.List<PassengerFee> passengerFee) {
                this.passengerFee = passengerFee;
                return this;
            }

            /**
             * passenger_list.
             */
            public Builder passengerList(java.util.List<String> passengerList) {
                this.passengerList = passengerList;
                return this;
            }

            /**
             * person_pay_price.
             */
            public Builder personPayPrice(Integer personPayPrice) {
                this.personPayPrice = personPayPrice;
                return this;
            }

            /**
             * relate_modify_apply_id.
             */
            public Builder relateModifyApplyId(Long relateModifyApplyId) {
                this.relateModifyApplyId = relateModifyApplyId;
                return this;
            }

            /**
             * service_fee.
             */
            public Builder serviceFee(Long serviceFee) {
                this.serviceFee = serviceFee;
                return this;
            }

            /**
             * total_fee.
             */
            public Builder totalFee(Long totalFee) {
                this.totalFee = totalFee;
                return this;
            }

            public FlightModifyOrderList build() {
                return new FlightModifyOrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class FlightOrderRefundTicketListCabinClass extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        private FlightOrderRefundTicketListCabinClass(Builder builder) {
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.flightNo = builder.flightNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightOrderRefundTicketListCabinClass create() {
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
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        public static final class Builder {
            private String cabin; 
            private String cabinClass; 
            private String flightNo; 

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
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            public FlightOrderRefundTicketListCabinClass build() {
                return new FlightOrderRefundTicketListCabinClass(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class FlightOrderRefundTicketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private java.util.List<FlightOrderRefundTicketListCabinClass> cabinClass;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private FlightOrderRefundTicketList(Builder builder) {
            this.cabinClass = builder.cabinClass;
            this.flightNo = builder.flightNo;
            this.ticketNo = builder.ticketNo;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightOrderRefundTicketList create() {
            return builder().build();
        }

        /**
         * @return cabinClass
         */
        public java.util.List<FlightOrderRefundTicketListCabinClass> getCabinClass() {
            return this.cabinClass;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
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
            private java.util.List<FlightOrderRefundTicketListCabinClass> cabinClass; 
            private String flightNo; 
            private String ticketNo; 
            private String userId; 

            /**
             * cabin_class.
             */
            public Builder cabinClass(java.util.List<FlightOrderRefundTicketListCabinClass> cabinClass) {
                this.cabinClass = cabinClass;
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

            public FlightOrderRefundTicketList build() {
                return new FlightOrderRefundTicketList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class FlightRefundSegmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_name")
        private String airlineName;

        @com.aliyun.core.annotation.NameInMap("arr_apt")
        private String arrApt;

        @com.aliyun.core.annotation.NameInMap("arr_apt_code")
        private String arrAptCode;

        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_terminal")
        private String arrTerminal;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("carrier_airline_code")
        private String carrierAirlineCode;

        @com.aliyun.core.annotation.NameInMap("carrier_airline_name")
        private String carrierAirlineName;

        @com.aliyun.core.annotation.NameInMap("dep_apt")
        private String depApt;

        @com.aliyun.core.annotation.NameInMap("dep_apt_code")
        private String depAptCode;

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

        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        @com.aliyun.core.annotation.NameInMap("share")
        private Boolean share;

        @com.aliyun.core.annotation.NameInMap("stop_apt_code")
        private String stopAptCode;

        @com.aliyun.core.annotation.NameInMap("stop_arr_time")
        private String stopArrTime;

        @com.aliyun.core.annotation.NameInMap("stop_city")
        private String stopCity;

        @com.aliyun.core.annotation.NameInMap("stop_city_code")
        private String stopCityCode;

        @com.aliyun.core.annotation.NameInMap("stop_dep_time")
        private String stopDepTime;

        private FlightRefundSegmentList(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.arrApt = builder.arrApt;
            this.arrAptCode = builder.arrAptCode;
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrTerminal = builder.arrTerminal;
            this.arrTime = builder.arrTime;
            this.carrierAirlineCode = builder.carrierAirlineCode;
            this.carrierAirlineName = builder.carrierAirlineName;
            this.depApt = builder.depApt;
            this.depAptCode = builder.depAptCode;
            this.depCity = builder.depCity;
            this.depCityCode = builder.depCityCode;
            this.depTerminal = builder.depTerminal;
            this.depTime = builder.depTime;
            this.flightNo = builder.flightNo;
            this.journeyIndex = builder.journeyIndex;
            this.segmentIndex = builder.segmentIndex;
            this.share = builder.share;
            this.stopAptCode = builder.stopAptCode;
            this.stopArrTime = builder.stopArrTime;
            this.stopCity = builder.stopCity;
            this.stopCityCode = builder.stopCityCode;
            this.stopDepTime = builder.stopDepTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRefundSegmentList create() {
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
         * @return arrApt
         */
        public String getArrApt() {
            return this.arrApt;
        }

        /**
         * @return arrAptCode
         */
        public String getArrAptCode() {
            return this.arrAptCode;
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
         * @return carrierAirlineCode
         */
        public String getCarrierAirlineCode() {
            return this.carrierAirlineCode;
        }

        /**
         * @return carrierAirlineName
         */
        public String getCarrierAirlineName() {
            return this.carrierAirlineName;
        }

        /**
         * @return depApt
         */
        public String getDepApt() {
            return this.depApt;
        }

        /**
         * @return depAptCode
         */
        public String getDepAptCode() {
            return this.depAptCode;
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

        /**
         * @return share
         */
        public Boolean getShare() {
            return this.share;
        }

        /**
         * @return stopAptCode
         */
        public String getStopAptCode() {
            return this.stopAptCode;
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
         * @return stopCityCode
         */
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        /**
         * @return stopDepTime
         */
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private String arrApt; 
            private String arrAptCode; 
            private String arrCity; 
            private String arrCityCode; 
            private String arrTerminal; 
            private String arrTime; 
            private String carrierAirlineCode; 
            private String carrierAirlineName; 
            private String depApt; 
            private String depAptCode; 
            private String depCity; 
            private String depCityCode; 
            private String depTerminal; 
            private String depTime; 
            private String flightNo; 
            private Integer journeyIndex; 
            private Integer segmentIndex; 
            private Boolean share; 
            private String stopAptCode; 
            private String stopArrTime; 
            private String stopCity; 
            private String stopCityCode; 
            private String stopDepTime; 

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
             * arr_apt.
             */
            public Builder arrApt(String arrApt) {
                this.arrApt = arrApt;
                return this;
            }

            /**
             * arr_apt_code.
             */
            public Builder arrAptCode(String arrAptCode) {
                this.arrAptCode = arrAptCode;
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
             * carrier_airline_code.
             */
            public Builder carrierAirlineCode(String carrierAirlineCode) {
                this.carrierAirlineCode = carrierAirlineCode;
                return this;
            }

            /**
             * carrier_airline_name.
             */
            public Builder carrierAirlineName(String carrierAirlineName) {
                this.carrierAirlineName = carrierAirlineName;
                return this;
            }

            /**
             * dep_apt.
             */
            public Builder depApt(String depApt) {
                this.depApt = depApt;
                return this;
            }

            /**
             * dep_apt_code.
             */
            public Builder depAptCode(String depAptCode) {
                this.depAptCode = depAptCode;
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

            /**
             * share.
             */
            public Builder share(Boolean share) {
                this.share = share;
                return this;
            }

            /**
             * stop_apt_code.
             */
            public Builder stopAptCode(String stopAptCode) {
                this.stopAptCode = stopAptCode;
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
             * stop_city_code.
             */
            public Builder stopCityCode(String stopCityCode) {
                this.stopCityCode = stopCityCode;
                return this;
            }

            /**
             * stop_dep_time.
             */
            public Builder stopDepTime(String stopDepTime) {
                this.stopDepTime = stopDepTime;
                return this;
            }

            public FlightRefundSegmentList build() {
                return new FlightRefundSegmentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class FlightRefundOrderListPassengerFee extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("no_refund_modify_hand_fee")
        private Long noRefundModifyHandFee;

        @com.aliyun.core.annotation.NameInMap("no_refund_modify_upgrade_fee")
        private Long noRefundModifyUpgradeFee;

        @com.aliyun.core.annotation.NameInMap("refund_amount")
        private Long refundAmount;

        @com.aliyun.core.annotation.NameInMap("refund_hand_fee")
        private Long refundHandFee;

        @com.aliyun.core.annotation.NameInMap("refund_modify_amount")
        private Long refundModifyAmount;

        @com.aliyun.core.annotation.NameInMap("refund_modify_hand_amount")
        private Long refundModifyHandAmount;

        @com.aliyun.core.annotation.NameInMap("refund_modify_upgrade_amount")
        private Long refundModifyUpgradeAmount;

        @com.aliyun.core.annotation.NameInMap("refund_tax_hand_fee")
        private Long refundTaxHandFee;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private FlightRefundOrderListPassengerFee(Builder builder) {
            this.noRefundModifyHandFee = builder.noRefundModifyHandFee;
            this.noRefundModifyUpgradeFee = builder.noRefundModifyUpgradeFee;
            this.refundAmount = builder.refundAmount;
            this.refundHandFee = builder.refundHandFee;
            this.refundModifyAmount = builder.refundModifyAmount;
            this.refundModifyHandAmount = builder.refundModifyHandAmount;
            this.refundModifyUpgradeAmount = builder.refundModifyUpgradeAmount;
            this.refundTaxHandFee = builder.refundTaxHandFee;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRefundOrderListPassengerFee create() {
            return builder().build();
        }

        /**
         * @return noRefundModifyHandFee
         */
        public Long getNoRefundModifyHandFee() {
            return this.noRefundModifyHandFee;
        }

        /**
         * @return noRefundModifyUpgradeFee
         */
        public Long getNoRefundModifyUpgradeFee() {
            return this.noRefundModifyUpgradeFee;
        }

        /**
         * @return refundAmount
         */
        public Long getRefundAmount() {
            return this.refundAmount;
        }

        /**
         * @return refundHandFee
         */
        public Long getRefundHandFee() {
            return this.refundHandFee;
        }

        /**
         * @return refundModifyAmount
         */
        public Long getRefundModifyAmount() {
            return this.refundModifyAmount;
        }

        /**
         * @return refundModifyHandAmount
         */
        public Long getRefundModifyHandAmount() {
            return this.refundModifyHandAmount;
        }

        /**
         * @return refundModifyUpgradeAmount
         */
        public Long getRefundModifyUpgradeAmount() {
            return this.refundModifyUpgradeAmount;
        }

        /**
         * @return refundTaxHandFee
         */
        public Long getRefundTaxHandFee() {
            return this.refundTaxHandFee;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long noRefundModifyHandFee; 
            private Long noRefundModifyUpgradeFee; 
            private Long refundAmount; 
            private Long refundHandFee; 
            private Long refundModifyAmount; 
            private Long refundModifyHandAmount; 
            private Long refundModifyUpgradeAmount; 
            private Long refundTaxHandFee; 
            private String userId; 

            /**
             * no_refund_modify_hand_fee.
             */
            public Builder noRefundModifyHandFee(Long noRefundModifyHandFee) {
                this.noRefundModifyHandFee = noRefundModifyHandFee;
                return this;
            }

            /**
             * no_refund_modify_upgrade_fee.
             */
            public Builder noRefundModifyUpgradeFee(Long noRefundModifyUpgradeFee) {
                this.noRefundModifyUpgradeFee = noRefundModifyUpgradeFee;
                return this;
            }

            /**
             * refund_amount.
             */
            public Builder refundAmount(Long refundAmount) {
                this.refundAmount = refundAmount;
                return this;
            }

            /**
             * refund_hand_fee.
             */
            public Builder refundHandFee(Long refundHandFee) {
                this.refundHandFee = refundHandFee;
                return this;
            }

            /**
             * refund_modify_amount.
             */
            public Builder refundModifyAmount(Long refundModifyAmount) {
                this.refundModifyAmount = refundModifyAmount;
                return this;
            }

            /**
             * refund_modify_hand_amount.
             */
            public Builder refundModifyHandAmount(Long refundModifyHandAmount) {
                this.refundModifyHandAmount = refundModifyHandAmount;
                return this;
            }

            /**
             * refund_modify_upgrade_amount.
             */
            public Builder refundModifyUpgradeAmount(Long refundModifyUpgradeAmount) {
                this.refundModifyUpgradeAmount = refundModifyUpgradeAmount;
                return this;
            }

            /**
             * refund_tax_hand_fee.
             */
            public Builder refundTaxHandFee(Long refundTaxHandFee) {
                this.refundTaxHandFee = refundTaxHandFee;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public FlightRefundOrderListPassengerFee build() {
                return new FlightRefundOrderListPassengerFee(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class FlightRefundOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("corp_refund_Amount")
        private Integer corpRefundAmount;

        @com.aliyun.core.annotation.NameInMap("flight_order_refund_ticket_list")
        private java.util.List<FlightOrderRefundTicketList> flightOrderRefundTicketList;

        @com.aliyun.core.annotation.NameInMap("flight_refund_segment_list")
        private java.util.List<FlightRefundSegmentList> flightRefundSegmentList;

        @com.aliyun.core.annotation.NameInMap("passenger_fee")
        private java.util.List<FlightRefundOrderListPassengerFee> passengerFee;

        @com.aliyun.core.annotation.NameInMap("passenger_info")
        private java.util.List<String> passengerInfo;

        @com.aliyun.core.annotation.NameInMap("person_refund_Amount")
        private Integer personRefundAmount;

        @com.aliyun.core.annotation.NameInMap("refund_Amount")
        private Integer refundAmount;

        @com.aliyun.core.annotation.NameInMap("refund_apply_id")
        private Long refundApplyId;

        @com.aliyun.core.annotation.NameInMap("refund_hand_fee")
        private Integer refundHandFee;

        @com.aliyun.core.annotation.NameInMap("service_fee")
        private Long serviceFee;

        private FlightRefundOrderList(Builder builder) {
            this.corpRefundAmount = builder.corpRefundAmount;
            this.flightOrderRefundTicketList = builder.flightOrderRefundTicketList;
            this.flightRefundSegmentList = builder.flightRefundSegmentList;
            this.passengerFee = builder.passengerFee;
            this.passengerInfo = builder.passengerInfo;
            this.personRefundAmount = builder.personRefundAmount;
            this.refundAmount = builder.refundAmount;
            this.refundApplyId = builder.refundApplyId;
            this.refundHandFee = builder.refundHandFee;
            this.serviceFee = builder.serviceFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRefundOrderList create() {
            return builder().build();
        }

        /**
         * @return corpRefundAmount
         */
        public Integer getCorpRefundAmount() {
            return this.corpRefundAmount;
        }

        /**
         * @return flightOrderRefundTicketList
         */
        public java.util.List<FlightOrderRefundTicketList> getFlightOrderRefundTicketList() {
            return this.flightOrderRefundTicketList;
        }

        /**
         * @return flightRefundSegmentList
         */
        public java.util.List<FlightRefundSegmentList> getFlightRefundSegmentList() {
            return this.flightRefundSegmentList;
        }

        /**
         * @return passengerFee
         */
        public java.util.List<FlightRefundOrderListPassengerFee> getPassengerFee() {
            return this.passengerFee;
        }

        /**
         * @return passengerInfo
         */
        public java.util.List<String> getPassengerInfo() {
            return this.passengerInfo;
        }

        /**
         * @return personRefundAmount
         */
        public Integer getPersonRefundAmount() {
            return this.personRefundAmount;
        }

        /**
         * @return refundAmount
         */
        public Integer getRefundAmount() {
            return this.refundAmount;
        }

        /**
         * @return refundApplyId
         */
        public Long getRefundApplyId() {
            return this.refundApplyId;
        }

        /**
         * @return refundHandFee
         */
        public Integer getRefundHandFee() {
            return this.refundHandFee;
        }

        /**
         * @return serviceFee
         */
        public Long getServiceFee() {
            return this.serviceFee;
        }

        public static final class Builder {
            private Integer corpRefundAmount; 
            private java.util.List<FlightOrderRefundTicketList> flightOrderRefundTicketList; 
            private java.util.List<FlightRefundSegmentList> flightRefundSegmentList; 
            private java.util.List<FlightRefundOrderListPassengerFee> passengerFee; 
            private java.util.List<String> passengerInfo; 
            private Integer personRefundAmount; 
            private Integer refundAmount; 
            private Long refundApplyId; 
            private Integer refundHandFee; 
            private Long serviceFee; 

            /**
             * corp_refund_Amount.
             */
            public Builder corpRefundAmount(Integer corpRefundAmount) {
                this.corpRefundAmount = corpRefundAmount;
                return this;
            }

            /**
             * flight_order_refund_ticket_list.
             */
            public Builder flightOrderRefundTicketList(java.util.List<FlightOrderRefundTicketList> flightOrderRefundTicketList) {
                this.flightOrderRefundTicketList = flightOrderRefundTicketList;
                return this;
            }

            /**
             * flight_refund_segment_list.
             */
            public Builder flightRefundSegmentList(java.util.List<FlightRefundSegmentList> flightRefundSegmentList) {
                this.flightRefundSegmentList = flightRefundSegmentList;
                return this;
            }

            /**
             * passenger_fee.
             */
            public Builder passengerFee(java.util.List<FlightRefundOrderListPassengerFee> passengerFee) {
                this.passengerFee = passengerFee;
                return this;
            }

            /**
             * passenger_info.
             */
            public Builder passengerInfo(java.util.List<String> passengerInfo) {
                this.passengerInfo = passengerInfo;
                return this;
            }

            /**
             * person_refund_Amount.
             */
            public Builder personRefundAmount(Integer personRefundAmount) {
                this.personRefundAmount = personRefundAmount;
                return this;
            }

            /**
             * refund_Amount.
             */
            public Builder refundAmount(Integer refundAmount) {
                this.refundAmount = refundAmount;
                return this;
            }

            /**
             * refund_apply_id.
             */
            public Builder refundApplyId(Long refundApplyId) {
                this.refundApplyId = refundApplyId;
                return this;
            }

            /**
             * refund_hand_fee.
             */
            public Builder refundHandFee(Integer refundHandFee) {
                this.refundHandFee = refundHandFee;
                return this;
            }

            /**
             * service_fee.
             */
            public Builder serviceFee(Long serviceFee) {
                this.serviceFee = serviceFee;
                return this;
            }

            public FlightRefundOrderList build() {
                return new FlightRefundOrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class BookerInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private BookerInfo(Builder builder) {
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BookerInfo create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String userId; 
            private String userName; 

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * user_name.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public BookerInfo build() {
                return new BookerInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class FlightOrderInsureList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ins_order_id")
        private String insOrderId;

        @com.aliyun.core.annotation.NameInMap("ins_pay_type")
        private String insPayType;

        @com.aliyun.core.annotation.NameInMap("ins_total_price")
        private Integer insTotalPrice;

        @com.aliyun.core.annotation.NameInMap("trade_action")
        private String tradeAction;

        private FlightOrderInsureList(Builder builder) {
            this.insOrderId = builder.insOrderId;
            this.insPayType = builder.insPayType;
            this.insTotalPrice = builder.insTotalPrice;
            this.tradeAction = builder.tradeAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightOrderInsureList create() {
            return builder().build();
        }

        /**
         * @return insOrderId
         */
        public String getInsOrderId() {
            return this.insOrderId;
        }

        /**
         * @return insPayType
         */
        public String getInsPayType() {
            return this.insPayType;
        }

        /**
         * @return insTotalPrice
         */
        public Integer getInsTotalPrice() {
            return this.insTotalPrice;
        }

        /**
         * @return tradeAction
         */
        public String getTradeAction() {
            return this.tradeAction;
        }

        public static final class Builder {
            private String insOrderId; 
            private String insPayType; 
            private Integer insTotalPrice; 
            private String tradeAction; 

            /**
             * ins_order_id.
             */
            public Builder insOrderId(String insOrderId) {
                this.insOrderId = insOrderId;
                return this;
            }

            /**
             * ins_pay_type.
             */
            public Builder insPayType(String insPayType) {
                this.insPayType = insPayType;
                return this;
            }

            /**
             * ins_total_price.
             */
            public Builder insTotalPrice(Integer insTotalPrice) {
                this.insTotalPrice = insTotalPrice;
                return this;
            }

            /**
             * trade_action.
             */
            public Builder tradeAction(String tradeAction) {
                this.tradeAction = tradeAction;
                return this;
            }

            public FlightOrderInsureList build() {
                return new FlightOrderInsureList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class FlightOrderTicketListCabinClass extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        private FlightOrderTicketListCabinClass(Builder builder) {
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.flightNo = builder.flightNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightOrderTicketListCabinClass create() {
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
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        public static final class Builder {
            private String cabin; 
            private String cabinClass; 
            private String flightNo; 

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
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            public FlightOrderTicketListCabinClass build() {
                return new FlightOrderTicketListCabinClass(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class FlightOrderTicketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private java.util.List<FlightOrderTicketListCabinClass> cabinClass;

        @com.aliyun.core.annotation.NameInMap("tax")
        private Integer tax;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Integer ticketPrice;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private FlightOrderTicketList(Builder builder) {
            this.cabinClass = builder.cabinClass;
            this.tax = builder.tax;
            this.ticketNo = builder.ticketNo;
            this.ticketPrice = builder.ticketPrice;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightOrderTicketList create() {
            return builder().build();
        }

        /**
         * @return cabinClass
         */
        public java.util.List<FlightOrderTicketListCabinClass> getCabinClass() {
            return this.cabinClass;
        }

        /**
         * @return tax
         */
        public Integer getTax() {
            return this.tax;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        /**
         * @return ticketPrice
         */
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<FlightOrderTicketListCabinClass> cabinClass; 
            private Integer tax; 
            private String ticketNo; 
            private Integer ticketPrice; 
            private String userId; 

            /**
             * cabin_class.
             */
            public Builder cabinClass(java.util.List<FlightOrderTicketListCabinClass> cabinClass) {
                this.cabinClass = cabinClass;
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
             * ticket_no.
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
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
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public FlightOrderTicketList build() {
                return new FlightOrderTicketList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class FlightSegmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_name")
        private String airlineName;

        @com.aliyun.core.annotation.NameInMap("arr_apt")
        private String arrApt;

        @com.aliyun.core.annotation.NameInMap("arr_apt_code")
        private String arrAptCode;

        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_terminal")
        private String arrTerminal;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("carrier_airline_code")
        private String carrierAirlineCode;

        @com.aliyun.core.annotation.NameInMap("carrier_airline_name")
        private String carrierAirlineName;

        @com.aliyun.core.annotation.NameInMap("dep_apt")
        private String depApt;

        @com.aliyun.core.annotation.NameInMap("dep_apt_code")
        private String depAptCode;

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

        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        @com.aliyun.core.annotation.NameInMap("share")
        private Boolean share;

        @com.aliyun.core.annotation.NameInMap("stop_apt_code")
        private String stopAptCode;

        @com.aliyun.core.annotation.NameInMap("stop_arr_time")
        private String stopArrTime;

        @com.aliyun.core.annotation.NameInMap("stop_city")
        private String stopCity;

        @com.aliyun.core.annotation.NameInMap("stop_city_code")
        private String stopCityCode;

        @com.aliyun.core.annotation.NameInMap("stop_dep_time")
        private String stopDepTime;

        private FlightSegmentList(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.arrApt = builder.arrApt;
            this.arrAptCode = builder.arrAptCode;
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrTerminal = builder.arrTerminal;
            this.arrTime = builder.arrTime;
            this.carrierAirlineCode = builder.carrierAirlineCode;
            this.carrierAirlineName = builder.carrierAirlineName;
            this.depApt = builder.depApt;
            this.depAptCode = builder.depAptCode;
            this.depCity = builder.depCity;
            this.depCityCode = builder.depCityCode;
            this.depTerminal = builder.depTerminal;
            this.depTime = builder.depTime;
            this.flightNo = builder.flightNo;
            this.journeyIndex = builder.journeyIndex;
            this.segmentIndex = builder.segmentIndex;
            this.share = builder.share;
            this.stopAptCode = builder.stopAptCode;
            this.stopArrTime = builder.stopArrTime;
            this.stopCity = builder.stopCity;
            this.stopCityCode = builder.stopCityCode;
            this.stopDepTime = builder.stopDepTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightSegmentList create() {
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
         * @return arrApt
         */
        public String getArrApt() {
            return this.arrApt;
        }

        /**
         * @return arrAptCode
         */
        public String getArrAptCode() {
            return this.arrAptCode;
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
         * @return carrierAirlineCode
         */
        public String getCarrierAirlineCode() {
            return this.carrierAirlineCode;
        }

        /**
         * @return carrierAirlineName
         */
        public String getCarrierAirlineName() {
            return this.carrierAirlineName;
        }

        /**
         * @return depApt
         */
        public String getDepApt() {
            return this.depApt;
        }

        /**
         * @return depAptCode
         */
        public String getDepAptCode() {
            return this.depAptCode;
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

        /**
         * @return share
         */
        public Boolean getShare() {
            return this.share;
        }

        /**
         * @return stopAptCode
         */
        public String getStopAptCode() {
            return this.stopAptCode;
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
         * @return stopCityCode
         */
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        /**
         * @return stopDepTime
         */
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private String arrApt; 
            private String arrAptCode; 
            private String arrCity; 
            private String arrCityCode; 
            private String arrTerminal; 
            private String arrTime; 
            private String carrierAirlineCode; 
            private String carrierAirlineName; 
            private String depApt; 
            private String depAptCode; 
            private String depCity; 
            private String depCityCode; 
            private String depTerminal; 
            private String depTime; 
            private String flightNo; 
            private Integer journeyIndex; 
            private Integer segmentIndex; 
            private Boolean share; 
            private String stopAptCode; 
            private String stopArrTime; 
            private String stopCity; 
            private String stopCityCode; 
            private String stopDepTime; 

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
             * arr_apt.
             */
            public Builder arrApt(String arrApt) {
                this.arrApt = arrApt;
                return this;
            }

            /**
             * arr_apt_code.
             */
            public Builder arrAptCode(String arrAptCode) {
                this.arrAptCode = arrAptCode;
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
             * carrier_airline_code.
             */
            public Builder carrierAirlineCode(String carrierAirlineCode) {
                this.carrierAirlineCode = carrierAirlineCode;
                return this;
            }

            /**
             * carrier_airline_name.
             */
            public Builder carrierAirlineName(String carrierAirlineName) {
                this.carrierAirlineName = carrierAirlineName;
                return this;
            }

            /**
             * dep_apt.
             */
            public Builder depApt(String depApt) {
                this.depApt = depApt;
                return this;
            }

            /**
             * dep_apt_code.
             */
            public Builder depAptCode(String depAptCode) {
                this.depAptCode = depAptCode;
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

            /**
             * share.
             */
            public Builder share(Boolean share) {
                this.share = share;
                return this;
            }

            /**
             * stop_apt_code.
             */
            public Builder stopAptCode(String stopAptCode) {
                this.stopAptCode = stopAptCode;
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
             * stop_city_code.
             */
            public Builder stopCityCode(String stopCityCode) {
                this.stopCityCode = stopCityCode;
                return this;
            }

            /**
             * stop_dep_time.
             */
            public Builder stopDepTime(String stopDepTime) {
                this.stopDepTime = stopDepTime;
                return this;
            }

            public FlightSegmentList build() {
                return new FlightSegmentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class PassengerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost_center_id")
        private String costCenterId;

        @com.aliyun.core.annotation.NameInMap("cost_center_name")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("department_id")
        private String departmentId;

        @com.aliyun.core.annotation.NameInMap("department_name")
        private String departmentName;

        @com.aliyun.core.annotation.NameInMap("invoice_id")
        private String invoiceId;

        @com.aliyun.core.annotation.NameInMap("invoice_title")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("job_no")
        private String jobNo;

        @com.aliyun.core.annotation.NameInMap("passenger_type")
        private Integer passengerType;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private PassengerList(Builder builder) {
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.departmentId = builder.departmentId;
            this.departmentName = builder.departmentName;
            this.invoiceId = builder.invoiceId;
            this.invoiceTitle = builder.invoiceTitle;
            this.jobNo = builder.jobNo;
            this.passengerType = builder.passengerType;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerList create() {
            return builder().build();
        }

        /**
         * @return costCenterId
         */
        public String getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return departmentId
         */
        public String getDepartmentId() {
            return this.departmentId;
        }

        /**
         * @return departmentName
         */
        public String getDepartmentName() {
            return this.departmentName;
        }

        /**
         * @return invoiceId
         */
        public String getInvoiceId() {
            return this.invoiceId;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return jobNo
         */
        public String getJobNo() {
            return this.jobNo;
        }

        /**
         * @return passengerType
         */
        public Integer getPassengerType() {
            return this.passengerType;
        }

        /**
         * @return projectCode
         */
        public String getProjectCode() {
            return this.projectCode;
        }

        /**
         * @return projectTitle
         */
        public String getProjectTitle() {
            return this.projectTitle;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String costCenterId; 
            private String costCenterName; 
            private String departmentId; 
            private String departmentName; 
            private String invoiceId; 
            private String invoiceTitle; 
            private String jobNo; 
            private Integer passengerType; 
            private String projectCode; 
            private String projectTitle; 
            private String userId; 
            private String userName; 

            /**
             * cost_center_id.
             */
            public Builder costCenterId(String costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * cost_center_name.
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * department_id.
             */
            public Builder departmentId(String departmentId) {
                this.departmentId = departmentId;
                return this;
            }

            /**
             * department_name.
             */
            public Builder departmentName(String departmentName) {
                this.departmentName = departmentName;
                return this;
            }

            /**
             * invoice_id.
             */
            public Builder invoiceId(String invoiceId) {
                this.invoiceId = invoiceId;
                return this;
            }

            /**
             * invoice_title.
             */
            public Builder invoiceTitle(String invoiceTitle) {
                this.invoiceTitle = invoiceTitle;
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
             * passenger_type.
             */
            public Builder passengerType(Integer passengerType) {
                this.passengerType = passengerType;
                return this;
            }

            /**
             * project_code.
             */
            public Builder projectCode(String projectCode) {
                this.projectCode = projectCode;
                return this;
            }

            /**
             * project_title.
             */
            public Builder projectTitle(String projectTitle) {
                this.projectTitle = projectTitle;
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
             * user_name.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public PassengerList build() {
                return new PassengerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class FlightSaleOrder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_id")
        private Long applyId;

        @com.aliyun.core.annotation.NameInMap("book_type")
        private Integer bookType;

        @com.aliyun.core.annotation.NameInMap("booker_info")
        private BookerInfo bookerInfo;

        @com.aliyun.core.annotation.NameInMap("corp_pay_price")
        private Long corpPayPrice;

        @com.aliyun.core.annotation.NameInMap("exceed_apply_id")
        private String exceedApplyId;

        @com.aliyun.core.annotation.NameInMap("flight_order_insure_list")
        private java.util.List<FlightOrderInsureList> flightOrderInsureList;

        @com.aliyun.core.annotation.NameInMap("flight_order_ticket_list")
        private java.util.List<FlightOrderTicketList> flightOrderTicketList;

        @com.aliyun.core.annotation.NameInMap("flight_segment_list")
        private java.util.List<FlightSegmentList> flightSegmentList;

        @com.aliyun.core.annotation.NameInMap("mix_pay")
        private Boolean mixPay;

        @com.aliyun.core.annotation.NameInMap("order_create_time")
        private String orderCreateTime;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("order_pay_time")
        private String orderPayTime;

        @com.aliyun.core.annotation.NameInMap("order_reserve_price")
        private Long orderReservePrice;

        @com.aliyun.core.annotation.NameInMap("order_status")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("order_status_desc")
        private String orderStatusDesc;

        @com.aliyun.core.annotation.NameInMap("order_type")
        private Integer orderType;

        @com.aliyun.core.annotation.NameInMap("passenger_list")
        private java.util.List<PassengerList> passengerList;

        @com.aliyun.core.annotation.NameInMap("pay_type")
        private Integer payType;

        @com.aliyun.core.annotation.NameInMap("person_pay_price")
        private Long personPayPrice;

        @com.aliyun.core.annotation.NameInMap("service_fee")
        private Long serviceFee;

        @com.aliyun.core.annotation.NameInMap("third_part_apply_id")
        private String thirdPartApplyId;

        @com.aliyun.core.annotation.NameInMap("trip_type")
        private Integer tripType;

        private FlightSaleOrder(Builder builder) {
            this.applyId = builder.applyId;
            this.bookType = builder.bookType;
            this.bookerInfo = builder.bookerInfo;
            this.corpPayPrice = builder.corpPayPrice;
            this.exceedApplyId = builder.exceedApplyId;
            this.flightOrderInsureList = builder.flightOrderInsureList;
            this.flightOrderTicketList = builder.flightOrderTicketList;
            this.flightSegmentList = builder.flightSegmentList;
            this.mixPay = builder.mixPay;
            this.orderCreateTime = builder.orderCreateTime;
            this.orderId = builder.orderId;
            this.orderPayTime = builder.orderPayTime;
            this.orderReservePrice = builder.orderReservePrice;
            this.orderStatus = builder.orderStatus;
            this.orderStatusDesc = builder.orderStatusDesc;
            this.orderType = builder.orderType;
            this.passengerList = builder.passengerList;
            this.payType = builder.payType;
            this.personPayPrice = builder.personPayPrice;
            this.serviceFee = builder.serviceFee;
            this.thirdPartApplyId = builder.thirdPartApplyId;
            this.tripType = builder.tripType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightSaleOrder create() {
            return builder().build();
        }

        /**
         * @return applyId
         */
        public Long getApplyId() {
            return this.applyId;
        }

        /**
         * @return bookType
         */
        public Integer getBookType() {
            return this.bookType;
        }

        /**
         * @return bookerInfo
         */
        public BookerInfo getBookerInfo() {
            return this.bookerInfo;
        }

        /**
         * @return corpPayPrice
         */
        public Long getCorpPayPrice() {
            return this.corpPayPrice;
        }

        /**
         * @return exceedApplyId
         */
        public String getExceedApplyId() {
            return this.exceedApplyId;
        }

        /**
         * @return flightOrderInsureList
         */
        public java.util.List<FlightOrderInsureList> getFlightOrderInsureList() {
            return this.flightOrderInsureList;
        }

        /**
         * @return flightOrderTicketList
         */
        public java.util.List<FlightOrderTicketList> getFlightOrderTicketList() {
            return this.flightOrderTicketList;
        }

        /**
         * @return flightSegmentList
         */
        public java.util.List<FlightSegmentList> getFlightSegmentList() {
            return this.flightSegmentList;
        }

        /**
         * @return mixPay
         */
        public Boolean getMixPay() {
            return this.mixPay;
        }

        /**
         * @return orderCreateTime
         */
        public String getOrderCreateTime() {
            return this.orderCreateTime;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderPayTime
         */
        public String getOrderPayTime() {
            return this.orderPayTime;
        }

        /**
         * @return orderReservePrice
         */
        public Long getOrderReservePrice() {
            return this.orderReservePrice;
        }

        /**
         * @return orderStatus
         */
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return orderStatusDesc
         */
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        /**
         * @return orderType
         */
        public Integer getOrderType() {
            return this.orderType;
        }

        /**
         * @return passengerList
         */
        public java.util.List<PassengerList> getPassengerList() {
            return this.passengerList;
        }

        /**
         * @return payType
         */
        public Integer getPayType() {
            return this.payType;
        }

        /**
         * @return personPayPrice
         */
        public Long getPersonPayPrice() {
            return this.personPayPrice;
        }

        /**
         * @return serviceFee
         */
        public Long getServiceFee() {
            return this.serviceFee;
        }

        /**
         * @return thirdPartApplyId
         */
        public String getThirdPartApplyId() {
            return this.thirdPartApplyId;
        }

        /**
         * @return tripType
         */
        public Integer getTripType() {
            return this.tripType;
        }

        public static final class Builder {
            private Long applyId; 
            private Integer bookType; 
            private BookerInfo bookerInfo; 
            private Long corpPayPrice; 
            private String exceedApplyId; 
            private java.util.List<FlightOrderInsureList> flightOrderInsureList; 
            private java.util.List<FlightOrderTicketList> flightOrderTicketList; 
            private java.util.List<FlightSegmentList> flightSegmentList; 
            private Boolean mixPay; 
            private String orderCreateTime; 
            private String orderId; 
            private String orderPayTime; 
            private Long orderReservePrice; 
            private Integer orderStatus; 
            private String orderStatusDesc; 
            private Integer orderType; 
            private java.util.List<PassengerList> passengerList; 
            private Integer payType; 
            private Long personPayPrice; 
            private Long serviceFee; 
            private String thirdPartApplyId; 
            private Integer tripType; 

            /**
             * apply_id.
             */
            public Builder applyId(Long applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * book_type.
             */
            public Builder bookType(Integer bookType) {
                this.bookType = bookType;
                return this;
            }

            /**
             * booker_info.
             */
            public Builder bookerInfo(BookerInfo bookerInfo) {
                this.bookerInfo = bookerInfo;
                return this;
            }

            /**
             * corp_pay_price.
             */
            public Builder corpPayPrice(Long corpPayPrice) {
                this.corpPayPrice = corpPayPrice;
                return this;
            }

            /**
             * exceed_apply_id.
             */
            public Builder exceedApplyId(String exceedApplyId) {
                this.exceedApplyId = exceedApplyId;
                return this;
            }

            /**
             * flight_order_insure_list.
             */
            public Builder flightOrderInsureList(java.util.List<FlightOrderInsureList> flightOrderInsureList) {
                this.flightOrderInsureList = flightOrderInsureList;
                return this;
            }

            /**
             * flight_order_ticket_list.
             */
            public Builder flightOrderTicketList(java.util.List<FlightOrderTicketList> flightOrderTicketList) {
                this.flightOrderTicketList = flightOrderTicketList;
                return this;
            }

            /**
             * flight_segment_list.
             */
            public Builder flightSegmentList(java.util.List<FlightSegmentList> flightSegmentList) {
                this.flightSegmentList = flightSegmentList;
                return this;
            }

            /**
             * mix_pay.
             */
            public Builder mixPay(Boolean mixPay) {
                this.mixPay = mixPay;
                return this;
            }

            /**
             * order_create_time.
             */
            public Builder orderCreateTime(String orderCreateTime) {
                this.orderCreateTime = orderCreateTime;
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
             * order_pay_time.
             */
            public Builder orderPayTime(String orderPayTime) {
                this.orderPayTime = orderPayTime;
                return this;
            }

            /**
             * order_reserve_price.
             */
            public Builder orderReservePrice(Long orderReservePrice) {
                this.orderReservePrice = orderReservePrice;
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
             * order_status_desc.
             */
            public Builder orderStatusDesc(String orderStatusDesc) {
                this.orderStatusDesc = orderStatusDesc;
                return this;
            }

            /**
             * order_type.
             */
            public Builder orderType(Integer orderType) {
                this.orderType = orderType;
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
             * pay_type.
             */
            public Builder payType(Integer payType) {
                this.payType = payType;
                return this;
            }

            /**
             * person_pay_price.
             */
            public Builder personPayPrice(Long personPayPrice) {
                this.personPayPrice = personPayPrice;
                return this;
            }

            /**
             * service_fee.
             */
            public Builder serviceFee(Long serviceFee) {
                this.serviceFee = serviceFee;
                return this;
            }

            /**
             * third_part_apply_id.
             */
            public Builder thirdPartApplyId(String thirdPartApplyId) {
                this.thirdPartApplyId = thirdPartApplyId;
                return this;
            }

            /**
             * trip_type.
             */
            public Builder tripType(Integer tripType) {
                this.tripType = tripType;
                return this;
            }

            public FlightSaleOrder build() {
                return new FlightSaleOrder(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flight_modify_order_list")
        private java.util.List<FlightModifyOrderList> flightModifyOrderList;

        @com.aliyun.core.annotation.NameInMap("flight_refund_order_list")
        private java.util.List<FlightRefundOrderList> flightRefundOrderList;

        @com.aliyun.core.annotation.NameInMap("flight_sale_order")
        private FlightSaleOrder flightSaleOrder;

        private Module(Builder builder) {
            this.flightModifyOrderList = builder.flightModifyOrderList;
            this.flightRefundOrderList = builder.flightRefundOrderList;
            this.flightSaleOrder = builder.flightSaleOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return flightModifyOrderList
         */
        public java.util.List<FlightModifyOrderList> getFlightModifyOrderList() {
            return this.flightModifyOrderList;
        }

        /**
         * @return flightRefundOrderList
         */
        public java.util.List<FlightRefundOrderList> getFlightRefundOrderList() {
            return this.flightRefundOrderList;
        }

        /**
         * @return flightSaleOrder
         */
        public FlightSaleOrder getFlightSaleOrder() {
            return this.flightSaleOrder;
        }

        public static final class Builder {
            private java.util.List<FlightModifyOrderList> flightModifyOrderList; 
            private java.util.List<FlightRefundOrderList> flightRefundOrderList; 
            private FlightSaleOrder flightSaleOrder; 

            /**
             * flight_modify_order_list.
             */
            public Builder flightModifyOrderList(java.util.List<FlightModifyOrderList> flightModifyOrderList) {
                this.flightModifyOrderList = flightModifyOrderList;
                return this;
            }

            /**
             * flight_refund_order_list.
             */
            public Builder flightRefundOrderList(java.util.List<FlightRefundOrderList> flightRefundOrderList) {
                this.flightRefundOrderList = flightRefundOrderList;
                return this;
            }

            /**
             * flight_sale_order.
             */
            public Builder flightSaleOrder(FlightSaleOrder flightSaleOrder) {
                this.flightSaleOrder = flightSaleOrder;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderListQueryResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("scroll_id")
        private String scrollId;

        @com.aliyun.core.annotation.NameInMap("total_number")
        private Integer totalNumber;

        private PageInfo(Builder builder) {
            this.number = builder.number;
            this.scrollId = builder.scrollId;
            this.totalNumber = builder.totalNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return scrollId
         */
        public String getScrollId() {
            return this.scrollId;
        }

        /**
         * @return totalNumber
         */
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

        public static final class Builder {
            private Integer number; 
            private String scrollId; 
            private Integer totalNumber; 

            /**
             * number.
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * scroll_id.
             */
            public Builder scrollId(String scrollId) {
                this.scrollId = scrollId;
                return this;
            }

            /**
             * total_number.
             */
            public Builder totalNumber(Integer totalNumber) {
                this.totalNumber = totalNumber;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
