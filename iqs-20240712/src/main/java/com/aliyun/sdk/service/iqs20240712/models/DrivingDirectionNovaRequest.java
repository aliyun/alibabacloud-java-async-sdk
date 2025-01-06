// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

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
 * {@link DrivingDirectionNovaRequest} extends {@link RequestModel}
 *
 * <p>DrivingDirectionNovaRequest</p>
 */
public class DrivingDirectionNovaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("carType")
    private String carType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("destinationLatitude")
    private String destinationLatitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("destinationLongitude")
    private String destinationLongitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("originLatitude")
    private String originLatitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("originLongitude")
    private String originLongitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("plate")
    private String plate;

    private DrivingDirectionNovaRequest(Builder builder) {
        super(builder);
        this.carType = builder.carType;
        this.destinationLatitude = builder.destinationLatitude;
        this.destinationLongitude = builder.destinationLongitude;
        this.originLatitude = builder.originLatitude;
        this.originLongitude = builder.originLongitude;
        this.plate = builder.plate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DrivingDirectionNovaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return carType
     */
    public String getCarType() {
        return this.carType;
    }

    /**
     * @return destinationLatitude
     */
    public String getDestinationLatitude() {
        return this.destinationLatitude;
    }

    /**
     * @return destinationLongitude
     */
    public String getDestinationLongitude() {
        return this.destinationLongitude;
    }

    /**
     * @return originLatitude
     */
    public String getOriginLatitude() {
        return this.originLatitude;
    }

    /**
     * @return originLongitude
     */
    public String getOriginLongitude() {
        return this.originLongitude;
    }

    /**
     * @return plate
     */
    public String getPlate() {
        return this.plate;
    }

    public static final class Builder extends Request.Builder<DrivingDirectionNovaRequest, Builder> {
        private String carType; 
        private String destinationLatitude; 
        private String destinationLongitude; 
        private String originLatitude; 
        private String originLongitude; 
        private String plate; 

        private Builder() {
            super();
        } 

        private Builder(DrivingDirectionNovaRequest request) {
            super(request);
            this.carType = request.carType;
            this.destinationLatitude = request.destinationLatitude;
            this.destinationLongitude = request.destinationLongitude;
            this.originLatitude = request.originLatitude;
            this.originLongitude = request.originLongitude;
            this.plate = request.plate;
        } 

        /**
         * carType.
         */
        public Builder carType(String carType) {
            this.putQueryParameter("carType", carType);
            this.carType = carType;
            return this;
        }

        /**
         * destinationLatitude.
         */
        public Builder destinationLatitude(String destinationLatitude) {
            this.putQueryParameter("destinationLatitude", destinationLatitude);
            this.destinationLatitude = destinationLatitude;
            return this;
        }

        /**
         * destinationLongitude.
         */
        public Builder destinationLongitude(String destinationLongitude) {
            this.putQueryParameter("destinationLongitude", destinationLongitude);
            this.destinationLongitude = destinationLongitude;
            return this;
        }

        /**
         * originLatitude.
         */
        public Builder originLatitude(String originLatitude) {
            this.putQueryParameter("originLatitude", originLatitude);
            this.originLatitude = originLatitude;
            return this;
        }

        /**
         * originLongitude.
         */
        public Builder originLongitude(String originLongitude) {
            this.putQueryParameter("originLongitude", originLongitude);
            this.originLongitude = originLongitude;
            return this;
        }

        /**
         * plate.
         */
        public Builder plate(String plate) {
            this.putQueryParameter("plate", plate);
            this.plate = plate;
            return this;
        }

        @Override
        public DrivingDirectionNovaRequest build() {
            return new DrivingDirectionNovaRequest(this);
        } 

    } 

}
