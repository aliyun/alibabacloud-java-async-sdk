// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>OrderDetailResponseBody</p>
 */
public class OrderDetailResponseBody extends TeaModel {
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

        public OrderDetailResponseBody build() {
            return new OrderDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
    public static class BaggageAncillary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baggage_amount")
        private Integer baggageAmount;

        @com.aliyun.core.annotation.NameInMap("baggage_weight")
        private Integer baggageWeight;

        @com.aliyun.core.annotation.NameInMap("baggage_weight_unit")
        private String baggageWeightUnit;

        @com.aliyun.core.annotation.NameInMap("is_all_weight")
        private Boolean isAllWeight;

        @com.aliyun.core.annotation.NameInMap("price")
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
    /**
     * 
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
    public static class Ancillary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ancillary_id")
        private String ancillaryId;

        @com.aliyun.core.annotation.NameInMap("ancillary_type")
        private Integer ancillaryType;

        @com.aliyun.core.annotation.NameInMap("baggage_ancillary")
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
             * <p>ancillay_id</p>
             * 
             * <strong>example:</strong>
             * <p>MDY2NTAxLCJleHAiOjE2NxNzM3MDEsIm5ix</p>
             */
            public Builder ancillaryId(String ancillaryId) {
                this.ancillaryId = ancillaryId;
                return this;
            }

            /**
             * <p>ancillary product type currently supports 4: paid luggage</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
    /**
     * 
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
    public static class Credential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cert_issue_place")
        private String certIssuePlace;

        @com.aliyun.core.annotation.NameInMap("credential_num")
        private String credentialNum;

        @com.aliyun.core.annotation.NameInMap("credential_type")
        private Integer credentialType;

        @com.aliyun.core.annotation.NameInMap("expire_date")
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
             * <p>place of issue, two-letter code</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder certIssuePlace(String certIssuePlace) {
                this.certIssuePlace = certIssuePlace;
                return this;
            }

            /**
             * <p>travel document number</p>
             * 
             * <strong>example:</strong>
             * <p>E1***5674</p>
             */
            public Builder credentialNum(String credentialNum) {
                this.credentialNum = credentialNum;
                return this;
            }

            /**
             * <p>travel document type , only support &quot;1&quot;(1 means passport) currently.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder credentialType(Integer credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * <p>expiration date</p>
             * 
             * <strong>example:</strong>
             * <p>20290101</p>
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
    /**
     * 
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
    public static class Passenger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birthday")
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("credential")
        private Credential credential;

        @com.aliyun.core.annotation.NameInMap("first_name")
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("gender")
        private Integer gender;

        @com.aliyun.core.annotation.NameInMap("last_name")
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("mobile_country_code")
        private String mobileCountryCode;

        @com.aliyun.core.annotation.NameInMap("mobile_phone_number")
        private String mobilePhoneNumber;

        @com.aliyun.core.annotation.NameInMap("nationality")
        private String nationality;

        @com.aliyun.core.annotation.NameInMap("type")
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
             * <p>date of birth (yyyyMMdd)</p>
             * 
             * <strong>example:</strong>
             * <p>20020301</p>
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * <p>travel document</p>
             */
            public Builder credential(Credential credential) {
                this.credential = credential;
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
             * <p>gender 0: male; 1: female</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder gender(Integer gender) {
                this.gender = gender;
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

            /**
             * <p>country code for mobile phone number</p>
             * 
             * <strong>example:</strong>
             * <p>86</p>
             */
            public Builder mobileCountryCode(String mobileCountryCode) {
                this.mobileCountryCode = mobileCountryCode;
                return this;
            }

            /**
             * <p>mobile phone number</p>
             * 
             * <strong>example:</strong>
             * <p>183******96</p>
             */
            public Builder mobilePhoneNumber(String mobilePhoneNumber) {
                this.mobilePhoneNumber = mobilePhoneNumber;
                return this;
            }

            /**
             * <p>nationality</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * <p>passenger type 0: adult; 1: child; 8: infant</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
    public static class AncillaryItemDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ancillary")
        private Ancillary ancillary;

        @com.aliyun.core.annotation.NameInMap("passenger")
        private Passenger passenger;

        @com.aliyun.core.annotation.NameInMap("segment_id_list")
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
             * <p>the ancillary buyer booked</p>
             */
            public Builder ancillary(Ancillary ancillary) {
                this.ancillary = ancillary;
                return this;
            }

            /**
             * <p>passenger</p>
             */
            public Builder passenger(Passenger passenger) {
                this.passenger = passenger;
                return this;
            }

            /**
             * <p>segment ID list, these segments share the same ancillary</p>
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
    /**
     * 
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
    public static class FlightPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sell_price")
        private Double sellPrice;

        @com.aliyun.core.annotation.NameInMap("tax")
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
             * <p>selling price</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder sellPrice(Double sellPrice) {
                this.sellPrice = sellPrice;
                return this;
            }

            /**
             * <p>tax</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
    public static class FlightSegmentCabinRelation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("cabin_class_name")
        private String cabinClassName;

        @com.aliyun.core.annotation.NameInMap("cabin_quantity")
        private String cabinQuantity;

        @com.aliyun.core.annotation.NameInMap("segment_id")
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
             * <p>cabin class description</p>
             * 
             * <strong>example:</strong>
             * <p>economy class</p>
             */
            public Builder cabinClassName(String cabinClassName) {
                this.cabinClassName = cabinClassName;
                return this;
            }

            /**
             * <p>availability</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder cabinQuantity(String cabinQuantity) {
                this.cabinQuantity = cabinQuantity;
                return this;
            }

            /**
             * <p>segment ID format: flight no.+departure airport[IATA airport code]+arrival airport[IATA airport code]+departure time(yyMMddHHmm)</p>
             * 
             * <strong>example:</strong>
             * <p>HO1295-PVG-MFM-20230310</p>
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
    /**
     * 
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
    public static class PassengerCredential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cert_issue_place")
        private String certIssuePlace;

        @com.aliyun.core.annotation.NameInMap("credential_num")
        private String credentialNum;

        @com.aliyun.core.annotation.NameInMap("credential_type")
        private Integer credentialType;

        @com.aliyun.core.annotation.NameInMap("expire_date")
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
             * <p>place of issue, two-letter code</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder certIssuePlace(String certIssuePlace) {
                this.certIssuePlace = certIssuePlace;
                return this;
            }

            /**
             * <p>travel document number</p>
             * 
             * <strong>example:</strong>
             * <p>E1***5674</p>
             */
            public Builder credentialNum(String credentialNum) {
                this.credentialNum = credentialNum;
                return this;
            }

            /**
             * <p>travel document type , only support &quot;1&quot;(1 means passport) currently.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder credentialType(Integer credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * <p>expiration date</p>
             * 
             * <strong>example:</strong>
             * <p>20290101</p>
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
    /**
     * 
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
    public static class FlightItemDetailListPassenger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birthday")
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("credential")
        private PassengerCredential credential;

        @com.aliyun.core.annotation.NameInMap("first_name")
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("gender")
        private Integer gender;

        @com.aliyun.core.annotation.NameInMap("last_name")
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("mobile_country_code")
        private String mobileCountryCode;

        @com.aliyun.core.annotation.NameInMap("mobile_phone_number")
        private String mobilePhoneNumber;

        @com.aliyun.core.annotation.NameInMap("nationality")
        private String nationality;

        @com.aliyun.core.annotation.NameInMap("type")
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
             * <p>date of birth (yyyyMMdd)</p>
             * 
             * <strong>example:</strong>
             * <p>20020301</p>
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * <p>travel document</p>
             */
            public Builder credential(PassengerCredential credential) {
                this.credential = credential;
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
             * <p>gender 0: MALE; 1: FEMALE</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder gender(Integer gender) {
                this.gender = gender;
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

            /**
             * <p>mobile country code</p>
             * 
             * <strong>example:</strong>
             * <p>86</p>
             */
            public Builder mobileCountryCode(String mobileCountryCode) {
                this.mobileCountryCode = mobileCountryCode;
                return this;
            }

            /**
             * <p>mobile phone number</p>
             * 
             * <strong>example:</strong>
             * <p>183******96</p>
             */
            public Builder mobilePhoneNumber(String mobilePhoneNumber) {
                this.mobilePhoneNumber = mobilePhoneNumber;
                return this;
            }

            /**
             * <p>nationality (two-letter code)</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * <p>passenger type 0: adult; 1: child; 8: infant</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
    public static class FlightItemDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("b_pnr_list")
        private java.util.List < String > bPnrList;

        @com.aliyun.core.annotation.NameInMap("c_pnr_list")
        private java.util.List < String > cPnrList;

        @com.aliyun.core.annotation.NameInMap("flight_price")
        private FlightPrice flightPrice;

        @com.aliyun.core.annotation.NameInMap("flight_segment_cabin_relation")
        private java.util.List < FlightSegmentCabinRelation> flightSegmentCabinRelation;

        @com.aliyun.core.annotation.NameInMap("passenger")
        private FlightItemDetailListPassenger passenger;

        @com.aliyun.core.annotation.NameInMap("ticket_air_line")
        private String ticketAirLine;

        @com.aliyun.core.annotation.NameInMap("ticket_nos")
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
             * <p>b PNR(airline booking code) list</p>
             */
            public Builder bPnrList(java.util.List < String > bPnrList) {
                this.bPnrList = bPnrList;
                return this;
            }

            /**
             * <p>c PNR(airline booking code) list</p>
             */
            public Builder cPnrList(java.util.List < String > cPnrList) {
                this.cPnrList = cPnrList;
                return this;
            }

            /**
             * <p>flight price information for current passenger</p>
             */
            public Builder flightPrice(FlightPrice flightPrice) {
                this.flightPrice = flightPrice;
                return this;
            }

            /**
             * <p>RBD information in flight segment dimension</p>
             */
            public Builder flightSegmentCabinRelation(java.util.List < FlightSegmentCabinRelation> flightSegmentCabinRelation) {
                this.flightSegmentCabinRelation = flightSegmentCabinRelation;
                return this;
            }

            /**
             * <p>passenger</p>
             */
            public Builder passenger(FlightItemDetailListPassenger passenger) {
                this.passenger = passenger;
                return this;
            }

            /**
             * <p>ticketing airline</p>
             * 
             * <strong>example:</strong>
             * <p>HO</p>
             */
            public Builder ticketAirLine(String ticketAirLine) {
                this.ticketAirLine = ticketAirLine;
                return this;
            }

            /**
             * <p>ticket number list</p>
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
    /**
     * 
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
    public static class PassengerListCredential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cert_issue_place")
        private String certIssuePlace;

        @com.aliyun.core.annotation.NameInMap("credential_num")
        private String credentialNum;

        @com.aliyun.core.annotation.NameInMap("credential_type")
        private Integer credentialType;

        @com.aliyun.core.annotation.NameInMap("expire_date")
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
             * <p>place of issue, two-letter code</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder certIssuePlace(String certIssuePlace) {
                this.certIssuePlace = certIssuePlace;
                return this;
            }

            /**
             * <p>travel document number</p>
             * 
             * <strong>example:</strong>
             * <p>E1***5674</p>
             */
            public Builder credentialNum(String credentialNum) {
                this.credentialNum = credentialNum;
                return this;
            }

            /**
             * <p>travel document type , only support &quot;1&quot;(1 means passport) currently.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder credentialType(Integer credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * <p>expiration date</p>
             * 
             * <strong>example:</strong>
             * <p>20290101</p>
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
    /**
     * 
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
    public static class PassengerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birthday")
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("credential")
        private PassengerListCredential credential;

        @com.aliyun.core.annotation.NameInMap("first_name")
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("gender")
        private Integer gender;

        @com.aliyun.core.annotation.NameInMap("last_name")
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("mobile_country_code")
        private String mobileCountryCode;

        @com.aliyun.core.annotation.NameInMap("mobile_phone_number")
        private String mobilePhoneNumber;

        @com.aliyun.core.annotation.NameInMap("nationality")
        private String nationality;

        @com.aliyun.core.annotation.NameInMap("type")
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
             * <p>date of birth (yyyyMMdd)</p>
             * 
             * <strong>example:</strong>
             * <p>20020301</p>
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * <p>travel document</p>
             */
            public Builder credential(PassengerListCredential credential) {
                this.credential = credential;
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
             * <p>gender 0: MALE; 1: FEMALE</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder gender(Integer gender) {
                this.gender = gender;
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

            /**
             * <p>mobile country code</p>
             * 
             * <strong>example:</strong>
             * <p>86</p>
             */
            public Builder mobileCountryCode(String mobileCountryCode) {
                this.mobileCountryCode = mobileCountryCode;
                return this;
            }

            /**
             * <p>mobile phone number</p>
             * 
             * <strong>example:</strong>
             * <p>183******96</p>
             */
            public Builder mobilePhoneNumber(String mobilePhoneNumber) {
                this.mobilePhoneNumber = mobilePhoneNumber;
                return this;
            }

            /**
             * <p>nationality (two-letter code)</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * <p>passenger type 0: adult; 1: child; 8: infant</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
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
             * <p>availability</p>
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
             * <p>marketing airline flight no. (eg: 5809)</p>
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
             * <p>stop city list when stop_quantity &gt; 1 , use “,” for seperation</p>
             * 
             * <strong>example:</strong>
             * <p>SEL,HKG</p>
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
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
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
             * <p>segment list</p>
             */
            public Builder segmentList(java.util.List < SegmentList> segmentList) {
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
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
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
            public Builder segmentIdList(java.util.List < String > segmentIdList) {
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
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
    public static class SegmentBaggageMappingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_baggage_allowance_mapping")
        private java.util.Map < String, DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue > passengerBaggageAllowanceMapping;

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
             * <p>baggage rule mapping, key is passenger type, value is baggage allowance details</p>
             */
            public Builder passengerBaggageAllowanceMapping(java.util.Map < String, DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue > passengerBaggageAllowanceMapping) {
                this.passengerBaggageAllowanceMapping = passengerBaggageAllowanceMapping;
                return this;
            }

            /**
             * <p>segment id list. all the listed segment ids share the same baggage rule</p>
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
    /**
     * 
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
    public static class SegmentRefundChangeRuleMappingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("refund_change_rule_map")
        private java.util.Map < String, DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue > refundChangeRuleMap;

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
             * <p>change and refund policy mapping, key is passenger type, value is change and refund policy details</p>
             */
            public Builder refundChangeRuleMap(java.util.Map < String, DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue > refundChangeRuleMap) {
                this.refundChangeRuleMap = refundChangeRuleMap;
                return this;
            }

            /**
             * <p>segment id list. all the listed segment ids share the same change and refund policy</p>
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
    /**
     * 
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
    public static class Solution extends TeaModel {
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
             * <p>adult fare</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder adultPrice(Double adultPrice) {
                this.adultPrice = adultPrice;
                return this;
            }

            /**
             * <p>adult tax</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder adultTax(Double adultTax) {
                this.adultTax = adultTax;
                return this;
            }

            /**
             * <p>child fare</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder childPrice(Double childPrice) {
                this.childPrice = childPrice;
                return this;
            }

            /**
             * <p>child tax</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder childTax(Double childTax) {
                this.childTax = childTax;
                return this;
            }

            /**
             * <p>infant fare</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder infantPrice(Double infantPrice) {
                this.infantPrice = infantPrice;
                return this;
            }

            /**
             * <p>infant tax</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder infantTax(Double infantTax) {
                this.infantTax = infantTax;
                return this;
            }

            /**
             * <p>journey list</p>
             */
            public Builder journeyList(java.util.List < JourneyList> journeyList) {
                this.journeyList = journeyList;
                return this;
            }

            /**
             * <p>product type description</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder productTypeDescription(String productTypeDescription) {
                this.productTypeDescription = productTypeDescription;
                return this;
            }

            /**
             * <p>refund coupon description</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder refundTicketCouponDescription(String refundTicketCouponDescription) {
                this.refundTicketCouponDescription = refundTicketCouponDescription;
                return this;
            }

            /**
             * <p>through check-in baggage policy</p>
             */
            public Builder segmentBaggageCheckInInfoList(java.util.List < SegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList) {
                this.segmentBaggageCheckInInfoList = segmentBaggageCheckInInfoList;
                return this;
            }

            /**
             * <p>baggage rule list</p>
             */
            public Builder segmentBaggageMappingList(java.util.List < SegmentBaggageMappingList> segmentBaggageMappingList) {
                this.segmentBaggageMappingList = segmentBaggageMappingList;
                return this;
            }

            /**
             * <p>change and refund policy</p>
             */
            public Builder segmentRefundChangeRuleMappingList(java.util.List < SegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList) {
                this.segmentRefundChangeRuleMappingList = segmentRefundChangeRuleMappingList;
                return this;
            }

            /**
             * <p>solution_id</p>
             * 
             * <strong>example:</strong>
             * <p>eJwz8DeySEo0NjQ01TU3TUxxx</p>
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
    /**
     * 
     * {@link OrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OrderDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ancillary_item_detail_list")
        private java.util.List < AncillaryItemDetailList> ancillaryItemDetailList;

        @com.aliyun.core.annotation.NameInMap("baggage_allowance_map")
        private java.util.Map < String, DataBaggageAllowanceMapValue > baggageAllowanceMap;

        @com.aliyun.core.annotation.NameInMap("book_time")
        private Long bookTime;

        @com.aliyun.core.annotation.NameInMap("flight_item_detail_list")
        private java.util.List < FlightItemDetailList> flightItemDetailList;

        @com.aliyun.core.annotation.NameInMap("order_num")
        private Long orderNum;

        @com.aliyun.core.annotation.NameInMap("order_status")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("out_order_num")
        private String outOrderNum;

        @com.aliyun.core.annotation.NameInMap("passenger_list")
        private java.util.List < PassengerList> passengerList;

        @com.aliyun.core.annotation.NameInMap("pay_status")
        private Integer payStatus;

        @com.aliyun.core.annotation.NameInMap("pay_time")
        private Long payTime;

        @com.aliyun.core.annotation.NameInMap("promotion_price")
        private Double promotionPrice;

        @com.aliyun.core.annotation.NameInMap("real_pay_price")
        private Double realPayPrice;

        @com.aliyun.core.annotation.NameInMap("refund_change_rule_map")
        private java.util.Map < String, DataRefundChangeRuleMapValue > refundChangeRuleMap;

        @com.aliyun.core.annotation.NameInMap("session_nick")
        private String sessionNick;

        @com.aliyun.core.annotation.NameInMap("solution")
        private Solution solution;

        @com.aliyun.core.annotation.NameInMap("succeed_time")
        private Long succeedTime;

        @com.aliyun.core.annotation.NameInMap("total_price")
        private Double totalPrice;

        @com.aliyun.core.annotation.NameInMap("transaction_no")
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
             * <p>ancillary product fulfillment details</p>
             */
            public Builder ancillaryItemDetailList(java.util.List < AncillaryItemDetailList> ancillaryItemDetailList) {
                this.ancillaryItemDetailList = ancillaryItemDetailList;
                return this;
            }

            /**
             * <p>baggage rule mapping, key is passenger type, value is baggage allowance details</p>
             */
            public Builder baggageAllowanceMap(java.util.Map < String, DataBaggageAllowanceMapValue > baggageAllowanceMap) {
                this.baggageAllowanceMap = baggageAllowanceMap;
                return this;
            }

            /**
             * <p>book time(timestamp)</p>
             * 
             * <strong>example:</strong>
             * <p>1677210784000</p>
             */
            public Builder bookTime(Long bookTime) {
                this.bookTime = bookTime;
                return this;
            }

            /**
             * <p>flight product fulfillment details</p>
             */
            public Builder flightItemDetailList(java.util.List < FlightItemDetailList> flightItemDetailList) {
                this.flightItemDetailList = flightItemDetailList;
                return this;
            }

            /**
             * <p>order number created by book</p>
             * 
             * <strong>example:</strong>
             * <p>4966***617111</p>
             */
            public Builder orderNum(Long orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * <p>order status </p>
             * <p>1: order creation in process; </p>
             * <p>2: order creation successful; </p>
             * <p>3: order paid; </p>
             * <p>4: order successful; </p>
             * <p>5: order closed</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * <p>external order number(customized by buyer when book)</p>
             * 
             * <strong>example:</strong>
             * <p>x091-2023-0220-j-0001</p>
             */
            public Builder outOrderNum(String outOrderNum) {
                this.outOrderNum = outOrderNum;
                return this;
            }

            /**
             * <p>the information about all passenger of current order</p>
             */
            public Builder passengerList(java.util.List < PassengerList> passengerList) {
                this.passengerList = passengerList;
                return this;
            }

            /**
             * <p>payment status </p>
             * <p>1: payment in process; </p>
             * <p>2: deduction successful; </p>
             * <p>3: paid to the seller; </p>
             * <p>4: transaction closed</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder payStatus(Integer payStatus) {
                this.payStatus = payStatus;
                return this;
            }

            /**
             * <p>pay time(timestamp)</p>
             * 
             * <strong>example:</strong>
             * <p>1677210788000</p>
             */
            public Builder payTime(Long payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * <p>discount amount</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder promotionPrice(Double promotionPrice) {
                this.promotionPrice = promotionPrice;
                return this;
            }

            /**
             * <p>actual payment amount</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder realPayPrice(Double realPayPrice) {
                this.realPayPrice = realPayPrice;
                return this;
            }

            /**
             * <p>change and refund policy mapping, key is passenger type, value is change and refund policy details</p>
             */
            public Builder refundChangeRuleMap(java.util.Map < String, DataRefundChangeRuleMapValue > refundChangeRuleMap) {
                this.refundChangeRuleMap = refundChangeRuleMap;
                return this;
            }

            /**
             * <p>buyer nickname</p>
             * 
             * <strong>example:</strong>
             * <p>nick</p>
             */
            public Builder sessionNick(String sessionNick) {
                this.sessionNick = sessionNick;
                return this;
            }

            /**
             * <p>the solution buyer booked</p>
             */
            public Builder solution(Solution solution) {
                this.solution = solution;
                return this;
            }

            /**
             * <p>order success time(timestamp)</p>
             * 
             * <strong>example:</strong>
             * <p>1677210786000</p>
             */
            public Builder succeedTime(Long succeedTime) {
                this.succeedTime = succeedTime;
                return this;
            }

            /**
             * <p>total price of current order</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder totalPrice(Double totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            /**
             * <p>transaction number</p>
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
