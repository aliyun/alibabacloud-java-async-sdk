// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BookRequest} extends {@link RequestModel}
 *
 * <p>BookRequest</p>
 */
public class BookRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contact")
    @com.aliyun.core.annotation.Validation(required = true)
    private Contact contact;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_order_num")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outOrderNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("passenger_ancillary_purchase_map_list")
    private java.util.List < PassengerAncillaryPurchaseMapList> passengerAncillaryPurchaseMapList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("passenger_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < PassengerList> passengerList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("solution_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String solutionId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-access-token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xAcsAirticketAccessToken;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-language")
    private String xAcsAirticketLanguage;

    private BookRequest(Builder builder) {
        super(builder);
        this.contact = builder.contact;
        this.outOrderNum = builder.outOrderNum;
        this.passengerAncillaryPurchaseMapList = builder.passengerAncillaryPurchaseMapList;
        this.passengerList = builder.passengerList;
        this.solutionId = builder.solutionId;
        this.xAcsAirticketAccessToken = builder.xAcsAirticketAccessToken;
        this.xAcsAirticketLanguage = builder.xAcsAirticketLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contact
     */
    public Contact getContact() {
        return this.contact;
    }

    /**
     * @return outOrderNum
     */
    public String getOutOrderNum() {
        return this.outOrderNum;
    }

    /**
     * @return passengerAncillaryPurchaseMapList
     */
    public java.util.List < PassengerAncillaryPurchaseMapList> getPassengerAncillaryPurchaseMapList() {
        return this.passengerAncillaryPurchaseMapList;
    }

    /**
     * @return passengerList
     */
    public java.util.List < PassengerList> getPassengerList() {
        return this.passengerList;
    }

    /**
     * @return solutionId
     */
    public String getSolutionId() {
        return this.solutionId;
    }

    /**
     * @return xAcsAirticketAccessToken
     */
    public String getXAcsAirticketAccessToken() {
        return this.xAcsAirticketAccessToken;
    }

    /**
     * @return xAcsAirticketLanguage
     */
    public String getXAcsAirticketLanguage() {
        return this.xAcsAirticketLanguage;
    }

    public static final class Builder extends Request.Builder<BookRequest, Builder> {
        private Contact contact; 
        private String outOrderNum; 
        private java.util.List < PassengerAncillaryPurchaseMapList> passengerAncillaryPurchaseMapList; 
        private java.util.List < PassengerList> passengerList; 
        private String solutionId; 
        private String xAcsAirticketAccessToken; 
        private String xAcsAirticketLanguage; 

        private Builder() {
            super();
        } 

        private Builder(BookRequest request) {
            super(request);
            this.contact = request.contact;
            this.outOrderNum = request.outOrderNum;
            this.passengerAncillaryPurchaseMapList = request.passengerAncillaryPurchaseMapList;
            this.passengerList = request.passengerList;
            this.solutionId = request.solutionId;
            this.xAcsAirticketAccessToken = request.xAcsAirticketAccessToken;
            this.xAcsAirticketLanguage = request.xAcsAirticketLanguage;
        } 

        /**
         * contact.
         */
        public Builder contact(Contact contact) {
            String contactShrink = shrink(contact, "contact", "json");
            this.putBodyParameter("contact", contactShrink);
            this.contact = contact;
            return this;
        }

        /**
         * out_order_num.
         */
        public Builder outOrderNum(String outOrderNum) {
            this.putBodyParameter("out_order_num", outOrderNum);
            this.outOrderNum = outOrderNum;
            return this;
        }

        /**
         * passenger_ancillary_purchase_map_list.
         */
        public Builder passengerAncillaryPurchaseMapList(java.util.List < PassengerAncillaryPurchaseMapList> passengerAncillaryPurchaseMapList) {
            String passengerAncillaryPurchaseMapListShrink = shrink(passengerAncillaryPurchaseMapList, "passenger_ancillary_purchase_map_list", "json");
            this.putBodyParameter("passenger_ancillary_purchase_map_list", passengerAncillaryPurchaseMapListShrink);
            this.passengerAncillaryPurchaseMapList = passengerAncillaryPurchaseMapList;
            return this;
        }

        /**
         * passenger_list.
         */
        public Builder passengerList(java.util.List < PassengerList> passengerList) {
            String passengerListShrink = shrink(passengerList, "passenger_list", "json");
            this.putBodyParameter("passenger_list", passengerListShrink);
            this.passengerList = passengerList;
            return this;
        }

        /**
         * solution_id
         */
        public Builder solutionId(String solutionId) {
            this.putBodyParameter("solution_id", solutionId);
            this.solutionId = solutionId;
            return this;
        }

        /**
         * access_token
         */
        public Builder xAcsAirticketAccessToken(String xAcsAirticketAccessToken) {
            this.putHeaderParameter("x-acs-airticket-access-token", xAcsAirticketAccessToken);
            this.xAcsAirticketAccessToken = xAcsAirticketAccessToken;
            return this;
        }

        /**
         * x-acs-airticket-language.
         */
        public Builder xAcsAirticketLanguage(String xAcsAirticketLanguage) {
            this.putHeaderParameter("x-acs-airticket-language", xAcsAirticketLanguage);
            this.xAcsAirticketLanguage = xAcsAirticketLanguage;
            return this;
        }

        @Override
        public BookRequest build() {
            return new BookRequest(this);
        } 

    } 

    public static class Contact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("first_name")
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("last_name")
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("mobile_country_code")
        private String mobileCountryCode;

        @com.aliyun.core.annotation.NameInMap("mobile_phone_num")
        private String mobilePhoneNum;

        private Contact(Builder builder) {
            this.email = builder.email;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
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
            private String firstName; 
            private String lastName; 
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
    public static class BookAncillaryReqItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ancillary_id")
        private String ancillaryId;

        @com.aliyun.core.annotation.NameInMap("ancillary_type")
        private Integer ancillaryType;

        private BookAncillaryReqItem(Builder builder) {
            this.ancillaryId = builder.ancillaryId;
            this.ancillaryType = builder.ancillaryType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BookAncillaryReqItem create() {
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

        public static final class Builder {
            private String ancillaryId; 
            private Integer ancillaryType; 

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

            public BookAncillaryReqItem build() {
                return new BookAncillaryReqItem(this);
            } 

        } 

    }
    public static class Credential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cert_issue_place")
        private String certIssuePlace;

        @com.aliyun.core.annotation.NameInMap("credential_num")
        private String credentialNum;

        @com.aliyun.core.annotation.NameInMap("credential_type")
        @com.aliyun.core.annotation.Validation(required = true)
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
    public static class PassengerAncillaryPurchaseMapListPassengerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birthday")
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("credential")
        private Credential credential;

        @com.aliyun.core.annotation.NameInMap("first_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("gender")
        private Integer gender;

        @com.aliyun.core.annotation.NameInMap("last_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("mobile_country_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mobileCountryCode;

        @com.aliyun.core.annotation.NameInMap("mobile_phone_number")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mobilePhoneNumber;

        @com.aliyun.core.annotation.NameInMap("nationality")
        private String nationality;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer type;

        private PassengerAncillaryPurchaseMapListPassengerList(Builder builder) {
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

        public static PassengerAncillaryPurchaseMapListPassengerList create() {
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

            public PassengerAncillaryPurchaseMapListPassengerList build() {
                return new PassengerAncillaryPurchaseMapListPassengerList(this);
            } 

        } 

    }
    public static class PassengerAncillaryPurchaseMapList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("book_ancillary_req_item")
        private BookAncillaryReqItem bookAncillaryReqItem;

        @com.aliyun.core.annotation.NameInMap("passenger_list")
        private java.util.List < PassengerAncillaryPurchaseMapListPassengerList> passengerList;

        private PassengerAncillaryPurchaseMapList(Builder builder) {
            this.bookAncillaryReqItem = builder.bookAncillaryReqItem;
            this.passengerList = builder.passengerList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerAncillaryPurchaseMapList create() {
            return builder().build();
        }

        /**
         * @return bookAncillaryReqItem
         */
        public BookAncillaryReqItem getBookAncillaryReqItem() {
            return this.bookAncillaryReqItem;
        }

        /**
         * @return passengerList
         */
        public java.util.List < PassengerAncillaryPurchaseMapListPassengerList> getPassengerList() {
            return this.passengerList;
        }

        public static final class Builder {
            private BookAncillaryReqItem bookAncillaryReqItem; 
            private java.util.List < PassengerAncillaryPurchaseMapListPassengerList> passengerList; 

            /**
             * book_ancillary_req_item.
             */
            public Builder bookAncillaryReqItem(BookAncillaryReqItem bookAncillaryReqItem) {
                this.bookAncillaryReqItem = bookAncillaryReqItem;
                return this;
            }

            /**
             * passenger_list.
             */
            public Builder passengerList(java.util.List < PassengerAncillaryPurchaseMapListPassengerList> passengerList) {
                this.passengerList = passengerList;
                return this;
            }

            public PassengerAncillaryPurchaseMapList build() {
                return new PassengerAncillaryPurchaseMapList(this);
            } 

        } 

    }
    public static class PassengerListCredential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cert_issue_place")
        private String certIssuePlace;

        @com.aliyun.core.annotation.NameInMap("credential_num")
        private String credentialNum;

        @com.aliyun.core.annotation.NameInMap("credential_type")
        @com.aliyun.core.annotation.Validation(required = true)
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
        @com.aliyun.core.annotation.NameInMap("birthday")
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("credential")
        private PassengerListCredential credential;

        @com.aliyun.core.annotation.NameInMap("first_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("gender")
        private Integer gender;

        @com.aliyun.core.annotation.NameInMap("last_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("mobile_country_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mobileCountryCode;

        @com.aliyun.core.annotation.NameInMap("mobile_phone_number")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mobilePhoneNumber;

        @com.aliyun.core.annotation.NameInMap("nationality")
        private String nationality;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
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
}
