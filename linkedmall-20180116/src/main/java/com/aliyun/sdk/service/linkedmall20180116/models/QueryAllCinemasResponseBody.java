// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QueryAllCinemasResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAllCinemasResponseBody</p>
 */
public class QueryAllCinemasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cinemas")
    private Cinemas cinemas;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogsId")
    private String logsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubCode")
    private String subCode;

    @com.aliyun.core.annotation.NameInMap("SubMessage")
    private String subMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private QueryAllCinemasResponseBody(Builder builder) {
        this.cinemas = builder.cinemas;
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAllCinemasResponseBody create() {
        return builder().build();
    }

    /**
     * @return cinemas
     */
    public Cinemas getCinemas() {
        return this.cinemas;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Cinemas cinemas; 
        private String code; 
        private String logsId; 
        private String message; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Cinemas.
         */
        public Builder cinemas(Cinemas cinemas) {
            this.cinemas = cinemas;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryAllCinemasResponseBody build() {
            return new QueryAllCinemasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAllCinemasResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAllCinemasResponseBody</p>
     */
    public static class Cinema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("CinemaName")
        private String cinemaName;

        @com.aliyun.core.annotation.NameInMap("CityId")
        private Long cityId;

        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Latitude")
        private String latitude;

        @com.aliyun.core.annotation.NameInMap("Longitude")
        private String longitude;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("ScheduleCloseTime")
        private Long scheduleCloseTime;

        @com.aliyun.core.annotation.NameInMap("StandardId")
        private String standardId;

        private Cinema(Builder builder) {
            this.address = builder.address;
            this.cinemaName = builder.cinemaName;
            this.cityId = builder.cityId;
            this.cityName = builder.cityName;
            this.id = builder.id;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.phone = builder.phone;
            this.scheduleCloseTime = builder.scheduleCloseTime;
            this.standardId = builder.standardId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cinema create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return cinemaName
         */
        public String getCinemaName() {
            return this.cinemaName;
        }

        /**
         * @return cityId
         */
        public Long getCityId() {
            return this.cityId;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return scheduleCloseTime
         */
        public Long getScheduleCloseTime() {
            return this.scheduleCloseTime;
        }

        /**
         * @return standardId
         */
        public String getStandardId() {
            return this.standardId;
        }

        public static final class Builder {
            private String address; 
            private String cinemaName; 
            private Long cityId; 
            private String cityName; 
            private Long id; 
            private String latitude; 
            private String longitude; 
            private String phone; 
            private Long scheduleCloseTime; 
            private String standardId; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * CinemaName.
             */
            public Builder cinemaName(String cinemaName) {
                this.cinemaName = cinemaName;
                return this;
            }

            /**
             * CityId.
             */
            public Builder cityId(Long cityId) {
                this.cityId = cityId;
                return this;
            }

            /**
             * CityName.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * ScheduleCloseTime.
             */
            public Builder scheduleCloseTime(Long scheduleCloseTime) {
                this.scheduleCloseTime = scheduleCloseTime;
                return this;
            }

            /**
             * StandardId.
             */
            public Builder standardId(String standardId) {
                this.standardId = standardId;
                return this;
            }

            public Cinema build() {
                return new Cinema(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAllCinemasResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAllCinemasResponseBody</p>
     */
    public static class Cinemas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cinema")
        private java.util.List<Cinema> cinema;

        private Cinemas(Builder builder) {
            this.cinema = builder.cinema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cinemas create() {
            return builder().build();
        }

        /**
         * @return cinema
         */
        public java.util.List<Cinema> getCinema() {
            return this.cinema;
        }

        public static final class Builder {
            private java.util.List<Cinema> cinema; 

            /**
             * Cinema.
             */
            public Builder cinema(java.util.List<Cinema> cinema) {
                this.cinema = cinema;
                return this;
            }

            public Cinemas build() {
                return new Cinemas(this);
            } 

        } 

    }
}
