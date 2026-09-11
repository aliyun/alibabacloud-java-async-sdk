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
 * {@link RefundApplyRequest} extends {@link RequestModel}
 *
 * <p>RefundApplyRequest</p>
 */
public class RefundApplyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_num")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orderNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("refund_journeys")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RefundJourneys> refundJourneys;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("refund_passenger_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RefundPassengerList> refundPassengerList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("refund_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private RefundType refundType;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-access-token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xAcsAirticketAccessToken;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-language")
    private String xAcsAirticketLanguage;

    private RefundApplyRequest(Builder builder) {
        super(builder);
        this.orderNum = builder.orderNum;
        this.refundJourneys = builder.refundJourneys;
        this.refundPassengerList = builder.refundPassengerList;
        this.refundType = builder.refundType;
        this.xAcsAirticketAccessToken = builder.xAcsAirticketAccessToken;
        this.xAcsAirticketLanguage = builder.xAcsAirticketLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundApplyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderNum
     */
    public Long getOrderNum() {
        return this.orderNum;
    }

    /**
     * @return refundJourneys
     */
    public java.util.List<RefundJourneys> getRefundJourneys() {
        return this.refundJourneys;
    }

    /**
     * @return refundPassengerList
     */
    public java.util.List<RefundPassengerList> getRefundPassengerList() {
        return this.refundPassengerList;
    }

    /**
     * @return refundType
     */
    public RefundType getRefundType() {
        return this.refundType;
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

    public static final class Builder extends Request.Builder<RefundApplyRequest, Builder> {
        private Long orderNum; 
        private java.util.List<RefundJourneys> refundJourneys; 
        private java.util.List<RefundPassengerList> refundPassengerList; 
        private RefundType refundType; 
        private String xAcsAirticketAccessToken; 
        private String xAcsAirticketLanguage; 

        private Builder() {
            super();
        } 

        private Builder(RefundApplyRequest request) {
            super(request);
            this.orderNum = request.orderNum;
            this.refundJourneys = request.refundJourneys;
            this.refundPassengerList = request.refundPassengerList;
            this.refundType = request.refundType;
            this.xAcsAirticketAccessToken = request.xAcsAirticketAccessToken;
            this.xAcsAirticketLanguage = request.xAcsAirticketLanguage;
        } 

        /**
         * <p>The order number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4966***617111</p>
         */
        public Builder orderNum(Long orderNum) {
            this.putBodyParameter("order_num", orderNum);
            this.orderNum = orderNum;
            return this;
        }

        /**
         * <p>The journeys for the refund application.</p>
         * <p>This parameter is required.</p>
         */
        public Builder refundJourneys(java.util.List<RefundJourneys> refundJourneys) {
            String refundJourneysShrink = shrink(refundJourneys, "refund_journeys", "json");
            this.putBodyParameter("refund_journeys", refundJourneysShrink);
            this.refundJourneys = refundJourneys;
            return this;
        }

        /**
         * <p>The list of passengers for the refund application.</p>
         * <p>This parameter is required.</p>
         */
        public Builder refundPassengerList(java.util.List<RefundPassengerList> refundPassengerList) {
            String refundPassengerListShrink = shrink(refundPassengerList, "refund_passenger_list", "json");
            this.putBodyParameter("refund_passenger_list", refundPassengerListShrink);
            this.refundPassengerList = refundPassengerList;
            return this;
        }

        /**
         * <p>The refund type. Attachments are required for involuntary refund applications.</p>
         * <p>This parameter is required.</p>
         */
        public Builder refundType(RefundType refundType) {
            String refundTypeShrink = shrink(refundType, "refund_type", "json");
            this.putBodyParameter("refund_type", refundTypeShrink);
            this.refundType = refundType;
            return this;
        }

        /**
         * <p>The access_token.</p>
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
         * <p>The language setting. Defaults to the buyer account configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>en_US</p>
         */
        public Builder xAcsAirticketLanguage(String xAcsAirticketLanguage) {
            this.putHeaderParameter("x-acs-airticket-language", xAcsAirticketLanguage);
            this.xAcsAirticketLanguage = xAcsAirticketLanguage;
            return this;
        }

        @Override
        public RefundApplyRequest build() {
            return new RefundApplyRequest(this);
        } 

    } 

    /**
     * 
     * {@link RefundApplyRequest} extends {@link TeaModel}
     *
     * <p>RefundApplyRequest</p>
     */
    public static class SegmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arrival_airport")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrivalAirport;

        @com.aliyun.core.annotation.NameInMap("arrival_city")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrivalCity;

        @com.aliyun.core.annotation.NameInMap("departure_airport")
        @com.aliyun.core.annotation.Validation(required = true)
        private String departureAirport;

        @com.aliyun.core.annotation.NameInMap("departure_city")
        @com.aliyun.core.annotation.Validation(required = true)
        private String departureCity;

        private SegmentList(Builder builder) {
            this.arrivalAirport = builder.arrivalAirport;
            this.arrivalCity = builder.arrivalCity;
            this.departureAirport = builder.departureAirport;
            this.departureCity = builder.departureCity;
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

        public static final class Builder {
            private String arrivalAirport; 
            private String arrivalCity; 
            private String departureAirport; 
            private String departureCity; 

            private Builder() {
            } 

            private Builder(SegmentList model) {
                this.arrivalAirport = model.arrivalAirport;
                this.arrivalCity = model.arrivalCity;
                this.departureAirport = model.departureAirport;
                this.departureCity = model.departureCity;
            } 

            /**
             * <p>The three-letter IATA code of the arrival airport (uppercase).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MFM</p>
             */
            public Builder arrivalAirport(String arrivalAirport) {
                this.arrivalAirport = arrivalAirport;
                return this;
            }

            /**
             * <p>The three-letter IATA code of the arrival city (uppercase).</p>
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
             * <p>The three-letter IATA code of the departure airport (uppercase).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PVG</p>
             */
            public Builder departureAirport(String departureAirport) {
                this.departureAirport = departureAirport;
                return this;
            }

            /**
             * <p>The three-letter IATA code of the departure city (uppercase).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SHA</p>
             */
            public Builder departureCity(String departureCity) {
                this.departureCity = departureCity;
                return this;
            }

            public SegmentList build() {
                return new SegmentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RefundApplyRequest} extends {@link TeaModel}
     *
     * <p>RefundApplyRequest</p>
     */
    public static class RefundJourneys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_list")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<SegmentList> segmentList;

        private RefundJourneys(Builder builder) {
            this.segmentList = builder.segmentList;
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
        public java.util.List<SegmentList> getSegmentList() {
            return this.segmentList;
        }

        public static final class Builder {
            private java.util.List<SegmentList> segmentList; 

            private Builder() {
            } 

            private Builder(RefundJourneys model) {
                this.segmentList = model.segmentList;
            } 

            /**
             * <p>The segment information.</p>
             * <p>This parameter is required.</p>
             */
            public Builder segmentList(java.util.List<SegmentList> segmentList) {
                this.segmentList = segmentList;
                return this;
            }

            public RefundJourneys build() {
                return new RefundJourneys(this);
            } 

        } 

    }
    /**
     * 
     * {@link RefundApplyRequest} extends {@link TeaModel}
     *
     * <p>RefundApplyRequest</p>
     */
    public static class RefundPassengerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("document")
        private String document;

        @com.aliyun.core.annotation.NameInMap("first_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("last_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String lastName;

        private RefundPassengerList(Builder builder) {
            this.document = builder.document;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundPassengerList create() {
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

            private Builder(RefundPassengerList model) {
                this.document = model.document;
                this.firstName = model.firstName;
                this.lastName = model.lastName;
            } 

            /**
             * <p>The document number of the passenger.</p>
             * 
             * <strong>example:</strong>
             * <p>411***********4411</p>
             */
            public Builder document(String document) {
                this.document = document;
                return this;
            }

            /**
             * <p>The first name of the passenger.</p>
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
             * <p>The last name of the passenger.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ZHANG</p>
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            public RefundPassengerList build() {
                return new RefundPassengerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RefundApplyRequest} extends {@link TeaModel}
     *
     * <p>RefundApplyRequest</p>
     */
    public static class RefundType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("file")
        private java.util.List<String> file;

        @com.aliyun.core.annotation.NameInMap("refund_type_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer refundTypeId;

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        private RefundType(Builder builder) {
            this.file = builder.file;
            this.refundTypeId = builder.refundTypeId;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundType create() {
            return builder().build();
        }

        /**
         * @return file
         */
        public java.util.List<String> getFile() {
            return this.file;
        }

        /**
         * @return refundTypeId
         */
        public Integer getRefundTypeId() {
            return this.refundTypeId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private java.util.List<String> file; 
            private Integer refundTypeId; 
            private String remark; 

            private Builder() {
            } 

            private Builder(RefundType model) {
                this.file = model.file;
                this.refundTypeId = model.refundTypeId;
                this.remark = model.remark;
            } 

            /**
             * <p>The array of attachment file URLs. Upload files first by using the dedicated file upload operation to obtain the file URLs.</p>
             * 
             * <strong>example:</strong>
             * <p>[xxx,yyy]</p>
             */
            public Builder file(java.util.List<String> file) {
                this.file = file;
                return this;
            }

            /**
             * <p>The refund type. Valid values:</p>
             * <ul>
             * <li>2: Voluntary refund (change of travel plans or decision not to fly).</li>
             * <li>5: Involuntary refund due to airline reasons such as flight delay, cancellation, or schedule change.</li>
             * <li>6: Involuntary refund due to medical reasons with a certificate from a Grade II Class A hospital or above.</li>
             * </ul>
             * <p>Note: Attachments are not mandatory, but providing attachments for involuntary refunds can improve the success rate of the refund application.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder refundTypeId(Integer refundTypeId) {
                this.refundTypeId = refundTypeId;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>remark desc</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public RefundType build() {
                return new RefundType(this);
            } 

        } 

    }
}
