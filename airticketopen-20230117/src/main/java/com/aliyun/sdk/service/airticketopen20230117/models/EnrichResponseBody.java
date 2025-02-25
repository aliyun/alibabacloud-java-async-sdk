// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link EnrichResponseBody} extends {@link TeaModel}
 *
 * <p>EnrichResponseBody</p>
 */
public class EnrichResponseBody extends TeaModel {
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

    private EnrichResponseBody(Builder builder) {
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

    public static EnrichResponseBody create() {
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
         * <p>request ID</p>
         * 
         * <strong>example:</strong>
         * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>error code</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>error data</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorData(Object errorData) {
            this.errorData = errorData;
            return this;
        }

        /**
         * <p>error message</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>http reqeust has been processed successfully，status code is 200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>true represents success, false represents failure</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public EnrichResponseBody build() {
            return new EnrichResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnrichResponseBody} extends {@link TeaModel}
     *
     * <p>EnrichResponseBody</p>
     */
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
             * <p>arrival airport code (capitalized)</p>
             * 
             * <strong>example:</strong>
             * <p>MFM</p>
             */
            public Builder arrivalAirport(String arrivalAirport) {
                this.arrivalAirport = arrivalAirport;
                return this;
            }

            /**
             * <p>arrival city code (capitalized)</p>
             * 
             * <strong>example:</strong>
             * <p>MFM</p>
             */
            public Builder arrivalCity(String arrivalCity) {
                this.arrivalCity = arrivalCity;
                return this;
            }

            /**
             * <p>arrival terminal</p>
             * 
             * <strong>example:</strong>
             * <p>T1</p>
             */
            public Builder arrivalTerminal(String arrivalTerminal) {
                this.arrivalTerminal = arrivalTerminal;
                return this;
            }

            /**
             * <p>arrival time in string format (yyyy-MM-dd HH:mm:ss)</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-10 10:40:00</p>
             */
            public Builder arrivalTime(String arrivalTime) {
                this.arrivalTime = arrivalTime;
                return this;
            }

            /**
             * <p>available seats (for reference only)</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder availability(String availability) {
                this.availability = availability;
                return this;
            }

            /**
             * <p>RBD</p>
             * 
             * <strong>example:</strong>
             * <p>V</p>
             */
            public Builder cabin(String cabin) {
                this.cabin = cabin;
                return this;
            }

            /**
             * <p>cabin class</p>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * <p>code share or not</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder codeShare(Boolean codeShare) {
                this.codeShare = codeShare;
                return this;
            }

            /**
             * <p>departure airport code (capitalized)</p>
             * 
             * <strong>example:</strong>
             * <p>PVG</p>
             */
            public Builder departureAirport(String departureAirport) {
                this.departureAirport = departureAirport;
                return this;
            }

            /**
             * <p>departure city code (capitalized)</p>
             * 
             * <strong>example:</strong>
             * <p>SHA</p>
             */
            public Builder departureCity(String departureCity) {
                this.departureCity = departureCity;
                return this;
            }

            /**
             * <p>departure terminal</p>
             * 
             * <strong>example:</strong>
             * <p>T2</p>
             */
            public Builder departureTerminal(String departureTerminal) {
                this.departureTerminal = departureTerminal;
                return this;
            }

            /**
             * <p>departure time in string format (yyyy-MM-dd HH:mm:ss)</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-10 07:55:00</p>
             */
            public Builder departureTime(String departureTime) {
                this.departureTime = departureTime;
                return this;
            }

            /**
             * <p>equipment type</p>
             * 
             * <strong>example:</strong>
             * <p>32Q</p>
             */
            public Builder equipType(String equipType) {
                this.equipType = equipType;
                return this;
            }

            /**
             * <p>flight time, unit: minute</p>
             * 
             * <strong>example:</strong>
             * <p>165</p>
             */
            public Builder flightDuration(Integer flightDuration) {
                this.flightDuration = flightDuration;
                return this;
            }

            /**
             * <p>marketing airline code (eg: KA)</p>
             * 
             * <strong>example:</strong>
             * <p>HO</p>
             */
            public Builder marketingAirline(String marketingAirline) {
                this.marketingAirline = marketingAirline;
                return this;
            }

            /**
             * <p>marketing airline flight no. (eg: KA5809)</p>
             * 
             * <strong>example:</strong>
             * <p>HO1295</p>
             */
            public Builder marketingFlightNo(String marketingFlightNo) {
                this.marketingFlightNo = marketingFlightNo;
                return this;
            }

            /**
             * <p>marketing airline integer flight no. (eg: 5809)</p>
             * 
             * <strong>example:</strong>
             * <p>1295</p>
             */
            public Builder marketingFlightNoInt(Integer marketingFlightNoInt) {
                this.marketingFlightNoInt = marketingFlightNoInt;
                return this;
            }

            /**
             * <p>operating airline code (eg: CX)</p>
             * 
             * <strong>example:</strong>
             * <p>HO</p>
             */
            public Builder operatingAirline(String operatingAirline) {
                this.operatingAirline = operatingAirline;
                return this;
            }

            /**
             * <p>operating airline flight no. (eg: CX601)</p>
             * 
             * <strong>example:</strong>
             * <p>HO1295</p>
             */
            public Builder operatingFlightNo(String operatingFlightNo) {
                this.operatingFlightNo = operatingFlightNo;
                return this;
            }

            /**
             * <p>segment ID format: flight no.+departure airport[IATA airport code]+arrival airport[IATA airport code]+departure time(MMdd)</p>
             * 
             * <strong>example:</strong>
             * <p>HO1295-PVG-MFM-20230310</p>
             */
            public Builder segmentId(String segmentId) {
                this.segmentId = segmentId;
                return this;
            }

            /**
             * <p>stop city list. 
             * when stop_quantity &gt; 1 , use “,” for seperation</p>
             * 
             * <strong>example:</strong>
             * <p>MFM,PVG</p>
             */
            public Builder stopCityList(String stopCityList) {
                this.stopCityList = stopCityList;
                return this;
            }

            /**
             * <p>number of stops</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link EnrichResponseBody} extends {@link TeaModel}
     *
     * <p>EnrichResponseBody</p>
     */
    public static class JourneyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_list")
        private java.util.List<SegmentList> segmentList;

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
        public java.util.List<SegmentList> getSegmentList() {
            return this.segmentList;
        }

        /**
         * @return transferCount
         */
        public Integer getTransferCount() {
            return this.transferCount;
        }

        public static final class Builder {
            private java.util.List<SegmentList> segmentList; 
            private Integer transferCount; 

            /**
             * <p>segment Info</p>
             */
            public Builder segmentList(java.util.List<SegmentList> segmentList) {
                this.segmentList = segmentList;
                return this;
            }

            /**
             * <p>number of transfers</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link EnrichResponseBody} extends {@link TeaModel}
     *
     * <p>EnrichResponseBody</p>
     */
    public static class SegmentBaggageCheckInInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("luggage_direct_info_type")
        private Integer luggageDirectInfoType;

        @com.aliyun.core.annotation.NameInMap("segment_id_list")
        private java.util.List<String> segmentIdList;

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
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

        public static final class Builder {
            private Integer luggageDirectInfoType; 
            private java.util.List<String> segmentIdList; 

            /**
             * <p>through check-in baggage policy type</p>
             * <ol>
             * <li>baggage through check-in between segments</li>
             * <li>baggage re-check-in needed between segments</li>
             * <li>baggage through check-in at stop city ( applies for stop flight )</li>
             * <li>baggage re-checkin needed at stop city ( applies for stop flight )</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder luggageDirectInfoType(Integer luggageDirectInfoType) {
                this.luggageDirectInfoType = luggageDirectInfoType;
                return this;
            }

            /**
             * <p>segment id list. all the listed segment ids share the same baggage through check-in policy</p>
             */
            public Builder segmentIdList(java.util.List<String> segmentIdList) {
                this.segmentIdList = segmentIdList;
                return this;
            }

            public SegmentBaggageCheckInInfoList build() {
                return new SegmentBaggageCheckInInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnrichResponseBody} extends {@link TeaModel}
     *
     * <p>EnrichResponseBody</p>
     */
    public static class SegmentBaggageMappingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_baggage_allowance_mapping")
        private java.util.Map<String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> passengerBaggageAllowanceMapping;

        @com.aliyun.core.annotation.NameInMap("segment_id_list")
        private java.util.List<String> segmentIdList;

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
        public java.util.Map<String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> getPassengerBaggageAllowanceMapping() {
            return this.passengerBaggageAllowanceMapping;
        }

        /**
         * @return segmentIdList
         */
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

        public static final class Builder {
            private java.util.Map<String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> passengerBaggageAllowanceMapping; 
            private java.util.List<String> segmentIdList; 

            /**
             * <p>baggage rule mapping, key is passenger type, value is baggage allowance details</p>
             */
            public Builder passengerBaggageAllowanceMapping(java.util.Map<String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> passengerBaggageAllowanceMapping) {
                this.passengerBaggageAllowanceMapping = passengerBaggageAllowanceMapping;
                return this;
            }

            /**
             * <p>segment id list. 
             * all the listed segment ids share the same baggage rule</p>
             */
            public Builder segmentIdList(java.util.List<String> segmentIdList) {
                this.segmentIdList = segmentIdList;
                return this;
            }

            public SegmentBaggageMappingList build() {
                return new SegmentBaggageMappingList(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnrichResponseBody} extends {@link TeaModel}
     *
     * <p>EnrichResponseBody</p>
     */
    public static class SegmentRefundChangeRuleMappingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("refund_change_rule_map")
        private java.util.Map<String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> refundChangeRuleMap;

        @com.aliyun.core.annotation.NameInMap("segment_id_list")
        private java.util.List<String> segmentIdList;

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
        public java.util.Map<String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> getRefundChangeRuleMap() {
            return this.refundChangeRuleMap;
        }

        /**
         * @return segmentIdList
         */
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

        public static final class Builder {
            private java.util.Map<String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> refundChangeRuleMap; 
            private java.util.List<String> segmentIdList; 

            /**
             * <p>change and refund policy mapping, key is passenger type, value is change and refund policy detail</p>
             */
            public Builder refundChangeRuleMap(java.util.Map<String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> refundChangeRuleMap) {
                this.refundChangeRuleMap = refundChangeRuleMap;
                return this;
            }

            /**
             * <p>segment id list. all the listed segment ids share the same change and refund policy</p>
             */
            public Builder segmentIdList(java.util.List<String> segmentIdList) {
                this.segmentIdList = segmentIdList;
                return this;
            }

            public SegmentRefundChangeRuleMappingList build() {
                return new SegmentRefundChangeRuleMappingList(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnrichResponseBody} extends {@link TeaModel}
     *
     * <p>EnrichResponseBody</p>
     */
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
        private java.util.List<JourneyList> journeyList;

        @com.aliyun.core.annotation.NameInMap("product_type_description")
        private String productTypeDescription;

        @com.aliyun.core.annotation.NameInMap("refund_ticket_coupon_description")
        private String refundTicketCouponDescription;

        @com.aliyun.core.annotation.NameInMap("segment_baggage_check_in_info_list")
        private java.util.List<SegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList;

        @com.aliyun.core.annotation.NameInMap("segment_baggage_mapping_list")
        private java.util.List<SegmentBaggageMappingList> segmentBaggageMappingList;

        @com.aliyun.core.annotation.NameInMap("segment_refund_change_rule_mapping_list")
        private java.util.List<SegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList;

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
        public java.util.List<JourneyList> getJourneyList() {
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
        public java.util.List<SegmentBaggageCheckInInfoList> getSegmentBaggageCheckInInfoList() {
            return this.segmentBaggageCheckInInfoList;
        }

        /**
         * @return segmentBaggageMappingList
         */
        public java.util.List<SegmentBaggageMappingList> getSegmentBaggageMappingList() {
            return this.segmentBaggageMappingList;
        }

        /**
         * @return segmentRefundChangeRuleMappingList
         */
        public java.util.List<SegmentRefundChangeRuleMappingList> getSegmentRefundChangeRuleMappingList() {
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
            private java.util.List<JourneyList> journeyList; 
            private String productTypeDescription; 
            private String refundTicketCouponDescription; 
            private java.util.List<SegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList; 
            private java.util.List<SegmentBaggageMappingList> segmentBaggageMappingList; 
            private java.util.List<SegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList; 
            private String solutionId; 

            /**
             * <p>adult fare</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder adultPrice(Double adultPrice) {
                this.adultPrice = adultPrice;
                return this;
            }

            /**
             * <p>adult tax</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder adultTax(Double adultTax) {
                this.adultTax = adultTax;
                return this;
            }

            /**
             * <p>child fare</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder childPrice(Double childPrice) {
                this.childPrice = childPrice;
                return this;
            }

            /**
             * <p>child tax</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder childTax(Double childTax) {
                this.childTax = childTax;
                return this;
            }

            /**
             * <p>infant fare</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder infantPrice(Double infantPrice) {
                this.infantPrice = infantPrice;
                return this;
            }

            /**
             * <p>infant tax</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder infantTax(Double infantTax) {
                this.infantTax = infantTax;
                return this;
            }

            /**
             * <p>journey list</p>
             */
            public Builder journeyList(java.util.List<JourneyList> journeyList) {
                this.journeyList = journeyList;
                return this;
            }

            /**
             * <p>product type description</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder productTypeDescription(String productTypeDescription) {
                this.productTypeDescription = productTypeDescription;
                return this;
            }

            /**
             * <p>refund airline coupon description</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder refundTicketCouponDescription(String refundTicketCouponDescription) {
                this.refundTicketCouponDescription = refundTicketCouponDescription;
                return this;
            }

            /**
             * <p>through check-in baggage  policy</p>
             */
            public Builder segmentBaggageCheckInInfoList(java.util.List<SegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList) {
                this.segmentBaggageCheckInInfoList = segmentBaggageCheckInInfoList;
                return this;
            }

            /**
             * <p>baggage rule</p>
             */
            public Builder segmentBaggageMappingList(java.util.List<SegmentBaggageMappingList> segmentBaggageMappingList) {
                this.segmentBaggageMappingList = segmentBaggageMappingList;
                return this;
            }

            /**
             * <p>change and refund policy</p>
             */
            public Builder segmentRefundChangeRuleMappingList(java.util.List<SegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList) {
                this.segmentRefundChangeRuleMappingList = segmentRefundChangeRuleMappingList;
                return this;
            }

            /**
             * <p>solution ID</p>
             * 
             * <strong>example:</strong>
             * <p>eJwz8DeySEo0NjQ01TU3TU7TNTFINNO1SE5O0jVKM0hKNjEwTElLNYwz0A32cNT1dfPVNTIwMjYwNjRQ8/A3NLI01Q0Ic0cRBwBVFxJJ</p>
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
    /**
     * 
     * {@link EnrichResponseBody} extends {@link TeaModel}
     *
     * <p>EnrichResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("solution_list")
        private java.util.List<SolutionList> solutionList;

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
        public java.util.List<SolutionList> getSolutionList() {
            return this.solutionList;
        }

        public static final class Builder {
            private java.util.List<SolutionList> solutionList; 

            /**
             * <p>solution list</p>
             */
            public Builder solutionList(java.util.List<SolutionList> solutionList) {
                this.solutionList = solutionList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
