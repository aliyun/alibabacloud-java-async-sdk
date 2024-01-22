// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>OrderDetailResponseBody</p>
 */
public class OrderDetailResponseBody extends TeaModel {
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

    private OrderDetailResponseBody(Builder builder) {
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

    public static OrderDetailResponseBody create() {
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

        public OrderDetailResponseBody build() {
            return new OrderDetailResponseBody(this);
        } 

    } 

    public static class BaggageAncillary extends TeaModel {
        @NameInMap("baggage_amount")
        private Integer baggageAmount;

        @NameInMap("baggage_weight")
        private Integer baggageWeight;

        @NameInMap("baggage_weight_unit")
        private String baggageWeightUnit;

        @NameInMap("is_all_weight")
        private Boolean isAllWeight;

        @NameInMap("price")
        private Double price;

        private BaggageAncillary(Builder builder) {
            this.baggageAmount = builder.baggageAmount;
            this.baggageWeight = builder.baggageWeight;
            this.baggageWeightUnit = builder.baggageWeightUnit;
            this.isAllWeight = builder.isAllWeight;
            this.price = builder.price;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaggageAncillary create() {
            return builder().build();
        }

        /**
         * @return baggageAmount
         */
        public Integer getBaggageAmount() {
            return this.baggageAmount;
        }

        /**
         * @return baggageWeight
         */
        public Integer getBaggageWeight() {
            return this.baggageWeight;
        }

        /**
         * @return baggageWeightUnit
         */
        public String getBaggageWeightUnit() {
            return this.baggageWeightUnit;
        }

        /**
         * @return isAllWeight
         */
        public Boolean getIsAllWeight() {
            return this.isAllWeight;
        }

        /**
         * @return price
         */
        public Double getPrice() {
            return this.price;
        }

        public static final class Builder {
            private Integer baggageAmount; 
            private Integer baggageWeight; 
            private String baggageWeightUnit; 
            private Boolean isAllWeight; 
            private Double price; 

            /**
             * baggage_amount.
             */
            public Builder baggageAmount(Integer baggageAmount) {
                this.baggageAmount = baggageAmount;
                return this;
            }

            /**
             * baggage_weight.
             */
            public Builder baggageWeight(Integer baggageWeight) {
                this.baggageWeight = baggageWeight;
                return this;
            }

            /**
             * baggage_weight_unit.
             */
            public Builder baggageWeightUnit(String baggageWeightUnit) {
                this.baggageWeightUnit = baggageWeightUnit;
                return this;
            }

            /**
             * is_all_weight.
             */
            public Builder isAllWeight(Boolean isAllWeight) {
                this.isAllWeight = isAllWeight;
                return this;
            }

            /**
             * price.
             */
            public Builder price(Double price) {
                this.price = price;
                return this;
            }

            public BaggageAncillary build() {
                return new BaggageAncillary(this);
            } 

        } 

    }
    public static class Ancillary extends TeaModel {
        @NameInMap("ancillary_id")
        private String ancillaryId;

        @NameInMap("ancillary_type")
        private Integer ancillaryType;

        @NameInMap("baggage_ancillary")
        private BaggageAncillary baggageAncillary;

        private Ancillary(Builder builder) {
            this.ancillaryId = builder.ancillaryId;
            this.ancillaryType = builder.ancillaryType;
            this.baggageAncillary = builder.baggageAncillary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ancillary create() {
            return builder().build();
        }

        /**
         * @return ancillaryId
         */
        public String getAncillaryId() {
            return this.ancillaryId;
        }

        /**
         * @return ancillaryType
         */
        public Integer getAncillaryType() {
            return this.ancillaryType;
        }

        /**
         * @return baggageAncillary
         */
        public BaggageAncillary getBaggageAncillary() {
            return this.baggageAncillary;
        }

        public static final class Builder {
            private String ancillaryId; 
            private Integer ancillaryType; 
            private BaggageAncillary baggageAncillary; 

            /**
             * ancillary_id.
             */
            public Builder ancillaryId(String ancillaryId) {
                this.ancillaryId = ancillaryId;
                return this;
            }

            /**
             * ancillary_type.
             */
            public Builder ancillaryType(Integer ancillaryType) {
                this.ancillaryType = ancillaryType;
                return this;
            }

            /**
             * baggage_ancillary.
             */
            public Builder baggageAncillary(BaggageAncillary baggageAncillary) {
                this.baggageAncillary = baggageAncillary;
                return this;
            }

            public Ancillary build() {
                return new Ancillary(this);
            } 

        } 

    }
    public static class Credential extends TeaModel {
        @NameInMap("cert_issue_place")
        private String certIssuePlace;

        @NameInMap("credential_num")
        private String credentialNum;

        @NameInMap("credential_type")
        private Integer credentialType;

        @NameInMap("expire_date")
        private String expireDate;

        private Credential(Builder builder) {
            this.certIssuePlace = builder.certIssuePlace;
            this.credentialNum = builder.credentialNum;
            this.credentialType = builder.credentialType;
            this.expireDate = builder.expireDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credential create() {
            return builder().build();
        }

        /**
         * @return certIssuePlace
         */
        public String getCertIssuePlace() {
            return this.certIssuePlace;
        }

        /**
         * @return credentialNum
         */
        public String getCredentialNum() {
            return this.credentialNum;
        }

        /**
         * @return credentialType
         */
        public Integer getCredentialType() {
            return this.credentialType;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        public static final class Builder {
            private String certIssuePlace; 
            private String credentialNum; 
            private Integer credentialType; 
            private String expireDate; 

            /**
             * cert_issue_place.
             */
            public Builder certIssuePlace(String certIssuePlace) {
                this.certIssuePlace = certIssuePlace;
                return this;
            }

            /**
             * credential_num.
             */
            public Builder credentialNum(String credentialNum) {
                this.credentialNum = credentialNum;
                return this;
            }

            /**
             * credential_type.
             */
            public Builder credentialType(Integer credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * expire_date.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            public Credential build() {
                return new Credential(this);
            } 

        } 

    }
    public static class Passenger extends TeaModel {
        @NameInMap("birthday")
        private String birthday;

        @NameInMap("credential")
        private Credential credential;

        @NameInMap("first_name")
        private String firstName;

        @NameInMap("gender")
        private Integer gender;

        @NameInMap("last_name")
        private String lastName;

        @NameInMap("mobile_country_code")
        private String mobileCountryCode;

        @NameInMap("mobile_phone_number")
        private String mobilePhoneNumber;

        @NameInMap("nationality")
        private String nationality;

        @NameInMap("type")
        private Integer type;

        private Passenger(Builder builder) {
            this.birthday = builder.birthday;
            this.credential = builder.credential;
            this.firstName = builder.firstName;
            this.gender = builder.gender;
            this.lastName = builder.lastName;
            this.mobileCountryCode = builder.mobileCountryCode;
            this.mobilePhoneNumber = builder.mobilePhoneNumber;
            this.nationality = builder.nationality;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Passenger create() {
            return builder().build();
        }

        /**
         * @return birthday
         */
        public String getBirthday() {
            return this.birthday;
        }

        /**
         * @return credential
         */
        public Credential getCredential() {
            return this.credential;
        }

        /**
         * @return firstName
         */
        public String getFirstName() {
            return this.firstName;
        }

        /**
         * @return gender
         */
        public Integer getGender() {
            return this.gender;
        }

        /**
         * @return lastName
         */
        public String getLastName() {
            return this.lastName;
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
         * @return nationality
         */
        public String getNationality() {
            return this.nationality;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String birthday; 
            private Credential credential; 
            private String firstName; 
            private Integer gender; 
            private String lastName; 
            private String mobileCountryCode; 
            private String mobilePhoneNumber; 
            private String nationality; 
            private Integer type; 

            /**
             * birthday.
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
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
             * first_name.
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
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
             * last_name.
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
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
             * nationality.
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Passenger build() {
                return new Passenger(this);
            } 

        } 

    }
    public static class AncillaryItemDetailList extends TeaModel {
        @NameInMap("ancillary")
        private Ancillary ancillary;

        @NameInMap("passenger")
        private Passenger passenger;

        @NameInMap("segment_id_list")
        private java.util.List < String > segmentIdList;

        private AncillaryItemDetailList(Builder builder) {
            this.ancillary = builder.ancillary;
            this.passenger = builder.passenger;
            this.segmentIdList = builder.segmentIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AncillaryItemDetailList create() {
            return builder().build();
        }

        /**
         * @return ancillary
         */
        public Ancillary getAncillary() {
            return this.ancillary;
        }

        /**
         * @return passenger
         */
        public Passenger getPassenger() {
            return this.passenger;
        }

        /**
         * @return segmentIdList
         */
        public java.util.List < String > getSegmentIdList() {
            return this.segmentIdList;
        }

        public static final class Builder {
            private Ancillary ancillary; 
            private Passenger passenger; 
            private java.util.List < String > segmentIdList; 

            /**
             * ancillary.
             */
            public Builder ancillary(Ancillary ancillary) {
                this.ancillary = ancillary;
                return this;
            }

            /**
             * passenger.
             */
            public Builder passenger(Passenger passenger) {
                this.passenger = passenger;
                return this;
            }

            /**
             * segment_id_list.
             */
            public Builder segmentIdList(java.util.List < String > segmentIdList) {
                this.segmentIdList = segmentIdList;
                return this;
            }

            public AncillaryItemDetailList build() {
                return new AncillaryItemDetailList(this);
            } 

        } 

    }
    public static class FlightPrice extends TeaModel {
        @NameInMap("sell_price")
        private Double sellPrice;

        @NameInMap("tax")
        private Double tax;

        private FlightPrice(Builder builder) {
            this.sellPrice = builder.sellPrice;
            this.tax = builder.tax;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightPrice create() {
            return builder().build();
        }

        /**
         * @return sellPrice
         */
        public Double getSellPrice() {
            return this.sellPrice;
        }

        /**
         * @return tax
         */
        public Double getTax() {
            return this.tax;
        }

        public static final class Builder {
            private Double sellPrice; 
            private Double tax; 

            /**
             * sell_price.
             */
            public Builder sellPrice(Double sellPrice) {
                this.sellPrice = sellPrice;
                return this;
            }

            /**
             * tax.
             */
            public Builder tax(Double tax) {
                this.tax = tax;
                return this;
            }

            public FlightPrice build() {
                return new FlightPrice(this);
            } 

        } 

    }
    public static class FlightSegmentCabinRelation extends TeaModel {
        @NameInMap("cabin")
        private String cabin;

        @NameInMap("cabin_class")
        private String cabinClass;

        @NameInMap("cabin_class_name")
        private String cabinClassName;

        @NameInMap("cabin_quantity")
        private String cabinQuantity;

        @NameInMap("segment_id")
        private String segmentId;

        private FlightSegmentCabinRelation(Builder builder) {
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.cabinClassName = builder.cabinClassName;
            this.cabinQuantity = builder.cabinQuantity;
            this.segmentId = builder.segmentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightSegmentCabinRelation create() {
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
         * @return cabinClassName
         */
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        /**
         * @return cabinQuantity
         */
        public String getCabinQuantity() {
            return this.cabinQuantity;
        }

        /**
         * @return segmentId
         */
        public String getSegmentId() {
            return this.segmentId;
        }

        public static final class Builder {
            private String cabin; 
            private String cabinClass; 
            private String cabinClassName; 
            private String cabinQuantity; 
            private String segmentId; 

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
             * cabin_quantity.
             */
            public Builder cabinQuantity(String cabinQuantity) {
                this.cabinQuantity = cabinQuantity;
                return this;
            }

            /**
             * segment_id.
             */
            public Builder segmentId(String segmentId) {
                this.segmentId = segmentId;
                return this;
            }

            public FlightSegmentCabinRelation build() {
                return new FlightSegmentCabinRelation(this);
            } 

        } 

    }
    public static class PassengerCredential extends TeaModel {
        @NameInMap("cert_issue_place")
        private String certIssuePlace;

        @NameInMap("credential_num")
        private String credentialNum;

        @NameInMap("credential_type")
        private Integer credentialType;

        @NameInMap("expire_date")
        private String expireDate;

        private PassengerCredential(Builder builder) {
            this.certIssuePlace = builder.certIssuePlace;
            this.credentialNum = builder.credentialNum;
            this.credentialType = builder.credentialType;
            this.expireDate = builder.expireDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerCredential create() {
            return builder().build();
        }

        /**
         * @return certIssuePlace
         */
        public String getCertIssuePlace() {
            return this.certIssuePlace;
        }

        /**
         * @return credentialNum
         */
        public String getCredentialNum() {
            return this.credentialNum;
        }

        /**
         * @return credentialType
         */
        public Integer getCredentialType() {
            return this.credentialType;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        public static final class Builder {
            private String certIssuePlace; 
            private String credentialNum; 
            private Integer credentialType; 
            private String expireDate; 

            /**
             * cert_issue_place.
             */
            public Builder certIssuePlace(String certIssuePlace) {
                this.certIssuePlace = certIssuePlace;
                return this;
            }

            /**
             * credential_num.
             */
            public Builder credentialNum(String credentialNum) {
                this.credentialNum = credentialNum;
                return this;
            }

            /**
             * credential_type.
             */
            public Builder credentialType(Integer credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * expire_date.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            public PassengerCredential build() {
                return new PassengerCredential(this);
            } 

        } 

    }
    public static class FlightItemDetailListPassenger extends TeaModel {
        @NameInMap("birthday")
        private String birthday;

        @NameInMap("credential")
        private PassengerCredential credential;

        @NameInMap("first_name")
        private String firstName;

        @NameInMap("gender")
        private Integer gender;

        @NameInMap("last_name")
        private String lastName;

        @NameInMap("mobile_country_code")
        private String mobileCountryCode;

        @NameInMap("mobile_phone_number")
        private String mobilePhoneNumber;

        @NameInMap("nationality")
        private String nationality;

        @NameInMap("type")
        private Integer type;

        private FlightItemDetailListPassenger(Builder builder) {
            this.birthday = builder.birthday;
            this.credential = builder.credential;
            this.firstName = builder.firstName;
            this.gender = builder.gender;
            this.lastName = builder.lastName;
            this.mobileCountryCode = builder.mobileCountryCode;
            this.mobilePhoneNumber = builder.mobilePhoneNumber;
            this.nationality = builder.nationality;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightItemDetailListPassenger create() {
            return builder().build();
        }

        /**
         * @return birthday
         */
        public String getBirthday() {
            return this.birthday;
        }

        /**
         * @return credential
         */
        public PassengerCredential getCredential() {
            return this.credential;
        }

        /**
         * @return firstName
         */
        public String getFirstName() {
            return this.firstName;
        }

        /**
         * @return gender
         */
        public Integer getGender() {
            return this.gender;
        }

        /**
         * @return lastName
         */
        public String getLastName() {
            return this.lastName;
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
         * @return nationality
         */
        public String getNationality() {
            return this.nationality;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String birthday; 
            private PassengerCredential credential; 
            private String firstName; 
            private Integer gender; 
            private String lastName; 
            private String mobileCountryCode; 
            private String mobilePhoneNumber; 
            private String nationality; 
            private Integer type; 

            /**
             * birthday.
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * credential.
             */
            public Builder credential(PassengerCredential credential) {
                this.credential = credential;
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
             * gender.
             */
            public Builder gender(Integer gender) {
                this.gender = gender;
                return this;
            }

            /**
             * last_name.
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
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
             * nationality.
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public FlightItemDetailListPassenger build() {
                return new FlightItemDetailListPassenger(this);
            } 

        } 

    }
    public static class FlightItemDetailList extends TeaModel {
        @NameInMap("b_pnr_list")
        private java.util.List < String > bPnrList;

        @NameInMap("c_pnr_list")
        private java.util.List < String > cPnrList;

        @NameInMap("flight_price")
        private FlightPrice flightPrice;

        @NameInMap("flight_segment_cabin_relation")
        private java.util.List < FlightSegmentCabinRelation> flightSegmentCabinRelation;

        @NameInMap("passenger")
        private FlightItemDetailListPassenger passenger;

        @NameInMap("ticket_air_line")
        private String ticketAirLine;

        @NameInMap("ticket_nos")
        private java.util.List < String > ticketNos;

        private FlightItemDetailList(Builder builder) {
            this.bPnrList = builder.bPnrList;
            this.cPnrList = builder.cPnrList;
            this.flightPrice = builder.flightPrice;
            this.flightSegmentCabinRelation = builder.flightSegmentCabinRelation;
            this.passenger = builder.passenger;
            this.ticketAirLine = builder.ticketAirLine;
            this.ticketNos = builder.ticketNos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightItemDetailList create() {
            return builder().build();
        }

        /**
         * @return bPnrList
         */
        public java.util.List < String > getBPnrList() {
            return this.bPnrList;
        }

        /**
         * @return cPnrList
         */
        public java.util.List < String > getCPnrList() {
            return this.cPnrList;
        }

        /**
         * @return flightPrice
         */
        public FlightPrice getFlightPrice() {
            return this.flightPrice;
        }

        /**
         * @return flightSegmentCabinRelation
         */
        public java.util.List < FlightSegmentCabinRelation> getFlightSegmentCabinRelation() {
            return this.flightSegmentCabinRelation;
        }

        /**
         * @return passenger
         */
        public FlightItemDetailListPassenger getPassenger() {
            return this.passenger;
        }

        /**
         * @return ticketAirLine
         */
        public String getTicketAirLine() {
            return this.ticketAirLine;
        }

        /**
         * @return ticketNos
         */
        public java.util.List < String > getTicketNos() {
            return this.ticketNos;
        }

        public static final class Builder {
            private java.util.List < String > bPnrList; 
            private java.util.List < String > cPnrList; 
            private FlightPrice flightPrice; 
            private java.util.List < FlightSegmentCabinRelation> flightSegmentCabinRelation; 
            private FlightItemDetailListPassenger passenger; 
            private String ticketAirLine; 
            private java.util.List < String > ticketNos; 

            /**
             * b_pnr_list.
             */
            public Builder bPnrList(java.util.List < String > bPnrList) {
                this.bPnrList = bPnrList;
                return this;
            }

            /**
             * c_pnr_list.
             */
            public Builder cPnrList(java.util.List < String > cPnrList) {
                this.cPnrList = cPnrList;
                return this;
            }

            /**
             * flight_price.
             */
            public Builder flightPrice(FlightPrice flightPrice) {
                this.flightPrice = flightPrice;
                return this;
            }

            /**
             * flight_segment_cabin_relation.
             */
            public Builder flightSegmentCabinRelation(java.util.List < FlightSegmentCabinRelation> flightSegmentCabinRelation) {
                this.flightSegmentCabinRelation = flightSegmentCabinRelation;
                return this;
            }

            /**
             * passenger.
             */
            public Builder passenger(FlightItemDetailListPassenger passenger) {
                this.passenger = passenger;
                return this;
            }

            /**
             * ticket_air_line.
             */
            public Builder ticketAirLine(String ticketAirLine) {
                this.ticketAirLine = ticketAirLine;
                return this;
            }

            /**
             * ticket_nos.
             */
            public Builder ticketNos(java.util.List < String > ticketNos) {
                this.ticketNos = ticketNos;
                return this;
            }

            public FlightItemDetailList build() {
                return new FlightItemDetailList(this);
            } 

        } 

    }
    public static class PassengerListCredential extends TeaModel {
        @NameInMap("cert_issue_place")
        private String certIssuePlace;

        @NameInMap("credential_num")
        private String credentialNum;

        @NameInMap("credential_type")
        private Integer credentialType;

        @NameInMap("expire_date")
        private String expireDate;

        private PassengerListCredential(Builder builder) {
            this.certIssuePlace = builder.certIssuePlace;
            this.credentialNum = builder.credentialNum;
            this.credentialType = builder.credentialType;
            this.expireDate = builder.expireDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerListCredential create() {
            return builder().build();
        }

        /**
         * @return certIssuePlace
         */
        public String getCertIssuePlace() {
            return this.certIssuePlace;
        }

        /**
         * @return credentialNum
         */
        public String getCredentialNum() {
            return this.credentialNum;
        }

        /**
         * @return credentialType
         */
        public Integer getCredentialType() {
            return this.credentialType;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        public static final class Builder {
            private String certIssuePlace; 
            private String credentialNum; 
            private Integer credentialType; 
            private String expireDate; 

            /**
             * cert_issue_place.
             */
            public Builder certIssuePlace(String certIssuePlace) {
                this.certIssuePlace = certIssuePlace;
                return this;
            }

            /**
             * credential_num.
             */
            public Builder credentialNum(String credentialNum) {
                this.credentialNum = credentialNum;
                return this;
            }

            /**
             * credential_type.
             */
            public Builder credentialType(Integer credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * expire_date.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            public PassengerListCredential build() {
                return new PassengerListCredential(this);
            } 

        } 

    }
    public static class PassengerList extends TeaModel {
        @NameInMap("birthday")
        private String birthday;

        @NameInMap("credential")
        private PassengerListCredential credential;

        @NameInMap("first_name")
        private String firstName;

        @NameInMap("gender")
        private Integer gender;

        @NameInMap("last_name")
        private String lastName;

        @NameInMap("mobile_country_code")
        private String mobileCountryCode;

        @NameInMap("mobile_phone_number")
        private String mobilePhoneNumber;

        @NameInMap("nationality")
        private String nationality;

        @NameInMap("type")
        private Integer type;

        private PassengerList(Builder builder) {
            this.birthday = builder.birthday;
            this.credential = builder.credential;
            this.firstName = builder.firstName;
            this.gender = builder.gender;
            this.lastName = builder.lastName;
            this.mobileCountryCode = builder.mobileCountryCode;
            this.mobilePhoneNumber = builder.mobilePhoneNumber;
            this.nationality = builder.nationality;
            this.type = builder.type;
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
         * @return credential
         */
        public PassengerListCredential getCredential() {
            return this.credential;
        }

        /**
         * @return firstName
         */
        public String getFirstName() {
            return this.firstName;
        }

        /**
         * @return gender
         */
        public Integer getGender() {
            return this.gender;
        }

        /**
         * @return lastName
         */
        public String getLastName() {
            return this.lastName;
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
         * @return nationality
         */
        public String getNationality() {
            return this.nationality;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String birthday; 
            private PassengerListCredential credential; 
            private String firstName; 
            private Integer gender; 
            private String lastName; 
            private String mobileCountryCode; 
            private String mobilePhoneNumber; 
            private String nationality; 
            private Integer type; 

            /**
             * birthday.
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * credential.
             */
            public Builder credential(PassengerListCredential credential) {
                this.credential = credential;
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
             * gender.
             */
            public Builder gender(Integer gender) {
                this.gender = gender;
                return this;
            }

            /**
             * last_name.
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
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
             * nationality.
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public PassengerList build() {
                return new PassengerList(this);
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

            public Solution build() {
                return new Solution(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ancillary_item_detail_list")
        private java.util.List < AncillaryItemDetailList> ancillaryItemDetailList;

        @NameInMap("baggage_allowance_map")
        private java.util.Map < String, DataBaggageAllowanceMapValue > baggageAllowanceMap;

        @NameInMap("book_time")
        private Long bookTime;

        @NameInMap("flight_item_detail_list")
        private java.util.List < FlightItemDetailList> flightItemDetailList;

        @NameInMap("order_num")
        private Long orderNum;

        @NameInMap("order_status")
        private Integer orderStatus;

        @NameInMap("out_order_num")
        private String outOrderNum;

        @NameInMap("passenger_list")
        private java.util.List < PassengerList> passengerList;

        @NameInMap("pay_status")
        private Integer payStatus;

        @NameInMap("pay_time")
        private Long payTime;

        @NameInMap("promotion_price")
        private Double promotionPrice;

        @NameInMap("real_pay_price")
        private Double realPayPrice;

        @NameInMap("refund_change_rule_map")
        private java.util.Map < String, DataRefundChangeRuleMapValue > refundChangeRuleMap;

        @NameInMap("session_nick")
        private String sessionNick;

        @NameInMap("solution")
        private Solution solution;

        @NameInMap("succeed_time")
        private Long succeedTime;

        @NameInMap("total_price")
        private Double totalPrice;

        @NameInMap("transaction_no")
        private String transactionNo;

        private Data(Builder builder) {
            this.ancillaryItemDetailList = builder.ancillaryItemDetailList;
            this.baggageAllowanceMap = builder.baggageAllowanceMap;
            this.bookTime = builder.bookTime;
            this.flightItemDetailList = builder.flightItemDetailList;
            this.orderNum = builder.orderNum;
            this.orderStatus = builder.orderStatus;
            this.outOrderNum = builder.outOrderNum;
            this.passengerList = builder.passengerList;
            this.payStatus = builder.payStatus;
            this.payTime = builder.payTime;
            this.promotionPrice = builder.promotionPrice;
            this.realPayPrice = builder.realPayPrice;
            this.refundChangeRuleMap = builder.refundChangeRuleMap;
            this.sessionNick = builder.sessionNick;
            this.solution = builder.solution;
            this.succeedTime = builder.succeedTime;
            this.totalPrice = builder.totalPrice;
            this.transactionNo = builder.transactionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ancillaryItemDetailList
         */
        public java.util.List < AncillaryItemDetailList> getAncillaryItemDetailList() {
            return this.ancillaryItemDetailList;
        }

        /**
         * @return baggageAllowanceMap
         */
        public java.util.Map < String, DataBaggageAllowanceMapValue > getBaggageAllowanceMap() {
            return this.baggageAllowanceMap;
        }

        /**
         * @return bookTime
         */
        public Long getBookTime() {
            return this.bookTime;
        }

        /**
         * @return flightItemDetailList
         */
        public java.util.List < FlightItemDetailList> getFlightItemDetailList() {
            return this.flightItemDetailList;
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
         * @return outOrderNum
         */
        public String getOutOrderNum() {
            return this.outOrderNum;
        }

        /**
         * @return passengerList
         */
        public java.util.List < PassengerList> getPassengerList() {
            return this.passengerList;
        }

        /**
         * @return payStatus
         */
        public Integer getPayStatus() {
            return this.payStatus;
        }

        /**
         * @return payTime
         */
        public Long getPayTime() {
            return this.payTime;
        }

        /**
         * @return promotionPrice
         */
        public Double getPromotionPrice() {
            return this.promotionPrice;
        }

        /**
         * @return realPayPrice
         */
        public Double getRealPayPrice() {
            return this.realPayPrice;
        }

        /**
         * @return refundChangeRuleMap
         */
        public java.util.Map < String, DataRefundChangeRuleMapValue > getRefundChangeRuleMap() {
            return this.refundChangeRuleMap;
        }

        /**
         * @return sessionNick
         */
        public String getSessionNick() {
            return this.sessionNick;
        }

        /**
         * @return solution
         */
        public Solution getSolution() {
            return this.solution;
        }

        /**
         * @return succeedTime
         */
        public Long getSucceedTime() {
            return this.succeedTime;
        }

        /**
         * @return totalPrice
         */
        public Double getTotalPrice() {
            return this.totalPrice;
        }

        /**
         * @return transactionNo
         */
        public String getTransactionNo() {
            return this.transactionNo;
        }

        public static final class Builder {
            private java.util.List < AncillaryItemDetailList> ancillaryItemDetailList; 
            private java.util.Map < String, DataBaggageAllowanceMapValue > baggageAllowanceMap; 
            private Long bookTime; 
            private java.util.List < FlightItemDetailList> flightItemDetailList; 
            private Long orderNum; 
            private Integer orderStatus; 
            private String outOrderNum; 
            private java.util.List < PassengerList> passengerList; 
            private Integer payStatus; 
            private Long payTime; 
            private Double promotionPrice; 
            private Double realPayPrice; 
            private java.util.Map < String, DataRefundChangeRuleMapValue > refundChangeRuleMap; 
            private String sessionNick; 
            private Solution solution; 
            private Long succeedTime; 
            private Double totalPrice; 
            private String transactionNo; 

            /**
             * ancillary_item_detail_list.
             */
            public Builder ancillaryItemDetailList(java.util.List < AncillaryItemDetailList> ancillaryItemDetailList) {
                this.ancillaryItemDetailList = ancillaryItemDetailList;
                return this;
            }

            /**
             * baggage_allowance_map.
             */
            public Builder baggageAllowanceMap(java.util.Map < String, DataBaggageAllowanceMapValue > baggageAllowanceMap) {
                this.baggageAllowanceMap = baggageAllowanceMap;
                return this;
            }

            /**
             * book_time.
             */
            public Builder bookTime(Long bookTime) {
                this.bookTime = bookTime;
                return this;
            }

            /**
             * flight_item_detail_list.
             */
            public Builder flightItemDetailList(java.util.List < FlightItemDetailList> flightItemDetailList) {
                this.flightItemDetailList = flightItemDetailList;
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
             * out_order_num.
             */
            public Builder outOrderNum(String outOrderNum) {
                this.outOrderNum = outOrderNum;
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
             * pay_status.
             */
            public Builder payStatus(Integer payStatus) {
                this.payStatus = payStatus;
                return this;
            }

            /**
             * pay_time.
             */
            public Builder payTime(Long payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * promotion_price.
             */
            public Builder promotionPrice(Double promotionPrice) {
                this.promotionPrice = promotionPrice;
                return this;
            }

            /**
             * real_pay_price.
             */
            public Builder realPayPrice(Double realPayPrice) {
                this.realPayPrice = realPayPrice;
                return this;
            }

            /**
             * refund_change_rule_map.
             */
            public Builder refundChangeRuleMap(java.util.Map < String, DataRefundChangeRuleMapValue > refundChangeRuleMap) {
                this.refundChangeRuleMap = refundChangeRuleMap;
                return this;
            }

            /**
             * session_nick.
             */
            public Builder sessionNick(String sessionNick) {
                this.sessionNick = sessionNick;
                return this;
            }

            /**
             * solution.
             */
            public Builder solution(Solution solution) {
                this.solution = solution;
                return this;
            }

            /**
             * succeed_time.
             */
            public Builder succeedTime(Long succeedTime) {
                this.succeedTime = succeedTime;
                return this;
            }

            /**
             * total_price.
             */
            public Builder totalPrice(Double totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            /**
             * transaction_no.
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
