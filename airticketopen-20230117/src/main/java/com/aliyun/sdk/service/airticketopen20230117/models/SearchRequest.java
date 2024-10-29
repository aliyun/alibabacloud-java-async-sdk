// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchRequest} extends {@link RequestModel}
 *
 * <p>SearchRequest</p>
 */
public class SearchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("adults")
    private Integer adults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("air_legs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < AirLegs> airLegs;

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
    @com.aliyun.core.annotation.NameInMap("search_control_options")
    private SearchControlOptions searchControlOptions;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-access-token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xAcsAirticketAccessToken;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-language")
    private String xAcsAirticketLanguage;

    private SearchRequest(Builder builder) {
        super(builder);
        this.adults = builder.adults;
        this.airLegs = builder.airLegs;
        this.cabinClass = builder.cabinClass;
        this.children = builder.children;
        this.infants = builder.infants;
        this.searchControlOptions = builder.searchControlOptions;
        this.xAcsAirticketAccessToken = builder.xAcsAirticketAccessToken;
        this.xAcsAirticketLanguage = builder.xAcsAirticketLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchRequest create() {
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
     * @return airLegs
     */
    public java.util.List < AirLegs> getAirLegs() {
        return this.airLegs;
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
     * @return searchControlOptions
     */
    public SearchControlOptions getSearchControlOptions() {
        return this.searchControlOptions;
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

    public static final class Builder extends Request.Builder<SearchRequest, Builder> {
        private Integer adults; 
        private java.util.List < AirLegs> airLegs; 
        private String cabinClass; 
        private Integer children; 
        private Integer infants; 
        private SearchControlOptions searchControlOptions; 
        private String xAcsAirticketAccessToken; 
        private String xAcsAirticketLanguage; 

        private Builder() {
            super();
        } 

        private Builder(SearchRequest request) {
            super(request);
            this.adults = request.adults;
            this.airLegs = request.airLegs;
            this.cabinClass = request.cabinClass;
            this.children = request.children;
            this.infants = request.infants;
            this.searchControlOptions = request.searchControlOptions;
            this.xAcsAirticketAccessToken = request.xAcsAirticketAccessToken;
            this.xAcsAirticketLanguage = request.xAcsAirticketLanguage;
        } 

        /**
         * <p>adult passenger amount 1-9</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder adults(Integer adults) {
            this.putBodyParameter("adults", adults);
            this.adults = adults;
            return this;
        }

        /**
         * <p>itinerary list</p>
         * <p>This parameter is required.</p>
         */
        public Builder airLegs(java.util.List < AirLegs> airLegs) {
            String airLegsShrink = shrink(airLegs, "air_legs", "json");
            this.putBodyParameter("air_legs", airLegsShrink);
            this.airLegs = airLegs;
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
         * <p>search controls</p>
         */
        public Builder searchControlOptions(SearchControlOptions searchControlOptions) {
            String searchControlOptionsShrink = shrink(searchControlOptions, "search_control_options", "json");
            this.putBodyParameter("search_control_options", searchControlOptionsShrink);
            this.searchControlOptions = searchControlOptions;
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
        public SearchRequest build() {
            return new SearchRequest(this);
        } 

    } 

    /**
     * 
     * {@link SearchRequest} extends {@link TeaModel}
     *
     * <p>SearchRequest</p>
     */
    public static class AirLegs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arrival_airport_list")
        private java.util.List < String > arrivalAirportList;

        @com.aliyun.core.annotation.NameInMap("arrival_city")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrivalCity;

        @com.aliyun.core.annotation.NameInMap("departure_airport_list")
        private java.util.List < String > departureAirportList;

        @com.aliyun.core.annotation.NameInMap("departure_city")
        @com.aliyun.core.annotation.Validation(required = true)
        private String departureCity;

        @com.aliyun.core.annotation.NameInMap("departure_date")
        @com.aliyun.core.annotation.Validation(required = true)
        private String departureDate;

        private AirLegs(Builder builder) {
            this.arrivalAirportList = builder.arrivalAirportList;
            this.arrivalCity = builder.arrivalCity;
            this.departureAirportList = builder.departureAirportList;
            this.departureCity = builder.departureCity;
            this.departureDate = builder.departureDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AirLegs create() {
            return builder().build();
        }

        /**
         * @return arrivalAirportList
         */
        public java.util.List < String > getArrivalAirportList() {
            return this.arrivalAirportList;
        }

        /**
         * @return arrivalCity
         */
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        /**
         * @return departureAirportList
         */
        public java.util.List < String > getDepartureAirportList() {
            return this.departureAirportList;
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

        public static final class Builder {
            private java.util.List < String > arrivalAirportList; 
            private String arrivalCity; 
            private java.util.List < String > departureAirportList; 
            private String departureCity; 
            private String departureDate; 

            /**
             * <p>arrival airport [IATA airport code] list</p>
             * 
             * <strong>example:</strong>
             * <p>MFM</p>
             */
            public Builder arrivalAirportList(java.util.List < String > arrivalAirportList) {
                this.arrivalAirportList = arrivalAirportList;
                return this;
            }

            /**
             * <p>arrival city code</p>
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
             * <p>departure airport [IATA airport code] list</p>
             * 
             * <strong>example:</strong>
             * <p>PVG</p>
             */
            public Builder departureAirportList(java.util.List < String > departureAirportList) {
                this.departureAirportList = departureAirportList;
                return this;
            }

            /**
             * <p>departure city code</p>
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

            public AirLegs build() {
                return new AirLegs(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchRequest} extends {@link TeaModel}
     *
     * <p>SearchRequest</p>
     */
    public static class SearchControlOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_excluded_list")
        private java.util.List < String > airlineExcludedList;

        @com.aliyun.core.annotation.NameInMap("airline_prefer_list")
        private java.util.List < String > airlinePreferList;

        private SearchControlOptions(Builder builder) {
            this.airlineExcludedList = builder.airlineExcludedList;
            this.airlinePreferList = builder.airlinePreferList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchControlOptions create() {
            return builder().build();
        }

        /**
         * @return airlineExcludedList
         */
        public java.util.List < String > getAirlineExcludedList() {
            return this.airlineExcludedList;
        }

        /**
         * @return airlinePreferList
         */
        public java.util.List < String > getAirlinePreferList() {
            return this.airlinePreferList;
        }

        public static final class Builder {
            private java.util.List < String > airlineExcludedList; 
            private java.util.List < String > airlinePreferList; 

            /**
             * <p>excluded airlines list</p>
             */
            public Builder airlineExcludedList(java.util.List < String > airlineExcludedList) {
                this.airlineExcludedList = airlineExcludedList;
                return this;
            }

            /**
             * <p>preferred airlines list</p>
             */
            public Builder airlinePreferList(java.util.List < String > airlinePreferList) {
                this.airlinePreferList = airlinePreferList;
                return this;
            }

            public SearchControlOptions build() {
                return new SearchControlOptions(this);
            } 

        } 

    }
}
