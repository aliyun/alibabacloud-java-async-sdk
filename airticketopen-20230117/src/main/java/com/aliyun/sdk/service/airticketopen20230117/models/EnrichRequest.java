// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnrichRequest} extends {@link RequestModel}
 *
 * <p>EnrichRequest</p>
 */
public class EnrichRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("adults")
    private Integer adults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cabin_class")
    private String cabinClass;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("children")
    private Integer children;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("infants")
    private Integer infants;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("journey_param_list")
    private java.util.List < JourneyParamList> journeyParamList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("solution_id")
    private String solutionId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-access-token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xAcsAirticketAccessToken;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-language")
    private String xAcsAirticketLanguage;

    private EnrichRequest(Builder builder) {
        super(builder);
        this.adults = builder.adults;
        this.cabinClass = builder.cabinClass;
        this.children = builder.children;
        this.infants = builder.infants;
        this.journeyParamList = builder.journeyParamList;
        this.solutionId = builder.solutionId;
        this.xAcsAirticketAccessToken = builder.xAcsAirticketAccessToken;
        this.xAcsAirticketLanguage = builder.xAcsAirticketLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnrichRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adults
     */
    public Integer getAdults() {
        return this.adults;
    }

    /**
     * @return cabinClass
     */
    public String getCabinClass() {
        return this.cabinClass;
    }

    /**
     * @return children
     */
    public Integer getChildren() {
        return this.children;
    }

    /**
     * @return infants
     */
    public Integer getInfants() {
        return this.infants;
    }

    /**
     * @return journeyParamList
     */
    public java.util.List < JourneyParamList> getJourneyParamList() {
        return this.journeyParamList;
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

    public static final class Builder extends Request.Builder<EnrichRequest, Builder> {
        private Integer adults; 
        private String cabinClass; 
        private Integer children; 
        private Integer infants; 
        private java.util.List < JourneyParamList> journeyParamList; 
        private String solutionId; 
        private String xAcsAirticketAccessToken; 
        private String xAcsAirticketLanguage; 

        private Builder() {
            super();
        } 

        private Builder(EnrichRequest request) {
            super(request);
            this.adults = request.adults;
            this.cabinClass = request.cabinClass;
            this.children = request.children;
            this.infants = request.infants;
            this.journeyParamList = request.journeyParamList;
            this.solutionId = request.solutionId;
            this.xAcsAirticketAccessToken = request.xAcsAirticketAccessToken;
            this.xAcsAirticketLanguage = request.xAcsAirticketLanguage;
        } 

        /**
         * <p>adult passenger amount 1-9</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder adults(Integer adults) {
            this.putBodyParameter("adults", adults);
            this.adults = adults;
            return this;
        }

        /**
         * <p>cabin class</p>
         * <ol>
         * <li><strong>ALL_CABIN</strong> : all cabin class</li>
         * <li><strong>Y</strong> : economy class</li>
         * <li><strong>FC</strong> : first class and business class</li>
         * <li><strong>S</strong> : premium economy class</li>
         * <li><strong>YS</strong> : economy class and premium economy class</li>
         * <li><strong>YSC</strong> : economy class, premium economy class and business class</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>ALL_CABIN</p>
         */
        public Builder cabinClass(String cabinClass) {
            this.putBodyParameter("cabin_class", cabinClass);
            this.cabinClass = cabinClass;
            return this;
        }

        /**
         * <p>child passenger amount 0-9</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder children(Integer children) {
            this.putBodyParameter("children", children);
            this.children = children;
            return this;
        }

        /**
         * <p>infant passenger amount 0-9</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder infants(Integer infants) {
            this.putBodyParameter("infants", infants);
            this.infants = infants;
            return this;
        }

        /**
         * <p>journey list</p>
         */
        public Builder journeyParamList(java.util.List < JourneyParamList> journeyParamList) {
            String journeyParamListShrink = shrink(journeyParamList, "journey_param_list", "json");
            this.putBodyParameter("journey_param_list", journeyParamListShrink);
            this.journeyParamList = journeyParamList;
            return this;
        }

        /**
         * <p>solution_id returned by Search</p>
         * 
         * <strong>example:</strong>
         * <p>eJwz8DeySEo0NjQ01TU3TU7TNTFINNO1SE5O0jVKM0hKNjEwTElLNYwz0A32cNT1dfPVNTIwMjYwNjRQ8/A3NLI01Q0Ic0cRBwBVFxJJ</p>
         */
        public Builder solutionId(String solutionId) {
            this.putBodyParameter("solution_id", solutionId);
            this.solutionId = solutionId;
            return this;
        }

        /**
         * <p>access token</p>
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
         * <p>language code(refer to ISO_639), defaults to the buyer&quot;s account configuration</p>
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
        public EnrichRequest build() {
            return new EnrichRequest(this);
        } 

    } 

    /**
     * 
     * {@link EnrichRequest} extends {@link TeaModel}
     *
     * <p>EnrichRequest</p>
     */
    public static class SegmentParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arrival_airport")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrivalAirport;

        @com.aliyun.core.annotation.NameInMap("arrival_city")
        private String arrivalCity;

        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("child_cabin")
        private String childCabin;

        @com.aliyun.core.annotation.NameInMap("departure_airport")
        @com.aliyun.core.annotation.Validation(required = true)
        private String departureAirport;

        @com.aliyun.core.annotation.NameInMap("departure_city")
        private String departureCity;

        @com.aliyun.core.annotation.NameInMap("departure_time")
        @com.aliyun.core.annotation.Validation(required = true)
        private String departureTime;

        @com.aliyun.core.annotation.NameInMap("marketing_flight_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String marketingFlightNo;

        private SegmentParamList(Builder builder) {
            this.arrivalAirport = builder.arrivalAirport;
            this.arrivalCity = builder.arrivalCity;
            this.cabin = builder.cabin;
            this.childCabin = builder.childCabin;
            this.departureAirport = builder.departureAirport;
            this.departureCity = builder.departureCity;
            this.departureTime = builder.departureTime;
            this.marketingFlightNo = builder.marketingFlightNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentParamList create() {
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
         * @return cabin
         */
        public String getCabin() {
            return this.cabin;
        }

        /**
         * @return childCabin
         */
        public String getChildCabin() {
            return this.childCabin;
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
         * @return departureTime
         */
        public String getDepartureTime() {
            return this.departureTime;
        }

        /**
         * @return marketingFlightNo
         */
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public static final class Builder {
            private String arrivalAirport; 
            private String arrivalCity; 
            private String cabin; 
            private String childCabin; 
            private String departureAirport; 
            private String departureCity; 
            private String departureTime; 
            private String marketingFlightNo; 

            /**
             * <p>arrival airport code (capitalized)</p>
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
             * <p>child RBD</p>
             * 
             * <strong>example:</strong>
             * <p>E</p>
             */
            public Builder childCabin(String childCabin) {
                this.childCabin = childCabin;
                return this;
            }

            /**
             * <p>departure airport code (capitalized)</p>
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
             * <p>departure time in string format (yyyy-MM-dd HH:mm:ss)</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-10 07:55:00</p>
             */
            public Builder departureTime(String departureTime) {
                this.departureTime = departureTime;
                return this;
            }

            /**
             * <p>marketing flight no. (eg: KA5809)</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HO1295</p>
             */
            public Builder marketingFlightNo(String marketingFlightNo) {
                this.marketingFlightNo = marketingFlightNo;
                return this;
            }

            public SegmentParamList build() {
                return new SegmentParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnrichRequest} extends {@link TeaModel}
     *
     * <p>EnrichRequest</p>
     */
    public static class JourneyParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arrival_city")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrivalCity;

        @com.aliyun.core.annotation.NameInMap("departure_city")
        @com.aliyun.core.annotation.Validation(required = true)
        private String departureCity;

        @com.aliyun.core.annotation.NameInMap("departure_date")
        @com.aliyun.core.annotation.Validation(required = true)
        private String departureDate;

        @com.aliyun.core.annotation.NameInMap("segment_param_list")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < SegmentParamList> segmentParamList;

        private JourneyParamList(Builder builder) {
            this.arrivalCity = builder.arrivalCity;
            this.departureCity = builder.departureCity;
            this.departureDate = builder.departureDate;
            this.segmentParamList = builder.segmentParamList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JourneyParamList create() {
            return builder().build();
        }

        /**
         * @return arrivalCity
         */
        public String getArrivalCity() {
            return this.arrivalCity;
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
         * @return segmentParamList
         */
        public java.util.List < SegmentParamList> getSegmentParamList() {
            return this.segmentParamList;
        }

        public static final class Builder {
            private String arrivalCity; 
            private String departureCity; 
            private String departureDate; 
            private java.util.List < SegmentParamList> segmentParamList; 

            /**
             * <p>arrival city code (capitalized)</p>
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
             * <p>departure city code (capitalized)</p>
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
             * <p>departure date (eg: yyyyMMdd)</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20230310</p>
             */
            public Builder departureDate(String departureDate) {
                this.departureDate = departureDate;
                return this;
            }

            /**
             * <p>segement param list</p>
             * <p>This parameter is required.</p>
             */
            public Builder segmentParamList(java.util.List < SegmentParamList> segmentParamList) {
                this.segmentParamList = segmentParamList;
                return this;
            }

            public JourneyParamList build() {
                return new JourneyParamList(this);
            } 

        } 

    }
}
