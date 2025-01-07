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
 * {@link FlightListingSearchRequest} extends {@link RequestModel}
 *
 * <p>FlightListingSearchRequest</p>
 */
public class FlightListingSearchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("airline_code")
    private String airlineCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("arr_city_code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String arrCityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cabin_class")
    private String cabinClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dep_city_code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String depCityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dep_date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String depDate;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightListingSearchRequest(Builder builder) {
        super(builder);
        this.airlineCode = builder.airlineCode;
        this.arrCityCode = builder.arrCityCode;
        this.cabinClass = builder.cabinClass;
        this.depCityCode = builder.depCityCode;
        this.depDate = builder.depDate;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightListingSearchRequest create() {
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
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<FlightListingSearchRequest, Builder> {
        private String airlineCode; 
        private String arrCityCode; 
        private String cabinClass; 
        private String depCityCode; 
        private String depDate; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightListingSearchRequest request) {
            super(request);
            this.airlineCode = request.airlineCode;
            this.arrCityCode = request.arrCityCode;
            this.cabinClass = request.cabinClass;
            this.depCityCode = request.depCityCode;
            this.depDate = request.depDate;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * airline_code.
         */
        public Builder airlineCode(String airlineCode) {
            this.putQueryParameter("airline_code", airlineCode);
            this.airlineCode = airlineCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        public Builder arrCityCode(String arrCityCode) {
            this.putQueryParameter("arr_city_code", arrCityCode);
            this.arrCityCode = arrCityCode;
            return this;
        }

        /**
         * cabin_class.
         */
        public Builder cabinClass(String cabinClass) {
            this.putQueryParameter("cabin_class", cabinClass);
            this.cabinClass = cabinClass;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        public Builder depCityCode(String depCityCode) {
            this.putQueryParameter("dep_city_code", depCityCode);
            this.depCityCode = depCityCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-26</p>
         */
        public Builder depDate(String depDate) {
            this.putQueryParameter("dep_date", depDate);
            this.depDate = depDate;
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
        public FlightListingSearchRequest build() {
            return new FlightListingSearchRequest(this);
        } 

    } 

}
