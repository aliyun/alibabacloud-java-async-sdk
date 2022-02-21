// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrackByTimeResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrackByTimeResponseBody</p>
 */
public class ListTrackByTimeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TrackPointList")
    private java.util.List < TrackPointList> trackPointList;

    private ListTrackByTimeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trackPointList = builder.trackPointList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrackByTimeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trackPointList
     */
    public java.util.List < TrackPointList> getTrackPointList() {
        return this.trackPointList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TrackPointList> trackPointList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrackPointList.
         */
        public Builder trackPointList(java.util.List < TrackPointList> trackPointList) {
            this.trackPointList = trackPointList;
            return this;
        }

        public ListTrackByTimeResponseBody build() {
            return new ListTrackByTimeResponseBody(this);
        } 

    } 

    public static class TrackPointList extends TeaModel {
        @NameInMap("Altitude")
        private Float altitude;

        @NameInMap("Angle")
        private Float angle;

        @NameInMap("Latitude")
        private Float latitude;

        @NameInMap("Longitude")
        private Float longitude;

        @NameInMap("Speed")
        private Float speed;

        @NameInMap("Time")
        private Long time;

        private TrackPointList(Builder builder) {
            this.altitude = builder.altitude;
            this.angle = builder.angle;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.speed = builder.speed;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrackPointList create() {
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

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Float altitude; 
            private Float angle; 
            private Float latitude; 
            private Float longitude; 
            private Float speed; 
            private Long time; 

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

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public TrackPointList build() {
                return new TrackPointList(this);
            } 

        } 

    }
}
