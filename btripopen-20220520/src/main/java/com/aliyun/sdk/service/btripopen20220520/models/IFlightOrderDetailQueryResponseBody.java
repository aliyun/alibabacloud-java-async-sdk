// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
 *
 * <p>IFlightOrderDetailQueryResponseBody</p>
 */
public class IFlightOrderDetailQueryResponseBody extends TeaModel {
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

    private IFlightOrderDetailQueryResponseBody(Builder builder) {
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

    public static IFlightOrderDetailQueryResponseBody create() {
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

        public IFlightOrderDetailQueryResponseBody build() {
            return new IFlightOrderDetailQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
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
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
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
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
     */
    public static class FlightOrderModifyTicketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private java.util.List < CabinClass> cabinClass;

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
        public java.util.List < CabinClass> getCabinClass() {
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
            private java.util.List < CabinClass> cabinClass; 
            private String flightNo; 
            private String ticketNo; 
            private String userId; 

            /**
             * cabin_class.
             */
            public Builder cabinClass(java.util.List < CabinClass> cabinClass) {
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
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
     */
    public static class ModifyFee extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modify_hand_fee")
        private Long modifyHandFee;

        @com.aliyun.core.annotation.NameInMap("modify_upgrade_fee")
        private Long modifyUpgradeFee;

        @com.aliyun.core.annotation.NameInMap("tax_gap")
        private Long taxGap;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private ModifyFee(Builder builder) {
            this.modifyHandFee = builder.modifyHandFee;
            this.modifyUpgradeFee = builder.modifyUpgradeFee;
            this.taxGap = builder.taxGap;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyFee create() {
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

            public ModifyFee build() {
                return new ModifyFee(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
     */
    public static class FlightModifyOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("corp_pay_price")
        private Integer corpPayPrice;

        @com.aliyun.core.annotation.NameInMap("flight_modify_segment_list")
        private java.util.List < FlightModifySegmentList> flightModifySegmentList;

        @com.aliyun.core.annotation.NameInMap("flight_order_modify_ticket_list")
        private java.util.List < FlightOrderModifyTicketList> flightOrderModifyTicketList;

        @com.aliyun.core.annotation.NameInMap("modify_apply_id")
        private Long modifyApplyId;

        @com.aliyun.core.annotation.NameInMap("modify_fee")
        private java.util.List < ModifyFee> modifyFee;

        @com.aliyun.core.annotation.NameInMap("modify_order_status")
        private Integer modifyOrderStatus;

        @com.aliyun.core.annotation.NameInMap("modify_total_fee")
        private Integer modifyTotalFee;

        @com.aliyun.core.annotation.NameInMap("passenger_list")
        private java.util.List < String > passengerList;

        @com.aliyun.core.annotation.NameInMap("person_pay_price")
        private Integer personPayPrice;

        @com.aliyun.core.annotation.NameInMap("relate_modify_apply_id")
        private Long relateModifyApplyId;

        @com.aliyun.core.annotation.NameInMap("service_fee")
        private Long serviceFee;

        @com.aliyun.core.annotation.NameInMap("submit_modify_time")
        private String submitModifyTime;

        @com.aliyun.core.annotation.NameInMap("voluntary")
        private Boolean voluntary;

        private FlightModifyOrderList(Builder builder) {
            this.corpPayPrice = builder.corpPayPrice;
            this.flightModifySegmentList = builder.flightModifySegmentList;
            this.flightOrderModifyTicketList = builder.flightOrderModifyTicketList;
            this.modifyApplyId = builder.modifyApplyId;
            this.modifyFee = builder.modifyFee;
            this.modifyOrderStatus = builder.modifyOrderStatus;
            this.modifyTotalFee = builder.modifyTotalFee;
            this.passengerList = builder.passengerList;
            this.personPayPrice = builder.personPayPrice;
            this.relateModifyApplyId = builder.relateModifyApplyId;
            this.serviceFee = builder.serviceFee;
            this.submitModifyTime = builder.submitModifyTime;
            this.voluntary = builder.voluntary;
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
        public java.util.List < FlightModifySegmentList> getFlightModifySegmentList() {
            return this.flightModifySegmentList;
        }

        /**
         * @return flightOrderModifyTicketList
         */
        public java.util.List < FlightOrderModifyTicketList> getFlightOrderModifyTicketList() {
            return this.flightOrderModifyTicketList;
        }

        /**
         * @return modifyApplyId
         */
        public Long getModifyApplyId() {
            return this.modifyApplyId;
        }

        /**
         * @return modifyFee
         */
        public java.util.List < ModifyFee> getModifyFee() {
            return this.modifyFee;
        }

        /**
         * @return modifyOrderStatus
         */
        public Integer getModifyOrderStatus() {
            return this.modifyOrderStatus;
        }

        /**
         * @return modifyTotalFee
         */
        public Integer getModifyTotalFee() {
            return this.modifyTotalFee;
        }

        /**
         * @return passengerList
         */
        public java.util.List < String > getPassengerList() {
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
         * @return submitModifyTime
         */
        public String getSubmitModifyTime() {
            return this.submitModifyTime;
        }

        /**
         * @return voluntary
         */
        public Boolean getVoluntary() {
            return this.voluntary;
        }

        public static final class Builder {
            private Integer corpPayPrice; 
            private java.util.List < FlightModifySegmentList> flightModifySegmentList; 
            private java.util.List < FlightOrderModifyTicketList> flightOrderModifyTicketList; 
            private Long modifyApplyId; 
            private java.util.List < ModifyFee> modifyFee; 
            private Integer modifyOrderStatus; 
            private Integer modifyTotalFee; 
            private java.util.List < String > passengerList; 
            private Integer personPayPrice; 
            private Long relateModifyApplyId; 
            private Long serviceFee; 
            private String submitModifyTime; 
            private Boolean voluntary; 

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
            public Builder flightModifySegmentList(java.util.List < FlightModifySegmentList> flightModifySegmentList) {
                this.flightModifySegmentList = flightModifySegmentList;
                return this;
            }

            /**
             * flight_order_modify_ticket_list.
             */
            public Builder flightOrderModifyTicketList(java.util.List < FlightOrderModifyTicketList> flightOrderModifyTicketList) {
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
             * modify_fee.
             */
            public Builder modifyFee(java.util.List < ModifyFee> modifyFee) {
                this.modifyFee = modifyFee;
                return this;
            }

            /**
             * modify_order_status.
             */
            public Builder modifyOrderStatus(Integer modifyOrderStatus) {
                this.modifyOrderStatus = modifyOrderStatus;
                return this;
            }

            /**
             * modify_total_fee.
             */
            public Builder modifyTotalFee(Integer modifyTotalFee) {
                this.modifyTotalFee = modifyTotalFee;
                return this;
            }

            /**
             * passenger_list.
             */
            public Builder passengerList(java.util.List < String > passengerList) {
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
             * submit_modify_time.
             */
            public Builder submitModifyTime(String submitModifyTime) {
                this.submitModifyTime = submitModifyTime;
                return this;
            }

            /**
             * voluntary.
             */
            public Builder voluntary(Boolean voluntary) {
                this.voluntary = voluntary;
                return this;
            }

            public FlightModifyOrderList build() {
                return new FlightModifyOrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
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
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
     */
    public static class FlightOrderRefundTicketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private java.util.List < FlightOrderRefundTicketListCabinClass> cabinClass;

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
        public java.util.List < FlightOrderRefundTicketListCabinClass> getCabinClass() {
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
            private java.util.List < FlightOrderRefundTicketListCabinClass> cabinClass; 
            private String flightNo; 
            private String ticketNo; 
            private String userId; 

            /**
             * cabin_class.
             */
            public Builder cabinClass(java.util.List < FlightOrderRefundTicketListCabinClass> cabinClass) {
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
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
     */
    public static class FlightPassengerFee extends TeaModel {
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

        private FlightPassengerFee(Builder builder) {
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

        public static FlightPassengerFee create() {
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

            public FlightPassengerFee build() {
                return new FlightPassengerFee(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
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
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
     */
    public static class FlightRefundOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("corp_refund_Amount")
        private Integer corpRefundAmount;

        @com.aliyun.core.annotation.NameInMap("flight_order_refund_ticket_list")
        private java.util.List < FlightOrderRefundTicketList> flightOrderRefundTicketList;

        @com.aliyun.core.annotation.NameInMap("flight_passenger_fee")
        private java.util.List < FlightPassengerFee> flightPassengerFee;

        @com.aliyun.core.annotation.NameInMap("flight_refund_segment_list")
        private java.util.List < FlightRefundSegmentList> flightRefundSegmentList;

        @com.aliyun.core.annotation.NameInMap("passenger_list")
        private java.util.List < String > passengerList;

        @com.aliyun.core.annotation.NameInMap("person_refund_Amount")
        private Integer personRefundAmount;

        @com.aliyun.core.annotation.NameInMap("refund_apply_id")
        private Long refundApplyId;

        @com.aliyun.core.annotation.NameInMap("refund_hand_fee")
        private Integer refundHandFee;

        @com.aliyun.core.annotation.NameInMap("refund_order_status")
        private Integer refundOrderStatus;

        @com.aliyun.core.annotation.NameInMap("refund_service_fee")
        private Long refundServiceFee;

        @com.aliyun.core.annotation.NameInMap("refund_total_Amount")
        private Integer refundTotalAmount;

        @com.aliyun.core.annotation.NameInMap("relate_modify_apply_id")
        private java.util.List < Long > relateModifyApplyId;

        @com.aliyun.core.annotation.NameInMap("relate_refund_apply_id")
        private Long relateRefundApplyId;

        @com.aliyun.core.annotation.NameInMap("repeat_refund")
        private Boolean repeatRefund;

        @com.aliyun.core.annotation.NameInMap("submit_refund_time")
        private String submitRefundTime;

        @com.aliyun.core.annotation.NameInMap("voluntary")
        private Boolean voluntary;

        private FlightRefundOrderList(Builder builder) {
            this.corpRefundAmount = builder.corpRefundAmount;
            this.flightOrderRefundTicketList = builder.flightOrderRefundTicketList;
            this.flightPassengerFee = builder.flightPassengerFee;
            this.flightRefundSegmentList = builder.flightRefundSegmentList;
            this.passengerList = builder.passengerList;
            this.personRefundAmount = builder.personRefundAmount;
            this.refundApplyId = builder.refundApplyId;
            this.refundHandFee = builder.refundHandFee;
            this.refundOrderStatus = builder.refundOrderStatus;
            this.refundServiceFee = builder.refundServiceFee;
            this.refundTotalAmount = builder.refundTotalAmount;
            this.relateModifyApplyId = builder.relateModifyApplyId;
            this.relateRefundApplyId = builder.relateRefundApplyId;
            this.repeatRefund = builder.repeatRefund;
            this.submitRefundTime = builder.submitRefundTime;
            this.voluntary = builder.voluntary;
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
        public java.util.List < FlightOrderRefundTicketList> getFlightOrderRefundTicketList() {
            return this.flightOrderRefundTicketList;
        }

        /**
         * @return flightPassengerFee
         */
        public java.util.List < FlightPassengerFee> getFlightPassengerFee() {
            return this.flightPassengerFee;
        }

        /**
         * @return flightRefundSegmentList
         */
        public java.util.List < FlightRefundSegmentList> getFlightRefundSegmentList() {
            return this.flightRefundSegmentList;
        }

        /**
         * @return passengerList
         */
        public java.util.List < String > getPassengerList() {
            return this.passengerList;
        }

        /**
         * @return personRefundAmount
         */
        public Integer getPersonRefundAmount() {
            return this.personRefundAmount;
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
         * @return refundOrderStatus
         */
        public Integer getRefundOrderStatus() {
            return this.refundOrderStatus;
        }

        /**
         * @return refundServiceFee
         */
        public Long getRefundServiceFee() {
            return this.refundServiceFee;
        }

        /**
         * @return refundTotalAmount
         */
        public Integer getRefundTotalAmount() {
            return this.refundTotalAmount;
        }

        /**
         * @return relateModifyApplyId
         */
        public java.util.List < Long > getRelateModifyApplyId() {
            return this.relateModifyApplyId;
        }

        /**
         * @return relateRefundApplyId
         */
        public Long getRelateRefundApplyId() {
            return this.relateRefundApplyId;
        }

        /**
         * @return repeatRefund
         */
        public Boolean getRepeatRefund() {
            return this.repeatRefund;
        }

        /**
         * @return submitRefundTime
         */
        public String getSubmitRefundTime() {
            return this.submitRefundTime;
        }

        /**
         * @return voluntary
         */
        public Boolean getVoluntary() {
            return this.voluntary;
        }

        public static final class Builder {
            private Integer corpRefundAmount; 
            private java.util.List < FlightOrderRefundTicketList> flightOrderRefundTicketList; 
            private java.util.List < FlightPassengerFee> flightPassengerFee; 
            private java.util.List < FlightRefundSegmentList> flightRefundSegmentList; 
            private java.util.List < String > passengerList; 
            private Integer personRefundAmount; 
            private Long refundApplyId; 
            private Integer refundHandFee; 
            private Integer refundOrderStatus; 
            private Long refundServiceFee; 
            private Integer refundTotalAmount; 
            private java.util.List < Long > relateModifyApplyId; 
            private Long relateRefundApplyId; 
            private Boolean repeatRefund; 
            private String submitRefundTime; 
            private Boolean voluntary; 

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
            public Builder flightOrderRefundTicketList(java.util.List < FlightOrderRefundTicketList> flightOrderRefundTicketList) {
                this.flightOrderRefundTicketList = flightOrderRefundTicketList;
                return this;
            }

            /**
             * flight_passenger_fee.
             */
            public Builder flightPassengerFee(java.util.List < FlightPassengerFee> flightPassengerFee) {
                this.flightPassengerFee = flightPassengerFee;
                return this;
            }

            /**
             * flight_refund_segment_list.
             */
            public Builder flightRefundSegmentList(java.util.List < FlightRefundSegmentList> flightRefundSegmentList) {
                this.flightRefundSegmentList = flightRefundSegmentList;
                return this;
            }

            /**
             * passenger_list.
             */
            public Builder passengerList(java.util.List < String > passengerList) {
                this.passengerList = passengerList;
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
             * refund_order_status.
             */
            public Builder refundOrderStatus(Integer refundOrderStatus) {
                this.refundOrderStatus = refundOrderStatus;
                return this;
            }

            /**
             * refund_service_fee.
             */
            public Builder refundServiceFee(Long refundServiceFee) {
                this.refundServiceFee = refundServiceFee;
                return this;
            }

            /**
             * refund_total_Amount.
             */
            public Builder refundTotalAmount(Integer refundTotalAmount) {
                this.refundTotalAmount = refundTotalAmount;
                return this;
            }

            /**
             * relate_modify_apply_id.
             */
            public Builder relateModifyApplyId(java.util.List < Long > relateModifyApplyId) {
                this.relateModifyApplyId = relateModifyApplyId;
                return this;
            }

            /**
             * relate_refund_apply_id.
             */
            public Builder relateRefundApplyId(Long relateRefundApplyId) {
                this.relateRefundApplyId = relateRefundApplyId;
                return this;
            }

            /**
             * repeat_refund.
             */
            public Builder repeatRefund(Boolean repeatRefund) {
                this.repeatRefund = repeatRefund;
                return this;
            }

            /**
             * submit_refund_time.
             */
            public Builder submitRefundTime(String submitRefundTime) {
                this.submitRefundTime = submitRefundTime;
                return this;
            }

            /**
             * voluntary.
             */
            public Builder voluntary(Boolean voluntary) {
                this.voluntary = voluntary;
                return this;
            }

            public FlightRefundOrderList build() {
                return new FlightRefundOrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
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
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
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
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
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
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
     */
    public static class FlightOrderTicketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private java.util.List < FlightOrderTicketListCabinClass> cabinClass;

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
        public java.util.List < FlightOrderTicketListCabinClass> getCabinClass() {
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
            private java.util.List < FlightOrderTicketListCabinClass> cabinClass; 
            private Integer tax; 
            private String ticketNo; 
            private Integer ticketPrice; 
            private String userId; 

            /**
             * cabin_class.
             */
            public Builder cabinClass(java.util.List < FlightOrderTicketListCabinClass> cabinClass) {
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
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
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
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
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
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
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
        private java.util.List < FlightOrderInsureList> flightOrderInsureList;

        @com.aliyun.core.annotation.NameInMap("flight_order_ticket_list")
        private java.util.List < FlightOrderTicketList> flightOrderTicketList;

        @com.aliyun.core.annotation.NameInMap("flight_segment_list")
        private java.util.List < FlightSegmentList> flightSegmentList;

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
        private java.util.List < PassengerList> passengerList;

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
        public java.util.List < FlightOrderInsureList> getFlightOrderInsureList() {
            return this.flightOrderInsureList;
        }

        /**
         * @return flightOrderTicketList
         */
        public java.util.List < FlightOrderTicketList> getFlightOrderTicketList() {
            return this.flightOrderTicketList;
        }

        /**
         * @return flightSegmentList
         */
        public java.util.List < FlightSegmentList> getFlightSegmentList() {
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
        public java.util.List < PassengerList> getPassengerList() {
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
            private java.util.List < FlightOrderInsureList> flightOrderInsureList; 
            private java.util.List < FlightOrderTicketList> flightOrderTicketList; 
            private java.util.List < FlightSegmentList> flightSegmentList; 
            private Boolean mixPay; 
            private String orderCreateTime; 
            private String orderId; 
            private String orderPayTime; 
            private Long orderReservePrice; 
            private Integer orderStatus; 
            private String orderStatusDesc; 
            private Integer orderType; 
            private java.util.List < PassengerList> passengerList; 
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
            public Builder flightOrderInsureList(java.util.List < FlightOrderInsureList> flightOrderInsureList) {
                this.flightOrderInsureList = flightOrderInsureList;
                return this;
            }

            /**
             * flight_order_ticket_list.
             */
            public Builder flightOrderTicketList(java.util.List < FlightOrderTicketList> flightOrderTicketList) {
                this.flightOrderTicketList = flightOrderTicketList;
                return this;
            }

            /**
             * flight_segment_list.
             */
            public Builder flightSegmentList(java.util.List < FlightSegmentList> flightSegmentList) {
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
            public Builder passengerList(java.util.List < PassengerList> passengerList) {
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
     * {@link IFlightOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IFlightOrderDetailQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flight_modify_order_list")
        private java.util.List < FlightModifyOrderList> flightModifyOrderList;

        @com.aliyun.core.annotation.NameInMap("flight_refund_order_list")
        private java.util.List < FlightRefundOrderList> flightRefundOrderList;

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
        public java.util.List < FlightModifyOrderList> getFlightModifyOrderList() {
            return this.flightModifyOrderList;
        }

        /**
         * @return flightRefundOrderList
         */
        public java.util.List < FlightRefundOrderList> getFlightRefundOrderList() {
            return this.flightRefundOrderList;
        }

        /**
         * @return flightSaleOrder
         */
        public FlightSaleOrder getFlightSaleOrder() {
            return this.flightSaleOrder;
        }

        public static final class Builder {
            private java.util.List < FlightModifyOrderList> flightModifyOrderList; 
            private java.util.List < FlightRefundOrderList> flightRefundOrderList; 
            private FlightSaleOrder flightSaleOrder; 

            /**
             * flight_modify_order_list.
             */
            public Builder flightModifyOrderList(java.util.List < FlightModifyOrderList> flightModifyOrderList) {
                this.flightModifyOrderList = flightModifyOrderList;
                return this;
            }

            /**
             * flight_refund_order_list.
             */
            public Builder flightRefundOrderList(java.util.List < FlightRefundOrderList> flightRefundOrderList) {
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
}
