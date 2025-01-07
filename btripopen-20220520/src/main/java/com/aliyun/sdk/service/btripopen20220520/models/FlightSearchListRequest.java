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
 * {@link FlightSearchListRequest} extends {@link RequestModel}
 *
 * <p>FlightSearchListRequest</p>
 */
public class FlightSearchListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("airline_code")
    private String airlineCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("arr_city_code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String arrCityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("arr_city_name")
    private String arrCityName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("arr_date")
    private String arrDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cabin_class")
    private String cabinClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dep_city_code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String depCityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dep_city_name")
    private String depCityName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dep_date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String depDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("flight_no")
    private String flightNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("need_multi_class_price")
    private Boolean needMultiClassPrice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("transfer_city_code")
    private String transferCityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("transfer_flight_no")
    private String transferFlightNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("transfer_leave_date")
    private String transferLeaveDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("trip_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tripType;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightSearchListRequest(Builder builder) {
        super(builder);
        this.airlineCode = builder.airlineCode;
        this.arrCityCode = builder.arrCityCode;
        this.arrCityName = builder.arrCityName;
        this.arrDate = builder.arrDate;
        this.cabinClass = builder.cabinClass;
        this.depCityCode = builder.depCityCode;
        this.depCityName = builder.depCityName;
        this.depDate = builder.depDate;
        this.flightNo = builder.flightNo;
        this.needMultiClassPrice = builder.needMultiClassPrice;
        this.transferCityCode = builder.transferCityCode;
        this.transferFlightNo = builder.transferFlightNo;
        this.transferLeaveDate = builder.transferLeaveDate;
        this.tripType = builder.tripType;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightSearchListRequest create() {
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
     * @return arrCityName
     */
    public String getArrCityName() {
        return this.arrCityName;
    }

    /**
     * @return arrDate
     */
    public String getArrDate() {
        return this.arrDate;
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
     * @return depCityName
     */
    public String getDepCityName() {
        return this.depCityName;
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
     * @return needMultiClassPrice
     */
    public Boolean getNeedMultiClassPrice() {
        return this.needMultiClassPrice;
    }

    /**
     * @return transferCityCode
     */
    public String getTransferCityCode() {
        return this.transferCityCode;
    }

    /**
     * @return transferFlightNo
     */
    public String getTransferFlightNo() {
        return this.transferFlightNo;
    }

    /**
     * @return transferLeaveDate
     */
    public String getTransferLeaveDate() {
        return this.transferLeaveDate;
    }

    /**
     * @return tripType
     */
    public String getTripType() {
        return this.tripType;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<FlightSearchListRequest, Builder> {
        private String airlineCode; 
        private String arrCityCode; 
        private String arrCityName; 
        private String arrDate; 
        private String cabinClass; 
        private String depCityCode; 
        private String depCityName; 
        private String depDate; 
        private String flightNo; 
        private Boolean needMultiClassPrice; 
        private String transferCityCode; 
        private String transferFlightNo; 
        private String transferLeaveDate; 
        private String tripType; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightSearchListRequest request) {
            super(request);
            this.airlineCode = request.airlineCode;
            this.arrCityCode = request.arrCityCode;
            this.arrCityName = request.arrCityName;
            this.arrDate = request.arrDate;
            this.cabinClass = request.cabinClass;
            this.depCityCode = request.depCityCode;
            this.depCityName = request.depCityName;
            this.depDate = request.depDate;
            this.flightNo = request.flightNo;
            this.needMultiClassPrice = request.needMultiClassPrice;
            this.transferCityCode = request.transferCityCode;
            this.transferFlightNo = request.transferFlightNo;
            this.transferLeaveDate = request.transferLeaveDate;
            this.tripType = request.tripType;
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
         * arr_city_name.
         */
        public Builder arrCityName(String arrCityName) {
            this.putQueryParameter("arr_city_name", arrCityName);
            this.arrCityName = arrCityName;
            return this;
        }

        /**
         * arr_date.
         */
        public Builder arrDate(String arrDate) {
            this.putQueryParameter("arr_date", arrDate);
            this.arrDate = arrDate;
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
         * <p>HGH</p>
         */
        public Builder depCityCode(String depCityCode) {
            this.putQueryParameter("dep_city_code", depCityCode);
            this.depCityCode = depCityCode;
            return this;
        }

        /**
         * dep_city_name.
         */
        public Builder depCityName(String depCityName) {
            this.putQueryParameter("dep_city_name", depCityName);
            this.depCityName = depCityName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        public Builder depDate(String depDate) {
            this.putQueryParameter("dep_date", depDate);
            this.depDate = depDate;
            return this;
        }

        /**
         * flight_no.
         */
        public Builder flightNo(String flightNo) {
            this.putQueryParameter("flight_no", flightNo);
            this.flightNo = flightNo;
            return this;
        }

        /**
         * need_multi_class_price.
         */
        public Builder needMultiClassPrice(Boolean needMultiClassPrice) {
            this.putQueryParameter("need_multi_class_price", needMultiClassPrice);
            this.needMultiClassPrice = needMultiClassPrice;
            return this;
        }

        /**
         * transfer_city_code.
         */
        public Builder transferCityCode(String transferCityCode) {
            this.putQueryParameter("transfer_city_code", transferCityCode);
            this.transferCityCode = transferCityCode;
            return this;
        }

        /**
         * transfer_flight_no.
         */
        public Builder transferFlightNo(String transferFlightNo) {
            this.putQueryParameter("transfer_flight_no", transferFlightNo);
            this.transferFlightNo = transferFlightNo;
            return this;
        }

        /**
         * transfer_leave_date.
         */
        public Builder transferLeaveDate(String transferLeaveDate) {
            this.putQueryParameter("transfer_leave_date", transferLeaveDate);
            this.transferLeaveDate = transferLeaveDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder tripType(String tripType) {
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
        public FlightSearchListRequest build() {
            return new FlightSearchListRequest(this);
        } 

    } 

}
