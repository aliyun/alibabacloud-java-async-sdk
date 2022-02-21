// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCommercialVehicleTrackResponseBody} extends {@link TeaModel}
 *
 * <p>GetCommercialVehicleTrackResponseBody</p>
 */
public class GetCommercialVehicleTrackResponseBody extends TeaModel {
    @NameInMap("Points")
    private java.util.List < Points> points;

    @NameInMap("RequestId")
    private String requestId;

    private GetCommercialVehicleTrackResponseBody(Builder builder) {
        this.points = builder.points;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommercialVehicleTrackResponseBody create() {
        return builder().build();
    }

    /**
     * @return points
     */
    public java.util.List < Points> getPoints() {
        return this.points;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Points> points; 
        private String requestId; 

        /**
         * Points.
         */
        public Builder points(java.util.List < Points> points) {
            this.points = points;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCommercialVehicleTrackResponseBody build() {
            return new GetCommercialVehicleTrackResponseBody(this);
        } 

    } 

    public static class Points extends TeaModel {
        @NameInMap("Altitude")
        private String altitude;

        @NameInMap("Direction")
        private Long direction;

        @NameInMap("Latitude")
        private String latitude;

        @NameInMap("Longitude")
        private String longitude;

        @NameInMap("Speed")
        private Long speed;

        @NameInMap("Time")
        private Long time;

        private Points(Builder builder) {
            this.altitude = builder.altitude;
            this.direction = builder.direction;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.speed = builder.speed;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Points create() {
            return builder().build();
        }

        /**
         * @return altitude
         */
        public String getAltitude() {
            return this.altitude;
        }

        /**
         * @return direction
         */
        public Long getDirection() {
            return this.direction;
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
         * @return speed
         */
        public Long getSpeed() {
            return this.speed;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private String altitude; 
            private Long direction; 
            private String latitude; 
            private String longitude; 
            private Long speed; 
            private Long time; 

            /**
             * Altitude.
             */
            public Builder altitude(String altitude) {
                this.altitude = altitude;
                return this;
            }

            /**
             * Direction.
             */
            public Builder direction(Long direction) {
                this.direction = direction;
                return this;
            }

            /**
             * Latitude.
             */
            public Builder latitude(String latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * Longitude.
             */
            public Builder longitude(String longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * Speed.
             */
            public Builder speed(Long speed) {
                this.speed = speed;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public Points build() {
                return new Points(this);
            } 

        } 

    }
}
