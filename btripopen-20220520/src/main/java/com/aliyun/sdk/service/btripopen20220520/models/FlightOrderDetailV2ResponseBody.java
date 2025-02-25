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
 * {@link FlightOrderDetailV2ResponseBody} extends {@link TeaModel}
 *
 * <p>FlightOrderDetailV2ResponseBody</p>
 */
public class FlightOrderDetailV2ResponseBody extends TeaModel {
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

    private FlightOrderDetailV2ResponseBody(Builder builder) {
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

    public static FlightOrderDetailV2ResponseBody create() {
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
         * <p>E5F4ACF5-5677-1515-9999-ABBB5E668032</p>
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
         * <p>210bc60a16917251281873772dac41</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public FlightOrderDetailV2ResponseBody build() {
            return new FlightOrderDetailV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FlightOrderDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderDetailV2ResponseBody</p>
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
     * {@link FlightOrderDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderDetailV2ResponseBody</p>
     */
    public static class FlightChange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("change_desc")
        private String changeDesc;

        @com.aliyun.core.annotation.NameInMap("change_status")
        private String changeStatus;

        @com.aliyun.core.annotation.NameInMap("change_status_code")
        private String changeStatusCode;

        @com.aliyun.core.annotation.NameInMap("new_segment")
        private Object newSegment;

        @com.aliyun.core.annotation.NameInMap("passenger_names")
        private java.util.List<String> passengerNames;

        private FlightChange(Builder builder) {
            this.changeDesc = builder.changeDesc;
            this.changeStatus = builder.changeStatus;
            this.changeStatusCode = builder.changeStatusCode;
            this.newSegment = builder.newSegment;
            this.passengerNames = builder.passengerNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightChange create() {
            return builder().build();
        }

        /**
         * @return changeDesc
         */
        public String getChangeDesc() {
            return this.changeDesc;
        }

        /**
         * @return changeStatus
         */
        public String getChangeStatus() {
            return this.changeStatus;
        }

        /**
         * @return changeStatusCode
         */
        public String getChangeStatusCode() {
            return this.changeStatusCode;
        }

        /**
         * @return newSegment
         */
        public Object getNewSegment() {
            return this.newSegment;
        }

        /**
         * @return passengerNames
         */
        public java.util.List<String> getPassengerNames() {
            return this.passengerNames;
        }

        public static final class Builder {
            private String changeDesc; 
            private String changeStatus; 
            private String changeStatusCode; 
            private Object newSegment; 
            private java.util.List<String> passengerNames; 

            /**
             * change_desc.
             */
            public Builder changeDesc(String changeDesc) {
                this.changeDesc = changeDesc;
                return this;
            }

            /**
             * change_status.
             */
            public Builder changeStatus(String changeStatus) {
                this.changeStatus = changeStatus;
                return this;
            }

            /**
             * change_status_code.
             */
            public Builder changeStatusCode(String changeStatusCode) {
                this.changeStatusCode = changeStatusCode;
                return this;
            }

            /**
             * new_segment.
             */
            public Builder newSegment(Object newSegment) {
                this.newSegment = newSegment;
                return this;
            }

            /**
             * passenger_names.
             */
            public Builder passengerNames(java.util.List<String> passengerNames) {
                this.passengerNames = passengerNames;
                return this;
            }

            public FlightChange build() {
                return new FlightChange(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderDetailV2ResponseBody</p>
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
     * {@link FlightOrderDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderDetailV2ResponseBody</p>
     */
    public static class SegmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("air_line_code")
        private String airLineCode;

        @com.aliyun.core.annotation.NameInMap("air_line_english_name")
        private String airLineEnglishName;

        @com.aliyun.core.annotation.NameInMap("air_line_name")
        private String airLineName;

        @com.aliyun.core.annotation.NameInMap("air_line_phone")
        private String airLinePhone;

        @com.aliyun.core.annotation.NameInMap("airline_icon_url")
        private String airlineIconUrl;

        @com.aliyun.core.annotation.NameInMap("airline_short_name")
        private String airlineShortName;

        @com.aliyun.core.annotation.NameInMap("arr_airport_code")
        private String arrAirportCode;

        @com.aliyun.core.annotation.NameInMap("arr_airport_name")
        private String arrAirportName;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_city_name")
        private String arrCityName;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("arrive_terminal")
        private String arriveTerminal;

        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("cabin_and_discount")
        private String cabinAndDiscount;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("cabin_class_name")
        private String cabinClassName;

        @com.aliyun.core.annotation.NameInMap("code_share")
        private Boolean codeShare;

        @com.aliyun.core.annotation.NameInMap("deadline_text")
        private String deadlineText;

        @com.aliyun.core.annotation.NameInMap("dep_airport_code")
        private String depAirportCode;

        @com.aliyun.core.annotation.NameInMap("dep_airport_name")
        private String depAirportName;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_name")
        private String depCityName;

        @com.aliyun.core.annotation.NameInMap("dep_date")
        private String depDate;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("depart_terminal")
        private String departTerminal;

        @com.aliyun.core.annotation.NameInMap("discount")
        private Double discount;

        @com.aliyun.core.annotation.NameInMap("flight_change")
        private FlightChange flightChange;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("flight_type")
        private String flightType;

        @com.aliyun.core.annotation.NameInMap("fly_duration")
        private Integer flyDuration;

        @com.aliyun.core.annotation.NameInMap("manufacturer")
        private String manufacturer;

        @com.aliyun.core.annotation.NameInMap("meal_desc")
        private String mealDesc;

        @com.aliyun.core.annotation.NameInMap("on_time_rate")
        private String onTimeRate;

        @com.aliyun.core.annotation.NameInMap("operating_air_short_name")
        private String operatingAirShortName;

        @com.aliyun.core.annotation.NameInMap("operating_airline_code")
        private String operatingAirlineCode;

        @com.aliyun.core.annotation.NameInMap("operating_airline_english_name")
        private String operatingAirlineEnglishName;

        @com.aliyun.core.annotation.NameInMap("operating_airline_icon_url")
        private String operatingAirlineIconUrl;

        @com.aliyun.core.annotation.NameInMap("operating_airline_name")
        private String operatingAirlineName;

        @com.aliyun.core.annotation.NameInMap("operating_airline_phone")
        private String operatingAirlinePhone;

        @com.aliyun.core.annotation.NameInMap("operating_flight_no")
        private String operatingFlightNo;

        @com.aliyun.core.annotation.NameInMap("plane_type")
        private String planeType;

        @com.aliyun.core.annotation.NameInMap("raise_price")
        private Long raisePrice;

        @com.aliyun.core.annotation.NameInMap("segment_id")
        private String segmentId;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        @com.aliyun.core.annotation.NameInMap("segment_position")
        private SegmentPosition segmentPosition;

        @com.aliyun.core.annotation.NameInMap("stop_airport")
        private String stopAirport;

        @com.aliyun.core.annotation.NameInMap("stop_arr_time")
        private String stopArrTime;

        @com.aliyun.core.annotation.NameInMap("stop_city")
        private String stopCity;

        @com.aliyun.core.annotation.NameInMap("stop_city_name")
        private String stopCityName;

        @com.aliyun.core.annotation.NameInMap("stop_dep_time")
        private String stopDepTime;

        @com.aliyun.core.annotation.NameInMap("stop_quantity")
        private Integer stopQuantity;

        private SegmentList(Builder builder) {
            this.airLineCode = builder.airLineCode;
            this.airLineEnglishName = builder.airLineEnglishName;
            this.airLineName = builder.airLineName;
            this.airLinePhone = builder.airLinePhone;
            this.airlineIconUrl = builder.airlineIconUrl;
            this.airlineShortName = builder.airlineShortName;
            this.arrAirportCode = builder.arrAirportCode;
            this.arrAirportName = builder.arrAirportName;
            this.arrCityCode = builder.arrCityCode;
            this.arrCityName = builder.arrCityName;
            this.arrTime = builder.arrTime;
            this.arriveTerminal = builder.arriveTerminal;
            this.cabin = builder.cabin;
            this.cabinAndDiscount = builder.cabinAndDiscount;
            this.cabinClass = builder.cabinClass;
            this.cabinClassName = builder.cabinClassName;
            this.codeShare = builder.codeShare;
            this.deadlineText = builder.deadlineText;
            this.depAirportCode = builder.depAirportCode;
            this.depAirportName = builder.depAirportName;
            this.depCityCode = builder.depCityCode;
            this.depCityName = builder.depCityName;
            this.depDate = builder.depDate;
            this.depTime = builder.depTime;
            this.departTerminal = builder.departTerminal;
            this.discount = builder.discount;
            this.flightChange = builder.flightChange;
            this.flightNo = builder.flightNo;
            this.flightType = builder.flightType;
            this.flyDuration = builder.flyDuration;
            this.manufacturer = builder.manufacturer;
            this.mealDesc = builder.mealDesc;
            this.onTimeRate = builder.onTimeRate;
            this.operatingAirShortName = builder.operatingAirShortName;
            this.operatingAirlineCode = builder.operatingAirlineCode;
            this.operatingAirlineEnglishName = builder.operatingAirlineEnglishName;
            this.operatingAirlineIconUrl = builder.operatingAirlineIconUrl;
            this.operatingAirlineName = builder.operatingAirlineName;
            this.operatingAirlinePhone = builder.operatingAirlinePhone;
            this.operatingFlightNo = builder.operatingFlightNo;
            this.planeType = builder.planeType;
            this.raisePrice = builder.raisePrice;
            this.segmentId = builder.segmentId;
            this.segmentIndex = builder.segmentIndex;
            this.segmentPosition = builder.segmentPosition;
            this.stopAirport = builder.stopAirport;
            this.stopArrTime = builder.stopArrTime;
            this.stopCity = builder.stopCity;
            this.stopCityName = builder.stopCityName;
            this.stopDepTime = builder.stopDepTime;
            this.stopQuantity = builder.stopQuantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentList create() {
            return builder().build();
        }

        /**
         * @return airLineCode
         */
        public String getAirLineCode() {
            return this.airLineCode;
        }

        /**
         * @return airLineEnglishName
         */
        public String getAirLineEnglishName() {
            return this.airLineEnglishName;
        }

        /**
         * @return airLineName
         */
        public String getAirLineName() {
            return this.airLineName;
        }

        /**
         * @return airLinePhone
         */
        public String getAirLinePhone() {
            return this.airLinePhone;
        }

        /**
         * @return airlineIconUrl
         */
        public String getAirlineIconUrl() {
            return this.airlineIconUrl;
        }

        /**
         * @return airlineShortName
         */
        public String getAirlineShortName() {
            return this.airlineShortName;
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
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return arriveTerminal
         */
        public String getArriveTerminal() {
            return this.arriveTerminal;
        }

        /**
         * @return cabin
         */
        public String getCabin() {
            return this.cabin;
        }

        /**
         * @return cabinAndDiscount
         */
        public String getCabinAndDiscount() {
            return this.cabinAndDiscount;
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
         * @return codeShare
         */
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        /**
         * @return deadlineText
         */
        public String getDeadlineText() {
            return this.deadlineText;
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
         * @return depDate
         */
        public String getDepDate() {
            return this.depDate;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return departTerminal
         */
        public String getDepartTerminal() {
            return this.departTerminal;
        }

        /**
         * @return discount
         */
        public Double getDiscount() {
            return this.discount;
        }

        /**
         * @return flightChange
         */
        public FlightChange getFlightChange() {
            return this.flightChange;
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
         * @return flyDuration
         */
        public Integer getFlyDuration() {
            return this.flyDuration;
        }

        /**
         * @return manufacturer
         */
        public String getManufacturer() {
            return this.manufacturer;
        }

        /**
         * @return mealDesc
         */
        public String getMealDesc() {
            return this.mealDesc;
        }

        /**
         * @return onTimeRate
         */
        public String getOnTimeRate() {
            return this.onTimeRate;
        }

        /**
         * @return operatingAirShortName
         */
        public String getOperatingAirShortName() {
            return this.operatingAirShortName;
        }

        /**
         * @return operatingAirlineCode
         */
        public String getOperatingAirlineCode() {
            return this.operatingAirlineCode;
        }

        /**
         * @return operatingAirlineEnglishName
         */
        public String getOperatingAirlineEnglishName() {
            return this.operatingAirlineEnglishName;
        }

        /**
         * @return operatingAirlineIconUrl
         */
        public String getOperatingAirlineIconUrl() {
            return this.operatingAirlineIconUrl;
        }

        /**
         * @return operatingAirlineName
         */
        public String getOperatingAirlineName() {
            return this.operatingAirlineName;
        }

        /**
         * @return operatingAirlinePhone
         */
        public String getOperatingAirlinePhone() {
            return this.operatingAirlinePhone;
        }

        /**
         * @return operatingFlightNo
         */
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        /**
         * @return planeType
         */
        public String getPlaneType() {
            return this.planeType;
        }

        /**
         * @return raisePrice
         */
        public Long getRaisePrice() {
            return this.raisePrice;
        }

        /**
         * @return segmentId
         */
        public String getSegmentId() {
            return this.segmentId;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        /**
         * @return segmentPosition
         */
        public SegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        /**
         * @return stopAirport
         */
        public String getStopAirport() {
            return this.stopAirport;
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
         * @return stopCityName
         */
        public String getStopCityName() {
            return this.stopCityName;
        }

        /**
         * @return stopDepTime
         */
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        /**
         * @return stopQuantity
         */
        public Integer getStopQuantity() {
            return this.stopQuantity;
        }

        public static final class Builder {
            private String airLineCode; 
            private String airLineEnglishName; 
            private String airLineName; 
            private String airLinePhone; 
            private String airlineIconUrl; 
            private String airlineShortName; 
            private String arrAirportCode; 
            private String arrAirportName; 
            private String arrCityCode; 
            private String arrCityName; 
            private String arrTime; 
            private String arriveTerminal; 
            private String cabin; 
            private String cabinAndDiscount; 
            private String cabinClass; 
            private String cabinClassName; 
            private Boolean codeShare; 
            private String deadlineText; 
            private String depAirportCode; 
            private String depAirportName; 
            private String depCityCode; 
            private String depCityName; 
            private String depDate; 
            private String depTime; 
            private String departTerminal; 
            private Double discount; 
            private FlightChange flightChange; 
            private String flightNo; 
            private String flightType; 
            private Integer flyDuration; 
            private String manufacturer; 
            private String mealDesc; 
            private String onTimeRate; 
            private String operatingAirShortName; 
            private String operatingAirlineCode; 
            private String operatingAirlineEnglishName; 
            private String operatingAirlineIconUrl; 
            private String operatingAirlineName; 
            private String operatingAirlinePhone; 
            private String operatingFlightNo; 
            private String planeType; 
            private Long raisePrice; 
            private String segmentId; 
            private Integer segmentIndex; 
            private SegmentPosition segmentPosition; 
            private String stopAirport; 
            private String stopArrTime; 
            private String stopCity; 
            private String stopCityName; 
            private String stopDepTime; 
            private Integer stopQuantity; 

            /**
             * air_line_code.
             */
            public Builder airLineCode(String airLineCode) {
                this.airLineCode = airLineCode;
                return this;
            }

            /**
             * air_line_english_name.
             */
            public Builder airLineEnglishName(String airLineEnglishName) {
                this.airLineEnglishName = airLineEnglishName;
                return this;
            }

            /**
             * air_line_name.
             */
            public Builder airLineName(String airLineName) {
                this.airLineName = airLineName;
                return this;
            }

            /**
             * air_line_phone.
             */
            public Builder airLinePhone(String airLinePhone) {
                this.airLinePhone = airLinePhone;
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
             * airline_short_name.
             */
            public Builder airlineShortName(String airlineShortName) {
                this.airlineShortName = airlineShortName;
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
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * arrive_terminal.
             */
            public Builder arriveTerminal(String arriveTerminal) {
                this.arriveTerminal = arriveTerminal;
                return this;
            }

            /**
             * <p>cabin</p>
             */
            public Builder cabin(String cabin) {
                this.cabin = cabin;
                return this;
            }

            /**
             * cabin_and_discount.
             */
            public Builder cabinAndDiscount(String cabinAndDiscount) {
                this.cabinAndDiscount = cabinAndDiscount;
                return this;
            }

            /**
             * <p>cabin_class</p>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * <p>cabin_class_name</p>
             */
            public Builder cabinClassName(String cabinClassName) {
                this.cabinClassName = cabinClassName;
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
             * deadline_text.
             */
            public Builder deadlineText(String deadlineText) {
                this.deadlineText = deadlineText;
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
             * dep_date.
             */
            public Builder depDate(String depDate) {
                this.depDate = depDate;
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
             * depart_terminal.
             */
            public Builder departTerminal(String departTerminal) {
                this.departTerminal = departTerminal;
                return this;
            }

            /**
             * discount.
             */
            public Builder discount(Double discount) {
                this.discount = discount;
                return this;
            }

            /**
             * flight_change.
             */
            public Builder flightChange(FlightChange flightChange) {
                this.flightChange = flightChange;
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
             * fly_duration.
             */
            public Builder flyDuration(Integer flyDuration) {
                this.flyDuration = flyDuration;
                return this;
            }

            /**
             * manufacturer.
             */
            public Builder manufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
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
             * on_time_rate.
             */
            public Builder onTimeRate(String onTimeRate) {
                this.onTimeRate = onTimeRate;
                return this;
            }

            /**
             * operating_air_short_name.
             */
            public Builder operatingAirShortName(String operatingAirShortName) {
                this.operatingAirShortName = operatingAirShortName;
                return this;
            }

            /**
             * operating_airline_code.
             */
            public Builder operatingAirlineCode(String operatingAirlineCode) {
                this.operatingAirlineCode = operatingAirlineCode;
                return this;
            }

            /**
             * operating_airline_english_name.
             */
            public Builder operatingAirlineEnglishName(String operatingAirlineEnglishName) {
                this.operatingAirlineEnglishName = operatingAirlineEnglishName;
                return this;
            }

            /**
             * operating_airline_icon_url.
             */
            public Builder operatingAirlineIconUrl(String operatingAirlineIconUrl) {
                this.operatingAirlineIconUrl = operatingAirlineIconUrl;
                return this;
            }

            /**
             * operating_airline_name.
             */
            public Builder operatingAirlineName(String operatingAirlineName) {
                this.operatingAirlineName = operatingAirlineName;
                return this;
            }

            /**
             * operating_airline_phone.
             */
            public Builder operatingAirlinePhone(String operatingAirlinePhone) {
                this.operatingAirlinePhone = operatingAirlinePhone;
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
             * plane_type.
             */
            public Builder planeType(String planeType) {
                this.planeType = planeType;
                return this;
            }

            /**
             * raise_price.
             */
            public Builder raisePrice(Long raisePrice) {
                this.raisePrice = raisePrice;
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
             * <p>segmentIndex</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
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
             * stop_airport.
             */
            public Builder stopAirport(String stopAirport) {
                this.stopAirport = stopAirport;
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
             * stop_city_name.
             */
            public Builder stopCityName(String stopCityName) {
                this.stopCityName = stopCityName;
                return this;
            }

            /**
             * stop_dep_time.
             */
            public Builder stopDepTime(String stopDepTime) {
                this.stopDepTime = stopDepTime;
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
     * {@link FlightOrderDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderDetailV2ResponseBody</p>
     */
    public static class Journeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("all_fly_duration")
        private Long allFlyDuration;

        @com.aliyun.core.annotation.NameInMap("all_fly_duration_after_change")
        private Long allFlyDurationAfterChange;

        @com.aliyun.core.annotation.NameInMap("apply_id")
        private Long applyId;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_city_name")
        private String arrCityName;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("baggage_details")
        private String baggageDetails;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_name")
        private String depCityName;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("flight_status")
        private String flightStatus;

        @com.aliyun.core.annotation.NameInMap("iata_no")
        private String iataNo;

        @com.aliyun.core.annotation.NameInMap("is_reshop_journey")
        private Boolean isReshopJourney;

        @com.aliyun.core.annotation.NameInMap("is_transfer")
        private Boolean isTransfer;

        @com.aliyun.core.annotation.NameInMap("journey_title")
        private String journeyTitle;

        @com.aliyun.core.annotation.NameInMap("refund_change_details")
        private String refundChangeDetails;

        @com.aliyun.core.annotation.NameInMap("segment_list")
        private java.util.List<SegmentList> segmentList;

        private Journeys(Builder builder) {
            this.allFlyDuration = builder.allFlyDuration;
            this.allFlyDurationAfterChange = builder.allFlyDurationAfterChange;
            this.applyId = builder.applyId;
            this.arrCityCode = builder.arrCityCode;
            this.arrCityName = builder.arrCityName;
            this.arrTime = builder.arrTime;
            this.baggageDetails = builder.baggageDetails;
            this.depCityCode = builder.depCityCode;
            this.depCityName = builder.depCityName;
            this.depTime = builder.depTime;
            this.flightStatus = builder.flightStatus;
            this.iataNo = builder.iataNo;
            this.isReshopJourney = builder.isReshopJourney;
            this.isTransfer = builder.isTransfer;
            this.journeyTitle = builder.journeyTitle;
            this.refundChangeDetails = builder.refundChangeDetails;
            this.segmentList = builder.segmentList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Journeys create() {
            return builder().build();
        }

        /**
         * @return allFlyDuration
         */
        public Long getAllFlyDuration() {
            return this.allFlyDuration;
        }

        /**
         * @return allFlyDurationAfterChange
         */
        public Long getAllFlyDurationAfterChange() {
            return this.allFlyDurationAfterChange;
        }

        /**
         * @return applyId
         */
        public Long getApplyId() {
            return this.applyId;
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
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return baggageDetails
         */
        public String getBaggageDetails() {
            return this.baggageDetails;
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
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return flightStatus
         */
        public String getFlightStatus() {
            return this.flightStatus;
        }

        /**
         * @return iataNo
         */
        public String getIataNo() {
            return this.iataNo;
        }

        /**
         * @return isReshopJourney
         */
        public Boolean getIsReshopJourney() {
            return this.isReshopJourney;
        }

        /**
         * @return isTransfer
         */
        public Boolean getIsTransfer() {
            return this.isTransfer;
        }

        /**
         * @return journeyTitle
         */
        public String getJourneyTitle() {
            return this.journeyTitle;
        }

        /**
         * @return refundChangeDetails
         */
        public String getRefundChangeDetails() {
            return this.refundChangeDetails;
        }

        /**
         * @return segmentList
         */
        public java.util.List<SegmentList> getSegmentList() {
            return this.segmentList;
        }

        public static final class Builder {
            private Long allFlyDuration; 
            private Long allFlyDurationAfterChange; 
            private Long applyId; 
            private String arrCityCode; 
            private String arrCityName; 
            private String arrTime; 
            private String baggageDetails; 
            private String depCityCode; 
            private String depCityName; 
            private String depTime; 
            private String flightStatus; 
            private String iataNo; 
            private Boolean isReshopJourney; 
            private Boolean isTransfer; 
            private String journeyTitle; 
            private String refundChangeDetails; 
            private java.util.List<SegmentList> segmentList; 

            /**
             * all_fly_duration.
             */
            public Builder allFlyDuration(Long allFlyDuration) {
                this.allFlyDuration = allFlyDuration;
                return this;
            }

            /**
             * all_fly_duration_after_change.
             */
            public Builder allFlyDurationAfterChange(Long allFlyDurationAfterChange) {
                this.allFlyDurationAfterChange = allFlyDurationAfterChange;
                return this;
            }

            /**
             * apply_id.
             */
            public Builder applyId(Long applyId) {
                this.applyId = applyId;
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
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * baggage_details.
             */
            public Builder baggageDetails(String baggageDetails) {
                this.baggageDetails = baggageDetails;
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
             * dep_time.
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * flight_status.
             */
            public Builder flightStatus(String flightStatus) {
                this.flightStatus = flightStatus;
                return this;
            }

            /**
             * <p>iata_no</p>
             * 
             * <strong>example:</strong>
             * <p>iata_no</p>
             */
            public Builder iataNo(String iataNo) {
                this.iataNo = iataNo;
                return this;
            }

            /**
             * is_reshop_journey.
             */
            public Builder isReshopJourney(Boolean isReshopJourney) {
                this.isReshopJourney = isReshopJourney;
                return this;
            }

            /**
             * is_transfer.
             */
            public Builder isTransfer(Boolean isTransfer) {
                this.isTransfer = isTransfer;
                return this;
            }

            /**
             * journey_title.
             */
            public Builder journeyTitle(String journeyTitle) {
                this.journeyTitle = journeyTitle;
                return this;
            }

            /**
             * refund_change_details.
             */
            public Builder refundChangeDetails(String refundChangeDetails) {
                this.refundChangeDetails = refundChangeDetails;
                return this;
            }

            /**
             * segment_list.
             */
            public Builder segmentList(java.util.List<SegmentList> segmentList) {
                this.segmentList = segmentList;
                return this;
            }

            public Journeys build() {
                return new Journeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderDetailV2ResponseBody</p>
     */
    public static class FlightTaleInfoDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("journeys")
        private java.util.List<Journeys> journeys;

        @com.aliyun.core.annotation.NameInMap("notice_tips")
        private String noticeTips;

        @com.aliyun.core.annotation.NameInMap("trip_type")
        private String tripType;

        @com.aliyun.core.annotation.NameInMap("trip_type_code")
        private Integer tripTypeCode;

        private FlightTaleInfoDTO(Builder builder) {
            this.journeys = builder.journeys;
            this.noticeTips = builder.noticeTips;
            this.tripType = builder.tripType;
            this.tripTypeCode = builder.tripTypeCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightTaleInfoDTO create() {
            return builder().build();
        }

        /**
         * @return journeys
         */
        public java.util.List<Journeys> getJourneys() {
            return this.journeys;
        }

        /**
         * @return noticeTips
         */
        public String getNoticeTips() {
            return this.noticeTips;
        }

        /**
         * @return tripType
         */
        public String getTripType() {
            return this.tripType;
        }

        /**
         * @return tripTypeCode
         */
        public Integer getTripTypeCode() {
            return this.tripTypeCode;
        }

        public static final class Builder {
            private java.util.List<Journeys> journeys; 
            private String noticeTips; 
            private String tripType; 
            private Integer tripTypeCode; 

            /**
             * journeys.
             */
            public Builder journeys(java.util.List<Journeys> journeys) {
                this.journeys = journeys;
                return this;
            }

            /**
             * notice_tips.
             */
            public Builder noticeTips(String noticeTips) {
                this.noticeTips = noticeTips;
                return this;
            }

            /**
             * trip_type.
             */
            public Builder tripType(String tripType) {
                this.tripType = tripType;
                return this;
            }

            /**
             * trip_type_code.
             */
            public Builder tripTypeCode(Integer tripTypeCode) {
                this.tripTypeCode = tripTypeCode;
                return this;
            }

            public FlightTaleInfoDTO build() {
                return new FlightTaleInfoDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderDetailV2ResponseBody</p>
     */
    public static class Credential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birth_date")
        private String birthDate;

        @com.aliyun.core.annotation.NameInMap("cert_issue_date")
        private String certIssueDate;

        @com.aliyun.core.annotation.NameInMap("cert_issue_place")
        private String certIssuePlace;

        @com.aliyun.core.annotation.NameInMap("credential_no")
        private String credentialNo;

        @com.aliyun.core.annotation.NameInMap("drive_licence_first")
        private String driveLicenceFirst;

        @com.aliyun.core.annotation.NameInMap("drive_licence_type")
        private String driveLicenceType;

        @com.aliyun.core.annotation.NameInMap("expire_date")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("holder_nationality")
        private String holderNationality;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("id_check_code")
        private String idCheckCode;

        @com.aliyun.core.annotation.NameInMap("issue_country")
        private String issueCountry;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        private Credential(Builder builder) {
            this.birthDate = builder.birthDate;
            this.certIssueDate = builder.certIssueDate;
            this.certIssuePlace = builder.certIssuePlace;
            this.credentialNo = builder.credentialNo;
            this.driveLicenceFirst = builder.driveLicenceFirst;
            this.driveLicenceType = builder.driveLicenceType;
            this.expireDate = builder.expireDate;
            this.holderNationality = builder.holderNationality;
            this.id = builder.id;
            this.idCheckCode = builder.idCheckCode;
            this.issueCountry = builder.issueCountry;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credential create() {
            return builder().build();
        }

        /**
         * @return birthDate
         */
        public String getBirthDate() {
            return this.birthDate;
        }

        /**
         * @return certIssueDate
         */
        public String getCertIssueDate() {
            return this.certIssueDate;
        }

        /**
         * @return certIssuePlace
         */
        public String getCertIssuePlace() {
            return this.certIssuePlace;
        }

        /**
         * @return credentialNo
         */
        public String getCredentialNo() {
            return this.credentialNo;
        }

        /**
         * @return driveLicenceFirst
         */
        public String getDriveLicenceFirst() {
            return this.driveLicenceFirst;
        }

        /**
         * @return driveLicenceType
         */
        public String getDriveLicenceType() {
            return this.driveLicenceType;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return holderNationality
         */
        public String getHolderNationality() {
            return this.holderNationality;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return idCheckCode
         */
        public String getIdCheckCode() {
            return this.idCheckCode;
        }

        /**
         * @return issueCountry
         */
        public String getIssueCountry() {
            return this.issueCountry;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String birthDate; 
            private String certIssueDate; 
            private String certIssuePlace; 
            private String credentialNo; 
            private String driveLicenceFirst; 
            private String driveLicenceType; 
            private String expireDate; 
            private String holderNationality; 
            private Long id; 
            private String idCheckCode; 
            private String issueCountry; 
            private Integer type; 

            /**
             * birth_date.
             */
            public Builder birthDate(String birthDate) {
                this.birthDate = birthDate;
                return this;
            }

            /**
             * cert_issue_date.
             */
            public Builder certIssueDate(String certIssueDate) {
                this.certIssueDate = certIssueDate;
                return this;
            }

            /**
             * cert_issue_place.
             */
            public Builder certIssuePlace(String certIssuePlace) {
                this.certIssuePlace = certIssuePlace;
                return this;
            }

            /**
             * credential_no.
             */
            public Builder credentialNo(String credentialNo) {
                this.credentialNo = credentialNo;
                return this;
            }

            /**
             * drive_licence_first.
             */
            public Builder driveLicenceFirst(String driveLicenceFirst) {
                this.driveLicenceFirst = driveLicenceFirst;
                return this;
            }

            /**
             * drive_licence_type.
             */
            public Builder driveLicenceType(String driveLicenceType) {
                this.driveLicenceType = driveLicenceType;
                return this;
            }

            /**
             * expire_date.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * holder_nationality.
             */
            public Builder holderNationality(String holderNationality) {
                this.holderNationality = holderNationality;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * id_check_code.
             */
            public Builder idCheckCode(String idCheckCode) {
                this.idCheckCode = idCheckCode;
                return this;
            }

            /**
             * issue_country.
             */
            public Builder issueCountry(String issueCountry) {
                this.issueCountry = issueCountry;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Credential build() {
                return new Credential(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderDetailV2ResponseBody</p>
     */
    public static class Credentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birth_date")
        private String birthDate;

        @com.aliyun.core.annotation.NameInMap("cert_issue_date")
        private String certIssueDate;

        @com.aliyun.core.annotation.NameInMap("cert_issue_place")
        private String certIssuePlace;

        @com.aliyun.core.annotation.NameInMap("credential_no")
        private String credentialNo;

        @com.aliyun.core.annotation.NameInMap("drive_licence_first")
        private String driveLicenceFirst;

        @com.aliyun.core.annotation.NameInMap("drive_licence_type")
        private String driveLicenceType;

        @com.aliyun.core.annotation.NameInMap("expire_date")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("holder_nationality")
        private String holderNationality;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("id_check_code")
        private String idCheckCode;

        @com.aliyun.core.annotation.NameInMap("issue_country")
        private String issueCountry;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        private Credentials(Builder builder) {
            this.birthDate = builder.birthDate;
            this.certIssueDate = builder.certIssueDate;
            this.certIssuePlace = builder.certIssuePlace;
            this.credentialNo = builder.credentialNo;
            this.driveLicenceFirst = builder.driveLicenceFirst;
            this.driveLicenceType = builder.driveLicenceType;
            this.expireDate = builder.expireDate;
            this.holderNationality = builder.holderNationality;
            this.id = builder.id;
            this.idCheckCode = builder.idCheckCode;
            this.issueCountry = builder.issueCountry;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credentials create() {
            return builder().build();
        }

        /**
         * @return birthDate
         */
        public String getBirthDate() {
            return this.birthDate;
        }

        /**
         * @return certIssueDate
         */
        public String getCertIssueDate() {
            return this.certIssueDate;
        }

        /**
         * @return certIssuePlace
         */
        public String getCertIssuePlace() {
            return this.certIssuePlace;
        }

        /**
         * @return credentialNo
         */
        public String getCredentialNo() {
            return this.credentialNo;
        }

        /**
         * @return driveLicenceFirst
         */
        public String getDriveLicenceFirst() {
            return this.driveLicenceFirst;
        }

        /**
         * @return driveLicenceType
         */
        public String getDriveLicenceType() {
            return this.driveLicenceType;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return holderNationality
         */
        public String getHolderNationality() {
            return this.holderNationality;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return idCheckCode
         */
        public String getIdCheckCode() {
            return this.idCheckCode;
        }

        /**
         * @return issueCountry
         */
        public String getIssueCountry() {
            return this.issueCountry;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String birthDate; 
            private String certIssueDate; 
            private String certIssuePlace; 
            private String credentialNo; 
            private String driveLicenceFirst; 
            private String driveLicenceType; 
            private String expireDate; 
            private String holderNationality; 
            private Long id; 
            private String idCheckCode; 
            private String issueCountry; 
            private Integer type; 

            /**
             * birth_date.
             */
            public Builder birthDate(String birthDate) {
                this.birthDate = birthDate;
                return this;
            }

            /**
             * cert_issue_date.
             */
            public Builder certIssueDate(String certIssueDate) {
                this.certIssueDate = certIssueDate;
                return this;
            }

            /**
             * cert_issue_place.
             */
            public Builder certIssuePlace(String certIssuePlace) {
                this.certIssuePlace = certIssuePlace;
                return this;
            }

            /**
             * credential_no.
             */
            public Builder credentialNo(String credentialNo) {
                this.credentialNo = credentialNo;
                return this;
            }

            /**
             * drive_licence_first.
             */
            public Builder driveLicenceFirst(String driveLicenceFirst) {
                this.driveLicenceFirst = driveLicenceFirst;
                return this;
            }

            /**
             * drive_licence_type.
             */
            public Builder driveLicenceType(String driveLicenceType) {
                this.driveLicenceType = driveLicenceType;
                return this;
            }

            /**
             * expire_date.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * holder_nationality.
             */
            public Builder holderNationality(String holderNationality) {
                this.holderNationality = holderNationality;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * id_check_code.
             */
            public Builder idCheckCode(String idCheckCode) {
                this.idCheckCode = idCheckCode;
                return this;
            }

            /**
             * issue_country.
             */
            public Builder issueCountry(String issueCountry) {
                this.issueCountry = issueCountry;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Credentials build() {
                return new Credentials(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderDetailV2ResponseBody</p>
     */
    public static class SegmentOpenTicketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("open_ticket_status")
        private Integer openTicketStatus;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        private SegmentOpenTicketList(Builder builder) {
            this.journeyIndex = builder.journeyIndex;
            this.openTicketStatus = builder.openTicketStatus;
            this.segmentIndex = builder.segmentIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentOpenTicketList create() {
            return builder().build();
        }

        /**
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        /**
         * @return openTicketStatus
         */
        public Integer getOpenTicketStatus() {
            return this.openTicketStatus;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public static final class Builder {
            private Integer journeyIndex; 
            private Integer openTicketStatus; 
            private Integer segmentIndex; 

            /**
             * journey_index.
             */
            public Builder journeyIndex(Integer journeyIndex) {
                this.journeyIndex = journeyIndex;
                return this;
            }

            /**
             * open_ticket_status.
             */
            public Builder openTicketStatus(Integer openTicketStatus) {
                this.openTicketStatus = openTicketStatus;
                return this;
            }

            /**
             * <p>segmentIndex</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
                return this;
            }

            public SegmentOpenTicketList build() {
                return new SegmentOpenTicketList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderDetailV2ResponseBody</p>
     */
    public static class Tickets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("journey_title")
        private String journeyTitle;

        @com.aliyun.core.annotation.NameInMap("open_ticket_status")
        private String openTicketStatus;

        @com.aliyun.core.annotation.NameInMap("pcc")
        private String pcc;

        @com.aliyun.core.annotation.NameInMap("segment_open_ticket_list")
        private java.util.List<SegmentOpenTicketList> segmentOpenTicketList;

        @com.aliyun.core.annotation.NameInMap("ticket_auth_memo")
        private String ticketAuthMemo;

        @com.aliyun.core.annotation.NameInMap("ticket_auth_status")
        private Integer ticketAuthStatus;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Long ticketPrice;

        @com.aliyun.core.annotation.NameInMap("ticket_status")
        private String ticketStatus;

        private Tickets(Builder builder) {
            this.channel = builder.channel;
            this.journeyTitle = builder.journeyTitle;
            this.openTicketStatus = builder.openTicketStatus;
            this.pcc = builder.pcc;
            this.segmentOpenTicketList = builder.segmentOpenTicketList;
            this.ticketAuthMemo = builder.ticketAuthMemo;
            this.ticketAuthStatus = builder.ticketAuthStatus;
            this.ticketNo = builder.ticketNo;
            this.ticketPrice = builder.ticketPrice;
            this.ticketStatus = builder.ticketStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tickets create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return journeyTitle
         */
        public String getJourneyTitle() {
            return this.journeyTitle;
        }

        /**
         * @return openTicketStatus
         */
        public String getOpenTicketStatus() {
            return this.openTicketStatus;
        }

        /**
         * @return pcc
         */
        public String getPcc() {
            return this.pcc;
        }

        /**
         * @return segmentOpenTicketList
         */
        public java.util.List<SegmentOpenTicketList> getSegmentOpenTicketList() {
            return this.segmentOpenTicketList;
        }

        /**
         * @return ticketAuthMemo
         */
        public String getTicketAuthMemo() {
            return this.ticketAuthMemo;
        }

        /**
         * @return ticketAuthStatus
         */
        public Integer getTicketAuthStatus() {
            return this.ticketAuthStatus;
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
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return ticketStatus
         */
        public String getTicketStatus() {
            return this.ticketStatus;
        }

        public static final class Builder {
            private String channel; 
            private String journeyTitle; 
            private String openTicketStatus; 
            private String pcc; 
            private java.util.List<SegmentOpenTicketList> segmentOpenTicketList; 
            private String ticketAuthMemo; 
            private Integer ticketAuthStatus; 
            private String ticketNo; 
            private Long ticketPrice; 
            private String ticketStatus; 

            /**
             * channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * journey_title.
             */
            public Builder journeyTitle(String journeyTitle) {
                this.journeyTitle = journeyTitle;
                return this;
            }

            /**
             * open_ticket_status.
             */
            public Builder openTicketStatus(String openTicketStatus) {
                this.openTicketStatus = openTicketStatus;
                return this;
            }

            /**
             * <p>pcc/office</p>
             * 
             * <strong>example:</strong>
             * <p>pcc/office</p>
             */
            public Builder pcc(String pcc) {
                this.pcc = pcc;
                return this;
            }

            /**
             * segment_open_ticket_list.
             */
            public Builder segmentOpenTicketList(java.util.List<SegmentOpenTicketList> segmentOpenTicketList) {
                this.segmentOpenTicketList = segmentOpenTicketList;
                return this;
            }

            /**
             * ticket_auth_memo.
             */
            public Builder ticketAuthMemo(String ticketAuthMemo) {
                this.ticketAuthMemo = ticketAuthMemo;
                return this;
            }

            /**
             * ticket_auth_status.
             */
            public Builder ticketAuthStatus(Integer ticketAuthStatus) {
                this.ticketAuthStatus = ticketAuthStatus;
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
            public Builder ticketPrice(Long ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * ticket_status.
             */
            public Builder ticketStatus(String ticketStatus) {
                this.ticketStatus = ticketStatus;
                return this;
            }

            public Tickets build() {
                return new Tickets(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderDetailV2ResponseBody</p>
     */
    public static class PassengerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birthday")
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("btrip_user_id")
        private String btripUserId;

        @com.aliyun.core.annotation.NameInMap("code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("country_code")
        private String countryCode;

        @com.aliyun.core.annotation.NameInMap("credential")
        private Credential credential;

        @com.aliyun.core.annotation.NameInMap("credentials")
        private java.util.List<Credentials> credentials;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("en_first_name")
        private String enFirstName;

        @com.aliyun.core.annotation.NameInMap("en_last_name")
        private String enLastName;

        @com.aliyun.core.annotation.NameInMap("english_name")
        private String englishName;

        @com.aliyun.core.annotation.NameInMap("gender")
        private Integer gender;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("is_complete")
        private Boolean isComplete;

        @com.aliyun.core.annotation.NameInMap("is_frequently")
        private Boolean isFrequently;

        @com.aliyun.core.annotation.NameInMap("memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("mobile_country_code")
        private String mobileCountryCode;

        @com.aliyun.core.annotation.NameInMap("mobile_phone_number")
        private String mobilePhoneNumber;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("oneself")
        private Boolean oneself;

        @com.aliyun.core.annotation.NameInMap("order_name")
        private String orderName;

        @com.aliyun.core.annotation.NameInMap("out_passenger_id")
        private String outPassengerId;

        @com.aliyun.core.annotation.NameInMap("phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("sheng_pi_pinyin")
        private String shengPiPinyin;

        @com.aliyun.core.annotation.NameInMap("ticket_nos")
        private java.util.List<String> ticketNos;

        @com.aliyun.core.annotation.NameInMap("tickets")
        private java.util.List<Tickets> tickets;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private PassengerList(Builder builder) {
            this.birthday = builder.birthday;
            this.btripUserId = builder.btripUserId;
            this.code = builder.code;
            this.country = builder.country;
            this.countryCode = builder.countryCode;
            this.credential = builder.credential;
            this.credentials = builder.credentials;
            this.email = builder.email;
            this.enFirstName = builder.enFirstName;
            this.enLastName = builder.enLastName;
            this.englishName = builder.englishName;
            this.gender = builder.gender;
            this.id = builder.id;
            this.isComplete = builder.isComplete;
            this.isFrequently = builder.isFrequently;
            this.memo = builder.memo;
            this.mobileCountryCode = builder.mobileCountryCode;
            this.mobilePhoneNumber = builder.mobilePhoneNumber;
            this.name = builder.name;
            this.oneself = builder.oneself;
            this.orderName = builder.orderName;
            this.outPassengerId = builder.outPassengerId;
            this.phone = builder.phone;
            this.shengPiPinyin = builder.shengPiPinyin;
            this.ticketNos = builder.ticketNos;
            this.tickets = builder.tickets;
            this.type = builder.type;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerList create() {
            return builder().build();
        }

        /**
         * @return birthday
         */
        public String getBirthday() {
            return this.birthday;
        }

        /**
         * @return btripUserId
         */
        public String getBtripUserId() {
            return this.btripUserId;
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return countryCode
         */
        public String getCountryCode() {
            return this.countryCode;
        }

        /**
         * @return credential
         */
        public Credential getCredential() {
            return this.credential;
        }

        /**
         * @return credentials
         */
        public java.util.List<Credentials> getCredentials() {
            return this.credentials;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return enFirstName
         */
        public String getEnFirstName() {
            return this.enFirstName;
        }

        /**
         * @return enLastName
         */
        public String getEnLastName() {
            return this.enLastName;
        }

        /**
         * @return englishName
         */
        public String getEnglishName() {
            return this.englishName;
        }

        /**
         * @return gender
         */
        public Integer getGender() {
            return this.gender;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isComplete
         */
        public Boolean getIsComplete() {
            return this.isComplete;
        }

        /**
         * @return isFrequently
         */
        public Boolean getIsFrequently() {
            return this.isFrequently;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return mobileCountryCode
         */
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        /**
         * @return mobilePhoneNumber
         */
        public String getMobilePhoneNumber() {
            return this.mobilePhoneNumber;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return oneself
         */
        public Boolean getOneself() {
            return this.oneself;
        }

        /**
         * @return orderName
         */
        public String getOrderName() {
            return this.orderName;
        }

        /**
         * @return outPassengerId
         */
        public String getOutPassengerId() {
            return this.outPassengerId;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return shengPiPinyin
         */
        public String getShengPiPinyin() {
            return this.shengPiPinyin;
        }

        /**
         * @return ticketNos
         */
        public java.util.List<String> getTicketNos() {
            return this.ticketNos;
        }

        /**
         * @return tickets
         */
        public java.util.List<Tickets> getTickets() {
            return this.tickets;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String birthday; 
            private String btripUserId; 
            private Integer code; 
            private String country; 
            private String countryCode; 
            private Credential credential; 
            private java.util.List<Credentials> credentials; 
            private String email; 
            private String enFirstName; 
            private String enLastName; 
            private String englishName; 
            private Integer gender; 
            private String id; 
            private Boolean isComplete; 
            private Boolean isFrequently; 
            private String memo; 
            private String mobileCountryCode; 
            private String mobilePhoneNumber; 
            private String name; 
            private Boolean oneself; 
            private String orderName; 
            private String outPassengerId; 
            private String phone; 
            private String shengPiPinyin; 
            private java.util.List<String> ticketNos; 
            private java.util.List<Tickets> tickets; 
            private Integer type; 
            private String userId; 

            /**
             * birthday.
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * btrip_user_id.
             */
            public Builder btripUserId(String btripUserId) {
                this.btripUserId = btripUserId;
                return this;
            }

            /**
             * code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * country_code.
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * credential.
             */
            public Builder credential(Credential credential) {
                this.credential = credential;
                return this;
            }

            /**
             * credentials.
             */
            public Builder credentials(java.util.List<Credentials> credentials) {
                this.credentials = credentials;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * en_first_name.
             */
            public Builder enFirstName(String enFirstName) {
                this.enFirstName = enFirstName;
                return this;
            }

            /**
             * en_last_name.
             */
            public Builder enLastName(String enLastName) {
                this.enLastName = enLastName;
                return this;
            }

            /**
             * english_name.
             */
            public Builder englishName(String englishName) {
                this.englishName = englishName;
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
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * is_complete.
             */
            public Builder isComplete(Boolean isComplete) {
                this.isComplete = isComplete;
                return this;
            }

            /**
             * is_frequently.
             */
            public Builder isFrequently(Boolean isFrequently) {
                this.isFrequently = isFrequently;
                return this;
            }

            /**
             * memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
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
             * mobile_phone_number.
             */
            public Builder mobilePhoneNumber(String mobilePhoneNumber) {
                this.mobilePhoneNumber = mobilePhoneNumber;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * oneself.
             */
            public Builder oneself(Boolean oneself) {
                this.oneself = oneself;
                return this;
            }

            /**
             * order_name.
             */
            public Builder orderName(String orderName) {
                this.orderName = orderName;
                return this;
            }

            /**
             * out_passenger_id.
             */
            public Builder outPassengerId(String outPassengerId) {
                this.outPassengerId = outPassengerId;
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
             * sheng_pi_pinyin.
             */
            public Builder shengPiPinyin(String shengPiPinyin) {
                this.shengPiPinyin = shengPiPinyin;
                return this;
            }

            /**
             * ticket_nos.
             */
            public Builder ticketNos(java.util.List<String> ticketNos) {
                this.ticketNos = ticketNos;
                return this;
            }

            /**
             * tickets.
             */
            public Builder tickets(java.util.List<Tickets> tickets) {
                this.tickets = tickets;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public PassengerList build() {
                return new PassengerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderDetailV2ResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("b2g_vip_code")
        private String b2gVipCode;

        @com.aliyun.core.annotation.NameInMap("book_succ_time")
        private String bookSuccTime;

        @com.aliyun.core.annotation.NameInMap("book_user_id")
        private String bookUserId;

        @com.aliyun.core.annotation.NameInMap("book_user_name")
        private String bookUserName;

        @com.aliyun.core.annotation.NameInMap("build_price")
        private Long buildPrice;

        @com.aliyun.core.annotation.NameInMap("contact_info_d_t_o")
        private ContactInfoDTO contactInfoDTO;

        @com.aliyun.core.annotation.NameInMap("create_time")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("facevalue")
        private Long facevalue;

        @com.aliyun.core.annotation.NameInMap("flight_tale_info_d_t_o")
        private FlightTaleInfoDTO flightTaleInfoDTO;

        @com.aliyun.core.annotation.NameInMap("is_protocol")
        private Boolean isProtocol;

        @com.aliyun.core.annotation.NameInMap("isemergency")
        private Boolean isemergency;

        @com.aliyun.core.annotation.NameInMap("issendmessage")
        private Boolean issendmessage;

        @com.aliyun.core.annotation.NameInMap("oil_price")
        private Long oilPrice;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("order_price")
        private Long orderPrice;

        @com.aliyun.core.annotation.NameInMap("out_order_id")
        private String outOrderId;

        @com.aliyun.core.annotation.NameInMap("passenger_list")
        private java.util.List<PassengerList> passengerList;

        @com.aliyun.core.annotation.NameInMap("passenger_segment_map")
        private java.util.Map<String, String> passengerSegmentMap;

        @com.aliyun.core.annotation.NameInMap("pay_time")
        private String payTime;

        @com.aliyun.core.annotation.NameInMap("saleprice")
        private Long saleprice;

        @com.aliyun.core.annotation.NameInMap("sendcpsms")
        private Boolean sendcpsms;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("total_service_fee_price")
        private Long totalServiceFeePrice;

        private Module(Builder builder) {
            this.b2gVipCode = builder.b2gVipCode;
            this.bookSuccTime = builder.bookSuccTime;
            this.bookUserId = builder.bookUserId;
            this.bookUserName = builder.bookUserName;
            this.buildPrice = builder.buildPrice;
            this.contactInfoDTO = builder.contactInfoDTO;
            this.createTime = builder.createTime;
            this.facevalue = builder.facevalue;
            this.flightTaleInfoDTO = builder.flightTaleInfoDTO;
            this.isProtocol = builder.isProtocol;
            this.isemergency = builder.isemergency;
            this.issendmessage = builder.issendmessage;
            this.oilPrice = builder.oilPrice;
            this.orderId = builder.orderId;
            this.orderPrice = builder.orderPrice;
            this.outOrderId = builder.outOrderId;
            this.passengerList = builder.passengerList;
            this.passengerSegmentMap = builder.passengerSegmentMap;
            this.payTime = builder.payTime;
            this.saleprice = builder.saleprice;
            this.sendcpsms = builder.sendcpsms;
            this.status = builder.status;
            this.totalServiceFeePrice = builder.totalServiceFeePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return b2gVipCode
         */
        public String getB2gVipCode() {
            return this.b2gVipCode;
        }

        /**
         * @return bookSuccTime
         */
        public String getBookSuccTime() {
            return this.bookSuccTime;
        }

        /**
         * @return bookUserId
         */
        public String getBookUserId() {
            return this.bookUserId;
        }

        /**
         * @return bookUserName
         */
        public String getBookUserName() {
            return this.bookUserName;
        }

        /**
         * @return buildPrice
         */
        public Long getBuildPrice() {
            return this.buildPrice;
        }

        /**
         * @return contactInfoDTO
         */
        public ContactInfoDTO getContactInfoDTO() {
            return this.contactInfoDTO;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return facevalue
         */
        public Long getFacevalue() {
            return this.facevalue;
        }

        /**
         * @return flightTaleInfoDTO
         */
        public FlightTaleInfoDTO getFlightTaleInfoDTO() {
            return this.flightTaleInfoDTO;
        }

        /**
         * @return isProtocol
         */
        public Boolean getIsProtocol() {
            return this.isProtocol;
        }

        /**
         * @return isemergency
         */
        public Boolean getIsemergency() {
            return this.isemergency;
        }

        /**
         * @return issendmessage
         */
        public Boolean getIssendmessage() {
            return this.issendmessage;
        }

        /**
         * @return oilPrice
         */
        public Long getOilPrice() {
            return this.oilPrice;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderPrice
         */
        public Long getOrderPrice() {
            return this.orderPrice;
        }

        /**
         * @return outOrderId
         */
        public String getOutOrderId() {
            return this.outOrderId;
        }

        /**
         * @return passengerList
         */
        public java.util.List<PassengerList> getPassengerList() {
            return this.passengerList;
        }

        /**
         * @return passengerSegmentMap
         */
        public java.util.Map<String, String> getPassengerSegmentMap() {
            return this.passengerSegmentMap;
        }

        /**
         * @return payTime
         */
        public String getPayTime() {
            return this.payTime;
        }

        /**
         * @return saleprice
         */
        public Long getSaleprice() {
            return this.saleprice;
        }

        /**
         * @return sendcpsms
         */
        public Boolean getSendcpsms() {
            return this.sendcpsms;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return totalServiceFeePrice
         */
        public Long getTotalServiceFeePrice() {
            return this.totalServiceFeePrice;
        }

        public static final class Builder {
            private String b2gVipCode; 
            private String bookSuccTime; 
            private String bookUserId; 
            private String bookUserName; 
            private Long buildPrice; 
            private ContactInfoDTO contactInfoDTO; 
            private String createTime; 
            private Long facevalue; 
            private FlightTaleInfoDTO flightTaleInfoDTO; 
            private Boolean isProtocol; 
            private Boolean isemergency; 
            private Boolean issendmessage; 
            private Long oilPrice; 
            private Long orderId; 
            private Long orderPrice; 
            private String outOrderId; 
            private java.util.List<PassengerList> passengerList; 
            private java.util.Map<String, String> passengerSegmentMap; 
            private String payTime; 
            private Long saleprice; 
            private Boolean sendcpsms; 
            private Integer status; 
            private Long totalServiceFeePrice; 

            /**
             * b2g_vip_code.
             */
            public Builder b2gVipCode(String b2gVipCode) {
                this.b2gVipCode = b2gVipCode;
                return this;
            }

            /**
             * book_succ_time.
             */
            public Builder bookSuccTime(String bookSuccTime) {
                this.bookSuccTime = bookSuccTime;
                return this;
            }

            /**
             * book_user_id.
             */
            public Builder bookUserId(String bookUserId) {
                this.bookUserId = bookUserId;
                return this;
            }

            /**
             * book_user_name.
             */
            public Builder bookUserName(String bookUserName) {
                this.bookUserName = bookUserName;
                return this;
            }

            /**
             * build_price.
             */
            public Builder buildPrice(Long buildPrice) {
                this.buildPrice = buildPrice;
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
             * create_time.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * facevalue.
             */
            public Builder facevalue(Long facevalue) {
                this.facevalue = facevalue;
                return this;
            }

            /**
             * flight_tale_info_d_t_o.
             */
            public Builder flightTaleInfoDTO(FlightTaleInfoDTO flightTaleInfoDTO) {
                this.flightTaleInfoDTO = flightTaleInfoDTO;
                return this;
            }

            /**
             * is_protocol.
             */
            public Builder isProtocol(Boolean isProtocol) {
                this.isProtocol = isProtocol;
                return this;
            }

            /**
             * isemergency.
             */
            public Builder isemergency(Boolean isemergency) {
                this.isemergency = isemergency;
                return this;
            }

            /**
             * issendmessage.
             */
            public Builder issendmessage(Boolean issendmessage) {
                this.issendmessage = issendmessage;
                return this;
            }

            /**
             * oil_price.
             */
            public Builder oilPrice(Long oilPrice) {
                this.oilPrice = oilPrice;
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
             * order_price.
             */
            public Builder orderPrice(Long orderPrice) {
                this.orderPrice = orderPrice;
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
             * passenger_list.
             */
            public Builder passengerList(java.util.List<PassengerList> passengerList) {
                this.passengerList = passengerList;
                return this;
            }

            /**
             * <p>key :passengerId</p>
             * <p>value :segmentId</p>
             */
            public Builder passengerSegmentMap(java.util.Map<String, String> passengerSegmentMap) {
                this.passengerSegmentMap = passengerSegmentMap;
                return this;
            }

            /**
             * pay_time.
             */
            public Builder payTime(String payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * saleprice.
             */
            public Builder saleprice(Long saleprice) {
                this.saleprice = saleprice;
                return this;
            }

            /**
             * sendcpsms.
             */
            public Builder sendcpsms(Boolean sendcpsms) {
                this.sendcpsms = sendcpsms;
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
             * total_service_fee_price.
             */
            public Builder totalServiceFeePrice(Long totalServiceFeePrice) {
                this.totalServiceFeePrice = totalServiceFeePrice;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
