// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < RefundJourneys> refundJourneys;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("refund_passenger_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < RefundPassengerList> refundPassengerList;

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
    public java.util.List < RefundJourneys> getRefundJourneys() {
        return this.refundJourneys;
    }

    /**
     * @return refundPassengerList
     */
    public java.util.List < RefundPassengerList> getRefundPassengerList() {
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
        private java.util.List < RefundJourneys> refundJourneys; 
        private java.util.List < RefundPassengerList> refundPassengerList; 
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
         * order_num.
         */
        public Builder orderNum(Long orderNum) {
            this.putBodyParameter("order_num", orderNum);
            this.orderNum = orderNum;
            return this;
        }

        /**
         * refund_journeys.
         */
        public Builder refundJourneys(java.util.List < RefundJourneys> refundJourneys) {
            String refundJourneysShrink = shrink(refundJourneys, "refund_journeys", "json");
            this.putBodyParameter("refund_journeys", refundJourneysShrink);
            this.refundJourneys = refundJourneys;
            return this;
        }

        /**
         * refund_passenger_list.
         */
        public Builder refundPassengerList(java.util.List < RefundPassengerList> refundPassengerList) {
            String refundPassengerListShrink = shrink(refundPassengerList, "refund_passenger_list", "json");
            this.putBodyParameter("refund_passenger_list", refundPassengerListShrink);
            this.refundPassengerList = refundPassengerList;
            return this;
        }

        /**
         * refund_type.
         */
        public Builder refundType(RefundType refundType) {
            String refundTypeShrink = shrink(refundType, "refund_type", "json");
            this.putBodyParameter("refund_type", refundTypeShrink);
            this.refundType = refundType;
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
        public RefundApplyRequest build() {
            return new RefundApplyRequest(this);
        } 

    } 

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

            public SegmentList build() {
                return new SegmentList(this);
            } 

        } 

    }
    public static class RefundJourneys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_list")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < SegmentList> segmentList;

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

            public RefundJourneys build() {
                return new RefundJourneys(this);
            } 

        } 

    }
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

            public RefundPassengerList build() {
                return new RefundPassengerList(this);
            } 

        } 

    }
    public static class RefundType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("file")
        private java.util.List < String > file;

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
        public java.util.List < String > getFile() {
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
            private java.util.List < String > file; 
            private Integer refundTypeId; 
            private String remark; 

            /**
             * file.
             */
            public Builder file(java.util.List < String > file) {
                this.file = file;
                return this;
            }

            /**
             * refund_type_id.
             */
            public Builder refundTypeId(Integer refundTypeId) {
                this.refundTypeId = refundTypeId;
                return this;
            }

            /**
             * remark.
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
