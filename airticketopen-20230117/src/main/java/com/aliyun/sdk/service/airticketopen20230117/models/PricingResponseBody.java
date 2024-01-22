// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PricingResponseBody} extends {@link TeaModel}
 *
 * <p>PricingResponseBody</p>
 */
public class PricingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("data")
    private Data data;

    @NameInMap("error_code")
    private String errorCode;

    @NameInMap("error_data")
    private Object errorData;

    @NameInMap("error_msg")
    private String errorMsg;

    @NameInMap("status")
    private Integer status;

    @NameInMap("success")
    private Boolean success;

    private PricingResponseBody(Builder builder) {
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

    public static PricingResponseBody create() {
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

        public PricingResponseBody build() {
            return new PricingResponseBody(this);
        } 

    } 

    public static class ChangedPriceInfo extends TeaModel {
        @NameInMap("adult_price")
        private Double adultPrice;

        @NameInMap("adult_tax")
        private Double adultTax;

        @NameInMap("child_price")
        private Double childPrice;

        @NameInMap("child_tax")
        private Double childTax;

        @NameInMap("infant_price")
        private Double infantPrice;

        @NameInMap("infant_tax")
        private Double infantTax;

        private ChangedPriceInfo(Builder builder) {
            this.adultPrice = builder.adultPrice;
            this.adultTax = builder.adultTax;
            this.childPrice = builder.childPrice;
            this.childTax = builder.childTax;
            this.infantPrice = builder.infantPrice;
            this.infantTax = builder.infantTax;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangedPriceInfo create() {
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

        public static final class Builder {
            private Double adultPrice; 
            private Double adultTax; 
            private Double childPrice; 
            private Double childTax; 
            private Double infantPrice; 
            private Double infantTax; 

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

            public ChangedPriceInfo build() {
                return new ChangedPriceInfo(this);
            } 

        } 

    }
    public static class OriginalPriceInfo extends TeaModel {
        @NameInMap("adult_price")
        private Double adultPrice;

        @NameInMap("adult_tax")
        private Double adultTax;

        @NameInMap("child_price")
        private Double childPrice;

        @NameInMap("child_tax")
        private Double childTax;

        @NameInMap("infant_price")
        private Double infantPrice;

        @NameInMap("infant_tax")
        private Double infantTax;

        private OriginalPriceInfo(Builder builder) {
            this.adultPrice = builder.adultPrice;
            this.adultTax = builder.adultTax;
            this.childPrice = builder.childPrice;
            this.childTax = builder.childTax;
            this.infantPrice = builder.infantPrice;
            this.infantTax = builder.infantTax;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginalPriceInfo create() {
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

        public static final class Builder {
            private Double adultPrice; 
            private Double adultTax; 
            private Double childPrice; 
            private Double childTax; 
            private Double infantPrice; 
            private Double infantTax; 

            /**
             * 成人单价
             */
            public Builder adultPrice(Double adultPrice) {
                this.adultPrice = adultPrice;
                return this;
            }

            /**
             * 成人税
             */
            public Builder adultTax(Double adultTax) {
                this.adultTax = adultTax;
                return this;
            }

            /**
             * 儿童单价
             */
            public Builder childPrice(Double childPrice) {
                this.childPrice = childPrice;
                return this;
            }

            /**
             * 儿童税
             */
            public Builder childTax(Double childTax) {
                this.childTax = childTax;
                return this;
            }

            /**
             * 婴儿单价
             */
            public Builder infantPrice(Double infantPrice) {
                this.infantPrice = infantPrice;
                return this;
            }

            /**
             * 婴儿税
             */
            public Builder infantTax(Double infantTax) {
                this.infantTax = infantTax;
                return this;
            }

            public OriginalPriceInfo build() {
                return new OriginalPriceInfo(this);
            } 

        } 

    }
    public static class SegmentList extends TeaModel {
        @NameInMap("arrival_airport")
        private String arrivalAirport;

        @NameInMap("arrival_city")
        private String arrivalCity;

        @NameInMap("arrival_terminal")
        private String arrivalTerminal;

        @NameInMap("arrival_time")
        private String arrivalTime;

        @NameInMap("availability")
        private String availability;

        @NameInMap("cabin")
        private String cabin;

        @NameInMap("cabin_class")
        private String cabinClass;

        @NameInMap("code_share")
        private Boolean codeShare;

        @NameInMap("departure_airport")
        private String departureAirport;

        @NameInMap("departure_city")
        private String departureCity;

        @NameInMap("departure_terminal")
        private String departureTerminal;

        @NameInMap("departure_time")
        private String departureTime;

        @NameInMap("equip_type")
        private String equipType;

        @NameInMap("flight_duration")
        private Integer flightDuration;

        @NameInMap("marketing_airline")
        private String marketingAirline;

        @NameInMap("marketing_flight_no")
        private String marketingFlightNo;

        @NameInMap("marketing_flight_no_int")
        private Integer marketingFlightNoInt;

        @NameInMap("operating_airline")
        private String operatingAirline;

        @NameInMap("operating_flight_no")
        private String operatingFlightNo;

        @NameInMap("segment_id")
        private String segmentId;

        @NameInMap("stop_city_list")
        private String stopCityList;

        @NameInMap("stop_quantity")
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
        @NameInMap("segment_list")
        private java.util.List < SegmentList> segmentList;

        @NameInMap("transfer_count")
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
        @NameInMap("luggage_direct_info_type")
        private Integer luggageDirectInfoType;

        @NameInMap("segment_id_list")
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
        @NameInMap("passenger_baggage_allowance_mapping")
        private java.util.Map < String, DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue > passengerBaggageAllowanceMapping;

        @NameInMap("segment_id_list")
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
        public java.util.Map < String, DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue > getPassengerBaggageAllowanceMapping() {
            return this.passengerBaggageAllowanceMapping;
        }

        /**
         * @return segmentIdList
         */
        public java.util.List < String > getSegmentIdList() {
            return this.segmentIdList;
        }

        public static final class Builder {
            private java.util.Map < String, DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue > passengerBaggageAllowanceMapping; 
            private java.util.List < String > segmentIdList; 

            /**
             * passenger_baggage_allowance_mapping.
             */
            public Builder passengerBaggageAllowanceMapping(java.util.Map < String, DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue > passengerBaggageAllowanceMapping) {
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
        @NameInMap("refund_change_rule_map")
        private java.util.Map < String, DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue > refundChangeRuleMap;

        @NameInMap("segment_id_list")
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
        public java.util.Map < String, DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue > getRefundChangeRuleMap() {
            return this.refundChangeRuleMap;
        }

        /**
         * @return segmentIdList
         */
        public java.util.List < String > getSegmentIdList() {
            return this.segmentIdList;
        }

        public static final class Builder {
            private java.util.Map < String, DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue > refundChangeRuleMap; 
            private java.util.List < String > segmentIdList; 

            /**
             * refund_change_rule_map.
             */
            public Builder refundChangeRuleMap(java.util.Map < String, DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue > refundChangeRuleMap) {
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
    public static class Solution extends TeaModel {
        @NameInMap("adult_price")
        private Double adultPrice;

        @NameInMap("adult_tax")
        private Double adultTax;

        @NameInMap("child_price")
        private Double childPrice;

        @NameInMap("child_tax")
        private Double childTax;

        @NameInMap("infant_price")
        private Double infantPrice;

        @NameInMap("infant_tax")
        private Double infantTax;

        @NameInMap("journey_list")
        private java.util.List < JourneyList> journeyList;

        @NameInMap("product_type_description")
        private String productTypeDescription;

        @NameInMap("refund_ticket_coupon_description")
        private String refundTicketCouponDescription;

        @NameInMap("segment_baggage_check_in_info_list")
        private java.util.List < SegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList;

        @NameInMap("segment_baggage_mapping_list")
        private java.util.List < SegmentBaggageMappingList> segmentBaggageMappingList;

        @NameInMap("segment_refund_change_rule_mapping_list")
        private java.util.List < SegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList;

        @NameInMap("solution_id")
        private String solutionId;

        private Solution(Builder builder) {
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

        public static Solution create() {
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
             * 成人单价
             */
            public Builder adultPrice(Double adultPrice) {
                this.adultPrice = adultPrice;
                return this;
            }

            /**
             * 成人税
             */
            public Builder adultTax(Double adultTax) {
                this.adultTax = adultTax;
                return this;
            }

            /**
             * 儿童单价
             */
            public Builder childPrice(Double childPrice) {
                this.childPrice = childPrice;
                return this;
            }

            /**
             * 儿童税
             */
            public Builder childTax(Double childTax) {
                this.childTax = childTax;
                return this;
            }

            /**
             * 婴儿单价
             */
            public Builder infantPrice(Double infantPrice) {
                this.infantPrice = infantPrice;
                return this;
            }

            /**
             * 婴儿税
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

            public Solution build() {
                return new Solution(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("changed_price_info")
        private ChangedPriceInfo changedPriceInfo;

        @NameInMap("is_changed")
        private Boolean isChanged;

        @NameInMap("original_price_info")
        private OriginalPriceInfo originalPriceInfo;

        @NameInMap("remain_seats")
        private String remainSeats;

        @NameInMap("solution")
        private Solution solution;

        private Data(Builder builder) {
            this.changedPriceInfo = builder.changedPriceInfo;
            this.isChanged = builder.isChanged;
            this.originalPriceInfo = builder.originalPriceInfo;
            this.remainSeats = builder.remainSeats;
            this.solution = builder.solution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return changedPriceInfo
         */
        public ChangedPriceInfo getChangedPriceInfo() {
            return this.changedPriceInfo;
        }

        /**
         * @return isChanged
         */
        public Boolean getIsChanged() {
            return this.isChanged;
        }

        /**
         * @return originalPriceInfo
         */
        public OriginalPriceInfo getOriginalPriceInfo() {
            return this.originalPriceInfo;
        }

        /**
         * @return remainSeats
         */
        public String getRemainSeats() {
            return this.remainSeats;
        }

        /**
         * @return solution
         */
        public Solution getSolution() {
            return this.solution;
        }

        public static final class Builder {
            private ChangedPriceInfo changedPriceInfo; 
            private Boolean isChanged; 
            private OriginalPriceInfo originalPriceInfo; 
            private String remainSeats; 
            private Solution solution; 

            /**
             * changed_price_info.
             */
            public Builder changedPriceInfo(ChangedPriceInfo changedPriceInfo) {
                this.changedPriceInfo = changedPriceInfo;
                return this;
            }

            /**
             * is_changed.
             */
            public Builder isChanged(Boolean isChanged) {
                this.isChanged = isChanged;
                return this;
            }

            /**
             * 变价之前价格信息 isChanged = true 时，才有值
             */
            public Builder originalPriceInfo(OriginalPriceInfo originalPriceInfo) {
                this.originalPriceInfo = originalPriceInfo;
                return this;
            }

            /**
             * remain_seats.
             */
            public Builder remainSeats(String remainSeats) {
                this.remainSeats = remainSeats;
                return this;
            }

            /**
             * solution
             */
            public Builder solution(Solution solution) {
                this.solution = solution;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
