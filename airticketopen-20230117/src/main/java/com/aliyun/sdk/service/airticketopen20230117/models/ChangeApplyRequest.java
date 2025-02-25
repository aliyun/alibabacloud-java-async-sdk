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
 * {@link ChangeApplyRequest} extends {@link RequestModel}
 *
 * <p>ChangeApplyRequest</p>
 */
public class ChangeApplyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("change_passenger_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ChangePassengerList> changePassengerList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("changed_journeys")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ChangedJourneys> changedJourneys;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contact")
    @com.aliyun.core.annotation.Validation(required = true)
    private Contact contact;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_num")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orderNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer type;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-access-token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xAcsAirticketAccessToken;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-language")
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
    public java.util.List<ChangePassengerList> getChangePassengerList() {
        return this.changePassengerList;
    }

    /**
     * @return changedJourneys
     */
    public java.util.List<ChangedJourneys> getChangedJourneys() {
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
        private java.util.List<ChangePassengerList> changePassengerList; 
        private java.util.List<ChangedJourneys> changedJourneys; 
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
         * <p>This parameter is required.</p>
         */
        public Builder changePassengerList(java.util.List<ChangePassengerList> changePassengerList) {
            String changePassengerListShrink = shrink(changePassengerList, "change_passenger_list", "json");
            this.putBodyParameter("change_passenger_list", changePassengerListShrink);
            this.changePassengerList = changePassengerList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder changedJourneys(java.util.List<ChangedJourneys> changedJourneys) {
            String changedJourneysShrink = shrink(changedJourneys, "changed_journeys", "json");
            this.putBodyParameter("changed_journeys", changedJourneysShrink);
            this.changedJourneys = changedJourneys;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contact(Contact contact) {
            String contactShrink = shrink(contact, "contact", "json");
            this.putBodyParameter("contact", contactShrink);
            this.contact = contact;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4988430***950</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder type(Integer type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>access_token</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhbGciOiJSUzI1NiIsImtpZCI6InN1ZXpfa2V5aWQifQ.eyJqdGkiOiJCQldMaWIzN0VxbC0xMjhhR2N5elJ3IiwiaWF0IjoxNjc3MDY2NTAxLCJleHAiOjE2NzcwNzM3MDEsIm5iZiI6MTY3NzA2NjQ0MX0.AF0DxsZK4Edyg0C6ObRQFUo36R1VYrb5IYmak25TmL1OfR5RkIUc3PpqFuQKNLKXf5fOtVQaKjaexzwodVeWZQDKEG_RPt_Ybb99EnEm6vPKs6e3pWFbKiBq71WleLHhVrdFb4YPowRKjc7bG0jyGUxiQ2iXy0RWDj9tIjfI-KEdzNp5oVnX7j4p3H12DwQrRPmd1nz3BciAQNINvDpzqusuIUw8JXyLFCz838Y0NhwB1_bYZyctxRLSzrGZuI5rrWtItgupqMsOlJ3RNy1QrIbQ2g6nPmzl-atOqcQ4Nw0HeDLR8dhM1OsIcFLbKXBUtwXofflhzAQrkDxhwYiXii</p>
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

    /**
     * 
     * {@link ChangeApplyRequest} extends {@link TeaModel}
     *
     * <p>ChangeApplyRequest</p>
     */
    public static class ChangePassengerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("document")
        private String document;

        @com.aliyun.core.annotation.NameInMap("first_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("last_name")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SAN</p>
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ZHANG</p>
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
    /**
     * 
     * {@link ChangeApplyRequest} extends {@link TeaModel}
     *
     * <p>ChangeApplyRequest</p>
     */
    public static class SegmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arrival_airport")
        private String arrivalAirport;

        @com.aliyun.core.annotation.NameInMap("arrival_city")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrivalCity;

        @com.aliyun.core.annotation.NameInMap("arrive_terminal")
        private String arriveTerminal;

        @com.aliyun.core.annotation.NameInMap("arrive_time")
        private Long arriveTime;

        @com.aliyun.core.annotation.NameInMap("arrive_time_str")
        private String arriveTimeStr;

        @com.aliyun.core.annotation.NameInMap("code_share")
        private Boolean codeShare;

        @com.aliyun.core.annotation.NameInMap("departure_airport")
        private String departureAirport;

        @com.aliyun.core.annotation.NameInMap("departure_city")
        @com.aliyun.core.annotation.Validation(required = true)
        private String departureCity;

        @com.aliyun.core.annotation.NameInMap("departure_date")
        @com.aliyun.core.annotation.Validation(required = true)
        private String departureDate;

        @com.aliyun.core.annotation.NameInMap("departure_terminal")
        private String departureTerminal;

        @com.aliyun.core.annotation.NameInMap("departure_time")
        private Long departureTime;

        @com.aliyun.core.annotation.NameInMap("departure_time_str")
        private String departureTimeStr;

        @com.aliyun.core.annotation.NameInMap("marketing_flight_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String marketingFlightNo;

        @com.aliyun.core.annotation.NameInMap("operating_flight_no")
        private String operatingFlightNo;

        private SegmentList(Builder builder) {
            this.arrivalAirport = builder.arrivalAirport;
            this.arrivalCity = builder.arrivalCity;
            this.arriveTerminal = builder.arriveTerminal;
            this.arriveTime = builder.arriveTime;
            this.arriveTimeStr = builder.arriveTimeStr;
            this.codeShare = builder.codeShare;
            this.departureAirport = builder.departureAirport;
            this.departureCity = builder.departureCity;
            this.departureDate = builder.departureDate;
            this.departureTerminal = builder.departureTerminal;
            this.departureTime = builder.departureTime;
            this.departureTimeStr = builder.departureTimeStr;
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
         * @return arriveTimeStr
         */
        public String getArriveTimeStr() {
            return this.arriveTimeStr;
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
         * @return departureTimeStr
         */
        public String getDepartureTimeStr() {
            return this.departureTimeStr;
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
            private String arriveTimeStr; 
            private Boolean codeShare; 
            private String departureAirport; 
            private String departureCity; 
            private String departureDate; 
            private String departureTerminal; 
            private Long departureTime; 
            private String departureTimeStr; 
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MFM</p>
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
             * arrive_time_str.
             */
            public Builder arriveTimeStr(String arriveTimeStr) {
                this.arriveTimeStr = arriveTimeStr;
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SHA</p>
             */
            public Builder departureCity(String departureCity) {
                this.departureCity = departureCity;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20230320</p>
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
             * departure_time_str.
             */
            public Builder departureTimeStr(String departureTimeStr) {
                this.departureTimeStr = departureTimeStr;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HO1295</p>
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
    /**
     * 
     * {@link ChangeApplyRequest} extends {@link TeaModel}
     *
     * <p>ChangeApplyRequest</p>
     */
    public static class ChangedJourneys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_list")
        private java.util.List<SegmentList> segmentList;

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
        public java.util.List<SegmentList> getSegmentList() {
            return this.segmentList;
        }

        public static final class Builder {
            private java.util.List<SegmentList> segmentList; 

            /**
             * segment_list.
             */
            public Builder segmentList(java.util.List<SegmentList> segmentList) {
                this.segmentList = segmentList;
                return this;
            }

            public ChangedJourneys build() {
                return new ChangedJourneys(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeApplyRequest} extends {@link TeaModel}
     *
     * <p>ChangeApplyRequest</p>
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
}
