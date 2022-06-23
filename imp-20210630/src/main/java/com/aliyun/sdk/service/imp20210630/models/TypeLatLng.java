// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TypeLatLng} extends {@link TeaModel}
 *
 * <p>TypeLatLng</p>
 */
public class TypeLatLng extends TeaModel {
    @NameInMap("Latitude")
    private Double latitude;

    @NameInMap("Longitude")
    private Double longitude;

    private TypeLatLng(Builder builder) {
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TypeLatLng create() {
        return builder().build();
    }

    /**
     * @return latitude
     */
    public Double getLatitude() {
        return this.latitude;
    }

    /**
     * @return longitude
     */
    public Double getLongitude() {
        return this.longitude;
    }

    public static final class Builder {
        private Double latitude; 
        private Double longitude; 

        /**
         * The latitude in degrees. It must be in the range [-90.0, +90.0].
         */
        public Builder latitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        /**
         * The longitude in degrees. It must be in the range [-180.0, +180.0].
         */
        public Builder longitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        public TypeLatLng build() {
            return new TypeLatLng(this);
        } 

    } 

}
