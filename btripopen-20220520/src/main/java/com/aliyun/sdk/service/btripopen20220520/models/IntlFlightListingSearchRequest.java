// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IntlFlightListingSearchRequest} extends {@link RequestModel}
 *
 * <p>IntlFlightListingSearchRequest</p>
 */
public class IntlFlightListingSearchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("btrip_user_id")
    private String btripUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("buyer_name")
    private String buyerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cabin_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer cabinType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("direct_only")
    private Boolean directOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isv_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isvName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("need_share_flight")
    private Boolean needShareFlight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("out_wheel_search")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean outWheelSearch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("query_record_id")
    private String queryRecordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("search_journeys")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < SearchJourneys> searchJourneys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("search_mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer searchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("search_passenger_list")
    private java.util.List < SearchPassengerList> searchPassengerList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("supplier_code")
    private String supplierCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("trip_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer tripType;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private IntlFlightListingSearchRequest(Builder builder) {
        super(builder);
        this.btripUserId = builder.btripUserId;
        this.buyerName = builder.buyerName;
        this.cabinType = builder.cabinType;
        this.directOnly = builder.directOnly;
        this.isvName = builder.isvName;
        this.language = builder.language;
        this.needShareFlight = builder.needShareFlight;
        this.outWheelSearch = builder.outWheelSearch;
        this.queryRecordId = builder.queryRecordId;
        this.searchJourneys = builder.searchJourneys;
        this.searchMode = builder.searchMode;
        this.searchPassengerList = builder.searchPassengerList;
        this.supplierCode = builder.supplierCode;
        this.token = builder.token;
        this.tripType = builder.tripType;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightListingSearchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return btripUserId
     */
    public String getBtripUserId() {
        return this.btripUserId;
    }

    /**
     * @return buyerName
     */
    public String getBuyerName() {
        return this.buyerName;
    }

    /**
     * @return cabinType
     */
    public Integer getCabinType() {
        return this.cabinType;
    }

    /**
     * @return directOnly
     */
    public Boolean getDirectOnly() {
        return this.directOnly;
    }

    /**
     * @return isvName
     */
    public String getIsvName() {
        return this.isvName;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return needShareFlight
     */
    public Boolean getNeedShareFlight() {
        return this.needShareFlight;
    }

    /**
     * @return outWheelSearch
     */
    public Boolean getOutWheelSearch() {
        return this.outWheelSearch;
    }

    /**
     * @return queryRecordId
     */
    public String getQueryRecordId() {
        return this.queryRecordId;
    }

    /**
     * @return searchJourneys
     */
    public java.util.List < SearchJourneys> getSearchJourneys() {
        return this.searchJourneys;
    }

    /**
     * @return searchMode
     */
    public Integer getSearchMode() {
        return this.searchMode;
    }

    /**
     * @return searchPassengerList
     */
    public java.util.List < SearchPassengerList> getSearchPassengerList() {
        return this.searchPassengerList;
    }

    /**
     * @return supplierCode
     */
    public String getSupplierCode() {
        return this.supplierCode;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return tripType
     */
    public Integer getTripType() {
        return this.tripType;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<IntlFlightListingSearchRequest, Builder> {
        private String btripUserId; 
        private String buyerName; 
        private Integer cabinType; 
        private Boolean directOnly; 
        private String isvName; 
        private String language; 
        private Boolean needShareFlight; 
        private Boolean outWheelSearch; 
        private String queryRecordId; 
        private java.util.List < SearchJourneys> searchJourneys; 
        private Integer searchMode; 
        private java.util.List < SearchPassengerList> searchPassengerList; 
        private String supplierCode; 
        private String token; 
        private Integer tripType; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IntlFlightListingSearchRequest request) {
            super(request);
            this.btripUserId = request.btripUserId;
            this.buyerName = request.buyerName;
            this.cabinType = request.cabinType;
            this.directOnly = request.directOnly;
            this.isvName = request.isvName;
            this.language = request.language;
            this.needShareFlight = request.needShareFlight;
            this.outWheelSearch = request.outWheelSearch;
            this.queryRecordId = request.queryRecordId;
            this.searchJourneys = request.searchJourneys;
            this.searchMode = request.searchMode;
            this.searchPassengerList = request.searchPassengerList;
            this.supplierCode = request.supplierCode;
            this.token = request.token;
            this.tripType = request.tripType;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * btrip_user_id.
         */
        public Builder btripUserId(String btripUserId) {
            this.putQueryParameter("btrip_user_id", btripUserId);
            this.btripUserId = btripUserId;
            return this;
        }

        /**
         * buyer_name.
         */
        public Builder buyerName(String buyerName) {
            this.putQueryParameter("buyer_name", buyerName);
            this.buyerName = buyerName;
            return this;
        }

        /**
         * cabin_type.
         */
        public Builder cabinType(Integer cabinType) {
            this.putQueryParameter("cabin_type", cabinType);
            this.cabinType = cabinType;
            return this;
        }

        /**
         * direct_only.
         */
        public Builder directOnly(Boolean directOnly) {
            this.putQueryParameter("direct_only", directOnly);
            this.directOnly = directOnly;
            return this;
        }

        /**
         * isv_name.
         */
        public Builder isvName(String isvName) {
            this.putQueryParameter("isv_name", isvName);
            this.isvName = isvName;
            return this;
        }

        /**
         * language.
         */
        public Builder language(String language) {
            this.putQueryParameter("language", language);
            this.language = language;
            return this;
        }

        /**
         * need_share_flight.
         */
        public Builder needShareFlight(Boolean needShareFlight) {
            this.putQueryParameter("need_share_flight", needShareFlight);
            this.needShareFlight = needShareFlight;
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
         * query_record_id.
         */
        public Builder queryRecordId(String queryRecordId) {
            this.putQueryParameter("query_record_id", queryRecordId);
            this.queryRecordId = queryRecordId;
            return this;
        }

        /**
         * search_journeys.
         */
        public Builder searchJourneys(java.util.List < SearchJourneys> searchJourneys) {
            String searchJourneysShrink = shrink(searchJourneys, "search_journeys", "json");
            this.putQueryParameter("search_journeys", searchJourneysShrink);
            this.searchJourneys = searchJourneys;
            return this;
        }

        /**
         * search_mode.
         */
        public Builder searchMode(Integer searchMode) {
            this.putQueryParameter("search_mode", searchMode);
            this.searchMode = searchMode;
            return this;
        }

        /**
         * search_passenger_list.
         */
        public Builder searchPassengerList(java.util.List < SearchPassengerList> searchPassengerList) {
            String searchPassengerListShrink = shrink(searchPassengerList, "search_passenger_list", "json");
            this.putQueryParameter("search_passenger_list", searchPassengerListShrink);
            this.searchPassengerList = searchPassengerList;
            return this;
        }

        /**
         * supplier_code.
         */
        public Builder supplierCode(String supplierCode) {
            this.putQueryParameter("supplier_code", supplierCode);
            this.supplierCode = supplierCode;
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
         * trip_type.
         */
        public Builder tripType(Integer tripType) {
            this.putQueryParameter("trip_type", tripType);
            this.tripType = tripType;
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
        public IntlFlightListingSearchRequest build() {
            return new IntlFlightListingSearchRequest(this);
        } 

    } 

    public static class SelectedFlights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_airport_code")
        private String arrAirportCode;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("cabin_type")
        private Integer cabinType;

        @com.aliyun.core.annotation.NameInMap("dep_airport_code")
        private String depAirportCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("flight_time")
        @com.aliyun.core.annotation.Validation(required = true)
        private String flightTime;

        @com.aliyun.core.annotation.NameInMap("market_flight_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String marketFlightNo;

        @com.aliyun.core.annotation.NameInMap("operate_flight_no")
        private String operateFlightNo;

        private SelectedFlights(Builder builder) {
            this.arrAirportCode = builder.arrAirportCode;
            this.arrCityCode = builder.arrCityCode;
            this.cabinType = builder.cabinType;
            this.depAirportCode = builder.depAirportCode;
            this.depCityCode = builder.depCityCode;
            this.flightTime = builder.flightTime;
            this.marketFlightNo = builder.marketFlightNo;
            this.operateFlightNo = builder.operateFlightNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectedFlights create() {
            return builder().build();
        }

        /**
         * @return arrAirportCode
         */
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return cabinType
         */
        public Integer getCabinType() {
            return this.cabinType;
        }

        /**
         * @return depAirportCode
         */
        public String getDepAirportCode() {
            return this.depAirportCode;
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

        /**
         * @return operateFlightNo
         */
        public String getOperateFlightNo() {
            return this.operateFlightNo;
        }

        public static final class Builder {
            private String arrAirportCode; 
            private String arrCityCode; 
            private Integer cabinType; 
            private String depAirportCode; 
            private String depCityCode; 
            private String flightTime; 
            private String marketFlightNo; 
            private String operateFlightNo; 

            /**
             * arr_airport_code.
             */
            public Builder arrAirportCode(String arrAirportCode) {
                this.arrAirportCode = arrAirportCode;
                return this;
            }

            /**
             * arr_city_code.
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * cabin_type.
             */
            public Builder cabinType(Integer cabinType) {
                this.cabinType = cabinType;
                return this;
            }

            /**
             * dep_airport_code.
             */
            public Builder depAirportCode(String depAirportCode) {
                this.depAirportCode = depAirportCode;
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

            /**
             * operate_flight_no.
             */
            public Builder operateFlightNo(String operateFlightNo) {
                this.operateFlightNo = operateFlightNo;
                return this;
            }

            public SelectedFlights build() {
                return new SelectedFlights(this);
            } 

        } 

    }
    public static class SearchJourneys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_date")
        @com.aliyun.core.annotation.Validation(required = true)
        private String depDate;

        @com.aliyun.core.annotation.NameInMap("selected_flights")
        private java.util.List < SelectedFlights> selectedFlights;

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
        public java.util.List < SelectedFlights> getSelectedFlights() {
            return this.selectedFlights;
        }

        public static final class Builder {
            private String arrCityCode; 
            private String depCityCode; 
            private String depDate; 
            private java.util.List < SelectedFlights> selectedFlights; 

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
            public Builder selectedFlights(java.util.List < SelectedFlights> selectedFlights) {
                this.selectedFlights = selectedFlights;
                return this;
            }

            public SearchJourneys build() {
                return new SearchJourneys(this);
            } 

        } 

    }
    public static class SearchPassengerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cert_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("cert_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer certType;

        @com.aliyun.core.annotation.NameInMap("full_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fullName;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer type;

        private SearchPassengerList(Builder builder) {
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.fullName = builder.fullName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchPassengerList create() {
            return builder().build();
        }

        /**
         * @return certNo
         */
        public String getCertNo() {
            return this.certNo;
        }

        /**
         * @return certType
         */
        public Integer getCertType() {
            return this.certType;
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String certNo; 
            private Integer certType; 
            private String fullName; 
            private Integer type; 

            /**
             * cert_no.
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * cert_type.
             */
            public Builder certType(Integer certType) {
                this.certType = certType;
                return this;
            }

            /**
             * full_name.
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public SearchPassengerList build() {
                return new SearchPassengerList(this);
            } 

        } 

    }
}
