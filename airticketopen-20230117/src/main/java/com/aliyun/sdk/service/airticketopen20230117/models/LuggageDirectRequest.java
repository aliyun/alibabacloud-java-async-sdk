// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link LuggageDirectRequest} extends {@link RequestModel}
 *
 * <p>LuggageDirectRequest</p>
 */
public class LuggageDirectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("flight_segment_param_list")
    private java.util.List < FlightSegmentParamList> flightSegmentParamList;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-access-token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xAcsAirticketAccessToken;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-language")
    private String xAcsAirticketLanguage;

    private LuggageDirectRequest(Builder builder) {
        super(builder);
        this.flightSegmentParamList = builder.flightSegmentParamList;
        this.xAcsAirticketAccessToken = builder.xAcsAirticketAccessToken;
        this.xAcsAirticketLanguage = builder.xAcsAirticketLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LuggageDirectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flightSegmentParamList
     */
    public java.util.List < FlightSegmentParamList> getFlightSegmentParamList() {
        return this.flightSegmentParamList;
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

    public static final class Builder extends Request.Builder<LuggageDirectRequest, Builder> {
        private java.util.List < FlightSegmentParamList> flightSegmentParamList; 
        private String xAcsAirticketAccessToken; 
        private String xAcsAirticketLanguage; 

        private Builder() {
            super();
        } 

        private Builder(LuggageDirectRequest request) {
            super(request);
            this.flightSegmentParamList = request.flightSegmentParamList;
            this.xAcsAirticketAccessToken = request.xAcsAirticketAccessToken;
            this.xAcsAirticketLanguage = request.xAcsAirticketLanguage;
        } 

        /**
         * flight_segment_param_list.
         */
        public Builder flightSegmentParamList(java.util.List < FlightSegmentParamList> flightSegmentParamList) {
            String flightSegmentParamListShrink = shrink(flightSegmentParamList, "flight_segment_param_list", "json");
            this.putQueryParameter("flight_segment_param_list", flightSegmentParamListShrink);
            this.flightSegmentParamList = flightSegmentParamList;
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
        public LuggageDirectRequest build() {
            return new LuggageDirectRequest(this);
        } 

    } 

    /**
     * 
     * {@link LuggageDirectRequest} extends {@link TeaModel}
     *
     * <p>LuggageDirectRequest</p>
     */
    public static class FlightSegmentParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arrival_airport")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrivalAirport;

        @com.aliyun.core.annotation.NameInMap("arrival_terminal")
        private String arrivalTerminal;

        @com.aliyun.core.annotation.NameInMap("arrival_time")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long arrivalTime;

        @com.aliyun.core.annotation.NameInMap("code_share")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean codeShare;

        @com.aliyun.core.annotation.NameInMap("departure_airport")
        @com.aliyun.core.annotation.Validation(required = true)
        private String departureAirport;

        @com.aliyun.core.annotation.NameInMap("departure_terminal")
        private String departureTerminal;

        @com.aliyun.core.annotation.NameInMap("departure_time")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long departureTime;

        @com.aliyun.core.annotation.NameInMap("marketing_airline")
        @com.aliyun.core.annotation.Validation(required = true)
        private String marketingAirline;

        @com.aliyun.core.annotation.NameInMap("marketing_flight_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String marketingFlightNo;

        @com.aliyun.core.annotation.NameInMap("operating_airline")
        private String operatingAirline;

        @com.aliyun.core.annotation.NameInMap("stop_city_list")
        private String stopCityList;

        @com.aliyun.core.annotation.NameInMap("ticketing_airline")
        private String ticketingAirline;

        private FlightSegmentParamList(Builder builder) {
            this.arrivalAirport = builder.arrivalAirport;
            this.arrivalTerminal = builder.arrivalTerminal;
            this.arrivalTime = builder.arrivalTime;
            this.codeShare = builder.codeShare;
            this.departureAirport = builder.departureAirport;
            this.departureTerminal = builder.departureTerminal;
            this.departureTime = builder.departureTime;
            this.marketingAirline = builder.marketingAirline;
            this.marketingFlightNo = builder.marketingFlightNo;
            this.operatingAirline = builder.operatingAirline;
            this.stopCityList = builder.stopCityList;
            this.ticketingAirline = builder.ticketingAirline;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightSegmentParamList create() {
            return builder().build();
        }

        /**
         * @return arrivalAirport
         */
        public String getArrivalAirport() {
            return this.arrivalAirport;
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
        public Long getArrivalTime() {
            return this.arrivalTime;
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
         * @return operatingAirline
         */
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        /**
         * @return stopCityList
         */
        public String getStopCityList() {
            return this.stopCityList;
        }

        /**
         * @return ticketingAirline
         */
        public String getTicketingAirline() {
            return this.ticketingAirline;
        }

        public static final class Builder {
            private String arrivalAirport; 
            private String arrivalTerminal; 
            private Long arrivalTime; 
            private Boolean codeShare; 
            private String departureAirport; 
            private String departureTerminal; 
            private Long departureTime; 
            private String marketingAirline; 
            private String marketingFlightNo; 
            private String operatingAirline; 
            private String stopCityList; 
            private String ticketingAirline; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SIN</p>
             */
            public Builder arrivalAirport(String arrivalAirport) {
                this.arrivalAirport = arrivalAirport;
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1705285430445</p>
             */
            public Builder arrivalTime(Long arrivalTime) {
                this.arrivalTime = arrivalTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder codeShare(Boolean codeShare) {
                this.codeShare = codeShare;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HGH</p>
             */
            public Builder departureAirport(String departureAirport) {
                this.departureAirport = departureAirport;
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1705285430445</p>
             */
            public Builder departureTime(Long departureTime) {
                this.departureTime = departureTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CZ</p>
             */
            public Builder marketingAirline(String marketingAirline) {
                this.marketingAirline = marketingAirline;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CZ616</p>
             */
            public Builder marketingFlightNo(String marketingFlightNo) {
                this.marketingFlightNo = marketingFlightNo;
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
             * stop_city_list.
             */
            public Builder stopCityList(String stopCityList) {
                this.stopCityList = stopCityList;
                return this;
            }

            /**
             * ticketing_airline.
             */
            public Builder ticketingAirline(String ticketingAirline) {
                this.ticketingAirline = ticketingAirline;
                return this;
            }

            public FlightSegmentParamList build() {
                return new FlightSegmentParamList(this);
            } 

        } 

    }
}
