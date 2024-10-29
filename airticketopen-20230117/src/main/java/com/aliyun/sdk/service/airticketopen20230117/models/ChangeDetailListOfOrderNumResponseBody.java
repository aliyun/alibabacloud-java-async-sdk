// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ChangeDetailListOfOrderNumResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeDetailListOfOrderNumResponseBody</p>
 */
public class ChangeDetailListOfOrderNumResponseBody extends TeaModel {
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

    private ChangeDetailListOfOrderNumResponseBody(Builder builder) {
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

    public static ChangeDetailListOfOrderNumResponseBody create() {
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

        public ChangeDetailListOfOrderNumResponseBody build() {
            return new ChangeDetailListOfOrderNumResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ChangeDetailListOfOrderNumResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailListOfOrderNumResponseBody</p>
     */
    public static class ChangeFee extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("service_fee")
        private Double serviceFee;

        @com.aliyun.core.annotation.NameInMap("tax_fee")
        private Double taxFee;

        @com.aliyun.core.annotation.NameInMap("upgrade_fee")
        private Double upgradeFee;

        private ChangeFee(Builder builder) {
            this.serviceFee = builder.serviceFee;
            this.taxFee = builder.taxFee;
            this.upgradeFee = builder.upgradeFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeFee create() {
            return builder().build();
        }

        /**
         * @return serviceFee
         */
        public Double getServiceFee() {
            return this.serviceFee;
        }

        /**
         * @return taxFee
         */
        public Double getTaxFee() {
            return this.taxFee;
        }

        /**
         * @return upgradeFee
         */
        public Double getUpgradeFee() {
            return this.upgradeFee;
        }

        public static final class Builder {
            private Double serviceFee; 
            private Double taxFee; 
            private Double upgradeFee; 

            /**
             * service_fee.
             */
            public Builder serviceFee(Double serviceFee) {
                this.serviceFee = serviceFee;
                return this;
            }

            /**
             * tax_fee.
             */
            public Builder taxFee(Double taxFee) {
                this.taxFee = taxFee;
                return this;
            }

            /**
             * upgrade_fee.
             */
            public Builder upgradeFee(Double upgradeFee) {
                this.upgradeFee = upgradeFee;
                return this;
            }

            public ChangeFee build() {
                return new ChangeFee(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeDetailListOfOrderNumResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailListOfOrderNumResponseBody</p>
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
    /**
     * 
     * {@link ChangeDetailListOfOrderNumResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailListOfOrderNumResponseBody</p>
     */
    public static class ChangeFeeDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("change_fee")
        private ChangeFee changeFee;

        @com.aliyun.core.annotation.NameInMap("passenger")
        private Passenger passenger;

        private ChangeFeeDetails(Builder builder) {
            this.changeFee = builder.changeFee;
            this.passenger = builder.passenger;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeFeeDetails create() {
            return builder().build();
        }

        /**
         * @return changeFee
         */
        public ChangeFee getChangeFee() {
            return this.changeFee;
        }

        /**
         * @return passenger
         */
        public Passenger getPassenger() {
            return this.passenger;
        }

        public static final class Builder {
            private ChangeFee changeFee; 
            private Passenger passenger; 

            /**
             * change_fee.
             */
            public Builder changeFee(ChangeFee changeFee) {
                this.changeFee = changeFee;
                return this;
            }

            /**
             * passenger.
             */
            public Builder passenger(Passenger passenger) {
                this.passenger = passenger;
                return this;
            }

            public ChangeFeeDetails build() {
                return new ChangeFeeDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeDetailListOfOrderNumResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailListOfOrderNumResponseBody</p>
     */
    public static class ChangePassengers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("document")
        private String document;

        @com.aliyun.core.annotation.NameInMap("first_name")
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("last_name")
        private String lastName;

        private ChangePassengers(Builder builder) {
            this.document = builder.document;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangePassengers create() {
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

            public ChangePassengers build() {
                return new ChangePassengers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeDetailListOfOrderNumResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailListOfOrderNumResponseBody</p>
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
    /**
     * 
     * {@link ChangeDetailListOfOrderNumResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailListOfOrderNumResponseBody</p>
     */
    public static class ChangedJourneys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_list")
        private java.util.List < SegmentList> segmentList;

        @com.aliyun.core.annotation.NameInMap("transfer_count")
        private Integer transferCount;

        private ChangedJourneys(Builder builder) {
            this.segmentList = builder.segmentList;
            this.transferCount = builder.transferCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangedJourneys create() {
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

            public ChangedJourneys build() {
                return new ChangedJourneys(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeDetailListOfOrderNumResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailListOfOrderNumResponseBody</p>
     */
    public static class Contact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("mobile_country_code")
        private String mobileCountryCode;

        @com.aliyun.core.annotation.NameInMap("mobile_phone_num")
        private String mobilePhoneNum;

        private Contact(Builder builder) {
            this.email = builder.email;
            this.mobileCountryCode = builder.mobileCountryCode;
            this.mobilePhoneNum = builder.mobilePhoneNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contact create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return mobileCountryCode
         */
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        /**
         * @return mobilePhoneNum
         */
        public String getMobilePhoneNum() {
            return this.mobilePhoneNum;
        }

        public static final class Builder {
            private String email; 
            private String mobileCountryCode; 
            private String mobilePhoneNum; 

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * mobile_country_code.
             */
            public Builder mobileCountryCode(String mobileCountryCode) {
                this.mobileCountryCode = mobileCountryCode;
                return this;
            }

            /**
             * mobile_phone_num.
             */
            public Builder mobilePhoneNum(String mobilePhoneNum) {
                this.mobilePhoneNum = mobilePhoneNum;
                return this;
            }

            public Contact build() {
                return new Contact(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeDetailListOfOrderNumResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailListOfOrderNumResponseBody</p>
     */
    public static class LastJourneysSegmentList extends TeaModel {
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

        private LastJourneysSegmentList(Builder builder) {
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

        public static LastJourneysSegmentList create() {
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

            public LastJourneysSegmentList build() {
                return new LastJourneysSegmentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeDetailListOfOrderNumResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailListOfOrderNumResponseBody</p>
     */
    public static class LastJourneys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_list")
        private java.util.List < LastJourneysSegmentList> segmentList;

        @com.aliyun.core.annotation.NameInMap("transfer_count")
        private Integer transferCount;

        private LastJourneys(Builder builder) {
            this.segmentList = builder.segmentList;
            this.transferCount = builder.transferCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastJourneys create() {
            return builder().build();
        }

        /**
         * @return segmentList
         */
        public java.util.List < LastJourneysSegmentList> getSegmentList() {
            return this.segmentList;
        }

        /**
         * @return transferCount
         */
        public Integer getTransferCount() {
            return this.transferCount;
        }

        public static final class Builder {
            private java.util.List < LastJourneysSegmentList> segmentList; 
            private Integer transferCount; 

            /**
             * segment_list.
             */
            public Builder segmentList(java.util.List < LastJourneysSegmentList> segmentList) {
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

            public LastJourneys build() {
                return new LastJourneys(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeDetailListOfOrderNumResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailListOfOrderNumResponseBody</p>
     */
    public static class OriginalJourneysSegmentList extends TeaModel {
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

        private OriginalJourneysSegmentList(Builder builder) {
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

        public static OriginalJourneysSegmentList create() {
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

            public OriginalJourneysSegmentList build() {
                return new OriginalJourneysSegmentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeDetailListOfOrderNumResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailListOfOrderNumResponseBody</p>
     */
    public static class OriginalJourneys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_list")
        private java.util.List < OriginalJourneysSegmentList> segmentList;

        @com.aliyun.core.annotation.NameInMap("transfer_count")
        private Integer transferCount;

        private OriginalJourneys(Builder builder) {
            this.segmentList = builder.segmentList;
            this.transferCount = builder.transferCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginalJourneys create() {
            return builder().build();
        }

        /**
         * @return segmentList
         */
        public java.util.List < OriginalJourneysSegmentList> getSegmentList() {
            return this.segmentList;
        }

        /**
         * @return transferCount
         */
        public Integer getTransferCount() {
            return this.transferCount;
        }

        public static final class Builder {
            private java.util.List < OriginalJourneysSegmentList> segmentList; 
            private Integer transferCount; 

            /**
             * segment_list.
             */
            public Builder segmentList(java.util.List < OriginalJourneysSegmentList> segmentList) {
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

            public OriginalJourneys build() {
                return new OriginalJourneys(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeDetailListOfOrderNumResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailListOfOrderNumResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("change_fee_details")
        private java.util.List < ChangeFeeDetails> changeFeeDetails;

        @com.aliyun.core.annotation.NameInMap("change_order_num")
        private Long changeOrderNum;

        @com.aliyun.core.annotation.NameInMap("change_passengers")
        private java.util.List < ChangePassengers> changePassengers;

        @com.aliyun.core.annotation.NameInMap("change_reason_type")
        private Integer changeReasonType;

        @com.aliyun.core.annotation.NameInMap("changed_journeys")
        private java.util.List < ChangedJourneys> changedJourneys;

        @com.aliyun.core.annotation.NameInMap("close_reason")
        private String closeReason;

        @com.aliyun.core.annotation.NameInMap("close_utc_time")
        private Long closeUtcTime;

        @com.aliyun.core.annotation.NameInMap("contact")
        private Contact contact;

        @com.aliyun.core.annotation.NameInMap("create_utc_time")
        private Long createUtcTime;

        @com.aliyun.core.annotation.NameInMap("last_confirm_utc_time")
        private Long lastConfirmUtcTime;

        @com.aliyun.core.annotation.NameInMap("last_journeys")
        private java.util.List < LastJourneys> lastJourneys;

        @com.aliyun.core.annotation.NameInMap("order_num")
        private Long orderNum;

        @com.aliyun.core.annotation.NameInMap("order_status")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("original_journeys")
        private java.util.List < OriginalJourneys> originalJourneys;

        @com.aliyun.core.annotation.NameInMap("pay_status")
        private Integer payStatus;

        @com.aliyun.core.annotation.NameInMap("pay_success_utc_time")
        private Long paySuccessUtcTime;

        @com.aliyun.core.annotation.NameInMap("total_amount")
        private Double totalAmount;

        @com.aliyun.core.annotation.NameInMap("transaction_no")
        private String transactionNo;

        private List(Builder builder) {
            this.changeFeeDetails = builder.changeFeeDetails;
            this.changeOrderNum = builder.changeOrderNum;
            this.changePassengers = builder.changePassengers;
            this.changeReasonType = builder.changeReasonType;
            this.changedJourneys = builder.changedJourneys;
            this.closeReason = builder.closeReason;
            this.closeUtcTime = builder.closeUtcTime;
            this.contact = builder.contact;
            this.createUtcTime = builder.createUtcTime;
            this.lastConfirmUtcTime = builder.lastConfirmUtcTime;
            this.lastJourneys = builder.lastJourneys;
            this.orderNum = builder.orderNum;
            this.orderStatus = builder.orderStatus;
            this.originalJourneys = builder.originalJourneys;
            this.payStatus = builder.payStatus;
            this.paySuccessUtcTime = builder.paySuccessUtcTime;
            this.totalAmount = builder.totalAmount;
            this.transactionNo = builder.transactionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return changeFeeDetails
         */
        public java.util.List < ChangeFeeDetails> getChangeFeeDetails() {
            return this.changeFeeDetails;
        }

        /**
         * @return changeOrderNum
         */
        public Long getChangeOrderNum() {
            return this.changeOrderNum;
        }

        /**
         * @return changePassengers
         */
        public java.util.List < ChangePassengers> getChangePassengers() {
            return this.changePassengers;
        }

        /**
         * @return changeReasonType
         */
        public Integer getChangeReasonType() {
            return this.changeReasonType;
        }

        /**
         * @return changedJourneys
         */
        public java.util.List < ChangedJourneys> getChangedJourneys() {
            return this.changedJourneys;
        }

        /**
         * @return closeReason
         */
        public String getCloseReason() {
            return this.closeReason;
        }

        /**
         * @return closeUtcTime
         */
        public Long getCloseUtcTime() {
            return this.closeUtcTime;
        }

        /**
         * @return contact
         */
        public Contact getContact() {
            return this.contact;
        }

        /**
         * @return createUtcTime
         */
        public Long getCreateUtcTime() {
            return this.createUtcTime;
        }

        /**
         * @return lastConfirmUtcTime
         */
        public Long getLastConfirmUtcTime() {
            return this.lastConfirmUtcTime;
        }

        /**
         * @return lastJourneys
         */
        public java.util.List < LastJourneys> getLastJourneys() {
            return this.lastJourneys;
        }

        /**
         * @return orderNum
         */
        public Long getOrderNum() {
            return this.orderNum;
        }

        /**
         * @return orderStatus
         */
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return originalJourneys
         */
        public java.util.List < OriginalJourneys> getOriginalJourneys() {
            return this.originalJourneys;
        }

        /**
         * @return payStatus
         */
        public Integer getPayStatus() {
            return this.payStatus;
        }

        /**
         * @return paySuccessUtcTime
         */
        public Long getPaySuccessUtcTime() {
            return this.paySuccessUtcTime;
        }

        /**
         * @return totalAmount
         */
        public Double getTotalAmount() {
            return this.totalAmount;
        }

        /**
         * @return transactionNo
         */
        public String getTransactionNo() {
            return this.transactionNo;
        }

        public static final class Builder {
            private java.util.List < ChangeFeeDetails> changeFeeDetails; 
            private Long changeOrderNum; 
            private java.util.List < ChangePassengers> changePassengers; 
            private Integer changeReasonType; 
            private java.util.List < ChangedJourneys> changedJourneys; 
            private String closeReason; 
            private Long closeUtcTime; 
            private Contact contact; 
            private Long createUtcTime; 
            private Long lastConfirmUtcTime; 
            private java.util.List < LastJourneys> lastJourneys; 
            private Long orderNum; 
            private Integer orderStatus; 
            private java.util.List < OriginalJourneys> originalJourneys; 
            private Integer payStatus; 
            private Long paySuccessUtcTime; 
            private Double totalAmount; 
            private String transactionNo; 

            /**
             * change_fee_details.
             */
            public Builder changeFeeDetails(java.util.List < ChangeFeeDetails> changeFeeDetails) {
                this.changeFeeDetails = changeFeeDetails;
                return this;
            }

            /**
             * change_order_num.
             */
            public Builder changeOrderNum(Long changeOrderNum) {
                this.changeOrderNum = changeOrderNum;
                return this;
            }

            /**
             * change_passengers.
             */
            public Builder changePassengers(java.util.List < ChangePassengers> changePassengers) {
                this.changePassengers = changePassengers;
                return this;
            }

            /**
             * change_reason_type.
             */
            public Builder changeReasonType(Integer changeReasonType) {
                this.changeReasonType = changeReasonType;
                return this;
            }

            /**
             * changed_journeys.
             */
            public Builder changedJourneys(java.util.List < ChangedJourneys> changedJourneys) {
                this.changedJourneys = changedJourneys;
                return this;
            }

            /**
             * close_reason.
             */
            public Builder closeReason(String closeReason) {
                this.closeReason = closeReason;
                return this;
            }

            /**
             * close_utc_time.
             */
            public Builder closeUtcTime(Long closeUtcTime) {
                this.closeUtcTime = closeUtcTime;
                return this;
            }

            /**
             * contact.
             */
            public Builder contact(Contact contact) {
                this.contact = contact;
                return this;
            }

            /**
             * create_utc_time.
             */
            public Builder createUtcTime(Long createUtcTime) {
                this.createUtcTime = createUtcTime;
                return this;
            }

            /**
             * last_confirm_utc_time.
             */
            public Builder lastConfirmUtcTime(Long lastConfirmUtcTime) {
                this.lastConfirmUtcTime = lastConfirmUtcTime;
                return this;
            }

            /**
             * last_journeys.
             */
            public Builder lastJourneys(java.util.List < LastJourneys> lastJourneys) {
                this.lastJourneys = lastJourneys;
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
             * order_status.
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * original_journeys.
             */
            public Builder originalJourneys(java.util.List < OriginalJourneys> originalJourneys) {
                this.originalJourneys = originalJourneys;
                return this;
            }

            /**
             * pay_status.
             */
            public Builder payStatus(Integer payStatus) {
                this.payStatus = payStatus;
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
             * total_amount.
             */
            public Builder totalAmount(Double totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * transaction_no.
             */
            public Builder transactionNo(String transactionNo) {
                this.transactionNo = transactionNo;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeDetailListOfOrderNumResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailListOfOrderNumResponseBody</p>
     */
    public static class Pagination extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("current_page")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("page_size")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total_count")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("total_page")
        private Integer totalPage;

        private Pagination(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pagination create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 
            private Integer totalPage; 

            /**
             * current_page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * page_size.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total_count.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * total_page.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeDetailListOfOrderNumResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailListOfOrderNumResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("list")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("pagination")
        private Pagination pagination;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Pagination pagination; 

            /**
             * list.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
