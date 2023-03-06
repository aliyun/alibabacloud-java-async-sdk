// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightOtaSearchRequest} extends {@link RequestModel}
 *
 * <p>FlightOtaSearchRequest</p>
 */
public class FlightOtaSearchRequest extends Request {
    @Query
    @NameInMap("airline_code")
    private String airlineCode;

    @Query
    @NameInMap("arr_city_code")
    @Validation(required = true)
    private String arrCityCode;

    @Query
    @NameInMap("cabin_class")
    private String cabinClass;

    @Query
    @NameInMap("carrier_flight_no")
    private String carrierFlightNo;

    @Query
    @NameInMap("dep_city_code")
    @Validation(required = true)
    private String depCityCode;

    @Query
    @NameInMap("dep_date")
    @Validation(required = true)
    private String depDate;

    @Query
    @NameInMap("flight_no")
    @Validation(required = true)
    private String flightNo;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    @Validation(required = true)
    private String xAcsBtripCorpToken;

    private FlightOtaSearchRequest(Builder builder) {
        super(builder);
        this.airlineCode = builder.airlineCode;
        this.arrCityCode = builder.arrCityCode;
        this.cabinClass = builder.cabinClass;
        this.carrierFlightNo = builder.carrierFlightNo;
        this.depCityCode = builder.depCityCode;
        this.depDate = builder.depDate;
        this.flightNo = builder.flightNo;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightOtaSearchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return airlineCode
     */
    public String getAirlineCode() {
        return this.airlineCode;
    }

    /**
     * @return arrCityCode
     */
    public String getArrCityCode() {
        return this.arrCityCode;
    }

    /**
     * @return cabinClass
     */
    public String getCabinClass() {
        return this.cabinClass;
    }

    /**
     * @return carrierFlightNo
     */
    public String getCarrierFlightNo() {
        return this.carrierFlightNo;
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
     * @return flightNo
     */
    public String getFlightNo() {
        return this.flightNo;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<FlightOtaSearchRequest, Builder> {
        private String airlineCode; 
        private String arrCityCode; 
        private String cabinClass; 
        private String carrierFlightNo; 
        private String depCityCode; 
        private String depDate; 
        private String flightNo; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightOtaSearchRequest request) {
            super(request);
            this.airlineCode = request.airlineCode;
            this.arrCityCode = request.arrCityCode;
            this.cabinClass = request.cabinClass;
            this.carrierFlightNo = request.carrierFlightNo;
            this.depCityCode = request.depCityCode;
            this.depDate = request.depDate;
            this.flightNo = request.flightNo;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * 航司二字码
         */
        public Builder airlineCode(String airlineCode) {
            this.putQueryParameter("airline_code", airlineCode);
            this.airlineCode = airlineCode;
            return this;
        }

        /**
         * 必填项,到达城市三字码
         */
        public Builder arrCityCode(String arrCityCode) {
            this.putQueryParameter("arr_city_code", arrCityCode);
            this.arrCityCode = arrCityCode;
            return this;
        }

        /**
         * 舱等， 0所有舱位,1经济舱,2商务舱
         */
        public Builder cabinClass(String cabinClass) {
            this.putQueryParameter("cabin_class", cabinClass);
            this.cabinClass = cabinClass;
            return this;
        }

        /**
         * 承运航班号
         */
        public Builder carrierFlightNo(String carrierFlightNo) {
            this.putQueryParameter("carrier_flight_no", carrierFlightNo);
            this.carrierFlightNo = carrierFlightNo;
            return this;
        }

        /**
         * 必填项,出发城市三字码
         */
        public Builder depCityCode(String depCityCode) {
            this.putQueryParameter("dep_city_code", depCityCode);
            this.depCityCode = depCityCode;
            return this;
        }

        /**
         * 必填项,出发时间
         */
        public Builder depDate(String depDate) {
            this.putQueryParameter("dep_date", depDate);
            this.depDate = depDate;
            return this;
        }

        /**
         * 航班号
         */
        public Builder flightNo(String flightNo) {
            this.putQueryParameter("flight_no", flightNo);
            this.flightNo = flightNo;
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
        public FlightOtaSearchRequest build() {
            return new FlightOtaSearchRequest(this);
        } 

    } 

}
