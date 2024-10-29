// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RefundDetailResponseBody} extends {@link TeaModel}
 *
 * <p>RefundDetailResponseBody</p>
 */
public class RefundDetailResponseBody extends TeaModel {
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

        public RefundDetailResponseBody build() {
            return new RefundDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>RefundDetailResponseBody</p>
     */
    public static class Passenger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("document")
        private String document;

        @com.aliyun.core.annotation.NameInMap("first_name")
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("last_name")
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
             * <p>credential number</p>
             * 
             * <strong>example:</strong>
             * <p>411***********4411</p>
             */
            public Builder document(String document) {
                this.document = document;
                return this;
            }

            /**
             * <p>first name</p>
             * 
             * <strong>example:</strong>
             * <p>SAN</p>
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * <p>last name</p>
             * 
             * <strong>example:</strong>
             * <p>ZHANG</p>
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
    /**
     * 
     * {@link RefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>RefundDetailResponseBody</p>
     */
    public static class PassengerMultiRefundDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("change_order_refund_fee")
        private Double changeOrderRefundFee;

        @com.aliyun.core.annotation.NameInMap("original_order_refund_fee")
        private Double originalOrderRefundFee;

        @com.aliyun.core.annotation.NameInMap("passenger")
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
             * <p>amount of the supplementary refund for the change order</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder changeOrderRefundFee(Double changeOrderRefundFee) {
                this.changeOrderRefundFee = changeOrderRefundFee;
                return this;
            }

            /**
             * <p>amount of the supplementary refund for the original order</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder originalOrderRefundFee(Double originalOrderRefundFee) {
                this.originalOrderRefundFee = originalOrderRefundFee;
                return this;
            }

            /**
             * <p>passenger for the refund</p>
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
    /**
     * 
     * {@link RefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>RefundDetailResponseBody</p>
     */
    public static class MultiRefundDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("multi_refund_order_num")
        private Long multiRefundOrderNum;

        @com.aliyun.core.annotation.NameInMap("multi_refund_transaction_no")
        private String multiRefundTransactionNo;

        @com.aliyun.core.annotation.NameInMap("passenger_multi_refund_details")
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
             * <p>supplementary refund order number</p>
             * 
             * <strong>example:</strong>
             * <p>498843***6950</p>
             */
            public Builder multiRefundOrderNum(Long multiRefundOrderNum) {
                this.multiRefundOrderNum = multiRefundOrderNum;
                return this;
            }

            /**
             * <p>transaction number of the supplementary refund order</p>
             * 
             * <strong>example:</strong>
             * <p>498843***6950</p>
             */
            public Builder multiRefundTransactionNo(String multiRefundTransactionNo) {
                this.multiRefundTransactionNo = multiRefundTransactionNo;
                return this;
            }

            /**
             * <p>supplementary refund details in passenger dimension</p>
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
    /**
     * 
     * {@link RefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>RefundDetailResponseBody</p>
     */
    public static class PassengerRefundDetailsPassenger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("document")
        private String document;

        @com.aliyun.core.annotation.NameInMap("first_name")
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("last_name")
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
             * <p>credential number</p>
             * 
             * <strong>example:</strong>
             * <p>411***********4411</p>
             */
            public Builder document(String document) {
                this.document = document;
                return this;
            }

            /**
             * <p>first name</p>
             * 
             * <strong>example:</strong>
             * <p>SAN</p>
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * <p>first name</p>
             * 
             * <strong>example:</strong>
             * <p>ZHANG</p>
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
    /**
     * 
     * {@link RefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>RefundDetailResponseBody</p>
     */
    public static class RefundFee extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("already_used_total_fee")
        private Double alreadyUsedTotalFee;

        @com.aliyun.core.annotation.NameInMap("modify_refund_to_buyer_money")
        private Double modifyRefundToBuyerMoney;

        @com.aliyun.core.annotation.NameInMap("non_refundable_change_service_fee")
        private Double nonRefundableChangeServiceFee;

        @com.aliyun.core.annotation.NameInMap("non_refundable_change_upgrade_fee")
        private Double nonRefundableChangeUpgradeFee;

        @com.aliyun.core.annotation.NameInMap("non_refundable_tax_fee")
        private Double nonRefundableTaxFee;

        @com.aliyun.core.annotation.NameInMap("non_refundable_ticket_fee")
        private Double nonRefundableTicketFee;

        @com.aliyun.core.annotation.NameInMap("refund_to_buyer_money")
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
             * <p>total price of the used flight tickets</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder alreadyUsedTotalFee(Double alreadyUsedTotalFee) {
                this.alreadyUsedTotalFee = alreadyUsedTotalFee;
                return this;
            }

            /**
             * <p>amount refunded to the user after change (only available when has change order)</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder modifyRefundToBuyerMoney(Double modifyRefundToBuyerMoney) {
                this.modifyRefundToBuyerMoney = modifyRefundToBuyerMoney;
                return this;
            }

            /**
             * <p>non-refundable change service fee</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder nonRefundableChangeServiceFee(Double nonRefundableChangeServiceFee) {
                this.nonRefundableChangeServiceFee = nonRefundableChangeServiceFee;
                return this;
            }

            /**
             * <p>non-refundable upgrade fee</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder nonRefundableChangeUpgradeFee(Double nonRefundableChangeUpgradeFee) {
                this.nonRefundableChangeUpgradeFee = nonRefundableChangeUpgradeFee;
                return this;
            }

            /**
             * <p>non-refundable tax amount, i.e., tax refund fee</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder nonRefundableTaxFee(Double nonRefundableTaxFee) {
                this.nonRefundableTaxFee = nonRefundableTaxFee;
                return this;
            }

            /**
             * <p>non-refundable ticket amount, i.e., ticket refund fee</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder nonRefundableTicketFee(Double nonRefundableTicketFee) {
                this.nonRefundableTicketFee = nonRefundableTicketFee;
                return this;
            }

            /**
             * <p>amount refundable to the user from the original ticket (fare + tax - non_refundable_ticket_fee - non_refundable_tax_fee - already_used_total_fee - discount)</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
    /**
     * 
     * {@link RefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>RefundDetailResponseBody</p>
     */
    public static class PassengerRefundDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger")
        private PassengerRefundDetailsPassenger passenger;

        @com.aliyun.core.annotation.NameInMap("refund_fee")
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
             * <p>information of the passenger applying for a refund</p>
             */
            public Builder passenger(PassengerRefundDetailsPassenger passenger) {
                this.passenger = passenger;
                return this;
            }

            /**
             * <p>details of the refund fee</p>
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
    /**
     * 
     * {@link RefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>RefundDetailResponseBody</p>
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
             * <p>field deprecated</p>
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
             * <p>marketing flight no. (eg: KA5809)</p>
             * 
             * <strong>example:</strong>
             * <p>HO1295</p>
             */
            public Builder marketingFlightNo(String marketingFlightNo) {
                this.marketingFlightNo = marketingFlightNo;
                return this;
            }

            /**
             * <p>marketing flight no. (eg: 5809)</p>
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
             * <p>operating flight no. (eg: CX601)</p>
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
             * <p>stopover city list when stop_quantity &gt; 0 , use “,” for seperation use</p>
             * 
             * <strong>example:</strong>
             * <p>SEL,HKG</p>
             */
            public Builder stopCityList(String stopCityList) {
                this.stopCityList = stopCityList;
                return this;
            }

            /**
             * <p>number of stopover</p>
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
     * {@link RefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>RefundDetailResponseBody</p>
     */
    public static class RefundJourneys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_list")
        private java.util.List < SegmentList> segmentList;

        @com.aliyun.core.annotation.NameInMap("transfer_count")
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
             * <p>segment list</p>
             */
            public Builder segmentList(java.util.List < SegmentList> segmentList) {
                this.segmentList = segmentList;
                return this;
            }

            /**
             * <p>number of transfer</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link RefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>RefundDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contain_multi_refund")
        private Boolean containMultiRefund;

        @com.aliyun.core.annotation.NameInMap("multi_refund_details")
        private java.util.List < MultiRefundDetails> multiRefundDetails;

        @com.aliyun.core.annotation.NameInMap("order_num")
        private Long orderNum;

        @com.aliyun.core.annotation.NameInMap("passenger_refund_details")
        private java.util.List < PassengerRefundDetails> passengerRefundDetails;

        @com.aliyun.core.annotation.NameInMap("pay_success_utc_time")
        private Long paySuccessUtcTime;

        @com.aliyun.core.annotation.NameInMap("refund_attachment_urls")
        private java.util.List < String > refundAttachmentUrls;

        @com.aliyun.core.annotation.NameInMap("refund_journeys")
        private java.util.List < RefundJourneys> refundJourneys;

        @com.aliyun.core.annotation.NameInMap("refund_order_num")
        private Long refundOrderNum;

        @com.aliyun.core.annotation.NameInMap("refund_reason")
        private String refundReason;

        @com.aliyun.core.annotation.NameInMap("refund_type")
        private Integer refundType;

        @com.aliyun.core.annotation.NameInMap("refuse_reason")
        private String refuseReason;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("transaction_no")
        private String transactionNo;

        @com.aliyun.core.annotation.NameInMap("utc_create_time")
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
             * <p>whether it is a supplementary refund order (if the refund amount is not enough, you can use RefundApply to create a supplementary refund order)</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder containMultiRefund(Boolean containMultiRefund) {
                this.containMultiRefund = containMultiRefund;
                return this;
            }

            /**
             * <p>supplementary refund orders</p>
             */
            public Builder multiRefundDetails(java.util.List < MultiRefundDetails> multiRefundDetails) {
                this.multiRefundDetails = multiRefundDetails;
                return this;
            }

            /**
             * <p>order number that returned by Book</p>
             * 
             * <strong>example:</strong>
             * <p>4966***617111</p>
             */
            public Builder orderNum(Long orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * <p>refund details by passenger dimension</p>
             */
            public Builder passengerRefundDetails(java.util.List < PassengerRefundDetails> passengerRefundDetails) {
                this.passengerRefundDetails = passengerRefundDetails;
                return this;
            }

            /**
             * <p>refund completed time(timestamp)</p>
             * 
             * <strong>example:</strong>
             * <p>1677229005000</p>
             */
            public Builder paySuccessUtcTime(Long paySuccessUtcTime) {
                this.paySuccessUtcTime = paySuccessUtcTime;
                return this;
            }

            /**
             * <p>URLs for refund attachments</p>
             * 
             * <strong>example:</strong>
             * <p>[zzz,yyy]</p>
             */
            public Builder refundAttachmentUrls(java.util.List < String > refundAttachmentUrls) {
                this.refundAttachmentUrls = refundAttachmentUrls;
                return this;
            }

            /**
             * <p>refunded journey</p>
             */
            public Builder refundJourneys(java.util.List < RefundJourneys> refundJourneys) {
                this.refundJourneys = refundJourneys;
                return this;
            }

            /**
             * <p>refund order number that returned by RefundApply</p>
             * 
             * <strong>example:</strong>
             * <p>4966***617654</p>
             */
            public Builder refundOrderNum(Long refundOrderNum) {
                this.refundOrderNum = refundOrderNum;
                return this;
            }

            /**
             * <p>reason for refund</p>
             * 
             * <strong>example:</strong>
             * <p>desc reason</p>
             */
            public Builder refundReason(String refundReason) {
                this.refundReason = refundReason;
                return this;
            }

            /**
             * <p>refund type </p>
             * <p>2: voluntary application</p>
             * <p>5: flight delay or cancellation, flight schedule change, etc., due to airline reasons</p>
             * <p>6: health reasons with a certificate from a secondary class A hospital or above</p>
             * <p>7: non-voluntary confirmed guidance</p>
             * <p>100: non-voluntary non-confirmed guidance</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder refundType(Integer refundType) {
                this.refundType = refundType;
                return this;
            }

            /**
             * <p>reason for refund rejection</p>
             * 
             * <strong>example:</strong>
             * <p>refuse reason</p>
             */
            public Builder refuseReason(String refuseReason) {
                this.refuseReason = refuseReason;
                return this;
            }

            /**
             * <p>refund order status</p>
             * <p>0: refund application</p>
             * <p>1: refund in progress</p>
             * <p>2: refund failed</p>
             * <p>3: refund succeeded</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>transaction number</p>
             * 
             * <strong>example:</strong>
             * <p>1677229005000</p>
             */
            public Builder transactionNo(String transactionNo) {
                this.transactionNo = transactionNo;
                return this;
            }

            /**
             * <p>refund order created time(timestamp)</p>
             * 
             * <strong>example:</strong>
             * <p>1677229002000</p>
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
