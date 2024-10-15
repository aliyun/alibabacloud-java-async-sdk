// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FlightRefundDetailV2ResponseBody} extends {@link TeaModel}
 *
 * <p>FlightRefundDetailV2ResponseBody</p>
 */
public class FlightRefundDetailV2ResponseBody extends TeaModel {
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

    private FlightRefundDetailV2ResponseBody(Builder builder) {
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

    public static FlightRefundDetailV2ResponseBody create() {
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
         * <p>module</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
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
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>210e845f16785007404904300ddc92</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public FlightRefundDetailV2ResponseBody build() {
            return new FlightRefundDetailV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FlightRefundDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightRefundDetailV2ResponseBody</p>
     */
    public static class ContactInfoDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contact_email")
        private String contactEmail;

        @com.aliyun.core.annotation.NameInMap("contact_name")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("contact_phone")
        private String contactPhone;

        @com.aliyun.core.annotation.NameInMap("send_msg_to_passenger")
        private Boolean sendMsgToPassenger;

        private ContactInfoDTO(Builder builder) {
            this.contactEmail = builder.contactEmail;
            this.contactName = builder.contactName;
            this.contactPhone = builder.contactPhone;
            this.sendMsgToPassenger = builder.sendMsgToPassenger;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactInfoDTO create() {
            return builder().build();
        }

        /**
         * @return contactEmail
         */
        public String getContactEmail() {
            return this.contactEmail;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return contactPhone
         */
        public String getContactPhone() {
            return this.contactPhone;
        }

        /**
         * @return sendMsgToPassenger
         */
        public Boolean getSendMsgToPassenger() {
            return this.sendMsgToPassenger;
        }

        public static final class Builder {
            private String contactEmail; 
            private String contactName; 
            private String contactPhone; 
            private Boolean sendMsgToPassenger; 

            /**
             * contact_email.
             */
            public Builder contactEmail(String contactEmail) {
                this.contactEmail = contactEmail;
                return this;
            }

            /**
             * contact_name.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * contact_phone.
             */
            public Builder contactPhone(String contactPhone) {
                this.contactPhone = contactPhone;
                return this;
            }

            /**
             * send_msg_to_passenger.
             */
            public Builder sendMsgToPassenger(Boolean sendMsgToPassenger) {
                this.sendMsgToPassenger = sendMsgToPassenger;
                return this;
            }

            public ContactInfoDTO build() {
                return new ContactInfoDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightRefundDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightRefundDetailV2ResponseBody</p>
     */
    public static class SegmentPosition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        private SegmentPosition(Builder builder) {
            this.journeyIndex = builder.journeyIndex;
            this.segmentIndex = builder.segmentIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentPosition create() {
            return builder().build();
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

        public static final class Builder {
            private Integer journeyIndex; 
            private Integer segmentIndex; 

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

            public SegmentPosition build() {
                return new SegmentPosition(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightRefundDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightRefundDetailV2ResponseBody</p>
     */
    public static class FlightInfoDTOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_icon_url")
        private String airlineIconUrl;

        @com.aliyun.core.annotation.NameInMap("airline_name")
        private String airlineName;

        @com.aliyun.core.annotation.NameInMap("arr_airport_code")
        private String arrAirportCode;

        @com.aliyun.core.annotation.NameInMap("arr_airport_name")
        private String arrAirportName;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_city_name")
        private String arrCityName;

        @com.aliyun.core.annotation.NameInMap("arr_terminal")
        private String arrTerminal;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("cabin_class_name")
        private String cabinClassName;

        @com.aliyun.core.annotation.NameInMap("cabin_discount")
        private Long cabinDiscount;

        @com.aliyun.core.annotation.NameInMap("carrier_airline_code")
        private String carrierAirlineCode;

        @com.aliyun.core.annotation.NameInMap("carrier_airline_icon_url")
        private String carrierAirlineIconUrl;

        @com.aliyun.core.annotation.NameInMap("carrier_airline_name")
        private String carrierAirlineName;

        @com.aliyun.core.annotation.NameInMap("carrier_flight_no")
        private String carrierFlightNo;

        @com.aliyun.core.annotation.NameInMap("dep_airport_code")
        private String depAirportCode;

        @com.aliyun.core.annotation.NameInMap("dep_airport_name")
        private String depAirportName;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_name")
        private String depCityName;

        @com.aliyun.core.annotation.NameInMap("dep_terminal")
        private String depTerminal;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("flight_type")
        private String flightType;

        @com.aliyun.core.annotation.NameInMap("meal_desc")
        private String mealDesc;

        @com.aliyun.core.annotation.NameInMap("segment_id")
        private String segmentId;

        @com.aliyun.core.annotation.NameInMap("segment_position")
        private SegmentPosition segmentPosition;

        @com.aliyun.core.annotation.NameInMap("stop_arr_time")
        private String stopArrTime;

        @com.aliyun.core.annotation.NameInMap("stop_city")
        private String stopCity;

        @com.aliyun.core.annotation.NameInMap("stop_dep_time")
        private String stopDepTime;

        private FlightInfoDTOS(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineIconUrl = builder.airlineIconUrl;
            this.airlineName = builder.airlineName;
            this.arrAirportCode = builder.arrAirportCode;
            this.arrAirportName = builder.arrAirportName;
            this.arrCityCode = builder.arrCityCode;
            this.arrCityName = builder.arrCityName;
            this.arrTerminal = builder.arrTerminal;
            this.arrTime = builder.arrTime;
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.cabinClassName = builder.cabinClassName;
            this.cabinDiscount = builder.cabinDiscount;
            this.carrierAirlineCode = builder.carrierAirlineCode;
            this.carrierAirlineIconUrl = builder.carrierAirlineIconUrl;
            this.carrierAirlineName = builder.carrierAirlineName;
            this.carrierFlightNo = builder.carrierFlightNo;
            this.depAirportCode = builder.depAirportCode;
            this.depAirportName = builder.depAirportName;
            this.depCityCode = builder.depCityCode;
            this.depCityName = builder.depCityName;
            this.depTerminal = builder.depTerminal;
            this.depTime = builder.depTime;
            this.flightNo = builder.flightNo;
            this.flightType = builder.flightType;
            this.mealDesc = builder.mealDesc;
            this.segmentId = builder.segmentId;
            this.segmentPosition = builder.segmentPosition;
            this.stopArrTime = builder.stopArrTime;
            this.stopCity = builder.stopCity;
            this.stopDepTime = builder.stopDepTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightInfoDTOS create() {
            return builder().build();
        }

        /**
         * @return airlineCode
         */
        public String getAirlineCode() {
            return this.airlineCode;
        }

        /**
         * @return airlineIconUrl
         */
        public String getAirlineIconUrl() {
            return this.airlineIconUrl;
        }

        /**
         * @return airlineName
         */
        public String getAirlineName() {
            return this.airlineName;
        }

        /**
         * @return arrAirportCode
         */
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        /**
         * @return arrAirportName
         */
        public String getArrAirportName() {
            return this.arrAirportName;
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return arrCityName
         */
        public String getArrCityName() {
            return this.arrCityName;
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
         * @return cabinClassName
         */
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        /**
         * @return cabinDiscount
         */
        public Long getCabinDiscount() {
            return this.cabinDiscount;
        }

        /**
         * @return carrierAirlineCode
         */
        public String getCarrierAirlineCode() {
            return this.carrierAirlineCode;
        }

        /**
         * @return carrierAirlineIconUrl
         */
        public String getCarrierAirlineIconUrl() {
            return this.carrierAirlineIconUrl;
        }

        /**
         * @return carrierAirlineName
         */
        public String getCarrierAirlineName() {
            return this.carrierAirlineName;
        }

        /**
         * @return carrierFlightNo
         */
        public String getCarrierFlightNo() {
            return this.carrierFlightNo;
        }

        /**
         * @return depAirportCode
         */
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        /**
         * @return depAirportName
         */
        public String getDepAirportName() {
            return this.depAirportName;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return depCityName
         */
        public String getDepCityName() {
            return this.depCityName;
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
         * @return flightType
         */
        public String getFlightType() {
            return this.flightType;
        }

        /**
         * @return mealDesc
         */
        public String getMealDesc() {
            return this.mealDesc;
        }

        /**
         * @return segmentId
         */
        public String getSegmentId() {
            return this.segmentId;
        }

        /**
         * @return segmentPosition
         */
        public SegmentPosition getSegmentPosition() {
            return this.segmentPosition;
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
            private String airlineCode; 
            private String airlineIconUrl; 
            private String airlineName; 
            private String arrAirportCode; 
            private String arrAirportName; 
            private String arrCityCode; 
            private String arrCityName; 
            private String arrTerminal; 
            private String arrTime; 
            private String cabin; 
            private String cabinClass; 
            private String cabinClassName; 
            private Long cabinDiscount; 
            private String carrierAirlineCode; 
            private String carrierAirlineIconUrl; 
            private String carrierAirlineName; 
            private String carrierFlightNo; 
            private String depAirportCode; 
            private String depAirportName; 
            private String depCityCode; 
            private String depCityName; 
            private String depTerminal; 
            private String depTime; 
            private String flightNo; 
            private String flightType; 
            private String mealDesc; 
            private String segmentId; 
            private SegmentPosition segmentPosition; 
            private String stopArrTime; 
            private String stopCity; 
            private String stopDepTime; 

            /**
             * airline_code.
             */
            public Builder airlineCode(String airlineCode) {
                this.airlineCode = airlineCode;
                return this;
            }

            /**
             * airline_icon_url.
             */
            public Builder airlineIconUrl(String airlineIconUrl) {
                this.airlineIconUrl = airlineIconUrl;
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
             * arr_airport_code.
             */
            public Builder arrAirportCode(String arrAirportCode) {
                this.arrAirportCode = arrAirportCode;
                return this;
            }

            /**
             * arr_airport_name.
             */
            public Builder arrAirportName(String arrAirportName) {
                this.arrAirportName = arrAirportName;
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
             * arr_city_name.
             */
            public Builder arrCityName(String arrCityName) {
                this.arrCityName = arrCityName;
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
             * cabin_class_name.
             */
            public Builder cabinClassName(String cabinClassName) {
                this.cabinClassName = cabinClassName;
                return this;
            }

            /**
             * cabin_discount.
             */
            public Builder cabinDiscount(Long cabinDiscount) {
                this.cabinDiscount = cabinDiscount;
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
             * carrier_airline_icon_url.
             */
            public Builder carrierAirlineIconUrl(String carrierAirlineIconUrl) {
                this.carrierAirlineIconUrl = carrierAirlineIconUrl;
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
             * carrier_flight_no.
             */
            public Builder carrierFlightNo(String carrierFlightNo) {
                this.carrierFlightNo = carrierFlightNo;
                return this;
            }

            /**
             * dep_airport_code.
             */
            public Builder depAirportCode(String depAirportCode) {
                this.depAirportCode = depAirportCode;
                return this;
            }

            /**
             * dep_airport_name.
             */
            public Builder depAirportName(String depAirportName) {
                this.depAirportName = depAirportName;
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
             * dep_city_name.
             */
            public Builder depCityName(String depCityName) {
                this.depCityName = depCityName;
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
             * flight_type.
             */
            public Builder flightType(String flightType) {
                this.flightType = flightType;
                return this;
            }

            /**
             * meal_desc.
             */
            public Builder mealDesc(String mealDesc) {
                this.mealDesc = mealDesc;
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
             * segment_position.
             */
            public Builder segmentPosition(SegmentPosition segmentPosition) {
                this.segmentPosition = segmentPosition;
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
             * stop_dep_time.
             */
            public Builder stopDepTime(String stopDepTime) {
                this.stopDepTime = stopDepTime;
                return this;
            }

            public FlightInfoDTOS build() {
                return new FlightInfoDTOS(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightRefundDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightRefundDetailV2ResponseBody</p>
     */
    public static class TravelerInfoDTOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birth_date")
        private String birthDate;

        @com.aliyun.core.annotation.NameInMap("cert_no")
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("cert_type")
        private Integer certType;

        @com.aliyun.core.annotation.NameInMap("gender")
        private Integer gender;

        @com.aliyun.core.annotation.NameInMap("origin_ticket_nos")
        private java.util.List < String > originTicketNos;

        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private String passengerId;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        private String passengerName;

        @com.aliyun.core.annotation.NameInMap("passenger_type")
        private Integer passengerType;

        @com.aliyun.core.annotation.NameInMap("phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("pid")
        private Long pid;

        @com.aliyun.core.annotation.NameInMap("ticket_nos")
        private java.util.List < String > ticketNos;

        private TravelerInfoDTOS(Builder builder) {
            this.birthDate = builder.birthDate;
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.gender = builder.gender;
            this.originTicketNos = builder.originTicketNos;
            this.passengerId = builder.passengerId;
            this.passengerName = builder.passengerName;
            this.passengerType = builder.passengerType;
            this.phone = builder.phone;
            this.pid = builder.pid;
            this.ticketNos = builder.ticketNos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TravelerInfoDTOS create() {
            return builder().build();
        }

        /**
         * @return birthDate
         */
        public String getBirthDate() {
            return this.birthDate;
        }

        /**
         * @return certNo
         */
        public String getCertNo() {
            return this.certNo;
        }

        /**
         * @return certType
         */
        public Integer getCertType() {
            return this.certType;
        }

        /**
         * @return gender
         */
        public Integer getGender() {
            return this.gender;
        }

        /**
         * @return originTicketNos
         */
        public java.util.List < String > getOriginTicketNos() {
            return this.originTicketNos;
        }

        /**
         * @return passengerId
         */
        public String getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        /**
         * @return passengerType
         */
        public Integer getPassengerType() {
            return this.passengerType;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return pid
         */
        public Long getPid() {
            return this.pid;
        }

        /**
         * @return ticketNos
         */
        public java.util.List < String > getTicketNos() {
            return this.ticketNos;
        }

        public static final class Builder {
            private String birthDate; 
            private String certNo; 
            private Integer certType; 
            private Integer gender; 
            private java.util.List < String > originTicketNos; 
            private String passengerId; 
            private String passengerName; 
            private Integer passengerType; 
            private String phone; 
            private Long pid; 
            private java.util.List < String > ticketNos; 

            /**
             * birth_date.
             */
            public Builder birthDate(String birthDate) {
                this.birthDate = birthDate;
                return this;
            }

            /**
             * cert_no.
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * cert_type.
             */
            public Builder certType(Integer certType) {
                this.certType = certType;
                return this;
            }

            /**
             * gender.
             */
            public Builder gender(Integer gender) {
                this.gender = gender;
                return this;
            }

            /**
             * origin_ticket_nos.
             */
            public Builder originTicketNos(java.util.List < String > originTicketNos) {
                this.originTicketNos = originTicketNos;
                return this;
            }

            /**
             * passenger_id.
             */
            public Builder passengerId(String passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * passenger_name.
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
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
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * pid.
             */
            public Builder pid(Long pid) {
                this.pid = pid;
                return this;
            }

            /**
             * ticket_nos.
             */
            public Builder ticketNos(java.util.List < String > ticketNos) {
                this.ticketNos = ticketNos;
                return this;
            }

            public TravelerInfoDTOS build() {
                return new TravelerInfoDTOS(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightRefundDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightRefundDetailV2ResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_time")
        private String applyTime;

        @com.aliyun.core.annotation.NameInMap("contact_info_d_t_o")
        private ContactInfoDTO contactInfoDTO;

        @com.aliyun.core.annotation.NameInMap("flight_info_d_t_o_s")
        private java.util.List < FlightInfoDTOS> flightInfoDTOS;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("out_order_id")
        private String outOrderId;

        @com.aliyun.core.annotation.NameInMap("out_sub_order_id")
        private String outSubOrderId;

        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("reason_code")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("refund_fail_reason")
        private String refundFailReason;

        @com.aliyun.core.annotation.NameInMap("refund_handling_fee")
        private Long refundHandlingFee;

        @com.aliyun.core.annotation.NameInMap("refund_money")
        private Long refundMoney;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("sub_order_id")
        private Long subOrderId;

        @com.aliyun.core.annotation.NameInMap("traveler_info_d_t_o_s")
        private java.util.List < TravelerInfoDTOS> travelerInfoDTOS;

        private Module(Builder builder) {
            this.applyTime = builder.applyTime;
            this.contactInfoDTO = builder.contactInfoDTO;
            this.flightInfoDTOS = builder.flightInfoDTOS;
            this.orderId = builder.orderId;
            this.outOrderId = builder.outOrderId;
            this.outSubOrderId = builder.outSubOrderId;
            this.reason = builder.reason;
            this.reasonCode = builder.reasonCode;
            this.refundFailReason = builder.refundFailReason;
            this.refundHandlingFee = builder.refundHandlingFee;
            this.refundMoney = builder.refundMoney;
            this.status = builder.status;
            this.subOrderId = builder.subOrderId;
            this.travelerInfoDTOS = builder.travelerInfoDTOS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return applyTime
         */
        public String getApplyTime() {
            return this.applyTime;
        }

        /**
         * @return contactInfoDTO
         */
        public ContactInfoDTO getContactInfoDTO() {
            return this.contactInfoDTO;
        }

        /**
         * @return flightInfoDTOS
         */
        public java.util.List < FlightInfoDTOS> getFlightInfoDTOS() {
            return this.flightInfoDTOS;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return outOrderId
         */
        public String getOutOrderId() {
            return this.outOrderId;
        }

        /**
         * @return outSubOrderId
         */
        public String getOutSubOrderId() {
            return this.outSubOrderId;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return refundFailReason
         */
        public String getRefundFailReason() {
            return this.refundFailReason;
        }

        /**
         * @return refundHandlingFee
         */
        public Long getRefundHandlingFee() {
            return this.refundHandlingFee;
        }

        /**
         * @return refundMoney
         */
        public Long getRefundMoney() {
            return this.refundMoney;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return subOrderId
         */
        public Long getSubOrderId() {
            return this.subOrderId;
        }

        /**
         * @return travelerInfoDTOS
         */
        public java.util.List < TravelerInfoDTOS> getTravelerInfoDTOS() {
            return this.travelerInfoDTOS;
        }

        public static final class Builder {
            private String applyTime; 
            private ContactInfoDTO contactInfoDTO; 
            private java.util.List < FlightInfoDTOS> flightInfoDTOS; 
            private Long orderId; 
            private String outOrderId; 
            private String outSubOrderId; 
            private String reason; 
            private String reasonCode; 
            private String refundFailReason; 
            private Long refundHandlingFee; 
            private Long refundMoney; 
            private Integer status; 
            private Long subOrderId; 
            private java.util.List < TravelerInfoDTOS> travelerInfoDTOS; 

            /**
             * apply_time.
             */
            public Builder applyTime(String applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * contact_info_d_t_o.
             */
            public Builder contactInfoDTO(ContactInfoDTO contactInfoDTO) {
                this.contactInfoDTO = contactInfoDTO;
                return this;
            }

            /**
             * flight_info_d_t_o_s.
             */
            public Builder flightInfoDTOS(java.util.List < FlightInfoDTOS> flightInfoDTOS) {
                this.flightInfoDTOS = flightInfoDTOS;
                return this;
            }

            /**
             * order_id.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * out_order_id.
             */
            public Builder outOrderId(String outOrderId) {
                this.outOrderId = outOrderId;
                return this;
            }

            /**
             * out_sub_order_id.
             */
            public Builder outSubOrderId(String outSubOrderId) {
                this.outSubOrderId = outSubOrderId;
                return this;
            }

            /**
             * reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * reason_code.
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * refund_fail_reason.
             */
            public Builder refundFailReason(String refundFailReason) {
                this.refundFailReason = refundFailReason;
                return this;
            }

            /**
             * refund_handling_fee.
             */
            public Builder refundHandlingFee(Long refundHandlingFee) {
                this.refundHandlingFee = refundHandlingFee;
                return this;
            }

            /**
             * refund_money.
             */
            public Builder refundMoney(Long refundMoney) {
                this.refundMoney = refundMoney;
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
             * sub_order_id.
             */
            public Builder subOrderId(Long subOrderId) {
                this.subOrderId = subOrderId;
                return this;
            }

            /**
             * traveler_info_d_t_o_s.
             */
            public Builder travelerInfoDTOS(java.util.List < TravelerInfoDTOS> travelerInfoDTOS) {
                this.travelerInfoDTOS = travelerInfoDTOS;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
