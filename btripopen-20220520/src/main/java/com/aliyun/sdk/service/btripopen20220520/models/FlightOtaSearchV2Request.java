// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FlightOtaSearchV2Request} extends {@link RequestModel}
 *
 * <p>FlightOtaSearchV2Request</p>
 */
public class FlightOtaSearchV2Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cabin_type_list")
    private java.util.List < Integer > cabinTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("direct_only")
    private Boolean directOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isv_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isvName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("need_share_flight")
    private Boolean needShareFlight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("search_journeys")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < SearchJourneys> searchJourneys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("search_mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer searchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("trip_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer tripType;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightOtaSearchV2Request(Builder builder) {
        super(builder);
        this.cabinTypeList = builder.cabinTypeList;
        this.directOnly = builder.directOnly;
        this.isvName = builder.isvName;
        this.needShareFlight = builder.needShareFlight;
        this.searchJourneys = builder.searchJourneys;
        this.searchMode = builder.searchMode;
        this.tripType = builder.tripType;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightOtaSearchV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cabinTypeList
     */
    public java.util.List < Integer > getCabinTypeList() {
        return this.cabinTypeList;
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
     * @return needShareFlight
     */
    public Boolean getNeedShareFlight() {
        return this.needShareFlight;
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

    public static final class Builder extends Request.Builder<FlightOtaSearchV2Request, Builder> {
        private java.util.List < Integer > cabinTypeList; 
        private Boolean directOnly; 
        private String isvName; 
        private Boolean needShareFlight; 
        private java.util.List < SearchJourneys> searchJourneys; 
        private Integer searchMode; 
        private Integer tripType; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightOtaSearchV2Request request) {
            super(request);
            this.cabinTypeList = request.cabinTypeList;
            this.directOnly = request.directOnly;
            this.isvName = request.isvName;
            this.needShareFlight = request.needShareFlight;
            this.searchJourneys = request.searchJourneys;
            this.searchMode = request.searchMode;
            this.tripType = request.tripType;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * cabin_type_list.
         */
        public Builder cabinTypeList(java.util.List < Integer > cabinTypeList) {
            String cabinTypeListShrink = shrink(cabinTypeList, "cabin_type_list", "json");
            this.putQueryParameter("cabin_type_list", cabinTypeListShrink);
            this.cabinTypeList = cabinTypeList;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cheshi</p>
         */
        public Builder isvName(String isvName) {
            this.putQueryParameter("isv_name", isvName);
            this.isvName = isvName;
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
         * <p>This parameter is required.</p>
         */
        public Builder searchJourneys(java.util.List < SearchJourneys> searchJourneys) {
            String searchJourneysShrink = shrink(searchJourneys, "search_journeys", "json");
            this.putQueryParameter("search_journeys", searchJourneysShrink);
            this.searchJourneys = searchJourneys;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder searchMode(Integer searchMode) {
            this.putQueryParameter("search_mode", searchMode);
            this.searchMode = searchMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
        public FlightOtaSearchV2Request build() {
            return new FlightOtaSearchV2Request(this);
        } 

    } 

    /**
     * 
     * {@link FlightOtaSearchV2Request} extends {@link TeaModel}
     *
     * <p>FlightOtaSearchV2Request</p>
     */
    public static class SelectedFlights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_airport_code")
        private String arrAirportCode;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_airport_code")
        private String depAirportCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("flight_time")
        private String flightTime;

        @com.aliyun.core.annotation.NameInMap("market_flight_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String marketFlightNo;

        @com.aliyun.core.annotation.NameInMap("operate_flight_no")
        private String operateFlightNo;

        private SelectedFlights(Builder builder) {
            this.arrAirportCode = builder.arrAirportCode;
            this.arrCityCode = builder.arrCityCode;
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HO3925</p>
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
    /**
     * 
     * {@link FlightOtaSearchV2Request} extends {@link TeaModel}
     *
     * <p>FlightOtaSearchV2Request</p>
     */
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
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HGH</p>
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BJS</p>
             */
            public Builder depCityCode(String depCityCode) {
                this.depCityCode = depCityCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-09-01</p>
             */
            public Builder depDate(String depDate) {
                this.depDate = depDate;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
}
