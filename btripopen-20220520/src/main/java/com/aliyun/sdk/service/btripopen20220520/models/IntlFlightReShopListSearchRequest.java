// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link IntlFlightReShopListSearchRequest} extends {@link RequestModel}
 *
 * <p>IntlFlightReShopListSearchRequest</p>
 */
public class IntlFlightReShopListSearchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    private String outOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("out_wheel_search")
    private Boolean outWheelSearch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("passenger_journey_group_key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String passengerJourneyGroupKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("re_shop_reason_code")
    private String reShopReasonCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("search_journeys")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SearchJourneys> searchJourneys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("selected_passengers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SelectedPassengers> selectedPassengers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private IntlFlightReShopListSearchRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
        this.outOrderId = builder.outOrderId;
        this.outWheelSearch = builder.outWheelSearch;
        this.passengerJourneyGroupKey = builder.passengerJourneyGroupKey;
        this.reShopReasonCode = builder.reShopReasonCode;
        this.searchJourneys = builder.searchJourneys;
        this.selectedPassengers = builder.selectedPassengers;
        this.token = builder.token;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightReShopListSearchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return outOrderId
     */
    public String getOutOrderId() {
        return this.outOrderId;
    }

    /**
     * @return outWheelSearch
     */
    public Boolean getOutWheelSearch() {
        return this.outWheelSearch;
    }

    /**
     * @return passengerJourneyGroupKey
     */
    public String getPassengerJourneyGroupKey() {
        return this.passengerJourneyGroupKey;
    }

    /**
     * @return reShopReasonCode
     */
    public String getReShopReasonCode() {
        return this.reShopReasonCode;
    }

    /**
     * @return searchJourneys
     */
    public java.util.List<SearchJourneys> getSearchJourneys() {
        return this.searchJourneys;
    }

    /**
     * @return selectedPassengers
     */
    public java.util.List<SelectedPassengers> getSelectedPassengers() {
        return this.selectedPassengers;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<IntlFlightReShopListSearchRequest, Builder> {
        private String orderId; 
        private String outOrderId; 
        private Boolean outWheelSearch; 
        private String passengerJourneyGroupKey; 
        private String reShopReasonCode; 
        private java.util.List<SearchJourneys> searchJourneys; 
        private java.util.List<SelectedPassengers> selectedPassengers; 
        private String token; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IntlFlightReShopListSearchRequest request) {
            super(request);
            this.orderId = request.orderId;
            this.outOrderId = request.outOrderId;
            this.outWheelSearch = request.outWheelSearch;
            this.passengerJourneyGroupKey = request.passengerJourneyGroupKey;
            this.reShopReasonCode = request.reShopReasonCode;
            this.searchJourneys = request.searchJourneys;
            this.selectedPassengers = request.selectedPassengers;
            this.token = request.token;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1002027205317939247</p>
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * out_order_id.
         */
        public Builder outOrderId(String outOrderId) {
            this.putQueryParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
            return this;
        }

        /**
         * out_wheel_search.
         */
        public Builder outWheelSearch(Boolean outWheelSearch) {
            this.putQueryParameter("out_wheel_search", outWheelSearch);
            this.outWheelSearch = outWheelSearch;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>edcac4f4c79d40ccb141ddb6da567e65</p>
         */
        public Builder passengerJourneyGroupKey(String passengerJourneyGroupKey) {
            this.putQueryParameter("passenger_journey_group_key", passengerJourneyGroupKey);
            this.passengerJourneyGroupKey = passengerJourneyGroupKey;
            return this;
        }

        /**
         * re_shop_reason_code.
         */
        public Builder reShopReasonCode(String reShopReasonCode) {
            this.putQueryParameter("re_shop_reason_code", reShopReasonCode);
            this.reShopReasonCode = reShopReasonCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder searchJourneys(java.util.List<SearchJourneys> searchJourneys) {
            String searchJourneysShrink = shrink(searchJourneys, "search_journeys", "json");
            this.putQueryParameter("search_journeys", searchJourneysShrink);
            this.searchJourneys = searchJourneys;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder selectedPassengers(java.util.List<SelectedPassengers> selectedPassengers) {
            String selectedPassengersShrink = shrink(selectedPassengers, "selected_passengers", "json");
            this.putQueryParameter("selected_passengers", selectedPassengersShrink);
            this.selectedPassengers = selectedPassengers;
            return this;
        }

        /**
         * token.
         */
        public Builder token(String token) {
            this.putQueryParameter("token", token);
            this.token = token;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public IntlFlightReShopListSearchRequest build() {
            return new IntlFlightReShopListSearchRequest(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightReShopListSearchRequest} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopListSearchRequest</p>
     */
    public static class SelectedFlights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("flight_time")
        private String flightTime;

        @com.aliyun.core.annotation.NameInMap("market_flight_no")
        private String marketFlightNo;

        private SelectedFlights(Builder builder) {
            this.arrCityCode = builder.arrCityCode;
            this.depCityCode = builder.depCityCode;
            this.flightTime = builder.flightTime;
            this.marketFlightNo = builder.marketFlightNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectedFlights create() {
            return builder().build();
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return flightTime
         */
        public String getFlightTime() {
            return this.flightTime;
        }

        /**
         * @return marketFlightNo
         */
        public String getMarketFlightNo() {
            return this.marketFlightNo;
        }

        public static final class Builder {
            private String arrCityCode; 
            private String depCityCode; 
            private String flightTime; 
            private String marketFlightNo; 

            private Builder() {
            } 

            private Builder(SelectedFlights model) {
                this.arrCityCode = model.arrCityCode;
                this.depCityCode = model.depCityCode;
                this.flightTime = model.flightTime;
                this.marketFlightNo = model.marketFlightNo;
            } 

            /**
             * arr_city_code.
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * dep_city_code.
             */
            public Builder depCityCode(String depCityCode) {
                this.depCityCode = depCityCode;
                return this;
            }

            /**
             * flight_time.
             */
            public Builder flightTime(String flightTime) {
                this.flightTime = flightTime;
                return this;
            }

            /**
             * market_flight_no.
             */
            public Builder marketFlightNo(String marketFlightNo) {
                this.marketFlightNo = marketFlightNo;
                return this;
            }

            public SelectedFlights build() {
                return new SelectedFlights(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopListSearchRequest} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopListSearchRequest</p>
     */
    public static class SearchJourneys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_date")
        private String depDate;

        @com.aliyun.core.annotation.NameInMap("selected_flights")
        private java.util.List<SelectedFlights> selectedFlights;

        private SearchJourneys(Builder builder) {
            this.arrCityCode = builder.arrCityCode;
            this.depCityCode = builder.depCityCode;
            this.depDate = builder.depDate;
            this.selectedFlights = builder.selectedFlights;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchJourneys create() {
            return builder().build();
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return depDate
         */
        public String getDepDate() {
            return this.depDate;
        }

        /**
         * @return selectedFlights
         */
        public java.util.List<SelectedFlights> getSelectedFlights() {
            return this.selectedFlights;
        }

        public static final class Builder {
            private String arrCityCode; 
            private String depCityCode; 
            private String depDate; 
            private java.util.List<SelectedFlights> selectedFlights; 

            private Builder() {
            } 

            private Builder(SearchJourneys model) {
                this.arrCityCode = model.arrCityCode;
                this.depCityCode = model.depCityCode;
                this.depDate = model.depDate;
                this.selectedFlights = model.selectedFlights;
            } 

            /**
             * arr_city_code.
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * dep_city_code.
             */
            public Builder depCityCode(String depCityCode) {
                this.depCityCode = depCityCode;
                return this;
            }

            /**
             * dep_date.
             */
            public Builder depDate(String depDate) {
                this.depDate = depDate;
                return this;
            }

            /**
             * selected_flights.
             */
            public Builder selectedFlights(java.util.List<SelectedFlights> selectedFlights) {
                this.selectedFlights = selectedFlights;
                return this;
            }

            public SearchJourneys build() {
                return new SearchJourneys(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopListSearchRequest} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopListSearchRequest</p>
     */
    public static class SelectedPassengers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("full_name")
        private String fullName;

        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private Long passengerId;

        private SelectedPassengers(Builder builder) {
            this.fullName = builder.fullName;
            this.passengerId = builder.passengerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectedPassengers create() {
            return builder().build();
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
        }

        /**
         * @return passengerId
         */
        public Long getPassengerId() {
            return this.passengerId;
        }

        public static final class Builder {
            private String fullName; 
            private Long passengerId; 

            private Builder() {
            } 

            private Builder(SelectedPassengers model) {
                this.fullName = model.fullName;
                this.passengerId = model.passengerId;
            } 

            /**
             * full_name.
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * passenger_id.
             */
            public Builder passengerId(Long passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            public SelectedPassengers build() {
                return new SelectedPassengers(this);
            } 

        } 

    }
}
