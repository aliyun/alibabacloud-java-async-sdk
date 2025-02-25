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
 * {@link CollectFlightLowestPriceRequest} extends {@link RequestModel}
 *
 * <p>CollectFlightLowestPriceRequest</p>
 */
public class CollectFlightLowestPriceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("lowest_price_flight_info_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<LowestPriceFlightInfoList> lowestPriceFlightInfoList;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-access-token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xAcsAirticketAccessToken;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-language")
    private String xAcsAirticketLanguage;

    private CollectFlightLowestPriceRequest(Builder builder) {
        super(builder);
        this.lowestPriceFlightInfoList = builder.lowestPriceFlightInfoList;
        this.xAcsAirticketAccessToken = builder.xAcsAirticketAccessToken;
        this.xAcsAirticketLanguage = builder.xAcsAirticketLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CollectFlightLowestPriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lowestPriceFlightInfoList
     */
    public java.util.List<LowestPriceFlightInfoList> getLowestPriceFlightInfoList() {
        return this.lowestPriceFlightInfoList;
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

    public static final class Builder extends Request.Builder<CollectFlightLowestPriceRequest, Builder> {
        private java.util.List<LowestPriceFlightInfoList> lowestPriceFlightInfoList; 
        private String xAcsAirticketAccessToken; 
        private String xAcsAirticketLanguage; 

        private Builder() {
            super();
        } 

        private Builder(CollectFlightLowestPriceRequest request) {
            super(request);
            this.lowestPriceFlightInfoList = request.lowestPriceFlightInfoList;
            this.xAcsAirticketAccessToken = request.xAcsAirticketAccessToken;
            this.xAcsAirticketLanguage = request.xAcsAirticketLanguage;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder lowestPriceFlightInfoList(java.util.List<LowestPriceFlightInfoList> lowestPriceFlightInfoList) {
            String lowestPriceFlightInfoListShrink = shrink(lowestPriceFlightInfoList, "lowest_price_flight_info_list", "json");
            this.putBodyParameter("lowest_price_flight_info_list", lowestPriceFlightInfoListShrink);
            this.lowestPriceFlightInfoList = lowestPriceFlightInfoList;
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
        public CollectFlightLowestPriceRequest build() {
            return new CollectFlightLowestPriceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CollectFlightLowestPriceRequest} extends {@link TeaModel}
     *
     * <p>CollectFlightLowestPriceRequest</p>
     */
    public static class LowestPriceFlightInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arrival_city")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrivalCity;

        @com.aliyun.core.annotation.NameInMap("departure_city")
        @com.aliyun.core.annotation.Validation(required = true)
        private String departureCity;

        @com.aliyun.core.annotation.NameInMap("departure_date")
        @com.aliyun.core.annotation.Validation(required = true)
        private String departureDate;

        @com.aliyun.core.annotation.NameInMap("departure_flight_number")
        @com.aliyun.core.annotation.Validation(required = true)
        private String departureFlightNumber;

        @com.aliyun.core.annotation.NameInMap("market_total_price")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double marketTotalPrice;

        @com.aliyun.core.annotation.NameInMap("request_id")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("return_date")
        private String returnDate;

        @com.aliyun.core.annotation.NameInMap("return_flight_number")
        private String returnFlightNumber;

        @com.aliyun.core.annotation.NameInMap("solution_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String solutionId;

        @com.aliyun.core.annotation.NameInMap("suez_total_price")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double suezTotalPrice;

        @com.aliyun.core.annotation.NameInMap("trip_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer tripType;

        private LowestPriceFlightInfoList(Builder builder) {
            this.arrivalCity = builder.arrivalCity;
            this.departureCity = builder.departureCity;
            this.departureDate = builder.departureDate;
            this.departureFlightNumber = builder.departureFlightNumber;
            this.marketTotalPrice = builder.marketTotalPrice;
            this.requestId = builder.requestId;
            this.returnDate = builder.returnDate;
            this.returnFlightNumber = builder.returnFlightNumber;
            this.solutionId = builder.solutionId;
            this.suezTotalPrice = builder.suezTotalPrice;
            this.tripType = builder.tripType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LowestPriceFlightInfoList create() {
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
         * @return departureFlightNumber
         */
        public String getDepartureFlightNumber() {
            return this.departureFlightNumber;
        }

        /**
         * @return marketTotalPrice
         */
        public Double getMarketTotalPrice() {
            return this.marketTotalPrice;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return returnDate
         */
        public String getReturnDate() {
            return this.returnDate;
        }

        /**
         * @return returnFlightNumber
         */
        public String getReturnFlightNumber() {
            return this.returnFlightNumber;
        }

        /**
         * @return solutionId
         */
        public String getSolutionId() {
            return this.solutionId;
        }

        /**
         * @return suezTotalPrice
         */
        public Double getSuezTotalPrice() {
            return this.suezTotalPrice;
        }

        /**
         * @return tripType
         */
        public Integer getTripType() {
            return this.tripType;
        }

        public static final class Builder {
            private String arrivalCity; 
            private String departureCity; 
            private String departureDate; 
            private String departureFlightNumber; 
            private Double marketTotalPrice; 
            private String requestId; 
            private String returnDate; 
            private String returnFlightNumber; 
            private String solutionId; 
            private Double suezTotalPrice; 
            private Integer tripType; 

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
             * <p>2024-11-11</p>
             */
            public Builder departureDate(String departureDate) {
                this.departureDate = departureDate;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CA123,CA456</p>
             */
            public Builder departureFlightNumber(String departureFlightNumber) {
                this.departureFlightNumber = departureFlightNumber;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>100.0</p>
             */
            public Builder marketTotalPrice(Double marketTotalPrice) {
                this.marketTotalPrice = marketTotalPrice;
                return this;
            }

            /**
             * request_id.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * return_date.
             */
            public Builder returnDate(String returnDate) {
                this.returnDate = returnDate;
                return this;
            }

            /**
             * return_flight_number.
             */
            public Builder returnFlightNumber(String returnFlightNumber) {
                this.returnFlightNumber = returnFlightNumber;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>eJwz8DeySEo0NjQ01TU3TU7TNTFINNO1SE5O0jVKM0hKNjEwTElLNYwz0A32cNT1dfPVNTIwMjYwNjRQ8/A3NLI01Q0Ic0cRBwBVFxJJ</p>
             */
            public Builder solutionId(String solutionId) {
                this.solutionId = solutionId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>100.1</p>
             */
            public Builder suezTotalPrice(Double suezTotalPrice) {
                this.suezTotalPrice = suezTotalPrice;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tripType(Integer tripType) {
                this.tripType = tripType;
                return this;
            }

            public LowestPriceFlightInfoList build() {
                return new LowestPriceFlightInfoList(this);
            } 

        } 

    }
}
