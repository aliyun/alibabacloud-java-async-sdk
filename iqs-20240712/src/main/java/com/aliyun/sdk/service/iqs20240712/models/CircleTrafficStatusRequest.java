// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CircleTrafficStatusRequest} extends {@link RequestModel}
 *
 * <p>CircleTrafficStatusRequest</p>
 */
public class CircleTrafficStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("latitude")
    private String latitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("longitude")
    private String longitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("radius")
    private String radius;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("roadLevel")
    private String roadLevel;

    private CircleTrafficStatusRequest(Builder builder) {
        super(builder);
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.radius = builder.radius;
        this.roadLevel = builder.roadLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CircleTrafficStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latitude
     */
    public String getLatitude() {
        return this.latitude;
    }

    /**
     * @return longitude
     */
    public String getLongitude() {
        return this.longitude;
    }

    /**
     * @return radius
     */
    public String getRadius() {
        return this.radius;
    }

    /**
     * @return roadLevel
     */
    public String getRoadLevel() {
        return this.roadLevel;
    }

    public static final class Builder extends Request.Builder<CircleTrafficStatusRequest, Builder> {
        private String latitude; 
        private String longitude; 
        private String radius; 
        private String roadLevel; 

        private Builder() {
            super();
        } 

        private Builder(CircleTrafficStatusRequest request) {
            super(request);
            this.latitude = request.latitude;
            this.longitude = request.longitude;
            this.radius = request.radius;
            this.roadLevel = request.roadLevel;
        } 

        /**
         * latitude.
         */
        public Builder latitude(String latitude) {
            this.putQueryParameter("latitude", latitude);
            this.latitude = latitude;
            return this;
        }

        /**
         * longitude.
         */
        public Builder longitude(String longitude) {
            this.putQueryParameter("longitude", longitude);
            this.longitude = longitude;
            return this;
        }

        /**
         * radius.
         */
        public Builder radius(String radius) {
            this.putQueryParameter("radius", radius);
            this.radius = radius;
            return this;
        }

        /**
         * roadLevel.
         */
        public Builder roadLevel(String roadLevel) {
            this.putQueryParameter("roadLevel", roadLevel);
            this.roadLevel = roadLevel;
            return this;
        }

        @Override
        public CircleTrafficStatusRequest build() {
            return new CircleTrafficStatusRequest(this);
        } 

    } 

}
