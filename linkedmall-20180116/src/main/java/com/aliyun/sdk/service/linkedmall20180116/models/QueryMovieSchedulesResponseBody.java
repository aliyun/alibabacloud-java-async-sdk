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
 * {@link QueryMovieSchedulesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMovieSchedulesResponseBody</p>
 */
public class QueryMovieSchedulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogsId")
    private String logsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Schedules")
    private Schedules schedules;

    @com.aliyun.core.annotation.NameInMap("SubCode")
    private String subCode;

    @com.aliyun.core.annotation.NameInMap("SubMessage")
    private String subMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryMovieSchedulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.schedules = builder.schedules;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMovieSchedulesResponseBody create() {
        return builder().build();
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
     * @return schedules
     */
    public Schedules getSchedules() {
        return this.schedules;
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

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private String requestId; 
        private Schedules schedules; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 

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
         * Schedules.
         */
        public Builder schedules(Schedules schedules) {
            this.schedules = schedules;
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

        public QueryMovieSchedulesResponseBody build() {
            return new QueryMovieSchedulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMovieSchedulesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMovieSchedulesResponseBody</p>
     */
    public static class Schedule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CinemaId")
        private Long cinemaId;

        @com.aliyun.core.annotation.NameInMap("HallName")
        private String hallName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsExpired")
        private Boolean isExpired;

        @com.aliyun.core.annotation.NameInMap("MaxCanBuy")
        private Long maxCanBuy;

        @com.aliyun.core.annotation.NameInMap("MovieId")
        private Long movieId;

        @com.aliyun.core.annotation.NameInMap("MovieVersion")
        private String movieVersion;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Long price;

        @com.aliyun.core.annotation.NameInMap("ReleaseDate")
        private String releaseDate;

        @com.aliyun.core.annotation.NameInMap("ScheduleArea")
        private String scheduleArea;

        @com.aliyun.core.annotation.NameInMap("SectionId")
        private String sectionId;

        @com.aliyun.core.annotation.NameInMap("ServiceFee")
        private Long serviceFee;

        @com.aliyun.core.annotation.NameInMap("SessionEndingTime")
        private String sessionEndingTime;

        @com.aliyun.core.annotation.NameInMap("SessionStartingTime")
        private String sessionStartingTime;

        private Schedule(Builder builder) {
            this.cinemaId = builder.cinemaId;
            this.hallName = builder.hallName;
            this.id = builder.id;
            this.isExpired = builder.isExpired;
            this.maxCanBuy = builder.maxCanBuy;
            this.movieId = builder.movieId;
            this.movieVersion = builder.movieVersion;
            this.price = builder.price;
            this.releaseDate = builder.releaseDate;
            this.scheduleArea = builder.scheduleArea;
            this.sectionId = builder.sectionId;
            this.serviceFee = builder.serviceFee;
            this.sessionEndingTime = builder.sessionEndingTime;
            this.sessionStartingTime = builder.sessionStartingTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schedule create() {
            return builder().build();
        }

        /**
         * @return cinemaId
         */
        public Long getCinemaId() {
            return this.cinemaId;
        }

        /**
         * @return hallName
         */
        public String getHallName() {
            return this.hallName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isExpired
         */
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        /**
         * @return maxCanBuy
         */
        public Long getMaxCanBuy() {
            return this.maxCanBuy;
        }

        /**
         * @return movieId
         */
        public Long getMovieId() {
            return this.movieId;
        }

        /**
         * @return movieVersion
         */
        public String getMovieVersion() {
            return this.movieVersion;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return releaseDate
         */
        public String getReleaseDate() {
            return this.releaseDate;
        }

        /**
         * @return scheduleArea
         */
        public String getScheduleArea() {
            return this.scheduleArea;
        }

        /**
         * @return sectionId
         */
        public String getSectionId() {
            return this.sectionId;
        }

        /**
         * @return serviceFee
         */
        public Long getServiceFee() {
            return this.serviceFee;
        }

        /**
         * @return sessionEndingTime
         */
        public String getSessionEndingTime() {
            return this.sessionEndingTime;
        }

        /**
         * @return sessionStartingTime
         */
        public String getSessionStartingTime() {
            return this.sessionStartingTime;
        }

        public static final class Builder {
            private Long cinemaId; 
            private String hallName; 
            private Long id; 
            private Boolean isExpired; 
            private Long maxCanBuy; 
            private Long movieId; 
            private String movieVersion; 
            private Long price; 
            private String releaseDate; 
            private String scheduleArea; 
            private String sectionId; 
            private Long serviceFee; 
            private String sessionEndingTime; 
            private String sessionStartingTime; 

            /**
             * CinemaId.
             */
            public Builder cinemaId(Long cinemaId) {
                this.cinemaId = cinemaId;
                return this;
            }

            /**
             * HallName.
             */
            public Builder hallName(String hallName) {
                this.hallName = hallName;
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
             * IsExpired.
             */
            public Builder isExpired(Boolean isExpired) {
                this.isExpired = isExpired;
                return this;
            }

            /**
             * MaxCanBuy.
             */
            public Builder maxCanBuy(Long maxCanBuy) {
                this.maxCanBuy = maxCanBuy;
                return this;
            }

            /**
             * MovieId.
             */
            public Builder movieId(Long movieId) {
                this.movieId = movieId;
                return this;
            }

            /**
             * MovieVersion.
             */
            public Builder movieVersion(String movieVersion) {
                this.movieVersion = movieVersion;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            /**
             * ReleaseDate.
             */
            public Builder releaseDate(String releaseDate) {
                this.releaseDate = releaseDate;
                return this;
            }

            /**
             * ScheduleArea.
             */
            public Builder scheduleArea(String scheduleArea) {
                this.scheduleArea = scheduleArea;
                return this;
            }

            /**
             * SectionId.
             */
            public Builder sectionId(String sectionId) {
                this.sectionId = sectionId;
                return this;
            }

            /**
             * ServiceFee.
             */
            public Builder serviceFee(Long serviceFee) {
                this.serviceFee = serviceFee;
                return this;
            }

            /**
             * SessionEndingTime.
             */
            public Builder sessionEndingTime(String sessionEndingTime) {
                this.sessionEndingTime = sessionEndingTime;
                return this;
            }

            /**
             * SessionStartingTime.
             */
            public Builder sessionStartingTime(String sessionStartingTime) {
                this.sessionStartingTime = sessionStartingTime;
                return this;
            }

            public Schedule build() {
                return new Schedule(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMovieSchedulesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMovieSchedulesResponseBody</p>
     */
    public static class Schedules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Schedule")
        private java.util.List<Schedule> schedule;

        private Schedules(Builder builder) {
            this.schedule = builder.schedule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schedules create() {
            return builder().build();
        }

        /**
         * @return schedule
         */
        public java.util.List<Schedule> getSchedule() {
            return this.schedule;
        }

        public static final class Builder {
            private java.util.List<Schedule> schedule; 

            /**
             * Schedule.
             */
            public Builder schedule(java.util.List<Schedule> schedule) {
                this.schedule = schedule;
                return this;
            }

            public Schedules build() {
                return new Schedules(this);
            } 

        } 

    }
}
