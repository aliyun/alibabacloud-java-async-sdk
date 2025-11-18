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
 * {@link ChangeDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeDetailResponseBody</p>
 */
public class ChangeDetailResponseBody extends TeaModel {
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

    private ChangeDetailResponseBody(Builder builder) {
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

    public static ChangeDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ChangeDetailResponseBody model) {
            this.requestId = model.requestId;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorData = model.errorData;
            this.errorMsg = model.errorMsg;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>Request RequestId</p>
         * 
         * <strong>example:</strong>
         * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Correctly processed return data</p>
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
         * <p>Data carried in error handling</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorData(Object errorData) {
            this.errorData = errorData;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>HTTP request successful, status value is 200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Whether it is successful</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ChangeDetailResponseBody build() {
            return new ChangeDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ChangeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ChangeFee model) {
                this.serviceFee = model.serviceFee;
                this.taxFee = model.taxFee;
                this.upgradeFee = model.upgradeFee;
            } 

            /**
             * <p>fare penalty</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder serviceFee(Double serviceFee) {
                this.serviceFee = serviceFee;
                return this;
            }

            /**
             * <p>tax penalty</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder taxFee(Double taxFee) {
                this.taxFee = taxFee;
                return this;
            }

            /**
             * <p>price difference</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
     * {@link ChangeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Passenger model) {
                this.document = model.document;
                this.firstName = model.firstName;
                this.lastName = model.lastName;
            } 

            /**
             * <p>Document number</p>
             * 
             * <strong>example:</strong>
             * <p>411***********4411</p>
             */
            public Builder document(String document) {
                this.document = document;
                return this;
            }

            /**
             * <p>Passenger&quot;s first name</p>
             * 
             * <strong>example:</strong>
             * <p>SAN</p>
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * <p>Passenger&quot;s last name</p>
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
     * {@link ChangeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ChangeFeeDetails model) {
                this.changeFee = model.changeFee;
                this.passenger = model.passenger;
            } 

            /**
             * <p>Change fee details for the passenger</p>
             */
            public Builder changeFee(ChangeFee changeFee) {
                this.changeFee = changeFee;
                return this;
            }

            /**
             * <p>Information of the passenger for the change</p>
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
     * {@link ChangeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ChangePassengers model) {
                this.document = model.document;
                this.firstName = model.firstName;
                this.lastName = model.lastName;
            } 

            /**
             * <p>Document number</p>
             * 
             * <strong>example:</strong>
             * <p>411***********4411</p>
             */
            public Builder document(String document) {
                this.document = document;
                return this;
            }

            /**
             * <p>Passenger first name</p>
             * 
             * <strong>example:</strong>
             * <p>SAN</p>
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * <p>Passenger last name</p>
             * 
             * <strong>example:</strong>
             * <p>ZHANG</p>
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
     * {@link ChangeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SegmentList model) {
                this.arrivalAirport = model.arrivalAirport;
                this.arrivalCity = model.arrivalCity;
                this.arrivalTerminal = model.arrivalTerminal;
                this.arrivalTime = model.arrivalTime;
                this.availability = model.availability;
                this.cabin = model.cabin;
                this.cabinClass = model.cabinClass;
                this.codeShare = model.codeShare;
                this.departureAirport = model.departureAirport;
                this.departureCity = model.departureCity;
                this.departureTerminal = model.departureTerminal;
                this.departureTime = model.departureTime;
                this.equipType = model.equipType;
                this.flightDuration = model.flightDuration;
                this.marketingAirline = model.marketingAirline;
                this.marketingFlightNo = model.marketingFlightNo;
                this.marketingFlightNoInt = model.marketingFlightNoInt;
                this.operatingAirline = model.operatingAirline;
                this.operatingFlightNo = model.operatingFlightNo;
                this.segmentId = model.segmentId;
                this.stopCityList = model.stopCityList;
                this.stopQuantity = model.stopQuantity;
            } 

            /**
             * <p>Arrival airport three-letter code (uppercase)</p>
             * 
             * <strong>example:</strong>
             * <p>MFM</p>
             */
            public Builder arrivalAirport(String arrivalAirport) {
                this.arrivalAirport = arrivalAirport;
                return this;
            }

            /**
             * <p>Arrival city three-letter code (uppercase)</p>
             * 
             * <strong>example:</strong>
             * <p>MFM</p>
             */
            public Builder arrivalCity(String arrivalCity) {
                this.arrivalCity = arrivalCity;
                return this;
            }

            /**
             * <p>Arrival terminal of the flight</p>
             * 
             * <strong>example:</strong>
             * <p>T1</p>
             */
            public Builder arrivalTerminal(String arrivalTerminal) {
                this.arrivalTerminal = arrivalTerminal;
                return this;
            }

            /**
             * <p>Flight arrival date and time, in the format (yyyy-MM-dd HH:mm:ss)</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-10 10:40:00</p>
             */
            public Builder arrivalTime(String arrivalTime) {
                this.arrivalTime = arrivalTime;
                return this;
            }

            /**
             * <p>Number of available seats</p>
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
             * <p>service class ( compartment )</p>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * <p>Whether it is a code-share flight</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder codeShare(Boolean codeShare) {
                this.codeShare = codeShare;
                return this;
            }

            /**
             * <p>Departure airport three-letter code (uppercase)</p>
             * 
             * <strong>example:</strong>
             * <p>PVG</p>
             */
            public Builder departureAirport(String departureAirport) {
                this.departureAirport = departureAirport;
                return this;
            }

            /**
             * <p>Departure city three-letter code (uppercase)</p>
             * 
             * <strong>example:</strong>
             * <p>SHA</p>
             */
            public Builder departureCity(String departureCity) {
                this.departureCity = departureCity;
                return this;
            }

            /**
             * <p>Departure terminal of the flight</p>
             * 
             * <strong>example:</strong>
             * <p>T2</p>
             */
            public Builder departureTerminal(String departureTerminal) {
                this.departureTerminal = departureTerminal;
                return this;
            }

            /**
             * <p>Flight departure date and time, in the format (yyyy-MM-dd HH:mm:ss)</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-10 07:55:00</p>
             */
            public Builder departureTime(String departureTime) {
                this.departureTime = departureTime;
                return this;
            }

            /**
             * <p>Aircraft type</p>
             * 
             * <strong>example:</strong>
             * <p>32Q</p>
             */
            public Builder equipType(String equipType) {
                this.equipType = equipType;
                return this;
            }

            /**
             * <p>Flight duration in minutes</p>
             * 
             * <strong>example:</strong>
             * <p>165</p>
             */
            public Builder flightDuration(Integer flightDuration) {
                this.flightDuration = flightDuration;
                return this;
            }

            /**
             * <p>Market airline (e.g., HO)</p>
             * 
             * <strong>example:</strong>
             * <p>HO</p>
             */
            public Builder marketingAirline(String marketingAirline) {
                this.marketingAirline = marketingAirline;
                return this;
            }

            /**
             * <p>Marketing flight number (e.g., HO1295)</p>
             * 
             * <strong>example:</strong>
             * <p>HO1295</p>
             */
            public Builder marketingFlightNo(String marketingFlightNo) {
                this.marketingFlightNo = marketingFlightNo;
                return this;
            }

            /**
             * <p>Marketing flight number (e.g., 1295)</p>
             * 
             * <strong>example:</strong>
             * <p>1295</p>
             */
            public Builder marketingFlightNoInt(Integer marketingFlightNoInt) {
                this.marketingFlightNoInt = marketingFlightNoInt;
                return this;
            }

            /**
             * <p>Operating airline (e.g., CX)</p>
             * 
             * <strong>example:</strong>
             * <p>HO</p>
             */
            public Builder operatingAirline(String operatingAirline) {
                this.operatingAirline = operatingAirline;
                return this;
            }

            /**
             * <p>Operating flight number (e.g., CX601)</p>
             * 
             * <strong>example:</strong>
             * <p>HO1295</p>
             */
            public Builder operatingFlightNo(String operatingFlightNo) {
                this.operatingFlightNo = operatingFlightNo;
                return this;
            }

            /**
             * <p>Segment ID format: flight number + departure airport + arrival airport + departure date (MMdd)</p>
             * 
             * <strong>example:</strong>
             * <p>HO1295-PVG-MFM-20230310</p>
             */
            public Builder segmentId(String segmentId) {
                this.segmentId = segmentId;
                return this;
            }

            /**
             * <p>List of stop cities, with values when stopQuantity &gt; 0, separated by commas</p>
             * 
             * <strong>example:</strong>
             * <p>SEL,HKG</p>
             */
            public Builder stopCityList(String stopCityList) {
                this.stopCityList = stopCityList;
                return this;
            }

            /**
             * <p>Number of stop cities</p>
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
     * {@link ChangeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailResponseBody</p>
     */
    public static class ChangedJourneys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_list")
        private java.util.List<SegmentList> segmentList;

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

            private Builder() {
            } 

            private Builder(ChangedJourneys model) {
                this.segmentList = model.segmentList;
                this.transferCount = model.transferCount;
            } 

            /**
             * <p>Segment information</p>
             */
            public Builder segmentList(java.util.List<SegmentList> segmentList) {
                this.segmentList = segmentList;
                return this;
            }

            /**
             * <p>Number of transfers</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link ChangeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Contact model) {
                this.email = model.email;
                this.mobileCountryCode = model.mobileCountryCode;
                this.mobilePhoneNum = model.mobilePhoneNum;
            } 

            /**
             * <p>Email address</p>
             * 
             * <strong>example:</strong>
             * <p>gao******@gmail.com</p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>Country code</p>
             * 
             * <strong>example:</strong>
             * <p>86</p>
             */
            public Builder mobileCountryCode(String mobileCountryCode) {
                this.mobileCountryCode = mobileCountryCode;
                return this;
            }

            /**
             * <p>Contact&quot;s mobile phone number</p>
             * 
             * <strong>example:</strong>
             * <p>183*****92</p>
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
     * {@link ChangeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(LastJourneysSegmentList model) {
                this.arrivalAirport = model.arrivalAirport;
                this.arrivalCity = model.arrivalCity;
                this.arrivalTerminal = model.arrivalTerminal;
                this.arrivalTime = model.arrivalTime;
                this.availability = model.availability;
                this.cabin = model.cabin;
                this.cabinClass = model.cabinClass;
                this.codeShare = model.codeShare;
                this.departureAirport = model.departureAirport;
                this.departureCity = model.departureCity;
                this.departureTerminal = model.departureTerminal;
                this.departureTime = model.departureTime;
                this.equipType = model.equipType;
                this.flightDuration = model.flightDuration;
                this.marketingAirline = model.marketingAirline;
                this.marketingFlightNo = model.marketingFlightNo;
                this.marketingFlightNoInt = model.marketingFlightNoInt;
                this.operatingAirline = model.operatingAirline;
                this.operatingFlightNo = model.operatingFlightNo;
                this.segmentId = model.segmentId;
                this.stopCityList = model.stopCityList;
                this.stopQuantity = model.stopQuantity;
            } 

            /**
             * <p>Arrival airport three-letter code (uppercase)</p>
             * 
             * <strong>example:</strong>
             * <p>MFM</p>
             */
            public Builder arrivalAirport(String arrivalAirport) {
                this.arrivalAirport = arrivalAirport;
                return this;
            }

            /**
             * <p>Arrival city three-letter code (uppercase)</p>
             * 
             * <strong>example:</strong>
             * <p>MFM</p>
             */
            public Builder arrivalCity(String arrivalCity) {
                this.arrivalCity = arrivalCity;
                return this;
            }

            /**
             * <p>Arrival terminal of the flight</p>
             * 
             * <strong>example:</strong>
             * <p>T1</p>
             */
            public Builder arrivalTerminal(String arrivalTerminal) {
                this.arrivalTerminal = arrivalTerminal;
                return this;
            }

            /**
             * <p>Flight arrival date and time, in the format (yyyy-MM-dd HH:mm:ss)</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-10 10:40:00</p>
             */
            public Builder arrivalTime(String arrivalTime) {
                this.arrivalTime = arrivalTime;
                return this;
            }

            /**
             * <p>Number of available seats</p>
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
             * <p>service class ( compartment )</p>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * <p>Whether it is a codeshare flight</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder codeShare(Boolean codeShare) {
                this.codeShare = codeShare;
                return this;
            }

            /**
             * <p>Departure airport three-letter code (uppercase)</p>
             * 
             * <strong>example:</strong>
             * <p>PVG</p>
             */
            public Builder departureAirport(String departureAirport) {
                this.departureAirport = departureAirport;
                return this;
            }

            /**
             * <p>Departure city three-letter code (uppercase)</p>
             * 
             * <strong>example:</strong>
             * <p>SHA</p>
             */
            public Builder departureCity(String departureCity) {
                this.departureCity = departureCity;
                return this;
            }

            /**
             * <p>Departure terminal of the flight</p>
             * 
             * <strong>example:</strong>
             * <p>T2</p>
             */
            public Builder departureTerminal(String departureTerminal) {
                this.departureTerminal = departureTerminal;
                return this;
            }

            /**
             * <p>Flight departure date and time, in the format (yyyy-MM-dd HH:mm:ss)</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-10 07:55:00</p>
             */
            public Builder departureTime(String departureTime) {
                this.departureTime = departureTime;
                return this;
            }

            /**
             * <p>Aircraft type</p>
             * 
             * <strong>example:</strong>
             * <p>32Q</p>
             */
            public Builder equipType(String equipType) {
                this.equipType = equipType;
                return this;
            }

            /**
             * <p>Flight duration in minutes</p>
             * 
             * <strong>example:</strong>
             * <p>165</p>
             */
            public Builder flightDuration(Integer flightDuration) {
                this.flightDuration = flightDuration;
                return this;
            }

            /**
             * <p>Marketing airline (e.g., HO)</p>
             * 
             * <strong>example:</strong>
             * <p>HO</p>
             */
            public Builder marketingAirline(String marketingAirline) {
                this.marketingAirline = marketingAirline;
                return this;
            }

            /**
             * <p>Marketing flight number (e.g., HO1295)</p>
             * 
             * <strong>example:</strong>
             * <p>HO1295</p>
             */
            public Builder marketingFlightNo(String marketingFlightNo) {
                this.marketingFlightNo = marketingFlightNo;
                return this;
            }

            /**
             * <p>Marketing flight number (e.g., 1295)</p>
             * 
             * <strong>example:</strong>
             * <p>1295</p>
             */
            public Builder marketingFlightNoInt(Integer marketingFlightNoInt) {
                this.marketingFlightNoInt = marketingFlightNoInt;
                return this;
            }

            /**
             * <p>Operating airline (e.g., CX)</p>
             * 
             * <strong>example:</strong>
             * <p>HO</p>
             */
            public Builder operatingAirline(String operatingAirline) {
                this.operatingAirline = operatingAirline;
                return this;
            }

            /**
             * <p>Operating flight number (e.g., CX601)</p>
             * 
             * <strong>example:</strong>
             * <p>HO1295</p>
             */
            public Builder operatingFlightNo(String operatingFlightNo) {
                this.operatingFlightNo = operatingFlightNo;
                return this;
            }

            /**
             * <p>Segment ID format: flight number + departure airport + arrival airport + departure date (MMdd)</p>
             * 
             * <strong>example:</strong>
             * <p>HO1295-PVG-MFM-20230310</p>
             */
            public Builder segmentId(String segmentId) {
                this.segmentId = segmentId;
                return this;
            }

            /**
             * <p>List of stop cities, with values when stopQuantity &gt; 0, separated by commas</p>
             * 
             * <strong>example:</strong>
             * <p>SEL,HKG</p>
             */
            public Builder stopCityList(String stopCityList) {
                this.stopCityList = stopCityList;
                return this;
            }

            /**
             * <p>Number of stop cities</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link ChangeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailResponseBody</p>
     */
    public static class LastJourneys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_list")
        private java.util.List<LastJourneysSegmentList> segmentList;

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
        public java.util.List<LastJourneysSegmentList> getSegmentList() {
            return this.segmentList;
        }

        /**
         * @return transferCount
         */
        public Integer getTransferCount() {
            return this.transferCount;
        }

        public static final class Builder {
            private java.util.List<LastJourneysSegmentList> segmentList; 
            private Integer transferCount; 

            private Builder() {
            } 

            private Builder(LastJourneys model) {
                this.segmentList = model.segmentList;
                this.transferCount = model.transferCount;
            } 

            /**
             * <p>Segment information</p>
             */
            public Builder segmentList(java.util.List<LastJourneysSegmentList> segmentList) {
                this.segmentList = segmentList;
                return this;
            }

            /**
             * <p>Number of transfers</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link ChangeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(OriginalJourneysSegmentList model) {
                this.arrivalAirport = model.arrivalAirport;
                this.arrivalCity = model.arrivalCity;
                this.arrivalTerminal = model.arrivalTerminal;
                this.arrivalTime = model.arrivalTime;
                this.availability = model.availability;
                this.cabin = model.cabin;
                this.cabinClass = model.cabinClass;
                this.codeShare = model.codeShare;
                this.departureAirport = model.departureAirport;
                this.departureCity = model.departureCity;
                this.departureTerminal = model.departureTerminal;
                this.departureTime = model.departureTime;
                this.equipType = model.equipType;
                this.flightDuration = model.flightDuration;
                this.marketingAirline = model.marketingAirline;
                this.marketingFlightNo = model.marketingFlightNo;
                this.marketingFlightNoInt = model.marketingFlightNoInt;
                this.operatingAirline = model.operatingAirline;
                this.operatingFlightNo = model.operatingFlightNo;
                this.segmentId = model.segmentId;
                this.stopCityList = model.stopCityList;
                this.stopQuantity = model.stopQuantity;
            } 

            /**
             * <p>Arrival airport three-letter code (uppercase)</p>
             * 
             * <strong>example:</strong>
             * <p>MFM</p>
             */
            public Builder arrivalAirport(String arrivalAirport) {
                this.arrivalAirport = arrivalAirport;
                return this;
            }

            /**
             * <p>Arrival city three-letter code (uppercase)</p>
             * 
             * <strong>example:</strong>
             * <p>MFM</p>
             */
            public Builder arrivalCity(String arrivalCity) {
                this.arrivalCity = arrivalCity;
                return this;
            }

            /**
             * <p>Arrival terminal of the flight</p>
             * 
             * <strong>example:</strong>
             * <p>T1</p>
             */
            public Builder arrivalTerminal(String arrivalTerminal) {
                this.arrivalTerminal = arrivalTerminal;
                return this;
            }

            /**
             * <p>Flight arrival date and time in string format (yyyy-MM-dd HH:mm:ss)</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-10 10:40:00</p>
             */
            public Builder arrivalTime(String arrivalTime) {
                this.arrivalTime = arrivalTime;
                return this;
            }

            /**
             * <p>Number of available seats</p>
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
             * <p>service class ( compartment )</p>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * <p>Whether it is a codeshare flight</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder codeShare(Boolean codeShare) {
                this.codeShare = codeShare;
                return this;
            }

            /**
             * <p>Departure airport three-letter code (uppercase)</p>
             * 
             * <strong>example:</strong>
             * <p>PVG</p>
             */
            public Builder departureAirport(String departureAirport) {
                this.departureAirport = departureAirport;
                return this;
            }

            /**
             * <p>Departure city three-letter code (uppercase)</p>
             * 
             * <strong>example:</strong>
             * <p>SHA</p>
             */
            public Builder departureCity(String departureCity) {
                this.departureCity = departureCity;
                return this;
            }

            /**
             * <p>Departure terminal of the flight</p>
             * 
             * <strong>example:</strong>
             * <p>T2</p>
             */
            public Builder departureTerminal(String departureTerminal) {
                this.departureTerminal = departureTerminal;
                return this;
            }

            /**
             * <p>Flight departure date and time in string format (yyyy-MM-dd HH:mm:ss)</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-10 07:55:00</p>
             */
            public Builder departureTime(String departureTime) {
                this.departureTime = departureTime;
                return this;
            }

            /**
             * <p>Aircraft type</p>
             * 
             * <strong>example:</strong>
             * <p>32Q</p>
             */
            public Builder equipType(String equipType) {
                this.equipType = equipType;
                return this;
            }

            /**
             * <p>Flight duration in minutes</p>
             * 
             * <strong>example:</strong>
             * <p>165</p>
             */
            public Builder flightDuration(Integer flightDuration) {
                this.flightDuration = flightDuration;
                return this;
            }

            /**
             * <p>Marketing airline (e.g., HO)</p>
             * 
             * <strong>example:</strong>
             * <p>HO</p>
             */
            public Builder marketingAirline(String marketingAirline) {
                this.marketingAirline = marketingAirline;
                return this;
            }

            /**
             * <p>Marketing flight number (e.g., HO1295)</p>
             * 
             * <strong>example:</strong>
             * <p>HO1295</p>
             */
            public Builder marketingFlightNo(String marketingFlightNo) {
                this.marketingFlightNo = marketingFlightNo;
                return this;
            }

            /**
             * <p>Marketing airline&quot;s numeric flight number (e.g., 1295)</p>
             * 
             * <strong>example:</strong>
             * <p>1295</p>
             */
            public Builder marketingFlightNoInt(Integer marketingFlightNoInt) {
                this.marketingFlightNoInt = marketingFlightNoInt;
                return this;
            }

            /**
             * <p>Operating airline (e.g., CX)</p>
             * 
             * <strong>example:</strong>
             * <p>HO</p>
             */
            public Builder operatingAirline(String operatingAirline) {
                this.operatingAirline = operatingAirline;
                return this;
            }

            /**
             * <p>Operating airline&quot;s flight number (e.g., CX601)</p>
             * 
             * <strong>example:</strong>
             * <p>HO1295</p>
             */
            public Builder operatingFlightNo(String operatingFlightNo) {
                this.operatingFlightNo = operatingFlightNo;
                return this;
            }

            /**
             * <p>Segment ID format: flight number + departure airport + arrival airport + departure date (yyyyMMdd)</p>
             * 
             * <strong>example:</strong>
             * <p>HO1295-PVG-MFM-20230310</p>
             */
            public Builder segmentId(String segmentId) {
                this.segmentId = segmentId;
                return this;
            }

            /**
             * <p>List of stop cities, with values when stopQuantity &gt; 0, separated by commas</p>
             * 
             * <strong>example:</strong>
             * <p>SEL,HKG</p>
             */
            public Builder stopCityList(String stopCityList) {
                this.stopCityList = stopCityList;
                return this;
            }

            /**
             * <p>Number of stop cities</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link ChangeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailResponseBody</p>
     */
    public static class OriginalJourneys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_list")
        private java.util.List<OriginalJourneysSegmentList> segmentList;

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
        public java.util.List<OriginalJourneysSegmentList> getSegmentList() {
            return this.segmentList;
        }

        /**
         * @return transferCount
         */
        public Integer getTransferCount() {
            return this.transferCount;
        }

        public static final class Builder {
            private java.util.List<OriginalJourneysSegmentList> segmentList; 
            private Integer transferCount; 

            private Builder() {
            } 

            private Builder(OriginalJourneys model) {
                this.segmentList = model.segmentList;
                this.transferCount = model.transferCount;
            } 

            /**
             * <p>Segment information</p>
             */
            public Builder segmentList(java.util.List<OriginalJourneysSegmentList> segmentList) {
                this.segmentList = segmentList;
                return this;
            }

            /**
             * <p>Number of transfers</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link ChangeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("change_fee_details")
        private java.util.List<ChangeFeeDetails> changeFeeDetails;

        @com.aliyun.core.annotation.NameInMap("change_order_num")
        private Long changeOrderNum;

        @com.aliyun.core.annotation.NameInMap("change_passengers")
        private java.util.List<ChangePassengers> changePassengers;

        @com.aliyun.core.annotation.NameInMap("change_reason_type")
        private Integer changeReasonType;

        @com.aliyun.core.annotation.NameInMap("changed_journeys")
        private java.util.List<ChangedJourneys> changedJourneys;

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
        private java.util.List<LastJourneys> lastJourneys;

        @com.aliyun.core.annotation.NameInMap("order_num")
        private Long orderNum;

        @com.aliyun.core.annotation.NameInMap("order_status")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("original_journeys")
        private java.util.List<OriginalJourneys> originalJourneys;

        @com.aliyun.core.annotation.NameInMap("pay_status")
        private Integer payStatus;

        @com.aliyun.core.annotation.NameInMap("pay_success_utc_time")
        private Long paySuccessUtcTime;

        @com.aliyun.core.annotation.NameInMap("total_amount")
        private Double totalAmount;

        @com.aliyun.core.annotation.NameInMap("transaction_no")
        private String transactionNo;

        private Data(Builder builder) {
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

        public static Data create() {
            return builder().build();
        }

        /**
         * @return changeFeeDetails
         */
        public java.util.List<ChangeFeeDetails> getChangeFeeDetails() {
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
        public java.util.List<ChangePassengers> getChangePassengers() {
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
        public java.util.List<ChangedJourneys> getChangedJourneys() {
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
        public java.util.List<LastJourneys> getLastJourneys() {
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
        public java.util.List<OriginalJourneys> getOriginalJourneys() {
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
            private java.util.List<ChangeFeeDetails> changeFeeDetails; 
            private Long changeOrderNum; 
            private java.util.List<ChangePassengers> changePassengers; 
            private Integer changeReasonType; 
            private java.util.List<ChangedJourneys> changedJourneys; 
            private String closeReason; 
            private Long closeUtcTime; 
            private Contact contact; 
            private Long createUtcTime; 
            private Long lastConfirmUtcTime; 
            private java.util.List<LastJourneys> lastJourneys; 
            private Long orderNum; 
            private Integer orderStatus; 
            private java.util.List<OriginalJourneys> originalJourneys; 
            private Integer payStatus; 
            private Long paySuccessUtcTime; 
            private Double totalAmount; 
            private String transactionNo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.changeFeeDetails = model.changeFeeDetails;
                this.changeOrderNum = model.changeOrderNum;
                this.changePassengers = model.changePassengers;
                this.changeReasonType = model.changeReasonType;
                this.changedJourneys = model.changedJourneys;
                this.closeReason = model.closeReason;
                this.closeUtcTime = model.closeUtcTime;
                this.contact = model.contact;
                this.createUtcTime = model.createUtcTime;
                this.lastConfirmUtcTime = model.lastConfirmUtcTime;
                this.lastJourneys = model.lastJourneys;
                this.orderNum = model.orderNum;
                this.orderStatus = model.orderStatus;
                this.originalJourneys = model.originalJourneys;
                this.payStatus = model.payStatus;
                this.paySuccessUtcTime = model.paySuccessUtcTime;
                this.totalAmount = model.totalAmount;
                this.transactionNo = model.transactionNo;
            } 

            /**
             * <p>Change fee details, per passenger</p>
             */
            public Builder changeFeeDetails(java.util.List<ChangeFeeDetails> changeFeeDetails) {
                this.changeFeeDetails = changeFeeDetails;
                return this;
            }

            /**
             * <p>Change order number</p>
             * 
             * <strong>example:</strong>
             * <p>4988430***950</p>
             */
            public Builder changeOrderNum(Long changeOrderNum) {
                this.changeOrderNum = changeOrderNum;
                return this;
            }

            /**
             * <p>List of passengers for the change</p>
             */
            public Builder changePassengers(java.util.List<ChangePassengers> changePassengers) {
                this.changePassengers = changePassengers;
                return this;
            }

            /**
             * <p>Change reason type. 
             * 0: Voluntary change; 
             * 1: Involuntary change, due to flight delay or cancellation, schedule changes, or other airline reasons; 
             * 2: Involuntary change, due to health reasons with a medical report</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder changeReasonType(Integer changeReasonType) {
                this.changeReasonType = changeReasonType;
                return this;
            }

            /**
             * <p>New journeys</p>
             */
            public Builder changedJourneys(java.util.List<ChangedJourneys> changedJourneys) {
                this.changedJourneys = changedJourneys;
                return this;
            }

            /**
             * <p>Reason for closing the change order</p>
             * 
             * <strong>example:</strong>
             * <p>reason desc</p>
             */
            public Builder closeReason(String closeReason) {
                this.closeReason = closeReason;
                return this;
            }

            /**
             * <p>The time when the order was closed, in UTC timestamp</p>
             * 
             * <strong>example:</strong>
             * <p>1677415244000</p>
             */
            public Builder closeUtcTime(Long closeUtcTime) {
                this.closeUtcTime = closeUtcTime;
                return this;
            }

            /**
             * <p>Contact information for the change request</p>
             */
            public Builder contact(Contact contact) {
                this.contact = contact;
                return this;
            }

            /**
             * <p>Creation time of the change order, UTC timestamp</p>
             * 
             * <strong>example:</strong>
             * <p>1677415276000</p>
             */
            public Builder createUtcTime(Long createUtcTime) {
                this.createUtcTime = createUtcTime;
                return this;
            }

            /**
             * <p>Latest payment time for the buyer, UTC timestamp</p>
             * 
             * <strong>example:</strong>
             * <p>1677415278000</p>
             */
            public Builder lastConfirmUtcTime(Long lastConfirmUtcTime) {
                this.lastConfirmUtcTime = lastConfirmUtcTime;
                return this;
            }

            /**
             * <p>The itinerary of the last change</p>
             */
            public Builder lastJourneys(java.util.List<LastJourneys> lastJourneys) {
                this.lastJourneys = lastJourneys;
                return this;
            }

            /**
             * <p>Ticketing Order number</p>
             * 
             * <strong>example:</strong>
             * <p>5988430***541</p>
             */
            public Builder orderNum(Long orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * <p>Change order status 0: Initial state; 1: Pending payment; 2: Payment successful; 3: Change successful; 4: Change closed</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * <p>Original journeys</p>
             */
            public Builder originalJourneys(java.util.List<OriginalJourneys> originalJourneys) {
                this.originalJourneys = originalJourneys;
                return this;
            }

            /**
             * <p>Payment status 0: initial state; 1: pending payment; 2: payment successful; 4: successfully closed paid order; 5: successfully closed unpaid order</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder payStatus(Integer payStatus) {
                this.payStatus = payStatus;
                return this;
            }

            /**
             * <p>The time when the buyer successfully paid, in UTC timestamp</p>
             * 
             * <strong>example:</strong>
             * <p>1677415255000</p>
             */
            public Builder paySuccessUtcTime(Long paySuccessUtcTime) {
                this.paySuccessUtcTime = paySuccessUtcTime;
                return this;
            }

            /**
             * <p>Total payment amount for the change order</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder totalAmount(Double totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * <p>Transaction serial number</p>
             * 
             * <strong>example:</strong>
             * <p>hkduendkd-2023-dj0</p>
             */
            public Builder transactionNo(String transactionNo) {
                this.transactionNo = transactionNo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
