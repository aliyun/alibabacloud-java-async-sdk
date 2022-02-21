// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVehicleTrackResponseBody} extends {@link TeaModel}
 *
 * <p>GetVehicleTrackResponseBody</p>
 */
public class GetVehicleTrackResponseBody extends TeaModel {
    @NameInMap("Points")
    private java.util.List < Points> points;

    @NameInMap("RequestId")
    private String requestId;

    private GetVehicleTrackResponseBody(Builder builder) {
        this.points = builder.points;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVehicleTrackResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVehicleTrackResponseBody build() {
            return new GetVehicleTrackResponseBody(this);
        } 

    } 

    public static class Points extends TeaModel {
        @NameInMap("Altitude")
        private Float altitude;

        @NameInMap("Latitude")
        private Float latitude;

        @NameInMap("Longitude")
        private Float longitude;

        @NameInMap("Speed")
        private Integer speed;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Points(Builder builder) {
            this.altitude = builder.altitude;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.speed = builder.speed;
            this.updateTime = builder.updateTime;
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
        public Float getAltitude() {
            return this.altitude;
        }

        /**
         * @return latitude
         */
        public Float getLatitude() {
            return this.latitude;
        }

        /**
         * @return longitude
         */
        public Float getLongitude() {
            return this.longitude;
        }

        /**
         * @return speed
         */
        public Integer getSpeed() {
            return this.speed;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Float altitude; 
            private Float latitude; 
            private Float longitude; 
            private Integer speed; 
            private Long updateTime; 

            /**
             * Altitude.
             */
            public Builder altitude(Float altitude) {
                this.altitude = altitude;
                return this;
            }

            /**
             * Latitude.
             */
            public Builder latitude(Float latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * Longitude.
             */
            public Builder longitude(Float longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * Speed.
             */
            public Builder speed(Integer speed) {
                this.speed = speed;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Points build() {
                return new Points(this);
            } 

        } 

    }
}
