// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRealTimeLocationByModelResponseBody} extends {@link TeaModel}
 *
 * <p>ListRealTimeLocationByModelResponseBody</p>
 */
public class ListRealTimeLocationByModelResponseBody extends TeaModel {
    @NameInMap("LocationList")
    private java.util.List < LocationList> locationList;

    @NameInMap("RequestId")
    private String requestId;

    private ListRealTimeLocationByModelResponseBody(Builder builder) {
        this.locationList = builder.locationList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRealTimeLocationByModelResponseBody create() {
        return builder().build();
    }

    /**
     * @return locationList
     */
    public java.util.List < LocationList> getLocationList() {
        return this.locationList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < LocationList> locationList; 
        private String requestId; 

        /**
         * LocationList.
         */
        public Builder locationList(java.util.List < LocationList> locationList) {
            this.locationList = locationList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRealTimeLocationByModelResponseBody build() {
            return new ListRealTimeLocationByModelResponseBody(this);
        } 

    } 

    public static class LocationList extends TeaModel {
        @NameInMap("Altitude")
        private Float altitude;

        @NameInMap("Angle")
        private Float angle;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("Latitude")
        private Float latitude;

        @NameInMap("Longitude")
        private Float longitude;

        @NameInMap("Speed")
        private Float speed;

        private LocationList(Builder builder) {
            this.altitude = builder.altitude;
            this.angle = builder.angle;
            this.deviceId = builder.deviceId;
            this.duration = builder.duration;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.speed = builder.speed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocationList create() {
            return builder().build();
        }

        /**
         * @return altitude
         */
        public Float getAltitude() {
            return this.altitude;
        }

        /**
         * @return angle
         */
        public Float getAngle() {
            return this.angle;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
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
        public Float getSpeed() {
            return this.speed;
        }

        public static final class Builder {
            private Float altitude; 
            private Float angle; 
            private String deviceId; 
            private Integer duration; 
            private Float latitude; 
            private Float longitude; 
            private Float speed; 

            /**
             * Altitude.
             */
            public Builder altitude(Float altitude) {
                this.altitude = altitude;
                return this;
            }

            /**
             * Angle.
             */
            public Builder angle(Float angle) {
                this.angle = angle;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
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
            public Builder speed(Float speed) {
                this.speed = speed;
                return this;
            }

            public LocationList build() {
                return new LocationList(this);
            } 

        } 

    }
}
