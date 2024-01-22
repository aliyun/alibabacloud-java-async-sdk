// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchRequest} extends {@link RequestModel}
 *
 * <p>SearchRequest</p>
 */
public class SearchRequest extends Request {
    @Body
    @NameInMap("adults")
    private Integer adults;

    @Body
    @NameInMap("air_legs")
    @Validation(required = true)
    private java.util.List < AirLegs> airLegs;

    @Body
    @NameInMap("cabin_class")
    private String cabinClass;

    @Body
    @NameInMap("children")
    private Integer children;

    @Body
    @NameInMap("infants")
    private Integer infants;

    @Header
    @NameInMap("x-acs-airticket-access-token")
    @Validation(required = true)
    private String xAcsAirticketAccessToken;

    @Header
    @NameInMap("x-acs-airticket-language")
    private String xAcsAirticketLanguage;

    private SearchRequest(Builder builder) {
        super(builder);
        this.adults = builder.adults;
        this.airLegs = builder.airLegs;
        this.cabinClass = builder.cabinClass;
        this.children = builder.children;
        this.infants = builder.infants;
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
            this.xAcsAirticketAccessToken = request.xAcsAirticketAccessToken;
            this.xAcsAirticketLanguage = request.xAcsAirticketLanguage;
        } 

        /**
         * adults.
         */
        public Builder adults(Integer adults) {
            this.putBodyParameter("adults", adults);
            this.adults = adults;
            return this;
        }

        /**
         * air_legs.
         */
        public Builder airLegs(java.util.List < AirLegs> airLegs) {
            String airLegsShrink = shrink(airLegs, "air_legs", "json");
            this.putBodyParameter("air_legs", airLegsShrink);
            this.airLegs = airLegs;
            return this;
        }

        /**
         * cabin_class.
         */
        public Builder cabinClass(String cabinClass) {
            this.putBodyParameter("cabin_class", cabinClass);
            this.cabinClass = cabinClass;
            return this;
        }

        /**
         * children.
         */
        public Builder children(Integer children) {
            this.putBodyParameter("children", children);
            this.children = children;
            return this;
        }

        /**
         * infants.
         */
        public Builder infants(Integer infants) {
            this.putBodyParameter("infants", infants);
            this.infants = infants;
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
        public SearchRequest build() {
            return new SearchRequest(this);
        } 

    } 

    public static class AirLegs extends TeaModel {
        @NameInMap("arrival_airport_list")
        private java.util.List < String > arrivalAirportList;

        @NameInMap("arrival_city")
        @Validation(required = true)
        private String arrivalCity;

        @NameInMap("departure_airport_list")
        private java.util.List < String > departureAirportList;

        @NameInMap("departure_city")
        @Validation(required = true)
        private String departureCity;

        @NameInMap("departure_date")
        @Validation(required = true)
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
             * arrival_airport_list.
             */
            public Builder arrivalAirportList(java.util.List < String > arrivalAirportList) {
                this.arrivalAirportList = arrivalAirportList;
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
             * departure_airport_list.
             */
            public Builder departureAirportList(java.util.List < String > departureAirportList) {
                this.departureAirportList = departureAirportList;
                return this;
            }

            /**
             * departure_city.
             */
            public Builder departureCity(String departureCity) {
                this.departureCity = departureCity;
                return this;
            }

            /**
             * departure_date.
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
}
