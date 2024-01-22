// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeApplyRequest} extends {@link RequestModel}
 *
 * <p>ChangeApplyRequest</p>
 */
public class ChangeApplyRequest extends Request {
    @Body
    @NameInMap("change_passenger_list")
    @Validation(required = true)
    private java.util.List < ChangePassengerList> changePassengerList;

    @Body
    @NameInMap("changed_journeys")
    @Validation(required = true)
    private java.util.List < ChangedJourneys> changedJourneys;

    @Body
    @NameInMap("contact")
    @Validation(required = true)
    private Contact contact;

    @Body
    @NameInMap("order_num")
    @Validation(required = true)
    private Long orderNum;

    @Body
    @NameInMap("remark")
    private String remark;

    @Body
    @NameInMap("type")
    @Validation(required = true)
    private Integer type;

    @Header
    @NameInMap("x-acs-airticket-access-token")
    @Validation(required = true)
    private String xAcsAirticketAccessToken;

    @Header
    @NameInMap("x-acs-airticket-language")
    private String xAcsAirticketLanguage;

    private ChangeApplyRequest(Builder builder) {
        super(builder);
        this.changePassengerList = builder.changePassengerList;
        this.changedJourneys = builder.changedJourneys;
        this.contact = builder.contact;
        this.orderNum = builder.orderNum;
        this.remark = builder.remark;
        this.type = builder.type;
        this.xAcsAirticketAccessToken = builder.xAcsAirticketAccessToken;
        this.xAcsAirticketLanguage = builder.xAcsAirticketLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeApplyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changePassengerList
     */
    public java.util.List < ChangePassengerList> getChangePassengerList() {
        return this.changePassengerList;
    }

    /**
     * @return changedJourneys
     */
    public java.util.List < ChangedJourneys> getChangedJourneys() {
        return this.changedJourneys;
    }

    /**
     * @return contact
     */
    public Contact getContact() {
        return this.contact;
    }

    /**
     * @return orderNum
     */
    public Long getOrderNum() {
        return this.orderNum;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
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

    public static final class Builder extends Request.Builder<ChangeApplyRequest, Builder> {
        private java.util.List < ChangePassengerList> changePassengerList; 
        private java.util.List < ChangedJourneys> changedJourneys; 
        private Contact contact; 
        private Long orderNum; 
        private String remark; 
        private Integer type; 
        private String xAcsAirticketAccessToken; 
        private String xAcsAirticketLanguage; 

        private Builder() {
            super();
        } 

        private Builder(ChangeApplyRequest request) {
            super(request);
            this.changePassengerList = request.changePassengerList;
            this.changedJourneys = request.changedJourneys;
            this.contact = request.contact;
            this.orderNum = request.orderNum;
            this.remark = request.remark;
            this.type = request.type;
            this.xAcsAirticketAccessToken = request.xAcsAirticketAccessToken;
            this.xAcsAirticketLanguage = request.xAcsAirticketLanguage;
        } 

        /**
         * change_passenger_list.
         */
        public Builder changePassengerList(java.util.List < ChangePassengerList> changePassengerList) {
            String changePassengerListShrink = shrink(changePassengerList, "change_passenger_list", "json");
            this.putBodyParameter("change_passenger_list", changePassengerListShrink);
            this.changePassengerList = changePassengerList;
            return this;
        }

        /**
         * changed_journeys.
         */
        public Builder changedJourneys(java.util.List < ChangedJourneys> changedJourneys) {
            String changedJourneysShrink = shrink(changedJourneys, "changed_journeys", "json");
            this.putBodyParameter("changed_journeys", changedJourneysShrink);
            this.changedJourneys = changedJourneys;
            return this;
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
         * order_num.
         */
        public Builder orderNum(Long orderNum) {
            this.putBodyParameter("order_num", orderNum);
            this.orderNum = orderNum;
            return this;
        }

        /**
         * remark.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * type.
         */
        public Builder type(Integer type) {
            this.putBodyParameter("type", type);
            this.type = type;
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
        public ChangeApplyRequest build() {
            return new ChangeApplyRequest(this);
        } 

    } 

    public static class ChangePassengerList extends TeaModel {
        @NameInMap("document")
        private String document;

        @NameInMap("first_name")
        @Validation(required = true)
        private String firstName;

        @NameInMap("last_name")
        @Validation(required = true)
        private String lastName;

        private ChangePassengerList(Builder builder) {
            this.document = builder.document;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangePassengerList create() {
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

            public ChangePassengerList build() {
                return new ChangePassengerList(this);
            } 

        } 

    }
    public static class SegmentList extends TeaModel {
        @NameInMap("arrival_airport")
        private String arrivalAirport;

        @NameInMap("arrival_city")
        @Validation(required = true)
        private String arrivalCity;

        @NameInMap("arrive_terminal")
        private String arriveTerminal;

        @NameInMap("arrive_time")
        private Long arriveTime;

        @NameInMap("code_share")
        private Boolean codeShare;

        @NameInMap("departure_airport")
        private String departureAirport;

        @NameInMap("departure_city")
        @Validation(required = true)
        private String departureCity;

        @NameInMap("departure_date")
        @Validation(required = true)
        private String departureDate;

        @NameInMap("departure_terminal")
        private String departureTerminal;

        @NameInMap("departure_time")
        private Long departureTime;

        @NameInMap("marketing_flight_no")
        @Validation(required = true)
        private String marketingFlightNo;

        @NameInMap("operating_flight_no")
        private String operatingFlightNo;

        private SegmentList(Builder builder) {
            this.arrivalAirport = builder.arrivalAirport;
            this.arrivalCity = builder.arrivalCity;
            this.arriveTerminal = builder.arriveTerminal;
            this.arriveTime = builder.arriveTime;
            this.codeShare = builder.codeShare;
            this.departureAirport = builder.departureAirport;
            this.departureCity = builder.departureCity;
            this.departureDate = builder.departureDate;
            this.departureTerminal = builder.departureTerminal;
            this.departureTime = builder.departureTime;
            this.marketingFlightNo = builder.marketingFlightNo;
            this.operatingFlightNo = builder.operatingFlightNo;
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
         * @return arriveTerminal
         */
        public String getArriveTerminal() {
            return this.arriveTerminal;
        }

        /**
         * @return arriveTime
         */
        public Long getArriveTime() {
            return this.arriveTime;
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
         * @return departureDate
         */
        public String getDepartureDate() {
            return this.departureDate;
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
        public Long getDepartureTime() {
            return this.departureTime;
        }

        /**
         * @return marketingFlightNo
         */
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        /**
         * @return operatingFlightNo
         */
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public static final class Builder {
            private String arrivalAirport; 
            private String arrivalCity; 
            private String arriveTerminal; 
            private Long arriveTime; 
            private Boolean codeShare; 
            private String departureAirport; 
            private String departureCity; 
            private String departureDate; 
            private String departureTerminal; 
            private Long departureTime; 
            private String marketingFlightNo; 
            private String operatingFlightNo; 

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
             * arrive_terminal.
             */
            public Builder arriveTerminal(String arriveTerminal) {
                this.arriveTerminal = arriveTerminal;
                return this;
            }

            /**
             * arrive_time.
             */
            public Builder arriveTime(Long arriveTime) {
                this.arriveTime = arriveTime;
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
             * departure_date.
             */
            public Builder departureDate(String departureDate) {
                this.departureDate = departureDate;
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
            public Builder departureTime(Long departureTime) {
                this.departureTime = departureTime;
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
             * operating_flight_no.
             */
            public Builder operatingFlightNo(String operatingFlightNo) {
                this.operatingFlightNo = operatingFlightNo;
                return this;
            }

            public SegmentList build() {
                return new SegmentList(this);
            } 

        } 

    }
    public static class ChangedJourneys extends TeaModel {
        @NameInMap("segment_list")
        private java.util.List < SegmentList> segmentList;

        private ChangedJourneys(Builder builder) {
            this.segmentList = builder.segmentList;
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

        public static final class Builder {
            private java.util.List < SegmentList> segmentList; 

            /**
             * segment_list.
             */
            public Builder segmentList(java.util.List < SegmentList> segmentList) {
                this.segmentList = segmentList;
                return this;
            }

            public ChangedJourneys build() {
                return new ChangedJourneys(this);
            } 

        } 

    }
    public static class Contact extends TeaModel {
        @NameInMap("email")
        private String email;

        @NameInMap("mobile_country_code")
        private String mobileCountryCode;

        @NameInMap("mobile_phone_num")
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
}
