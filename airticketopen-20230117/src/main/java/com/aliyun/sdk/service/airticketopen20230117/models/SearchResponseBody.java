// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchResponseBody} extends {@link TeaModel}
 *
 * <p>SearchResponseBody</p>
 */
public class SearchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("error_code")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("error_data")
    private Object errorData;

    @com.aliyun.core.annotation.NameInMap("error_msg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private SearchResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorData = builder.errorData;
        this.errorMsg = builder.errorMsg;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorData
     */
    public Object getErrorData() {
        return this.errorData;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Data data; 
        private String errorCode; 
        private Object errorData; 
        private String errorMsg; 
        private Integer status; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * error_code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * error_data.
         */
        public Builder errorData(Object errorData) {
            this.errorData = errorData;
            return this;
        }

        /**
         * error_msg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SearchResponseBody build() {
            return new SearchResponseBody(this);
        } 

    } 

    public static class SegmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arrival_airport")
        private String arrivalAirport;

        @com.aliyun.core.annotation.NameInMap("arrival_city")
        private String arrivalCity;

        @com.aliyun.core.annotation.NameInMap("arrival_terminal")
        private String arrivalTerminal;

        @com.aliyun.core.annotation.NameInMap("arrival_time")
        private String arrivalTime;

        @com.aliyun.core.annotation.NameInMap("availability")
        private String availability;

        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("code_share")
        private Boolean codeShare;

        @com.aliyun.core.annotation.NameInMap("departure_airport")
        private String departureAirport;

        @com.aliyun.core.annotation.NameInMap("departure_city")
        private String departureCity;

        @com.aliyun.core.annotation.NameInMap("departure_terminal")
        private String departureTerminal;

        @com.aliyun.core.annotation.NameInMap("departure_time")
        private String departureTime;

        @com.aliyun.core.annotation.NameInMap("equip_type")
        private String equipType;

        @com.aliyun.core.annotation.NameInMap("flight_duration")
        private Integer flightDuration;

        @com.aliyun.core.annotation.NameInMap("marketing_airline")
        private String marketingAirline;

        @com.aliyun.core.annotation.NameInMap("marketing_flight_no")
        private String marketingFlightNo;

        @com.aliyun.core.annotation.NameInMap("marketing_flight_no_int")
        private Integer marketingFlightNoInt;

        @com.aliyun.core.annotation.NameInMap("operating_airline")
        private String operatingAirline;

        @com.aliyun.core.annotation.NameInMap("operating_flight_no")
        private String operatingFlightNo;

        @com.aliyun.core.annotation.NameInMap("segment_id")
        private String segmentId;

        @com.aliyun.core.annotation.NameInMap("stop_city_list")
        private String stopCityList;

        @com.aliyun.core.annotation.NameInMap("stop_quantity")
        private Integer stopQuantity;

        private SegmentList(Builder builder) {
            this.arrivalAirport = builder.arrivalAirport;
            this.arrivalCity = builder.arrivalCity;
            this.arrivalTerminal = builder.arrivalTerminal;
            this.arrivalTime = builder.arrivalTime;
            this.availability = builder.availability;
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.codeShare = builder.codeShare;
            this.departureAirport = builder.departureAirport;
            this.departureCity = builder.departureCity;
            this.departureTerminal = builder.departureTerminal;
            this.departureTime = builder.departureTime;
            this.equipType = builder.equipType;
            this.flightDuration = builder.flightDuration;
            this.marketingAirline = builder.marketingAirline;
            this.marketingFlightNo = builder.marketingFlightNo;
            this.marketingFlightNoInt = builder.marketingFlightNoInt;
            this.operatingAirline = builder.operatingAirline;
            this.operatingFlightNo = builder.operatingFlightNo;
            this.segmentId = builder.segmentId;
            this.stopCityList = builder.stopCityList;
            this.stopQuantity = builder.stopQuantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentList create() {
            return builder().build();
        }

        /**
         * @return arrivalAirport
         */
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        /**
         * @return arrivalCity
         */
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        /**
         * @return arrivalTerminal
         */
        public String getArrivalTerminal() {
            return this.arrivalTerminal;
        }

        /**
         * @return arrivalTime
         */
        public String getArrivalTime() {
            return this.arrivalTime;
        }

        /**
         * @return availability
         */
        public String getAvailability() {
            return this.availability;
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
         * @return codeShare
         */
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        /**
         * @return departureAirport
         */
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        /**
         * @return departureCity
         */
        public String getDepartureCity() {
            return this.departureCity;
        }

        /**
         * @return departureTerminal
         */
        public String getDepartureTerminal() {
            return this.departureTerminal;
        }

        /**
         * @return departureTime
         */
        public String getDepartureTime() {
            return this.departureTime;
        }

        /**
         * @return equipType
         */
        public String getEquipType() {
            return this.equipType;
        }

        /**
         * @return flightDuration
         */
        public Integer getFlightDuration() {
            return this.flightDuration;
        }

        /**
         * @return marketingAirline
         */
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        /**
         * @return marketingFlightNo
         */
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        /**
         * @return marketingFlightNoInt
         */
        public Integer getMarketingFlightNoInt() {
            return this.marketingFlightNoInt;
        }

        /**
         * @return operatingAirline
         */
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        /**
         * @return operatingFlightNo
         */
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        /**
         * @return segmentId
         */
        public String getSegmentId() {
            return this.segmentId;
        }

        /**
         * @return stopCityList
         */
        public String getStopCityList() {
            return this.stopCityList;
        }

        /**
         * @return stopQuantity
         */
        public Integer getStopQuantity() {
            return this.stopQuantity;
        }

        public static final class Builder {
            private String arrivalAirport; 
            private String arrivalCity; 
            private String arrivalTerminal; 
            private String arrivalTime; 
            private String availability; 
            private String cabin; 
            private String cabinClass; 
            private Boolean codeShare; 
            private String departureAirport; 
            private String departureCity; 
            private String departureTerminal; 
            private String departureTime; 
            private String equipType; 
            private Integer flightDuration; 
            private String marketingAirline; 
            private String marketingFlightNo; 
            private Integer marketingFlightNoInt; 
            private String operatingAirline; 
            private String operatingFlightNo; 
            private String segmentId; 
            private String stopCityList; 
            private Integer stopQuantity; 

            /**
             * arrival_airport.
             */
            public Builder arrivalAirport(String arrivalAirport) {
                this.arrivalAirport = arrivalAirport;
                return this;
            }

            /**
             * arrival_city.
             */
            public Builder arrivalCity(String arrivalCity) {
                this.arrivalCity = arrivalCity;
                return this;
            }

            /**
             * arrival_terminal.
             */
            public Builder arrivalTerminal(String arrivalTerminal) {
                this.arrivalTerminal = arrivalTerminal;
                return this;
            }

            /**
             * arrival_time.
             */
            public Builder arrivalTime(String arrivalTime) {
                this.arrivalTime = arrivalTime;
                return this;
            }

            /**
             * availability.
             */
            public Builder availability(String availability) {
                this.availability = availability;
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
             * code_share.
             */
            public Builder codeShare(Boolean codeShare) {
                this.codeShare = codeShare;
                return this;
            }

            /**
             * departure_airport.
             */
            public Builder departureAirport(String departureAirport) {
                this.departureAirport = departureAirport;
                return this;
            }

            /**
             * departure_city.
             */
            public Builder departureCity(String departureCity) {
                this.departureCity = departureCity;
                return this;
            }

            /**
             * departure_terminal.
             */
            public Builder departureTerminal(String departureTerminal) {
                this.departureTerminal = departureTerminal;
                return this;
            }

            /**
             * departure_time.
             */
            public Builder departureTime(String departureTime) {
                this.departureTime = departureTime;
                return this;
            }

            /**
             * equip_type.
             */
            public Builder equipType(String equipType) {
                this.equipType = equipType;
                return this;
            }

            /**
             * flight_duration.
             */
            public Builder flightDuration(Integer flightDuration) {
                this.flightDuration = flightDuration;
                return this;
            }

            /**
             * marketing_airline.
             */
            public Builder marketingAirline(String marketingAirline) {
                this.marketingAirline = marketingAirline;
                return this;
            }

            /**
             * marketing_flight_no.
             */
            public Builder marketingFlightNo(String marketingFlightNo) {
                this.marketingFlightNo = marketingFlightNo;
                return this;
            }

            /**
             * marketing_flight_no_int.
             */
            public Builder marketingFlightNoInt(Integer marketingFlightNoInt) {
                this.marketingFlightNoInt = marketingFlightNoInt;
                return this;
            }

            /**
             * operating_airline.
             */
            public Builder operatingAirline(String operatingAirline) {
                this.operatingAirline = operatingAirline;
                return this;
            }

            /**
             * operating_flight_no.
             */
            public Builder operatingFlightNo(String operatingFlightNo) {
                this.operatingFlightNo = operatingFlightNo;
                return this;
            }

            /**
             * segment_id.
             */
            public Builder segmentId(String segmentId) {
                this.segmentId = segmentId;
                return this;
            }

            /**
             * stop_city_list.
             */
            public Builder stopCityList(String stopCityList) {
                this.stopCityList = stopCityList;
                return this;
            }

            /**
             * stop_quantity.
             */
            public Builder stopQuantity(Integer stopQuantity) {
                this.stopQuantity = stopQuantity;
                return this;
            }

            public SegmentList build() {
                return new SegmentList(this);
            } 

        } 

    }
    public static class JourneyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_list")
        private java.util.List < SegmentList> segmentList;

        @com.aliyun.core.annotation.NameInMap("transfer_count")
        private Integer transferCount;

        private JourneyList(Builder builder) {
            this.segmentList = builder.segmentList;
            this.transferCount = builder.transferCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JourneyList create() {
            return builder().build();
        }

        /**
         * @return segmentList
         */
        public java.util.List < SegmentList> getSegmentList() {
            return this.segmentList;
        }

        /**
         * @return transferCount
         */
        public Integer getTransferCount() {
            return this.transferCount;
        }

        public static final class Builder {
            private java.util.List < SegmentList> segmentList; 
            private Integer transferCount; 

            /**
             * segment_list.
             */
            public Builder segmentList(java.util.List < SegmentList> segmentList) {
                this.segmentList = segmentList;
                return this;
            }

            /**
             * transfer_count.
             */
            public Builder transferCount(Integer transferCount) {
                this.transferCount = transferCount;
                return this;
            }

            public JourneyList build() {
                return new JourneyList(this);
            } 

        } 

    }
    public static class SegmentBaggageCheckInInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("luggage_direct_info_type")
        private Integer luggageDirectInfoType;

        @com.aliyun.core.annotation.NameInMap("segment_id_list")
        private java.util.List < String > segmentIdList;

        private SegmentBaggageCheckInInfoList(Builder builder) {
            this.luggageDirectInfoType = builder.luggageDirectInfoType;
            this.segmentIdList = builder.segmentIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentBaggageCheckInInfoList create() {
            return builder().build();
        }

        /**
         * @return luggageDirectInfoType
         */
        public Integer getLuggageDirectInfoType() {
            return this.luggageDirectInfoType;
        }

        /**
         * @return segmentIdList
         */
        public java.util.List < String > getSegmentIdList() {
            return this.segmentIdList;
        }

        public static final class Builder {
            private Integer luggageDirectInfoType; 
            private java.util.List < String > segmentIdList; 

            /**
             * luggage_direct_info_type.
             */
            public Builder luggageDirectInfoType(Integer luggageDirectInfoType) {
                this.luggageDirectInfoType = luggageDirectInfoType;
                return this;
            }

            /**
             * segment_id_list.
             */
            public Builder segmentIdList(java.util.List < String > segmentIdList) {
                this.segmentIdList = segmentIdList;
                return this;
            }

            public SegmentBaggageCheckInInfoList build() {
                return new SegmentBaggageCheckInInfoList(this);
            } 

        } 

    }
    public static class SegmentBaggageMappingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_baggage_allowance_mapping")
        private java.util.Map < String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue > passengerBaggageAllowanceMapping;

        @com.aliyun.core.annotation.NameInMap("segment_id_list")
        private java.util.List < String > segmentIdList;

        private SegmentBaggageMappingList(Builder builder) {
            this.passengerBaggageAllowanceMapping = builder.passengerBaggageAllowanceMapping;
            this.segmentIdList = builder.segmentIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentBaggageMappingList create() {
            return builder().build();
        }

        /**
         * @return passengerBaggageAllowanceMapping
         */
        public java.util.Map < String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue > getPassengerBaggageAllowanceMapping() {
            return this.passengerBaggageAllowanceMapping;
        }

        /**
         * @return segmentIdList
         */
        public java.util.List < String > getSegmentIdList() {
            return this.segmentIdList;
        }

        public static final class Builder {
            private java.util.Map < String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue > passengerBaggageAllowanceMapping; 
            private java.util.List < String > segmentIdList; 

            /**
             * passenger_baggage_allowance_mapping.
             */
            public Builder passengerBaggageAllowanceMapping(java.util.Map < String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue > passengerBaggageAllowanceMapping) {
                this.passengerBaggageAllowanceMapping = passengerBaggageAllowanceMapping;
                return this;
            }

            /**
             * segment_id_list.
             */
            public Builder segmentIdList(java.util.List < String > segmentIdList) {
                this.segmentIdList = segmentIdList;
                return this;
            }

            public SegmentBaggageMappingList build() {
                return new SegmentBaggageMappingList(this);
            } 

        } 

    }
    public static class SegmentRefundChangeRuleMappingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("refund_change_rule_map")
        private java.util.Map < String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue > refundChangeRuleMap;

        @com.aliyun.core.annotation.NameInMap("segment_id_list")
        private java.util.List < String > segmentIdList;

        private SegmentRefundChangeRuleMappingList(Builder builder) {
            this.refundChangeRuleMap = builder.refundChangeRuleMap;
            this.segmentIdList = builder.segmentIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentRefundChangeRuleMappingList create() {
            return builder().build();
        }

        /**
         * @return refundChangeRuleMap
         */
        public java.util.Map < String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue > getRefundChangeRuleMap() {
            return this.refundChangeRuleMap;
        }

        /**
         * @return segmentIdList
         */
        public java.util.List < String > getSegmentIdList() {
            return this.segmentIdList;
        }

        public static final class Builder {
            private java.util.Map < String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue > refundChangeRuleMap; 
            private java.util.List < String > segmentIdList; 

            /**
             * refund_change_rule_map.
             */
            public Builder refundChangeRuleMap(java.util.Map < String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue > refundChangeRuleMap) {
                this.refundChangeRuleMap = refundChangeRuleMap;
                return this;
            }

            /**
             * segment_id_list.
             */
            public Builder segmentIdList(java.util.List < String > segmentIdList) {
                this.segmentIdList = segmentIdList;
                return this;
            }

            public SegmentRefundChangeRuleMappingList build() {
                return new SegmentRefundChangeRuleMappingList(this);
            } 

        } 

    }
    public static class SolutionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adult_price")
        private Double adultPrice;

        @com.aliyun.core.annotation.NameInMap("adult_tax")
        private Double adultTax;

        @com.aliyun.core.annotation.NameInMap("child_price")
        private Double childPrice;

        @com.aliyun.core.annotation.NameInMap("child_tax")
        private Double childTax;

        @com.aliyun.core.annotation.NameInMap("infant_price")
        private Double infantPrice;

        @com.aliyun.core.annotation.NameInMap("infant_tax")
        private Double infantTax;

        @com.aliyun.core.annotation.NameInMap("journey_list")
        private java.util.List < JourneyList> journeyList;

        @com.aliyun.core.annotation.NameInMap("product_type_description")
        private String productTypeDescription;

        @com.aliyun.core.annotation.NameInMap("refund_ticket_coupon_description")
        private String refundTicketCouponDescription;

        @com.aliyun.core.annotation.NameInMap("segment_baggage_check_in_info_list")
        private java.util.List < SegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList;

        @com.aliyun.core.annotation.NameInMap("segment_baggage_mapping_list")
        private java.util.List < SegmentBaggageMappingList> segmentBaggageMappingList;

        @com.aliyun.core.annotation.NameInMap("segment_refund_change_rule_mapping_list")
        private java.util.List < SegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList;

        @com.aliyun.core.annotation.NameInMap("solution_id")
        private String solutionId;

        private SolutionList(Builder builder) {
            this.adultPrice = builder.adultPrice;
            this.adultTax = builder.adultTax;
            this.childPrice = builder.childPrice;
            this.childTax = builder.childTax;
            this.infantPrice = builder.infantPrice;
            this.infantTax = builder.infantTax;
            this.journeyList = builder.journeyList;
            this.productTypeDescription = builder.productTypeDescription;
            this.refundTicketCouponDescription = builder.refundTicketCouponDescription;
            this.segmentBaggageCheckInInfoList = builder.segmentBaggageCheckInInfoList;
            this.segmentBaggageMappingList = builder.segmentBaggageMappingList;
            this.segmentRefundChangeRuleMappingList = builder.segmentRefundChangeRuleMappingList;
            this.solutionId = builder.solutionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SolutionList create() {
            return builder().build();
        }

        /**
         * @return adultPrice
         */
        public Double getAdultPrice() {
            return this.adultPrice;
        }

        /**
         * @return adultTax
         */
        public Double getAdultTax() {
            return this.adultTax;
        }

        /**
         * @return childPrice
         */
        public Double getChildPrice() {
            return this.childPrice;
        }

        /**
         * @return childTax
         */
        public Double getChildTax() {
            return this.childTax;
        }

        /**
         * @return infantPrice
         */
        public Double getInfantPrice() {
            return this.infantPrice;
        }

        /**
         * @return infantTax
         */
        public Double getInfantTax() {
            return this.infantTax;
        }

        /**
         * @return journeyList
         */
        public java.util.List < JourneyList> getJourneyList() {
            return this.journeyList;
        }

        /**
         * @return productTypeDescription
         */
        public String getProductTypeDescription() {
            return this.productTypeDescription;
        }

        /**
         * @return refundTicketCouponDescription
         */
        public String getRefundTicketCouponDescription() {
            return this.refundTicketCouponDescription;
        }

        /**
         * @return segmentBaggageCheckInInfoList
         */
        public java.util.List < SegmentBaggageCheckInInfoList> getSegmentBaggageCheckInInfoList() {
            return this.segmentBaggageCheckInInfoList;
        }

        /**
         * @return segmentBaggageMappingList
         */
        public java.util.List < SegmentBaggageMappingList> getSegmentBaggageMappingList() {
            return this.segmentBaggageMappingList;
        }

        /**
         * @return segmentRefundChangeRuleMappingList
         */
        public java.util.List < SegmentRefundChangeRuleMappingList> getSegmentRefundChangeRuleMappingList() {
            return this.segmentRefundChangeRuleMappingList;
        }

        /**
         * @return solutionId
         */
        public String getSolutionId() {
            return this.solutionId;
        }

        public static final class Builder {
            private Double adultPrice; 
            private Double adultTax; 
            private Double childPrice; 
            private Double childTax; 
            private Double infantPrice; 
            private Double infantTax; 
            private java.util.List < JourneyList> journeyList; 
            private String productTypeDescription; 
            private String refundTicketCouponDescription; 
            private java.util.List < SegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList; 
            private java.util.List < SegmentBaggageMappingList> segmentBaggageMappingList; 
            private java.util.List < SegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList; 
            private String solutionId; 

            /**
             * adult_price.
             */
            public Builder adultPrice(Double adultPrice) {
                this.adultPrice = adultPrice;
                return this;
            }

            /**
             * adult_tax.
             */
            public Builder adultTax(Double adultTax) {
                this.adultTax = adultTax;
                return this;
            }

            /**
             * child_price.
             */
            public Builder childPrice(Double childPrice) {
                this.childPrice = childPrice;
                return this;
            }

            /**
             * child_tax.
             */
            public Builder childTax(Double childTax) {
                this.childTax = childTax;
                return this;
            }

            /**
             * infant_price.
             */
            public Builder infantPrice(Double infantPrice) {
                this.infantPrice = infantPrice;
                return this;
            }

            /**
             * infant_tax.
             */
            public Builder infantTax(Double infantTax) {
                this.infantTax = infantTax;
                return this;
            }

            /**
             * journey_list.
             */
            public Builder journeyList(java.util.List < JourneyList> journeyList) {
                this.journeyList = journeyList;
                return this;
            }

            /**
             * product_type_description.
             */
            public Builder productTypeDescription(String productTypeDescription) {
                this.productTypeDescription = productTypeDescription;
                return this;
            }

            /**
             * refund_ticket_coupon_description.
             */
            public Builder refundTicketCouponDescription(String refundTicketCouponDescription) {
                this.refundTicketCouponDescription = refundTicketCouponDescription;
                return this;
            }

            /**
             * segment_baggage_check_in_info_list.
             */
            public Builder segmentBaggageCheckInInfoList(java.util.List < SegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList) {
                this.segmentBaggageCheckInInfoList = segmentBaggageCheckInInfoList;
                return this;
            }

            /**
             * segment_baggage_mapping_list.
             */
            public Builder segmentBaggageMappingList(java.util.List < SegmentBaggageMappingList> segmentBaggageMappingList) {
                this.segmentBaggageMappingList = segmentBaggageMappingList;
                return this;
            }

            /**
             * segment_refund_change_rule_mapping_list.
             */
            public Builder segmentRefundChangeRuleMappingList(java.util.List < SegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList) {
                this.segmentRefundChangeRuleMappingList = segmentRefundChangeRuleMappingList;
                return this;
            }

            /**
             * solution_id
             */
            public Builder solutionId(String solutionId) {
                this.solutionId = solutionId;
                return this;
            }

            public SolutionList build() {
                return new SolutionList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("solution_list")
        private java.util.List < SolutionList> solutionList;

        private Data(Builder builder) {
            this.solutionList = builder.solutionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return solutionList
         */
        public java.util.List < SolutionList> getSolutionList() {
            return this.solutionList;
        }

        public static final class Builder {
            private java.util.List < SolutionList> solutionList; 

            /**
             * solution_list.
             */
            public Builder solutionList(java.util.List < SolutionList> solutionList) {
                this.solutionList = solutionList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
