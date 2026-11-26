// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link AddSubResponseBody} extends {@link TeaModel}
 *
 * <p>AddSubResponseBody</p>
 */
public class AddSubResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private AddSubResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSubResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(AddSubResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Status code. A value of 200 indicates success.</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Additional information</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B99D27ED-4E12-1414-9FDE-599C57C4B204</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return Result</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public AddSubResponseBody build() {
            return new AddSubResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddSubResponseBody} extends {@link TeaModel}
     *
     * <p>AddSubResponseBody</p>
     */
    public static class ScheduleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DaysOfWeek")
        private java.util.List<Integer> daysOfWeek;

        @com.aliyun.core.annotation.NameInMap("Hour")
        private Integer hour;

        @com.aliyun.core.annotation.NameInMap("Minute")
        private Integer minute;

        private ScheduleInfo(Builder builder) {
            this.daysOfWeek = builder.daysOfWeek;
            this.hour = builder.hour;
            this.minute = builder.minute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleInfo create() {
            return builder().build();
        }

        /**
         * @return daysOfWeek
         */
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        /**
         * @return hour
         */
        public Integer getHour() {
            return this.hour;
        }

        /**
         * @return minute
         */
        public Integer getMinute() {
            return this.minute;
        }

        public static final class Builder {
            private java.util.List<Integer> daysOfWeek; 
            private Integer hour; 
            private Integer minute; 

            private Builder() {
            } 

            private Builder(ScheduleInfo model) {
                this.daysOfWeek = model.daysOfWeek;
                this.hour = model.hour;
                this.minute = model.minute;
            } 

            /**
             * <p>The epoch for trigger</p>
             */
            public Builder daysOfWeek(java.util.List<Integer> daysOfWeek) {
                this.daysOfWeek = daysOfWeek;
                return this;
            }

            /**
             * <p>The hour of the clock when the trigger occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder hour(Integer hour) {
                this.hour = hour;
                return this;
            }

            /**
             * <p>The minute of the Time when the trigger occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder minute(Integer minute) {
                this.minute = minute;
                return this;
            }

            public ScheduleInfo build() {
                return new ScheduleInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddSubResponseBody} extends {@link TeaModel}
     *
     * <p>AddSubResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlbumId")
        private String albumId;

        @com.aliyun.core.annotation.NameInMap("DailyStudyCnt")
        private Integer dailyStudyCnt;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("PlayMode")
        private String playMode;

        @com.aliyun.core.annotation.NameInMap("ScheduleInfo")
        private ScheduleInfo scheduleInfo;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Result(Builder builder) {
            this.albumId = builder.albumId;
            this.dailyStudyCnt = builder.dailyStudyCnt;
            this.deviceId = builder.deviceId;
            this.id = builder.id;
            this.playMode = builder.playMode;
            this.scheduleInfo = builder.scheduleInfo;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return albumId
         */
        public String getAlbumId() {
            return this.albumId;
        }

        /**
         * @return dailyStudyCnt
         */
        public Integer getDailyStudyCnt() {
            return this.dailyStudyCnt;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return playMode
         */
        public String getPlayMode() {
            return this.playMode;
        }

        /**
         * @return scheduleInfo
         */
        public ScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String albumId; 
            private Integer dailyStudyCnt; 
            private String deviceId; 
            private Long id; 
            private String playMode; 
            private ScheduleInfo scheduleInfo; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.albumId = model.albumId;
                this.dailyStudyCnt = model.dailyStudyCnt;
                this.deviceId = model.deviceId;
                this.id = model.id;
                this.playMode = model.playMode;
                this.scheduleInfo = model.scheduleInfo;
                this.userId = model.userId;
            } 

            /**
             * <p>Album ID</p>
             * 
             * <strong>example:</strong>
             * <p>51999575</p>
             */
            public Builder albumId(String albumId) {
                this.albumId = albumId;
                return this;
            }

            /**
             * <p>Daily study quantity</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder dailyStudyCnt(Integer dailyStudyCnt) {
                this.dailyStudyCnt = dailyStudyCnt;
                return this;
            }

            /**
             * <p>Device ID</p>
             * 
             * <strong>example:</strong>
             * <p>5874DBCCA3038FAA1A70A8060F07F26D</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>Subscription record ID</p>
             * 
             * <strong>example:</strong>
             * <p>81</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Playback mode</p>
             * 
             * <strong>example:</strong>
             * <p>sequence</p>
             */
            public Builder playMode(String playMode) {
                this.playMode = playMode;
                return this;
            }

            /**
             * <p>Schedule information</p>
             */
            public Builder scheduleInfo(ScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
                return this;
            }

            /**
             * <p>User ID</p>
             * 
             * <strong>example:</strong>
             * <p>1152893538998276761</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
