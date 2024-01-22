// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefundDetailResponseBody} extends {@link TeaModel}
 *
 * <p>RefundDetailResponseBody</p>
 */
public class RefundDetailResponseBody extends TeaModel {
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

    private RefundDetailResponseBody(Builder builder) {
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

    public static RefundDetailResponseBody create() {
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

        public RefundDetailResponseBody build() {
            return new RefundDetailResponseBody(this);
        } 

    } 

    public static class Passenger extends TeaModel {
        @NameInMap("document")
        private String document;

        @NameInMap("first_name")
        private String firstName;

        @NameInMap("last_name")
        private String lastName;

        private Passenger(Builder builder) {
            this.document = builder.document;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Passenger create() {
            return builder().build();
        }

        /**
         * @return document
         */
        public String getDocument() {
            return this.document;
        }

        /**
         * @return firstName
         */
        public String getFirstName() {
            return this.firstName;
        }

        /**
         * @return lastName
         */
        public String getLastName() {
            return this.lastName;
        }

        public static final class Builder {
            private String document; 
            private String firstName; 
            private String lastName; 

            /**
             * document.
             */
            public Builder document(String document) {
                this.document = document;
                return this;
            }

            /**
             * first_name.
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * last_name.
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            public Passenger build() {
                return new Passenger(this);
            } 

        } 

    }
    public static class PassengerMultiRefundDetails extends TeaModel {
        @NameInMap("change_order_refund_fee")
        private Double changeOrderRefundFee;

        @NameInMap("original_order_refund_fee")
        private Double originalOrderRefundFee;

        @NameInMap("passenger")
        private Passenger passenger;

        private PassengerMultiRefundDetails(Builder builder) {
            this.changeOrderRefundFee = builder.changeOrderRefundFee;
            this.originalOrderRefundFee = builder.originalOrderRefundFee;
            this.passenger = builder.passenger;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerMultiRefundDetails create() {
            return builder().build();
        }

        /**
         * @return changeOrderRefundFee
         */
        public Double getChangeOrderRefundFee() {
            return this.changeOrderRefundFee;
        }

        /**
         * @return originalOrderRefundFee
         */
        public Double getOriginalOrderRefundFee() {
            return this.originalOrderRefundFee;
        }

        /**
         * @return passenger
         */
        public Passenger getPassenger() {
            return this.passenger;
        }

        public static final class Builder {
            private Double changeOrderRefundFee; 
            private Double originalOrderRefundFee; 
            private Passenger passenger; 

            /**
             * change_order_refund_fee.
             */
            public Builder changeOrderRefundFee(Double changeOrderRefundFee) {
                this.changeOrderRefundFee = changeOrderRefundFee;
                return this;
            }

            /**
             * original_order_refund_fee.
             */
            public Builder originalOrderRefundFee(Double originalOrderRefundFee) {
                this.originalOrderRefundFee = originalOrderRefundFee;
                return this;
            }

            /**
             * passenger.
             */
            public Builder passenger(Passenger passenger) {
                this.passenger = passenger;
                return this;
            }

            public PassengerMultiRefundDetails build() {
                return new PassengerMultiRefundDetails(this);
            } 

        } 

    }
    public static class MultiRefundDetails extends TeaModel {
        @NameInMap("multi_refund_order_num")
        private Long multiRefundOrderNum;

        @NameInMap("multi_refund_transaction_no")
        private String multiRefundTransactionNo;

        @NameInMap("passenger_multi_refund_details")
        private java.util.List < PassengerMultiRefundDetails> passengerMultiRefundDetails;

        private MultiRefundDetails(Builder builder) {
            this.multiRefundOrderNum = builder.multiRefundOrderNum;
            this.multiRefundTransactionNo = builder.multiRefundTransactionNo;
            this.passengerMultiRefundDetails = builder.passengerMultiRefundDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiRefundDetails create() {
            return builder().build();
        }

        /**
         * @return multiRefundOrderNum
         */
        public Long getMultiRefundOrderNum() {
            return this.multiRefundOrderNum;
        }

        /**
         * @return multiRefundTransactionNo
         */
        public String getMultiRefundTransactionNo() {
            return this.multiRefundTransactionNo;
        }

        /**
         * @return passengerMultiRefundDetails
         */
        public java.util.List < PassengerMultiRefundDetails> getPassengerMultiRefundDetails() {
            return this.passengerMultiRefundDetails;
        }

        public static final class Builder {
            private Long multiRefundOrderNum; 
            private String multiRefundTransactionNo; 
            private java.util.List < PassengerMultiRefundDetails> passengerMultiRefundDetails; 

            /**
             * multi_refund_order_num.
             */
            public Builder multiRefundOrderNum(Long multiRefundOrderNum) {
                this.multiRefundOrderNum = multiRefundOrderNum;
                return this;
            }

            /**
             * multi_refund_transaction_no.
             */
            public Builder multiRefundTransactionNo(String multiRefundTransactionNo) {
                this.multiRefundTransactionNo = multiRefundTransactionNo;
                return this;
            }

            /**
             * passenger_multi_refund_details.
             */
            public Builder passengerMultiRefundDetails(java.util.List < PassengerMultiRefundDetails> passengerMultiRefundDetails) {
                this.passengerMultiRefundDetails = passengerMultiRefundDetails;
                return this;
            }

            public MultiRefundDetails build() {
                return new MultiRefundDetails(this);
            } 

        } 

    }
    public static class PassengerRefundDetailsPassenger extends TeaModel {
        @NameInMap("document")
        private String document;

        @NameInMap("first_name")
        private String firstName;

        @NameInMap("last_name")
        private String lastName;

        private PassengerRefundDetailsPassenger(Builder builder) {
            this.document = builder.document;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerRefundDetailsPassenger create() {
            return builder().build();
        }

        /**
         * @return document
         */
        public String getDocument() {
            return this.document;
        }

        /**
         * @return firstName
         */
        public String getFirstName() {
            return this.firstName;
        }

        /**
         * @return lastName
         */
        public String getLastName() {
            return this.lastName;
        }

        public static final class Builder {
            private String document; 
            private String firstName; 
            private String lastName; 

            /**
             * document.
             */
            public Builder document(String document) {
                this.document = document;
                return this;
            }

            /**
             * first_name.
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * last_name.
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            public PassengerRefundDetailsPassenger build() {
                return new PassengerRefundDetailsPassenger(this);
            } 

        } 

    }
    public static class RefundFee extends TeaModel {
        @NameInMap("already_used_total_fee")
        private Double alreadyUsedTotalFee;

        @NameInMap("modify_refund_to_buyer_money")
        private Double modifyRefundToBuyerMoney;

        @NameInMap("non_refundable_change_service_fee")
        private Double nonRefundableChangeServiceFee;

        @NameInMap("non_refundable_change_upgrade_fee")
        private Double nonRefundableChangeUpgradeFee;

        @NameInMap("non_refundable_tax_fee")
        private Double nonRefundableTaxFee;

        @NameInMap("non_refundable_ticket_fee")
        private Double nonRefundableTicketFee;

        @NameInMap("refund_to_buyer_money")
        private Double refundToBuyerMoney;

        private RefundFee(Builder builder) {
            this.alreadyUsedTotalFee = builder.alreadyUsedTotalFee;
            this.modifyRefundToBuyerMoney = builder.modifyRefundToBuyerMoney;
            this.nonRefundableChangeServiceFee = builder.nonRefundableChangeServiceFee;
            this.nonRefundableChangeUpgradeFee = builder.nonRefundableChangeUpgradeFee;
            this.nonRefundableTaxFee = builder.nonRefundableTaxFee;
            this.nonRefundableTicketFee = builder.nonRefundableTicketFee;
            this.refundToBuyerMoney = builder.refundToBuyerMoney;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundFee create() {
            return builder().build();
        }

        /**
         * @return alreadyUsedTotalFee
         */
        public Double getAlreadyUsedTotalFee() {
            return this.alreadyUsedTotalFee;
        }

        /**
         * @return modifyRefundToBuyerMoney
         */
        public Double getModifyRefundToBuyerMoney() {
            return this.modifyRefundToBuyerMoney;
        }

        /**
         * @return nonRefundableChangeServiceFee
         */
        public Double getNonRefundableChangeServiceFee() {
            return this.nonRefundableChangeServiceFee;
        }

        /**
         * @return nonRefundableChangeUpgradeFee
         */
        public Double getNonRefundableChangeUpgradeFee() {
            return this.nonRefundableChangeUpgradeFee;
        }

        /**
         * @return nonRefundableTaxFee
         */
        public Double getNonRefundableTaxFee() {
            return this.nonRefundableTaxFee;
        }

        /**
         * @return nonRefundableTicketFee
         */
        public Double getNonRefundableTicketFee() {
            return this.nonRefundableTicketFee;
        }

        /**
         * @return refundToBuyerMoney
         */
        public Double getRefundToBuyerMoney() {
            return this.refundToBuyerMoney;
        }

        public static final class Builder {
            private Double alreadyUsedTotalFee; 
            private Double modifyRefundToBuyerMoney; 
            private Double nonRefundableChangeServiceFee; 
            private Double nonRefundableChangeUpgradeFee; 
            private Double nonRefundableTaxFee; 
            private Double nonRefundableTicketFee; 
            private Double refundToBuyerMoney; 

            /**
             * already_used_total_fee.
             */
            public Builder alreadyUsedTotalFee(Double alreadyUsedTotalFee) {
                this.alreadyUsedTotalFee = alreadyUsedTotalFee;
                return this;
            }

            /**
             * modify_refund_to_buyer_money.
             */
            public Builder modifyRefundToBuyerMoney(Double modifyRefundToBuyerMoney) {
                this.modifyRefundToBuyerMoney = modifyRefundToBuyerMoney;
                return this;
            }

            /**
             * non_refundable_change_service_fee.
             */
            public Builder nonRefundableChangeServiceFee(Double nonRefundableChangeServiceFee) {
                this.nonRefundableChangeServiceFee = nonRefundableChangeServiceFee;
                return this;
            }

            /**
             * non_refundable_change_upgrade_fee.
             */
            public Builder nonRefundableChangeUpgradeFee(Double nonRefundableChangeUpgradeFee) {
                this.nonRefundableChangeUpgradeFee = nonRefundableChangeUpgradeFee;
                return this;
            }

            /**
             * non_refundable_tax_fee.
             */
            public Builder nonRefundableTaxFee(Double nonRefundableTaxFee) {
                this.nonRefundableTaxFee = nonRefundableTaxFee;
                return this;
            }

            /**
             * non_refundable_ticket_fee.
             */
            public Builder nonRefundableTicketFee(Double nonRefundableTicketFee) {
                this.nonRefundableTicketFee = nonRefundableTicketFee;
                return this;
            }

            /**
             * refund_to_buyer_money.
             */
            public Builder refundToBuyerMoney(Double refundToBuyerMoney) {
                this.refundToBuyerMoney = refundToBuyerMoney;
                return this;
            }

            public RefundFee build() {
                return new RefundFee(this);
            } 

        } 

    }
    public static class PassengerRefundDetails extends TeaModel {
        @NameInMap("passenger")
        private PassengerRefundDetailsPassenger passenger;

        @NameInMap("refund_fee")
        private RefundFee refundFee;

        private PassengerRefundDetails(Builder builder) {
            this.passenger = builder.passenger;
            this.refundFee = builder.refundFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerRefundDetails create() {
            return builder().build();
        }

        /**
         * @return passenger
         */
        public PassengerRefundDetailsPassenger getPassenger() {
            return this.passenger;
        }

        /**
         * @return refundFee
         */
        public RefundFee getRefundFee() {
            return this.refundFee;
        }

        public static final class Builder {
            private PassengerRefundDetailsPassenger passenger; 
            private RefundFee refundFee; 

            /**
             * passenger.
             */
            public Builder passenger(PassengerRefundDetailsPassenger passenger) {
                this.passenger = passenger;
                return this;
            }

            /**
             * refund_fee.
             */
            public Builder refundFee(RefundFee refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            public PassengerRefundDetails build() {
                return new PassengerRefundDetails(this);
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
    public static class RefundJourneys extends TeaModel {
        @NameInMap("segment_list")
        private java.util.List < SegmentList> segmentList;

        @NameInMap("transfer_count")
        private Integer transferCount;

        private RefundJourneys(Builder builder) {
            this.segmentList = builder.segmentList;
            this.transferCount = builder.transferCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundJourneys create() {
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

            public RefundJourneys build() {
                return new RefundJourneys(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("contain_multi_refund")
        private Boolean containMultiRefund;

        @NameInMap("multi_refund_details")
        private java.util.List < MultiRefundDetails> multiRefundDetails;

        @NameInMap("order_num")
        private Long orderNum;

        @NameInMap("passenger_refund_details")
        private java.util.List < PassengerRefundDetails> passengerRefundDetails;

        @NameInMap("pay_success_utc_time")
        private Long paySuccessUtcTime;

        @NameInMap("refund_attachment_urls")
        private java.util.List < String > refundAttachmentUrls;

        @NameInMap("refund_journeys")
        private java.util.List < RefundJourneys> refundJourneys;

        @NameInMap("refund_order_num")
        private Long refundOrderNum;

        @NameInMap("refund_reason")
        private String refundReason;

        @NameInMap("refund_type")
        private Integer refundType;

        @NameInMap("refuse_reason")
        private String refuseReason;

        @NameInMap("status")
        private Integer status;

        @NameInMap("transaction_no")
        private String transactionNo;

        @NameInMap("utc_create_time")
        private Long utcCreateTime;

        private Data(Builder builder) {
            this.containMultiRefund = builder.containMultiRefund;
            this.multiRefundDetails = builder.multiRefundDetails;
            this.orderNum = builder.orderNum;
            this.passengerRefundDetails = builder.passengerRefundDetails;
            this.paySuccessUtcTime = builder.paySuccessUtcTime;
            this.refundAttachmentUrls = builder.refundAttachmentUrls;
            this.refundJourneys = builder.refundJourneys;
            this.refundOrderNum = builder.refundOrderNum;
            this.refundReason = builder.refundReason;
            this.refundType = builder.refundType;
            this.refuseReason = builder.refuseReason;
            this.status = builder.status;
            this.transactionNo = builder.transactionNo;
            this.utcCreateTime = builder.utcCreateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return containMultiRefund
         */
        public Boolean getContainMultiRefund() {
            return this.containMultiRefund;
        }

        /**
         * @return multiRefundDetails
         */
        public java.util.List < MultiRefundDetails> getMultiRefundDetails() {
            return this.multiRefundDetails;
        }

        /**
         * @return orderNum
         */
        public Long getOrderNum() {
            return this.orderNum;
        }

        /**
         * @return passengerRefundDetails
         */
        public java.util.List < PassengerRefundDetails> getPassengerRefundDetails() {
            return this.passengerRefundDetails;
        }

        /**
         * @return paySuccessUtcTime
         */
        public Long getPaySuccessUtcTime() {
            return this.paySuccessUtcTime;
        }

        /**
         * @return refundAttachmentUrls
         */
        public java.util.List < String > getRefundAttachmentUrls() {
            return this.refundAttachmentUrls;
        }

        /**
         * @return refundJourneys
         */
        public java.util.List < RefundJourneys> getRefundJourneys() {
            return this.refundJourneys;
        }

        /**
         * @return refundOrderNum
         */
        public Long getRefundOrderNum() {
            return this.refundOrderNum;
        }

        /**
         * @return refundReason
         */
        public String getRefundReason() {
            return this.refundReason;
        }

        /**
         * @return refundType
         */
        public Integer getRefundType() {
            return this.refundType;
        }

        /**
         * @return refuseReason
         */
        public String getRefuseReason() {
            return this.refuseReason;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return transactionNo
         */
        public String getTransactionNo() {
            return this.transactionNo;
        }

        /**
         * @return utcCreateTime
         */
        public Long getUtcCreateTime() {
            return this.utcCreateTime;
        }

        public static final class Builder {
            private Boolean containMultiRefund; 
            private java.util.List < MultiRefundDetails> multiRefundDetails; 
            private Long orderNum; 
            private java.util.List < PassengerRefundDetails> passengerRefundDetails; 
            private Long paySuccessUtcTime; 
            private java.util.List < String > refundAttachmentUrls; 
            private java.util.List < RefundJourneys> refundJourneys; 
            private Long refundOrderNum; 
            private String refundReason; 
            private Integer refundType; 
            private String refuseReason; 
            private Integer status; 
            private String transactionNo; 
            private Long utcCreateTime; 

            /**
             * contain_multi_refund.
             */
            public Builder containMultiRefund(Boolean containMultiRefund) {
                this.containMultiRefund = containMultiRefund;
                return this;
            }

            /**
             * multi_refund_details.
             */
            public Builder multiRefundDetails(java.util.List < MultiRefundDetails> multiRefundDetails) {
                this.multiRefundDetails = multiRefundDetails;
                return this;
            }

            /**
             * order_num.
             */
            public Builder orderNum(Long orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * passenger_refund_details.
             */
            public Builder passengerRefundDetails(java.util.List < PassengerRefundDetails> passengerRefundDetails) {
                this.passengerRefundDetails = passengerRefundDetails;
                return this;
            }

            /**
             * pay_success_utc_time.
             */
            public Builder paySuccessUtcTime(Long paySuccessUtcTime) {
                this.paySuccessUtcTime = paySuccessUtcTime;
                return this;
            }

            /**
             * refund_attachment_urls.
             */
            public Builder refundAttachmentUrls(java.util.List < String > refundAttachmentUrls) {
                this.refundAttachmentUrls = refundAttachmentUrls;
                return this;
            }

            /**
             * refund_journeys.
             */
            public Builder refundJourneys(java.util.List < RefundJourneys> refundJourneys) {
                this.refundJourneys = refundJourneys;
                return this;
            }

            /**
             * refund_order_num.
             */
            public Builder refundOrderNum(Long refundOrderNum) {
                this.refundOrderNum = refundOrderNum;
                return this;
            }

            /**
             * refund_reason.
             */
            public Builder refundReason(String refundReason) {
                this.refundReason = refundReason;
                return this;
            }

            /**
             * refund_type.
             */
            public Builder refundType(Integer refundType) {
                this.refundType = refundType;
                return this;
            }

            /**
             * refuse_reason.
             */
            public Builder refuseReason(String refuseReason) {
                this.refuseReason = refuseReason;
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
             * transaction_no.
             */
            public Builder transactionNo(String transactionNo) {
                this.transactionNo = transactionNo;
                return this;
            }

            /**
             * utc_create_time.
             */
            public Builder utcCreateTime(Long utcCreateTime) {
                this.utcCreateTime = utcCreateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
