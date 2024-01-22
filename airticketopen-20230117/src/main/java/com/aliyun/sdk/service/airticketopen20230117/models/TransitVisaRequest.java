// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransitVisaRequest} extends {@link RequestModel}
 *
 * <p>TransitVisaRequest</p>
 */
public class TransitVisaRequest extends Request {
    @Body
    @NameInMap("flight_segment_param_list")
    private java.util.List < FlightSegmentParamList> flightSegmentParamList;

    @Header
    @NameInMap("x-acs-airticket-access-token")
    @Validation(required = true)
    private String xAcsAirticketAccessToken;

    @Header
    @NameInMap("x-acs-airticket-language")
    private String xAcsAirticketLanguage;

    private TransitVisaRequest(Builder builder) {
        super(builder);
        this.flightSegmentParamList = builder.flightSegmentParamList;
        this.xAcsAirticketAccessToken = builder.xAcsAirticketAccessToken;
        this.xAcsAirticketLanguage = builder.xAcsAirticketLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransitVisaRequest create() {
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

    public static final class Builder extends Request.Builder<TransitVisaRequest, Builder> {
        private java.util.List < FlightSegmentParamList> flightSegmentParamList; 
        private String xAcsAirticketAccessToken; 
        private String xAcsAirticketLanguage; 

        private Builder() {
            super();
        } 

        private Builder(TransitVisaRequest request) {
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
            this.putBodyParameter("flight_segment_param_list", flightSegmentParamListShrink);
            this.flightSegmentParamList = flightSegmentParamList;
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
        public TransitVisaRequest build() {
            return new TransitVisaRequest(this);
        } 

    } 

    public static class FlightSegmentParamList extends TeaModel {
        @NameInMap("arrival_airport")
        @Validation(required = true)
        private String arrivalAirport;

        @NameInMap("arrival_terminal")
        private String arrivalTerminal;

        @NameInMap("arrival_time")
        @Validation(required = true)
        private Long arrivalTime;

        @NameInMap("code_share")
        @Validation(required = true)
        private Boolean codeShare;

        @NameInMap("departure_airport")
        @Validation(required = true)
        private String departureAirport;

        @NameInMap("departure_terminal")
        private String departureTerminal;

        @NameInMap("departure_time")
        @Validation(required = true)
        private Long departureTime;

        @NameInMap("marketing_airline")
        @Validation(required = true)
        private String marketingAirline;

        @NameInMap("marketing_flight_no")
        @Validation(required = true)
        private String marketingFlightNo;

        @NameInMap("operating_airline")
        private String operatingAirline;

        @NameInMap("stop_city_list")
        private String stopCityList;

        @NameInMap("ticketing_airline")
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
             * arrival_airport.
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
             * arrival_time.
             */
            public Builder arrivalTime(Long arrivalTime) {
                this.arrivalTime = arrivalTime;
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
