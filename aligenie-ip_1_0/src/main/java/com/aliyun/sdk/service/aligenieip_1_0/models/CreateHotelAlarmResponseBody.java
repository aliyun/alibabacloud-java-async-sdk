// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHotelAlarmResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHotelAlarmResponseBody</p>
 */
public class CreateHotelAlarmResponseBody extends TeaModel {
    @NameInMap("Extentions")
    private java.util.Map < String, ? > extentions;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("StatusCode")
    private Integer statusCode;

    private CreateHotelAlarmResponseBody(Builder builder) {
        this.extentions = builder.extentions;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHotelAlarmResponseBody create() {
        return builder().build();
    }

    /**
     * @return extentions
     */
    public java.util.Map < String, ? > getExtentions() {
        return this.extentions;
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private java.util.Map < String, ? > extentions; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Integer statusCode; 

        /**
         * Extentions.
         */
        public Builder extentions(java.util.Map < String, ? > extentions) {
            this.extentions = extentions;
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
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public CreateHotelAlarmResponseBody build() {
            return new CreateHotelAlarmResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AlarmId")
        private Long alarmId;

        @NameInMap("DeviceOpenId")
        private String deviceOpenId;

        @NameInMap("FailMsg")
        private String failMsg;

        @NameInMap("RoomNo")
        private String roomNo;

        @NameInMap("UserOpenId")
        private String userOpenId;

        private Result(Builder builder) {
            this.alarmId = builder.alarmId;
            this.deviceOpenId = builder.deviceOpenId;
            this.failMsg = builder.failMsg;
            this.roomNo = builder.roomNo;
            this.userOpenId = builder.userOpenId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return alarmId
         */
        public Long getAlarmId() {
            return this.alarmId;
        }

        /**
         * @return deviceOpenId
         */
        public String getDeviceOpenId() {
            return this.deviceOpenId;
        }

        /**
         * @return failMsg
         */
        public String getFailMsg() {
            return this.failMsg;
        }

        /**
         * @return roomNo
         */
        public String getRoomNo() {
            return this.roomNo;
        }

        /**
         * @return userOpenId
         */
        public String getUserOpenId() {
            return this.userOpenId;
        }

        public static final class Builder {
            private Long alarmId; 
            private String deviceOpenId; 
            private String failMsg; 
            private String roomNo; 
            private String userOpenId; 

            /**
             * AlarmId.
             */
            public Builder alarmId(Long alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * DeviceOpenId.
             */
            public Builder deviceOpenId(String deviceOpenId) {
                this.deviceOpenId = deviceOpenId;
                return this;
            }

            /**
             * FailMsg.
             */
            public Builder failMsg(String failMsg) {
                this.failMsg = failMsg;
                return this;
            }

            /**
             * RoomNo.
             */
            public Builder roomNo(String roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            /**
             * UserOpenId.
             */
            public Builder userOpenId(String userOpenId) {
                this.userOpenId = userOpenId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
